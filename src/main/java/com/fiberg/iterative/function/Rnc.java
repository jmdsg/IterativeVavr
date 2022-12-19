package com.fiberg.iterative.function;

import com.fiberg.iterative.function.Csc1;
import com.fiberg.iterative.function.Csc2;
import com.fiberg.iterative.function.Csc3;
import com.fiberg.iterative.function.Csc4;
import com.fiberg.iterative.function.Csc5;
import com.fiberg.iterative.function.Csc6;
import com.fiberg.iterative.function.Csc7;
import com.fiberg.iterative.function.Csc8;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fnc0;
import com.fiberg.iterative.function.Pr0;
import com.fiberg.iterative.function.Prc0;
import com.fiberg.iterative.function.Rn;
import com.fiberg.iterative.function.SneakyThrow;
import com.fiberg.iterative.function.Spc;
import io.vavr.CheckedRunnable;
import java.io.Serializable;
import java.util.Objects;

@FunctionalInterface
public interface Rnc extends CheckedRunnable {

    public static Rnc empty() {
        return () -> {};
    }

    public static Rnc of(Rnc r) {
        return r;
    }

    public static Rnc checked(Rn r) {
        Objects.requireNonNull(r, "r is null");
        return r.checked();
    }

    public static <T1> Rnc pass(Csc1<? super T1> c, T1 t1) {
        return c.toRunnable(t1);
    }

    public static <T1, T2> Rnc pass(Csc2<? super T1, ? super T2> c, T1 t1, T2 t2) {
        return c.toRunnable(t1, t2);
    }

    public static <T1, T2, T3> Rnc pass(Csc3<? super T1, ? super T2, ? super T3> c, T1 t1, T2 t2, T3 t3) {
        return c.toRunnable(t1, t2, t3);
    }

    public static <T1, T2, T3, T4> Rnc pass(Csc4<? super T1, ? super T2, ? super T3, ? super T4> c, T1 t1, T2 t2, T3 t3, T4 t4) {
        return c.toRunnable(t1, t2, t3, t4);
    }

    public static <T1, T2, T3, T4, T5> Rnc pass(Csc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return c.toRunnable(t1, t2, t3, t4, t5);
    }

    public static <T1, T2, T3, T4, T5, T6> Rnc pass(Csc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return c.toRunnable(t1, t2, t3, t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Rnc pass(Csc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return c.toRunnable(t1, t2, t3, t4, t5, t6, t7);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Rnc pass(Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return c.toRunnable(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public <R> Spc<R> toSupplier(R r) {
        return () -> {
            this.run();
            return r;
        };
    }

    default public <R> Fnc0<R> toFunction(R r) {
        return () -> {
            this.run();
            return r;
        };
    }

    default public Prc0 toPredicate(Boolean b) {
        return () -> {
            this.run();
            return b;
        };
    }

    default public Rnc afterRun(Rnc r) {
        Objects.requireNonNull(r, "r is null");
        return () -> {
            this.run();
            r.run();
        };
    }

    default public <R> Rnc afterApply(Fnc0<? extends R> f) {
        return this.afterApplyTo(f).toRunnable();
    }

    default public <R> Fnc0<R> afterApplyTo(Fnc0<? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return () -> {
            this.run();
            return f.apply();
        };
    }

    default public <R> Rnc afterGet(Spc<? extends R> s) {
        return this.afterGetTo(s).toRunnable();
    }

    default public <R> Spc<R> afterGetTo(Spc<? extends R> s) {
        Objects.requireNonNull(s, "s is null");
        return () -> {
            this.run();
            return s.get();
        };
    }

    default public Rnc afterTest(Prc0 p) {
        return this.afterTestTo(p).toRunnable();
    }

    default public Prc0 afterTestTo(Prc0 p) {
        Objects.requireNonNull(p, "p is null");
        return () -> {
            this.run();
            return p.test();
        };
    }

    default public Rnc beforeRun(Rnc r) {
        Objects.requireNonNull(r, "r is null");
        return () -> {
            r.run();
            this.run();
        };
    }

    default public Rnc beforeTestOnSuccess(Pr0 p, Rnc r) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(r, "r is null");
        return () -> (p.test() ? this : r).run();
    }

    default public Rnc beforeTestOnSuccess(Pr0 p) {
        return this.beforeTestOnSuccess(p, Rnc.empty());
    }

    default public Rnc beforeTestOnFailure(Pr0 p, Rnc r) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(r, "r is null");
        return this.beforeTestOnSuccess(p.negated(), r);
    }

    default public Rnc beforeTestOnFailure(Pr0 p) {
        return this.beforeTestOnFailure(p, Rnc.empty());
    }

    default public Rn unchecked() {
        return () -> {
            try {
                this.run();
            }
            catch (Throwable t) {
                SneakyThrow.sneakyThrow(t);
            }
        };
    }

    default public <T1> Csc1<T1> ignoring1() {
        return t1 -> this.run();
    }

    default public <T1, T2> Csc2<T1, T2> ignoring2() {
        return (t1, t2) -> this.run();
    }

    default public <T1, T2, T3> Csc3<T1, T2, T3> ignoring3() {
        return (t1, t2, t3) -> this.run();
    }

    default public <T1, T2, T3, T4> Csc4<T1, T2, T3, T4> ignoring4() {
        return (t1, t2, t3, t4) -> this.run();
    }

    default public <T1, T2, T3, T4, T5> Csc5<T1, T2, T3, T4, T5> ignoring5() {
        return (t1, t2, t3, t4, t5) -> this.run();
    }

    default public <T1, T2, T3, T4, T5, T6> Csc6<T1, T2, T3, T4, T5, T6> ignoring6() {
        return (t1, t2, t3, t4, t5, t6) -> this.run();
    }

    default public <T1, T2, T3, T4, T5, T6, T7> Csc7<T1, T2, T3, T4, T5, T6, T7> ignoring7() {
        return (t1, t2, t3, t4, t5, t6, t7) -> this.run();
    }

    default public <T1, T2, T3, T4, T5, T6, T7, T8> Csc8<T1, T2, T3, T4, T5, T6, T7, T8> ignoring8() {
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> this.run();
    }

    default public Rn recover(Fn1<? super Throwable, ? extends Rn> recover) {
        Objects.requireNonNull(recover, "recover is null");
        return () -> {
            try {
                this.run();
            }
            catch (Throwable throwable) {
                Rn runn = (Rn) recover.apply(throwable);
                Objects.requireNonNull(runn, () -> "recover return null for " + throwable.getClass() + ": " + throwable.getMessage());
                runn.run();
            }

        };
    }

}

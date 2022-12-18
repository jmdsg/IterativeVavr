package com.fiberg.iterative.function;

import com.fiberg.iterative.function.Cs1;
import com.fiberg.iterative.function.Cs2;
import com.fiberg.iterative.function.Cs3;
import com.fiberg.iterative.function.Cs4;
import com.fiberg.iterative.function.Cs5;
import com.fiberg.iterative.function.Cs6;
import com.fiberg.iterative.function.Cs7;
import com.fiberg.iterative.function.Cs8;
import com.fiberg.iterative.function.Fn0;
import com.fiberg.iterative.function.Pr0;
import com.fiberg.iterative.function.Rnc;
import com.fiberg.iterative.function.Sp;
import java.io.Serializable;
import java.util.Objects;

@FunctionalInterface
public interface Rn extends Runnable {

    public static Rn empty() {
        return () -> {};
    }

    public static Rn of(Rn r) {
        return r;
    }

    public static Rn unchecked(Rnc r) {
        Objects.requireNonNull(r, "r is null");
        return r.unchecked();
    }

    public static <T1> Rn pass(Cs1<? super T1> c, T1 t1) {
        return c.toRunnable(t1);
    }

    public static <T1, T2> Rn pass(Cs2<? super T1, ? super T2> c, T1 t1, T2 t2) {
        return c.toRunnable(t1, t2);
    }

    public static <T1, T2, T3> Rn pass(Cs3<? super T1, ? super T2, ? super T3> c, T1 t1, T2 t2, T3 t3) {
        return c.toRunnable(t1, t2, t3);
    }

    public static <T1, T2, T3, T4> Rn pass(Cs4<? super T1, ? super T2, ? super T3, ? super T4> c, T1 t1, T2 t2, T3 t3, T4 t4) {
        return c.toRunnable(t1, t2, t3, t4);
    }

    public static <T1, T2, T3, T4, T5> Rn pass(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return c.toRunnable(t1, t2, t3, t4, t5);
    }

    public static <T1, T2, T3, T4, T5, T6> Rn pass(Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return c.toRunnable(t1, t2, t3, t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Rn pass(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return c.toRunnable(t1, t2, t3, t4, t5, t6, t7);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Rn pass(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return c.toRunnable(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    public static <T1> void passAndRun(Cs1<? super T1> c, T1 t1) {
        Rn.pass(c, t1).run();
    }

    public static <T1, T2> void passAndRun(Cs2<? super T1, ? super T2> c, T1 t1, T2 t2) {
        Rn.pass(c, t1, t2).run();
    }

    public static <T1, T2, T3> void passAndRun(Cs3<? super T1, ? super T2, ? super T3> c, T1 t1, T2 t2, T3 t3) {
        Rn.pass(c, t1, t2, t3).run();
    }

    public static <T1, T2, T3, T4> void passAndRun(Cs4<? super T1, ? super T2, ? super T3, ? super T4> c, T1 t1, T2 t2, T3 t3, T4 t4) {
        Rn.pass(c, t1, t2, t3, t4).run();
    }

    public static <T1, T2, T3, T4, T5> void passAndRun(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        Rn.pass(c, t1, t2, t3, t4, t5).run();
    }

    public static <T1, T2, T3, T4, T5, T6> void passAndRun(Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        Rn.pass(c, t1, t2, t3, t4, t5, t6).run();
    }

    public static <T1, T2, T3, T4, T5, T6, T7> void passAndRun(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        Rn.pass(c, t1, t2, t3, t4, t5, t6, t7).run();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> void passAndRun(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        Rn.pass(c, t1, t2, t3, t4, t5, t6, t7, t8).run();
    }

    default public <R> Sp<R> toSupplier(R r) {
        return (Sp<Object> & Serializable) () -> {
            this.run();
            return r;
        };
    }

    default public <R> Fn0<R> toFunction(R r) {
        return (Fn0 & Serializable) () -> {
            this.run();
            return r;
        };
    }

    default public Pr0 toPredicate(Boolean b) {
        return (Pr0 & Serializable) () -> {
            this.run();
            return b;
        };
    }

    default public Rn afterRun(Rn r) {
        Objects.requireNonNull(r, "r is null");
        return () -> {
            this.run();
            r.run();
        };
    }

    default public <R> Rn afterApply(Fn0<? extends R> f) {
        return this.afterApplyTo(f).toRunnable();
    }

    default public <R> Fn0<R> afterApplyTo(Fn0<? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (Fn0 & Serializable) () -> {
            this.run();
            return f.apply();
        };
    }

    default public <R> Rn afterGet(Sp<? extends R> s) {
        return this.afterGetTo(s).toRunnable();
    }

    default public <R> Sp<R> afterGetTo(Sp<? extends R> s) {
        Objects.requireNonNull(s, "s is null");
        return (Sp<Object> & Serializable) () -> {
            this.run();
            return s.get();
        };
    }

    default public Rn afterTest(Pr0 p) {
        return this.afterTestTo(p).toRunnable();
    }

    default public Pr0 afterTestTo(Pr0 p) {
        Objects.requireNonNull(p, "p is null");
        return (Pr0 & Serializable) () -> {
            this.run();
            return p.test();
        };
    }

    default public Rn beforeRun(Rn r) {
        Objects.requireNonNull(r, "r is null");
        return () -> {
            r.run();
            this.run();
        };
    }

    default public Rn beforeTestOnSuccess(Pr0 p, Rn r) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(r, "r is null");
        return () -> (p.test() ? this : r).run();
    }

    default public Rn beforeTestOnSuccess(Pr0 p) {
        return this.beforeTestOnSuccess(p, Rn.empty());
    }

    default public Rn beforeTestOnFailure(Pr0 p, Rn r) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(r, "r is null");
        return this.beforeTestOnSuccess(p.negated(), r);
    }

    default public Rn beforeTestOnFailure(Pr0 p) {
        return this.beforeTestOnFailure(p, Rn.empty());
    }

    default public Rnc checked() {
        return this::run;
    }

    default public <T1> Cs1<T1> ignoring1() {
        return t1 -> this.run();
    }

    default public <T1, T2> Cs2<T1, T2> ignoring2() {
        return (t1, t2) -> this.run();
    }

    default public <T1, T2, T3> Cs3<T1, T2, T3> ignoring3() {
        return (t1, t2, t3) -> this.run();
    }

    default public <T1, T2, T3, T4> Cs4<T1, T2, T3, T4> ignoring4() {
        return (t1, t2, t3, t4) -> this.run();
    }

    default public <T1, T2, T3, T4, T5> Cs5<T1, T2, T3, T4, T5> ignoring5() {
        return (t1, t2, t3, t4, t5) -> this.run();
    }

    default public <T1, T2, T3, T4, T5, T6> Cs6<T1, T2, T3, T4, T5, T6> ignoring6() {
        return (t1, t2, t3, t4, t5, t6) -> this.run();
    }

    default public <T1, T2, T3, T4, T5, T6, T7> Cs7<T1, T2, T3, T4, T5, T6, T7> ignoring7() {
        return (t1, t2, t3, t4, t5, t6, t7) -> this.run();
    }

    default public <T1, T2, T3, T4, T5, T6, T7, T8> Cs8<T1, T2, T3, T4, T5, T6, T7, T8> ignoring8() {
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> this.run();
    }

}

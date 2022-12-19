package com.fiberg.iterative.function;

import com.fiberg.iterative.core.IterativeInternals;
import com.fiberg.iterative.function.Csc1;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fnc0;
import com.fiberg.iterative.function.Fnc1;
import com.fiberg.iterative.function.Fnc2;
import com.fiberg.iterative.function.Fnc3;
import com.fiberg.iterative.function.Fnc4;
import com.fiberg.iterative.function.Fnc5;
import com.fiberg.iterative.function.Fnc6;
import com.fiberg.iterative.function.Fnc7;
import com.fiberg.iterative.function.Fnc8;
import com.fiberg.iterative.function.Pr0;
import com.fiberg.iterative.function.Prc0;
import com.fiberg.iterative.function.Prc1;
import com.fiberg.iterative.function.Rnc;
import com.fiberg.iterative.function.SneakyThrow;
import com.fiberg.iterative.function.Sp;
import io.vavr.CheckedFunction0;
import io.vavr.Tuple0;
import io.vavr.Value;
import io.vavr.control.Option;
import io.vavr.control.Try;
import java.io.Serializable;
import java.util.Objects;

@FunctionalInterface
public interface Spc<R> extends CheckedFunction0<R>, Fnc0<R> {

    public R get() throws Throwable;

    default public R apply() throws Throwable {
        return this.get();
    }

    public static <R> Spc<R> narrow(Spc<? extends R> s) {
        return s;
    }

    public static <R> Spc<R> empty() {
        return IterativeInternals::none;
    }

    public static <R> Spc<R> value(R r) {
        return () -> r;
    }

    public static <R> Spc<R> of(Spc<? extends R> s) {
        return Spc.narrow(s);
    }

    public static <R> Spc<R> checked(Sp<? extends R> s) {
        Objects.requireNonNull(s, "s is null");
        return Sp.narrow(s).checked();
    }

    public static <T1, R> Spc<R> pass(Fnc1<? super T1, ? extends R> f, T1 t1) {
        return Fnc1.narrow(f).toSupplier(t1);
    }

    public static <T1, T2, R> Spc<R> pass(Fnc2<? super T1, ? super T2, ? extends R> f, T1 t1, T2 t2) {
        return Fnc2.narrow(f).toSupplier(t1, t2);
    }

    public static <T1, T2, T3, R> Spc<R> pass(Fnc3<? super T1, ? super T2, ? super T3, ? extends R> f, T1 t1, T2 t2, T3 t3) {
        return Fnc3.narrow(f).toSupplier(t1, t2, t3);
    }

    public static <T1, T2, T3, T4, R> Spc<R> pass(Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4) {
        return Fnc4.narrow(f).toSupplier(t1, t2, t3, t4);
    }

    public static <T1, T2, T3, T4, T5, R> Spc<R> pass(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return Fnc5.narrow(f).toSupplier(t1, t2, t3, t4, t5);
    }

    public static <T1, T2, T3, T4, T5, T6, R> Spc<R> pass(Fnc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return Fnc6.narrow(f).toSupplier(t1, t2, t3, t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Spc<R> pass(Fnc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return Fnc7.narrow(f).toSupplier(t1, t2, t3, t4, t5, t6, t7);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Spc<R> pass(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Fnc8.narrow(f).toSupplier(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    public static <R> Sp<Option<R>> lift(Spc<? extends R> s) {
        Objects.requireNonNull(s, "s is null");
        return Spc.liftTry(s).afterApply(Value::toOption);
    }

    public static <R> Sp<Try<R>> liftTry(Spc<? extends R> s) {
        Objects.requireNonNull(s, "s is null");
        return s.beforeWrap(Try::of);
    }

    @Override
    default public Rnc toRunnable() {
        return this::get;
    }

    default public Fnc0<R> toFunction() {
        return this::get;
    }

    @Override
    default public Spc<R> afterRun(Rnc r) {
        Objects.requireNonNull(r, "r is null");
        return () -> {
            R value = this.get();
            r.run();
            return value;
        };
    }

    @Override
    default public Rnc afterRunTo(Rnc r) {
        Objects.requireNonNull(r, "r is null");
        return () -> {
            this.get();
            r.run();
        };
    }

    @Override
    default public <V> Spc<V> afterApply(Fnc1<? super R, ? extends V> f) {
        return this.afterApplyTo(f).toSupplier();
    }

    default public <V> Fnc0<V> afterApplyTo(Fnc1<? super R, ? extends V> f) {
        Objects.requireNonNull(f, "f is null");
        return () -> f.apply(this.get());
    }

    @Override
    default public <V> Spc<V> afterApply(Fnc0<? extends V> f) {
        return this.afterApplyTo(f).toSupplier();
    }

    default public <V> Fnc0<V> afterApplyTo(Fnc0<? extends V> f) {
        Objects.requireNonNull(f, "f is null");
        return () -> f.ignoring1().apply(this.get());
    }

    @Override
    default public <V> Fnc0<V> afterGet(Spc<? extends V> s) {
        Objects.requireNonNull(s, "s is null");
        return () -> s.ignoring1().apply(this.get());
    }

    default public Spc<Boolean> afterTest(Prc1<? super R> p) {
        return this.afterTestTo(p).toSupplier();
    }

    @Override
    default public Prc0 afterTestTo(Prc1<? super R> p) {
        Objects.requireNonNull(p, "p is null");
        return () -> p.test(this.get());
    }

    @Override
    default public Rnc afterAcceptTo(Csc1<? super R> c) {
        Objects.requireNonNull(c, "c is null");
        return () -> c.accept(this.get());
    }

    @Override
    default public Spc<R> afterAccept(Csc1<? super R> c) {
        Objects.requireNonNull(c, "c is null");
        return () -> {
            R value = this.get();
            c.accept(value);
            return value;
        };
    }

    @Override
    default public <W> Sp<W> beforeWrap(Fn1<? super Spc<R>, ? extends W> wrap) {
        Objects.requireNonNull(wrap, "wrap is null");
        return () -> wrap.apply(this);
    }

    @Override
    default public Spc<R> beforeRun(Rnc r) {
        Objects.requireNonNull(r, "r is null");
        return () -> {
            r.run();
            return this.get();
        };
    }

    default public Spc<R> beforeTestOnSuccess(Pr0 p, Spc<? extends R> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return () -> p.test() ? this.apply() : onFailure.get();
    }

    default public Spc<R> beforeTestOnSuccess(Pr0 p, R onFailure) {
        return this.beforeTestOnSuccess(p, Spc.value(onFailure));
    }

    default public Spc<R> beforeTestOnSuccess(Pr0 p) {
        return this.beforeTestOnSuccess(p, Spc.empty());
    }

    default public Spc<R> beforeTestOnFailure(Pr0 p, Spc<? extends R> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Spc<R> beforeTestOnFailure(Pr0 p, R onSuccess) {
        return this.beforeTestOnFailure(p, Spc.value(onSuccess));
    }

    default public Spc<R> beforeTestOnFailure(Pr0 p) {
        return this.beforeTestOnFailure(p, Spc.empty());
    }

    @Override
    default public Sp<Option<R>> lift() {
        return Spc.lift(this);
    }

    @Override
    default public Sp<Try<R>> liftTry() {
        return Spc.liftTry(this);
    }

    @Override
    default public Sp<R> unchecked() {
        return () -> {
            try {
                return this.get();
            }
            catch (Throwable t) {
                return SneakyThrow.sneakyThrow(t);
            }

        };
    }

    @Override
    default public <T1> Fnc1<T1, R> ignoring1() {
        return t1 -> this.get();
    }

    @Override
    default public <T1, T2> Fnc2<T1, T2, R> ignoring2() {
        return (t1, t2) -> this.get();
    }

    @Override
    default public <T1, T2, T3> Fnc3<T1, T2, T3, R> ignoring3() {
        return (t1, t2, t3) -> this.get();
    }

    @Override
    default public <T1, T2, T3, T4> Fnc4<T1, T2, T3, T4, R> ignoring4() {
        return (t1, t2, t3, t4) -> this.get();
    }

    @Override
    default public <T1, T2, T3, T4, T5> Fnc5<T1, T2, T3, T4, T5, R> ignoring5() {
        return (t1, t2, t3, t4, t5) -> this.get();
    }

    @Override
    default public <T1, T2, T3, T4, T5, T6> Fnc6<T1, T2, T3, T4, T5, T6, R> ignoring6() {
        return (t1, t2, t3, t4, t5, t6) -> this.get();
    }

    @Override
    default public <T1, T2, T3, T4, T5, T6, T7> Fnc7<T1, T2, T3, T4, T5, T6, T7, R> ignoring7() {
        return (t1, t2, t3, t4, t5, t6, t7) -> this.get();
    }

    @Override
    default public <T1, T2, T3, T4, T5, T6, T7, T8> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> ignoring8() {
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> this.get();
    }

    @Override
    default public Fnc1<Tuple0, R> tupled() {
        return Fnc0.super.tupled();
    }

    @Override
    default public Spc<R> curried() {
        return ((Fnc0) Fnc0.super.curried())::apply;
    }

    @Override
    default public Spc<R> reversed() {
        return ((Fnc0) Fnc0.super.reversed())::apply;
    }

    @Override
    default public Spc<R> memoized() {
        return ((Fnc0) Fnc0.super.memoized())::apply;
    }

    default public Spc<R> recover(Fn1<? super Throwable, ? extends Spc<? extends R>> recover) {
        Objects.requireNonNull(recover, "recover is null");
        return () -> {
            try {
                return this.get();
            }
            catch (Throwable throwable) {
                Spc supp = (Spc) recover.apply(throwable);
                Objects.requireNonNull(supp, () -> "recover return null for " + throwable.getClass() + ": " + throwable.getMessage());
                return supp.get();
            }

        };
    }

}

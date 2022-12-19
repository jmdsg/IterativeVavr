package com.fiberg.iterative.function;

import com.fiberg.iterative.core.IterativeInternals;
import com.fiberg.iterative.function.Cs1;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fn2;
import com.fiberg.iterative.function.Fn3;
import com.fiberg.iterative.function.Fn4;
import com.fiberg.iterative.function.Fn5;
import com.fiberg.iterative.function.Fn6;
import com.fiberg.iterative.function.Fn7;
import com.fiberg.iterative.function.Fn8;
import com.fiberg.iterative.function.Fnc0;
import com.fiberg.iterative.function.Pr0;
import com.fiberg.iterative.function.Pr1;
import com.fiberg.iterative.function.Rn;
import com.fiberg.iterative.function.Sp;
import com.fiberg.iterative.function.Spc;
import io.vavr.Function0;
import io.vavr.Function1;
import io.vavr.Tuple;
import io.vavr.Tuple0;
import io.vavr.Value;
import io.vavr.control.Option;
import io.vavr.control.Try;
import java.io.Serializable;
import java.util.Objects;
import java.util.function.Function;

@FunctionalInterface
public interface Fn0<R> extends Function0<R> {

    public static <R> Fn0<R> narrow(Fn0<? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fn0<R> fn = (Fn0<R>) f;
        return fn;
    }

    public static <R> Fn0<R> empty() {
        return IterativeInternals::none;
    }

    public static <R> Fn0<R> value(R r) {
        return () -> r;
    }

    public static <R> Fn0<R> of(Fn0<? extends R> f) {
        return Fn0.narrow(f);
    }

    public static <R> Fn1<Tuple0, R> tuple(Fn0<? extends R> f) {
        return Fn0.<R>of(f).tupled();
    }

    public static <R> Fn0<R> detuple(Fn1<? super Tuple0, ? extends R> f) {
        return () -> f.apply(Tuple.empty());
    }

    public static <R> Fn0<R> uncheck(Fnc0<? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fnc0.<R>narrow(f).unchecked();
    }

    public static <T1, R> Fn0<R> pass(Fn1<? super T1, ? extends R> f, T1 t1) {
        return Fn1.<T1, R>narrow(f).toFunction(t1);
    }

    public static <T1, T2, R> Fn0<R> pass(Fn2<? super T1, ? super T2, ? extends R> f, T1 t1, T2 t2) {
        return Fn2.<T1, T2, R>narrow(f).toFunction(t1, t2);
    }

    public static <T1, T2, T3, R> Fn0<R> pass(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f, T1 t1, T2 t2, T3 t3) {
        return Fn3.<T1, T2, T3, R>narrow(f).toFunction(t1, t2, t3);
    }

    public static <T1, T2, T3, T4, R> Fn0<R> pass(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4) {
        return Fn4.<T1, T2, T3, T4, R>narrow(f).toFunction(t1, t2, t3, t4);
    }

    public static <T1, T2, T3, T4, T5, R> Fn0<R> pass(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return Fn5.<T1, T2, T3, T4, T5, R>narrow(f).toFunction(t1, t2, t3, t4, t5);
    }

    public static <T1, T2, T3, T4, T5, T6, R> Fn0<R> pass(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return Fn6.<T1, T2, T3, T4, T5, T6, R>narrow(f).toFunction(t1, t2, t3, t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn0<R> pass(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return Fn7.<T1, T2, T3, T4, T5, T6, T7, R>narrow(f).toFunction(t1, t2, t3, t4, t5, t6, t7);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn0<R> pass(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Fn8.<T1, T2, T3, T4, T5, T6, T7, T8, R>narrow(f).toFunction(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    public static <T1, R> R passAndApply(Fn1<? super T1, ? extends R> f, T1 t1) {
        return Fn0.pass(f, t1).apply();
    }

    public static <T1, T2, R> R passAndApply(Fn2<? super T1, ? super T2, ? extends R> f, T1 t1, T2 t2) {
        return Fn0.pass(f, t1, t2).apply();
    }

    public static <T1, T2, T3, R> R passAndApply(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f, T1 t1, T2 t2, T3 t3) {
        return Fn0.pass(f, t1, t2, t3).apply();
    }

    public static <T1, T2, T3, T4, R> R passAndApply(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4) {
        return Fn0.pass(f, t1, t2, t3, t4).apply();
    }

    public static <T1, T2, T3, T4, T5, R> R passAndApply(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return Fn0.pass(f, t1, t2, t3, t4, t5).apply();
    }

    public static <T1, T2, T3, T4, T5, T6, R> R passAndApply(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return Fn0.pass(f, t1, t2, t3, t4, t5, t6).apply();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> R passAndApply(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return Fn0.pass(f, t1, t2, t3, t4, t5, t6, t7).apply();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> R passAndApply(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Fn0.pass(f, t1, t2, t3, t4, t5, t6, t7, t8).apply();
    }

    public static <R> Fn0<Option<R>> lift(Fn0<? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fn0.<R>liftTry(f).afterApply(Value::toOption);
    }

    public static <R> Fn0<Try<R>> liftTry(Fn0<? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return f.beforeWrap(Try::of);
    }

    default public Sp<R> toSupplier() {
        return this::apply;
    }

    default public Rn toRunnable() {
        return this::apply;
    }

    default public Fn0<R> afterRun(Rn r) {
        Objects.requireNonNull(r, "r is null");
        return () -> {
            R value = this.apply();
            r.run();
            return value;
        };
    }

    default public Rn afterRunTo(Rn r) {
        Objects.requireNonNull(r, "r is null");
        return () -> {
            this.apply();
            r.run();
        };
    }

    default public <V> Fn0<V> afterApply(Fn1<? super R, ? extends V> f) {
        Objects.requireNonNull(f, "f is null");
        return () -> f.apply(this.apply());
    }

    default public <V> Fn0<V> afterApply(Fn0<? extends V> f) {
        Objects.requireNonNull(f, "f is null");
        return () -> f.ignoring1().apply(this.apply());
    }

    default public <V> Fn0<V> afterGet(Sp<? extends V> s) {
        Objects.requireNonNull(s, "s is null");
        return this.<V>afterGetTo(s).toFunction();
    }

    default public <V> Sp<V> afterGetTo(Sp<? extends V> s) {
        Objects.requireNonNull(s, "s is null");
        return () -> s.ignoring1().apply(this.apply());
    }

    default public Rn afterAcceptTo(Cs1<? super R> c) {
        Objects.requireNonNull(c, "c is null");
        return () -> c.accept(this.apply());
    }

    default public Fn0<R> afterAccept(Cs1<? super R> c) {
        Objects.requireNonNull(c, "c is null");
        return () -> {
            R value = this.apply();
            c.accept(value);
            return value;
        };
    }

    default public Fn0<Boolean> afterTest(Pr1<? super R> p) {
        Objects.requireNonNull(p, "p is null");
        return this.afterTestTo(p).toFunction();
    }

    default public Pr0 afterTestTo(Pr1<? super R> p) {
        Objects.requireNonNull(p, "p is null");
        return () -> p.test(this.apply());
    }

    default public <W> Fn0<W> beforeWrap(Fn1<? super Spc<R>, ? extends W> wrap) {
        Objects.requireNonNull(wrap, "wrap is null");
        return () -> wrap.apply(this.toSupplier().checked());
    }

    default public Fn0<R> beforeRun(Rn r) {
        Objects.requireNonNull(r, "r is null");
        return () -> {
            r.run();
            return this.apply();
        };
    }

    default public Fn0<R> beforeTestOnSuccess(Pr0 p, Fn0<? extends R> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return () -> p.test() ? this.apply() : onFailure.apply();
    }

    default public Fn0<R> beforeTestOnSuccess(Pr0 p, Sp<? extends R> onFailure) {
        return this.beforeTestOnSuccess(p, onFailure.toFunction());
    }

    default public Fn0<R> beforeTestOnSuccess(Pr0 p, R onFailure) {
        return this.beforeTestOnSuccess(p, Fn0.value(onFailure));
    }

    default public Fn0<R> beforeTestOnSuccess(Pr0 p) {
        return this.beforeTestOnSuccess(p, Fn0.empty());
    }

    default public Fn0<R> beforeTestOnFailure(Pr0 p, Fn0<? extends R> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Fn0<R> beforeTestOnFailure(Pr0 p, Sp<? extends R> onSuccess) {
        return this.beforeTestOnFailure(p, onSuccess.toFunction());
    }

    default public Fn0<R> beforeTestOnFailure(Pr0 p, R onSuccess) {
        return this.beforeTestOnFailure(p, Fn0.value(onSuccess));
    }

    default public Fn0<R> beforeTestOnFailure(Pr0 p) {
        return this.beforeTestOnFailure(p, Fn0.empty());
    }

    default public Fn0<Option<R>> lift() {
        return Fn0.lift(this);
    }

    default public Fn0<Try<R>> liftTry() {
        return Fn0.liftTry(this);
    }

    default public Fn0<R> currying() {
        return this;
    }

    default public Fnc0<R> checked() {
        return this::apply;
    }

    default public <I1> Fn1<I1, R> ignoring1() {
        return i1 -> this.apply();
    }

    default public <I1, I2> Fn2<I1, I2, R> ignoring2() {
        return (i1, i2) -> this.apply();
    }

    default public <I1, I2, I3> Fn3<I1, I2, I3, R> ignoring3() {
        return (i1, i2, i3) -> this.apply();
    }

    default public <I1, I2, I3, I4> Fn4<I1, I2, I3, I4, R> ignoring4() {
        return (i1, i2, i3, i4) -> this.apply();
    }

    default public <I1, I2, I3, I4, I5> Fn5<I1, I2, I3, I4, I5, R> ignoring5() {
        return (i1, i2, i3, i4, i5) -> this.apply();
    }

    default public <I1, I2, I3, I4, I5, I6> Fn6<I1, I2, I3, I4, I5, I6, R> ignoring6() {
        return (i1, i2, i3, i4, i5, i6) -> this.apply();
    }

    default public <I1, I2, I3, I4, I5, I6, I7> Fn7<I1, I2, I3, I4, I5, I6, I7, R> ignoring7() {
        return (i1, i2, i3, i4, i5, i6, i7) -> this.apply();
    }

    default public <I1, I2, I3, I4, I5, I6, I7, I8> Fn8<I1, I2, I3, I4, I5, I6, I7, I8, R> ignoring8() {
        return (i1, i2, i3, i4, i5, i6, i7, i8) -> this.apply();
    }

    default public Fn1<Tuple0, R> tupled() {
        return Function0.super.tupled()::apply;
    }

    default public Fn0<R> curried() {
        return Function0.super.curried()::apply;
    }

    default public Fn0<R> reversed() {
        return Function0.super.reversed()::apply;
    }

    default public Fn0<R> memoized() {
        return Function0.super.memoized()::apply;
    }

    default public <V> Fn0<V> andThen(Function<? super R, ? extends V> f) {
        return Function0.super.andThen(f)::apply;
    }

}

package com.fiberg.iterative.function;

import com.fiberg.iterative.core.IterativeInternals;
import com.fiberg.iterative.function.Csc1;
import com.fiberg.iterative.function.Fn0;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fnc1;
import com.fiberg.iterative.function.Fnc2;
import com.fiberg.iterative.function.Fnc3;
import com.fiberg.iterative.function.Fnc4;
import com.fiberg.iterative.function.Fnc5;
import com.fiberg.iterative.function.Fnc6;
import com.fiberg.iterative.function.Fnc7;
import com.fiberg.iterative.function.Fnc8;
import com.fiberg.iterative.function.Prc0;
import com.fiberg.iterative.function.Prc1;
import com.fiberg.iterative.function.Rnc;
import com.fiberg.iterative.function.Spc;
import io.vavr.CheckedFunction0;
import io.vavr.CheckedFunction1;
import io.vavr.Function0;
import io.vavr.Tuple;
import io.vavr.Tuple0;
import io.vavr.Value;
import io.vavr.control.Option;
import io.vavr.control.Try;
import java.io.Serializable;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

@FunctionalInterface
public interface Fnc0<R> extends CheckedFunction0<R> {

    public static <R> Fnc0<R> narrow(Fnc0<? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fnc0<R> fnc = (Fnc0<R>) f;
        return fnc;
    }

    public static <R> Fnc0<R> empty() {
        return IterativeInternals::none;
    }

    public static <R> Fnc0<R> value(R r) {
        return () -> r;
    }

    public static <R> Fnc0<R> of(Fnc0<? extends R> f) {
        return Fnc0.narrow(f);
    }

    public static <R> Fnc1<Tuple0, R> tuple(Fnc0<? extends R> f) {
        return Fnc0.<R>of(f).tupled();
    }

    public static <R> Fnc0<R> detuple(Fnc1<? super Tuple0, ? extends R> f) {
        return () -> f.apply(Tuple.empty());
    }

    public static <R> Fnc0<R> check(Fn0<? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fn0.narrow(f).checked();
    }

    public static <T1, R> Fnc0<R> pass(Fnc1<? super T1, ? extends R> f, T1 t1) {
        return Fnc1.narrow(f).<T1, R>narrow(f).toFunction(t1);
    }

    public static <T1, T2, R> Fnc0<R> pass(Fnc2<? super T1, ? super T2, ? extends R> f, T1 t1, T2 t2) {
        return Fnc2.narrow(f).<T1, T2, R>narrow(f).toFunction(t1, t2);
    }

    public static <T1, T2, T3, R> Fnc0<R> pass(Fnc3<? super T1, ? super T2, ? super T3, ? extends R> f, T1 t1, T2 t2, T3 t3) {
        return Fnc3.narrow(f).<T1, T2, T3, R>narrow(f).toFunction(t1, t2, t3);
    }

    public static <T1, T2, T3, T4, R> Fnc0<R> pass(Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4) {
        return Fnc4.<T1, T2, T3, T4, R>narrow(f).toFunction(t1, t2, t3, t4);
    }

    public static <T1, T2, T3, T4, T5, R> Fnc0<R> pass(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return Fnc5.<T1, T2, T3, T4, T5, R>narrow(f).toFunction(t1, t2, t3, t4, t5);
    }

    public static <T1, T2, T3, T4, T5, T6, R> Fnc0<R> pass(Fnc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return Fnc6.<T1, T2, T3, T4, T5, T6, R>narrow(f).toFunction(t1, t2, t3, t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fnc0<R> pass(Fnc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return Fnc7.<T1, T2, T3, T4, T5, T6, T7, R>narrow(f).toFunction(t1, t2, t3, t4, t5, t6, t7);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc0<R> pass(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Fnc8.<T1, T2, T3, T4, T5, T6, T7, T8, R>narrow(f).toFunction(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    public static <R> Fn0<Option<R>> lift(Fnc0<? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fnc0.liftTry(f).afterApply(Value::toOption);
    }

    public static <R> Fn0<Try<R>> liftTry(Fnc0<? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return f.beforeWrap(Try::of);
    }

    default public Spc<R> toSupplier() {
        return this::apply;
    }

    default public Rnc toRunnable() {
        return (this)::apply;
    }

    default public Fnc0<R> afterRun(Rnc r) {
        Objects.requireNonNull(r, "r is null");
        return () -> {
            R value = this.apply();
            r.run();
            return value;
        };
    }

    default public Rnc afterRunTo(Rnc r) {
        Objects.requireNonNull(r, "r is null");
        return () -> {
            this.apply();
            r.run();
        };
    }

    default public <V> Fnc0<V> afterApply(Fnc1<? super R, ? extends V> f) {
        Objects.requireNonNull(f, "f is null");
        return () -> f.apply(this.apply());
    }

    default public <V> Fnc0<V> afterApply(Fnc0<? extends V> f) {
        Objects.requireNonNull(f, "f is null");
        return () -> f.ignoring1().apply(this.apply());
    }

    default public <V> Fnc0<V> afterGet(Spc<? extends V> s) {
        Objects.requireNonNull(s, "s is null");
        return this.afterGetTo(s).toFunction();
    }

    default public <V> Spc<V> afterGetTo(Spc<? extends V> s) {
        Objects.requireNonNull(s, "s is null");
        return () -> s.ignoring1().apply(this.apply());
    }

    default public Rnc afterAcceptTo(Csc1<? super R> c) {
        Objects.requireNonNull(c, "c is null");
        return () -> c.accept(this.apply());
    }

    default public Fnc0<R> afterAccept(Csc1<? super R> c) {
        Objects.requireNonNull(c, "c is null");
        return () -> {
            R value = this.apply();
            c.accept(value);
            return value;
        };
    }

    default public Fnc0<Boolean> afterTest(Prc1<? super R> p) {
        Objects.requireNonNull(p, "p is null");
        return this.afterTestTo(p).toFunction();
    }

    default public Prc0 afterTestTo(Prc1<? super R> p) {
        Objects.requireNonNull(p, "p is null");
        return () -> p.test(this.apply());
    }

    default public <W> Fn0<W> beforeWrap(Fn1<? super Spc<R>, ? extends W> wrap) {
        Objects.requireNonNull(wrap, "wrap is null");
        return () -> wrap.apply(this.toSupplier());
    }

    default public Fnc0<R> beforeRun(Rnc r) {
        Objects.requireNonNull(r, "r is null");
        return () -> {
            r.run();
            return this.apply();
        };
    }

    default public Fnc0<R> beforeTestOnSuccess(Prc0 p, Fnc0<? extends R> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return () -> p.test() != false ? this.apply() : onFailure.apply();
    }

    default public Fnc0<R> beforeTestOnSuccess(Prc0 p, Spc<? extends R> onFailure) {
        return this.beforeTestOnSuccess(p, onFailure.toFunction());
    }

    default public Fnc0<R> beforeTestOnSuccess(Prc0 p, R onFailure) {
        return this.beforeTestOnSuccess(p, Fnc0.value(onFailure));
    }

    default public Fnc0<R> beforeTestOnSuccess(Prc0 p) {
        return this.beforeTestOnSuccess(p, Fnc0.empty());
    }

    default public Fnc0<R> beforeTestOnFailure(Prc0 p, Fnc0<? extends R> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Fnc0<R> beforeTestOnFailure(Prc0 p, Spc<? extends R> onSuccess) {
        return this.beforeTestOnFailure(p, onSuccess.toFunction());
    }

    default public Fnc0<R> beforeTestOnFailure(Prc0 p, R onSuccess) {
        return this.beforeTestOnFailure(p, Fnc0.value(onSuccess));
    }

    default public Fnc0<R> beforeTestOnFailure(Prc0 p) {
        return this.beforeTestOnFailure(p, Fnc0.empty());
    }

    default public Fn0<Option<R>> lift() {
        return Fnc0.lift(this);
    }

    default public Fn0<Try<R>> liftTry() {
        return Fnc0.liftTry(this);
    }

    default public Fnc0<R> currying() {
        return this;
    }

    default public Fn0<R> unchecked() {
        return Function0.super.unchecked()::apply;
    }

    default public <I1> Fnc1<I1, R> ignoring1() {
        return i1 -> this.apply();
    }

    default public <I1, I2> Fnc2<I1, I2, R> ignoring2() {
        return (i1, i2) -> this.apply();
    }

    default public <I1, I2, I3> Fnc3<I1, I2, I3, R> ignoring3() {
        return (i1, i2, i3) -> this.apply();
    }

    default public <I1, I2, I3, I4> Fnc4<I1, I2, I3, I4, R> ignoring4() {
        return (i1, i2, i3, i4) -> this.apply();
    }

    default public <I1, I2, I3, I4, I5> Fnc5<I1, I2, I3, I4, I5, R> ignoring5() {
        return (i1, i2, i3, i4, i5) -> this.apply();
    }

    default public <I1, I2, I3, I4, I5, I6> Fnc6<I1, I2, I3, I4, I5, I6, R> ignoring6() {
        return (i1, i2, i3, i4, i5, i6) -> this.apply();
    }

    default public <I1, I2, I3, I4, I5, I6, I7> Fnc7<I1, I2, I3, I4, I5, I6, I7, R> ignoring7() {
        return (i1, i2, i3, i4, i5, i6, i7) -> this.apply();
    }

    default public <I1, I2, I3, I4, I5, I6, I7, I8> Fnc8<I1, I2, I3, I4, I5, I6, I7, I8, R> ignoring8() {
        return (i1, i2, i3, i4, i5, i6, i7, i8) -> this.apply();
    }

    default public <V> Fnc0<V> andThen(CheckedFunction1<? super R, ? extends V> f) {
        return ((CheckedFunction0) super.andThen(f))::apply;
    }

    default public Fnc1<Tuple0, R> tupled() {
        return ((CheckedFunction1) super.tupled())::apply;
    }

    default public Fnc0<R> curried() {
        return ((CheckedFunction0) super.curried())::apply;
    }

    default public Fnc0<R> reversed() {
        return ((CheckedFunction0) super.reversed())::apply;
    }

    default public Fnc0<R> memoized() {
        return ((CheckedFunction0) super.memoized())::apply;
    }

    default public Fn0<R> recover(Function<? super Throwable, ? extends Supplier<? extends R>> recover) {
        return Function0.super.recover(recover)::apply;
    }

}

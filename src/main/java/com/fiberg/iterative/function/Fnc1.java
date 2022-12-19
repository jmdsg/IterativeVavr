package com.fiberg.iterative.function;

import com.fiberg.iterative.core.IterativeInternals;
import com.fiberg.iterative.function.Csc1;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fnc0;
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
import io.vavr.CheckedFunction1;
import io.vavr.Function1;
import io.vavr.Tuple;
import io.vavr.Tuple1;
import io.vavr.Value;
import io.vavr.control.Option;
import io.vavr.control.Try;
import java.io.Serializable;
import java.util.Objects;
import java.util.function.Function;

@FunctionalInterface
public interface Fnc1<T1, R> extends CheckedFunction1<T1, R> {

    public static <T1, R> Fnc1<T1, R> narrow(Fnc1<? super T1, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fnc1<T1, R> fnc = (Fnc1<T1, R>) f;
        return fnc;
    }

    public static <T1, R> Fnc1<T1, R> empty() {
        return IterativeInternals::none;
    }

    public static <T1, R> Fnc1<T1, R> value(R r) {
        return t1 -> r;
    }

    public static <T1> Fnc1<T1, T1> identity() {
        return IterativeInternals::identity;
    }

    public static <T1, R> Fnc1<T1, R> of(Fnc1<? super T1, ? extends R> f) {
        return Fnc1.narrow(f);
    }

    public static <T1, R> Fnc1<Tuple1<T1>, R> tuple(Fnc1<? super T1, ? extends R> f) {
        return Fnc1.<T1, R>of(f).tupled();
    }

    public static <T1, R> Fnc1<T1, R> detuple(Fnc1<? super Tuple1<? extends T1>, ? extends R> f) {
        return t1 -> f.apply(Tuple.of(t1));
    }

    public static <T1, R> Fnc1<T1, R> check(Fn1<? super T1, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fn1.<T1, R>narrow(f).checked();
    }

    public static <T1, R> Fnc1<T1, R> ignore(Fnc0<? extends R> f) {
        return Fnc0.<R>narrow(f).ignoring1();
    }

    public static <T1, R> Fnc1<T1, R> passThroughNull(Fnc1<? super T1, ? extends R> f) {
        return Fnc1.<T1, R>narrow(f).passingThroughNull();
    }

    public static <T1, T2, R> Fnc1<T1, R> passRt(Fnc2<? super T1, ? super T2, ? extends R> f, T2 t2) {
        return Fnc1.narrow(f.applyRt(t2));
    }

    public static <T1, T2, T3, R> Fnc1<T1, R> passRt(Fnc3<? super T1, ? super T2, ? super T3, ? extends R> f, T2 t2, T3 t3) {
        return Fnc1.narrow(f.applyRt(t2, t3));
    }

    public static <T1, T2, T3, T4, R> Fnc1<T1, R> passRt(Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f, T2 t2, T3 t3, T4 t4) {
        return Fnc1.narrow(f.applyRt(t2, t3, t4));
    }

    public static <T1, T2, T3, T4, T5, R> Fnc1<T1, R> passRt(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f, T2 t2, T3 t3, T4 t4, T5 t5) {
        return Fnc1.narrow(f.applyRt(t2, t3, t4, t5));
    }

    public static <T1, T2, T3, T4, T5, T6, R> Fnc1<T1, R> passRt(Fnc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return Fnc1.narrow(f.applyRt(t2, t3, t4, t5, t6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fnc1<T1, R> passRt(Fnc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return Fnc1.narrow(f.applyRt(t2, t3, t4, t5, t6, t7));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc1<T1, R> passRt(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Fnc1.narrow(f.applyRt(t2, t3, t4, t5, t6, t7, t8));
    }

    public static <T1, T2, R> Fnc1<T2, R> passLt(Fnc2<? super T1, ? super T2, ? extends R> f, T1 t1) {
        return Fnc1.narrow(f.applyLt(t1));
    }

    public static <T1, T2, T3, R> Fnc1<T3, R> passLt(Fnc3<? super T1, ? super T2, ? super T3, ? extends R> f, T1 t1, T2 t2) {
        return Fnc1.narrow(f.applyLt(t1, t2));
    }

    public static <T1, T2, T3, T4, R> Fnc1<T4, R> passLt(Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f, T1 t1, T2 t2, T3 t3) {
        return Fnc1.narrow(f.applyLt(t1, t2, t3));
    }

    public static <T1, T2, T3, T4, T5, R> Fnc1<T5, R> passLt(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4) {
        return Fnc1.narrow(f.applyLt(t1, t2, t3, t4));
    }

    public static <T1, T2, T3, T4, T5, T6, R> Fnc1<T6, R> passLt(Fnc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return Fnc1.narrow(f.applyLt(t1, t2, t3, t4, t5));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fnc1<T7, R> passLt(Fnc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return Fnc1.narrow(f.applyLt(t1, t2, t3, t4, t5, t6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc1<T8, R> passLt(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return Fnc1.narrow(f.applyLt(t1, t2, t3, t4, t5, t6, t7));
    }

    public static <T1, R> Fn1<T1, Option<R>> lift(Fnc1<? super T1, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fnc1.<T1, R>liftTry(f).afterApply(Value::toOption);
    }

    public static <T1, R> Fn1<T1, Try<R>> liftTry(Fnc1<? super T1, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fnc1.<T1, R>narrow(f).beforeWrap(Try::of);
    }

    default public Fnc0<R> toFunction(T1 t1) {
        return () -> this.apply(t1);
    }

    default public Rnc toRunnable(T1 t1) {
        return this.toFunction(t1).toRunnable();
    }

    default public Csc1<T1> toConsumer() {
        return this::apply;
    }

    default public Spc<R> toSupplier(T1 t1) {
        return this.toFunction(t1).toSupplier();
    }

    default public Fnc1<T1, R> afterRun(Rnc r) {
        Objects.requireNonNull(r, "r is null");
        return t1 -> {
            R value = this.apply(t1);
            r.run();
            return value;
        };
    }

    default public <V> Fnc1<T1, V> afterApply(Fnc1<? super R, ? extends V> f) {
        Objects.requireNonNull(f, "f is null");
        return t1 -> f.apply(this.apply(t1));
    }

    default public <V> Fnc1<T1, V> afterApply(Fnc0<? extends V> f) {
        Objects.requireNonNull(f, "f is null");
        return t1 -> f.ignoring1().apply(this.apply(t1));
    }

    default public <V> Fnc1<T1, V> afterGet(Spc<? extends V> s) {
        Objects.requireNonNull(s, "s is null");
        return t1 -> s.ignoring1().apply(this.apply(t1));
    }

    default public Fnc1<T1, Boolean> afterTest(Prc1<? super R> p) {
        Objects.requireNonNull(p, "p is null");
        return this.afterTestTo(p).toFunction();
    }

    default public Prc1<T1> afterTestTo(Prc1<? super R> p) {
        Objects.requireNonNull(p, "p is null");
        return t1 -> p.test(this.apply(t1));
    }

    default public Csc1<T1> afterAcceptTo(Csc1<? super R> c) {
        Objects.requireNonNull(c, "c is null");
        return t1 -> c.accept(this.apply(t1));
    }

    default public Fnc1<T1, R> afterAccept(Csc1<? super R> c) {
        Objects.requireNonNull(c, "c is null");
        return t1 -> {
            R value = this.apply(t1);
            c.accept(value);
            return value;
        };
    }

    default public <W> Fn1<T1, W> beforeWrap(Fn1<? super Spc<R>, ? extends W> wrap) {
        Objects.requireNonNull(wrap, "wrap is null");
        return t1 -> wrap.apply(this.toSupplier(t1));
    }

    default public Fnc1<T1, R> beforeRun(Rnc r) {
        Objects.requireNonNull(r, "r is null");
        return t1 -> {
            r.run();
            return this.apply(t1);
        };
    }

    default public <B1> Fnc1<B1, R> beforeApply(Fnc1<? super B1, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return b1 -> this.apply(f.apply(b1));
    }

    default public Fnc1<T1, R> beforeTestOnSuccess(Prc0 p, Fnc1<? super T1, ? extends R> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return t1 -> p.test() != false ? this.apply(t1) : onFailure.apply(t1);
    }

    default public Fnc1<T1, R> beforeTestOnSuccess(Prc0 p, Spc<? extends R> onFailure) {
        return this.beforeTestOnSuccess(p, onFailure.toFunction().ignoring1());
    }

    default public Fnc1<T1, R> beforeTestOnSuccess(Prc0 p, R onFailure) {
        return this.beforeTestOnSuccess(p, Fnc1.value(onFailure));
    }

    default public Fnc1<T1, R> beforeTestOnSuccess(Prc0 p) {
        return this.beforeTestOnSuccess(p, Fnc1.empty());
    }

    default public Fnc1<T1, R> beforeTestOnFailure(Prc0 p, Fnc1<? super T1, ? extends R> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Fnc1<T1, R> beforeTestOnFailure(Prc0 p, Spc<? extends R> onSuccess) {
        return this.beforeTestOnFailure(p, onSuccess.toFunction().ignoring1());
    }

    default public Fnc1<T1, R> beforeTestOnFailure(Prc0 p, R onSuccess) {
        return this.beforeTestOnFailure(p, Fnc1.value(onSuccess));
    }

    default public Fnc1<T1, R> beforeTestOnFailure(Prc0 p) {
        return this.beforeTestOnFailure(p, Fnc1.empty());
    }

    default public <B1> Fnc1<B1, R> beforeGet(Spc<? extends T1> s) {
        Objects.requireNonNull(s, "s is null");
        return b1 -> this.apply(s.get());
    }

    default public Fn1<T1, Option<R>> lift() {
        return Fnc1.lift(this);
    }

    default public Fn1<T1, Try<R>> liftTry() {
        return Fnc1.liftTry(this);
    }

    default public <S> Fnc1<T1, S> afterPassingThroughApply(Fnc1<? super T1, ? extends S> f) {
        Objects.requireNonNull(f, "f is null");
        return t1 -> {
            this.apply(t1);
            return f.apply(t1);
        };
    }

    default public Fnc1<T1, R> afterPassingThroughTest(Prc1<? super T1> p) {
        Objects.requireNonNull(p, "p is null");
        return t1 -> {
            R result = this.apply(t1);
            p.test(t1);
            return result;
        };
    }

    default public Prc1<T1> afterPassingThroughTestTo(Prc1<? super T1> p) {
        Objects.requireNonNull(p, "p is null");
        return t1 -> {
            this.apply(t1);
            return p.test(t1);
        };
    }

    default public Fnc1<T1, R> afterPassingThroughAccept(Csc1<? super T1> c) {
        Objects.requireNonNull(c, "c is null");
        return t1 -> {
            R result = this.apply(t1);
            c.accept(t1);
            return result;
        };
    }

    default public Csc1<T1> afterPassingThroughAcceptTo(Csc1<? super T1> c) {
        Objects.requireNonNull(c, "c is null");
        return t1 -> {
            this.apply(t1);
            c.accept(t1);
        };
    }

    default public Fnc1<T1, R> beforePassingThroughApply(Fnc1<? super T1, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return t1 -> {
            f.apply(t1);
            return this.apply(t1);
        };
    }

    default public Fnc1<T1, R> beforePassingThroughTest(Prc1<? super T1> p) {
        Objects.requireNonNull(p, "p is null");
        return t1 -> {
            p.test(t1);
            return this.apply(t1);
        };
    }

    default public Fnc1<T1, R> beforePassingThroughAccept(Csc1<? super T1> c) {
        Objects.requireNonNull(c, "c is null");
        return t1 -> {
            c.accept(t1);
            return this.apply(t1);
        };
    }

    default public Fnc1<T1, R> beforeSuccessPassingThroughTest(Prc1<? super T1> p, Fnc1<? super T1, ? extends R> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return t1 -> p.test(t1) ? this.apply(t1) : onFailure.apply(t1);
    }

    default public Fnc1<T1, R> beforeSuccessPassingThroughTest(Prc1<? super T1> p, Spc<? extends R> onFailure) {
        return this.beforeSuccessPassingThroughTest(p, onFailure.toFunction().ignoring1());
    }

    default public Fnc1<T1, R> beforeSuccessPassingThroughTest(Prc1<? super T1> p, R onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Fnc1.value(onFailure));
    }

    default public Fnc1<T1, R> beforeSuccessPassingThroughTest(Prc1<? super T1> p) {
        return this.beforeSuccessPassingThroughTest(p, Fnc1.empty());
    }

    default public Fnc1<T1, R> beforeFailurePassingThroughTest(Prc1<? super T1> p, Fnc1<? super T1, ? extends R> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Fnc1<T1, R> beforeFailurePassingThroughTest(Prc1<? super T1> p, Spc<? extends R> onSuccess) {
        return this.beforeFailurePassingThroughTest(p, onSuccess.toFunction().ignoring1());
    }

    default public Fnc1<T1, R> beforeFailurePassingThroughTest(Prc1<? super T1> p, R onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Fnc1.value(onSuccess));
    }

    default public Fnc1<T1, R> beforeFailurePassingThroughTest(Prc1<? super T1> p) {
        return this.beforeFailurePassingThroughTest(p, Fnc1.empty());
    }

    default public Fnc1<T1, R> passingThroughNull() {
        return t1 -> t1 != null ? this.apply(t1) : null;
    }

    default public Fnc1<T1, R> passingThroughNull(R r) {
        return t1 -> t1 != null ? this.apply(t1) : r;
    }

    default public Fnc1<T1, R> currying() {
        return this;
    }

    default public Fn1<T1, R> unchecked() {
        return CheckedFunction1.super.unchecked()::apply;
    }

    default public <I1> Fnc2<I1, T1, R> ignoring1Lt() {
        return (i1, t1) -> this.apply(t1);
    }

    default public <I1> Fnc2<T1, I1, R> ignoring1Rt() {
        return (t1, i1) -> this.apply(t1);
    }

    default public <I1, I2> Fnc3<I1, I2, T1, R> ignoring2Lt() {
        return (i1, i2, t1) -> this.apply(t1);
    }

    default public <I1, I2> Fnc3<T1, I1, I2, R> ignoring2Rt() {
        return (t1, i1, i2) -> this.apply(t1);
    }

    default public <I1, I2, I3> Fnc4<I1, I2, I3, T1, R> ignoring3Lt() {
        return (i1, i2, i3, t1) -> this.apply(t1);
    }

    default public <I1, I2, I3> Fnc4<T1, I1, I2, I3, R> ignoring3Rt() {
        return (t1, i1, i2, i3) -> this.apply(t1);
    }

    default public <I1, I2, I3, I4> Fnc5<I1, I2, I3, I4, T1, R> ignoring4Lt() {
        return (i1, i2, i3, i4, t1) -> this.apply(t1);
    }

    default public <I1, I2, I3, I4> Fnc5<T1, I1, I2, I3, I4, R> ignoring4Rt() {
        return (t1, i1, i2, i3, i4) -> this.apply(t1);
    }

    default public <I1, I2, I3, I4, I5> Fnc6<I1, I2, I3, I4, I5, T1, R> ignoring5Lt() {
        return (i1, i2, i3, i4, i5, t1) -> this.apply(t1);
    }

    default public <I1, I2, I3, I4, I5> Fnc6<T1, I1, I2, I3, I4, I5, R> ignoring5Rt() {
        return (t1, i1, i2, i3, i4, i5) -> this.apply(t1);
    }

    default public <I1, I2, I3, I4, I5, I6> Fnc7<I1, I2, I3, I4, I5, I6, T1, R> ignoring6Lt() {
        return (i1, i2, i3, i4, i5, i6, t1) -> this.apply(t1);
    }

    default public <I1, I2, I3, I4, I5, I6> Fnc7<T1, I1, I2, I3, I4, I5, I6, R> ignoring6Rt() {
        return (t1, i1, i2, i3, i4, i5, i6) -> this.apply(t1);
    }

    default public <I1, I2, I3, I4, I5, I6, I7> Fnc8<I1, I2, I3, I4, I5, I6, I7, T1, R> ignoring7Lt() {
        return (i1, i2, i3, i4, i5, i6, i7, t1) -> this.apply(t1);
    }

    default public <I1, I2, I3, I4, I5, I6, I7> Fnc8<T1, I1, I2, I3, I4, I5, I6, I7, R> ignoring7Rt() {
        return (t1, i1, i2, i3, i4, i5, i6, i7) -> this.apply(t1);
    }

    default public Fnc1<T1, R> curried() {
        return CheckedFunction1.super.curried()::apply;
    }

    default public Fnc1<Tuple1<T1>, R> tupled() {
        return CheckedFunction1.super.tupled()::apply;
    }

    default public Fnc1<T1, R> reversed() {
        return CheckedFunction1.super.reversed()::apply;
    }

    default public Fnc1<T1, R> memoized() {
        return CheckedFunction1.super.memoized()::apply;
    }

    default public <V> Fnc1<T1, V> andThen(CheckedFunction1<? super R, ? extends V> after) {
        return CheckedFunction1.super.andThen(after)::apply;
    }

    default public <V> Fnc1<V, R> compose(CheckedFunction1<? super V, ? extends T1> before) {
        return CheckedFunction1.super.compose(before)::apply;
    }

    default public Fn1<T1, R> recover(Function<? super Throwable, ? extends Function<? super T1, ? extends R>> recover) {
        return CheckedFunction1.super.recover(recover)::apply;
    }

}

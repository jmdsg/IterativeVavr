package com.fiberg.iterative.function;

import com.fiberg.iterative.core.IterativeInternals;
import io.vavr.*;
import io.vavr.control.Option;
import io.vavr.control.Try;

import java.util.Objects;
import java.util.function.Function;

@FunctionalInterface
public interface Fn2<T1, T2, R> extends Function2<T1, T2, R> {

    public static <T1, T2, R> Fn2<T1, T2, R> narrow(Fn2<? super T1, ? super T2, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fn2<T1, T2, R> fn = (Fn2<T1, T2, R>) f;
        return fn;
    }

    public static <T1, T2, R> Fn2<T1, T2, R> empty() {
        return IterativeInternals::none;
    }

    public static <T1, T2, R> Fn2<T1, T2, R> value(R r) {
        return (t1, t2) -> r;
    }

    public static <T1, T2, R> Fn2<T1, T2, R> of(Fn2<? super T1, ? super T2, ? extends R> f) {
        return Fn2.narrow(f);
    }

    public static <T1, T2, R> Fn2<T1, T2, R> of1(Fn1<? super T1, ? extends R> f) {
        return Fn2.<T1, T2, R>narrow(f.ignoring1Rt());
    }

    public static <T1, T2, R> Fn2<T1, T2, R> of2(Fn1<? super T2, ? extends R> f) {
        return Fn2.<T1, T2, R>narrow(f.ignoring1Lt());
    }

    public static <T1, T2, R> Fn1<Tuple2<T1, T2>, R> tuple(Fn2<? super T1, ? super T2, ? extends R> f) {
        return Fn2.<T1, T2, R>of(f).tupled();
    }

    public static <T1, T2, R> Fn2<T1, T2, R> detuple(Fn1<? super Tuple2<? extends T1, ? extends T2>, ? extends R> f) {
        return (t1, t2) -> f.apply(Tuple.of(t1, t2));
    }

    public static <T1, T2, R> Fn2<T1, T2, R> uncheck(Fnc2<? super T1, ? super T2, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fnc2.<T1, T2, R>narrow(f).unchecked();
    }

    public static <T1, T2, R> Fn2<T1, T2, R> ignore(Fn0<? extends R> f) {
        return Fn0.<R>narrow(f).ignoring2();
    }

    public static <T1, T2, R> Fn2<T1, T2, R> ignoreRt(Fn1<? super T1, ? extends R> f) {
        return Fn1.<T1, R>narrow(f).ignoring1Rt();
    }

    public static <T1, T2, R> Fn2<T1, T2, R> ignoreLt(Fn1<? super T2, ? extends R> f) {
        return Fn1.<T2, R>narrow(f).ignoring1Lt();
    }

    public static <T1, T2, T3, R> Fn2<T1, T2, R> passRt(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f, T3 t3) {
        return Fn2.narrow(f.applyRt(t3));
    }

    public static <T1, T2, T3, T4, R> Fn2<T1, T2, R> passRt(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f, T3 t3, T4 t4) {
        return Fn2.narrow(f.applyRt(t3, t4));
    }

    public static <T1, T2, T3, T4, T5, R> Fn2<T1, T2, R> passRt(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f, T3 t3, T4 t4, T5 t5) {
        return Fn2.narrow(f.applyRt(t3, t4, t5));
    }

    public static <T1, T2, T3, T4, T5, T6, R> Fn2<T1, T2, R> passRt(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f, T3 t3, T4 t4, T5 t5, T6 t6) {
        return Fn2.narrow(f.applyRt(t3, t4, t5, t6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn2<T1, T2, R> passRt(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return Fn2.narrow(f.applyRt(t3, t4, t5, t6, t7));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn2<T1, T2, R> passRt(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Fn2.narrow(f.applyRt(t3, t4, t5, t6, t7, t8));
    }

    public static <T1, T2, T3, R> Fn2<T2, T3, R> passLt(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f, T1 t1) {
        return Fn2.narrow(f.applyLt(t1));
    }

    public static <T1, T2, T3, T4, R> Fn2<T3, T4, R> passLt(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f, T1 t1, T2 t2) {
        return Fn2.narrow(f.applyLt(t1, t2));
    }

    public static <T1, T2, T3, T4, T5, R> Fn2<T4, T5, R> passLt(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f, T1 t1, T2 t2, T3 t3) {
        return Fn2.narrow(f.applyLt(t1, t2, t3));
    }

    public static <T1, T2, T3, T4, T5, T6, R> Fn2<T5, T6, R> passLt(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4) {
        return Fn2.narrow(f.applyLt(t1, t2, t3, t4));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn2<T6, T7, R> passLt(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return Fn2.narrow(f.applyLt(t1, t2, t3, t4, t5));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn2<T7, T8, R> passLt(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return Fn2.narrow(f.applyLt(t1, t2, t3, t4, t5, t6));
    }

    public static <T1, T2, R> R passAndApply(Fn2<? super T1, ? super T2, ? extends R> f, T1 t1, T2 t2) {
        return Fn0.pass(f, t1, t2).apply();
    }

    public static <T1, T2, R> Fn2<T1, T2, Option<R>> lift(Fn2<? super T1, ? super T2, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fn2.<T1, T2, R>liftTry(f).afterApply(Value::toOption);
    }

    public static <T1, T2, R> Fn2<T1, T2, Try<R>> liftTry(Fn2<? super T1, ? super T2, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fn2.<T1, T2, R>narrow(f).beforeWrap(Try::of);
    }

    public static <T1, T2, R> Fn2<T2, T1, R> invert(Fn2<? super T1, ? super T2, ? extends R> f) {
        return Fn2.<T1, T2, R>narrow(f).inverted();
    }

    default public Fn1<T2, R> applyLt(T1 t1) {
        return t2 -> this.apply(t1, t2);
    }

    default public Fn1<T1, R> applyRt(T2 t2) {
        return t1 -> this.apply(t1, t2);
    }

    default public Fn0<R> toFunction(T1 t1, T2 t2) {
        return () -> this.apply(t1, t2);
    }

    default public Rn toRunnable(T1 t1, T2 t2) {
        return this.toFunction(t1, t2).toRunnable();
    }

    default public Cs2<T1, T2> toConsumer() {
        return this::apply;
    }

    default public Sp<R> toSupplier(T1 t1, T2 t2) {
        return this.toFunction(t1, t2).toSupplier();
    }

    default public Fn2<T1, T2, R> afterRun(Rn r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2) -> {
            R result = this.apply(t1, t2);
            r.run();
            return result;
        };
    }

    default public <V> Fn2<T1, T2, V> afterApply(Fn1<? super R, ? extends V> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2) -> f.apply(this.apply(t1, t2));
    }

    default public <V> Fn2<T1, T2, V> afterApply(Fn0<? extends V> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2) -> f.ignoring1().apply(this.apply(t1, t2));
    }

    default public <V> Fn2<T1, T2, V> afterGet(Sp<? extends V> s) {
        Objects.requireNonNull(s, "s is null");
        return (t1, t2) -> s.ignoring1().apply(this.apply(t1, t2));
    }

    default public Fn2<T1, T2, Boolean> afterTest(Pr1<? super R> p) {
        Objects.requireNonNull(p, "p is null");
        return this.afterTestTo(p).toFunction();
    }

    default public Pr2<T1, T2> afterTestTo(Pr1<? super R> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2) -> p.test(this.apply(t1, t2));
    }

    default public Cs2<T1, T2> afterAcceptTo(Cs1<? super R> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2) -> c.accept(this.apply(t1, t2));
    }

    default public Fn2<T1, T2, R> afterAccept(Cs1<? super R> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2) -> {
            R result = this.apply(t1, t2);
            c.accept(result);
            return result;
        };
    }

    default public <W> Fn2<T1, T2, W> beforeWrap(Fn1<? super Spc<R>, ? extends W> wrap) {
        Objects.requireNonNull(wrap, "wrap is null");
        return (t1, t2) -> wrap.apply(this.toSupplier(t1, t2).checked());
    }

    default public Fn2<T1, T2, R> beforeRun(Rn r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2) -> {
            r.run();
            return this.apply(t1, t2);
        };
    }

    default public <B1, B2> Fn2<B1, B2, R> beforeApply(Fn2<? super B1, ? super B2, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        return this.beforeApply2(f);
    }

    default public <B1> Fn1<B1, R> beforeApply1(Fn1<? super B1, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return b1 -> this.tupled().apply(Tuple.narrow((f.apply(b1))));
    }

    default public <B1, B2> Fn2<B1, B2, R> beforeApply2(Fn2<? super B1, ? super B2, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2))));
    }

    default public <B1, B2, B3> Fn3<B1, B2, B3, R> beforeApply3(Fn3<? super B1, ? super B2, ? super B3, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3))));
    }

    default public <B1, B2, B3, B4> Fn4<B1, B2, B3, B4, R> beforeApply4(Fn4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4))));
    }

    default public <B1, B2, B3, B4, B5> Fn5<B1, B2, B3, B4, B5, R> beforeApply5(Fn5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4, b5))));
    }

    default public <B1, B2, B3, B4, B5, B6> Fn6<B1, B2, B3, B4, B5, B6, R> beforeApply6(Fn6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Fn7<B1, B2, B3, B4, B5, B6, B7, R> beforeApply7(Fn7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Fn8<B1, B2, B3, B4, B5, B6, B7, B8, R> beforeApply8(Fn8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7, b8) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7, b8))));
    }

    default public Fn2<T1, T2, R> beforeTestOnSuccess(Pr0 p, Fn2<? super T1, ? super T2, ? extends R> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2) -> p.test() ? this.apply(t1, t2) : onFailure.apply(t1, t2);
    }

    default public Fn2<T1, T2, R> beforeTestOnSuccess(Pr0 p, Sp<? extends R> onFailure) {
        return this.beforeTestOnSuccess(p, onFailure.toFunction().ignoring2());
    }

    default public Fn2<T1, T2, R> beforeTestOnSuccess(Pr0 p, R onFailure) {
        return this.beforeTestOnSuccess(p, Fn2.value(onFailure));
    }

    default public Fn2<T1, T2, R> beforeTestOnSuccess(Pr0 p) {
        return this.beforeTestOnSuccess(p, Fn2.empty());
    }

    default public Fn2<T1, T2, R> beforeTestOnFailure(Pr0 p, Fn2<? super T1, ? super T2, ? extends R> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Fn2<T1, T2, R> beforeTestOnFailure(Pr0 p, Sp<? extends R> onSuccess) {
        return this.beforeTestOnFailure(p, onSuccess.toFunction().ignoring2());
    }

    default public Fn2<T1, T2, R> beforeTestOnFailure(Pr0 p, R onSuccess) {
        return this.beforeTestOnFailure(p, Fn2.value(onSuccess));
    }

    default public Fn2<T1, T2, R> beforeTestOnFailure(Pr0 p) {
        return this.beforeTestOnFailure(p, Fn2.empty());
    }

    default public Sp<R> beforeGet(Sp<? extends Tuple2<? extends T1, ? extends T2>> s) {
        Objects.requireNonNull(s, "s is null");
        return () -> this.tupled().apply(Tuple.narrow((s.get())));
    }

    default public Fn2<T1, T2, Option<R>> lift() {
        return Fn2.lift(this);
    }

    default public Fn2<T1, T2, Try<R>> liftTry() {
        return Fn2.liftTry(this);
    }

    default public Fn2<T2, T1, R> inverted() {
        return (t2, t1) -> this.apply(t1, t2);
    }

    default public <S> Fn2<T1, T2, S> afterPassingThroughApply(Fn2<? super T1, ? super T2, ? extends S> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2) -> {
            this.apply(t1, t2);
            return f.apply(t1, t2);
        };
    }

    default public Fn2<T1, T2, R> afterPassingThroughTest(Pr2<? super T1, ? super T2> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2) -> {
            R result = this.apply(t1, t2);
            p.test(t1, t2);
            return result;
        };
    }

    default public Pr2<T1, T2> afterPassingThroughTestTo(Pr2<? super T1, ? super T2> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2) -> {
            this.apply(t1, t2);
            return p.test(t1, t2);
        };
    }

    default public Fn2<T1, T2, R> afterPassingThroughAccept(Cs2<? super T1, ? super T2> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2) -> {
            R result = this.apply(t1, t2);
            c.accept(t1, t2);
            return result;
        };
    }

    default public Cs2<T1, T2> afterPassingThroughAcceptTo(Cs2<? super T1, ? super T2> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2) -> {
            this.apply(t1, t2);
            c.accept(t1, t2);
        };
    }

    default public Fn2<T1, T2, R> beforePassingThroughApply(Fn2<? super T1, ? super T2, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2) -> {
            f.apply(t1, t2);
            return this.apply(t1, t2);
        };
    }

    default public Fn2<T1, T2, R> beforePassingThroughTest(Pr2<? super T1, ? super T2> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2) -> {
            p.test(t1, t2);
            return this.apply(t1, t2);
        };
    }

    default public Fn2<T1, T2, R> beforePassingThroughAccept(Cs2<? super T1, ? super T2> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2) -> {
            c.accept(t1, t2);
            return this.apply(t1, t2);
        };
    }

    default public Fn2<T1, T2, R> beforeSuccessPassingThroughTest(Pr2<? super T1, ? super T2> p, Fn2<? super T1, ? super T2, ? extends R> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2) -> p.test(t1, t2) ? this.apply(t1, t2) : onFailure.apply(t1, t2);
    }

    default public Fn2<T1, T2, R> beforeSuccessPassingThroughTest(Pr2<? super T1, ? super T2> p, Sp<? extends R> onFailure) {
        return this.beforeSuccessPassingThroughTest(p, onFailure.toFunction().ignoring2());
    }

    default public Fn2<T1, T2, R> beforeSuccessPassingThroughTest(Pr2<? super T1, ? super T2> p, R onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Fn2.value(onFailure));
    }

    default public Fn2<T1, T2, R> beforeSuccessPassingThroughTest(Pr2<? super T1, ? super T2> p) {
        return this.beforeSuccessPassingThroughTest(p, Fn2.empty());
    }

    default public Fn2<T1, T2, R> beforeFailurePassingThroughTest(Pr2<? super T1, ? super T2> p, Fn2<? super T1, ? super T2, ? extends R> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Fn2<T1, T2, R> beforeFailurePassingThroughTest(Pr2<? super T1, ? super T2> p, Sp<? extends R> onSuccess) {
        return this.beforeFailurePassingThroughTest(p, onSuccess.toFunction().ignoring2());
    }

    default public Fn2<T1, T2, R> beforeFailurePassingThroughTest(Pr2<? super T1, ? super T2> p, R onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Fn2.value(onSuccess));
    }

    default public Fn2<T1, T2, R> beforeFailurePassingThroughTest(Pr2<? super T1, ? super T2> p) {
        return this.beforeFailurePassingThroughTest(p, Fn2.empty());
    }

    default public Fn1<T1, Fn1<T2, R>> currying() {
        return t1 -> t2 -> this.apply(t1, t2);
    }

    default public Fnc2<T1, T2, R> checked() {
        return this::apply;
    }

    default public <I1> Fn3<I1, T1, T2, R> ignoring1Lt() {
        return (i1, t1, t2) -> this.apply(t1, t2);
    }

    default public <I1> Fn3<T1, T2, I1, R> ignoring1Rt() {
        return (t1, t2, i1) -> this.apply(t1, t2);
    }

    default public <I1, I2> Fn4<I1, I2, T1, T2, R> ignoring2Lt() {
        return (i1, i2, t1, t2) -> this.apply(t1, t2);
    }

    default public <I1, I2> Fn4<T1, T2, I1, I2, R> ignoring2Rt() {
        return (t1, t2, i1, i2) -> this.apply(t1, t2);
    }

    default public <I1, I2, I3> Fn5<I1, I2, I3, T1, T2, R> ignoring3Lt() {
        return (i1, i2, i3, t1, t2) -> this.apply(t1, t2);
    }

    default public <I1, I2, I3> Fn5<T1, T2, I1, I2, I3, R> ignoring3Rt() {
        return (t1, t2, i1, i2, i3) -> this.apply(t1, t2);
    }

    default public <I1, I2, I3, I4> Fn6<I1, I2, I3, I4, T1, T2, R> ignoring4Lt() {
        return (i1, i2, i3, i4, t1, t2) -> this.apply(t1, t2);
    }

    default public <I1, I2, I3, I4> Fn6<T1, T2, I1, I2, I3, I4, R> ignoring4Rt() {
        return (t1, t2, i1, i2, i3, i4) -> this.apply(t1, t2);
    }

    default public <I1, I2, I3, I4, I5> Fn7<I1, I2, I3, I4, I5, T1, T2, R> ignoring5Lt() {
        return (i1, i2, i3, i4, i5, t1, t2) -> this.apply(t1, t2);
    }

    default public <I1, I2, I3, I4, I5> Fn7<T1, T2, I1, I2, I3, I4, I5, R> ignoring5Rt() {
        return (t1, t2, i1, i2, i3, i4, i5) -> this.apply(t1, t2);
    }

    default public <I1, I2, I3, I4, I5, I6> Fn8<I1, I2, I3, I4, I5, I6, T1, T2, R> ignoring6Lt() {
        return (i1, i2, i3, i4, i5, i6, t1, t2) -> this.apply(t1, t2);
    }

    default public <I1, I2, I3, I4, I5, I6> Fn8<T1, T2, I1, I2, I3, I4, I5, I6, R> ignoring6Rt() {
        return (t1, t2, i1, i2, i3, i4, i5, i6) -> this.apply(t1, t2);
    }

    default public Fn1<T2, R> apply(T1 t1) {
        return Function2.super.apply(t1)::apply;
    }

    default public Fn1<Tuple2<T1, T2>, R> tupled() {
        return Function2.super.tupled()::apply;
    }

    default public Fn1<T1, Function1<T2, R>> curried() {
        return Function2.super.curried()::apply;
    }

    default public Fn2<T2, T1, R> reversed() {
        return Function2.super.reversed()::apply;
    }

    default public Fn2<T1, T2, R> memoized() {
        return Function2.super.memoized()::apply;
    }

    default public <V> Fn2<T1, T2, V> andThen(Function<? super R, ? extends V> after) {
        return Function2.super.andThen(after)::apply;
    }

}

package com.fiberg.iterative.function;

import io.vavr.Tuple;
import io.vavr.Tuple2;

import java.util.Objects;
import java.util.function.BiConsumer;

@FunctionalInterface
public interface Cs2<T1, T2> extends BiConsumer<T1, T2> {

    public static <T1, T2> Cs2<T1, T2> narrow(Cs2<? super T1, ? super T2> c) {
        @SuppressWarnings("unchecked")
        final Cs2<T1, T2> cs = (Cs2<T1, T2>) c;
        return cs;
    }

    public static <T1, T2> Cs2<T1, T2> empty() {
        return (t1, t2) -> {};
    }

    public static <T1, T2> Cs2<T1, T2> of(Cs2<? super T1, ? super T2> c) {
        return Cs2.narrow(c);
    }

    public static <T1, T2> Cs2<T1, T2> of1(Cs1<? super T1> c) {
        return Cs2.<T1, T2>narrow(c.ignoring1Rt());
    }

    public static <T1, T2> Cs2<T1, T2> of2(Cs1<? super T2> c) {
        return Cs2.<T1, T2>narrow(c.ignoring1Lt());
    }

    public static <T1, T2> Cs1<Tuple2<T1, T2>> tuple(Cs2<? super T1, ? super T2> c) {
        return Cs2.<T1, T2>of(c).tupled();
    }

    public static <T1, T2> Cs2<T1, T2> detuple(Cs1<? super Tuple2<? extends T1, ? extends T2>> c) {
        return (t1, t2) -> c.accept(Tuple.of(t1, t2));
    }

    public static <T1, T2> Cs2<T1, T2> uncheck(Csc2<? super T1, ? super T2> c) {
        Objects.requireNonNull(c, "c is null");
        return Csc2.<T1, T2>narrow(c).unchecked();
    }

    public static <T1, T2> Cs2<T1, T2> ignoreRt(Cs1<? super T1> c) {
        return Cs1.<T1>narrow(c).ignoring1Rt();
    }

    public static <T1, T2> Cs2<T1, T2> ignoreLt(Cs1<? super T2> c) {
        return Cs1.<T2>narrow(c).ignoring1Lt();
    }

    public static <T1, T2, T3> Cs2<T1, T2> passRt(Cs3<? super T1, ? super T2, ? super T3> c, T3 t3) {
        return Cs2.narrow(c.acceptRt(t3));
    }

    public static <T1, T2, T3, T4> Cs2<T1, T2> passRt(Cs4<? super T1, ? super T2, ? super T3, ? super T4> c, T3 t3, T4 t4) {
        return Cs2.narrow(c.acceptRt(t3, t4));
    }

    public static <T1, T2, T3, T4, T5> Cs2<T1, T2> passRt(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c, T3 t3, T4 t4, T5 t5) {
        return Cs2.narrow(c.acceptRt(t3, t4, t5));
    }

    public static <T1, T2, T3, T4, T5, T6> Cs2<T1, T2> passRt(Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c, T3 t3, T4 t4, T5 t5, T6 t6) {
        return Cs2.narrow(c.acceptRt(t3, t4, t5, t6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Cs2<T1, T2> passRt(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return Cs2.narrow(c.acceptRt(t3, t4, t5, t6, t7));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs2<T1, T2> passRt(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Cs2.narrow(c.acceptRt(t3, t4, t5, t6, t7, t8));
    }

    public static <T1, T2, T3> Cs2<T2, T3> passLt(Cs3<? super T1, ? super T2, ? super T3> c, T1 t1) {
        return Cs2.narrow(c.acceptLt(t1));
    }

    public static <T1, T2, T3, T4> Cs2<T3, T4> passLt(Cs4<? super T1, ? super T2, ? super T3, ? super T4> c, T1 t1, T2 t2) {
        return Cs2.narrow(c.acceptLt(t1, t2));
    }

    public static <T1, T2, T3, T4, T5> Cs2<T4, T5> passLt(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c, T1 t1, T2 t2, T3 t3) {
        return Cs2.narrow(c.acceptLt(t1, t2, t3));
    }

    public static <T1, T2, T3, T4, T5, T6> Cs2<T5, T6> passLt(Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c, T1 t1, T2 t2, T3 t3, T4 t4) {
        return Cs2.narrow(c.acceptLt(t1, t2, t3, t4));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Cs2<T6, T7> passLt(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return Cs2.narrow(c.acceptLt(t1, t2, t3, t4, t5));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs2<T7, T8> passLt(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return Cs2.narrow(c.acceptLt(t1, t2, t3, t4, t5, t6));
    }

    public static <T1, T2> void passAndRun(Cs2<? super T1, ? super T2> c, T1 t1, T2 t2) {
        Rn.pass(c, t1, t2).run();
    }

    public static <T1, T2> Cs2<T2, T1> invert(Cs2<? super T1, ? super T2> c) {
        return Cs2.<T1, T2>narrow(c).inverted();
    }

    default public Cs1<T2> acceptLt(T1 t1) {
        return t2 -> this.accept(t1, t2);
    }

    default public Cs1<T1> acceptRt(T2 t2) {
        return t1 -> this.accept(t1, t2);
    }

    default public <R> Fn2<T1, T2, R> toFunction(R r) {
        return (t1, t2) -> {
            this.accept(t1, t2);
            return r;
        };
    }

    default public Pr2<T1, T2> toPredicate(boolean b) {
        return (t1, t2) -> {
            this.accept(t1, t2);
            return b;
        };
    }

    default public Rn toRunnable(T1 t1, T2 t2) {
        return () -> this.accept(t1, t2);
    }

    default public Cs2<T1, T2> afterRun(Rn r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2) -> {
            this.accept(t1, t2);
            r.run();
        };
    }

    default public <R> Cs2<T1, T2> afterApply(Fn0<? super R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.afterApplyTo(f).toConsumer();
    }

    default public <R> Fn2<T1, T2, R> afterApplyTo(Fn0<? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2) -> {
            this.accept(t1, t2);
            return f.apply();
        };
    }

    default public Cs2<T1, T2> afterTest(Pr0 p) {
        Objects.requireNonNull(p, "p is null");
        return this.afterTestTo(p).toConsumer();
    }

    default public Pr2<T1, T2> afterTestTo(Pr0 p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2) -> {
            this.accept(t1, t2);
            return p.test();
        };
    }

    default public <R> Fn2<T1, T2, R> afterGet(Sp<? extends R> s) {
        return (t1, t2) -> {
            this.accept(t1, t2);
            return s.get();
        };
    }

    default public Cs2<T1, T2> beforeRun(Rn r) {
        return (t1, t2) -> {
            r.run();
            this.accept(t1, t2);
        };
    }

    default public <B1, B2> Cs2<B1, B2> beforeApply(Fn2<? super B1, ? super B2, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        return this.beforeApply2(f);
    }

    default public <B1> Cs1<B1> beforeApply1(Fn1<? super B1, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return b1 -> this.tupled().accept(Tuple.narrow((f.apply(b1))));
    }

    default public <B1, B2> Cs2<B1, B2> beforeApply2(Fn2<? super B1, ? super B2, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2))));
    }

    default public <B1, B2, B3> Cs3<B1, B2, B3> beforeApply3(Fn3<? super B1, ? super B2, ? super B3, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2, b3))));
    }

    default public <B1, B2, B3, B4> Cs4<B1, B2, B3, B4> beforeApply4(Fn4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2, b3, b4))));
    }

    default public <B1, B2, B3, B4, B5> Cs5<B1, B2, B3, B4, B5> beforeApply5(Fn5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2, b3, b4, b5))));
    }

    default public <B1, B2, B3, B4, B5, B6> Cs6<B1, B2, B3, B4, B5, B6> beforeApply6(Fn6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Cs7<B1, B2, B3, B4, B5, B6, B7> beforeApply7(Fn7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Cs8<B1, B2, B3, B4, B5, B6, B7, B8> beforeApply8(Fn8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7, b8) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7, b8))));
    }

    default public Cs2<T1, T2> beforeTestOnSuccess(Pr0 p, Cs2<? super T1, ? super T2> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2) -> (p.test() ? this : Cs2.<T1, T2>narrow(onFailure)).accept(t1, t2);
    }

    default public Cs2<T1, T2> beforeTestOnSuccess(Pr0 p) {
        return this.beforeTestOnSuccess(p, Cs2.empty());
    }

    default public Cs2<T1, T2> beforeTestOnFailure(Pr0 p, Cs2<? super T1, ? super T2> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Cs2<T1, T2> beforeTestOnFailure(Pr0 p) {
        return this.beforeTestOnFailure(p, Cs2.empty());
    }

    default public Rn beforeGet(Sp<? extends Tuple2<? extends T1, ? extends T2>> s) {
        Objects.requireNonNull(s, "s is null");
        return () -> this.tupled().accept(Tuple.narrow((s.get())));
    }

    default public Cs2<T2, T1> inverted() {
        return (t2, t1) -> this.accept(t1, t2);
    }

    default public <S> Cs2<T1, T2> afterPassingThroughApply(Fn2<? super T1, ? super T2, ? extends S> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2) -> {
            this.accept(t1, t2);
            f.apply(t1, t2);
        };
    }

    default public <S> Fn2<T1, T2, S> afterPassingThroughApplyTo(Fn2<? super T1, ? super T2, ? extends S> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2) -> {
            this.accept(t1, t2);
            return f.apply(t1, t2);
        };
    }

    default public Cs2<T1, T2> afterPassingThroughTest(Pr2<? super T1, ? super T2> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2) -> {
            this.accept(t1, t2);
            p.test(t1, t2);
        };
    }

    default public Pr2<T1, T2> afterPassingThroughTestTo(Pr2<? super T1, ? super T2> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2) -> {
            this.accept(t1, t2);
            return p.test(t1, t2);
        };
    }

    default public Cs2<T1, T2> afterPassingThroughAccept(Cs2<? super T1, ? super T2> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2) -> {
            this.accept(t1, t2);
            c.accept(t1, t2);
        };
    }

    default public <R> Cs2<T1, T2> beforePassingThroughApply(Fn2<? super T1, ? super T2, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2) -> {
            f.apply(t1, t2);
            this.accept(t1, t2);
        };
    }

    default public Cs2<T1, T2> beforePassingThroughTest(Pr2<? super T1, ? super T2> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2) -> {
            p.test(t1, t2);
            this.accept(t1, t2);
        };
    }

    default public Cs2<T1, T2> beforePassingThroughAccept(Cs2<? super T1, ? super T2> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2) -> {
            c.accept(t1, t2);
            this.accept(t1, t2);
        };
    }

    default public Cs2<T1, T2> beforeSuccessPassingThroughTest(Pr2<? super T1, ? super T2> p, Cs2<? super T1, ? super T2> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2) -> (p.test(t1, t2) ? this : Cs2.<T1, T2>narrow(onFailure)).accept(t1, t2);
    }

    default public Cs2<T1, T2> beforeSuccessPassingThroughTest(Pr2<? super T1, ? super T2> p) {
        return this.beforeSuccessPassingThroughTest(p, Cs2.empty());
    }

    default public Cs2<T1, T2> beforeFailurePassingThroughTest(Pr2<? super T1, ? super T2> p, Cs2<? super T1, ? super T2> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Cs2<T1, T2> beforeFailurePassingThroughTest(Pr2<? super T1, ? super T2> p) {
        return this.beforeFailurePassingThroughTest(p, Cs2.empty());
    }

    default public Cs1<Tuple2<T1, T2>> tupled() {
        return tuple -> this.accept(tuple._1(), tuple._2());
    }

    default public Fn1<T1, Cs1<T2>> currying() {
        return t1 -> t2 -> this.accept(t1, t2);
    }

    default public Csc2<T1, T2> checked() {
        return this::accept;
    }

    default public <I1> Cs3<I1, T1, T2> ignoring1Lt() {
        return (i1, t1, t2) -> this.accept(t1, t2);
    }

    default public <I1> Cs3<T1, T2, I1> ignoring1Rt() {
        return (t1, t2, i1) -> this.accept(t1, t2);
    }

    default public <I1, I2> Cs4<I1, I2, T1, T2> ignoring2Lt() {
        return (i1, i2, t1, t2) -> this.accept(t1, t2);
    }

    default public <I1, I2> Cs4<T1, T2, I1, I2> ignoring2Rt() {
        return (t1, t2, i1, i2) -> this.accept(t1, t2);
    }

    default public <I1, I2, I3> Cs5<I1, I2, I3, T1, T2> ignoring3Lt() {
        return (i1, i2, i3, t1, t2) -> this.accept(t1, t2);
    }

    default public <I1, I2, I3> Cs5<T1, T2, I1, I2, I3> ignoring3Rt() {
        return (t1, t2, i1, i2, i3) -> this.accept(t1, t2);
    }

    default public <I1, I2, I3, I4> Cs6<I1, I2, I3, I4, T1, T2> ignoring4Lt() {
        return (i1, i2, i3, i4, t1, t2) -> this.accept(t1, t2);
    }

    default public <I1, I2, I3, I4> Cs6<T1, T2, I1, I2, I3, I4> ignoring4Rt() {
        return (t1, t2, i1, i2, i3, i4) -> this.accept(t1, t2);
    }

    default public <I1, I2, I3, I4, I5> Cs7<I1, I2, I3, I4, I5, T1, T2> ignoring5Lt() {
        return (i1, i2, i3, i4, i5, t1, t2) -> this.accept(t1, t2);
    }

    default public <I1, I2, I3, I4, I5> Cs7<T1, T2, I1, I2, I3, I4, I5> ignoring5Rt() {
        return (t1, t2, i1, i2, i3, i4, i5) -> this.accept(t1, t2);
    }

    default public <I1, I2, I3, I4, I5, I6> Cs8<I1, I2, I3, I4, I5, I6, T1, T2> ignoring6Lt() {
        return (i1, i2, i3, i4, i5, i6, t1, t2) -> this.accept(t1, t2);
    }

    default public <I1, I2, I3, I4, I5, I6> Cs8<T1, T2, I1, I2, I3, I4, I5, I6> ignoring6Rt() {
        return (t1, t2, i1, i2, i3, i4, i5, i6) -> this.accept(t1, t2);
    }

    @Override
    default public Cs2<T1, T2> andThen(BiConsumer<? super T1, ? super T2> after) {
        Objects.requireNonNull(after, "after is null");
        return (t1, t2) -> BiConsumer.super.andThen(after).accept(t1, t2);
    }

}

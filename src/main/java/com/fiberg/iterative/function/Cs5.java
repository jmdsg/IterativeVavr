package com.fiberg.iterative.function;

import io.vavr.Tuple;
import io.vavr.Tuple5;

import java.util.Objects;

@FunctionalInterface
public interface Cs5<T1, T2, T3, T4, T5> {

    public static <T1, T2, T3, T4, T5> Cs5<T1, T2, T3, T4, T5> narrow(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        @SuppressWarnings("unchecked")
        final Cs5<T1, T2, T3, T4, T5> cs = (Cs5<T1, T2, T3, T4, T5>) c;
        return cs;
    }

    public static <T1, T2, T3, T4, T5> Cs5<T1, T2, T3, T4, T5> empty() {
        return (t1, t2, t3, t4, t5) -> {};
    }

    public static <T1, T2, T3, T4, T5> Cs5<T1, T2, T3, T4, T5> of(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        return Cs5.narrow(c);
    }

    public static <T1, T2, T3, T4, T5> Cs5<T1, T2, T3, T4, T5> of1(Cs1<? super T1> f) {
        return Cs5.<T1, T2, T3, T4, T5>narrow(f.ignoring4Rt());
    }

    public static <T1, T2, T3, T4, T5> Cs5<T1, T2, T3, T4, T5> of2(Cs1<? super T2> f) {
        return Cs5.<T1, T2, T3, T4, T5>narrow(f.ignoring3Rt().ignoring1Lt());
    }

    public static <T1, T2, T3, T4, T5> Cs5<T1, T2, T3, T4, T5> of3(Cs1<? super T3> f) {
        return Cs5.<T1, T2, T3, T4, T5>narrow(f.ignoring2Rt().ignoring2Lt());
    }

    public static <T1, T2, T3, T4, T5> Cs5<T1, T2, T3, T4, T5> of4(Cs1<? super T4> f) {
        return Cs5.<T1, T2, T3, T4, T5>narrow(f.ignoring1Rt().ignoring3Lt());
    }

    public static <T1, T2, T3, T4, T5> Cs5<T1, T2, T3, T4, T5> of5(Cs1<? super T5> f) {
        return Cs5.<T1, T2, T3, T4, T5>narrow(f.ignoring4Lt());
    }

    public static <T1, T2, T3, T4, T5> Cs1<Tuple5<T1, T2, T3, T4, T5>> tuple(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        return Cs5.<T1, T2, T3, T4, T5>of(c).tupled();
    }

    public static <T1, T2, T3, T4, T5> Cs5<T1, T2, T3, T4, T5> detuple(Cs1<? super Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> c) {
        return (t1, t2, t3, t4, t5) -> c.accept(Tuple.of(t1, t2, t3, t4, t5));
    }

    public static <T1, T2, T3, T4, T5> Cs5<T1, T2, T3, T4, T5> uncheck(Csc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        Objects.requireNonNull(c, "c is null");
        return Csc5.<T1, T2, T3, T4, T5>narrow(c).unchecked();
    }

    public static <T1, T2, T3, T4, T5> Cs5<T1, T2, T3, T4, T5> ignore4Rt(Cs1<? super T1> c) {
        return Cs1.<T1>narrow(c).ignoring4Rt();
    }

    public static <T1, T2, T3, T4, T5> Cs5<T1, T2, T3, T4, T5> ignore4Lt(Cs1<? super T5> c) {
        return Cs1.<T5>narrow(c).ignoring4Lt();
    }

    public static <T1, T2, T3, T4, T5> Cs5<T1, T2, T3, T4, T5> ignore3Rt(Cs2<? super T1, ? super T2> c) {
        return Cs2.<T1, T2>narrow(c).ignoring3Rt();
    }

    public static <T1, T2, T3, T4, T5> Cs5<T1, T2, T3, T4, T5> ignore3Lt(Cs2<? super T4, ? super T5> c) {
        return Cs2.<T4, T5>narrow(c).ignoring3Lt();
    }

    public static <T1, T2, T3, T4, T5> Cs5<T1, T2, T3, T4, T5> ignore2Rt(Cs3<? super T1, ? super T2, ? super T3> c) {
        return Cs3.<T1, T2, T3>narrow(c).ignoring2Rt();
    }

    public static <T1, T2, T3, T4, T5> Cs5<T1, T2, T3, T4, T5> ignore2Lt(Cs3<? super T3, ? super T4, ? super T5> c) {
        return Cs3.<T3, T4, T5>narrow(c).ignoring2Lt();
    }

    public static <T1, T2, T3, T4, T5> Cs5<T1, T2, T3, T4, T5> ignore1Rt(Cs4<? super T1, ? super T2, ? super T3, ? super T4> c) {
        return Cs4.<T1, T2, T3, T4>narrow(c).ignoring1Rt();
    }

    public static <T1, T2, T3, T4, T5> Cs5<T1, T2, T3, T4, T5> ignore1Lt(Cs4<? super T2, ? super T3, ? super T4, ? super T5> c) {
        return Cs4.<T2, T3, T4, T5>narrow(c).ignoring1Lt();
    }

    public static <T1, T2, T3, T4, T5, T6> Cs5<T1, T2, T3, T4, T5> passRt(Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c, T6 t6) {
        return Cs5.narrow(c.acceptRt(t6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Cs5<T1, T2, T3, T4, T5> passRt(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c, T6 t6, T7 t7) {
        return Cs5.narrow(c.acceptRt(t6, t7));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs5<T1, T2, T3, T4, T5> passRt(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c, T6 t6, T7 t7, T8 t8) {
        return Cs5.narrow(c.acceptRt(t6, t7, t8));
    }

    public static <T1, T2, T3, T4, T5, T6> Cs5<T2, T3, T4, T5, T6> passLt(Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c, T1 t1) {
        return Cs5.narrow(c.acceptLt(t1));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Cs5<T3, T4, T5, T6, T7> passLt(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c, T1 t1, T2 t2) {
        return Cs5.narrow(c.acceptLt(t1, t2));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs5<T4, T5, T6, T7, T8> passLt(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c, T1 t1, T2 t2, T3 t3) {
        return Cs5.narrow(c.acceptLt(t1, t2, t3));
    }

    public static <T1, T2, T3, T4, T5> void passAndRun(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        Rn.pass(c, t1, t2, t3, t4, t5).run();
    }

    public static <T1, T2, T3, T4, T5> Cs5<T5, T4, T3, T2, T1> invert(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        return Cs5.<T1, T2, T3, T4, T5>narrow(c).inverted();
    }

    public void accept(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5);

    default public Cs4<T2, T3, T4, T5> acceptLt(T1 t1) {
        return (t2, t3, t4, t5) -> this.accept(t1, t2, t3, t4, t5);
    }

    default public Cs3<T3, T4, T5> acceptLt(T1 t1, T2 t2) {
        return (t3, t4, t5) -> this.accept(t1, t2, t3, t4, t5);
    }

    default public Cs2<T4, T5> acceptLt(T1 t1, T2 t2, T3 t3) {
        return (t4, t5) -> this.accept(t1, t2, t3, t4, t5);
    }

    default public Cs1<T5> acceptLt(T1 t1, T2 t2, T3 t3, T4 t4) {
        return t5 -> this.accept(t1, t2, t3, t4, t5);
    }

    default public Cs4<T1, T2, T3, T4> acceptRt(T5 t5) {
        return (t1, t2, t3, t4) -> this.accept(t1, t2, t3, t4, t5);
    }

    default public Cs3<T1, T2, T3> acceptRt(T4 t4, T5 t5) {
        return (t1, t2, t3) -> this.accept(t1, t2, t3, t4, t5);
    }

    default public Cs2<T1, T2> acceptRt(T3 t3, T4 t4, T5 t5) {
        return (t1, t2) -> this.accept(t1, t2, t3, t4, t5);
    }

    default public Cs1<T1> acceptRt(T2 t2, T3 t3, T4 t4, T5 t5) {
        return t1 -> this.accept(t1, t2, t3, t4, t5);
    }

    default public <R> Fn5<T1, T2, T3, T4, T5, R> toFunction(R r) {
        return (t1, t2, t3, t4, t5) -> {
            this.accept(t1, t2, t3, t4, t5);
            return r;
        };
    }

    default public Pr5<T1, T2, T3, T4, T5> toPredicate(boolean b) {
        return (t1, t2, t3, t4, t5) -> {
            this.accept(t1, t2, t3, t4, t5);
            return b;
        };
    }

    default public Rn toRunnable(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return () -> this.accept(t1, t2, t3, t4, t5);
    }

    default public Cs5<T1, T2, T3, T4, T5> afterRun(Rn r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2, t3, t4, t5) -> {
            this.accept(t1, t2, t3, t4, t5);
            r.run();
        };
    }

    default public <R> Cs5<T1, T2, T3, T4, T5> afterApply(Fn0<? super R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.afterApplyTo(f).toConsumer();
    }

    default public <R> Fn5<T1, T2, T3, T4, T5, R> afterApplyTo(Fn0<? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5) -> {
            this.accept(t1, t2, t3, t4, t5);
            return f.apply();
        };
    }

    default public Cs5<T1, T2, T3, T4, T5> afterTest(Pr0 p) {
        Objects.requireNonNull(p, "p is null");
        return this.afterTestTo(p).toConsumer();
    }

    default public Pr5<T1, T2, T3, T4, T5> afterTestTo(Pr0 p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5) -> {
            this.accept(t1, t2, t3, t4, t5);
            return p.test();
        };
    }

    default public <R> Fn5<T1, T2, T3, T4, T5, R> afterGet(Sp<? extends R> s) {
        return (t1, t2, t3, t4, t5) -> {
            this.accept(t1, t2, t3, t4, t5);
            return s.get();
        };
    }

    default public Cs5<T1, T2, T3, T4, T5> beforeRun(Rn r) {
        return (t1, t2, t3, t4, t5) -> {
            r.run();
            this.accept(t1, t2, t3, t4, t5);
        };
    }

    default public <B1, B2, B3, B4, B5> Cs5<B1, B2, B3, B4, B5> beforeApply(Fn5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        return this.beforeApply5(f);
    }

    default public <B1> Cs1<B1> beforeApply1(Fn1<? super B1, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return b1 -> this.tupled().accept(Tuple.narrow((f.apply(b1))));
    }

    default public <B1, B2> Cs2<B1, B2> beforeApply2(Fn2<? super B1, ? super B2, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2))));
    }

    default public <B1, B2, B3> Cs3<B1, B2, B3> beforeApply3(Fn3<? super B1, ? super B2, ? super B3, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2, b3))));
    }

    default public <B1, B2, B3, B4> Cs4<B1, B2, B3, B4> beforeApply4(Fn4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2, b3, b4))));
    }

    default public <B1, B2, B3, B4, B5> Cs5<B1, B2, B3, B4, B5> beforeApply5(Fn5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2, b3, b4, b5))));
    }

    default public <B1, B2, B3, B4, B5, B6> Cs6<B1, B2, B3, B4, B5, B6> beforeApply6(Fn6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Cs7<B1, B2, B3, B4, B5, B6, B7> beforeApply7(Fn7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Cs8<B1, B2, B3, B4, B5, B6, B7, B8> beforeApply8(Fn8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7, b8) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7, b8))));
    }

    default public Cs5<T1, T2, T3, T4, T5> beforeTestOnSuccess(Pr0 p, Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5) -> (p.test() ? this : Cs5.<T1, T2, T3, T4, T5>narrow(onFailure)).accept(t1, t2, t3, t4, t5);
    }

    default public Cs5<T1, T2, T3, T4, T5> beforeTestOnSuccess(Pr0 p) {
        return this.beforeTestOnSuccess(p, Cs5.empty());
    }

    default public Cs5<T1, T2, T3, T4, T5> beforeTestOnFailure(Pr0 p, Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Cs5<T1, T2, T3, T4, T5> beforeTestOnFailure(Pr0 p) {
        return this.beforeTestOnFailure(p, Cs5.empty());
    }

    default public Rn beforeGet(Sp<? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> s) {
        Objects.requireNonNull(s, "s is null");
        return () -> this.tupled().accept(Tuple.narrow((s.get())));
    }

    default public Cs5<T5, T4, T3, T2, T1> inverted() {
        return (t5, t4, t3, t2, t1) -> this.accept(t1, t2, t3, t4, t5);
    }

    default public <S> Cs5<T1, T2, T3, T4, T5> afterPassingThroughApply(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends S> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5) -> {
            this.accept(t1, t2, t3, t4, t5);
            f.apply(t1, t2, t3, t4, t5);
        };
    }

    default public <S> Fn5<T1, T2, T3, T4, T5, S> afterPassingThroughApplyTo(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends S> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5) -> {
            this.accept(t1, t2, t3, t4, t5);
            return f.apply(t1, t2, t3, t4, t5);
        };
    }

    default public Cs5<T1, T2, T3, T4, T5> afterPassingThroughTest(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5) -> {
            this.accept(t1, t2, t3, t4, t5);
            p.test(t1, t2, t3, t4, t5);
        };
    }

    default public Pr5<T1, T2, T3, T4, T5> afterPassingThroughTestTo(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5) -> {
            this.accept(t1, t2, t3, t4, t5);
            return p.test(t1, t2, t3, t4, t5);
        };
    }

    default public Cs5<T1, T2, T3, T4, T5> afterPassingThroughAccept(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5) -> {
            this.accept(t1, t2, t3, t4, t5);
            c.accept(t1, t2, t3, t4, t5);
        };
    }

    default public <R> Cs5<T1, T2, T3, T4, T5> beforePassingThroughApply(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5) -> {
            f.apply(t1, t2, t3, t4, t5);
            this.accept(t1, t2, t3, t4, t5);
        };
    }

    default public Cs5<T1, T2, T3, T4, T5> beforePassingThroughTest(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5) -> {
            p.test(t1, t2, t3, t4, t5);
            this.accept(t1, t2, t3, t4, t5);
        };
    }

    default public Cs5<T1, T2, T3, T4, T5> beforePassingThroughAccept(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5) -> {
            c.accept(t1, t2, t3, t4, t5);
            this.accept(t1, t2, t3, t4, t5);
        };
    }

    default public Cs5<T1, T2, T3, T4, T5> beforeSuccessPassingThroughTest(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5) -> (p.test(t1, t2, t3, t4, t5) ? this : Cs5.<T1, T2, T3, T4, T5>narrow(onFailure)).accept(t1, t2, t3, t4, t5);
    }

    default public Cs5<T1, T2, T3, T4, T5> beforeSuccessPassingThroughTest(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return this.beforeSuccessPassingThroughTest(p, Cs5.empty());
    }

    default public Cs5<T1, T2, T3, T4, T5> beforeFailurePassingThroughTest(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Cs5<T1, T2, T3, T4, T5> beforeFailurePassingThroughTest(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return this.beforeFailurePassingThroughTest(p, Cs5.empty());
    }

    default public Cs1<Tuple5<T1, T2, T3, T4, T5>> tupled() {
        return tuple -> this.accept(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5());
    }

    default public Fn1<T1, Fn1<T2, Fn1<T3, Fn1<T4, Cs1<T5>>>>> currying() {
        return t1 -> t2 -> t3 -> t4 -> t5 -> this.accept(t1, t2, t3, t4, t5);
    }

    default public Csc5<T1, T2, T3, T4, T5> checked() {
        return this::accept;
    }

    default public <I1> Cs6<I1, T1, T2, T3, T4, T5> ignoring1Lt() {
        return (i1, t1, t2, t3, t4, t5) -> this.accept(t1, t2, t3, t4, t5);
    }

    default public <I1> Cs6<T1, T2, T3, T4, T5, I1> ignoring1Rt() {
        return (t1, t2, t3, t4, t5, i1) -> this.accept(t1, t2, t3, t4, t5);
    }

    default public <I1, I2> Cs7<I1, I2, T1, T2, T3, T4, T5> ignoring2Lt() {
        return (i1, i2, t1, t2, t3, t4, t5) -> this.accept(t1, t2, t3, t4, t5);
    }

    default public <I1, I2> Cs7<T1, T2, T3, T4, T5, I1, I2> ignoring2Rt() {
        return (t1, t2, t3, t4, t5, i1, i2) -> this.accept(t1, t2, t3, t4, t5);
    }

    default public <I1, I2, I3> Cs8<I1, I2, I3, T1, T2, T3, T4, T5> ignoring3Lt() {
        return (i1, i2, i3, t1, t2, t3, t4, t5) -> this.accept(t1, t2, t3, t4, t5);
    }

    default public <I1, I2, I3> Cs8<T1, T2, T3, T4, T5, I1, I2, I3> ignoring3Rt() {
        return (t1, t2, t3, t4, t5, i1, i2, i3) -> this.accept(t1, t2, t3, t4, t5);
    }

}

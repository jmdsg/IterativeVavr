package com.fiberg.iterative.function;

import com.fiberg.iterative.function.Cs1;
import com.fiberg.iterative.function.Cs2;
import com.fiberg.iterative.function.Cs4;
import com.fiberg.iterative.function.Cs5;
import com.fiberg.iterative.function.Cs6;
import com.fiberg.iterative.function.Cs7;
import com.fiberg.iterative.function.Cs8;
import com.fiberg.iterative.function.Csc3;
import com.fiberg.iterative.function.Fn0;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fn2;
import com.fiberg.iterative.function.Fn3;
import com.fiberg.iterative.function.Fn4;
import com.fiberg.iterative.function.Fn5;
import com.fiberg.iterative.function.Fn6;
import com.fiberg.iterative.function.Fn7;
import com.fiberg.iterative.function.Fn8;
import com.fiberg.iterative.function.Pr0;
import com.fiberg.iterative.function.Pr3;
import com.fiberg.iterative.function.Rn;
import com.fiberg.iterative.function.Sp;
import io.vavr.Tuple;
import io.vavr.Tuple3;
import java.io.Serializable;
import java.util.Objects;

@FunctionalInterface
public interface Cs3<T1, T2, T3> {

    public static <T1, T2, T3> Cs3<T1, T2, T3> narrow(Cs3<? super T1, ? super T2, ? super T3> c) {
        return c;
    }

    public static <T1, T2, T3> Cs3<T1, T2, T3> empty() {
        return (t1, t2, t3) -> {};
    }

    public static <T1, T2, T3> Cs3<T1, T2, T3> of(Cs3<? super T1, ? super T2, ? super T3> c) {
        return Cs3.narrow(c);
    }

    public static <T1, T2, T3> Cs3<T1, T2, T3> of1(Cs1<? super T1> f) {
        return Cs3.narrow(f.ignoring2Rt());
    }

    public static <T1, T2, T3> Cs3<T1, T2, T3> of2(Cs1<? super T2> f) {
        return Cs3.narrow(f.ignoring1Rt().ignoring1Lt());
    }

    public static <T1, T2, T3> Cs3<T1, T2, T3> of3(Cs1<? super T3> f) {
        return Cs3.narrow(f.ignoring2Lt());
    }

    public static <T1, T2, T3> Cs1<Tuple3<T1, T2, T3>> tuple(Cs3<? super T1, ? super T2, ? super T3> c) {
        return Cs3.of(c).tupled();
    }

    public static <T1, T2, T3> Cs3<T1, T2, T3> detuple(Cs1<? super Tuple3<? extends T1, ? extends T2, ? extends T3>> c) {
        return (t1, t2, t3) -> c.accept(Tuple.of((Object) t1, (Object) t2, (Object) t3));
    }

    public static <T1, T2, T3> Cs3<T1, T2, T3> uncheck(Csc3<? super T1, ? super T2, ? super T3> c) {
        Objects.requireNonNull(c, "c is null");
        return Csc3.narrow(c).unchecked();
    }

    public static <T1, T2, T3> Cs3<T1, T2, T3> ignore2Rt(Cs1<? super T1> c) {
        return Cs1.narrow(c).ignoring2Rt();
    }

    public static <T1, T2, T3> Cs3<T1, T2, T3> ignore2Lt(Cs1<? super T3> c) {
        return Cs1.narrow(c).ignoring2Lt();
    }

    public static <T1, T2, T3> Cs3<T1, T2, T3> ignore1Rt(Cs2<? super T1, ? super T2> c) {
        return Cs2.narrow(c).ignoring1Rt();
    }

    public static <T1, T2, T3> Cs3<T1, T2, T3> ignore1Lt(Cs2<? super T2, ? super T3> c) {
        return Cs2.narrow(c).ignoring1Lt();
    }

    public static <T1, T2, T3, T4> Cs3<T1, T2, T3> passRt(Cs4<? super T1, ? super T2, ? super T3, ? super T4> c, T4 t4) {
        return Cs3.narrow(c.acceptRt(t4));
    }

    public static <T1, T2, T3, T4, T5> Cs3<T1, T2, T3> passRt(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c, T4 t4, T5 t5) {
        return Cs3.narrow(c.acceptRt(t4, t5));
    }

    public static <T1, T2, T3, T4, T5, T6> Cs3<T1, T2, T3> passRt(Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c, T4 t4, T5 t5, T6 t6) {
        return Cs3.narrow(c.acceptRt(t4, t5, t6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Cs3<T1, T2, T3> passRt(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c, T4 t4, T5 t5, T6 t6, T7 t7) {
        return Cs3.narrow(c.acceptRt(t4, t5, t6, t7));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs3<T1, T2, T3> passRt(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Cs3.narrow(c.acceptRt(t4, t5, t6, t7, t8));
    }

    public static <T1, T2, T3, T4> Cs3<T2, T3, T4> passLt(Cs4<? super T1, ? super T2, ? super T3, ? super T4> c, T1 t1) {
        return Cs3.narrow(c.acceptLt(t1));
    }

    public static <T1, T2, T3, T4, T5> Cs3<T3, T4, T5> passLt(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c, T1 t1, T2 t2) {
        return Cs3.narrow(c.acceptLt(t1, t2));
    }

    public static <T1, T2, T3, T4, T5, T6> Cs3<T4, T5, T6> passLt(Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c, T1 t1, T2 t2, T3 t3) {
        return Cs3.narrow(c.acceptLt(t1, t2, t3));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Cs3<T5, T6, T7> passLt(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c, T1 t1, T2 t2, T3 t3, T4 t4) {
        return Cs3.narrow(c.acceptLt(t1, t2, t3, t4));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs3<T6, T7, T8> passLt(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return Cs3.narrow(c.acceptLt(t1, t2, t3, t4, t5));
    }

    public static <T1, T2, T3> void passAndRun(Cs3<? super T1, ? super T2, ? super T3> c, T1 t1, T2 t2, T3 t3) {
        Rn.pass(c, t1, t2, t3).run();
    }

    public static <T1, T2, T3> Cs3<T3, T2, T1> invert(Cs3<? super T1, ? super T2, ? super T3> c) {
        return Cs3.narrow(c).inverted();
    }

    public void accept(T1 var1, T2 var2, T3 var3);

    default public Cs2<T2, T3> acceptLt(T1 t1) {
        return (t2, t3) -> this.accept(t1, t2, t3);
    }

    default public Cs1<T3> acceptLt(T1 t1, T2 t2) {
        return t3 -> this.accept(t1, t2, t3);
    }

    default public Cs2<T1, T2> acceptRt(T3 t3) {
        return (t1, t2) -> this.accept(t1, t2, t3);
    }

    default public Cs1<T1> acceptRt(T2 t2, T3 t3) {
        return t1 -> this.accept(t1, t2, t3);
    }

    default public <R> Fn3<T1, T2, T3, R> toFunction(R r) {
        return (Fn3 & Serializable) (t1, t2, t3) -> {
            this.accept(t1, t2, t3);
            return r;
        };
    }

    default public Pr3<T1, T2, T3> toPredicate(boolean b) {
        return (Pr3<Object, Object, Object> & Serializable) (t1, t2, t3) -> {
            this.accept(t1, t2, t3);
            return b;
        };
    }

    default public Rn toRunnable(T1 t1, T2 t2, T3 t3) {
        return () -> this.accept(t1, t2, t3);
    }

    default public Cs3<T1, T2, T3> afterRun(Rn r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2, t3) -> {
            this.accept(t1, t2, t3);
            r.run();
        };
    }

    default public <R> Cs3<T1, T2, T3> afterApply(Fn0<? super R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.afterApplyTo(f).toConsumer();
    }

    default public <R> Fn3<T1, T2, T3, R> afterApplyTo(Fn0<? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (Fn3 & Serializable) (t1, t2, t3) -> {
            this.accept(t1, t2, t3);
            return f.apply();
        };
    }

    default public Cs3<T1, T2, T3> afterTest(Pr0 p) {
        Objects.requireNonNull(p, "p is null");
        return this.afterTestTo(p).toConsumer();
    }

    default public Pr3<T1, T2, T3> afterTestTo(Pr0 p) {
        Objects.requireNonNull(p, "p is null");
        return (Pr3<Object, Object, Object> & Serializable) (t1, t2, t3) -> {
            this.accept(t1, t2, t3);
            return p.test();
        };
    }

    default public <R> Fn3<T1, T2, T3, R> afterGet(Sp<? extends R> s) {
        return (Fn3 & Serializable) (t1, t2, t3) -> {
            this.accept(t1, t2, t3);
            return s.get();
        };
    }

    default public Cs3<T1, T2, T3> beforeRun(Rn r) {
        return (t1, t2, t3) -> {
            r.run();
            this.accept(t1, t2, t3);
        };
    }

    default public <B1, B2, B3> Cs3<B1, B2, B3> beforeApply(Fn3<? super B1, ? super B2, ? super B3, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        return this.beforeApply3(f);
    }

    default public <B1> Cs1<B1> beforeApply1(Fn1<? super B1, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return b1 -> this.tupled().accept(Tuple.narrow((Tuple3) ((Tuple3) f.apply(b1))));
    }

    default public <B1, B2> Cs2<B1, B2> beforeApply2(Fn2<? super B1, ? super B2, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2) -> this.tupled().accept(Tuple.narrow((Tuple3) ((Tuple3) f.apply(b1, b2))));
    }

    default public <B1, B2, B3> Cs3<B1, B2, B3> beforeApply3(Fn3<? super B1, ? super B2, ? super B3, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3) -> this.tupled().accept(Tuple.narrow((Tuple3) ((Tuple3) f.apply(b1, b2, b3))));
    }

    default public <B1, B2, B3, B4> Cs4<B1, B2, B3, B4> beforeApply4(Fn4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4) -> this.tupled().accept(Tuple.narrow((Tuple3) ((Tuple3) f.apply(b1, b2, b3, b4))));
    }

    default public <B1, B2, B3, B4, B5> Cs5<B1, B2, B3, B4, B5> beforeApply5(Fn5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5) -> this.tupled().accept(Tuple.narrow((Tuple3) ((Tuple3) f.apply(b1, b2, b3, b4, b5))));
    }

    default public <B1, B2, B3, B4, B5, B6> Cs6<B1, B2, B3, B4, B5, B6> beforeApply6(Fn6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6) -> this.tupled().accept(Tuple.narrow((Tuple3) ((Tuple3) f.apply(b1, b2, b3, b4, b5, b6))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Cs7<B1, B2, B3, B4, B5, B6, B7> beforeApply7(Fn7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7) -> this.tupled().accept(Tuple.narrow((Tuple3) ((Tuple3) f.apply(b1, b2, b3, b4, b5, b6, b7))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Cs8<B1, B2, B3, B4, B5, B6, B7, B8> beforeApply8(Fn8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7, b8) -> this.tupled().accept(Tuple.narrow((Tuple3) ((Tuple3) f.apply(b1, b2, b3, b4, b5, b6, b7, b8))));
    }

    default public Cs3<T1, T2, T3> beforeTestOnSuccess(Pr0 p, Cs3<? super T1, ? super T2, ? super T3> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3) -> (p.test() ? this : Cs3.narrow(onFailure)).accept(t1, t2, t3);
    }

    default public Cs3<T1, T2, T3> beforeTestOnSuccess(Pr0 p) {
        return this.beforeTestOnSuccess(p, Cs3.empty());
    }

    default public Cs3<T1, T2, T3> beforeTestOnFailure(Pr0 p, Cs3<? super T1, ? super T2, ? super T3> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Cs3<T1, T2, T3> beforeTestOnFailure(Pr0 p) {
        return this.beforeTestOnFailure(p, Cs3.empty());
    }

    default public Rn beforeGet(Sp<? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> s) {
        Objects.requireNonNull(s, "s is null");
        return () -> this.tupled().accept(Tuple.narrow((Tuple3) ((Tuple3) s.get())));
    }

    default public Cs3<T3, T2, T1> inverted() {
        return (t3, t2, t1) -> this.accept(t1, t2, t3);
    }

    default public <S> Cs3<T1, T2, T3> afterPassingThroughApply(Fn3<? super T1, ? super T2, ? super T3, ? extends S> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3) -> {
            this.accept(t1, t2, t3);
            f.apply(t1, t2, t3);
        };
    }

    default public <S> Fn3<T1, T2, T3, S> afterPassingThroughApplyTo(Fn3<? super T1, ? super T2, ? super T3, ? extends S> f) {
        Objects.requireNonNull(f, "f is null");
        return (Fn3 & Serializable) (t1, t2, t3) -> {
            this.accept(t1, t2, t3);
            return f.apply(t1, t2, t3);
        };
    }

    default public Cs3<T1, T2, T3> afterPassingThroughTest(Pr3<? super T1, ? super T2, ? super T3> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3) -> {
            this.accept(t1, t2, t3);
            p.test(t1, t2, t3);
        };
    }

    default public Pr3<T1, T2, T3> afterPassingThroughTestTo(Pr3<? super T1, ? super T2, ? super T3> p) {
        Objects.requireNonNull(p, "p is null");
        return (Pr3<Object, Object, Object> & Serializable) (t1, t2, t3) -> {
            this.accept(t1, t2, t3);
            return p.test(t1, t2, t3);
        };
    }

    default public Cs3<T1, T2, T3> afterPassingThroughAccept(Cs3<? super T1, ? super T2, ? super T3> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3) -> {
            this.accept(t1, t2, t3);
            c.accept(t1, t2, t3);
        };
    }

    default public <R> Cs3<T1, T2, T3> beforePassingThroughApply(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3) -> {
            f.apply(t1, t2, t3);
            this.accept(t1, t2, t3);
        };
    }

    default public Cs3<T1, T2, T3> beforePassingThroughTest(Pr3<? super T1, ? super T2, ? super T3> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3) -> {
            p.test(t1, t2, t3);
            this.accept(t1, t2, t3);
        };
    }

    default public Cs3<T1, T2, T3> beforePassingThroughAccept(Cs3<? super T1, ? super T2, ? super T3> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3) -> {
            c.accept(t1, t2, t3);
            this.accept(t1, t2, t3);
        };
    }

    default public Cs3<T1, T2, T3> beforeSuccessPassingThroughTest(Pr3<? super T1, ? super T2, ? super T3> p, Cs3<? super T1, ? super T2, ? super T3> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3) -> (p.test(t1, t2, t3) ? this : Cs3.narrow(onFailure)).accept(t1, t2, t3);
    }

    default public Cs3<T1, T2, T3> beforeSuccessPassingThroughTest(Pr3<? super T1, ? super T2, ? super T3> p) {
        return this.beforeSuccessPassingThroughTest(p, Cs3.empty());
    }

    default public Cs3<T1, T2, T3> beforeFailurePassingThroughTest(Pr3<? super T1, ? super T2, ? super T3> p, Cs3<? super T1, ? super T2, ? super T3> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Cs3<T1, T2, T3> beforeFailurePassingThroughTest(Pr3<? super T1, ? super T2, ? super T3> p) {
        return this.beforeFailurePassingThroughTest(p, Cs3.empty());
    }

    default public Cs1<Tuple3<T1, T2, T3>> tupled() {
        return tuple -> this.accept(tuple._1(), tuple._2(), tuple._3());
    }

    default public Fn1<T1, Fn1<T2, Cs1<T3>>> currying() {
        return (Fn1 & Serializable) t1 -> (Fn1 & Serializable) t2 -> t3 -> this.accept(t1, t2, t3);
    }

    default public Csc3<T1, T2, T3> checked() {
        return (arg_0, arg_1, arg_2) -> this.accept(arg_0, arg_1, arg_2);
    }

    default public <I1> Cs4<I1, T1, T2, T3> ignoring1Lt() {
        return (i1, t1, t2, t3) -> this.accept(t1, t2, t3);
    }

    default public <I1> Cs4<T1, T2, T3, I1> ignoring1Rt() {
        return (t1, t2, t3, i1) -> this.accept(t1, t2, t3);
    }

    default public <I1, I2> Cs5<I1, I2, T1, T2, T3> ignoring2Lt() {
        return (i1, i2, t1, t2, t3) -> this.accept(t1, t2, t3);
    }

    default public <I1, I2> Cs5<T1, T2, T3, I1, I2> ignoring2Rt() {
        return (t1, t2, t3, i1, i2) -> this.accept(t1, t2, t3);
    }

    default public <I1, I2, I3> Cs6<I1, I2, I3, T1, T2, T3> ignoring3Lt() {
        return (i1, i2, i3, t1, t2, t3) -> this.accept(t1, t2, t3);
    }

    default public <I1, I2, I3> Cs6<T1, T2, T3, I1, I2, I3> ignoring3Rt() {
        return (t1, t2, t3, i1, i2, i3) -> this.accept(t1, t2, t3);
    }

    default public <I1, I2, I3, I4> Cs7<I1, I2, I3, I4, T1, T2, T3> ignoring4Lt() {
        return (i1, i2, i3, i4, t1, t2, t3) -> this.accept(t1, t2, t3);
    }

    default public <I1, I2, I3, I4> Cs7<T1, T2, T3, I1, I2, I3, I4> ignoring4Rt() {
        return (t1, t2, t3, i1, i2, i3, i4) -> this.accept(t1, t2, t3);
    }

    default public <I1, I2, I3, I4, I5> Cs8<I1, I2, I3, I4, I5, T1, T2, T3> ignoring5Lt() {
        return (i1, i2, i3, i4, i5, t1, t2, t3) -> this.accept(t1, t2, t3);
    }

    default public <I1, I2, I3, I4, I5> Cs8<T1, T2, T3, I1, I2, I3, I4, I5> ignoring5Rt() {
        return (t1, t2, t3, i1, i2, i3, i4, i5) -> this.accept(t1, t2, t3);
    }

}

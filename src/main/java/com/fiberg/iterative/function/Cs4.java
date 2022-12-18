package com.fiberg.iterative.function;

import com.fiberg.iterative.function.Cs1;
import com.fiberg.iterative.function.Cs2;
import com.fiberg.iterative.function.Cs3;
import com.fiberg.iterative.function.Cs5;
import com.fiberg.iterative.function.Cs6;
import com.fiberg.iterative.function.Cs7;
import com.fiberg.iterative.function.Cs8;
import com.fiberg.iterative.function.Csc4;
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
import com.fiberg.iterative.function.Pr4;
import com.fiberg.iterative.function.Rn;
import com.fiberg.iterative.function.Sp;
import io.vavr.Tuple;
import io.vavr.Tuple4;
import java.io.Serializable;
import java.util.Objects;

@FunctionalInterface
public interface Cs4<T1, T2, T3, T4> {

    public static <T1, T2, T3, T4> Cs4<T1, T2, T3, T4> narrow(Cs4<? super T1, ? super T2, ? super T3, ? super T4> c) {
        return c;
    }

    public static <T1, T2, T3, T4> Cs4<T1, T2, T3, T4> empty() {
        return (t1, t2, t3, t4) -> {};
    }

    public static <T1, T2, T3, T4> Cs4<T1, T2, T3, T4> of(Cs4<? super T1, ? super T2, ? super T3, ? super T4> c) {
        return Cs4.narrow(c);
    }

    public static <T1, T2, T3, T4> Cs4<T1, T2, T3, T4> of1(Cs1<? super T1> f) {
        return Cs4.narrow(f.ignoring3Rt());
    }

    public static <T1, T2, T3, T4> Cs4<T1, T2, T3, T4> of2(Cs1<? super T2> f) {
        return Cs4.narrow(f.ignoring2Rt().ignoring1Lt());
    }

    public static <T1, T2, T3, T4> Cs4<T1, T2, T3, T4> of3(Cs1<? super T3> f) {
        return Cs4.narrow(f.ignoring1Rt().ignoring2Lt());
    }

    public static <T1, T2, T3, T4> Cs4<T1, T2, T3, T4> of4(Cs1<? super T4> f) {
        return Cs4.narrow(f.ignoring3Lt());
    }

    public static <T1, T2, T3, T4> Cs1<Tuple4<T1, T2, T3, T4>> tuple(Cs4<? super T1, ? super T2, ? super T3, ? super T4> c) {
        return Cs4.of(c).tupled();
    }

    public static <T1, T2, T3, T4> Cs4<T1, T2, T3, T4> detuple(Cs1<? super Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> c) {
        return (t1, t2, t3, t4) -> c.accept(Tuple.of((Object)t1, (Object)t2, (Object)t3, (Object)t4));
    }

    public static <T1, T2, T3, T4> Cs4<T1, T2, T3, T4> uncheck(Csc4<? super T1, ? super T2, ? super T3, ? super T4> c) {
        Objects.requireNonNull(c, "c is null");
        return Csc4.narrow(c).unchecked();
    }

    public static <T1, T2, T3, T4> Cs4<T1, T2, T3, T4> ignore3Rt(Cs1<? super T1> c) {
        return Cs1.narrow(c).ignoring3Rt();
    }

    public static <T1, T2, T3, T4> Cs4<T1, T2, T3, T4> ignore3Lt(Cs1<? super T4> c) {
        return Cs1.narrow(c).ignoring3Lt();
    }

    public static <T1, T2, T3, T4> Cs4<T1, T2, T3, T4> ignore2Rt(Cs2<? super T1, ? super T2> c) {
        return Cs2.narrow(c).ignoring2Rt();
    }

    public static <T1, T2, T3, T4> Cs4<T1, T2, T3, T4> ignore2Lt(Cs2<? super T3, ? super T4> c) {
        return Cs2.narrow(c).ignoring2Lt();
    }

    public static <T1, T2, T3, T4> Cs4<T1, T2, T3, T4> ignore1Rt(Cs3<? super T1, ? super T2, ? super T3> c) {
        return Cs3.narrow(c).ignoring1Rt();
    }

    public static <T1, T2, T3, T4> Cs4<T1, T2, T3, T4> ignore1Lt(Cs3<? super T2, ? super T3, ? super T4> c) {
        return Cs3.narrow(c).ignoring1Lt();
    }

    public static <T1, T2, T3, T4, T5> Cs4<T1, T2, T3, T4> passRt(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c, T5 t5) {
        return Cs4.narrow(c.acceptRt(t5));
    }

    public static <T1, T2, T3, T4, T5, T6> Cs4<T1, T2, T3, T4> passRt(Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c, T5 t5, T6 t6) {
        return Cs4.narrow(c.acceptRt(t5, t6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Cs4<T1, T2, T3, T4> passRt(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c, T5 t5, T6 t6, T7 t7) {
        return Cs4.narrow(c.acceptRt(t5, t6, t7));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs4<T1, T2, T3, T4> passRt(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Cs4.narrow(c.acceptRt(t5, t6, t7, t8));
    }

    public static <T1, T2, T3, T4, T5> Cs4<T2, T3, T4, T5> passLt(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c, T1 t1) {
        return Cs4.narrow(c.acceptLt(t1));
    }

    public static <T1, T2, T3, T4, T5, T6> Cs4<T3, T4, T5, T6> passLt(Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c, T1 t1, T2 t2) {
        return Cs4.narrow(c.acceptLt(t1, t2));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Cs4<T4, T5, T6, T7> passLt(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c, T1 t1, T2 t2, T3 t3) {
        return Cs4.narrow(c.acceptLt(t1, t2, t3));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs4<T5, T6, T7, T8> passLt(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c, T1 t1, T2 t2, T3 t3, T4 t4) {
        return Cs4.narrow(c.acceptLt(t1, t2, t3, t4));
    }

    public static <T1, T2, T3, T4> void passAndRun(Cs4<? super T1, ? super T2, ? super T3, ? super T4> c, T1 t1, T2 t2, T3 t3, T4 t4) {
        Rn.pass(c, t1, t2, t3, t4).run();
    }

    public static <T1, T2, T3, T4> Cs4<T4, T3, T2, T1> invert(Cs4<? super T1, ? super T2, ? super T3, ? super T4> c) {
        return Cs4.narrow(c).inverted();
    }

    public void accept(T1 var1, T2 var2, T3 var3, T4 var4);

    default public Cs3<T2, T3, T4> acceptLt(T1 t1) {
        return (t2, t3, t4) -> this.accept(t1, t2, t3, t4);
    }

    default public Cs2<T3, T4> acceptLt(T1 t1, T2 t2) {
        return (t3, t4) -> this.accept(t1, t2, t3, t4);
    }

    default public Cs1<T4> acceptLt(T1 t1, T2 t2, T3 t3) {
        return t4 -> this.accept(t1, t2, t3, t4);
    }

    default public Cs3<T1, T2, T3> acceptRt(T4 t4) {
        return (t1, t2, t3) -> this.accept(t1, t2, t3, t4);
    }

    default public Cs2<T1, T2> acceptRt(T3 t3, T4 t4) {
        return (t1, t2) -> this.accept(t1, t2, t3, t4);
    }

    default public Cs1<T1> acceptRt(T2 t2, T3 t3, T4 t4) {
        return t1 -> this.accept(t1, t2, t3, t4);
    }

    default public <R> Fn4<T1, T2, T3, T4, R> toFunction(R r) {
        return (Fn4 & Serializable)(t1, t2, t3, t4) -> {
            this.accept(t1, t2, t3, t4);
            return r;
        };
    }

    default public Pr4<T1, T2, T3, T4> toPredicate(boolean b) {
        return (Pr4<Object, Object, Object, Object> & Serializable)(t1, t2, t3, t4) -> {
            this.accept(t1, t2, t3, t4);
            return b;
        };
    }

    default public Rn toRunnable(T1 t1, T2 t2, T3 t3, T4 t4) {
        return () -> this.accept(t1, t2, t3, t4);
    }

    default public Cs4<T1, T2, T3, T4> afterRun(Rn r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2, t3, t4) -> {
            this.accept(t1, t2, t3, t4);
            r.run();
        };
    }

    default public <R> Cs4<T1, T2, T3, T4> afterApply(Fn0<? super R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.afterApplyTo(f).toConsumer();
    }

    default public <R> Fn4<T1, T2, T3, T4, R> afterApplyTo(Fn0<? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (Fn4 & Serializable)(t1, t2, t3, t4) -> {
            this.accept(t1, t2, t3, t4);
            return f.apply();
        };
    }

    default public Cs4<T1, T2, T3, T4> afterTest(Pr0 p) {
        Objects.requireNonNull(p, "p is null");
        return this.afterTestTo(p).toConsumer();
    }

    default public Pr4<T1, T2, T3, T4> afterTestTo(Pr0 p) {
        Objects.requireNonNull(p, "p is null");
        return (Pr4<Object, Object, Object, Object> & Serializable)(t1, t2, t3, t4) -> {
            this.accept(t1, t2, t3, t4);
            return p.test();
        };
    }

    default public <R> Fn4<T1, T2, T3, T4, R> afterGet(Sp<? extends R> s) {
        return (Fn4 & Serializable)(t1, t2, t3, t4) -> {
            this.accept(t1, t2, t3, t4);
            return s.get();
        };
    }

    default public Cs4<T1, T2, T3, T4> beforeRun(Rn r) {
        return (t1, t2, t3, t4) -> {
            r.run();
            this.accept(t1, t2, t3, t4);
        };
    }

    default public <B1, B2, B3, B4> Cs4<B1, B2, B3, B4> beforeApply(Fn4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        return this.beforeApply4(f);
    }

    default public <B1> Cs1<B1> beforeApply1(Fn1<? super B1, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return b1 -> this.tupled().accept(Tuple.narrow((Tuple4)((Tuple4)f.apply(b1))));
    }

    default public <B1, B2> Cs2<B1, B2> beforeApply2(Fn2<? super B1, ? super B2, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2) -> this.tupled().accept(Tuple.narrow((Tuple4)((Tuple4)f.apply(b1, b2))));
    }

    default public <B1, B2, B3> Cs3<B1, B2, B3> beforeApply3(Fn3<? super B1, ? super B2, ? super B3, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3) -> this.tupled().accept(Tuple.narrow((Tuple4)((Tuple4)f.apply(b1, b2, b3))));
    }

    default public <B1, B2, B3, B4> Cs4<B1, B2, B3, B4> beforeApply4(Fn4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4) -> this.tupled().accept(Tuple.narrow((Tuple4)((Tuple4)f.apply(b1, b2, b3, b4))));
    }

    default public <B1, B2, B3, B4, B5> Cs5<B1, B2, B3, B4, B5> beforeApply5(Fn5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5) -> this.tupled().accept(Tuple.narrow((Tuple4)((Tuple4)f.apply(b1, b2, b3, b4, b5))));
    }

    default public <B1, B2, B3, B4, B5, B6> Cs6<B1, B2, B3, B4, B5, B6> beforeApply6(Fn6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6) -> this.tupled().accept(Tuple.narrow((Tuple4)((Tuple4)f.apply(b1, b2, b3, b4, b5, b6))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Cs7<B1, B2, B3, B4, B5, B6, B7> beforeApply7(Fn7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7) -> this.tupled().accept(Tuple.narrow((Tuple4)((Tuple4)f.apply(b1, b2, b3, b4, b5, b6, b7))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Cs8<B1, B2, B3, B4, B5, B6, B7, B8> beforeApply8(Fn8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7, b8) -> this.tupled().accept(Tuple.narrow((Tuple4)((Tuple4)f.apply(b1, b2, b3, b4, b5, b6, b7, b8))));
    }

    default public Cs4<T1, T2, T3, T4> beforeTestOnSuccess(Pr0 p, Cs4<? super T1, ? super T2, ? super T3, ? super T4> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4) -> (p.test() ? this : Cs4.narrow(onFailure)).accept(t1, t2, t3, t4);
    }

    default public Cs4<T1, T2, T3, T4> beforeTestOnSuccess(Pr0 p) {
        return this.beforeTestOnSuccess(p, Cs4.empty());
    }

    default public Cs4<T1, T2, T3, T4> beforeTestOnFailure(Pr0 p, Cs4<? super T1, ? super T2, ? super T3, ? super T4> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Cs4<T1, T2, T3, T4> beforeTestOnFailure(Pr0 p) {
        return this.beforeTestOnFailure(p, Cs4.empty());
    }

    default public Rn beforeGet(Sp<? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> s) {
        Objects.requireNonNull(s, "s is null");
        return () -> this.tupled().accept(Tuple.narrow((Tuple4)((Tuple4)s.get())));
    }

    default public Cs4<T4, T3, T2, T1> inverted() {
        return (t4, t3, t2, t1) -> this.accept(t1, t2, t3, t4);
    }

    default public <S> Cs4<T1, T2, T3, T4> afterPassingThroughApply(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends S> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4) -> {
            this.accept(t1, t2, t3, t4);
            f.apply(t1, t2, t3, t4);
        };
    }

    default public <S> Fn4<T1, T2, T3, T4, S> afterPassingThroughApplyTo(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends S> f) {
        Objects.requireNonNull(f, "f is null");
        return (Fn4 & Serializable)(t1, t2, t3, t4) -> {
            this.accept(t1, t2, t3, t4);
            return f.apply(t1, t2, t3, t4);
        };
    }

    default public Cs4<T1, T2, T3, T4> afterPassingThroughTest(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4) -> {
            this.accept(t1, t2, t3, t4);
            p.test(t1, t2, t3, t4);
        };
    }

    default public Pr4<T1, T2, T3, T4> afterPassingThroughTestTo(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        Objects.requireNonNull(p, "p is null");
        return (Pr4<Object, Object, Object, Object> & Serializable)(t1, t2, t3, t4) -> {
            this.accept(t1, t2, t3, t4);
            return p.test(t1, t2, t3, t4);
        };
    }

    default public Cs4<T1, T2, T3, T4> afterPassingThroughAccept(Cs4<? super T1, ? super T2, ? super T3, ? super T4> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4) -> {
            this.accept(t1, t2, t3, t4);
            c.accept(t1, t2, t3, t4);
        };
    }

    default public <R> Cs4<T1, T2, T3, T4> beforePassingThroughApply(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4) -> {
            f.apply(t1, t2, t3, t4);
            this.accept(t1, t2, t3, t4);
        };
    }

    default public Cs4<T1, T2, T3, T4> beforePassingThroughTest(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4) -> {
            p.test(t1, t2, t3, t4);
            this.accept(t1, t2, t3, t4);
        };
    }

    default public Cs4<T1, T2, T3, T4> beforePassingThroughAccept(Cs4<? super T1, ? super T2, ? super T3, ? super T4> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4) -> {
            c.accept(t1, t2, t3, t4);
            this.accept(t1, t2, t3, t4);
        };
    }

    default public Cs4<T1, T2, T3, T4> beforeSuccessPassingThroughTest(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p, Cs4<? super T1, ? super T2, ? super T3, ? super T4> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4) -> (p.test(t1, t2, t3, t4) ? this : Cs4.narrow(onFailure)).accept(t1, t2, t3, t4);
    }

    default public Cs4<T1, T2, T3, T4> beforeSuccessPassingThroughTest(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        return this.beforeSuccessPassingThroughTest(p, Cs4.empty());
    }

    default public Cs4<T1, T2, T3, T4> beforeFailurePassingThroughTest(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p, Cs4<? super T1, ? super T2, ? super T3, ? super T4> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Cs4<T1, T2, T3, T4> beforeFailurePassingThroughTest(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        return this.beforeFailurePassingThroughTest(p, Cs4.empty());
    }

    default public Cs1<Tuple4<T1, T2, T3, T4>> tupled() {
        return tuple -> this.accept(tuple._1(), tuple._2(), tuple._3(), tuple._4());
    }

    default public Fn1<T1, Fn1<T2, Fn1<T3, Cs1<T4>>>> currying() {
        return (Fn1 & Serializable)t1 -> (Fn1 & Serializable)t2 -> (Fn1 & Serializable)t3 -> t4 -> this.accept(t1, t2, t3, t4);
    }

    default public Csc4<T1, T2, T3, T4> checked() {
        return (arg_0, arg_1, arg_2, arg_3) -> this.accept(arg_0, arg_1, arg_2, arg_3);
    }

    default public <I1> Cs5<I1, T1, T2, T3, T4> ignoring1Lt() {
        return (i1, t1, t2, t3, t4) -> this.accept(t1, t2, t3, t4);
    }

    default public <I1> Cs5<T1, T2, T3, T4, I1> ignoring1Rt() {
        return (t1, t2, t3, t4, i1) -> this.accept(t1, t2, t3, t4);
    }

    default public <I1, I2> Cs6<I1, I2, T1, T2, T3, T4> ignoring2Lt() {
        return (i1, i2, t1, t2, t3, t4) -> this.accept(t1, t2, t3, t4);
    }

    default public <I1, I2> Cs6<T1, T2, T3, T4, I1, I2> ignoring2Rt() {
        return (t1, t2, t3, t4, i1, i2) -> this.accept(t1, t2, t3, t4);
    }

    default public <I1, I2, I3> Cs7<I1, I2, I3, T1, T2, T3, T4> ignoring3Lt() {
        return (i1, i2, i3, t1, t2, t3, t4) -> this.accept(t1, t2, t3, t4);
    }

    default public <I1, I2, I3> Cs7<T1, T2, T3, T4, I1, I2, I3> ignoring3Rt() {
        return (t1, t2, t3, t4, i1, i2, i3) -> this.accept(t1, t2, t3, t4);
    }

    default public <I1, I2, I3, I4> Cs8<I1, I2, I3, I4, T1, T2, T3, T4> ignoring4Lt() {
        return (i1, i2, i3, i4, t1, t2, t3, t4) -> this.accept(t1, t2, t3, t4);
    }

    default public <I1, I2, I3, I4> Cs8<T1, T2, T3, T4, I1, I2, I3, I4> ignoring4Rt() {
        return (t1, t2, t3, t4, i1, i2, i3, i4) -> this.accept(t1, t2, t3, t4);
    }

}

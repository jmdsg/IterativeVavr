package com.fiberg.iterative.function;

import com.fiberg.iterative.function.Cs2;
import com.fiberg.iterative.function.Cs3;
import com.fiberg.iterative.function.Cs4;
import com.fiberg.iterative.function.Cs5;
import com.fiberg.iterative.function.Cs6;
import com.fiberg.iterative.function.Cs7;
import com.fiberg.iterative.function.Cs8;
import com.fiberg.iterative.function.Csc1;
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
import com.fiberg.iterative.function.Pr1;
import com.fiberg.iterative.function.Rn;
import com.fiberg.iterative.function.Sp;
import io.vavr.Tuple;
import io.vavr.Tuple1;
import java.io.Serializable;
import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
public interface Cs1<T1> extends Consumer<T1> {

    public static <T1> Cs1<T1> narrow(Cs1<? super T1> c) {
        return c;
    }

    public static <T1> Cs1<T1> empty() {
        return t1 -> {};
    }

    public static <T1> Cs1<T1> of(Cs1<? super T1> c) {
        return Cs1.narrow(c);
    }

    public static <T1> Cs1<Tuple1<T1>> tuple(Cs1<? super T1> c) {
        return Cs1.of(c).tupled();
    }

    public static <T1> Cs1<T1> detuple(Cs1<? super Tuple1<? extends T1>> c) {
        return t1 -> c.accept(Tuple.of((Object)t1));
    }

    public static <T1> Cs1<T1> uncheck(Csc1<? super T1> c) {
        Objects.requireNonNull(c, "c is null");
        return Csc1.narrow(c).unchecked();
    }

    default public <V> Fn1<T1, V> andThenApply(Fn0<? extends V> after) {
        Objects.requireNonNull(after, "after is null");
        return (Fn1 & Serializable)t1 -> {
            this.accept(t1);
            return after.apply();
        };
    }

    public static <T1, T2> Cs1<T1> passRt(Cs2<? super T1, ? super T2> c, T2 t2) {
        return Cs1.narrow(c.acceptRt(t2));
    }

    public static <T1, T2, T3> Cs1<T1> passRt(Cs3<? super T1, ? super T2, ? super T3> c, T2 t2, T3 t3) {
        return Cs1.narrow(c.acceptRt(t2, t3));
    }

    public static <T1, T2, T3, T4> Cs1<T1> passRt(Cs4<? super T1, ? super T2, ? super T3, ? super T4> c, T2 t2, T3 t3, T4 t4) {
        return Cs1.narrow(c.acceptRt(t2, t3, t4));
    }

    public static <T1, T2, T3, T4, T5> Cs1<T1> passRt(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c, T2 t2, T3 t3, T4 t4, T5 t5) {
        return Cs1.narrow(c.acceptRt(t2, t3, t4, t5));
    }

    public static <T1, T2, T3, T4, T5, T6> Cs1<T1> passRt(Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return Cs1.narrow(c.acceptRt(t2, t3, t4, t5, t6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Cs1<T1> passRt(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return Cs1.narrow(c.acceptRt(t2, t3, t4, t5, t6, t7));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs1<T1> passRt(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Cs1.narrow(c.acceptRt(t2, t3, t4, t5, t6, t7, t8));
    }

    public static <T1, T2> Cs1<T2> passLt(Cs2<? super T1, ? super T2> c, T1 t1) {
        return Cs1.narrow(c.acceptLt(t1));
    }

    public static <T1, T2, T3> Cs1<T3> passLt(Cs3<? super T1, ? super T2, ? super T3> c, T1 t1, T2 t2) {
        return Cs1.narrow(c.acceptLt(t1, t2));
    }

    public static <T1, T2, T3, T4> Cs1<T4> passLt(Cs4<? super T1, ? super T2, ? super T3, ? super T4> c, T1 t1, T2 t2, T3 t3) {
        return Cs1.narrow(c.acceptLt(t1, t2, t3));
    }

    public static <T1, T2, T3, T4, T5> Cs1<T5> passLt(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c, T1 t1, T2 t2, T3 t3, T4 t4) {
        return Cs1.narrow(c.acceptLt(t1, t2, t3, t4));
    }

    public static <T1, T2, T3, T4, T5, T6> Cs1<T6> passLt(Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return Cs1.narrow(c.acceptLt(t1, t2, t3, t4, t5));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Cs1<T7> passLt(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return Cs1.narrow(c.acceptLt(t1, t2, t3, t4, t5, t6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs1<T8> passLt(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return Cs1.narrow(c.acceptLt(t1, t2, t3, t4, t5, t6, t7));
    }

    public static <T1> void passAndRun(Cs1<? super T1> c, T1 t1) {
        Rn.pass(c, t1).run();
    }

    default public <R> Fn1<T1, R> toFunction(R r) {
        return (Fn1 & Serializable)t1 -> {
            this.accept(t1);
            return r;
        };
    }

    default public Pr1<T1> toPredicate(boolean b) {
        return (Pr1 & Serializable)t1 -> {
            this.accept(t1);
            return b;
        };
    }

    default public Rn toRunnable(T1 t1) {
        return () -> this.accept(t1);
    }

    default public Cs1<T1> afterRun(Rn r) {
        Objects.requireNonNull(r, "r is null");
        return t1 -> {
            this.accept(t1);
            r.run();
        };
    }

    default public <R> Cs1<T1> afterApply(Fn0<? super R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.afterApplyTo(f).toConsumer();
    }

    default public <R> Fn1<T1, R> afterApplyTo(Fn0<? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (Fn1 & Serializable)t1 -> {
            this.accept(t1);
            return f.apply();
        };
    }

    default public Cs1<T1> afterTest(Pr0 p) {
        Objects.requireNonNull(p, "p is null");
        return this.afterTestTo(p).toConsumer();
    }

    default public Pr1<T1> afterTestTo(Pr0 p) {
        Objects.requireNonNull(p, "p is null");
        return (Pr1 & Serializable)t1 -> {
            this.accept(t1);
            return p.test();
        };
    }

    default public <R> Fn1<T1, R> afterGet(Sp<? extends R> s) {
        return (Fn1 & Serializable)t1 -> {
            this.accept(t1);
            return s.get();
        };
    }

    default public Cs1<T1> beforeRun(Rn r) {
        return t1 -> {
            r.run();
            this.accept(t1);
        };
    }

    default public <B1> Cs1<B1> beforeApply(Fn1<? super B1, ? extends T1> f) {
        return this.beforeApply1(f);
    }

    default public <B1> Cs1<B1> beforeApply1(Fn1<? super B1, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return b1 -> this.accept(f.apply(b1));
    }

    default public <B1, B2> Cs2<B1, B2> beforeApply2(Fn2<? super B1, ? super B2, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2) -> this.accept(f.apply(b1, b2));
    }

    default public <B1, B2, B3> Cs3<B1, B2, B3> beforeApply3(Fn3<? super B1, ? super B2, ? super B3, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3) -> this.accept(f.apply(b1, b2, b3));
    }

    default public <B1, B2, B3, B4> Cs4<B1, B2, B3, B4> beforeApply4(Fn4<? super B1, ? super B2, ? super B3, ? super B4, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4) -> this.accept(f.apply(b1, b2, b3, b4));
    }

    default public <B1, B2, B3, B4, B5> Cs5<B1, B2, B3, B4, B5> beforeApply5(Fn5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5) -> this.accept(f.apply(b1, b2, b3, b4, b5));
    }

    default public <B1, B2, B3, B4, B5, B6> Cs6<B1, B2, B3, B4, B5, B6> beforeApply6(Fn6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6) -> this.accept(f.apply(b1, b2, b3, b4, b5, b6));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Cs7<B1, B2, B3, B4, B5, B6, B7> beforeApply7(Fn7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7) -> this.accept(f.apply(b1, b2, b3, b4, b5, b6, b7));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Cs8<B1, B2, B3, B4, B5, B6, B7, B8> beforeApply8(Fn8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7, b8) -> this.accept(f.apply(b1, b2, b3, b4, b5, b6, b7, b8));
    }

    default public Cs1<T1> beforeTestOnSuccess(Pr0 p, Cs1<? super T1> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return t1 -> (p.test() ? this : Cs1.narrow(onFailure)).accept(t1);
    }

    default public Cs1<T1> beforeTestOnSuccess(Pr0 p) {
        return this.beforeTestOnSuccess(p, Cs1.empty());
    }

    default public Cs1<T1> beforeTestOnFailure(Pr0 p, Cs1<? super T1> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Cs1<T1> beforeTestOnFailure(Pr0 p) {
        return this.beforeTestOnFailure(p, Cs1.empty());
    }

    default public Rn beforeGet(Sp<? extends T1> s) {
        Objects.requireNonNull(s, "s is null");
        return () -> this.accept(s.get());
    }

    default public <S> Cs1<T1> afterPassingThroughApply(Fn1<? super T1, ? extends S> f) {
        Objects.requireNonNull(f, "f is null");
        return t1 -> {
            this.accept(t1);
            f.apply(t1);
        };
    }

    default public <S> Fn1<T1, S> afterPassingThroughApplyTo(Fn1<? super T1, ? extends S> f) {
        Objects.requireNonNull(f, "f is null");
        return (Fn1 & Serializable)t1 -> {
            this.accept(t1);
            return f.apply(t1);
        };
    }

    default public Cs1<T1> afterPassingThroughTest(Pr1<? super T1> p) {
        Objects.requireNonNull(p, "p is null");
        return t1 -> {
            this.accept(t1);
            p.test(t1);
        };
    }

    default public Pr1<T1> afterPassingThroughTestTo(Pr1<? super T1> p) {
        Objects.requireNonNull(p, "p is null");
        return (Pr1 & Serializable)t1 -> {
            this.accept(t1);
            return p.test(t1);
        };
    }

    default public Cs1<T1> afterPassingThroughAccept(Cs1<? super T1> c) {
        Objects.requireNonNull(c, "c is null");
        return t1 -> {
            this.accept(t1);
            c.accept(t1);
        };
    }

    default public <R> Cs1<T1> beforePassingThroughApply(Fn1<? super T1, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return t1 -> {
            f.apply(t1);
            this.accept(t1);
        };
    }

    default public Cs1<T1> beforePassingThroughTest(Pr1<? super T1> p) {
        Objects.requireNonNull(p, "p is null");
        return t1 -> {
            p.test(t1);
            this.accept(t1);
        };
    }

    default public Cs1<T1> beforePassingThroughAccept(Cs1<? super T1> c) {
        Objects.requireNonNull(c, "c is null");
        return t1 -> {
            c.accept(t1);
            this.accept(t1);
        };
    }

    default public Cs1<T1> beforeSuccessPassingThroughTest(Pr1<? super T1> p, Cs1<? super T1> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return t1 -> (p.test(t1) ? this : Cs1.narrow(onFailure)).accept(t1);
    }

    default public Cs1<T1> beforeSuccessPassingThroughTest(Pr1<? super T1> p) {
        return this.beforeSuccessPassingThroughTest(p, Cs1.empty());
    }

    default public Cs1<T1> beforeFailurePassingThroughTest(Pr1<? super T1> p, Cs1<? super T1> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Cs1<T1> beforeFailurePassingThroughTest(Pr1<? super T1> p) {
        return this.beforeFailurePassingThroughTest(p, Cs1.empty());
    }

    default public Cs1<T1> passingThroughNull() {
        return t1 -> {
            if (t1 != null) {
                this.accept(t1);
            }

        };
    }

    default public Cs1<Tuple1<T1>> tupled() {
        return tuple -> this.accept(tuple._1());
    }

    default public Cs1<T1> currying() {
        return this;
    }

    default public Csc1<T1> checked() {
        return this::accept;
    }

    default public <I1> Cs2<I1, T1> ignoring1Lt() {
        return (i1, t1) -> this.accept(t1);
    }

    default public <I1> Cs2<T1, I1> ignoring1Rt() {
        return (t1, i1) -> this.accept(t1);
    }

    default public <I1, I2> Cs3<I1, I2, T1> ignoring2Lt() {
        return (i1, i2, t1) -> this.accept(t1);
    }

    default public <I1, I2> Cs3<T1, I1, I2> ignoring2Rt() {
        return (t1, i1, i2) -> this.accept(t1);
    }

    default public <I1, I2, I3> Cs4<I1, I2, I3, T1> ignoring3Lt() {
        return (i1, i2, i3, t1) -> this.accept(t1);
    }

    default public <I1, I2, I3> Cs4<T1, I1, I2, I3> ignoring3Rt() {
        return (t1, i1, i2, i3) -> this.accept(t1);
    }

    default public <I1, I2, I3, I4> Cs5<I1, I2, I3, I4, T1> ignoring4Lt() {
        return (i1, i2, i3, i4, t1) -> this.accept(t1);
    }

    default public <I1, I2, I3, I4> Cs5<T1, I1, I2, I3, I4> ignoring4Rt() {
        return (t1, i1, i2, i3, i4) -> this.accept(t1);
    }

    default public <I1, I2, I3, I4, I5> Cs6<I1, I2, I3, I4, I5, T1> ignoring5Lt() {
        return (i1, i2, i3, i4, i5, t1) -> this.accept(t1);
    }

    default public <I1, I2, I3, I4, I5> Cs6<T1, I1, I2, I3, I4, I5> ignoring5Rt() {
        return (t1, i1, i2, i3, i4, i5) -> this.accept(t1);
    }

    default public <I1, I2, I3, I4, I5, I6> Cs7<I1, I2, I3, I4, I5, I6, T1> ignoring6Lt() {
        return (i1, i2, i3, i4, i5, i6, t1) -> this.accept(t1);
    }

    default public <I1, I2, I3, I4, I5, I6> Cs7<T1, I1, I2, I3, I4, I5, I6> ignoring6Rt() {
        return (t1, i1, i2, i3, i4, i5, i6) -> this.accept(t1);
    }

    default public <I1, I2, I3, I4, I5, I6, I7> Cs8<I1, I2, I3, I4, I5, I6, I7, T1> ignoring7Lt() {
        return (i1, i2, i3, i4, i5, i6, i7, t1) -> this.accept(t1);
    }

    default public <I1, I2, I3, I4, I5, I6, I7> Cs8<T1, I1, I2, I3, I4, I5, I6, I7> ignoring7Rt() {
        return (t1, i1, i2, i3, i4, i5, i6, i7) -> this.accept(t1);
    }

    @Override
    default public Cs1<T1> andThen(Consumer<? super T1> after) {
        Objects.requireNonNull(after);
        return Consumer.super.andThen(after)::accept;
    }

}

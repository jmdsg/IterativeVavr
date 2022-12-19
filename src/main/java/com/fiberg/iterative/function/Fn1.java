package com.fiberg.iterative.function;

import com.fiberg.iterative.core.IterativeInternals;
import com.fiberg.iterative.function.Cs1;
import com.fiberg.iterative.function.Fn0;
import com.fiberg.iterative.function.Fn2;
import com.fiberg.iterative.function.Fn3;
import com.fiberg.iterative.function.Fn4;
import com.fiberg.iterative.function.Fn5;
import com.fiberg.iterative.function.Fn6;
import com.fiberg.iterative.function.Fn7;
import com.fiberg.iterative.function.Fn8;
import com.fiberg.iterative.function.Fnc1;
import com.fiberg.iterative.function.Pr0;
import com.fiberg.iterative.function.Pr1;
import com.fiberg.iterative.function.Rn;
import com.fiberg.iterative.function.Sp;
import com.fiberg.iterative.function.Spc;
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
public interface Fn1<T1, R> extends Function1<T1, R> {

    public static <T1, R> Fn1<T1, R> narrow(Fn1<? super T1, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fn1<T1, R> fn = (Fn1<T1, R>) f;
        return fn;
    }

    public static <T1, R> Fn1<T1, R> empty() {
        return IterativeInternals::none;
    }

    public static <T1, R> Fn1<T1, R> value(R r) {
        return t1 -> r;
    }

    public static <T1> Fn1<T1, T1> identity() {
        return IterativeInternals::identity;
    }

    public static <T1, R> Fn1<T1, R> of(Fn1<? super T1, ? extends R> f) {
        return Fn1.narrow(f);
    }

    public static <T1, R> Fn1<Tuple1<T1>, R> tuple(Fn1<? super T1, ? extends R> f) {
        return Fn1.<T1, R>of(f).tupled();
    }

    public static <T1, R> Fn1<T1, R> detuple(Fn1<? super Tuple1<? extends T1>, ? extends R> f) {
        return t1 -> f.apply(Tuple.of(t1));
    }

    public static <T1, R> Fn1<T1, R> uncheck(Fnc1<? super T1, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fnc1.<T1, R>narrow(f).unchecked();
    }

    public static <T1, R> Fn1<T1, R> ignore(Fn0<? extends R> f) {
        return Fn0.<R>narrow(f).ignoring1();
    }

    public static <T1, R> Fn1<T1, R> passThroughNull(Fn1<? super T1, ? extends R> f) {
        return Fn1.<T1, R>narrow(f).passingThroughNull();
    }

    public static <T1, T2, R> Fn1<T1, R> passRt(Fn2<? super T1, ? super T2, ? extends R> f, T2 t2) {
        return Fn1.narrow(f.applyRt(t2));
    }

    public static <T1, T2, T3, R> Fn1<T1, R> passRt(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f, T2 t2, T3 t3) {
        return Fn1.narrow(f.applyRt(t2, t3));
    }

    public static <T1, T2, T3, T4, R> Fn1<T1, R> passRt(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f, T2 t2, T3 t3, T4 t4) {
        return Fn1.narrow(f.applyRt(t2, t3, t4));
    }

    public static <T1, T2, T3, T4, T5, R> Fn1<T1, R> passRt(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f, T2 t2, T3 t3, T4 t4, T5 t5) {
        return Fn1.narrow(f.applyRt(t2, t3, t4, t5));
    }

    public static <T1, T2, T3, T4, T5, T6, R> Fn1<T1, R> passRt(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return Fn1.narrow(f.applyRt(t2, t3, t4, t5, t6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn1<T1, R> passRt(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return Fn1.narrow(f.applyRt(t2, t3, t4, t5, t6, t7));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn1<T1, R> passRt(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Fn1.narrow(f.applyRt(t2, t3, t4, t5, t6, t7, t8));
    }

    public static <T1, T2, R> Fn1<T2, R> passLt(Fn2<? super T1, ? super T2, ? extends R> f, T1 t1) {
        return Fn1.narrow(f.applyLt(t1));
    }

    public static <T1, T2, T3, R> Fn1<T3, R> passLt(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f, T1 t1, T2 t2) {
        return Fn1.narrow(f.applyLt(t1, t2));
    }

    public static <T1, T2, T3, T4, R> Fn1<T4, R> passLt(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f, T1 t1, T2 t2, T3 t3) {
        return Fn1.narrow(f.applyLt(t1, t2, t3));
    }

    public static <T1, T2, T3, T4, T5, R> Fn1<T5, R> passLt(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4) {
        return Fn1.narrow(f.applyLt(t1, t2, t3, t4));
    }

    public static <T1, T2, T3, T4, T5, T6, R> Fn1<T6, R> passLt(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return Fn1.narrow(f.applyLt(t1, t2, t3, t4, t5));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn1<T7, R> passLt(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return Fn1.narrow(f.applyLt(t1, t2, t3, t4, t5, t6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn1<T8, R> passLt(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return Fn1.narrow(f.applyLt(t1, t2, t3, t4, t5, t6, t7));
    }

    public static <T1, R> R passAndApply(Fn1<? super T1, ? extends R> f, T1 t1) {
        return Fn0.pass(f, t1).apply();
    }

    public static <T1, R> Fn1<T1, Option<R>> lift(Fn1<? super T1, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fn1.<T1, R>liftTry(f).afterApply(Value::toOption);
    }

    public static <T1, R> Fn1<T1, Try<R>> liftTry(Fn1<? super T1, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fn1.<T1, R>narrow(f).beforeWrap(Try::of);
    }

    default public Fn0<R> toFunction(T1 t1) {
        return () -> this.apply(t1);
    }

    default public Rn toRunnable(T1 t1) {
        return this.toFunction(t1).toRunnable();
    }

    default public Cs1<T1> toConsumer() {
        return this::apply;
    }

    default public Sp<R> toSupplier(T1 t1) {
        return this.toFunction(t1).toSupplier();
    }

    default public Fn1<T1, R> afterRun(Rn r) {
        Objects.requireNonNull(r, "r is null");
        return t1 -> {
            R result = this.apply(t1);
            r.run();
            return result;
        };
    }

    default public <V> Fn1<T1, V> afterApply(Fn1<? super R, ? extends V> f) {
        Objects.requireNonNull(f, "f is null");
        return t1 -> f.apply(this.apply(t1));
    }

    default public <V> Fn1<T1, V> afterApply(Fn0<? extends V> f) {
        Objects.requireNonNull(f, "f is null");
        return t1 -> f.ignoring1().apply(this.apply(t1));
    }

    default public <V> Fn1<T1, V> afterGet(Sp<? extends V> s) {
        Objects.requireNonNull(s, "s is null");
        return t1 -> s.ignoring1().apply(this.apply(t1));
    }

    default public Fn1<T1, Boolean> afterTest(Pr1<? super R> p) {
        Objects.requireNonNull(p, "p is null");
        return this.afterTestTo(p).toFunction();
    }

    default public Pr1<T1> afterTestTo(Pr1<? super R> p) {
        Objects.requireNonNull(p, "p is null");
        return t1 -> p.test(this.apply(t1));
    }

    default public Cs1<T1> afterAcceptTo(Cs1<? super R> c) {
        Objects.requireNonNull(c, "c is null");
        return t1 -> c.accept(this.apply(t1));
    }

    default public Fn1<T1, R> afterAccept(Cs1<? super R> c) {
        Objects.requireNonNull(c, "c is null");
        return t1 -> {
            R result = this.apply(t1);
            c.accept(result);
            return result;
        };
    }

    default public <W> Fn1<T1, W> beforeWrap(Fn1<? super Spc<R>, ? extends W> wrap) {
        Objects.requireNonNull(wrap, "wrap is null");
        return t1 -> wrap.apply(this.toSupplier(t1).checked());
    }

    default public Fn1<T1, R> beforeRun(Rn r) {
        Objects.requireNonNull(r, "r is null");
        return t1 -> {
            r.run();
            return this.apply(t1);
        };
    }

    default public <B1> Fn1<B1, R> beforeApply(Fn1<? super B1, ? extends T1> f) {
        return this.beforeApply1(f);
    }

    default public <B1> Fn1<B1, R> beforeApply1(Fn1<? super B1, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return b1 -> this.apply(f.apply(b1));
    }

    default public <B1, B2> Fn2<B1, B2, R> beforeApply2(Fn2<? super B1, ? super B2, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2) -> this.apply(f.apply(b1, b2));
    }

    default public <B1, B2, B3> Fn3<B1, B2, B3, R> beforeApply3(Fn3<? super B1, ? super B2, ? super B3, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3) -> this.apply(f.apply(b1, b2, b3));
    }

    default public <B1, B2, B3, B4> Fn4<B1, B2, B3, B4, R> beforeApply4(Fn4<? super B1, ? super B2, ? super B3, ? super B4, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4) -> this.apply(f.apply(b1, b2, b3, b4));
    }

    default public <B1, B2, B3, B4, B5> Fn5<B1, B2, B3, B4, B5, R> beforeApply5(Fn5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5) -> this.apply(f.apply(b1, b2, b3, b4, b5));
    }

    default public <B1, B2, B3, B4, B5, B6> Fn6<B1, B2, B3, B4, B5, B6, R> beforeApply6(Fn6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6) -> this.apply(f.apply(b1, b2, b3, b4, b5, b6));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Fn7<B1, B2, B3, B4, B5, B6, B7, R> beforeApply7(Fn7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7) -> this.apply(f.apply(b1, b2, b3, b4, b5, b6, b7));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Fn8<B1, B2, B3, B4, B5, B6, B7, B8, R> beforeApply8(Fn8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7, b8) -> this.apply(f.apply(b1, b2, b3, b4, b5, b6, b7, b8));
    }

    default public Fn1<T1, R> beforeTestOnSuccess(Pr0 p, Fn1<? super T1, ? extends R> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return t1 -> p.test() ? this.apply(t1) : onFailure.apply(t1);
    }

    default public Fn1<T1, R> beforeTestOnSuccess(Pr0 p, Sp<? extends R> onFailure) {
        return this.beforeTestOnSuccess(p, onFailure.toFunction().ignoring1());
    }

    default public Fn1<T1, R> beforeTestOnSuccess(Pr0 p, R onFailure) {
        return this.beforeTestOnSuccess(p, Fn1.value(onFailure));
    }

    default public Fn1<T1, R> beforeTestOnSuccess(Pr0 p) {
        return this.beforeTestOnSuccess(p, Fn1.empty());
    }

    default public Fn1<T1, R> beforeTestOnFailure(Pr0 p, Fn1<? super T1, ? extends R> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Fn1<T1, R> beforeTestOnFailure(Pr0 p, Sp<? extends R> onSuccess) {
        return this.beforeTestOnFailure(p, onSuccess.toFunction().ignoring1());
    }

    default public Fn1<T1, R> beforeTestOnFailure(Pr0 p, R onSuccess) {
        return this.beforeTestOnFailure(p, Fn1.value(onSuccess));
    }

    default public Fn1<T1, R> beforeTestOnFailure(Pr0 p) {
        return this.beforeTestOnFailure(p, Fn1.empty());
    }

    default public <B1> Fn1<B1, R> beforeGet(Sp<? extends T1> s) {
        Objects.requireNonNull(s, "s is null");
        return b1 -> this.apply(s.get());
    }

    default public Fn1<T1, Option<R>> lift() {
        return Fn1.lift(this);
    }

    default public Fn1<T1, Try<R>> liftTry() {
        return Fn1.liftTry(this);
    }

    default public <S> Fn1<T1, S> afterPassingThroughApply(Fn1<? super T1, ? extends S> f) {
        Objects.requireNonNull(f, "f is null");
        return t1 -> {
            this.apply(t1);
            return f.apply(t1);
        };
    }

    default public Fn1<T1, R> afterPassingThroughTest(Pr1<? super T1> p) {
        Objects.requireNonNull(p, "p is null");
        return t1 -> {
            R result = this.apply(t1);
            p.test(t1);
            return result;
        };
    }

    default public Pr1<T1> afterPassingThroughTestTo(Pr1<? super T1> p) {
        Objects.requireNonNull(p, "p is null");
        return t1 -> {
            this.apply(t1);
            return p.test(t1);
        };
    }

    default public Fn1<T1, R> afterPassingThroughAccept(Cs1<? super T1> c) {
        Objects.requireNonNull(c, "c is null");
        return t1 -> {
            R result = this.apply(t1);
            c.accept(t1);
            return result;
        };
    }

    default public Cs1<T1> afterPassingThroughAcceptTo(Cs1<? super T1> c) {
        Objects.requireNonNull(c, "c is null");
        return t1 -> {
            this.apply(t1);
            c.accept(t1);
        };
    }

    default public Fn1<T1, R> beforePassingThroughApply(Fn1<? super T1, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return t1 -> {
            f.apply(t1);
            return this.apply(t1);
        };
    }

    default public Fn1<T1, R> beforePassingThroughTest(Pr1<? super T1> p) {
        Objects.requireNonNull(p, "p is null");
        return t1 -> {
            p.test(t1);
            return this.apply(t1);
        };
    }

    default public Fn1<T1, R> beforePassingThroughAccept(Cs1<? super T1> c) {
        Objects.requireNonNull(c, "c is null");
        return t1 -> {
            c.accept(t1);
            return this.apply(t1);
        };
    }

    default public Fn1<T1, R> beforeSuccessPassingThroughTest(Pr1<? super T1> p, Fn1<? super T1, ? extends R> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return t1 -> p.test(t1) ? this.apply(t1) : onFailure.apply(t1);
    }

    default public Fn1<T1, R> beforeSuccessPassingThroughTest(Pr1<? super T1> p, Sp<? extends R> onFailure) {
        return this.beforeSuccessPassingThroughTest(p, onFailure.toFunction().ignoring1());
    }

    default public Fn1<T1, R> beforeSuccessPassingThroughTest(Pr1<? super T1> p, R onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Fn1.value(onFailure));
    }

    default public Fn1<T1, R> beforeSuccessPassingThroughTest(Pr1<? super T1> p) {
        return this.beforeSuccessPassingThroughTest(p, Fn1.empty());
    }

    default public Fn1<T1, R> beforeFailurePassingThroughTest(Pr1<? super T1> p, Fn1<? super T1, ? extends R> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Fn1<T1, R> beforeFailurePassingThroughTest(Pr1<? super T1> p, Sp<? extends R> onSuccess) {
        return this.beforeFailurePassingThroughTest(p, onSuccess.toFunction().ignoring1());
    }

    default public Fn1<T1, R> beforeFailurePassingThroughTest(Pr1<? super T1> p, R onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Fn1.value(onSuccess));
    }

    default public Fn1<T1, R> beforeFailurePassingThroughTest(Pr1<? super T1> p) {
        return this.beforeFailurePassingThroughTest(p, Fn1.empty());
    }

    default public Fn1<T1, R> passingThroughNull() {
        return t1 -> t1 != null ? this.apply(t1) : null;
    }

    default public Fn1<T1, R> passingThroughNull(R r) {
        return t1 -> t1 != null ? this.apply(t1) : r;
    }

    default public Fn1<T1, R> currying() {
        return this;
    }

    default public Fnc1<T1, R> checked() {
        return this::apply;
    }

    default public <I1> Fn2<I1, T1, R> ignoring1Lt() {
        return (i1, t1) -> this.apply(t1);
    }

    default public <I1> Fn2<T1, I1, R> ignoring1Rt() {
        return (t1, i1) -> this.apply(t1);
    }

    default public <I1, I2> Fn3<I1, I2, T1, R> ignoring2Lt() {
        return (i1, i2, t1) -> this.apply(t1);
    }

    default public <I1, I2> Fn3<T1, I1, I2, R> ignoring2Rt() {
        return (t1, i1, i2) -> this.apply(t1);
    }

    default public <I1, I2, I3> Fn4<I1, I2, I3, T1, R> ignoring3Lt() {
        return (i1, i2, i3, t1) -> this.apply(t1);
    }

    default public <I1, I2, I3> Fn4<T1, I1, I2, I3, R> ignoring3Rt() {
        return (t1, i1, i2, i3) -> this.apply(t1);
    }

    default public <I1, I2, I3, I4> Fn5<I1, I2, I3, I4, T1, R> ignoring4Lt() {
        return (i1, i2, i3, i4, t1) -> this.apply(t1);
    }

    default public <I1, I2, I3, I4> Fn5<T1, I1, I2, I3, I4, R> ignoring4Rt() {
        return (t1, i1, i2, i3, i4) -> this.apply(t1);
    }

    default public <I1, I2, I3, I4, I5> Fn6<I1, I2, I3, I4, I5, T1, R> ignoring5Lt() {
        return (i1, i2, i3, i4, i5, t1) -> this.apply(t1);
    }

    default public <I1, I2, I3, I4, I5> Fn6<T1, I1, I2, I3, I4, I5, R> ignoring5Rt() {
        return (t1, i1, i2, i3, i4, i5) -> this.apply(t1);
    }

    default public <I1, I2, I3, I4, I5, I6> Fn7<I1, I2, I3, I4, I5, I6, T1, R> ignoring6Lt() {
        return (i1, i2, i3, i4, i5, i6, t1) -> this.apply(t1);
    }

    default public <I1, I2, I3, I4, I5, I6> Fn7<T1, I1, I2, I3, I4, I5, I6, R> ignoring6Rt() {
        return (t1, i1, i2, i3, i4, i5, i6) -> this.apply(t1);
    }

    default public <I1, I2, I3, I4, I5, I6, I7> Fn8<I1, I2, I3, I4, I5, I6, I7, T1, R> ignoring7Lt() {
        return (i1, i2, i3, i4, i5, i6, i7, t1) -> this.apply(t1);
    }

    default public <I1, I2, I3, I4, I5, I6, I7> Fn8<T1, I1, I2, I3, I4, I5, I6, I7, R> ignoring7Rt() {
        return (t1, i1, i2, i3, i4, i5, i6, i7) -> this.apply(t1);
    }

    default public Fn1<Tuple1<T1>, R> tupled() {
        return Function1.super.tupled()::apply;
    }

    default public Fn1<T1, R> curried() {
        return Function1.super.curried()::apply;
    }

    default public Fn1<T1, R> reversed() {
        return Function1.super.reversed()::apply;
    }

    default public Fn1<T1, R> memoized() {
        return Function1.super.memoized()::apply;
    }

    default public <V> Fn1<T1, V> andThen(Function<? super R, ? extends V> after) {
        return Function1.super.andThen(after)::apply;
    }

    default public <V> Fn1<V, R> compose(Function<? super V, ? extends T1> before) {
        return Function1.super.compose(before)::apply;
    }

}

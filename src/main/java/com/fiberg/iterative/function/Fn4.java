package com.fiberg.iterative.function;

import com.fiberg.iterative.core.IterativeInternals;
import com.fiberg.iterative.function.Cs1;
import com.fiberg.iterative.function.Cs4;
import com.fiberg.iterative.function.Fn0;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fn2;
import com.fiberg.iterative.function.Fn3;
import com.fiberg.iterative.function.Fn5;
import com.fiberg.iterative.function.Fn6;
import com.fiberg.iterative.function.Fn7;
import com.fiberg.iterative.function.Fn8;
import com.fiberg.iterative.function.Fnc4;
import com.fiberg.iterative.function.Pr0;
import com.fiberg.iterative.function.Pr1;
import com.fiberg.iterative.function.Pr4;
import com.fiberg.iterative.function.Rn;
import com.fiberg.iterative.function.Sp;
import com.fiberg.iterative.function.Spc;
import io.vavr.Function1;
import io.vavr.Function2;
import io.vavr.Function3;
import io.vavr.Function4;
import io.vavr.Tuple;
import io.vavr.Tuple4;
import io.vavr.Value;
import io.vavr.control.Option;
import io.vavr.control.Try;
import java.io.Serializable;
import java.util.Objects;
import java.util.function.Function;

@FunctionalInterface
public interface Fn4<T1, T2, T3, T4, R> extends Function4<T1, T2, T3, T4, R> {

    public static <T1, T2, T3, T4, R> Fn4<T1, T2, T3, T4, R> narrow(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fn4<T1, T2, T3, T4, R> fn = (Fn4<T1, T2, T3, T4, R>) f;
        return fn;
    }

    public static <T1, T2, T3, T4, R> Fn4<T1, T2, T3, T4, R> empty() {
        return IterativeInternals::none;
    }

    public static <T1, T2, T3, T4, R> Fn4<T1, T2, T3, T4, R> value(R r) {
        return (t1, t2, t3, t4) -> r;
    }

    public static <T1, T2, T3, T4, R> Fn4<T1, T2, T3, T4, R> of(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
        return Fn4.narrow(f);
    }

    public static <T1, T2, T3, T4, R> Fn4<T1, T2, T3, T4, R> of1(Fn1<? super T1, ? extends R> f) {
        return Fn4.<T1, T2, T3, T4, R>narrow(f.ignoring3Rt());
    }

    public static <T1, T2, T3, T4, R> Fn4<T1, T2, T3, T4, R> of2(Fn1<? super T2, ? extends R> f) {
        return Fn4.<T1, T2, T3, T4, R>narrow(f.ignoring2Rt().ignoring1Lt());
    }

    public static <T1, T2, T3, T4, R> Fn4<T1, T2, T3, T4, R> of3(Fn1<? super T3, ? extends R> f) {
        return Fn4.<T1, T2, T3, T4, R>narrow(f.ignoring1Rt().ignoring2Lt());
    }

    public static <T1, T2, T3, T4, R> Fn4<T1, T2, T3, T4, R> of4(Fn1<? super T4, ? extends R> f) {
        return Fn4.<T1, T2, T3, T4, R>narrow(f.ignoring3Lt());
    }

    public static <T1, T2, T3, T4, R> Fn1<Tuple4<T1, T2, T3, T4>, R> tuple(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
        return Fn4.<T1, T2, T3, T4, R>of(f).tupled();
    }

    public static <T1, T2, T3, T4, R> Fn4<T1, T2, T3, T4, R> detuple(Fn1<? super Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>, ? extends R> f) {
        return (t1, t2, t3, t4) -> f.apply(Tuple.of(t1, t2, t3, t4));
    }

    public static <T1, T2, T3, T4, R> Fn4<T1, T2, T3, T4, R> uncheck(Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fnc4.<T1, T2, T3, T4, R>narrow(f).unchecked();
    }

    public static <T1, T2, T3, T4, R> Fn4<T1, T2, T3, T4, R> ignore(Fn0<? extends R> f) {
        return Fn0.<R>narrow(f).ignoring4();
    }

    public static <T1, T2, T3, T4, R> Fn4<T1, T2, T3, T4, R> ignore3Rt(Fn1<? super T1, ? extends R> f) {
        return Fn1.<T1, R>narrow(f).ignoring3Rt();
    }

    public static <T1, T2, T3, T4, R> Fn4<T1, T2, T3, T4, R> ignore3Lt(Fn1<? super T4, ? extends R> f) {
        return Fn1.<T4, R>narrow(f).ignoring3Lt();
    }

    public static <T1, T2, T3, T4, R> Fn4<T1, T2, T3, T4, R> ignore2Rt(Fn2<? super T1, ? super T2, ? extends R> f) {
        return Fn2.<T1, T2, R>narrow(f).ignoring2Rt();
    }

    public static <T1, T2, T3, T4, R> Fn4<T1, T2, T3, T4, R> ignore2Lt(Fn2<? super T3, ? super T4, ? extends R> f) {
        return Fn2.<T3, T4, R>narrow(f).ignoring2Lt();
    }

    public static <T1, T2, T3, T4, R> Fn4<T1, T2, T3, T4, R> ignore1Rt(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        return Fn3.<T1, T2, T3, R>narrow(f).ignoring1Rt();
    }

    public static <T1, T2, T3, T4, R> Fn4<T1, T2, T3, T4, R> ignore1Lt(Fn3<? super T2, ? super T3, ? super T4, ? extends R> f) {
        return Fn3.<T2, T3, T4, R>narrow(f).ignoring1Lt();
    }

    public static <T1, T2, T3, T4, T5, R> Fn4<T1, T2, T3, T4, R> passRt(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f, T5 t5) {
        return Fn4.narrow(f.applyRt(t5));
    }

    public static <T1, T2, T3, T4, T5, T6, R> Fn4<T1, T2, T3, T4, R> passRt(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f, T5 t5, T6 t6) {
        return Fn4.narrow(f.applyRt(t5, t6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn4<T1, T2, T3, T4, R> passRt(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f, T5 t5, T6 t6, T7 t7) {
        return Fn4.narrow(f.applyRt(t5, t6, t7));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn4<T1, T2, T3, T4, R> passRt(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Fn4.narrow(f.applyRt(t5, t6, t7, t8));
    }

    public static <T1, T2, T3, T4, T5, R> Fn4<T2, T3, T4, T5, R> passLt(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f, T1 t1) {
        return Fn4.narrow(f.applyLt(t1));
    }

    public static <T1, T2, T3, T4, T5, T6, R> Fn4<T3, T4, T5, T6, R> passLt(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f, T1 t1, T2 t2) {
        return Fn4.narrow(f.applyLt(t1, t2));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn4<T4, T5, T6, T7, R> passLt(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f, T1 t1, T2 t2, T3 t3) {
        return Fn4.narrow(f.applyLt(t1, t2, t3));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn4<T5, T6, T7, T8, R> passLt(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4) {
        return Fn4.narrow(f.applyLt(t1, t2, t3, t4));
    }

    public static <T1, T2, T3, T4, R> R passAndApply(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4) {
        return Fn0.pass(f, t1, t2, t3, t4).apply();
    }

    public static <T1, T2, T3, T4, R> Fn4<T1, T2, T3, T4, Option<R>> lift(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fn4.<T1, T2, T3, T4, R>liftTry(f).afterApply(Value::toOption);
    }

    public static <T1, T2, T3, T4, R> Fn4<T1, T2, T3, T4, Try<R>> liftTry(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fn4.<T1, T2, T3, T4, R>narrow(f).beforeWrap(Try::of);
    }

    public static <T1, T2, T3, T4, R> Fn4<T4, T3, T2, T1, R> invert(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
        return Fn4.<T1, T2, T3, T4, R>narrow(f).inverted();
    }

    default public Fn3<T2, T3, T4, R> applyLt(T1 t1) {
        return (t2, t3, t4) -> this.apply(t1, t2, t3, t4);
    }

    default public Fn2<T3, T4, R> applyLt(T1 t1, T2 t2) {
        return (t3, t4) -> this.apply(t1, t2, t3, t4);
    }

    default public Fn1<T4, R> applyLt(T1 t1, T2 t2, T3 t3) {
        return t4 -> this.apply(t1, t2, t3, t4);
    }

    default public Fn3<T1, T2, T3, R> applyRt(T4 t4) {
        return (t1, t2, t3) -> this.apply(t1, t2, t3, t4);
    }

    default public Fn2<T1, T2, R> applyRt(T3 t3, T4 t4) {
        return (t1, t2) -> this.apply(t1, t2, t3, t4);
    }

    default public Fn1<T1, R> applyRt(T2 t2, T3 t3, T4 t4) {
        return t1 -> this.apply(t1, t2, t3, t4);
    }

    default public Fn0<R> toFunction(T1 t1, T2 t2, T3 t3, T4 t4) {
        return () -> this.apply(t1, t2, t3, t4);
    }

    default public Rn toRunnable(T1 t1, T2 t2, T3 t3, T4 t4) {
        return this.toFunction(t1, t2, t3, t4).toRunnable();
    }

    default public Cs4<T1, T2, T3, T4> toConsumer() {
        return this::apply;
    }

    default public Sp<R> toSupplier(T1 t1, T2 t2, T3 t3, T4 t4) {
        return this.toFunction(t1, t2, t3, t4).toSupplier();
    }

    default public Fn4<T1, T2, T3, T4, R> afterRun(Rn r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2, t3, t4) -> {
            R result = this.apply(t1, t2, t3, t4);
            r.run();
            return result;
        };
    }

    default public <V> Fn4<T1, T2, T3, T4, V> afterApply(Fn1<? super R, ? extends V> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4) -> f.apply(this.apply(t1, t2, t3, t4));
    }

    default public <V> Fn4<T1, T2, T3, T4, V> afterApply(Fn0<? extends V> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4) -> f.ignoring1().apply(this.apply(t1, t2, t3, t4));
    }

    default public <V> Fn4<T1, T2, T3, T4, V> afterGet(Sp<? extends V> s) {
        Objects.requireNonNull(s, "s is null");
        return (t1, t2, t3, t4) -> s.ignoring1().apply(this.apply(t1, t2, t3, t4));
    }

    default public Fn4<T1, T2, T3, T4, Boolean> afterTest(Pr1<? super R> p) {
        Objects.requireNonNull(p, "p is null");
        return this.afterTestTo(p).toFunction();
    }

    default public Pr4<T1, T2, T3, T4> afterTestTo(Pr1<? super R> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4) -> p.test(this.apply(t1, t2, t3, t4));
    }

    default public Cs4<T1, T2, T3, T4> afterAcceptTo(Cs1<? super R> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4) -> c.accept(this.apply(t1, t2, t3, t4));
    }

    default public Fn4<T1, T2, T3, T4, R> afterAccept(Cs1<? super R> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4) -> {
            R result = this.apply(t1, t2, t3, t4);
            c.accept(result);
            return result;
        };
    }

    default public <W> Fn4<T1, T2, T3, T4, W> beforeWrap(Fn1<? super Spc<R>, ? extends W> wrap) {
        Objects.requireNonNull(wrap, "wrap is null");
        return (t1, t2, t3, t4) -> wrap.apply(this.toSupplier(t1, t2, t3, t4).checked());
    }

    default public Fn4<T1, T2, T3, T4, R> beforeRun(Rn r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2, t3, t4) -> {
            r.run();
            return this.apply(t1, t2, t3, t4);
        };
    }

    default public <B1, B2, B3, B4> Fn4<B1, B2, B3, B4, R> beforeApply(Fn4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        return this.beforeApply4(f);
    }

    default public <B1> Fn1<B1, R> beforeApply1(Fn1<? super B1, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return b1 -> this.tupled().apply(Tuple.narrow((f.apply(b1))));
    }

    default public <B1, B2> Fn2<B1, B2, R> beforeApply2(Fn2<? super B1, ? super B2, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2))));
    }

    default public <B1, B2, B3> Fn3<B1, B2, B3, R> beforeApply3(Fn3<? super B1, ? super B2, ? super B3, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3))));
    }

    default public <B1, B2, B3, B4> Fn4<B1, B2, B3, B4, R> beforeApply4(Fn4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4))));
    }

    default public <B1, B2, B3, B4, B5> Fn5<B1, B2, B3, B4, B5, R> beforeApply5(Fn5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4, b5))));
    }

    default public <B1, B2, B3, B4, B5, B6> Fn6<B1, B2, B3, B4, B5, B6, R> beforeApply6(Fn6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Fn7<B1, B2, B3, B4, B5, B6, B7, R> beforeApply7(Fn7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Fn8<B1, B2, B3, B4, B5, B6, B7, B8, R> beforeApply8(Fn8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7, b8) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7, b8))));
    }

    default public Fn4<T1, T2, T3, T4, R> beforeTestOnSuccess(Pr0 p, Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4) -> p.test() ? this.apply(t1, t2, t3, t4) : onFailure.apply(t1, t2, t3, t4);
    }

    default public Fn4<T1, T2, T3, T4, R> beforeTestOnSuccess(Pr0 p, Sp<? extends R> onFailure) {
        return this.beforeTestOnSuccess(p, onFailure.toFunction().ignoring4());
    }

    default public Fn4<T1, T2, T3, T4, R> beforeTestOnSuccess(Pr0 p, R onFailure) {
        return this.beforeTestOnSuccess(p, Fn4.value(onFailure));
    }

    default public Fn4<T1, T2, T3, T4, R> beforeTestOnSuccess(Pr0 p) {
        return this.beforeTestOnSuccess(p, Fn4.empty());
    }

    default public Fn4<T1, T2, T3, T4, R> beforeTestOnFailure(Pr0 p, Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Fn4<T1, T2, T3, T4, R> beforeTestOnFailure(Pr0 p, Sp<? extends R> onSuccess) {
        return this.beforeTestOnFailure(p, onSuccess.toFunction().ignoring4());
    }

    default public Fn4<T1, T2, T3, T4, R> beforeTestOnFailure(Pr0 p, R onSuccess) {
        return this.beforeTestOnFailure(p, Fn4.value(onSuccess));
    }

    default public Fn4<T1, T2, T3, T4, R> beforeTestOnFailure(Pr0 p) {
        return this.beforeTestOnFailure(p, Fn4.empty());
    }

    default public Sp<R> beforeGet(Sp<? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> s) {
        Objects.requireNonNull(s, "s is null");
        return () -> this.tupled().apply(Tuple.narrow((s.get())));
    }

    default public Fn4<T1, T2, T3, T4, Option<R>> lift() {
        return Fn4.lift(this);
    }

    default public Fn4<T1, T2, T3, T4, Try<R>> liftTry() {
        return Fn4.liftTry(this);
    }

    default public Fn4<T4, T3, T2, T1, R> inverted() {
        return (t4, t3, t2, t1) -> this.apply(t1, t2, t3, t4);
    }

    default public <S> Fn4<T1, T2, T3, T4, S> afterPassingThroughApply(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends S> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4) -> {
            this.apply(t1, t2, t3, t4);
            return f.apply(t1, t2, t3, t4);
        };
    }

    default public Fn4<T1, T2, T3, T4, R> afterPassingThroughTest(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4) -> {
            R result = this.apply(t1, t2, t3, t4);
            p.test(t1, t2, t3, t4);
            return result;
        };
    }

    default public Pr4<T1, T2, T3, T4> afterPassingThroughTestTo(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4) -> {
            this.apply(t1, t2, t3, t4);
            return p.test(t1, t2, t3, t4);
        };
    }

    default public Fn4<T1, T2, T3, T4, R> afterPassingThroughAccept(Cs4<? super T1, ? super T2, ? super T3, ? super T4> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4) -> {
            R result = this.apply(t1, t2, t3, t4);
            c.accept(t1, t2, t3, t4);
            return result;
        };
    }

    default public Cs4<T1, T2, T3, T4> afterPassingThroughAcceptTo(Cs4<? super T1, ? super T2, ? super T3, ? super T4> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4) -> {
            this.apply(t1, t2, t3, t4);
            c.accept(t1, t2, t3, t4);
        };
    }

    default public Fn4<T1, T2, T3, T4, R> beforePassingThroughApply(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4) -> {
            f.apply(t1, t2, t3, t4);
            return this.apply(t1, t2, t3, t4);
        };
    }

    default public Fn4<T1, T2, T3, T4, R> beforePassingThroughTest(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4) -> {
            p.test(t1, t2, t3, t4);
            return this.apply(t1, t2, t3, t4);
        };
    }

    default public Fn4<T1, T2, T3, T4, R> beforePassingThroughAccept(Cs4<? super T1, ? super T2, ? super T3, ? super T4> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4) -> {
            c.accept(t1, t2, t3, t4);
            return this.apply(t1, t2, t3, t4);
        };
    }

    default public Fn4<T1, T2, T3, T4, R> beforeSuccessPassingThroughTest(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p, Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4) -> p.test(t1, t2, t3, t4) ? this.apply(t1, t2, t3, t4) : onFailure.apply(t1, t2, t3, t4);
    }

    default public Fn4<T1, T2, T3, T4, R> beforeSuccessPassingThroughTest(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p, Sp<? extends R> onFailure) {
        return this.beforeSuccessPassingThroughTest(p, onFailure.toFunction().ignoring4());
    }

    default public Fn4<T1, T2, T3, T4, R> beforeSuccessPassingThroughTest(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p, R onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Fn4.value(onFailure));
    }

    default public Fn4<T1, T2, T3, T4, R> beforeSuccessPassingThroughTest(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        return this.beforeSuccessPassingThroughTest(p, Fn4.empty());
    }

    default public Fn4<T1, T2, T3, T4, R> beforeFailurePassingThroughTest(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p, Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Fn4<T1, T2, T3, T4, R> beforeFailurePassingThroughTest(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p, Sp<? extends R> onSuccess) {
        return this.beforeFailurePassingThroughTest(p, onSuccess.toFunction().ignoring4());
    }

    default public Fn4<T1, T2, T3, T4, R> beforeFailurePassingThroughTest(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p, R onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Fn4.value(onSuccess));
    }

    default public Fn4<T1, T2, T3, T4, R> beforeFailurePassingThroughTest(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        return this.beforeFailurePassingThroughTest(p, Fn4.empty());
    }

    default public Fn1<T1, Fn1<T2, Fn1<T3, Fn1<T4, R>>>> currying() {
        return t1 -> t2 -> t3 -> t4 -> this.apply(t1, t2, t3, t4);
    }

    default public Fnc4<T1, T2, T3, T4, R> checked() {
        return this::apply;
    }

    default public <I1> Fn5<I1, T1, T2, T3, T4, R> ignoring1Lt() {
        return (i1, t1, t2, t3, t4) -> this.apply(t1, t2, t3, t4);
    }

    default public <I1> Fn5<T1, T2, T3, T4, I1, R> ignoring1Rt() {
        return (t1, t2, t3, t4, i1) -> this.apply(t1, t2, t3, t4);
    }

    default public <I1, I2> Fn6<I1, I2, T1, T2, T3, T4, R> ignoring2Lt() {
        return (i1, i2, t1, t2, t3, t4) -> this.apply(t1, t2, t3, t4);
    }

    default public <I1, I2> Fn6<T1, T2, T3, T4, I1, I2, R> ignoring2Rt() {
        return (t1, t2, t3, t4, i1, i2) -> this.apply(t1, t2, t3, t4);
    }

    default public <I1, I2, I3> Fn7<I1, I2, I3, T1, T2, T3, T4, R> ignoring3Lt() {
        return (i1, i2, i3, t1, t2, t3, t4) -> this.apply(t1, t2, t3, t4);
    }

    default public <I1, I2, I3> Fn7<T1, T2, T3, T4, I1, I2, I3, R> ignoring3Rt() {
        return (t1, t2, t3, t4, i1, i2, i3) -> this.apply(t1, t2, t3, t4);
    }

    default public <I1, I2, I3, I4> Fn8<I1, I2, I3, I4, T1, T2, T3, T4, R> ignoring4Lt() {
        return (i1, i2, i3, i4, t1, t2, t3, t4) -> this.apply(t1, t2, t3, t4);
    }

    default public <I1, I2, I3, I4> Fn8<T1, T2, T3, T4, I1, I2, I3, I4, R> ignoring4Rt() {
        return (t1, t2, t3, t4, i1, i2, i3, i4) -> this.apply(t1, t2, t3, t4);
    }

    default public Fn3<T2, T3, T4, R> apply(T1 t1) {
        return Function4.super.apply(t1)::apply;
    }

    default public Fn2<T3, T4, R> apply(T1 t1, T2 t2) {
        return Function4.super.apply(t1, t2)::apply;
    }

    default public Fn1<T4, R> apply(T1 t1, T2 t2, T3 t3) {
        return Function4.super.apply(t1, t2, t3)::apply;
    }

    default public Fn1<Tuple4<T1, T2, T3, T4>, R> tupled() {
        return Function4.super.tupled()::apply;
    }

    default public Fn1<T1, Function1<T2, Function1<T3, Function1<T4, R>>>> curried() {
        return Function4.super.curried()::apply;
    }

    default public Fn4<T4, T3, T2, T1, R> reversed() {
        return Function4.super.reversed()::apply;
    }

    default public Fn4<T1, T2, T3, T4, R> memoized() {
        return Function4.super.memoized()::apply;
    }

    default public <V> Fn4<T1, T2, T3, T4, V> andThen(Function<? super R, ? extends V> after) {
        Objects.requireNonNull(after, "after is null");
        return Function4.super.andThen(after)::apply;
    }

}

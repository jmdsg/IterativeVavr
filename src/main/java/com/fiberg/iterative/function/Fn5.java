package com.fiberg.iterative.function;

import com.fiberg.iterative.core.IterativeInternals;
import io.vavr.*;
import io.vavr.control.Option;
import io.vavr.control.Try;

import java.util.Objects;
import java.util.function.Function;

@FunctionalInterface
public interface Fn5<T1, T2, T3, T4, T5, R> extends Function5<T1, T2, T3, T4, T5, R> {

    public static <T1, T2, T3, T4, T5, R> Fn5<T1, T2, T3, T4, T5, R> narrow(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fn5<T1, T2, T3, T4, T5, R> fn = (Fn5<T1, T2, T3, T4, T5, R>) f;
        return fn;
    }

    public static <T1, T2, T3, T4, T5, R> Fn5<T1, T2, T3, T4, T5, R> empty() {
        return IterativeInternals::none;
    }

    public static <T1, T2, T3, T4, T5, R> Fn5<T1, T2, T3, T4, T5, R> value(R r) {
        return (t1, t2, t3, t4, t5) -> r;
    }

    public static <T1, T2, T3, T4, T5, R> Fn5<T1, T2, T3, T4, T5, R> of(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        return Fn5.narrow(f);
    }

    public static <T1, T2, T3, T4, T5, R> Fn5<T1, T2, T3, T4, T5, R> of1(Fn1<? super T1, ? extends R> f) {
        return Fn5.<T1, T2, T3, T4, T5, R>narrow(f.ignoring4Rt());
    }

    public static <T1, T2, T3, T4, T5, R> Fn5<T1, T2, T3, T4, T5, R> of2(Fn1<? super T2, ? extends R> f) {
        return Fn5.<T1, T2, T3, T4, T5, R>narrow(f.ignoring3Rt().ignoring1Lt());
    }

    public static <T1, T2, T3, T4, T5, R> Fn5<T1, T2, T3, T4, T5, R> of3(Fn1<? super T3, ? extends R> f) {
        return Fn5.<T1, T2, T3, T4, T5, R>narrow(f.ignoring2Rt().ignoring2Lt());
    }

    public static <T1, T2, T3, T4, T5, R> Fn5<T1, T2, T3, T4, T5, R> of4(Fn1<? super T4, ? extends R> f) {
        return Fn5.<T1, T2, T3, T4, T5, R>narrow(f.ignoring1Rt().ignoring3Lt());
    }

    public static <T1, T2, T3, T4, T5, R> Fn5<T1, T2, T3, T4, T5, R> of5(Fn1<? super T5, ? extends R> f) {
        return Fn5.<T1, T2, T3, T4, T5, R>narrow(f.ignoring4Lt());
    }

    public static <T1, T2, T3, T4, T5, R> Fn1<Tuple5<T1, T2, T3, T4, T5>, R> tuple(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        return Fn5.<T1, T2, T3, T4, T5, R>of(f).tupled();
    }

    public static <T1, T2, T3, T4, T5, R> Fn5<T1, T2, T3, T4, T5, R> detuple(Fn1<? super Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>, ? extends R> f) {
        return (t1, t2, t3, t4, t5) -> f.apply(Tuple.of(t1, t2, t3, t4, t5));
    }

    public static <T1, T2, T3, T4, T5, R> Fn5<T1, T2, T3, T4, T5, R> uncheck(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fnc5.<T1, T2, T3, T4, T5, R>narrow(f).unchecked();
    }

    public static <T1, T2, T3, T4, T5, R> Fn5<T1, T2, T3, T4, T5, R> ignore(Fn0<? extends R> f) {
        return Fn0.<R>narrow(f).ignoring5();
    }

    public static <T1, T2, T3, T4, T5, R> Fn5<T1, T2, T3, T4, T5, R> ignore4Rt(Fn1<? super T1, ? extends R> f) {
        return Fn1.<T1, R>narrow(f).ignoring4Rt();
    }

    public static <T1, T2, T3, T4, T5, R> Fn5<T1, T2, T3, T4, T5, R> ignore4Lt(Fn1<? super T5, ? extends R> f) {
        return Fn1.<T5, R>narrow(f).ignoring4Lt();
    }

    public static <T1, T2, T3, T4, T5, R> Fn5<T1, T2, T3, T4, T5, R> ignore3Rt(Fn2<? super T1, ? super T2, ? extends R> f) {
        return Fn2.<T1, T2, R>narrow(f).ignoring3Rt();
    }

    public static <T1, T2, T3, T4, T5, R> Fn5<T1, T2, T3, T4, T5, R> ignore3Lt(Fn2<? super T4, ? super T5, ? extends R> f) {
        return Fn2.<T4, T5, R>narrow(f).ignoring3Lt();
    }

    public static <T1, T2, T3, T4, T5, R> Fn5<T1, T2, T3, T4, T5, R> ignore2Rt(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        return Fn3.<T1, T2, T3, R>narrow(f).ignoring2Rt();
    }

    public static <T1, T2, T3, T4, T5, R> Fn5<T1, T2, T3, T4, T5, R> ignore2Lt(Fn3<? super T3, ? super T4, ? super T5, ? extends R> f) {
        return Fn3.<T3, T4, T5, R>narrow(f).ignoring2Lt();
    }

    public static <T1, T2, T3, T4, T5, R> Fn5<T1, T2, T3, T4, T5, R> ignore1Rt(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
        return Fn4.<T1, T2, T3, T4, R>narrow(f).ignoring1Rt();
    }

    public static <T1, T2, T3, T4, T5, R> Fn5<T1, T2, T3, T4, T5, R> ignore1Lt(Fn4<? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        return Fn4.<T2, T3, T4, T5, R>narrow(f).ignoring1Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, R> Fn5<T1, T2, T3, T4, T5, R> passRt(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f, T6 t6) {
        return Fn5.narrow(f.applyRt(t6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn5<T1, T2, T3, T4, T5, R> passRt(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f, T6 t6, T7 t7) {
        return Fn5.narrow(f.applyRt(t6, t7));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn5<T1, T2, T3, T4, T5, R> passRt(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f, T6 t6, T7 t7, T8 t8) {
        return Fn5.narrow(f.applyRt(t6, t7, t8));
    }

    public static <T1, T2, T3, T4, T5, T6, R> Fn5<T2, T3, T4, T5, T6, R> passLt(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f, T1 t1) {
        return Fn5.narrow(f.applyLt(t1));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn5<T3, T4, T5, T6, T7, R> passLt(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f, T1 t1, T2 t2) {
        return Fn5.narrow(f.applyLt(t1, t2));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn5<T4, T5, T6, T7, T8, R> passLt(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f, T1 t1, T2 t2, T3 t3) {
        return Fn5.narrow(f.applyLt(t1, t2, t3));
    }

    public static <T1, T2, T3, T4, T5, R> R passAndApply(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return Fn0.pass(f, t1, t2, t3, t4, t5).apply();
    }

    public static <T1, T2, T3, T4, T5, R> Fn5<T1, T2, T3, T4, T5, Option<R>> lift(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fn5.<T1, T2, T3, T4, T5, R>liftTry(f).afterApply(Value::toOption);
    }

    public static <T1, T2, T3, T4, T5, R> Fn5<T1, T2, T3, T4, T5, Try<R>> liftTry(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fn5.<T1, T2, T3, T4, T5, R>narrow(f).beforeWrap(Try::of);
    }

    public static <T1, T2, T3, T4, T5, R> Fn5<T5, T4, T3, T2, T1, R> invert(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        return Fn5.<T1, T2, T3, T4, T5, R>narrow(f).inverted();
    }

    default public Fn4<T2, T3, T4, T5, R> applyLt(T1 t1) {
        return (t2, t3, t4, t5) -> this.apply(t1, t2, t3, t4, t5);
    }

    default public Fn3<T3, T4, T5, R> applyLt(T1 t1, T2 t2) {
        return (t3, t4, t5) -> this.apply(t1, t2, t3, t4, t5);
    }

    default public Fn2<T4, T5, R> applyLt(T1 t1, T2 t2, T3 t3) {
        return (t4, t5) -> this.apply(t1, t2, t3, t4, t5);
    }

    default public Fn1<T5, R> applyLt(T1 t1, T2 t2, T3 t3, T4 t4) {
        return t5 -> this.apply(t1, t2, t3, t4, t5);
    }

    default public Fn4<T1, T2, T3, T4, R> applyRt(T5 t5) {
        return (t1, t2, t3, t4) -> this.apply(t1, t2, t3, t4, t5);
    }

    default public Fn3<T1, T2, T3, R> applyRt(T4 t4, T5 t5) {
        return (t1, t2, t3) -> this.apply(t1, t2, t3, t4, t5);
    }

    default public Fn2<T1, T2, R> applyRt(T3 t3, T4 t4, T5 t5) {
        return (t1, t2) -> this.apply(t1, t2, t3, t4, t5);
    }

    default public Fn1<T1, R> applyRt(T2 t2, T3 t3, T4 t4, T5 t5) {
        return t1 -> this.apply(t1, t2, t3, t4, t5);
    }

    default public Fn0<R> toFunction(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return () -> this.apply(t1, t2, t3, t4, t5);
    }

    default public Rn toRunnable(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return this.toFunction(t1, t2, t3, t4, t5).toRunnable();
    }

    default public Cs5<T1, T2, T3, T4, T5> toConsumer() {
        return this::apply;
    }

    default public Sp<R> toSupplier(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return this.toFunction(t1, t2, t3, t4, t5).toSupplier();
    }

    default public Fn5<T1, T2, T3, T4, T5, R> afterRun(Rn r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2, t3, t4, t5) -> {
            R result = this.apply(t1, t2, t3, t4, t5);
            r.run();
            return result;
        };
    }

    default public <V> Fn5<T1, T2, T3, T4, T5, V> afterApply(Fn1<? super R, ? extends V> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5) -> f.apply(this.apply(t1, t2, t3, t4, t5));
    }

    default public <V> Fn5<T1, T2, T3, T4, T5, V> afterApply(Fn0<? extends V> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5) -> f.ignoring1().apply(this.apply(t1, t2, t3, t4, t5));
    }

    default public <V> Fn5<T1, T2, T3, T4, T5, V> afterGet(Sp<? extends V> s) {
        Objects.requireNonNull(s, "s is null");
        return (t1, t2, t3, t4, t5) -> s.ignoring1().apply(this.apply(t1, t2, t3, t4, t5));
    }

    default public Fn5<T1, T2, T3, T4, T5, Boolean> afterTest(Pr1<? super R> p) {
        Objects.requireNonNull(p, "p is null");
        return this.afterTestTo(p).toFunction();
    }

    default public Pr5<T1, T2, T3, T4, T5> afterTestTo(Pr1<? super R> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5) -> p.test(this.apply(t1, t2, t3, t4, t5));
    }

    default public Cs5<T1, T2, T3, T4, T5> afterAcceptTo(Cs1<? super R> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5) -> c.accept(this.apply(t1, t2, t3, t4, t5));
    }

    default public Fn5<T1, T2, T3, T4, T5, R> afterAccept(Cs1<? super R> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5) -> {
            R result = this.apply(t1, t2, t3, t4, t5);
            c.accept(result);
            return result;
        };
    }

    default public <W> Fn5<T1, T2, T3, T4, T5, W> beforeWrap(Fn1<? super Spc<R>, ? extends W> wrap) {
        Objects.requireNonNull(wrap, "wrap is null");
        return (t1, t2, t3, t4, t5) -> wrap.apply(this.toSupplier(t1, t2, t3, t4, t5).checked());
    }

    default public Fn5<T1, T2, T3, T4, T5, R> beforeRun(Rn r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2, t3, t4, t5) -> {
            r.run();
            return this.apply(t1, t2, t3, t4, t5);
        };
    }

    default public <B1, B2, B3, B4, B5> Fn5<B1, B2, B3, B4, B5, R> beforeApply(Fn5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        return this.beforeApply5(f);
    }

    default public <B1> Fn1<B1, R> beforeApply1(Fn1<? super B1, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return b1 -> this.tupled().apply(Tuple.narrow((f.apply(b1))));
    }

    default public <B1, B2> Fn2<B1, B2, R> beforeApply2(Fn2<? super B1, ? super B2, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2))));
    }

    default public <B1, B2, B3> Fn3<B1, B2, B3, R> beforeApply3(Fn3<? super B1, ? super B2, ? super B3, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3))));
    }

    default public <B1, B2, B3, B4> Fn4<B1, B2, B3, B4, R> beforeApply4(Fn4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4))));
    }

    default public <B1, B2, B3, B4, B5> Fn5<B1, B2, B3, B4, B5, R> beforeApply5(Fn5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4, b5))));
    }

    default public <B1, B2, B3, B4, B5, B6> Fn6<B1, B2, B3, B4, B5, B6, R> beforeApply6(Fn6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Fn7<B1, B2, B3, B4, B5, B6, B7, R> beforeApply7(Fn7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Fn8<B1, B2, B3, B4, B5, B6, B7, B8, R> beforeApply8(Fn8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7, b8) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7, b8))));
    }

    default public Fn5<T1, T2, T3, T4, T5, R> beforeTestOnSuccess(Pr0 p, Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5) -> p.test() ? this.apply(t1, t2, t3, t4, t5) : onFailure.apply(t1, t2, t3, t4, t5);
    }

    default public Fn5<T1, T2, T3, T4, T5, R> beforeTestOnSuccess(Pr0 p, Sp<? extends R> onFailure) {
        return this.beforeTestOnSuccess(p, onFailure.toFunction().ignoring5());
    }

    default public Fn5<T1, T2, T3, T4, T5, R> beforeTestOnSuccess(Pr0 p, R onFailure) {
        return this.beforeTestOnSuccess(p, Fn5.value(onFailure));
    }

    default public Fn5<T1, T2, T3, T4, T5, R> beforeTestOnSuccess(Pr0 p) {
        return this.beforeTestOnSuccess(p, Fn5.empty());
    }

    default public Fn5<T1, T2, T3, T4, T5, R> beforeTestOnFailure(Pr0 p, Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Fn5<T1, T2, T3, T4, T5, R> beforeTestOnFailure(Pr0 p, Sp<? extends R> onSuccess) {
        return this.beforeTestOnFailure(p, onSuccess.toFunction().ignoring5());
    }

    default public Fn5<T1, T2, T3, T4, T5, R> beforeTestOnFailure(Pr0 p, R onSuccess) {
        return this.beforeTestOnFailure(p, Fn5.value(onSuccess));
    }

    default public Fn5<T1, T2, T3, T4, T5, R> beforeTestOnFailure(Pr0 p) {
        return this.beforeTestOnFailure(p, Fn5.empty());
    }

    default public Sp<R> beforeGet(Sp<? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> s) {
        Objects.requireNonNull(s, "s is null");
        return () -> this.tupled().apply(Tuple.narrow((s.get())));
    }

    default public Fn5<T1, T2, T3, T4, T5, Option<R>> lift() {
        return Fn5.lift(this);
    }

    default public Fn5<T1, T2, T3, T4, T5, Try<R>> liftTry() {
        return Fn5.liftTry(this);
    }

    default public Fn5<T5, T4, T3, T2, T1, R> inverted() {
        return (t5, t4, t3, t2, t1) -> this.apply(t1, t2, t3, t4, t5);
    }

    default public <S> Fn5<T1, T2, T3, T4, T5, S> afterPassingThroughApply(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends S> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5) -> {
            this.apply(t1, t2, t3, t4, t5);
            return f.apply(t1, t2, t3, t4, t5);
        };
    }

    default public Fn5<T1, T2, T3, T4, T5, R> afterPassingThroughTest(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5) -> {
            R result = this.apply(t1, t2, t3, t4, t5);
            p.test(t1, t2, t3, t4, t5);
            return result;
        };
    }

    default public Pr5<T1, T2, T3, T4, T5> afterPassingThroughTestTo(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5) -> {
            this.apply(t1, t2, t3, t4, t5);
            return p.test(t1, t2, t3, t4, t5);
        };
    }

    default public Fn5<T1, T2, T3, T4, T5, R> afterPassingThroughAccept(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5) -> {
            R result = this.apply(t1, t2, t3, t4, t5);
            c.accept(t1, t2, t3, t4, t5);
            return result;
        };
    }

    default public Cs5<T1, T2, T3, T4, T5> afterPassingThroughAcceptTo(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5) -> {
            this.apply(t1, t2, t3, t4, t5);
            c.accept(t1, t2, t3, t4, t5);
        };
    }

    default public Fn5<T1, T2, T3, T4, T5, R> beforePassingThroughApply(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5) -> {
            f.apply(t1, t2, t3, t4, t5);
            return this.apply(t1, t2, t3, t4, t5);
        };
    }

    default public Fn5<T1, T2, T3, T4, T5, R> beforePassingThroughTest(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5) -> {
            p.test(t1, t2, t3, t4, t5);
            return this.apply(t1, t2, t3, t4, t5);
        };
    }

    default public Fn5<T1, T2, T3, T4, T5, R> beforePassingThroughAccept(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5) -> {
            c.accept(t1, t2, t3, t4, t5);
            return this.apply(t1, t2, t3, t4, t5);
        };
    }

    default public Fn5<T1, T2, T3, T4, T5, R> beforeSuccessPassingThroughTest(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5) -> p.test(t1, t2, t3, t4, t5) ? this.apply(t1, t2, t3, t4, t5) : onFailure.apply(t1, t2, t3, t4, t5);
    }

    default public Fn5<T1, T2, T3, T4, T5, R> beforeSuccessPassingThroughTest(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, Sp<? extends R> onFailure) {
        return this.beforeSuccessPassingThroughTest(p, onFailure.toFunction().ignoring5());
    }

    default public Fn5<T1, T2, T3, T4, T5, R> beforeSuccessPassingThroughTest(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, R onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Fn5.value(onFailure));
    }

    default public Fn5<T1, T2, T3, T4, T5, R> beforeSuccessPassingThroughTest(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return this.beforeSuccessPassingThroughTest(p, Fn5.empty());
    }

    default public Fn5<T1, T2, T3, T4, T5, R> beforeFailurePassingThroughTest(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Fn5<T1, T2, T3, T4, T5, R> beforeFailurePassingThroughTest(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, Sp<? extends R> onSuccess) {
        return this.beforeFailurePassingThroughTest(p, onSuccess.toFunction().ignoring5());
    }

    default public Fn5<T1, T2, T3, T4, T5, R> beforeFailurePassingThroughTest(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, R onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Fn5.value(onSuccess));
    }

    default public Fn5<T1, T2, T3, T4, T5, R> beforeFailurePassingThroughTest(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return this.beforeFailurePassingThroughTest(p, Fn5.empty());
    }

    default public Fn1<T1, Fn1<T2, Fn1<T3, Fn1<T4, Fn1<T5, R>>>>> currying() {
        return t1 -> t2 -> t3 -> t4 -> t5 -> this.apply(t1, t2, t3, t4, t5);
    }

    default public Fnc5<T1, T2, T3, T4, T5, R> checked() {
        return this::apply;
    }

    default public <I1> Fn6<I1, T1, T2, T3, T4, T5, R> ignoring1Lt() {
        return (i1, t1, t2, t3, t4, t5) -> this.apply(t1, t2, t3, t4, t5);
    }

    default public <I1> Fn6<T1, T2, T3, T4, T5, I1, R> ignoring1Rt() {
        return (t1, t2, t3, t4, t5, i1) -> this.apply(t1, t2, t3, t4, t5);
    }

    default public <I1, I2> Fn7<I1, I2, T1, T2, T3, T4, T5, R> ignoring2Lt() {
        return (i1, i2, t1, t2, t3, t4, t5) -> this.apply(t1, t2, t3, t4, t5);
    }

    default public <I1, I2> Fn7<T1, T2, T3, T4, T5, I1, I2, R> ignoring2Rt() {
        return (t1, t2, t3, t4, t5, i1, i2) -> this.apply(t1, t2, t3, t4, t5);
    }

    default public <I1, I2, I3> Fn8<I1, I2, I3, T1, T2, T3, T4, T5, R> ignoring3Lt() {
        return (i1, i2, i3, t1, t2, t3, t4, t5) -> this.apply(t1, t2, t3, t4, t5);
    }

    default public <I1, I2, I3> Fn8<T1, T2, T3, T4, T5, I1, I2, I3, R> ignoring3Rt() {
        return (t1, t2, t3, t4, t5, i1, i2, i3) -> this.apply(t1, t2, t3, t4, t5);
    }

    default public Fn1<Tuple5<T1, T2, T3, T4, T5>, R> tupled() {
        return Function5.super.tupled()::apply;
    }

    default public Fn4<T2, T3, T4, T5, R> apply(T1 t1) {
        return Function5.super.apply(t1)::apply;
    }

    default public Fn3<T3, T4, T5, R> apply(T1 t1, T2 t2) {
        return Function5.super.apply(t1, t2)::apply;
    }

    default public Fn2<T4, T5, R> apply(T1 t1, T2 t2, T3 t3) {
        return Function5.super.apply(t1, t2, t3)::apply;
    }

    default public Fn1<T5, R> apply(T1 t1, T2 t2, T3 t3, T4 t4) {
        return Function5.super.apply(t1, t2, t3, t4)::apply;
    }

    default public Fn1<T1, Function1<T2, Function1<T3, Function1<T4, Function1<T5, R>>>>> curried() {
        return Function5.super.curried()::apply;
    }

    default public Fn5<T5, T4, T3, T2, T1, R> reversed() {
        return Function5.super.reversed()::apply;
    }

    default public Fn5<T1, T2, T3, T4, T5, R> memoized() {
        return Function5.super.memoized()::apply;
    }

    default public <V> Fn5<T1, T2, T3, T4, T5, V> andThen(Function<? super R, ? extends V> after) {
        return Function5.super.andThen(after)::apply;
    }

}

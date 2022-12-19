package com.fiberg.iterative.function;

import com.fiberg.iterative.core.IterativeInternals;
import io.vavr.*;
import io.vavr.control.Option;
import io.vavr.control.Try;

import java.util.Objects;
import java.util.function.Function;

@FunctionalInterface
public interface Fnc4<T1, T2, T3, T4, R> extends CheckedFunction4<T1, T2, T3, T4, R> {

    public static <T1, T2, T3, T4, R> Fnc4<T1, T2, T3, T4, R> narrow(Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fnc4<T1, T2, T3, T4, R> fnc = (Fnc4<T1, T2, T3, T4, R>) f;
        return fnc;
    }

    public static <T1, T2, T3, T4, R> Fnc4<T1, T2, T3, T4, R> empty() {
        return IterativeInternals::none;
    }

    public static <T1, T2, T3, T4, R> Fnc4<T1, T2, T3, T4, R> value(R r) {
        return (t1, t2, t3, t4) -> r;
    }

    public static <T1, T2, T3, T4, R> Fnc4<T1, T2, T3, T4, R> of(Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
        return Fnc4.narrow(f);
    }

    public static <T1, T2, T3, T4, R> Fnc4<T1, T2, T3, T4, R> of1(Fnc1<? super T1, ? extends R> f) {
        return Fnc4.<T1, T2, T3, T4, R>narrow(f.ignoring3Rt());
    }

    public static <T1, T2, T3, T4, R> Fnc4<T1, T2, T3, T4, R> of2(Fnc1<? super T2, ? extends R> f) {
        return Fnc4.<T1, T2, T3, T4, R>narrow(f.ignoring2Rt().ignoring1Lt());
    }

    public static <T1, T2, T3, T4, R> Fnc4<T1, T2, T3, T4, R> of3(Fnc1<? super T3, ? extends R> f) {
        return Fnc4.<T1, T2, T3, T4, R>narrow(f.ignoring1Rt().ignoring2Lt());
    }

    public static <T1, T2, T3, T4, R> Fnc4<T1, T2, T3, T4, R> of4(Fnc1<? super T4, ? extends R> f) {
        return Fnc4.<T1, T2, T3, T4, R>narrow(f.ignoring3Lt());
    }

    public static <T1, T2, T3, T4, R> Fnc1<Tuple4<T1, T2, T3, T4>, R> tuple(Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
        return Fnc4.<T1, T2, T3, T4, R>of(f).tupled();
    }

    public static <T1, T2, T3, T4, R> Fnc4<T1, T2, T3, T4, R> detuple(Fnc1<? super Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>, ? extends R> f) {
        return (t1, t2, t3, t4) -> f.apply(Tuple.of(t1, t2, t3, t4));
    }

    public static <T1, T2, T3, T4, R> Fnc4<T1, T2, T3, T4, R> check(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fn4.<T1, T2, T3, T4, R>narrow(f).checked();
    }

    public static <T1, T2, T3, T4, R> Fnc4<T1, T2, T3, T4, R> ignore(Fnc0<? extends R> f) {
        return Fnc0.<R>narrow(f).ignoring4();
    }

    public static <T1, T2, T3, T4, R> Fnc4<T1, T2, T3, T4, R> ignore3Rt(Fnc1<? super T1, ? extends R> f) {
        return Fnc1.<T1, R>narrow(f).ignoring3Rt();
    }

    public static <T1, T2, T3, T4, R> Fnc4<T1, T2, T3, T4, R> ignore3Lt(Fnc1<? super T4, ? extends R> f) {
        return Fnc1.<T4, R>narrow(f).ignoring3Lt();
    }

    public static <T1, T2, T3, T4, R> Fnc4<T1, T2, T3, T4, R> ignore2Rt(Fnc2<? super T1, ? super T2, ? extends R> f) {
        return Fnc2.<T1, T2, R>narrow(f).ignoring2Rt();
    }

    public static <T1, T2, T3, T4, R> Fnc4<T1, T2, T3, T4, R> ignore2Lt(Fnc2<? super T3, ? super T4, ? extends R> f) {
        return Fnc2.<T3, T4, R>narrow(f).ignoring2Lt();
    }

    public static <T1, T2, T3, T4, R> Fnc4<T1, T2, T3, T4, R> ignore1Rt(Fnc3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        return Fnc3.<T1, T2, T3, R>narrow(f).ignoring1Rt();
    }

    public static <T1, T2, T3, T4, R> Fnc4<T1, T2, T3, T4, R> ignore1Lt(Fnc3<? super T2, ? super T3, ? super T4, ? extends R> f) {
        return Fnc3.<T2, T3, T4, R>narrow(f).ignoring1Lt();
    }

    public static <T1, T2, T3, T4, T5, R> Fnc4<T1, T2, T3, T4, R> passRt(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f, T5 t5) {
        return Fnc4.narrow(f.applyRt(t5));
    }

    public static <T1, T2, T3, T4, T5, T6, R> Fnc4<T1, T2, T3, T4, R> passRt(Fnc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f, T5 t5, T6 t6) {
        return Fnc4.narrow(f.applyRt(t5, t6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fnc4<T1, T2, T3, T4, R> passRt(Fnc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f, T5 t5, T6 t6, T7 t7) {
        return Fnc4.narrow(f.applyRt(t5, t6, t7));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc4<T1, T2, T3, T4, R> passRt(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Fnc4.narrow(f.applyRt(t5, t6, t7, t8));
    }

    public static <T1, T2, T3, T4, T5, R> Fnc4<T2, T3, T4, T5, R> passLt(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f, T1 t1) {
        return Fnc4.narrow(f.applyLt(t1));
    }

    public static <T1, T2, T3, T4, T5, T6, R> Fnc4<T3, T4, T5, T6, R> passLt(Fnc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f, T1 t1, T2 t2) {
        return Fnc4.narrow(f.applyLt(t1, t2));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fnc4<T4, T5, T6, T7, R> passLt(Fnc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f, T1 t1, T2 t2, T3 t3) {
        return Fnc4.narrow(f.applyLt(t1, t2, t3));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc4<T5, T6, T7, T8, R> passLt(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4) {
        return Fnc4.narrow(f.applyLt(t1, t2, t3, t4));
    }

    public static <T1, T2, T3, T4, R> Fn4<T1, T2, T3, T4, Option<R>> lift(Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fnc4.<T1, T2, T3, T4, R>liftTry(f).afterApply(Value::toOption);
    }

    public static <T1, T2, T3, T4, R> Fn4<T1, T2, T3, T4, Try<R>> liftTry(Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fnc4.<T1, T2, T3, T4, R>narrow(f).beforeWrap(Try::of);
    }

    public static <T1, T2, T3, T4, R> Fnc4<T4, T3, T2, T1, R> invert(Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
        return Fnc4.<T1, T2, T3, T4, R>narrow(f).inverted();
    }

    default public Fnc3<T2, T3, T4, R> applyLt(T1 t1) {
        return (t2, t3, t4) -> this.apply(t1, t2, t3, t4);
    }

    default public Fnc2<T3, T4, R> applyLt(T1 t1, T2 t2) {
        return (t3, t4) -> this.apply(t1, t2, t3, t4);
    }

    default public Fnc1<T4, R> applyLt(T1 t1, T2 t2, T3 t3) {
        return t4 -> this.apply(t1, t2, t3, t4);
    }

    default public Fnc3<T1, T2, T3, R> applyRt(T4 t4) {
        return (t1, t2, t3) -> this.apply(t1, t2, t3, t4);
    }

    default public Fnc2<T1, T2, R> applyRt(T3 t3, T4 t4) {
        return (t1, t2) -> this.apply(t1, t2, t3, t4);
    }

    default public Fnc1<T1, R> applyRt(T2 t2, T3 t3, T4 t4) {
        return t1 -> this.apply(t1, t2, t3, t4);
    }

    default public Fnc0<R> toFunction(T1 t1, T2 t2, T3 t3, T4 t4) {
        return () -> this.apply(t1, t2, t3, t4);
    }

    default public Rnc toRunnable(T1 t1, T2 t2, T3 t3, T4 t4) {
        return this.toFunction(t1, t2, t3, t4).toRunnable();
    }

    default public Csc4<T1, T2, T3, T4> toConsumer() {
        return this::apply;
    }

    default public Spc<R> toSupplier(T1 t1, T2 t2, T3 t3, T4 t4) {
        return this.toFunction(t1, t2, t3, t4).toSupplier();
    }

    default public Fnc4<T1, T2, T3, T4, R> afterRun(Rnc r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2, t3, t4) -> {
            R result = this.apply(t1, t2, t3, t4);
            r.run();
            return result;
        };
    }

    default public <V> Fnc4<T1, T2, T3, T4, V> afterApply(Fnc1<? super R, ? extends V> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4) -> f.apply(this.apply(t1, t2, t3, t4));
    }

    default public <V> Fnc4<T1, T2, T3, T4, V> afterApply(Fnc0<? extends V> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4) -> f.ignoring1().apply(this.apply(t1, t2, t3, t4));
    }

    default public <V> Fnc4<T1, T2, T3, T4, V> afterGet(Spc<? extends V> s) {
        Objects.requireNonNull(s, "s is null");
        return (t1, t2, t3, t4) -> s.ignoring1().apply(this.apply(t1, t2, t3, t4));
    }

    default public Fnc4<T1, T2, T3, T4, Boolean> afterTest(Prc1<? super R> p) {
        Objects.requireNonNull(p, "p is null");
        return this.afterTestTo(p).toFunction();
    }

    default public Prc4<T1, T2, T3, T4> afterTestTo(Prc1<? super R> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4) -> p.test(this.apply(t1, t2, t3, t4));
    }

    default public Csc4<T1, T2, T3, T4> afterAcceptTo(Csc1<? super R> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4) -> c.accept(this.apply(t1, t2, t3, t4));
    }

    default public Fnc4<T1, T2, T3, T4, R> afterAccept(Csc1<? super R> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4) -> {
            R result = this.apply(t1, t2, t3, t4);
            c.accept(result);
            return result;
        };
    }

    default public <W> Fn4<T1, T2, T3, T4, W> beforeWrap(Fn1<? super Spc<R>, ? extends W> wrap) {
        Objects.requireNonNull(wrap, "wrap is null");
        return (t1, t2, t3, t4) -> wrap.apply(this.toSupplier(t1, t2, t3, t4));
    }

    default public Fnc4<T1, T2, T3, T4, R> beforeRun(Rnc r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2, t3, t4) -> {
            r.run();
            return this.apply(t1, t2, t3, t4);
        };
    }

    default public <B1, B2, B3, B4> Fnc4<B1, B2, B3, B4, R> beforeApply(Fnc4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        return this.beforeApply4(f);
    }

    default public <B1> Fnc1<B1, R> beforeApply1(Fnc1<? super B1, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return b1 -> this.tupled().apply(Tuple.narrow((f.apply(b1))));
    }

    default public <B1, B2> Fnc2<B1, B2, R> beforeApply2(Fnc2<? super B1, ? super B2, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2))));
    }

    default public <B1, B2, B3> Fnc3<B1, B2, B3, R> beforeApply3(Fnc3<? super B1, ? super B2, ? super B3, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3))));
    }

    default public <B1, B2, B3, B4> Fnc4<B1, B2, B3, B4, R> beforeApply4(Fnc4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4))));
    }

    default public <B1, B2, B3, B4, B5> Fnc5<B1, B2, B3, B4, B5, R> beforeApply5(Fnc5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4, b5))));
    }

    default public <B1, B2, B3, B4, B5, B6> Fnc6<B1, B2, B3, B4, B5, B6, R> beforeApply6(Fnc6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Fnc7<B1, B2, B3, B4, B5, B6, B7, R> beforeApply7(Fnc7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Fnc8<B1, B2, B3, B4, B5, B6, B7, B8, R> beforeApply8(Fnc8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7, b8) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7, b8))));
    }

    default public Fnc4<T1, T2, T3, T4, R> beforeTestOnSuccess(Prc0 p, Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4) -> p.test() ? this.apply(t1, t2, t3, t4) : onFailure.apply(t1, t2, t3, t4);
    }

    default public Fnc4<T1, T2, T3, T4, R> beforeTestOnSuccess(Prc0 p, Spc<? extends R> onFailure) {
        return this.beforeTestOnSuccess(p, onFailure.toFunction().ignoring4());
    }

    default public Fnc4<T1, T2, T3, T4, R> beforeTestOnSuccess(Prc0 p, R onFailure) {
        return this.beforeTestOnSuccess(p, Fnc4.value(onFailure));
    }

    default public Fnc4<T1, T2, T3, T4, R> beforeTestOnSuccess(Prc0 p) {
        return this.beforeTestOnSuccess(p, Fnc4.empty());
    }

    default public Fnc4<T1, T2, T3, T4, R> beforeTestOnFailure(Prc0 p, Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Fnc4<T1, T2, T3, T4, R> beforeTestOnFailure(Prc0 p, Spc<? extends R> onSuccess) {
        return this.beforeTestOnFailure(p, onSuccess.toFunction().ignoring4());
    }

    default public Fnc4<T1, T2, T3, T4, R> beforeTestOnFailure(Prc0 p, R onSuccess) {
        return this.beforeTestOnFailure(p, Fnc4.value(onSuccess));
    }

    default public Fnc4<T1, T2, T3, T4, R> beforeTestOnFailure(Prc0 p) {
        return this.beforeTestOnFailure(p, Fnc4.empty());
    }

    default public Spc<R> beforeGet(Spc<? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> s) {
        Objects.requireNonNull(s, "s is null");
        return () -> this.tupled().apply(Tuple.narrow((s.get())));
    }

    default public Fn4<T1, T2, T3, T4, Option<R>> lift() {
        return Fnc4.lift(this);
    }

    default public Fn4<T1, T2, T3, T4, Try<R>> liftTry() {
        return Fnc4.liftTry(this);
    }

    default public Fnc4<T4, T3, T2, T1, R> inverted() {
        return (t4, t3, t2, t1) -> this.apply(t1, t2, t3, t4);
    }

    default public <S> Fnc4<T1, T2, T3, T4, S> afterPassingThroughApply(Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends S> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4) -> {
            this.apply(t1, t2, t3, t4);
            return f.apply(t1, t2, t3, t4);
        };
    }

    default public Fnc4<T1, T2, T3, T4, R> afterPassingThroughTest(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4) -> {
            R result = this.apply(t1, t2, t3, t4);
            p.test(t1, t2, t3, t4);
            return result;
        };
    }

    default public Prc4<T1, T2, T3, T4> afterPassingThroughTestTo(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4) -> {
            this.apply(t1, t2, t3, t4);
            return p.test(t1, t2, t3, t4);
        };
    }

    default public Fnc4<T1, T2, T3, T4, R> afterPassingThroughAccept(Csc4<? super T1, ? super T2, ? super T3, ? super T4> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4) -> {
            R result = this.apply(t1, t2, t3, t4);
            c.accept(t1, t2, t3, t4);
            return result;
        };
    }

    default public Csc4<T1, T2, T3, T4> afterPassingThroughAcceptTo(Csc4<? super T1, ? super T2, ? super T3, ? super T4> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4) -> {
            this.apply(t1, t2, t3, t4);
            c.accept(t1, t2, t3, t4);
        };
    }

    default public Fnc4<T1, T2, T3, T4, R> beforePassingThroughApply(Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4) -> {
            f.apply(t1, t2, t3, t4);
            return this.apply(t1, t2, t3, t4);
        };
    }

    default public Fnc4<T1, T2, T3, T4, R> beforePassingThroughTest(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4) -> {
            p.test(t1, t2, t3, t4);
            return this.apply(t1, t2, t3, t4);
        };
    }

    default public Fnc4<T1, T2, T3, T4, R> beforePassingThroughAccept(Csc4<? super T1, ? super T2, ? super T3, ? super T4> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4) -> {
            c.accept(t1, t2, t3, t4);
            return this.apply(t1, t2, t3, t4);
        };
    }

    default public Fnc4<T1, T2, T3, T4, R> beforeSuccessPassingThroughTest(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p, Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4) -> p.test(t1, t2, t3, t4) ? this.apply(t1, t2, t3, t4) : onFailure.apply(t1, t2, t3, t4);
    }

    default public Fnc4<T1, T2, T3, T4, R> beforeSuccessPassingThroughTest(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p, Spc<? extends R> onFailure) {
        return this.beforeSuccessPassingThroughTest(p, onFailure.toFunction().ignoring4());
    }

    default public Fnc4<T1, T2, T3, T4, R> beforeSuccessPassingThroughTest(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p, R onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Fnc4.value(onFailure));
    }

    default public Fnc4<T1, T2, T3, T4, R> beforeSuccessPassingThroughTest(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        return this.beforeSuccessPassingThroughTest(p, Fnc4.empty());
    }

    default public Fnc4<T1, T2, T3, T4, R> beforeFailurePassingThroughTest(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p, Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Fnc4<T1, T2, T3, T4, R> beforeFailurePassingThroughTest(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p, Spc<? extends R> onSuccess) {
        return this.beforeFailurePassingThroughTest(p, onSuccess.toFunction().ignoring4());
    }

    default public Fnc4<T1, T2, T3, T4, R> beforeFailurePassingThroughTest(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p, R onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Fnc4.value(onSuccess));
    }

    default public Fnc4<T1, T2, T3, T4, R> beforeFailurePassingThroughTest(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        return this.beforeFailurePassingThroughTest(p, Fnc4.empty());
    }

    default public Fnc1<T1, Fnc1<T2, Fnc1<T3, Fnc1<T4, R>>>> currying() {
        return t1 -> t2 -> t3 -> t4 -> this.apply(t1, t2, t3, t4);
    }

    default public Fn4<T1, T2, T3, T4, R> unchecked() {
        return CheckedFunction4.super.unchecked()::apply;
    }

    default public <I1> Fnc5<I1, T1, T2, T3, T4, R> ignoring1Lt() {
        return (i1, t1, t2, t3, t4) -> this.apply(t1, t2, t3, t4);
    }

    default public <I1> Fnc5<T1, T2, T3, T4, I1, R> ignoring1Rt() {
        return (t1, t2, t3, t4, i1) -> this.apply(t1, t2, t3, t4);
    }

    default public <I1, I2> Fnc6<I1, I2, T1, T2, T3, T4, R> ignoring2Lt() {
        return (i1, i2, t1, t2, t3, t4) -> this.apply(t1, t2, t3, t4);
    }

    default public <I1, I2> Fnc6<T1, T2, T3, T4, I1, I2, R> ignoring2Rt() {
        return (t1, t2, t3, t4, i1, i2) -> this.apply(t1, t2, t3, t4);
    }

    default public <I1, I2, I3> Fnc7<I1, I2, I3, T1, T2, T3, T4, R> ignoring3Lt() {
        return (i1, i2, i3, t1, t2, t3, t4) -> this.apply(t1, t2, t3, t4);
    }

    default public <I1, I2, I3> Fnc7<T1, T2, T3, T4, I1, I2, I3, R> ignoring3Rt() {
        return (t1, t2, t3, t4, i1, i2, i3) -> this.apply(t1, t2, t3, t4);
    }

    default public <I1, I2, I3, I4> Fnc8<I1, I2, I3, I4, T1, T2, T3, T4, R> ignoring4Lt() {
        return (i1, i2, i3, i4, t1, t2, t3, t4) -> this.apply(t1, t2, t3, t4);
    }

    default public <I1, I2, I3, I4> Fnc8<T1, T2, T3, T4, I1, I2, I3, I4, R> ignoring4Rt() {
        return (t1, t2, t3, t4, i1, i2, i3, i4) -> this.apply(t1, t2, t3, t4);
    }

    default public Fnc3<T2, T3, T4, R> apply(T1 t1) {
        return CheckedFunction4.super.apply(t1)::apply;
    }

    default public Fnc2<T3, T4, R> apply(T1 t1, T2 t2) {
        return CheckedFunction4.super.apply(t1, t2)::apply;
    }

    default public Fnc1<T4, R> apply(T1 t1, T2 t2, T3 t3) {
        return CheckedFunction4.super.apply(t1, t2, t3)::apply;
    }

    default public Fnc1<Tuple4<T1, T2, T3, T4>, R> tupled() {
        return CheckedFunction4.super.tupled()::apply;
    }

    default public Fn1<T1, Function1<T2, Function1<T3, CheckedFunction1<T4, R>>>> curried() {
        return CheckedFunction4.super.curried()::apply;
    }

    default public Fnc4<T4, T3, T2, T1, R> reversed() {
        return CheckedFunction4.super.reversed()::apply;
    }

    default public Fnc4<T1, T2, T3, T4, R> memoized() {
        return CheckedFunction4.super.memoized()::apply;
    }

    default public <V> Fnc4<T1, T2, T3, T4, V> andThen(CheckedFunction1<? super R, ? extends V> after) {
        Objects.requireNonNull(after, "after is null");
        return CheckedFunction4.super.andThen(after)::apply;
    }

    default public Fn4<T1, T2, T3, T4, R> recover(Function<? super Throwable, ? extends Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R>> recover) {
        Objects.requireNonNull(recover, "recover is null");
        return CheckedFunction4.super.recover(recover)::apply;
    }

}

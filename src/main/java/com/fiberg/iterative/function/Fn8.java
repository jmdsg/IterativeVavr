package com.fiberg.iterative.function;

import com.fiberg.iterative.core.IterativeInternals;
import io.vavr.*;
import io.vavr.control.Option;
import io.vavr.control.Try;

import java.util.Objects;
import java.util.function.Function;

@FunctionalInterface
public interface Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> extends Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> {

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> narrow(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> fn = (Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R>) f;
        return fn;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> empty() {
        return IterativeInternals::none;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> value(R r) {
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> r;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> of(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        return Fn8.narrow(f);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> of1(Fn1<? super T1, ? extends R> f) {
        return Fn8.<T1, T2, T3, T4, T5, T6, T7, T8, R>narrow(f.ignoring7Rt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> of2(Fn1<? super T2, ? extends R> f) {
        return Fn8.<T1, T2, T3, T4, T5, T6, T7, T8, R>narrow(f.ignoring6Rt().ignoring1Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> of3(Fn1<? super T3, ? extends R> f) {
        return Fn8.<T1, T2, T3, T4, T5, T6, T7, T8, R>narrow(f.ignoring5Rt().ignoring2Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> of4(Fn1<? super T4, ? extends R> f) {
        return Fn8.<T1, T2, T3, T4, T5, T6, T7, T8, R>narrow(f.ignoring4Rt().ignoring3Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> of5(Fn1<? super T5, ? extends R> f) {
        return Fn8.<T1, T2, T3, T4, T5, T6, T7, T8, R>narrow(f.ignoring3Rt().ignoring4Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> of6(Fn1<? super T6, ? extends R> f) {
        return Fn8.<T1, T2, T3, T4, T5, T6, T7, T8, R>narrow(f.ignoring2Rt().ignoring5Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> of7(Fn1<? super T7, ? extends R> f) {
        return Fn8.<T1, T2, T3, T4, T5, T6, T7, T8, R>narrow(f.ignoring1Rt().ignoring6Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> of8(Fn1<? super T8, ? extends R> f) {
        return Fn8.<T1, T2, T3, T4, T5, T6, T7, T8, R>narrow(f.ignoring7Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, R> tuple(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        return Fn8.<T1, T2, T3, T4, T5, T6, T7, T8, R>of(f).tupled();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> detuple(Fn1<? super Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>, ? extends R> f) {
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> f.apply(Tuple.of(t1, t2, t3, t4, t5, t6, t7, t8));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> uncheck(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fnc8.<T1, T2, T3, T4, T5, T6, T7, T8, R>narrow(f).unchecked();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> ignore(Fn0<? extends R> f) {
        return Fn0.<R>narrow(f).ignoring8();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> ignore7Rt(Fn1<? super T1, ? extends R> f) {
        return Fn1.<T1, R>narrow(f).ignoring7Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> ignore7Lt(Fn1<? super T8, ? extends R> f) {
        return Fn1.<T8, R>narrow(f).ignoring7Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> ignore6Rt(Fn2<? super T1, ? super T2, ? extends R> f) {
        return Fn2.<T1, T2, R>narrow(f).ignoring6Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> ignore6Lt(Fn2<? super T7, ? super T8, ? extends R> f) {
        return Fn2.<T7, T8, R>narrow(f).ignoring6Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> ignore5Rt(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        return Fn3.<T1, T2, T3, R>narrow(f).ignoring5Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> ignore5Lt(Fn3<? super T6, ? super T7, ? super T8, ? extends R> f) {
        return Fn3.<T6, T7, T8, R>narrow(f).ignoring5Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> ignore4Rt(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
        return Fn4.<T1, T2, T3, T4, R>narrow(f).ignoring4Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> ignore4Lt(Fn4<? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        return Fn4.<T5, T6, T7, T8, R>narrow(f).ignoring4Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> ignore3Rt(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        return Fn5.<T1, T2, T3, T4, T5, R>narrow(f).ignoring3Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> ignore3Lt(Fn5<? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        return Fn5.<T4, T5, T6, T7, T8, R>narrow(f).ignoring3Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> ignore2Rt(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f) {
        return Fn6.<T1, T2, T3, T4, T5, T6, R>narrow(f).ignoring2Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> ignore2Lt(Fn6<? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        return Fn6.<T3, T4, T5, T6, T7, T8, R>narrow(f).ignoring2Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> ignore1Rt(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
        return Fn7.<T1, T2, T3, T4, T5, T6, T7, R>narrow(f).ignoring1Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> ignore1Lt(Fn7<? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        return Fn7.<T2, T3, T4, T5, T6, T7, T8, R>narrow(f).ignoring1Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> R passAndApply(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Fn0.pass(f, t1, t2, t3, t4, t5, t6, t7, t8).apply();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, Option<R>> lift(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fn8.<T1, T2, T3, T4, T5, T6, T7, T8, R>liftTry(f).afterApply(Value::toOption);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, Try<R>> liftTry(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fn8.<T1, T2, T3, T4, T5, T6, T7, T8, R>narrow(f).beforeWrap(Try::of);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn8<T8, T7, T6, T5, T4, T3, T2, T1, R> invert(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        return Fn8.<T1, T2, T3, T4, T5, T6, T7, T8, R>narrow(f).inverted();
    }

    default public Fn7<T2, T3, T4, T5, T6, T7, T8, R> applyLt(T1 t1) {
        return (t2, t3, t4, t5, t6, t7, t8) -> this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Fn6<T3, T4, T5, T6, T7, T8, R> applyLt(T1 t1, T2 t2) {
        return (t3, t4, t5, t6, t7, t8) -> this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Fn5<T4, T5, T6, T7, T8, R> applyLt(T1 t1, T2 t2, T3 t3) {
        return (t4, t5, t6, t7, t8) -> this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Fn4<T5, T6, T7, T8, R> applyLt(T1 t1, T2 t2, T3 t3, T4 t4) {
        return (t5, t6, t7, t8) -> this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Fn3<T6, T7, T8, R> applyLt(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return (t6, t7, t8) -> this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Fn2<T7, T8, R> applyLt(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return (t7, t8) -> this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Fn1<T8, R> applyLt(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return t8 -> this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Fn7<T1, T2, T3, T4, T5, T6, T7, R> applyRt(T8 t8) {
        return (t1, t2, t3, t4, t5, t6, t7) -> this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Fn6<T1, T2, T3, T4, T5, T6, R> applyRt(T7 t7, T8 t8) {
        return (t1, t2, t3, t4, t5, t6) -> this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Fn5<T1, T2, T3, T4, T5, R> applyRt(T6 t6, T7 t7, T8 t8) {
        return (t1, t2, t3, t4, t5) -> this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Fn4<T1, T2, T3, T4, R> applyRt(T5 t5, T6 t6, T7 t7, T8 t8) {
        return (t1, t2, t3, t4) -> this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Fn3<T1, T2, T3, R> applyRt(T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return (t1, t2, t3) -> this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Fn2<T1, T2, R> applyRt(T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return (t1, t2) -> this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Fn1<T1, R> applyRt(T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return t1 -> this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Fn0<R> toFunction(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return () -> this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Rn toRunnable(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return this.toFunction(t1, t2, t3, t4, t5, t6, t7, t8).toRunnable();
    }

    default public Cs8<T1, T2, T3, T4, T5, T6, T7, T8> toConsumer() {
        return this::apply;
    }

    default public Sp<R> toSupplier(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return this.toFunction(t1, t2, t3, t4, t5, t6, t7, t8).toSupplier();
    }

    default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> afterRun(Rn r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            R result = this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
            r.run();
            return result;
        };
    }

    default public <V> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, V> afterApply(Fn1<? super R, ? extends V> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> f.apply(this.apply(t1, t2, t3, t4, t5, t6, t7, t8));
    }

    default public <V> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, V> afterApply(Fn0<? extends V> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> f.ignoring1().apply(this.apply(t1, t2, t3, t4, t5, t6, t7, t8));
    }

    default public <V> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, V> afterGet(Sp<? extends V> s) {
        Objects.requireNonNull(s, "s is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> s.ignoring1().apply(this.apply(t1, t2, t3, t4, t5, t6, t7, t8));
    }

    default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, Boolean> afterTest(Pr1<? super R> p) {
        Objects.requireNonNull(p, "p is null");
        return this.afterTestTo(p).toFunction();
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterTestTo(Pr1<? super R> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> p.test(this.apply(t1, t2, t3, t4, t5, t6, t7, t8));
    }

    default public Cs8<T1, T2, T3, T4, T5, T6, T7, T8> afterAcceptTo(Cs1<? super R> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> c.accept(this.apply(t1, t2, t3, t4, t5, t6, t7, t8));
    }

    default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> afterAccept(Cs1<? super R> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            R result = this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
            c.accept(result);
            return result;
        };
    }

    default public <W> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, W> beforeWrap(Fn1<? super Spc<R>, ? extends W> wrap) {
        Objects.requireNonNull(wrap, "wrap is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> wrap.apply(this.toSupplier(t1, t2, t3, t4, t5, t6, t7, t8).checked());
    }

    default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforeRun(Rn r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            r.run();
            return this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Fn8<B1, B2, B3, B4, B5, B6, B7, B8, R> beforeApply(Fn8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        return this.beforeApply8(f);
    }

    default public <B1> Fn1<B1, R> beforeApply1(Fn1<? super B1, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return b1 -> this.tupled().apply(Tuple.narrow((f.apply(b1))));
    }

    default public <B1, B2> Fn2<B1, B2, R> beforeApply2(Fn2<? super B1, ? super B2, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2))));
    }

    default public <B1, B2, B3> Fn3<B1, B2, B3, R> beforeApply3(Fn3<? super B1, ? super B2, ? super B3, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3))));
    }

    default public <B1, B2, B3, B4> Fn4<B1, B2, B3, B4, R> beforeApply4(Fn4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4))));
    }

    default public <B1, B2, B3, B4, B5> Fn5<B1, B2, B3, B4, B5, R> beforeApply5(Fn5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4, b5))));
    }

    default public <B1, B2, B3, B4, B5, B6> Fn6<B1, B2, B3, B4, B5, B6, R> beforeApply6(Fn6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Fn7<B1, B2, B3, B4, B5, B6, B7, R> beforeApply7(Fn7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Fn8<B1, B2, B3, B4, B5, B6, B7, B8, R> beforeApply8(Fn8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7, b8) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7, b8))));
    }

    default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforeTestOnSuccess(Pr0 p, Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> p.test() ? this.apply(t1, t2, t3, t4, t5, t6, t7, t8) : onFailure.apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforeTestOnSuccess(Pr0 p, Sp<? extends R> onFailure) {
        return this.beforeTestOnSuccess(p, onFailure.toFunction().ignoring8());
    }

    default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforeTestOnSuccess(Pr0 p, R onFailure) {
        return this.beforeTestOnSuccess(p, Fn8.value(onFailure));
    }

    default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforeTestOnSuccess(Pr0 p) {
        return this.beforeTestOnSuccess(p, Fn8.empty());
    }

    default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforeTestOnFailure(Pr0 p, Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforeTestOnFailure(Pr0 p, Sp<? extends R> onSuccess) {
        return this.beforeTestOnFailure(p, onSuccess.toFunction().ignoring8());
    }

    default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforeTestOnFailure(Pr0 p, R onSuccess) {
        return this.beforeTestOnFailure(p, Fn8.value(onSuccess));
    }

    default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforeTestOnFailure(Pr0 p) {
        return this.beforeTestOnFailure(p, Fn8.empty());
    }

    default public Sp<R> beforeGet(Sp<? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> s) {
        Objects.requireNonNull(s, "s is null");
        return () -> this.tupled().apply(Tuple.narrow((s.get())));
    }

    default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, Option<R>> lift() {
        return Fn8.lift(this);
    }

    default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, Try<R>> liftTry() {
        return Fn8.liftTry(this);
    }

    default public Fn8<T8, T7, T6, T5, T4, T3, T2, T1, R> inverted() {
        return (t8, t7, t6, t5, t4, t3, t2, t1) -> this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public <S> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, S> afterPassingThroughApply(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends S> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
            return f.apply(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> afterPassingThroughTest(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            R result = this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
            p.test(t1, t2, t3, t4, t5, t6, t7, t8);
            return result;
        };
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterPassingThroughTestTo(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
            return p.test(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> afterPassingThroughAccept(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            R result = this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
            c.accept(t1, t2, t3, t4, t5, t6, t7, t8);
            return result;
        };
    }

    default public Cs8<T1, T2, T3, T4, T5, T6, T7, T8> afterPassingThroughAcceptTo(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
            c.accept(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforePassingThroughApply(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            f.apply(t1, t2, t3, t4, t5, t6, t7, t8);
            return this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforePassingThroughTest(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            p.test(t1, t2, t3, t4, t5, t6, t7, t8);
            return this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforePassingThroughAccept(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            c.accept(t1, t2, t3, t4, t5, t6, t7, t8);
            return this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforeSuccessPassingThroughTest(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> p.test(t1, t2, t3, t4, t5, t6, t7, t8) ? this.apply(t1, t2, t3, t4, t5, t6, t7, t8) : onFailure.apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforeSuccessPassingThroughTest(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, Sp<? extends R> onFailure) {
        return this.beforeSuccessPassingThroughTest(p, onFailure.toFunction().ignoring8());
    }

    default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforeSuccessPassingThroughTest(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, R onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Fn8.value(onFailure));
    }

    default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforeSuccessPassingThroughTest(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        return this.beforeSuccessPassingThroughTest(p, Fn8.empty());
    }

    default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforeFailurePassingThroughTest(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforeFailurePassingThroughTest(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, Sp<? extends R> onSuccess) {
        return this.beforeFailurePassingThroughTest(p, onSuccess.toFunction().ignoring8());
    }

    default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforeFailurePassingThroughTest(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, R onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Fn8.value(onSuccess));
    }

    default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforeFailurePassingThroughTest(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        return this.beforeFailurePassingThroughTest(p, Fn8.empty());
    }

    default public Fn1<T1, Fn1<T2, Fn1<T3, Fn1<T4, Fn1<T5, Fn1<T6, Fn1<T7, Fn1<T8, R>>>>>>>> currying() {
        return t1 -> t2 -> t3 -> t4 -> t5 -> t6 -> t7 -> t8 -> this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> checked() {
        return this::apply;
    }

    default public Fn7<T2, T3, T4, T5, T6, T7, T8, R> apply(T1 t1) {
        return Function8.super.apply(t1)::apply;
    }

    default public Fn6<T3, T4, T5, T6, T7, T8, R> apply(T1 t1, T2 t2) {
        return Function8.super.apply(t1, t2)::apply;
    }

    default public Fn5<T4, T5, T6, T7, T8, R> apply(T1 t1, T2 t2, T3 t3) {
        return Function8.super.apply(t1, t2, t3)::apply;
    }

    default public Fn4<T5, T6, T7, T8, R> apply(T1 t1, T2 t2, T3 t3, T4 t4) {
        return Function8.super.apply(t1, t2, t3, t4)::apply;
    }

    default public Fn3<T6, T7, T8, R> apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return Function8.super.apply(t1, t2, t3, t4, t5)::apply;
    }

    default public Fn2<T7, T8, R> apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return Function8.super.apply(t1, t2, t3, t4, t5, t6)::apply;
    }

    default public Fn1<T8, R> apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return Function8.super.apply(t1, t2, t3, t4, t5, t6, t7)::apply;
    }

    default public Fn1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, R> tupled() {
        return Function8.super.tupled()::apply;
    }

    default public Fn1<T1, Function1<T2, Function1<T3, Function1<T4, Function1<T5, Function1<T6, Function1<T7, Function1<T8, R>>>>>>>> curried() {
        return Function8.super.curried()::apply;
    }

    default public Fn8<T8, T7, T6, T5, T4, T3, T2, T1, R> reversed() {
        return Function8.super.reversed()::apply;
    }

    default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> memoized() {
        return Function8.super.memoized()::apply;
    }

    default public <V> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, V> andThen(Function<? super R, ? extends V> after) {
        Objects.requireNonNull(after, "after is null");
        return Function8.super.andThen(after)::apply;
    }

}

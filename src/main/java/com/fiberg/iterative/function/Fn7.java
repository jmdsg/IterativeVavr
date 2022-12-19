package com.fiberg.iterative.function;

import com.fiberg.iterative.core.IterativeInternals;
import com.fiberg.iterative.function.Cs1;
import com.fiberg.iterative.function.Cs7;
import com.fiberg.iterative.function.Fn0;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fn2;
import com.fiberg.iterative.function.Fn3;
import com.fiberg.iterative.function.Fn4;
import com.fiberg.iterative.function.Fn5;
import com.fiberg.iterative.function.Fn6;
import com.fiberg.iterative.function.Fn8;
import com.fiberg.iterative.function.Fnc7;
import com.fiberg.iterative.function.Pr0;
import com.fiberg.iterative.function.Pr1;
import com.fiberg.iterative.function.Pr7;
import com.fiberg.iterative.function.Rn;
import com.fiberg.iterative.function.Sp;
import com.fiberg.iterative.function.Spc;
import io.vavr.Function1;
import io.vavr.Function2;
import io.vavr.Function3;
import io.vavr.Function4;
import io.vavr.Function5;
import io.vavr.Function6;
import io.vavr.Function7;
import io.vavr.Tuple;
import io.vavr.Tuple7;
import io.vavr.Value;
import io.vavr.control.Option;
import io.vavr.control.Try;
import java.io.Serializable;
import java.util.Objects;
import java.util.function.Function;

@FunctionalInterface
public interface Fn7<T1, T2, T3, T4, T5, T6, T7, R> extends Function7<T1, T2, T3, T4, T5, T6, T7, R> {

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn7<T1, T2, T3, T4, T5, T6, T7, R> narrow(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fn7<T1, T2, T3, T4, T5, T6, T7, R> fn = (Fn7<T1, T2, T3, T4, T5, T6, T7, R>) f;
        return fn;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn7<T1, T2, T3, T4, T5, T6, T7, R> empty() {
        return IterativeInternals::none;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn7<T1, T2, T3, T4, T5, T6, T7, R> value(R r) {
        return (t1, t2, t3, t4, t5, t6, t7) -> r;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn7<T1, T2, T3, T4, T5, T6, T7, R> of(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
        return Fn7.narrow(f);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn7<T1, T2, T3, T4, T5, T6, T7, R> of1(Fn1<? super T1, ? extends R> f) {
        return Fn7.<T1, T2, T3, T4, T5, T6, T7, R>narrow(f.ignoring6Rt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn7<T1, T2, T3, T4, T5, T6, T7, R> of2(Fn1<? super T2, ? extends R> f) {
        return Fn7.<T1, T2, T3, T4, T5, T6, T7, R>narrow(f.ignoring5Rt().ignoring1Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn7<T1, T2, T3, T4, T5, T6, T7, R> of3(Fn1<? super T3, ? extends R> f) {
        return Fn7.<T1, T2, T3, T4, T5, T6, T7, R>narrow(f.ignoring4Rt().ignoring2Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn7<T1, T2, T3, T4, T5, T6, T7, R> of4(Fn1<? super T4, ? extends R> f) {
        return Fn7.<T1, T2, T3, T4, T5, T6, T7, R>narrow(f.ignoring3Rt().ignoring3Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn7<T1, T2, T3, T4, T5, T6, T7, R> of5(Fn1<? super T5, ? extends R> f) {
        return Fn7.<T1, T2, T3, T4, T5, T6, T7, R>narrow(f.ignoring2Rt().ignoring4Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn7<T1, T2, T3, T4, T5, T6, T7, R> of6(Fn1<? super T6, ? extends R> f) {
        return Fn7.<T1, T2, T3, T4, T5, T6, T7, R>narrow(f.ignoring1Rt().ignoring5Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn7<T1, T2, T3, T4, T5, T6, T7, R> of7(Fn1<? super T7, ? extends R> f) {
        return Fn7.<T1, T2, T3, T4, T5, T6, T7, R>narrow(f.ignoring6Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn1<Tuple7<T1, T2, T3, T4, T5, T6, T7>, R> tuple(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
        return Fn7.<T1, T2, T3, T4, T5, T6, T7, R>of(f).tupled();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn7<T1, T2, T3, T4, T5, T6, T7, R> detuple(Fn1<? super Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>, ? extends R> f) {
        return (t1, t2, t3, t4, t5, t6, t7) -> f.apply(Tuple.of(t1, t2, t3, t4, t5, t6, t7));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn7<T1, T2, T3, T4, T5, T6, T7, R> uncheck(Fnc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fnc7.<T1, T2, T3, T4, T5, T6, T7, R>narrow(f).unchecked();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn7<T1, T2, T3, T4, T5, T6, T7, R> ignore(Fn0<? extends R> f) {
        return Fn0.<R>narrow(f).ignoring7();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn7<T1, T2, T3, T4, T5, T6, T7, R> ignore6Rt(Fn1<? super T1, ? extends R> f) {
        return Fn1.<T1, R>narrow(f).ignoring6Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn7<T1, T2, T3, T4, T5, T6, T7, R> ignore6Lt(Fn1<? super T7, ? extends R> f) {
        return Fn1.<T7, R>narrow(f).ignoring6Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn7<T1, T2, T3, T4, T5, T6, T7, R> ignore5Rt(Fn2<? super T1, ? super T2, ? extends R> f) {
        return Fn2.<T1, T2, R>narrow(f).ignoring5Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn7<T1, T2, T3, T4, T5, T6, T7, R> ignore5Lt(Fn2<? super T6, ? super T7, ? extends R> f) {
        return Fn2.<T6, T7, R>narrow(f).ignoring5Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn7<T1, T2, T3, T4, T5, T6, T7, R> ignore4Rt(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        return Fn3.<T1, T2, T3, R>narrow(f).ignoring4Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn7<T1, T2, T3, T4, T5, T6, T7, R> ignore4Lt(Fn3<? super T5, ? super T6, ? super T7, ? extends R> f) {
        return Fn3.<T5, T6, T7, R>narrow(f).ignoring4Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn7<T1, T2, T3, T4, T5, T6, T7, R> ignore3Rt(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
        return Fn4.<T1, T2, T3, T4, R>narrow(f).ignoring3Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn7<T1, T2, T3, T4, T5, T6, T7, R> ignore3Lt(Fn4<? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
        return Fn4.<T4, T5, T6, T7, R>narrow(f).ignoring3Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn7<T1, T2, T3, T4, T5, T6, T7, R> ignore2Rt(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        return Fn5.<T1, T2, T3, T4, T5, R>narrow(f).ignoring2Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn7<T1, T2, T3, T4, T5, T6, T7, R> ignore2Lt(Fn5<? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
        return Fn5.<T3, T4, T5, T6, T7, R>narrow(f).ignoring2Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn7<T1, T2, T3, T4, T5, T6, T7, R> ignore1Rt(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f) {
        return Fn6.<T1, T2, T3, T4, T5, T6, R>narrow(f).ignoring1Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn7<T1, T2, T3, T4, T5, T6, T7, R> ignore1Lt(Fn6<? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
        return Fn6.<T2, T3, T4, T5, T6, T7, R>narrow(f).ignoring1Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn7<T1, T2, T3, T4, T5, T6, T7, R> passRt(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f, T8 t8) {
        return Fn7.narrow(f.applyRt(t8));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn7<T2, T3, T4, T5, T6, T7, T8, R> passLt(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f, T1 t1) {
        return Fn7.narrow(f.applyLt(t1));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> R passAndApply(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return Fn0.pass(f, t1, t2, t3, t4, t5, t6, t7).apply();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn7<T1, T2, T3, T4, T5, T6, T7, Option<R>> lift(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fn7.<T1, T2, T3, T4, T5, T6, T7, R>liftTry(f).afterApply(Value::toOption);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn7<T1, T2, T3, T4, T5, T6, T7, Try<R>> liftTry(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fn7.<T1, T2, T3, T4, T5, T6, T7, R>narrow(f).beforeWrap(Try::of);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn7<T7, T6, T5, T4, T3, T2, T1, R> invert(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
        return Fn7.<T1, T2, T3, T4, T5, T6, T7, R>narrow(f).inverted();
    }

    default public Fn6<T2, T3, T4, T5, T6, T7, R> applyLt(T1 t1) {
        return (t2, t3, t4, t5, t6, t7) -> this.apply(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Fn5<T3, T4, T5, T6, T7, R> applyLt(T1 t1, T2 t2) {
        return (t3, t4, t5, t6, t7) -> this.apply(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Fn4<T4, T5, T6, T7, R> applyLt(T1 t1, T2 t2, T3 t3) {
        return (t4, t5, t6, t7) -> this.apply(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Fn3<T5, T6, T7, R> applyLt(T1 t1, T2 t2, T3 t3, T4 t4) {
        return (t5, t6, t7) -> this.apply(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Fn2<T6, T7, R> applyLt(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return (t6, t7) -> this.apply(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Fn1<T7, R> applyLt(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return t7 -> this.apply(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Fn6<T1, T2, T3, T4, T5, T6, R> applyRt(T7 t7) {
        return (t1, t2, t3, t4, t5, t6) -> this.apply(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Fn5<T1, T2, T3, T4, T5, R> applyRt(T6 t6, T7 t7) {
        return (t1, t2, t3, t4, t5) -> this.apply(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Fn4<T1, T2, T3, T4, R> applyRt(T5 t5, T6 t6, T7 t7) {
        return (t1, t2, t3, t4) -> this.apply(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Fn3<T1, T2, T3, R> applyRt(T4 t4, T5 t5, T6 t6, T7 t7) {
        return (t1, t2, t3) -> this.apply(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Fn2<T1, T2, R> applyRt(T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return (t1, t2) -> this.apply(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Fn1<T1, R> applyRt(T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return t1 -> this.apply(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Fn0<R> toFunction(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return () -> this.apply(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Rn toRunnable(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return this.toFunction(t1, t2, t3, t4, t5, t6, t7).toRunnable();
    }

    default public Cs7<T1, T2, T3, T4, T5, T6, T7> toConsumer() {
        return this::apply;
    }

    default public Sp<R> toSupplier(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return this.toFunction(t1, t2, t3, t4, t5, t6, t7).toSupplier();
    }

    default public Fn7<T1, T2, T3, T4, T5, T6, T7, R> afterRun(Rn r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> {
            R result = this.apply(t1, t2, t3, t4, t5, t6, t7);
            r.run();
            return result;
        };
    }

    default public <V> Fn7<T1, T2, T3, T4, T5, T6, T7, V> afterApply(Fn1<? super R, ? extends V> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> f.apply(this.apply(t1, t2, t3, t4, t5, t6, t7));
    }

    default public <V> Fn7<T1, T2, T3, T4, T5, T6, T7, V> afterApply(Fn0<? extends V> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> f.ignoring1().apply(this.apply(t1, t2, t3, t4, t5, t6, t7));
    }

    default public <V> Fn7<T1, T2, T3, T4, T5, T6, T7, V> afterGet(Sp<? extends V> s) {
        Objects.requireNonNull(s, "s is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> s.ignoring1().apply(this.apply(t1, t2, t3, t4, t5, t6, t7));
    }

    default public Fn7<T1, T2, T3, T4, T5, T6, T7, Boolean> afterTest(Pr1<? super R> p) {
        Objects.requireNonNull(p, "p is null");
        return this.afterTestTo(p).toFunction();
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> afterTestTo(Pr1<? super R> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> p.test(this.apply(t1, t2, t3, t4, t5, t6, t7));
    }

    default public Cs7<T1, T2, T3, T4, T5, T6, T7> afterAcceptTo(Cs1<? super R> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> c.accept(this.apply(t1, t2, t3, t4, t5, t6, t7));
    }

    default public Fn7<T1, T2, T3, T4, T5, T6, T7, R> afterAccept(Cs1<? super R> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> {
            R result = this.apply(t1, t2, t3, t4, t5, t6, t7);
            c.accept(result);
            return result;
        };
    }

    default public <W> Fn7<T1, T2, T3, T4, T5, T6, T7, W> beforeWrap(Fn1<? super Spc<R>, ? extends W> wrap) {
        Objects.requireNonNull(wrap, "wrap is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> wrap.apply(this.toSupplier(t1, t2, t3, t4, t5, t6, t7).checked());
    }

    default public Fn7<T1, T2, T3, T4, T5, T6, T7, R> beforeRun(Rn r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> {
            r.run();
            return this.apply(t1, t2, t3, t4, t5, t6, t7);
        };
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Fn7<B1, B2, B3, B4, B5, B6, B7, R> beforeApply(Fn7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> f) {
        return this.beforeApply7(f);
    }

    default public <B1> Fn1<B1, R> beforeApply1(Fn1<? super B1, ? extends Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> f) {
        Objects.requireNonNull(f, "f is null");
        return b1 -> this.tupled().apply(Tuple.narrow((f.apply(b1))));
    }

    default public <B1, B2> Fn2<B1, B2, R> beforeApply2(Fn2<? super B1, ? super B2, ? extends Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2))));
    }

    default public <B1, B2, B3> Fn3<B1, B2, B3, R> beforeApply3(Fn3<? super B1, ? super B2, ? super B3, ? extends Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3))));
    }

    default public <B1, B2, B3, B4> Fn4<B1, B2, B3, B4, R> beforeApply4(Fn4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4))));
    }

    default public <B1, B2, B3, B4, B5> Fn5<B1, B2, B3, B4, B5, R> beforeApply5(Fn5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4, b5))));
    }

    default public <B1, B2, B3, B4, B5, B6> Fn6<B1, B2, B3, B4, B5, B6, R> beforeApply6(Fn6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Fn7<B1, B2, B3, B4, B5, B6, B7, R> beforeApply7(Fn7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Fn8<B1, B2, B3, B4, B5, B6, B7, B8, R> beforeApply8(Fn8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7, b8) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7, b8))));
    }

    default public Fn7<T1, T2, T3, T4, T5, T6, T7, R> beforeTestOnSuccess(Pr0 p, Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> p.test() ? this.apply(t1, t2, t3, t4, t5, t6, t7) : onFailure.apply(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Fn7<T1, T2, T3, T4, T5, T6, T7, R> beforeTestOnSuccess(Pr0 p, Sp<? extends R> onFailure) {
        return this.beforeTestOnSuccess(p, onFailure.toFunction().ignoring7());
    }

    default public Fn7<T1, T2, T3, T4, T5, T6, T7, R> beforeTestOnSuccess(Pr0 p, R onFailure) {
        return this.beforeTestOnSuccess(p, Fn7.value(onFailure));
    }

    default public Fn7<T1, T2, T3, T4, T5, T6, T7, R> beforeTestOnSuccess(Pr0 p) {
        return this.beforeTestOnSuccess(p, Fn7.empty());
    }

    default public Fn7<T1, T2, T3, T4, T5, T6, T7, R> beforeTestOnFailure(Pr0 p, Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Fn7<T1, T2, T3, T4, T5, T6, T7, R> beforeTestOnFailure(Pr0 p, Sp<? extends R> onSuccess) {
        return this.beforeTestOnFailure(p, onSuccess.toFunction().ignoring7());
    }

    default public Fn7<T1, T2, T3, T4, T5, T6, T7, R> beforeTestOnFailure(Pr0 p, R onSuccess) {
        return this.beforeTestOnFailure(p, Fn7.value(onSuccess));
    }

    default public Fn7<T1, T2, T3, T4, T5, T6, T7, R> beforeTestOnFailure(Pr0 p) {
        return this.beforeTestOnFailure(p, Fn7.empty());
    }

    default public Sp<R> beforeGet(Sp<? extends Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> s) {
        Objects.requireNonNull(s, "s is null");
        return () -> this.tupled().apply(Tuple.narrow((s.get())));
    }

    default public Fn7<T1, T2, T3, T4, T5, T6, T7, Option<R>> lift() {
        return Fn7.lift(this);
    }

    default public Fn7<T1, T2, T3, T4, T5, T6, T7, Try<R>> liftTry() {
        return Fn7.liftTry(this);
    }

    default public Fn7<T7, T6, T5, T4, T3, T2, T1, R> inverted() {
        return (t7, t6, t5, t4, t3, t2, t1) -> this.apply(t1, t2, t3, t4, t5, t6, t7);
    }

    default public <S> Fn7<T1, T2, T3, T4, T5, T6, T7, S> afterPassingThroughApply(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends S> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> {
            this.apply(t1, t2, t3, t4, t5, t6, t7);
            return f.apply(t1, t2, t3, t4, t5, t6, t7);
        };
    }

    default public Fn7<T1, T2, T3, T4, T5, T6, T7, R> afterPassingThroughTest(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> {
            R result = this.apply(t1, t2, t3, t4, t5, t6, t7);
            p.test(t1, t2, t3, t4, t5, t6, t7);
            return result;
        };
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> afterPassingThroughTestTo(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> {
            this.apply(t1, t2, t3, t4, t5, t6, t7);
            return p.test(t1, t2, t3, t4, t5, t6, t7);
        };
    }

    default public Fn7<T1, T2, T3, T4, T5, T6, T7, R> afterPassingThroughAccept(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> {
            R result = this.apply(t1, t2, t3, t4, t5, t6, t7);
            c.accept(t1, t2, t3, t4, t5, t6, t7);
            return result;
        };
    }

    default public Cs7<T1, T2, T3, T4, T5, T6, T7> afterPassingThroughAcceptTo(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> {
            this.apply(t1, t2, t3, t4, t5, t6, t7);
            c.accept(t1, t2, t3, t4, t5, t6, t7);
        };
    }

    default public Fn7<T1, T2, T3, T4, T5, T6, T7, R> beforePassingThroughApply(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> {
            f.apply(t1, t2, t3, t4, t5, t6, t7);
            return this.apply(t1, t2, t3, t4, t5, t6, t7);
        };
    }

    default public Fn7<T1, T2, T3, T4, T5, T6, T7, R> beforePassingThroughTest(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> {
            p.test(t1, t2, t3, t4, t5, t6, t7);
            return this.apply(t1, t2, t3, t4, t5, t6, t7);
        };
    }

    default public Fn7<T1, T2, T3, T4, T5, T6, T7, R> beforePassingThroughAccept(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> {
            c.accept(t1, t2, t3, t4, t5, t6, t7);
            return this.apply(t1, t2, t3, t4, t5, t6, t7);
        };
    }

    default public Fn7<T1, T2, T3, T4, T5, T6, T7, R> beforeSuccessPassingThroughTest(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> p.test(t1, t2, t3, t4, t5, t6, t7) ? this.apply(t1, t2, t3, t4, t5, t6, t7) : onFailure.apply(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Fn7<T1, T2, T3, T4, T5, T6, T7, R> beforeSuccessPassingThroughTest(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, Sp<? extends R> onFailure) {
        return this.beforeSuccessPassingThroughTest(p, onFailure.toFunction().ignoring7());
    }

    default public Fn7<T1, T2, T3, T4, T5, T6, T7, R> beforeSuccessPassingThroughTest(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, R onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Fn7.value(onFailure));
    }

    default public Fn7<T1, T2, T3, T4, T5, T6, T7, R> beforeSuccessPassingThroughTest(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        return this.beforeSuccessPassingThroughTest(p, Fn7.empty());
    }

    default public Fn7<T1, T2, T3, T4, T5, T6, T7, R> beforeFailurePassingThroughTest(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Fn7<T1, T2, T3, T4, T5, T6, T7, R> beforeFailurePassingThroughTest(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, Sp<? extends R> onSuccess) {
        return this.beforeFailurePassingThroughTest(p, onSuccess.toFunction().ignoring7());
    }

    default public Fn7<T1, T2, T3, T4, T5, T6, T7, R> beforeFailurePassingThroughTest(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, R onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Fn7.value(onSuccess));
    }

    default public Fn7<T1, T2, T3, T4, T5, T6, T7, R> beforeFailurePassingThroughTest(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        return this.beforeFailurePassingThroughTest(p, Fn7.empty());
    }

    default public Fn1<T1, Fn1<T2, Fn1<T3, Fn1<T4, Fn1<T5, Fn1<T6, Fn1<T7, R>>>>>>> currying() {
        return t1 -> t2 -> t3 -> t4 -> t5 -> t6 -> t7 -> this.apply(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Fnc7<T1, T2, T3, T4, T5, T6, T7, R> checked() {
        return this::apply;
    }

    default public <I1> Fn8<I1, T1, T2, T3, T4, T5, T6, T7, R> ignoring1Lt() {
        return (i1, t1, t2, t3, t4, t5, t6, t7) -> this.apply(t1, t2, t3, t4, t5, t6, t7);
    }

    default public <I1> Fn8<T1, T2, T3, T4, T5, T6, T7, I1, R> ignoring1Rt() {
        return (t1, t2, t3, t4, t5, t6, t7, i1) -> this.apply(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Fn6<T2, T3, T4, T5, T6, T7, R> apply(T1 t1) {
        return Function7.super.apply(t1)::apply;
    }

    default public Fn5<T3, T4, T5, T6, T7, R> apply(T1 t1, T2 t2) {
        return Function7.super.apply(t1, t2)::apply;
    }

    default public Fn4<T4, T5, T6, T7, R> apply(T1 t1, T2 t2, T3 t3) {
        return Function7.super.apply(t1, t2, t3)::apply;
    }

    default public Fn3<T5, T6, T7, R> apply(T1 t1, T2 t2, T3 t3, T4 t4) {
        return Function7.super.apply(t1, t2, t3, t4)::apply;
    }

    default public Fn2<T6, T7, R> apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return Function7.super.apply(t1, t2, t3, t4, t5)::apply;
    }

    default public Fn1<T7, R> apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return Function7.super.apply(t1, t2, t3, t4, t5, t6)::apply;
    }

    default public Fn1<Tuple7<T1, T2, T3, T4, T5, T6, T7>, R> tupled() {
        return Function7.super.tupled()::apply;
    }

    default public Fn1<T1, Function1<T2, Function1<T3, Function1<T4, Function1<T5, Function1<T6, Function1<T7, R>>>>>>> curried() {
        return Function7.super.curried()::apply;
    }

    default public Fn7<T7, T6, T5, T4, T3, T2, T1, R> reversed() {
        return Function7.super.reversed()::apply;
    }

    default public Fn7<T1, T2, T3, T4, T5, T6, T7, R> memoized() {
        return Function7.super.memoized()::apply;
    }

    default public <V> Fn7<T1, T2, T3, T4, T5, T6, T7, V> andThen(Function<? super R, ? extends V> after) {
        Objects.requireNonNull(after, "after is null");
        return Function7.super.andThen(after)::apply;
    }

}

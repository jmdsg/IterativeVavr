package com.fiberg.iterative.function;

import com.fiberg.iterative.core.IterativeInternals;
import com.fiberg.iterative.function.Csc1;
import com.fiberg.iterative.function.Csc8;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fn8;
import com.fiberg.iterative.function.Fnc0;
import com.fiberg.iterative.function.Fnc1;
import com.fiberg.iterative.function.Fnc2;
import com.fiberg.iterative.function.Fnc3;
import com.fiberg.iterative.function.Fnc4;
import com.fiberg.iterative.function.Fnc5;
import com.fiberg.iterative.function.Fnc6;
import com.fiberg.iterative.function.Fnc7;
import com.fiberg.iterative.function.Prc0;
import com.fiberg.iterative.function.Prc1;
import com.fiberg.iterative.function.Prc8;
import com.fiberg.iterative.function.Rnc;
import com.fiberg.iterative.function.Spc;
import io.vavr.CheckedFunction1;
import io.vavr.CheckedFunction2;
import io.vavr.CheckedFunction3;
import io.vavr.CheckedFunction4;
import io.vavr.CheckedFunction5;
import io.vavr.CheckedFunction6;
import io.vavr.CheckedFunction7;
import io.vavr.CheckedFunction8;
import io.vavr.Function1;
import io.vavr.Function8;
import io.vavr.Tuple;
import io.vavr.Tuple8;
import io.vavr.Value;
import io.vavr.control.Option;
import io.vavr.control.Try;
import java.io.Serializable;
import java.util.Objects;
import java.util.function.Function;

@FunctionalInterface
public interface Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> extends CheckedFunction8<T1, T2, T3, T4, T5, T6, T7, T8, R> {

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> narrow(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> fnc = (Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R>) f;
        return fnc;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> empty() {
        return IterativeInternals::none;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> value(R r) {
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> r;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> of(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        return Fnc8.narrow(f);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> of1(Fnc1<? super T1, ? extends R> f) {
        return Fnc8.<T1, T2, T3, T4, T5, T6, T7, T8, R>narrow(f.ignoring7Rt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> of2(Fnc1<? super T2, ? extends R> f) {
        return Fnc8.<T1, T2, T3, T4, T5, T6, T7, T8, R>narrow(f.ignoring6Rt().ignoring1Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> of3(Fnc1<? super T3, ? extends R> f) {
        return Fnc8.<T1, T2, T3, T4, T5, T6, T7, T8, R>narrow(f.ignoring5Rt().ignoring2Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> of4(Fnc1<? super T4, ? extends R> f) {
        return Fnc8.<T1, T2, T3, T4, T5, T6, T7, T8, R>narrow(f.ignoring4Rt().ignoring3Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> of5(Fnc1<? super T5, ? extends R> f) {
        return Fnc8.<T1, T2, T3, T4, T5, T6, T7, T8, R>narrow(f.ignoring3Rt().ignoring4Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> of6(Fnc1<? super T6, ? extends R> f) {
        return Fnc8.<T1, T2, T3, T4, T5, T6, T7, T8, R>narrow(f.ignoring2Rt().ignoring5Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> of7(Fnc1<? super T7, ? extends R> f) {
        return Fnc8.<T1, T2, T3, T4, T5, T6, T7, T8, R>narrow(f.ignoring1Rt().ignoring6Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> of8(Fnc1<? super T8, ? extends R> f) {
        return Fnc8.<T1, T2, T3, T4, T5, T6, T7, T8, R>narrow(f.ignoring7Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, R> tuple(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        return Fnc8.<T1, T2, T3, T4, T5, T6, T7, T8, R>of(f).tupled();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> detuple(Fnc1<? super Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>, ? extends R> f) {
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> f.apply(Tuple.of(t1, t2, t3, t4, t5, t6, t7, t8));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> check(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fn8.narrow(f).checked();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> ignore(Fnc0<? extends R> f) {
        return Fnc0.<R>narrow(f).ignoring8();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> ignore7Rt(Fnc1<? super T1, ? extends R> f) {
        return Fnc1.<T1, R>narrow(f).ignoring7Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> ignore7Lt(Fnc1<? super T8, ? extends R> f) {
        return Fnc1.<T8, R>narrow(f).ignoring7Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> ignore6Rt(Fnc2<? super T1, ? super T2, ? extends R> f) {
        return Fnc2.<T1, T2, R>narrow(f).ignoring6Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> ignore6Lt(Fnc2<? super T7, ? super T8, ? extends R> f) {
        return Fnc2.<T7, T8, R>narrow(f).ignoring6Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> ignore5Rt(Fnc3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        return Fnc3.<T1, T2, T3, R>narrow(f).ignoring5Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> ignore5Lt(Fnc3<? super T6, ? super T7, ? super T8, ? extends R> f) {
        return Fnc3.<T6, T7, T8, R>narrow(f).ignoring5Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> ignore4Rt(Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
        return Fnc4.<T1, T2, T3, T4, R>narrow(f).ignoring4Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> ignore4Lt(Fnc4<? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        return Fnc4.<T5, T6, T7, T8, R>narrow(f).ignoring4Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> ignore3Rt(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        return Fnc5.<T1, T2, T3, T4, T5, R>narrow(f).ignoring3Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> ignore3Lt(Fnc5<? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        return Fnc5.<T4, T5, T6, T7, T8, R>narrow(f).ignoring3Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> ignore2Rt(Fnc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f) {
        return Fnc6.<T1, T2, T3, T4, T5, T6, R>narrow(f).ignoring2Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> ignore2Lt(Fnc6<? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        return Fnc6.<T3, T4, T5, T6, T7, T8, R>narrow(f).ignoring2Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> ignore1Rt(Fnc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
        return Fnc7.<T1, T2, T3, T4, T5, T6, T7, R>narrow(f).ignoring1Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> ignore1Lt(Fnc7<? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        return Fnc7.<T2, T3, T4, T5, T6, T7, T8, R>narrow(f).ignoring1Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, Option<R>> lift(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fnc8.liftTry(f).afterApply(Value::toOption);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, Try<R>> liftTry(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fnc8.narrow(f).beforeWrap(Try::of);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc8<T8, T7, T6, T5, T4, T3, T2, T1, R> invert(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        return Fnc8.<T1, T2, T3, T4, T5, T6, T7, T8, R>narrow(f).inverted();
    }

    default public Fnc7<T2, T3, T4, T5, T6, T7, T8, R> applyLt(T1 t1) {
        return (t2, t3, t4, t5, t6, t7, t8) -> this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Fnc6<T3, T4, T5, T6, T7, T8, R> applyLt(T1 t1, T2 t2) {
        return (t3, t4, t5, t6, t7, t8) -> this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Fnc5<T4, T5, T6, T7, T8, R> applyLt(T1 t1, T2 t2, T3 t3) {
        return (t4, t5, t6, t7, t8) -> this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Fnc4<T5, T6, T7, T8, R> applyLt(T1 t1, T2 t2, T3 t3, T4 t4) {
        return (t5, t6, t7, t8) -> this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Fnc3<T6, T7, T8, R> applyLt(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return (t6, t7, t8) -> this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Fnc2<T7, T8, R> applyLt(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return (t7, t8) -> this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Fnc1<T8, R> applyLt(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return t8 -> this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Fnc7<T1, T2, T3, T4, T5, T6, T7, R> applyRt(T8 t8) {
        return (t1, t2, t3, t4, t5, t6, t7) -> this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Fnc6<T1, T2, T3, T4, T5, T6, R> applyRt(T7 t7, T8 t8) {
        return (t1, t2, t3, t4, t5, t6) -> this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Fnc5<T1, T2, T3, T4, T5, R> applyRt(T6 t6, T7 t7, T8 t8) {
        return (t1, t2, t3, t4, t5) -> this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Fnc4<T1, T2, T3, T4, R> applyRt(T5 t5, T6 t6, T7 t7, T8 t8) {
        return (t1, t2, t3, t4) -> this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Fnc3<T1, T2, T3, R> applyRt(T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return (t1, t2, t3) -> this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Fnc2<T1, T2, R> applyRt(T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return (t1, t2) -> this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Fnc1<T1, R> applyRt(T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return t1 -> this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Fnc0<R> toFunction(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return () -> this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Rnc toRunnable(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return this.toFunction(t1, t2, t3, t4, t5, t6, t7, t8).toRunnable();
    }

    default public Csc8<T1, T2, T3, T4, T5, T6, T7, T8> toConsumer() {
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> ((Fnc8) this).apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Spc<R> toSupplier(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return this.toFunction(t1, t2, t3, t4, t5, t6, t7, t8).toSupplier();
    }

    default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> afterRun(Rnc r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            R value = this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
            r.run();
            return value;
        };
    }

    default public <V> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, V> afterApply(Fnc1<? super R, ? extends V> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> f.apply(this.apply(t1, t2, t3, t4, t5, t6, t7, t8));
    }

    default public <V> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, V> afterApply(Fnc0<? extends V> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> f.ignoring1().apply(this.apply(t1, t2, t3, t4, t5, t6, t7, t8));
    }

    default public <V> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, V> afterGet(Spc<? extends V> s) {
        Objects.requireNonNull(s, "s is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> s.ignoring1().apply(this.apply(t1, t2, t3, t4, t5, t6, t7, t8));
    }

    default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, Boolean> afterTest(Prc1<? super R> p) {
        Objects.requireNonNull(p, "p is null");
        return this.afterTestTo(p).toFunction();
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterTestTo(Prc1<? super R> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> p.test(this.apply(t1, t2, t3, t4, t5, t6, t7, t8));
    }

    default public Csc8<T1, T2, T3, T4, T5, T6, T7, T8> afterAcceptTo(Csc1<? super R> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> c.accept(this.apply(t1, t2, t3, t4, t5, t6, t7, t8));
    }

    default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> afterAccept(Csc1<? super R> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            R value = this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
            c.accept(value);
            return value;
        };
    }

    default public <W> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, W> beforeWrap(Fn1<? super Spc<R>, ? extends W> wrap) {
        Objects.requireNonNull(wrap, "wrap is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> wrap.apply(this.toSupplier(t1, t2, t3, t4, t5, t6, t7, t8));
    }

    default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforeRun(Rnc r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            r.run();
            return this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Fnc8<B1, B2, B3, B4, B5, B6, B7, B8, R> beforeApply(Fnc8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.beforeApply8(f);
    }

    default public <B1> Fnc1<B1, R> beforeApply1(Fnc1<? super B1, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return b1 -> this.tupled().apply(Tuple.narrow((f.apply(b1))));
    }

    default public <B1, B2> Fnc2<B1, B2, R> beforeApply2(Fnc2<? super B1, ? super B2, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2))));
    }

    default public <B1, B2, B3> Fnc3<B1, B2, B3, R> beforeApply3(Fnc3<? super B1, ? super B2, ? super B3, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3))));
    }

    default public <B1, B2, B3, B4> Fnc4<B1, B2, B3, B4, R> beforeApply4(Fnc4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4))));
    }

    default public <B1, B2, B3, B4, B5> Fnc5<B1, B2, B3, B4, B5, R> beforeApply5(Fnc5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4, b5))));
    }

    default public <B1, B2, B3, B4, B5, B6> Fnc6<B1, B2, B3, B4, B5, B6, R> beforeApply6(Fnc6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Fnc7<B1, B2, B3, B4, B5, B6, B7, R> beforeApply7(Fnc7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Fnc8<B1, B2, B3, B4, B5, B6, B7, B8, R> beforeApply8(Fnc8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        return (b1, b2, b3, b4, b5, b6, b7, b8) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7, b8))));
    }

    default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforeTestOnSuccess(Prc0 p, Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> p.test() != false ? this.apply(t1, t2, t3, t4, t5, t6, t7, t8) : onFailure.apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforeTestOnSuccess(Prc0 p, Spc<? extends R> onFailure) {
        return this.beforeTestOnSuccess(p, onFailure.toFunction().ignoring8());
    }

    default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforeTestOnSuccess(Prc0 p, R onFailure) {
        return this.beforeTestOnSuccess(p, Fnc8.value(onFailure));
    }

    default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforeTestOnSuccess(Prc0 p) {
        return this.beforeTestOnSuccess(p, Fnc8.empty());
    }

    default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforeTestOnFailure(Prc0 p, Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforeTestOnFailure(Prc0 p, Spc<? extends R> onSuccess) {
        return this.beforeTestOnFailure(p, onSuccess.toFunction().ignoring8());
    }

    default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforeTestOnFailure(Prc0 p, R onSuccess) {
        return this.beforeTestOnFailure(p, Fnc8.value(onSuccess));
    }

    default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforeTestOnFailure(Prc0 p) {
        return this.beforeTestOnFailure(p, Fnc8.empty());
    }

    default public Spc<R> beforeGet(Spc<? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> s) {
        Objects.requireNonNull(s, "s is null");
        return () -> this.tupled().apply(Tuple.narrow((s.get())));
    }

    default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, Option<R>> lift() {
        return Fnc8.lift(this);
    }

    default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, Try<R>> liftTry() {
        return Fnc8.liftTry(this);
    }

    default public Fnc8<T8, T7, T6, T5, T4, T3, T2, T1, R> inverted() {
        return (t8, t7, t6, t5, t4, t3, t2, t1) -> this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public <S> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, S> afterPassingThroughApply(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends S> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
            return f.apply(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> afterPassingThroughTest(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            R result = this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
            p.test(t1, t2, t3, t4, t5, t6, t7, t8);
            return result;
        };
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterPassingThroughTestTo(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
            return p.test(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> afterPassingThroughAccept(Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            R result = this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
            c.accept(t1, t2, t3, t4, t5, t6, t7, t8);
            return result;
        };
    }

    default public Csc8<T1, T2, T3, T4, T5, T6, T7, T8> afterPassingThroughAcceptTo(Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
            c.accept(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforePassingThroughApply(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            f.apply(t1, t2, t3, t4, t5, t6, t7, t8);
            return this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforePassingThroughTest(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            p.test(t1, t2, t3, t4, t5, t6, t7, t8);
            return this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforePassingThroughAccept(Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            c.accept(t1, t2, t3, t4, t5, t6, t7, t8);
            return this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforeSuccessPassingThroughTest(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> p.test(t1, t2, t3, t4, t5, t6, t7, t8) ? this.apply(t1, t2, t3, t4, t5, t6, t7, t8) : onFailure.apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforeSuccessPassingThroughTest(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, Spc<? extends R> onFailure) {
        return this.beforeSuccessPassingThroughTest(p, onFailure.toFunction().ignoring8());
    }

    default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforeSuccessPassingThroughTest(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, R onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Fnc8.value(onFailure));
    }

    default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforeSuccessPassingThroughTest(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        return this.beforeSuccessPassingThroughTest(p, Fnc8.empty());
    }

    default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforeFailurePassingThroughTest(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforeFailurePassingThroughTest(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, Spc<? extends R> onSuccess) {
        return this.beforeFailurePassingThroughTest(p, onSuccess.toFunction().ignoring8());
    }

    default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforeFailurePassingThroughTest(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, R onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Fnc8.value(onSuccess));
    }

    default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> beforeFailurePassingThroughTest(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        return this.beforeFailurePassingThroughTest(p, Fnc8.empty());
    }

    default public Fnc1<T1, Fnc1<T2, Fnc1<T3, Fnc1<T4, Fnc1<T5, Fnc1<T6, Fnc1<T7, Fnc1<T8, R>>>>>>>> currying() {
        return t1 -> t2 -> t3 -> t4 -> t5 -> t6 -> t7 -> t8 -> this.apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> unchecked() {
        return Function8.super.unchecked()::apply;
    }

    default public Fnc7<T2, T3, T4, T5, T6, T7, T8, R> apply(T1 t1) {
        return (t1, t2, t3, t4, t5, t6, t7) -> ((CheckedFunction7) super.apply(t1)).apply(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Fnc6<T3, T4, T5, T6, T7, T8, R> apply(T1 t1, T2 t2) {
        return (t1, t2, t3, t4, t5, t6) -> ((CheckedFunction6) super.apply(t1, t2)).apply(t1, t2, t3, t4, t5, t6);
    }

    default public Fnc5<T4, T5, T6, T7, T8, R> apply(T1 t1, T2 t2, T3 t3) {
        return (t1, t2, t3, t4, t5) -> ((CheckedFunction5) super.apply(t1, t2, t3)).apply(t1, t2, t3, t4, t5);
    }

    default public Fnc4<T5, T6, T7, T8, R> apply(T1 t1, T2 t2, T3 t3, T4 t4) {
        return (t1, t2, t3, t4) -> ((CheckedFunction4) super.apply(t1, t2, t3, t4)).apply(t1, t2, t3, t4);
    }

    default public Fnc3<T6, T7, T8, R> apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return (t1, t2, t3) -> ((CheckedFunction3) super.apply(t1, t2, t3, t4, t5)).apply(t1, t2, t3);
    }

    default public Fnc2<T7, T8, R> apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return (t1, t2) -> ((CheckedFunction2) super.apply(t1, t2, t3, t4, t5, t6)).apply(t1, t2);
    }

    default public Fnc1<T8, R> apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return ((CheckedFunction1) super.apply(t1, t2, t3, t4, t5, t6, t7))::apply;
    }

    default public Fnc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, R> tupled() {
        return ((CheckedFunction1) super.tupled())::apply;
    }

    default public Fn1<T1, Function1<T2, Function1<T3, Function1<T4, Function1<T5, Function1<T6, Function1<T7, CheckedFunction1<T8, R>>>>>>>> curried() {
        return Function1.super.curried()::apply;
    }

    default public Fnc8<T8, T7, T6, T5, T4, T3, T2, T1, R> reversed() {
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> ((CheckedFunction8) super.reversed()).apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> memoized() {
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> ((CheckedFunction8) super.memoized()).apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public <V> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, V> andThen(CheckedFunction1<? super R, ? extends V> after) {
        Objects.requireNonNull(after, "after is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> ((CheckedFunction8) super.andThen(after)).apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> recover(Function<? super Throwable, ? extends Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R>> recover) {
        return super.recover(recover);
    }

}

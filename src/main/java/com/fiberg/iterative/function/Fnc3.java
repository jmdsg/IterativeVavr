package com.fiberg.iterative.function;

import com.fiberg.iterative.core.IterativeInternals;
import com.fiberg.iterative.function.Csc1;
import com.fiberg.iterative.function.Csc3;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fn3;
import com.fiberg.iterative.function.Fnc0;
import com.fiberg.iterative.function.Fnc1;
import com.fiberg.iterative.function.Fnc2;
import com.fiberg.iterative.function.Fnc4;
import com.fiberg.iterative.function.Fnc5;
import com.fiberg.iterative.function.Fnc6;
import com.fiberg.iterative.function.Fnc7;
import com.fiberg.iterative.function.Fnc8;
import com.fiberg.iterative.function.Prc0;
import com.fiberg.iterative.function.Prc1;
import com.fiberg.iterative.function.Prc3;
import com.fiberg.iterative.function.Rnc;
import com.fiberg.iterative.function.Spc;
import io.vavr.CheckedFunction1;
import io.vavr.CheckedFunction2;
import io.vavr.CheckedFunction3;
import io.vavr.Function1;
import io.vavr.Function3;
import io.vavr.Tuple;
import io.vavr.Tuple3;
import io.vavr.Value;
import io.vavr.control.Option;
import io.vavr.control.Try;
import java.io.Serializable;
import java.util.Objects;
import java.util.function.Function;

@FunctionalInterface
public interface Fnc3<T1, T2, T3, R> extends CheckedFunction3<T1, T2, T3, R> {

    public static <T1, T2, T3, R> Fnc3<T1, T2, T3, R> narrow(Fnc3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fnc3<T1, T2, T3, R> fnc = (Fnc3<T1, T2, T3, R>) f;
        return fnc;
    }

    public static <T1, T2, T3, R> Fnc3<T1, T2, T3, R> empty() {
        return IterativeInternals::none;
    }

    public static <T1, T2, T3, R> Fnc3<T1, T2, T3, R> value(R r) {
        return (t1, t2, t3) -> r;
    }

    public static <T1, T2, T3, R> Fnc3<T1, T2, T3, R> of(Fnc3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        return Fnc3.narrow(f);
    }

    public static <T1, T2, T3, R> Fnc3<T1, T2, T3, R> of1(Fnc1<? super T1, ? extends R> f) {
        return Fnc3.<T1, T2, T3, R>narrow(f.ignoring2Rt());
    }

    public static <T1, T2, T3, R> Fnc3<T1, T2, T3, R> of2(Fnc1<? super T2, ? extends R> f) {
        return Fnc3.<T1, T2, T3, R>narrow(f.ignoring1Rt().ignoring1Lt());
    }

    public static <T1, T2, T3, R> Fnc3<T1, T2, T3, R> of3(Fnc1<? super T3, ? extends R> f) {
        return Fnc3.<T1, T2, T3, R>narrow(f.ignoring2Lt());
    }

    public static <T1, T2, T3, R> Fnc1<Tuple3<T1, T2, T3>, R> tuple(Fnc3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        return Fnc3.<T1, T2, T3, R>of(f).tupled();
    }

    public static <T1, T2, T3, R> Fnc3<T1, T2, T3, R> detuple(Fnc1<? super Tuple3<? extends T1, ? extends T2, ? extends T3>, ? extends R> f) {
        return (t1, t2, t3) -> f.apply(Tuple.of(t1, t2, t3));
    }

    public static <T1, T2, T3, R> Fnc3<T1, T2, T3, R> check(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fn3.<T1, T2, T3, R>narrow(f).checked();
    }

    public static <T1, T2, T3, R> Fnc3<T1, T2, T3, R> ignore(Fnc0<? extends R> f) {
        return Fnc0.<R>narrow(f).ignoring3();
    }

    public static <T1, T2, T3, R> Fnc3<T1, T2, T3, R> ignore2Rt(Fnc1<? super T1, ? extends R> f) {
        return Fnc1.<T1, R>narrow(f).ignoring2Rt();
    }

    public static <T1, T2, T3, R> Fnc3<T1, T2, T3, R> ignore2Lt(Fnc1<? super T3, ? extends R> f) {
        return Fnc1.<T3, R>narrow(f).ignoring2Lt();
    }

    public static <T1, T2, T3, R> Fnc3<T1, T2, T3, R> ignore1Rt(Fnc2<? super T1, ? super T2, ? extends R> f) {
        return Fnc2.<T1, T2, R>narrow(f).ignoring1Rt();
    }

    public static <T1, T2, T3, R> Fnc3<T1, T2, T3, R> ignore1Lt(Fnc2<? super T2, ? super T3, ? extends R> f) {
        return Fnc2.<T2, T3, R>narrow(f).ignoring1Lt();
    }

    public static <T1, T2, T3, T4, R> Fnc3<T1, T2, T3, R> passRt(Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f, T4 t4) {
        return Fnc3.narrow(f.applyRt(t4));
    }

    public static <T1, T2, T3, T4, T5, R> Fnc3<T1, T2, T3, R> passRt(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f, T4 t4, T5 t5) {
        return Fnc3.narrow(f.applyRt(t4, t5));
    }

    public static <T1, T2, T3, T4, T5, T6, R> Fnc3<T1, T2, T3, R> passRt(Fnc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f, T4 t4, T5 t5, T6 t6) {
        return Fnc3.narrow(f.applyRt(t4, t5, t6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fnc3<T1, T2, T3, R> passRt(Fnc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f, T4 t4, T5 t5, T6 t6, T7 t7) {
        return Fnc3.narrow(f.applyRt(t4, t5, t6, t7));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc3<T1, T2, T3, R> passRt(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Fnc3.narrow(f.applyRt(t4, t5, t6, t7, t8));
    }

    public static <T1, T2, T3, T4, R> Fnc3<T2, T3, T4, R> passLt(Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f, T1 t1) {
        return Fnc3.narrow(f.applyLt(t1));
    }

    public static <T1, T2, T3, T4, T5, R> Fnc3<T3, T4, T5, R> passLt(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f, T1 t1, T2 t2) {
        return Fnc3.narrow(f.applyLt(t1, t2));
    }

    public static <T1, T2, T3, T4, T5, T6, R> Fnc3<T4, T5, T6, R> passLt(Fnc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f, T1 t1, T2 t2, T3 t3) {
        return Fnc3.narrow(f.applyLt(t1, t2, t3));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fnc3<T5, T6, T7, R> passLt(Fnc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4) {
        return Fnc3.narrow(f.applyLt(t1, t2, t3, t4));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc3<T6, T7, T8, R> passLt(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return Fnc3.narrow(f.applyLt(t1, t2, t3, t4, t5));
    }

    public static <T1, T2, T3, R> Fn3<T1, T2, T3, Option<R>> lift(Fnc3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fnc3.<T1, T2, T3, R>liftTry(f).afterApply(Value::toOption);
    }

    public static <T1, T2, T3, R> Fn3<T1, T2, T3, Try<R>> liftTry(Fnc3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fnc3.<T1, T2, T3, R>narrow(f).beforeWrap(Try::of);
    }

    public static <T1, T2, T3, R> Fnc3<T3, T2, T1, R> invert(Fnc3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        return Fnc3.<T1, T2, T3, R>narrow(f).inverted();
    }

    default public Fnc2<T2, T3, R> applyLt(T1 t1) {
        return (t2, t3) -> this.apply(t1, t2, t3);
    }

    default public Fnc1<T3, R> applyLt(T1 t1, T2 t2) {
        return t3 -> this.apply(t1, t2, t3);
    }

    default public Fnc2<T1, T2, R> applyRt(T3 t3) {
        return (t1, t2) -> this.apply(t1, t2, t3);
    }

    default public Fnc1<T1, R> applyRt(T2 t2, T3 t3) {
        return t1 -> this.apply(t1, t2, t3);
    }

    default public Fnc0<R> toFunction(T1 t1, T2 t2, T3 t3) {
        return () -> this.apply(t1, t2, t3);
    }

    default public Rnc toRunnable(T1 t1, T2 t2, T3 t3) {
        return this.toFunction(t1, t2, t3).toRunnable();
    }

    default public Csc3<T1, T2, T3> toConsumer() {
        return this::apply;
    }

    default public Spc<R> toSupplier(T1 t1, T2 t2, T3 t3) {
        return this.toFunction(t1, t2, t3).toSupplier();
    }

    default public Fnc3<T1, T2, T3, R> afterRun(Rnc r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2, t3) -> {
            R value = this.apply(t1, t2, t3);
            r.run();
            return value;
        };
    }

    default public <V> Fnc3<T1, T2, T3, V> afterApply(Fnc1<? super R, ? extends V> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3) -> f.apply(this.apply(t1, t2, t3));
    }

    default public <V> Fnc3<T1, T2, T3, V> afterApply(Fnc0<? extends V> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3) -> f.ignoring1().apply(this.apply(t1, t2, t3));
    }

    default public <V> Fnc3<T1, T2, T3, V> afterGet(Spc<? extends V> s) {
        Objects.requireNonNull(s, "s is null");
        return (t1, t2, t3) -> s.ignoring1().apply(this.apply(t1, t2, t3));
    }

    default public Fnc3<T1, T2, T3, Boolean> afterTest(Prc1<? super R> p) {
        Objects.requireNonNull(p, "p is null");
        return this.afterTestTo(p).toFunction();
    }

    default public Prc3<T1, T2, T3> afterTestTo(Prc1<? super R> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3) -> p.test(this.apply(t1, t2, t3));
    }

    default public Csc3<T1, T2, T3> afterAcceptTo(Csc1<? super R> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3) -> c.accept(this.apply(t1, t2, t3));
    }

    default public Fnc3<T1, T2, T3, R> afterAccept(Csc1<? super R> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3) -> {
            R value = this.apply(t1, t2, t3);
            c.accept(value);
            return value;
        };
    }

    default public <W> Fn3<T1, T2, T3, W> beforeWrap(Fn1<? super Spc<R>, ? extends W> wrap) {
        Objects.requireNonNull(wrap, "wrap is null");
        return (t1, t2, t3) -> wrap.apply(this.toSupplier(t1, t2, t3));
    }

    default public Fnc3<T1, T2, T3, R> beforeRun(Rnc r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2, t3) -> {
            r.run();
            return this.apply(t1, t2, t3);
        };
    }

    default public <B1, B2, B3> Fnc3<B1, B2, B3, R> beforeApply(Fnc3<? super B1, ? super B2, ? super B3, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        return this.beforeApply3(f);
    }

    default public <B1> Fnc1<B1, R> beforeApply1(Fnc1<? super B1, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return b1 -> this.tupled().apply(Tuple.narrow((f.apply(b1))));
    }

    default public <B1, B2> Fnc2<B1, B2, R> beforeApply2(Fnc2<? super B1, ? super B2, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2))));
    }

    default public <B1, B2, B3> Fnc3<B1, B2, B3, R> beforeApply3(Fnc3<? super B1, ? super B2, ? super B3, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3))));
    }

    default public <B1, B2, B3, B4> Fnc4<B1, B2, B3, B4, R> beforeApply4(Fnc4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4))));
    }

    default public <B1, B2, B3, B4, B5> Fnc5<B1, B2, B3, B4, B5, R> beforeApply5(Fnc5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4, b5))));
    }

    default public <B1, B2, B3, B4, B5, B6> Fnc6<B1, B2, B3, B4, B5, B6, R> beforeApply6(Fnc6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Fnc7<B1, B2, B3, B4, B5, B6, B7, R> beforeApply7(Fnc7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Fnc8<B1, B2, B3, B4, B5, B6, B7, B8, R> beforeApply8(Fnc8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7, b8) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7, b8))));
    }

    default public Fnc3<T1, T2, T3, R> beforeTestOnSuccess(Prc0 p, Fnc3<? super T1, ? super T2, ? super T3, ? extends R> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3) -> p.test() != false ? this.apply(t1, t2, t3) : onFailure.apply(t1, t2, t3);
    }

    default public Fnc3<T1, T2, T3, R> beforeTestOnSuccess(Prc0 p, Spc<? extends R> onFailure) {
        return this.beforeTestOnSuccess(p, onFailure.toFunction().ignoring3());
    }

    default public Fnc3<T1, T2, T3, R> beforeTestOnSuccess(Prc0 p, R onFailure) {
        return this.beforeTestOnSuccess(p, Fnc3.value(onFailure));
    }

    default public Fnc3<T1, T2, T3, R> beforeTestOnSuccess(Prc0 p) {
        return this.beforeTestOnSuccess(p, Fnc3.empty());
    }

    default public Fnc3<T1, T2, T3, R> beforeTestOnFailure(Prc0 p, Fnc3<? super T1, ? super T2, ? super T3, ? extends R> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Fnc3<T1, T2, T3, R> beforeTestOnFailure(Prc0 p, Spc<? extends R> onSuccess) {
        return this.beforeTestOnFailure(p, onSuccess.toFunction().ignoring3());
    }

    default public Fnc3<T1, T2, T3, R> beforeTestOnFailure(Prc0 p, R onSuccess) {
        return this.beforeTestOnFailure(p, Fnc3.value(onSuccess));
    }

    default public Fnc3<T1, T2, T3, R> beforeTestOnFailure(Prc0 p) {
        return this.beforeTestOnFailure(p, Fnc3.empty());
    }

    default public Spc<R> beforeGet(Spc<? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> s) {
        Objects.requireNonNull(s, "s is null");
        return () -> this.tupled().apply(Tuple.narrow((s.get())));
    }

    default public Fn3<T1, T2, T3, Option<R>> lift() {
        return Fnc3.lift(this);
    }

    default public Fn3<T1, T2, T3, Try<R>> liftTry() {
        return Fnc3.liftTry(this);
    }

    default public Fnc3<T3, T2, T1, R> inverted() {
        return (t3, t2, t1) -> this.apply(t1, t2, t3);
    }

    default public <S> Fnc3<T1, T2, T3, S> afterPassingThroughApply(Fnc3<? super T1, ? super T2, ? super T3, ? extends S> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3) -> {
            this.apply(t1, t2, t3);
            return f.apply(t1, t2, t3);
        };
    }

    default public Fnc3<T1, T2, T3, R> afterPassingThroughTest(Prc3<? super T1, ? super T2, ? super T3> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3) -> {
            R result = this.apply(t1, t2, t3);
            p.test(t1, t2, t3);
            return result;
        };
    }

    default public Prc3<T1, T2, T3> afterPassingThroughTestTo(Prc3<? super T1, ? super T2, ? super T3> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3) -> {
            this.apply(t1, t2, t3);
            return p.test(t1, t2, t3);
        };
    }

    default public Fnc3<T1, T2, T3, R> afterPassingThroughAccept(Csc3<? super T1, ? super T2, ? super T3> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3) -> {
            R result = this.apply(t1, t2, t3);
            c.accept(t1, t2, t3);
            return result;
        };
    }

    default public Csc3<T1, T2, T3> afterPassingThroughAcceptTo(Csc3<? super T1, ? super T2, ? super T3> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3) -> {
            this.apply(t1, t2, t3);
            c.accept(t1, t2, t3);
        };
    }

    default public Fnc3<T1, T2, T3, R> beforePassingThroughApply(Fnc3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3) -> {
            f.apply(t1, t2, t3);
            return this.apply(t1, t2, t3);
        };
    }

    default public Fnc3<T1, T2, T3, R> beforePassingThroughTest(Prc3<? super T1, ? super T2, ? super T3> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3) -> {
            p.test(t1, t2, t3);
            return this.apply(t1, t2, t3);
        };
    }

    default public Fnc3<T1, T2, T3, R> beforePassingThroughAccept(Csc3<? super T1, ? super T2, ? super T3> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3) -> {
            c.accept(t1, t2, t3);
            return this.apply(t1, t2, t3);
        };
    }

    default public Fnc3<T1, T2, T3, R> beforeSuccessPassingThroughTest(Prc3<? super T1, ? super T2, ? super T3> p, Fnc3<? super T1, ? super T2, ? super T3, ? extends R> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3) -> p.test(t1, t2, t3) ? this.apply(t1, t2, t3) : onFailure.apply(t1, t2, t3);
    }

    default public Fnc3<T1, T2, T3, R> beforeSuccessPassingThroughTest(Prc3<? super T1, ? super T2, ? super T3> p, Spc<? extends R> onFailure) {
        return this.beforeSuccessPassingThroughTest(p, onFailure.toFunction().ignoring3());
    }

    default public Fnc3<T1, T2, T3, R> beforeSuccessPassingThroughTest(Prc3<? super T1, ? super T2, ? super T3> p, R onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Fnc3.value(onFailure));
    }

    default public Fnc3<T1, T2, T3, R> beforeSuccessPassingThroughTest(Prc3<? super T1, ? super T2, ? super T3> p) {
        return this.beforeSuccessPassingThroughTest(p, Fnc3.empty());
    }

    default public Fnc3<T1, T2, T3, R> beforeFailurePassingThroughTest(Prc3<? super T1, ? super T2, ? super T3> p, Fnc3<? super T1, ? super T2, ? super T3, ? extends R> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Fnc3<T1, T2, T3, R> beforeFailurePassingThroughTest(Prc3<? super T1, ? super T2, ? super T3> p, Spc<? extends R> onSuccess) {
        return this.beforeFailurePassingThroughTest(p, onSuccess.toFunction().ignoring3());
    }

    default public Fnc3<T1, T2, T3, R> beforeFailurePassingThroughTest(Prc3<? super T1, ? super T2, ? super T3> p, R onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Fnc3.value(onSuccess));
    }

    default public Fnc3<T1, T2, T3, R> beforeFailurePassingThroughTest(Prc3<? super T1, ? super T2, ? super T3> p) {
        return this.beforeFailurePassingThroughTest(p, Fnc3.empty());
    }

    default public Fn3<T1, T2, T3, R> unchecked() {
        return CheckedFunction3.super.unchecked()::apply;
    }

    default public Fnc1<T1, Fnc1<T2, Fnc1<T3, R>>> currying() {
        return t1 -> t2 -> t3 -> this.apply(t1, t2, t3);
    }

    default public <I1> Fnc4<I1, T1, T2, T3, R> ignoring1Lt() {
        return (i1, t1, t2, t3) -> this.apply(t1, t2, t3);
    }

    default public <I1> Fnc4<T1, T2, T3, I1, R> ignoring1Rt() {
        return (t1, t2, t3, i1) -> this.apply(t1, t2, t3);
    }

    default public <I1, I2> Fnc5<I1, I2, T1, T2, T3, R> ignoring2Lt() {
        return (i1, i2, t1, t2, t3) -> this.apply(t1, t2, t3);
    }

    default public <I1, I2> Fnc5<T1, T2, T3, I1, I2, R> ignoring2Rt() {
        return (t1, t2, t3, i1, i2) -> this.apply(t1, t2, t3);
    }

    default public <I1, I2, I3> Fnc6<I1, I2, I3, T1, T2, T3, R> ignoring3Lt() {
        return (i1, i2, i3, t1, t2, t3) -> this.apply(t1, t2, t3);
    }

    default public <I1, I2, I3> Fnc6<T1, T2, T3, I1, I2, I3, R> ignoring3Rt() {
        return (t1, t2, t3, i1, i2, i3) -> this.apply(t1, t2, t3);
    }

    default public <I1, I2, I3, I4> Fnc7<I1, I2, I3, I4, T1, T2, T3, R> ignoring4Lt() {
        return (i1, i2, i3, i4, t1, t2, t3) -> this.apply(t1, t2, t3);
    }

    default public <I1, I2, I3, I4> Fnc7<T1, T2, T3, I1, I2, I3, I4, R> ignoring4Rt() {
        return (t1, t2, t3, i1, i2, i3, i4) -> this.apply(t1, t2, t3);
    }

    default public <I1, I2, I3, I4, I5> Fnc8<I1, I2, I3, I4, I5, T1, T2, T3, R> ignoring5Lt() {
        return (i1, i2, i3, i4, i5, t1, t2, t3) -> this.apply(t1, t2, t3);
    }

    default public <I1, I2, I3, I4, I5> Fnc8<T1, T2, T3, I1, I2, I3, I4, I5, R> ignoring5Rt() {
        return (t1, t2, t3, i1, i2, i3, i4, i5) -> this.apply(t1, t2, t3);
    }

    default public Fnc2<T2, T3, R> apply(T1 t1) {
        return CheckedFunction3.super.apply(t1)::apply;
    }

    default public Fnc1<T3, R> apply(T1 t1, T2 t2) {
        return CheckedFunction3.super.apply(t1, t2)::apply;
    }

    default public Fnc1<Tuple3<T1, T2, T3>, R> tupled() {
        return CheckedFunction3.super.tupled()::apply;
    }

    default public Fn1<T1, Function1<T2, CheckedFunction1<T3, R>>> curried() {
        return CheckedFunction3.super.curried()::apply;
    }

    default public Fnc3<T3, T2, T1, R> reversed() {
        return CheckedFunction3.super.reversed()::apply;
    }

    default public Fnc3<T1, T2, T3, R> memoized() {
        return CheckedFunction3.super.memoized()::apply;
    }

    default public <V> Fnc3<T1, T2, T3, V> andThen(CheckedFunction1<? super R, ? extends V> after) {
        Objects.requireNonNull(after, "after is null");
        return CheckedFunction3.super.andThen(after)::apply;
    }

    default public Fn3<T1, T2, T3, R> recover(Function<? super Throwable, ? extends Function3<? super T1, ? super T2, ? super T3, ? extends R>> recover) {
        Objects.requireNonNull(recover, "recover is null");
        return CheckedFunction3.super.recover(recover)::apply;
    }

}

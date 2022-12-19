package com.fiberg.iterative.function;

import com.fiberg.iterative.core.IterativeInternals;
import com.fiberg.iterative.function.Cs1;
import com.fiberg.iterative.function.Cs3;
import com.fiberg.iterative.function.Fn0;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fn2;
import com.fiberg.iterative.function.Fn4;
import com.fiberg.iterative.function.Fn5;
import com.fiberg.iterative.function.Fn6;
import com.fiberg.iterative.function.Fn7;
import com.fiberg.iterative.function.Fn8;
import com.fiberg.iterative.function.Fnc3;
import com.fiberg.iterative.function.Pr0;
import com.fiberg.iterative.function.Pr1;
import com.fiberg.iterative.function.Pr3;
import com.fiberg.iterative.function.Rn;
import com.fiberg.iterative.function.Sp;
import com.fiberg.iterative.function.Spc;
import io.vavr.Function1;
import io.vavr.Function2;
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
public interface Fn3<T1, T2, T3, R> extends Function3<T1, T2, T3, R> {

    public static <T1, T2, T3, R> Fn3<T1, T2, T3, R> narrow(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        return f;
    }

    public static <T1, T2, T3, R> Fn3<T1, T2, T3, R> empty() {
        return IterativeInternals::none;
    }

    public static <T1, T2, T3, R> Fn3<T1, T2, T3, R> value(R r) {
        return (t1, t2, t3) -> r;
    }

    public static <T1, T2, T3, R> Fn3<T1, T2, T3, R> of(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        return Fn3.narrow(f);
    }

    public static <T1, T2, T3, R> Fn3<T1, T2, T3, R> of1(Fn1<? super T1, ? extends R> f) {
        return Fn3.narrow(f.ignoring2Rt());
    }

    public static <T1, T2, T3, R> Fn3<T1, T2, T3, R> of2(Fn1<? super T2, ? extends R> f) {
        return Fn3.narrow(f.ignoring1Rt().ignoring1Lt());
    }

    public static <T1, T2, T3, R> Fn3<T1, T2, T3, R> of3(Fn1<? super T3, ? extends R> f) {
        return Fn3.narrow(f.ignoring2Lt());
    }

    public static <T1, T2, T3, R> Fn1<Tuple3<T1, T2, T3>, R> tuple(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        return Fn3.of(f).tupled();
    }

    public static <T1, T2, T3, R> Fn3<T1, T2, T3, R> detuple(Fn1<? super Tuple3<? extends T1, ? extends T2, ? extends T3>, ? extends R> f) {
        return (t1, t2, t3) -> f.apply(Tuple.of(t1, t2, t3));
    }

    public static <T1, T2, T3, R> Fn3<T1, T2, T3, R> uncheck(Fnc3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fnc3.narrow(f).unchecked();
    }

    public static <T1, T2, T3, R> Fn3<T1, T2, T3, R> ignore(Fn0<? extends R> f) {
        return Fn0.narrow(f).ignoring3();
    }

    public static <T1, T2, T3, R> Fn3<T1, T2, T3, R> ignore2Rt(Fn1<? super T1, ? extends R> f) {
        return Fn1.narrow(f).ignoring2Rt();
    }

    public static <T1, T2, T3, R> Fn3<T1, T2, T3, R> ignore2Lt(Fn1<? super T3, ? extends R> f) {
        return Fn1.narrow(f).ignoring2Lt();
    }

    public static <T1, T2, T3, R> Fn3<T1, T2, T3, R> ignore1Rt(Fn2<? super T1, ? super T2, ? extends R> f) {
        return Fn2.narrow(f).ignoring1Rt();
    }

    public static <T1, T2, T3, R> Fn3<T1, T2, T3, R> ignore1Lt(Fn2<? super T2, ? super T3, ? extends R> f) {
        return Fn2.narrow(f).ignoring1Lt();
    }

    public static <T1, T2, T3, T4, R> Fn3<T1, T2, T3, R> passRt(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f, T4 t4) {
        return Fn3.narrow(f.applyRt(t4));
    }

    public static <T1, T2, T3, T4, T5, R> Fn3<T1, T2, T3, R> passRt(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f, T4 t4, T5 t5) {
        return Fn3.narrow(f.applyRt(t4, t5));
    }

    public static <T1, T2, T3, T4, T5, T6, R> Fn3<T1, T2, T3, R> passRt(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f, T4 t4, T5 t5, T6 t6) {
        return Fn3.narrow(f.applyRt(t4, t5, t6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn3<T1, T2, T3, R> passRt(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f, T4 t4, T5 t5, T6 t6, T7 t7) {
        return Fn3.narrow(f.applyRt(t4, t5, t6, t7));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn3<T1, T2, T3, R> passRt(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Fn3.narrow(f.applyRt(t4, t5, t6, t7, t8));
    }

    public static <T1, T2, T3, T4, R> Fn3<T2, T3, T4, R> passLt(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f, T1 t1) {
        return Fn3.narrow(f.applyLt(t1));
    }

    public static <T1, T2, T3, T4, T5, R> Fn3<T3, T4, T5, R> passLt(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f, T1 t1, T2 t2) {
        return Fn3.narrow(f.applyLt(t1, t2));
    }

    public static <T1, T2, T3, T4, T5, T6, R> Fn3<T4, T5, T6, R> passLt(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f, T1 t1, T2 t2, T3 t3) {
        return Fn3.narrow(f.applyLt(t1, t2, t3));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn3<T5, T6, T7, R> passLt(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4) {
        return Fn3.narrow(f.applyLt(t1, t2, t3, t4));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn3<T6, T7, T8, R> passLt(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return Fn3.narrow(f.applyLt(t1, t2, t3, t4, t5));
    }

    public static <T1, T2, T3, R> R passAndApply(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f, T1 t1, T2 t2, T3 t3) {
        return Fn0.pass(f, t1, t2, t3).apply();
    }

    public static <T1, T2, T3, R> Fn3<T1, T2, T3, Option<R>> lift(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fn3.liftTry(f).afterApply(Value::toOption);
    }

    public static <T1, T2, T3, R> Fn3<T1, T2, T3, Try<R>> liftTry(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fn3.narrow(f).beforeWrap(Try::of);
    }

    public static <T1, T2, T3, R> Fn3<T3, T2, T1, R> invert(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        return Fn3.narrow(f).inverted();
    }

    default public Fn2<T2, T3, R> applyLt(T1 t1) {
        return (t2, t3) -> this.apply(t1, t2, t3);
    }

    default public Fn1<T3, R> applyLt(T1 t1, T2 t2) {
        return t3 -> this.apply(t1, t2, t3);
    }

    default public Fn2<T1, T2, R> applyRt(T3 t3) {
        return (t1, t2) -> this.apply(t1, t2, t3);
    }

    default public Fn1<T1, R> applyRt(T2 t2, T3 t3) {
        return t1 -> this.apply(t1, t2, t3);
    }

    default public Fn0<R> toFunction(T1 t1, T2 t2, T3 t3) {
        return () -> this.apply(t1, t2, t3);
    }

    default public Rn toRunnable(T1 t1, T2 t2, T3 t3) {
        return this.toFunction(t1, t2, t3).toRunnable();
    }

    default public Cs3<T1, T2, T3> toConsumer() {
        return (arg_0, arg_1, arg_2) -> ((Fn3) this).apply(arg_0, arg_1, arg_2);
    }

    default public Sp<R> toSupplier(T1 t1, T2 t2, T3 t3) {
        return this.toFunction(t1, t2, t3).toSupplier();
    }

    default public Fn3<T1, T2, T3, R> afterRun(Rn r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2, t3) -> {
            Object value = this.apply(t1, t2, t3);
            r.run();
            return value;
        };
    }

    default public <V> Fn3<T1, T2, T3, V> afterApply(Fn1<? super R, ? extends V> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3) -> f.apply(this.apply(t1, t2, t3));
    }

    default public <V> Fn3<T1, T2, T3, V> afterApply(Fn0<? extends V> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3) -> f.ignoring1().apply(this.apply(t1, t2, t3));
    }

    default public <V> Fn3<T1, T2, T3, V> afterGet(Sp<? extends V> s) {
        Objects.requireNonNull(s, "s is null");
        return (t1, t2, t3) -> s.ignoring1().apply(this.apply(t1, t2, t3));
    }

    default public Fn3<T1, T2, T3, Boolean> afterTest(Pr1<? super R> p) {
        Objects.requireNonNull(p, "p is null");
        return this.afterTestTo(p).toFunction();
    }

    default public Pr3<T1, T2, T3> afterTestTo(Pr1<? super R> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3) -> p.test(this.apply(t1, t2, t3));
    }

    default public Cs3<T1, T2, T3> afterAcceptTo(Cs1<? super R> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3) -> c.accept(this.apply(t1, t2, t3));
    }

    default public Fn3<T1, T2, T3, R> afterAccept(Cs1<? super R> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3) -> {
            Object value = this.apply(t1, t2, t3);
            c.accept(value);
            return value;
        };
    }

    default public <W> Fn3<T1, T2, T3, W> beforeWrap(Fn1<? super Spc<R>, ? extends W> wrap) {
        Objects.requireNonNull(wrap, "wrap is null");
        return (t1, t2, t3) -> wrap.apply(this.toSupplier(t1, t2, t3).checked());
    }

    default public Fn3<T1, T2, T3, R> beforeRun(Rn r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2, t3) -> {
            r.run();
            return this.apply(t1, t2, t3);
        };
    }

    default public <B1, B2, B3> Fn3<B1, B2, B3, R> beforeApply(Fn3<? super B1, ? super B2, ? super B3, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        return this.beforeApply3(f);
    }

    default public <B1> Fn1<B1, R> beforeApply1(Fn1<? super B1, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return b1 -> this.tupled().apply(Tuple.narrow((f.apply(b1))));
    }

    default public <B1, B2> Fn2<B1, B2, R> beforeApply2(Fn2<? super B1, ? super B2, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2))));
    }

    default public <B1, B2, B3> Fn3<B1, B2, B3, R> beforeApply3(Fn3<? super B1, ? super B2, ? super B3, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3))));
    }

    default public <B1, B2, B3, B4> Fn4<B1, B2, B3, B4, R> beforeApply4(Fn4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4))));
    }

    default public <B1, B2, B3, B4, B5> Fn5<B1, B2, B3, B4, B5, R> beforeApply5(Fn5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4, b5))));
    }

    default public <B1, B2, B3, B4, B5, B6> Fn6<B1, B2, B3, B4, B5, B6, R> beforeApply6(Fn6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Fn7<B1, B2, B3, B4, B5, B6, B7, R> beforeApply7(Fn7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Fn8<B1, B2, B3, B4, B5, B6, B7, B8, R> beforeApply8(Fn8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7, b8) -> this.tupled().apply(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7, b8))));
    }

    default public Fn3<T1, T2, T3, R> beforeTestOnSuccess(Pr0 p, Fn3<? super T1, ? super T2, ? super T3, ? extends R> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3) -> p.test() ? this.apply(t1, t2, t3) : onFailure.apply(t1, t2, t3);
    }

    default public Fn3<T1, T2, T3, R> beforeTestOnSuccess(Pr0 p, Sp<? extends R> onFailure) {
        return this.beforeTestOnSuccess(p, onFailure.toFunction().ignoring3());
    }

    default public Fn3<T1, T2, T3, R> beforeTestOnSuccess(Pr0 p, R onFailure) {
        return this.beforeTestOnSuccess(p, Fn3.value(onFailure));
    }

    default public Fn3<T1, T2, T3, R> beforeTestOnSuccess(Pr0 p) {
        return this.beforeTestOnSuccess(p, Fn3.empty());
    }

    default public Fn3<T1, T2, T3, R> beforeTestOnFailure(Pr0 p, Fn3<? super T1, ? super T2, ? super T3, ? extends R> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Fn3<T1, T2, T3, R> beforeTestOnFailure(Pr0 p, Sp<? extends R> onSuccess) {
        return this.beforeTestOnFailure(p, onSuccess.toFunction().ignoring3());
    }

    default public Fn3<T1, T2, T3, R> beforeTestOnFailure(Pr0 p, R onSuccess) {
        return this.beforeTestOnFailure(p, Fn3.value(onSuccess));
    }

    default public Fn3<T1, T2, T3, R> beforeTestOnFailure(Pr0 p) {
        return this.beforeTestOnFailure(p, Fn3.empty());
    }

    default public Sp<R> beforeGet(Sp<? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> s) {
        Objects.requireNonNull(s, "s is null");
        return () -> this.tupled().apply(Tuple.narrow((s.get())));
    }

    default public Fn3<T1, T2, T3, Option<R>> lift() {
        return Fn3.lift(this);
    }

    default public Fn3<T1, T2, T3, Try<R>> liftTry() {
        return Fn3.liftTry(this);
    }

    default public Fn3<T3, T2, T1, R> inverted() {
        return (t3, t2, t1) -> this.apply(t1, t2, t3);
    }

    default public <S> Fn3<T1, T2, T3, S> afterPassingThroughApply(Fn3<? super T1, ? super T2, ? super T3, ? extends S> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3) -> {
            this.apply(t1, t2, t3);
            return f.apply(t1, t2, t3);
        };
    }

    default public Fn3<T1, T2, T3, R> afterPassingThroughTest(Pr3<? super T1, ? super T2, ? super T3> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3) -> {
            Object result = this.apply(t1, t2, t3);
            p.test(t1, t2, t3);
            return result;
        };
    }

    default public Pr3<T1, T2, T3> afterPassingThroughTestTo(Pr3<? super T1, ? super T2, ? super T3> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3) -> {
            this.apply(t1, t2, t3);
            return p.test(t1, t2, t3);
        };
    }

    default public Fn3<T1, T2, T3, R> afterPassingThroughAccept(Cs3<? super T1, ? super T2, ? super T3> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3) -> {
            Object result = this.apply(t1, t2, t3);
            c.accept(t1, t2, t3);
            return result;
        };
    }

    default public Cs3<T1, T2, T3> afterPassingThroughAcceptTo(Cs3<? super T1, ? super T2, ? super T3> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3) -> {
            this.apply(t1, t2, t3);
            c.accept(t1, t2, t3);
        };
    }

    default public Fn3<T1, T2, T3, R> beforePassingThroughApply(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3) -> {
            f.apply(t1, t2, t3);
            return this.apply(t1, t2, t3);
        };
    }

    default public Fn3<T1, T2, T3, R> beforePassingThroughTest(Pr3<? super T1, ? super T2, ? super T3> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3) -> {
            p.test(t1, t2, t3);
            return this.apply(t1, t2, t3);
        };
    }

    default public Fn3<T1, T2, T3, R> beforePassingThroughAccept(Cs3<? super T1, ? super T2, ? super T3> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3) -> {
            c.accept(t1, t2, t3);
            return this.apply(t1, t2, t3);
        };
    }

    default public Fn3<T1, T2, T3, R> beforeSuccessPassingThroughTest(Pr3<? super T1, ? super T2, ? super T3> p, Fn3<? super T1, ? super T2, ? super T3, ? extends R> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3) -> p.test(t1, t2, t3) ? this.apply(t1, t2, t3) : onFailure.apply(t1, t2, t3);
    }

    default public Fn3<T1, T2, T3, R> beforeSuccessPassingThroughTest(Pr3<? super T1, ? super T2, ? super T3> p, Sp<? extends R> onFailure) {
        return this.beforeSuccessPassingThroughTest(p, onFailure.toFunction().ignoring3());
    }

    default public Fn3<T1, T2, T3, R> beforeSuccessPassingThroughTest(Pr3<? super T1, ? super T2, ? super T3> p, R onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Fn3.value(onFailure));
    }

    default public Fn3<T1, T2, T3, R> beforeSuccessPassingThroughTest(Pr3<? super T1, ? super T2, ? super T3> p) {
        return this.beforeSuccessPassingThroughTest(p, Fn3.empty());
    }

    default public Fn3<T1, T2, T3, R> beforeFailurePassingThroughTest(Pr3<? super T1, ? super T2, ? super T3> p, Fn3<? super T1, ? super T2, ? super T3, ? extends R> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Fn3<T1, T2, T3, R> beforeFailurePassingThroughTest(Pr3<? super T1, ? super T2, ? super T3> p, Sp<? extends R> onSuccess) {
        return this.beforeFailurePassingThroughTest(p, onSuccess.toFunction().ignoring3());
    }

    default public Fn3<T1, T2, T3, R> beforeFailurePassingThroughTest(Pr3<? super T1, ? super T2, ? super T3> p, R onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Fn3.value(onSuccess));
    }

    default public Fn3<T1, T2, T3, R> beforeFailurePassingThroughTest(Pr3<? super T1, ? super T2, ? super T3> p) {
        return this.beforeFailurePassingThroughTest(p, Fn3.empty());
    }

    default public Fnc3<T1, T2, T3, R> checked() {
        return (arg_0, arg_1, arg_2) -> ((Fn3) this).apply(arg_0, arg_1, arg_2);
    }

    default public Fn1<T1, Fn1<T2, Fn1<T3, R>>> currying() {
        return t1 -> t2 -> t3 -> this.apply(t1, t2, t3);
    }

    default public <I1> Fn4<I1, T1, T2, T3, R> ignoring1Lt() {
        return (i1, t1, t2, t3) -> this.apply(t1, t2, t3);
    }

    default public <I1> Fn4<T1, T2, T3, I1, R> ignoring1Rt() {
        return (t1, t2, t3, i1) -> this.apply(t1, t2, t3);
    }

    default public <I1, I2> Fn5<I1, I2, T1, T2, T3, R> ignoring2Lt() {
        return (i1, i2, t1, t2, t3) -> this.apply(t1, t2, t3);
    }

    default public <I1, I2> Fn5<T1, T2, T3, I1, I2, R> ignoring2Rt() {
        return (t1, t2, t3, i1, i2) -> this.apply(t1, t2, t3);
    }

    default public <I1, I2, I3> Fn6<I1, I2, I3, T1, T2, T3, R> ignoring3Lt() {
        return (i1, i2, i3, t1, t2, t3) -> this.apply(t1, t2, t3);
    }

    default public <I1, I2, I3> Fn6<T1, T2, T3, I1, I2, I3, R> ignoring3Rt() {
        return (t1, t2, t3, i1, i2, i3) -> this.apply(t1, t2, t3);
    }

    default public <I1, I2, I3, I4> Fn7<I1, I2, I3, I4, T1, T2, T3, R> ignoring4Lt() {
        return (i1, i2, i3, i4, t1, t2, t3) -> this.apply(t1, t2, t3);
    }

    default public <I1, I2, I3, I4> Fn7<T1, T2, T3, I1, I2, I3, I4, R> ignoring4Rt() {
        return (t1, t2, t3, i1, i2, i3, i4) -> this.apply(t1, t2, t3);
    }

    default public <I1, I2, I3, I4, I5> Fn8<I1, I2, I3, I4, I5, T1, T2, T3, R> ignoring5Lt() {
        return (i1, i2, i3, i4, i5, t1, t2, t3) -> this.apply(t1, t2, t3);
    }

    default public <I1, I2, I3, I4, I5> Fn8<T1, T2, T3, I1, I2, I3, I4, I5, R> ignoring5Rt() {
        return (t1, t2, t3, i1, i2, i3, i4, i5) -> this.apply(t1, t2, t3);
    }

    default public Fn2<T2, T3, R> apply(T1 t1) {
        return (arg_0, arg_1) -> ((Function2) super.apply(t1)).apply(arg_0, arg_1);
    }

    default public Fn1<T3, R> apply(T1 t1, T2 t2) {
        return ((Function1) super.apply(t1, t2))::apply;
    }

    default public Fn1<Tuple3<T1, T2, T3>, R> tupled() {
        return ((Function1) super.tupled())::apply;
    }

    default public Fn1<T1, Function1<T2, Function1<T3, R>>> curried() {
        return ((Function1) super.curried())::apply;
    }

    default public Fn3<T3, T2, T1, R> reversed() {
        return (arg_0, arg_1, arg_2) -> ((Function3) super.reversed()).apply(arg_0, arg_1, arg_2);
    }

    default public Fn3<T1, T2, T3, R> memoized() {
        return (arg_0, arg_1, arg_2) -> ((Function3) super.memoized()).apply(arg_0, arg_1, arg_2);
    }

    default public <V> Fn3<T1, T2, T3, V> andThen(Function<? super R, ? extends V> after) {
        Objects.requireNonNull(after, "after is null");
        return (arg_0, arg_1, arg_2) -> ((Function3) super.andThen(after)).apply(arg_0, arg_1, arg_2);
    }

}

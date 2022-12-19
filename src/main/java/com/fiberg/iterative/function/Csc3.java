package com.fiberg.iterative.function;

import com.fiberg.iterative.function.Cs3;
import com.fiberg.iterative.function.Csc1;
import com.fiberg.iterative.function.Csc2;
import com.fiberg.iterative.function.Csc4;
import com.fiberg.iterative.function.Csc5;
import com.fiberg.iterative.function.Csc6;
import com.fiberg.iterative.function.Csc7;
import com.fiberg.iterative.function.Csc8;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fnc0;
import com.fiberg.iterative.function.Fnc1;
import com.fiberg.iterative.function.Fnc2;
import com.fiberg.iterative.function.Fnc3;
import com.fiberg.iterative.function.Fnc4;
import com.fiberg.iterative.function.Fnc5;
import com.fiberg.iterative.function.Fnc6;
import com.fiberg.iterative.function.Fnc7;
import com.fiberg.iterative.function.Fnc8;
import com.fiberg.iterative.function.Prc0;
import com.fiberg.iterative.function.Prc3;
import com.fiberg.iterative.function.Rnc;
import com.fiberg.iterative.function.SneakyThrow;
import com.fiberg.iterative.function.Spc;
import io.vavr.Tuple;
import io.vavr.Tuple3;
import java.io.Serializable;
import java.util.Objects;

@FunctionalInterface
public interface Csc3<T1, T2, T3> {

    public static <T1, T2, T3> Csc3<T1, T2, T3> narrow(Csc3<? super T1, ? super T2, ? super T3> c) {
        @SuppressWarnings("unchecked")
        final Csc3<T1, T2, T3> csc = (Csc3<T1, T2, T3>) c;
        return csc;
    }

    public static <T1, T2, T3> Csc3<T1, T2, T3> empty() {
        return (t1, t2, t3) -> {};
    }

    public static <T1, T2, T3> Csc3<T1, T2, T3> of(Csc3<? super T1, ? super T2, ? super T3> c) {
        return Csc3.narrow(c);
    }

    public static <T1, T2, T3> Csc3<T1, T2, T3> of1(Csc1<? super T1> f) {
        return Csc3.<T1, T2, T3>narrow(f.ignoring2Rt());
    }

    public static <T1, T2, T3> Csc3<T1, T2, T3> of2(Csc1<? super T2> f) {
        return Csc3.<T1, T2, T3>narrow(f.ignoring1Rt().ignoring1Lt());
    }

    public static <T1, T2, T3> Csc3<T1, T2, T3> of3(Csc1<? super T3> f) {
        return Csc3.<T1, T2, T3>narrow(f.ignoring2Lt());
    }

    public static <T1, T2, T3> Csc1<Tuple3<T1, T2, T3>> tuple(Csc3<? super T1, ? super T2, ? super T3> c) {
        return Csc3.<T1, T2, T3>of(c).tupled();
    }

    public static <T1, T2, T3> Csc3<T1, T2, T3> detuple(Csc1<? super Tuple3<? extends T1, ? extends T2, ? extends T3>> c) {
        return (t1, t2, t3) -> c.accept(Tuple.of(t1, t2, t3));
    }

    public static <T1, T2, T3> Csc3<T1, T2, T3> check(Cs3<? super T1, ? super T2, ? super T3> c) {
        Objects.requireNonNull(c, "c is null");
        return Cs3.<T1, T2, T3>narrow(c).checked();
    }

    public static <T1, T2, T3> Csc3<T1, T2, T3> ignore2Rt(Csc1<? super T1> c) {
        return Csc1.<T1>narrow(c).ignoring2Rt();
    }

    public static <T1, T2, T3> Csc3<T1, T2, T3> ignore2Lt(Csc1<? super T3> c) {
        return Csc1.<T3>narrow(c).ignoring2Lt();
    }

    public static <T1, T2, T3> Csc3<T1, T2, T3> ignore1Rt(Csc2<? super T1, ? super T2> c) {
        return Csc2.<T1, T2>narrow(c).ignoring1Rt();
    }

    public static <T1, T2, T3> Csc3<T1, T2, T3> ignore1Lt(Csc2<? super T2, ? super T3> c) {
        return Csc2.<T2, T3>narrow(c).ignoring1Lt();
    }

    public static <T1, T2, T3, T4> Csc3<T1, T2, T3> passRt(Csc4<? super T1, ? super T2, ? super T3, ? super T4> c, T4 t4) {
        return Csc3.narrow(c.acceptRt(t4));
    }

    public static <T1, T2, T3, T4, T5> Csc3<T1, T2, T3> passRt(Csc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c, T4 t4, T5 t5) {
        return Csc3.narrow(c.acceptRt(t4, t5));
    }

    public static <T1, T2, T3, T4, T5, T6> Csc3<T1, T2, T3> passRt(Csc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c, T4 t4, T5 t5, T6 t6) {
        return Csc3.narrow(c.acceptRt(t4, t5, t6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Csc3<T1, T2, T3> passRt(Csc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c, T4 t4, T5 t5, T6 t6, T7 t7) {
        return Csc3.narrow(c.acceptRt(t4, t5, t6, t7));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc3<T1, T2, T3> passRt(Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Csc3.narrow(c.acceptRt(t4, t5, t6, t7, t8));
    }

    public static <T1, T2, T3, T4> Csc3<T2, T3, T4> passLt(Csc4<? super T1, ? super T2, ? super T3, ? super T4> c, T1 t1) {
        return Csc3.narrow(c.acceptLt(t1));
    }

    public static <T1, T2, T3, T4, T5> Csc3<T3, T4, T5> passLt(Csc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c, T1 t1, T2 t2) {
        return Csc3.narrow(c.acceptLt(t1, t2));
    }

    public static <T1, T2, T3, T4, T5, T6> Csc3<T4, T5, T6> passLt(Csc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c, T1 t1, T2 t2, T3 t3) {
        return Csc3.narrow(c.acceptLt(t1, t2, t3));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Csc3<T5, T6, T7> passLt(Csc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c, T1 t1, T2 t2, T3 t3, T4 t4) {
        return Csc3.narrow(c.acceptLt(t1, t2, t3, t4));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc3<T6, T7, T8> passLt(Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return Csc3.narrow(c.acceptLt(t1, t2, t3, t4, t5));
    }

    public static <T1, T2, T3> Csc3<T3, T2, T1> invert(Csc3<? super T1, ? super T2, ? super T3> c) {
        return Csc3.<T1, T2, T3>narrow(c).inverted();
    }

    public void accept(T1 t1, T2 t2, T3 t3) throws Throwable;

    default public Csc2<T2, T3> acceptLt(T1 t1) {
        return (t2, t3) -> this.accept(t1, t2, t3);
    }

    default public Csc1<T3> acceptLt(T1 t1, T2 t2) {
        return t3 -> this.accept(t1, t2, t3);
    }

    default public Csc2<T1, T2> acceptRt(T3 t3) {
        return (t1, t2) -> this.accept(t1, t2, t3);
    }

    default public Csc1<T1> acceptRt(T2 t2, T3 t3) {
        return t1 -> this.accept(t1, t2, t3);
    }

    default public <R> Fnc3<T1, T2, T3, R> toFunction(R r) {
        return (t1, t2, t3) -> {
            this.accept(t1, t2, t3);
            return r;
        };
    }

    default public Prc3<T1, T2, T3> toPredicate(boolean b) {
        return (t1, t2, t3) -> {
            this.accept(t1, t2, t3);
            return b;
        };
    }

    default public Rnc toRunnable(T1 t1, T2 t2, T3 t3) {
        return () -> this.accept(t1, t2, t3);
    }

    default public Csc3<T1, T2, T3> afterRun(Rnc r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2, t3) -> {
            this.accept(t1, t2, t3);
            r.run();
        };
    }

    default public <R> Csc3<T1, T2, T3> afterApply(Fnc0<? super R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.afterApplyTo(f).toConsumer();
    }

    default public <R> Fnc3<T1, T2, T3, R> afterApplyTo(Fnc0<? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3) -> {
            this.accept(t1, t2, t3);
            return f.apply();
        };
    }

    default public Csc3<T1, T2, T3> afterTest(Prc0 p) {
        Objects.requireNonNull(p, "p is null");
        return this.afterTestTo(p).toConsumer();
    }

    default public Prc3<T1, T2, T3> afterTestTo(Prc0 p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3) -> {
            this.accept(t1, t2, t3);
            return p.test();
        };
    }

    default public <R> Fnc3<T1, T2, T3, R> afterGet(Spc<? extends R> s) {
        return (t1, t2, t3) -> {
            this.accept(t1, t2, t3);
            return s.get();
        };
    }

    default public Csc3<T1, T2, T3> beforeRun(Rnc r) {
        return (t1, t2, t3) -> {
            r.run();
            this.accept(t1, t2, t3);
        };
    }

    default public <B1, B2, B3> Csc3<B1, B2, B3> beforeApply(Fnc3<? super B1, ? super B2, ? super B3, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        return this.beforeApply3(f);
    }

    default public <B1> Csc1<B1> beforeApply1(Fnc1<? super B1, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return b1 -> this.tupled().accept(Tuple.narrow((f.apply(b1))));
    }

    default public <B1, B2> Csc2<B1, B2> beforeApply2(Fnc2<? super B1, ? super B2, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2))));
    }

    default public <B1, B2, B3> Csc3<B1, B2, B3> beforeApply3(Fnc3<? super B1, ? super B2, ? super B3, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2, b3))));
    }

    default public <B1, B2, B3, B4> Csc4<B1, B2, B3, B4> beforeApply4(Fnc4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2, b3, b4))));
    }

    default public <B1, B2, B3, B4, B5> Csc5<B1, B2, B3, B4, B5> beforeApply5(Fnc5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2, b3, b4, b5))));
    }

    default public <B1, B2, B3, B4, B5, B6> Csc6<B1, B2, B3, B4, B5, B6> beforeApply6(Fnc6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Csc7<B1, B2, B3, B4, B5, B6, B7> beforeApply7(Fnc7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Csc8<B1, B2, B3, B4, B5, B6, B7, B8> beforeApply8(Fnc8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7, b8) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7, b8))));
    }

    default public Csc3<T1, T2, T3> beforeTestOnSuccess(Prc0 p, Csc3<? super T1, ? super T2, ? super T3> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3) -> (p.test() != false ? this : Csc3.<T1, T2, T3>narrow(onFailure)).accept(t1, t2, t3);
    }

    default public Csc3<T1, T2, T3> beforeTestOnSuccess(Prc0 p) {
        return this.beforeTestOnSuccess(p, Csc3.empty());
    }

    default public Csc3<T1, T2, T3> beforeTestOnFailure(Prc0 p, Csc3<? super T1, ? super T2, ? super T3> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Csc3<T1, T2, T3> beforeTestOnFailure(Prc0 p) {
        return this.beforeTestOnFailure(p, Csc3.empty());
    }

    default public Rnc beforeGet(Spc<? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> s) {
        Objects.requireNonNull(s, "s is null");
        return () -> this.tupled().accept(Tuple.narrow((s.get())));
    }

    default public Csc3<T3, T2, T1> inverted() {
        return (t3, t2, t1) -> this.accept(t1, t2, t3);
    }

    default public <S> Csc3<T1, T2, T3> afterPassingThroughApply(Fnc3<? super T1, ? super T2, ? super T3, ? extends S> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3) -> {
            this.accept(t1, t2, t3);
            f.apply(t1, t2, t3);
        };
    }

    default public <S> Fnc3<T1, T2, T3, S> afterPassingThroughApplyTo(Fnc3<? super T1, ? super T2, ? super T3, ? extends S> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3) -> {
            this.accept(t1, t2, t3);
            return f.apply(t1, t2, t3);
        };
    }

    default public Csc3<T1, T2, T3> afterPassingThroughTest(Prc3<? super T1, ? super T2, ? super T3> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3) -> {
            this.accept(t1, t2, t3);
            p.test(t1, t2, t3);
        };
    }

    default public Prc3<T1, T2, T3> afterPassingThroughTestTo(Prc3<? super T1, ? super T2, ? super T3> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3) -> {
            this.accept(t1, t2, t3);
            return p.test(t1, t2, t3);
        };
    }

    default public Csc3<T1, T2, T3> afterPassingThroughAccept(Csc3<? super T1, ? super T2, ? super T3> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3) -> {
            this.accept(t1, t2, t3);
            c.accept(t1, t2, t3);
        };
    }

    default public <R> Csc3<T1, T2, T3> beforePassingThroughApply(Fnc3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3) -> {
            f.apply(t1, t2, t3);
            this.accept(t1, t2, t3);
        };
    }

    default public Csc3<T1, T2, T3> beforePassingThroughTest(Prc3<? super T1, ? super T2, ? super T3> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3) -> {
            p.test(t1, t2, t3);
            this.accept(t1, t2, t3);
        };
    }

    default public Csc3<T1, T2, T3> beforePassingThroughAccept(Csc3<? super T1, ? super T2, ? super T3> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3) -> {
            c.accept(t1, t2, t3);
            this.accept(t1, t2, t3);
        };
    }

    default public Csc3<T1, T2, T3> beforeSuccessPassingThroughTest(Prc3<? super T1, ? super T2, ? super T3> p, Csc3<? super T1, ? super T2, ? super T3> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3) -> (p.test(t1, t2, t3) ? this : Csc3.<T1, T2, T3>narrow(onFailure)).accept(t1, t2, t3);
    }

    default public Csc3<T1, T2, T3> beforeSuccessPassingThroughTest(Prc3<? super T1, ? super T2, ? super T3> p) {
        return this.beforeSuccessPassingThroughTest(p, Csc3.empty());
    }

    default public Csc3<T1, T2, T3> beforeFailurePassingThroughTest(Prc3<? super T1, ? super T2, ? super T3> p, Csc3<? super T1, ? super T2, ? super T3> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Csc3<T1, T2, T3> beforeFailurePassingThroughTest(Prc3<? super T1, ? super T2, ? super T3> p) {
        return this.beforeFailurePassingThroughTest(p, Csc3.empty());
    }

    default public Csc1<Tuple3<T1, T2, T3>> tupled() {
        return tuple -> this.accept(tuple._1(), tuple._2(), tuple._3());
    }

    default public Fnc1<T1, Fnc1<T2, Csc1<T3>>> currying() {
        return t1 -> t2 -> t3 -> this.accept(t1, t2, t3);
    }

    default public Cs3<T1, T2, T3> unchecked() {
        return (t1, t2, t3) -> {
            try {
                this.accept(t1, t2, t3);
            }
            catch (Throwable t) {
                SneakyThrow.sneakyThrow(t);
            }
        };
    }

    default public <I1> Csc4<I1, T1, T2, T3> ignoring1Lt() {
        return (i1, t1, t2, t3) -> this.accept(t1, t2, t3);
    }

    default public <I1> Csc4<T1, T2, T3, I1> ignoring1Rt() {
        return (t1, t2, t3, i1) -> this.accept(t1, t2, t3);
    }

    default public <I1, I2> Csc5<I1, I2, T1, T2, T3> ignoring2Lt() {
        return (i1, i2, t1, t2, t3) -> this.accept(t1, t2, t3);
    }

    default public <I1, I2> Csc5<T1, T2, T3, I1, I2> ignoring2Rt() {
        return (t1, t2, t3, i1, i2) -> this.accept(t1, t2, t3);
    }

    default public <I1, I2, I3> Csc6<I1, I2, I3, T1, T2, T3> ignoring3Lt() {
        return (i1, i2, i3, t1, t2, t3) -> this.accept(t1, t2, t3);
    }

    default public <I1, I2, I3> Csc6<T1, T2, T3, I1, I2, I3> ignoring3Rt() {
        return (t1, t2, t3, i1, i2, i3) -> this.accept(t1, t2, t3);
    }

    default public <I1, I2, I3, I4> Csc7<I1, I2, I3, I4, T1, T2, T3> ignoring4Lt() {
        return (i1, i2, i3, i4, t1, t2, t3) -> this.accept(t1, t2, t3);
    }

    default public <I1, I2, I3, I4> Csc7<T1, T2, T3, I1, I2, I3, I4> ignoring4Rt() {
        return (t1, t2, t3, i1, i2, i3, i4) -> this.accept(t1, t2, t3);
    }

    default public <I1, I2, I3, I4, I5> Csc8<I1, I2, I3, I4, I5, T1, T2, T3> ignoring5Lt() {
        return (i1, i2, i3, i4, i5, t1, t2, t3) -> this.accept(t1, t2, t3);
    }

    default public <I1, I2, I3, I4, I5> Csc8<T1, T2, T3, I1, I2, I3, I4, I5> ignoring5Rt() {
        return (t1, t2, t3, i1, i2, i3, i4, i5) -> this.accept(t1, t2, t3);
    }

    default public Cs3<T1, T2, T3> recover(Fn1<? super Throwable, ? extends Cs3<? super T1, ? super T2, ? super T3>> recover) {
        Objects.requireNonNull(recover, "recover is null");
        return (t1, t2, t3) -> {
            try {
                this.accept(t1, t2, t3);
            }
            catch (Throwable throwable) {
                Cs3<? super T1, ? super T2, ? super T3> cons = recover.apply(throwable);
                Objects.requireNonNull(cons, () -> "recover return null for " + throwable.getClass() + ": " + throwable.getMessage());
                cons.accept(t1, t2, t3);
            }
        };
    }

}

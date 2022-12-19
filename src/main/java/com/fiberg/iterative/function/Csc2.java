package com.fiberg.iterative.function;

import com.fiberg.iterative.function.Cs2;
import com.fiberg.iterative.function.Csc1;
import com.fiberg.iterative.function.Csc3;
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
import com.fiberg.iterative.function.Prc2;
import com.fiberg.iterative.function.Rnc;
import com.fiberg.iterative.function.SneakyThrow;
import com.fiberg.iterative.function.Spc;
import io.vavr.Tuple;
import io.vavr.Tuple2;
import java.io.Serializable;
import java.util.Objects;

@FunctionalInterface
public interface Csc2<T1, T2> {

    public static <T1, T2> Csc2<T1, T2> narrow(Csc2<? super T1, ? super T2> c) {
        return c;
    }

    public static <T1, T2> Csc2<T1, T2> empty() {
        return (t1, t2) -> {};
    }

    public static <T1, T2> Csc2<T1, T2> of(Csc2<? super T1, ? super T2> c) {
        return Csc2.narrow(c);
    }

    public static <T1, T2> Csc2<T1, T2> of1(Csc1<? super T1> f) {
        return Csc2.narrow(f.ignoring1Rt());
    }

    public static <T1, T2> Csc2<T1, T2> of2(Csc1<? super T2> f) {
        return Csc2.narrow(f.ignoring1Lt());
    }

    public static <T1, T2> Csc1<Tuple2<T1, T2>> tuple(Csc2<? super T1, ? super T2> c) {
        return Csc2.of(c).tupled();
    }

    public static <T1, T2> Csc2<T1, T2> detuple(Csc1<? super Tuple2<? extends T1, ? extends T2>> c) {
        return (t1, t2) -> c.accept(Tuple.of(t1, t2));
    }

    public static <T1, T2> Csc2<T1, T2> check(Cs2<? super T1, ? super T2> c) {
        Objects.requireNonNull(c, "c is null");
        return Cs2.narrow(c).checked();
    }

    public static <T1, T2> Csc2<T1, T2> ignoreRt(Csc1<? super T1> c) {
        return Csc1.narrow(c).ignoring1Rt();
    }

    public static <T1, T2> Csc2<T1, T2> ignoreLt(Csc1<? super T2> c) {
        return Csc1.narrow(c).ignoring1Lt();
    }

    public static <T1, T2, T3> Csc2<T1, T2> passRt(Csc3<? super T1, ? super T2, ? super T3> c, T3 t3) {
        return Csc2.narrow(c.acceptRt(t3));
    }

    public static <T1, T2, T3, T4> Csc2<T1, T2> passRt(Csc4<? super T1, ? super T2, ? super T3, ? super T4> c, T3 t3, T4 t4) {
        return Csc2.narrow(c.acceptRt(t3, t4));
    }

    public static <T1, T2, T3, T4, T5> Csc2<T1, T2> passRt(Csc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c, T3 t3, T4 t4, T5 t5) {
        return Csc2.narrow(c.acceptRt(t3, t4, t5));
    }

    public static <T1, T2, T3, T4, T5, T6> Csc2<T1, T2> passRt(Csc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c, T3 t3, T4 t4, T5 t5, T6 t6) {
        return Csc2.narrow(c.acceptRt(t3, t4, t5, t6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Csc2<T1, T2> passRt(Csc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return Csc2.narrow(c.acceptRt(t3, t4, t5, t6, t7));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc2<T1, T2> passRt(Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Csc2.narrow(c.acceptRt(t3, t4, t5, t6, t7, t8));
    }

    public static <T1, T2, T3> Csc2<T2, T3> passLt(Csc3<? super T1, ? super T2, ? super T3> c, T1 t1) {
        return Csc2.narrow(c.acceptLt(t1));
    }

    public static <T1, T2, T3, T4> Csc2<T3, T4> passLt(Csc4<? super T1, ? super T2, ? super T3, ? super T4> c, T1 t1, T2 t2) {
        return Csc2.narrow(c.acceptLt(t1, t2));
    }

    public static <T1, T2, T3, T4, T5> Csc2<T4, T5> passLt(Csc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c, T1 t1, T2 t2, T3 t3) {
        return Csc2.narrow(c.acceptLt(t1, t2, t3));
    }

    public static <T1, T2, T3, T4, T5, T6> Csc2<T5, T6> passLt(Csc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c, T1 t1, T2 t2, T3 t3, T4 t4) {
        return Csc2.narrow(c.acceptLt(t1, t2, t3, t4));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Csc2<T6, T7> passLt(Csc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return Csc2.narrow(c.acceptLt(t1, t2, t3, t4, t5));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc2<T7, T8> passLt(Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return Csc2.narrow(c.acceptLt(t1, t2, t3, t4, t5, t6));
    }

    public static <T1, T2> Csc2<T2, T1> invert(Csc2<? super T1, ? super T2> c) {
        return Csc2.narrow(c).inverted();
    }

    public void accept(T1 var1, T2 var2) throws Throwable;

    default public Csc1<T2> acceptLt(T1 t1) {
        return t2 -> this.accept(t1, t2);
    }

    default public Csc1<T1> acceptRt(T2 t2) {
        return t1 -> this.accept(t1, t2);
    }

    default public <R> Fnc2<T1, T2, R> toFunction(R r) {
        return (t1, t2) -> {
            this.accept(t1, t2);
            return r;
        };
    }

    default public Prc2<T1, T2> toPredicate(boolean b) {
        return (t1, t2) -> {
            this.accept(t1, t2);
            return b;
        };
    }

    default public Rnc toRunnable(T1 t1, T2 t2) {
        return () -> this.accept(t1, t2);
    }

    default public Csc2<T1, T2> afterRun(Rnc r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2) -> {
            this.accept(t1, t2);
            r.run();
        };
    }

    default public <R> Csc2<T1, T2> afterApply(Fnc0<? super R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.afterApplyTo(f).toConsumer();
    }

    default public <R> Fnc2<T1, T2, R> afterApplyTo(Fnc0<? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2) -> {
            this.accept(t1, t2);
            return f.apply();
        };
    }

    default public Csc2<T1, T2> afterTest(Prc0 p) {
        Objects.requireNonNull(p, "p is null");
        return this.afterTestTo(p).toConsumer();
    }

    default public Prc2<T1, T2> afterTestTo(Prc0 p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2) -> {
            this.accept(t1, t2);
            return p.test();
        };
    }

    default public <R> Fnc2<T1, T2, R> afterGet(Spc<? extends R> s) {
        return (t1, t2) -> {
            this.accept(t1, t2);
            return s.get();
        };
    }

    default public Csc2<T1, T2> beforeRun(Rnc r) {
        return (t1, t2) -> {
            r.run();
            this.accept(t1, t2);
        };
    }

    default public <B1, B2> Csc2<B1, B2> beforeApply(Fnc2<? super B1, ? super B2, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        return this.beforeApply2(f);
    }

    default public <B1> Csc1<B1> beforeApply1(Fnc1<? super B1, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return b1 -> this.tupled().accept(Tuple.narrow((f.apply(b1))));
    }

    default public <B1, B2> Csc2<B1, B2> beforeApply2(Fnc2<? super B1, ? super B2, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2))));
    }

    default public <B1, B2, B3> Csc3<B1, B2, B3> beforeApply3(Fnc3<? super B1, ? super B2, ? super B3, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2, b3))));
    }

    default public <B1, B2, B3, B4> Csc4<B1, B2, B3, B4> beforeApply4(Fnc4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2, b3, b4))));
    }

    default public <B1, B2, B3, B4, B5> Csc5<B1, B2, B3, B4, B5> beforeApply5(Fnc5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2, b3, b4, b5))));
    }

    default public <B1, B2, B3, B4, B5, B6> Csc6<B1, B2, B3, B4, B5, B6> beforeApply6(Fnc6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Csc7<B1, B2, B3, B4, B5, B6, B7> beforeApply7(Fnc7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Csc8<B1, B2, B3, B4, B5, B6, B7, B8> beforeApply8(Fnc8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7, b8) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7, b8))));
    }

    default public Csc2<T1, T2> beforeTestOnSuccess(Prc0 p, Csc2<? super T1, ? super T2> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2) -> (p.test() != false ? this : Csc2.narrow(onFailure)).accept(t1, t2);
    }

    default public Csc2<T1, T2> beforeTestOnSuccess(Prc0 p) {
        return this.beforeTestOnSuccess(p, Csc2.empty());
    }

    default public Csc2<T1, T2> beforeTestOnFailure(Prc0 p, Csc2<? super T1, ? super T2> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Csc2<T1, T2> beforeTestOnFailure(Prc0 p) {
        return this.beforeTestOnFailure(p, Csc2.empty());
    }

    default public Rnc beforeGet(Spc<? extends Tuple2<? extends T1, ? extends T2>> s) {
        Objects.requireNonNull(s, "s is null");
        return () -> this.tupled().accept(Tuple.narrow((s.get())));
    }

    default public Csc2<T2, T1> inverted() {
        return (t2, t1) -> this.accept(t1, t2);
    }

    default public <S> Csc2<T1, T2> afterPassingThroughApply(Fnc2<? super T1, ? super T2, ? extends S> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2) -> {
            this.accept(t1, t2);
            f.apply(t1, t2);
        };
    }

    default public <S> Fnc2<T1, T2, S> afterPassingThroughApplyTo(Fnc2<? super T1, ? super T2, ? extends S> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2) -> {
            this.accept(t1, t2);
            return f.apply(t1, t2);
        };
    }

    default public Csc2<T1, T2> afterPassingThroughTest(Prc2<? super T1, ? super T2> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2) -> {
            this.accept(t1, t2);
            p.test(t1, t2);
        };
    }

    default public Prc2<T1, T2> afterPassingThroughTestTo(Prc2<? super T1, ? super T2> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2) -> {
            this.accept(t1, t2);
            return p.test(t1, t2);
        };
    }

    default public Csc2<T1, T2> afterPassingThroughAccept(Csc2<? super T1, ? super T2> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2) -> {
            this.accept(t1, t2);
            c.accept(t1, t2);
        };
    }

    default public <R> Csc2<T1, T2> beforePassingThroughApply(Fnc2<? super T1, ? super T2, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2) -> {
            f.apply(t1, t2);
            this.accept(t1, t2);
        };
    }

    default public Csc2<T1, T2> beforePassingThroughTest(Prc2<? super T1, ? super T2> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2) -> {
            p.test(t1, t2);
            this.accept(t1, t2);
        };
    }

    default public Csc2<T1, T2> beforePassingThroughAccept(Csc2<? super T1, ? super T2> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2) -> {
            c.accept(t1, t2);
            this.accept(t1, t2);
        };
    }

    default public Csc2<T1, T2> beforeSuccessPassingThroughTest(Prc2<? super T1, ? super T2> p, Csc2<? super T1, ? super T2> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2) -> (p.test(t1, t2) ? this : Csc2.narrow(onFailure)).accept(t1, t2);
    }

    default public Csc2<T1, T2> beforeSuccessPassingThroughTest(Prc2<? super T1, ? super T2> p) {
        return this.beforeSuccessPassingThroughTest(p, Csc2.empty());
    }

    default public Csc2<T1, T2> beforeFailurePassingThroughTest(Prc2<? super T1, ? super T2> p, Csc2<? super T1, ? super T2> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Csc2<T1, T2> beforeFailurePassingThroughTest(Prc2<? super T1, ? super T2> p) {
        return this.beforeFailurePassingThroughTest(p, Csc2.empty());
    }

    default public Csc1<Tuple2<T1, T2>> tupled() {
        return tuple -> this.accept(tuple._1(), tuple._2());
    }

    default public Fnc1<T1, Csc1<T2>> currying() {
        return t1 -> t2 -> this.accept(t1, t2);
    }

    default public Cs2<T1, T2> unchecked() {
        return (t1, t2) -> {
            try {
                this.accept(t1, t2);
            }
            catch (Throwable t) {
                SneakyThrow.sneakyThrow(t);
            }

        };
    }

    default public <I1> Csc3<I1, T1, T2> ignoring1Lt() {
        return (i1, t1, t2) -> this.accept(t1, t2);
    }

    default public <I1> Csc3<T1, T2, I1> ignoring1Rt() {
        return (t1, t2, i1) -> this.accept(t1, t2);
    }

    default public <I1, I2> Csc4<I1, I2, T1, T2> ignoring2Lt() {
        return (i1, i2, t1, t2) -> this.accept(t1, t2);
    }

    default public <I1, I2> Csc4<T1, T2, I1, I2> ignoring2Rt() {
        return (t1, t2, i1, i2) -> this.accept(t1, t2);
    }

    default public <I1, I2, I3> Csc5<I1, I2, I3, T1, T2> ignoring3Lt() {
        return (i1, i2, i3, t1, t2) -> this.accept(t1, t2);
    }

    default public <I1, I2, I3> Csc5<T1, T2, I1, I2, I3> ignoring3Rt() {
        return (t1, t2, i1, i2, i3) -> this.accept(t1, t2);
    }

    default public <I1, I2, I3, I4> Csc6<I1, I2, I3, I4, T1, T2> ignoring4Lt() {
        return (i1, i2, i3, i4, t1, t2) -> this.accept(t1, t2);
    }

    default public <I1, I2, I3, I4> Csc6<T1, T2, I1, I2, I3, I4> ignoring4Rt() {
        return (t1, t2, i1, i2, i3, i4) -> this.accept(t1, t2);
    }

    default public <I1, I2, I3, I4, I5> Csc7<I1, I2, I3, I4, I5, T1, T2> ignoring5Lt() {
        return (i1, i2, i3, i4, i5, t1, t2) -> this.accept(t1, t2);
    }

    default public <I1, I2, I3, I4, I5> Csc7<T1, T2, I1, I2, I3, I4, I5> ignoring5Rt() {
        return (t1, t2, i1, i2, i3, i4, i5) -> this.accept(t1, t2);
    }

    default public <I1, I2, I3, I4, I5, I6> Csc8<I1, I2, I3, I4, I5, I6, T1, T2> ignoring6Lt() {
        return (i1, i2, i3, i4, i5, i6, t1, t2) -> this.accept(t1, t2);
    }

    default public <I1, I2, I3, I4, I5, I6> Csc8<T1, T2, I1, I2, I3, I4, I5, I6> ignoring6Rt() {
        return (t1, t2, i1, i2, i3, i4, i5, i6) -> this.accept(t1, t2);
    }

    default public Cs2<T1, T2> recover(Fn1<? super Throwable, ? extends Cs2<? super T1, ? super T2>> recover) {
        Objects.requireNonNull(recover, "recover is null");
        return (t1, t2) -> {
            try {
                this.accept(t1, t2);
            }
            catch (Throwable throwable) {
                Cs2 cons = (Cs2) recover.apply(throwable);
                Objects.requireNonNull(cons, () -> "recover return null for " + throwable.getClass() + ": " + throwable.getMessage());
                cons.accept(t1, t2);
            }

        };
    }

}

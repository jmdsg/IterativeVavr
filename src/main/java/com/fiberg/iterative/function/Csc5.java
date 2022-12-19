package com.fiberg.iterative.function;

import com.fiberg.iterative.function.Cs5;
import com.fiberg.iterative.function.Csc1;
import com.fiberg.iterative.function.Csc2;
import com.fiberg.iterative.function.Csc3;
import com.fiberg.iterative.function.Csc4;
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
import com.fiberg.iterative.function.Prc5;
import com.fiberg.iterative.function.Rnc;
import com.fiberg.iterative.function.SneakyThrow;
import com.fiberg.iterative.function.Spc;
import io.vavr.Tuple;
import io.vavr.Tuple5;
import java.io.Serializable;
import java.util.Objects;

@FunctionalInterface
public interface Csc5<T1, T2, T3, T4, T5> {

    public static <T1, T2, T3, T4, T5> Csc5<T1, T2, T3, T4, T5> narrow(Csc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        return c;
    }

    public static <T1, T2, T3, T4, T5> Csc5<T1, T2, T3, T4, T5> empty() {
        return (t1, t2, t3, t4, t5) -> {};
    }

    public static <T1, T2, T3, T4, T5> Csc5<T1, T2, T3, T4, T5> of(Csc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        return Csc5.narrow(c);
    }

    public static <T1, T2, T3, T4, T5> Csc5<T1, T2, T3, T4, T5> of1(Csc1<? super T1> f) {
        return Csc5.narrow(f.ignoring4Rt());
    }

    public static <T1, T2, T3, T4, T5> Csc5<T1, T2, T3, T4, T5> of2(Csc1<? super T2> f) {
        return Csc5.narrow(f.ignoring3Rt().ignoring1Lt());
    }

    public static <T1, T2, T3, T4, T5> Csc5<T1, T2, T3, T4, T5> of3(Csc1<? super T3> f) {
        return Csc5.narrow(f.ignoring2Rt().ignoring2Lt());
    }

    public static <T1, T2, T3, T4, T5> Csc5<T1, T2, T3, T4, T5> of4(Csc1<? super T4> f) {
        return Csc5.narrow(f.ignoring1Rt().ignoring3Lt());
    }

    public static <T1, T2, T3, T4, T5> Csc5<T1, T2, T3, T4, T5> of5(Csc1<? super T5> f) {
        return Csc5.narrow(f.ignoring4Lt());
    }

    public static <T1, T2, T3, T4, T5> Csc1<Tuple5<T1, T2, T3, T4, T5>> tuple(Csc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        return Csc5.of(c).tupled();
    }

    public static <T1, T2, T3, T4, T5> Csc5<T1, T2, T3, T4, T5> detuple(Csc1<? super Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> c) {
        return (t1, t2, t3, t4, t5) -> c.accept(Tuple.of(t1, t2, t3, t4, t5));
    }

    public static <T1, T2, T3, T4, T5> Csc5<T1, T2, T3, T4, T5> check(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        Objects.requireNonNull(c, "c is null");
        return Cs5.narrow(c).checked();
    }

    public static <T1, T2, T3, T4, T5> Csc5<T1, T2, T3, T4, T5> ignore4Rt(Csc1<? super T1> c) {
        return Csc1.narrow(c).ignoring4Rt();
    }

    public static <T1, T2, T3, T4, T5> Csc5<T1, T2, T3, T4, T5> ignore4Lt(Csc1<? super T5> c) {
        return Csc1.narrow(c).ignoring4Lt();
    }

    public static <T1, T2, T3, T4, T5> Csc5<T1, T2, T3, T4, T5> ignore3Rt(Csc2<? super T1, ? super T2> c) {
        return Csc2.narrow(c).ignoring3Rt();
    }

    public static <T1, T2, T3, T4, T5> Csc5<T1, T2, T3, T4, T5> ignore3Lt(Csc2<? super T4, ? super T5> c) {
        return Csc2.narrow(c).ignoring3Lt();
    }

    public static <T1, T2, T3, T4, T5> Csc5<T1, T2, T3, T4, T5> ignore2Rt(Csc3<? super T1, ? super T2, ? super T3> c) {
        return Csc3.narrow(c).ignoring2Rt();
    }

    public static <T1, T2, T3, T4, T5> Csc5<T1, T2, T3, T4, T5> ignore2Lt(Csc3<? super T3, ? super T4, ? super T5> c) {
        return Csc3.narrow(c).ignoring2Lt();
    }

    public static <T1, T2, T3, T4, T5> Csc5<T1, T2, T3, T4, T5> ignore1Rt(Csc4<? super T1, ? super T2, ? super T3, ? super T4> c) {
        return Csc4.narrow(c).ignoring1Rt();
    }

    public static <T1, T2, T3, T4, T5> Csc5<T1, T2, T3, T4, T5> ignore1Lt(Csc4<? super T2, ? super T3, ? super T4, ? super T5> c) {
        return Csc4.narrow(c).ignoring1Lt();
    }

    public static <T1, T2, T3, T4, T5, T6> Csc5<T1, T2, T3, T4, T5> passRt(Csc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c, T6 t6) {
        return Csc5.narrow(c.acceptRt(t6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Csc5<T1, T2, T3, T4, T5> passRt(Csc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c, T6 t6, T7 t7) {
        return Csc5.narrow(c.acceptRt(t6, t7));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc5<T1, T2, T3, T4, T5> passRt(Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c, T6 t6, T7 t7, T8 t8) {
        return Csc5.narrow(c.acceptRt(t6, t7, t8));
    }

    public static <T1, T2, T3, T4, T5, T6> Csc5<T2, T3, T4, T5, T6> passLt(Csc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c, T1 t1) {
        return Csc5.narrow(c.acceptLt(t1));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Csc5<T3, T4, T5, T6, T7> passLt(Csc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c, T1 t1, T2 t2) {
        return Csc5.narrow(c.acceptLt(t1, t2));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc5<T4, T5, T6, T7, T8> passLt(Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c, T1 t1, T2 t2, T3 t3) {
        return Csc5.narrow(c.acceptLt(t1, t2, t3));
    }

    public static <T1, T2, T3, T4, T5> Csc5<T5, T4, T3, T2, T1> invert(Csc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        return Csc5.narrow(c).inverted();
    }

    public void accept(T1 var1, T2 var2, T3 var3, T4 var4, T5 var5) throws Throwable;

    default public Csc4<T2, T3, T4, T5> acceptLt(T1 t1) {
        return (t2, t3, t4, t5) -> this.accept(t1, t2, t3, t4, t5);
    }

    default public Csc3<T3, T4, T5> acceptLt(T1 t1, T2 t2) {
        return (t3, t4, t5) -> this.accept(t1, t2, t3, t4, t5);
    }

    default public Csc2<T4, T5> acceptLt(T1 t1, T2 t2, T3 t3) {
        return (t4, t5) -> this.accept(t1, t2, t3, t4, t5);
    }

    default public Csc1<T5> acceptLt(T1 t1, T2 t2, T3 t3, T4 t4) {
        return t5 -> this.accept(t1, t2, t3, t4, t5);
    }

    default public Csc4<T1, T2, T3, T4> acceptRt(T5 t5) {
        return (t1, t2, t3, t4) -> this.accept(t1, t2, t3, t4, t5);
    }

    default public Csc3<T1, T2, T3> acceptRt(T4 t4, T5 t5) {
        return (t1, t2, t3) -> this.accept(t1, t2, t3, t4, t5);
    }

    default public Csc2<T1, T2> acceptRt(T3 t3, T4 t4, T5 t5) {
        return (t1, t2) -> this.accept(t1, t2, t3, t4, t5);
    }

    default public Csc1<T1> acceptRt(T2 t2, T3 t3, T4 t4, T5 t5) {
        return t1 -> this.accept(t1, t2, t3, t4, t5);
    }

    default public <R> Fnc5<T1, T2, T3, T4, T5, R> toFunction(R r) {
        return (t1, t2, t3, t4, t5) -> {
            this.accept(t1, t2, t3, t4, t5);
            return r;
        };
    }

    default public Prc5<T1, T2, T3, T4, T5> toPredicate(boolean b) {
        return (t1, t2, t3, t4, t5) -> {
            this.accept(t1, t2, t3, t4, t5);
            return b;
        };
    }

    default public Rnc toRunnable(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return () -> this.accept(t1, t2, t3, t4, t5);
    }

    default public Csc5<T1, T2, T3, T4, T5> afterRun(Rnc r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2, t3, t4, t5) -> {
            this.accept(t1, t2, t3, t4, t5);
            r.run();
        };
    }

    default public <R> Csc5<T1, T2, T3, T4, T5> afterApply(Fnc0<? super R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.afterApplyTo(f).toConsumer();
    }

    default public <R> Fnc5<T1, T2, T3, T4, T5, R> afterApplyTo(Fnc0<? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5) -> {
            this.accept(t1, t2, t3, t4, t5);
            return f.apply();
        };
    }

    default public Csc5<T1, T2, T3, T4, T5> afterTest(Prc0 p) {
        Objects.requireNonNull(p, "p is null");
        return this.afterTestTo(p).toConsumer();
    }

    default public Prc5<T1, T2, T3, T4, T5> afterTestTo(Prc0 p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5) -> {
            this.accept(t1, t2, t3, t4, t5);
            return p.test();
        };
    }

    default public <R> Fnc5<T1, T2, T3, T4, T5, R> afterGet(Spc<? extends R> s) {
        return (t1, t2, t3, t4, t5) -> {
            this.accept(t1, t2, t3, t4, t5);
            return s.get();
        };
    }

    default public Csc5<T1, T2, T3, T4, T5> beforeRun(Rnc r) {
        return (t1, t2, t3, t4, t5) -> {
            r.run();
            this.accept(t1, t2, t3, t4, t5);
        };
    }

    default public <B1, B2, B3, B4, B5> Csc5<B1, B2, B3, B4, B5> beforeApply(Fnc5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        return this.beforeApply5(f);
    }

    default public <B1> Csc1<B1> beforeApply1(Fnc1<? super B1, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return b1 -> this.tupled().accept(Tuple.narrow((f.apply(b1))));
    }

    default public <B1, B2> Csc2<B1, B2> beforeApply2(Fnc2<? super B1, ? super B2, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2))));
    }

    default public <B1, B2, B3> Csc3<B1, B2, B3> beforeApply3(Fnc3<? super B1, ? super B2, ? super B3, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2, b3))));
    }

    default public <B1, B2, B3, B4> Csc4<B1, B2, B3, B4> beforeApply4(Fnc4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2, b3, b4))));
    }

    default public <B1, B2, B3, B4, B5> Csc5<B1, B2, B3, B4, B5> beforeApply5(Fnc5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2, b3, b4, b5))));
    }

    default public <B1, B2, B3, B4, B5, B6> Csc6<B1, B2, B3, B4, B5, B6> beforeApply6(Fnc6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Csc7<B1, B2, B3, B4, B5, B6, B7> beforeApply7(Fnc7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Csc8<B1, B2, B3, B4, B5, B6, B7, B8> beforeApply8(Fnc8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7, b8) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7, b8))));
    }

    default public Csc5<T1, T2, T3, T4, T5> beforeTestOnSuccess(Prc0 p, Csc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5) -> (p.test() != false ? this : Csc5.narrow(onFailure)).accept(t1, t2, t3, t4, t5);
    }

    default public Csc5<T1, T2, T3, T4, T5> beforeTestOnSuccess(Prc0 p) {
        return this.beforeTestOnSuccess(p, Csc5.empty());
    }

    default public Csc5<T1, T2, T3, T4, T5> beforeTestOnFailure(Prc0 p, Csc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Csc5<T1, T2, T3, T4, T5> beforeTestOnFailure(Prc0 p) {
        return this.beforeTestOnFailure(p, Csc5.empty());
    }

    default public Rnc beforeGet(Spc<? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> s) {
        Objects.requireNonNull(s, "s is null");
        return () -> this.tupled().accept(Tuple.narrow((s.get())));
    }

    default public Csc5<T5, T4, T3, T2, T1> inverted() {
        return (t5, t4, t3, t2, t1) -> this.accept(t1, t2, t3, t4, t5);
    }

    default public <S> Csc5<T1, T2, T3, T4, T5> afterPassingThroughApply(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends S> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5) -> {
            this.accept(t1, t2, t3, t4, t5);
            f.apply(t1, t2, t3, t4, t5);
        };
    }

    default public <S> Fnc5<T1, T2, T3, T4, T5, S> afterPassingThroughApplyTo(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends S> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5) -> {
            this.accept(t1, t2, t3, t4, t5);
            return f.apply(t1, t2, t3, t4, t5);
        };
    }

    default public Csc5<T1, T2, T3, T4, T5> afterPassingThroughTest(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5) -> {
            this.accept(t1, t2, t3, t4, t5);
            p.test(t1, t2, t3, t4, t5);
        };
    }

    default public Prc5<T1, T2, T3, T4, T5> afterPassingThroughTestTo(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5) -> {
            this.accept(t1, t2, t3, t4, t5);
            return p.test(t1, t2, t3, t4, t5);
        };
    }

    default public Csc5<T1, T2, T3, T4, T5> afterPassingThroughAccept(Csc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5) -> {
            this.accept(t1, t2, t3, t4, t5);
            c.accept(t1, t2, t3, t4, t5);
        };
    }

    default public <R> Csc5<T1, T2, T3, T4, T5> beforePassingThroughApply(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5) -> {
            f.apply(t1, t2, t3, t4, t5);
            this.accept(t1, t2, t3, t4, t5);
        };
    }

    default public Csc5<T1, T2, T3, T4, T5> beforePassingThroughTest(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5) -> {
            p.test(t1, t2, t3, t4, t5);
            this.accept(t1, t2, t3, t4, t5);
        };
    }

    default public Csc5<T1, T2, T3, T4, T5> beforePassingThroughAccept(Csc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5) -> {
            c.accept(t1, t2, t3, t4, t5);
            this.accept(t1, t2, t3, t4, t5);
        };
    }

    default public Csc5<T1, T2, T3, T4, T5> beforeSuccessPassingThroughTest(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, Csc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5) -> (p.test(t1, t2, t3, t4, t5) ? this : Csc5.narrow(onFailure)).accept(t1, t2, t3, t4, t5);
    }

    default public Csc5<T1, T2, T3, T4, T5> beforeSuccessPassingThroughTest(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return this.beforeSuccessPassingThroughTest(p, Csc5.empty());
    }

    default public Csc5<T1, T2, T3, T4, T5> beforeFailurePassingThroughTest(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, Csc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Csc5<T1, T2, T3, T4, T5> beforeFailurePassingThroughTest(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return this.beforeFailurePassingThroughTest(p, Csc5.empty());
    }

    default public Csc1<Tuple5<T1, T2, T3, T4, T5>> tupled() {
        return tuple -> this.accept(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5());
    }

    default public Fnc1<T1, Fnc1<T2, Fnc1<T3, Fnc1<T4, Csc1<T5>>>>> currying() {
        return t1 -> t2 -> t3 -> t4 -> t5 -> this.accept(t1, t2, t3, t4, t5);
    }

    default public Cs5<T1, T2, T3, T4, T5> unchecked() {
        return (t1, t2, t3, t4, t5) -> {
            try {
                this.accept(t1, t2, t3, t4, t5);
            }
            catch (Throwable t) {
                SneakyThrow.sneakyThrow(t);
            }

        };
    }

    default public <I1> Csc6<I1, T1, T2, T3, T4, T5> ignoring1Lt() {
        return (i1, t1, t2, t3, t4, t5) -> this.accept(t1, t2, t3, t4, t5);
    }

    default public <I1> Csc6<T1, T2, T3, T4, T5, I1> ignoring1Rt() {
        return (t1, t2, t3, t4, t5, i1) -> this.accept(t1, t2, t3, t4, t5);
    }

    default public <I1, I2> Csc7<I1, I2, T1, T2, T3, T4, T5> ignoring2Lt() {
        return (i1, i2, t1, t2, t3, t4, t5) -> this.accept(t1, t2, t3, t4, t5);
    }

    default public <I1, I2> Csc7<T1, T2, T3, T4, T5, I1, I2> ignoring2Rt() {
        return (t1, t2, t3, t4, t5, i1, i2) -> this.accept(t1, t2, t3, t4, t5);
    }

    default public <I1, I2, I3> Csc8<I1, I2, I3, T1, T2, T3, T4, T5> ignoring3Lt() {
        return (i1, i2, i3, t1, t2, t3, t4, t5) -> this.accept(t1, t2, t3, t4, t5);
    }

    default public <I1, I2, I3> Csc8<T1, T2, T3, T4, T5, I1, I2, I3> ignoring3Rt() {
        return (t1, t2, t3, t4, t5, i1, i2, i3) -> this.accept(t1, t2, t3, t4, t5);
    }

    default public Cs5<T1, T2, T3, T4, T5> recover(Fn1<? super Throwable, ? extends Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5>> recover) {
        Objects.requireNonNull(recover, "recover is null");
        return (t1, t2, t3, t4, t5) -> {
            try {
                this.accept(t1, t2, t3, t4, t5);
            }
            catch (Throwable throwable) {
                Cs5 cons = (Cs5) recover.apply(throwable);
                Objects.requireNonNull(cons, () -> "recover return null for " + throwable.getClass() + ": " + throwable.getMessage());
                cons.accept(t1, t2, t3, t4, t5);
            }

        };
    }

}

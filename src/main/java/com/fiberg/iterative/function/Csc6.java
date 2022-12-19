package com.fiberg.iterative.function;

import com.fiberg.iterative.function.Cs6;
import com.fiberg.iterative.function.Csc1;
import com.fiberg.iterative.function.Csc2;
import com.fiberg.iterative.function.Csc3;
import com.fiberg.iterative.function.Csc4;
import com.fiberg.iterative.function.Csc5;
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
import com.fiberg.iterative.function.Prc6;
import com.fiberg.iterative.function.Rnc;
import com.fiberg.iterative.function.SneakyThrow;
import com.fiberg.iterative.function.Spc;
import io.vavr.Tuple;
import io.vavr.Tuple6;
import java.io.Serializable;
import java.util.Objects;

@FunctionalInterface
public interface Csc6<T1, T2, T3, T4, T5, T6> {

    public static <T1, T2, T3, T4, T5, T6> Csc6<T1, T2, T3, T4, T5, T6> narrow(Csc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c) {
        @SuppressWarnings("unchecked")
        final Csc6<T1, T2, T3, T4, T5, T6> csc = (Csc6<T1, T2, T3, T4, T5, T6>) c;
        return csc;
    }

    public static <T1, T2, T3, T4, T5, T6> Csc6<T1, T2, T3, T4, T5, T6> empty() {
        return (t1, t2, t3, t4, t5, t6) -> {};
    }

    public static <T1, T2, T3, T4, T5, T6> Csc6<T1, T2, T3, T4, T5, T6> of(Csc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c) {
        return Csc6.narrow(c);
    }

    public static <T1, T2, T3, T4, T5, T6> Csc6<T1, T2, T3, T4, T5, T6> of1(Csc1<? super T1> f) {
        return Csc6.<T1, T2, T3, T4, T5, T6>narrow(f.ignoring5Rt());
    }

    public static <T1, T2, T3, T4, T5, T6> Csc6<T1, T2, T3, T4, T5, T6> of2(Csc1<? super T2> f) {
        return Csc6.<T1, T2, T3, T4, T5, T6>narrow(f.ignoring4Rt().ignoring1Lt());
    }

    public static <T1, T2, T3, T4, T5, T6> Csc6<T1, T2, T3, T4, T5, T6> of3(Csc1<? super T3> f) {
        return Csc6.<T1, T2, T3, T4, T5, T6>narrow(f.ignoring3Rt().ignoring2Lt());
    }

    public static <T1, T2, T3, T4, T5, T6> Csc6<T1, T2, T3, T4, T5, T6> of4(Csc1<? super T4> f) {
        return Csc6.<T1, T2, T3, T4, T5, T6>narrow(f.ignoring2Rt().ignoring3Lt());
    }

    public static <T1, T2, T3, T4, T5, T6> Csc6<T1, T2, T3, T4, T5, T6> of5(Csc1<? super T5> f) {
        return Csc6.<T1, T2, T3, T4, T5, T6>narrow(f.ignoring1Rt().ignoring4Lt());
    }

    public static <T1, T2, T3, T4, T5, T6> Csc6<T1, T2, T3, T4, T5, T6> of6(Csc1<? super T6> f) {
        return Csc6.<T1, T2, T3, T4, T5, T6>narrow(f.ignoring5Lt());
    }

    public static <T1, T2, T3, T4, T5, T6> Csc1<Tuple6<T1, T2, T3, T4, T5, T6>> tuple(Csc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c) {
        return Csc6.<T1, T2, T3, T4, T5, T6>of(c).tupled();
    }

    public static <T1, T2, T3, T4, T5, T6> Csc6<T1, T2, T3, T4, T5, T6> detuple(Csc1<? super Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> c) {
        return (t1, t2, t3, t4, t5, t6) -> c.accept(Tuple.of(t1, t2, t3, t4, t5, t6));
    }

    public static <T1, T2, T3, T4, T5, T6> Csc6<T1, T2, T3, T4, T5, T6> check(Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c) {
        Objects.requireNonNull(c, "c is null");
        return Cs6.<T1, T2, T3, T4, T5, T6>narrow(c).checked();
    }

    public static <T1, T2, T3, T4, T5, T6> Csc6<T1, T2, T3, T4, T5, T6> ignore5Rt(Csc1<? super T1> c) {
        return Csc1.<T1>narrow(c).ignoring5Rt();
    }

    public static <T1, T2, T3, T4, T5, T6> Csc6<T1, T2, T3, T4, T5, T6> ignore5Lt(Csc1<? super T6> c) {
        return Csc1.<T6>narrow(c).ignoring5Lt();
    }

    public static <T1, T2, T3, T4, T5, T6> Csc6<T1, T2, T3, T4, T5, T6> ignore4Rt(Csc2<? super T1, ? super T2> c) {
        return Csc2.<T1, T2>narrow(c).ignoring4Rt();
    }

    public static <T1, T2, T3, T4, T5, T6> Csc6<T1, T2, T3, T4, T5, T6> ignore4Lt(Csc2<? super T5, ? super T6> c) {
        return Csc2.<T5, T6>narrow(c).ignoring4Lt();
    }

    public static <T1, T2, T3, T4, T5, T6> Csc6<T1, T2, T3, T4, T5, T6> ignore3Rt(Csc3<? super T1, ? super T2, ? super T3> c) {
        return Csc3.<T1, T2, T3>narrow(c).ignoring3Rt();
    }

    public static <T1, T2, T3, T4, T5, T6> Csc6<T1, T2, T3, T4, T5, T6> ignore3Lt(Csc3<? super T4, ? super T5, ? super T6> c) {
        return Csc3.<T4, T5, T6>narrow(c).ignoring3Lt();
    }

    public static <T1, T2, T3, T4, T5, T6> Csc6<T1, T2, T3, T4, T5, T6> ignore2Rt(Csc4<? super T1, ? super T2, ? super T3, ? super T4> c) {
        return Csc4.<T1, T2, T3, T4>narrow(c).ignoring2Rt();
    }

    public static <T1, T2, T3, T4, T5, T6> Csc6<T1, T2, T3, T4, T5, T6> ignore2Lt(Csc4<? super T3, ? super T4, ? super T5, ? super T6> c) {
        return Csc4.<T3, T4, T5, T6>narrow(c).ignoring2Lt();
    }

    public static <T1, T2, T3, T4, T5, T6> Csc6<T1, T2, T3, T4, T5, T6> ignore1Rt(Csc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        return Csc5.<T1, T2, T3, T4, T5>narrow(c).ignoring1Rt();
    }

    public static <T1, T2, T3, T4, T5, T6> Csc6<T1, T2, T3, T4, T5, T6> ignore1Lt(Csc5<? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c) {
        return Csc5.<T2, T3, T4, T5, T6>narrow(c).ignoring1Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Csc6<T1, T2, T3, T4, T5, T6> passRt(Csc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c, T7 t7) {
        return Csc6.narrow(c.acceptRt(t7));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc6<T1, T2, T3, T4, T5, T6> passRt(Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c, T7 t7, T8 t8) {
        return Csc6.narrow(c.acceptRt(t7, t8));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Csc6<T2, T3, T4, T5, T6, T7> passLt(Csc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c, T1 t1) {
        return Csc6.narrow(c.acceptLt(t1));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc6<T3, T4, T5, T6, T7, T8> passLt(Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c, T1 t1, T2 t2) {
        return Csc6.narrow(c.acceptLt(t1, t2));
    }

    public static <T1, T2, T3, T4, T5, T6> Csc6<T6, T5, T4, T3, T2, T1> invert(Csc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c) {
        return Csc6.<T1, T2, T3, T4, T5, T6>narrow(c).inverted();
    }

    public void accept(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) throws Throwable;

    default public Csc5<T2, T3, T4, T5, T6> acceptLt(T1 t1) {
        return (t2, t3, t4, t5, t6) -> this.accept(t1, t2, t3, t4, t5, t6);
    }

    default public Csc4<T3, T4, T5, T6> acceptLt(T1 t1, T2 t2) {
        return (t3, t4, t5, t6) -> this.accept(t1, t2, t3, t4, t5, t6);
    }

    default public Csc3<T4, T5, T6> acceptLt(T1 t1, T2 t2, T3 t3) {
        return (t4, t5, t6) -> this.accept(t1, t2, t3, t4, t5, t6);
    }

    default public Csc2<T5, T6> acceptLt(T1 t1, T2 t2, T3 t3, T4 t4) {
        return (t5, t6) -> this.accept(t1, t2, t3, t4, t5, t6);
    }

    default public Csc1<T6> acceptLt(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return t6 -> this.accept(t1, t2, t3, t4, t5, t6);
    }

    default public Csc5<T1, T2, T3, T4, T5> acceptRt(T6 t6) {
        return (t1, t2, t3, t4, t5) -> this.accept(t1, t2, t3, t4, t5, t6);
    }

    default public Csc4<T1, T2, T3, T4> acceptRt(T5 t5, T6 t6) {
        return (t1, t2, t3, t4) -> this.accept(t1, t2, t3, t4, t5, t6);
    }

    default public Csc3<T1, T2, T3> acceptRt(T4 t4, T5 t5, T6 t6) {
        return (t1, t2, t3) -> this.accept(t1, t2, t3, t4, t5, t6);
    }

    default public Csc2<T1, T2> acceptRt(T3 t3, T4 t4, T5 t5, T6 t6) {
        return (t1, t2) -> this.accept(t1, t2, t3, t4, t5, t6);
    }

    default public Csc1<T1> acceptRt(T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return t1 -> this.accept(t1, t2, t3, t4, t5, t6);
    }

    default public <R> Fnc6<T1, T2, T3, T4, T5, T6, R> toFunction(R r) {
        return (t1, t2, t3, t4, t5, t6) -> {
            this.accept(t1, t2, t3, t4, t5, t6);
            return r;
        };
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> toPredicate(boolean b) {
        return (t1, t2, t3, t4, t5, t6) -> {
            this.accept(t1, t2, t3, t4, t5, t6);
            return b;
        };
    }

    default public Rnc toRunnable(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return () -> this.accept(t1, t2, t3, t4, t5, t6);
    }

    default public Csc6<T1, T2, T3, T4, T5, T6> afterRun(Rnc r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2, t3, t4, t5, t6) -> {
            this.accept(t1, t2, t3, t4, t5, t6);
            r.run();
        };
    }

    default public <R> Csc6<T1, T2, T3, T4, T5, T6> afterApply(Fnc0<? super R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.afterApplyTo(f).toConsumer();
    }

    default public <R> Fnc6<T1, T2, T3, T4, T5, T6, R> afterApplyTo(Fnc0<? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5, t6) -> {
            this.accept(t1, t2, t3, t4, t5, t6);
            return f.apply();
        };
    }

    default public Csc6<T1, T2, T3, T4, T5, T6> afterTest(Prc0 p) {
        Objects.requireNonNull(p, "p is null");
        return this.afterTestTo(p).toConsumer();
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> afterTestTo(Prc0 p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5, t6) -> {
            this.accept(t1, t2, t3, t4, t5, t6);
            return p.test();
        };
    }

    default public <R> Fnc6<T1, T2, T3, T4, T5, T6, R> afterGet(Spc<? extends R> s) {
        return (t1, t2, t3, t4, t5, t6) -> {
            this.accept(t1, t2, t3, t4, t5, t6);
            return s.get();
        };
    }

    default public Csc6<T1, T2, T3, T4, T5, T6> beforeRun(Rnc r) {
        return (t1, t2, t3, t4, t5, t6) -> {
            r.run();
            this.accept(t1, t2, t3, t4, t5, t6);
        };
    }

    default public <B1, B2, B3, B4, B5, B6> Csc6<B1, B2, B3, B4, B5, B6> beforeApply(Fnc6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> f) {
        return this.beforeApply6(f);
    }

    default public <B1> Csc1<B1> beforeApply1(Fnc1<? super B1, ? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> f) {
        Objects.requireNonNull(f, "f is null");
        return b1 -> this.tupled().accept(Tuple.narrow((f.apply(b1))));
    }

    default public <B1, B2> Csc2<B1, B2> beforeApply2(Fnc2<? super B1, ? super B2, ? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2))));
    }

    default public <B1, B2, B3> Csc3<B1, B2, B3> beforeApply3(Fnc3<? super B1, ? super B2, ? super B3, ? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2, b3))));
    }

    default public <B1, B2, B3, B4> Csc4<B1, B2, B3, B4> beforeApply4(Fnc4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2, b3, b4))));
    }

    default public <B1, B2, B3, B4, B5> Csc5<B1, B2, B3, B4, B5> beforeApply5(Fnc5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2, b3, b4, b5))));
    }

    default public <B1, B2, B3, B4, B5, B6> Csc6<B1, B2, B3, B4, B5, B6> beforeApply6(Fnc6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Csc7<B1, B2, B3, B4, B5, B6, B7> beforeApply7(Fnc7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Csc8<B1, B2, B3, B4, B5, B6, B7, B8> beforeApply8(Fnc8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7, b8) -> this.tupled().accept(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7, b8))));
    }

    default public Csc6<T1, T2, T3, T4, T5, T6> beforeTestOnSuccess(Prc0 p, Csc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6) -> (p.test() != false ? this : Csc6.<T1, T2, T3, T4, T5, T6>narrow(onFailure)).accept(t1, t2, t3, t4, t5, t6);
    }

    default public Csc6<T1, T2, T3, T4, T5, T6> beforeTestOnSuccess(Prc0 p) {
        return this.beforeTestOnSuccess(p, Csc6.empty());
    }

    default public Csc6<T1, T2, T3, T4, T5, T6> beforeTestOnFailure(Prc0 p, Csc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Csc6<T1, T2, T3, T4, T5, T6> beforeTestOnFailure(Prc0 p) {
        return this.beforeTestOnFailure(p, Csc6.empty());
    }

    default public Rnc beforeGet(Spc<? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> s) {
        Objects.requireNonNull(s, "s is null");
        return () -> this.tupled().accept(Tuple.narrow((s.get())));
    }

    default public Csc6<T6, T5, T4, T3, T2, T1> inverted() {
        return (t6, t5, t4, t3, t2, t1) -> this.accept(t1, t2, t3, t4, t5, t6);
    }

    default public <S> Csc6<T1, T2, T3, T4, T5, T6> afterPassingThroughApply(Fnc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends S> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5, t6) -> {
            this.accept(t1, t2, t3, t4, t5, t6);
            f.apply(t1, t2, t3, t4, t5, t6);
        };
    }

    default public <S> Fnc6<T1, T2, T3, T4, T5, T6, S> afterPassingThroughApplyTo(Fnc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends S> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5, t6) -> {
            this.accept(t1, t2, t3, t4, t5, t6);
            return f.apply(t1, t2, t3, t4, t5, t6);
        };
    }

    default public Csc6<T1, T2, T3, T4, T5, T6> afterPassingThroughTest(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5, t6) -> {
            this.accept(t1, t2, t3, t4, t5, t6);
            p.test(t1, t2, t3, t4, t5, t6);
        };
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> afterPassingThroughTestTo(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5, t6) -> {
            this.accept(t1, t2, t3, t4, t5, t6);
            return p.test(t1, t2, t3, t4, t5, t6);
        };
    }

    default public Csc6<T1, T2, T3, T4, T5, T6> afterPassingThroughAccept(Csc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5, t6) -> {
            this.accept(t1, t2, t3, t4, t5, t6);
            c.accept(t1, t2, t3, t4, t5, t6);
        };
    }

    default public <R> Csc6<T1, T2, T3, T4, T5, T6> beforePassingThroughApply(Fnc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5, t6) -> {
            f.apply(t1, t2, t3, t4, t5, t6);
            this.accept(t1, t2, t3, t4, t5, t6);
        };
    }

    default public Csc6<T1, T2, T3, T4, T5, T6> beforePassingThroughTest(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5, t6) -> {
            p.test(t1, t2, t3, t4, t5, t6);
            this.accept(t1, t2, t3, t4, t5, t6);
        };
    }

    default public Csc6<T1, T2, T3, T4, T5, T6> beforePassingThroughAccept(Csc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5, t6) -> {
            c.accept(t1, t2, t3, t4, t5, t6);
            this.accept(t1, t2, t3, t4, t5, t6);
        };
    }

    default public Csc6<T1, T2, T3, T4, T5, T6> beforeSuccessPassingThroughTest(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, Csc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6) -> (p.test(t1, t2, t3, t4, t5, t6) ? this : Csc6.<T1, T2, T3, T4, T5, T6>narrow(onFailure)).accept(t1, t2, t3, t4, t5, t6);
    }

    default public Csc6<T1, T2, T3, T4, T5, T6> beforeSuccessPassingThroughTest(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        return this.beforeSuccessPassingThroughTest(p, Csc6.empty());
    }

    default public Csc6<T1, T2, T3, T4, T5, T6> beforeFailurePassingThroughTest(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, Csc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Csc6<T1, T2, T3, T4, T5, T6> beforeFailurePassingThroughTest(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        return this.beforeFailurePassingThroughTest(p, Csc6.empty());
    }

    default public Csc1<Tuple6<T1, T2, T3, T4, T5, T6>> tupled() {
        return tuple -> this.accept(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5(), tuple._6());
    }

    default public Fnc1<T1, Fnc1<T2, Fnc1<T3, Fnc1<T4, Fnc1<T5, Csc1<T6>>>>>> currying() {
        return t1 -> t2 -> t3 -> t4 -> t5 -> t6 -> this.accept(t1, t2, t3, t4, t5, t6);
    }

    default public Cs6<T1, T2, T3, T4, T5, T6> unchecked() {
        return (t1, t2, t3, t4, t5, t6) -> {
            try {
                this.accept(t1, t2, t3, t4, t5, t6);
            }
            catch (Throwable t) {
                SneakyThrow.sneakyThrow(t);
            }
        };
    }

    default public <I1> Csc7<I1, T1, T2, T3, T4, T5, T6> ignoring1Lt() {
        return (i1, t1, t2, t3, t4, t5, t6) -> this.accept(t1, t2, t3, t4, t5, t6);
    }

    default public <I1> Csc7<T1, T2, T3, T4, T5, T6, I1> ignoring1Rt() {
        return (t1, t2, t3, t4, t5, t6, i1) -> this.accept(t1, t2, t3, t4, t5, t6);
    }

    default public <I1, I2> Csc8<I1, I2, T1, T2, T3, T4, T5, T6> ignoring2Lt() {
        return (i1, i2, t1, t2, t3, t4, t5, t6) -> this.accept(t1, t2, t3, t4, t5, t6);
    }

    default public <I1, I2> Csc8<T1, T2, T3, T4, T5, T6, I1, I2> ignoring2Rt() {
        return (t1, t2, t3, t4, t5, t6, i1, i2) -> this.accept(t1, t2, t3, t4, t5, t6);
    }

    default public Cs6<T1, T2, T3, T4, T5, T6> recover(Fn1<? super Throwable, ? extends Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6>> recover) {
        Objects.requireNonNull(recover, "recover is null");
        return (t1, t2, t3, t4, t5, t6) -> {
            try {
                this.accept(t1, t2, t3, t4, t5, t6);
            }
            catch (Throwable throwable) {
                Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> cons = recover.apply(throwable);
                Objects.requireNonNull(cons, () -> "recover return null for " + throwable.getClass() + ": " + throwable.getMessage());
                cons.accept(t1, t2, t3, t4, t5, t6);
            }
        };
    }

}

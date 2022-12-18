package com.fiberg.iterative.function;

import com.fiberg.iterative.function.Cs8;
import com.fiberg.iterative.function.Csc1;
import com.fiberg.iterative.function.Csc2;
import com.fiberg.iterative.function.Csc3;
import com.fiberg.iterative.function.Csc4;
import com.fiberg.iterative.function.Csc5;
import com.fiberg.iterative.function.Csc6;
import com.fiberg.iterative.function.Csc7;
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
import com.fiberg.iterative.function.Prc8;
import com.fiberg.iterative.function.Rnc;
import com.fiberg.iterative.function.SneakyThrow;
import com.fiberg.iterative.function.Spc;
import io.vavr.Tuple;
import io.vavr.Tuple8;
import java.io.Serializable;
import java.util.Objects;

@FunctionalInterface
public interface Csc8<T1, T2, T3, T4, T5, T6, T7, T8> {

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc8<T1, T2, T3, T4, T5, T6, T7, T8> narrow(Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
        return c;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc8<T1, T2, T3, T4, T5, T6, T7, T8> empty() {
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {};
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc8<T1, T2, T3, T4, T5, T6, T7, T8> of(Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
        return Csc8.narrow(c);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc8<T1, T2, T3, T4, T5, T6, T7, T8> of1(Csc1<? super T1> c) {
        return Csc8.narrow(c.ignoring7Rt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc8<T1, T2, T3, T4, T5, T6, T7, T8> of2(Csc1<? super T2> c) {
        return Csc8.narrow(c.ignoring6Rt().ignoring1Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc8<T1, T2, T3, T4, T5, T6, T7, T8> of3(Csc1<? super T3> c) {
        return Csc8.narrow(c.ignoring5Rt().ignoring2Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc8<T1, T2, T3, T4, T5, T6, T7, T8> of4(Csc1<? super T4> c) {
        return Csc8.narrow(c.ignoring4Rt().ignoring3Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc8<T1, T2, T3, T4, T5, T6, T7, T8> of5(Csc1<? super T5> c) {
        return Csc8.narrow(c.ignoring3Rt().ignoring4Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc8<T1, T2, T3, T4, T5, T6, T7, T8> of6(Csc1<? super T6> c) {
        return Csc8.narrow(c.ignoring2Rt().ignoring5Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc8<T1, T2, T3, T4, T5, T6, T7, T8> of7(Csc1<? super T7> c) {
        return Csc8.narrow(c.ignoring1Rt().ignoring6Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc8<T1, T2, T3, T4, T5, T6, T7, T8> of8(Csc1<? super T8> c) {
        return Csc8.narrow(c.ignoring7Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> tuple(Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
        return Csc8.of(c).tupled();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc8<T1, T2, T3, T4, T5, T6, T7, T8> detuple(Csc1<? super Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> c) {
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> c.accept((Object)Tuple.of((Object)t1, (Object)t2, (Object)t3, (Object)t4, (Object)t5, (Object)t6, (Object)t7, (Object)t8));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc8<T1, T2, T3, T4, T5, T6, T7, T8> check(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
        Objects.requireNonNull(c, "c is null");
        return Cs8.narrow(c).checked();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc8<T1, T2, T3, T4, T5, T6, T7, T8> ignore7Rt(Csc1<? super T1> c) {
        return Csc1.narrow(c).ignoring7Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc8<T1, T2, T3, T4, T5, T6, T7, T8> ignore7Lt(Csc1<? super T8> c) {
        return Csc1.narrow(c).ignoring7Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc8<T1, T2, T3, T4, T5, T6, T7, T8> ignore6Rt(Csc2<? super T1, ? super T2> c) {
        return Csc2.narrow(c).ignoring6Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc8<T1, T2, T3, T4, T5, T6, T7, T8> ignore6Lt(Csc2<? super T7, ? super T8> c) {
        return Csc2.narrow(c).ignoring6Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc8<T1, T2, T3, T4, T5, T6, T7, T8> ignore5Rt(Csc3<? super T1, ? super T2, ? super T3> c) {
        return Csc3.narrow(c).ignoring5Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc8<T1, T2, T3, T4, T5, T6, T7, T8> ignore5Lt(Csc3<? super T6, ? super T7, ? super T8> c) {
        return Csc3.narrow(c).ignoring5Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc8<T1, T2, T3, T4, T5, T6, T7, T8> ignore4Rt(Csc4<? super T1, ? super T2, ? super T3, ? super T4> c) {
        return Csc4.narrow(c).ignoring4Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc8<T1, T2, T3, T4, T5, T6, T7, T8> ignore4Lt(Csc4<? super T5, ? super T6, ? super T7, ? super T8> c) {
        return Csc4.narrow(c).ignoring4Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc8<T1, T2, T3, T4, T5, T6, T7, T8> ignore3Rt(Csc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        return Csc5.narrow(c).ignoring3Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc8<T1, T2, T3, T4, T5, T6, T7, T8> ignore3Lt(Csc5<? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
        return Csc5.narrow(c).ignoring3Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc8<T1, T2, T3, T4, T5, T6, T7, T8> ignore2Rt(Csc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c) {
        return Csc6.narrow(c).ignoring2Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc8<T1, T2, T3, T4, T5, T6, T7, T8> ignore2Lt(Csc6<? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
        return Csc6.narrow(c).ignoring2Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc8<T1, T2, T3, T4, T5, T6, T7, T8> ignore1Rt(Csc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c) {
        return Csc7.narrow(c).ignoring1Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc8<T1, T2, T3, T4, T5, T6, T7, T8> ignore1Lt(Csc7<? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
        return Csc7.narrow(c).ignoring1Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc8<T8, T7, T6, T5, T4, T3, T2, T1> invert(Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
        return Csc8.narrow(c).inverted();
    }

    public void accept(T1 var1, T2 var2, T3 var3, T4 var4, T5 var5, T6 var6, T7 var7, T8 var8) throws Throwable;

    default public Csc7<T2, T3, T4, T5, T6, T7, T8> acceptLt(T1 t1) {
        return (t2, t3, t4, t5, t6, t7, t8) -> this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Csc6<T3, T4, T5, T6, T7, T8> acceptLt(T1 t1, T2 t2) {
        return (t3, t4, t5, t6, t7, t8) -> this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Csc5<T4, T5, T6, T7, T8> acceptLt(T1 t1, T2 t2, T3 t3) {
        return (t4, t5, t6, t7, t8) -> this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Csc4<T5, T6, T7, T8> acceptLt(T1 t1, T2 t2, T3 t3, T4 t4) {
        return (t5, t6, t7, t8) -> this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Csc3<T6, T7, T8> acceptLt(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return (t6, t7, t8) -> this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Csc2<T7, T8> acceptLt(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return (t7, t8) -> this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Csc1<T8> acceptLt(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return t8 -> this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Csc7<T1, T2, T3, T4, T5, T6, T7> acceptRt(T8 t8) {
        return (t1, t2, t3, t4, t5, t6, t7) -> this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Csc6<T1, T2, T3, T4, T5, T6> acceptRt(T7 t7, T8 t8) {
        return (t1, t2, t3, t4, t5, t6) -> this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Csc5<T1, T2, T3, T4, T5> acceptRt(T6 t6, T7 t7, T8 t8) {
        return (t1, t2, t3, t4, t5) -> this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Csc4<T1, T2, T3, T4> acceptRt(T5 t5, T6 t6, T7 t7, T8 t8) {
        return (t1, t2, t3, t4) -> this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Csc3<T1, T2, T3> acceptRt(T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return (t1, t2, t3) -> this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Csc2<T1, T2> acceptRt(T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return (t1, t2) -> this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Csc1<T1> acceptRt(T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return t1 -> this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public <R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> toFunction(R r) {
        return (Fnc8 & Serializable)(t1, t2, t3, t4, t5, t6, t7, t8) -> {
            this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
            return r;
        };
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> toPredicate(boolean b) {
        return (Prc8<Object, Object, Object, Object, Object, Object, Object, Object> & Serializable)(t1, t2, t3, t4, t5, t6, t7, t8) -> {
            this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
            return b;
        };
    }

    default public Rnc toRunnable(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return () -> this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Csc8<T1, T2, T3, T4, T5, T6, T7, T8> afterRun(Rnc r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
            r.run();
        };
    }

    default public <R> Csc8<T1, T2, T3, T4, T5, T6, T7, T8> afterApply(Fnc0<? super R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.afterApplyTo(f).toConsumer();
    }

    default public <R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> afterApplyTo(Fnc0<? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (Fnc8 & Serializable)(t1, t2, t3, t4, t5, t6, t7, t8) -> {
            this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
            return f.apply();
        };
    }

    default public Csc8<T1, T2, T3, T4, T5, T6, T7, T8> afterTest(Prc0 p) {
        Objects.requireNonNull(p, "p is null");
        return this.afterTestTo(p).toConsumer();
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterTestTo(Prc0 p) {
        Objects.requireNonNull(p, "p is null");
        return (Prc8<Object, Object, Object, Object, Object, Object, Object, Object> & Serializable)(t1, t2, t3, t4, t5, t6, t7, t8) -> {
            this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
            return p.test();
        };
    }

    default public <R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> afterGet(Spc<? extends R> s) {
        return (Fnc8 & Serializable)(t1, t2, t3, t4, t5, t6, t7, t8) -> {
            this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
            return s.get();
        };
    }

    default public Csc8<T1, T2, T3, T4, T5, T6, T7, T8> beforeRun(Rnc r) {
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            r.run();
            this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Csc8<B1, B2, B3, B4, B5, B6, B7, B8> beforeApply(Fnc8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        return this.beforeApply8(f);
    }

    default public <B1> Csc1<B1> beforeApply1(Fnc1<? super B1, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return b1 -> this.tupled().accept((Object)Tuple.narrow((Tuple8)((Tuple8)f.apply(b1))));
    }

    default public <B1, B2> Csc2<B1, B2> beforeApply2(Fnc2<? super B1, ? super B2, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2) -> this.tupled().accept((Object)Tuple.narrow((Tuple8)((Tuple8)f.apply(b1, b2))));
    }

    default public <B1, B2, B3> Csc3<B1, B2, B3> beforeApply3(Fnc3<? super B1, ? super B2, ? super B3, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3) -> this.tupled().accept((Object)Tuple.narrow((Tuple8)((Tuple8)f.apply(b1, b2, b3))));
    }

    default public <B1, B2, B3, B4> Csc4<B1, B2, B3, B4> beforeApply4(Fnc4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4) -> this.tupled().accept((Object)Tuple.narrow((Tuple8)((Tuple8)f.apply(b1, b2, b3, b4))));
    }

    default public <B1, B2, B3, B4, B5> Csc5<B1, B2, B3, B4, B5> beforeApply5(Fnc5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5) -> this.tupled().accept((Object)Tuple.narrow((Tuple8)((Tuple8)f.apply(b1, b2, b3, b4, b5))));
    }

    default public <B1, B2, B3, B4, B5, B6> Csc6<B1, B2, B3, B4, B5, B6> beforeApply6(Fnc6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6) -> this.tupled().accept((Object)Tuple.narrow((Tuple8)((Tuple8)f.apply(b1, b2, b3, b4, b5, b6))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Csc7<B1, B2, B3, B4, B5, B6, B7> beforeApply7(Fnc7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7) -> this.tupled().accept((Object)Tuple.narrow((Tuple8)((Tuple8)f.apply(b1, b2, b3, b4, b5, b6, b7))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Csc8<B1, B2, B3, B4, B5, B6, B7, B8> beforeApply8(Fnc8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7, b8) -> this.tupled().accept((Object)Tuple.narrow((Tuple8)((Tuple8)f.apply(b1, b2, b3, b4, b5, b6, b7, b8))));
    }

    default public Csc8<T1, T2, T3, T4, T5, T6, T7, T8> beforeTestOnSuccess(Prc0 p, Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> (p.test() != false ? this : Csc8.narrow(onFailure)).accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Csc8<T1, T2, T3, T4, T5, T6, T7, T8> beforeTestOnSuccess(Prc0 p) {
        return this.beforeTestOnSuccess(p, Csc8.empty());
    }

    default public Csc8<T1, T2, T3, T4, T5, T6, T7, T8> beforeTestOnFailure(Prc0 p, Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Csc8<T1, T2, T3, T4, T5, T6, T7, T8> beforeTestOnFailure(Prc0 p) {
        return this.beforeTestOnFailure(p, Csc8.empty());
    }

    default public Rnc beforeGet(Spc<? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> s) {
        Objects.requireNonNull(s, "s is null");
        return () -> this.tupled().accept((Object)Tuple.narrow((Tuple8)((Tuple8)s.get())));
    }

    default public Csc8<T8, T7, T6, T5, T4, T3, T2, T1> inverted() {
        return (t8, t7, t6, t5, t4, t3, t2, t1) -> this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public <S> Csc8<T1, T2, T3, T4, T5, T6, T7, T8> afterPassingThroughApply(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends S> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
            f.apply(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public <S> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, S> afterPassingThroughApplyTo(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends S> f) {
        Objects.requireNonNull(f, "f is null");
        return (Fnc8 & Serializable)(t1, t2, t3, t4, t5, t6, t7, t8) -> {
            this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
            return f.apply(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public Csc8<T1, T2, T3, T4, T5, T6, T7, T8> afterPassingThroughTest(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
            p.test(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterPassingThroughTestTo(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        Objects.requireNonNull(p, "p is null");
        return (Prc8<Object, Object, Object, Object, Object, Object, Object, Object> & Serializable)(t1, t2, t3, t4, t5, t6, t7, t8) -> {
            this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
            return p.test(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public Csc8<T1, T2, T3, T4, T5, T6, T7, T8> afterPassingThroughAccept(Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
            c.accept(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public <R> Csc8<T1, T2, T3, T4, T5, T6, T7, T8> beforePassingThroughApply(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            f.apply(t1, t2, t3, t4, t5, t6, t7, t8);
            this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public Csc8<T1, T2, T3, T4, T5, T6, T7, T8> beforePassingThroughTest(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            p.test(t1, t2, t3, t4, t5, t6, t7, t8);
            this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public Csc8<T1, T2, T3, T4, T5, T6, T7, T8> beforePassingThroughAccept(Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            c.accept(t1, t2, t3, t4, t5, t6, t7, t8);
            this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public Csc8<T1, T2, T3, T4, T5, T6, T7, T8> beforeSuccessPassingThroughTest(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> (p.test(t1, t2, t3, t4, t5, t6, t7, t8) ? this : Csc8.narrow(onFailure)).accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Csc8<T1, T2, T3, T4, T5, T6, T7, T8> beforeSuccessPassingThroughTest(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        return this.beforeSuccessPassingThroughTest(p, Csc8.empty());
    }

    default public Csc8<T1, T2, T3, T4, T5, T6, T7, T8> beforeFailurePassingThroughTest(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Csc8<T1, T2, T3, T4, T5, T6, T7, T8> beforeFailurePassingThroughTest(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        return this.beforeFailurePassingThroughTest(p, Csc8.empty());
    }

    default public Csc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> tupled() {
        return tuple -> this.accept(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5(), tuple._6(), tuple._7(), tuple._8());
    }

    default public Fnc1<T1, Fnc1<T2, Fnc1<T3, Fnc1<T4, Fnc1<T5, Fnc1<T6, Fnc1<T7, Csc1<T8>>>>>>>> currying() {
        return (Fnc1 & Serializable)t1 -> (Fnc1 & Serializable)t2 -> (Fnc1 & Serializable)t3 -> (Fnc1 & Serializable)t4 -> (Fnc1 & Serializable)t5 -> (Fnc1 & Serializable)t6 -> (Fnc1 & Serializable)t7 -> t8 -> this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Cs8<T1, T2, T3, T4, T5, T6, T7, T8> unchecked() {
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            try {
                this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
            }
            catch (Throwable t) {
                SneakyThrow.sneakyThrow(t);
            }

        };
    }

    default public Cs8<T1, T2, T3, T4, T5, T6, T7, T8> recover(Fn1<? super Throwable, ? extends Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8>> recover) {
        Objects.requireNonNull(recover, "recover is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            try {
                this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
            }
            catch (Throwable throwable) {
                Cs8 cons = (Cs8)recover.apply(throwable);
                Objects.requireNonNull(cons, () -> "recover return null for " + throwable.getClass() + ": " + throwable.getMessage());
                cons.accept(t1, t2, t3, t4, t5, t6, t7, t8);
            }

        };
    }

}

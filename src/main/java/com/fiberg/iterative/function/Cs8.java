package com.fiberg.iterative.function;

import com.fiberg.iterative.function.Cs1;
import com.fiberg.iterative.function.Cs2;
import com.fiberg.iterative.function.Cs3;
import com.fiberg.iterative.function.Cs4;
import com.fiberg.iterative.function.Cs5;
import com.fiberg.iterative.function.Cs6;
import com.fiberg.iterative.function.Cs7;
import com.fiberg.iterative.function.Csc8;
import com.fiberg.iterative.function.Fn0;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fn2;
import com.fiberg.iterative.function.Fn3;
import com.fiberg.iterative.function.Fn4;
import com.fiberg.iterative.function.Fn5;
import com.fiberg.iterative.function.Fn6;
import com.fiberg.iterative.function.Fn7;
import com.fiberg.iterative.function.Fn8;
import com.fiberg.iterative.function.Pr0;
import com.fiberg.iterative.function.Pr8;
import com.fiberg.iterative.function.Rn;
import com.fiberg.iterative.function.Sp;
import io.vavr.Tuple;
import io.vavr.Tuple8;
import java.io.Serializable;
import java.util.Objects;

@FunctionalInterface
public interface Cs8<T1, T2, T3, T4, T5, T6, T7, T8> {

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs8<T1, T2, T3, T4, T5, T6, T7, T8> narrow(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
        return c;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs8<T1, T2, T3, T4, T5, T6, T7, T8> empty() {
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {};
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs8<T1, T2, T3, T4, T5, T6, T7, T8> of(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
        return Cs8.narrow(c);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs8<T1, T2, T3, T4, T5, T6, T7, T8> of1(Cs1<? super T1> c) {
        return Cs8.narrow(c.ignoring7Rt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs8<T1, T2, T3, T4, T5, T6, T7, T8> of2(Cs1<? super T2> c) {
        return Cs8.narrow(c.ignoring6Rt().ignoring1Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs8<T1, T2, T3, T4, T5, T6, T7, T8> of3(Cs1<? super T3> c) {
        return Cs8.narrow(c.ignoring5Rt().ignoring2Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs8<T1, T2, T3, T4, T5, T6, T7, T8> of4(Cs1<? super T4> c) {
        return Cs8.narrow(c.ignoring4Rt().ignoring3Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs8<T1, T2, T3, T4, T5, T6, T7, T8> of5(Cs1<? super T5> c) {
        return Cs8.narrow(c.ignoring3Rt().ignoring4Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs8<T1, T2, T3, T4, T5, T6, T7, T8> of6(Cs1<? super T6> c) {
        return Cs8.narrow(c.ignoring2Rt().ignoring5Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs8<T1, T2, T3, T4, T5, T6, T7, T8> of7(Cs1<? super T7> c) {
        return Cs8.narrow(c.ignoring1Rt().ignoring6Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs8<T1, T2, T3, T4, T5, T6, T7, T8> of8(Cs1<? super T8> c) {
        return Cs8.narrow(c.ignoring7Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> tuple(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
        return Cs8.of(c).tupled();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs8<T1, T2, T3, T4, T5, T6, T7, T8> detuple(Cs1<? super Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> c) {
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> c.accept(Tuple.of((Object)t1, (Object)t2, (Object)t3, (Object)t4, (Object)t5, (Object)t6, (Object)t7, (Object)t8));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs8<T1, T2, T3, T4, T5, T6, T7, T8> uncheck(Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
        Objects.requireNonNull(c, "c is null");
        return Csc8.narrow(c).unchecked();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs8<T1, T2, T3, T4, T5, T6, T7, T8> ignore7Rt(Cs1<? super T1> c) {
        return Cs1.narrow(c).ignoring7Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs8<T1, T2, T3, T4, T5, T6, T7, T8> ignore7Lt(Cs1<? super T8> c) {
        return Cs1.narrow(c).ignoring7Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs8<T1, T2, T3, T4, T5, T6, T7, T8> ignore6Rt(Cs2<? super T1, ? super T2> c) {
        return Cs2.narrow(c).ignoring6Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs8<T1, T2, T3, T4, T5, T6, T7, T8> ignore6Lt(Cs2<? super T7, ? super T8> c) {
        return Cs2.narrow(c).ignoring6Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs8<T1, T2, T3, T4, T5, T6, T7, T8> ignore5Rt(Cs3<? super T1, ? super T2, ? super T3> c) {
        return Cs3.narrow(c).ignoring5Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs8<T1, T2, T3, T4, T5, T6, T7, T8> ignore5Lt(Cs3<? super T6, ? super T7, ? super T8> c) {
        return Cs3.narrow(c).ignoring5Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs8<T1, T2, T3, T4, T5, T6, T7, T8> ignore4Rt(Cs4<? super T1, ? super T2, ? super T3, ? super T4> c) {
        return Cs4.narrow(c).ignoring4Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs8<T1, T2, T3, T4, T5, T6, T7, T8> ignore4Lt(Cs4<? super T5, ? super T6, ? super T7, ? super T8> c) {
        return Cs4.narrow(c).ignoring4Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs8<T1, T2, T3, T4, T5, T6, T7, T8> ignore3Rt(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        return Cs5.narrow(c).ignoring3Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs8<T1, T2, T3, T4, T5, T6, T7, T8> ignore3Lt(Cs5<? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
        return Cs5.narrow(c).ignoring3Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs8<T1, T2, T3, T4, T5, T6, T7, T8> ignore2Rt(Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c) {
        return Cs6.narrow(c).ignoring2Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs8<T1, T2, T3, T4, T5, T6, T7, T8> ignore2Lt(Cs6<? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
        return Cs6.narrow(c).ignoring2Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs8<T1, T2, T3, T4, T5, T6, T7, T8> ignore1Rt(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c) {
        return Cs7.narrow(c).ignoring1Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs8<T1, T2, T3, T4, T5, T6, T7, T8> ignore1Lt(Cs7<? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
        return Cs7.narrow(c).ignoring1Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> void passAndRun(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        Rn.pass(c, t1, t2, t3, t4, t5, t6, t7, t8).run();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs8<T8, T7, T6, T5, T4, T3, T2, T1> invert(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
        return Cs8.narrow(c).inverted();
    }

    public void accept(T1 var1, T2 var2, T3 var3, T4 var4, T5 var5, T6 var6, T7 var7, T8 var8);

    default public Cs7<T2, T3, T4, T5, T6, T7, T8> acceptLt(T1 t1) {
        return (t2, t3, t4, t5, t6, t7, t8) -> this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Cs6<T3, T4, T5, T6, T7, T8> acceptLt(T1 t1, T2 t2) {
        return (t3, t4, t5, t6, t7, t8) -> this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Cs5<T4, T5, T6, T7, T8> acceptLt(T1 t1, T2 t2, T3 t3) {
        return (t4, t5, t6, t7, t8) -> this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Cs4<T5, T6, T7, T8> acceptLt(T1 t1, T2 t2, T3 t3, T4 t4) {
        return (t5, t6, t7, t8) -> this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Cs3<T6, T7, T8> acceptLt(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return (t6, t7, t8) -> this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Cs2<T7, T8> acceptLt(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return (t7, t8) -> this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Cs1<T8> acceptLt(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return t8 -> this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Cs7<T1, T2, T3, T4, T5, T6, T7> acceptRt(T8 t8) {
        return (t1, t2, t3, t4, t5, t6, t7) -> this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Cs6<T1, T2, T3, T4, T5, T6> acceptRt(T7 t7, T8 t8) {
        return (t1, t2, t3, t4, t5, t6) -> this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Cs5<T1, T2, T3, T4, T5> acceptRt(T6 t6, T7 t7, T8 t8) {
        return (t1, t2, t3, t4, t5) -> this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Cs4<T1, T2, T3, T4> acceptRt(T5 t5, T6 t6, T7 t7, T8 t8) {
        return (t1, t2, t3, t4) -> this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Cs3<T1, T2, T3> acceptRt(T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return (t1, t2, t3) -> this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Cs2<T1, T2> acceptRt(T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return (t1, t2) -> this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Cs1<T1> acceptRt(T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return t1 -> this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public <R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> toFunction(R r) {
        return (Fn8 & Serializable)(t1, t2, t3, t4, t5, t6, t7, t8) -> {
            this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
            return r;
        };
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> toPredicate(boolean b) {
        return (Pr8<Object, Object, Object, Object, Object, Object, Object, Object> & Serializable)(t1, t2, t3, t4, t5, t6, t7, t8) -> {
            this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
            return b;
        };
    }

    default public Rn toRunnable(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return () -> this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Cs8<T1, T2, T3, T4, T5, T6, T7, T8> afterRun(Rn r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
            r.run();
        };
    }

    default public <R> Cs8<T1, T2, T3, T4, T5, T6, T7, T8> afterApply(Fn0<? super R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.afterApplyTo(f).toConsumer();
    }

    default public <R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> afterApplyTo(Fn0<? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (Fn8 & Serializable)(t1, t2, t3, t4, t5, t6, t7, t8) -> {
            this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
            return f.apply();
        };
    }

    default public Cs8<T1, T2, T3, T4, T5, T6, T7, T8> afterTest(Pr0 p) {
        Objects.requireNonNull(p, "p is null");
        return this.afterTestTo(p).toConsumer();
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterTestTo(Pr0 p) {
        Objects.requireNonNull(p, "p is null");
        return (Pr8<Object, Object, Object, Object, Object, Object, Object, Object> & Serializable)(t1, t2, t3, t4, t5, t6, t7, t8) -> {
            this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
            return p.test();
        };
    }

    default public <R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> afterGet(Sp<? extends R> s) {
        return (Fn8 & Serializable)(t1, t2, t3, t4, t5, t6, t7, t8) -> {
            this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
            return s.get();
        };
    }

    default public Cs8<T1, T2, T3, T4, T5, T6, T7, T8> beforeRun(Rn r) {
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            r.run();
            this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Cs8<B1, B2, B3, B4, B5, B6, B7, B8> beforeApply(Fn8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        return this.beforeApply8(f);
    }

    default public <B1> Cs1<B1> beforeApply1(Fn1<? super B1, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return b1 -> this.tupled().accept(Tuple.narrow((Tuple8)((Tuple8)f.apply(b1))));
    }

    default public <B1, B2> Cs2<B1, B2> beforeApply2(Fn2<? super B1, ? super B2, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2) -> this.tupled().accept(Tuple.narrow((Tuple8)((Tuple8)f.apply(b1, b2))));
    }

    default public <B1, B2, B3> Cs3<B1, B2, B3> beforeApply3(Fn3<? super B1, ? super B2, ? super B3, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3) -> this.tupled().accept(Tuple.narrow((Tuple8)((Tuple8)f.apply(b1, b2, b3))));
    }

    default public <B1, B2, B3, B4> Cs4<B1, B2, B3, B4> beforeApply4(Fn4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4) -> this.tupled().accept(Tuple.narrow((Tuple8)((Tuple8)f.apply(b1, b2, b3, b4))));
    }

    default public <B1, B2, B3, B4, B5> Cs5<B1, B2, B3, B4, B5> beforeApply5(Fn5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5) -> this.tupled().accept(Tuple.narrow((Tuple8)((Tuple8)f.apply(b1, b2, b3, b4, b5))));
    }

    default public <B1, B2, B3, B4, B5, B6> Cs6<B1, B2, B3, B4, B5, B6> beforeApply6(Fn6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6) -> this.tupled().accept(Tuple.narrow((Tuple8)((Tuple8)f.apply(b1, b2, b3, b4, b5, b6))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Cs7<B1, B2, B3, B4, B5, B6, B7> beforeApply7(Fn7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7) -> this.tupled().accept(Tuple.narrow((Tuple8)((Tuple8)f.apply(b1, b2, b3, b4, b5, b6, b7))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Cs8<B1, B2, B3, B4, B5, B6, B7, B8> beforeApply8(Fn8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7, b8) -> this.tupled().accept(Tuple.narrow((Tuple8)((Tuple8)f.apply(b1, b2, b3, b4, b5, b6, b7, b8))));
    }

    default public Cs8<T1, T2, T3, T4, T5, T6, T7, T8> beforeTestOnSuccess(Pr0 p, Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> (p.test() ? this : Cs8.narrow(onFailure)).accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Cs8<T1, T2, T3, T4, T5, T6, T7, T8> beforeTestOnSuccess(Pr0 p) {
        return this.beforeTestOnSuccess(p, Cs8.empty());
    }

    default public Cs8<T1, T2, T3, T4, T5, T6, T7, T8> beforeTestOnFailure(Pr0 p, Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Cs8<T1, T2, T3, T4, T5, T6, T7, T8> beforeTestOnFailure(Pr0 p) {
        return this.beforeTestOnFailure(p, Cs8.empty());
    }

    default public Rn beforeGet(Sp<? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> s) {
        Objects.requireNonNull(s, "s is null");
        return () -> this.tupled().accept(Tuple.narrow((Tuple8)((Tuple8)s.get())));
    }

    default public Cs8<T8, T7, T6, T5, T4, T3, T2, T1> inverted() {
        return (t8, t7, t6, t5, t4, t3, t2, t1) -> this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public <S> Cs8<T1, T2, T3, T4, T5, T6, T7, T8> afterPassingThroughApply(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends S> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
            f.apply(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public <S> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, S> afterPassingThroughApplyTo(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends S> f) {
        Objects.requireNonNull(f, "f is null");
        return (Fn8 & Serializable)(t1, t2, t3, t4, t5, t6, t7, t8) -> {
            this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
            return f.apply(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public Cs8<T1, T2, T3, T4, T5, T6, T7, T8> afterPassingThroughTest(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
            p.test(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterPassingThroughTestTo(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        Objects.requireNonNull(p, "p is null");
        return (Pr8<Object, Object, Object, Object, Object, Object, Object, Object> & Serializable)(t1, t2, t3, t4, t5, t6, t7, t8) -> {
            this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
            return p.test(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public Cs8<T1, T2, T3, T4, T5, T6, T7, T8> afterPassingThroughAccept(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
            c.accept(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public <R> Cs8<T1, T2, T3, T4, T5, T6, T7, T8> beforePassingThroughApply(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            f.apply(t1, t2, t3, t4, t5, t6, t7, t8);
            this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public Cs8<T1, T2, T3, T4, T5, T6, T7, T8> beforePassingThroughTest(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            p.test(t1, t2, t3, t4, t5, t6, t7, t8);
            this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public Cs8<T1, T2, T3, T4, T5, T6, T7, T8> beforePassingThroughAccept(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            c.accept(t1, t2, t3, t4, t5, t6, t7, t8);
            this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public Cs8<T1, T2, T3, T4, T5, T6, T7, T8> beforeSuccessPassingThroughTest(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> (p.test(t1, t2, t3, t4, t5, t6, t7, t8) ? this : Cs8.narrow(onFailure)).accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Cs8<T1, T2, T3, T4, T5, T6, T7, T8> beforeSuccessPassingThroughTest(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        return this.beforeSuccessPassingThroughTest(p, Cs8.empty());
    }

    default public Cs8<T1, T2, T3, T4, T5, T6, T7, T8> beforeFailurePassingThroughTest(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Cs8<T1, T2, T3, T4, T5, T6, T7, T8> beforeFailurePassingThroughTest(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        return this.beforeFailurePassingThroughTest(p, Cs8.empty());
    }

    default public Cs1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> tupled() {
        return tuple -> this.accept(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5(), tuple._6(), tuple._7(), tuple._8());
    }

    default public Fn1<T1, Fn1<T2, Fn1<T3, Fn1<T4, Fn1<T5, Fn1<T6, Fn1<T7, Cs1<T8>>>>>>>> currying() {
        return (Fn1 & Serializable)t1 -> (Fn1 & Serializable)t2 -> (Fn1 & Serializable)t3 -> (Fn1 & Serializable)t4 -> (Fn1 & Serializable)t5 -> (Fn1 & Serializable)t6 -> (Fn1 & Serializable)t7 -> t8 -> this.accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Csc8<T1, T2, T3, T4, T5, T6, T7, T8> checked() {
        return (arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6, arg_7) -> this.accept(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6, arg_7);
    }

}

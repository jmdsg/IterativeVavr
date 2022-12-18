package com.fiberg.iterative.function;

import com.fiberg.iterative.function.Cs1;
import com.fiberg.iterative.function.Cs2;
import com.fiberg.iterative.function.Cs3;
import com.fiberg.iterative.function.Cs4;
import com.fiberg.iterative.function.Cs5;
import com.fiberg.iterative.function.Cs7;
import com.fiberg.iterative.function.Cs8;
import com.fiberg.iterative.function.Csc6;
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
import com.fiberg.iterative.function.Pr6;
import com.fiberg.iterative.function.Rn;
import com.fiberg.iterative.function.Sp;
import io.vavr.Tuple;
import io.vavr.Tuple6;
import java.io.Serializable;
import java.util.Objects;

@FunctionalInterface
public interface Cs6<T1, T2, T3, T4, T5, T6> {

    public static <T1, T2, T3, T4, T5, T6> Cs6<T1, T2, T3, T4, T5, T6> narrow(Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c) {
        return c;
    }

    public static <T1, T2, T3, T4, T5, T6> Cs6<T1, T2, T3, T4, T5, T6> empty() {
        return (t1, t2, t3, t4, t5, t6) -> {};
    }

    public static <T1, T2, T3, T4, T5, T6> Cs6<T1, T2, T3, T4, T5, T6> of(Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c) {
        return Cs6.narrow(c);
    }

    public static <T1, T2, T3, T4, T5, T6> Cs6<T1, T2, T3, T4, T5, T6> of1(Cs1<? super T1> f) {
        return Cs6.narrow(f.ignoring5Rt());
    }

    public static <T1, T2, T3, T4, T5, T6> Cs6<T1, T2, T3, T4, T5, T6> of2(Cs1<? super T2> f) {
        return Cs6.narrow(f.ignoring4Rt().ignoring1Lt());
    }

    public static <T1, T2, T3, T4, T5, T6> Cs6<T1, T2, T3, T4, T5, T6> of3(Cs1<? super T3> f) {
        return Cs6.narrow(f.ignoring3Rt().ignoring2Lt());
    }

    public static <T1, T2, T3, T4, T5, T6> Cs6<T1, T2, T3, T4, T5, T6> of4(Cs1<? super T4> f) {
        return Cs6.narrow(f.ignoring2Rt().ignoring3Lt());
    }

    public static <T1, T2, T3, T4, T5, T6> Cs6<T1, T2, T3, T4, T5, T6> of5(Cs1<? super T5> f) {
        return Cs6.narrow(f.ignoring1Rt().ignoring4Lt());
    }

    public static <T1, T2, T3, T4, T5, T6> Cs6<T1, T2, T3, T4, T5, T6> of6(Cs1<? super T6> f) {
        return Cs6.narrow(f.ignoring5Lt());
    }

    public static <T1, T2, T3, T4, T5, T6> Cs1<Tuple6<T1, T2, T3, T4, T5, T6>> tuple(Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c) {
        return Cs6.of(c).tupled();
    }

    public static <T1, T2, T3, T4, T5, T6> Cs6<T1, T2, T3, T4, T5, T6> detuple(Cs1<? super Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> c) {
        return (t1, t2, t3, t4, t5, t6) -> c.accept(Tuple.of((Object)t1, (Object)t2, (Object)t3, (Object)t4, (Object)t5, (Object)t6));
    }

    public static <T1, T2, T3, T4, T5, T6> Cs6<T1, T2, T3, T4, T5, T6> uncheck(Csc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c) {
        Objects.requireNonNull(c, "c is null");
        return Csc6.narrow(c).unchecked();
    }

    public static <T1, T2, T3, T4, T5, T6> Cs6<T1, T2, T3, T4, T5, T6> ignore5Rt(Cs1<? super T1> c) {
        return Cs1.narrow(c).ignoring5Rt();
    }

    public static <T1, T2, T3, T4, T5, T6> Cs6<T1, T2, T3, T4, T5, T6> ignore5Lt(Cs1<? super T6> c) {
        return Cs1.narrow(c).ignoring5Lt();
    }

    public static <T1, T2, T3, T4, T5, T6> Cs6<T1, T2, T3, T4, T5, T6> ignore4Rt(Cs2<? super T1, ? super T2> c) {
        return Cs2.narrow(c).ignoring4Rt();
    }

    public static <T1, T2, T3, T4, T5, T6> Cs6<T1, T2, T3, T4, T5, T6> ignore4Lt(Cs2<? super T5, ? super T6> c) {
        return Cs2.narrow(c).ignoring4Lt();
    }

    public static <T1, T2, T3, T4, T5, T6> Cs6<T1, T2, T3, T4, T5, T6> ignore3Rt(Cs3<? super T1, ? super T2, ? super T3> c) {
        return Cs3.narrow(c).ignoring3Rt();
    }

    public static <T1, T2, T3, T4, T5, T6> Cs6<T1, T2, T3, T4, T5, T6> ignore3Lt(Cs3<? super T4, ? super T5, ? super T6> c) {
        return Cs3.narrow(c).ignoring3Lt();
    }

    public static <T1, T2, T3, T4, T5, T6> Cs6<T1, T2, T3, T4, T5, T6> ignore2Rt(Cs4<? super T1, ? super T2, ? super T3, ? super T4> c) {
        return Cs4.narrow(c).ignoring2Rt();
    }

    public static <T1, T2, T3, T4, T5, T6> Cs6<T1, T2, T3, T4, T5, T6> ignore2Lt(Cs4<? super T3, ? super T4, ? super T5, ? super T6> c) {
        return Cs4.narrow(c).ignoring2Lt();
    }

    public static <T1, T2, T3, T4, T5, T6> Cs6<T1, T2, T3, T4, T5, T6> ignore1Rt(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        return Cs5.narrow(c).ignoring1Rt();
    }

    public static <T1, T2, T3, T4, T5, T6> Cs6<T1, T2, T3, T4, T5, T6> ignore1Lt(Cs5<? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c) {
        return Cs5.narrow(c).ignoring1Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Cs6<T1, T2, T3, T4, T5, T6> passRt(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c, T7 t7) {
        return Cs6.narrow(c.acceptRt(t7));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs6<T1, T2, T3, T4, T5, T6> passRt(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c, T7 t7, T8 t8) {
        return Cs6.narrow(c.acceptRt(t7, t8));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Cs6<T2, T3, T4, T5, T6, T7> passLt(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c, T1 t1) {
        return Cs6.narrow(c.acceptLt(t1));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs6<T3, T4, T5, T6, T7, T8> passLt(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c, T1 t1, T2 t2) {
        return Cs6.narrow(c.acceptLt(t1, t2));
    }

    public static <T1, T2, T3, T4, T5, T6> void passAndRun(Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        Rn.pass(c, t1, t2, t3, t4, t5, t6).run();
    }

    public static <T1, T2, T3, T4, T5, T6> Cs6<T6, T5, T4, T3, T2, T1> invert(Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c) {
        return Cs6.narrow(c).inverted();
    }

    public void accept(T1 var1, T2 var2, T3 var3, T4 var4, T5 var5, T6 var6);

    default public Cs5<T2, T3, T4, T5, T6> acceptLt(T1 t1) {
        return (t2, t3, t4, t5, t6) -> this.accept(t1, t2, t3, t4, t5, t6);
    }

    default public Cs4<T3, T4, T5, T6> acceptLt(T1 t1, T2 t2) {
        return (t3, t4, t5, t6) -> this.accept(t1, t2, t3, t4, t5, t6);
    }

    default public Cs3<T4, T5, T6> acceptLt(T1 t1, T2 t2, T3 t3) {
        return (t4, t5, t6) -> this.accept(t1, t2, t3, t4, t5, t6);
    }

    default public Cs2<T5, T6> acceptLt(T1 t1, T2 t2, T3 t3, T4 t4) {
        return (t5, t6) -> this.accept(t1, t2, t3, t4, t5, t6);
    }

    default public Cs1<T6> acceptLt(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return t6 -> this.accept(t1, t2, t3, t4, t5, t6);
    }

    default public Cs5<T1, T2, T3, T4, T5> acceptRt(T6 t6) {
        return (t1, t2, t3, t4, t5) -> this.accept(t1, t2, t3, t4, t5, t6);
    }

    default public Cs4<T1, T2, T3, T4> acceptRt(T5 t5, T6 t6) {
        return (t1, t2, t3, t4) -> this.accept(t1, t2, t3, t4, t5, t6);
    }

    default public Cs3<T1, T2, T3> acceptRt(T4 t4, T5 t5, T6 t6) {
        return (t1, t2, t3) -> this.accept(t1, t2, t3, t4, t5, t6);
    }

    default public Cs2<T1, T2> acceptRt(T3 t3, T4 t4, T5 t5, T6 t6) {
        return (t1, t2) -> this.accept(t1, t2, t3, t4, t5, t6);
    }

    default public Cs1<T1> acceptRt(T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return t1 -> this.accept(t1, t2, t3, t4, t5, t6);
    }

    default public <R> Fn6<T1, T2, T3, T4, T5, T6, R> toFunction(R r) {
        return (Fn6 & Serializable)(t1, t2, t3, t4, t5, t6) -> {
            this.accept(t1, t2, t3, t4, t5, t6);
            return r;
        };
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> toPredicate(boolean b) {
        return (Pr6<Object, Object, Object, Object, Object, Object> & Serializable)(t1, t2, t3, t4, t5, t6) -> {
            this.accept(t1, t2, t3, t4, t5, t6);
            return b;
        };
    }

    default public Rn toRunnable(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return () -> this.accept(t1, t2, t3, t4, t5, t6);
    }

    default public Cs6<T1, T2, T3, T4, T5, T6> afterRun(Rn r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2, t3, t4, t5, t6) -> {
            this.accept(t1, t2, t3, t4, t5, t6);
            r.run();
        };
    }

    default public <R> Cs6<T1, T2, T3, T4, T5, T6> afterApply(Fn0<? super R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.afterApplyTo(f).toConsumer();
    }

    default public <R> Fn6<T1, T2, T3, T4, T5, T6, R> afterApplyTo(Fn0<? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (Fn6 & Serializable)(t1, t2, t3, t4, t5, t6) -> {
            this.accept(t1, t2, t3, t4, t5, t6);
            return f.apply();
        };
    }

    default public Cs6<T1, T2, T3, T4, T5, T6> afterTest(Pr0 p) {
        Objects.requireNonNull(p, "p is null");
        return this.afterTestTo(p).toConsumer();
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> afterTestTo(Pr0 p) {
        Objects.requireNonNull(p, "p is null");
        return (Pr6<Object, Object, Object, Object, Object, Object> & Serializable)(t1, t2, t3, t4, t5, t6) -> {
            this.accept(t1, t2, t3, t4, t5, t6);
            return p.test();
        };
    }

    default public <R> Fn6<T1, T2, T3, T4, T5, T6, R> afterGet(Sp<? extends R> s) {
        return (Fn6 & Serializable)(t1, t2, t3, t4, t5, t6) -> {
            this.accept(t1, t2, t3, t4, t5, t6);
            return s.get();
        };
    }

    default public Cs6<T1, T2, T3, T4, T5, T6> beforeRun(Rn r) {
        return (t1, t2, t3, t4, t5, t6) -> {
            r.run();
            this.accept(t1, t2, t3, t4, t5, t6);
        };
    }

    default public <B1, B2, B3, B4, B5, B6> Cs6<B1, B2, B3, B4, B5, B6> beforeApply(Fn6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> f) {
        return this.beforeApply6(f);
    }

    default public <B1> Cs1<B1> beforeApply1(Fn1<? super B1, ? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> f) {
        Objects.requireNonNull(f, "f is null");
        return b1 -> this.tupled().accept(Tuple.narrow((Tuple6)((Tuple6)f.apply(b1))));
    }

    default public <B1, B2> Cs2<B1, B2> beforeApply2(Fn2<? super B1, ? super B2, ? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2) -> this.tupled().accept(Tuple.narrow((Tuple6)((Tuple6)f.apply(b1, b2))));
    }

    default public <B1, B2, B3> Cs3<B1, B2, B3> beforeApply3(Fn3<? super B1, ? super B2, ? super B3, ? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3) -> this.tupled().accept(Tuple.narrow((Tuple6)((Tuple6)f.apply(b1, b2, b3))));
    }

    default public <B1, B2, B3, B4> Cs4<B1, B2, B3, B4> beforeApply4(Fn4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4) -> this.tupled().accept(Tuple.narrow((Tuple6)((Tuple6)f.apply(b1, b2, b3, b4))));
    }

    default public <B1, B2, B3, B4, B5> Cs5<B1, B2, B3, B4, B5> beforeApply5(Fn5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5) -> this.tupled().accept(Tuple.narrow((Tuple6)((Tuple6)f.apply(b1, b2, b3, b4, b5))));
    }

    default public <B1, B2, B3, B4, B5, B6> Cs6<B1, B2, B3, B4, B5, B6> beforeApply6(Fn6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6) -> this.tupled().accept(Tuple.narrow((Tuple6)((Tuple6)f.apply(b1, b2, b3, b4, b5, b6))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Cs7<B1, B2, B3, B4, B5, B6, B7> beforeApply7(Fn7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7) -> this.tupled().accept(Tuple.narrow((Tuple6)((Tuple6)f.apply(b1, b2, b3, b4, b5, b6, b7))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Cs8<B1, B2, B3, B4, B5, B6, B7, B8> beforeApply8(Fn8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7, b8) -> this.tupled().accept(Tuple.narrow((Tuple6)((Tuple6)f.apply(b1, b2, b3, b4, b5, b6, b7, b8))));
    }

    default public Cs6<T1, T2, T3, T4, T5, T6> beforeTestOnSuccess(Pr0 p, Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6) -> (p.test() ? this : Cs6.narrow(onFailure)).accept(t1, t2, t3, t4, t5, t6);
    }

    default public Cs6<T1, T2, T3, T4, T5, T6> beforeTestOnSuccess(Pr0 p) {
        return this.beforeTestOnSuccess(p, Cs6.empty());
    }

    default public Cs6<T1, T2, T3, T4, T5, T6> beforeTestOnFailure(Pr0 p, Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Cs6<T1, T2, T3, T4, T5, T6> beforeTestOnFailure(Pr0 p) {
        return this.beforeTestOnFailure(p, Cs6.empty());
    }

    default public Rn beforeGet(Sp<? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> s) {
        Objects.requireNonNull(s, "s is null");
        return () -> this.tupled().accept(Tuple.narrow((Tuple6)((Tuple6)s.get())));
    }

    default public Cs6<T6, T5, T4, T3, T2, T1> inverted() {
        return (t6, t5, t4, t3, t2, t1) -> this.accept(t1, t2, t3, t4, t5, t6);
    }

    default public <S> Cs6<T1, T2, T3, T4, T5, T6> afterPassingThroughApply(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends S> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5, t6) -> {
            this.accept(t1, t2, t3, t4, t5, t6);
            f.apply(t1, t2, t3, t4, t5, t6);
        };
    }

    default public <S> Fn6<T1, T2, T3, T4, T5, T6, S> afterPassingThroughApplyTo(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends S> f) {
        Objects.requireNonNull(f, "f is null");
        return (Fn6 & Serializable)(t1, t2, t3, t4, t5, t6) -> {
            this.accept(t1, t2, t3, t4, t5, t6);
            return f.apply(t1, t2, t3, t4, t5, t6);
        };
    }

    default public Cs6<T1, T2, T3, T4, T5, T6> afterPassingThroughTest(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5, t6) -> {
            this.accept(t1, t2, t3, t4, t5, t6);
            p.test(t1, t2, t3, t4, t5, t6);
        };
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> afterPassingThroughTestTo(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        Objects.requireNonNull(p, "p is null");
        return (Pr6<Object, Object, Object, Object, Object, Object> & Serializable)(t1, t2, t3, t4, t5, t6) -> {
            this.accept(t1, t2, t3, t4, t5, t6);
            return p.test(t1, t2, t3, t4, t5, t6);
        };
    }

    default public Cs6<T1, T2, T3, T4, T5, T6> afterPassingThroughAccept(Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5, t6) -> {
            this.accept(t1, t2, t3, t4, t5, t6);
            c.accept(t1, t2, t3, t4, t5, t6);
        };
    }

    default public <R> Cs6<T1, T2, T3, T4, T5, T6> beforePassingThroughApply(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5, t6) -> {
            f.apply(t1, t2, t3, t4, t5, t6);
            this.accept(t1, t2, t3, t4, t5, t6);
        };
    }

    default public Cs6<T1, T2, T3, T4, T5, T6> beforePassingThroughTest(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5, t6) -> {
            p.test(t1, t2, t3, t4, t5, t6);
            this.accept(t1, t2, t3, t4, t5, t6);
        };
    }

    default public Cs6<T1, T2, T3, T4, T5, T6> beforePassingThroughAccept(Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5, t6) -> {
            c.accept(t1, t2, t3, t4, t5, t6);
            this.accept(t1, t2, t3, t4, t5, t6);
        };
    }

    default public Cs6<T1, T2, T3, T4, T5, T6> beforeSuccessPassingThroughTest(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6) -> (p.test(t1, t2, t3, t4, t5, t6) ? this : Cs6.narrow(onFailure)).accept(t1, t2, t3, t4, t5, t6);
    }

    default public Cs6<T1, T2, T3, T4, T5, T6> beforeSuccessPassingThroughTest(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        return this.beforeSuccessPassingThroughTest(p, Cs6.empty());
    }

    default public Cs6<T1, T2, T3, T4, T5, T6> beforeFailurePassingThroughTest(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Cs6<T1, T2, T3, T4, T5, T6> beforeFailurePassingThroughTest(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        return this.beforeFailurePassingThroughTest(p, Cs6.empty());
    }

    default public Cs1<Tuple6<T1, T2, T3, T4, T5, T6>> tupled() {
        return tuple -> this.accept(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5(), tuple._6());
    }

    default public Fn1<T1, Fn1<T2, Fn1<T3, Fn1<T4, Fn1<T5, Cs1<T6>>>>>> currying() {
        return (Fn1 & Serializable)t1 -> (Fn1 & Serializable)t2 -> (Fn1 & Serializable)t3 -> (Fn1 & Serializable)t4 -> (Fn1 & Serializable)t5 -> t6 -> this.accept(t1, t2, t3, t4, t5, t6);
    }

    default public Csc6<T1, T2, T3, T4, T5, T6> checked() {
        return (arg_0, arg_1, arg_2, arg_3, arg_4, arg_5) -> this.accept(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5);
    }

    default public <I1> Cs7<I1, T1, T2, T3, T4, T5, T6> ignoring1Lt() {
        return (i1, t1, t2, t3, t4, t5, t6) -> this.accept(t1, t2, t3, t4, t5, t6);
    }

    default public <I1> Cs7<T1, T2, T3, T4, T5, T6, I1> ignoring1Rt() {
        return (t1, t2, t3, t4, t5, t6, i1) -> this.accept(t1, t2, t3, t4, t5, t6);
    }

    default public <I1, I2> Cs8<I1, I2, T1, T2, T3, T4, T5, T6> ignoring2Lt() {
        return (i1, i2, t1, t2, t3, t4, t5, t6) -> this.accept(t1, t2, t3, t4, t5, t6);
    }

    default public <I1, I2> Cs8<T1, T2, T3, T4, T5, T6, I1, I2> ignoring2Rt() {
        return (t1, t2, t3, t4, t5, t6, i1, i2) -> this.accept(t1, t2, t3, t4, t5, t6);
    }

}

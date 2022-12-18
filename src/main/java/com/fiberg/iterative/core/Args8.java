package com.fiberg.iterative.core;

import com.fiberg.iterative.function.*;

public class Args8<T1, T2, T3, T4, T5, T6, T7, T8> {

    private T1 t1;
    private T2 t2;
    private T3 t3;
    private T4 t4;
    private T5 t5;
    private T6 t6;
    private T7 t7;
    private T8 t8;

    Args8(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.t4 = t4;
        this.t5 = t5;
        this.t6 = t6;
        this.t7 = t7;
        this.t8 = t8;
    }

    public <R> Fn0<R> apply(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fn0<R> apply = (Fn0<R>) Fn8.narrow(f).toFunction(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7, this.t8);
        return apply;
    }

    public <R> R passApply(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        return (R) f.toFunction(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7, this.t8).apply();
    }

    public <R, V> V passApplyAfter(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f, Fn1<? super R, ? extends V> a) {
        return (V) f.toFunction(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7, this.t8).afterApply(a).apply();
    }

    public <R> Fnc0<R> applyChecked(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fnc0<R> apply = (Fnc0<R>) Fnc8.narrow(f).toFunction(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7, this.t8);
        return apply;
    }

    public <R, W> W passApplyWrap(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f, Fn1<? super Spc<R>, ? extends W> a) {
        @SuppressWarnings("unchecked")
        final Fn1<? super Spc<? extends R>, W> wrap = (Fn1<? super Spc<? extends R>, W>) a;
        return Fnc8.narrow(f).toFunction(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7, this.t8).beforeWrap(wrap).apply();
    }

    public Pr0 test(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        return p.toPredicate(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7, this.t8);
    }

    public Boolean passTest(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        return p.toPredicate(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7, this.t8).test();
    }

    public Prc0 testChecked(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        return p.toPredicate(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7, this.t8);
    }

    public Rn accept(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
        return c.toRunnable(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7, this.t8);
    }

    public Rnc acceptChecked(Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
        return c.toRunnable(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7, this.t8);
    }

}

package com.fiberg.iterative.core;

import com.fiberg.iterative.function.*;

public class Args7<T1, T2, T3, T4, T5, T6, T7> {

    private final T1 t1;
    private final T2 t2;
    private final T3 t3;
    private final T4 t4;
    private final T5 t5;
    private final T6 t6;
    private final T7 t7;

    Args7(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.t4 = t4;
        this.t5 = t5;
        this.t6 = t6;
        this.t7 = t7;
    }

    public <R> Fn0<R> apply(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
        return Fn7.<T1, T2, T3, T4, T5, T6, T7, R>narrow(f).toFunction(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7);
    }

    public <V1, R> Fn1<V1, R> applyRt(Fn8<? super V1, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
        return Fn8.<V1, T1, T2, T3, T4, T5, T6, T7, R>narrow(f).applyRt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7);
    }

    public <V1, R> Fn1<V1, R> applyLt(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super V1, ? extends R> f) {
        return Fn8.<T1, T2, T3, T4, T5, T6, T7, V1, R>narrow(f).applyLt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7);
    }

    public <V1, R> Fn1<V1, R> apply1Rt(Fn8<? super V1, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
        return Fn8.<V1, T1, T2, T3, T4, T5, T6, T7, R>narrow(f).applyRt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7);
    }

    public <V1, R> Fn1<V1, R> apply1Lt(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super V1, ? extends R> f) {
        return Fn8.<T1, T2, T3, T4, T5, T6, T7, V1, R>narrow(f).applyLt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7);
    }

    public <R> R passApply(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
        return f.toFunction(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7).apply();
    }

    public <R, V> V passApplyAfter(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f, Fn1<? super R, ? extends V> a) {
        return f.toFunction(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7).afterApply(a).apply();
    }

    public <R> Fnc0<R> applyChecked(Fnc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
        return Fnc7.<T1, T2, T3, T4, T5, T6, T7, R>narrow(f).toFunction(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7);
    }

    public <V1, R> Fnc1<V1, R> applyCheckedRt(Fnc8<? super V1, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
        return Fnc8.<V1, T1, T2, T3, T4, T5, T6, T7, R>narrow(f).applyRt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7);
    }

    public <V1, R> Fnc1<V1, R> applyCheckedLt(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super V1, ? extends R> f) {
        return Fnc8.<T1, T2, T3, T4, T5, T6, T7, V1, R>narrow(f).applyLt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7);
    }

    public <V1, R> Fnc1<V1, R> applyChecked1Rt(Fnc8<? super V1, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
        return Fnc8.<V1, T1, T2, T3, T4, T5, T6, T7, R>narrow(f).applyRt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7);
    }

    public <V1, R> Fnc1<V1, R> applyChecked1Lt(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super V1, ? extends R> f) {
        return Fnc8.<T1, T2, T3, T4, T5, T6, T7, V1, R>narrow(f).applyLt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7);
    }

    public <R, W> W passApplyWrap(Fnc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f, Fn1<? super Spc<R>, ? extends W> w) {
        return Fnc7.<T1, T2, T3, T4, T5, T6, T7, R>narrow(f).toFunction(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7).beforeWrap(w).apply();
    }

    public Pr0 test(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        return p.toPredicate(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7);
    }

    public <V1> Pr1<V1> testRt(Pr8<? super V1, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        return Pr8.<V1, T1, T2, T3, T4, T5, T6, T7>narrow(p).testRt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7);
    }

    public <V1> Pr1<V1> testLt(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super V1> p) {
        return Pr8.<T1, T2, T3, T4, T5, T6, T7, V1>narrow(p).testLt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7);
    }

    public <V1> Pr1<V1> test1Rt(Pr8<? super V1, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        return Pr8.<V1, T1, T2, T3, T4, T5, T6, T7>narrow(p).testRt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7);
    }

    public <V1> Pr1<V1> test1Lt(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super V1> p) {
        return Pr8.<T1, T2, T3, T4, T5, T6, T7, V1>narrow(p).testLt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7);
    }

    public Boolean passTest(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        return p.toPredicate(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7).test();
    }

    public Prc0 testChecked(Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        return p.toPredicate(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7);
    }

    public <V1> Prc1<V1> testCheckedRt(Prc8<? super V1, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        return Prc8.<V1, T1, T2, T3, T4, T5, T6, T7>narrow(p).testRt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7);
    }

    public <V1> Prc1<V1> testCheckedLt(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super V1> p) {
        return Prc8.<T1, T2, T3, T4, T5, T6, T7, V1>narrow(p).testLt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7);
    }

    public <V1> Prc1<V1> testChecked1Rt(Prc8<? super V1, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        return Prc8.<V1, T1, T2, T3, T4, T5, T6, T7>narrow(p).testRt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7);
    }

    public <V1> Prc1<V1> testChecked1Lt(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super V1> p) {
        return Prc8.<T1, T2, T3, T4, T5, T6, T7, V1>narrow(p).testLt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7);
    }

    public Rn accept(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c) {
        return c.toRunnable(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7);
    }

    public <V1> Cs1<V1> acceptRt(Cs8<? super V1, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c) {
        return Cs8.<V1, T1, T2, T3, T4, T5, T6, T7>narrow(c).acceptRt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7);
    }

    public <V1> Cs1<V1> acceptLt(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super V1> c) {
        return Cs8.<T1, T2, T3, T4, T5, T6, T7, V1>narrow(c).acceptLt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7);
    }

    public <V1> Cs1<V1> accept1Rt(Cs8<? super V1, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c) {
        return Cs8.<V1, T1, T2, T3, T4, T5, T6, T7>narrow(c).acceptRt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7);
    }

    public <V1> Cs1<V1> accept1Lt(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super V1> c) {
        return Cs8.<T1, T2, T3, T4, T5, T6, T7, V1>narrow(c).acceptLt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7);
    }

    public Rnc acceptChecked(Csc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c) {
        return c.toRunnable(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7);
    }

    public <V1> Csc1<V1> acceptCheckedRt(Csc8<? super V1, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c) {
        return Csc8.<V1, T1, T2, T3, T4, T5, T6, T7>narrow(c).acceptRt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7);
    }

    public <V1> Csc1<V1> acceptCheckedLt(Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super V1> c) {
        return Csc8.<T1, T2, T3, T4, T5, T6, T7, V1>narrow(c).acceptLt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7);
    }

    public <V1> Csc1<V1> acceptChecked1Rt(Csc8<? super V1, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c) {
        return Csc8.<V1, T1, T2, T3, T4, T5, T6, T7>narrow(c).acceptRt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7);
    }

    public <V1> Csc1<V1> acceptChecked1Lt(Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super V1> c) {
        return Csc8.<T1, T2, T3, T4, T5, T6, T7, V1>narrow(c).acceptLt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7);
    }

}

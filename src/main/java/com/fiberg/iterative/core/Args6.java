package com.fiberg.iterative.core;

import com.fiberg.iterative.function.*;

public class Args6<T1, T2, T3, T4, T5, T6> {

    private T1 t1;
    private T2 t2;
    private T3 t3;
    private T4 t4;
    private T5 t5;
    private T6 t6;

    Args6(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.t4 = t4;
        this.t5 = t5;
        this.t6 = t6;
    }

    public <R> Fn0<R> apply(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fn0<R> apply = (Fn0<R>) Fn6.narrow(f).toFunction(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return apply;
    }

    public <V1, R> Fn1<V1, R> applyRt(Fn7<? super V1, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fn1<V1, R> apply = (Fn1<V1, R>) Fn7.narrow(f).applyRt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return apply;
    }

    public <V1, R> Fn1<V1, R> applyLt(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super V1, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fn1<V1, R> apply = (Fn1<V1, R>) Fn7.narrow(f).applyLt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return apply;
    }

    public <V1, R> Fn1<V1, R> apply1Rt(Fn7<? super V1, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fn1<V1, R> apply = (Fn1<V1, R>) Fn7.narrow(f).applyRt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return apply;
    }

    public <V1, R> Fn1<V1, R> apply1Lt(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super V1, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fn1<V1, R> apply = (Fn1<V1, R>) Fn7.narrow(f).applyLt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return apply;
    }

    public <V1, V3, R> Fn2<V1, V3, R> applyRt(Fn8<? super V1, ? super V3, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fn2<V1, V3, R> apply = (Fn2<V1, V3, R>) Fn8.narrow(f).applyRt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return apply;
    }

    public <V1, V3, R> Fn2<V1, V3, R> applyLt(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super V1, ? super V3, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fn2<V1, V3, R> apply = (Fn2<V1, V3, R>) Fn8.narrow(f).applyLt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return apply;
    }

    public <V1, V3, R> Fn2<V1, V3, R> apply2Rt(Fn8<? super V1, ? super V3, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fn2<V1, V3, R> apply = (Fn2<V1, V3, R>) Fn8.narrow(f).applyRt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return apply;
    }

    public <V1, V3, R> Fn2<V1, V3, R> apply2Lt(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super V1, ? super V3, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fn2<V1, V3, R> apply = (Fn2<V1, V3, R>) Fn8.narrow(f).applyLt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return apply;
    }

    public <R> R passApply(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f) {
        return (R) f.toFunction(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6).apply();
    }

    public <R, V> V passApplyAfter(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f, Fn1<? super R, ? extends V> a) {
        return (V) f.toFunction(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6).afterApply(a).apply();
    }

    public <R> Fnc0<R> applyChecked(Fnc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fnc0<R> apply = (Fnc0<R>) Fnc6.narrow(f).toFunction(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return apply;
    }

    public <V1, R> Fnc1<V1, R> applyCheckedRt(Fnc7<? super V1, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fnc1<V1, R> apply = (Fnc1<V1, R>) Fnc7.narrow(f).applyRt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return apply;
    }

    public <V1, R> Fnc1<V1, R> applyCheckedLt(Fnc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super V1, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fnc1<V1, R> apply = (Fnc1<V1, R>) Fnc7.narrow(f).applyLt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return apply;
    }

    public <V1, R> Fnc1<V1, R> applyChecked1Rt(Fnc7<? super V1, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fnc1<V1, R> apply = (Fnc1<V1, R>) Fnc7.narrow(f).applyRt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return apply;
    }

    public <V1, R> Fnc1<V1, R> applyChecked1Lt(Fnc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super V1, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fnc1<V1, R> apply = (Fnc1<V1, R>) Fnc7.narrow(f).applyLt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return apply;
    }

    public <V1, V3, R> Fnc2<V1, V3, R> applyCheckedRt(Fnc8<? super V1, ? super V3, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fnc2<V1, V3, R> apply = (Fnc2<V1, V3, R>) Fnc8.narrow(f).applyRt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return apply;
    }

    public <V1, V3, R> Fnc2<V1, V3, R> applyCheckedLt(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super V1, ? super V3, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fnc2<V1, V3, R> apply = (Fnc2<V1, V3, R>) Fnc8.narrow(f).applyLt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return apply;
    }

    public <V1, V3, R> Fnc2<V1, V3, R> applyChecked2Rt(Fnc8<? super V1, ? super V3, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fnc2<V1, V3, R> apply = (Fnc2<V1, V3, R>) Fnc8.narrow(f).applyRt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return apply;
    }

    public <V1, V3, R> Fnc2<V1, V3, R> applyChecked2Lt(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super V1, ? super V3, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fnc2<V1, V3, R> apply = (Fnc2<V1, V3, R>) Fnc8.narrow(f).applyLt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return apply;
    }

    public <R, W> W passApplyWrap(Fnc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f, Fn1<? super Spc<R>, ? extends W> a) {
        @SuppressWarnings("unchecked")
        final Fn1<? super Spc<? extends R>, W> wrap = (Fn1<? super Spc<? extends R>, W>) a;
        return Fnc6.narrow(f).toFunction(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6).beforeWrap(wrap).apply();
    }

    public Pr0 test(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        return p.toPredicate(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
    }

    public <V1> Pr1<V1> testRt(Pr7<? super V1, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        @SuppressWarnings("unchecked")
        final Pr1<V1> test = (Pr1<V1>) Pr7.narrow(p).testRt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return test;
    }

    public <V1> Pr1<V1> testLt(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super V1> p) {
        @SuppressWarnings("unchecked")
        final Pr1<V1> test = (Pr1<V1>) Pr7.narrow(p).testLt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return test;
    }

    public <V1> Pr1<V1> test1Rt(Pr7<? super V1, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        @SuppressWarnings("unchecked")
        final Pr1<V1> test = (Pr1<V1>) Pr7.narrow(p).testRt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return test;
    }

    public <V1> Pr1<V1> test1Lt(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super V1> p) {
        @SuppressWarnings("unchecked")
        final Pr1<V1> test = (Pr1<V1>) Pr7.narrow(p).testLt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return test;
    }

    public <V1, V3> Pr2<V1, V3> testRt(Pr8<? super V1, ? super V3, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        @SuppressWarnings("unchecked")
        final Pr2<V1, V3> test = (Pr2<V1, V3>) Pr8.narrow(p).testRt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return test;
    }

    public <V1, V3> Pr2<V1, V3> testLt(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super V1, ? super V3> p) {
        @SuppressWarnings("unchecked")
        final Pr2<V1, V3> test = (Pr2<V1, V3>) Pr8.narrow(p).testLt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return test;
    }

    public <V1, V3> Pr2<V1, V3> test2Rt(Pr8<? super V1, ? super V3, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        @SuppressWarnings("unchecked")
        final Pr2<V1, V3> test = (Pr2<V1, V3>) Pr8.narrow(p).testRt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return test;
    }

    public <V1, V3> Pr2<V1, V3> test2Lt(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super V1, ? super V3> p) {
        @SuppressWarnings("unchecked")
        final Pr2<V1, V3> test = (Pr2<V1, V3>) Pr8.narrow(p).testLt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return test;
    }

    public Boolean passTest(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        return p.toPredicate(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6).test();
    }

    public Prc0 testChecked(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        return p.toPredicate(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
    }

    public <V1> Prc1<V1> testCheckedRt(Prc7<? super V1, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        @SuppressWarnings("unchecked")
        final Prc1<V1> test = (Prc1<V1>) Prc7.narrow(p).testRt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return test;
    }

    public <V1> Prc1<V1> testCheckedLt(Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super V1> p) {
        @SuppressWarnings("unchecked")
        final Prc1<V1> test = (Prc1<V1>) Prc7.narrow(p).testLt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return test;
    }

    public <V1> Prc1<V1> testChecked1Rt(Prc7<? super V1, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        @SuppressWarnings("unchecked")
        final Prc1<V1> test = (Prc1<V1>) Prc7.narrow(p).testRt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return test;
    }

    public <V1> Prc1<V1> testChecked1Lt(Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super V1> p) {
        @SuppressWarnings("unchecked")
        final Prc1<V1> test = (Prc1<V1>) Prc7.narrow(p).testLt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return test;
    }

    public <V1, V3> Prc2<V1, V3> testCheckedRt(Prc8<? super V1, ? super V3, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        @SuppressWarnings("unchecked")
        final Prc2<V1, V3> test = (Prc2<V1, V3>) Prc8.narrow(p).testRt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return test;
    }

    public <V1, V3> Prc2<V1, V3> testCheckedLt(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super V1, ? super V3> p) {
        @SuppressWarnings("unchecked")
        final Prc2<V1, V3> test = (Prc2<V1, V3>) Prc8.narrow(p).testLt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return test;
    }

    public <V1, V3> Prc2<V1, V3> testChecked2Rt(Prc8<? super V1, ? super V3, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        @SuppressWarnings("unchecked")
        final Prc2<V1, V3> test = (Prc2<V1, V3>) Prc8.narrow(p).testRt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return test;
    }

    public <V1, V3> Prc2<V1, V3> testChecked2Lt(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super V1, ? super V3> p) {
        @SuppressWarnings("unchecked")
        final Prc2<V1, V3> test = (Prc2<V1, V3>) Prc8.narrow(p).testLt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return test;
    }

    public Rn accept(Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c) {
        return c.toRunnable(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
    }

    public <V1> Cs1<V1> acceptRt(Cs7<? super V1, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c) {
        @SuppressWarnings("unchecked")
        final Cs1<V1> accept = (Cs1<V1>) Cs7.narrow(c).acceptRt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return accept;
    }

    public <V1> Cs1<V1> acceptLt(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super V1> c) {
        @SuppressWarnings("unchecked")
        final Cs1<V1> accept = (Cs1<V1>) Cs7.narrow(c).acceptLt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return accept;
    }

    public <V1> Cs1<V1> accept1Rt(Cs7<? super V1, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c) {
        @SuppressWarnings("unchecked")
        final Cs1<V1> accept = (Cs1<V1>) Cs7.narrow(c).acceptRt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return accept;
    }

    public <V1> Cs1<V1> accept1Lt(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super V1> c) {
        @SuppressWarnings("unchecked")
        final Cs1<V1> accept = (Cs1<V1>) Cs7.narrow(c).acceptLt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return accept;
    }

    public <V1, V3> Cs2<V1, V3> acceptRt(Cs8<? super V1, ? super V3, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c) {
        @SuppressWarnings("unchecked")
        final Cs2<V1, V3> accept = (Cs2<V1, V3>) Cs8.narrow(c).acceptRt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return accept;
    }

    public <V1, V3> Cs2<V1, V3> acceptLt(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super V1, ? super V3> c) {
        @SuppressWarnings("unchecked")
        final Cs2<V1, V3> accept = (Cs2<V1, V3>) Cs8.narrow(c).acceptLt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return accept;
    }

    public <V1, V3> Cs2<V1, V3> accept2Rt(Cs8<? super V1, ? super V3, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c) {
        @SuppressWarnings("unchecked")
        final Cs2<V1, V3> accept = (Cs2<V1, V3>) Cs8.narrow(c).acceptRt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return accept;
    }

    public <V1, V3> Cs2<V1, V3> accept2Lt(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super V1, ? super V3> c) {
        @SuppressWarnings("unchecked")
        final Cs2<V1, V3> accept = (Cs2<V1, V3>) Cs8.narrow(c).acceptLt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return accept;
    }

    public Rnc acceptChecked(Csc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c) {
        return c.toRunnable(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
    }

    public <V1> Csc1<V1> acceptCheckedRt(Csc7<? super V1, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c) {
        @SuppressWarnings("unchecked")
        final Csc1<V1> accept = (Csc1<V1>) Csc7.narrow(c).acceptRt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return accept;
    }

    public <V1> Csc1<V1> acceptCheckedLt(Csc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super V1> c) {
        @SuppressWarnings("unchecked")
        final Csc1<V1> accept = (Csc1<V1>) Csc7.narrow(c).acceptLt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return accept;
    }

    public <V1> Csc1<V1> acceptChecked1Rt(Csc7<? super V1, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c) {
        @SuppressWarnings("unchecked")
        final Csc1<V1> accept = (Csc1<V1>) Csc7.narrow(c).acceptRt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return accept;
    }

    public <V1> Csc1<V1> acceptChecked1Lt(Csc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super V1> c) {
        @SuppressWarnings("unchecked")
        final Csc1<V1> accept = (Csc1<V1>) Csc7.narrow(c).acceptLt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return accept;
    }

    public <V1, V3> Csc2<V1, V3> acceptCheckedRt(Csc8<? super V1, ? super V3, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c) {
        @SuppressWarnings("unchecked")
        final Csc2<V1, V3> accept = (Csc2<V1, V3>) Csc8.narrow(c).acceptRt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return accept;
    }

    public <V1, V3> Csc2<V1, V3> acceptCheckedLt(Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super V1, ? super V3> c) {
        @SuppressWarnings("unchecked")
        final Csc2<V1, V3> accept = (Csc2<V1, V3>) Csc8.narrow(c).acceptLt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return accept;
    }

    public <V1, V3> Csc2<V1, V3> acceptChecked2Rt(Csc8<? super V1, ? super V3, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c) {
        @SuppressWarnings("unchecked")
        final Csc2<V1, V3> accept = (Csc2<V1, V3>) Csc8.narrow(c).acceptRt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return accept;
    }

    public <V1, V3> Csc2<V1, V3> acceptChecked2Lt(Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super V1, ? super V3> c) {
        @SuppressWarnings("unchecked")
        final Csc2<V1, V3> accept = (Csc2<V1, V3>) Csc8.narrow(c).acceptLt(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6);
        return accept;
    }

}

package com.fiberg.iterative.core;

import com.fiberg.iterative.function.*;

public class Args5<T1, T2, T3, T4, T5> {

    private final T1 t1;
    private final T2 t2;
    private final T3 t3;
    private final T4 t4;
    private final T5 t5;

    Args5(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.t4 = t4;
        this.t5 = t5;
    }

    public <R> Fn0<R> apply(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        return Fn5.<T1, T2, T3, T4, T5, R>narrow(f).toFunction(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, R> Fn1<V1, R> applyRt(Fn6<? super V1, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        return Fn6.<V1, T1, T2, T3, T4, T5, R>narrow(f).applyRt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, R> Fn1<V1, R> applyLt(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super V1, ? extends R> f) {
        return Fn6.<T1, T2, T3, T4, T5, V1, R>narrow(f).applyLt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, R> Fn1<V1, R> apply1Rt(Fn6<? super V1, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        return Fn6.<V1, T1, T2, T3, T4, T5, R>narrow(f).applyRt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, R> Fn1<V1, R> apply1Lt(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super V1, ? extends R> f) {
        return Fn6.<T1, T2, T3, T4, T5, V1, R>narrow(f).applyLt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2, R> Fn2<V1, V2, R> applyRt(Fn7<? super V1, ? super V2, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        return Fn7.<V1, V2, T1, T2, T3, T4, T5, R>narrow(f).applyRt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2, R> Fn2<V1, V2, R> applyLt(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super V1, ? super V2, ? extends R> f) {
        return Fn7.<T1, T2, T3, T4, T5, V1, V2, R>narrow(f).applyLt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2, R> Fn2<V1, V2, R> apply2Rt(Fn7<? super V1, ? super V2, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        return Fn7.<V1, V2, T1, T2, T3, T4, T5, R>narrow(f).applyRt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2, R> Fn2<V1, V2, R> apply2Lt(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super V1, ? super V2, ? extends R> f) {
        return Fn7.<T1, T2, T3, T4, T5, V1, V2, R>narrow(f).applyLt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2, V3, R> Fn3<V1, V2, V3, R> applyRt(Fn8<? super V1, ? super V2, ? super V3, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        return Fn8.<V1, V2, V3, T1, T2, T3, T4, T5, R>narrow(f).applyRt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2, V3, R> Fn3<V1, V2, V3, R> applyLt(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super V1, ? super V2, ? super V3, ? extends R> f) {
        return Fn8.<T1, T2, T3, T4, T5, V1, V2, V3, R>narrow(f).applyLt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2, V3, R> Fn3<V1, V2, V3, R> apply3Rt(Fn8<? super V1, ? super V2, ? super V3, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        return Fn8.<V1, V2, V3, T1, T2, T3, T4, T5, R>narrow(f).applyRt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2, V3, R> Fn3<V1, V2, V3, R> apply3Lt(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super V1, ? super V2, ? super V3, ? extends R> f) {
        return Fn8.<T1, T2, T3, T4, T5, V1, V2, V3, R>narrow(f).applyLt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <R> R passApply(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        return f.toFunction(this.t1, this.t2, this.t3, this.t4, this.t5).apply();
    }

    public <R, V> V passApplyAfter(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f, Fn1<? super R, ? extends V> a) {
        return f.toFunction(this.t1, this.t2, this.t3, this.t4, this.t5).afterApply(a).apply();
    }

    public <R> Fnc0<R> applyChecked(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        return Fnc5.<T1, T2, T3, T4, T5, R>narrow(f).toFunction(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, R> Fnc1<V1, R> applyCheckedRt(Fnc6<? super V1, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        return Fnc6.<V1, T1, T2, T3, T4, T5, R>narrow(f).applyRt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, R> Fnc1<V1, R> applyCheckedLt(Fnc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super V1, ? extends R> f) {
        return Fnc6.<T1, T2, T3, T4, T5, V1, R>narrow(f).applyLt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, R> Fnc1<V1, R> applyChecked1Rt(Fnc6<? super V1, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        return Fnc6.<V1, T1, T2, T3, T4, T5, R>narrow(f).applyRt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, R> Fnc1<V1, R> applyChecked1Lt(Fnc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super V1, ? extends R> f) {
        return Fnc6.<T1, T2, T3, T4, T5, V1, R>narrow(f).applyLt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2, R> Fnc2<V1, V2, R> applyCheckedRt(Fnc7<? super V1, ? super V2, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        return Fnc7.<V1, V2, T1, T2, T3, T4, T5, R>narrow(f).applyRt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2, R> Fnc2<V1, V2, R> applyCheckedLt(Fnc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super V1, ? super V2, ? extends R> f) {
        return Fnc7.<T1, T2, T3, T4, T5, V1, V2, R>narrow(f).applyLt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2, R> Fnc2<V1, V2, R> applyChecked2Rt(Fnc7<? super V1, ? super V2, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        return Fnc7.<V1, V2, T1, T2, T3, T4, T5, R>narrow(f).applyRt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2, R> Fnc2<V1, V2, R> applyChecked2Lt(Fnc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super V1, ? super V2, ? extends R> f) {
        return Fnc7.<T1, T2, T3, T4, T5, V1, V2, R>narrow(f).applyLt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2, V3, R> Fnc3<V1, V2, V3, R> applyCheckedRt(Fnc8<? super V1, ? super V2, ? super V3, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        return Fnc8.<V1, V2, V3, T1, T2, T3, T4, T5, R>narrow(f).applyRt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2, V3, R> Fnc3<V1, V2, V3, R> applyCheckedLt(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super V1, ? super V2, ? super V3, ? extends R> f) {
        return Fnc8.<T1, T2, T3, T4, T5, V1, V2, V3, R>narrow(f).applyLt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2, V3, R> Fnc3<V1, V2, V3, R> applyChecked3Rt(Fnc8<? super V1, ? super V2, ? super V3, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        return Fnc8.<V1, V2, V3, T1, T2, T3, T4, T5, R>narrow(f).applyRt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2, V3, R> Fnc3<V1, V2, V3, R> applyChecked3Lt(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super V1, ? super V2, ? super V3, ? extends R> f) {
        return Fnc8.<T1, T2, T3, T4, T5, V1, V2, V3, R>narrow(f).applyLt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <R, W> W passApplyWrap(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f, Fn1<? super Spc<R>, ? extends W> w) {
        return Fnc5.<T1, T2, T3, T4, T5, R>narrow(f).toFunction(this.t1, this.t2, this.t3, this.t4, this.t5).beforeWrap(w).apply();
    }

    public Pr0 test(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return p.toPredicate(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1> Pr1<V1> testRt(Pr6<? super V1, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return Pr6.<V1, T1, T2, T3, T4, T5>narrow(p).testRt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1> Pr1<V1> testLt(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super V1> p) {
        return Pr6.<T1, T2, T3, T4, T5, V1>narrow(p).testLt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1> Pr1<V1> test1Rt(Pr6<? super V1, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return Pr6.<V1, T1, T2, T3, T4, T5>narrow(p).testRt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1> Pr1<V1> test1Lt(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super V1> p) {
        return Pr6.<T1, T2, T3, T4, T5, V1>narrow(p).testLt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2> Pr2<V1, V2> testRt(Pr7<? super V1, ? super V2, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return Pr7.<V1, V2, T1, T2, T3, T4, T5>narrow(p).testRt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2> Pr2<V1, V2> testLt(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super V1, ? super V2> p) {
        return Pr7.<T1, T2, T3, T4, T5, V1, V2>narrow(p).testLt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2> Pr2<V1, V2> test2Rt(Pr7<? super V1, ? super V2, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return Pr7.<V1, V2, T1, T2, T3, T4, T5>narrow(p).testRt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2> Pr2<V1, V2> test2Lt(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super V1, ? super V2> p) {
        return Pr7.<T1, T2, T3, T4, T5, V1, V2>narrow(p).testLt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2, V3> Pr3<V1, V2, V3> testRt(Pr8<? super V1, ? super V2, ? super V3, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return Pr8.<V1, V2, V3, T1, T2, T3, T4, T5>narrow(p).testRt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2, V3> Pr3<V1, V2, V3> testLt(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super V1, ? super V2, ? super V3> p) {
        return Pr8.<T1, T2, T3, T4, T5, V1, V2, V3>narrow(p).testLt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2, V3> Pr3<V1, V2, V3> test3Rt(Pr8<? super V1, ? super V2, ? super V3, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return Pr8.<V1, V2, V3, T1, T2, T3, T4, T5>narrow(p).testRt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2, V3> Pr3<V1, V2, V3> test3Lt(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super V1, ? super V2, ? super V3> p) {
        return Pr8.<T1, T2, T3, T4, T5, V1, V2, V3>narrow(p).testLt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public Boolean passTest(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return p.toPredicate(this.t1, this.t2, this.t3, this.t4, this.t5).test();
    }

    public Prc0 testChecked(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return p.toPredicate(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1> Prc1<V1> testCheckedRt(Prc6<? super V1, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return Prc6.<V1, T1, T2, T3, T4, T5>narrow(p).testRt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1> Prc1<V1> testCheckedLt(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super V1> p) {
        return Prc6.<T1, T2, T3, T4, T5, V1>narrow(p).testLt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1> Prc1<V1> testChecked1Rt(Prc6<? super V1, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return Prc6.<V1, T1, T2, T3, T4, T5>narrow(p).testRt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1> Prc1<V1> testChecked1Lt(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super V1> p) {
        return Prc6.<T1, T2, T3, T4, T5, V1>narrow(p).testLt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2> Prc2<V1, V2> testCheckedRt(Prc7<? super V1, ? super V2, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return Prc7.<V1, V2, T1, T2, T3, T4, T5>narrow(p).testRt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2> Prc2<V1, V2> testCheckedLt(Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super V1, ? super V2> p) {
        return Prc7.<T1, T2, T3, T4, T5, V1, V2>narrow(p).testLt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2> Prc2<V1, V2> testChecked2Rt(Prc7<? super V1, ? super V2, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return Prc7.<V1, V2, T1, T2, T3, T4, T5>narrow(p).testRt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2> Prc2<V1, V2> testChecked2Lt(Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super V1, ? super V2> p) {
        return Prc7.<T1, T2, T3, T4, T5, V1, V2>narrow(p).testLt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2, V3> Prc3<V1, V2, V3> testCheckedRt(Prc8<? super V1, ? super V2, ? super V3, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return Prc8.<V1, V2, V3, T1, T2, T3, T4, T5>narrow(p).testRt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2, V3> Prc3<V1, V2, V3> testCheckedLt(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super V1, ? super V2, ? super V3> p) {
        return Prc8.<T1, T2, T3, T4, T5, V1, V2, V3>narrow(p).testLt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2, V3> Prc3<V1, V2, V3> testChecked3Rt(Prc8<? super V1, ? super V2, ? super V3, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return Prc8.<V1, V2, V3, T1, T2, T3, T4, T5>narrow(p).testRt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2, V3> Prc3<V1, V2, V3> testChecked3Lt(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super V1, ? super V2, ? super V3> p) {
        return Prc8.<T1, T2, T3, T4, T5, V1, V2, V3>narrow(p).testLt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public Rn accept(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        return c.toRunnable(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1> Cs1<V1> acceptRt(Cs6<? super V1, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        return Cs6.<V1, T1, T2, T3, T4, T5>narrow(c).acceptRt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1> Cs1<V1> acceptLt(Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super V1> c) {
        return Cs6.<T1, T2, T3, T4, T5, V1>narrow(c).acceptLt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1> Cs1<V1> accept1Rt(Cs6<? super V1, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        return Cs6.<V1, T1, T2, T3, T4, T5>narrow(c).acceptRt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1> Cs1<V1> accept1Lt(Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super V1> c) {
        return Cs6.<T1, T2, T3, T4, T5, V1>narrow(c).acceptLt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2> Cs2<V1, V2> acceptRt(Cs7<? super V1, ? super V2, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        return Cs7.<V1, V2, T1, T2, T3, T4, T5>narrow(c).acceptRt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2> Cs2<V1, V2> acceptLt(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super V1, ? super V2> c) {
        return Cs7.<T1, T2, T3, T4, T5, V1, V2>narrow(c).acceptLt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2> Cs2<V1, V2> accept2Rt(Cs7<? super V1, ? super V2, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        return Cs7.<V1, V2, T1, T2, T3, T4, T5>narrow(c).acceptRt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2> Cs2<V1, V2> accept2Lt(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super V1, ? super V2> c) {
        return Cs7.<T1, T2, T3, T4, T5, V1, V2>narrow(c).acceptLt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2, V3> Cs3<V1, V2, V3> acceptRt(Cs8<? super V1, ? super V2, ? super V3, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        return Cs8.<V1, V2, V3, T1, T2, T3, T4, T5>narrow(c).acceptRt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2, V3> Cs3<V1, V2, V3> acceptLt(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super V1, ? super V2, ? super V3> c) {
        return Cs8.<T1, T2, T3, T4, T5, V1, V2, V3>narrow(c).acceptLt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2, V3> Cs3<V1, V2, V3> accept3Rt(Cs8<? super V1, ? super V2, ? super V3, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        return Cs8.<V1, V2, V3, T1, T2, T3, T4, T5>narrow(c).acceptRt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2, V3> Cs3<V1, V2, V3> accept3Lt(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super V1, ? super V2, ? super V3> c) {
        return Cs8.<T1, T2, T3, T4, T5, V1, V2, V3>narrow(c).acceptLt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public Rnc acceptChecked(Csc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        return c.toRunnable(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1> Csc1<V1> acceptCheckedRt(Csc6<? super V1, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        return Csc6.<V1, T1, T2, T3, T4, T5>narrow(c).acceptRt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1> Csc1<V1> acceptCheckedLt(Csc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super V1> c) {
        return Csc6.<T1, T2, T3, T4, T5, V1>narrow(c).acceptLt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1> Csc1<V1> acceptChecked1Rt(Csc6<? super V1, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        return Csc6.<V1, T1, T2, T3, T4, T5>narrow(c).acceptRt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1> Csc1<V1> acceptChecked1Lt(Csc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super V1> c) {
        return Csc6.<T1, T2, T3, T4, T5, V1>narrow(c).acceptLt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2> Csc2<V1, V2> acceptCheckedRt(Csc7<? super V1, ? super V2, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        return Csc7.<V1, V2, T1, T2, T3, T4, T5>narrow(c).acceptRt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2> Csc2<V1, V2> acceptCheckedLt(Csc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super V1, ? super V2> c) {
        return Csc7.<T1, T2, T3, T4, T5, V1, V2>narrow(c).acceptLt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2> Csc2<V1, V2> acceptChecked2Rt(Csc7<? super V1, ? super V2, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        return Csc7.<V1, V2, T1, T2, T3, T4, T5>narrow(c).acceptRt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2> Csc2<V1, V2> acceptChecked2Lt(Csc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super V1, ? super V2> c) {
        return Csc7.<T1, T2, T3, T4, T5, V1, V2>narrow(c).acceptLt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2, V3> Csc3<V1, V2, V3> acceptCheckedRt(Csc8<? super V1, ? super V2, ? super V3, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        return Csc8.<V1, V2, V3, T1, T2, T3, T4, T5>narrow(c).acceptRt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2, V3> Csc3<V1, V2, V3> acceptCheckedLt(Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super V1, ? super V2, ? super V3> c) {
        return Csc8.<T1, T2, T3, T4, T5, V1, V2, V3>narrow(c).acceptLt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2, V3> Csc3<V1, V2, V3> acceptChecked3Rt(Csc8<? super V1, ? super V2, ? super V3, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        return Csc8.<V1, V2, V3, T1, T2, T3, T4, T5>narrow(c).acceptRt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

    public <V1, V2, V3> Csc3<V1, V2, V3> acceptChecked3Lt(Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super V1, ? super V2, ? super V3> c) {
        return Csc8.<T1, T2, T3, T4, T5, V1, V2, V3>narrow(c).acceptLt(this.t1, this.t2, this.t3, this.t4, this.t5);
    }

}

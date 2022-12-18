package com.fiberg.iterative.core;

import com.fiberg.iterative.function.Cs1;
import com.fiberg.iterative.function.Cs2;
import com.fiberg.iterative.function.Cs3;
import com.fiberg.iterative.function.Cs4;
import com.fiberg.iterative.function.Cs5;
import com.fiberg.iterative.function.Cs6;
import com.fiberg.iterative.function.Cs7;
import com.fiberg.iterative.function.Cs8;
import com.fiberg.iterative.function.Csc1;
import com.fiberg.iterative.function.Csc2;
import com.fiberg.iterative.function.Csc3;
import com.fiberg.iterative.function.Csc4;
import com.fiberg.iterative.function.Csc5;
import com.fiberg.iterative.function.Csc6;
import com.fiberg.iterative.function.Csc7;
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
import com.fiberg.iterative.function.Fnc0;
import com.fiberg.iterative.function.Fnc1;
import com.fiberg.iterative.function.Fnc2;
import com.fiberg.iterative.function.Fnc3;
import com.fiberg.iterative.function.Fnc4;
import com.fiberg.iterative.function.Fnc5;
import com.fiberg.iterative.function.Fnc6;
import com.fiberg.iterative.function.Fnc7;
import com.fiberg.iterative.function.Fnc8;
import com.fiberg.iterative.function.Pr0;
import com.fiberg.iterative.function.Pr1;
import com.fiberg.iterative.function.Pr2;
import com.fiberg.iterative.function.Pr3;
import com.fiberg.iterative.function.Pr4;
import com.fiberg.iterative.function.Pr5;
import com.fiberg.iterative.function.Pr6;
import com.fiberg.iterative.function.Pr7;
import com.fiberg.iterative.function.Pr8;
import com.fiberg.iterative.function.Prc0;
import com.fiberg.iterative.function.Prc1;
import com.fiberg.iterative.function.Prc2;
import com.fiberg.iterative.function.Prc3;
import com.fiberg.iterative.function.Prc4;
import com.fiberg.iterative.function.Prc5;
import com.fiberg.iterative.function.Prc6;
import com.fiberg.iterative.function.Prc7;
import com.fiberg.iterative.function.Prc8;
import com.fiberg.iterative.function.Rn;
import com.fiberg.iterative.function.Rnc;
import com.fiberg.iterative.function.Spc;

public class Args3<T1, T2, T3> {

    private T1 t1;
    private T2 t2;
    private T3 t3;

    Args3(T1 t1, T2 t2, T3 t3) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }

    public <R> Fn0<R> apply(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fn0<R> apply = (Fn0<R>) Fn3.narrow(f).toFunction(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, R> Fn1<V1, R> applyRt(Fn4<? super V1, ? super T1, ? super T2, ? super T3, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fn1<V1, R> apply = (Fn1<V1, R>) Fn4.narrow(f).applyRt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, R> Fn1<V1, R> applyLt(Fn4<? super T1, ? super T2, ? super T3, ? super V1, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fn1<V1, R> apply = (Fn1<V1, R>) Fn4.narrow(f).applyLt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, R> Fn1<V1, R> apply1Rt(Fn4<? super V1, ? super T1, ? super T2, ? super T3, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fn1<V1, R> apply = (Fn1<V1, R>) Fn4.narrow(f).applyRt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, R> Fn1<V1, R> apply1Lt(Fn4<? super T1, ? super T2, ? super T3, ? super V1, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fn1<V1, R> apply = (Fn1<V1, R>) Fn4.narrow(f).applyLt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, V2, R> Fn2<V1, V2, R> applyRt(Fn5<? super V1, ? super V2, ? super T1, ? super T2, ? super T3, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fn2<V1, V2, R> apply = (Fn2<V1, V2, R>) Fn5.narrow(f).applyRt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, V2, R> Fn2<V1, V2, R> applyLt(Fn5<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fn2<V1, V2, R> apply = (Fn2<V1, V2, R>) Fn5.narrow(f).applyLt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, V2, R> Fn2<V1, V2, R> apply2Rt(Fn5<? super V1, ? super V2, ? super T1, ? super T2, ? super T3, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fn2<V1, V2, R> apply = (Fn2<V1, V2, R>) Fn5.narrow(f).applyRt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, V2, R> Fn2<V1, V2, R> apply2Lt(Fn5<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fn2<V1, V2, R> apply = (Fn2<V1, V2, R>) Fn5.narrow(f).applyLt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, V2, V3, R> Fn3<V1, V2, V3, R> applyRt(Fn6<? super V1, ? super V2, ? super V3, ? super T1, ? super T2, ? super T3, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fn3<V1, V2, V3, R> apply = (Fn3<V1, V2, V3, R>) Fn6.narrow(f).applyRt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, V2, V3, R> Fn3<V1, V2, V3, R> applyLt(Fn6<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? super V3, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fn3<V1, V2, V3, R> apply = (Fn3<V1, V2, V3, R>) Fn6.narrow(f).applyLt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, V2, V3, R> Fn3<V1, V2, V3, R> apply3Rt(Fn6<? super V1, ? super V2, ? super V3, ? super T1, ? super T2, ? super T3, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fn3<V1, V2, V3, R> apply = (Fn3<V1, V2, V3, R>) Fn6.narrow(f).applyRt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, V2, V3, R> Fn3<V1, V2, V3, R> apply3Lt(Fn6<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? super V3, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fn3<V1, V2, V3, R> apply = (Fn3<V1, V2, V3, R>) Fn6.narrow(f).applyLt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, V2, V3, V4, R> Fn4<V1, V2, V3, V4, R> applyRt(Fn7<? super V1, ? super V2, ? super V3, ? super V4, ? super T1, ? super T2, ? super T3, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fn4<V1, V2, V3, V4, R> apply = (Fn4<V1, V2, V3, V4, R>) Fn7.narrow(f).applyRt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, V2, V3, V4, R> Fn4<V1, V2, V3, V4, R> applyLt(Fn7<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? super V3, ? super V4, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fn4<V1, V2, V3, V4, R> apply = (Fn4<V1, V2, V3, V4, R>) Fn7.narrow(f).applyLt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, V2, V3, V4, R> Fn4<V1, V2, V3, V4, R> apply4Rt(Fn7<? super V1, ? super V2, ? super V3, ? super V4, ? super T1, ? super T2, ? super T3, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fn4<V1, V2, V3, V4, R> apply = (Fn4<V1, V2, V3, V4, R>) Fn7.narrow(f).applyRt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, V2, V3, V4, R> Fn4<V1, V2, V3, V4, R> apply4Lt(Fn7<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? super V3, ? super V4, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fn4<V1, V2, V3, V4, R> apply = (Fn4<V1, V2, V3, V4, R>) Fn7.narrow(f).applyLt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, V2, V3, V4, V5, R> Fn5<V1, V2, V3, V4, V5, R> applyRt(Fn8<? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super T1, ? super T2, ? super T3, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fn5<V1, V2, V3, V4, V5, R> apply = (Fn5<V1, V2, V3, V4, V5, R>) Fn8.narrow(f).applyRt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, V2, V3, V4, V5, R> Fn5<V1, V2, V3, V4, V5, R> applyLt(Fn8<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fn5<V1, V2, V3, V4, V5, R> apply = (Fn5<V1, V2, V3, V4, V5, R>) Fn8.narrow(f).applyLt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, V2, V3, V4, V5, R> Fn5<V1, V2, V3, V4, V5, R> apply5Rt(Fn8<? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super T1, ? super T2, ? super T3, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fn5<V1, V2, V3, V4, V5, R> apply = (Fn5<V1, V2, V3, V4, V5, R>) Fn8.narrow(f).applyRt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, V2, V3, V4, V5, R> Fn5<V1, V2, V3, V4, V5, R> apply5Lt(Fn8<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fn5<V1, V2, V3, V4, V5, R> apply = (Fn5<V1, V2, V3, V4, V5, R>) Fn8.narrow(f).applyLt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <R> R passApply(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        return (R) f.toFunction(this.t1, this.t2, this.t3).apply();
    }

    public <R, V> V passApplyAfter(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f, Fn1<? super R, ? extends V> a) {
        return (V) f.toFunction(this.t1, this.t2, this.t3).afterApply(a).apply();
    }

    public <R> Fnc0<R> applyChecked(Fnc3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fnc0<R> apply = (Fnc0<R>) Fnc3.narrow(f).toFunction(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, R> Fnc1<V1, R> applyCheckedRt(Fnc4<? super V1, ? super T1, ? super T2, ? super T3, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fnc1<V1, R> apply = (Fnc1<V1, R>) Fnc4.narrow(f).applyRt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, R> Fnc1<V1, R> applyCheckedLt(Fnc4<? super T1, ? super T2, ? super T3, ? super V1, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fnc1<V1, R> apply = (Fnc1<V1, R>) Fnc4.narrow(f).applyLt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, R> Fnc1<V1, R> applyChecked1Rt(Fnc4<? super V1, ? super T1, ? super T2, ? super T3, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fnc1<V1, R> apply = (Fnc1<V1, R>) Fnc4.narrow(f).applyRt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, R> Fnc1<V1, R> applyChecked1Lt(Fnc4<? super T1, ? super T2, ? super T3, ? super V1, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fnc1<V1, R> apply = (Fnc1<V1, R>) Fnc4.narrow(f).applyLt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, V2, R> Fnc2<V1, V2, R> applyCheckedRt(Fnc5<? super V1, ? super V2, ? super T1, ? super T2, ? super T3, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fnc2<V1, V2, R> apply = (Fnc2<V1, V2, R>) Fnc5.narrow(f).applyRt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, V2, R> Fnc2<V1, V2, R> applyCheckedLt(Fnc5<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fnc2<V1, V2, R> apply = (Fnc2<V1, V2, R>) Fnc5.narrow(f).applyLt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, V2, R> Fnc2<V1, V2, R> applyChecked2Rt(Fnc5<? super V1, ? super V2, ? super T1, ? super T2, ? super T3, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fnc2<V1, V2, R> apply = (Fnc2<V1, V2, R>) Fnc5.narrow(f).applyRt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, V2, R> Fnc2<V1, V2, R> applyChecked2Lt(Fnc5<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fnc2<V1, V2, R> apply = (Fnc2<V1, V2, R>) Fnc5.narrow(f).applyLt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, V2, V3, R> Fnc3<V1, V2, V3, R> applyCheckedRt(Fnc6<? super V1, ? super V2, ? super V3, ? super T1, ? super T2, ? super T3, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fnc3<V1, V2, V3, R> apply = (Fnc3<V1, V2, V3, R>) Fnc6.narrow(f).applyRt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, V2, V3, R> Fnc3<V1, V2, V3, R> applyCheckedLt(Fnc6<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? super V3, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fnc3<V1, V2, V3, R> apply = (Fnc3<V1, V2, V3, R>) Fnc6.narrow(f).applyLt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, V2, V3, R> Fnc3<V1, V2, V3, R> applyChecked3Rt(Fnc6<? super V1, ? super V2, ? super V3, ? super T1, ? super T2, ? super T3, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fnc3<V1, V2, V3, R> apply = (Fnc3<V1, V2, V3, R>) Fnc6.narrow(f).applyRt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, V2, V3, R> Fnc3<V1, V2, V3, R> applyChecked3Lt(Fnc6<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? super V3, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fnc3<V1, V2, V3, R> apply = (Fnc3<V1, V2, V3, R>) Fnc6.narrow(f).applyLt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, V2, V3, V4, R> Fnc4<V1, V2, V3, V4, R> applyCheckedRt(Fnc7<? super V1, ? super V2, ? super V3, ? super V4, ? super T1, ? super T2, ? super T3, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fnc4<V1, V2, V3, V4, R> apply = (Fnc4<V1, V2, V3, V4, R>) Fnc7.narrow(f).applyRt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, V2, V3, V4, R> Fnc4<V1, V2, V3, V4, R> applyCheckedLt(Fnc7<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? super V3, ? super V4, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fnc4<V1, V2, V3, V4, R> apply = (Fnc4<V1, V2, V3, V4, R>) Fnc7.narrow(f).applyLt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, V2, V3, V4, R> Fnc4<V1, V2, V3, V4, R> applyChecked4Rt(Fnc7<? super V1, ? super V2, ? super V3, ? super V4, ? super T1, ? super T2, ? super T3, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fnc4<V1, V2, V3, V4, R> apply = (Fnc4<V1, V2, V3, V4, R>) Fnc7.narrow(f).applyRt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, V2, V3, V4, R> Fnc4<V1, V2, V3, V4, R> applyChecked4Lt(Fnc7<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? super V3, ? super V4, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fnc4<V1, V2, V3, V4, R> apply = (Fnc4<V1, V2, V3, V4, R>) Fnc7.narrow(f).applyLt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, V2, V3, V4, V5, R> Fnc5<V1, V2, V3, V4, V5, R> applyCheckedRt(Fnc8<? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super T1, ? super T2, ? super T3, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fnc5<V1, V2, V3, V4, V5, R> apply = (Fnc5<V1, V2, V3, V4, V5, R>) Fnc8.narrow(f).applyRt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, V2, V3, V4, V5, R> Fnc5<V1, V2, V3, V4, V5, R> applyCheckedLt(Fnc8<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fnc5<V1, V2, V3, V4, V5, R> apply = (Fnc5<V1, V2, V3, V4, V5, R>) Fnc8.narrow(f).applyLt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, V2, V3, V4, V5, R> Fnc5<V1, V2, V3, V4, V5, R> applyChecked5Rt(Fnc8<? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super T1, ? super T2, ? super T3, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fnc5<V1, V2, V3, V4, V5, R> apply = (Fnc5<V1, V2, V3, V4, V5, R>) Fnc8.narrow(f).applyRt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <V1, V2, V3, V4, V5, R> Fnc5<V1, V2, V3, V4, V5, R> applyChecked5Lt(Fnc8<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? extends R> f) {
        @SuppressWarnings("unchecked")
        final Fnc5<V1, V2, V3, V4, V5, R> apply = (Fnc5<V1, V2, V3, V4, V5, R>) Fnc8.narrow(f).applyLt(this.t1, this.t2, this.t3);
        return apply;
    }

    public <R, W> W pasApplyWrap(Fnc3<? super T1, ? super T2, ? super T3, ? extends R> f, Fn1<? super Spc<R>, ? extends W> a) {
        @SuppressWarnings("unchecked")
        final Fn1<? super Spc<? extends R>, W> wrap = (Fn1<? super Spc<? extends R>, W>) a;
        return Fnc3.narrow(f).toFunction(this.t1, this.t2, this.t3).beforeWrap(wrap).apply();
    }

    public Pr0 test(Pr3<? super T1, ? super T2, ? super T3> p) {
        return p.toPredicate(this.t1, this.t2, this.t3);
    }

    public <V1> Pr1<V1> testRt(Pr4<? super V1, ? super T1, ? super T2, ? super T3> p) {
        @SuppressWarnings("unchecked")
        final Pr1<V1> test = (Pr1<V1>) Pr4.narrow(p).testRt(this.t1, this.t2, this.t3);
        return test;
    }

    public <V1> Pr1<V1> testLt(Pr4<? super T1, ? super T2, ? super T3, ? super V1> p) {
        @SuppressWarnings("unchecked")
        final Pr1<V1> test = (Pr1<V1>) Pr4.narrow(p).testLt(this.t1, this.t2, this.t3);
        return test;
    }

    public <V1> Pr1<V1> test1Rt(Pr4<? super V1, ? super T1, ? super T2, ? super T3> p) {
        @SuppressWarnings("unchecked")
        final Pr1<V1> test = (Pr1<V1>) Pr4.narrow(p).testRt(this.t1, this.t2, this.t3);
        return test;
    }

    public <V1> Pr1<V1> test1Lt(Pr4<? super T1, ? super T2, ? super T3, ? super V1> p) {
        @SuppressWarnings("unchecked")
        final Pr1<V1> test = (Pr1<V1>) Pr4.narrow(p).testLt(this.t1, this.t2, this.t3);
        return test;
    }

    public <V1, V2> Pr2<V1, V2> testRt(Pr5<? super V1, ? super V2, ? super T1, ? super T2, ? super T3> p) {
        @SuppressWarnings("unchecked")
        final Pr2<V1, V2> test = (Pr2<V1, V2>) Pr5.narrow(p).testRt(this.t1, this.t2, this.t3);
        return test;
    }

    public <V1, V2> Pr2<V1, V2> testLt(Pr5<? super T1, ? super T2, ? super T3, ? super V1, ? super V2> p) {
        @SuppressWarnings("unchecked")
        final Pr2<V1, V2> test = (Pr2<V1, V2>) Pr5.narrow(p).testLt(this.t1, this.t2, this.t3);
        return test;
    }

    public <V1, V2> Pr2<V1, V2> test2Rt(Pr5<? super V1, ? super V2, ? super T1, ? super T2, ? super T3> p) {
        @SuppressWarnings("unchecked")
        final Pr2<V1, V2> test = (Pr2<V1, V2>) Pr5.narrow(p).testRt(this.t1, this.t2, this.t3);
        return test;
    }

    public <V1, V2> Pr2<V1, V2> test2Lt(Pr5<? super T1, ? super T2, ? super T3, ? super V1, ? super V2> p) {
        @SuppressWarnings("unchecked")
        final Pr2<V1, V2> test = (Pr2<V1, V2>) Pr5.narrow(p).testLt(this.t1, this.t2, this.t3);
        return test;
    }

    public <V1, V2, V3> Pr3<V1, V2, V3> testRt(Pr6<? super V1, ? super V2, ? super V3, ? super T1, ? super T2, ? super T3> p) {
        @SuppressWarnings("unchecked")
        final Pr3<V1, V2, V3> test = (Pr3<V1, V2, V3>) Pr6.narrow(p).testRt(this.t1, this.t2, this.t3);
        return test;
    }

    public <V1, V2, V3> Pr3<V1, V2, V3> testLt(Pr6<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? super V3> p) {
        @SuppressWarnings("unchecked")
        final Pr3<V1, V2, V3> test = (Pr3<V1, V2, V3>) Pr6.narrow(p).testLt(this.t1, this.t2, this.t3);
        return test;
    }

    public <V1, V2, V3> Pr3<V1, V2, V3> test3Rt(Pr6<? super V1, ? super V2, ? super V3, ? super T1, ? super T2, ? super T3> p) {
        @SuppressWarnings("unchecked")
        final Pr3<V1, V2, V3> test = (Pr3<V1, V2, V3>) Pr6.narrow(p).testRt(this.t1, this.t2, this.t3);
        return test;
    }

    public <V1, V2, V3> Pr3<V1, V2, V3> test3Lt(Pr6<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? super V3> p) {
        @SuppressWarnings("unchecked")
        final Pr3<V1, V2, V3> test = (Pr3<V1, V2, V3>) Pr6.narrow(p).testLt(this.t1, this.t2, this.t3);
        return test;
    }

    public <V1, V2, V3, V4> Pr4<V1, V2, V3, V4> testRt(Pr7<? super V1, ? super V2, ? super V3, ? super V4, ? super T1, ? super T2, ? super T3> p) {
        @SuppressWarnings("unchecked")
        final Pr4<V1, V2, V3, V4> test = (Pr4<V1, V2, V3, V4>) Pr7.narrow(p).testRt(this.t1, this.t2, this.t3);
        return test;
    }

    public <V1, V2, V3, V4> Pr4<V1, V2, V3, V4> testLt(Pr7<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? super V3, ? super V4> p) {
        @SuppressWarnings("unchecked")
        final Pr4<V1, V2, V3, V4> test = (Pr4<V1, V2, V3, V4>) Pr7.narrow(p).testLt(this.t1, this.t2, this.t3);
        return test;
    }

    public <V1, V2, V3, V4> Pr4<V1, V2, V3, V4> test4Rt(Pr7<? super V1, ? super V2, ? super V3, ? super V4, ? super T1, ? super T2, ? super T3> p) {
        @SuppressWarnings("unchecked")
        final Pr4<V1, V2, V3, V4> test = (Pr4<V1, V2, V3, V4>) Pr7.narrow(p).testRt(this.t1, this.t2, this.t3);
        return test;
    }

    public <V1, V2, V3, V4> Pr4<V1, V2, V3, V4> test4Lt(Pr7<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? super V3, ? super V4> p) {
        @SuppressWarnings("unchecked")
        final Pr4<V1, V2, V3, V4> test = (Pr4<V1, V2, V3, V4>) Pr7.narrow(p).testLt(this.t1, this.t2, this.t3);
        return test;
    }

    public <V1, V2, V3, V4, V5> Pr5<V1, V2, V3, V4, V5> testRt(Pr8<? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super T1, ? super T2, ? super T3> p) {
        @SuppressWarnings("unchecked")
        final Pr5<V1, V2, V3, V4, V5> test = (Pr5<V1, V2, V3, V4, V5>) Pr8.narrow(p).testRt(this.t1, this.t2, this.t3);
        return test;
    }

    public <V1, V2, V3, V4, V5> Pr5<V1, V2, V3, V4, V5> testLt(Pr8<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? super V3, ? super V4, ? super V5> p) {
        @SuppressWarnings("unchecked")
        final Pr5<V1, V2, V3, V4, V5> test = (Pr5<V1, V2, V3, V4, V5>) Pr8.narrow(p).testLt(this.t1, this.t2, this.t3);
        return test;
    }

    public <V1, V2, V3, V4, V5> Pr5<V1, V2, V3, V4, V5> test5Rt(Pr8<? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super T1, ? super T2, ? super T3> p) {
        @SuppressWarnings("unchecked")
        final Pr5<V1, V2, V3, V4, V5> test = (Pr5<V1, V2, V3, V4, V5>) Pr8.narrow(p).testRt(this.t1, this.t2, this.t3);
        return test;
    }

    public <V1, V2, V3, V4, V5> Pr5<V1, V2, V3, V4, V5> test5Lt(Pr8<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? super V3, ? super V4, ? super V5> p) {
        @SuppressWarnings("unchecked")
        final Pr5<V1, V2, V3, V4, V5> test = (Pr5<V1, V2, V3, V4, V5>) Pr8.narrow(p).testLt(this.t1, this.t2, this.t3);
        return test;
    }

    public Boolean passTest(Pr3<? super T1, ? super T2, ? super T3> p) {
        return p.toPredicate(this.t1, this.t2, this.t3).test();
    }

    public Prc0 testChecked(Prc3<? super T1, ? super T2, ? super T3> p) {
        return p.toPredicate(this.t1, this.t2, this.t3);
    }

    public <V1> Prc1<V1> testCheckedRt(Prc4<? super V1, ? super T1, ? super T2, ? super T3> p) {
        @SuppressWarnings("unchecked")
        final Prc1<V1> test = (Prc1<V1>) Prc4.narrow(p).testRt(this.t1, this.t2, this.t3);
        return test;
    }

    public <V1> Prc1<V1> testCheckedLt(Prc4<? super T1, ? super T2, ? super T3, ? super V1> p) {
        @SuppressWarnings("unchecked")
        final Prc1<V1> test = (Prc1<V1>) Prc4.narrow(p).testLt(this.t1, this.t2, this.t3);
        return test;
    }

    public <V1> Prc1<V1> testChecked1Rt(Prc4<? super V1, ? super T1, ? super T2, ? super T3> p) {
        @SuppressWarnings("unchecked")
        final Prc1<V1> test = (Prc1<V1>) Prc4.narrow(p).testRt(this.t1, this.t2, this.t3);
        return test;
    }

    public <V1> Prc1<V1> testChecked1Lt(Prc4<? super T1, ? super T2, ? super T3, ? super V1> p) {
        @SuppressWarnings("unchecked")
        final Prc1<V1> test = (Prc1<V1>) Prc4.narrow(p).testLt(this.t1, this.t2, this.t3);
        return test;
    }

    public <V1, V2> Prc2<V1, V2> testCheckedRt(Prc5<? super V1, ? super V2, ? super T1, ? super T2, ? super T3> p) {
        @SuppressWarnings("unchecked")
        final Prc2<V1, V2> test = (Prc2<V1, V2>) Prc5.narrow(p).testRt(this.t1, this.t2, this.t3);
        return test;
    }

    public <V1, V2> Prc2<V1, V2> testCheckedLt(Prc5<? super T1, ? super T2, ? super T3, ? super V1, ? super V2> p) {
        @SuppressWarnings("unchecked")
        final Prc2<V1, V2> test = (Prc2<V1, V2>) Prc5.narrow(p).testLt(this.t1, this.t2, this.t3);
        return test;
    }

    public <V1, V2> Prc2<V1, V2> testChecked2Rt(Prc5<? super V1, ? super V2, ? super T1, ? super T2, ? super T3> p) {
        @SuppressWarnings("unchecked")
        final Prc2<V1, V2> test = (Prc2<V1, V2>) Prc5.narrow(p).testRt(this.t1, this.t2, this.t3);
        return test;
    }

    public <V1, V2> Prc2<V1, V2> testChecked2Lt(Prc5<? super T1, ? super T2, ? super T3, ? super V1, ? super V2> p) {
        @SuppressWarnings("unchecked")
        final Prc2<V1, V2> test = (Prc2<V1, V2>) Prc5.narrow(p).testLt(this.t1, this.t2, this.t3);
        return test;
    }

    public <V1, V2, V3> Prc3<V1, V2, V3> testCheckedRt(Prc6<? super V1, ? super V2, ? super V3, ? super T1, ? super T2, ? super T3> p) {
        @SuppressWarnings("unchecked")
        final Prc3<V1, V2, V3> test = (Prc3<V1, V2, V3>) Prc6.narrow(p).testRt(this.t1, this.t2, this.t3);
        return test;
    }

    public <V1, V2, V3> Prc3<V1, V2, V3> testCheckedLt(Prc6<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? super V3> p) {
        @SuppressWarnings("unchecked")
        final Prc3<V1, V2, V3> test = (Prc3<V1, V2, V3>) Prc6.narrow(p).testLt(this.t1, this.t2, this.t3);
        return test;
    }

    public <V1, V2, V3> Prc3<V1, V2, V3> testChecked3Rt(Prc6<? super V1, ? super V2, ? super V3, ? super T1, ? super T2, ? super T3> p) {
        @SuppressWarnings("unchecked")
        final Prc3<V1, V2, V3> test = (Prc3<V1, V2, V3>) Prc6.narrow(p).testRt(this.t1, this.t2, this.t3);
        return test;
    }

    public <V1, V2, V3> Prc3<V1, V2, V3> testChecked3Lt(Prc6<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? super V3> p) {
        @SuppressWarnings("unchecked")
        final Prc3<V1, V2, V3> test = (Prc3<V1, V2, V3>) Prc6.narrow(p).testLt(this.t1, this.t2, this.t3);
        return test;
    }

    public <V1, V2, V3, V4> Prc4<V1, V2, V3, V4> testCheckedRt(Prc7<? super V1, ? super V2, ? super V3, ? super V4, ? super T1, ? super T2, ? super T3> p) {
        @SuppressWarnings("unchecked")
        final Prc4<V1, V2, V3, V4> test = (Prc4<V1, V2, V3, V4>) Prc7.narrow(p).testRt(this.t1, this.t2, this.t3);
        return test;
    }

    public <V1, V2, V3, V4> Prc4<V1, V2, V3, V4> testCheckedLt(Prc7<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? super V3, ? super V4> p) {
        @SuppressWarnings("unchecked")
        final Prc4<V1, V2, V3, V4> test = (Prc4<V1, V2, V3, V4>) Prc7.narrow(p).testLt(this.t1, this.t2, this.t3);
        return test;
    }

    public <V1, V2, V3, V4> Prc4<V1, V2, V3, V4> testChecked4Rt(Prc7<? super V1, ? super V2, ? super V3, ? super V4, ? super T1, ? super T2, ? super T3> p) {
        @SuppressWarnings("unchecked")
        final Prc4<V1, V2, V3, V4> test = (Prc4<V1, V2, V3, V4>) Prc7.narrow(p).testRt(this.t1, this.t2, this.t3);
        return test;
    }

    public <V1, V2, V3, V4> Prc4<V1, V2, V3, V4> testChecked4Lt(Prc7<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? super V3, ? super V4> p) {
        @SuppressWarnings("unchecked")
        final Prc4<V1, V2, V3, V4> test = (Prc4<V1, V2, V3, V4>) Prc7.narrow(p).testLt(this.t1, this.t2, this.t3);
        return test;
    }

    public <V1, V2, V3, V4, V5> Prc5<V1, V2, V3, V4, V5> testCheckedRt(Prc8<? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super T1, ? super T2, ? super T3> p) {
        @SuppressWarnings("unchecked")
        final Prc5<V1, V2, V3, V4, V5> test = (Prc5<V1, V2, V3, V4, V5>) Prc8.narrow(p).testRt(this.t1, this.t2, this.t3);
        return test;
    }

    public <V1, V2, V3, V4, V5> Prc5<V1, V2, V3, V4, V5> testCheckedLt(Prc8<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? super V3, ? super V4, ? super V5> p) {
        @SuppressWarnings("unchecked")
        final Prc5<V1, V2, V3, V4, V5> test = (Prc5<V1, V2, V3, V4, V5>) Prc8.narrow(p).testLt(this.t1, this.t2, this.t3);
        return test;
    }

    public <V1, V2, V3, V4, V5> Prc5<V1, V2, V3, V4, V5> testChecked5Rt(Prc8<? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super T1, ? super T2, ? super T3> p) {
        @SuppressWarnings("unchecked")
        final Prc5<V1, V2, V3, V4, V5> test = (Prc5<V1, V2, V3, V4, V5>) Prc8.narrow(p).testRt(this.t1, this.t2, this.t3);
        return test;
    }

    public <V1, V2, V3, V4, V5> Prc5<V1, V2, V3, V4, V5> testChecked5Lt(Prc8<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? super V3, ? super V4, ? super V5> p) {
        @SuppressWarnings("unchecked")
        final Prc5<V1, V2, V3, V4, V5> test = (Prc5<V1, V2, V3, V4, V5>) Prc8.narrow(p).testLt(this.t1, this.t2, this.t3);
        return test;
    }

    public Rn accept(Cs3<? super T1, ? super T2, ? super T3> c) {
        return c.toRunnable(this.t1, this.t2, this.t3);
    }

    public <V1> Cs1<V1> acceptRt(Cs4<? super V1, ? super T1, ? super T2, ? super T3> c) {
        @SuppressWarnings("unchecked")
        final Cs1<V1> accept = (Cs1<V1>) Cs4.narrow(c).acceptRt(this.t1, this.t2, this.t3);
        return accept;
    }

    public <V1> Cs1<V1> acceptLt(Cs4<? super T1, ? super T2, ? super T3, ? super V1> c) {
        @SuppressWarnings("unchecked")
        final Cs1<V1> accept = (Cs1<V1>) Cs4.narrow(c).acceptLt(this.t1, this.t2, this.t3);
        return accept;
    }

    public <V1> Cs1<V1> accept1Rt(Cs4<? super V1, ? super T1, ? super T2, ? super T3> c) {
        @SuppressWarnings("unchecked")
        final Cs1<V1> accept = (Cs1<V1>) Cs4.narrow(c).acceptRt(this.t1, this.t2, this.t3);
        return accept;
    }

    public <V1> Cs1<V1> accept1Lt(Cs4<? super T1, ? super T2, ? super T3, ? super V1> c) {
        @SuppressWarnings("unchecked")
        final Cs1<V1> accept = (Cs1<V1>) Cs4.narrow(c).acceptLt(this.t1, this.t2, this.t3);
        return accept;
    }

    public <V1, V2> Cs2<V1, V2> acceptRt(Cs5<? super V1, ? super V2, ? super T1, ? super T2, ? super T3> c) {
        @SuppressWarnings("unchecked")
        final Cs2<V1, V2> accept = (Cs2<V1, V2>) Cs5.narrow(c).acceptRt(this.t1, this.t2, this.t3);
        return accept;
    }

    public <V1, V2> Cs2<V1, V2> acceptLt(Cs5<? super T1, ? super T2, ? super T3, ? super V1, ? super V2> c) {
        @SuppressWarnings("unchecked")
        final Cs2<V1, V2> accept = (Cs2<V1, V2>) Cs5.narrow(c).acceptLt(this.t1, this.t2, this.t3);
        return accept;
    }

    public <V1, V2> Cs2<V1, V2> accept2Rt(Cs5<? super V1, ? super V2, ? super T1, ? super T2, ? super T3> c) {
        @SuppressWarnings("unchecked")
        final Cs2<V1, V2> accept = (Cs2<V1, V2>) Cs5.narrow(c).acceptRt(this.t1, this.t2, this.t3);
        return accept;
    }

    public <V1, V2> Cs2<V1, V2> accept2Lt(Cs5<? super T1, ? super T2, ? super T3, ? super V1, ? super V2> c) {
        @SuppressWarnings("unchecked")
        final Cs2<V1, V2> accept = (Cs2<V1, V2>) Cs5.narrow(c).acceptLt(this.t1, this.t2, this.t3);
        return accept;
    }

    public <V1, V2, V3> Cs3<V1, V2, V3> acceptRt(Cs6<? super V1, ? super V2, ? super V3, ? super T1, ? super T2, ? super T3> c) {
        @SuppressWarnings("unchecked")
        final Cs3<V1, V2, V3> accept = (Cs3<V1, V2, V3>) Cs6.narrow(c).acceptRt(this.t1, this.t2, this.t3);
        return accept;
    }

    public <V1, V2, V3> Cs3<V1, V2, V3> acceptLt(Cs6<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? super V3> c) {
        @SuppressWarnings("unchecked")
        final Cs3<V1, V2, V3> accept = (Cs3<V1, V2, V3>) Cs6.narrow(c).acceptLt(this.t1, this.t2, this.t3);
        return accept;
    }

    public <V1, V2, V3> Cs3<V1, V2, V3> accept3Rt(Cs6<? super V1, ? super V2, ? super V3, ? super T1, ? super T2, ? super T3> c) {
        @SuppressWarnings("unchecked")
        final Cs3<V1, V2, V3> accept = (Cs3<V1, V2, V3>) Cs6.narrow(c).acceptRt(this.t1, this.t2, this.t3);
        return accept;
    }

    public <V1, V2, V3> Cs3<V1, V2, V3> accept3Lt(Cs6<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? super V3> c) {
        @SuppressWarnings("unchecked")
        final Cs3<V1, V2, V3> accept = (Cs3<V1, V2, V3>) Cs6.narrow(c).acceptLt(this.t1, this.t2, this.t3);
        return accept;
    }

    public <V1, V2, V3, V4> Cs4<V1, V2, V3, V4> acceptRt(Cs7<? super V1, ? super V2, ? super V3, ? super V4, ? super T1, ? super T2, ? super T3> c) {
        @SuppressWarnings("unchecked")
        final Cs4<V1, V2, V3, V4> accept = (Cs4<V1, V2, V3, V4>) Cs7.narrow(c).acceptRt(this.t1, this.t2, this.t3);
        return accept;
    }

    public <V1, V2, V3, V4> Cs4<V1, V2, V3, V4> acceptLt(Cs7<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? super V3, ? super V4> c) {
        @SuppressWarnings("unchecked")
        final Cs4<V1, V2, V3, V4> accept = (Cs4<V1, V2, V3, V4>) Cs7.narrow(c).acceptLt(this.t1, this.t2, this.t3);
        return accept;
    }

    public <V1, V2, V3, V4> Cs4<V1, V2, V3, V4> accept4Rt(Cs7<? super V1, ? super V2, ? super V3, ? super V4, ? super T1, ? super T2, ? super T3> c) {
        @SuppressWarnings("unchecked")
        final Cs4<V1, V2, V3, V4> accept = (Cs4<V1, V2, V3, V4>) Cs7.narrow(c).acceptRt(this.t1, this.t2, this.t3);
        return accept;
    }

    public <V1, V2, V3, V4> Cs4<V1, V2, V3, V4> accept4Lt(Cs7<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? super V3, ? super V4> c) {
        @SuppressWarnings("unchecked")
        final Cs4<V1, V2, V3, V4> accept = (Cs4<V1, V2, V3, V4>) Cs7.narrow(c).acceptLt(this.t1, this.t2, this.t3);
        return accept;
    }

    public <V1, V2, V3, V4, V5> Cs5<V1, V2, V3, V4, V5> acceptRt(Cs8<? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super T1, ? super T2, ? super T3> c) {
        @SuppressWarnings("unchecked")
        final Cs5<V1, V2, V3, V4, V5> accept = (Cs5<V1, V2, V3, V4, V5>) Cs8.narrow(c).acceptRt(this.t1, this.t2, this.t3);
        return accept;
    }

    public <V1, V2, V3, V4, V5> Cs5<V1, V2, V3, V4, V5> acceptLt(Cs8<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? super V3, ? super V4, ? super V5> c) {
        @SuppressWarnings("unchecked")
        final Cs5<V1, V2, V3, V4, V5> accept = (Cs5<V1, V2, V3, V4, V5>) Cs8.narrow(c).acceptLt(this.t1, this.t2, this.t3);
        return accept;
    }

    public <V1, V2, V3, V4, V5> Cs5<V1, V2, V3, V4, V5> accept5Rt(Cs8<? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super T1, ? super T2, ? super T3> c) {
        @SuppressWarnings("unchecked")
        final Cs5<V1, V2, V3, V4, V5> accept = (Cs5<V1, V2, V3, V4, V5>) Cs8.narrow(c).acceptRt(this.t1, this.t2, this.t3);
        return accept;
    }

    public <V1, V2, V3, V4, V5> Cs5<V1, V2, V3, V4, V5> accept5Lt(Cs8<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? super V3, ? super V4, ? super V5> c) {
        @SuppressWarnings("unchecked")
        final Cs5<V1, V2, V3, V4, V5> accept = (Cs5<V1, V2, V3, V4, V5>) Cs8.narrow(c).acceptLt(this.t1, this.t2, this.t3);
        return accept;
    }

    public Rnc acceptChecked(Csc3<? super T1, ? super T2, ? super T3> c) {
        return c.toRunnable(this.t1, this.t2, this.t3);
    }

    public <V1> Csc1<V1> acceptCheckedRt(Csc4<? super V1, ? super T1, ? super T2, ? super T3> c) {
        @SuppressWarnings("unchecked")
        final Csc1<V1> accept = (Csc1<V1>) Csc4.narrow(c).acceptRt(this.t1, this.t2, this.t3);
        return accept;
    }

    public <V1> Csc1<V1> acceptCheckedLt(Csc4<? super T1, ? super T2, ? super T3, ? super V1> c) {
        @SuppressWarnings("unchecked")
        final Csc1<V1> accept = (Csc1<V1>) Csc4.narrow(c).acceptLt(this.t1, this.t2, this.t3);
        return accept;
    }

    public <V1> Csc1<V1> acceptChecked1Rt(Csc4<? super V1, ? super T1, ? super T2, ? super T3> c) {
        @SuppressWarnings("unchecked")
        final Csc1<V1> accept = (Csc1<V1>) Csc4.narrow(c).acceptRt(this.t1, this.t2, this.t3);
        return accept;
    }

    public <V1> Csc1<V1> acceptChecked1Lt(Csc4<? super T1, ? super T2, ? super T3, ? super V1> c) {
        @SuppressWarnings("unchecked")
        final Csc1<V1> accept = (Csc1<V1>) Csc4.narrow(c).acceptLt(this.t1, this.t2, this.t3);
        return accept;
    }

    public <V1, V2> Csc2<V1, V2> acceptCheckedRt(Csc5<? super V1, ? super V2, ? super T1, ? super T2, ? super T3> c) {
        @SuppressWarnings("unchecked")
        final Csc2<V1, V2> accept = (Csc2<V1, V2>) Csc5.narrow(c).acceptRt(this.t1, this.t2, this.t3);
        return accept;
    }

    public <V1, V2> Csc2<V1, V2> acceptCheckedLt(Csc5<? super T1, ? super T2, ? super T3, ? super V1, ? super V2> c) {
        @SuppressWarnings("unchecked")
        final Csc2<V1, V2> accept = (Csc2<V1, V2>) Csc5.narrow(c).acceptLt(this.t1, this.t2, this.t3);
        return accept;
    }

    public <V1, V2> Csc2<V1, V2> acceptChecked2Rt(Csc5<? super V1, ? super V2, ? super T1, ? super T2, ? super T3> c) {
        @SuppressWarnings("unchecked")
        final Csc2<V1, V2> accept = (Csc2<V1, V2>) Csc5.narrow(c).acceptRt(this.t1, this.t2, this.t3);
        return accept;
    }

    public <V1, V2> Csc2<V1, V2> acceptChecked2Lt(Csc5<? super T1, ? super T2, ? super T3, ? super V1, ? super V2> c) {
        @SuppressWarnings("unchecked")
        final Csc2<V1, V2> accept = (Csc2<V1, V2>) Csc5.narrow(c).acceptLt(this.t1, this.t2, this.t3);
        return accept;
    }

    public <V1, V2, V3> Csc3<V1, V2, V3> acceptCheckedRt(Csc6<? super V1, ? super V2, ? super V3, ? super T1, ? super T2, ? super T3> c) {
        @SuppressWarnings("unchecked")
        final Csc3<V1, V2, V3> accept = (Csc3<V1, V2, V3>) Csc6.narrow(c).acceptRt(this.t1, this.t2, this.t3);
        return accept;
    }

    public <V1, V2, V3> Csc3<V1, V2, V3> acceptCheckedLt(Csc6<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? super V3> c) {
        @SuppressWarnings("unchecked")
        final Csc3<V1, V2, V3> accept = (Csc3<V1, V2, V3>) Csc6.narrow(c).acceptLt(this.t1, this.t2, this.t3);
        return accept;
    }

    public <V1, V2, V3> Csc3<V1, V2, V3> acceptChecked3Rt(Csc6<? super V1, ? super V2, ? super V3, ? super T1, ? super T2, ? super T3> c) {
        @SuppressWarnings("unchecked")
        final Csc3<V1, V2, V3> accept = (Csc3<V1, V2, V3>) Csc6.narrow(c).acceptRt(this.t1, this.t2, this.t3);
        return accept;
    }

    public <V1, V2, V3> Csc3<V1, V2, V3> acceptChecked3Lt(Csc6<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? super V3> c) {
        @SuppressWarnings("unchecked")
        final Csc3<V1, V2, V3> accept = (Csc3<V1, V2, V3>) Csc6.narrow(c).acceptLt(this.t1, this.t2, this.t3);
        return accept;
    }

    public <V1, V2, V3, V4> Csc4<V1, V2, V3, V4> acceptCheckedRt(Csc7<? super V1, ? super V2, ? super V3, ? super V4, ? super T1, ? super T2, ? super T3> c) {
        @SuppressWarnings("unchecked")
        final Csc4<V1, V2, V3, V4> accept = (Csc4<V1, V2, V3, V4>) Csc7.narrow(c).acceptRt(this.t1, this.t2, this.t3);
        return accept;
    }

    public <V1, V2, V3, V4> Csc4<V1, V2, V3, V4> acceptCheckedLt(Csc7<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? super V3, ? super V4> c) {
        @SuppressWarnings("unchecked")
        final Csc4<V1, V2, V3, V4> accept = (Csc4<V1, V2, V3, V4>) Csc7.narrow(c).acceptLt(this.t1, this.t2, this.t3);
        return accept;
    }

    public <V1, V2, V3, V4> Csc4<V1, V2, V3, V4> acceptChecked4Rt(Csc7<? super V1, ? super V2, ? super V3, ? super V4, ? super T1, ? super T2, ? super T3> c) {
        @SuppressWarnings("unchecked")
        final Csc4<V1, V2, V3, V4> accept = (Csc4<V1, V2, V3, V4>) Csc7.narrow(c).acceptRt(this.t1, this.t2, this.t3);
        return accept;
    }

    public <V1, V2, V3, V4> Csc4<V1, V2, V3, V4> acceptChecked4Lt(Csc7<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? super V3, ? super V4> c) {
        @SuppressWarnings("unchecked")
        final Csc4<V1, V2, V3, V4> accept = (Csc4<V1, V2, V3, V4>) Csc7.narrow(c).acceptLt(this.t1, this.t2, this.t3);
        return accept;
    }

    public <V1, V2, V3, V4, V5> Csc5<V1, V2, V3, V4, V5> acceptCheckedRt(Csc8<? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super T1, ? super T2, ? super T3> c) {
        @SuppressWarnings("unchecked")
        final Csc5<V1, V2, V3, V4, V5> accept = (Csc5<V1, V2, V3, V4, V5>) Csc8.narrow(c).acceptRt(this.t1, this.t2, this.t3);
        return accept;
    }

    public <V1, V2, V3, V4, V5> Csc5<V1, V2, V3, V4, V5> acceptCheckedLt(Csc8<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? super V3, ? super V4, ? super V5> c) {
        @SuppressWarnings("unchecked")
        final Csc5<V1, V2, V3, V4, V5> accept = (Csc5<V1, V2, V3, V4, V5>) Csc8.narrow(c).acceptLt(this.t1, this.t2, this.t3);
        return accept;
    }

    public <V1, V2, V3, V4, V5> Csc5<V1, V2, V3, V4, V5> acceptChecked5Rt(Csc8<? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super T1, ? super T2, ? super T3> c) {
        @SuppressWarnings("unchecked")
        final Csc5<V1, V2, V3, V4, V5> accept = (Csc5<V1, V2, V3, V4, V5>) Csc8.narrow(c).acceptRt(this.t1, this.t2, this.t3);
        return accept;
    }

    public <V1, V2, V3, V4, V5> Csc5<V1, V2, V3, V4, V5> acceptChecked5Lt(Csc8<? super T1, ? super T2, ? super T3, ? super V1, ? super V2, ? super V3, ? super V4, ? super V5> c) {
        @SuppressWarnings("unchecked")
        final Csc5<V1, V2, V3, V4, V5> accept = (Csc5<V1, V2, V3, V4, V5>) Csc8.narrow(c).acceptLt(this.t1, this.t2, this.t3);
        return accept;
    }

}

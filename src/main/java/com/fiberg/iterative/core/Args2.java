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

public class Args2<T1, T2> {

    private final T1 t1;
    private final T2 t2;

    Args2(T1 t1, T2 t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public <R> Fn0<R> apply(Fn2<? super T1, ? super T2, ? extends R> f) {
        return Fn2.<T1, T2, R>narrow(f).toFunction(this.t1, this.t2);
    }

    public <V1, R> Fn1<V1, R> applyRt(Fn3<? super V1, ? super T1, ? super T2, ? extends R> f) {
        return Fn3.<V1, T1, T2, R>narrow(f).applyRt(this.t1, this.t2);
    }

    public <V1, R> Fn1<V1, R> applyLt(Fn3<? super T1, ? super T2, ? super V1, ? extends R> f) {
        return Fn3.<T1, T2, V1, R>narrow(f).applyLt(this.t1, this.t2);
    }

    public <V1, R> Fn1<V1, R> apply1Rt(Fn3<? super V1, ? super T1, ? super T2, ? extends R> f) {
        return Fn3.<V1, T1, T2, R>narrow(f).applyRt(this.t1, this.t2);
    }

    public <V1, R> Fn1<V1, R> apply1Lt(Fn3<? super T1, ? super T2, ? super V1, ? extends R> f) {
        return Fn3.<T1, T2, V1, R>narrow(f).applyLt(this.t1, this.t2);
    }

    public <V1, V2, R> Fn2<V1, V2, R> applyRt(Fn4<? super V1, ? super V2, ? super T1, ? super T2, ? extends R> f) {
        return Fn4.<V1, V2, T1, T2, R>narrow(f).applyRt(this.t1, this.t2);
    }

    public <V1, V2, R> Fn2<V1, V2, R> applyLt(Fn4<? super T1, ? super T2, ? super V1, ? super V2, ? extends R> f) {
        return Fn4.<T1, T2, V1, V2, R>narrow(f).applyLt(this.t1, this.t2);
    }

    public <V1, V2, R> Fn2<V1, V2, R> apply2Rt(Fn4<? super V1, ? super V2, ? super T1, ? super T2, ? extends R> f) {
        return Fn4.<V1, V2, T1, T2, R>narrow(f).applyRt(this.t1, this.t2);
    }

    public <V1, V2, R> Fn2<V1, V2, R> apply2Lt(Fn4<? super T1, ? super T2, ? super V1, ? super V2, ? extends R> f) {
        return Fn4.<T1, T2, V1, V2, R>narrow(f).applyLt(this.t1, this.t2);
    }

    public <V1, V2, V3, R> Fn3<V1, V2, V3, R> applyRt(Fn5<? super V1, ? super V2, ? super V3, ? super T1, ? super T2, ? extends R> f) {
        return Fn5.<V1, V2, V3, T1, T2, R>narrow(f).applyRt(this.t1, this.t2);
    }

    public <V1, V2, V3, R> Fn3<V1, V2, V3, R> applyLt(Fn5<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? extends R> f) {
        return Fn5.<T1, T2, V1, V2, V3, R>narrow(f).applyLt(this.t1, this.t2);
    }

    public <V1, V2, V3, R> Fn3<V1, V2, V3, R> apply3Rt(Fn5<? super V1, ? super V2, ? super V3, ? super T1, ? super T2, ? extends R> f) {
        return Fn5.<V1, V2, V3, T1, T2, R>narrow(f).applyRt(this.t1, this.t2);
    }

    public <V1, V2, V3, R> Fn3<V1, V2, V3, R> apply3Lt(Fn5<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? extends R> f) {
        return Fn5.<T1, T2, V1, V2, V3, R>narrow(f).applyLt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, R> Fn4<V1, V2, V3, V4, R> applyRt(Fn6<? super V1, ? super V2, ? super V3, ? super V4, ? super T1, ? super T2, ? extends R> f) {
        return Fn6.<V1, V2, V3, V4, T1, T2, R>narrow(f).applyRt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, R> Fn4<V1, V2, V3, V4, R> applyLt(Fn6<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? super V4, ? extends R> f) {
        return Fn6.<T1, T2, V1, V2, V3, V4, R>narrow(f).applyLt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, R> Fn4<V1, V2, V3, V4, R> apply4Rt(Fn6<? super V1, ? super V2, ? super V3, ? super V4, ? super T1, ? super T2, ? extends R> f) {
        return Fn6.<V1, V2, V3, V4, T1, T2, R>narrow(f).applyRt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, R> Fn4<V1, V2, V3, V4, R> apply4Lt(Fn6<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? super V4, ? extends R> f) {
        return Fn6.<T1, T2, V1, V2, V3, V4, R>narrow(f).applyLt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5, R> Fn5<V1, V2, V3, V4, V5, R> applyRt(Fn7<? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super T1, ? super T2, ? extends R> f) {
        return Fn7.<V1, V2, V3, V4, V5, T1, T2, R>narrow(f).applyRt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5, R> Fn5<V1, V2, V3, V4, V5, R> applyLt(Fn7<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? extends R> f) {
        return Fn7.<T1, T2, V1, V2, V3, V4, V5, R>narrow(f).applyLt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5, R> Fn5<V1, V2, V3, V4, V5, R> apply5Rt(Fn7<? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super T1, ? super T2, ? extends R> f) {
        return Fn7.<V1, V2, V3, V4, V5, T1, T2, R>narrow(f).applyRt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5, R> Fn5<V1, V2, V3, V4, V5, R> apply5Lt(Fn7<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? extends R> f) {
        return Fn7.<T1, T2, V1, V2, V3, V4, V5, R>narrow(f).applyLt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5, V6, R> Fn6<V1, V2, V3, V4, V5, V6, R> applyRt(Fn8<? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super V6, ? super T1, ? super T2, ? extends R> f) {
        return Fn8.<V1, V2, V3, V4, V5, V6, T1, T2, R>narrow(f).applyRt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5, V6, R> Fn6<V1, V2, V3, V4, V5, V6, R> applyLt(Fn8<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super V6, ? extends R> f) {
        return Fn8.<T1, T2, V1, V2, V3, V4, V5, V6, R>narrow(f).applyLt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5, V6, R> Fn6<V1, V2, V3, V4, V5, V6, R> apply6Rt(Fn8<? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super V6, ? super T1, ? super T2, ? extends R> f) {
        return Fn8.<V1, V2, V3, V4, V5, V6, T1, T2, R>narrow(f).applyRt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5, V6, R> Fn6<V1, V2, V3, V4, V5, V6, R> apply6Lt(Fn8<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super V6, ? extends R> f) {
        return Fn8.<T1, T2, V1, V2, V3, V4, V5, V6, R>narrow(f).applyLt(this.t1, this.t2);
    }

    public <R> R passApply(Fn2<? super T1, ? super T2, ? extends R> f) {
        return f.toFunction(this.t1, this.t2).apply();
    }

    public <R, V> V passApplyAfter(Fn2<? super T1, ? super T2, ? extends R> f, Fn1<? super R, ? extends V> a) {
        return f.toFunction(this.t1, this.t2).afterApply(a).apply();
    }

    public <R> Fnc0<R> applyChecked(Fnc2<? super T1, ? super T2, ? extends R> f) {
        return Fnc2.<T1, T2, R>narrow(f).toFunction(this.t1, this.t2);
    }

    public <V1, R> Fnc1<V1, R> applyCheckedRt(Fnc3<? super V1, ? super T1, ? super T2, ? extends R> f) {
        return Fnc3.<V1, T1, T2, R>narrow(f).applyRt(this.t1, this.t2);
    }

    public <V1, R> Fnc1<V1, R> applyCheckedLt(Fnc3<? super T1, ? super T2, ? super V1, ? extends R> f) {
        return Fnc3.<T1, T2, V1, R>narrow(f).applyLt(this.t1, this.t2);
    }

    public <V1, R> Fnc1<V1, R> applyChecked1Rt(Fnc3<? super V1, ? super T1, ? super T2, ? extends R> f) {
        return Fnc3.<V1, T1, T2, R>narrow(f).applyRt(this.t1, this.t2);
    }

    public <V1, R> Fnc1<V1, R> applyChecked1Lt(Fnc3<? super T1, ? super T2, ? super V1, ? extends R> f) {
        return Fnc3.<T1, T2, V1, R>narrow(f).applyLt(this.t1, this.t2);
    }

    public <V1, V2, R> Fnc2<V1, V2, R> applyCheckedRt(Fnc4<? super V1, ? super V2, ? super T1, ? super T2, ? extends R> f) {
        return Fnc4.<V1, V2, T1, T2, R>narrow(f).applyRt(this.t1, this.t2);
    }

    public <V1, V2, R> Fnc2<V1, V2, R> applyCheckedLt(Fnc4<? super T1, ? super T2, ? super V1, ? super V2, ? extends R> f) {
        return Fnc4.<T1, T2, V1, V2, R>narrow(f).applyLt(this.t1, this.t2);
    }

    public <V1, V2, R> Fnc2<V1, V2, R> applyChecked2Rt(Fnc4<? super V1, ? super V2, ? super T1, ? super T2, ? extends R> f) {
        return Fnc4.<V1, V2, T1, T2, R>narrow(f).applyRt(this.t1, this.t2);
    }

    public <V1, V2, R> Fnc2<V1, V2, R> applyChecked2Lt(Fnc4<? super T1, ? super T2, ? super V1, ? super V2, ? extends R> f) {
        return Fnc4.<T1, T2, V1, V2, R>narrow(f).applyLt(this.t1, this.t2);
    }

    public <V1, V2, V3, R> Fnc3<V1, V2, V3, R> applyCheckedRt(Fnc5<? super V1, ? super V2, ? super V3, ? super T1, ? super T2, ? extends R> f) {
        return Fnc5.<V1, V2, V3, T1, T2, R>narrow(f).applyRt(this.t1, this.t2);
    }

    public <V1, V2, V3, R> Fnc3<V1, V2, V3, R> applyCheckedLt(Fnc5<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? extends R> f) {
        return Fnc5.<T1, T2, V1, V2, V3, R>narrow(f).applyLt(this.t1, this.t2);
    }

    public <V1, V2, V3, R> Fnc3<V1, V2, V3, R> applyChecked3Rt(Fnc5<? super V1, ? super V2, ? super V3, ? super T1, ? super T2, ? extends R> f) {
        return Fnc5.<V1, V2, V3, T1, T2, R>narrow(f).applyRt(this.t1, this.t2);
    }

    public <V1, V2, V3, R> Fnc3<V1, V2, V3, R> applyChecked3Lt(Fnc5<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? extends R> f) {
        return Fnc5.<T1, T2, V1, V2, V3, R>narrow(f).applyLt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, R> Fnc4<V1, V2, V3, V4, R> applyCheckedRt(Fnc6<? super V1, ? super V2, ? super V3, ? super V4, ? super T1, ? super T2, ? extends R> f) {
        return Fnc6.<V1, V2, V3, V4, T1, T2, R>narrow(f).applyRt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, R> Fnc4<V1, V2, V3, V4, R> applyCheckedLt(Fnc6<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? super V4, ? extends R> f) {
        return Fnc6.<T1, T2, V1, V2, V3, V4, R>narrow(f).applyLt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, R> Fnc4<V1, V2, V3, V4, R> applyChecked4Rt(Fnc6<? super V1, ? super V2, ? super V3, ? super V4, ? super T1, ? super T2, ? extends R> f) {
        return Fnc6.<V1, V2, V3, V4, T1, T2, R>narrow(f).applyRt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, R> Fnc4<V1, V2, V3, V4, R> applyChecked4Lt(Fnc6<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? super V4, ? extends R> f) {
        return Fnc6.<T1, T2, V1, V2, V3, V4, R>narrow(f).applyLt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5, R> Fnc5<V1, V2, V3, V4, V5, R> applyCheckedRt(Fnc7<? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super T1, ? super T2, ? extends R> f) {
        return Fnc7.<V1, V2, V3, V4, V5, T1, T2, R>narrow(f).applyRt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5, R> Fnc5<V1, V2, V3, V4, V5, R> applyCheckedLt(Fnc7<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? extends R> f) {
        return Fnc7.<T1, T2, V1, V2, V3, V4, V5, R>narrow(f).applyLt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5, R> Fnc5<V1, V2, V3, V4, V5, R> applyChecked5Rt(Fnc7<? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super T1, ? super T2, ? extends R> f) {
        return Fnc7.<V1, V2, V3, V4, V5, T1, T2, R>narrow(f).applyRt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5, R> Fnc5<V1, V2, V3, V4, V5, R> applyChecked5Lt(Fnc7<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? extends R> f) {
        return Fnc7.<T1, T2, V1, V2, V3, V4, V5, R>narrow(f).applyLt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5, V6, R> Fnc6<V1, V2, V3, V4, V5, V6, R> applyCheckedRt(Fnc8<? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super V6, ? super T1, ? super T2, ? extends R> f) {
        return Fnc8.<V1, V2, V3, V4, V5, V6, T1, T2, R>narrow(f).applyRt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5, V6, R> Fnc6<V1, V2, V3, V4, V5, V6, R> applyCheckedLt(Fnc8<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super V6, ? extends R> f) {
        return Fnc8.<T1, T2, V1, V2, V3, V4, V5, V6, R>narrow(f).applyLt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5, V6, R> Fnc6<V1, V2, V3, V4, V5, V6, R> applyChecked6Rt(Fnc8<? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super V6, ? super T1, ? super T2, ? extends R> f) {
        return Fnc8.<V1, V2, V3, V4, V5, V6, T1, T2, R>narrow(f).applyRt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5, V6, R> Fnc6<V1, V2, V3, V4, V5, V6, R> applyChecked6Lt(Fnc8<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super V6, ? extends R> f) {
        return Fnc8.<T1, T2, V1, V2, V3, V4, V5, V6, R>narrow(f).applyLt(this.t1, this.t2);
    }

    public <R, W> W passApplyWrap(Fnc2<? super T1, ? super T2, ? extends R> f, Fn1<? super Spc<R>, ? extends W> w) {
        return Fnc2.<T1, T2, R>narrow(f).toFunction(this.t1, this.t2).beforeWrap(w).apply();
    }

    public Pr0 test(Pr2<? super T1, ? super T2> p) {
        return p.toPredicate(this.t1, this.t2);
    }

    public <V1> Pr1<V1> testRt(Pr3<? super V1, ? super T1, ? super T2> p) {
        return Pr3.<V1, T1, T2>narrow(p).testRt(this.t1, this.t2);
    }

    public <V1> Pr1<V1> testLt(Pr3<? super T1, ? super T2, ? super V1> p) {
        return Pr3.<T1, T2, V1>narrow(p).testLt(this.t1, this.t2);
    }

    public <V1> Pr1<V1> test1Rt(Pr3<? super V1, ? super T1, ? super T2> p) {
        return Pr3.<V1, T1, T2>narrow(p).testRt(this.t1, this.t2);
    }

    public <V1> Pr1<V1> test1Lt(Pr3<? super T1, ? super T2, ? super V1> p) {
        return Pr3.<T1, T2, V1>narrow(p).testLt(this.t1, this.t2);
    }

    public <V1, V2> Pr2<V1, V2> testRt(Pr4<? super V1, ? super V2, ? super T1, ? super T2> p) {
        return Pr4.<V1, V2, T1, T2>narrow(p).testRt(this.t1, this.t2);
    }

    public <V1, V2> Pr2<V1, V2> testLt(Pr4<? super T1, ? super T2, ? super V1, ? super V2> p) {
        return Pr4.<T1, T2, V1, V2>narrow(p).testLt(this.t1, this.t2);
    }

    public <V1, V2> Pr2<V1, V2> test2Rt(Pr4<? super V1, ? super V2, ? super T1, ? super T2> p) {
        return Pr4.<V1, V2, T1, T2>narrow(p).testRt(this.t1, this.t2);
    }

    public <V1, V2> Pr2<V1, V2> test2Lt(Pr4<? super T1, ? super T2, ? super V1, ? super V2> p) {
        return Pr4.<T1, T2, V1, V2>narrow(p).testLt(this.t1, this.t2);
    }

    public <V1, V2, V3> Pr3<V1, V2, V3> testRt(Pr5<? super V1, ? super V2, ? super V3, ? super T1, ? super T2> p) {
        return Pr5.<V1, V2, V3, T1, T2>narrow(p).testRt(this.t1, this.t2);
    }

    public <V1, V2, V3> Pr3<V1, V2, V3> testLt(Pr5<? super T1, ? super T2, ? super V1, ? super V2, ? super V3> p) {
        return Pr5.<T1, T2, V1, V2, V3>narrow(p).testLt(this.t1, this.t2);
    }

    public <V1, V2, V3> Pr3<V1, V2, V3> test3Rt(Pr5<? super V1, ? super V2, ? super V3, ? super T1, ? super T2> p) {
        return Pr5.<V1, V2, V3, T1, T2>narrow(p).testRt(this.t1, this.t2);
    }

    public <V1, V2, V3> Pr3<V1, V2, V3> test3Lt(Pr5<? super T1, ? super T2, ? super V1, ? super V2, ? super V3> p) {
        return Pr5.<T1, T2, V1, V2, V3>narrow(p).testLt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4> Pr4<V1, V2, V3, V4> testRt(Pr6<? super V1, ? super V2, ? super V3, ? super V4, ? super T1, ? super T2> p) {
        return Pr6.<V1, V2, V3, V4, T1, T2>narrow(p).testRt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4> Pr4<V1, V2, V3, V4> testLt(Pr6<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? super V4> p) {
        return Pr6.<T1, T2, V1, V2, V3, V4>narrow(p).testLt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4> Pr4<V1, V2, V3, V4> test4Rt(Pr6<? super V1, ? super V2, ? super V3, ? super V4, ? super T1, ? super T2> p) {
        return Pr6.<V1, V2, V3, V4, T1, T2>narrow(p).testRt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4> Pr4<V1, V2, V3, V4> test4Lt(Pr6<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? super V4> p) {
        return Pr6.<T1, T2, V1, V2, V3, V4>narrow(p).testLt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5> Pr5<V1, V2, V3, V4, V5> testRt(Pr7<? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super T1, ? super T2> p) {
        return Pr7.<V1, V2, V3, V4, V5, T1, T2>narrow(p).testRt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5> Pr5<V1, V2, V3, V4, V5> testLt(Pr7<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? super V4, ? super V5> p) {
        return Pr7.<T1, T2, V1, V2, V3, V4, V5>narrow(p).testLt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5> Pr5<V1, V2, V3, V4, V5> test5Rt(Pr7<? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super T1, ? super T2> p) {
        return Pr7.<V1, V2, V3, V4, V5, T1, T2>narrow(p).testRt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5> Pr5<V1, V2, V3, V4, V5> test5Lt(Pr7<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? super V4, ? super V5> p) {
        return Pr7.<T1, T2, V1, V2, V3, V4, V5>narrow(p).testLt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5, V6> Pr6<V1, V2, V3, V4, V5, V6> testRt(Pr8<? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super V6, ? super T1, ? super T2> p) {
        return Pr8.<V1, V2, V3, V4, V5, V6, T1, T2>narrow(p).testRt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5, V6> Pr6<V1, V2, V3, V4, V5, V6> testLt(Pr8<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super V6> p) {
        return Pr8.<T1, T2, V1, V2, V3, V4, V5, V6>narrow(p).testLt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5, V6> Pr6<V1, V2, V3, V4, V5, V6> test6Rt(Pr8<? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super V6, ? super T1, ? super T2> p) {
        return Pr8.<V1, V2, V3, V4, V5, V6, T1, T2>narrow(p).testRt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5, V6> Pr6<V1, V2, V3, V4, V5, V6> test6Lt(Pr8<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super V6> p) {
        return Pr8.<T1, T2, V1, V2, V3, V4, V5, V6>narrow(p).testLt(this.t1, this.t2);
    }

    public Boolean passTest(Pr2<? super T1, ? super T2> p) {
        return p.toPredicate(this.t1, this.t2).test();
    }

    public Prc0 testChecked(Prc2<? super T1, ? super T2> p) {
        return p.toPredicate(this.t1, this.t2);
    }

    public <V1> Prc1<V1> testCheckedRt(Prc3<? super V1, ? super T1, ? super T2> p) {
        return Prc3.<V1, T1, T2>narrow(p).testRt(this.t1, this.t2);
    }

    public <V1> Prc1<V1> testCheckedLt(Prc3<? super T1, ? super T2, ? super V1> p) {
        return Prc3.<T1, T2, V1>narrow(p).testLt(this.t1, this.t2);
    }

    public <V1> Prc1<V1> testChecked1Rt(Prc3<? super V1, ? super T1, ? super T2> p) {
        return Prc3.<V1, T1, T2>narrow(p).testRt(this.t1, this.t2);
    }

    public <V1> Prc1<V1> testChecked1Lt(Prc3<? super T1, ? super T2, ? super V1> p) {
        return Prc3.<T1, T2, V1>narrow(p).testLt(this.t1, this.t2);
    }

    public <V1, V2> Prc2<V1, V2> testCheckedRt(Prc4<? super V1, ? super V2, ? super T1, ? super T2> p) {
        return Prc4.<V1, V2, T1, T2>narrow(p).testRt(this.t1, this.t2);
    }

    public <V1, V2> Prc2<V1, V2> testCheckedLt(Prc4<? super T1, ? super T2, ? super V1, ? super V2> p) {
        return Prc4.<T1, T2, V1, V2>narrow(p).testLt(this.t1, this.t2);
    }

    public <V1, V2> Prc2<V1, V2> testChecked2Rt(Prc4<? super V1, ? super V2, ? super T1, ? super T2> p) {
        return Prc4.<V1, V2, T1, T2>narrow(p).testRt(this.t1, this.t2);
    }

    public <V1, V2> Prc2<V1, V2> testChecked2Lt(Prc4<? super T1, ? super T2, ? super V1, ? super V2> p) {
        return Prc4.<T1, T2, V1, V2>narrow(p).testLt(this.t1, this.t2);
    }

    public <V1, V2, V3> Prc3<V1, V2, V3> testCheckedRt(Prc5<? super V1, ? super V2, ? super V3, ? super T1, ? super T2> p) {
        return Prc5.<V1, V2, V3, T1, T2>narrow(p).testRt(this.t1, this.t2);
    }

    public <V1, V2, V3> Prc3<V1, V2, V3> testCheckedLt(Prc5<? super T1, ? super T2, ? super V1, ? super V2, ? super V3> p) {
        return Prc5.<T1, T2, V1, V2, V3>narrow(p).testLt(this.t1, this.t2);
    }

    public <V1, V2, V3> Prc3<V1, V2, V3> testChecked3Rt(Prc5<? super V1, ? super V2, ? super V3, ? super T1, ? super T2> p) {
        return Prc5.<V1, V2, V3, T1, T2>narrow(p).testRt(this.t1, this.t2);
    }

    public <V1, V2, V3> Prc3<V1, V2, V3> testChecked3Lt(Prc5<? super T1, ? super T2, ? super V1, ? super V2, ? super V3> p) {
        return Prc5.<T1, T2, V1, V2, V3>narrow(p).testLt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4> Prc4<V1, V2, V3, V4> testCheckedRt(Prc6<? super V1, ? super V2, ? super V3, ? super V4, ? super T1, ? super T2> p) {
        return Prc6.<V1, V2, V3, V4, T1, T2>narrow(p).testRt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4> Prc4<V1, V2, V3, V4> testCheckedLt(Prc6<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? super V4> p) {
        return Prc6.<T1, T2, V1, V2, V3, V4>narrow(p).testLt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4> Prc4<V1, V2, V3, V4> testChecked4Rt(Prc6<? super V1, ? super V2, ? super V3, ? super V4, ? super T1, ? super T2> p) {
        return Prc6.<V1, V2, V3, V4, T1, T2>narrow(p).testRt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4> Prc4<V1, V2, V3, V4> testChecked4Lt(Prc6<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? super V4> p) {
        return Prc6.<T1, T2, V1, V2, V3, V4>narrow(p).testLt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5> Prc5<V1, V2, V3, V4, V5> testCheckedRt(Prc7<? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super T1, ? super T2> p) {
        return Prc7.<V1, V2, V3, V4, V5, T1, T2>narrow(p).testRt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5> Prc5<V1, V2, V3, V4, V5> testCheckedLt(Prc7<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? super V4, ? super V5> p) {
        return Prc7.<T1, T2, V1, V2, V3, V4, V5>narrow(p).testLt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5> Prc5<V1, V2, V3, V4, V5> testChecked5Rt(Prc7<? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super T1, ? super T2> p) {
        return Prc7.<V1, V2, V3, V4, V5, T1, T2>narrow(p).testRt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5> Prc5<V1, V2, V3, V4, V5> testChecked5Lt(Prc7<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? super V4, ? super V5> p) {
        return Prc7.<T1, T2, V1, V2, V3, V4, V5>narrow(p).testLt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5, V6> Prc6<V1, V2, V3, V4, V5, V6> testCheckedRt(Prc8<? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super V6, ? super T1, ? super T2> p) {
        return Prc8.<V1, V2, V3, V4, V5, V6, T1, T2>narrow(p).testRt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5, V6> Prc6<V1, V2, V3, V4, V5, V6> testCheckedLt(Prc8<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super V6> p) {
        return Prc8.<T1, T2, V1, V2, V3, V4, V5, V6>narrow(p).testLt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5, V6> Prc6<V1, V2, V3, V4, V5, V6> testChecked6Rt(Prc8<? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super V6, ? super T1, ? super T2> p) {
        return Prc8.<V1, V2, V3, V4, V5, V6, T1, T2>narrow(p).testRt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5, V6> Prc6<V1, V2, V3, V4, V5, V6> testChecked6Lt(Prc8<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super V6> p) {
        return Prc8.<T1, T2, V1, V2, V3, V4, V5, V6>narrow(p).testLt(this.t1, this.t2);
    }

    public Rn accept(Cs2<? super T1, ? super T2> c) {
        return c.toRunnable(this.t1, this.t2);
    }

    public <V1> Cs1<V1> acceptRt(Cs3<? super V1, ? super T1, ? super T2> c) {
        return Cs3.<V1, T1, T2>narrow(c).acceptRt(this.t1, this.t2);
    }

    public <V1> Cs1<V1> acceptLt(Cs3<? super T1, ? super T2, ? super V1> c) {
        return Cs3.<T1, T2, V1>narrow(c).acceptLt(this.t1, this.t2);
    }

    public <V1> Cs1<V1> accept1Rt(Cs3<? super V1, ? super T1, ? super T2> c) {
        return Cs3.<V1, T1, T2>narrow(c).acceptRt(this.t1, this.t2);
    }

    public <V1> Cs1<V1> accept1Lt(Cs3<? super T1, ? super T2, ? super V1> c) {
        return Cs3.<T1, T2, V1>narrow(c).acceptLt(this.t1, this.t2);
    }

    public <V1, V2> Cs2<V1, V2> acceptRt(Cs4<? super V1, ? super V2, ? super T1, ? super T2> c) {
        return Cs4.<V1, V2, T1, T2>narrow(c).acceptRt(this.t1, this.t2);
    }

    public <V1, V2> Cs2<V1, V2> acceptLt(Cs4<? super T1, ? super T2, ? super V1, ? super V2> c) {
        return Cs4.<T1, T2, V1, V2>narrow(c).acceptLt(this.t1, this.t2);
    }

    public <V1, V2> Cs2<V1, V2> accept2Rt(Cs4<? super V1, ? super V2, ? super T1, ? super T2> c) {
        return Cs4.<V1, V2, T1, T2>narrow(c).acceptRt(this.t1, this.t2);
    }

    public <V1, V2> Cs2<V1, V2> accept2Lt(Cs4<? super T1, ? super T2, ? super V1, ? super V2> c) {
        return Cs4.<T1, T2, V1, V2>narrow(c).acceptLt(this.t1, this.t2);
    }

    public <V1, V2, V3> Cs3<V1, V2, V3> acceptRt(Cs5<? super V1, ? super V2, ? super V3, ? super T1, ? super T2> c) {
        return Cs5.<V1, V2, V3, T1, T2>narrow(c).acceptRt(this.t1, this.t2);
    }

    public <V1, V2, V3> Cs3<V1, V2, V3> acceptLt(Cs5<? super T1, ? super T2, ? super V1, ? super V2, ? super V3> c) {
        return Cs5.<T1, T2, V1, V2, V3>narrow(c).acceptLt(this.t1, this.t2);
    }

    public <V1, V2, V3> Cs3<V1, V2, V3> accept3Rt(Cs5<? super V1, ? super V2, ? super V3, ? super T1, ? super T2> c) {
        return Cs5.<V1, V2, V3, T1, T2>narrow(c).acceptRt(this.t1, this.t2);
    }

    public <V1, V2, V3> Cs3<V1, V2, V3> accept3Lt(Cs5<? super T1, ? super T2, ? super V1, ? super V2, ? super V3> c) {
        return Cs5.<T1, T2, V1, V2, V3>narrow(c).acceptLt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4> Cs4<V1, V2, V3, V4> acceptRt(Cs6<? super V1, ? super V2, ? super V3, ? super V4, ? super T1, ? super T2> c) {
        return Cs6.<V1, V2, V3, V4, T1, T2>narrow(c).acceptRt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4> Cs4<V1, V2, V3, V4> acceptLt(Cs6<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? super V4> c) {
        return Cs6.<T1, T2, V1, V2, V3, V4>narrow(c).acceptLt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4> Cs4<V1, V2, V3, V4> accept4Rt(Cs6<? super V1, ? super V2, ? super V3, ? super V4, ? super T1, ? super T2> c) {
        return Cs6.<V1, V2, V3, V4, T1, T2>narrow(c).acceptRt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4> Cs4<V1, V2, V3, V4> accept4Lt(Cs6<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? super V4> c) {
        return Cs6.<T1, T2, V1, V2, V3, V4>narrow(c).acceptLt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5> Cs5<V1, V2, V3, V4, V5> acceptRt(Cs7<? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super T1, ? super T2> c) {
        return Cs7.<V1, V2, V3, V4, V5, T1, T2>narrow(c).acceptRt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5> Cs5<V1, V2, V3, V4, V5> acceptLt(Cs7<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? super V4, ? super V5> c) {
        return Cs7.<T1, T2, V1, V2, V3, V4, V5>narrow(c).acceptLt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5> Cs5<V1, V2, V3, V4, V5> accept5Rt(Cs7<? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super T1, ? super T2> c) {
        return Cs7.<V1, V2, V3, V4, V5, T1, T2>narrow(c).acceptRt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5> Cs5<V1, V2, V3, V4, V5> accept5Lt(Cs7<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? super V4, ? super V5> c) {
        return Cs7.<T1, T2, V1, V2, V3, V4, V5>narrow(c).acceptLt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5, V6> Cs6<V1, V2, V3, V4, V5, V6> acceptRt(Cs8<? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super V6, ? super T1, ? super T2> c) {
        return Cs8.<V1, V2, V3, V4, V5, V6, T1, T2>narrow(c).acceptRt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5, V6> Cs6<V1, V2, V3, V4, V5, V6> acceptLt(Cs8<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super V6> c) {
        return Cs8.<T1, T2, V1, V2, V3, V4, V5, V6>narrow(c).acceptLt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5, V6> Cs6<V1, V2, V3, V4, V5, V6> accept6Rt(Cs8<? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super V6, ? super T1, ? super T2> c) {
        return Cs8.<V1, V2, V3, V4, V5, V6, T1, T2>narrow(c).acceptRt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5, V6> Cs6<V1, V2, V3, V4, V5, V6> accept6Lt(Cs8<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super V6> c) {
        return Cs8.<T1, T2, V1, V2, V3, V4, V5, V6>narrow(c).acceptLt(this.t1, this.t2);
    }

    public Rnc acceptChecked(Csc2<? super T1, ? super T2> c) {
        return c.toRunnable(this.t1, this.t2);
    }

    public <V1> Csc1<V1> acceptCheckedRt(Csc3<? super V1, ? super T1, ? super T2> c) {
        return Csc3.<V1, T1, T2>narrow(c).acceptRt(this.t1, this.t2);
    }

    public <V1> Csc1<V1> acceptCheckedLt(Csc3<? super T1, ? super T2, ? super V1> c) {
        return Csc3.<T1, T2, V1>narrow(c).acceptLt(this.t1, this.t2);
    }

    public <V1> Csc1<V1> acceptChecked1Rt(Csc3<? super V1, ? super T1, ? super T2> c) {
        return Csc3.<V1, T1, T2>narrow(c).acceptRt(this.t1, this.t2);
    }

    public <V1> Csc1<V1> acceptChecked1Lt(Csc3<? super T1, ? super T2, ? super V1> c) {
        return Csc3.<T1, T2, V1>narrow(c).acceptLt(this.t1, this.t2);
    }

    public <V1, V2> Csc2<V1, V2> acceptCheckedRt(Csc4<? super V1, ? super V2, ? super T1, ? super T2> c) {
        return Csc4.<V1, V2, T1, T2>narrow(c).acceptRt(this.t1, this.t2);
    }

    public <V1, V2> Csc2<V1, V2> acceptCheckedLt(Csc4<? super T1, ? super T2, ? super V1, ? super V2> c) {
        return Csc4.<T1, T2, V1, V2>narrow(c).acceptLt(this.t1, this.t2);
    }

    public <V1, V2> Csc2<V1, V2> acceptChecked2Rt(Csc4<? super V1, ? super V2, ? super T1, ? super T2> c) {
        return Csc4.<V1, V2, T1, T2>narrow(c).acceptRt(this.t1, this.t2);
    }

    public <V1, V2> Csc2<V1, V2> acceptChecked2Lt(Csc4<? super T1, ? super T2, ? super V1, ? super V2> c) {
        return Csc4.<T1, T2, V1, V2>narrow(c).acceptLt(this.t1, this.t2);
    }

    public <V1, V2, V3> Csc3<V1, V2, V3> acceptCheckedRt(Csc5<? super V1, ? super V2, ? super V3, ? super T1, ? super T2> c) {
        return Csc5.<V1, V2, V3, T1, T2>narrow(c).acceptRt(this.t1, this.t2);
    }

    public <V1, V2, V3> Csc3<V1, V2, V3> acceptCheckedLt(Csc5<? super T1, ? super T2, ? super V1, ? super V2, ? super V3> c) {
        return Csc5.<T1, T2, V1, V2, V3>narrow(c).acceptLt(this.t1, this.t2);
    }

    public <V1, V2, V3> Csc3<V1, V2, V3> acceptChecked3Rt(Csc5<? super V1, ? super V2, ? super V3, ? super T1, ? super T2> c) {
        return Csc5.<V1, V2, V3, T1, T2>narrow(c).acceptRt(this.t1, this.t2);
    }

    public <V1, V2, V3> Csc3<V1, V2, V3> acceptChecked3Lt(Csc5<? super T1, ? super T2, ? super V1, ? super V2, ? super V3> c) {
        return Csc5.<T1, T2, V1, V2, V3>narrow(c).acceptLt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4> Csc4<V1, V2, V3, V4> acceptCheckedRt(Csc6<? super V1, ? super V2, ? super V3, ? super V4, ? super T1, ? super T2> c) {
        return Csc6.<V1, V2, V3, V4, T1, T2>narrow(c).acceptRt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4> Csc4<V1, V2, V3, V4> acceptCheckedLt(Csc6<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? super V4> c) {
        return Csc6.<T1, T2, V1, V2, V3, V4>narrow(c).acceptLt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4> Csc4<V1, V2, V3, V4> acceptChecked4Rt(Csc6<? super V1, ? super V2, ? super V3, ? super V4, ? super T1, ? super T2> c) {
        return Csc6.<V1, V2, V3, V4, T1, T2>narrow(c).acceptRt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4> Csc4<V1, V2, V3, V4> acceptChecked4Lt(Csc6<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? super V4> c) {
        return Csc6.<T1, T2, V1, V2, V3, V4>narrow(c).acceptLt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5> Csc5<V1, V2, V3, V4, V5> acceptCheckedRt(Csc7<? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super T1, ? super T2> c) {
        return Csc7.<V1, V2, V3, V4, V5, T1, T2>narrow(c).acceptRt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5> Csc5<V1, V2, V3, V4, V5> acceptCheckedLt(Csc7<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? super V4, ? super V5> c) {
        return Csc7.<T1, T2, V1, V2, V3, V4, V5>narrow(c).acceptLt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5> Csc5<V1, V2, V3, V4, V5> acceptChecked5Rt(Csc7<? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super T1, ? super T2> c) {
        return Csc7.<V1, V2, V3, V4, V5, T1, T2>narrow(c).acceptRt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5> Csc5<V1, V2, V3, V4, V5> acceptChecked5Lt(Csc7<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? super V4, ? super V5> c) {
        return Csc7.<T1, T2, V1, V2, V3, V4, V5>narrow(c).acceptLt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5, V6> Csc6<V1, V2, V3, V4, V5, V6> acceptCheckedRt(Csc8<? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super V6, ? super T1, ? super T2> c) {
        return Csc8.<V1, V2, V3, V4, V5, V6, T1, T2>narrow(c).acceptRt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5, V6> Csc6<V1, V2, V3, V4, V5, V6> acceptCheckedLt(Csc8<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super V6> c) {
        return Csc8.<T1, T2, V1, V2, V3, V4, V5, V6>narrow(c).acceptLt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5, V6> Csc6<V1, V2, V3, V4, V5, V6> acceptChecked6Rt(Csc8<? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super V6, ? super T1, ? super T2> c) {
        return Csc8.<V1, V2, V3, V4, V5, V6, T1, T2>narrow(c).acceptRt(this.t1, this.t2);
    }

    public <V1, V2, V3, V4, V5, V6> Csc6<V1, V2, V3, V4, V5, V6> acceptChecked6Lt(Csc8<? super T1, ? super T2, ? super V1, ? super V2, ? super V3, ? super V4, ? super V5, ? super V6> c) {
        return Csc8.<T1, T2, V1, V2, V3, V4, V5, V6>narrow(c).acceptLt(this.t1, this.t2);
    }

}

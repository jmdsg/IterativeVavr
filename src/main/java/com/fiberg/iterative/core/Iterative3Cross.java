package com.fiberg.iterative.core;

import com.fiberg.iterative.core.Iterative2;
import com.fiberg.iterative.core.Iterative3;
import com.fiberg.iterative.core.Iterative4Cross;
import com.fiberg.iterative.core.Iterative5Cross;
import com.fiberg.iterative.core.Iterative6Cross;
import com.fiberg.iterative.core.Iterative7Cross;
import com.fiberg.iterative.core.Iterative8Cross;
import com.fiberg.iterative.core.IterativeHandler;
import com.fiberg.iterative.core.IterativeWrapper;
import com.fiberg.iterative.function.Cs1;
import com.fiberg.iterative.function.Cs3;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fn2;
import com.fiberg.iterative.function.Pr1;
import com.fiberg.iterative.function.Rn;
import io.vavr.Tuple;
import io.vavr.Tuple3;
import io.vavr.collection.Stream;
import java.io.Serializable;

public interface Iterative3Cross<T1, T2, T3> extends Iterative3<T1, T2, T3> {

    @Override
    public Iterative3Cross<T1, T2, T3> nonNullable();

    @Override
    public Iterative3Cross<T1, T2, T3> nullable();

    @Override
    public Iterative3Cross<T1, T2, T3> forceCleanEmpty1();

    @Override
    public Iterative3Cross<T1, T2, T3> forceCleanEmpty2();

    @Override
    public Iterative3Cross<T1, T2, T3> forceCleanEmpty3();

    @Override
    public Iterative3Cross<T1, T2, T3> forceCleanEmptyAll();

    @Override
    public <T4> Iterative4Cross<T1, T2, T3, T4> pushBackBy(Iterable<? extends Stream<? extends T4>> var1);

    @Override
    public <T0> Iterative4Cross<T0, T1, T2, T3> pushFrontBy(Iterable<? extends Stream<? extends T0>> var1);

    @Override
    public <T0> Iterative4Cross<T0, T1, T2, T3> pushFrontCrossBy(Iterable<? extends Stream<? extends T0>> var1);

    @Override
    public <T0> Iterative4Cross<T0, T1, T2, T3> pushFrontInlineBy(Iterable<? extends Stream<? extends T0>> var1);

    @Override
    public <R1, R2, R3> Iterative3Cross<R1, R2, R3> map(Fn1<? super T1, ? extends R1> var1, Fn1<? super T2, ? extends R2> var2, Fn1<? super T3, ? extends R3> var3);

    @Override
    public <R1, R2, R3> Iterative3Cross<R1, R2, R3> inlineMap(Fn1<? super T1, ? extends Iterable<? extends R1>> var1, Fn1<? super T2, ? extends Iterable<? extends R2>> var2, Fn1<? super T3, ? extends Iterable<? extends R3>> var3);

    @Override
    public Iterative3Cross<T1, T2, T3> filter(Pr1<? super T1> var1, Pr1<? super T2> var2, Pr1<? super T3> var3);

    @Override
    default public Iterative3Cross<T1, T2, T3> onSuccess(Rn r) {
        return (Iterative3Cross) Iterative3.super.onSuccess(r);
    }

    @Override
    default public Iterative3Cross<T1, T2, T3> onFailure(Rn r) {
        return (Iterative3Cross) Iterative3.super.onFailure(r);
    }

    @Override
    default public Iterative3Cross<T1, T2, T3> execute(Cs1<? super Iterative3<? extends T1, ? extends T2, ? extends T3>> c) {
        return (Iterative3Cross) Iterative3.super.execute(c);
    }

    @Override
    default public Iterative3Cross<T1, T2, T3> onFailure(Cs1<? super Iterative3<? extends T1, ? extends T2, ? extends T3>> c) {
        return (Iterative3Cross) Iterative3.super.onFailure(c);
    }

    @Override
    default public Iterative3Cross<T1, T2, T3> onSuccess(Cs1<? super Iterative3<? extends T1, ? extends T2, ? extends T3>> c) {
        return (Iterative3Cross) Iterative3.super.onSuccess(c);
    }

    @Override
    default public Iterative3Cross<T1, T2, T3> forEach(Cs3<? super T1, ? super T2, ? super T3> c) {
        return (Iterative3Cross) Iterative3.super.forEach(c);
    }

    @Override
    default public <R> Iterative3Cross<R, T2, T3> map1(Fn1<? super T1, ? extends R> f) {
        return (Iterative3Cross) Iterative3.super.map1(f);
    }

    @Override
    default public <R> Iterative3Cross<T1, R, T3> map2(Fn1<? super T2, ? extends R> f) {
        return (Iterative3Cross) Iterative3.super.map2(f);
    }

    @Override
    default public <R> Iterative3Cross<T1, T2, R> map3(Fn1<? super T3, ? extends R> f) {
        return (Iterative3Cross) Iterative3.super.map3(f);
    }

    @Override
    default public <R> Iterative3Cross<R, T2, T3> inlineMap1(Fn1<? super T1, ? extends Iterable<? extends R>> f) {
        return (Iterative3Cross) Iterative3.super.inlineMap1(f);
    }

    @Override
    default public <R> Iterative3Cross<T1, R, T3> inlineMap2(Fn1<? super T2, ? extends Iterable<? extends R>> f) {
        return (Iterative3Cross) Iterative3.super.inlineMap2(f);
    }

    @Override
    default public <R> Iterative3Cross<T1, T2, R> inlineMap3(Fn1<? super T3, ? extends Iterable<? extends R>> f) {
        return (Iterative3Cross) Iterative3.super.inlineMap3(f);
    }

    @Override
    default public Iterative3Cross<T1, T2, T3> filter1(Pr1<? super T1> p) {
        return (Iterative3Cross) Iterative3.super.filter1(p);
    }

    @Override
    default public Iterative3Cross<T1, T2, T3> filter2(Pr1<? super T2> p) {
        return (Iterative3Cross) Iterative3.super.filter2(p);
    }

    @Override
    default public Iterative3Cross<T1, T2, T3> filter3(Pr1<? super T3> p) {
        return (Iterative3Cross) Iterative3.super.filter3(p);
    }

    @Override
    default public <T4> Iterative4Cross<T1, T2, T3, T4> pushBack(T4 t4) {
        return (Iterative4Cross) Iterative3.super.pushBack(t4);
    }

    @Override
    default public <T0> Iterative4Cross<T0, T1, T2, T3> pushFront(T0 t0) {
        return (Iterative4Cross) Iterative3.super.pushFront(t0);
    }

    @Override
    default public <T0> Iterative4Cross<T0, T1, T2, T3> pushFrontCross(T0 t0) {
        return (Iterative4Cross) Iterative3.super.pushFrontCross(t0);
    }

    @Override
    default public <T0> Iterative4Cross<T0, T1, T2, T3> pushFrontInline(T0 t0) {
        return (Iterative4Cross) Iterative3.super.pushFrontInline(t0);
    }

    @Override
    default public <T4> Iterative4Cross<T1, T2, T3, T4> pushBackOf(Iterable<? extends T4> t4) {
        return (Iterative4Cross) Iterative3.super.pushBackOf(t4);
    }

    @Override
    default public <T0> Iterative4Cross<T0, T1, T2, T3> pushFrontOf(Iterable<? extends T0> t0) {
        return (Iterative4Cross) Iterative3.super.pushFrontOf(t0);
    }

    @Override
    default public <T0> Iterative4Cross<T0, T1, T2, T3> pushFrontCrossOf(Iterable<? extends T0> t0) {
        return (Iterative4Cross) Iterative3.super.pushFrontCrossOf(t0);
    }

    @Override
    default public <T0> Iterative4Cross<T0, T1, T2, T3> pushFrontInlineOf(Iterable<? extends T0> t0) {
        return (Iterative4Cross) Iterative3.super.pushFrontInlineOf(t0);
    }

    @Override
    default public <B1, B2> Iterative5Cross<T1, T2, T3, B1, B2> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2) {
        return (Iterative5Cross) Iterative3.super.pushBackBy(b1, b2);
    }

    @Override
    default public <F1, F2> Iterative5Cross<F1, F2, T1, T2, T3> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return (Iterative5Cross) Iterative3.super.pushFrontBy(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative5Cross<F1, F2, T1, T2, T3> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return (Iterative5Cross) Iterative3.super.pushFrontCrossBy(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative5Cross<F1, F2, T1, T2, T3> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return (Iterative5Cross) Iterative3.super.pushFrontInlineBy(f1, f2);
    }

    @Override
    default public <B1, B2> Iterative5Cross<T1, T2, T3, B1, B2> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2) {
        return (Iterative5Cross) Iterative3.super.pushBackOf(b1, b2);
    }

    @Override
    default public <F1, F2> Iterative5Cross<F1, F2, T1, T2, T3> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return (Iterative5Cross) Iterative3.super.pushFrontOf(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative5Cross<F1, F2, T1, T2, T3> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return (Iterative5Cross) Iterative3.super.pushFrontCrossOf(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative5Cross<F1, F2, T1, T2, T3> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return (Iterative5Cross) Iterative3.super.pushFrontInlineOf(f1, f2);
    }

    @Override
    default public <B1, B2> Iterative5Cross<T1, T2, T3, B1, B2> pushBack(B1 b1, B2 b2) {
        return (Iterative5Cross) Iterative3.super.pushBack(b1, b2);
    }

    @Override
    default public <F1, F2> Iterative5Cross<F1, F2, T1, T2, T3> pushFront(F1 f1, F2 f2) {
        return (Iterative5Cross) Iterative3.super.pushFront(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative5Cross<F1, F2, T1, T2, T3> pushFrontCross(F1 f1, F2 f2) {
        return (Iterative5Cross) Iterative3.super.pushFrontCross(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative5Cross<F1, F2, T1, T2, T3> pushFrontInline(F1 f1, F2 f2) {
        return (Iterative5Cross) Iterative3.super.pushFrontInline(f1, f2);
    }

    @Override
    default public <B1, B2, B3> Iterative6Cross<T1, T2, T3, B1, B2, B3> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3) {
        return (Iterative6Cross) ((Object) Iterative3.super.pushBackBy(b1, b2));
    }

    @Override
    default public <F1, F2, F3> Iterative6Cross<F1, F2, F3, T1, T2, T3> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3) {
        return (Iterative6Cross) Iterative3.super.pushFrontBy(f1, f2, f3);
    }

    @Override
    default public <F1, F2, F3> Iterative6Cross<F1, F2, F3, T1, T2, T3> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3) {
        return (Iterative6Cross) Iterative3.super.pushFrontCrossBy(f1, f2, f3);
    }

    @Override
    default public <F1, F2, F3> Iterative6Cross<F1, F2, F3, T1, T2, T3> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3) {
        return (Iterative6Cross) Iterative3.super.pushFrontInlineBy(f1, f2, f3);
    }

    @Override
    default public <B1, B2, B3> Iterative6Cross<T1, T2, T3, B1, B2, B3> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3) {
        return (Iterative6Cross) Iterative3.super.pushBackOf(b1, b2, b3);
    }

    @Override
    default public <F1, F2, F3> Iterative6Cross<F1, F2, F3, T1, T2, T3> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3) {
        return (Iterative6Cross) Iterative3.super.pushFrontOf(f1, f2, f3);
    }

    @Override
    default public <F1, F2, F3> Iterative6Cross<F1, F2, F3, T1, T2, T3> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3) {
        return (Iterative6Cross) Iterative3.super.pushFrontCrossOf(f1, f2, f3);
    }

    @Override
    default public <F1, F2, F3> Iterative6Cross<F1, F2, F3, T1, T2, T3> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3) {
        return (Iterative6Cross) Iterative3.super.pushFrontInlineOf(f1, f2, f3);
    }

    @Override
    default public <B1, B2, B3> Iterative6Cross<T1, T2, T3, B1, B2, B3> pushBack(B1 b1, B2 b2, B3 b3) {
        return (Iterative6Cross) Iterative3.super.pushBack(b1, b2, b3);
    }

    @Override
    default public <F1, F2, F3> Iterative6Cross<F1, F2, F3, T1, T2, T3> pushFront(F1 f1, F2 f2, F3 f3) {
        return (Iterative6Cross) Iterative3.super.pushFront(f1, f2, f3);
    }

    @Override
    default public <F1, F2, F3> Iterative6Cross<F1, F2, F3, T1, T2, T3> pushFrontCross(F1 f1, F2 f2, F3 f3) {
        return (Iterative6Cross) Iterative3.super.pushFrontCross(f1, f2, f3);
    }

    @Override
    default public <F1, F2, F3> Iterative6Cross<F1, F2, F3, T1, T2, T3> pushFrontInline(F1 f1, F2 f2, F3 f3) {
        return (Iterative6Cross) Iterative3.super.pushFrontInline(f1, f2, f3);
    }

    @Override
    default public <B1, B2, B3, B4> Iterative7Cross<T1, T2, T3, B1, B2, B3, B4> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4) {
        return (Iterative7Cross) ((Object) Iterative3.super.pushBackBy(b1, b2, b3));
    }

    @Override
    default public <F1, F2, F3, F4> Iterative7Cross<F1, F2, F3, F4, T1, T2, T3> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4) {
        return (Iterative7Cross) ((Object) Iterative3.super.pushFrontBy(f1, f2, f3));
    }

    @Override
    default public <F1, F2, F3, F4> Iterative7Cross<F1, F2, F3, F4, T1, T2, T3> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4) {
        return (Iterative7Cross) ((Object) Iterative3.super.pushFrontCrossBy(f1, f2, f3));
    }

    @Override
    default public <F1, F2, F3, F4> Iterative7Cross<F1, F2, F3, F4, T1, T2, T3> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4) {
        return (Iterative7Cross) Iterative3.super.pushFrontInlineBy(f1, f2, f3, f4);
    }

    @Override
    default public <B1, B2, B3, B4> Iterative7Cross<T1, T2, T3, B1, B2, B3, B4> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4) {
        return (Iterative7Cross) Iterative3.super.pushBackOf(b1, b2, b3, b4);
    }

    @Override
    default public <F1, F2, F3, F4> Iterative7Cross<F1, F2, F3, F4, T1, T2, T3> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4) {
        return (Iterative7Cross) Iterative3.super.pushFrontOf(f1, f2, f3, f4);
    }

    @Override
    default public <F1, F2, F3, F4> Iterative7Cross<F1, F2, F3, F4, T1, T2, T3> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4) {
        return (Iterative7Cross) Iterative3.super.pushFrontCrossOf(f1, f2, f3, f4);
    }

    @Override
    default public <F1, F2, F3, F4> Iterative7Cross<F1, F2, F3, F4, T1, T2, T3> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4) {
        return (Iterative7Cross) Iterative3.super.pushFrontInlineOf(f1, f2, f3, f4);
    }

    @Override
    default public <B1, B2, B3, B4> Iterative7Cross<T1, T2, T3, B1, B2, B3, B4> pushBack(B1 b1, B2 b2, B3 b3, B4 b4) {
        return (Iterative7Cross) Iterative3.super.pushBack(b1, b2, b3, b4);
    }

    @Override
    default public <F1, F2, F3, F4> Iterative7Cross<F1, F2, F3, F4, T1, T2, T3> pushFront(F1 f1, F2 f2, F3 f3, F4 f4) {
        return (Iterative7Cross) Iterative3.super.pushFront(f1, f2, f3, f4);
    }

    @Override
    default public <F1, F2, F3, F4> Iterative7Cross<F1, F2, F3, F4, T1, T2, T3> pushFrontCross(F1 f1, F2 f2, F3 f3, F4 f4) {
        return (Iterative7Cross) Iterative3.super.pushFrontCross(f1, f2, f3, f4);
    }

    @Override
    default public <F1, F2, F3, F4> Iterative7Cross<F1, F2, F3, F4, T1, T2, T3> pushFrontInline(F1 f1, F2 f2, F3 f3, F4 f4) {
        return (Iterative7Cross) Iterative3.super.pushFrontInline(f1, f2, f3, f4);
    }

    @Override
    default public <B1, B2, B3, B4, B5> Iterative8Cross<T1, T2, T3, B1, B2, B3, B4, B5> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4, Iterable<? extends Stream<? extends B5>> b5) {
        return (Iterative8Cross) Iterative3.super.pushBackBy(b1, b2, b3, b4, b5);
    }

    @Override
    default public <F1, F2, F3, F4, F5> Iterative8Cross<F1, F2, F3, F4, F5, T1, T2, T3> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5) {
        return (Iterative8Cross) Iterative3.super.pushFrontBy(f1, f2, f3, f4, f5);
    }

    @Override
    default public <F1, F2, F3, F4, F5> Iterative8Cross<F1, F2, F3, F4, F5, T1, T2, T3> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5) {
        return (Iterative8Cross) Iterative3.super.pushFrontCrossBy(f1, f2, f3, f4, f5);
    }

    @Override
    default public <F1, F2, F3, F4, F5> Iterative8Cross<F1, F2, F3, F4, F5, T1, T2, T3> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5) {
        return (Iterative8Cross) Iterative3.super.pushFrontInlineBy(f1, f2, f3, f4, f5);
    }

    @Override
    default public <B1, B2, B3, B4, B5> Iterative8Cross<T1, T2, T3, B1, B2, B3, B4, B5> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4, Iterable<? extends B5> b5) {
        return (Iterative8Cross) Iterative3.super.pushBackOf(b1, b2, b3, b4, b5);
    }

    @Override
    default public <F1, F2, F3, F4, F5> Iterative8Cross<F1, F2, F3, F4, F5, T1, T2, T3> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5) {
        return (Iterative8Cross) Iterative3.super.pushFrontOf(f1, f2, f3, f4, f5);
    }

    @Override
    default public <F1, F2, F3, F4, F5> Iterative8Cross<F1, F2, F3, F4, F5, T1, T2, T3> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5) {
        return (Iterative8Cross) Iterative3.super.pushFrontCrossOf(f1, f2, f3, f4, f5);
    }

    @Override
    default public <F1, F2, F3, F4, F5> Iterative8Cross<F1, F2, F3, F4, F5, T1, T2, T3> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5) {
        return (Iterative8Cross) Iterative3.super.pushFrontInlineOf(f1, f2, f3, f4, f5);
    }

    @Override
    default public <B1, B2, B3, B4, B5> Iterative8Cross<T1, T2, T3, B1, B2, B3, B4, B5> pushBack(B1 b1, B2 b2, B3 b3, B4 b4, B5 b5) {
        return (Iterative8Cross) Iterative3.super.pushBack(b1, b2, b3, b4, b5);
    }

    @Override
    default public <F1, F2, F3, F4, F5> Iterative8Cross<F1, F2, F3, F4, F5, T1, T2, T3> pushFront(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5) {
        return (Iterative8Cross) Iterative3.super.pushFront(f1, f2, f3, f4, f5);
    }

    @Override
    default public <F1, F2, F3, F4, F5> Iterative8Cross<F1, F2, F3, F4, F5, T1, T2, T3> pushFrontCross(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5) {
        return (Iterative8Cross) Iterative3.super.pushFrontCross(f1, f2, f3, f4, f5);
    }

    @Override
    default public <F1, F2, F3, F4, F5> Iterative8Cross<F1, F2, F3, F4, F5, T1, T2, T3> pushFrontInline(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5) {
        return (Iterative8Cross) Iterative3.super.pushFrontInline(f1, f2, f3, f4, f5);
    }

    public static class Iterative3CrossNonNullable<T1, T2, T3> extends Iterative3CrossAbst<T1, T2, T3> implements Iterative3Cross<T1, T2, T3>, IterativeWrapper.IterativeWrapperNonNullable, IterativeWrapper.IterativeCross {

        Iterative3CrossNonNullable(Iterative2<? extends T1, ? extends T2> iterative, Iterable<? extends T3> right) {
            super(iterative, right);
        }

        Iterative3CrossNonNullable(Iterative2<? extends T1, ? extends T2> iterative, Iterable<? extends Stream<? extends T3>> right, boolean ign) {
            super(iterative, right, ign);
        }

    }

    public static class Iterative3CrossNullable<T1, T2, T3> extends Iterative3CrossAbst<T1, T2, T3> implements Iterative3Cross<T1, T2, T3>, IterativeWrapper.IterativeWrapperNullable, IterativeWrapper.IterativeCross {

        Iterative3CrossNullable(Iterative2<? extends T1, ? extends T2> iterative, Iterable<? extends T3> right) {
            super(iterative, right);
        }

        Iterative3CrossNullable(Iterative2<? extends T1, ? extends T2> iterative, Iterable<? extends Stream<? extends T3>> right, boolean ign) {
            super(iterative, right, ign);
        }

    }

    public static abstract class Iterative3CrossAbst<T1, T2, T3> extends Iterative3.Iterative3Abst<T1, T2, T3> implements Iterative3Cross<T1, T2, T3> {

        Iterative3CrossAbst(Iterative2<? extends T1, ? extends T2> iterative, Iterable<? extends T3> right) {
            super(iterative, right);
        }

        Iterative3CrossAbst(Iterative2<? extends T1, ? extends T2> iterative, Iterable<? extends Stream<? extends T3>> right, boolean ign) {
            super(iterative, right, ign);
        }

        @Override
        public Stream<Tuple3<Iterable<T1>, Iterable<T2>, Iterable<T3>>> toTupleStream() {
            return this.iterative.toTupleStream().crossProduct(IterativeHandler.transform(this.right)).toStream().map(Fn2.tuple((Fn2 & Serializable) (tuple, right) -> Tuple.of((Object) tuple._1(), (Object) tuple._2(), (Object) right)));
        }

        @Override
        public Iterative3Cross<T1, T2, T3> nonNullable() {
            return (Iterative3Cross) super.nonNullable();
        }

        @Override
        public Iterative3Cross<T1, T2, T3> nullable() {
            return (Iterative3Cross) super.nullable();
        }

        @Override
        public Iterative3Cross<T1, T2, T3> forceCleanEmpty1() {
            return (Iterative3Cross) super.forceCleanEmpty1();
        }

        @Override
        public Iterative3Cross<T1, T2, T3> forceCleanEmpty2() {
            return (Iterative3Cross) super.forceCleanEmpty2();
        }

        @Override
        public Iterative3Cross<T1, T2, T3> forceCleanEmpty3() {
            return (Iterative3Cross) super.forceCleanEmpty3();
        }

        @Override
        public Iterative3Cross<T1, T2, T3> forceCleanEmptyAll() {
            return (Iterative3Cross) super.forceCleanEmptyAll();
        }

        @Override
        public <T4> Iterative4Cross<T1, T2, T3, T4> pushBackBy(Iterable<? extends Stream<? extends T4>> t4) {
            return (Iterative4Cross) super.pushBackBy(t4);
        }

        @Override
        public <T0> Iterative4Cross<T0, T1, T2, T3> pushFrontBy(Iterable<? extends Stream<? extends T0>> t0) {
            return (Iterative4Cross) super.pushFrontBy(t0);
        }

        @Override
        public <T0> Iterative4Cross<T0, T1, T2, T3> pushFrontCrossBy(Iterable<? extends Stream<? extends T0>> t0) {
            return (Iterative4Cross) super.pushFrontCrossBy(t0);
        }

        @Override
        public <T0> Iterative4Cross<T0, T1, T2, T3> pushFrontInlineBy(Iterable<? extends Stream<? extends T0>> t0) {
            return (Iterative4Cross) super.pushFrontInlineBy(t0);
        }

        @Override
        public <R1, R2, R3> Iterative3Cross<R1, R2, R3> map(Fn1<? super T1, ? extends R1> f1, Fn1<? super T2, ? extends R2> f2, Fn1<? super T3, ? extends R3> f3) {
            return (Iterative3Cross) super.map(f1, f2, f3);
        }

        @Override
        public <R1, R2, R3> Iterative3Cross<R1, R2, R3> inlineMap(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3) {
            return (Iterative3Cross) super.inlineMap(f1, f2, f3);
        }

        @Override
        public Iterative3Cross<T1, T2, T3> filter(Pr1<? super T1> p1, Pr1<? super T2> p2, Pr1<? super T3> p3) {
            return (Iterative3Cross) super.filter(p1, p2, p3);
        }

    }

}

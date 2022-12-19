package com.fiberg.iterative.core;

import com.fiberg.iterative.core.Iterative3;
import com.fiberg.iterative.core.Iterative4;
import com.fiberg.iterative.core.Iterative5Cross;
import com.fiberg.iterative.core.Iterative6Cross;
import com.fiberg.iterative.core.Iterative7Cross;
import com.fiberg.iterative.core.Iterative8Cross;
import com.fiberg.iterative.core.IterativeHandler;
import com.fiberg.iterative.core.IterativeWrapper;
import com.fiberg.iterative.function.Cs1;
import com.fiberg.iterative.function.Cs4;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fn2;
import com.fiberg.iterative.function.Pr1;
import com.fiberg.iterative.function.Rn;
import io.vavr.Tuple;
import io.vavr.Tuple4;
import io.vavr.collection.Stream;
import java.io.Serializable;

public interface Iterative4Cross<T1, T2, T3, T4> extends Iterative4<T1, T2, T3, T4> {

    @Override
    public Iterative4Cross<T1, T2, T3, T4> nonNullable();

    @Override
    public Iterative4Cross<T1, T2, T3, T4> nullable();

    @Override
    public Iterative4Cross<T1, T2, T3, T4> forceCleanEmpty1();

    @Override
    public Iterative4Cross<T1, T2, T3, T4> forceCleanEmpty2();

    @Override
    public Iterative4Cross<T1, T2, T3, T4> forceCleanEmpty3();

    @Override
    public Iterative4Cross<T1, T2, T3, T4> forceCleanEmpty4();

    @Override
    public Iterative4Cross<T1, T2, T3, T4> forceCleanEmptyAll();

    @Override
    public <T5> Iterative5Cross<T1, T2, T3, T4, T5> pushBackBy(Iterable<? extends Stream<? extends T5>> var1);

    @Override
    public <T0> Iterative5Cross<T0, T1, T2, T3, T4> pushFrontBy(Iterable<? extends Stream<? extends T0>> var1);

    @Override
    public <T0> Iterative5Cross<T0, T1, T2, T3, T4> pushFrontCrossBy(Iterable<? extends Stream<? extends T0>> var1);

    @Override
    public <T0> Iterative5Cross<T0, T1, T2, T3, T4> pushFrontInlineBy(Iterable<? extends Stream<? extends T0>> var1);

    @Override
    public <R1, R2, R3, R4> Iterative4Cross<R1, R2, R3, R4> map(Fn1<? super T1, ? extends R1> var1, Fn1<? super T2, ? extends R2> var2, Fn1<? super T3, ? extends R3> var3, Fn1<? super T4, ? extends R4> var4);

    @Override
    public <R1, R2, R3, R4> Iterative4Cross<R1, R2, R3, R4> inlineMap(Fn1<? super T1, ? extends Iterable<? extends R1>> var1, Fn1<? super T2, ? extends Iterable<? extends R2>> var2, Fn1<? super T3, ? extends Iterable<? extends R3>> var3, Fn1<? super T4, ? extends Iterable<? extends R4>> var4);

    @Override
    public Iterative4Cross<T1, T2, T3, T4> filter(Pr1<? super T1> var1, Pr1<? super T2> var2, Pr1<? super T3> var3, Pr1<? super T4> var4);

    @Override
    default public Iterative4Cross<T1, T2, T3, T4> onSuccess(Rn r) {
        return (Iterative4Cross<T1, T2, T3, T4>) Iterative4.super.onSuccess(r);
    }

    @Override
    default public Iterative4Cross<T1, T2, T3, T4> onFailure(Rn r) {
        return (Iterative4Cross<T1, T2, T3, T4>) Iterative4.super.onFailure(r);
    }

    @Override
    default public Iterative4Cross<T1, T2, T3, T4> execute(Cs1<? super Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> c) {
        return (Iterative4Cross<T1, T2, T3, T4>) Iterative4.super.execute(c);
    }

    @Override
    default public Iterative4Cross<T1, T2, T3, T4> onFailure(Cs1<? super Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> c) {
        return (Iterative4Cross<T1, T2, T3, T4>) Iterative4.super.onFailure(c);
    }

    @Override
    default public Iterative4Cross<T1, T2, T3, T4> onSuccess(Cs1<? super Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> c) {
        return (Iterative4Cross<T1, T2, T3, T4>) Iterative4.super.onSuccess(c);
    }

    @Override
    default public Iterative4Cross<T1, T2, T3, T4> forEach(Cs4<? super T1, ? super T2, ? super T3, ? super T4> c) {
        return (Iterative4Cross<T1, T2, T3, T4>) Iterative4.super.forEach(c);
    }

    @Override
    default public <R> Iterative4Cross<R, T2, T3, T4> map1(Fn1<? super T1, ? extends R> f) {
        return (Iterative4Cross<R, T2, T3, T4>) Iterative4.super.<R>map1(f);
    }

    @Override
    default public <R> Iterative4Cross<T1, R, T3, T4> map2(Fn1<? super T2, ? extends R> f) {
        return (Iterative4Cross<T1, R, T3, T4>) Iterative4.super.<R>map2(f);
    }

    @Override
    default public <R> Iterative4Cross<T1, T2, R, T4> map3(Fn1<? super T3, ? extends R> f) {
        return (Iterative4Cross<T1, T2, R, T4>) Iterative4.super.<R>map3(f);
    }

    @Override
    default public <R> Iterative4Cross<T1, T2, T3, R> map4(Fn1<? super T4, ? extends R> f) {
        return (Iterative4Cross<T1, T2, T3, R>) Iterative4.super.<R>map4(f);
    }

    @Override
    default public <R> Iterative4Cross<R, T2, T3, T4> inlineMap1(Fn1<? super T1, ? extends Iterable<? extends R>> f) {
        return (Iterative4Cross<R, T2, T3, T4>) Iterative4.super.<R>inlineMap1(f);
    }

    @Override
    default public <R> Iterative4Cross<T1, R, T3, T4> inlineMap2(Fn1<? super T2, ? extends Iterable<? extends R>> f) {
        return (Iterative4Cross<T1, R, T3, T4>) Iterative4.super.<R>inlineMap2(f);
    }

    @Override
    default public <R> Iterative4Cross<T1, T2, R, T4> inlineMap3(Fn1<? super T3, ? extends Iterable<? extends R>> f) {
        return (Iterative4Cross<T1, T2, R, T4>) Iterative4.super.<R>inlineMap3(f);
    }

    @Override
    default public <R> Iterative4Cross<T1, T2, T3, R> inlineMap4(Fn1<? super T4, ? extends Iterable<? extends R>> f) {
        return (Iterative4Cross<T1, T2, T3, R>) Iterative4.super.<R>inlineMap4(f);
    }

    @Override
    default public Iterative4Cross<T1, T2, T3, T4> filter1(Pr1<? super T1> p) {
        return (Iterative4Cross<T1, T2, T3, T4>) Iterative4.super.filter1(p);
    }

    @Override
    default public Iterative4Cross<T1, T2, T3, T4> filter2(Pr1<? super T2> p) {
        return (Iterative4Cross<T1, T2, T3, T4>) Iterative4.super.filter2(p);
    }

    @Override
    default public Iterative4Cross<T1, T2, T3, T4> filter3(Pr1<? super T3> p) {
        return (Iterative4Cross<T1, T2, T3, T4>) Iterative4.super.filter3(p);
    }

    @Override
    default public Iterative4Cross<T1, T2, T3, T4> filter4(Pr1<? super T4> p) {
        return (Iterative4Cross<T1, T2, T3, T4>) Iterative4.super.filter4(p);
    }

    @Override
    default public <T5> Iterative5Cross<T1, T2, T3, T4, T5> pushBack(T5 t5) {
        return (Iterative5Cross<T1, T2, T3, T4, T5>) Iterative4.super.<T5>pushBack(t5);
    }

    @Override
    default public <T0> Iterative5Cross<T0, T1, T2, T3, T4> pushFront(T0 t0) {
        return (Iterative5Cross<T0, T1, T2, T3, T4>) Iterative4.super.<T0>pushFront(t0);
    }

    @Override
    default public <T0> Iterative5Cross<T0, T1, T2, T3, T4> pushFrontCross(T0 t0) {
        return (Iterative5Cross<T0, T1, T2, T3, T4>) Iterative4.super.<T0>pushFrontCross(t0);
    }

    @Override
    default public <T0> Iterative5Cross<T0, T1, T2, T3, T4> pushFrontInline(T0 t0) {
        return (Iterative5Cross<T0, T1, T2, T3, T4>) Iterative4.super.<T0>pushFrontInline(t0);
    }

    @Override
    default public <T5> Iterative5Cross<T1, T2, T3, T4, T5> pushBackOf(Iterable<? extends T5> t5) {
        return (Iterative5Cross<T1, T2, T3, T4, T5>) Iterative4.super.<T5>pushBackOf(t5);
    }

    @Override
    default public <T0> Iterative5Cross<T0, T1, T2, T3, T4> pushFrontOf(Iterable<? extends T0> t0) {
        return (Iterative5Cross<T0, T1, T2, T3, T4>) Iterative4.super.<T0>pushFrontOf(t0);
    }

    @Override
    default public <T0> Iterative5Cross<T0, T1, T2, T3, T4> pushFrontCrossOf(Iterable<? extends T0> t0) {
        return (Iterative5Cross<T0, T1, T2, T3, T4>) Iterative4.super.<T0>pushFrontCrossOf(t0);
    }

    @Override
    default public <T0> Iterative5Cross<T0, T1, T2, T3, T4> pushFrontInlineOf(Iterable<? extends T0> t0) {
        return (Iterative5Cross<T0, T1, T2, T3, T4>) Iterative4.super.<T0>pushFrontInlineOf(t0);
    }

    @Override
    default public <B1, B2> Iterative6Cross<T1, T2, T3, T4, B1, B2> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2) {
        return (Iterative6Cross<T1, T2, T3, T4, B1, B2>) Iterative4.super.<B1, B2>pushBackBy(b1, b2);
    }

    @Override
    default public <F1, F2> Iterative6Cross<F1, F2, T1, T2, T3, T4> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return (Iterative6Cross<F1, F2, T1, T2, T3, T4>) Iterative4.super.<F1, F2>pushFrontBy(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative6Cross<F1, F2, T1, T2, T3, T4> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return (Iterative6Cross<F1, F2, T1, T2, T3, T4>) Iterative4.super.<F1, F2>pushFrontCrossBy(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative6Cross<F1, F2, T1, T2, T3, T4> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return (Iterative6Cross<F1, F2, T1, T2, T3, T4>) Iterative4.super.<F1, F2>pushFrontInlineBy(f1, f2);
    }

    @Override
    default public <B1, B2> Iterative6Cross<T1, T2, T3, T4, B1, B2> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2) {
        return (Iterative6Cross<T1, T2, T3, T4, B1, B2>) Iterative4.super.<B1, B2>pushBackOf(b1, b2);
    }

    @Override
    default public <F1, F2> Iterative6Cross<F1, F2, T1, T2, T3, T4> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return (Iterative6Cross<F1, F2, T1, T2, T3, T4>) Iterative4.super.<F1, F2>pushFrontOf(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative6Cross<F1, F2, T1, T2, T3, T4> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return (Iterative6Cross<F1, F2, T1, T2, T3, T4>) Iterative4.super.<F1, F2>pushFrontCrossOf(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative6Cross<F1, F2, T1, T2, T3, T4> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return (Iterative6Cross<F1, F2, T1, T2, T3, T4>) Iterative4.super.<F1, F2>pushFrontInlineOf(f1, f2);
    }

    @Override
    default public <B1, B2> Iterative6Cross<T1, T2, T3, T4, B1, B2> pushBack(B1 b1, B2 b2) {
        return (Iterative6Cross<T1, T2, T3, T4, B1, B2>) Iterative4.super.<B1, B2>pushBack(b1, b2);
    }

    @Override
    default public <F1, F2> Iterative6Cross<F1, F2, T1, T2, T3, T4> pushFront(F1 f1, F2 f2) {
        return (Iterative6Cross<F1, F2, T1, T2, T3, T4>) Iterative4.super.<F1, F2>pushFront(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative6Cross<F1, F2, T1, T2, T3, T4> pushFrontCross(F1 f1, F2 f2) {
        return (Iterative6Cross<F1, F2, T1, T2, T3, T4>) Iterative4.super.<F1, F2>pushFrontCross(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative6Cross<F1, F2, T1, T2, T3, T4> pushFrontInline(F1 f1, F2 f2) {
        return (Iterative6Cross<F1, F2, T1, T2, T3, T4>) Iterative4.super.<F1, F2>pushFrontInline(f1, f2);
    }

    @Override
    default public <B1, B2, B3> Iterative7Cross<T1, T2, T3, T4, B1, B2, B3> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3) {
        return (Iterative7Cross<T1, T2, T3, T4, B1, B2, B3>) Iterative4.super.<B1, B2, B3>pushBackBy(b1, b2, b3);
    }

    @Override
    default public <F1, F2, F3> Iterative7Cross<F1, F2, F3, T1, T2, T3, T4> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3) {
        return (Iterative7Cross<F1, F2, F3, T1, T2, T3, T4>) Iterative4.super.<F1, F2, F3>pushFrontBy(f1, f2, f3);
    }

    @Override
    default public <F1, F2, F3> Iterative7Cross<F1, F2, F3, T1, T2, T3, T4> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3) {
        return (Iterative7Cross<F1, F2, F3, T1, T2, T3, T4>) Iterative4.super.<F1, F2, F3>pushFrontCrossBy(f1, f2, f3);
    }

    @Override
    default public <F1, F2, F3> Iterative7Cross<F1, F2, F3, T1, T2, T3, T4> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3) {
        return (Iterative7Cross<F1, F2, F3, T1, T2, T3, T4>) Iterative4.super.<F1, F2, F3>pushFrontInlineBy(f1, f2, f3);
    }

    @Override
    default public <B1, B2, B3> Iterative7Cross<T1, T2, T3, T4, B1, B2, B3> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3) {
        return (Iterative7Cross<T1, T2, T3, T4, B1, B2, B3>) Iterative4.super.<B1, B2, B3>pushBackOf(b1, b2, b3);
    }

    @Override
    default public <F1, F2, F3> Iterative7Cross<F1, F2, F3, T1, T2, T3, T4> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3) {
        return (Iterative7Cross<F1, F2, F3, T1, T2, T3, T4>) Iterative4.super.<F1, F2, F3>pushFrontOf(f1, f2, f3);
    }

    @Override
    default public <F1, F2, F3> Iterative7Cross<F1, F2, F3, T1, T2, T3, T4> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3) {
        return (Iterative7Cross<F1, F2, F3, T1, T2, T3, T4>) Iterative4.super.<F1, F2, F3>pushFrontCrossOf(f1, f2, f3);
    }

    @Override
    default public <F1, F2, F3> Iterative7Cross<F1, F2, F3, T1, T2, T3, T4> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3) {
        return (Iterative7Cross<F1, F2, F3, T1, T2, T3, T4>) Iterative4.super.<F1, F2, F3>pushFrontInlineOf(f1, f2, f3);
    }

    @Override
    default public <B1, B2, B3> Iterative7Cross<T1, T2, T3, T4, B1, B2, B3> pushBack(B1 b1, B2 b2, B3 b3) {
        return (Iterative7Cross<T1, T2, T3, T4, B1, B2, B3>) Iterative4.super.<B1, B2, B3>pushBack(b1, b2, b3);
    }

    @Override
    default public <F1, F2, F3> Iterative7Cross<F1, F2, F3, T1, T2, T3, T4> pushFront(F1 f1, F2 f2, F3 f3) {
        return (Iterative7Cross<F1, F2, F3, T1, T2, T3, T4>) Iterative4.super.<F1, F2, F3>pushFront(f1, f2, f3);
    }

    @Override
    default public <F1, F2, F3> Iterative7Cross<F1, F2, F3, T1, T2, T3, T4> pushFrontCross(F1 f1, F2 f2, F3 f3) {
        return (Iterative7Cross<F1, F2, F3, T1, T2, T3, T4>) Iterative4.super.<F1, F2, F3>pushFrontCross(f1, f2, f3);
    }

    @Override
    default public <F1, F2, F3> Iterative7Cross<F1, F2, F3, T1, T2, T3, T4> pushFrontInline(F1 f1, F2 f2, F3 f3) {
        return (Iterative7Cross<F1, F2, F3, T1, T2, T3, T4>) Iterative4.super.<F1, F2, F3>pushFrontInline(f1, f2, f3);
    }

    @Override
    default public <B1, B2, B3, B4> Iterative8Cross<T1, T2, T3, T4, B1, B2, B3, B4> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4) {
        return (Iterative8Cross<T1, T2, T3, T4, B1, B2, B3, B4>) Iterative4.super.<B1, B2, B3, B4>pushBackBy(b1, b2, b3, b4);
    }

    @Override
    default public <F1, F2, F3, F4> Iterative8Cross<F1, F2, F3, F4, T1, T2, T3, T4> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4) {
        return (Iterative8Cross<F1, F2, F3, F4, T1, T2, T3, T4>) Iterative4.super.<F1, F2, F3, F4>pushFrontBy(f1, f2, f3, f4);
    }

    @Override
    default public <F1, F2, F3, F4> Iterative8Cross<F1, F2, F3, F4, T1, T2, T3, T4> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4) {
        return (Iterative8Cross<F1, F2, F3, F4, T1, T2, T3, T4>) Iterative4.super.<F1, F2, F3, F4>pushFrontCrossBy(f1, f2, f3, f4);
    }

    @Override
    default public <F1, F2, F3, F4> Iterative8Cross<F1, F2, F3, F4, T1, T2, T3, T4> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4) {
        return (Iterative8Cross<F1, F2, F3, F4, T1, T2, T3, T4>) Iterative4.super.<F1, F2, F3, F4>pushFrontInlineBy(f1, f2, f3, f4);
    }

    @Override
    default public <B1, B2, B3, B4> Iterative8Cross<T1, T2, T3, T4, B1, B2, B3, B4> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4) {
        return (Iterative8Cross<T1, T2, T3, T4, B1, B2, B3, B4>) Iterative4.super.<B1, B2, B3, B4>pushBackOf(b1, b2, b3, b4);
    }

    @Override
    default public <F1, F2, F3, F4> Iterative8Cross<F1, F2, F3, F4, T1, T2, T3, T4> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4) {
        return (Iterative8Cross<F1, F2, F3, F4, T1, T2, T3, T4>) Iterative4.super.<F1, F2, F3, F4>pushFrontOf(f1, f2, f3, f4);
    }

    @Override
    default public <F1, F2, F3, F4> Iterative8Cross<F1, F2, F3, F4, T1, T2, T3, T4> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4) {
        return (Iterative8Cross<F1, F2, F3, F4, T1, T2, T3, T4>) Iterative4.super.<F1, F2, F3, F4>pushFrontCrossOf(f1, f2, f3, f4);
    }

    @Override
    default public <F1, F2, F3, F4> Iterative8Cross<F1, F2, F3, F4, T1, T2, T3, T4> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4) {
        return (Iterative8Cross<F1, F2, F3, F4, T1, T2, T3, T4>) Iterative4.super.<F1, F2, F3, F4>pushFrontInlineOf(f1, f2, f3, f4);
    }

    @Override
    default public <B1, B2, B3, B4> Iterative8Cross<T1, T2, T3, T4, B1, B2, B3, B4> pushBack(B1 b1, B2 b2, B3 b3, B4 b4) {
        return (Iterative8Cross<T1, T2, T3, T4, B1, B2, B3, B4>) Iterative4.super.<B1, B2, B3, B4>pushBack(b1, b2, b3, b4);
    }

    @Override
    default public <F1, F2, F3, F4> Iterative8Cross<F1, F2, F3, F4, T1, T2, T3, T4> pushFront(F1 f1, F2 f2, F3 f3, F4 f4) {
        return (Iterative8Cross<F1, F2, F3, F4, T1, T2, T3, T4>) Iterative4.super.<F1, F2, F3, F4>pushFront(f1, f2, f3, f4);
    }

    @Override
    default public <F1, F2, F3, F4> Iterative8Cross<F1, F2, F3, F4, T1, T2, T3, T4> pushFrontCross(F1 f1, F2 f2, F3 f3, F4 f4) {
        return (Iterative8Cross<F1, F2, F3, F4, T1, T2, T3, T4>) Iterative4.super.<F1, F2, F3, F4>pushFrontCross(f1, f2, f3, f4);
    }

    @Override
    default public <F1, F2, F3, F4> Iterative8Cross<F1, F2, F3, F4, T1, T2, T3, T4> pushFrontInline(F1 f1, F2 f2, F3 f3, F4 f4) {
        return (Iterative8Cross<F1, F2, F3, F4, T1, T2, T3, T4>) Iterative4.super.<F1, F2, F3, F4>pushFrontInline(f1, f2, f3, f4);
    }

    public static class Iterative4CrossNonNullable<T1, T2, T3, T4> extends Iterative4CrossAbstract<T1, T2, T3, T4> implements Iterative4Cross<T1, T2, T3, T4>, IterativeWrapper.IterativeWrapperNonNullable, IterativeWrapper.IterativeCross {

        Iterative4CrossNonNullable(Iterative3<? extends T1, ? extends T2, ? extends T3> iterative, Iterable<? extends T4> right) {
            super(iterative, right);
        }

        Iterative4CrossNonNullable(Iterative3<? extends T1, ? extends T2, ? extends T3> iterative, Iterable<? extends Stream<? extends T4>> right, boolean ign) {
            super(iterative, right, ign);
        }

    }

    public static class Iterative4CrossNullable<T1, T2, T3, T4> extends Iterative4CrossAbstract<T1, T2, T3, T4> implements Iterative4Cross<T1, T2, T3, T4>, IterativeWrapper.IterativeWrapperNullable, IterativeWrapper.IterativeCross {

        Iterative4CrossNullable(Iterative3<? extends T1, ? extends T2, ? extends T3> iterative, Iterable<? extends T4> right) {
            super(iterative, right);
        }

        Iterative4CrossNullable(Iterative3<? extends T1, ? extends T2, ? extends T3> iterative, Iterable<? extends Stream<? extends T4>> right, boolean ign) {
            super(iterative, right, ign);
        }

    }

    public static abstract class Iterative4CrossAbstract<T1, T2, T3, T4> extends Iterative4.Iterative4Abstract<T1, T2, T3, T4> implements Iterative4Cross<T1, T2, T3, T4> {

        Iterative4CrossAbstract(Iterative3<? extends T1, ? extends T2, ? extends T3> iterative, Iterable<? extends T4> right) {
            super(iterative, right);
        }

        Iterative4CrossAbstract(Iterative3<? extends T1, ? extends T2, ? extends T3> iterative, Iterable<? extends Stream<? extends T4>> right, boolean ign) {
            super(iterative, right, ign);
        }

        @Override
        public Stream<Tuple4<Iterable<T1>, Iterable<T2>, Iterable<T3>, Iterable<T4>>> toTupleStream() {
            return this.iterative.toTupleStream().crossProduct(IterativeHandler.transform(this.right)).toStream().map(Fn2.tuple((tuple, right) -> Tuple.of(tuple._1(), tuple._2(), tuple._3(), right)));
        }

        @Override
        public Iterative4Cross<T1, T2, T3, T4> nonNullable() {
            return (Iterative4Cross<T1, T2, T3, T4>) super.nonNullable();
        }

        @Override
        public Iterative4Cross<T1, T2, T3, T4> nullable() {
            return (Iterative4Cross<T1, T2, T3, T4>) super.nullable();
        }

        @Override
        public Iterative4Cross<T1, T2, T3, T4> forceCleanEmpty1() {
            return (Iterative4Cross<T1, T2, T3, T4>) super.forceCleanEmpty1();
        }

        @Override
        public Iterative4Cross<T1, T2, T3, T4> forceCleanEmpty2() {
            return (Iterative4Cross<T1, T2, T3, T4>) super.forceCleanEmpty2();
        }

        @Override
        public Iterative4Cross<T1, T2, T3, T4> forceCleanEmpty3() {
            return (Iterative4Cross<T1, T2, T3, T4>) super.forceCleanEmpty3();
        }

        @Override
        public Iterative4Cross<T1, T2, T3, T4> forceCleanEmpty4() {
            return (Iterative4Cross<T1, T2, T3, T4>) super.forceCleanEmpty4();
        }

        @Override
        public Iterative4Cross<T1, T2, T3, T4> forceCleanEmptyAll() {
            return (Iterative4Cross<T1, T2, T3, T4>) super.forceCleanEmptyAll();
        }

        @Override
        public <T5> Iterative5Cross<T1, T2, T3, T4, T5> pushBackBy(Iterable<? extends Stream<? extends T5>> t5) {
            return (Iterative5Cross<T1, T2, T3, T4, T5>) super.<T5>pushBackBy(t5);
        }

        @Override
        public <T0> Iterative5Cross<T0, T1, T2, T3, T4> pushFrontBy(Iterable<? extends Stream<? extends T0>> t0) {
            return (Iterative5Cross<T0, T1, T2, T3, T4>) super.<T0>pushFrontBy(t0);
        }

        @Override
        public <T0> Iterative5Cross<T0, T1, T2, T3, T4> pushFrontCrossBy(Iterable<? extends Stream<? extends T0>> t0) {
            return (Iterative5Cross<T0, T1, T2, T3, T4>) super.<T0>pushFrontCrossBy(t0);
        }

        @Override
        public <T0> Iterative5Cross<T0, T1, T2, T3, T4> pushFrontInlineBy(Iterable<? extends Stream<? extends T0>> t0) {
            return (Iterative5Cross<T0, T1, T2, T3, T4>) super.<T0>pushFrontInlineBy(t0);
        }

        @Override
        public <R1, R2, R3, R4> Iterative4Cross<R1, R2, R3, R4> map(Fn1<? super T1, ? extends R1> f1, Fn1<? super T2, ? extends R2> f2, Fn1<? super T3, ? extends R3> f3, Fn1<? super T4, ? extends R4> f4) {
            return (Iterative4Cross<R1, R2, R3, R4>) super.<R1, R2, R3, R4>map(f1, f2, f3, f4);
        }

        @Override
        public <R1, R2, R3, R4> Iterative4Cross<R1, R2, R3, R4> inlineMap(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4) {
            return (Iterative4Cross<R1, R2, R3, R4>) super.<R1, R2, R3, R4>inlineMap(f1, f2, f3, f4);
        }

        @Override
        public Iterative4Cross<T1, T2, T3, T4> filter(Pr1<? super T1> p1, Pr1<? super T2> p2, Pr1<? super T3> p3, Pr1<? super T4> p4) {
            return (Iterative4Cross<T1, T2, T3, T4>) super.filter(p1, p2, p3, p4);
        }

    }

}

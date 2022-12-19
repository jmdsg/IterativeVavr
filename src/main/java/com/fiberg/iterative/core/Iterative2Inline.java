package com.fiberg.iterative.core;

import com.fiberg.iterative.core.Iterative1;
import com.fiberg.iterative.core.Iterative2;
import com.fiberg.iterative.core.Iterative3Inline;
import com.fiberg.iterative.core.Iterative4Inline;
import com.fiberg.iterative.core.Iterative5Inline;
import com.fiberg.iterative.core.Iterative6Inline;
import com.fiberg.iterative.core.Iterative7Inline;
import com.fiberg.iterative.core.Iterative8Inline;
import com.fiberg.iterative.core.IterativeHandler;
import com.fiberg.iterative.core.IterativeWrapper;
import com.fiberg.iterative.core.ZipIterator;
import com.fiberg.iterative.function.Cs1;
import com.fiberg.iterative.function.Cs2;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fn2;
import com.fiberg.iterative.function.Pr1;
import com.fiberg.iterative.function.Rn;
import io.vavr.Tuple;
import io.vavr.Tuple2;
import io.vavr.collection.Stream;
import java.io.Serializable;

public interface Iterative2Inline<T1, T2> extends Iterative2<T1, T2> {

    @Override
    public Iterative2Inline<T1, T2> nonNullable();

    @Override
    public Iterative2Inline<T1, T2> nullable();

    @Override
    public Iterative2Inline<T1, T2> forceCleanEmpty1();

    @Override
    public Iterative2Inline<T1, T2> forceCleanEmpty2();

    @Override
    public Iterative2Inline<T1, T2> forceCleanEmptyAll();

    @Override
    public <T3> Iterative3Inline<T1, T2, T3> pushBackBy(Iterable<? extends Stream<? extends T3>> var1);

    @Override
    public <T0> Iterative3Inline<T0, T1, T2> pushFrontBy(Iterable<? extends Stream<? extends T0>> var1);

    @Override
    public <T0> Iterative3Inline<T0, T1, T2> pushFrontCrossBy(Iterable<? extends Stream<? extends T0>> var1);

    @Override
    public <T0> Iterative3Inline<T0, T1, T2> pushFrontInlineBy(Iterable<? extends Stream<? extends T0>> var1);

    @Override
    public <R1, R2> Iterative2Inline<R1, R2> map(Fn1<? super T1, ? extends R1> var1, Fn1<? super T2, ? extends R2> var2);

    @Override
    public <R1, R2> Iterative2Inline<R1, R2> inlineMap(Fn1<? super T1, ? extends Iterable<? extends R1>> var1, Fn1<? super T2, ? extends Iterable<? extends R2>> var2);

    @Override
    public Iterative2Inline<T1, T2> filter(Pr1<? super T1> var1, Pr1<? super T2> var2);

    @Override
    default public Iterative2Inline<T1, T2> onSuccess(Rn r) {
        return (Iterative2Inline<T1, T2>) Iterative2.super.onSuccess(r);
    }

    @Override
    default public Iterative2Inline<T1, T2> onFailure(Rn r) {
        return (Iterative2Inline<T1, T2>) Iterative2.super.onFailure(r);
    }

    @Override
    default public Iterative2Inline<T1, T2> execute(Cs1<? super Iterative2<? extends T1, ? extends T2>> c) {
        return (Iterative2Inline<T1, T2>) Iterative2.super.execute(c);
    }

    @Override
    default public Iterative2Inline<T1, T2> onFailure(Cs1<? super Iterative2<? extends T1, ? extends T2>> c) {
        return (Iterative2Inline<T1, T2>) Iterative2.super.onFailure(c);
    }

    @Override
    default public Iterative2Inline<T1, T2> onSuccess(Cs1<? super Iterative2<? extends T1, ? extends T2>> c) {
        return (Iterative2Inline<T1, T2>) Iterative2.super.onSuccess(c);
    }

    @Override
    default public Iterative2Inline<T1, T2> forEach(Cs2<? super T1, ? super T2> c) {
        return (Iterative2Inline<T1, T2>) Iterative2.super.forEach(c);
    }

    @Override
    default public <R> Iterative2Inline<R, T2> map1(Fn1<? super T1, ? extends R> f) {
        return (Iterative2Inline<R, T2>) Iterative2.super.<R>map1(f);
    }

    @Override
    default public <R> Iterative2Inline<T1, R> map2(Fn1<? super T2, ? extends R> f) {
        return (Iterative2Inline<T1, R>) Iterative2.super.<R>map2(f);
    }

    @Override
    default public <R> Iterative2Inline<R, T2> inlineMap1(Fn1<? super T1, ? extends Iterable<? extends R>> f) {
        return (Iterative2Inline<R, T2>) Iterative2.super.<R>inlineMap1(f);
    }

    @Override
    default public <R> Iterative2Inline<T1, R> inlineMap2(Fn1<? super T2, ? extends Iterable<? extends R>> f) {
        return (Iterative2Inline<T1, R>) Iterative2.super.<R>inlineMap2(f);
    }

    @Override
    default public Iterative2Inline<T1, T2> filter1(Pr1<? super T1> p) {
        return (Iterative2Inline<T1, T2>) Iterative2.super.filter1(p);
    }

    @Override
    default public Iterative2Inline<T1, T2> filter2(Pr1<? super T2> p) {
        return (Iterative2Inline<T1, T2>) Iterative2.super.filter2(p);
    }

    @Override
    default public <T3> Iterative3Inline<T1, T2, T3> pushBack(T3 t3) {
        return (Iterative3Inline<T1, T2, T3>) Iterative2.super.<T3>pushBack(t3);
    }

    @Override
    default public <T0> Iterative3Inline<T0, T1, T2> pushFront(T0 t0) {
        return (Iterative3Inline<T0, T1, T2>) Iterative2.super.<T0>pushFront(t0);
    }

    @Override
    default public <T0> Iterative3Inline<T0, T1, T2> pushFrontCross(T0 t0) {
        return (Iterative3Inline<T0, T1, T2>) Iterative2.super.<T0>pushFrontCross(t0);
    }

    @Override
    default public <T0> Iterative3Inline<T0, T1, T2> pushFrontInline(T0 t0) {
        return (Iterative3Inline<T0, T1, T2>) Iterative2.super.<T0>pushFrontInline(t0);
    }

    @Override
    default public <T3> Iterative3Inline<T1, T2, T3> pushBackOf(Iterable<? extends T3> t3) {
        return (Iterative3Inline<T1, T2, T3>) Iterative2.super.<T3>pushBackOf(t3);
    }

    @Override
    default public <T0> Iterative3Inline<T0, T1, T2> pushFrontOf(Iterable<? extends T0> t0) {
        return (Iterative3Inline<T0, T1, T2>) Iterative2.super.<T0>pushFrontOf(t0);
    }

    @Override
    default public <T0> Iterative3Inline<T0, T1, T2> pushFrontCrossOf(Iterable<? extends T0> t0) {
        return (Iterative3Inline<T0, T1, T2>) Iterative2.super.<T0>pushFrontCrossOf(t0);
    }

    @Override
    default public <T0> Iterative3Inline<T0, T1, T2> pushFrontInlineOf(Iterable<? extends T0> t0) {
        return (Iterative3Inline<T0, T1, T2>) Iterative2.super.<T0>pushFrontInlineOf(t0);
    }

    @Override
    default public <B1, B2> Iterative4Inline<T1, T2, B1, B2> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2) {
        return (Iterative4Inline<T1, T2, B1, B2>) Iterative2.super.<B1, B2>pushBackBy(b1, b2);
    }

    @Override
    default public <F1, F2> Iterative4Inline<F1, F2, T1, T2> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return (Iterative4Inline<F1, F2, T1, T2>) Iterative2.super.<F1, F2>pushFrontBy(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative4Inline<F1, F2, T1, T2> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return (Iterative4Inline<F1, F2, T1, T2>) Iterative2.super.<F1, F2>pushFrontCrossBy(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative4Inline<F1, F2, T1, T2> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return (Iterative4Inline<F1, F2, T1, T2>) Iterative2.super.<F1, F2>pushFrontInlineBy(f1, f2);
    }

    @Override
    default public <B1, B2> Iterative4Inline<T1, T2, B1, B2> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2) {
        return (Iterative4Inline<T1, T2, B1, B2>) Iterative2.super.<B1, B2>pushBackOf(b1, b2);
    }

    @Override
    default public <F1, F2> Iterative4Inline<F1, F2, T1, T2> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return (Iterative4Inline<F1, F2, T1, T2>) Iterative2.super.<F1, F2>pushFrontOf(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative4Inline<F1, F2, T1, T2> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return (Iterative4Inline<F1, F2, T1, T2>) Iterative2.super.<F1, F2>pushFrontCrossOf(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative4Inline<F1, F2, T1, T2> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return (Iterative4Inline<F1, F2, T1, T2>) Iterative2.super.<F1, F2>pushFrontInlineOf(f1, f2);
    }

    @Override
    default public <B1, B2> Iterative4Inline<T1, T2, B1, B2> pushBack(B1 b1, B2 b2) {
        return (Iterative4Inline<T1, T2, B1, B2>) Iterative2.super.<B1, B2>pushBack(b1, b2);
    }

    @Override
    default public <F1, F2> Iterative4Inline<F1, F2, T1, T2> pushFront(F1 f1, F2 f2) {
        return (Iterative4Inline<F1, F2, T1, T2>) Iterative2.super.<F1, F2>pushFront(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative4Inline<F1, F2, T1, T2> pushFrontCross(F1 f1, F2 f2) {
        return (Iterative4Inline<F1, F2, T1, T2>) Iterative2.super.<F1, F2>pushFrontCross(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative4Inline<F1, F2, T1, T2> pushFrontInline(F1 f1, F2 f2) {
        return (Iterative4Inline<F1, F2, T1, T2>) Iterative2.super.<F1, F2>pushFrontInline(f1, f2);
    }

    @Override
    default public <B1, B2, B3> Iterative5Inline<T1, T2, B1, B2, B3> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3) {
        return (Iterative5Inline<T1, T2, B1, B2, B3>) Iterative2.super.<B1, B2, B3>pushBackBy(b1, b2, b3);
    }

    @Override
    default public <F1, F2, F3> Iterative5Inline<F1, F2, F3, T1, T2> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3) {
        return (Iterative5Inline<F1, F2, F3, T1, T2>) Iterative2.super.<F1, F2, F3>pushFrontBy(f1, f2, f3);
    }

    @Override
    default public <F1, F2, F3> Iterative5Inline<F1, F2, F3, T1, T2> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3) {
        return (Iterative5Inline<F1, F2, F3, T1, T2>) Iterative2.super.<F1, F2, F3>pushFrontCrossBy(f1, f2, f3);
    }

    @Override
    default public <F1, F2, F3> Iterative5Inline<F1, F2, F3, T1, T2> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3) {
        return (Iterative5Inline<F1, F2, F3, T1, T2>) Iterative2.super.<F1, F2, F3>pushFrontInlineBy(f1, f2, f3);
    }

    @Override
    default public <B1, B2, B3> Iterative5Inline<T1, T2, B1, B2, B3> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3) {
        return (Iterative5Inline<T1, T2, B1, B2, B3>) Iterative2.super.<B1, B2, B3>pushBackOf(b1, b2, b3);
    }

    @Override
    default public <F1, F2, F3> Iterative5Inline<F1, F2, F3, T1, T2> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3) {
        return (Iterative5Inline<F1, F2, F3, T1, T2>) Iterative2.super.<F1, F2, F3>pushFrontOf(f1, f2, f3);
    }

    @Override
    default public <F1, F2, F3> Iterative5Inline<F1, F2, F3, T1, T2> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3) {
        return (Iterative5Inline<F1, F2, F3, T1, T2>) Iterative2.super.<F1, F2, F3>pushFrontCrossOf(f1, f2, f3);
    }

    @Override
    default public <F1, F2, F3> Iterative5Inline<F1, F2, F3, T1, T2> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3) {
        return (Iterative5Inline<F1, F2, F3, T1, T2>) Iterative2.super.<F1, F2, F3>pushFrontInlineOf(f1, f2, f3);
    }

    @Override
    default public <B1, B2, B3> Iterative5Inline<T1, T2, B1, B2, B3> pushBack(B1 b1, B2 b2, B3 b3) {
        return (Iterative5Inline<T1, T2, B1, B2, B3>) Iterative2.super.<B1, B2, B3>pushBack(b1, b2, b3);
    }

    @Override
    default public <F1, F2, F3> Iterative5Inline<F1, F2, F3, T1, T2> pushFront(F1 f1, F2 f2, F3 f3) {
        return (Iterative5Inline<F1, F2, F3, T1, T2>) Iterative2.super.<F1, F2, F3>pushFront(f1, f2, f3);
    }

    @Override
    default public <F1, F2, F3> Iterative5Inline<F1, F2, F3, T1, T2> pushFrontCross(F1 f1, F2 f2, F3 f3) {
        return (Iterative5Inline<F1, F2, F3, T1, T2>) Iterative2.super.<F1, F2, F3>pushFrontCross(f1, f2, f3);
    }

    @Override
    default public <F1, F2, F3> Iterative5Inline<F1, F2, F3, T1, T2> pushFrontInline(F1 f1, F2 f2, F3 f3) {
        return (Iterative5Inline<F1, F2, F3, T1, T2>) Iterative2.super.<F1, F2, F3>pushFrontInline(f1, f2, f3);
    }

    @Override
    default public <B1, B2, B3, B4> Iterative6Inline<T1, T2, B1, B2, B3, B4> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4) {
        return (Iterative6Inline<T1, T2, B1, B2, B3, B4>) Iterative2.super.<B1, B2, B3, B4>pushBackBy(b1, b2, b3, b4);
    }

    @Override
    default public <F1, F2, F3, F4> Iterative6Inline<F1, F2, F3, F4, T1, T2> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4) {
        return (Iterative6Inline<F1, F2, F3, F4, T1, T2>) Iterative2.super.<F1, F2, F3, F4>pushFrontBy(f1, f2, f3, f4);
    }

    @Override
    default public <F1, F2, F3, F4> Iterative6Inline<F1, F2, F3, F4, T1, T2> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4) {
        return (Iterative6Inline<F1, F2, F3, F4, T1, T2>) Iterative2.super.<F1, F2, F3, F4>pushFrontCrossBy(f1, f2, f3, f4);
    }

    @Override
    default public <F1, F2, F3, F4> Iterative6Inline<F1, F2, F3, F4, T1, T2> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4) {
        return (Iterative6Inline<F1, F2, F3, F4, T1, T2>) Iterative2.super.<F1, F2, F3, F4>pushFrontInlineBy(f1, f2, f3, f4);
    }

    @Override
    default public <B1, B2, B3, B4> Iterative6Inline<T1, T2, B1, B2, B3, B4> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4) {
        return (Iterative6Inline<T1, T2, B1, B2, B3, B4>) Iterative2.super.<B1, B2, B3, B4>pushBackOf(b1, b2, b3, b4);
    }

    @Override
    default public <F1, F2, F3, F4> Iterative6Inline<F1, F2, F3, F4, T1, T2> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4) {
        return (Iterative6Inline<F1, F2, F3, F4, T1, T2>) Iterative2.super.<F1, F2, F3, F4>pushFrontOf(f1, f2, f3, f4);
    }

    @Override
    default public <F1, F2, F3, F4> Iterative6Inline<F1, F2, F3, F4, T1, T2> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4) {
        return (Iterative6Inline<F1, F2, F3, F4, T1, T2>) Iterative2.super.<F1, F2, F3, F4>pushFrontCrossOf(f1, f2, f3, f4);
    }

    @Override
    default public <F1, F2, F3, F4> Iterative6Inline<F1, F2, F3, F4, T1, T2> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4) {
        return (Iterative6Inline<F1, F2, F3, F4, T1, T2>) Iterative2.super.<F1, F2, F3, F4>pushFrontInlineOf(f1, f2, f3, f4);
    }

    @Override
    default public <B1, B2, B3, B4> Iterative6Inline<T1, T2, B1, B2, B3, B4> pushBack(B1 b1, B2 b2, B3 b3, B4 b4) {
        return (Iterative6Inline<T1, T2, B1, B2, B3, B4>) Iterative2.super.<B1, B2, B3, B4>pushBack(b1, b2, b3, b4);
    }

    @Override
    default public <F1, F2, F3, F4> Iterative6Inline<F1, F2, F3, F4, T1, T2> pushFront(F1 f1, F2 f2, F3 f3, F4 f4) {
        return (Iterative6Inline<F1, F2, F3, F4, T1, T2>) Iterative2.super.<F1, F2, F3, F4>pushFront(f1, f2, f3, f4);
    }

    @Override
    default public <F1, F2, F3, F4> Iterative6Inline<F1, F2, F3, F4, T1, T2> pushFrontCross(F1 f1, F2 f2, F3 f3, F4 f4) {
        return (Iterative6Inline<F1, F2, F3, F4, T1, T2>) Iterative2.super.<F1, F2, F3, F4>pushFrontCross(f1, f2, f3, f4);
    }

    @Override
    default public <F1, F2, F3, F4> Iterative6Inline<F1, F2, F3, F4, T1, T2> pushFrontInline(F1 f1, F2 f2, F3 f3, F4 f4) {
        return (Iterative6Inline<F1, F2, F3, F4, T1, T2>) Iterative2.super.<F1, F2, F3, F4>pushFrontInline(f1, f2, f3, f4);
    }

    @Override
    default public <B1, B2, B3, B4, B5> Iterative7Inline<T1, T2, B1, B2, B3, B4, B5> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4, Iterable<? extends Stream<? extends B5>> b5) {
        return (Iterative7Inline<T1, T2, B1, B2, B3, B4, B5>) Iterative2.super.<B1, B2, B3, B4, B5>pushBackBy(b1, b2, b3, b4, b5);
    }

    @Override
    default public <F1, F2, F3, F4, F5> Iterative7Inline<F1, F2, F3, F4, F5, T1, T2> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5) {
        return (Iterative7Inline<F1, F2, F3, F4, F5, T1, T2>) Iterative2.super.<F1, F2, F3, F4, F5>pushFrontBy(f1, f2, f3, f4, f5);
    }

    @Override
    default public <F1, F2, F3, F4, F5> Iterative7Inline<F1, F2, F3, F4, F5, T1, T2> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5) {
        return (Iterative7Inline<F1, F2, F3, F4, F5, T1, T2>) Iterative2.super.<F1, F2, F3, F4, F5>pushFrontCrossBy(f1, f2, f3, f4, f5);
    }

    @Override
    default public <F1, F2, F3, F4, F5> Iterative7Inline<F1, F2, F3, F4, F5, T1, T2> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5) {
        return (Iterative7Inline<F1, F2, F3, F4, F5, T1, T2>) Iterative2.super.<F1, F2, F3, F4, F5>pushFrontInlineBy(f1, f2, f3, f4, f5);
    }

    @Override
    default public <B1, B2, B3, B4, B5> Iterative7Inline<T1, T2, B1, B2, B3, B4, B5> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4, Iterable<? extends B5> b5) {
        return (Iterative7Inline<T1, T2, B1, B2, B3, B4, B5>) Iterative2.super.<B1, B2, B3, B4, B5>pushBackOf(b1, b2, b3, b4, b5);
    }

    @Override
    default public <F1, F2, F3, F4, F5> Iterative7Inline<F1, F2, F3, F4, F5, T1, T2> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5) {
        return (Iterative7Inline<F1, F2, F3, F4, F5, T1, T2>) Iterative2.super.<F1, F2, F3, F4, F5>pushFrontOf(f1, f2, f3, f4, f5);
    }

    @Override
    default public <F1, F2, F3, F4, F5> Iterative7Inline<F1, F2, F3, F4, F5, T1, T2> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5) {
        return (Iterative7Inline<F1, F2, F3, F4, F5, T1, T2>) Iterative2.super.<F1, F2, F3, F4, F5>pushFrontCrossOf(f1, f2, f3, f4, f5);
    }

    @Override
    default public <F1, F2, F3, F4, F5> Iterative7Inline<F1, F2, F3, F4, F5, T1, T2> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5) {
        return (Iterative7Inline<F1, F2, F3, F4, F5, T1, T2>) Iterative2.super.<F1, F2, F3, F4, F5>pushFrontInlineOf(f1, f2, f3, f4, f5);
    }

    @Override
    default public <B1, B2, B3, B4, B5> Iterative7Inline<T1, T2, B1, B2, B3, B4, B5> pushBack(B1 b1, B2 b2, B3 b3, B4 b4, B5 b5) {
        return (Iterative7Inline<T1, T2, B1, B2, B3, B4, B5>) Iterative2.super.<B1, B2, B3, B4, B5>pushBack(b1, b2, b3, b4, b5);
    }

    @Override
    default public <F1, F2, F3, F4, F5> Iterative7Inline<F1, F2, F3, F4, F5, T1, T2> pushFront(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5) {
        return (Iterative7Inline<F1, F2, F3, F4, F5, T1, T2>) Iterative2.super.<F1, F2, F3, F4, F5>pushFront(f1, f2, f3, f4, f5);
    }

    @Override
    default public <F1, F2, F3, F4, F5> Iterative7Inline<F1, F2, F3, F4, F5, T1, T2> pushFrontCross(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5) {
        return (Iterative7Inline<F1, F2, F3, F4, F5, T1, T2>) Iterative2.super.<F1, F2, F3, F4, F5>pushFrontCross(f1, f2, f3, f4, f5);
    }

    @Override
    default public <F1, F2, F3, F4, F5> Iterative7Inline<F1, F2, F3, F4, F5, T1, T2> pushFrontInline(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5) {
        return (Iterative7Inline<F1, F2, F3, F4, F5, T1, T2>) Iterative2.super.<F1, F2, F3, F4, F5>pushFrontInline(f1, f2, f3, f4, f5);
    }

    @Override
    default public <B1, B2, B3, B4, B5, B6> Iterative8Inline<T1, T2, B1, B2, B3, B4, B5, B6> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4, Iterable<? extends Stream<? extends B5>> b5, Iterable<? extends Stream<? extends B6>> b6) {
        return (Iterative8Inline<T1, T2, B1, B2, B3, B4, B5, B6>) Iterative2.super.<B1, B2, B3, B4, B5, B6>pushBackBy(b1, b2, b3, b4, b5, b6);
    }

    @Override
    default public <F1, F2, F3, F4, F5, F6> Iterative8Inline<F1, F2, F3, F4, F5, F6, T1, T2> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5, Iterable<? extends Stream<? extends F6>> f6) {
        return (Iterative8Inline<F1, F2, F3, F4, F5, F6, T1, T2>) Iterative2.super.<F1, F2, F3, F4, F5, F6>pushFrontBy(f1, f2, f3, f4, f5, f6);
    }

    @Override
    default public <F1, F2, F3, F4, F5, F6> Iterative8Inline<F1, F2, F3, F4, F5, F6, T1, T2> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5, Iterable<? extends Stream<? extends F6>> f6) {
        return (Iterative8Inline<F1, F2, F3, F4, F5, F6, T1, T2>) Iterative2.super.<F1, F2, F3, F4, F5, F6>pushFrontCrossBy(f1, f2, f3, f4, f5, f6);
    }

    @Override
    default public <F1, F2, F3, F4, F5, F6> Iterative8Inline<F1, F2, F3, F4, F5, F6, T1, T2> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5, Iterable<? extends Stream<? extends F6>> f6) {
        return (Iterative8Inline<F1, F2, F3, F4, F5, F6, T1, T2>) Iterative2.super.<F1, F2, F3, F4, F5, F6>pushFrontInlineBy(f1, f2, f3, f4, f5, f6);
    }

    @Override
    default public <B1, B2, B3, B4, B5, B6> Iterative8Inline<T1, T2, B1, B2, B3, B4, B5, B6> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4, Iterable<? extends B5> b5, Iterable<? extends B6> b6) {
        return (Iterative8Inline<T1, T2, B1, B2, B3, B4, B5, B6>) Iterative2.super.<B1, B2, B3, B4, B5, B6>pushBackOf(b1, b2, b3, b4, b5, b6);
    }

    @Override
    default public <F1, F2, F3, F4, F5, F6> Iterative8Inline<F1, F2, F3, F4, F5, F6, T1, T2> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5, Iterable<? extends F6> f6) {
        return (Iterative8Inline<F1, F2, F3, F4, F5, F6, T1, T2>) Iterative2.super.<F1, F2, F3, F4, F5, F6>pushFrontOf(f1, f2, f3, f4, f5, f6);
    }

    @Override
    default public <F1, F2, F3, F4, F5, F6> Iterative8Inline<F1, F2, F3, F4, F5, F6, T1, T2> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5, Iterable<? extends F6> f6) {
        return (Iterative8Inline<F1, F2, F3, F4, F5, F6, T1, T2>) Iterative2.super.<F1, F2, F3, F4, F5, F6>pushFrontCrossOf(f1, f2, f3, f4, f5, f6);
    }

    @Override
    default public <F1, F2, F3, F4, F5, F6> Iterative8Inline<F1, F2, F3, F4, F5, F6, T1, T2> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5, Iterable<? extends F6> f6) {
        return (Iterative8Inline<F1, F2, F3, F4, F5, F6, T1, T2>) Iterative2.super.<F1, F2, F3, F4, F5, F6>pushFrontInlineOf(f1, f2, f3, f4, f5, f6);
    }

    @Override
    default public <B1, B2, B3, B4, B5, B6> Iterative8Inline<T1, T2, B1, B2, B3, B4, B5, B6> pushBack(B1 b1, B2 b2, B3 b3, B4 b4, B5 b5, B6 b6) {
        return (Iterative8Inline<T1, T2, B1, B2, B3, B4, B5, B6>) Iterative2.super.<B1, B2, B3, B4, B5, B6>pushBack(b1, b2, b3, b4, b5, b6);
    }

    @Override
    default public <F1, F2, F3, F4, F5, F6> Iterative8Inline<F1, F2, F3, F4, F5, F6, T1, T2> pushFront(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5, F6 f6) {
        return (Iterative8Inline<F1, F2, F3, F4, F5, F6, T1, T2>) Iterative2.super.<F1, F2, F3, F4, F5, F6>pushFront(f1, f2, f3, f4, f5, f6);
    }

    @Override
    default public <F1, F2, F3, F4, F5, F6> Iterative8Inline<F1, F2, F3, F4, F5, F6, T1, T2> pushFrontCross(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5, F6 f6) {
        return (Iterative8Inline<F1, F2, F3, F4, F5, F6, T1, T2>) Iterative2.super.<F1, F2, F3, F4, F5, F6>pushFrontCross(f1, f2, f3, f4, f5, f6);
    }

    @Override
    default public <F1, F2, F3, F4, F5, F6> Iterative8Inline<F1, F2, F3, F4, F5, F6, T1, T2> pushFrontInline(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5, F6 f6) {
        return (Iterative8Inline<F1, F2, F3, F4, F5, F6, T1, T2>) Iterative2.super.<F1, F2, F3, F4, F5, F6>pushFrontInline(f1, f2, f3, f4, f5, f6);
    }

    public static class Iterative2InlineNonNullable<T1, T2> extends Iterative2InlineAbstract<T1, T2> implements Iterative2Inline<T1, T2>, IterativeWrapper.IterativeWrapperNonNullable, IterativeWrapper.IterativeInline {

        Iterative2InlineNonNullable(Iterative1<? extends T1> iterative, Iterable<? extends T2> right) {
            super(iterative, right);
        }

        Iterative2InlineNonNullable(Iterative1<? extends T1> iterative, Iterable<? extends Stream<? extends T2>> right, boolean ign) {
            super(iterative, right, ign);
        }

    }

    public static class Iterative2InlineNullable<T1, T2> extends Iterative2InlineAbstract<T1, T2> implements Iterative2Inline<T1, T2>, IterativeWrapper.IterativeWrapperNullable, IterativeWrapper.IterativeInline {

        Iterative2InlineNullable(Iterative1<? extends T1> iterative, Iterable<? extends T2> right) {
            super(iterative, right);
        }

        Iterative2InlineNullable(Iterative1<? extends T1> iterative, Iterable<? extends Stream<? extends T2>> right, boolean ign) {
            super(iterative, right, ign);
        }

    }

    public static abstract class Iterative2InlineAbstract<T1, T2> extends Iterative2.Iterative2Abstract<T1, T2> implements Iterative2Inline<T1, T2> {

        Iterative2InlineAbstract(Iterative1<? extends T1> iterative, Iterable<? extends T2> right) {
            super(iterative, right);
        }

        Iterative2InlineAbstract(Iterative1<? extends T1> iterative, Iterable<? extends Stream<? extends T2>> right, boolean ign) {
            super(iterative, right, ign);
        }

        @Override
        public Stream<Tuple2<Iterable<T1>, Iterable<T2>>> toTupleStream() {
            return new ZipIterator<>(this.iterative.toTupleStream().iterator(), IterativeHandler.transform(this.right).iterator(), (tuple, right) -> Tuple.of(tuple._1(), right)).toStream();
        }

        @Override
        public Iterative2Inline<T1, T2> nonNullable() {
            return (Iterative2Inline<T1, T2>) super.nonNullable();
        }

        @Override
        public Iterative2Inline<T1, T2> nullable() {
            return (Iterative2Inline<T1, T2>) super.nullable();
        }

        @Override
        public Iterative2Inline<T1, T2> forceCleanEmpty1() {
            return (Iterative2Inline<T1, T2>) super.forceCleanEmpty1();
        }

        @Override
        public Iterative2Inline<T1, T2> forceCleanEmpty2() {
            return (Iterative2Inline<T1, T2>) super.forceCleanEmpty2();
        }

        @Override
        public Iterative2Inline<T1, T2> forceCleanEmptyAll() {
            return (Iterative2Inline<T1, T2>) super.forceCleanEmptyAll();
        }

        @Override
        public <T3> Iterative3Inline<T1, T2, T3> pushBackBy(Iterable<? extends Stream<? extends T3>> t3) {
            return (Iterative3Inline<T1, T2, T3>) super.<T3>pushBackBy(t3);
        }

        @Override
        public <T0> Iterative3Inline<T0, T1, T2> pushFrontBy(Iterable<? extends Stream<? extends T0>> t0) {
            return (Iterative3Inline<T0, T1, T2>) super.<T0>pushFrontBy(t0);
        }

        @Override
        public <T0> Iterative3Inline<T0, T1, T2> pushFrontCrossBy(Iterable<? extends Stream<? extends T0>> t0) {
            return (Iterative3Inline<T0, T1, T2>) super.<T0>pushFrontCrossBy(t0);
        }

        @Override
        public <T0> Iterative3Inline<T0, T1, T2> pushFrontInlineBy(Iterable<? extends Stream<? extends T0>> t0) {
            return (Iterative3Inline<T0, T1, T2>) super.<T0>pushFrontInlineBy(t0);
        }

        @Override
        public <R1, R2> Iterative2Inline<R1, R2> map(Fn1<? super T1, ? extends R1> f1, Fn1<? super T2, ? extends R2> f2) {
            return (Iterative2Inline<R1, R2>) super.<R1, R2>map(f1, f2);
        }

        @Override
        public <R1, R2> Iterative2Inline<R1, R2> inlineMap(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2) {
            return (Iterative2Inline<R1, R2>) super.<R1, R2>inlineMap(f1, f2);
        }

        @Override
        public Iterative2Inline<T1, T2> filter(Pr1<? super T1> p1, Pr1<? super T2> p2) {
            return (Iterative2Inline<T1, T2>) super.filter(p1, p2);
        }

    }

}

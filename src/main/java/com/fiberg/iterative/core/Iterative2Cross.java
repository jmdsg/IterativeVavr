package com.fiberg.iterative.core;

import com.fiberg.iterative.core.Iterative1;
import com.fiberg.iterative.core.Iterative2;
import com.fiberg.iterative.core.Iterative3Cross;
import com.fiberg.iterative.core.Iterative4Cross;
import com.fiberg.iterative.core.Iterative5Cross;
import com.fiberg.iterative.core.Iterative6Cross;
import com.fiberg.iterative.core.Iterative7Cross;
import com.fiberg.iterative.core.Iterative8Cross;
import com.fiberg.iterative.core.IterativeHandler;
import com.fiberg.iterative.core.IterativeWrapper;
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

public interface Iterative2Cross<T1, T2> extends Iterative2<T1, T2> {

    @Override
    public Iterative2Cross<T1, T2> nonNullable();

    @Override
    public Iterative2Cross<T1, T2> nullable();

    @Override
    public Iterative2Cross<T1, T2> forceCleanEmpty1();

    @Override
    public Iterative2Cross<T1, T2> forceCleanEmpty2();

    @Override
    public Iterative2Cross<T1, T2> forceCleanEmptyAll();

    @Override
    public <T3> Iterative3Cross<T1, T2, T3> pushBackBy(Iterable<? extends Stream<? extends T3>> var1);

    @Override
    public <T0> Iterative3Cross<T0, T1, T2> pushFrontBy(Iterable<? extends Stream<? extends T0>> var1);

    @Override
    public <T0> Iterative3Cross<T0, T1, T2> pushFrontCrossBy(Iterable<? extends Stream<? extends T0>> var1);

    @Override
    public <T0> Iterative3Cross<T0, T1, T2> pushFrontInlineBy(Iterable<? extends Stream<? extends T0>> var1);

    @Override
    public <R1, R2> Iterative2Cross<R1, R2> map(Fn1<? super T1, ? extends R1> var1, Fn1<? super T2, ? extends R2> var2);

    @Override
    public <R1, R2> Iterative2Cross<R1, R2> inlineMap(Fn1<? super T1, ? extends Iterable<? extends R1>> var1, Fn1<? super T2, ? extends Iterable<? extends R2>> var2);

    @Override
    public Iterative2Cross<T1, T2> filter(Pr1<? super T1> var1, Pr1<? super T2> var2);

    @Override
    default public Iterative2Cross<T1, T2> onSuccess(Rn r) {
        return (Iterative2Cross) Iterative2.super.onSuccess(r);
    }

    @Override
    default public Iterative2Cross<T1, T2> onFailure(Rn r) {
        return (Iterative2Cross) Iterative2.super.onFailure(r);
    }

    @Override
    default public Iterative2Cross<T1, T2> execute(Cs1<? super Iterative2<? extends T1, ? extends T2>> c) {
        return (Iterative2Cross) Iterative2.super.execute(c);
    }

    @Override
    default public Iterative2Cross<T1, T2> onFailure(Cs1<? super Iterative2<? extends T1, ? extends T2>> c) {
        return (Iterative2Cross) Iterative2.super.onFailure(c);
    }

    @Override
    default public Iterative2Cross<T1, T2> onSuccess(Cs1<? super Iterative2<? extends T1, ? extends T2>> c) {
        return (Iterative2Cross) Iterative2.super.onSuccess(c);
    }

    @Override
    default public Iterative2Cross<T1, T2> forEach(Cs2<? super T1, ? super T2> c) {
        return (Iterative2Cross) Iterative2.super.forEach(c);
    }

    @Override
    default public <R> Iterative2Cross<R, T2> map1(Fn1<? super T1, ? extends R> f) {
        return (Iterative2Cross) Iterative2.super.map1(f);
    }

    @Override
    default public <R> Iterative2Cross<T1, R> map2(Fn1<? super T2, ? extends R> f) {
        return (Iterative2Cross) Iterative2.super.map2(f);
    }

    @Override
    default public <R> Iterative2Cross<R, T2> inlineMap1(Fn1<? super T1, ? extends Iterable<? extends R>> f) {
        return (Iterative2Cross) Iterative2.super.inlineMap1(f);
    }

    @Override
    default public <R> Iterative2Cross<T1, R> inlineMap2(Fn1<? super T2, ? extends Iterable<? extends R>> f) {
        return (Iterative2Cross) Iterative2.super.inlineMap2(f);
    }

    @Override
    default public Iterative2Cross<T1, T2> filter1(Pr1<? super T1> p) {
        return (Iterative2Cross) Iterative2.super.filter1(p);
    }

    @Override
    default public Iterative2Cross<T1, T2> filter2(Pr1<? super T2> p) {
        return (Iterative2Cross) Iterative2.super.filter2(p);
    }

    @Override
    default public <T3> Iterative3Cross<T1, T2, T3> pushBack(T3 t3) {
        return (Iterative3Cross) Iterative2.super.pushBack(t3);
    }

    @Override
    default public <T0> Iterative3Cross<T0, T1, T2> pushFront(T0 t0) {
        return (Iterative3Cross) Iterative2.super.pushFront(t0);
    }

    @Override
    default public <T0> Iterative3Cross<T0, T1, T2> pushFrontCross(T0 t0) {
        return (Iterative3Cross) Iterative2.super.pushFrontCross(t0);
    }

    @Override
    default public <T0> Iterative3Cross<T0, T1, T2> pushFrontInline(T0 t0) {
        return (Iterative3Cross) Iterative2.super.pushFrontInline(t0);
    }

    @Override
    default public <T3> Iterative3Cross<T1, T2, T3> pushBackOf(Iterable<? extends T3> t3) {
        return (Iterative3Cross) Iterative2.super.pushBackOf(t3);
    }

    @Override
    default public <T0> Iterative3Cross<T0, T1, T2> pushFrontOf(Iterable<? extends T0> t0) {
        return (Iterative3Cross) Iterative2.super.pushFrontOf(t0);
    }

    @Override
    default public <T0> Iterative3Cross<T0, T1, T2> pushFrontCrossOf(Iterable<? extends T0> t0) {
        return (Iterative3Cross) Iterative2.super.pushFrontCrossOf(t0);
    }

    @Override
    default public <T0> Iterative3Cross<T0, T1, T2> pushFrontInlineOf(Iterable<? extends T0> t0) {
        return (Iterative3Cross) Iterative2.super.pushFrontInlineOf(t0);
    }

    @Override
    default public <B1, B2> Iterative4Cross<T1, T2, B1, B2> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2) {
        return (Iterative4Cross) Iterative2.super.pushBackBy(b1, b2);
    }

    @Override
    default public <F1, F2> Iterative4Cross<F1, F2, T1, T2> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return (Iterative4Cross) Iterative2.super.pushFrontBy(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative4Cross<F1, F2, T1, T2> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return (Iterative4Cross) Iterative2.super.pushFrontCrossBy(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative4Cross<F1, F2, T1, T2> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return (Iterative4Cross) Iterative2.super.pushFrontInlineBy(f1, f2);
    }

    @Override
    default public <B1, B2> Iterative4Cross<T1, T2, B1, B2> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2) {
        return (Iterative4Cross) Iterative2.super.pushBackOf(b1, b2);
    }

    @Override
    default public <F1, F2> Iterative4Cross<F1, F2, T1, T2> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return (Iterative4Cross) Iterative2.super.pushFrontOf(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative4Cross<F1, F2, T1, T2> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return (Iterative4Cross) Iterative2.super.pushFrontCrossOf(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative4Cross<F1, F2, T1, T2> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return (Iterative4Cross) Iterative2.super.pushFrontInlineOf(f1, f2);
    }

    @Override
    default public <B1, B2> Iterative4Cross<T1, T2, B1, B2> pushBack(B1 b1, B2 b2) {
        return (Iterative4Cross) Iterative2.super.pushBack(b1, b2);
    }

    @Override
    default public <F1, F2> Iterative4Cross<F1, F2, T1, T2> pushFront(F1 f1, F2 f2) {
        return (Iterative4Cross) Iterative2.super.pushFront(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative4Cross<F1, F2, T1, T2> pushFrontCross(F1 f1, F2 f2) {
        return (Iterative4Cross) Iterative2.super.pushFrontCross(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative4Cross<F1, F2, T1, T2> pushFrontInline(F1 f1, F2 f2) {
        return (Iterative4Cross) Iterative2.super.pushFrontInline(f1, f2);
    }

    @Override
    default public <B1, B2, B3> Iterative5Cross<T1, T2, B1, B2, B3> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3) {
        return (Iterative5Cross) ((Object) Iterative2.super.pushBackBy(b1, b2));
    }

    @Override
    default public <F1, F2, F3> Iterative5Cross<F1, F2, F3, T1, T2> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3) {
        return (Iterative5Cross) Iterative2.super.pushFrontBy(f1, f2, f3);
    }

    @Override
    default public <F1, F2, F3> Iterative5Cross<F1, F2, F3, T1, T2> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3) {
        return (Iterative5Cross) Iterative2.super.pushFrontCrossBy(f1, f2, f3);
    }

    @Override
    default public <F1, F2, F3> Iterative5Cross<F1, F2, F3, T1, T2> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3) {
        return (Iterative5Cross) Iterative2.super.pushFrontInlineBy(f1, f2, f3);
    }

    @Override
    default public <B1, B2, B3> Iterative5Cross<T1, T2, B1, B2, B3> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3) {
        return (Iterative5Cross) Iterative2.super.pushBackOf(b1, b2, b3);
    }

    @Override
    default public <F1, F2, F3> Iterative5Cross<F1, F2, F3, T1, T2> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3) {
        return (Iterative5Cross) Iterative2.super.pushFrontOf(f1, f2, f3);
    }

    @Override
    default public <F1, F2, F3> Iterative5Cross<F1, F2, F3, T1, T2> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3) {
        return (Iterative5Cross) Iterative2.super.pushFrontCrossOf(f1, f2, f3);
    }

    @Override
    default public <F1, F2, F3> Iterative5Cross<F1, F2, F3, T1, T2> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3) {
        return (Iterative5Cross) Iterative2.super.pushFrontInlineOf(f1, f2, f3);
    }

    @Override
    default public <B1, B2, B3> Iterative5Cross<T1, T2, B1, B2, B3> pushBack(B1 b1, B2 b2, B3 b3) {
        return (Iterative5Cross) Iterative2.super.pushBack(b1, b2, b3);
    }

    @Override
    default public <F1, F2, F3> Iterative5Cross<F1, F2, F3, T1, T2> pushFront(F1 f1, F2 f2, F3 f3) {
        return (Iterative5Cross) Iterative2.super.pushFront(f1, f2, f3);
    }

    @Override
    default public <F1, F2, F3> Iterative5Cross<F1, F2, F3, T1, T2> pushFrontCross(F1 f1, F2 f2, F3 f3) {
        return (Iterative5Cross) Iterative2.super.pushFrontCross(f1, f2, f3);
    }

    @Override
    default public <F1, F2, F3> Iterative5Cross<F1, F2, F3, T1, T2> pushFrontInline(F1 f1, F2 f2, F3 f3) {
        return (Iterative5Cross) Iterative2.super.pushFrontInline(f1, f2, f3);
    }

    @Override
    default public <B1, B2, B3, B4> Iterative6Cross<T1, T2, B1, B2, B3, B4> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4) {
        return (Iterative6Cross) ((Object) Iterative2.super.pushBackBy(b1, b2, b3));
    }

    @Override
    default public <F1, F2, F3, F4> Iterative6Cross<F1, F2, F3, F4, T1, T2> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4) {
        return (Iterative6Cross) ((Object) Iterative2.super.pushFrontBy(f1, f2, f3));
    }

    @Override
    default public <F1, F2, F3, F4> Iterative6Cross<F1, F2, F3, F4, T1, T2> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4) {
        return (Iterative6Cross) ((Object) Iterative2.super.pushFrontCrossBy(f1, f2, f3));
    }

    @Override
    default public <F1, F2, F3, F4> Iterative6Cross<F1, F2, F3, F4, T1, T2> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4) {
        return (Iterative6Cross) Iterative2.super.pushFrontInlineBy(f1, f2, f3, f4);
    }

    @Override
    default public <B1, B2, B3, B4> Iterative6Cross<T1, T2, B1, B2, B3, B4> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4) {
        return (Iterative6Cross) Iterative2.super.pushBackOf(b1, b2, b3, b4);
    }

    @Override
    default public <F1, F2, F3, F4> Iterative6Cross<F1, F2, F3, F4, T1, T2> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4) {
        return (Iterative6Cross) Iterative2.super.pushFrontOf(f1, f2, f3, f4);
    }

    @Override
    default public <F1, F2, F3, F4> Iterative6Cross<F1, F2, F3, F4, T1, T2> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4) {
        return (Iterative6Cross) Iterative2.super.pushFrontCrossOf(f1, f2, f3, f4);
    }

    @Override
    default public <F1, F2, F3, F4> Iterative6Cross<F1, F2, F3, F4, T1, T2> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4) {
        return (Iterative6Cross) Iterative2.super.pushFrontInlineOf(f1, f2, f3, f4);
    }

    @Override
    default public <B1, B2, B3, B4> Iterative6Cross<T1, T2, B1, B2, B3, B4> pushBack(B1 b1, B2 b2, B3 b3, B4 b4) {
        return (Iterative6Cross) Iterative2.super.pushBack(b1, b2, b3, b4);
    }

    @Override
    default public <F1, F2, F3, F4> Iterative6Cross<F1, F2, F3, F4, T1, T2> pushFront(F1 f1, F2 f2, F3 f3, F4 f4) {
        return (Iterative6Cross) Iterative2.super.pushFront(f1, f2, f3, f4);
    }

    @Override
    default public <F1, F2, F3, F4> Iterative6Cross<F1, F2, F3, F4, T1, T2> pushFrontCross(F1 f1, F2 f2, F3 f3, F4 f4) {
        return (Iterative6Cross) Iterative2.super.pushFrontCross(f1, f2, f3, f4);
    }

    @Override
    default public <F1, F2, F3, F4> Iterative6Cross<F1, F2, F3, F4, T1, T2> pushFrontInline(F1 f1, F2 f2, F3 f3, F4 f4) {
        return (Iterative6Cross) Iterative2.super.pushFrontInline(f1, f2, f3, f4);
    }

    @Override
    default public <B1, B2, B3, B4, B5> Iterative7Cross<T1, T2, B1, B2, B3, B4, B5> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4, Iterable<? extends Stream<? extends B5>> b5) {
        return (Iterative7Cross) Iterative2.super.pushBackBy(b1, b2, b3, b4, b5);
    }

    @Override
    default public <F1, F2, F3, F4, F5> Iterative7Cross<F1, F2, F3, F4, F5, T1, T2> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5) {
        return (Iterative7Cross) Iterative2.super.pushFrontBy(f1, f2, f3, f4, f5);
    }

    @Override
    default public <F1, F2, F3, F4, F5> Iterative7Cross<F1, F2, F3, F4, F5, T1, T2> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5) {
        return (Iterative7Cross) Iterative2.super.pushFrontCrossBy(f1, f2, f3, f4, f5);
    }

    @Override
    default public <F1, F2, F3, F4, F5> Iterative7Cross<F1, F2, F3, F4, F5, T1, T2> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5) {
        return (Iterative7Cross) Iterative2.super.pushFrontInlineBy(f1, f2, f3, f4, f5);
    }

    @Override
    default public <B1, B2, B3, B4, B5> Iterative7Cross<T1, T2, B1, B2, B3, B4, B5> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4, Iterable<? extends B5> b5) {
        return (Iterative7Cross) Iterative2.super.pushBackOf(b1, b2, b3, b4, b5);
    }

    @Override
    default public <F1, F2, F3, F4, F5> Iterative7Cross<F1, F2, F3, F4, F5, T1, T2> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5) {
        return (Iterative7Cross) Iterative2.super.pushFrontOf(f1, f2, f3, f4, f5);
    }

    @Override
    default public <F1, F2, F3, F4, F5> Iterative7Cross<F1, F2, F3, F4, F5, T1, T2> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5) {
        return (Iterative7Cross) Iterative2.super.pushFrontCrossOf(f1, f2, f3, f4, f5);
    }

    @Override
    default public <F1, F2, F3, F4, F5> Iterative7Cross<F1, F2, F3, F4, F5, T1, T2> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5) {
        return (Iterative7Cross) Iterative2.super.pushFrontInlineOf(f1, f2, f3, f4, f5);
    }

    @Override
    default public <B1, B2, B3, B4, B5> Iterative7Cross<T1, T2, B1, B2, B3, B4, B5> pushBack(B1 b1, B2 b2, B3 b3, B4 b4, B5 b5) {
        return (Iterative7Cross) Iterative2.super.pushBack(b1, b2, b3, b4, b5);
    }

    @Override
    default public <F1, F2, F3, F4, F5> Iterative7Cross<F1, F2, F3, F4, F5, T1, T2> pushFront(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5) {
        return (Iterative7Cross) Iterative2.super.pushFront(f1, f2, f3, f4, f5);
    }

    @Override
    default public <F1, F2, F3, F4, F5> Iterative7Cross<F1, F2, F3, F4, F5, T1, T2> pushFrontCross(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5) {
        return (Iterative7Cross) Iterative2.super.pushFrontCross(f1, f2, f3, f4, f5);
    }

    @Override
    default public <F1, F2, F3, F4, F5> Iterative7Cross<F1, F2, F3, F4, F5, T1, T2> pushFrontInline(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5) {
        return (Iterative7Cross) Iterative2.super.pushFrontInline(f1, f2, f3, f4, f5);
    }

    @Override
    default public <B1, B2, B3, B4, B5, B6> Iterative8Cross<T1, T2, B1, B2, B3, B4, B5, B6> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4, Iterable<? extends Stream<? extends B5>> b5, Iterable<? extends Stream<? extends B6>> b6) {
        return (Iterative8Cross) Iterative2.super.pushBackBy(b1, b2, b3, b4, b5, b6);
    }

    @Override
    default public <F1, F2, F3, F4, F5, F6> Iterative8Cross<F1, F2, F3, F4, F5, F6, T1, T2> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5, Iterable<? extends Stream<? extends F6>> f6) {
        return (Iterative8Cross) Iterative2.super.pushFrontBy(f1, f2, f3, f4, f5, f6);
    }

    @Override
    default public <F1, F2, F3, F4, F5, F6> Iterative8Cross<F1, F2, F3, F4, F5, F6, T1, T2> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5, Iterable<? extends Stream<? extends F6>> f6) {
        return (Iterative8Cross) Iterative2.super.pushFrontCrossBy(f1, f2, f3, f4, f5, f6);
    }

    @Override
    default public <F1, F2, F3, F4, F5, F6> Iterative8Cross<F1, F2, F3, F4, F5, F6, T1, T2> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5, Iterable<? extends Stream<? extends F6>> f6) {
        return (Iterative8Cross) Iterative2.super.pushFrontInlineBy(f1, f2, f3, f4, f5, f6);
    }

    @Override
    default public <B1, B2, B3, B4, B5, B6> Iterative8Cross<T1, T2, B1, B2, B3, B4, B5, B6> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4, Iterable<? extends B5> b5, Iterable<? extends B6> b6) {
        return (Iterative8Cross) Iterative2.super.pushBackOf(b1, b2, b3, b4, b5, b6);
    }

    @Override
    default public <F1, F2, F3, F4, F5, F6> Iterative8Cross<F1, F2, F3, F4, F5, F6, T1, T2> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5, Iterable<? extends F6> f6) {
        return (Iterative8Cross) Iterative2.super.pushFrontOf(f1, f2, f3, f4, f5, f6);
    }

    @Override
    default public <F1, F2, F3, F4, F5, F6> Iterative8Cross<F1, F2, F3, F4, F5, F6, T1, T2> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5, Iterable<? extends F6> f6) {
        return (Iterative8Cross) Iterative2.super.pushFrontCrossOf(f1, f2, f3, f4, f5, f6);
    }

    @Override
    default public <F1, F2, F3, F4, F5, F6> Iterative8Cross<F1, F2, F3, F4, F5, F6, T1, T2> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5, Iterable<? extends F6> f6) {
        return (Iterative8Cross) Iterative2.super.pushFrontInlineOf(f1, f2, f3, f4, f5, f6);
    }

    @Override
    default public <B1, B2, B3, B4, B5, B6> Iterative8Cross<T1, T2, B1, B2, B3, B4, B5, B6> pushBack(B1 b1, B2 b2, B3 b3, B4 b4, B5 b5, B6 b6) {
        return (Iterative8Cross) Iterative2.super.pushBack(b1, b2, b3, b4, b5, b6);
    }

    @Override
    default public <F1, F2, F3, F4, F5, F6> Iterative8Cross<F1, F2, F3, F4, F5, F6, T1, T2> pushFront(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5, F6 f6) {
        return (Iterative8Cross) Iterative2.super.pushFront(f1, f2, f3, f4, f5, f6);
    }

    @Override
    default public <F1, F2, F3, F4, F5, F6> Iterative8Cross<F1, F2, F3, F4, F5, F6, T1, T2> pushFrontCross(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5, F6 f6) {
        return (Iterative8Cross) Iterative2.super.pushFrontCross(f1, f2, f3, f4, f5, f6);
    }

    @Override
    default public <F1, F2, F3, F4, F5, F6> Iterative8Cross<F1, F2, F3, F4, F5, F6, T1, T2> pushFrontInline(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5, F6 f6) {
        return (Iterative8Cross) Iterative2.super.pushFrontInline(f1, f2, f3, f4, f5, f6);
    }

    public static class Iterative2CrossNonNullable<T1, T2> extends Iterative2CrossAbst<T1, T2> implements Iterative2Cross<T1, T2>, IterativeWrapper.IterativeWrapperNonNullable, IterativeWrapper.IterativeCross {

        Iterative2CrossNonNullable(Iterative1<? extends T1> iterative, Iterable<? extends T2> right) {
            super(iterative, right);
        }

        Iterative2CrossNonNullable(Iterative1<? extends T1> iterative, Iterable<? extends Stream<? extends T2>> right, boolean ign) {
            super(iterative, right, ign);
        }

    }

    public static class Iterative2CrossNullable<T1, T2> extends Iterative2CrossAbst<T1, T2> implements Iterative2Cross<T1, T2>, IterativeWrapper.IterativeWrapperNullable, IterativeWrapper.IterativeCross {

        Iterative2CrossNullable(Iterative1<? extends T1> iterative, Iterable<? extends T2> right) {
            super(iterative, right);
        }

        Iterative2CrossNullable(Iterative1<? extends T1> iterative, Iterable<? extends Stream<? extends T2>> right, boolean ign) {
            super(iterative, right, ign);
        }

    }

    public static abstract class Iterative2CrossAbst<T1, T2> extends Iterative2.Iterative2Abst<T1, T2> implements Iterative2Cross<T1, T2> {

        Iterative2CrossAbst(Iterative1<? extends T1> iterative, Iterable<? extends T2> right) {
            super(iterative, right);
        }

        Iterative2CrossAbst(Iterative1<? extends T1> iterative, Iterable<? extends Stream<? extends T2>> right, boolean ign) {
            super(iterative, right, ign);
        }

        @Override
        public Stream<Tuple2<Iterable<T1>, Iterable<T2>>> toTupleStream() {
            return this.iterative.toTupleStream().crossProduct(IterativeHandler.transform(this.right)).toStream().map(Fn2.tuple((Fn2 & Serializable) (tuple, right) -> Tuple.of((Object) tuple._1(), (Object) right)));
        }

        @Override
        public Iterative2Cross<T1, T2> nonNullable() {
            return (Iterative2Cross) super.nonNullable();
        }

        @Override
        public Iterative2Cross<T1, T2> nullable() {
            return (Iterative2Cross) super.nullable();
        }

        @Override
        public Iterative2Cross<T1, T2> forceCleanEmpty1() {
            return (Iterative2Cross) super.forceCleanEmpty1();
        }

        @Override
        public Iterative2Cross<T1, T2> forceCleanEmpty2() {
            return (Iterative2Cross) super.forceCleanEmpty2();
        }

        @Override
        public Iterative2Cross<T1, T2> forceCleanEmptyAll() {
            return (Iterative2Cross) super.forceCleanEmptyAll();
        }

        @Override
        public <T3> Iterative3Cross<T1, T2, T3> pushBackBy(Iterable<? extends Stream<? extends T3>> t3) {
            return (Iterative3Cross) super.pushBackBy(t3);
        }

        @Override
        public <T0> Iterative3Cross<T0, T1, T2> pushFrontBy(Iterable<? extends Stream<? extends T0>> t0) {
            return (Iterative3Cross) super.pushFrontBy(t0);
        }

        @Override
        public <T0> Iterative3Cross<T0, T1, T2> pushFrontCrossBy(Iterable<? extends Stream<? extends T0>> t0) {
            return (Iterative3Cross) super.pushFrontCrossBy(t0);
        }

        @Override
        public <T0> Iterative3Cross<T0, T1, T2> pushFrontInlineBy(Iterable<? extends Stream<? extends T0>> t0) {
            return (Iterative3Cross) super.pushFrontInlineBy(t0);
        }

        @Override
        public <R1, R2> Iterative2Cross<R1, R2> map(Fn1<? super T1, ? extends R1> f1, Fn1<? super T2, ? extends R2> f2) {
            return (Iterative2Cross) super.map(f1, f2);
        }

        @Override
        public <R1, R2> Iterative2Cross<R1, R2> inlineMap(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2) {
            return (Iterative2Cross) super.inlineMap(f1, f2);
        }

        @Override
        public Iterative2Cross<T1, T2> filter(Pr1<? super T1> p1, Pr1<? super T2> p2) {
            return (Iterative2Cross) super.filter(p1, p2);
        }

    }

}

package com.fiberg.iterative.core;

import com.fiberg.iterative.core.Iterative3;
import com.fiberg.iterative.core.Iterative4;
import com.fiberg.iterative.core.Iterative5Inline;
import com.fiberg.iterative.core.Iterative6Inline;
import com.fiberg.iterative.core.Iterative7Inline;
import com.fiberg.iterative.core.Iterative8Inline;
import com.fiberg.iterative.core.IterativeHandler;
import com.fiberg.iterative.core.IterativeWrapper;
import com.fiberg.iterative.core.ZipIterator;
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

public interface Iterative4Inline<T1, T2, T3, T4> extends Iterative4<T1, T2, T3, T4> {

    @Override
    public Iterative4Inline<T1, T2, T3, T4> nonNullable();

    @Override
    public Iterative4Inline<T1, T2, T3, T4> nullable();

    @Override
    public Iterative4Inline<T1, T2, T3, T4> forceCleanEmpty1();

    @Override
    public Iterative4Inline<T1, T2, T3, T4> forceCleanEmpty2();

    @Override
    public Iterative4Inline<T1, T2, T3, T4> forceCleanEmpty3();

    @Override
    public Iterative4Inline<T1, T2, T3, T4> forceCleanEmpty4();

    @Override
    public Iterative4Inline<T1, T2, T3, T4> forceCleanEmptyAll();

    @Override
    public <T5> Iterative5Inline<T1, T2, T3, T4, T5> pushBackBy(Iterable<? extends Stream<? extends T5>> var1);

    @Override
    public <T0> Iterative5Inline<T0, T1, T2, T3, T4> pushFrontBy(Iterable<? extends Stream<? extends T0>> var1);

    @Override
    public <T0> Iterative5Inline<T0, T1, T2, T3, T4> pushFrontCrossBy(Iterable<? extends Stream<? extends T0>> var1);

    @Override
    public <T0> Iterative5Inline<T0, T1, T2, T3, T4> pushFrontInlineBy(Iterable<? extends Stream<? extends T0>> var1);

    @Override
    public <R1, R2, R3, R4> Iterative4Inline<R1, R2, R3, R4> map(Fn1<? super T1, ? extends R1> var1, Fn1<? super T2, ? extends R2> var2, Fn1<? super T3, ? extends R3> var3, Fn1<? super T4, ? extends R4> var4);

    @Override
    public <R1, R2, R3, R4> Iterative4Inline<R1, R2, R3, R4> inlineMap(Fn1<? super T1, ? extends Iterable<? extends R1>> var1, Fn1<? super T2, ? extends Iterable<? extends R2>> var2, Fn1<? super T3, ? extends Iterable<? extends R3>> var3, Fn1<? super T4, ? extends Iterable<? extends R4>> var4);

    @Override
    public Iterative4Inline<T1, T2, T3, T4> filter(Pr1<? super T1> var1, Pr1<? super T2> var2, Pr1<? super T3> var3, Pr1<? super T4> var4);

    @Override
    default public Iterative4Inline<T1, T2, T3, T4> onSuccess(Rn r) {
        return (Iterative4Inline) Iterative4.super.onSuccess(r);
    }

    @Override
    default public Iterative4Inline<T1, T2, T3, T4> onFailure(Rn r) {
        return (Iterative4Inline) Iterative4.super.onFailure(r);
    }

    @Override
    default public Iterative4Inline<T1, T2, T3, T4> execute(Cs1<? super Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> c) {
        return (Iterative4Inline) Iterative4.super.execute(c);
    }

    @Override
    default public Iterative4Inline<T1, T2, T3, T4> onFailure(Cs1<? super Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> c) {
        return (Iterative4Inline) Iterative4.super.onFailure(c);
    }

    @Override
    default public Iterative4Inline<T1, T2, T3, T4> onSuccess(Cs1<? super Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> c) {
        return (Iterative4Inline) Iterative4.super.onSuccess(c);
    }

    @Override
    default public Iterative4Inline<T1, T2, T3, T4> forEach(Cs4<? super T1, ? super T2, ? super T3, ? super T4> c) {
        return (Iterative4Inline) Iterative4.super.forEach(c);
    }

    @Override
    default public <R> Iterative4Inline<R, T2, T3, T4> map1(Fn1<? super T1, ? extends R> f) {
        return (Iterative4Inline) Iterative4.super.map1(f);
    }

    @Override
    default public <R> Iterative4Inline<T1, R, T3, T4> map2(Fn1<? super T2, ? extends R> f) {
        return (Iterative4Inline) Iterative4.super.map2(f);
    }

    @Override
    default public <R> Iterative4Inline<T1, T2, R, T4> map3(Fn1<? super T3, ? extends R> f) {
        return (Iterative4Inline) Iterative4.super.map3(f);
    }

    @Override
    default public <R> Iterative4Inline<T1, T2, T3, R> map4(Fn1<? super T4, ? extends R> f) {
        return (Iterative4Inline) Iterative4.super.map4(f);
    }

    @Override
    default public <R> Iterative4Inline<R, T2, T3, T4> inlineMap1(Fn1<? super T1, ? extends Iterable<? extends R>> f) {
        return (Iterative4Inline) Iterative4.super.inlineMap1(f);
    }

    @Override
    default public <R> Iterative4Inline<T1, R, T3, T4> inlineMap2(Fn1<? super T2, ? extends Iterable<? extends R>> f) {
        return (Iterative4Inline) Iterative4.super.inlineMap2(f);
    }

    @Override
    default public <R> Iterative4Inline<T1, T2, R, T4> inlineMap3(Fn1<? super T3, ? extends Iterable<? extends R>> f) {
        return (Iterative4Inline) Iterative4.super.inlineMap3(f);
    }

    @Override
    default public <R> Iterative4Inline<T1, T2, T3, R> inlineMap4(Fn1<? super T4, ? extends Iterable<? extends R>> f) {
        return (Iterative4Inline) Iterative4.super.inlineMap4(f);
    }

    @Override
    default public Iterative4Inline<T1, T2, T3, T4> filter1(Pr1<? super T1> p) {
        return (Iterative4Inline) Iterative4.super.filter1(p);
    }

    @Override
    default public Iterative4Inline<T1, T2, T3, T4> filter2(Pr1<? super T2> p) {
        return (Iterative4Inline) Iterative4.super.filter2(p);
    }

    @Override
    default public Iterative4Inline<T1, T2, T3, T4> filter3(Pr1<? super T3> p) {
        return (Iterative4Inline) Iterative4.super.filter3(p);
    }

    @Override
    default public Iterative4Inline<T1, T2, T3, T4> filter4(Pr1<? super T4> p) {
        return (Iterative4Inline) Iterative4.super.filter4(p);
    }

    @Override
    default public <T5> Iterative5Inline<T1, T2, T3, T4, T5> pushBack(T5 t5) {
        return (Iterative5Inline) Iterative4.super.pushBack(t5);
    }

    @Override
    default public <T0> Iterative5Inline<T0, T1, T2, T3, T4> pushFront(T0 t0) {
        return (Iterative5Inline) Iterative4.super.pushFront(t0);
    }

    @Override
    default public <T0> Iterative5Inline<T0, T1, T2, T3, T4> pushFrontCross(T0 t0) {
        return (Iterative5Inline) Iterative4.super.pushFrontCross(t0);
    }

    @Override
    default public <T0> Iterative5Inline<T0, T1, T2, T3, T4> pushFrontInline(T0 t0) {
        return (Iterative5Inline) Iterative4.super.pushFrontInline(t0);
    }

    @Override
    default public <T5> Iterative5Inline<T1, T2, T3, T4, T5> pushBackOf(Iterable<? extends T5> t5) {
        return (Iterative5Inline) Iterative4.super.pushBackOf(t5);
    }

    @Override
    default public <T0> Iterative5Inline<T0, T1, T2, T3, T4> pushFrontOf(Iterable<? extends T0> t0) {
        return (Iterative5Inline) Iterative4.super.pushFrontOf(t0);
    }

    @Override
    default public <T0> Iterative5Inline<T0, T1, T2, T3, T4> pushFrontCrossOf(Iterable<? extends T0> t0) {
        return (Iterative5Inline) Iterative4.super.pushFrontCrossOf(t0);
    }

    @Override
    default public <T0> Iterative5Inline<T0, T1, T2, T3, T4> pushFrontInlineOf(Iterable<? extends T0> t0) {
        return (Iterative5Inline) Iterative4.super.pushFrontInlineOf(t0);
    }

    @Override
    default public <B1, B2> Iterative6Inline<T1, T2, T3, T4, B1, B2> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2) {
        return (Iterative6Inline) Iterative4.super.pushBackBy(b1, b2);
    }

    @Override
    default public <F1, F2> Iterative6Inline<F1, F2, T1, T2, T3, T4> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return (Iterative6Inline) Iterative4.super.pushFrontBy(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative6Inline<F1, F2, T1, T2, T3, T4> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return (Iterative6Inline) Iterative4.super.pushFrontCrossBy(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative6Inline<F1, F2, T1, T2, T3, T4> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return (Iterative6Inline) Iterative4.super.pushFrontInlineBy(f1, f2);
    }

    @Override
    default public <B1, B2> Iterative6Inline<T1, T2, T3, T4, B1, B2> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2) {
        return (Iterative6Inline) Iterative4.super.pushBackOf(b1, b2);
    }

    @Override
    default public <F1, F2> Iterative6Inline<F1, F2, T1, T2, T3, T4> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return (Iterative6Inline) Iterative4.super.pushFrontOf(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative6Inline<F1, F2, T1, T2, T3, T4> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return (Iterative6Inline) Iterative4.super.pushFrontCrossOf(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative6Inline<F1, F2, T1, T2, T3, T4> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return (Iterative6Inline) Iterative4.super.pushFrontInlineOf(f1, f2);
    }

    @Override
    default public <B1, B2> Iterative6Inline<T1, T2, T3, T4, B1, B2> pushBack(B1 b1, B2 b2) {
        return (Iterative6Inline) Iterative4.super.pushBack(b1, b2);
    }

    @Override
    default public <F1, F2> Iterative6Inline<F1, F2, T1, T2, T3, T4> pushFront(F1 f1, F2 f2) {
        return (Iterative6Inline) Iterative4.super.pushFront(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative6Inline<F1, F2, T1, T2, T3, T4> pushFrontCross(F1 f1, F2 f2) {
        return (Iterative6Inline) Iterative4.super.pushFrontCross(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative6Inline<F1, F2, T1, T2, T3, T4> pushFrontInline(F1 f1, F2 f2) {
        return (Iterative6Inline) Iterative4.super.pushFrontInline(f1, f2);
    }

    @Override
    default public <B1, B2, B3> Iterative7Inline<T1, T2, T3, T4, B1, B2, B3> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3) {
        return (Iterative7Inline) ((Object) Iterative4.super.pushBackBy(b1, b2));
    }

    @Override
    default public <F1, F2, F3> Iterative7Inline<F1, F2, F3, T1, T2, T3, T4> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3) {
        return (Iterative7Inline) Iterative4.super.pushFrontBy(f1, f2, f3);
    }

    @Override
    default public <F1, F2, F3> Iterative7Inline<F1, F2, F3, T1, T2, T3, T4> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3) {
        return (Iterative7Inline) Iterative4.super.pushFrontCrossBy(f1, f2, f3);
    }

    @Override
    default public <F1, F2, F3> Iterative7Inline<F1, F2, F3, T1, T2, T3, T4> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3) {
        return (Iterative7Inline) Iterative4.super.pushFrontInlineBy(f1, f2, f3);
    }

    @Override
    default public <B1, B2, B3> Iterative7Inline<T1, T2, T3, T4, B1, B2, B3> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3) {
        return (Iterative7Inline) Iterative4.super.pushBackOf(b1, b2, b3);
    }

    @Override
    default public <F1, F2, F3> Iterative7Inline<F1, F2, F3, T1, T2, T3, T4> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3) {
        return (Iterative7Inline) Iterative4.super.pushFrontOf(f1, f2, f3);
    }

    @Override
    default public <F1, F2, F3> Iterative7Inline<F1, F2, F3, T1, T2, T3, T4> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3) {
        return (Iterative7Inline) Iterative4.super.pushFrontCrossOf(f1, f2, f3);
    }

    @Override
    default public <F1, F2, F3> Iterative7Inline<F1, F2, F3, T1, T2, T3, T4> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3) {
        return (Iterative7Inline) Iterative4.super.pushFrontInlineOf(f1, f2, f3);
    }

    @Override
    default public <B1, B2, B3> Iterative7Inline<T1, T2, T3, T4, B1, B2, B3> pushBack(B1 b1, B2 b2, B3 b3) {
        return (Iterative7Inline) Iterative4.super.pushBack(b1, b2, b3);
    }

    @Override
    default public <F1, F2, F3> Iterative7Inline<F1, F2, F3, T1, T2, T3, T4> pushFront(F1 f1, F2 f2, F3 f3) {
        return (Iterative7Inline) Iterative4.super.pushFront(f1, f2, f3);
    }

    @Override
    default public <F1, F2, F3> Iterative7Inline<F1, F2, F3, T1, T2, T3, T4> pushFrontCross(F1 f1, F2 f2, F3 f3) {
        return (Iterative7Inline) Iterative4.super.pushFrontCross(f1, f2, f3);
    }

    @Override
    default public <F1, F2, F3> Iterative7Inline<F1, F2, F3, T1, T2, T3, T4> pushFrontInline(F1 f1, F2 f2, F3 f3) {
        return (Iterative7Inline) Iterative4.super.pushFrontInline(f1, f2, f3);
    }

    @Override
    default public <B1, B2, B3, B4> Iterative8Inline<T1, T2, T3, T4, B1, B2, B3, B4> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4) {
        return (Iterative8Inline) ((Object) Iterative4.super.pushBackBy(b1, b2, b3));
    }

    @Override
    default public <F1, F2, F3, F4> Iterative8Inline<F1, F2, F3, F4, T1, T2, T3, T4> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4) {
        return (Iterative8Inline) ((Object) Iterative4.super.pushFrontBy(f1, f2, f3));
    }

    @Override
    default public <F1, F2, F3, F4> Iterative8Inline<F1, F2, F3, F4, T1, T2, T3, T4> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4) {
        return (Iterative8Inline) ((Object) Iterative4.super.pushFrontCrossBy(f1, f2, f3));
    }

    @Override
    default public <F1, F2, F3, F4> Iterative8Inline<F1, F2, F3, F4, T1, T2, T3, T4> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4) {
        return (Iterative8Inline) Iterative4.super.pushFrontInlineBy(f1, f2, f3, f4);
    }

    @Override
    default public <B1, B2, B3, B4> Iterative8Inline<T1, T2, T3, T4, B1, B2, B3, B4> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4) {
        return (Iterative8Inline) Iterative4.super.pushBackOf(b1, b2, b3, b4);
    }

    @Override
    default public <F1, F2, F3, F4> Iterative8Inline<F1, F2, F3, F4, T1, T2, T3, T4> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4) {
        return (Iterative8Inline) Iterative4.super.pushFrontOf(f1, f2, f3, f4);
    }

    @Override
    default public <F1, F2, F3, F4> Iterative8Inline<F1, F2, F3, F4, T1, T2, T3, T4> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4) {
        return (Iterative8Inline) Iterative4.super.pushFrontCrossOf(f1, f2, f3, f4);
    }

    @Override
    default public <F1, F2, F3, F4> Iterative8Inline<F1, F2, F3, F4, T1, T2, T3, T4> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4) {
        return (Iterative8Inline) Iterative4.super.pushFrontInlineOf(f1, f2, f3, f4);
    }

    @Override
    default public <B1, B2, B3, B4> Iterative8Inline<T1, T2, T3, T4, B1, B2, B3, B4> pushBack(B1 b1, B2 b2, B3 b3, B4 b4) {
        return (Iterative8Inline) Iterative4.super.pushBack(b1, b2, b3, b4);
    }

    @Override
    default public <F1, F2, F3, F4> Iterative8Inline<F1, F2, F3, F4, T1, T2, T3, T4> pushFront(F1 f1, F2 f2, F3 f3, F4 f4) {
        return (Iterative8Inline) Iterative4.super.pushFront(f1, f2, f3, f4);
    }

    @Override
    default public <F1, F2, F3, F4> Iterative8Inline<F1, F2, F3, F4, T1, T2, T3, T4> pushFrontCross(F1 f1, F2 f2, F3 f3, F4 f4) {
        return (Iterative8Inline) Iterative4.super.pushFrontCross(f1, f2, f3, f4);
    }

    @Override
    default public <F1, F2, F3, F4> Iterative8Inline<F1, F2, F3, F4, T1, T2, T3, T4> pushFrontInline(F1 f1, F2 f2, F3 f3, F4 f4) {
        return (Iterative8Inline) Iterative4.super.pushFrontInline(f1, f2, f3, f4);
    }

    public static class Iterative4InlineNonNullable<T1, T2, T3, T4> extends Iterative4InlineAbst<T1, T2, T3, T4> implements Iterative4Inline<T1, T2, T3, T4>, IterativeWrapper.IterativeWrapperNonNullable, IterativeWrapper.IterativeInline {

        Iterative4InlineNonNullable(Iterative3<? extends T1, ? extends T2, ? extends T3> iterative, Iterable<? extends T4> right) {
            super(iterative, right);
        }

        Iterative4InlineNonNullable(Iterative3<? extends T1, ? extends T2, ? extends T3> iterative, Iterable<? extends Stream<? extends T4>> right, boolean ign) {
            super(iterative, right, ign);
        }

    }

    public static class Iterative4InlineNullable<T1, T2, T3, T4> extends Iterative4InlineAbst<T1, T2, T3, T4> implements Iterative4Inline<T1, T2, T3, T4>, IterativeWrapper.IterativeWrapperNullable, IterativeWrapper.IterativeInline {

        Iterative4InlineNullable(Iterative3<? extends T1, ? extends T2, ? extends T3> iterative, Iterable<? extends T4> right) {
            super(iterative, right);
        }

        Iterative4InlineNullable(Iterative3<? extends T1, ? extends T2, ? extends T3> iterative, Iterable<? extends Stream<? extends T4>> right, boolean ign) {
            super(iterative, right, ign);
        }

    }

    public static abstract class Iterative4InlineAbst<T1, T2, T3, T4> extends Iterative4.Iterative4Abst<T1, T2, T3, T4> implements Iterative4Inline<T1, T2, T3, T4> {

        Iterative4InlineAbst(Iterative3<? extends T1, ? extends T2, ? extends T3> iterative, Iterable<? extends T4> right) {
            super(iterative, right);
        }

        Iterative4InlineAbst(Iterative3<? extends T1, ? extends T2, ? extends T3> iterative, Iterable<? extends Stream<? extends T4>> right, boolean ign) {
            super(iterative, right, ign);
        }

        @Override
        public Stream<Tuple4<Iterable<T1>, Iterable<T2>, Iterable<T3>, Iterable<T4>>> toTupleStream() {
            ZipIterator iterator = new ZipIterator(this.iterative.toTupleStream().iterator(), IterativeHandler.transform(this.right).iterator(), (Fn2 & Serializable) (tuple, right) -> Tuple.of((Object) tuple._1(), (Object) tuple._2(), (Object) tuple._3(), (Object) right));
            return iterator.toStream();
        }

        @Override
        public Iterative4Inline<T1, T2, T3, T4> nonNullable() {
            return (Iterative4Inline) super.nonNullable();
        }

        @Override
        public Iterative4Inline<T1, T2, T3, T4> nullable() {
            return (Iterative4Inline) super.nullable();
        }

        @Override
        public Iterative4Inline<T1, T2, T3, T4> forceCleanEmpty1() {
            return (Iterative4Inline) super.forceCleanEmpty1();
        }

        @Override
        public Iterative4Inline<T1, T2, T3, T4> forceCleanEmpty2() {
            return (Iterative4Inline) super.forceCleanEmpty2();
        }

        @Override
        public Iterative4Inline<T1, T2, T3, T4> forceCleanEmpty3() {
            return (Iterative4Inline) super.forceCleanEmpty3();
        }

        @Override
        public Iterative4Inline<T1, T2, T3, T4> forceCleanEmpty4() {
            return (Iterative4Inline) super.forceCleanEmpty4();
        }

        @Override
        public Iterative4Inline<T1, T2, T3, T4> forceCleanEmptyAll() {
            return (Iterative4Inline) super.forceCleanEmptyAll();
        }

        @Override
        public <T5> Iterative5Inline<T1, T2, T3, T4, T5> pushBackBy(Iterable<? extends Stream<? extends T5>> t5) {
            return (Iterative5Inline) super.pushBackBy(t5);
        }

        @Override
        public <T0> Iterative5Inline<T0, T1, T2, T3, T4> pushFrontBy(Iterable<? extends Stream<? extends T0>> t0) {
            return (Iterative5Inline) super.pushFrontBy(t0);
        }

        @Override
        public <T0> Iterative5Inline<T0, T1, T2, T3, T4> pushFrontCrossBy(Iterable<? extends Stream<? extends T0>> t0) {
            return (Iterative5Inline) super.pushFrontCrossBy(t0);
        }

        @Override
        public <T0> Iterative5Inline<T0, T1, T2, T3, T4> pushFrontInlineBy(Iterable<? extends Stream<? extends T0>> t0) {
            return (Iterative5Inline) super.pushFrontInlineBy(t0);
        }

        @Override
        public <R1, R2, R3, R4> Iterative4Inline<R1, R2, R3, R4> map(Fn1<? super T1, ? extends R1> f1, Fn1<? super T2, ? extends R2> f2, Fn1<? super T3, ? extends R3> f3, Fn1<? super T4, ? extends R4> f4) {
            return (Iterative4Inline) super.map(f1, f2, f3, f4);
        }

        @Override
        public <R1, R2, R3, R4> Iterative4Inline<R1, R2, R3, R4> inlineMap(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4) {
            return (Iterative4Inline) super.inlineMap(f1, f2, f3, f4);
        }

        @Override
        public Iterative4Inline<T1, T2, T3, T4> filter(Pr1<? super T1> p1, Pr1<? super T2> p2, Pr1<? super T3> p3, Pr1<? super T4> p4) {
            return (Iterative4Inline) super.filter(p1, p2, p3, p4);
        }

    }

}

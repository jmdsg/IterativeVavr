package com.fiberg.iterative.core;

import com.fiberg.iterative.core.Iterative5;
import com.fiberg.iterative.core.Iterative6;
import com.fiberg.iterative.core.Iterative7Inline;
import com.fiberg.iterative.core.Iterative8Inline;
import com.fiberg.iterative.core.IterativeHandler;
import com.fiberg.iterative.core.IterativeWrapper;
import com.fiberg.iterative.core.ZipIterator;
import com.fiberg.iterative.function.Cs1;
import com.fiberg.iterative.function.Cs6;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fn2;
import com.fiberg.iterative.function.Pr1;
import com.fiberg.iterative.function.Rn;
import io.vavr.Tuple;
import io.vavr.Tuple6;
import io.vavr.collection.Stream;
import java.io.Serializable;

public interface Iterative6Inline<T1, T2, T3, T4, T5, T6> extends Iterative6<T1, T2, T3, T4, T5, T6> {

    @Override
    public Iterative6Inline<T1, T2, T3, T4, T5, T6> nonNullable();

    @Override
    public Iterative6Inline<T1, T2, T3, T4, T5, T6> nullable();

    @Override
    public Iterative6Inline<T1, T2, T3, T4, T5, T6> forceCleanEmpty1();

    @Override
    public Iterative6Inline<T1, T2, T3, T4, T5, T6> forceCleanEmpty2();

    @Override
    public Iterative6Inline<T1, T2, T3, T4, T5, T6> forceCleanEmpty3();

    @Override
    public Iterative6Inline<T1, T2, T3, T4, T5, T6> forceCleanEmpty4();

    @Override
    public Iterative6Inline<T1, T2, T3, T4, T5, T6> forceCleanEmpty5();

    @Override
    public Iterative6Inline<T1, T2, T3, T4, T5, T6> forceCleanEmptyAll();

    @Override
    public <T7> Iterative7Inline<T1, T2, T3, T4, T5, T6, T7> pushBackBy(Iterable<? extends Stream<? extends T7>> i1);

    @Override
    public <T0> Iterative7Inline<T0, T1, T2, T3, T4, T5, T6> pushFrontBy(Iterable<? extends Stream<? extends T0>> i1);

    @Override
    public <T0> Iterative7Inline<T0, T1, T2, T3, T4, T5, T6> pushFrontCrossBy(Iterable<? extends Stream<? extends T0>> i1);

    @Override
    public <T0> Iterative7Inline<T0, T1, T2, T3, T4, T5, T6> pushFrontInlineBy(Iterable<? extends Stream<? extends T0>> i1);

    @Override
    public <R1, R2, R3, R4, R5, R6> Iterative6Inline<R1, R2, R3, R4, R5, R6> map(Fn1<? super T1, ? extends R1> f1, Fn1<? super T2, ? extends R2> f2, Fn1<? super T3, ? extends R3> f3, Fn1<? super T4, ? extends R4> f4, Fn1<? super T5, ? extends R5> f5, Fn1<? super T6, ? extends R6> f6);

    @Override
    public <R1, R2, R3, R4, R5, R6> Iterative6Inline<R1, R2, R3, R4, R5, R6> inlineMap(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> i2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> i4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5, Fn1<? super T6, ? extends Iterable<? extends R6>> i6);

    @Override
    public Iterative6Inline<T1, T2, T3, T4, T5, T6> filter(Pr1<? super T1> p1, Pr1<? super T2> p2, Pr1<? super T3> p3, Pr1<? super T4> p4, Pr1<? super T5> p5, Pr1<? super T6> p6);

    @Override
    default public Iterative6Inline<T1, T2, T3, T4, T5, T6> onSuccess(Rn r) {
        return (Iterative6Inline<T1, T2, T3, T4, T5, T6>) Iterative6.super.onSuccess(r);
    }

    @Override
    default public Iterative6Inline<T1, T2, T3, T4, T5, T6> onFailure(Rn r) {
        return (Iterative6Inline<T1, T2, T3, T4, T5, T6>) Iterative6.super.onFailure(r);
    }

    @Override
    default public Iterative6Inline<T1, T2, T3, T4, T5, T6> execute(Cs1<? super Iterative6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> c) {
        return (Iterative6Inline<T1, T2, T3, T4, T5, T6>) Iterative6.super.execute(c);
    }

    @Override
    default public Iterative6Inline<T1, T2, T3, T4, T5, T6> onFailure(Cs1<? super Iterative6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> c) {
        return (Iterative6Inline<T1, T2, T3, T4, T5, T6>) Iterative6.super.onFailure(c);
    }

    @Override
    default public Iterative6Inline<T1, T2, T3, T4, T5, T6> onSuccess(Cs1<? super Iterative6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> c) {
        return (Iterative6Inline<T1, T2, T3, T4, T5, T6>) Iterative6.super.onSuccess(c);
    }

    @Override
    default public Iterative6Inline<T1, T2, T3, T4, T5, T6> forEach(Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c) {
        return (Iterative6Inline<T1, T2, T3, T4, T5, T6>) Iterative6.super.forEach(c);
    }

    @Override
    default public <R> Iterative6Inline<R, T2, T3, T4, T5, T6> map1(Fn1<? super T1, ? extends R> f) {
        return (Iterative6Inline<R, T2, T3, T4, T5, T6>) Iterative6.super.<R>map1(f);
    }

    @Override
    default public <R> Iterative6Inline<T1, R, T3, T4, T5, T6> map2(Fn1<? super T2, ? extends R> f) {
        return (Iterative6Inline<T1, R, T3, T4, T5, T6>) Iterative6.super.<R>map2(f);
    }

    @Override
    default public <R> Iterative6Inline<T1, T2, R, T4, T5, T6> map3(Fn1<? super T3, ? extends R> f) {
        return (Iterative6Inline<T1, T2, R, T4, T5, T6>) Iterative6.super.<R>map3(f);
    }

    @Override
    default public <R> Iterative6Inline<T1, T2, T3, R, T5, T6> map4(Fn1<? super T4, ? extends R> f) {
        return (Iterative6Inline<T1, T2, T3, R, T5, T6>) Iterative6.super.<R>map4(f);
    }

    @Override
    default public <R> Iterative6Inline<T1, T2, T3, T4, R, T6> map5(Fn1<? super T5, ? extends R> f) {
        return (Iterative6Inline<T1, T2, T3, T4, R, T6>) Iterative6.super.<R>map5(f);
    }

    @Override
    default public <R> Iterative6Inline<T1, T2, T3, T4, T5, R> map6(Fn1<? super T6, ? extends R> f) {
        return (Iterative6Inline<T1, T2, T3, T4, T5, R>) Iterative6.super.<R>map6(f);
    }

    @Override
    default public <R> Iterative6Inline<R, T2, T3, T4, T5, T6> inlineMap1(Fn1<? super T1, ? extends Iterable<? extends R>> f) {
        return (Iterative6Inline<R, T2, T3, T4, T5, T6>) Iterative6.super.<R>inlineMap1(f);
    }

    @Override
    default public <R> Iterative6Inline<T1, R, T3, T4, T5, T6> inlineMap2(Fn1<? super T2, ? extends Iterable<? extends R>> f) {
        return (Iterative6Inline<T1, R, T3, T4, T5, T6>) Iterative6.super.<R>inlineMap2(f);
    }

    @Override
    default public <R> Iterative6Inline<T1, T2, R, T4, T5, T6> inlineMap3(Fn1<? super T3, ? extends Iterable<? extends R>> f) {
        return (Iterative6Inline<T1, T2, R, T4, T5, T6>) Iterative6.super.<R>inlineMap3(f);
    }

    @Override
    default public <R> Iterative6Inline<T1, T2, T3, R, T5, T6> inlineMap4(Fn1<? super T4, ? extends Iterable<? extends R>> f) {
        return (Iterative6Inline<T1, T2, T3, R, T5, T6>) Iterative6.super.<R>inlineMap4(f);
    }

    @Override
    default public <R> Iterative6Inline<T1, T2, T3, T4, R, T6> inlineMap5(Fn1<? super T5, ? extends Iterable<? extends R>> f) {
        return (Iterative6Inline<T1, T2, T3, T4, R, T6>) Iterative6.super.<R>inlineMap5(f);
    }

    @Override
    default public <R> Iterative6Inline<T1, T2, T3, T4, T5, R> inlineMap6(Fn1<? super T6, ? extends Iterable<? extends R>> f) {
        return (Iterative6Inline<T1, T2, T3, T4, T5, R>) Iterative6.super.<R>inlineMap6(f);
    }

    @Override
    default public Iterative6Inline<T1, T2, T3, T4, T5, T6> filter1(Pr1<? super T1> p) {
        return (Iterative6Inline<T1, T2, T3, T4, T5, T6>) Iterative6.super.filter1(p);
    }

    @Override
    default public Iterative6Inline<T1, T2, T3, T4, T5, T6> filter2(Pr1<? super T2> p) {
        return (Iterative6Inline<T1, T2, T3, T4, T5, T6>) Iterative6.super.filter2(p);
    }

    @Override
    default public Iterative6Inline<T1, T2, T3, T4, T5, T6> filter3(Pr1<? super T3> p) {
        return (Iterative6Inline<T1, T2, T3, T4, T5, T6>) Iterative6.super.filter3(p);
    }

    @Override
    default public Iterative6Inline<T1, T2, T3, T4, T5, T6> filter4(Pr1<? super T4> p) {
        return (Iterative6Inline<T1, T2, T3, T4, T5, T6>) Iterative6.super.filter4(p);
    }

    @Override
    default public Iterative6Inline<T1, T2, T3, T4, T5, T6> filter5(Pr1<? super T5> p) {
        return (Iterative6Inline<T1, T2, T3, T4, T5, T6>) Iterative6.super.filter5(p);
    }

    @Override
    default public Iterative6Inline<T1, T2, T3, T4, T5, T6> filter6(Pr1<? super T6> p) {
        return (Iterative6Inline<T1, T2, T3, T4, T5, T6>) Iterative6.super.filter6(p);
    }

    @Override
    default public <T7> Iterative7Inline<T1, T2, T3, T4, T5, T6, T7> pushBack(T7 t7) {
        return (Iterative7Inline<T1, T2, T3, T4, T5, T6, T7>) Iterative6.super.<T7>pushBack(t7);
    }

    @Override
    default public <T0> Iterative7Inline<T0, T1, T2, T3, T4, T5, T6> pushFront(T0 t0) {
        return (Iterative7Inline<T0, T1, T2, T3, T4, T5, T6>) Iterative6.super.<T0>pushFront(t0);
    }

    @Override
    default public <T0> Iterative7Inline<T0, T1, T2, T3, T4, T5, T6> pushFrontCross(T0 t0) {
        return (Iterative7Inline<T0, T1, T2, T3, T4, T5, T6>) Iterative6.super.<T0>pushFrontCross(t0);
    }

    @Override
    default public <T0> Iterative7Inline<T0, T1, T2, T3, T4, T5, T6> pushFrontInline(T0 t0) {
        return (Iterative7Inline<T0, T1, T2, T3, T4, T5, T6>) Iterative6.super.<T0>pushFrontInline(t0);
    }

    @Override
    default public <T7> Iterative7Inline<T1, T2, T3, T4, T5, T6, T7> pushBackOf(Iterable<? extends T7> t7) {
        return (Iterative7Inline<T1, T2, T3, T4, T5, T6, T7>) Iterative6.super.<T7>pushBackOf(t7);
    }

    @Override
    default public <T0> Iterative7Inline<T0, T1, T2, T3, T4, T5, T6> pushFrontOf(Iterable<? extends T0> t0) {
        return (Iterative7Inline<T0, T1, T2, T3, T4, T5, T6>) Iterative6.super.<T0>pushFrontOf(t0);
    }

    @Override
    default public <T0> Iterative7Inline<T0, T1, T2, T3, T4, T5, T6> pushFrontCrossOf(Iterable<? extends T0> t0) {
        return (Iterative7Inline<T0, T1, T2, T3, T4, T5, T6>) Iterative6.super.<T0>pushFrontCrossOf(t0);
    }

    @Override
    default public <T0> Iterative7Inline<T0, T1, T2, T3, T4, T5, T6> pushFrontInlineOf(Iterable<? extends T0> t0) {
        return (Iterative7Inline<T0, T1, T2, T3, T4, T5, T6>) Iterative6.super.<T0>pushFrontInlineOf(t0);
    }

    @Override
    default public <B1, B2> Iterative8Inline<T1, T2, T3, T4, T5, T6, B1, B2> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2) {
        return (Iterative8Inline<T1, T2, T3, T4, T5, T6, B1, B2>) Iterative6.super.<B1, B2>pushBackBy(b1, b2);
    }

    @Override
    default public <F1, F2> Iterative8Inline<F1, F2, T1, T2, T3, T4, T5, T6> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return (Iterative8Inline<F1, F2, T1, T2, T3, T4, T5, T6>) Iterative6.super.<F1, F2>pushFrontBy(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative8Inline<F1, F2, T1, T2, T3, T4, T5, T6> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return (Iterative8Inline<F1, F2, T1, T2, T3, T4, T5, T6>) Iterative6.super.<F1, F2>pushFrontCrossBy(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative8Inline<F1, F2, T1, T2, T3, T4, T5, T6> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return (Iterative8Inline<F1, F2, T1, T2, T3, T4, T5, T6>) Iterative6.super.<F1, F2>pushFrontInlineBy(f1, f2);
    }

    @Override
    default public <B1, B2> Iterative8Inline<T1, T2, T3, T4, T5, T6, B1, B2> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2) {
        return (Iterative8Inline<T1, T2, T3, T4, T5, T6, B1, B2>) Iterative6.super.<B1, B2>pushBackOf(b1, b2);
    }

    @Override
    default public <F1, F2> Iterative8Inline<F1, F2, T1, T2, T3, T4, T5, T6> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return (Iterative8Inline<F1, F2, T1, T2, T3, T4, T5, T6>) Iterative6.super.<F1, F2>pushFrontOf(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative8Inline<F1, F2, T1, T2, T3, T4, T5, T6> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return (Iterative8Inline<F1, F2, T1, T2, T3, T4, T5, T6>) Iterative6.super.<F1, F2>pushFrontCrossOf(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative8Inline<F1, F2, T1, T2, T3, T4, T5, T6> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return (Iterative8Inline<F1, F2, T1, T2, T3, T4, T5, T6>) Iterative6.super.<F1, F2>pushFrontInlineOf(f1, f2);
    }

    @Override
    default public <B1, B2> Iterative8Inline<T1, T2, T3, T4, T5, T6, B1, B2> pushBack(B1 b1, B2 b2) {
        return (Iterative8Inline<T1, T2, T3, T4, T5, T6, B1, B2>) Iterative6.super.<B1, B2>pushBack(b1, b2);
    }

    @Override
    default public <F1, F2> Iterative8Inline<F1, F2, T1, T2, T3, T4, T5, T6> pushFront(F1 f1, F2 f2) {
        return (Iterative8Inline<F1, F2, T1, T2, T3, T4, T5, T6>) Iterative6.super.<F1, F2>pushFront(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative8Inline<F1, F2, T1, T2, T3, T4, T5, T6> pushFrontCross(F1 f1, F2 f2) {
        return (Iterative8Inline<F1, F2, T1, T2, T3, T4, T5, T6>) Iterative6.super.<F1, F2>pushFrontCross(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative8Inline<F1, F2, T1, T2, T3, T4, T5, T6> pushFrontInline(F1 f1, F2 f2) {
        return (Iterative8Inline<F1, F2, T1, T2, T3, T4, T5, T6>) Iterative6.super.<F1, F2>pushFrontInline(f1, f2);
    }

    public static class Iterative6InlineNonNullable<T1, T2, T3, T4, T5, T6> extends Iterative6InlineAbstract<T1, T2, T3, T4, T5, T6> implements Iterative6Inline<T1, T2, T3, T4, T5, T6>, IterativeWrapper.IterativeWrapperNonNullable, IterativeWrapper.IterativeInline {

        Iterative6InlineNonNullable(Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> iterative, Iterable<? extends T6> right) {
            super(iterative, right);
        }

        Iterative6InlineNonNullable(Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> iterative, Iterable<? extends Stream<? extends T6>> right, boolean ign) {
            super(iterative, right, ign);
        }

    }

    public static class Iterative6InlineNullable<T1, T2, T3, T4, T5, T6> extends Iterative6InlineAbstract<T1, T2, T3, T4, T5, T6> implements Iterative6Inline<T1, T2, T3, T4, T5, T6>, IterativeWrapper.IterativeWrapperNullable, IterativeWrapper.IterativeInline {

        Iterative6InlineNullable(Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> iterative, Iterable<? extends T6> right) {
            super(iterative, right);
        }

        Iterative6InlineNullable(Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> iterative, Iterable<? extends Stream<? extends T6>> right, boolean ign) {
            super(iterative, right, ign);
        }

    }

    public static abstract class Iterative6InlineAbstract<T1, T2, T3, T4, T5, T6> extends Iterative6.Iterative6Abstract<T1, T2, T3, T4, T5, T6> implements Iterative6Inline<T1, T2, T3, T4, T5, T6> {

        Iterative6InlineAbstract(Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> iterative, Iterable<? extends T6> right) {
            super(iterative, right);
        }

        Iterative6InlineAbstract(Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> iterative, Iterable<? extends Stream<? extends T6>> right, boolean ign) {
            super(iterative, right, ign);
        }

        @Override
        public Stream<Tuple6<Iterable<T1>, Iterable<T2>, Iterable<T3>, Iterable<T4>, Iterable<T5>, Iterable<T6>>> toTupleStream() {
            return new ZipIterator<>(this.iterative.toTupleStream().iterator(), IterativeHandler.transform(this.right).iterator(), (tuple, right) -> Tuple.of(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5(), right)).toStream();
        }

        @Override
        public Iterative6Inline<T1, T2, T3, T4, T5, T6> nonNullable() {
            return (Iterative6Inline<T1, T2, T3, T4, T5, T6>) super.nonNullable();
        }

        @Override
        public Iterative6Inline<T1, T2, T3, T4, T5, T6> nullable() {
            return (Iterative6Inline<T1, T2, T3, T4, T5, T6>) super.nullable();
        }

        @Override
        public Iterative6Inline<T1, T2, T3, T4, T5, T6> forceCleanEmpty1() {
            return (Iterative6Inline<T1, T2, T3, T4, T5, T6>) super.forceCleanEmpty1();
        }

        @Override
        public Iterative6Inline<T1, T2, T3, T4, T5, T6> forceCleanEmpty2() {
            return (Iterative6Inline<T1, T2, T3, T4, T5, T6>) super.forceCleanEmpty2();
        }

        @Override
        public Iterative6Inline<T1, T2, T3, T4, T5, T6> forceCleanEmpty3() {
            return (Iterative6Inline<T1, T2, T3, T4, T5, T6>) super.forceCleanEmpty3();
        }

        @Override
        public Iterative6Inline<T1, T2, T3, T4, T5, T6> forceCleanEmpty4() {
            return (Iterative6Inline<T1, T2, T3, T4, T5, T6>) super.forceCleanEmpty4();
        }

        @Override
        public Iterative6Inline<T1, T2, T3, T4, T5, T6> forceCleanEmpty5() {
            return (Iterative6Inline<T1, T2, T3, T4, T5, T6>) super.forceCleanEmpty5();
        }

        @Override
        public Iterative6Inline<T1, T2, T3, T4, T5, T6> forceCleanEmpty6() {
            return (Iterative6Inline<T1, T2, T3, T4, T5, T6>) super.forceCleanEmpty6();
        }

        @Override
        public Iterative6Inline<T1, T2, T3, T4, T5, T6> forceCleanEmptyAll() {
            return (Iterative6Inline<T1, T2, T3, T4, T5, T6>) super.forceCleanEmptyAll();
        }

        @Override
        public <T7> Iterative7Inline<T1, T2, T3, T4, T5, T6, T7> pushBackBy(Iterable<? extends Stream<? extends T7>> t7) {
            return (Iterative7Inline<T1, T2, T3, T4, T5, T6, T7>) super.<T7>pushBackBy(t7);
        }

        @Override
        public <T0> Iterative7Inline<T0, T1, T2, T3, T4, T5, T6> pushFrontBy(Iterable<? extends Stream<? extends T0>> t0) {
            return (Iterative7Inline<T0, T1, T2, T3, T4, T5, T6>) super.<T0>pushFrontBy(t0);
        }

        @Override
        public <T0> Iterative7Inline<T0, T1, T2, T3, T4, T5, T6> pushFrontCrossBy(Iterable<? extends Stream<? extends T0>> t0) {
            return (Iterative7Inline<T0, T1, T2, T3, T4, T5, T6>) super.<T0>pushFrontCrossBy(t0);
        }

        @Override
        public <T0> Iterative7Inline<T0, T1, T2, T3, T4, T5, T6> pushFrontInlineBy(Iterable<? extends Stream<? extends T0>> t0) {
            return (Iterative7Inline<T0, T1, T2, T3, T4, T5, T6>) super.<T0>pushFrontInlineBy(t0);
        }

        @Override
        public <R1, R2, R3, R4, R5, R6> Iterative6Inline<R1, R2, R3, R4, R5, R6> map(Fn1<? super T1, ? extends R1> f1, Fn1<? super T2, ? extends R2> f2, Fn1<? super T3, ? extends R3> f3, Fn1<? super T4, ? extends R4> f4, Fn1<? super T5, ? extends R5> f5, Fn1<? super T6, ? extends R6> f6) {
            return (Iterative6Inline<R1, R2, R3, R4, R5, R6>) super.<R1, R2, R3, R4, R5, R6>map(f1, f2, f3, f4, f5, f6);
        }

        @Override
        public <R1, R2, R3, R4, R5, R6> Iterative6Inline<R1, R2, R3, R4, R5, R6> inlineMap(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5, Fn1<? super T6, ? extends Iterable<? extends R6>> f6) {
            return (Iterative6Inline<R1, R2, R3, R4, R5, R6>) super.<R1, R2, R3, R4, R5, R6>inlineMap(f1, f2, f3, f4, f5, f6);
        }

        @Override
        public Iterative6Inline<T1, T2, T3, T4, T5, T6> filter(Pr1<? super T1> p1, Pr1<? super T2> p2, Pr1<? super T3> p3, Pr1<? super T4> p4, Pr1<? super T5> p5, Pr1<? super T6> p6) {
            return (Iterative6Inline<T1, T2, T3, T4, T5, T6>) super.filter(p1, p2, p3, p4, p5, p6);
        }

    }

}

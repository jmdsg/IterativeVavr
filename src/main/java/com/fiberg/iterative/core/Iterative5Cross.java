package com.fiberg.iterative.core;

import com.fiberg.iterative.function.*;
import io.vavr.Tuple;
import io.vavr.Tuple5;
import io.vavr.collection.Stream;

public interface Iterative5Cross<T1, T2, T3, T4, T5> extends Iterative5<T1, T2, T3, T4, T5> {

    @Override
    public Iterative5Cross<T1, T2, T3, T4, T5> nonNullable();

    @Override
    public Iterative5Cross<T1, T2, T3, T4, T5> nullable();

    @Override
    public Iterative5Cross<T1, T2, T3, T4, T5> forceCleanEmpty1();

    @Override
    public Iterative5Cross<T1, T2, T3, T4, T5> forceCleanEmpty2();

    @Override
    public Iterative5Cross<T1, T2, T3, T4, T5> forceCleanEmpty3();

    @Override
    public Iterative5Cross<T1, T2, T3, T4, T5> forceCleanEmpty4();

    @Override
    public Iterative5Cross<T1, T2, T3, T4, T5> forceCleanEmpty5();

    @Override
    public Iterative5Cross<T1, T2, T3, T4, T5> forceCleanEmptyAll();

    @Override
    public <T6> Iterative6Cross<T1, T2, T3, T4, T5, T6> pushBackBy(Iterable<? extends Stream<? extends T6>> i1);

    @Override
    public <T0> Iterative6Cross<T0, T1, T2, T3, T4, T5> pushFrontBy(Iterable<? extends Stream<? extends T0>> i1);

    @Override
    public <T0> Iterative6Cross<T0, T1, T2, T3, T4, T5> pushFrontCrossBy(Iterable<? extends Stream<? extends T0>> i1);

    @Override
    public <T0> Iterative6Cross<T0, T1, T2, T3, T4, T5> pushFrontInlineBy(Iterable<? extends Stream<? extends T0>> i1);

    @Override
    public <R1, R2, R3, R4, R5> Iterative5Cross<R1, R2, R3, R4, R5> map(Fn1<? super T1, ? extends R1> f1, Fn1<? super T2, ? extends R2> f2, Fn1<? super T3, ? extends R3> f3, Fn1<? super T4, ? extends R4> f4, Fn1<? super T5, ? extends R5> f5);

    @Override
    public <R1, R2, R3, R4, R5> Iterative5Cross<R1, R2, R3, R4, R5> inlineMap(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> i2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> i4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5);

    @Override
    public Iterative5Cross<T1, T2, T3, T4, T5> filter(Pr1<? super T1> p1, Pr1<? super T2> p2, Pr1<? super T3> p3, Pr1<? super T4> p4, Pr1<? super T5> p5);

    @Override
    default public Iterative5Cross<T1, T2, T3, T4, T5> onSuccess(Rn r) {
        return (Iterative5Cross<T1, T2, T3, T4, T5>) Iterative5.super.onSuccess(r);
    }

    @Override
    default public Iterative5Cross<T1, T2, T3, T4, T5> onFailure(Rn r) {
        return (Iterative5Cross<T1, T2, T3, T4, T5>) Iterative5.super.onFailure(r);
    }

    @Override
    default public Iterative5Cross<T1, T2, T3, T4, T5> execute(Cs1<? super Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> c) {
        return (Iterative5Cross<T1, T2, T3, T4, T5>) Iterative5.super.execute(c);
    }

    @Override
    default public Iterative5Cross<T1, T2, T3, T4, T5> onFailure(Cs1<? super Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> c) {
        return (Iterative5Cross<T1, T2, T3, T4, T5>) Iterative5.super.onFailure(c);
    }

    @Override
    default public Iterative5Cross<T1, T2, T3, T4, T5> onSuccess(Cs1<? super Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> c) {
        return (Iterative5Cross<T1, T2, T3, T4, T5>) Iterative5.super.onSuccess(c);
    }

    @Override
    default public Iterative5Cross<T1, T2, T3, T4, T5> forEach(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        return (Iterative5Cross<T1, T2, T3, T4, T5>) Iterative5.super.forEach(c);
    }

    @Override
    default public <R> Iterative5Cross<R, T2, T3, T4, T5> map1(Fn1<? super T1, ? extends R> f) {
        return (Iterative5Cross<R, T2, T3, T4, T5>) Iterative5.super.<R>map1(f);
    }

    @Override
    default public <R> Iterative5Cross<T1, R, T3, T4, T5> map2(Fn1<? super T2, ? extends R> f) {
        return (Iterative5Cross<T1, R, T3, T4, T5>) Iterative5.super.<R>map2(f);
    }

    @Override
    default public <R> Iterative5Cross<T1, T2, R, T4, T5> map3(Fn1<? super T3, ? extends R> f) {
        return (Iterative5Cross<T1, T2, R, T4, T5>) Iterative5.super.<R>map3(f);
    }

    @Override
    default public <R> Iterative5Cross<T1, T2, T3, R, T5> map4(Fn1<? super T4, ? extends R> f) {
        return (Iterative5Cross<T1, T2, T3, R, T5>) Iterative5.super.<R>map4(f);
    }

    @Override
    default public <R> Iterative5Cross<T1, T2, T3, T4, R> map5(Fn1<? super T5, ? extends R> f) {
        return (Iterative5Cross<T1, T2, T3, T4, R>) Iterative5.super.<R>map5(f);
    }

    @Override
    default public <R> Iterative5Cross<R, T2, T3, T4, T5> inlineMap1(Fn1<? super T1, ? extends Iterable<? extends R>> f) {
        return (Iterative5Cross<R, T2, T3, T4, T5>) Iterative5.super.<R>inlineMap1(f);
    }

    @Override
    default public <R> Iterative5Cross<T1, R, T3, T4, T5> inlineMap2(Fn1<? super T2, ? extends Iterable<? extends R>> f) {
        return (Iterative5Cross<T1, R, T3, T4, T5>) Iterative5.super.<R>inlineMap2(f);
    }

    @Override
    default public <R> Iterative5Cross<T1, T2, R, T4, T5> inlineMap3(Fn1<? super T3, ? extends Iterable<? extends R>> f) {
        return (Iterative5Cross<T1, T2, R, T4, T5>) Iterative5.super.<R>inlineMap3(f);
    }

    @Override
    default public <R> Iterative5Cross<T1, T2, T3, R, T5> inlineMap4(Fn1<? super T4, ? extends Iterable<? extends R>> f) {
        return (Iterative5Cross<T1, T2, T3, R, T5>) Iterative5.super.<R>inlineMap4(f);
    }

    @Override
    default public <R> Iterative5Cross<T1, T2, T3, T4, R> inlineMap5(Fn1<? super T5, ? extends Iterable<? extends R>> f) {
        return (Iterative5Cross<T1, T2, T3, T4, R>) Iterative5.super.<R>inlineMap5(f);
    }

    @Override
    default public Iterative5Cross<T1, T2, T3, T4, T5> filter1(Pr1<? super T1> p) {
        return (Iterative5Cross<T1, T2, T3, T4, T5>) Iterative5.super.filter1(p);
    }

    @Override
    default public Iterative5Cross<T1, T2, T3, T4, T5> filter2(Pr1<? super T2> p) {
        return (Iterative5Cross<T1, T2, T3, T4, T5>) Iterative5.super.filter2(p);
    }

    @Override
    default public Iterative5Cross<T1, T2, T3, T4, T5> filter3(Pr1<? super T3> p) {
        return (Iterative5Cross<T1, T2, T3, T4, T5>) Iterative5.super.filter3(p);
    }

    @Override
    default public Iterative5Cross<T1, T2, T3, T4, T5> filter4(Pr1<? super T4> p) {
        return (Iterative5Cross<T1, T2, T3, T4, T5>) Iterative5.super.filter4(p);
    }

    @Override
    default public Iterative5Cross<T1, T2, T3, T4, T5> filter5(Pr1<? super T5> p) {
        return (Iterative5Cross<T1, T2, T3, T4, T5>) Iterative5.super.filter5(p);
    }

    @Override
    default public <T6> Iterative6Cross<T1, T2, T3, T4, T5, T6> pushBack(T6 t6) {
        return (Iterative6Cross<T1, T2, T3, T4, T5, T6>) Iterative5.super.<T6>pushBack(t6);
    }

    @Override
    default public <T0> Iterative6Cross<T0, T1, T2, T3, T4, T5> pushFront(T0 t0) {
        return (Iterative6Cross<T0, T1, T2, T3, T4, T5>) Iterative5.super.<T0>pushFront(t0);
    }

    @Override
    default public <T0> Iterative6Cross<T0, T1, T2, T3, T4, T5> pushFrontCross(T0 t0) {
        return (Iterative6Cross<T0, T1, T2, T3, T4, T5>) Iterative5.super.<T0>pushFrontCross(t0);
    }

    @Override
    default public <T0> Iterative6Cross<T0, T1, T2, T3, T4, T5> pushFrontInline(T0 t0) {
        return (Iterative6Cross<T0, T1, T2, T3, T4, T5>) Iterative5.super.<T0>pushFrontInline(t0);
    }

    @Override
    default public <T6> Iterative6Cross<T1, T2, T3, T4, T5, T6> pushBackOf(Iterable<? extends T6> t6) {
        return (Iterative6Cross<T1, T2, T3, T4, T5, T6>) Iterative5.super.<T6>pushBackOf(t6);
    }

    @Override
    default public <T0> Iterative6Cross<T0, T1, T2, T3, T4, T5> pushFrontOf(Iterable<? extends T0> t0) {
        return (Iterative6Cross<T0, T1, T2, T3, T4, T5>) Iterative5.super.<T0>pushFrontOf(t0);
    }

    @Override
    default public <T0> Iterative6Cross<T0, T1, T2, T3, T4, T5> pushFrontCrossOf(Iterable<? extends T0> t0) {
        return (Iterative6Cross<T0, T1, T2, T3, T4, T5>) Iterative5.super.<T0>pushFrontCrossOf(t0);
    }

    @Override
    default public <T0> Iterative6Cross<T0, T1, T2, T3, T4, T5> pushFrontInlineOf(Iterable<? extends T0> t0) {
        return (Iterative6Cross<T0, T1, T2, T3, T4, T5>) Iterative5.super.<T0>pushFrontInlineOf(t0);
    }

    @Override
    default public <B1, B2> Iterative7Cross<T1, T2, T3, T4, T5, B1, B2> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2) {
        return (Iterative7Cross<T1, T2, T3, T4, T5, B1, B2>) Iterative5.super.<B1, B2>pushBackBy(b1, b2);
    }

    @Override
    default public <F1, F2> Iterative7Cross<F1, F2, T1, T2, T3, T4, T5> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return (Iterative7Cross<F1, F2, T1, T2, T3, T4, T5>) Iterative5.super.<F1, F2>pushFrontBy(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative7Cross<F1, F2, T1, T2, T3, T4, T5> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return (Iterative7Cross<F1, F2, T1, T2, T3, T4, T5>) Iterative5.super.<F1, F2>pushFrontCrossBy(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative7Cross<F1, F2, T1, T2, T3, T4, T5> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return (Iterative7Cross<F1, F2, T1, T2, T3, T4, T5>) Iterative5.super.<F1, F2>pushFrontInlineBy(f1, f2);
    }

    @Override
    default public <B1, B2> Iterative7Cross<T1, T2, T3, T4, T5, B1, B2> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2) {
        return (Iterative7Cross<T1, T2, T3, T4, T5, B1, B2>) Iterative5.super.<B1, B2>pushBackOf(b1, b2);
    }

    @Override
    default public <F1, F2> Iterative7Cross<F1, F2, T1, T2, T3, T4, T5> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return (Iterative7Cross<F1, F2, T1, T2, T3, T4, T5>) Iterative5.super.<F1, F2>pushFrontOf(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative7Cross<F1, F2, T1, T2, T3, T4, T5> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return (Iterative7Cross<F1, F2, T1, T2, T3, T4, T5>) Iterative5.super.<F1, F2>pushFrontCrossOf(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative7Cross<F1, F2, T1, T2, T3, T4, T5> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return (Iterative7Cross<F1, F2, T1, T2, T3, T4, T5>) Iterative5.super.<F1, F2>pushFrontInlineOf(f1, f2);
    }

    @Override
    default public <B1, B2> Iterative7Cross<T1, T2, T3, T4, T5, B1, B2> pushBack(B1 b1, B2 b2) {
        return (Iterative7Cross<T1, T2, T3, T4, T5, B1, B2>) Iterative5.super.<B1, B2>pushBack(b1, b2);
    }

    @Override
    default public <F1, F2> Iterative7Cross<F1, F2, T1, T2, T3, T4, T5> pushFront(F1 f1, F2 f2) {
        return (Iterative7Cross<F1, F2, T1, T2, T3, T4, T5>) Iterative5.super.<F1, F2>pushFront(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative7Cross<F1, F2, T1, T2, T3, T4, T5> pushFrontCross(F1 f1, F2 f2) {
        return (Iterative7Cross<F1, F2, T1, T2, T3, T4, T5>) Iterative5.super.<F1, F2>pushFrontCross(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative7Cross<F1, F2, T1, T2, T3, T4, T5> pushFrontInline(F1 f1, F2 f2) {
        return (Iterative7Cross<F1, F2, T1, T2, T3, T4, T5>) Iterative5.super.<F1, F2>pushFrontInline(f1, f2);
    }

    @Override
    default public <B1, B2, B3> Iterative8Cross<T1, T2, T3, T4, T5, B1, B2, B3> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3) {
        return (Iterative8Cross<T1, T2, T3, T4, T5, B1, B2, B3>) Iterative5.super.<B1, B2, B3>pushBackBy(b1, b2, b3);
    }

    @Override
    default public <F1, F2, F3> Iterative8Cross<F1, F2, F3, T1, T2, T3, T4, T5> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3) {
        return (Iterative8Cross<F1, F2, F3, T1, T2, T3, T4, T5>) Iterative5.super.<F1, F2, F3>pushFrontBy(f1, f2, f3);
    }

    @Override
    default public <F1, F2, F3> Iterative8Cross<F1, F2, F3, T1, T2, T3, T4, T5> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3) {
        return (Iterative8Cross<F1, F2, F3, T1, T2, T3, T4, T5>) Iterative5.super.<F1, F2, F3>pushFrontCrossBy(f1, f2, f3);
    }

    @Override
    default public <F1, F2, F3> Iterative8Cross<F1, F2, F3, T1, T2, T3, T4, T5> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3) {
        return (Iterative8Cross<F1, F2, F3, T1, T2, T3, T4, T5>) Iterative5.super.<F1, F2, F3>pushFrontInlineBy(f1, f2, f3);
    }

    @Override
    default public <B1, B2, B3> Iterative8Cross<T1, T2, T3, T4, T5, B1, B2, B3> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3) {
        return (Iterative8Cross<T1, T2, T3, T4, T5, B1, B2, B3>) Iterative5.super.<B1, B2, B3>pushBackOf(b1, b2, b3);
    }

    @Override
    default public <F1, F2, F3> Iterative8Cross<F1, F2, F3, T1, T2, T3, T4, T5> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3) {
        return (Iterative8Cross<F1, F2, F3, T1, T2, T3, T4, T5>) Iterative5.super.<F1, F2, F3>pushFrontOf(f1, f2, f3);
    }

    @Override
    default public <F1, F2, F3> Iterative8Cross<F1, F2, F3, T1, T2, T3, T4, T5> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3) {
        return (Iterative8Cross<F1, F2, F3, T1, T2, T3, T4, T5>) Iterative5.super.<F1, F2, F3>pushFrontCrossOf(f1, f2, f3);
    }

    @Override
    default public <F1, F2, F3> Iterative8Cross<F1, F2, F3, T1, T2, T3, T4, T5> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3) {
        return (Iterative8Cross<F1, F2, F3, T1, T2, T3, T4, T5>) Iterative5.super.<F1, F2, F3>pushFrontInlineOf(f1, f2, f3);
    }

    @Override
    default public <B1, B2, B3> Iterative8Cross<T1, T2, T3, T4, T5, B1, B2, B3> pushBack(B1 b1, B2 b2, B3 b3) {
        return (Iterative8Cross<T1, T2, T3, T4, T5, B1, B2, B3>) Iterative5.super.<B1, B2, B3>pushBack(b1, b2, b3);
    }

    @Override
    default public <F1, F2, F3> Iterative8Cross<F1, F2, F3, T1, T2, T3, T4, T5> pushFront(F1 f1, F2 f2, F3 f3) {
        return (Iterative8Cross<F1, F2, F3, T1, T2, T3, T4, T5>) Iterative5.super.<F1, F2, F3>pushFront(f1, f2, f3);
    }

    @Override
    default public <F1, F2, F3> Iterative8Cross<F1, F2, F3, T1, T2, T3, T4, T5> pushFrontCross(F1 f1, F2 f2, F3 f3) {
        return (Iterative8Cross<F1, F2, F3, T1, T2, T3, T4, T5>) Iterative5.super.<F1, F2, F3>pushFrontCross(f1, f2, f3);
    }

    @Override
    default public <F1, F2, F3> Iterative8Cross<F1, F2, F3, T1, T2, T3, T4, T5> pushFrontInline(F1 f1, F2 f2, F3 f3) {
        return (Iterative8Cross<F1, F2, F3, T1, T2, T3, T4, T5>) Iterative5.super.<F1, F2, F3>pushFrontInline(f1, f2, f3);
    }

    public static class Iterative5CrossNonNullable<T1, T2, T3, T4, T5> extends Iterative5CrossAbstract<T1, T2, T3, T4, T5> implements Iterative5Cross<T1, T2, T3, T4, T5>, IterativeWrapper.IterativeWrapperNonNullable, IterativeWrapper.IterativeCross {

        Iterative5CrossNonNullable(Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4> iterative, Iterable<? extends T5> right) {
            super(iterative, right);
        }

        Iterative5CrossNonNullable(Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4> iterative, Iterable<? extends Stream<? extends T5>> right, boolean ign) {
            super(iterative, right, ign);
        }

    }

    public static class Iterative5CrossNullable<T1, T2, T3, T4, T5> extends Iterative5CrossAbstract<T1, T2, T3, T4, T5> implements Iterative5Cross<T1, T2, T3, T4, T5>, IterativeWrapper.IterativeWrapperNullable, IterativeWrapper.IterativeCross {

        Iterative5CrossNullable(Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4> iterative, Iterable<? extends T5> right) {
            super(iterative, right);
        }

        Iterative5CrossNullable(Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4> iterative, Iterable<? extends Stream<? extends T5>> right, boolean ign) {
            super(iterative, right, ign);
        }

    }

    public static abstract class Iterative5CrossAbstract<T1, T2, T3, T4, T5> extends Iterative5.Iterative5Abstract<T1, T2, T3, T4, T5> implements Iterative5Cross<T1, T2, T3, T4, T5> {

        Iterative5CrossAbstract(Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4> iterative, Iterable<? extends T5> right) {
            super(iterative, right);
        }

        Iterative5CrossAbstract(Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4> iterative, Iterable<? extends Stream<? extends T5>> right, boolean ign) {
            super(iterative, right, ign);
        }

        @Override
        public Stream<Tuple5<Iterable<T1>, Iterable<T2>, Iterable<T3>, Iterable<T4>, Iterable<T5>>> toTupleStream() {
            return this.iterative.toTupleStream().crossProduct(IterativeHandler.transform(this.right)).toStream().map(Fn2.tuple((tuple, right) -> Tuple.of(tuple._1(), tuple._2(), tuple._3(), tuple._4(), right)));
        }

        @Override
        public Iterative5Cross<T1, T2, T3, T4, T5> nonNullable() {
            return (Iterative5Cross<T1, T2, T3, T4, T5>) super.nonNullable();
        }

        @Override
        public Iterative5Cross<T1, T2, T3, T4, T5> nullable() {
            return (Iterative5Cross<T1, T2, T3, T4, T5>) super.nullable();
        }

        @Override
        public Iterative5Cross<T1, T2, T3, T4, T5> forceCleanEmpty1() {
            return (Iterative5Cross<T1, T2, T3, T4, T5>) super.forceCleanEmpty1();
        }

        @Override
        public Iterative5Cross<T1, T2, T3, T4, T5> forceCleanEmpty2() {
            return (Iterative5Cross<T1, T2, T3, T4, T5>) super.forceCleanEmpty2();
        }

        @Override
        public Iterative5Cross<T1, T2, T3, T4, T5> forceCleanEmpty3() {
            return (Iterative5Cross<T1, T2, T3, T4, T5>) super.forceCleanEmpty3();
        }

        @Override
        public Iterative5Cross<T1, T2, T3, T4, T5> forceCleanEmpty4() {
            return (Iterative5Cross<T1, T2, T3, T4, T5>) super.forceCleanEmpty4();
        }

        @Override
        public Iterative5Cross<T1, T2, T3, T4, T5> forceCleanEmpty5() {
            return (Iterative5Cross<T1, T2, T3, T4, T5>) super.forceCleanEmpty5();
        }

        @Override
        public Iterative5Cross<T1, T2, T3, T4, T5> forceCleanEmptyAll() {
            return (Iterative5Cross<T1, T2, T3, T4, T5>) super.forceCleanEmptyAll();
        }

        @Override
        public <T6> Iterative6Cross<T1, T2, T3, T4, T5, T6> pushBackBy(Iterable<? extends Stream<? extends T6>> t6) {
            return (Iterative6Cross<T1, T2, T3, T4, T5, T6>) super.<T6>pushBackBy(t6);
        }

        @Override
        public <T0> Iterative6Cross<T0, T1, T2, T3, T4, T5> pushFrontBy(Iterable<? extends Stream<? extends T0>> t0) {
            return (Iterative6Cross<T0, T1, T2, T3, T4, T5>) super.<T0>pushFrontBy(t0);
        }

        @Override
        public <T0> Iterative6Cross<T0, T1, T2, T3, T4, T5> pushFrontCrossBy(Iterable<? extends Stream<? extends T0>> t0) {
            return (Iterative6Cross<T0, T1, T2, T3, T4, T5>) super.<T0>pushFrontCrossBy(t0);
        }

        @Override
        public <T0> Iterative6Cross<T0, T1, T2, T3, T4, T5> pushFrontInlineBy(Iterable<? extends Stream<? extends T0>> t0) {
            return (Iterative6Cross<T0, T1, T2, T3, T4, T5>) super.<T0>pushFrontInlineBy(t0);
        }

        @Override
        public <R1, R2, R3, R4, R5> Iterative5Cross<R1, R2, R3, R4, R5> map(Fn1<? super T1, ? extends R1> f1, Fn1<? super T2, ? extends R2> f2, Fn1<? super T3, ? extends R3> f3, Fn1<? super T4, ? extends R4> f4, Fn1<? super T5, ? extends R5> f5) {
            return (Iterative5Cross<R1, R2, R3, R4, R5>) super.<R1, R2, R3, R4, R5>map(f1, f2, f3, f4, f5);
        }

        @Override
        public <R1, R2, R3, R4, R5> Iterative5Cross<R1, R2, R3, R4, R5> inlineMap(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5) {
            return (Iterative5Cross<R1, R2, R3, R4, R5>) super.<R1, R2, R3, R4, R5>inlineMap(f1, f2, f3, f4, f5);
        }

        @Override
        public Iterative5Cross<T1, T2, T3, T4, T5> filter(Pr1<? super T1> p1, Pr1<? super T2> p2, Pr1<? super T3> p3, Pr1<? super T4> p4, Pr1<? super T5> p5) {
            return (Iterative5Cross<T1, T2, T3, T4, T5>) super.filter(p1, p2, p3, p4, p5);
        }

    }

}

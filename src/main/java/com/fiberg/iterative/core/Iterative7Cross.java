package com.fiberg.iterative.core;

import com.fiberg.iterative.core.Iterative6;
import com.fiberg.iterative.core.Iterative7;
import com.fiberg.iterative.core.Iterative8Cross;
import com.fiberg.iterative.core.IterativeHandler;
import com.fiberg.iterative.core.IterativeWrapper;
import com.fiberg.iterative.function.Cs1;
import com.fiberg.iterative.function.Cs7;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fn2;
import com.fiberg.iterative.function.Pr1;
import com.fiberg.iterative.function.Rn;
import io.vavr.Tuple;
import io.vavr.Tuple7;
import io.vavr.collection.Stream;
import java.io.Serializable;

public interface Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> extends Iterative7<T1, T2, T3, T4, T5, T6, T7> {

    @Override
    public Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> nonNullable();

    @Override
    public Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> nullable();

    @Override
    public Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> forceCleanEmpty1();

    @Override
    public Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> forceCleanEmpty2();

    @Override
    public Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> forceCleanEmpty3();

    @Override
    public Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> forceCleanEmpty4();

    @Override
    public Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> forceCleanEmpty5();

    @Override
    public Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> forceCleanEmpty6();

    @Override
    public Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> forceCleanEmpty7();

    @Override
    public Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> forceCleanEmptyAll();

    @Override
    public <T8> Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> pushBackBy(Iterable<? extends Stream<? extends T8>> var1);

    @Override
    public <T0> Iterative8Cross<T0, T1, T2, T3, T4, T5, T6, T7> pushFrontBy(Iterable<? extends Stream<? extends T0>> var1);

    @Override
    public <T0> Iterative8Cross<T0, T1, T2, T3, T4, T5, T6, T7> pushFrontCrossBy(Iterable<? extends Stream<? extends T0>> var1);

    @Override
    public <T0> Iterative8Cross<T0, T1, T2, T3, T4, T5, T6, T7> pushFrontInlineBy(Iterable<? extends Stream<? extends T0>> var1);

    @Override
    public <R1, R2, R3, R4, R5, R6, R7> Iterative7Cross<R1, R2, R3, R4, R5, R6, R7> map(Fn1<? super T1, ? extends R1> var1, Fn1<? super T2, ? extends R2> var2, Fn1<? super T3, ? extends R3> var3, Fn1<? super T4, ? extends R4> var4, Fn1<? super T5, ? extends R5> var5, Fn1<? super T6, ? extends R6> var6, Fn1<? super T7, ? extends R7> var7);

    @Override
    public <R1, R2, R3, R4, R5, R6, R7> Iterative7Cross<R1, R2, R3, R4, R5, R6, R7> inlineMap(Fn1<? super T1, ? extends Iterable<? extends R1>> var1, Fn1<? super T2, ? extends Iterable<? extends R2>> var2, Fn1<? super T3, ? extends Iterable<? extends R3>> var3, Fn1<? super T4, ? extends Iterable<? extends R4>> var4, Fn1<? super T5, ? extends Iterable<? extends R5>> var5, Fn1<? super T6, ? extends Iterable<? extends R6>> var6, Fn1<? super T7, ? extends Iterable<? extends R7>> var7);

    @Override
    public Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> filter(Pr1<? super T1> var1, Pr1<? super T2> var2, Pr1<? super T3> var3, Pr1<? super T4> var4, Pr1<? super T5> var5, Pr1<? super T6> var6, Pr1<? super T7> var7);

    @Override
    default public Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> onSuccess(Rn r) {
        return (Iterative7Cross<T1, T2, T3, T4, T5, T6, T7>) Iterative7.super.onSuccess(r);
    }

    @Override
    default public Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> onFailure(Rn r) {
        return (Iterative7Cross<T1, T2, T3, T4, T5, T6, T7>) Iterative7.super.onFailure(r);
    }

    @Override
    default public Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> execute(Cs1<? super Iterative7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> c) {
        return (Iterative7Cross<T1, T2, T3, T4, T5, T6, T7>) Iterative7.super.execute(c);
    }

    @Override
    default public Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> onFailure(Cs1<? super Iterative7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> c) {
        return (Iterative7Cross<T1, T2, T3, T4, T5, T6, T7>) Iterative7.super.onFailure(c);
    }

    @Override
    default public Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> onSuccess(Cs1<? super Iterative7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> c) {
        return (Iterative7Cross<T1, T2, T3, T4, T5, T6, T7>) Iterative7.super.onSuccess(c);
    }

    @Override
    default public Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> forEach(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c) {
        return (Iterative7Cross<T1, T2, T3, T4, T5, T6, T7>) Iterative7.super.forEach(c);
    }

    @Override
    default public <R> Iterative7Cross<R, T2, T3, T4, T5, T6, T7> map1(Fn1<? super T1, ? extends R> f) {
        return (Iterative7Cross<R, T2, T3, T4, T5, T6, T7>) Iterative7.super.<R>map1(f);
    }

    @Override
    default public <R> Iterative7Cross<T1, R, T3, T4, T5, T6, T7> map2(Fn1<? super T2, ? extends R> f) {
        return (Iterative7Cross<T1, R, T3, T4, T5, T6, T7>) Iterative7.super.<R>map2(f);
    }

    @Override
    default public <R> Iterative7Cross<T1, T2, R, T4, T5, T6, T7> map3(Fn1<? super T3, ? extends R> f) {
        return (Iterative7Cross<T1, T2, R, T4, T5, T6, T7>) Iterative7.super.<R>map3(f);
    }

    @Override
    default public <R> Iterative7Cross<T1, T2, T3, R, T5, T6, T7> map4(Fn1<? super T4, ? extends R> f) {
        return (Iterative7Cross<T1, T2, T3, R, T5, T6, T7>) Iterative7.super.<R>map4(f);
    }

    @Override
    default public <R> Iterative7Cross<T1, T2, T3, T4, R, T6, T7> map5(Fn1<? super T5, ? extends R> f) {
        return (Iterative7Cross<T1, T2, T3, T4, R, T6, T7>) Iterative7.super.<R>map5(f);
    }

    @Override
    default public <R> Iterative7Cross<T1, T2, T3, T4, T5, R, T7> map6(Fn1<? super T6, ? extends R> f) {
        return (Iterative7Cross<T1, T2, T3, T4, T5, R, T7>) Iterative7.super.<R>map6(f);
    }

    @Override
    default public <R> Iterative7Cross<T1, T2, T3, T4, T5, T6, R> map7(Fn1<? super T7, ? extends R> f) {
        return (Iterative7Cross<T1, T2, T3, T4, T5, T6, R>) Iterative7.super.<R>map7(f);
    }

    @Override
    default public <R> Iterative7Cross<R, T2, T3, T4, T5, T6, T7> inlineMap1(Fn1<? super T1, ? extends Iterable<? extends R>> f) {
        return (Iterative7Cross<R, T2, T3, T4, T5, T6, T7>) Iterative7.super.<R>inlineMap1(f);
    }

    @Override
    default public <R> Iterative7Cross<T1, R, T3, T4, T5, T6, T7> inlineMap2(Fn1<? super T2, ? extends Iterable<? extends R>> f) {
        return (Iterative7Cross<T1, R, T3, T4, T5, T6, T7>) Iterative7.super.<R>inlineMap2(f);
    }

    @Override
    default public <R> Iterative7Cross<T1, T2, R, T4, T5, T6, T7> inlineMap3(Fn1<? super T3, ? extends Iterable<? extends R>> f) {
        return (Iterative7Cross<T1, T2, R, T4, T5, T6, T7>) Iterative7.super.<R>inlineMap3(f);
    }

    @Override
    default public <R> Iterative7Cross<T1, T2, T3, R, T5, T6, T7> inlineMap4(Fn1<? super T4, ? extends Iterable<? extends R>> f) {
        return (Iterative7Cross<T1, T2, T3, R, T5, T6, T7>) Iterative7.super.<R>inlineMap4(f);
    }

    @Override
    default public <R> Iterative7Cross<T1, T2, T3, T4, R, T6, T7> inlineMap5(Fn1<? super T5, ? extends Iterable<? extends R>> f) {
        return (Iterative7Cross<T1, T2, T3, T4, R, T6, T7>) Iterative7.super.<R>inlineMap5(f);
    }

    @Override
    default public <R> Iterative7Cross<T1, T2, T3, T4, T5, R, T7> inlineMap6(Fn1<? super T6, ? extends Iterable<? extends R>> f) {
        return (Iterative7Cross<T1, T2, T3, T4, T5, R, T7>) Iterative7.super.<R>inlineMap6(f);
    }

    @Override
    default public <R> Iterative7Cross<T1, T2, T3, T4, T5, T6, R> inlineMap7(Fn1<? super T7, ? extends Iterable<? extends R>> f) {
        return (Iterative7Cross<T1, T2, T3, T4, T5, T6, R>) Iterative7.super.<R>inlineMap7(f);
    }

    @Override
    default public Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> filter1(Pr1<? super T1> p) {
        return (Iterative7Cross<T1, T2, T3, T4, T5, T6, T7>) Iterative7.super.filter1(p);
    }

    @Override
    default public Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> filter2(Pr1<? super T2> p) {
        return (Iterative7Cross<T1, T2, T3, T4, T5, T6, T7>) Iterative7.super.filter2(p);
    }

    @Override
    default public Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> filter3(Pr1<? super T3> p) {
        return (Iterative7Cross<T1, T2, T3, T4, T5, T6, T7>) Iterative7.super.filter3(p);
    }

    @Override
    default public Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> filter4(Pr1<? super T4> p) {
        return (Iterative7Cross<T1, T2, T3, T4, T5, T6, T7>) Iterative7.super.filter4(p);
    }

    @Override
    default public Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> filter5(Pr1<? super T5> p) {
        return (Iterative7Cross<T1, T2, T3, T4, T5, T6, T7>) Iterative7.super.filter5(p);
    }

    @Override
    default public Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> filter6(Pr1<? super T6> p) {
        return (Iterative7Cross<T1, T2, T3, T4, T5, T6, T7>) Iterative7.super.filter6(p);
    }

    @Override
    default public Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> filter7(Pr1<? super T7> p) {
        return (Iterative7Cross<T1, T2, T3, T4, T5, T6, T7>) Iterative7.super.filter7(p);
    }

    @Override
    default public <T8> Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> pushBack(T8 t8) {
        return (Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8>) Iterative7.super.<T8>pushBack(t8);
    }

    @Override
    default public <T0> Iterative8Cross<T0, T1, T2, T3, T4, T5, T6, T7> pushFront(T0 t0) {
        return (Iterative8Cross<T0, T1, T2, T3, T4, T5, T6, T7>) Iterative7.super.<T0>pushFront(t0);
    }

    @Override
    default public <T0> Iterative8Cross<T0, T1, T2, T3, T4, T5, T6, T7> pushFrontCross(T0 t0) {
        return (Iterative8Cross<T0, T1, T2, T3, T4, T5, T6, T7>) Iterative7.super.<T0>pushFrontCross(t0);
    }

    @Override
    default public <T0> Iterative8Cross<T0, T1, T2, T3, T4, T5, T6, T7> pushFrontInline(T0 t0) {
        return (Iterative8Cross<T0, T1, T2, T3, T4, T5, T6, T7>) Iterative7.super.<T0>pushFrontInline(t0);
    }

    @Override
    default public <T8> Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> pushBackOf(Iterable<? extends T8> t8) {
        return (Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8>) Iterative7.super.<T8>pushBackOf(t8);
    }

    @Override
    default public <T0> Iterative8Cross<T0, T1, T2, T3, T4, T5, T6, T7> pushFrontOf(Iterable<? extends T0> t0) {
        return (Iterative8Cross<T0, T1, T2, T3, T4, T5, T6, T7>) Iterative7.super.<T0>pushFrontOf(t0);
    }

    @Override
    default public <T0> Iterative8Cross<T0, T1, T2, T3, T4, T5, T6, T7> pushFrontCrossOf(Iterable<? extends T0> t0) {
        return (Iterative8Cross<T0, T1, T2, T3, T4, T5, T6, T7>) Iterative7.super.<T0>pushFrontCrossOf(t0);
    }

    @Override
    default public <T0> Iterative8Cross<T0, T1, T2, T3, T4, T5, T6, T7> pushFrontInlineOf(Iterable<? extends T0> t0) {
        return (Iterative8Cross<T0, T1, T2, T3, T4, T5, T6, T7>) Iterative7.super.<T0>pushFrontInlineOf(t0);
    }

    public static class Iterative7CrossNonNullable<T1, T2, T3, T4, T5, T6, T7> extends Iterative7CrossAbstract<T1, T2, T3, T4, T5, T6, T7> implements Iterative7Cross<T1, T2, T3, T4, T5, T6, T7>, IterativeWrapper.IterativeWrapperNonNullable, IterativeWrapper.IterativeCross {

        Iterative7CrossNonNullable(Iterative6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> iterative, Iterable<? extends T7> right) {
            super(iterative, right);
        }

        Iterative7CrossNonNullable(Iterative6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> iterative, Iterable<? extends Stream<? extends T7>> right, boolean ign) {
            super(iterative, right, ign);
        }

    }

    public static class Iterative7CrossNullable<T1, T2, T3, T4, T5, T6, T7> extends Iterative7CrossAbstract<T1, T2, T3, T4, T5, T6, T7> implements Iterative7Cross<T1, T2, T3, T4, T5, T6, T7>, IterativeWrapper.IterativeWrapperNullable, IterativeWrapper.IterativeCross {

        Iterative7CrossNullable(Iterative6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> iterative, Iterable<? extends T7> right) {
            super(iterative, right);
        }

        Iterative7CrossNullable(Iterative6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> iterative, Iterable<? extends Stream<? extends T7>> right, boolean ign) {
            super(iterative, right, ign);
        }

    }

    public static abstract class Iterative7CrossAbstract<T1, T2, T3, T4, T5, T6, T7> extends Iterative7.Iterative7Abstract<T1, T2, T3, T4, T5, T6, T7> implements Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> {

        Iterative7CrossAbstract(Iterative6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> iterative, Iterable<? extends T7> right) {
            super(iterative, right);
        }

        Iterative7CrossAbstract(Iterative6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> iterative, Iterable<? extends Stream<? extends T7>> right, boolean ign) {
            super(iterative, right, ign);
        }

        @Override
        public Stream<Tuple7<Iterable<T1>, Iterable<T2>, Iterable<T3>, Iterable<T4>, Iterable<T5>, Iterable<T6>, Iterable<T7>>> toTupleStream() {
            return this.iterative.toTupleStream().crossProduct(IterativeHandler.transform(this.right)).toStream().map((tuple, right) -> Tuple.of(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5(), tuple._6(), right)));
        }

        @Override
        public Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> nonNullable() {
            return (Iterative7Cross<T1, T2, T3, T4, T5, T6, T7>) super.nonNullable();
        }

        @Override
        public Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> nullable() {
            return (Iterative7Cross<T1, T2, T3, T4, T5, T6, T7>) super.nullable();
        }

        @Override
        public Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> forceCleanEmpty1() {
            return (Iterative7Cross<T1, T2, T3, T4, T5, T6, T7>) super.forceCleanEmpty1();
        }

        @Override
        public Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> forceCleanEmpty2() {
            return (Iterative7Cross<T1, T2, T3, T4, T5, T6, T7>) super.forceCleanEmpty2();
        }

        @Override
        public Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> forceCleanEmpty3() {
            return (Iterative7Cross<T1, T2, T3, T4, T5, T6, T7>) super.forceCleanEmpty3();
        }

        @Override
        public Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> forceCleanEmpty4() {
            return (Iterative7Cross<T1, T2, T3, T4, T5, T6, T7>) super.forceCleanEmpty4();
        }

        @Override
        public Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> forceCleanEmpty5() {
            return (Iterative7Cross<T1, T2, T3, T4, T5, T6, T7>) super.forceCleanEmpty5();
        }

        @Override
        public Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> forceCleanEmpty6() {
            return (Iterative7Cross<T1, T2, T3, T4, T5, T6, T7>) super.forceCleanEmpty6();
        }

        @Override
        public Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> forceCleanEmpty7() {
            return (Iterative7Cross<T1, T2, T3, T4, T5, T6, T7>) super.forceCleanEmpty7();
        }

        @Override
        public Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> forceCleanEmptyAll() {
            return (Iterative7Cross<T1, T2, T3, T4, T5, T6, T7>) super.forceCleanEmptyAll();
        }

        @Override
        public <T8> Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> pushBackBy(Iterable<? extends Stream<? extends T8>> t8) {
            return (Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8>) super.<T8>pushBackBy(t8);
        }

        @Override
        public <T0> Iterative8Cross<T0, T1, T2, T3, T4, T5, T6, T7> pushFrontBy(Iterable<? extends Stream<? extends T0>> t0) {
            return (Iterative8Cross<T0, T1, T2, T3, T4, T5, T6, T7>) super.<T0>pushFrontBy(t0);
        }

        @Override
        public <T0> Iterative8Cross<T0, T1, T2, T3, T4, T5, T6, T7> pushFrontCrossBy(Iterable<? extends Stream<? extends T0>> t0) {
            return (Iterative8Cross<T0, T1, T2, T3, T4, T5, T6, T7>) super.<T0>pushFrontCrossBy(t0);
        }

        @Override
        public <T0> Iterative8Cross<T0, T1, T2, T3, T4, T5, T6, T7> pushFrontInlineBy(Iterable<? extends Stream<? extends T0>> t0) {
            return (Iterative8Cross<T0, T1, T2, T3, T4, T5, T6, T7>) super.<T0>pushFrontInlineBy(t0);
        }

        @Override
        public <R1, R2, R3, R4, R5, R6, R7> Iterative7Cross<R1, R2, R3, R4, R5, R6, R7> map(Fn1<? super T1, ? extends R1> f1, Fn1<? super T2, ? extends R2> f2, Fn1<? super T3, ? extends R3> f3, Fn1<? super T4, ? extends R4> f4, Fn1<? super T5, ? extends R5> f5, Fn1<? super T6, ? extends R6> f6, Fn1<? super T7, ? extends R7> f7) {
            return (Iterative7Cross<R1, R2, R3, R4, R5, R6, R7>) super.<R1, R2, R3, R4, R5, R6, R7>map(f1, f2, f3, f4, f5, f6, f7);
        }

        @Override
        public <R1, R2, R3, R4, R5, R6, R7> Iterative7Cross<R1, R2, R3, R4, R5, R6, R7> inlineMap(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5, Fn1<? super T6, ? extends Iterable<? extends R6>> f6, Fn1<? super T7, ? extends Iterable<? extends R7>> f7) {
            return (Iterative7Cross<R1, R2, R3, R4, R5, R6, R7>) super.<R1, R2, R3, R4, R5, R6, R7>inlineMap(f1, f2, f3, f4, f5, f6, f7);
        }

        @Override
        public Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> filter(Pr1<? super T1> p1, Pr1<? super T2> p2, Pr1<? super T3> p3, Pr1<? super T4> p4, Pr1<? super T5> p5, Pr1<? super T6> p6, Pr1<? super T7> p7) {
            return (Iterative7Cross<T1, T2, T3, T4, T5, T6, T7>) super.filter(p1, p2, p3, p4, p5, p6, p7);
        }

    }

}

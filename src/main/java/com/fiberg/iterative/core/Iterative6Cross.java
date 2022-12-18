package com.fiberg.iterative.core;

import com.fiberg.iterative.core.Iterative5;
import com.fiberg.iterative.core.Iterative6;
import com.fiberg.iterative.core.Iterative7Cross;
import com.fiberg.iterative.core.Iterative8Cross;
import com.fiberg.iterative.core.IterativeHandler;
import com.fiberg.iterative.core.IterativeWrapper;
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

public interface Iterative6Cross<T1, T2, T3, T4, T5, T6> extends Iterative6<T1, T2, T3, T4, T5, T6> {

    @Override
    public Iterative6Cross<T1, T2, T3, T4, T5, T6> nonNullable();

    @Override
    public Iterative6Cross<T1, T2, T3, T4, T5, T6> nullable();

    @Override
    public Iterative6Cross<T1, T2, T3, T4, T5, T6> forceCleanEmpty1();

    @Override
    public Iterative6Cross<T1, T2, T3, T4, T5, T6> forceCleanEmpty2();

    @Override
    public Iterative6Cross<T1, T2, T3, T4, T5, T6> forceCleanEmpty3();

    @Override
    public Iterative6Cross<T1, T2, T3, T4, T5, T6> forceCleanEmpty4();

    @Override
    public Iterative6Cross<T1, T2, T3, T4, T5, T6> forceCleanEmpty5();

    @Override
    public Iterative6Cross<T1, T2, T3, T4, T5, T6> forceCleanEmptyAll();

    @Override
    public <T7> Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> pushBackBy(Iterable<? extends Stream<? extends T7>> var1);

    @Override
    public <T0> Iterative7Cross<T0, T1, T2, T3, T4, T5, T6> pushFrontBy(Iterable<? extends Stream<? extends T0>> var1);

    @Override
    public <T0> Iterative7Cross<T0, T1, T2, T3, T4, T5, T6> pushFrontCrossBy(Iterable<? extends Stream<? extends T0>> var1);

    @Override
    public <T0> Iterative7Cross<T0, T1, T2, T3, T4, T5, T6> pushFrontInlineBy(Iterable<? extends Stream<? extends T0>> var1);

    @Override
    public <R1, R2, R3, R4, R5, R6> Iterative6Cross<R1, R2, R3, R4, R5, R6> map(Fn1<? super T1, ? extends R1> var1, Fn1<? super T2, ? extends R2> var2, Fn1<? super T3, ? extends R3> var3, Fn1<? super T4, ? extends R4> var4, Fn1<? super T5, ? extends R5> var5, Fn1<? super T6, ? extends R6> var6);

    @Override
    public <R1, R2, R3, R4, R5, R6> Iterative6Cross<R1, R2, R3, R4, R5, R6> inlineMap(Fn1<? super T1, ? extends Iterable<? extends R1>> var1, Fn1<? super T2, ? extends Iterable<? extends R2>> var2, Fn1<? super T3, ? extends Iterable<? extends R3>> var3, Fn1<? super T4, ? extends Iterable<? extends R4>> var4, Fn1<? super T5, ? extends Iterable<? extends R5>> var5, Fn1<? super T6, ? extends Iterable<? extends R6>> var6);

    @Override
    public Iterative6Cross<T1, T2, T3, T4, T5, T6> filter(Pr1<? super T1> var1, Pr1<? super T2> var2, Pr1<? super T3> var3, Pr1<? super T4> var4, Pr1<? super T5> var5, Pr1<? super T6> var6);

    @Override
    default public Iterative6Cross<T1, T2, T3, T4, T5, T6> onSuccess(Rn r) {
        return (Iterative6Cross) Iterative6.super.onSuccess(r);
    }

    @Override
    default public Iterative6Cross<T1, T2, T3, T4, T5, T6> onFailure(Rn r) {
        return (Iterative6Cross) Iterative6.super.onFailure(r);
    }

    @Override
    default public Iterative6Cross<T1, T2, T3, T4, T5, T6> execute(Cs1<? super Iterative6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> c) {
        return (Iterative6Cross) Iterative6.super.execute(c);
    }

    @Override
    default public Iterative6Cross<T1, T2, T3, T4, T5, T6> onFailure(Cs1<? super Iterative6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> c) {
        return (Iterative6Cross) Iterative6.super.onFailure(c);
    }

    @Override
    default public Iterative6Cross<T1, T2, T3, T4, T5, T6> onSuccess(Cs1<? super Iterative6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> c) {
        return (Iterative6Cross) Iterative6.super.onSuccess(c);
    }

    @Override
    default public Iterative6Cross<T1, T2, T3, T4, T5, T6> forEach(Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c) {
        return (Iterative6Cross) Iterative6.super.forEach(c);
    }

    @Override
    default public <R> Iterative6Cross<R, T2, T3, T4, T5, T6> map1(Fn1<? super T1, ? extends R> f) {
        return (Iterative6Cross) Iterative6.super.map1(f);
    }

    @Override
    default public <R> Iterative6Cross<T1, R, T3, T4, T5, T6> map2(Fn1<? super T2, ? extends R> f) {
        return (Iterative6Cross) Iterative6.super.map2(f);
    }

    @Override
    default public <R> Iterative6Cross<T1, T2, R, T4, T5, T6> map3(Fn1<? super T3, ? extends R> f) {
        return (Iterative6Cross) Iterative6.super.map3(f);
    }

    @Override
    default public <R> Iterative6Cross<T1, T2, T3, R, T5, T6> map4(Fn1<? super T4, ? extends R> f) {
        return (Iterative6Cross) Iterative6.super.map4(f);
    }

    @Override
    default public <R> Iterative6Cross<T1, T2, T3, T4, R, T6> map5(Fn1<? super T5, ? extends R> f) {
        return (Iterative6Cross) Iterative6.super.map5(f);
    }

    @Override
    default public <R> Iterative6Cross<T1, T2, T3, T4, T5, R> map6(Fn1<? super T6, ? extends R> f) {
        return (Iterative6Cross) Iterative6.super.map6(f);
    }

    @Override
    default public <R> Iterative6Cross<R, T2, T3, T4, T5, T6> inlineMap1(Fn1<? super T1, ? extends Iterable<? extends R>> f) {
        return (Iterative6Cross) Iterative6.super.inlineMap1(f);
    }

    @Override
    default public <R> Iterative6Cross<T1, R, T3, T4, T5, T6> inlineMap2(Fn1<? super T2, ? extends Iterable<? extends R>> f) {
        return (Iterative6Cross) Iterative6.super.inlineMap2(f);
    }

    @Override
    default public <R> Iterative6Cross<T1, T2, R, T4, T5, T6> inlineMap3(Fn1<? super T3, ? extends Iterable<? extends R>> f) {
        return (Iterative6Cross) Iterative6.super.inlineMap3(f);
    }

    @Override
    default public <R> Iterative6Cross<T1, T2, T3, R, T5, T6> inlineMap4(Fn1<? super T4, ? extends Iterable<? extends R>> f) {
        return (Iterative6Cross) Iterative6.super.inlineMap4(f);
    }

    @Override
    default public <R> Iterative6Cross<T1, T2, T3, T4, R, T6> inlineMap5(Fn1<? super T5, ? extends Iterable<? extends R>> f) {
        return (Iterative6Cross) Iterative6.super.inlineMap5(f);
    }

    @Override
    default public <R> Iterative6Cross<T1, T2, T3, T4, T5, R> inlineMap6(Fn1<? super T6, ? extends Iterable<? extends R>> f) {
        return (Iterative6Cross) Iterative6.super.inlineMap6(f);
    }

    @Override
    default public Iterative6Cross<T1, T2, T3, T4, T5, T6> filter1(Pr1<? super T1> p) {
        return (Iterative6Cross) Iterative6.super.filter1(p);
    }

    @Override
    default public Iterative6Cross<T1, T2, T3, T4, T5, T6> filter2(Pr1<? super T2> p) {
        return (Iterative6Cross) Iterative6.super.filter2(p);
    }

    @Override
    default public Iterative6Cross<T1, T2, T3, T4, T5, T6> filter3(Pr1<? super T3> p) {
        return (Iterative6Cross) Iterative6.super.filter3(p);
    }

    @Override
    default public Iterative6Cross<T1, T2, T3, T4, T5, T6> filter4(Pr1<? super T4> p) {
        return (Iterative6Cross) Iterative6.super.filter4(p);
    }

    @Override
    default public Iterative6Cross<T1, T2, T3, T4, T5, T6> filter5(Pr1<? super T5> p) {
        return (Iterative6Cross) Iterative6.super.filter5(p);
    }

    @Override
    default public Iterative6Cross<T1, T2, T3, T4, T5, T6> filter6(Pr1<? super T6> p) {
        return (Iterative6Cross) Iterative6.super.filter6(p);
    }

    @Override
    default public <T7> Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> pushBack(T7 t7) {
        return (Iterative7Cross) Iterative6.super.pushBack(t7);
    }

    @Override
    default public <T0> Iterative7Cross<T0, T1, T2, T3, T4, T5, T6> pushFront(T0 t0) {
        return (Iterative7Cross) Iterative6.super.pushFront(t0);
    }

    @Override
    default public <T0> Iterative7Cross<T0, T1, T2, T3, T4, T5, T6> pushFrontCross(T0 t0) {
        return (Iterative7Cross) Iterative6.super.pushFrontCross(t0);
    }

    @Override
    default public <T0> Iterative7Cross<T0, T1, T2, T3, T4, T5, T6> pushFrontInline(T0 t0) {
        return (Iterative7Cross) Iterative6.super.pushFrontInline(t0);
    }

    @Override
    default public <T7> Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> pushBackOf(Iterable<? extends T7> t7) {
        return (Iterative7Cross) Iterative6.super.pushBackOf(t7);
    }

    @Override
    default public <T0> Iterative7Cross<T0, T1, T2, T3, T4, T5, T6> pushFrontOf(Iterable<? extends T0> t0) {
        return (Iterative7Cross) Iterative6.super.pushFrontOf(t0);
    }

    @Override
    default public <T0> Iterative7Cross<T0, T1, T2, T3, T4, T5, T6> pushFrontCrossOf(Iterable<? extends T0> t0) {
        return (Iterative7Cross) Iterative6.super.pushFrontCrossOf(t0);
    }

    @Override
    default public <T0> Iterative7Cross<T0, T1, T2, T3, T4, T5, T6> pushFrontInlineOf(Iterable<? extends T0> t0) {
        return (Iterative7Cross) Iterative6.super.pushFrontInlineOf(t0);
    }

    @Override
    default public <B1, B2> Iterative8Cross<T1, T2, T3, T4, T5, T6, B1, B2> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2) {
        return (Iterative8Cross) Iterative6.super.pushBackBy(b1, b2);
    }

    @Override
    default public <F1, F2> Iterative8Cross<F1, F2, T1, T2, T3, T4, T5, T6> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return (Iterative8Cross) Iterative6.super.pushFrontBy(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative8Cross<F1, F2, T1, T2, T3, T4, T5, T6> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return (Iterative8Cross) Iterative6.super.pushFrontCrossBy(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative8Cross<F1, F2, T1, T2, T3, T4, T5, T6> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return (Iterative8Cross) Iterative6.super.pushFrontInlineBy(f1, f2);
    }

    @Override
    default public <B1, B2> Iterative8Cross<T1, T2, T3, T4, T5, T6, B1, B2> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2) {
        return (Iterative8Cross) Iterative6.super.pushBackOf(b1, b2);
    }

    @Override
    default public <F1, F2> Iterative8Cross<F1, F2, T1, T2, T3, T4, T5, T6> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return (Iterative8Cross) Iterative6.super.pushFrontOf(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative8Cross<F1, F2, T1, T2, T3, T4, T5, T6> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return (Iterative8Cross) Iterative6.super.pushFrontCrossOf(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative8Cross<F1, F2, T1, T2, T3, T4, T5, T6> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return (Iterative8Cross) Iterative6.super.pushFrontInlineOf(f1, f2);
    }

    @Override
    default public <B1, B2> Iterative8Cross<T1, T2, T3, T4, T5, T6, B1, B2> pushBack(B1 b1, B2 b2) {
        return (Iterative8Cross) Iterative6.super.pushBack(b1, b2);
    }

    @Override
    default public <F1, F2> Iterative8Cross<F1, F2, T1, T2, T3, T4, T5, T6> pushFront(F1 f1, F2 f2) {
        return (Iterative8Cross) Iterative6.super.pushFront(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative8Cross<F1, F2, T1, T2, T3, T4, T5, T6> pushFrontCross(F1 f1, F2 f2) {
        return (Iterative8Cross) Iterative6.super.pushFrontCross(f1, f2);
    }

    @Override
    default public <F1, F2> Iterative8Cross<F1, F2, T1, T2, T3, T4, T5, T6> pushFrontInline(F1 f1, F2 f2) {
        return (Iterative8Cross) Iterative6.super.pushFrontInline(f1, f2);
    }

    public static class Iterative6CrossNonNullable<T1, T2, T3, T4, T5, T6> extends Iterative6CrossAbstract<T1, T2, T3, T4, T5, T6> implements Iterative6Cross<T1, T2, T3, T4, T5, T6>, IterativeWrapper.IterativeWrapperNonNullable, IterativeWrapper.IterativeCross {

        Iterative6CrossNonNullable(Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> iterative, Iterable<? extends T6> right) {
            super(iterative, right);
        }

        Iterative6CrossNonNullable(Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> iterative, Iterable<? extends Stream<? extends T6>> right, boolean ign) {
            super(iterative, right, ign);
        }

    }

    public static class Iterative6CrossNullable<T1, T2, T3, T4, T5, T6> extends Iterative6CrossAbstract<T1, T2, T3, T4, T5, T6> implements Iterative6Cross<T1, T2, T3, T4, T5, T6>, IterativeWrapper.IterativeWrapperNullable, IterativeWrapper.IterativeCross {

        Iterative6CrossNullable(Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> iterative, Iterable<? extends T6> right) {
            super(iterative, right);
        }

        Iterative6CrossNullable(Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> iterative, Iterable<? extends Stream<? extends T6>> right, boolean ign) {
            super(iterative, right, ign);
        }

    }

    public static abstract class Iterative6CrossAbstract<T1, T2, T3, T4, T5, T6> extends Iterative6.Iterative6Abstract<T1, T2, T3, T4, T5, T6> implements Iterative6Cross<T1, T2, T3, T4, T5, T6> {

        Iterative6CrossAbstract(Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> iterative, Iterable<? extends T6> right) {
            super(iterative, right);
        }

        Iterative6CrossAbstract(Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> iterative, Iterable<? extends Stream<? extends T6>> right, boolean ign) {
            super(iterative, right, ign);
        }

        @Override
        public Stream<Tuple6<Iterable<T1>, Iterable<T2>, Iterable<T3>, Iterable<T4>, Iterable<T5>, Iterable<T6>>> toTupleStream() {
            return this.iterative.toTupleStream().crossProduct(IterativeHandler.transform(this.right)).toStream().map(Fn2.tuple((Fn2 & Serializable) (tuple, right) -> Tuple.of((Object) tuple._1(), (Object) tuple._2(), (Object) tuple._3(), (Object) tuple._4(), (Object) tuple._5(), (Object) right)));
        }

        @Override
        public Iterative6Cross<T1, T2, T3, T4, T5, T6> nonNullable() {
            return (Iterative6Cross) super.nonNullable();
        }

        @Override
        public Iterative6Cross<T1, T2, T3, T4, T5, T6> nullable() {
            return (Iterative6Cross) super.nullable();
        }

        @Override
        public Iterative6Cross<T1, T2, T3, T4, T5, T6> forceCleanEmpty1() {
            return (Iterative6Cross) super.forceCleanEmpty1();
        }

        @Override
        public Iterative6Cross<T1, T2, T3, T4, T5, T6> forceCleanEmpty2() {
            return (Iterative6Cross) super.forceCleanEmpty2();
        }

        @Override
        public Iterative6Cross<T1, T2, T3, T4, T5, T6> forceCleanEmpty3() {
            return (Iterative6Cross) super.forceCleanEmpty3();
        }

        @Override
        public Iterative6Cross<T1, T2, T3, T4, T5, T6> forceCleanEmpty4() {
            return (Iterative6Cross) super.forceCleanEmpty4();
        }

        @Override
        public Iterative6Cross<T1, T2, T3, T4, T5, T6> forceCleanEmpty5() {
            return (Iterative6Cross) super.forceCleanEmpty5();
        }

        @Override
        public Iterative6Cross<T1, T2, T3, T4, T5, T6> forceCleanEmpty6() {
            return (Iterative6Cross) super.forceCleanEmpty6();
        }

        @Override
        public Iterative6Cross<T1, T2, T3, T4, T5, T6> forceCleanEmptyAll() {
            return (Iterative6Cross) super.forceCleanEmptyAll();
        }

        @Override
        public <T7> Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> pushBackBy(Iterable<? extends Stream<? extends T7>> t7) {
            return (Iterative7Cross) super.pushBackBy(t7);
        }

        @Override
        public <T0> Iterative7Cross<T0, T1, T2, T3, T4, T5, T6> pushFrontBy(Iterable<? extends Stream<? extends T0>> t0) {
            return (Iterative7Cross) super.pushFrontBy(t0);
        }

        @Override
        public <T0> Iterative7Cross<T0, T1, T2, T3, T4, T5, T6> pushFrontCrossBy(Iterable<? extends Stream<? extends T0>> t0) {
            return (Iterative7Cross) super.pushFrontCrossBy(t0);
        }

        @Override
        public <T0> Iterative7Cross<T0, T1, T2, T3, T4, T5, T6> pushFrontInlineBy(Iterable<? extends Stream<? extends T0>> t0) {
            return (Iterative7Cross) super.pushFrontInlineBy(t0);
        }

        @Override
        public <R1, R2, R3, R4, R5, R6> Iterative6Cross<R1, R2, R3, R4, R5, R6> map(Fn1<? super T1, ? extends R1> f1, Fn1<? super T2, ? extends R2> f2, Fn1<? super T3, ? extends R3> f3, Fn1<? super T4, ? extends R4> f4, Fn1<? super T5, ? extends R5> f5, Fn1<? super T6, ? extends R6> f6) {
            return (Iterative6Cross) super.map(f1, f2, f3, f4, f5, f6);
        }

        @Override
        public <R1, R2, R3, R4, R5, R6> Iterative6Cross<R1, R2, R3, R4, R5, R6> inlineMap(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5, Fn1<? super T6, ? extends Iterable<? extends R6>> f6) {
            return (Iterative6Cross) super.inlineMap(f1, f2, f3, f4, f5, f6);
        }

        @Override
        public Iterative6Cross<T1, T2, T3, T4, T5, T6> filter(Pr1<? super T1> p1, Pr1<? super T2> p2, Pr1<? super T3> p3, Pr1<? super T4> p4, Pr1<? super T5> p5, Pr1<? super T6> p6) {
            return (Iterative6Cross) super.filter(p1, p2, p3, p4, p5, p6);
        }

    }

}

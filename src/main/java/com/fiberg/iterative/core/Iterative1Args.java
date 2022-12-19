package com.fiberg.iterative.core;

import com.fiberg.iterative.core.Iterative1;
import com.fiberg.iterative.core.Iterative2;
import com.fiberg.iterative.core.Iterative3;
import com.fiberg.iterative.core.Iterative4;
import com.fiberg.iterative.core.Iterative5;
import com.fiberg.iterative.core.Iterative6;
import com.fiberg.iterative.core.Iterative7;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fn2;
import com.fiberg.iterative.function.Fn3;
import com.fiberg.iterative.function.Fn4;
import com.fiberg.iterative.function.Fn5;
import com.fiberg.iterative.function.Fn6;
import com.fiberg.iterative.function.Fn7;
import com.fiberg.iterative.function.Fn8;
import com.fiberg.iterative.function.Pr1;
import io.vavr.Tuple1;
import io.vavr.Tuple2;
import io.vavr.Tuple3;
import io.vavr.Tuple4;
import io.vavr.Tuple5;
import io.vavr.Tuple6;
import io.vavr.Tuple7;
import io.vavr.collection.Stream;
import java.io.Serializable;
import java.util.Objects;

public interface Iterative1Args<T1> {

    public static interface Iterative1Args7<T1, A1, A2, A3, A4, A5, A6, A7> extends Iterative1Args<T1> {

        public <R1> Iterative1<R1> mapping(Fn8<? super T1, ? super A1, ? super A2, ? super A3, ? super A4, ? super A5, ? super A6, ? super A7, ? extends R1> f1);

        public <R1> Iterative1<R1> inverseMapping(Fn8<? super A1, ? super A2, ? super A3, ? super A4, ? super A5, ? super A6, ? super A7, ? super T1, ? extends R1> f1);

        public <R1, R2, R3, R4, R5, R6, R7> Iterative1Args7<T1, R1, R2, R3, R4, R5, R6, R7> map(Fn1<? super A1, ? extends R1> f1, Fn1<? super A2, ? extends R2> f2, Fn1<? super A3, ? extends R3> f3, Fn1<? super A4, ? extends R4> f4, Fn1<? super A5, ? extends R5> f5, Fn1<? super A6, ? extends R6> f6, Fn1<? super A7, ? extends R7> f7);

        public <R1> Iterative1Args7<T1, R1, A2, A3, A4, A5, A6, A7> map1(Fn1<? super A1, ? extends R1> f1);

        public <R2> Iterative1Args7<T1, A1, R2, A3, A4, A5, A6, A7> map2(Fn1<? super A2, ? extends R2> f1);

        public <R3> Iterative1Args7<T1, A1, A2, R3, A4, A5, A6, A7> map3(Fn1<? super A3, ? extends R3> f1);

        public <R4> Iterative1Args7<T1, A1, A2, A3, R4, A5, A6, A7> map4(Fn1<? super A4, ? extends R4> f1);

        public <R5> Iterative1Args7<T1, A1, A2, A3, A4, R5, A6, A7> map5(Fn1<? super A5, ? extends R5> f1);

        public <R6> Iterative1Args7<T1, A1, A2, A3, A4, A5, R6, A7> map6(Fn1<? super A6, ? extends R6> f1);

        public <R7> Iterative1Args7<T1, A1, A2, A3, A4, A5, A6, R7> map7(Fn1<? super A7, ? extends R7> f1);

        public <R1, R2, R3, R4, R5, R6, R7> Iterative1Args7<T1, R1, R2, R3, R4, R5, R6, R7> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> i2, Fn1<? super A3, ? extends Iterable<? extends R3>> f3, Fn1<? super A4, ? extends Iterable<? extends R4>> i4, Fn1<? super A5, ? extends Iterable<? extends R5>> f5, Fn1<? super A6, ? extends Iterable<? extends R6>> i6, Fn1<? super A7, ? extends Iterable<? extends R7>> f7);

        public <R1> Iterative1Args7<T1, R1, A2, A3, A4, A5, A6, A7> flatMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1);

        public <R2> Iterative1Args7<T1, A1, R2, A3, A4, A5, A6, A7> flatMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f1);

        public <R3> Iterative1Args7<T1, A1, A2, R3, A4, A5, A6, A7> flatMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> f1);

        public <R4> Iterative1Args7<T1, A1, A2, A3, R4, A5, A6, A7> flatMap4(Fn1<? super A4, ? extends Iterable<? extends R4>> f1);

        public <R5> Iterative1Args7<T1, A1, A2, A3, A4, R5, A6, A7> flatMap5(Fn1<? super A5, ? extends Iterable<? extends R5>> f1);

        public <R6> Iterative1Args7<T1, A1, A2, A3, A4, A5, R6, A7> flatMap6(Fn1<? super A6, ? extends Iterable<? extends R6>> f1);

        public <R7> Iterative1Args7<T1, A1, A2, A3, A4, A5, A6, R7> flatMap7(Fn1<? super A7, ? extends Iterable<? extends R7>> f1);

        public <R1, R2, R3, R4, R5, R6, R7> Iterative1Args7<T1, R1, R2, R3, R4, R5, R6, R7> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> i2, Fn1<? super A3, ? extends Iterable<? extends R3>> f3, Fn1<? super A4, ? extends Iterable<? extends R4>> i4, Fn1<? super A5, ? extends Iterable<? extends R5>> f5, Fn1<? super A6, ? extends Iterable<? extends R6>> i6, Fn1<? super A7, ? extends Iterable<? extends R7>> f7);

        public <R1> Iterative1Args7<T1, R1, A2, A3, A4, A5, A6, A7> inlineMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1);

        public <R2> Iterative1Args7<T1, A1, R2, A3, A4, A5, A6, A7> inlineMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f1);

        public <R3> Iterative1Args7<T1, A1, A2, R3, A4, A5, A6, A7> inlineMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> f1);

        public <R4> Iterative1Args7<T1, A1, A2, A3, R4, A5, A6, A7> inlineMap4(Fn1<? super A4, ? extends Iterable<? extends R4>> f1);

        public <R5> Iterative1Args7<T1, A1, A2, A3, A4, R5, A6, A7> inlineMap5(Fn1<? super A5, ? extends Iterable<? extends R5>> f1);

        public <R6> Iterative1Args7<T1, A1, A2, A3, A4, A5, R6, A7> inlineMap6(Fn1<? super A6, ? extends Iterable<? extends R6>> f1);

        public <R7> Iterative1Args7<T1, A1, A2, A3, A4, A5, A6, R7> inlineMap7(Fn1<? super A7, ? extends Iterable<? extends R7>> f1);

        public Iterative1Args7<T1, A1, A2, A3, A4, A5, A6, A7> filter(Pr1<? super A1> p1, Pr1<? super A2> p2, Pr1<? super A3> p3, Pr1<? super A4> p4, Pr1<? super A5> p5, Pr1<? super A6> p6, Pr1<? super A7> p7);

        public Iterative1Args7<T1, A1, A2, A3, A4, A5, A6, A7> filter1(Pr1<? super A1> p1);

        public Iterative1Args7<T1, A1, A2, A3, A4, A5, A6, A7> filter2(Pr1<? super A2> p1);

        public Iterative1Args7<T1, A1, A2, A3, A4, A5, A6, A7> filter3(Pr1<? super A3> p1);

        public Iterative1Args7<T1, A1, A2, A3, A4, A5, A6, A7> filter4(Pr1<? super A4> p1);

        public Iterative1Args7<T1, A1, A2, A3, A4, A5, A6, A7> filter5(Pr1<? super A5> p1);

        public Iterative1Args7<T1, A1, A2, A3, A4, A5, A6, A7> filter6(Pr1<? super A6> p1);

        public Iterative1Args7<T1, A1, A2, A3, A4, A5, A6, A7> filter7(Pr1<? super A7> p1);

        public static class Iterative1Args7Impl<T1, A1, A2, A3, A4, A5, A6, A7> implements Iterative1Args7<T1, A1, A2, A3, A4, A5, A6, A7> {

            final boolean cross;
            final Iterative1<T1> left;
            final Iterative7<A1, A2, A3, A4, A5, A6, A7> right;

            Iterative1Args7Impl(Iterative1<? extends T1> left, Iterative7<? extends A1, ? extends A2, ? extends A3, ? extends A4, ? extends A5, ? extends A6, ? extends A7> right, boolean cross) {
                Objects.requireNonNull(left, "left is null");
                Objects.requireNonNull(right, "right is null");
                this.cross = cross;
                this.left = Iterative.narrow(left);
                this.right = Iterative.narrow(right);
            }

            @Override
            public <R1> Iterative1<R1> mapping(Fn8<? super T1, ? super A1, ? super A2, ? super A3, ? super A4, ? super A5, ? super A6, ? super A7, ? extends R1> f1) {
                Objects.requireNonNull(f1, "f1 is null");
                final Stream<Tuple7<A1, A2, A3, A4, A5, A6, A7>> stream = this.right.toStream();
                final Iterative1<T1> i1 = this.left.create(this.left.iterableStream1());
                return (this.cross ? i1.pushBackCrossOf(stream) : i1.pushBackInlineOf(stream)).reduce((t1, tuple) -> f1.apply(t1, tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5(), tuple._6(), tuple._7()));
            }

            @Override
            public <R1> Iterative1<R1> inverseMapping(Fn8<? super A1, ? super A2, ? super A3, ? super A4, ? super A5, ? super A6, ? super A7, ? super T1, ? extends R1> f1) {
                return this.mapping((t1, a1, a2, a3, a4, a5, a6, a7) -> f1.apply(a1, a2, a3, a4, a5, a6, a7, t1));
            }

            @Override
            public <R1, R2, R3, R4, R5, R6, R7> Iterative1Args7<T1, R1, R2, R3, R4, R5, R6, R7> map(Fn1<? super A1, ? extends R1> f1, Fn1<? super A2, ? extends R2> f2, Fn1<? super A3, ? extends R3> f3, Fn1<? super A4, ? extends R4> f4, Fn1<? super A5, ? extends R5> f5, Fn1<? super A6, ? extends R6> f6, Fn1<? super A7, ? extends R7> f7) {
                return new Iterative1Args7Impl<>(this.left, this.right.map(f1, f2, f3, f4, f5, f6, f7), this.cross);
            }

            @Override
            public <R1> Iterative1Args7<T1, R1, A2, A3, A4, A5, A6, A7> map1(Fn1<? super A1, ? extends R1> f1) {
                return new Iterative1Args7Impl<>(this.left, this.right.map1(f1), this.cross);
            }

            @Override
            public <R2> Iterative1Args7<T1, A1, R2, A3, A4, A5, A6, A7> map2(Fn1<? super A2, ? extends R2> f2) {
                return new Iterative1Args7Impl<>(this.left, this.right.map2(f2), this.cross);
            }

            @Override
            public <R3> Iterative1Args7<T1, A1, A2, R3, A4, A5, A6, A7> map3(Fn1<? super A3, ? extends R3> f3) {
                return new Iterative1Args7Impl<>(this.left, this.right.map3(f3), this.cross);
            }

            @Override
            public <R4> Iterative1Args7<T1, A1, A2, A3, R4, A5, A6, A7> map4(Fn1<? super A4, ? extends R4> f4) {
                return new Iterative1Args7Impl<>(this.left, this.right.map4(f4), this.cross);
            }

            @Override
            public <R5> Iterative1Args7<T1, A1, A2, A3, A4, R5, A6, A7> map5(Fn1<? super A5, ? extends R5> f5) {
                return new Iterative1Args7Impl<>(this.left, this.right.map5(f5), this.cross);
            }

            @Override
            public <R6> Iterative1Args7<T1, A1, A2, A3, A4, A5, R6, A7> map6(Fn1<? super A6, ? extends R6> f6) {
                return new Iterative1Args7Impl<>(this.left, this.right.map6(f6), this.cross);
            }

            @Override
            public <R7> Iterative1Args7<T1, A1, A2, A3, A4, A5, A6, R7> map7(Fn1<? super A7, ? extends R7> f7) {
                return new Iterative1Args7Impl<>(this.left, this.right.map7(f7), this.cross);
            }

            @Override
            public <R1, R2, R3, R4, R5, R6, R7> Iterative1Args7<T1, R1, R2, R3, R4, R5, R6, R7> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> f2, Fn1<? super A3, ? extends Iterable<? extends R3>> f3, Fn1<? super A4, ? extends Iterable<? extends R4>> f4, Fn1<? super A5, ? extends Iterable<? extends R5>> f5, Fn1<? super A6, ? extends Iterable<? extends R6>> f6, Fn1<? super A7, ? extends Iterable<? extends R7>> f7) {
                return new Iterative1Args7Impl<>(this.left, this.right.flatMap(f1, f2, f3, f4, f5, f6, f7), this.cross);
            }

            @Override
            public <R1> Iterative1Args7<T1, R1, A2, A3, A4, A5, A6, A7> flatMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative1Args7Impl<>(this.left, this.right.flatMap1(f1), this.cross);
            }

            @Override
            public <R2> Iterative1Args7<T1, A1, R2, A3, A4, A5, A6, A7> flatMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative1Args7Impl<>(this.left, this.right.flatMap2(f2), this.cross);
            }

            @Override
            public <R3> Iterative1Args7<T1, A1, A2, R3, A4, A5, A6, A7> flatMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> f3) {
                return new Iterative1Args7Impl<>(this.left, this.right.flatMap3(f3), this.cross);
            }

            @Override
            public <R4> Iterative1Args7<T1, A1, A2, A3, R4, A5, A6, A7> flatMap4(Fn1<? super A4, ? extends Iterable<? extends R4>> f4) {
                return new Iterative1Args7Impl<>(this.left, this.right.flatMap4(f4), this.cross);
            }

            @Override
            public <R5> Iterative1Args7<T1, A1, A2, A3, A4, R5, A6, A7> flatMap5(Fn1<? super A5, ? extends Iterable<? extends R5>> f5) {
                return new Iterative1Args7Impl<>(this.left, this.right.flatMap5(f5), this.cross);
            }

            @Override
            public <R6> Iterative1Args7<T1, A1, A2, A3, A4, A5, R6, A7> flatMap6(Fn1<? super A6, ? extends Iterable<? extends R6>> f6) {
                return new Iterative1Args7Impl<>(this.left, this.right.flatMap6(f6), this.cross);
            }

            @Override
            public <R7> Iterative1Args7<T1, A1, A2, A3, A4, A5, A6, R7> flatMap7(Fn1<? super A7, ? extends Iterable<? extends R7>> f7) {
                return new Iterative1Args7Impl<>(this.left, this.right.flatMap7(f7), this.cross);
            }

            @Override
            public <R1, R2, R3, R4, R5, R6, R7> Iterative1Args7<T1, R1, R2, R3, R4, R5, R6, R7> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> f2, Fn1<? super A3, ? extends Iterable<? extends R3>> f3, Fn1<? super A4, ? extends Iterable<? extends R4>> f4, Fn1<? super A5, ? extends Iterable<? extends R5>> f5, Fn1<? super A6, ? extends Iterable<? extends R6>> f6, Fn1<? super A7, ? extends Iterable<? extends R7>> f7) {
                return new Iterative1Args7Impl<>(this.left, this.right.inlineMap(f1, f2, f3, f4, f5, f6, f7), this.cross);
            }

            @Override
            public <R1> Iterative1Args7<T1, R1, A2, A3, A4, A5, A6, A7> inlineMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative1Args7Impl<>(this.left, this.right.inlineMap1(f1), this.cross);
            }

            @Override
            public <R2> Iterative1Args7<T1, A1, R2, A3, A4, A5, A6, A7> inlineMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative1Args7Impl<>(this.left, this.right.inlineMap2(f2), this.cross);
            }

            @Override
            public <R3> Iterative1Args7<T1, A1, A2, R3, A4, A5, A6, A7> inlineMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> f3) {
                return new Iterative1Args7Impl<>(this.left, this.right.inlineMap3(f3), this.cross);
            }

            @Override
            public <R4> Iterative1Args7<T1, A1, A2, A3, R4, A5, A6, A7> inlineMap4(Fn1<? super A4, ? extends Iterable<? extends R4>> f4) {
                return new Iterative1Args7Impl<>(this.left, this.right.inlineMap4(f4), this.cross);
            }

            @Override
            public <R5> Iterative1Args7<T1, A1, A2, A3, A4, R5, A6, A7> inlineMap5(Fn1<? super A5, ? extends Iterable<? extends R5>> f5) {
                return new Iterative1Args7Impl<>(this.left, this.right.inlineMap5(f5), this.cross);
            }

            @Override
            public <R6> Iterative1Args7<T1, A1, A2, A3, A4, A5, R6, A7> inlineMap6(Fn1<? super A6, ? extends Iterable<? extends R6>> f6) {
                return new Iterative1Args7Impl<>(this.left, this.right.inlineMap6(f6), this.cross);
            }

            @Override
            public <R7> Iterative1Args7<T1, A1, A2, A3, A4, A5, A6, R7> inlineMap7(Fn1<? super A7, ? extends Iterable<? extends R7>> f7) {
                return new Iterative1Args7Impl<>(this.left, this.right.inlineMap7(f7), this.cross);
            }

            @Override
            public Iterative1Args7<T1, A1, A2, A3, A4, A5, A6, A7> filter(Pr1<? super A1> p1, Pr1<? super A2> p2, Pr1<? super A3> p3, Pr1<? super A4> p4, Pr1<? super A5> p5, Pr1<? super A6> p6, Pr1<? super A7> p7) {
                return new Iterative1Args7Impl<>(this.left, this.right.filter(p1, p2, p3, p4, p5, p6, p7), this.cross);
            }

            @Override
            public Iterative1Args7<T1, A1, A2, A3, A4, A5, A6, A7> filter1(Pr1<? super A1> p1) {
                return new Iterative1Args7Impl<>(this.left, this.right.filter1(p1), this.cross);
            }

            @Override
            public Iterative1Args7<T1, A1, A2, A3, A4, A5, A6, A7> filter2(Pr1<? super A2> p2) {
                return new Iterative1Args7Impl<>(this.left, this.right.filter2(p2), this.cross);
            }

            @Override
            public Iterative1Args7<T1, A1, A2, A3, A4, A5, A6, A7> filter3(Pr1<? super A3> p3) {
                return new Iterative1Args7Impl<>(this.left, this.right.filter3(p3), this.cross);
            }

            @Override
            public Iterative1Args7<T1, A1, A2, A3, A4, A5, A6, A7> filter4(Pr1<? super A4> p4) {
                return new Iterative1Args7Impl<>(this.left, this.right.filter4(p4), this.cross);
            }

            @Override
            public Iterative1Args7<T1, A1, A2, A3, A4, A5, A6, A7> filter5(Pr1<? super A5> p5) {
                return new Iterative1Args7Impl<>(this.left, this.right.filter5(p5), this.cross);
            }

            @Override
            public Iterative1Args7<T1, A1, A2, A3, A4, A5, A6, A7> filter6(Pr1<? super A6> p6) {
                return new Iterative1Args7Impl<>(this.left, this.right.filter6(p6), this.cross);
            }

            @Override
            public Iterative1Args7<T1, A1, A2, A3, A4, A5, A6, A7> filter7(Pr1<? super A7> p7) {
                return new Iterative1Args7Impl<>(this.left, this.right.filter7(p7), this.cross);
            }

        }

    }

    public static interface Iterative1Args6<T1, A1, A2, A3, A4, A5, A6> extends Iterative1Args<T1> {

        public <R1> Iterative1<R1> mapping(Fn7<? super T1, ? super A1, ? super A2, ? super A3, ? super A4, ? super A5, ? super A6, ? extends R1> f1);

        public <R1> Iterative1<R1> inverseMapping(Fn7<? super A1, ? super A2, ? super A3, ? super A4, ? super A5, ? super A6, ? super T1, ? extends R1> f1);

        public <R1, R2, R3, R4, R5, R6> Iterative1Args6<T1, R1, R2, R3, R4, R5, R6> map(Fn1<? super A1, ? extends R1> f1, Fn1<? super A2, ? extends R2> f2, Fn1<? super A3, ? extends R3> f3, Fn1<? super A4, ? extends R4> f4, Fn1<? super A5, ? extends R5> f5, Fn1<? super A6, ? extends R6> f6);

        public <R1> Iterative1Args6<T1, R1, A2, A3, A4, A5, A6> map1(Fn1<? super A1, ? extends R1> f1);

        public <R2> Iterative1Args6<T1, A1, R2, A3, A4, A5, A6> map2(Fn1<? super A2, ? extends R2> f1);

        public <R3> Iterative1Args6<T1, A1, A2, R3, A4, A5, A6> map3(Fn1<? super A3, ? extends R3> f1);

        public <R4> Iterative1Args6<T1, A1, A2, A3, R4, A5, A6> map4(Fn1<? super A4, ? extends R4> f1);

        public <R5> Iterative1Args6<T1, A1, A2, A3, A4, R5, A6> map5(Fn1<? super A5, ? extends R5> f1);

        public <R6> Iterative1Args6<T1, A1, A2, A3, A4, A5, R6> map6(Fn1<? super A6, ? extends R6> f1);

        public <R1, R2, R3, R4, R5, R6> Iterative1Args6<T1, R1, R2, R3, R4, R5, R6> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> i2, Fn1<? super A3, ? extends Iterable<? extends R3>> f3, Fn1<? super A4, ? extends Iterable<? extends R4>> i4, Fn1<? super A5, ? extends Iterable<? extends R5>> f5, Fn1<? super A6, ? extends Iterable<? extends R6>> i6);

        public <R1> Iterative1Args6<T1, R1, A2, A3, A4, A5, A6> flatMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1);

        public <R2> Iterative1Args6<T1, A1, R2, A3, A4, A5, A6> flatMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f1);

        public <R3> Iterative1Args6<T1, A1, A2, R3, A4, A5, A6> flatMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> f1);

        public <R4> Iterative1Args6<T1, A1, A2, A3, R4, A5, A6> flatMap4(Fn1<? super A4, ? extends Iterable<? extends R4>> f1);

        public <R5> Iterative1Args6<T1, A1, A2, A3, A4, R5, A6> flatMap5(Fn1<? super A5, ? extends Iterable<? extends R5>> f1);

        public <R6> Iterative1Args6<T1, A1, A2, A3, A4, A5, R6> flatMap6(Fn1<? super A6, ? extends Iterable<? extends R6>> f1);

        public <R1, R2, R3, R4, R5, R6> Iterative1Args6<T1, R1, R2, R3, R4, R5, R6> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> i2, Fn1<? super A3, ? extends Iterable<? extends R3>> f3, Fn1<? super A4, ? extends Iterable<? extends R4>> i4, Fn1<? super A5, ? extends Iterable<? extends R5>> f5, Fn1<? super A6, ? extends Iterable<? extends R6>> i6);

        public <R1> Iterative1Args6<T1, R1, A2, A3, A4, A5, A6> inlineMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1);

        public <R2> Iterative1Args6<T1, A1, R2, A3, A4, A5, A6> inlineMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f1);

        public <R3> Iterative1Args6<T1, A1, A2, R3, A4, A5, A6> inlineMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> f1);

        public <R4> Iterative1Args6<T1, A1, A2, A3, R4, A5, A6> inlineMap4(Fn1<? super A4, ? extends Iterable<? extends R4>> f1);

        public <R5> Iterative1Args6<T1, A1, A2, A3, A4, R5, A6> inlineMap5(Fn1<? super A5, ? extends Iterable<? extends R5>> f1);

        public <R6> Iterative1Args6<T1, A1, A2, A3, A4, A5, R6> inlineMap6(Fn1<? super A6, ? extends Iterable<? extends R6>> f1);

        public Iterative1Args6<T1, A1, A2, A3, A4, A5, A6> filter(Pr1<? super A1> p1, Pr1<? super A2> p2, Pr1<? super A3> p3, Pr1<? super A4> p4, Pr1<? super A5> p5, Pr1<? super A6> p6);

        public Iterative1Args6<T1, A1, A2, A3, A4, A5, A6> filter1(Pr1<? super A1> p1);

        public Iterative1Args6<T1, A1, A2, A3, A4, A5, A6> filter2(Pr1<? super A2> p1);

        public Iterative1Args6<T1, A1, A2, A3, A4, A5, A6> filter3(Pr1<? super A3> p1);

        public Iterative1Args6<T1, A1, A2, A3, A4, A5, A6> filter4(Pr1<? super A4> p1);

        public Iterative1Args6<T1, A1, A2, A3, A4, A5, A6> filter5(Pr1<? super A5> p1);

        public Iterative1Args6<T1, A1, A2, A3, A4, A5, A6> filter6(Pr1<? super A6> p1);

        public static class Iterative1Args6Impl<T1, A1, A2, A3, A4, A5, A6> implements Iterative1Args6<T1, A1, A2, A3, A4, A5, A6> {

            final boolean cross;
            final Iterative1<T1> left;
            final Iterative6<A1, A2, A3, A4, A5, A6> right;

            Iterative1Args6Impl(Iterative1<? extends T1> left, Iterative6<? extends A1, ? extends A2, ? extends A3, ? extends A4, ? extends A5, ? extends A6> right, boolean cross) {
                Objects.requireNonNull(left, "left is null");
                Objects.requireNonNull(right, "right is null");
                this.cross = cross;
                this.left = Iterative.narrow(left);
                this.right = Iterative.narrow(right);
            }

            @Override
            public <R1> Iterative1<R1> mapping(Fn7<? super T1, ? super A1, ? super A2, ? super A3, ? super A4, ? super A5, ? super A6, ? extends R1> f1) {
                Objects.requireNonNull(f1, "f1 is null");
                final Stream<Tuple6<A1, A2, A3, A4, A5, A6>> stream = this.right.toStream();
                final Iterative1<T1> i1 = this.left.create(this.left.iterableStream1());
                return (this.cross ? i1.pushBackCrossOf(stream) : i1.pushBackInlineOf(stream)).reduce((t1, tuple) -> f1.apply(t1, tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5(), tuple._6()));
            }

            @Override
            public <R1> Iterative1<R1> inverseMapping(Fn7<? super A1, ? super A2, ? super A3, ? super A4, ? super A5, ? super A6, ? super T1, ? extends R1> f1) {
                return this.mapping((t1, a1, a2, a3, a4, a5, a6) -> f1.apply(a1, a2, a3, a4, a5, a6, t1));
            }

            @Override
            public <R1, R2, R3, R4, R5, R6> Iterative1Args6<T1, R1, R2, R3, R4, R5, R6> map(Fn1<? super A1, ? extends R1> f1, Fn1<? super A2, ? extends R2> f2, Fn1<? super A3, ? extends R3> f3, Fn1<? super A4, ? extends R4> f4, Fn1<? super A5, ? extends R5> f5, Fn1<? super A6, ? extends R6> f6) {
                return new Iterative1Args6Impl<>(this.left, this.right.map(f1, f2, f3, f4, f5, f6), this.cross);
            }

            @Override
            public <R1> Iterative1Args6<T1, R1, A2, A3, A4, A5, A6> map1(Fn1<? super A1, ? extends R1> f1) {
                return new Iterative1Args6Impl<>(this.left, this.right.map1(f1), this.cross);
            }

            @Override
            public <R2> Iterative1Args6<T1, A1, R2, A3, A4, A5, A6> map2(Fn1<? super A2, ? extends R2> f2) {
                return new Iterative1Args6Impl<>(this.left, this.right.map2(f2), this.cross);
            }

            @Override
            public <R3> Iterative1Args6<T1, A1, A2, R3, A4, A5, A6> map3(Fn1<? super A3, ? extends R3> f3) {
                return new Iterative1Args6Impl<>(this.left, this.right.map3(f3), this.cross);
            }

            @Override
            public <R4> Iterative1Args6<T1, A1, A2, A3, R4, A5, A6> map4(Fn1<? super A4, ? extends R4> f4) {
                return new Iterative1Args6Impl<>(this.left, this.right.map4(f4), this.cross);
            }

            @Override
            public <R5> Iterative1Args6<T1, A1, A2, A3, A4, R5, A6> map5(Fn1<? super A5, ? extends R5> f5) {
                return new Iterative1Args6Impl<>(this.left, this.right.map5(f5), this.cross);
            }

            @Override
            public <R6> Iterative1Args6<T1, A1, A2, A3, A4, A5, R6> map6(Fn1<? super A6, ? extends R6> f6) {
                return new Iterative1Args6Impl<>(this.left, this.right.map6(f6), this.cross);
            }

            @Override
            public <R1, R2, R3, R4, R5, R6> Iterative1Args6<T1, R1, R2, R3, R4, R5, R6> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> f2, Fn1<? super A3, ? extends Iterable<? extends R3>> f3, Fn1<? super A4, ? extends Iterable<? extends R4>> f4, Fn1<? super A5, ? extends Iterable<? extends R5>> f5, Fn1<? super A6, ? extends Iterable<? extends R6>> f6) {
                return new Iterative1Args6Impl<>(this.left, this.right.flatMap(f1, f2, f3, f4, f5, f6), this.cross);
            }

            @Override
            public <R1> Iterative1Args6<T1, R1, A2, A3, A4, A5, A6> flatMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative1Args6Impl<>(this.left, this.right.flatMap1(f1), this.cross);
            }

            @Override
            public <R2> Iterative1Args6<T1, A1, R2, A3, A4, A5, A6> flatMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative1Args6Impl<>(this.left, this.right.flatMap2(f2), this.cross);
            }

            @Override
            public <R3> Iterative1Args6<T1, A1, A2, R3, A4, A5, A6> flatMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> f3) {
                return new Iterative1Args6Impl<>(this.left, this.right.flatMap3(f3), this.cross);
            }

            @Override
            public <R4> Iterative1Args6<T1, A1, A2, A3, R4, A5, A6> flatMap4(Fn1<? super A4, ? extends Iterable<? extends R4>> f4) {
                return new Iterative1Args6Impl<>(this.left, this.right.flatMap4(f4), this.cross);
            }

            @Override
            public <R5> Iterative1Args6<T1, A1, A2, A3, A4, R5, A6> flatMap5(Fn1<? super A5, ? extends Iterable<? extends R5>> f5) {
                return new Iterative1Args6Impl<>(this.left, this.right.flatMap5(f5), this.cross);
            }

            @Override
            public <R6> Iterative1Args6<T1, A1, A2, A3, A4, A5, R6> flatMap6(Fn1<? super A6, ? extends Iterable<? extends R6>> f6) {
                return new Iterative1Args6Impl<>(this.left, this.right.flatMap6(f6), this.cross);
            }

            @Override
            public <R1, R2, R3, R4, R5, R6> Iterative1Args6<T1, R1, R2, R3, R4, R5, R6> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> f2, Fn1<? super A3, ? extends Iterable<? extends R3>> f3, Fn1<? super A4, ? extends Iterable<? extends R4>> f4, Fn1<? super A5, ? extends Iterable<? extends R5>> f5, Fn1<? super A6, ? extends Iterable<? extends R6>> f6) {
                return new Iterative1Args6Impl<>(this.left, this.right.inlineMap(f1, f2, f3, f4, f5, f6), this.cross);
            }

            @Override
            public <R1> Iterative1Args6<T1, R1, A2, A3, A4, A5, A6> inlineMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative1Args6Impl<>(this.left, this.right.inlineMap1(f1), this.cross);
            }

            @Override
            public <R2> Iterative1Args6<T1, A1, R2, A3, A4, A5, A6> inlineMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative1Args6Impl<>(this.left, this.right.inlineMap2(f2), this.cross);
            }

            @Override
            public <R3> Iterative1Args6<T1, A1, A2, R3, A4, A5, A6> inlineMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> f3) {
                return new Iterative1Args6Impl<>(this.left, this.right.inlineMap3(f3), this.cross);
            }

            @Override
            public <R4> Iterative1Args6<T1, A1, A2, A3, R4, A5, A6> inlineMap4(Fn1<? super A4, ? extends Iterable<? extends R4>> f4) {
                return new Iterative1Args6Impl<>(this.left, this.right.inlineMap4(f4), this.cross);
            }

            @Override
            public <R5> Iterative1Args6<T1, A1, A2, A3, A4, R5, A6> inlineMap5(Fn1<? super A5, ? extends Iterable<? extends R5>> f5) {
                return new Iterative1Args6Impl<>(this.left, this.right.inlineMap5(f5), this.cross);
            }

            @Override
            public <R6> Iterative1Args6<T1, A1, A2, A3, A4, A5, R6> inlineMap6(Fn1<? super A6, ? extends Iterable<? extends R6>> f6) {
                return new Iterative1Args6Impl<>(this.left, this.right.inlineMap6(f6), this.cross);
            }

            @Override
            public Iterative1Args6<T1, A1, A2, A3, A4, A5, A6> filter(Pr1<? super A1> p1, Pr1<? super A2> p2, Pr1<? super A3> p3, Pr1<? super A4> p4, Pr1<? super A5> p5, Pr1<? super A6> p6) {
                return new Iterative1Args6Impl<>(this.left, this.right.filter(p1, p2, p3, p4, p5, p6), this.cross);
            }

            @Override
            public Iterative1Args6<T1, A1, A2, A3, A4, A5, A6> filter1(Pr1<? super A1> p1) {
                return new Iterative1Args6Impl<>(this.left, this.right.filter1(p1), this.cross);
            }

            @Override
            public Iterative1Args6<T1, A1, A2, A3, A4, A5, A6> filter2(Pr1<? super A2> p2) {
                return new Iterative1Args6Impl<>(this.left, this.right.filter2(p2), this.cross);
            }

            @Override
            public Iterative1Args6<T1, A1, A2, A3, A4, A5, A6> filter3(Pr1<? super A3> p3) {
                return new Iterative1Args6Impl<>(this.left, this.right.filter3(p3), this.cross);
            }

            @Override
            public Iterative1Args6<T1, A1, A2, A3, A4, A5, A6> filter4(Pr1<? super A4> p4) {
                return new Iterative1Args6Impl<>(this.left, this.right.filter4(p4), this.cross);
            }

            @Override
            public Iterative1Args6<T1, A1, A2, A3, A4, A5, A6> filter5(Pr1<? super A5> p5) {
                return new Iterative1Args6Impl<>(this.left, this.right.filter5(p5), this.cross);
            }

            @Override
            public Iterative1Args6<T1, A1, A2, A3, A4, A5, A6> filter6(Pr1<? super A6> p6) {
                return new Iterative1Args6Impl<>(this.left, this.right.filter6(p6), this.cross);
            }

        }

    }

    public static interface Iterative1Args5<T1, A1, A2, A3, A4, A5> extends Iterative1Args<T1> {

        public <R1> Iterative1<R1> mapping(Fn6<? super T1, ? super A1, ? super A2, ? super A3, ? super A4, ? super A5, ? extends R1> f1);

        public <R1> Iterative1<R1> inverseMapping(Fn6<? super A1, ? super A2, ? super A3, ? super A4, ? super A5, ? super T1, ? extends R1> f1);

        public <R1, R2, R3, R4, R5> Iterative1Args5<T1, R1, R2, R3, R4, R5> map(Fn1<? super A1, ? extends R1> f1, Fn1<? super A2, ? extends R2> f2, Fn1<? super A3, ? extends R3> f3, Fn1<? super A4, ? extends R4> f4, Fn1<? super A5, ? extends R5> f5);

        public <R1> Iterative1Args5<T1, R1, A2, A3, A4, A5> map1(Fn1<? super A1, ? extends R1> f1);

        public <R2> Iterative1Args5<T1, A1, R2, A3, A4, A5> map2(Fn1<? super A2, ? extends R2> f1);

        public <R3> Iterative1Args5<T1, A1, A2, R3, A4, A5> map3(Fn1<? super A3, ? extends R3> f1);

        public <R4> Iterative1Args5<T1, A1, A2, A3, R4, A5> map4(Fn1<? super A4, ? extends R4> f1);

        public <R5> Iterative1Args5<T1, A1, A2, A3, A4, R5> map5(Fn1<? super A5, ? extends R5> f1);

        public <R1, R2, R3, R4, R5> Iterative1Args5<T1, R1, R2, R3, R4, R5> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> i2, Fn1<? super A3, ? extends Iterable<? extends R3>> f3, Fn1<? super A4, ? extends Iterable<? extends R4>> i4, Fn1<? super A5, ? extends Iterable<? extends R5>> f5);

        public <R1> Iterative1Args5<T1, R1, A2, A3, A4, A5> flatMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1);

        public <R2> Iterative1Args5<T1, A1, R2, A3, A4, A5> flatMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f1);

        public <R3> Iterative1Args5<T1, A1, A2, R3, A4, A5> flatMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> f1);

        public <R4> Iterative1Args5<T1, A1, A2, A3, R4, A5> flatMap4(Fn1<? super A4, ? extends Iterable<? extends R4>> f1);

        public <R5> Iterative1Args5<T1, A1, A2, A3, A4, R5> flatMap5(Fn1<? super A5, ? extends Iterable<? extends R5>> f1);

        public <R1, R2, R3, R4, R5> Iterative1Args5<T1, R1, R2, R3, R4, R5> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> i2, Fn1<? super A3, ? extends Iterable<? extends R3>> f3, Fn1<? super A4, ? extends Iterable<? extends R4>> i4, Fn1<? super A5, ? extends Iterable<? extends R5>> f5);

        public <R1> Iterative1Args5<T1, R1, A2, A3, A4, A5> inlineMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1);

        public <R2> Iterative1Args5<T1, A1, R2, A3, A4, A5> inlineMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f1);

        public <R3> Iterative1Args5<T1, A1, A2, R3, A4, A5> inlineMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> f1);

        public <R4> Iterative1Args5<T1, A1, A2, A3, R4, A5> inlineMap4(Fn1<? super A4, ? extends Iterable<? extends R4>> f1);

        public <R5> Iterative1Args5<T1, A1, A2, A3, A4, R5> inlineMap5(Fn1<? super A5, ? extends Iterable<? extends R5>> f1);

        public Iterative1Args5<T1, A1, A2, A3, A4, A5> filter(Pr1<? super A1> p1, Pr1<? super A2> p2, Pr1<? super A3> p3, Pr1<? super A4> p4, Pr1<? super A5> p5);

        public Iterative1Args5<T1, A1, A2, A3, A4, A5> filter1(Pr1<? super A1> p1);

        public Iterative1Args5<T1, A1, A2, A3, A4, A5> filter2(Pr1<? super A2> p1);

        public Iterative1Args5<T1, A1, A2, A3, A4, A5> filter3(Pr1<? super A3> p1);

        public Iterative1Args5<T1, A1, A2, A3, A4, A5> filter4(Pr1<? super A4> p1);

        public Iterative1Args5<T1, A1, A2, A3, A4, A5> filter5(Pr1<? super A5> p1);

        public static class Iterative1Args5Impl<T1, A1, A2, A3, A4, A5> implements Iterative1Args5<T1, A1, A2, A3, A4, A5> {

            final boolean cross;
            final Iterative1<T1> left;
            final Iterative5<A1, A2, A3, A4, A5> right;

            Iterative1Args5Impl(Iterative1<? extends T1> left, Iterative5<? extends A1, ? extends A2, ? extends A3, ? extends A4, ? extends A5> right, boolean cross) {
                Objects.requireNonNull(left, "left is null");
                Objects.requireNonNull(right, "right is null");
                this.cross = cross;
                this.left = Iterative.narrow(left);
                this.right = Iterative.narrow(right);
            }

            @Override
            public <R1> Iterative1<R1> mapping(Fn6<? super T1, ? super A1, ? super A2, ? super A3, ? super A4, ? super A5, ? extends R1> f1) {
                Objects.requireNonNull(f1, "f1 is null");
                final Stream<Tuple5<A1, A2, A3, A4, A5>> stream = this.right.toStream();
                final Iterative1<T1> i1 = this.left.create(this.left.iterableStream1());
                return (this.cross ? i1.pushBackCrossOf(stream) : i1.pushBackInlineOf(stream)).reduce((t1, tuple) -> f1.apply(t1, tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5()));
            }

            @Override
            public <R1> Iterative1<R1> inverseMapping(Fn6<? super A1, ? super A2, ? super A3, ? super A4, ? super A5, ? super T1, ? extends R1> f1) {
                return this.mapping((t1, a1, a2, a3, a4, a5) -> f1.apply(a1, a2, a3, a4, a5, t1));
            }

            @Override
            public <R1, R2, R3, R4, R5> Iterative1Args5<T1, R1, R2, R3, R4, R5> map(Fn1<? super A1, ? extends R1> f1, Fn1<? super A2, ? extends R2> f2, Fn1<? super A3, ? extends R3> f3, Fn1<? super A4, ? extends R4> f4, Fn1<? super A5, ? extends R5> f5) {
                return new Iterative1Args5Impl<>(this.left, this.right.map(f1, f2, f3, f4, f5), this.cross);
            }

            @Override
            public <R1> Iterative1Args5<T1, R1, A2, A3, A4, A5> map1(Fn1<? super A1, ? extends R1> f1) {
                return new Iterative1Args5Impl<>(this.left, this.right.map1(f1), this.cross);
            }

            @Override
            public <R2> Iterative1Args5<T1, A1, R2, A3, A4, A5> map2(Fn1<? super A2, ? extends R2> f2) {
                return new Iterative1Args5Impl<>(this.left, this.right.map2(f2), this.cross);
            }

            @Override
            public <R3> Iterative1Args5<T1, A1, A2, R3, A4, A5> map3(Fn1<? super A3, ? extends R3> f3) {
                return new Iterative1Args5Impl<>(this.left, this.right.map3(f3), this.cross);
            }

            @Override
            public <R4> Iterative1Args5<T1, A1, A2, A3, R4, A5> map4(Fn1<? super A4, ? extends R4> f4) {
                return new Iterative1Args5Impl<>(this.left, this.right.map4(f4), this.cross);
            }

            @Override
            public <R5> Iterative1Args5<T1, A1, A2, A3, A4, R5> map5(Fn1<? super A5, ? extends R5> f5) {
                return new Iterative1Args5Impl<>(this.left, this.right.map5(f5), this.cross);
            }

            @Override
            public <R1, R2, R3, R4, R5> Iterative1Args5<T1, R1, R2, R3, R4, R5> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> f2, Fn1<? super A3, ? extends Iterable<? extends R3>> f3, Fn1<? super A4, ? extends Iterable<? extends R4>> f4, Fn1<? super A5, ? extends Iterable<? extends R5>> f5) {
                return new Iterative1Args5Impl<>(this.left, this.right.flatMap(f1, f2, f3, f4, f5), this.cross);
            }

            @Override
            public <R1> Iterative1Args5<T1, R1, A2, A3, A4, A5> flatMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative1Args5Impl<>(this.left, this.right.flatMap1(f1), this.cross);
            }

            @Override
            public <R2> Iterative1Args5<T1, A1, R2, A3, A4, A5> flatMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative1Args5Impl<>(this.left, this.right.flatMap2(f2), this.cross);
            }

            @Override
            public <R3> Iterative1Args5<T1, A1, A2, R3, A4, A5> flatMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> f3) {
                return new Iterative1Args5Impl<>(this.left, this.right.flatMap3(f3), this.cross);
            }

            @Override
            public <R4> Iterative1Args5<T1, A1, A2, A3, R4, A5> flatMap4(Fn1<? super A4, ? extends Iterable<? extends R4>> f4) {
                return new Iterative1Args5Impl<>(this.left, this.right.flatMap4(f4), this.cross);
            }

            @Override
            public <R5> Iterative1Args5<T1, A1, A2, A3, A4, R5> flatMap5(Fn1<? super A5, ? extends Iterable<? extends R5>> f5) {
                return new Iterative1Args5Impl<>(this.left, this.right.flatMap5(f5), this.cross);
            }

            @Override
            public <R1, R2, R3, R4, R5> Iterative1Args5<T1, R1, R2, R3, R4, R5> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> f2, Fn1<? super A3, ? extends Iterable<? extends R3>> f3, Fn1<? super A4, ? extends Iterable<? extends R4>> f4, Fn1<? super A5, ? extends Iterable<? extends R5>> f5) {
                return new Iterative1Args5Impl<>(this.left, this.right.inlineMap(f1, f2, f3, f4, f5), this.cross);
            }

            @Override
            public <R1> Iterative1Args5<T1, R1, A2, A3, A4, A5> inlineMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative1Args5Impl<>(this.left, this.right.inlineMap1(f1), this.cross);
            }

            @Override
            public <R2> Iterative1Args5<T1, A1, R2, A3, A4, A5> inlineMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative1Args5Impl<>(this.left, this.right.inlineMap2(f2), this.cross);
            }

            @Override
            public <R3> Iterative1Args5<T1, A1, A2, R3, A4, A5> inlineMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> f3) {
                return new Iterative1Args5Impl<>(this.left, this.right.inlineMap3(f3), this.cross);
            }

            @Override
            public <R4> Iterative1Args5<T1, A1, A2, A3, R4, A5> inlineMap4(Fn1<? super A4, ? extends Iterable<? extends R4>> f4) {
                return new Iterative1Args5Impl<>(this.left, this.right.inlineMap4(f4), this.cross);
            }

            @Override
            public <R5> Iterative1Args5<T1, A1, A2, A3, A4, R5> inlineMap5(Fn1<? super A5, ? extends Iterable<? extends R5>> f5) {
                return new Iterative1Args5Impl<>(this.left, this.right.inlineMap5(f5), this.cross);
            }

            @Override
            public Iterative1Args5<T1, A1, A2, A3, A4, A5> filter(Pr1<? super A1> p1, Pr1<? super A2> p2, Pr1<? super A3> p3, Pr1<? super A4> p4, Pr1<? super A5> p5) {
                return new Iterative1Args5Impl<>(this.left, this.right.filter(p1, p2, p3, p4, p5), this.cross);
            }

            @Override
            public Iterative1Args5<T1, A1, A2, A3, A4, A5> filter1(Pr1<? super A1> p1) {
                return new Iterative1Args5Impl<>(this.left, this.right.filter1(p1), this.cross);
            }

            @Override
            public Iterative1Args5<T1, A1, A2, A3, A4, A5> filter2(Pr1<? super A2> p2) {
                return new Iterative1Args5Impl<>(this.left, this.right.filter2(p2), this.cross);
            }

            @Override
            public Iterative1Args5<T1, A1, A2, A3, A4, A5> filter3(Pr1<? super A3> p3) {
                return new Iterative1Args5Impl<>(this.left, this.right.filter3(p3), this.cross);
            }

            @Override
            public Iterative1Args5<T1, A1, A2, A3, A4, A5> filter4(Pr1<? super A4> p4) {
                return new Iterative1Args5Impl<>(this.left, this.right.filter4(p4), this.cross);
            }

            @Override
            public Iterative1Args5<T1, A1, A2, A3, A4, A5> filter5(Pr1<? super A5> p5) {
                return new Iterative1Args5Impl<>(this.left, this.right.filter5(p5), this.cross);
            }

        }

    }

    public static interface Iterative1Args4<T1, A1, A2, A3, A4> extends Iterative1Args<T1> {

        public <R1> Iterative1<R1> mapping(Fn5<? super T1, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R1> f1);

        public <R1> Iterative1<R1> inverseMapping(Fn5<? super A1, ? super A2, ? super A3, ? super A4, ? super T1, ? extends R1> f1);

        public <R1, R2, R3, R4> Iterative1Args4<T1, R1, R2, R3, R4> map(Fn1<? super A1, ? extends R1> f1, Fn1<? super A2, ? extends R2> f2, Fn1<? super A3, ? extends R3> f3, Fn1<? super A4, ? extends R4> f4);

        public <R1> Iterative1Args4<T1, R1, A2, A3, A4> map1(Fn1<? super A1, ? extends R1> f1);

        public <R2> Iterative1Args4<T1, A1, R2, A3, A4> map2(Fn1<? super A2, ? extends R2> f1);

        public <R3> Iterative1Args4<T1, A1, A2, R3, A4> map3(Fn1<? super A3, ? extends R3> f1);

        public <R4> Iterative1Args4<T1, A1, A2, A3, R4> map4(Fn1<? super A4, ? extends R4> f1);

        public <R1, R2, R3, R4> Iterative1Args4<T1, R1, R2, R3, R4> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> i2, Fn1<? super A3, ? extends Iterable<? extends R3>> f3, Fn1<? super A4, ? extends Iterable<? extends R4>> i4);

        public <R1> Iterative1Args4<T1, R1, A2, A3, A4> flatMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1);

        public <R2> Iterative1Args4<T1, A1, R2, A3, A4> flatMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f1);

        public <R3> Iterative1Args4<T1, A1, A2, R3, A4> flatMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> f1);

        public <R4> Iterative1Args4<T1, A1, A2, A3, R4> flatMap4(Fn1<? super A4, ? extends Iterable<? extends R4>> f1);

        public <R1, R2, R3, R4> Iterative1Args4<T1, R1, R2, R3, R4> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> i2, Fn1<? super A3, ? extends Iterable<? extends R3>> f3, Fn1<? super A4, ? extends Iterable<? extends R4>> i4);

        public <R1> Iterative1Args4<T1, R1, A2, A3, A4> inlineMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1);

        public <R2> Iterative1Args4<T1, A1, R2, A3, A4> inlineMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f1);

        public <R3> Iterative1Args4<T1, A1, A2, R3, A4> inlineMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> f1);

        public <R4> Iterative1Args4<T1, A1, A2, A3, R4> inlineMap4(Fn1<? super A4, ? extends Iterable<? extends R4>> f1);

        public Iterative1Args4<T1, A1, A2, A3, A4> filter(Pr1<? super A1> p1, Pr1<? super A2> p2, Pr1<? super A3> p3, Pr1<? super A4> p4);

        public Iterative1Args4<T1, A1, A2, A3, A4> filter1(Pr1<? super A1> p1);

        public Iterative1Args4<T1, A1, A2, A3, A4> filter2(Pr1<? super A2> p1);

        public Iterative1Args4<T1, A1, A2, A3, A4> filter3(Pr1<? super A3> p1);

        public Iterative1Args4<T1, A1, A2, A3, A4> filter4(Pr1<? super A4> p1);

        public static class Iterative1Args4Impl<T1, A1, A2, A3, A4> implements Iterative1Args4<T1, A1, A2, A3, A4> {

            final boolean cross;
            final Iterative1<T1> left;
            final Iterative4<A1, A2, A3, A4> right;

            Iterative1Args4Impl(Iterative1<? extends T1> left, Iterative4<? extends A1, ? extends A2, ? extends A3, ? extends A4> right, boolean cross) {
                Objects.requireNonNull(left, "left is null");
                Objects.requireNonNull(right, "right is null");
                this.cross = cross;
                this.left = Iterative.narrow(left);
                this.right = Iterative.narrow(right);
            }

            @Override
            public <R1> Iterative1<R1> mapping(Fn5<? super T1, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R1> f1) {
                Objects.requireNonNull(f1, "f1 is null");
                final Stream<Tuple4<A1, A2, A3, A4>> stream = this.right.toStream();
                final Iterative1<T1> i1 = this.left.create(this.left.iterableStream1());
                return (this.cross ? i1.pushBackCrossOf(stream) : i1.pushBackInlineOf(stream)).reduce((t1, tuple) -> f1.apply(t1, tuple._1(), tuple._2(), tuple._3(), tuple._4()));
            }

            @Override
            public <R1> Iterative1<R1> inverseMapping(Fn5<? super A1, ? super A2, ? super A3, ? super A4, ? super T1, ? extends R1> f1) {
                return this.mapping((t1, a1, a2, a3, a4) -> f1.apply(a1, a2, a3, a4, t1));
            }

            @Override
            public <R1, R2, R3, R4> Iterative1Args4<T1, R1, R2, R3, R4> map(Fn1<? super A1, ? extends R1> f1, Fn1<? super A2, ? extends R2> f2, Fn1<? super A3, ? extends R3> f3, Fn1<? super A4, ? extends R4> f4) {
                return new Iterative1Args4Impl<>(this.left, this.right.map(f1, f2, f3, f4), this.cross);
            }

            @Override
            public <R1> Iterative1Args4<T1, R1, A2, A3, A4> map1(Fn1<? super A1, ? extends R1> f1) {
                return new Iterative1Args4Impl<>(this.left, this.right.map1(f1), this.cross);
            }

            @Override
            public <R2> Iterative1Args4<T1, A1, R2, A3, A4> map2(Fn1<? super A2, ? extends R2> f2) {
                return new Iterative1Args4Impl<>(this.left, this.right.map2(f2), this.cross);
            }

            @Override
            public <R3> Iterative1Args4<T1, A1, A2, R3, A4> map3(Fn1<? super A3, ? extends R3> f3) {
                return new Iterative1Args4Impl<>(this.left, this.right.map3(f3), this.cross);
            }

            @Override
            public <R4> Iterative1Args4<T1, A1, A2, A3, R4> map4(Fn1<? super A4, ? extends R4> f4) {
                return new Iterative1Args4Impl<>(this.left, this.right.map4(f4), this.cross);
            }

            @Override
            public <R1, R2, R3, R4> Iterative1Args4<T1, R1, R2, R3, R4> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> f2, Fn1<? super A3, ? extends Iterable<? extends R3>> f3, Fn1<? super A4, ? extends Iterable<? extends R4>> f4) {
                return new Iterative1Args4Impl<>(this.left, this.right.flatMap(f1, f2, f3, f4), this.cross);
            }

            @Override
            public <R1> Iterative1Args4<T1, R1, A2, A3, A4> flatMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative1Args4Impl<>(this.left, this.right.flatMap1(f1), this.cross);
            }

            @Override
            public <R2> Iterative1Args4<T1, A1, R2, A3, A4> flatMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative1Args4Impl<>(this.left, this.right.flatMap2(f2), this.cross);
            }

            @Override
            public <R3> Iterative1Args4<T1, A1, A2, R3, A4> flatMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> f3) {
                return new Iterative1Args4Impl<>(this.left, this.right.flatMap3(f3), this.cross);
            }

            @Override
            public <R4> Iterative1Args4<T1, A1, A2, A3, R4> flatMap4(Fn1<? super A4, ? extends Iterable<? extends R4>> f4) {
                return new Iterative1Args4Impl<>(this.left, this.right.flatMap4(f4), this.cross);
            }

            @Override
            public <R1, R2, R3, R4> Iterative1Args4<T1, R1, R2, R3, R4> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> f2, Fn1<? super A3, ? extends Iterable<? extends R3>> f3, Fn1<? super A4, ? extends Iterable<? extends R4>> f4) {
                return new Iterative1Args4Impl<>(this.left, this.right.inlineMap(f1, f2, f3, f4), this.cross);
            }

            @Override
            public <R1> Iterative1Args4<T1, R1, A2, A3, A4> inlineMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative1Args4Impl<>(this.left, this.right.inlineMap1(f1), this.cross);
            }

            @Override
            public <R2> Iterative1Args4<T1, A1, R2, A3, A4> inlineMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative1Args4Impl<>(this.left, this.right.inlineMap2(f2), this.cross);
            }

            @Override
            public <R3> Iterative1Args4<T1, A1, A2, R3, A4> inlineMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> f3) {
                return new Iterative1Args4Impl<>(this.left, this.right.inlineMap3(f3), this.cross);
            }

            @Override
            public <R4> Iterative1Args4<T1, A1, A2, A3, R4> inlineMap4(Fn1<? super A4, ? extends Iterable<? extends R4>> f4) {
                return new Iterative1Args4Impl<>(this.left, this.right.inlineMap4(f4), this.cross);
            }

            @Override
            public Iterative1Args4<T1, A1, A2, A3, A4> filter(Pr1<? super A1> p1, Pr1<? super A2> p2, Pr1<? super A3> p3, Pr1<? super A4> p4) {
                return new Iterative1Args4Impl<>(this.left, this.right.filter(p1, p2, p3, p4), this.cross);
            }

            @Override
            public Iterative1Args4<T1, A1, A2, A3, A4> filter1(Pr1<? super A1> p1) {
                return new Iterative1Args4Impl<>(this.left, this.right.filter1(p1), this.cross);
            }

            @Override
            public Iterative1Args4<T1, A1, A2, A3, A4> filter2(Pr1<? super A2> p2) {
                return new Iterative1Args4Impl<>(this.left, this.right.filter2(p2), this.cross);
            }

            @Override
            public Iterative1Args4<T1, A1, A2, A3, A4> filter3(Pr1<? super A3> p3) {
                return new Iterative1Args4Impl<>(this.left, this.right.filter3(p3), this.cross);
            }

            @Override
            public Iterative1Args4<T1, A1, A2, A3, A4> filter4(Pr1<? super A4> p4) {
                return new Iterative1Args4Impl<>(this.left, this.right.filter4(p4), this.cross);
            }

        }

    }

    public static interface Iterative1Args3<T1, A1, A2, A3> extends Iterative1Args<T1> {

        public <R1> Iterative1<R1> mapping(Fn4<? super T1, ? super A1, ? super A2, ? super A3, ? extends R1> f1);

        public <R1> Iterative1<R1> inverseMapping(Fn4<? super A1, ? super A2, ? super A3, ? super T1, ? extends R1> f1);

        public <R1, R2, R3> Iterative1Args3<T1, R1, R2, R3> map(Fn1<? super A1, ? extends R1> f1, Fn1<? super A2, ? extends R2> f2, Fn1<? super A3, ? extends R3> f3);

        public <R1> Iterative1Args3<T1, R1, A2, A3> map1(Fn1<? super A1, ? extends R1> f1);

        public <R2> Iterative1Args3<T1, A1, R2, A3> map2(Fn1<? super A2, ? extends R2> f1);

        public <R3> Iterative1Args3<T1, A1, A2, R3> map3(Fn1<? super A3, ? extends R3> f1);

        public <R1, R2, R3> Iterative1Args3<T1, R1, R2, R3> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> i2, Fn1<? super A3, ? extends Iterable<? extends R3>> f3);

        public <R1> Iterative1Args3<T1, R1, A2, A3> flatMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1);

        public <R2> Iterative1Args3<T1, A1, R2, A3> flatMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f1);

        public <R3> Iterative1Args3<T1, A1, A2, R3> flatMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> f1);

        public <R1, R2, R3> Iterative1Args3<T1, R1, R2, R3> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> i2, Fn1<? super A3, ? extends Iterable<? extends R3>> f3);

        public <R1> Iterative1Args3<T1, R1, A2, A3> inlineMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1);

        public <R2> Iterative1Args3<T1, A1, R2, A3> inlineMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f1);

        public <R3> Iterative1Args3<T1, A1, A2, R3> inlineMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> f1);

        public Iterative1Args3<T1, A1, A2, A3> filter(Pr1<? super A1> p1, Pr1<? super A2> p2, Pr1<? super A3> p3);

        public Iterative1Args3<T1, A1, A2, A3> filter1(Pr1<? super A1> p1);

        public Iterative1Args3<T1, A1, A2, A3> filter2(Pr1<? super A2> p1);

        public Iterative1Args3<T1, A1, A2, A3> filter3(Pr1<? super A3> p1);

        public static class Iterative1Args3Impl<T1, A1, A2, A3> implements Iterative1Args3<T1, A1, A2, A3> {

            final boolean cross;
            final Iterative1<T1> left;
            final Iterative3<A1, A2, A3> right;

            Iterative1Args3Impl(Iterative1<? extends T1> left, Iterative3<? extends A1, ? extends A2, ? extends A3> right, boolean cross) {
                Objects.requireNonNull(left, "left is null");
                Objects.requireNonNull(right, "right is null");
                this.cross = cross;
                this.left = Iterative.narrow(left);
                this.right = Iterative.narrow(right);
            }

            @Override
            public <R1> Iterative1<R1> mapping(Fn4<? super T1, ? super A1, ? super A2, ? super A3, ? extends R1> f1) {
                Objects.requireNonNull(f1, "f1 is null");
                final Stream<Tuple3<A1, A2, A3>> stream = this.right.toStream();
                final Iterative1<T1> i1 = this.left.create(this.left.iterableStream1());
                return (this.cross ? i1.pushBackCrossOf(stream) : i1.pushBackInlineOf(stream)).reduce((t1, tuple) -> f1.apply(t1, tuple._1(), tuple._2(), tuple._3()));
            }

            @Override
            public <R1> Iterative1<R1> inverseMapping(Fn4<? super A1, ? super A2, ? super A3, ? super T1, ? extends R1> f1) {
                return this.mapping((t1, a1, a2, a3) -> f1.apply(a1, a2, a3, t1));
            }

            @Override
            public <R1, R2, R3> Iterative1Args3<T1, R1, R2, R3> map(Fn1<? super A1, ? extends R1> f1, Fn1<? super A2, ? extends R2> f2, Fn1<? super A3, ? extends R3> f3) {
                return new Iterative1Args3Impl<>(this.left, this.right.map(f1, f2, f3), this.cross);
            }

            @Override
            public <R1> Iterative1Args3<T1, R1, A2, A3> map1(Fn1<? super A1, ? extends R1> f1) {
                return new Iterative1Args3Impl<>(this.left, this.right.map1(f1), this.cross);
            }

            @Override
            public <R2> Iterative1Args3<T1, A1, R2, A3> map2(Fn1<? super A2, ? extends R2> f2) {
                return new Iterative1Args3Impl<>(this.left, this.right.map2(f2), this.cross);
            }

            @Override
            public <R3> Iterative1Args3<T1, A1, A2, R3> map3(Fn1<? super A3, ? extends R3> f3) {
                return new Iterative1Args3Impl<>(this.left, this.right.map3(f3), this.cross);
            }

            @Override
            public <R1, R2, R3> Iterative1Args3<T1, R1, R2, R3> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> f2, Fn1<? super A3, ? extends Iterable<? extends R3>> f3) {
                return new Iterative1Args3Impl<>(this.left, this.right.flatMap(f1, f2, f3), this.cross);
            }

            @Override
            public <R1> Iterative1Args3<T1, R1, A2, A3> flatMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative1Args3Impl<>(this.left, this.right.flatMap1(f1), this.cross);
            }

            @Override
            public <R2> Iterative1Args3<T1, A1, R2, A3> flatMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative1Args3Impl<>(this.left, this.right.flatMap2(f2), this.cross);
            }

            @Override
            public <R3> Iterative1Args3<T1, A1, A2, R3> flatMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> f3) {
                return new Iterative1Args3Impl<>(this.left, this.right.flatMap3(f3), this.cross);
            }

            @Override
            public <R1, R2, R3> Iterative1Args3<T1, R1, R2, R3> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> f2, Fn1<? super A3, ? extends Iterable<? extends R3>> f3) {
                return new Iterative1Args3Impl<>(this.left, this.right.inlineMap(f1, f2, f3), this.cross);
            }

            @Override
            public <R1> Iterative1Args3<T1, R1, A2, A3> inlineMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative1Args3Impl<>(this.left, this.right.inlineMap1(f1), this.cross);
            }

            @Override
            public <R2> Iterative1Args3<T1, A1, R2, A3> inlineMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative1Args3Impl<>(this.left, this.right.inlineMap2(f2), this.cross);
            }

            @Override
            public <R3> Iterative1Args3<T1, A1, A2, R3> inlineMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> f3) {
                return new Iterative1Args3Impl<>(this.left, this.right.inlineMap3(f3), this.cross);
            }

            @Override
            public Iterative1Args3<T1, A1, A2, A3> filter(Pr1<? super A1> p1, Pr1<? super A2> p2, Pr1<? super A3> p3) {
                return new Iterative1Args3Impl<>(this.left, this.right.filter(p1, p2, p3), this.cross);
            }

            @Override
            public Iterative1Args3<T1, A1, A2, A3> filter1(Pr1<? super A1> p1) {
                return new Iterative1Args3Impl<>(this.left, this.right.filter1(p1), this.cross);
            }

            @Override
            public Iterative1Args3<T1, A1, A2, A3> filter2(Pr1<? super A2> p2) {
                return new Iterative1Args3Impl<>(this.left, this.right.filter2(p2), this.cross);
            }

            @Override
            public Iterative1Args3<T1, A1, A2, A3> filter3(Pr1<? super A3> p3) {
                return new Iterative1Args3Impl<>(this.left, this.right.filter3(p3), this.cross);
            }

        }

    }

    public static interface Iterative1Args2<T1, A1, A2> extends Iterative1Args<T1> {

        public <R1> Iterative1<R1> mapping(Fn3<? super T1, ? super A1, ? super A2, ? extends R1> f1);

        public <R1> Iterative1<R1> inverseMapping(Fn3<? super A1, ? super A2, ? super T1, ? extends R1> f1);

        public <R1, R2> Iterative1Args2<T1, R1, R2> map(Fn1<? super A1, ? extends R1> f1, Fn1<? super A2, ? extends R2> f2);

        public <R1> Iterative1Args2<T1, R1, A2> map1(Fn1<? super A1, ? extends R1> f1);

        public <R2> Iterative1Args2<T1, A1, R2> map2(Fn1<? super A2, ? extends R2> f1);

        public <R1, R2> Iterative1Args2<T1, R1, R2> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> i2);

        public <R1> Iterative1Args2<T1, R1, A2> flatMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1);

        public <R2> Iterative1Args2<T1, A1, R2> flatMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f1);

        public <R1, R2> Iterative1Args2<T1, R1, R2> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> i2);

        public <R1> Iterative1Args2<T1, R1, A2> inlineMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1);

        public <R2> Iterative1Args2<T1, A1, R2> inlineMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f1);

        public Iterative1Args2<T1, A1, A2> filter(Pr1<? super A1> p1, Pr1<? super A2> p2);

        public Iterative1Args2<T1, A1, A2> filter1(Pr1<? super A1> p1);

        public Iterative1Args2<T1, A1, A2> filter2(Pr1<? super A2> p1);

        public static class Iterative1Args2Impl<T1, A1, A2> implements Iterative1Args2<T1, A1, A2> {

            final boolean cross;
            final Iterative1<T1> left;
            final Iterative2<A1, A2> right;

            Iterative1Args2Impl(Iterative1<? extends T1> left, Iterative2<? extends A1, ? extends A2> right, boolean cross) {
                Objects.requireNonNull(left, "left is null");
                Objects.requireNonNull(right, "right is null");
                this.cross = cross;
                this.left = Iterative.narrow(left);
                this.right = Iterative.narrow(right);
            }

            @Override
            public <R1> Iterative1<R1> mapping(Fn3<? super T1, ? super A1, ? super A2, ? extends R1> f1) {
                Objects.requireNonNull(f1, "f1 is null");
                final Stream<Tuple2<A1, A2>> stream = this.right.toStream();
                final Iterative1<T1> i1 = this.left.create(this.left.iterableStream1());
                return (this.cross ? i1.pushBackCrossOf(stream) : i1.pushBackInlineOf(stream)).reduce((t1, tuple) -> f1.apply(t1, tuple._1(), tuple._2()));
            }

            @Override
            public <R1> Iterative1<R1> inverseMapping(Fn3<? super A1, ? super A2, ? super T1, ? extends R1> f1) {
                return this.mapping((t1, a1, a2) -> f1.apply(a1, a2, t1));
            }

            @Override
            public <R1, R2> Iterative1Args2<T1, R1, R2> map(Fn1<? super A1, ? extends R1> f1, Fn1<? super A2, ? extends R2> f2) {
                return new Iterative1Args2Impl<>(this.left, this.right.map(f1, f2), this.cross);
            }

            @Override
            public <R1> Iterative1Args2<T1, R1, A2> map1(Fn1<? super A1, ? extends R1> f1) {
                return new Iterative1Args2Impl<>(this.left, this.right.map1(f1), this.cross);
            }

            @Override
            public <R2> Iterative1Args2<T1, A1, R2> map2(Fn1<? super A2, ? extends R2> f2) {
                return new Iterative1Args2Impl<>(this.left, this.right.map2(f2), this.cross);
            }

            @Override
            public <R1, R2> Iterative1Args2<T1, R1, R2> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative1Args2Impl<>(this.left, this.right.flatMap(f1, f2), this.cross);
            }

            @Override
            public <R1> Iterative1Args2<T1, R1, A2> flatMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative1Args2Impl<>(this.left, this.right.flatMap1(f1), this.cross);
            }

            @Override
            public <R2> Iterative1Args2<T1, A1, R2> flatMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative1Args2Impl<>(this.left, this.right.flatMap2(f2), this.cross);
            }

            @Override
            public <R1, R2> Iterative1Args2<T1, R1, R2> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative1Args2Impl<>(this.left, this.right.inlineMap(f1, f2), this.cross);
            }

            @Override
            public <R1> Iterative1Args2<T1, R1, A2> inlineMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative1Args2Impl<>(this.left, this.right.inlineMap1(f1), this.cross);
            }

            @Override
            public <R2> Iterative1Args2<T1, A1, R2> inlineMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative1Args2Impl<>(this.left, this.right.inlineMap2(f2), this.cross);
            }

            @Override
            public Iterative1Args2<T1, A1, A2> filter(Pr1<? super A1> p1, Pr1<? super A2> p2) {
                return new Iterative1Args2Impl<>(this.left, this.right.filter(p1, p2), this.cross);
            }

            @Override
            public Iterative1Args2<T1, A1, A2> filter1(Pr1<? super A1> p1) {
                return new Iterative1Args2Impl<>(this.left, this.right.filter1(p1), this.cross);
            }

            @Override
            public Iterative1Args2<T1, A1, A2> filter2(Pr1<? super A2> p2) {
                return new Iterative1Args2Impl<>(this.left, this.right.filter2(p2), this.cross);
            }

        }

    }

    public static interface Iterative1Args1<T1, A1> extends Iterative1Args<T1> {

        public <R1> Iterative1<R1> mapping(Fn2<? super T1, ? super A1, ? extends R1> f1);

        public <R1> Iterative1<R1> inverseMapping(Fn2<? super A1, ? super T1, ? extends R1> f1);

        public <R1> Iterative1Args1<T1, R1> map(Fn1<? super A1, ? extends R1> f1);

        public <R1> Iterative1Args1<T1, R1> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1);

        public <R1> Iterative1Args1<T1, R1> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1);

        public Iterative1Args1<T1, A1> filter(Pr1<? super A1> p1);

        public static class Iterative1Args1Impl<T1, A1> implements Iterative1Args1<T1, A1> {

            final boolean cross;
            final Iterative1<T1> left;
            final Iterative1<A1> right;

            Iterative1Args1Impl(Iterative1<? extends T1> left, Iterative1<? extends A1> right, boolean cross) {
                Objects.requireNonNull(left, "left is null");
                Objects.requireNonNull(right, "right is null");
                this.cross = cross;
                this.left = Iterative.narrow(left);
                this.right = Iterative.narrow(right);
            }

            @Override
            public <R1> Iterative1<R1> mapping(Fn2<? super T1, ? super A1, ? extends R1> f1) {
                Objects.requireNonNull(f1, "f1 is null");
                final Stream<Tuple1<A1>> stream = this.right.toStream();
                final Iterative1<T1> i1 = this.left.create(this.left.iterableStream1());
                return (this.cross ? i1.pushBackCrossOf(stream) : i1.pushBackInlineOf(stream)).reduce((t1, tuple) -> f1.apply(t1, tuple._1()));
            }

            @Override
            public <R1> Iterative1<R1> inverseMapping(Fn2<? super A1, ? super T1, ? extends R1> f1) {
                return this.mapping((t1, a1) -> f1.apply(a1, t1));
            }

            @Override
            public <R1> Iterative1Args1<T1, R1> map(Fn1<? super A1, ? extends R1> f1) {
                return new Iterative1Args1Impl<>(this.left, this.right.map(f1), this.cross);
            }

            @Override
            public <R1> Iterative1Args1<T1, R1> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative1Args1Impl<>(this.left, this.right.inlineMap(f1), this.cross);
            }

            @Override
            public <R1> Iterative1Args1<T1, R1> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative1Args1Impl<>(this.left, this.right.flatMap(f1), this.cross);
            }

            @Override
            public Iterative1Args1<T1, A1> filter(Pr1<? super A1> p1) {
                return new Iterative1Args1Impl<>(this.left, this.right.filter(p1), this.cross);
            }

        }

    }

}

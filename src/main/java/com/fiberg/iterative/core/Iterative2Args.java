package com.fiberg.iterative.core;

import com.fiberg.iterative.core.Iterative1;
import com.fiberg.iterative.core.Iterative2;
import com.fiberg.iterative.core.Iterative3;
import com.fiberg.iterative.core.Iterative4;
import com.fiberg.iterative.core.Iterative5;
import com.fiberg.iterative.core.Iterative6;
import com.fiberg.iterative.core.IterativeInternals;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fn2;
import com.fiberg.iterative.function.Fn3;
import com.fiberg.iterative.function.Fn4;
import com.fiberg.iterative.function.Fn5;
import com.fiberg.iterative.function.Fn6;
import com.fiberg.iterative.function.Fn7;
import com.fiberg.iterative.function.Pr1;
import io.vavr.Tuple1;
import io.vavr.Tuple2;
import io.vavr.Tuple3;
import io.vavr.Tuple4;
import io.vavr.Tuple5;
import io.vavr.Tuple6;
import io.vavr.collection.Stream;
import java.io.Serializable;
import java.util.Objects;

public interface Iterative2Args<T1, T2> {

    public static interface Iterative2Args6<T1, T2, A1, A2, A3, A4, A5, A6> extends Iterative2Args<T1, T2> {

        public <R1, R2> Iterative2<R1, R2> mapping(Fn7<? super T1, ? super A1, ? super A2, ? super A3, ? super A4, ? super A5, ? super A6, ? extends R1> var1, Fn7<? super T2, ? super A1, ? super A2, ? super A3, ? super A4, ? super A5, ? super A6, ? extends R2> var2);

        public <R1, R2> Iterative2<R1, R2> inverseMapping(Fn7<? super A1, ? super A2, ? super A3, ? super A4, ? super A5, ? super A6, ? super T1, ? extends R1> var1, Fn7<? super A1, ? super A2, ? super A3, ? super A4, ? super A5, ? super A6, ? super T2, ? extends R2> var2);

        public <R2> Iterative2<T1, R2> mappingRt(Fn7<? super T2, ? super A1, ? super A2, ? super A3, ? super A4, ? super A5, ? super A6, ? extends R2> var1);

        public <R1> Iterative2<R1, T2> mappingLt(Fn7<? super T1, ? super A1, ? super A2, ? super A3, ? super A4, ? super A5, ? super A6, ? extends R1> var1);

        public <R1, R2, R3, R4, R5, R6> Iterative2Args6<T1, T2, R1, R2, R3, R4, R5, R6> map(Fn1<? super A1, ? extends R1> var1, Fn1<? super A2, ? extends R2> var2, Fn1<? super A3, ? extends R3> var3, Fn1<? super A4, ? extends R4> var4, Fn1<? super A5, ? extends R5> var5, Fn1<? super A6, ? extends R6> var6);

        public <R1> Iterative2Args6<T1, T2, R1, A2, A3, A4, A5, A6> map1(Fn1<? super A1, ? extends R1> var1);

        public <R2> Iterative2Args6<T1, T2, A1, R2, A3, A4, A5, A6> map2(Fn1<? super A2, ? extends R2> var1);

        public <R3> Iterative2Args6<T1, T2, A1, A2, R3, A4, A5, A6> map3(Fn1<? super A3, ? extends R3> var1);

        public <R4> Iterative2Args6<T1, T2, A1, A2, A3, R4, A5, A6> map4(Fn1<? super A4, ? extends R4> var1);

        public <R5> Iterative2Args6<T1, T2, A1, A2, A3, A4, R5, A6> map5(Fn1<? super A5, ? extends R5> var1);

        public <R6> Iterative2Args6<T1, T2, A1, A2, A3, A4, A5, R6> map6(Fn1<? super A6, ? extends R6> var1);

        public <R1, R2, R3, R4, R5, R6> Iterative2Args6<T1, T2, R1, R2, R3, R4, R5, R6> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> var1, Fn1<? super A2, ? extends Iterable<? extends R2>> var2, Fn1<? super A3, ? extends Iterable<? extends R3>> var3, Fn1<? super A4, ? extends Iterable<? extends R4>> var4, Fn1<? super A5, ? extends Iterable<? extends R5>> var5, Fn1<? super A6, ? extends Iterable<? extends R6>> var6);

        public <R1> Iterative2Args6<T1, T2, R1, A2, A3, A4, A5, A6> flatMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> var1);

        public <R2> Iterative2Args6<T1, T2, A1, R2, A3, A4, A5, A6> flatMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> var1);

        public <R3> Iterative2Args6<T1, T2, A1, A2, R3, A4, A5, A6> flatMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> var1);

        public <R4> Iterative2Args6<T1, T2, A1, A2, A3, R4, A5, A6> flatMap4(Fn1<? super A4, ? extends Iterable<? extends R4>> var1);

        public <R5> Iterative2Args6<T1, T2, A1, A2, A3, A4, R5, A6> flatMap5(Fn1<? super A5, ? extends Iterable<? extends R5>> var1);

        public <R6> Iterative2Args6<T1, T2, A1, A2, A3, A4, A5, R6> flatMap6(Fn1<? super A6, ? extends Iterable<? extends R6>> var1);

        public <R1, R2, R3, R4, R5, R6> Iterative2Args6<T1, T2, R1, R2, R3, R4, R5, R6> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> var1, Fn1<? super A2, ? extends Iterable<? extends R2>> var2, Fn1<? super A3, ? extends Iterable<? extends R3>> var3, Fn1<? super A4, ? extends Iterable<? extends R4>> var4, Fn1<? super A5, ? extends Iterable<? extends R5>> var5, Fn1<? super A6, ? extends Iterable<? extends R6>> var6);

        public <R1> Iterative2Args6<T1, T2, R1, A2, A3, A4, A5, A6> inlineMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> var1);

        public <R2> Iterative2Args6<T1, T2, A1, R2, A3, A4, A5, A6> inlineMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> var1);

        public <R3> Iterative2Args6<T1, T2, A1, A2, R3, A4, A5, A6> inlineMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> var1);

        public <R4> Iterative2Args6<T1, T2, A1, A2, A3, R4, A5, A6> inlineMap4(Fn1<? super A4, ? extends Iterable<? extends R4>> var1);

        public <R5> Iterative2Args6<T1, T2, A1, A2, A3, A4, R5, A6> inlineMap5(Fn1<? super A5, ? extends Iterable<? extends R5>> var1);

        public <R6> Iterative2Args6<T1, T2, A1, A2, A3, A4, A5, R6> inlineMap6(Fn1<? super A6, ? extends Iterable<? extends R6>> var1);

        public Iterative2Args6<T1, T2, A1, A2, A3, A4, A5, A6> filter(Pr1<? super A1> var1, Pr1<? super A2> var2, Pr1<? super A3> var3, Pr1<? super A4> var4, Pr1<? super A5> var5, Pr1<? super A6> var6);

        public Iterative2Args6<T1, T2, A1, A2, A3, A4, A5, A6> filter1(Pr1<? super A1> var1);

        public Iterative2Args6<T1, T2, A1, A2, A3, A4, A5, A6> filter2(Pr1<? super A2> var1);

        public Iterative2Args6<T1, T2, A1, A2, A3, A4, A5, A6> filter3(Pr1<? super A3> var1);

        public Iterative2Args6<T1, T2, A1, A2, A3, A4, A5, A6> filter4(Pr1<? super A4> var1);

        public Iterative2Args6<T1, T2, A1, A2, A3, A4, A5, A6> filter5(Pr1<? super A5> var1);

        public Iterative2Args6<T1, T2, A1, A2, A3, A4, A5, A6> filter6(Pr1<? super A6> var1);

        public static class Iterative2Args6Impl<T1, T2, A1, A2, A3, A4, A5, A6> implements Iterative2Args6<T1, T2, A1, A2, A3, A4, A5, A6> {

            Iterative2<T1, T2> left;
            Iterative6<A1, A2, A3, A4, A5, A6> right;
            boolean cross;

            Iterative2Args6Impl(Iterative2<? extends T1, ? extends T2> left, Iterative6<? extends A1, ? extends A2, ? extends A3, ? extends A4, ? extends A5, ? extends A6> right, boolean cross) {
                Objects.requireNonNull(left, "left is null");
                Objects.requireNonNull(right, "right is null");
                this.left = left;
                this.right = right;
                this.cross = cross;
            }

            @Override
            public <R1, R2> Iterative2<R1, R2> mapping(Fn7<? super T1, ? super A1, ? super A2, ? super A3, ? super A4, ? super A5, ? super A6, ? extends R1> f1, Fn7<? super T2, ? super A1, ? super A2, ? super A3, ? super A4, ? super A5, ? super A6, ? extends R2> f2) {
                Objects.requireNonNull(f1, "f1 is null");
                Objects.requireNonNull(f2, "f2 is null");
                Stream<Tuple6<A1, A2, A3, A4, A5, A6>> stream = this.right.toStream();
                Iterative1<T1> i1 = this.left.create(this.left.iterableStream1());
                Iterative1<T2> i2 = this.left.create(this.left.iterableStream2());
                return this.left.create(this.left.splitLt().create((this.cross ? i1.pushBackCrossOf(stream) : i1.pushBackInlineOf(stream)).reduce((Fn2 & Serializable)(t1, tuple) -> f1.apply(t1, tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5(), tuple._6())).iterableStream1()), (this.cross ? i2.pushBackCrossOf(stream) : i2.pushBackInlineOf(stream)).reduce((Fn2 & Serializable)(t2, tuple) -> f2.apply(t2, tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5(), tuple._6())).iterableStream1());
            }

            @Override
            public <R1, R2> Iterative2<R1, R2> inverseMapping(Fn7<? super A1, ? super A2, ? super A3, ? super A4, ? super A5, ? super A6, ? super T1, ? extends R1> f1, Fn7<? super A1, ? super A2, ? super A3, ? super A4, ? super A5, ? super A6, ? super T2, ? extends R2> f2) {
                return this.mapping((Fn7 & Serializable)(t1, a1, a2, a3, a4, a5, a6) -> f1.apply(a1, a2, a3, a4, a5, a6, t1), (Fn7 & Serializable)(t2, a1, a2, a3, a4, a5, a6) -> f2.apply(a1, a2, a3, a4, a5, a6, t2));
            }

            @Override
            public <R2> Iterative2<T1, R2> mappingRt(Fn7<? super T2, ? super A1, ? super A2, ? super A3, ? super A4, ? super A5, ? super A6, ? extends R2> f2) {
                return this.mapping(IterativeInternals::get1, f2);
            }

            @Override
            public <R1> Iterative2<R1, T2> mappingLt(Fn7<? super T1, ? super A1, ? super A2, ? super A3, ? super A4, ? super A5, ? super A6, ? extends R1> f1) {
                return this.mapping(f1, IterativeInternals::get1);
            }

            @Override
            public <R1, R2, R3, R4, R5, R6> Iterative2Args6<T1, T2, R1, R2, R3, R4, R5, R6> map(Fn1<? super A1, ? extends R1> f1, Fn1<? super A2, ? extends R2> f2, Fn1<? super A3, ? extends R3> f3, Fn1<? super A4, ? extends R4> f4, Fn1<? super A5, ? extends R5> f5, Fn1<? super A6, ? extends R6> f6) {
                return new Iterative2Args6Impl<T1, T2, R1, R2, R3, R4, R5, R6>(this.left, this.right.map(f1, f2, f3, f4, f5, f6), this.cross);
            }

            @Override
            public <R1> Iterative2Args6<T1, T2, R1, A2, A3, A4, A5, A6> map1(Fn1<? super A1, ? extends R1> f1) {
                return new Iterative2Args6Impl<T1, T2, R1, A2, A3, A4, A5, A6>(this.left, this.right.map1(f1), this.cross);
            }

            @Override
            public <R2> Iterative2Args6<T1, T2, A1, R2, A3, A4, A5, A6> map2(Fn1<? super A2, ? extends R2> f2) {
                return new Iterative2Args6Impl<T1, T2, A1, R2, A3, A4, A5, A6>(this.left, this.right.map2(f2), this.cross);
            }

            @Override
            public <R3> Iterative2Args6<T1, T2, A1, A2, R3, A4, A5, A6> map3(Fn1<? super A3, ? extends R3> f3) {
                return new Iterative2Args6Impl<T1, T2, A1, A2, R3, A4, A5, A6>(this.left, this.right.map3(f3), this.cross);
            }

            @Override
            public <R4> Iterative2Args6<T1, T2, A1, A2, A3, R4, A5, A6> map4(Fn1<? super A4, ? extends R4> f4) {
                return new Iterative2Args6Impl<T1, T2, A1, A2, A3, R4, A5, A6>(this.left, this.right.map4(f4), this.cross);
            }

            @Override
            public <R5> Iterative2Args6<T1, T2, A1, A2, A3, A4, R5, A6> map5(Fn1<? super A5, ? extends R5> f5) {
                return new Iterative2Args6Impl<T1, T2, A1, A2, A3, A4, R5, A6>(this.left, this.right.map5(f5), this.cross);
            }

            @Override
            public <R6> Iterative2Args6<T1, T2, A1, A2, A3, A4, A5, R6> map6(Fn1<? super A6, ? extends R6> f6) {
                return new Iterative2Args6Impl<T1, T2, A1, A2, A3, A4, A5, R6>(this.left, this.right.map6(f6), this.cross);
            }

            @Override
            public <R1, R2, R3, R4, R5, R6> Iterative2Args6<T1, T2, R1, R2, R3, R4, R5, R6> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> f2, Fn1<? super A3, ? extends Iterable<? extends R3>> f3, Fn1<? super A4, ? extends Iterable<? extends R4>> f4, Fn1<? super A5, ? extends Iterable<? extends R5>> f5, Fn1<? super A6, ? extends Iterable<? extends R6>> f6) {
                return new Iterative2Args6Impl(this.left, this.right.flatMap(f1, f2, f3, f4, f5, f6), this.cross);
            }

            @Override
            public <R1> Iterative2Args6<T1, T2, R1, A2, A3, A4, A5, A6> flatMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative2Args6Impl(this.left, this.right.flatMap1(f1), this.cross);
            }

            @Override
            public <R2> Iterative2Args6<T1, T2, A1, R2, A3, A4, A5, A6> flatMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative2Args6Impl(this.left, this.right.flatMap2(f2), this.cross);
            }

            @Override
            public <R3> Iterative2Args6<T1, T2, A1, A2, R3, A4, A5, A6> flatMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> f3) {
                return new Iterative2Args6Impl(this.left, this.right.flatMap3(f3), this.cross);
            }

            @Override
            public <R4> Iterative2Args6<T1, T2, A1, A2, A3, R4, A5, A6> flatMap4(Fn1<? super A4, ? extends Iterable<? extends R4>> f4) {
                return new Iterative2Args6Impl(this.left, this.right.flatMap4(f4), this.cross);
            }

            @Override
            public <R5> Iterative2Args6<T1, T2, A1, A2, A3, A4, R5, A6> flatMap5(Fn1<? super A5, ? extends Iterable<? extends R5>> f5) {
                return new Iterative2Args6Impl(this.left, this.right.flatMap5(f5), this.cross);
            }

            @Override
            public <R6> Iterative2Args6<T1, T2, A1, A2, A3, A4, A5, R6> flatMap6(Fn1<? super A6, ? extends Iterable<? extends R6>> f6) {
                return new Iterative2Args6Impl(this.left, this.right.flatMap6(f6), this.cross);
            }

            @Override
            public <R1, R2, R3, R4, R5, R6> Iterative2Args6<T1, T2, R1, R2, R3, R4, R5, R6> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> f2, Fn1<? super A3, ? extends Iterable<? extends R3>> f3, Fn1<? super A4, ? extends Iterable<? extends R4>> f4, Fn1<? super A5, ? extends Iterable<? extends R5>> f5, Fn1<? super A6, ? extends Iterable<? extends R6>> f6) {
                return new Iterative2Args6Impl(this.left, this.right.inlineMap(f1, f2, f3, f4, f5, f6), this.cross);
            }

            @Override
            public <R1> Iterative2Args6<T1, T2, R1, A2, A3, A4, A5, A6> inlineMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative2Args6Impl(this.left, this.right.inlineMap1(f1), this.cross);
            }

            @Override
            public <R2> Iterative2Args6<T1, T2, A1, R2, A3, A4, A5, A6> inlineMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative2Args6Impl(this.left, this.right.inlineMap2(f2), this.cross);
            }

            @Override
            public <R3> Iterative2Args6<T1, T2, A1, A2, R3, A4, A5, A6> inlineMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> f3) {
                return new Iterative2Args6Impl(this.left, this.right.inlineMap3(f3), this.cross);
            }

            @Override
            public <R4> Iterative2Args6<T1, T2, A1, A2, A3, R4, A5, A6> inlineMap4(Fn1<? super A4, ? extends Iterable<? extends R4>> f4) {
                return new Iterative2Args6Impl(this.left, this.right.inlineMap4(f4), this.cross);
            }

            @Override
            public <R5> Iterative2Args6<T1, T2, A1, A2, A3, A4, R5, A6> inlineMap5(Fn1<? super A5, ? extends Iterable<? extends R5>> f5) {
                return new Iterative2Args6Impl(this.left, this.right.inlineMap5(f5), this.cross);
            }

            @Override
            public <R6> Iterative2Args6<T1, T2, A1, A2, A3, A4, A5, R6> inlineMap6(Fn1<? super A6, ? extends Iterable<? extends R6>> f6) {
                return new Iterative2Args6Impl(this.left, this.right.inlineMap6(f6), this.cross);
            }

            @Override
            public Iterative2Args6<T1, T2, A1, A2, A3, A4, A5, A6> filter(Pr1<? super A1> p1, Pr1<? super A2> p2, Pr1<? super A3> p3, Pr1<? super A4> p4, Pr1<? super A5> p5, Pr1<? super A6> p6) {
                return new Iterative2Args6Impl<T1, T2, A1, A2, A3, A4, A5, A6>(this.left, this.right.filter(p1, p2, p3, p4, p5, p6), this.cross);
            }

            @Override
            public Iterative2Args6<T1, T2, A1, A2, A3, A4, A5, A6> filter1(Pr1<? super A1> p1) {
                return new Iterative2Args6Impl<T1, T2, A1, A2, A3, A4, A5, A6>(this.left, this.right.filter1(p1), this.cross);
            }

            @Override
            public Iterative2Args6<T1, T2, A1, A2, A3, A4, A5, A6> filter2(Pr1<? super A2> p2) {
                return new Iterative2Args6Impl<T1, T2, A1, A2, A3, A4, A5, A6>(this.left, this.right.filter2(p2), this.cross);
            }

            @Override
            public Iterative2Args6<T1, T2, A1, A2, A3, A4, A5, A6> filter3(Pr1<? super A3> p3) {
                return new Iterative2Args6Impl<T1, T2, A1, A2, A3, A4, A5, A6>(this.left, this.right.filter3(p3), this.cross);
            }

            @Override
            public Iterative2Args6<T1, T2, A1, A2, A3, A4, A5, A6> filter4(Pr1<? super A4> p4) {
                return new Iterative2Args6Impl<T1, T2, A1, A2, A3, A4, A5, A6>(this.left, this.right.filter4(p4), this.cross);
            }

            @Override
            public Iterative2Args6<T1, T2, A1, A2, A3, A4, A5, A6> filter5(Pr1<? super A5> p5) {
                return new Iterative2Args6Impl<T1, T2, A1, A2, A3, A4, A5, A6>(this.left, this.right.filter5(p5), this.cross);
            }

            @Override
            public Iterative2Args6<T1, T2, A1, A2, A3, A4, A5, A6> filter6(Pr1<? super A6> p6) {
                return new Iterative2Args6Impl<T1, T2, A1, A2, A3, A4, A5, A6>(this.left, this.right.filter6(p6), this.cross);
            }

        }

    }

    public static interface Iterative2Args5<T1, T2, A1, A2, A3, A4, A5> extends Iterative2Args<T1, T2> {

        public <R1, R2> Iterative2<R1, R2> mapping(Fn6<? super T1, ? super A1, ? super A2, ? super A3, ? super A4, ? super A5, ? extends R1> var1, Fn6<? super T2, ? super A1, ? super A2, ? super A3, ? super A4, ? super A5, ? extends R2> var2);

        public <R1, R2> Iterative2<R1, R2> inverseMapping(Fn6<? super A1, ? super A2, ? super A3, ? super A4, ? super A5, ? super T1, ? extends R1> var1, Fn6<? super A1, ? super A2, ? super A3, ? super A4, ? super A5, ? super T2, ? extends R2> var2);

        public <R2> Iterative2<T1, R2> mappingRt(Fn6<? super T2, ? super A1, ? super A2, ? super A3, ? super A4, ? super A5, ? extends R2> var1);

        public <R1> Iterative2<R1, T2> mappingLt(Fn6<? super T1, ? super A1, ? super A2, ? super A3, ? super A4, ? super A5, ? extends R1> var1);

        public <R1, R2, R3, R4, R5> Iterative2Args5<T1, T2, R1, R2, R3, R4, R5> map(Fn1<? super A1, ? extends R1> var1, Fn1<? super A2, ? extends R2> var2, Fn1<? super A3, ? extends R3> var3, Fn1<? super A4, ? extends R4> var4, Fn1<? super A5, ? extends R5> var5);

        public <R1> Iterative2Args5<T1, T2, R1, A2, A3, A4, A5> map1(Fn1<? super A1, ? extends R1> var1);

        public <R2> Iterative2Args5<T1, T2, A1, R2, A3, A4, A5> map2(Fn1<? super A2, ? extends R2> var1);

        public <R3> Iterative2Args5<T1, T2, A1, A2, R3, A4, A5> map3(Fn1<? super A3, ? extends R3> var1);

        public <R4> Iterative2Args5<T1, T2, A1, A2, A3, R4, A5> map4(Fn1<? super A4, ? extends R4> var1);

        public <R5> Iterative2Args5<T1, T2, A1, A2, A3, A4, R5> map5(Fn1<? super A5, ? extends R5> var1);

        public <R1, R2, R3, R4, R5> Iterative2Args5<T1, T2, R1, R2, R3, R4, R5> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> var1, Fn1<? super A2, ? extends Iterable<? extends R2>> var2, Fn1<? super A3, ? extends Iterable<? extends R3>> var3, Fn1<? super A4, ? extends Iterable<? extends R4>> var4, Fn1<? super A5, ? extends Iterable<? extends R5>> var5);

        public <R1> Iterative2Args5<T1, T2, R1, A2, A3, A4, A5> flatMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> var1);

        public <R2> Iterative2Args5<T1, T2, A1, R2, A3, A4, A5> flatMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> var1);

        public <R3> Iterative2Args5<T1, T2, A1, A2, R3, A4, A5> flatMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> var1);

        public <R4> Iterative2Args5<T1, T2, A1, A2, A3, R4, A5> flatMap4(Fn1<? super A4, ? extends Iterable<? extends R4>> var1);

        public <R5> Iterative2Args5<T1, T2, A1, A2, A3, A4, R5> flatMap5(Fn1<? super A5, ? extends Iterable<? extends R5>> var1);

        public <R1, R2, R3, R4, R5> Iterative2Args5<T1, T2, R1, R2, R3, R4, R5> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> var1, Fn1<? super A2, ? extends Iterable<? extends R2>> var2, Fn1<? super A3, ? extends Iterable<? extends R3>> var3, Fn1<? super A4, ? extends Iterable<? extends R4>> var4, Fn1<? super A5, ? extends Iterable<? extends R5>> var5);

        public <R1> Iterative2Args5<T1, T2, R1, A2, A3, A4, A5> inlineMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> var1);

        public <R2> Iterative2Args5<T1, T2, A1, R2, A3, A4, A5> inlineMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> var1);

        public <R3> Iterative2Args5<T1, T2, A1, A2, R3, A4, A5> inlineMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> var1);

        public <R4> Iterative2Args5<T1, T2, A1, A2, A3, R4, A5> inlineMap4(Fn1<? super A4, ? extends Iterable<? extends R4>> var1);

        public <R5> Iterative2Args5<T1, T2, A1, A2, A3, A4, R5> inlineMap5(Fn1<? super A5, ? extends Iterable<? extends R5>> var1);

        public Iterative2Args5<T1, T2, A1, A2, A3, A4, A5> filter(Pr1<? super A1> var1, Pr1<? super A2> var2, Pr1<? super A3> var3, Pr1<? super A4> var4, Pr1<? super A5> var5);

        public Iterative2Args5<T1, T2, A1, A2, A3, A4, A5> filter1(Pr1<? super A1> var1);

        public Iterative2Args5<T1, T2, A1, A2, A3, A4, A5> filter2(Pr1<? super A2> var1);

        public Iterative2Args5<T1, T2, A1, A2, A3, A4, A5> filter3(Pr1<? super A3> var1);

        public Iterative2Args5<T1, T2, A1, A2, A3, A4, A5> filter4(Pr1<? super A4> var1);

        public Iterative2Args5<T1, T2, A1, A2, A3, A4, A5> filter5(Pr1<? super A5> var1);

        public static class Iterative2Args5Impl<T1, T2, A1, A2, A3, A4, A5> implements Iterative2Args5<T1, T2, A1, A2, A3, A4, A5> {

            Iterative2<T1, T2> left;
            Iterative5<A1, A2, A3, A4, A5> right;
            boolean cross;

            Iterative2Args5Impl(Iterative2<? extends T1, ? extends T2> left, Iterative5<? extends A1, ? extends A2, ? extends A3, ? extends A4, ? extends A5> right, boolean cross) {
                Objects.requireNonNull(left, "left is null");
                Objects.requireNonNull(right, "right is null");
                this.left = left;
                this.right = right;
                this.cross = cross;
            }

            @Override
            public <R1, R2> Iterative2<R1, R2> mapping(Fn6<? super T1, ? super A1, ? super A2, ? super A3, ? super A4, ? super A5, ? extends R1> f1, Fn6<? super T2, ? super A1, ? super A2, ? super A3, ? super A4, ? super A5, ? extends R2> f2) {
                Objects.requireNonNull(f1, "f1 is null");
                Objects.requireNonNull(f2, "f2 is null");
                Stream<Tuple5<A1, A2, A3, A4, A5>> stream = this.right.toStream();
                Iterative1<T1> i1 = this.left.create(this.left.iterableStream1());
                Iterative1<T2> i2 = this.left.create(this.left.iterableStream2());
                return this.left.create(this.left.splitLt().create((this.cross ? i1.pushBackCrossOf(stream) : i1.pushBackInlineOf(stream)).reduce((Fn2 & Serializable)(t1, tuple) -> f1.apply(t1, tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5())).iterableStream1()), (this.cross ? i2.pushBackCrossOf(stream) : i2.pushBackInlineOf(stream)).reduce((Fn2 & Serializable)(t2, tuple) -> f2.apply(t2, tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5())).iterableStream1());
            }

            @Override
            public <R1, R2> Iterative2<R1, R2> inverseMapping(Fn6<? super A1, ? super A2, ? super A3, ? super A4, ? super A5, ? super T1, ? extends R1> f1, Fn6<? super A1, ? super A2, ? super A3, ? super A4, ? super A5, ? super T2, ? extends R2> f2) {
                return this.mapping((Fn6 & Serializable)(t1, a1, a2, a3, a4, a5) -> f1.apply(a1, a2, a3, a4, a5, t1), (Fn6 & Serializable)(t2, a1, a2, a3, a4, a5) -> f2.apply(a1, a2, a3, a4, a5, t2));
            }

            @Override
            public <R2> Iterative2<T1, R2> mappingRt(Fn6<? super T2, ? super A1, ? super A2, ? super A3, ? super A4, ? super A5, ? extends R2> f2) {
                return this.mapping(IterativeInternals::get1, f2);
            }

            @Override
            public <R1> Iterative2<R1, T2> mappingLt(Fn6<? super T1, ? super A1, ? super A2, ? super A3, ? super A4, ? super A5, ? extends R1> f1) {
                return this.mapping(f1, IterativeInternals::get1);
            }

            @Override
            public <R1, R2, R3, R4, R5> Iterative2Args5<T1, T2, R1, R2, R3, R4, R5> map(Fn1<? super A1, ? extends R1> f1, Fn1<? super A2, ? extends R2> f2, Fn1<? super A3, ? extends R3> f3, Fn1<? super A4, ? extends R4> f4, Fn1<? super A5, ? extends R5> f5) {
                return new Iterative2Args5Impl<T1, T2, R1, R2, R3, R4, R5>(this.left, this.right.map(f1, f2, f3, f4, f5), this.cross);
            }

            @Override
            public <R1> Iterative2Args5<T1, T2, R1, A2, A3, A4, A5> map1(Fn1<? super A1, ? extends R1> f1) {
                return new Iterative2Args5Impl<T1, T2, R1, A2, A3, A4, A5>(this.left, this.right.map1(f1), this.cross);
            }

            @Override
            public <R2> Iterative2Args5<T1, T2, A1, R2, A3, A4, A5> map2(Fn1<? super A2, ? extends R2> f2) {
                return new Iterative2Args5Impl<T1, T2, A1, R2, A3, A4, A5>(this.left, this.right.map2(f2), this.cross);
            }

            @Override
            public <R3> Iterative2Args5<T1, T2, A1, A2, R3, A4, A5> map3(Fn1<? super A3, ? extends R3> f3) {
                return new Iterative2Args5Impl<T1, T2, A1, A2, R3, A4, A5>(this.left, this.right.map3(f3), this.cross);
            }

            @Override
            public <R4> Iterative2Args5<T1, T2, A1, A2, A3, R4, A5> map4(Fn1<? super A4, ? extends R4> f4) {
                return new Iterative2Args5Impl<T1, T2, A1, A2, A3, R4, A5>(this.left, this.right.map4(f4), this.cross);
            }

            @Override
            public <R5> Iterative2Args5<T1, T2, A1, A2, A3, A4, R5> map5(Fn1<? super A5, ? extends R5> f5) {
                return new Iterative2Args5Impl<T1, T2, A1, A2, A3, A4, R5>(this.left, this.right.map5(f5), this.cross);
            }

            @Override
            public <R1, R2, R3, R4, R5> Iterative2Args5<T1, T2, R1, R2, R3, R4, R5> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> f2, Fn1<? super A3, ? extends Iterable<? extends R3>> f3, Fn1<? super A4, ? extends Iterable<? extends R4>> f4, Fn1<? super A5, ? extends Iterable<? extends R5>> f5) {
                return new Iterative2Args5Impl(this.left, this.right.flatMap(f1, f2, f3, f4, f5), this.cross);
            }

            @Override
            public <R1> Iterative2Args5<T1, T2, R1, A2, A3, A4, A5> flatMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative2Args5Impl(this.left, this.right.flatMap1(f1), this.cross);
            }

            @Override
            public <R2> Iterative2Args5<T1, T2, A1, R2, A3, A4, A5> flatMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative2Args5Impl(this.left, this.right.flatMap2(f2), this.cross);
            }

            @Override
            public <R3> Iterative2Args5<T1, T2, A1, A2, R3, A4, A5> flatMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> f3) {
                return new Iterative2Args5Impl(this.left, this.right.flatMap3(f3), this.cross);
            }

            @Override
            public <R4> Iterative2Args5<T1, T2, A1, A2, A3, R4, A5> flatMap4(Fn1<? super A4, ? extends Iterable<? extends R4>> f4) {
                return new Iterative2Args5Impl(this.left, this.right.flatMap4(f4), this.cross);
            }

            @Override
            public <R5> Iterative2Args5<T1, T2, A1, A2, A3, A4, R5> flatMap5(Fn1<? super A5, ? extends Iterable<? extends R5>> f5) {
                return new Iterative2Args5Impl(this.left, this.right.flatMap5(f5), this.cross);
            }

            @Override
            public <R1, R2, R3, R4, R5> Iterative2Args5<T1, T2, R1, R2, R3, R4, R5> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> f2, Fn1<? super A3, ? extends Iterable<? extends R3>> f3, Fn1<? super A4, ? extends Iterable<? extends R4>> f4, Fn1<? super A5, ? extends Iterable<? extends R5>> f5) {
                return new Iterative2Args5Impl(this.left, this.right.inlineMap(f1, f2, f3, f4, f5), this.cross);
            }

            @Override
            public <R1> Iterative2Args5<T1, T2, R1, A2, A3, A4, A5> inlineMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative2Args5Impl(this.left, this.right.inlineMap1(f1), this.cross);
            }

            @Override
            public <R2> Iterative2Args5<T1, T2, A1, R2, A3, A4, A5> inlineMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative2Args5Impl(this.left, this.right.inlineMap2(f2), this.cross);
            }

            @Override
            public <R3> Iterative2Args5<T1, T2, A1, A2, R3, A4, A5> inlineMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> f3) {
                return new Iterative2Args5Impl(this.left, this.right.inlineMap3(f3), this.cross);
            }

            @Override
            public <R4> Iterative2Args5<T1, T2, A1, A2, A3, R4, A5> inlineMap4(Fn1<? super A4, ? extends Iterable<? extends R4>> f4) {
                return new Iterative2Args5Impl(this.left, this.right.inlineMap4(f4), this.cross);
            }

            @Override
            public <R5> Iterative2Args5<T1, T2, A1, A2, A3, A4, R5> inlineMap5(Fn1<? super A5, ? extends Iterable<? extends R5>> f5) {
                return new Iterative2Args5Impl(this.left, this.right.inlineMap5(f5), this.cross);
            }

            @Override
            public Iterative2Args5<T1, T2, A1, A2, A3, A4, A5> filter(Pr1<? super A1> p1, Pr1<? super A2> p2, Pr1<? super A3> p3, Pr1<? super A4> p4, Pr1<? super A5> p5) {
                return new Iterative2Args5Impl<T1, T2, A1, A2, A3, A4, A5>(this.left, this.right.filter(p1, p2, p3, p4, p5), this.cross);
            }

            @Override
            public Iterative2Args5<T1, T2, A1, A2, A3, A4, A5> filter1(Pr1<? super A1> p1) {
                return new Iterative2Args5Impl<T1, T2, A1, A2, A3, A4, A5>(this.left, this.right.filter1(p1), this.cross);
            }

            @Override
            public Iterative2Args5<T1, T2, A1, A2, A3, A4, A5> filter2(Pr1<? super A2> p2) {
                return new Iterative2Args5Impl<T1, T2, A1, A2, A3, A4, A5>(this.left, this.right.filter2(p2), this.cross);
            }

            @Override
            public Iterative2Args5<T1, T2, A1, A2, A3, A4, A5> filter3(Pr1<? super A3> p3) {
                return new Iterative2Args5Impl<T1, T2, A1, A2, A3, A4, A5>(this.left, this.right.filter3(p3), this.cross);
            }

            @Override
            public Iterative2Args5<T1, T2, A1, A2, A3, A4, A5> filter4(Pr1<? super A4> p4) {
                return new Iterative2Args5Impl<T1, T2, A1, A2, A3, A4, A5>(this.left, this.right.filter4(p4), this.cross);
            }

            @Override
            public Iterative2Args5<T1, T2, A1, A2, A3, A4, A5> filter5(Pr1<? super A5> p5) {
                return new Iterative2Args5Impl<T1, T2, A1, A2, A3, A4, A5>(this.left, this.right.filter5(p5), this.cross);
            }

        }

    }

    public static interface Iterative2Args4<T1, T2, A1, A2, A3, A4> extends Iterative2Args<T1, T2> {

        public <R1, R2> Iterative2<R1, R2> mapping(Fn5<? super T1, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R1> var1, Fn5<? super T2, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R2> var2);

        public <R1, R2> Iterative2<R1, R2> inverseMapping(Fn5<? super A1, ? super A2, ? super A3, ? super A4, ? super T1, ? extends R1> var1, Fn5<? super A1, ? super A2, ? super A3, ? super A4, ? super T2, ? extends R2> var2);

        public <R2> Iterative2<T1, R2> mappingRt(Fn5<? super T2, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R2> var1);

        public <R1> Iterative2<R1, T2> mappingLt(Fn5<? super T1, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R1> var1);

        public <R1, R2, R3, R4> Iterative2Args4<T1, T2, R1, R2, R3, R4> map(Fn1<? super A1, ? extends R1> var1, Fn1<? super A2, ? extends R2> var2, Fn1<? super A3, ? extends R3> var3, Fn1<? super A4, ? extends R4> var4);

        public <R1> Iterative2Args4<T1, T2, R1, A2, A3, A4> map1(Fn1<? super A1, ? extends R1> var1);

        public <R2> Iterative2Args4<T1, T2, A1, R2, A3, A4> map2(Fn1<? super A2, ? extends R2> var1);

        public <R3> Iterative2Args4<T1, T2, A1, A2, R3, A4> map3(Fn1<? super A3, ? extends R3> var1);

        public <R4> Iterative2Args4<T1, T2, A1, A2, A3, R4> map4(Fn1<? super A4, ? extends R4> var1);

        public <R1, R2, R3, R4> Iterative2Args4<T1, T2, R1, R2, R3, R4> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> var1, Fn1<? super A2, ? extends Iterable<? extends R2>> var2, Fn1<? super A3, ? extends Iterable<? extends R3>> var3, Fn1<? super A4, ? extends Iterable<? extends R4>> var4);

        public <R1> Iterative2Args4<T1, T2, R1, A2, A3, A4> flatMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> var1);

        public <R2> Iterative2Args4<T1, T2, A1, R2, A3, A4> flatMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> var1);

        public <R3> Iterative2Args4<T1, T2, A1, A2, R3, A4> flatMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> var1);

        public <R4> Iterative2Args4<T1, T2, A1, A2, A3, R4> flatMap4(Fn1<? super A4, ? extends Iterable<? extends R4>> var1);

        public <R1, R2, R3, R4> Iterative2Args4<T1, T2, R1, R2, R3, R4> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> var1, Fn1<? super A2, ? extends Iterable<? extends R2>> var2, Fn1<? super A3, ? extends Iterable<? extends R3>> var3, Fn1<? super A4, ? extends Iterable<? extends R4>> var4);

        public <R1> Iterative2Args4<T1, T2, R1, A2, A3, A4> inlineMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> var1);

        public <R2> Iterative2Args4<T1, T2, A1, R2, A3, A4> inlineMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> var1);

        public <R3> Iterative2Args4<T1, T2, A1, A2, R3, A4> inlineMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> var1);

        public <R4> Iterative2Args4<T1, T2, A1, A2, A3, R4> inlineMap4(Fn1<? super A4, ? extends Iterable<? extends R4>> var1);

        public Iterative2Args4<T1, T2, A1, A2, A3, A4> filter(Pr1<? super A1> var1, Pr1<? super A2> var2, Pr1<? super A3> var3, Pr1<? super A4> var4);

        public Iterative2Args4<T1, T2, A1, A2, A3, A4> filter1(Pr1<? super A1> var1);

        public Iterative2Args4<T1, T2, A1, A2, A3, A4> filter2(Pr1<? super A2> var1);

        public Iterative2Args4<T1, T2, A1, A2, A3, A4> filter3(Pr1<? super A3> var1);

        public Iterative2Args4<T1, T2, A1, A2, A3, A4> filter4(Pr1<? super A4> var1);

        public static class Iterative2Args4Impl<T1, T2, A1, A2, A3, A4> implements Iterative2Args4<T1, T2, A1, A2, A3, A4> {

            Iterative2<T1, T2> left;
            Iterative4<A1, A2, A3, A4> right;
            boolean cross;

            Iterative2Args4Impl(Iterative2<? extends T1, ? extends T2> left, Iterative4<? extends A1, ? extends A2, ? extends A3, ? extends A4> right, boolean cross) {
                Objects.requireNonNull(left, "left is null");
                Objects.requireNonNull(right, "right is null");
                this.left = left;
                this.right = right;
                this.cross = cross;
            }

            @Override
            public <R1, R2> Iterative2<R1, R2> mapping(Fn5<? super T1, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R1> f1, Fn5<? super T2, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R2> f2) {
                Objects.requireNonNull(f1, "f1 is null");
                Objects.requireNonNull(f2, "f2 is null");
                Stream<Tuple4<A1, A2, A3, A4>> stream = this.right.toStream();
                Iterative1<T1> i1 = this.left.create(this.left.iterableStream1());
                Iterative1<T2> i2 = this.left.create(this.left.iterableStream2());
                return this.left.create(this.left.splitLt().create((this.cross ? i1.pushBackCrossOf(stream) : i1.pushBackInlineOf(stream)).reduce((Fn2 & Serializable)(t1, tuple) -> f1.apply(t1, tuple._1(), tuple._2(), tuple._3(), tuple._4())).iterableStream1()), (this.cross ? i2.pushBackCrossOf(stream) : i2.pushBackInlineOf(stream)).reduce((Fn2 & Serializable)(t2, tuple) -> f2.apply(t2, tuple._1(), tuple._2(), tuple._3(), tuple._4())).iterableStream1());
            }

            @Override
            public <R1, R2> Iterative2<R1, R2> inverseMapping(Fn5<? super A1, ? super A2, ? super A3, ? super A4, ? super T1, ? extends R1> f1, Fn5<? super A1, ? super A2, ? super A3, ? super A4, ? super T2, ? extends R2> f2) {
                return this.mapping((Fn5 & Serializable)(t1, a1, a2, a3, a4) -> f1.apply(a1, a2, a3, a4, t1), (Fn5 & Serializable)(t2, a1, a2, a3, a4) -> f2.apply(a1, a2, a3, a4, t2));
            }

            @Override
            public <R2> Iterative2<T1, R2> mappingRt(Fn5<? super T2, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R2> f2) {
                return this.mapping(IterativeInternals::get1, f2);
            }

            @Override
            public <R1> Iterative2<R1, T2> mappingLt(Fn5<? super T1, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R1> f1) {
                return this.mapping(f1, IterativeInternals::get1);
            }

            @Override
            public <R1, R2, R3, R4> Iterative2Args4<T1, T2, R1, R2, R3, R4> map(Fn1<? super A1, ? extends R1> f1, Fn1<? super A2, ? extends R2> f2, Fn1<? super A3, ? extends R3> f3, Fn1<? super A4, ? extends R4> f4) {
                return new Iterative2Args4Impl<T1, T2, R1, R2, R3, R4>(this.left, this.right.map(f1, f2, f3, f4), this.cross);
            }

            @Override
            public <R1> Iterative2Args4<T1, T2, R1, A2, A3, A4> map1(Fn1<? super A1, ? extends R1> f1) {
                return new Iterative2Args4Impl<T1, T2, R1, A2, A3, A4>(this.left, this.right.map1(f1), this.cross);
            }

            @Override
            public <R2> Iterative2Args4<T1, T2, A1, R2, A3, A4> map2(Fn1<? super A2, ? extends R2> f2) {
                return new Iterative2Args4Impl<T1, T2, A1, R2, A3, A4>(this.left, this.right.map2(f2), this.cross);
            }

            @Override
            public <R3> Iterative2Args4<T1, T2, A1, A2, R3, A4> map3(Fn1<? super A3, ? extends R3> f3) {
                return new Iterative2Args4Impl<T1, T2, A1, A2, R3, A4>(this.left, this.right.map3(f3), this.cross);
            }

            @Override
            public <R4> Iterative2Args4<T1, T2, A1, A2, A3, R4> map4(Fn1<? super A4, ? extends R4> f4) {
                return new Iterative2Args4Impl<T1, T2, A1, A2, A3, R4>(this.left, this.right.map4(f4), this.cross);
            }

            @Override
            public <R1, R2, R3, R4> Iterative2Args4<T1, T2, R1, R2, R3, R4> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> f2, Fn1<? super A3, ? extends Iterable<? extends R3>> f3, Fn1<? super A4, ? extends Iterable<? extends R4>> f4) {
                return new Iterative2Args4Impl(this.left, this.right.flatMap(f1, f2, f3, f4), this.cross);
            }

            @Override
            public <R1> Iterative2Args4<T1, T2, R1, A2, A3, A4> flatMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative2Args4Impl(this.left, this.right.flatMap1(f1), this.cross);
            }

            @Override
            public <R2> Iterative2Args4<T1, T2, A1, R2, A3, A4> flatMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative2Args4Impl(this.left, this.right.flatMap2(f2), this.cross);
            }

            @Override
            public <R3> Iterative2Args4<T1, T2, A1, A2, R3, A4> flatMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> f3) {
                return new Iterative2Args4Impl(this.left, this.right.flatMap3(f3), this.cross);
            }

            @Override
            public <R4> Iterative2Args4<T1, T2, A1, A2, A3, R4> flatMap4(Fn1<? super A4, ? extends Iterable<? extends R4>> f4) {
                return new Iterative2Args4Impl(this.left, this.right.flatMap4(f4), this.cross);
            }

            @Override
            public <R1, R2, R3, R4> Iterative2Args4<T1, T2, R1, R2, R3, R4> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> f2, Fn1<? super A3, ? extends Iterable<? extends R3>> f3, Fn1<? super A4, ? extends Iterable<? extends R4>> f4) {
                return new Iterative2Args4Impl(this.left, this.right.inlineMap(f1, f2, f3, f4), this.cross);
            }

            @Override
            public <R1> Iterative2Args4<T1, T2, R1, A2, A3, A4> inlineMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative2Args4Impl(this.left, this.right.inlineMap1(f1), this.cross);
            }

            @Override
            public <R2> Iterative2Args4<T1, T2, A1, R2, A3, A4> inlineMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative2Args4Impl(this.left, this.right.inlineMap2(f2), this.cross);
            }

            @Override
            public <R3> Iterative2Args4<T1, T2, A1, A2, R3, A4> inlineMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> f3) {
                return new Iterative2Args4Impl(this.left, this.right.inlineMap3(f3), this.cross);
            }

            @Override
            public <R4> Iterative2Args4<T1, T2, A1, A2, A3, R4> inlineMap4(Fn1<? super A4, ? extends Iterable<? extends R4>> f4) {
                return new Iterative2Args4Impl(this.left, this.right.inlineMap4(f4), this.cross);
            }

            @Override
            public Iterative2Args4<T1, T2, A1, A2, A3, A4> filter(Pr1<? super A1> p1, Pr1<? super A2> p2, Pr1<? super A3> p3, Pr1<? super A4> p4) {
                return new Iterative2Args4Impl<T1, T2, A1, A2, A3, A4>(this.left, this.right.filter(p1, p2, p3, p4), this.cross);
            }

            @Override
            public Iterative2Args4<T1, T2, A1, A2, A3, A4> filter1(Pr1<? super A1> p1) {
                return new Iterative2Args4Impl<T1, T2, A1, A2, A3, A4>(this.left, this.right.filter1(p1), this.cross);
            }

            @Override
            public Iterative2Args4<T1, T2, A1, A2, A3, A4> filter2(Pr1<? super A2> p2) {
                return new Iterative2Args4Impl<T1, T2, A1, A2, A3, A4>(this.left, this.right.filter2(p2), this.cross);
            }

            @Override
            public Iterative2Args4<T1, T2, A1, A2, A3, A4> filter3(Pr1<? super A3> p3) {
                return new Iterative2Args4Impl<T1, T2, A1, A2, A3, A4>(this.left, this.right.filter3(p3), this.cross);
            }

            @Override
            public Iterative2Args4<T1, T2, A1, A2, A3, A4> filter4(Pr1<? super A4> p4) {
                return new Iterative2Args4Impl<T1, T2, A1, A2, A3, A4>(this.left, this.right.filter4(p4), this.cross);
            }

        }

    }

    public static interface Iterative2Args3<T1, T2, A1, A2, A3> extends Iterative2Args<T1, T2> {

        public <R1, R2> Iterative2<R1, R2> mapping(Fn4<? super T1, ? super A1, ? super A2, ? super A3, ? extends R1> var1, Fn4<? super T2, ? super A1, ? super A2, ? super A3, ? extends R2> var2);

        public <R1, R2> Iterative2<R1, R2> inverseMapping(Fn4<? super A1, ? super A2, ? super A3, ? super T1, ? extends R1> var1, Fn4<? super A1, ? super A2, ? super A3, ? super T2, ? extends R2> var2);

        public <R2> Iterative2<T1, R2> mappingRt(Fn4<? super T2, ? super A1, ? super A2, ? super A3, ? extends R2> var1);

        public <R1> Iterative2<R1, T2> mappingLt(Fn4<? super T1, ? super A1, ? super A2, ? super A3, ? extends R1> var1);

        public <R1, R2, R3> Iterative2Args3<T1, T2, R1, R2, R3> map(Fn1<? super A1, ? extends R1> var1, Fn1<? super A2, ? extends R2> var2, Fn1<? super A3, ? extends R3> var3);

        public <R1> Iterative2Args3<T1, T2, R1, A2, A3> map1(Fn1<? super A1, ? extends R1> var1);

        public <R2> Iterative2Args3<T1, T2, A1, R2, A3> map2(Fn1<? super A2, ? extends R2> var1);

        public <R3> Iterative2Args3<T1, T2, A1, A2, R3> map3(Fn1<? super A3, ? extends R3> var1);

        public <R1, R2, R3> Iterative2Args3<T1, T2, R1, R2, R3> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> var1, Fn1<? super A2, ? extends Iterable<? extends R2>> var2, Fn1<? super A3, ? extends Iterable<? extends R3>> var3);

        public <R1> Iterative2Args3<T1, T2, R1, A2, A3> flatMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> var1);

        public <R2> Iterative2Args3<T1, T2, A1, R2, A3> flatMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> var1);

        public <R3> Iterative2Args3<T1, T2, A1, A2, R3> flatMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> var1);

        public <R1, R2, R3> Iterative2Args3<T1, T2, R1, R2, R3> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> var1, Fn1<? super A2, ? extends Iterable<? extends R2>> var2, Fn1<? super A3, ? extends Iterable<? extends R3>> var3);

        public <R1> Iterative2Args3<T1, T2, R1, A2, A3> inlineMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> var1);

        public <R2> Iterative2Args3<T1, T2, A1, R2, A3> inlineMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> var1);

        public <R3> Iterative2Args3<T1, T2, A1, A2, R3> inlineMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> var1);

        public Iterative2Args3<T1, T2, A1, A2, A3> filter(Pr1<? super A1> var1, Pr1<? super A2> var2, Pr1<? super A3> var3);

        public Iterative2Args3<T1, T2, A1, A2, A3> filter1(Pr1<? super A1> var1);

        public Iterative2Args3<T1, T2, A1, A2, A3> filter2(Pr1<? super A2> var1);

        public Iterative2Args3<T1, T2, A1, A2, A3> filter3(Pr1<? super A3> var1);

        public static class Iterative2Args3Impl<T1, T2, A1, A2, A3> implements Iterative2Args3<T1, T2, A1, A2, A3> {

            Iterative2<T1, T2> left;
            Iterative3<A1, A2, A3> right;
            boolean cross;

            Iterative2Args3Impl(Iterative2<? extends T1, ? extends T2> left, Iterative3<? extends A1, ? extends A2, ? extends A3> right, boolean cross) {
                Objects.requireNonNull(left, "left is null");
                Objects.requireNonNull(right, "right is null");
                this.left = left;
                this.right = right;
                this.cross = cross;
            }

            @Override
            public <R1, R2> Iterative2<R1, R2> mapping(Fn4<? super T1, ? super A1, ? super A2, ? super A3, ? extends R1> f1, Fn4<? super T2, ? super A1, ? super A2, ? super A3, ? extends R2> f2) {
                Objects.requireNonNull(f1, "f1 is null");
                Objects.requireNonNull(f2, "f2 is null");
                Stream<Tuple3<A1, A2, A3>> stream = this.right.toStream();
                Iterative1<T1> i1 = this.left.create(this.left.iterableStream1());
                Iterative1<T2> i2 = this.left.create(this.left.iterableStream2());
                return this.left.create(this.left.splitLt().create((this.cross ? i1.pushBackCrossOf(stream) : i1.pushBackInlineOf(stream)).reduce((Fn2 & Serializable)(t1, tuple) -> f1.apply(t1, tuple._1(), tuple._2(), tuple._3())).iterableStream1()), (this.cross ? i2.pushBackCrossOf(stream) : i2.pushBackInlineOf(stream)).reduce((Fn2 & Serializable)(t2, tuple) -> f2.apply(t2, tuple._1(), tuple._2(), tuple._3())).iterableStream1());
            }

            @Override
            public <R1, R2> Iterative2<R1, R2> inverseMapping(Fn4<? super A1, ? super A2, ? super A3, ? super T1, ? extends R1> f1, Fn4<? super A1, ? super A2, ? super A3, ? super T2, ? extends R2> f2) {
                return this.mapping((Fn4 & Serializable)(t1, a1, a2, a3) -> f1.apply(a1, a2, a3, t1), (Fn4 & Serializable)(t2, a1, a2, a3) -> f2.apply(a1, a2, a3, t2));
            }

            @Override
            public <R2> Iterative2<T1, R2> mappingRt(Fn4<? super T2, ? super A1, ? super A2, ? super A3, ? extends R2> f2) {
                return this.mapping(IterativeInternals::get1, f2);
            }

            @Override
            public <R1> Iterative2<R1, T2> mappingLt(Fn4<? super T1, ? super A1, ? super A2, ? super A3, ? extends R1> f1) {
                return this.mapping(f1, IterativeInternals::get1);
            }

            @Override
            public <R1, R2, R3> Iterative2Args3<T1, T2, R1, R2, R3> map(Fn1<? super A1, ? extends R1> f1, Fn1<? super A2, ? extends R2> f2, Fn1<? super A3, ? extends R3> f3) {
                return new Iterative2Args3Impl<T1, T2, R1, R2, R3>(this.left, this.right.map(f1, f2, f3), this.cross);
            }

            @Override
            public <R1> Iterative2Args3<T1, T2, R1, A2, A3> map1(Fn1<? super A1, ? extends R1> f1) {
                return new Iterative2Args3Impl<T1, T2, R1, A2, A3>(this.left, this.right.map1(f1), this.cross);
            }

            @Override
            public <R2> Iterative2Args3<T1, T2, A1, R2, A3> map2(Fn1<? super A2, ? extends R2> f2) {
                return new Iterative2Args3Impl<T1, T2, A1, R2, A3>(this.left, this.right.map2(f2), this.cross);
            }

            @Override
            public <R3> Iterative2Args3<T1, T2, A1, A2, R3> map3(Fn1<? super A3, ? extends R3> f3) {
                return new Iterative2Args3Impl<T1, T2, A1, A2, R3>(this.left, this.right.map3(f3), this.cross);
            }

            @Override
            public <R1, R2, R3> Iterative2Args3<T1, T2, R1, R2, R3> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> f2, Fn1<? super A3, ? extends Iterable<? extends R3>> f3) {
                return new Iterative2Args3Impl(this.left, this.right.flatMap(f1, f2, f3), this.cross);
            }

            @Override
            public <R1> Iterative2Args3<T1, T2, R1, A2, A3> flatMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative2Args3Impl(this.left, this.right.flatMap1(f1), this.cross);
            }

            @Override
            public <R2> Iterative2Args3<T1, T2, A1, R2, A3> flatMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative2Args3Impl(this.left, this.right.flatMap2(f2), this.cross);
            }

            @Override
            public <R3> Iterative2Args3<T1, T2, A1, A2, R3> flatMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> f3) {
                return new Iterative2Args3Impl(this.left, this.right.flatMap3(f3), this.cross);
            }

            @Override
            public <R1, R2, R3> Iterative2Args3<T1, T2, R1, R2, R3> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> f2, Fn1<? super A3, ? extends Iterable<? extends R3>> f3) {
                return new Iterative2Args3Impl(this.left, this.right.inlineMap(f1, f2, f3), this.cross);
            }

            @Override
            public <R1> Iterative2Args3<T1, T2, R1, A2, A3> inlineMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative2Args3Impl(this.left, this.right.inlineMap1(f1), this.cross);
            }

            @Override
            public <R2> Iterative2Args3<T1, T2, A1, R2, A3> inlineMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative2Args3Impl(this.left, this.right.inlineMap2(f2), this.cross);
            }

            @Override
            public <R3> Iterative2Args3<T1, T2, A1, A2, R3> inlineMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> f3) {
                return new Iterative2Args3Impl(this.left, this.right.inlineMap3(f3), this.cross);
            }

            @Override
            public Iterative2Args3<T1, T2, A1, A2, A3> filter(Pr1<? super A1> p1, Pr1<? super A2> p2, Pr1<? super A3> p3) {
                return new Iterative2Args3Impl<T1, T2, A1, A2, A3>(this.left, this.right.filter(p1, p2, p3), this.cross);
            }

            @Override
            public Iterative2Args3<T1, T2, A1, A2, A3> filter1(Pr1<? super A1> p1) {
                return new Iterative2Args3Impl<T1, T2, A1, A2, A3>(this.left, this.right.filter1(p1), this.cross);
            }

            @Override
            public Iterative2Args3<T1, T2, A1, A2, A3> filter2(Pr1<? super A2> p2) {
                return new Iterative2Args3Impl<T1, T2, A1, A2, A3>(this.left, this.right.filter2(p2), this.cross);
            }

            @Override
            public Iterative2Args3<T1, T2, A1, A2, A3> filter3(Pr1<? super A3> p3) {
                return new Iterative2Args3Impl<T1, T2, A1, A2, A3>(this.left, this.right.filter3(p3), this.cross);
            }

        }

    }

    public static interface Iterative2Args2<T1, T2, A1, A2> extends Iterative2Args<T1, T2> {

        public <R1, R2> Iterative2<R1, R2> mapping(Fn3<? super T1, ? super A1, ? super A2, ? extends R1> var1, Fn3<? super T2, ? super A1, ? super A2, ? extends R2> var2);

        public <R1, R2> Iterative2<R1, R2> inverseMapping(Fn3<? super A1, ? super A2, ? super T1, ? extends R1> var1, Fn3<? super A1, ? super A2, ? super T2, ? extends R2> var2);

        public <R2> Iterative2<T1, R2> mappingRt(Fn3<? super T2, ? super A1, ? super A2, ? extends R2> var1);

        public <R1> Iterative2<R1, T2> mappingLt(Fn3<? super T1, ? super A1, ? super A2, ? extends R1> var1);

        public <R1, R2> Iterative2Args2<T1, T2, R1, R2> map(Fn1<? super A1, ? extends R1> var1, Fn1<? super A2, ? extends R2> var2);

        public <R1> Iterative2Args2<T1, T2, R1, A2> map1(Fn1<? super A1, ? extends R1> var1);

        public <R2> Iterative2Args2<T1, T2, A1, R2> map2(Fn1<? super A2, ? extends R2> var1);

        public <R1, R2> Iterative2Args2<T1, T2, R1, R2> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> var1, Fn1<? super A2, ? extends Iterable<? extends R2>> var2);

        public <R1> Iterative2Args2<T1, T2, R1, A2> flatMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> var1);

        public <R2> Iterative2Args2<T1, T2, A1, R2> flatMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> var1);

        public <R1, R2> Iterative2Args2<T1, T2, R1, R2> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> var1, Fn1<? super A2, ? extends Iterable<? extends R2>> var2);

        public <R1> Iterative2Args2<T1, T2, R1, A2> inlineMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> var1);

        public <R2> Iterative2Args2<T1, T2, A1, R2> inlineMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> var1);

        public Iterative2Args2<T1, T2, A1, A2> filter(Pr1<? super A1> var1, Pr1<? super A2> var2);

        public Iterative2Args2<T1, T2, A1, A2> filter1(Pr1<? super A1> var1);

        public Iterative2Args2<T1, T2, A1, A2> filter2(Pr1<? super A2> var1);

        public static class Iterative2Args2Impl<T1, T2, A1, A2> implements Iterative2Args2<T1, T2, A1, A2> {

            Iterative2<T1, T2> left;
            Iterative2<A1, A2> right;
            boolean cross;

            Iterative2Args2Impl(Iterative2<? extends T1, ? extends T2> left, Iterative2<? extends A1, ? extends A2> right, boolean cross) {
                Objects.requireNonNull(left, "left is null");
                Objects.requireNonNull(right, "right is null");
                this.left = left;
                this.right = right;
                this.cross = cross;
            }

            @Override
            public <R1, R2> Iterative2<R1, R2> mapping(Fn3<? super T1, ? super A1, ? super A2, ? extends R1> f1, Fn3<? super T2, ? super A1, ? super A2, ? extends R2> f2) {
                Objects.requireNonNull(f1, "f1 is null");
                Objects.requireNonNull(f2, "f2 is null");
                Stream<Tuple2<A1, A2>> stream = this.right.toStream();
                Iterative1<T1> i1 = this.left.create(this.left.iterableStream1());
                Iterative1<T2> i2 = this.left.create(this.left.iterableStream2());
                return this.left.create(this.left.splitLt().create((this.cross ? i1.pushBackCrossOf(stream) : i1.pushBackInlineOf(stream)).reduce((Fn2 & Serializable)(t1, tuple) -> f1.apply(t1, tuple._1(), tuple._2())).iterableStream1()), (this.cross ? i2.pushBackCrossOf(stream) : i2.pushBackInlineOf(stream)).reduce((Fn2 & Serializable)(t2, tuple) -> f2.apply(t2, tuple._1(), tuple._2())).iterableStream1());
            }

            @Override
            public <R1, R2> Iterative2<R1, R2> inverseMapping(Fn3<? super A1, ? super A2, ? super T1, ? extends R1> f1, Fn3<? super A1, ? super A2, ? super T2, ? extends R2> f2) {
                return this.mapping((Fn3 & Serializable)(t1, a1, a2) -> f1.apply(a1, a2, t1), (Fn3 & Serializable)(t2, a1, a2) -> f2.apply(a1, a2, t2));
            }

            @Override
            public <R2> Iterative2<T1, R2> mappingRt(Fn3<? super T2, ? super A1, ? super A2, ? extends R2> f2) {
                return this.mapping(IterativeInternals::get1, f2);
            }

            @Override
            public <R1> Iterative2<R1, T2> mappingLt(Fn3<? super T1, ? super A1, ? super A2, ? extends R1> f1) {
                return this.mapping(f1, IterativeInternals::get1);
            }

            @Override
            public <R1, R2> Iterative2Args2<T1, T2, R1, R2> map(Fn1<? super A1, ? extends R1> f1, Fn1<? super A2, ? extends R2> f2) {
                return new Iterative2Args2Impl<T1, T2, R1, R2>(this.left, this.right.map(f1, f2), this.cross);
            }

            @Override
            public <R1> Iterative2Args2<T1, T2, R1, A2> map1(Fn1<? super A1, ? extends R1> f1) {
                return new Iterative2Args2Impl<T1, T2, R1, A2>(this.left, this.right.map1(f1), this.cross);
            }

            @Override
            public <R2> Iterative2Args2<T1, T2, A1, R2> map2(Fn1<? super A2, ? extends R2> f2) {
                return new Iterative2Args2Impl<T1, T2, A1, R2>(this.left, this.right.map2(f2), this.cross);
            }

            @Override
            public <R1, R2> Iterative2Args2<T1, T2, R1, R2> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative2Args2Impl(this.left, this.right.flatMap(f1, f2), this.cross);
            }

            @Override
            public <R1> Iterative2Args2<T1, T2, R1, A2> flatMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative2Args2Impl(this.left, this.right.flatMap1(f1), this.cross);
            }

            @Override
            public <R2> Iterative2Args2<T1, T2, A1, R2> flatMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative2Args2Impl(this.left, this.right.flatMap2(f2), this.cross);
            }

            @Override
            public <R1, R2> Iterative2Args2<T1, T2, R1, R2> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative2Args2Impl(this.left, this.right.inlineMap(f1, f2), this.cross);
            }

            @Override
            public <R1> Iterative2Args2<T1, T2, R1, A2> inlineMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative2Args2Impl(this.left, this.right.inlineMap1(f1), this.cross);
            }

            @Override
            public <R2> Iterative2Args2<T1, T2, A1, R2> inlineMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative2Args2Impl(this.left, this.right.inlineMap2(f2), this.cross);
            }

            @Override
            public Iterative2Args2<T1, T2, A1, A2> filter(Pr1<? super A1> p1, Pr1<? super A2> p2) {
                return new Iterative2Args2Impl<T1, T2, A1, A2>(this.left, this.right.filter(p1, p2), this.cross);
            }

            @Override
            public Iterative2Args2<T1, T2, A1, A2> filter1(Pr1<? super A1> p1) {
                return new Iterative2Args2Impl<T1, T2, A1, A2>(this.left, this.right.filter1(p1), this.cross);
            }

            @Override
            public Iterative2Args2<T1, T2, A1, A2> filter2(Pr1<? super A2> p2) {
                return new Iterative2Args2Impl<T1, T2, A1, A2>(this.left, this.right.filter2(p2), this.cross);
            }

        }

    }

    public static interface Iterative2Args1<T1, T2, A1> extends Iterative2Args<T1, T2> {

        public <R1, R2> Iterative2<R1, R2> mapping(Fn2<? super T1, ? super A1, ? extends R1> var1, Fn2<? super T2, ? super A1, ? extends R2> var2);

        public <R1, R2> Iterative2<R1, R2> inverseMapping(Fn2<? super A1, ? super T1, ? extends R1> var1, Fn2<? super A1, ? super T2, ? extends R2> var2);

        public <R2> Iterative2<T1, R2> mappingRt(Fn2<? super T2, ? super A1, ? extends R2> var1);

        public <R1> Iterative2<R1, T2> mappingLt(Fn2<? super T1, ? super A1, ? extends R1> var1);

        public <R1> Iterative2Args1<T1, T2, R1> map(Fn1<? super A1, ? extends R1> var1);

        public <R1> Iterative2Args1<T1, T2, R1> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> var1);

        public <R1> Iterative2Args1<T1, T2, R1> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> var1);

        public Iterative2Args1<T1, T2, A1> filter(Pr1<? super A1> var1);

        public static class Iterative2Args1Impl<T1, T2, A1> implements Iterative2Args1<T1, T2, A1> {

            Iterative2<T1, T2> left;
            Iterative1<A1> right;
            boolean cross;

            Iterative2Args1Impl(Iterative2<? extends T1, ? extends T2> left, Iterative1<? extends A1> right, boolean cross) {
                Objects.requireNonNull(left, "left is null");
                Objects.requireNonNull(right, "right is null");
                this.left = left;
                this.right = right;
                this.cross = cross;
            }

            @Override
            public <R1, R2> Iterative2<R1, R2> mapping(Fn2<? super T1, ? super A1, ? extends R1> f1, Fn2<? super T2, ? super A1, ? extends R2> f2) {
                Objects.requireNonNull(f1, "f1 is null");
                Objects.requireNonNull(f2, "f2 is null");
                Stream<Tuple1<A1>> stream = this.right.toStream();
                Iterative1<T1> i1 = this.left.create(this.left.iterableStream1());
                Iterative1<T2> i2 = this.left.create(this.left.iterableStream2());
                return this.left.create(this.left.splitLt().create((this.cross ? i1.pushBackCrossOf(stream) : i1.pushBackInlineOf(stream)).reduce((Fn2 & Serializable)(t1, tuple) -> f1.apply(t1, tuple._1())).iterableStream1()), (this.cross ? i2.pushBackCrossOf(stream) : i2.pushBackInlineOf(stream)).reduce((Fn2 & Serializable)(t2, tuple) -> f2.apply(t2, tuple._1())).iterableStream1());
            }

            @Override
            public <R1, R2> Iterative2<R1, R2> inverseMapping(Fn2<? super A1, ? super T1, ? extends R1> f1, Fn2<? super A1, ? super T2, ? extends R2> f2) {
                return this.mapping((Fn2 & Serializable)(t1, a1) -> f1.apply(a1, t1), (Fn2 & Serializable)(t2, a1) -> f2.apply(a1, t2));
            }

            @Override
            public <R2> Iterative2<T1, R2> mappingRt(Fn2<? super T2, ? super A1, ? extends R2> f2) {
                return this.mapping(IterativeInternals::get1, f2);
            }

            @Override
            public <R1> Iterative2<R1, T2> mappingLt(Fn2<? super T1, ? super A1, ? extends R1> f1) {
                return this.mapping(f1, IterativeInternals::get1);
            }

            @Override
            public <R1> Iterative2Args1<T1, T2, R1> map(Fn1<? super A1, ? extends R1> f1) {
                return new Iterative2Args1Impl<T1, T2, R1>(this.left, this.right.map(f1), this.cross);
            }

            @Override
            public <R1> Iterative2Args1<T1, T2, R1> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative2Args1Impl(this.left, this.right.flatMap(f1), this.cross);
            }

            @Override
            public <R1> Iterative2Args1<T1, T2, R1> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative2Args1Impl(this.left, this.right.inlineMap(f1), this.cross);
            }

            @Override
            public Iterative2Args1<T1, T2, A1> filter(Pr1<? super A1> p1) {
                return new Iterative2Args1Impl<T1, T2, A1>(this.left, this.right.filter(p1), this.cross);
            }

        }

    }

}

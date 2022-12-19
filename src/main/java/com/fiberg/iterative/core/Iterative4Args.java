package com.fiberg.iterative.core;

import com.fiberg.iterative.core.Iterative1;
import com.fiberg.iterative.core.Iterative2;
import com.fiberg.iterative.core.Iterative3;
import com.fiberg.iterative.core.Iterative4;
import com.fiberg.iterative.core.IterativeInternals;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fn2;
import com.fiberg.iterative.function.Fn3;
import com.fiberg.iterative.function.Fn4;
import com.fiberg.iterative.function.Fn5;
import com.fiberg.iterative.function.Pr1;
import io.vavr.Tuple1;
import io.vavr.Tuple2;
import io.vavr.Tuple3;
import io.vavr.Tuple4;
import io.vavr.collection.Stream;
import java.io.Serializable;
import java.util.Objects;

public interface Iterative4Args<T1, T2, T3, T4> {

    public static interface Iterative4Args4<T1, T2, T3, T4, A1, A2, A3, A4> extends Iterative4Args<T1, T2, T3, T4> {

        public <R1, R2, R3, R4> Iterative4<R1, R2, R3, R4> mapping(Fn5<? super T1, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R1> f1, Fn5<? super T2, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R2> f2, Fn5<? super T3, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R3> f3, Fn5<? super T4, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R4> f4);

        public <R1, R2, R3, R4> Iterative4<R1, R2, R3, R4> inverseMapping(Fn5<? super A1, ? super A2, ? super A3, ? super A4, ? super T1, ? extends R1> f1, Fn5<? super A1, ? super A2, ? super A3, ? super A4, ? super T2, ? extends R2> f2, Fn5<? super A1, ? super A2, ? super A3, ? super A4, ? super T3, ? extends R3> f3, Fn5<? super A1, ? super A2, ? super A3, ? super A4, ? super T4, ? extends R4> f4);

        public <R4> Iterative4<T1, T2, T3, R4> mappingRt1(Fn5<? super T4, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R4> f1);

        public <R1> Iterative4<R1, T2, T3, T4> mappingLt1(Fn5<? super T1, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R1> f1);

        public <R3, R4> Iterative4<T1, T2, R3, R4> mappingRt2(Fn5<? super T3, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R3> f1, Fn5<? super T4, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R4> f2);

        public <R1, R2> Iterative4<R1, R2, T3, T4> mappingLt2(Fn5<? super T1, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R1> f1, Fn5<? super T2, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R2> f2);

        public <R2, R3, R4> Iterative4<T1, R2, R3, R4> mappingRt3(Fn5<? super T2, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R2> f1, Fn5<? super T3, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R3> f2, Fn5<? super T4, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R4> f3);

        public <R1, R2, R3> Iterative4<R1, R2, R3, T4> mappingLt3(Fn5<? super T1, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R1> f1, Fn5<? super T2, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R2> f2, Fn5<? super T3, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R3> f3);

        public <R1, R2, R3, R4> Iterative4Args4<T1, T2, T3, T4, R1, R2, R3, R4> map(Fn1<? super A1, ? extends R1> f1, Fn1<? super A2, ? extends R2> f2, Fn1<? super A3, ? extends R3> f3, Fn1<? super A4, ? extends R4> f4);

        public <R1> Iterative4Args4<T1, T2, T3, T4, R1, A2, A3, A4> map1(Fn1<? super A1, ? extends R1> f1);

        public <R2> Iterative4Args4<T1, T2, T3, T4, A1, R2, A3, A4> map2(Fn1<? super A2, ? extends R2> f1);

        public <R3> Iterative4Args4<T1, T2, T3, T4, A1, A2, R3, A4> map3(Fn1<? super A3, ? extends R3> f1);

        public <R4> Iterative4Args4<T1, T2, T3, T4, A1, A2, A3, R4> map4(Fn1<? super A4, ? extends R4> f1);

        public <R1, R2, R3, R4> Iterative4Args4<T1, T2, T3, T4, R1, R2, R3, R4> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> i2, Fn1<? super A3, ? extends Iterable<? extends R3>> f3, Fn1<? super A4, ? extends Iterable<? extends R4>> i4);

        public <R1> Iterative4Args4<T1, T2, T3, T4, R1, A2, A3, A4> flatMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1);

        public <R2> Iterative4Args4<T1, T2, T3, T4, A1, R2, A3, A4> flatMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f1);

        public <R3> Iterative4Args4<T1, T2, T3, T4, A1, A2, R3, A4> flatMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> f1);

        public <R4> Iterative4Args4<T1, T2, T3, T4, A1, A2, A3, R4> flatMap4(Fn1<? super A4, ? extends Iterable<? extends R4>> f1);

        public <R1, R2, R3, R4> Iterative4Args4<T1, T2, T3, T4, R1, R2, R3, R4> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> i2, Fn1<? super A3, ? extends Iterable<? extends R3>> f3, Fn1<? super A4, ? extends Iterable<? extends R4>> i4);

        public <R1> Iterative4Args4<T1, T2, T3, T4, R1, A2, A3, A4> inlineMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1);

        public <R2> Iterative4Args4<T1, T2, T3, T4, A1, R2, A3, A4> inlineMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f1);

        public <R3> Iterative4Args4<T1, T2, T3, T4, A1, A2, R3, A4> inlineMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> f1);

        public <R4> Iterative4Args4<T1, T2, T3, T4, A1, A2, A3, R4> inlineMap4(Fn1<? super A4, ? extends Iterable<? extends R4>> f1);

        public Iterative4Args4<T1, T2, T3, T4, A1, A2, A3, A4> filter(Pr1<? super A1> p1, Pr1<? super A2> p2, Pr1<? super A3> p3, Pr1<? super A4> p4);

        public Iterative4Args4<T1, T2, T3, T4, A1, A2, A3, A4> filter1(Pr1<? super A1> p1);

        public Iterative4Args4<T1, T2, T3, T4, A1, A2, A3, A4> filter2(Pr1<? super A2> p1);

        public Iterative4Args4<T1, T2, T3, T4, A1, A2, A3, A4> filter3(Pr1<? super A3> p1);

        public Iterative4Args4<T1, T2, T3, T4, A1, A2, A3, A4> filter4(Pr1<? super A4> p1);

        public static class Iterative4Args4Impl<T1, T2, T3, T4, A1, A2, A3, A4> implements Iterative4Args4<T1, T2, T3, T4, A1, A2, A3, A4> {

            final boolean cross;
            final Iterative4<T1, T2, T3, T4> left;
            final Iterative4<A1, A2, A3, A4> right;

            Iterative4Args4Impl(Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4> left, Iterative4<? extends A1, ? extends A2, ? extends A3, ? extends A4> right, boolean cross) {
                Objects.requireNonNull(left, "left is null");
                Objects.requireNonNull(right, "right is null");
                this.cross = cross;
                this.left = Iterative.narrow(left);
                this.right = Iterative.narrow(right);
            }

            @Override
            public <R1, R2, R3, R4> Iterative4<R1, R2, R3, R4> mapping(Fn5<? super T1, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R1> f1, Fn5<? super T2, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R2> f2, Fn5<? super T3, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R3> f3, Fn5<? super T4, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R4> f4) {

                Objects.requireNonNull(f1, "f1 is null");
                Objects.requireNonNull(f2, "f2 is null");
                Objects.requireNonNull(f3, "f3 is null");
                Objects.requireNonNull(f4, "f4 is null");

                final Stream<Tuple4<A1, A2, A3, A4>> stream = this.right.toStream();

                final Iterative1<T1> i1 = this.left.create(this.left.iterableStream1());
                final Iterative1<T2> i2 = this.left.create(this.left.iterableStream2());
                final Iterative1<T3> i3 = this.left.create(this.left.iterableStream3());
                final Iterative1<T4> i4 = this.left.create(this.left.iterableStream4());

                final Iterative1<R1> iter1 = this.left.splitLt1().create((this.cross ? i1.pushBackCrossOf(stream) : i1.pushBackInlineOf(stream)).reduce((t1, tuple) -> f1.apply(t1, tuple._1(), tuple._2(), tuple._3(), tuple._4())).iterableStream1());
                final Iterative2<R1, R2> iter2 = this.left.splitLt2().create(iter1, (this.cross ? i2.pushBackCrossOf(stream) : i2.pushBackInlineOf(stream)).reduce((t2, tuple) -> f2.apply(t2, tuple._1(), tuple._2(), tuple._3(), tuple._4())).iterableStream1());
                final Iterative3<R1, R2, R3> iter3 = this.left.splitLt3().create(iter2, (this.cross ? i3.pushBackCrossOf(stream) : i3.pushBackInlineOf(stream)).reduce((t3, tuple) -> f3.apply(t3, tuple._1(), tuple._2(), tuple._3(), tuple._4())).iterableStream1());

                return this.left.create(iter3, (this.cross ? i4.pushBackCrossOf(stream) : i4.pushBackInlineOf(stream)).reduce((t4, tuple) -> f4.apply(t4, tuple._1(), tuple._2(), tuple._3(), tuple._4())).iterableStream1());

            }

            @Override
            public <R1, R2, R3, R4> Iterative4<R1, R2, R3, R4> inverseMapping(Fn5<? super A1, ? super A2, ? super A3, ? super A4, ? super T1, ? extends R1> f1, Fn5<? super A1, ? super A2, ? super A3, ? super A4, ? super T2, ? extends R2> f2, Fn5<? super A1, ? super A2, ? super A3, ? super A4, ? super T3, ? extends R3> f3, Fn5<? super A1, ? super A2, ? super A3, ? super A4, ? super T4, ? extends R4> f4) {
                return this.mapping((t1, a1, a2, a3, a4) -> f1.apply(a1, a2, a3, a4, t1), (t2, a1, a2, a3, a4) -> f2.apply(a1, a2, a3, a4, t2), (t3, a1, a2, a3, a4) -> f3.apply(a1, a2, a3, a4, t3), (t4, a1, a2, a3, a4) -> f4.apply(a1, a2, a3, a4, t4));
            }

            @Override
            public <R4> Iterative4<T1, T2, T3, R4> mappingRt1(Fn5<? super T4, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R4> f4) {
                return this.mapping(IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1, f4);
            }

            @Override
            public <R1> Iterative4<R1, T2, T3, T4> mappingLt1(Fn5<? super T1, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R1> f1) {
                return this.mapping(f1, IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1);
            }

            @Override
            public <R3, R4> Iterative4<T1, T2, R3, R4> mappingRt2(Fn5<? super T3, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R3> f3, Fn5<? super T4, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R4> f4) {
                return this.mapping(IterativeInternals::get1, IterativeInternals::get1, f3, f4);
            }

            @Override
            public <R1, R2> Iterative4<R1, R2, T3, T4> mappingLt2(Fn5<? super T1, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R1> f1, Fn5<? super T2, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R2> f2) {
                return this.mapping(f1, f2, IterativeInternals::get1, IterativeInternals::get1);
            }

            @Override
            public <R2, R3, R4> Iterative4<T1, R2, R3, R4> mappingRt3(Fn5<? super T2, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R2> f2, Fn5<? super T3, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R3> f3, Fn5<? super T4, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R4> f4) {
                return this.mapping(IterativeInternals::get1, f2, f3, f4);
            }

            @Override
            public <R1, R2, R3> Iterative4<R1, R2, R3, T4> mappingLt3(Fn5<? super T1, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R1> f1, Fn5<? super T2, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R2> f2, Fn5<? super T3, ? super A1, ? super A2, ? super A3, ? super A4, ? extends R3> f3) {
                return this.mapping(f1, f2, f3, IterativeInternals::get1);
            }

            @Override
            public <R1, R2, R3, R4> Iterative4Args4<T1, T2, T3, T4, R1, R2, R3, R4> map(Fn1<? super A1, ? extends R1> f1, Fn1<? super A2, ? extends R2> f2, Fn1<? super A3, ? extends R3> f3, Fn1<? super A4, ? extends R4> f4) {
                return new Iterative4Args4Impl<>(this.left, this.right.map(f1, f2, f3, f4), this.cross);
            }

            @Override
            public <R1> Iterative4Args4<T1, T2, T3, T4, R1, A2, A3, A4> map1(Fn1<? super A1, ? extends R1> f1) {
                return new Iterative4Args4Impl<>(this.left, this.right.map1(f1), this.cross);
            }

            @Override
            public <R2> Iterative4Args4<T1, T2, T3, T4, A1, R2, A3, A4> map2(Fn1<? super A2, ? extends R2> f2) {
                return new Iterative4Args4Impl<>(this.left, this.right.map2(f2), this.cross);
            }

            @Override
            public <R3> Iterative4Args4<T1, T2, T3, T4, A1, A2, R3, A4> map3(Fn1<? super A3, ? extends R3> f3) {
                return new Iterative4Args4Impl<>(this.left, this.right.map3(f3), this.cross);
            }

            @Override
            public <R4> Iterative4Args4<T1, T2, T3, T4, A1, A2, A3, R4> map4(Fn1<? super A4, ? extends R4> f4) {
                return new Iterative4Args4Impl<>(this.left, this.right.map4(f4), this.cross);
            }

            @Override
            public <R1, R2, R3, R4> Iterative4Args4<T1, T2, T3, T4, R1, R2, R3, R4> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> f2, Fn1<? super A3, ? extends Iterable<? extends R3>> f3, Fn1<? super A4, ? extends Iterable<? extends R4>> f4) {
                return new Iterative4Args4Impl<>(this.left, this.right.flatMap(f1, f2, f3, f4), this.cross);
            }

            @Override
            public <R1> Iterative4Args4<T1, T2, T3, T4, R1, A2, A3, A4> flatMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative4Args4Impl<>(this.left, this.right.flatMap1(f1), this.cross);
            }

            @Override
            public <R2> Iterative4Args4<T1, T2, T3, T4, A1, R2, A3, A4> flatMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative4Args4Impl<>(this.left, this.right.flatMap2(f2), this.cross);
            }

            @Override
            public <R3> Iterative4Args4<T1, T2, T3, T4, A1, A2, R3, A4> flatMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> f3) {
                return new Iterative4Args4Impl<>(this.left, this.right.flatMap3(f3), this.cross);
            }

            @Override
            public <R4> Iterative4Args4<T1, T2, T3, T4, A1, A2, A3, R4> flatMap4(Fn1<? super A4, ? extends Iterable<? extends R4>> f4) {
                return new Iterative4Args4Impl<>(this.left, this.right.flatMap4(f4), this.cross);
            }

            @Override
            public <R1, R2, R3, R4> Iterative4Args4<T1, T2, T3, T4, R1, R2, R3, R4> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> f2, Fn1<? super A3, ? extends Iterable<? extends R3>> f3, Fn1<? super A4, ? extends Iterable<? extends R4>> f4) {
                return new Iterative4Args4Impl<>(this.left, this.right.inlineMap(f1, f2, f3, f4), this.cross);
            }

            @Override
            public <R1> Iterative4Args4<T1, T2, T3, T4, R1, A2, A3, A4> inlineMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative4Args4Impl<>(this.left, this.right.inlineMap1(f1), this.cross);
            }

            @Override
            public <R2> Iterative4Args4<T1, T2, T3, T4, A1, R2, A3, A4> inlineMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative4Args4Impl<>(this.left, this.right.inlineMap2(f2), this.cross);
            }

            @Override
            public <R3> Iterative4Args4<T1, T2, T3, T4, A1, A2, R3, A4> inlineMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> f3) {
                return new Iterative4Args4Impl<>(this.left, this.right.inlineMap3(f3), this.cross);
            }

            @Override
            public <R4> Iterative4Args4<T1, T2, T3, T4, A1, A2, A3, R4> inlineMap4(Fn1<? super A4, ? extends Iterable<? extends R4>> f4) {
                return new Iterative4Args4Impl<>(this.left, this.right.inlineMap4(f4), this.cross);
            }

            @Override
            public Iterative4Args4<T1, T2, T3, T4, A1, A2, A3, A4> filter(Pr1<? super A1> p1, Pr1<? super A2> p2, Pr1<? super A3> p3, Pr1<? super A4> p4) {
                return new Iterative4Args4Impl<>(this.left, this.right.filter(p1, p2, p3, p4), this.cross);
            }

            @Override
            public Iterative4Args4<T1, T2, T3, T4, A1, A2, A3, A4> filter1(Pr1<? super A1> p1) {
                return new Iterative4Args4Impl<>(this.left, this.right.filter1(p1), this.cross);
            }

            @Override
            public Iterative4Args4<T1, T2, T3, T4, A1, A2, A3, A4> filter2(Pr1<? super A2> p2) {
                return new Iterative4Args4Impl<>(this.left, this.right.filter2(p2), this.cross);
            }

            @Override
            public Iterative4Args4<T1, T2, T3, T4, A1, A2, A3, A4> filter3(Pr1<? super A3> p3) {
                return new Iterative4Args4Impl<>(this.left, this.right.filter3(p3), this.cross);
            }

            @Override
            public Iterative4Args4<T1, T2, T3, T4, A1, A2, A3, A4> filter4(Pr1<? super A4> p4) {
                return new Iterative4Args4Impl<>(this.left, this.right.filter4(p4), this.cross);
            }

        }

    }

    public static interface Iterative4Args3<T1, T2, T3, T4, A1, A2, A3> extends Iterative4Args<T1, T2, T3, T4> {

        public <R1, R2, R3, R4> Iterative4<R1, R2, R3, R4> mapping(Fn4<? super T1, ? super A1, ? super A2, ? super A3, ? extends R1> f1, Fn4<? super T2, ? super A1, ? super A2, ? super A3, ? extends R2> f2, Fn4<? super T3, ? super A1, ? super A2, ? super A3, ? extends R3> f3, Fn4<? super T4, ? super A1, ? super A2, ? super A3, ? extends R4> f4);

        public <R1, R2, R3, R4> Iterative4<R1, R2, R3, R4> inverseMapping(Fn4<? super A1, ? super A2, ? super A3, ? super T1, ? extends R1> f1, Fn4<? super A1, ? super A2, ? super A3, ? super T2, ? extends R2> f2, Fn4<? super A1, ? super A2, ? super A3, ? super T3, ? extends R3> f3, Fn4<? super A1, ? super A2, ? super A3, ? super T4, ? extends R4> f4);

        public <R4> Iterative4<T1, T2, T3, R4> mappingRt1(Fn4<? super T4, ? super A1, ? super A2, ? super A3, ? extends R4> f1);

        public <R1> Iterative4<R1, T2, T3, T4> mappingLt1(Fn4<? super T1, ? super A1, ? super A2, ? super A3, ? extends R1> f1);

        public <R3, R4> Iterative4<T1, T2, R3, R4> mappingRt2(Fn4<? super T3, ? super A1, ? super A2, ? super A3, ? extends R3> f1, Fn4<? super T4, ? super A1, ? super A2, ? super A3, ? extends R4> f2);

        public <R1, R2> Iterative4<R1, R2, T3, T4> mappingLt2(Fn4<? super T1, ? super A1, ? super A2, ? super A3, ? extends R1> f1, Fn4<? super T2, ? super A1, ? super A2, ? super A3, ? extends R2> f2);

        public <R2, R3, R4> Iterative4<T1, R2, R3, R4> mappingRt3(Fn4<? super T2, ? super A1, ? super A2, ? super A3, ? extends R2> f1, Fn4<? super T3, ? super A1, ? super A2, ? super A3, ? extends R3> f2, Fn4<? super T4, ? super A1, ? super A2, ? super A3, ? extends R4> f3);

        public <R1, R2, R3> Iterative4<R1, R2, R3, T4> mappingLt3(Fn4<? super T1, ? super A1, ? super A2, ? super A3, ? extends R1> f1, Fn4<? super T2, ? super A1, ? super A2, ? super A3, ? extends R2> f2, Fn4<? super T3, ? super A1, ? super A2, ? super A3, ? extends R3> f3);

        public <R1, R2, R3> Iterative4Args3<T1, T2, T3, T4, R1, R2, R3> map(Fn1<? super A1, ? extends R1> f1, Fn1<? super A2, ? extends R2> f2, Fn1<? super A3, ? extends R3> f3);

        public <R1> Iterative4Args3<T1, T2, T3, T4, R1, A2, A3> map1(Fn1<? super A1, ? extends R1> f1);

        public <R2> Iterative4Args3<T1, T2, T3, T4, A1, R2, A3> map2(Fn1<? super A2, ? extends R2> f1);

        public <R3> Iterative4Args3<T1, T2, T3, T4, A1, A2, R3> map3(Fn1<? super A3, ? extends R3> f1);

        public <R1, R2, R3> Iterative4Args3<T1, T2, T3, T4, R1, R2, R3> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> i2, Fn1<? super A3, ? extends Iterable<? extends R3>> f3);

        public <R1> Iterative4Args3<T1, T2, T3, T4, R1, A2, A3> flatMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1);

        public <R2> Iterative4Args3<T1, T2, T3, T4, A1, R2, A3> flatMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f1);

        public <R3> Iterative4Args3<T1, T2, T3, T4, A1, A2, R3> flatMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> f1);

        public <R1, R2, R3> Iterative4Args3<T1, T2, T3, T4, R1, R2, R3> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> i2, Fn1<? super A3, ? extends Iterable<? extends R3>> f3);

        public <R1> Iterative4Args3<T1, T2, T3, T4, R1, A2, A3> inlineMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1);

        public <R2> Iterative4Args3<T1, T2, T3, T4, A1, R2, A3> inlineMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f1);

        public <R3> Iterative4Args3<T1, T2, T3, T4, A1, A2, R3> inlineMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> f1);

        public Iterative4Args3<T1, T2, T3, T4, A1, A2, A3> filter(Pr1<? super A1> p1, Pr1<? super A2> p2, Pr1<? super A3> p3);

        public Iterative4Args3<T1, T2, T3, T4, A1, A2, A3> filter1(Pr1<? super A1> p1);

        public Iterative4Args3<T1, T2, T3, T4, A1, A2, A3> filter2(Pr1<? super A2> p1);

        public Iterative4Args3<T1, T2, T3, T4, A1, A2, A3> filter3(Pr1<? super A3> p1);

        public static class Iterative4Args3Impl<T1, T2, T3, T4, A1, A2, A3> implements Iterative4Args3<T1, T2, T3, T4, A1, A2, A3> {

            final boolean cross;
            final Iterative4<T1, T2, T3, T4> left;
            final Iterative3<A1, A2, A3> right;

            Iterative4Args3Impl(Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4> left, Iterative3<? extends A1, ? extends A2, ? extends A3> right, boolean cross) {
                Objects.requireNonNull(left, "left is null");
                Objects.requireNonNull(right, "right is null");
                this.cross = cross;
                this.left = Iterative.narrow(left);
                this.right = Iterative.narrow(right);
            }

            @Override
            public <R1, R2, R3, R4> Iterative4<R1, R2, R3, R4> mapping(Fn4<? super T1, ? super A1, ? super A2, ? super A3, ? extends R1> f1, Fn4<? super T2, ? super A1, ? super A2, ? super A3, ? extends R2> f2, Fn4<? super T3, ? super A1, ? super A2, ? super A3, ? extends R3> f3, Fn4<? super T4, ? super A1, ? super A2, ? super A3, ? extends R4> f4) {

                Objects.requireNonNull(f1, "f1 is null");
                Objects.requireNonNull(f2, "f2 is null");
                Objects.requireNonNull(f3, "f3 is null");
                Objects.requireNonNull(f4, "f4 is null");

                final Stream<Tuple3<A1, A2, A3>> stream = this.right.toStream();

                final Iterative1<T1> i1 = this.left.create(this.left.iterableStream1());
                final Iterative1<T2> i2 = this.left.create(this.left.iterableStream2());
                final Iterative1<T3> i3 = this.left.create(this.left.iterableStream3());
                final Iterative1<T4> i4 = this.left.create(this.left.iterableStream4());

                final Iterative1<R1> iter1 = this.left.splitLt1().create((this.cross ? i1.pushBackCrossOf(stream) : i1.pushBackInlineOf(stream)).reduce((t1, tuple) -> f1.apply(t1, tuple._1(), tuple._2(), tuple._3())).iterableStream1());
                final Iterative2<R1, R2> iter2 = this.left.splitLt2().create(iter1, (this.cross ? i2.pushBackCrossOf(stream) : i2.pushBackInlineOf(stream)).reduce((t2, tuple) -> f2.apply(t2, tuple._1(), tuple._2(), tuple._3())).iterableStream1());
                final Iterative3<R1, R2, R3> iter3 = this.left.splitLt3().create(iter2, (this.cross ? i3.pushBackCrossOf(stream) : i3.pushBackInlineOf(stream)).reduce((t3, tuple) -> f3.apply(t3, tuple._1(), tuple._2(), tuple._3())).iterableStream1());

                return this.left.create(iter3, (this.cross ? i4.pushBackCrossOf(stream) : i4.pushBackInlineOf(stream)).reduce((t4, tuple) -> f4.apply(t4, tuple._1(), tuple._2(), tuple._3())).iterableStream1());

            }

            @Override
            public <R1, R2, R3, R4> Iterative4<R1, R2, R3, R4> inverseMapping(Fn4<? super A1, ? super A2, ? super A3, ? super T1, ? extends R1> f1, Fn4<? super A1, ? super A2, ? super A3, ? super T2, ? extends R2> f2, Fn4<? super A1, ? super A2, ? super A3, ? super T3, ? extends R3> f3, Fn4<? super A1, ? super A2, ? super A3, ? super T4, ? extends R4> f4) {
                return this.mapping((t1, a1, a2, a3) -> f1.apply(a1, a2, a3, t1), (t2, a1, a2, a3) -> f2.apply(a1, a2, a3, t2), (t3, a1, a2, a3) -> f3.apply(a1, a2, a3, t3), (t4, a1, a2, a3) -> f4.apply(a1, a2, a3, t4));
            }

            @Override
            public <R4> Iterative4<T1, T2, T3, R4> mappingRt1(Fn4<? super T4, ? super A1, ? super A2, ? super A3, ? extends R4> f4) {
                return this.mapping(IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1, f4);
            }

            @Override
            public <R1> Iterative4<R1, T2, T3, T4> mappingLt1(Fn4<? super T1, ? super A1, ? super A2, ? super A3, ? extends R1> f1) {
                return this.mapping(f1, IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1);
            }

            @Override
            public <R3, R4> Iterative4<T1, T2, R3, R4> mappingRt2(Fn4<? super T3, ? super A1, ? super A2, ? super A3, ? extends R3> f3, Fn4<? super T4, ? super A1, ? super A2, ? super A3, ? extends R4> f4) {
                return this.mapping(IterativeInternals::get1, IterativeInternals::get1, f3, f4);
            }

            @Override
            public <R1, R2> Iterative4<R1, R2, T3, T4> mappingLt2(Fn4<? super T1, ? super A1, ? super A2, ? super A3, ? extends R1> f1, Fn4<? super T2, ? super A1, ? super A2, ? super A3, ? extends R2> f2) {
                return this.mapping(f1, f2, IterativeInternals::get1, IterativeInternals::get1);
            }

            @Override
            public <R2, R3, R4> Iterative4<T1, R2, R3, R4> mappingRt3(Fn4<? super T2, ? super A1, ? super A2, ? super A3, ? extends R2> f2, Fn4<? super T3, ? super A1, ? super A2, ? super A3, ? extends R3> f3, Fn4<? super T4, ? super A1, ? super A2, ? super A3, ? extends R4> f4) {
                return this.mapping(IterativeInternals::get1, f2, f3, f4);
            }

            @Override
            public <R1, R2, R3> Iterative4<R1, R2, R3, T4> mappingLt3(Fn4<? super T1, ? super A1, ? super A2, ? super A3, ? extends R1> f1, Fn4<? super T2, ? super A1, ? super A2, ? super A3, ? extends R2> f2, Fn4<? super T3, ? super A1, ? super A2, ? super A3, ? extends R3> f3) {
                return this.mapping(f1, f2, f3, IterativeInternals::get1);
            }

            @Override
            public <R1, R2, R3> Iterative4Args3<T1, T2, T3, T4, R1, R2, R3> map(Fn1<? super A1, ? extends R1> f1, Fn1<? super A2, ? extends R2> f2, Fn1<? super A3, ? extends R3> f3) {
                return new Iterative4Args3Impl<>(this.left, this.right.map(f1, f2, f3), this.cross);
            }

            @Override
            public <R1> Iterative4Args3<T1, T2, T3, T4, R1, A2, A3> map1(Fn1<? super A1, ? extends R1> f1) {
                return new Iterative4Args3Impl<>(this.left, this.right.map1(f1), this.cross);
            }

            @Override
            public <R2> Iterative4Args3<T1, T2, T3, T4, A1, R2, A3> map2(Fn1<? super A2, ? extends R2> f2) {
                return new Iterative4Args3Impl<>(this.left, this.right.map2(f2), this.cross);
            }

            @Override
            public <R3> Iterative4Args3<T1, T2, T3, T4, A1, A2, R3> map3(Fn1<? super A3, ? extends R3> f3) {
                return new Iterative4Args3Impl<>(this.left, this.right.map3(f3), this.cross);
            }

            @Override
            public <R1, R2, R3> Iterative4Args3<T1, T2, T3, T4, R1, R2, R3> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> f2, Fn1<? super A3, ? extends Iterable<? extends R3>> f3) {
                return new Iterative4Args3Impl<>(this.left, this.right.flatMap(f1, f2, f3), this.cross);
            }

            @Override
            public <R1> Iterative4Args3<T1, T2, T3, T4, R1, A2, A3> flatMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative4Args3Impl<>(this.left, this.right.flatMap1(f1), this.cross);
            }

            @Override
            public <R2> Iterative4Args3<T1, T2, T3, T4, A1, R2, A3> flatMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative4Args3Impl<>(this.left, this.right.flatMap2(f2), this.cross);
            }

            @Override
            public <R3> Iterative4Args3<T1, T2, T3, T4, A1, A2, R3> flatMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> f3) {
                return new Iterative4Args3Impl<>(this.left, this.right.flatMap3(f3), this.cross);
            }

            @Override
            public <R1, R2, R3> Iterative4Args3<T1, T2, T3, T4, R1, R2, R3> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> f2, Fn1<? super A3, ? extends Iterable<? extends R3>> f3) {
                return new Iterative4Args3Impl<>(this.left, this.right.inlineMap(f1, f2, f3), this.cross);
            }

            @Override
            public <R1> Iterative4Args3<T1, T2, T3, T4, R1, A2, A3> inlineMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative4Args3Impl<>(this.left, this.right.inlineMap1(f1), this.cross);
            }

            @Override
            public <R2> Iterative4Args3<T1, T2, T3, T4, A1, R2, A3> inlineMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative4Args3Impl<>(this.left, this.right.inlineMap2(f2), this.cross);
            }

            @Override
            public <R3> Iterative4Args3<T1, T2, T3, T4, A1, A2, R3> inlineMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> f3) {
                return new Iterative4Args3Impl<>(this.left, this.right.inlineMap3(f3), this.cross);
            }

            @Override
            public Iterative4Args3<T1, T2, T3, T4, A1, A2, A3> filter(Pr1<? super A1> p1, Pr1<? super A2> p2, Pr1<? super A3> p3) {
                return new Iterative4Args3Impl<>(this.left, this.right.filter(p1, p2, p3), this.cross);
            }

            @Override
            public Iterative4Args3<T1, T2, T3, T4, A1, A2, A3> filter1(Pr1<? super A1> p1) {
                return new Iterative4Args3Impl<>(this.left, this.right.filter1(p1), this.cross);
            }

            @Override
            public Iterative4Args3<T1, T2, T3, T4, A1, A2, A3> filter2(Pr1<? super A2> p2) {
                return new Iterative4Args3Impl<>(this.left, this.right.filter2(p2), this.cross);
            }

            @Override
            public Iterative4Args3<T1, T2, T3, T4, A1, A2, A3> filter3(Pr1<? super A3> p3) {
                return new Iterative4Args3Impl<>(this.left, this.right.filter3(p3), this.cross);
            }

        }

    }

    public static interface Iterative4Args2<T1, T2, T3, T4, A1, A2> extends Iterative4Args<T1, T2, T3, T4> {

        public <R1, R2, R3, R4> Iterative4<R1, R2, R3, R4> mapping(Fn3<? super T1, ? super A1, ? super A2, ? extends R1> f1, Fn3<? super T2, ? super A1, ? super A2, ? extends R2> f2, Fn3<? super T3, ? super A1, ? super A2, ? extends R3> f3, Fn3<? super T4, ? super A1, ? super A2, ? extends R4> f4);

        public <R1, R2, R3, R4> Iterative4<R1, R2, R3, R4> inverseMapping(Fn3<? super A1, ? super A2, ? super T1, ? extends R1> f1, Fn3<? super A1, ? super A2, ? super T2, ? extends R2> f2, Fn3<? super A1, ? super A2, ? super T3, ? extends R3> f3, Fn3<? super A1, ? super A2, ? super T4, ? extends R4> f4);

        public <R4> Iterative4<T1, T2, T3, R4> mappingRt1(Fn3<? super T4, ? super A1, ? super A2, ? extends R4> f1);

        public <R1> Iterative4<R1, T2, T3, T4> mappingLt1(Fn3<? super T1, ? super A1, ? super A2, ? extends R1> f1);

        public <R3, R4> Iterative4<T1, T2, R3, R4> mappingRt2(Fn3<? super T3, ? super A1, ? super A2, ? extends R3> f1, Fn3<? super T4, ? super A1, ? super A2, ? extends R4> f2);

        public <R1, R2> Iterative4<R1, R2, T3, T4> mappingLt2(Fn3<? super T1, ? super A1, ? super A2, ? extends R1> f1, Fn3<? super T2, ? super A1, ? super A2, ? extends R2> f2);

        public <R2, R3, R4> Iterative4<T1, R2, R3, R4> mappingRt3(Fn3<? super T2, ? super A1, ? super A2, ? extends R2> f1, Fn3<? super T3, ? super A1, ? super A2, ? extends R3> f2, Fn3<? super T4, ? super A1, ? super A2, ? extends R4> f3);

        public <R1, R2, R3> Iterative4<R1, R2, R3, T4> mappingLt3(Fn3<? super T1, ? super A1, ? super A2, ? extends R1> f1, Fn3<? super T2, ? super A1, ? super A2, ? extends R2> f2, Fn3<? super T3, ? super A1, ? super A2, ? extends R3> f3);

        public <R1, R2> Iterative4Args2<T1, T2, T3, T4, R1, R2> map(Fn1<? super A1, ? extends R1> f1, Fn1<? super A2, ? extends R2> f2);

        public <R1> Iterative4Args2<T1, T2, T3, T4, R1, A2> map1(Fn1<? super A1, ? extends R1> f1);

        public <R2> Iterative4Args2<T1, T2, T3, T4, A1, R2> map2(Fn1<? super A2, ? extends R2> f1);

        public <R1, R2> Iterative4Args2<T1, T2, T3, T4, R1, R2> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> i2);

        public <R1> Iterative4Args2<T1, T2, T3, T4, R1, A2> flatMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1);

        public <R2> Iterative4Args2<T1, T2, T3, T4, A1, R2> flatMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f1);

        public <R1, R2> Iterative4Args2<T1, T2, T3, T4, R1, R2> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> i2);

        public <R1> Iterative4Args2<T1, T2, T3, T4, R1, A2> inlineMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1);

        public <R2> Iterative4Args2<T1, T2, T3, T4, A1, R2> inlineMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f1);

        public Iterative4Args2<T1, T2, T3, T4, A1, A2> filter(Pr1<? super A1> p1, Pr1<? super A2> p2);

        public Iterative4Args2<T1, T2, T3, T4, A1, A2> filter1(Pr1<? super A1> p1);

        public Iterative4Args2<T1, T2, T3, T4, A1, A2> filter2(Pr1<? super A2> p1);

        public static class Iterative4Args2Impl<T1, T2, T3, T4, A1, A2> implements Iterative4Args2<T1, T2, T3, T4, A1, A2> {

            final boolean cross;
            final Iterative4<T1, T2, T3, T4> left;
            final Iterative2<A1, A2> right;

            Iterative4Args2Impl(Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4> left, Iterative2<? extends A1, ? extends A2> right, boolean cross) {
                Objects.requireNonNull(left, "left is null");
                Objects.requireNonNull(right, "right is null");
                this.cross = cross;
                this.left = Iterative.narrow(left);
                this.right = Iterative.narrow(right);
            }

            @Override
            public <R1, R2, R3, R4> Iterative4<R1, R2, R3, R4> mapping(Fn3<? super T1, ? super A1, ? super A2, ? extends R1> f1, Fn3<? super T2, ? super A1, ? super A2, ? extends R2> f2, Fn3<? super T3, ? super A1, ? super A2, ? extends R3> f3, Fn3<? super T4, ? super A1, ? super A2, ? extends R4> f4) {

                Objects.requireNonNull(f1, "f1 is null");
                Objects.requireNonNull(f2, "f2 is null");
                Objects.requireNonNull(f3, "f3 is null");
                Objects.requireNonNull(f4, "f4 is null");

                final Stream<Tuple2<A1, A2>> stream = this.right.toStream();

                final Iterative1<T1> i1 = this.left.create(this.left.iterableStream1());
                final Iterative1<T2> i2 = this.left.create(this.left.iterableStream2());
                final Iterative1<T3> i3 = this.left.create(this.left.iterableStream3());
                final Iterative1<T4> i4 = this.left.create(this.left.iterableStream4());

                final Iterative1<R1> iter1 = this.left.splitLt1().create((this.cross ? i1.pushBackCrossOf(stream) : i1.pushBackInlineOf(stream)).reduce((t1, tuple) -> f1.apply(t1, tuple._1(), tuple._2())).iterableStream1());
                final Iterative2<R1, R2> iter2 = this.left.splitLt2().create(iter1, (this.cross ? i2.pushBackCrossOf(stream) : i2.pushBackInlineOf(stream)).reduce((t2, tuple) -> f2.apply(t2, tuple._1(), tuple._2())).iterableStream1());
                final Iterative3<R1, R2, R3> iter3 = this.left.splitLt3().create(iter2, (this.cross ? i3.pushBackCrossOf(stream) : i3.pushBackInlineOf(stream)).reduce((t3, tuple) -> f3.apply(t3, tuple._1(), tuple._2())).iterableStream1());

                return this.left.create(iter3, (this.cross ? i4.pushBackCrossOf(stream) : i4.pushBackInlineOf(stream)).reduce((t4, tuple) -> f4.apply(t4, tuple._1(), tuple._2())).iterableStream1());

            }

            @Override
            public <R1, R2, R3, R4> Iterative4<R1, R2, R3, R4> inverseMapping(Fn3<? super A1, ? super A2, ? super T1, ? extends R1> f1, Fn3<? super A1, ? super A2, ? super T2, ? extends R2> f2, Fn3<? super A1, ? super A2, ? super T3, ? extends R3> f3, Fn3<? super A1, ? super A2, ? super T4, ? extends R4> f4) {
                return this.mapping((t1, a1, a2) -> f1.apply(a1, a2, t1), (t2, a1, a2) -> f2.apply(a1, a2, t2), (t3, a1, a2) -> f3.apply(a1, a2, t3), (t4, a1, a2) -> f4.apply(a1, a2, t4));
            }

            @Override
            public <R4> Iterative4<T1, T2, T3, R4> mappingRt1(Fn3<? super T4, ? super A1, ? super A2, ? extends R4> f4) {
                return this.mapping(IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1, f4);
            }

            @Override
            public <R1> Iterative4<R1, T2, T3, T4> mappingLt1(Fn3<? super T1, ? super A1, ? super A2, ? extends R1> f1) {
                return this.mapping(f1, IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1);
            }

            @Override
            public <R3, R4> Iterative4<T1, T2, R3, R4> mappingRt2(Fn3<? super T3, ? super A1, ? super A2, ? extends R3> f3, Fn3<? super T4, ? super A1, ? super A2, ? extends R4> f4) {
                return this.mapping(IterativeInternals::get1, IterativeInternals::get1, f3, f4);
            }

            @Override
            public <R1, R2> Iterative4<R1, R2, T3, T4> mappingLt2(Fn3<? super T1, ? super A1, ? super A2, ? extends R1> f1, Fn3<? super T2, ? super A1, ? super A2, ? extends R2> f2) {
                return this.mapping(f1, f2, IterativeInternals::get1, IterativeInternals::get1);
            }

            @Override
            public <R2, R3, R4> Iterative4<T1, R2, R3, R4> mappingRt3(Fn3<? super T2, ? super A1, ? super A2, ? extends R2> f2, Fn3<? super T3, ? super A1, ? super A2, ? extends R3> f3, Fn3<? super T4, ? super A1, ? super A2, ? extends R4> f4) {
                return this.mapping(IterativeInternals::get1, f2, f3, f4);
            }

            @Override
            public <R1, R2, R3> Iterative4<R1, R2, R3, T4> mappingLt3(Fn3<? super T1, ? super A1, ? super A2, ? extends R1> f1, Fn3<? super T2, ? super A1, ? super A2, ? extends R2> f2, Fn3<? super T3, ? super A1, ? super A2, ? extends R3> f3) {
                return this.mapping(f1, f2, f3, IterativeInternals::get1);
            }

            @Override
            public <R1, R2> Iterative4Args2<T1, T2, T3, T4, R1, R2> map(Fn1<? super A1, ? extends R1> f1, Fn1<? super A2, ? extends R2> f2) {
                return new Iterative4Args2Impl<>(this.left, this.right.map(f1, f2), this.cross);
            }

            @Override
            public <R1> Iterative4Args2<T1, T2, T3, T4, R1, A2> map1(Fn1<? super A1, ? extends R1> f1) {
                return new Iterative4Args2Impl<>(this.left, this.right.map1(f1), this.cross);
            }

            @Override
            public <R2> Iterative4Args2<T1, T2, T3, T4, A1, R2> map2(Fn1<? super A2, ? extends R2> f2) {
                return new Iterative4Args2Impl<>(this.left, this.right.map2(f2), this.cross);
            }

            @Override
            public <R1, R2> Iterative4Args2<T1, T2, T3, T4, R1, R2> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative4Args2Impl<>(this.left, this.right.flatMap(f1, f2), this.cross);
            }

            @Override
            public <R1> Iterative4Args2<T1, T2, T3, T4, R1, A2> flatMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative4Args2Impl<>(this.left, this.right.flatMap1(f1), this.cross);
            }

            @Override
            public <R2> Iterative4Args2<T1, T2, T3, T4, A1, R2> flatMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative4Args2Impl<>(this.left, this.right.flatMap2(f2), this.cross);
            }

            @Override
            public <R1, R2> Iterative4Args2<T1, T2, T3, T4, R1, R2> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative4Args2Impl<>(this.left, this.right.inlineMap(f1, f2), this.cross);
            }

            @Override
            public <R1> Iterative4Args2<T1, T2, T3, T4, R1, A2> inlineMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative4Args2Impl<>(this.left, this.right.inlineMap1(f1), this.cross);
            }

            @Override
            public <R2> Iterative4Args2<T1, T2, T3, T4, A1, R2> inlineMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative4Args2Impl<>(this.left, this.right.inlineMap2(f2), this.cross);
            }

            @Override
            public Iterative4Args2<T1, T2, T3, T4, A1, A2> filter(Pr1<? super A1> p1, Pr1<? super A2> p2) {
                return new Iterative4Args2Impl<>(this.left, this.right.filter(p1, p2), this.cross);
            }

            @Override
            public Iterative4Args2<T1, T2, T3, T4, A1, A2> filter1(Pr1<? super A1> p1) {
                return new Iterative4Args2Impl<>(this.left, this.right.filter1(p1), this.cross);
            }

            @Override
            public Iterative4Args2<T1, T2, T3, T4, A1, A2> filter2(Pr1<? super A2> p2) {
                return new Iterative4Args2Impl<>(this.left, this.right.filter2(p2), this.cross);
            }

        }

    }

    public static interface Iterative4Args1<T1, T2, T3, T4, A1> extends Iterative4Args<T1, T2, T3, T4> {

        public <R1, R2, R3, R4> Iterative4<R1, R2, R3, R4> mapping(Fn2<? super T1, ? super A1, ? extends R1> f1, Fn2<? super T2, ? super A1, ? extends R2> f2, Fn2<? super T3, ? super A1, ? extends R3> f3, Fn2<? super T4, ? super A1, ? extends R4> f4);

        public <R1, R2, R3, R4> Iterative4<R1, R2, R3, R4> inverseMapping(Fn2<? super A1, ? super T1, ? extends R1> f1, Fn2<? super A1, ? super T2, ? extends R2> f2, Fn2<? super A1, ? super T3, ? extends R3> f3, Fn2<? super A1, ? super T4, ? extends R4> f4);

        public <R4> Iterative4<T1, T2, T3, R4> mappingRt1(Fn2<? super T4, ? super A1, ? extends R4> f1);

        public <R1> Iterative4<R1, T2, T3, T4> mappingLt1(Fn2<? super T1, ? super A1, ? extends R1> f1);

        public <R3, R4> Iterative4<T1, T2, R3, R4> mappingRt2(Fn2<? super T3, ? super A1, ? extends R3> f1, Fn2<? super T4, ? super A1, ? extends R4> f2);

        public <R1, R2> Iterative4<R1, R2, T3, T4> mappingLt2(Fn2<? super T1, ? super A1, ? extends R1> f1, Fn2<? super T2, ? super A1, ? extends R2> f2);

        public <R2, R3, R4> Iterative4<T1, R2, R3, R4> mappingRt3(Fn2<? super T2, ? super A1, ? extends R2> f1, Fn2<? super T3, ? super A1, ? extends R3> f2, Fn2<? super T4, ? super A1, ? extends R4> f3);

        public <R1, R2, R3> Iterative4<R1, R2, R3, T4> mappingLt3(Fn2<? super T1, ? super A1, ? extends R1> f1, Fn2<? super T2, ? super A1, ? extends R2> f2, Fn2<? super T3, ? super A1, ? extends R3> f3);

        public <R1> Iterative4Args1<T1, T2, T3, T4, R1> map(Fn1<? super A1, ? extends R1> f1);

        public <R1> Iterative4Args1<T1, T2, T3, T4, R1> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1);

        public <R1> Iterative4Args1<T1, T2, T3, T4, R1> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1);

        public Iterative4Args1<T1, T2, T3, T4, A1> filter(Pr1<? super A1> p1);

        public static class Iterative4Args1Impl<T1, T2, T3, T4, A1> implements Iterative4Args1<T1, T2, T3, T4, A1> {

            final boolean cross;
            final Iterative4<T1, T2, T3, T4> left;
            final Iterative1<A1> right;

            Iterative4Args1Impl(Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4> left, Iterative1<? extends A1> right, boolean cross) {
                Objects.requireNonNull(left, "left is null");
                Objects.requireNonNull(right, "right is null");
                this.cross = cross;
                this.left = Iterative.narrow(left);
                this.right = Iterative.narrow(right);
            }

            @Override
            public <R1, R2, R3, R4> Iterative4<R1, R2, R3, R4> mapping(Fn2<? super T1, ? super A1, ? extends R1> f1, Fn2<? super T2, ? super A1, ? extends R2> f2, Fn2<? super T3, ? super A1, ? extends R3> f3, Fn2<? super T4, ? super A1, ? extends R4> f4) {

                Objects.requireNonNull(f1, "f1 is null");
                Objects.requireNonNull(f2, "f2 is null");
                Objects.requireNonNull(f3, "f3 is null");
                Objects.requireNonNull(f4, "f4 is null");

                final Stream<Tuple1<A1>> stream = this.right.toStream();

                final Iterative1<T1> i1 = this.left.create(this.left.iterableStream1());
                final Iterative1<T2> i2 = this.left.create(this.left.iterableStream2());
                final Iterative1<T3> i3 = this.left.create(this.left.iterableStream3());
                final Iterative1<T4> i4 = this.left.create(this.left.iterableStream4());

                final Iterative1<R1> iter1 = this.left.splitLt1().create((this.cross ? i1.pushBackCrossOf(stream) : i1.pushBackInlineOf(stream)).reduce((t1, tuple) -> f1.apply(t1, tuple._1())).iterableStream1());
                final Iterative2<R1, R2> iter2 = this.left.splitLt2().create(iter1, (this.cross ? i2.pushBackCrossOf(stream) : i2.pushBackInlineOf(stream)).reduce((t2, tuple) -> f2.apply(t2, tuple._1())).iterableStream1());
                final Iterative3<R1, R2, R3> iter3 = this.left.splitLt3().create(iter2, (this.cross ? i3.pushBackCrossOf(stream) : i3.pushBackInlineOf(stream)).reduce((t3, tuple) -> f3.apply(t3, tuple._1())).iterableStream1());

                return this.left.create(iter3, (this.cross ? i4.pushBackCrossOf(stream) : i4.pushBackInlineOf(stream)).reduce((t4, tuple) -> f4.apply(t4, tuple._1())).iterableStream1());

            }

            @Override
            public <R1, R2, R3, R4> Iterative4<R1, R2, R3, R4> inverseMapping(Fn2<? super A1, ? super T1, ? extends R1> f1, Fn2<? super A1, ? super T2, ? extends R2> f2, Fn2<? super A1, ? super T3, ? extends R3> f3, Fn2<? super A1, ? super T4, ? extends R4> f4) {
                return this.mapping((t1, a1) -> f1.apply(a1, t1), (t2, a1) -> f2.apply(a1, t2), (t3, a1) -> f3.apply(a1, t3), (t4, a1) -> f4.apply(a1, t4));
            }

            @Override
            public <R4> Iterative4<T1, T2, T3, R4> mappingRt1(Fn2<? super T4, ? super A1, ? extends R4> f4) {
                return this.mapping(IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1, f4);
            }

            @Override
            public <R1> Iterative4<R1, T2, T3, T4> mappingLt1(Fn2<? super T1, ? super A1, ? extends R1> f1) {
                return this.mapping(f1, IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1);
            }

            @Override
            public <R3, R4> Iterative4<T1, T2, R3, R4> mappingRt2(Fn2<? super T3, ? super A1, ? extends R3> f3, Fn2<? super T4, ? super A1, ? extends R4> f4) {
                return this.mapping(IterativeInternals::get1, IterativeInternals::get1, f3, f4);
            }

            @Override
            public <R1, R2> Iterative4<R1, R2, T3, T4> mappingLt2(Fn2<? super T1, ? super A1, ? extends R1> f1, Fn2<? super T2, ? super A1, ? extends R2> f2) {
                return this.mapping(f1, f2, IterativeInternals::get1, IterativeInternals::get1);
            }

            @Override
            public <R2, R3, R4> Iterative4<T1, R2, R3, R4> mappingRt3(Fn2<? super T2, ? super A1, ? extends R2> f2, Fn2<? super T3, ? super A1, ? extends R3> f3, Fn2<? super T4, ? super A1, ? extends R4> f4) {
                return this.mapping(IterativeInternals::get1, f2, f3, f4);
            }

            @Override
            public <R1, R2, R3> Iterative4<R1, R2, R3, T4> mappingLt3(Fn2<? super T1, ? super A1, ? extends R1> f1, Fn2<? super T2, ? super A1, ? extends R2> f2, Fn2<? super T3, ? super A1, ? extends R3> f3) {
                return this.mapping(f1, f2, f3, IterativeInternals::get1);
            }

            @Override
            public <R1> Iterative4Args1<T1, T2, T3, T4, R1> map(Fn1<? super A1, ? extends R1> f1) {
                return new Iterative4Args1Impl<>(this.left, this.right.map(f1), this.cross);
            }

            @Override
            public <R1> Iterative4Args1<T1, T2, T3, T4, R1> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative4Args1Impl<>(this.left, this.right.flatMap(f1), this.cross);
            }

            @Override
            public <R1> Iterative4Args1<T1, T2, T3, T4, R1> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative4Args1Impl<>(this.left, this.right.inlineMap(f1), this.cross);
            }

            @Override
            public Iterative4Args1<T1, T2, T3, T4, A1> filter(Pr1<? super A1> p1) {
                return new Iterative4Args1Impl<>(this.left, this.right.filter(p1), this.cross);
            }

        }

    }

}

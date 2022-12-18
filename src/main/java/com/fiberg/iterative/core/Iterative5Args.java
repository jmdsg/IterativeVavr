package com.fiberg.iterative.core;

import com.fiberg.iterative.core.Iterative1;
import com.fiberg.iterative.core.Iterative2;
import com.fiberg.iterative.core.Iterative3;
import com.fiberg.iterative.core.Iterative4;
import com.fiberg.iterative.core.Iterative5;
import com.fiberg.iterative.core.IterativeInternals;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fn2;
import com.fiberg.iterative.function.Fn3;
import com.fiberg.iterative.function.Fn4;
import com.fiberg.iterative.function.Pr1;
import io.vavr.Tuple1;
import io.vavr.Tuple2;
import io.vavr.Tuple3;
import io.vavr.collection.Stream;
import java.io.Serializable;
import java.util.Objects;

public interface Iterative5Args<T1, T2, T3, T4, T5> {

    public static interface Iterative5Args3<T1, T2, T3, T4, T5, A1, A2, A3> extends Iterative5Args<T1, T2, T3, T4, T5> {

        public <R1, R2, R3, R4, R5> Iterative5<R1, R2, R3, R4, R5> mapping(Fn4<? super T1, ? super A1, ? super A2, ? super A3, ? extends R1> var1, Fn4<? super T2, ? super A1, ? super A2, ? super A3, ? extends R2> var2, Fn4<? super T3, ? super A1, ? super A2, ? super A3, ? extends R3> var3, Fn4<? super T4, ? super A1, ? super A2, ? super A3, ? extends R4> var4, Fn4<? super T5, ? super A1, ? super A2, ? super A3, ? extends R5> var5);

        public <R1, R2, R3, R4, R5> Iterative5<R1, R2, R3, R4, R5> inverseMapping(Fn4<? super A1, ? super A2, ? super A3, ? super T1, ? extends R1> var1, Fn4<? super A1, ? super A2, ? super A3, ? super T2, ? extends R2> var2, Fn4<? super A1, ? super A2, ? super A3, ? super T3, ? extends R3> var3, Fn4<? super A1, ? super A2, ? super A3, ? super T4, ? extends R4> var4, Fn4<? super A1, ? super A2, ? super A3, ? super T5, ? extends R5> var5);

        public <R5> Iterative5<T1, T2, T3, T4, R5> mappingRt1(Fn4<? super T5, ? super A1, ? super A2, ? super A3, ? extends R5> var1);

        public <R1> Iterative5<R1, T2, T3, T4, T5> mappingLt1(Fn4<? super T1, ? super A1, ? super A2, ? super A3, ? extends R1> var1);

        public <R4, R5> Iterative5<T1, T2, T3, R4, R5> mappingRt2(Fn4<? super T4, ? super A1, ? super A2, ? super A3, ? extends R4> var1, Fn4<? super T5, ? super A1, ? super A2, ? super A3, ? extends R5> var2);

        public <R1, R2> Iterative5<R1, R2, T3, T4, T5> mappingLt2(Fn4<? super T1, ? super A1, ? super A2, ? super A3, ? extends R1> var1, Fn4<? super T2, ? super A1, ? super A2, ? super A3, ? extends R2> var2);

        public <R3, R4, R5> Iterative5<T1, T2, R3, R4, R5> mappingRt3(Fn4<? super T3, ? super A1, ? super A2, ? super A3, ? extends R3> var1, Fn4<? super T4, ? super A1, ? super A2, ? super A3, ? extends R4> var2, Fn4<? super T5, ? super A1, ? super A2, ? super A3, ? extends R5> var3);

        public <R1, R2, R3> Iterative5<R1, R2, R3, T4, T5> mappingLt3(Fn4<? super T1, ? super A1, ? super A2, ? super A3, ? extends R1> var1, Fn4<? super T2, ? super A1, ? super A2, ? super A3, ? extends R2> var2, Fn4<? super T3, ? super A1, ? super A2, ? super A3, ? extends R3> var3);

        public <R2, R3, R4, R5> Iterative5<T1, R2, R3, R4, R5> mappingRt4(Fn4<? super T2, ? super A1, ? super A2, ? super A3, ? extends R2> var1, Fn4<? super T3, ? super A1, ? super A2, ? super A3, ? extends R3> var2, Fn4<? super T4, ? super A1, ? super A2, ? super A3, ? extends R4> var3, Fn4<? super T5, ? super A1, ? super A2, ? super A3, ? extends R5> var4);

        public <R1, R2, R3, R4> Iterative5<R1, R2, R3, R4, T5> mappingLt4(Fn4<? super T1, ? super A1, ? super A2, ? super A3, ? extends R1> var1, Fn4<? super T2, ? super A1, ? super A2, ? super A3, ? extends R2> var2, Fn4<? super T3, ? super A1, ? super A2, ? super A3, ? extends R3> var3, Fn4<? super T4, ? super A1, ? super A2, ? super A3, ? extends R4> var4);

        public <R1, R2, R3> Iterative5Args3<T1, T2, T3, T4, T5, R1, R2, R3> map(Fn1<? super A1, ? extends R1> var1, Fn1<? super A2, ? extends R2> var2, Fn1<? super A3, ? extends R3> var3);

        public <R1> Iterative5Args3<T1, T2, T3, T4, T5, R1, A2, A3> map1(Fn1<? super A1, ? extends R1> var1);

        public <R2> Iterative5Args3<T1, T2, T3, T4, T5, A1, R2, A3> map2(Fn1<? super A2, ? extends R2> var1);

        public <R3> Iterative5Args3<T1, T2, T3, T4, T5, A1, A2, R3> map3(Fn1<? super A3, ? extends R3> var1);

        public <R1, R2, R3> Iterative5Args3<T1, T2, T3, T4, T5, R1, R2, R3> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> var1, Fn1<? super A2, ? extends Iterable<? extends R2>> var2, Fn1<? super A3, ? extends Iterable<? extends R3>> var3);

        public <R1> Iterative5Args3<T1, T2, T3, T4, T5, R1, A2, A3> flatMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> var1);

        public <R2> Iterative5Args3<T1, T2, T3, T4, T5, A1, R2, A3> flatMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> var1);

        public <R3> Iterative5Args3<T1, T2, T3, T4, T5, A1, A2, R3> flatMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> var1);

        public <R1, R2, R3> Iterative5Args3<T1, T2, T3, T4, T5, R1, R2, R3> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> var1, Fn1<? super A2, ? extends Iterable<? extends R2>> var2, Fn1<? super A3, ? extends Iterable<? extends R3>> var3);

        public <R1> Iterative5Args3<T1, T2, T3, T4, T5, R1, A2, A3> inlineMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> var1);

        public <R2> Iterative5Args3<T1, T2, T3, T4, T5, A1, R2, A3> inlineMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> var1);

        public <R3> Iterative5Args3<T1, T2, T3, T4, T5, A1, A2, R3> inlineMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> var1);

        public Iterative5Args3<T1, T2, T3, T4, T5, A1, A2, A3> filter(Pr1<? super A1> var1, Pr1<? super A2> var2, Pr1<? super A3> var3);

        public Iterative5Args3<T1, T2, T3, T4, T5, A1, A2, A3> filter1(Pr1<? super A1> var1);

        public Iterative5Args3<T1, T2, T3, T4, T5, A1, A2, A3> filter2(Pr1<? super A2> var1);

        public Iterative5Args3<T1, T2, T3, T4, T5, A1, A2, A3> filter3(Pr1<? super A3> var1);

        public static class Iterative5Args3Impl<T1, T2, T3, T4, T5, A1, A2, A3> implements Iterative5Args3<T1, T2, T3, T4, T5, A1, A2, A3> {

            Iterative5<T1, T2, T3, T4, T5> left;
            Iterative3<A1, A2, A3> right;
            boolean cross;

            Iterative5Args3Impl(Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> left, Iterative3<? extends A1, ? extends A2, ? extends A3> right, boolean cross) {
                Objects.requireNonNull(left, "left is null");
                Objects.requireNonNull(right, "right is null");
                this.left = left;
                this.right = right;
                this.cross = cross;
            }

            @Override
            public <R1, R2, R3, R4, R5> Iterative5<R1, R2, R3, R4, R5> mapping(Fn4<? super T1, ? super A1, ? super A2, ? super A3, ? extends R1> f1, Fn4<? super T2, ? super A1, ? super A2, ? super A3, ? extends R2> f2, Fn4<? super T3, ? super A1, ? super A2, ? super A3, ? extends R3> f3, Fn4<? super T4, ? super A1, ? super A2, ? super A3, ? extends R4> f4, Fn4<? super T5, ? super A1, ? super A2, ? super A3, ? extends R5> f5) {
                Objects.requireNonNull(f1, "f1 is null");
                Objects.requireNonNull(f2, "f2 is null");
                Objects.requireNonNull(f3, "f3 is null");
                Objects.requireNonNull(f4, "f4 is null");
                Objects.requireNonNull(f5, "f5 is null");
                Stream<Tuple3<A1, A2, A3>> stream = this.right.toStream();
                Iterative1<T1> i1 = this.left.create(this.left.iterableStream1());
                Iterative1<T2> i2 = this.left.create(this.left.iterableStream2());
                Iterative1<T3> i3 = this.left.create(this.left.iterableStream3());
                Iterative1<T4> i4 = this.left.create(this.left.iterableStream4());
                Iterative1<T5> i5 = this.left.create(this.left.iterableStream5());
                Iterative1 iter1 = this.left.splitLt1().create((this.cross ? i1.pushBackCrossOf(stream) : i1.pushBackInlineOf(stream)).reduce((Fn2 & Serializable)(t1, tuple) -> f1.apply(t1, tuple._1(), tuple._2(), tuple._3())).iterableStream1());
                Iterative2 iter2 = this.left.splitLt2().create(iter1, (this.cross ? i2.pushBackCrossOf(stream) : i2.pushBackInlineOf(stream)).reduce((Fn2 & Serializable)(t2, tuple) -> f2.apply(t2, tuple._1(), tuple._2(), tuple._3())).iterableStream1());
                Iterative3 iter3 = this.left.splitLt3().create(iter2, (this.cross ? i3.pushBackCrossOf(stream) : i3.pushBackInlineOf(stream)).reduce((Fn2 & Serializable)(t3, tuple) -> f3.apply(t3, tuple._1(), tuple._2(), tuple._3())).iterableStream1());
                Iterative4 iter4 = this.left.splitLt4().create(iter3, (this.cross ? i4.pushBackCrossOf(stream) : i4.pushBackInlineOf(stream)).reduce((Fn2 & Serializable)(t4, tuple) -> f4.apply(t4, tuple._1(), tuple._2(), tuple._3())).iterableStream1());
                return this.left.create(iter4, (this.cross ? i5.pushBackCrossOf(stream) : i5.pushBackInlineOf(stream)).reduce((Fn2 & Serializable)(t5, tuple) -> f5.apply(t5, tuple._1(), tuple._2(), tuple._3())).iterableStream1());
            }

            @Override
            public <R1, R2, R3, R4, R5> Iterative5<R1, R2, R3, R4, R5> inverseMapping(Fn4<? super A1, ? super A2, ? super A3, ? super T1, ? extends R1> f1, Fn4<? super A1, ? super A2, ? super A3, ? super T2, ? extends R2> f2, Fn4<? super A1, ? super A2, ? super A3, ? super T3, ? extends R3> f3, Fn4<? super A1, ? super A2, ? super A3, ? super T4, ? extends R4> f4, Fn4<? super A1, ? super A2, ? super A3, ? super T5, ? extends R5> f5) {
                return this.mapping((Fn4 & Serializable)(t1, a1, a2, a3) -> f1.apply(a1, a2, a3, t1), (Fn4 & Serializable)(t2, a1, a2, a3) -> f2.apply(a1, a2, a3, t2), (Fn4 & Serializable)(t3, a1, a2, a3) -> f3.apply(a1, a2, a3, t3), (Fn4 & Serializable)(t4, a1, a2, a3) -> f4.apply(a1, a2, a3, t4), (Fn4 & Serializable)(t5, a1, a2, a3) -> f5.apply(a1, a2, a3, t5));
            }

            @Override
            public <R5> Iterative5<T1, T2, T3, T4, R5> mappingRt1(Fn4<? super T5, ? super A1, ? super A2, ? super A3, ? extends R5> f5) {
                return this.mapping(IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1, f5);
            }

            @Override
            public <R1> Iterative5<R1, T2, T3, T4, T5> mappingLt1(Fn4<? super T1, ? super A1, ? super A2, ? super A3, ? extends R1> f1) {
                return this.mapping(f1, IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1);
            }

            @Override
            public <R4, R5> Iterative5<T1, T2, T3, R4, R5> mappingRt2(Fn4<? super T4, ? super A1, ? super A2, ? super A3, ? extends R4> f4, Fn4<? super T5, ? super A1, ? super A2, ? super A3, ? extends R5> f5) {
                return this.mapping(IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1, f4, f5);
            }

            @Override
            public <R1, R2> Iterative5<R1, R2, T3, T4, T5> mappingLt2(Fn4<? super T1, ? super A1, ? super A2, ? super A3, ? extends R1> f1, Fn4<? super T2, ? super A1, ? super A2, ? super A3, ? extends R2> f2) {
                return this.mapping(f1, f2, IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1);
            }

            @Override
            public <R3, R4, R5> Iterative5<T1, T2, R3, R4, R5> mappingRt3(Fn4<? super T3, ? super A1, ? super A2, ? super A3, ? extends R3> f3, Fn4<? super T4, ? super A1, ? super A2, ? super A3, ? extends R4> f4, Fn4<? super T5, ? super A1, ? super A2, ? super A3, ? extends R5> f5) {
                return this.mapping(IterativeInternals::get1, IterativeInternals::get1, f3, f4, f5);
            }

            @Override
            public <R1, R2, R3> Iterative5<R1, R2, R3, T4, T5> mappingLt3(Fn4<? super T1, ? super A1, ? super A2, ? super A3, ? extends R1> f1, Fn4<? super T2, ? super A1, ? super A2, ? super A3, ? extends R2> f2, Fn4<? super T3, ? super A1, ? super A2, ? super A3, ? extends R3> f3) {
                return this.mapping(f1, f2, f3, IterativeInternals::get1, IterativeInternals::get1);
            }

            @Override
            public <R2, R3, R4, R5> Iterative5<T1, R2, R3, R4, R5> mappingRt4(Fn4<? super T2, ? super A1, ? super A2, ? super A3, ? extends R2> f2, Fn4<? super T3, ? super A1, ? super A2, ? super A3, ? extends R3> f3, Fn4<? super T4, ? super A1, ? super A2, ? super A3, ? extends R4> f4, Fn4<? super T5, ? super A1, ? super A2, ? super A3, ? extends R5> f5) {
                return this.mapping(IterativeInternals::get1, f2, f3, f4, f5);
            }

            @Override
            public <R1, R2, R3, R4> Iterative5<R1, R2, R3, R4, T5> mappingLt4(Fn4<? super T1, ? super A1, ? super A2, ? super A3, ? extends R1> f1, Fn4<? super T2, ? super A1, ? super A2, ? super A3, ? extends R2> f2, Fn4<? super T3, ? super A1, ? super A2, ? super A3, ? extends R3> f3, Fn4<? super T4, ? super A1, ? super A2, ? super A3, ? extends R4> f4) {
                return this.mapping(f1, f2, f3, f4, IterativeInternals::get1);
            }

            @Override
            public <R1, R2, R3> Iterative5Args3<T1, T2, T3, T4, T5, R1, R2, R3> map(Fn1<? super A1, ? extends R1> f1, Fn1<? super A2, ? extends R2> f2, Fn1<? super A3, ? extends R3> f3) {
                return new Iterative5Args3Impl<T1, T2, T3, T4, T5, R1, R2, R3>(this.left, this.right.map(f1, f2, f3), this.cross);
            }

            @Override
            public <R1> Iterative5Args3<T1, T2, T3, T4, T5, R1, A2, A3> map1(Fn1<? super A1, ? extends R1> f1) {
                return new Iterative5Args3Impl<T1, T2, T3, T4, T5, R1, A2, A3>(this.left, this.right.map1(f1), this.cross);
            }

            @Override
            public <R2> Iterative5Args3<T1, T2, T3, T4, T5, A1, R2, A3> map2(Fn1<? super A2, ? extends R2> f2) {
                return new Iterative5Args3Impl<T1, T2, T3, T4, T5, A1, R2, A3>(this.left, this.right.map2(f2), this.cross);
            }

            @Override
            public <R3> Iterative5Args3<T1, T2, T3, T4, T5, A1, A2, R3> map3(Fn1<? super A3, ? extends R3> f3) {
                return new Iterative5Args3Impl<T1, T2, T3, T4, T5, A1, A2, R3>(this.left, this.right.map3(f3), this.cross);
            }

            @Override
            public <R1, R2, R3> Iterative5Args3<T1, T2, T3, T4, T5, R1, R2, R3> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> f2, Fn1<? super A3, ? extends Iterable<? extends R3>> f3) {
                return new Iterative5Args3Impl(this.left, this.right.flatMap(f1, f2, f3), this.cross);
            }

            @Override
            public <R1> Iterative5Args3<T1, T2, T3, T4, T5, R1, A2, A3> flatMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative5Args3Impl(this.left, this.right.flatMap1(f1), this.cross);
            }

            @Override
            public <R2> Iterative5Args3<T1, T2, T3, T4, T5, A1, R2, A3> flatMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative5Args3Impl(this.left, this.right.flatMap2(f2), this.cross);
            }

            @Override
            public <R3> Iterative5Args3<T1, T2, T3, T4, T5, A1, A2, R3> flatMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> f3) {
                return new Iterative5Args3Impl(this.left, this.right.flatMap3(f3), this.cross);
            }

            @Override
            public <R1, R2, R3> Iterative5Args3<T1, T2, T3, T4, T5, R1, R2, R3> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> f2, Fn1<? super A3, ? extends Iterable<? extends R3>> f3) {
                return new Iterative5Args3Impl(this.left, this.right.inlineMap(f1, f2, f3), this.cross);
            }

            @Override
            public <R1> Iterative5Args3<T1, T2, T3, T4, T5, R1, A2, A3> inlineMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative5Args3Impl(this.left, this.right.inlineMap1(f1), this.cross);
            }

            @Override
            public <R2> Iterative5Args3<T1, T2, T3, T4, T5, A1, R2, A3> inlineMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative5Args3Impl(this.left, this.right.inlineMap2(f2), this.cross);
            }

            @Override
            public <R3> Iterative5Args3<T1, T2, T3, T4, T5, A1, A2, R3> inlineMap3(Fn1<? super A3, ? extends Iterable<? extends R3>> f3) {
                return new Iterative5Args3Impl(this.left, this.right.inlineMap3(f3), this.cross);
            }

            @Override
            public Iterative5Args3<T1, T2, T3, T4, T5, A1, A2, A3> filter(Pr1<? super A1> p1, Pr1<? super A2> p2, Pr1<? super A3> p3) {
                return new Iterative5Args3Impl<T1, T2, T3, T4, T5, A1, A2, A3>(this.left, this.right.filter(p1, p2, p3), this.cross);
            }

            @Override
            public Iterative5Args3<T1, T2, T3, T4, T5, A1, A2, A3> filter1(Pr1<? super A1> p1) {
                return new Iterative5Args3Impl<T1, T2, T3, T4, T5, A1, A2, A3>(this.left, this.right.filter1(p1), this.cross);
            }

            @Override
            public Iterative5Args3<T1, T2, T3, T4, T5, A1, A2, A3> filter2(Pr1<? super A2> p2) {
                return new Iterative5Args3Impl<T1, T2, T3, T4, T5, A1, A2, A3>(this.left, this.right.filter2(p2), this.cross);
            }

            @Override
            public Iterative5Args3<T1, T2, T3, T4, T5, A1, A2, A3> filter3(Pr1<? super A3> p3) {
                return new Iterative5Args3Impl<T1, T2, T3, T4, T5, A1, A2, A3>(this.left, this.right.filter3(p3), this.cross);
            }

        }

    }

    public static interface Iterative5Args2<T1, T2, T3, T4, T5, A1, A2> extends Iterative5Args<T1, T2, T3, T4, T5> {

        public <R1, R2, R3, R4, R5> Iterative5<R1, R2, R3, R4, R5> mapping(Fn3<? super T1, ? super A1, ? super A2, ? extends R1> var1, Fn3<? super T2, ? super A1, ? super A2, ? extends R2> var2, Fn3<? super T3, ? super A1, ? super A2, ? extends R3> var3, Fn3<? super T4, ? super A1, ? super A2, ? extends R4> var4, Fn3<? super T5, ? super A1, ? super A2, ? extends R5> var5);

        public <R1, R2, R3, R4, R5> Iterative5<R1, R2, R3, R4, R5> inverseMapping(Fn3<? super A1, ? super A2, ? super T1, ? extends R1> var1, Fn3<? super A1, ? super A2, ? super T2, ? extends R2> var2, Fn3<? super A1, ? super A2, ? super T3, ? extends R3> var3, Fn3<? super A1, ? super A2, ? super T4, ? extends R4> var4, Fn3<? super A1, ? super A2, ? super T5, ? extends R5> var5);

        public <R5> Iterative5<T1, T2, T3, T4, R5> mappingRt1(Fn3<? super T5, ? super A1, ? super A2, ? extends R5> var1);

        public <R1> Iterative5<R1, T2, T3, T4, T5> mappingLt1(Fn3<? super T1, ? super A1, ? super A2, ? extends R1> var1);

        public <R4, R5> Iterative5<T1, T2, T3, R4, R5> mappingRt2(Fn3<? super T4, ? super A1, ? super A2, ? extends R4> var1, Fn3<? super T5, ? super A1, ? super A2, ? extends R5> var2);

        public <R1, R2> Iterative5<R1, R2, T3, T4, T5> mappingLt2(Fn3<? super T1, ? super A1, ? super A2, ? extends R1> var1, Fn3<? super T2, ? super A1, ? super A2, ? extends R2> var2);

        public <R3, R4, R5> Iterative5<T1, T2, R3, R4, R5> mappingRt3(Fn3<? super T3, ? super A1, ? super A2, ? extends R3> var1, Fn3<? super T4, ? super A1, ? super A2, ? extends R4> var2, Fn3<? super T5, ? super A1, ? super A2, ? extends R5> var3);

        public <R1, R2, R3> Iterative5<R1, R2, R3, T4, T5> mappingLt3(Fn3<? super T1, ? super A1, ? super A2, ? extends R1> var1, Fn3<? super T2, ? super A1, ? super A2, ? extends R2> var2, Fn3<? super T3, ? super A1, ? super A2, ? extends R3> var3);

        public <R2, R3, R4, R5> Iterative5<T1, R2, R3, R4, R5> mappingRt4(Fn3<? super T2, ? super A1, ? super A2, ? extends R2> var1, Fn3<? super T3, ? super A1, ? super A2, ? extends R3> var2, Fn3<? super T4, ? super A1, ? super A2, ? extends R4> var3, Fn3<? super T5, ? super A1, ? super A2, ? extends R5> var4);

        public <R1, R2, R3, R4> Iterative5<R1, R2, R3, R4, T5> mappingLt4(Fn3<? super T1, ? super A1, ? super A2, ? extends R1> var1, Fn3<? super T2, ? super A1, ? super A2, ? extends R2> var2, Fn3<? super T3, ? super A1, ? super A2, ? extends R3> var3, Fn3<? super T4, ? super A1, ? super A2, ? extends R4> var4);

        public <R1, R2> Iterative5Args2<T1, T2, T3, T4, T5, R1, R2> map(Fn1<? super A1, ? extends R1> var1, Fn1<? super A2, ? extends R2> var2);

        public <R1> Iterative5Args2<T1, T2, T3, T4, T5, R1, A2> map1(Fn1<? super A1, ? extends R1> var1);

        public <R2> Iterative5Args2<T1, T2, T3, T4, T5, A1, R2> map2(Fn1<? super A2, ? extends R2> var1);

        public <R1, R2> Iterative5Args2<T1, T2, T3, T4, T5, R1, R2> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> var1, Fn1<? super A2, ? extends Iterable<? extends R2>> var2);

        public <R1> Iterative5Args2<T1, T2, T3, T4, T5, R1, A2> flatMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> var1);

        public <R2> Iterative5Args2<T1, T2, T3, T4, T5, A1, R2> flatMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> var1);

        public <R1, R2> Iterative5Args2<T1, T2, T3, T4, T5, R1, R2> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> var1, Fn1<? super A2, ? extends Iterable<? extends R2>> var2);

        public <R1> Iterative5Args2<T1, T2, T3, T4, T5, R1, A2> inlineMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> var1);

        public <R2> Iterative5Args2<T1, T2, T3, T4, T5, A1, R2> inlineMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> var1);

        public Iterative5Args2<T1, T2, T3, T4, T5, A1, A2> filter(Pr1<? super A1> var1, Pr1<? super A2> var2);

        public Iterative5Args2<T1, T2, T3, T4, T5, A1, A2> filter1(Pr1<? super A1> var1);

        public Iterative5Args2<T1, T2, T3, T4, T5, A1, A2> filter2(Pr1<? super A2> var1);

        public static class Iterative5Args2Impl<T1, T2, T3, T4, T5, A1, A2> implements Iterative5Args2<T1, T2, T3, T4, T5, A1, A2> {

            Iterative5<T1, T2, T3, T4, T5> left;
            Iterative2<A1, A2> right;
            boolean cross;

            Iterative5Args2Impl(Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> left, Iterative2<? extends A1, ? extends A2> right, boolean cross) {
                Objects.requireNonNull(left, "left is null");
                Objects.requireNonNull(right, "right is null");
                this.left = left;
                this.right = right;
                this.cross = cross;
            }

            @Override
            public <R1, R2, R3, R4, R5> Iterative5<R1, R2, R3, R4, R5> mapping(Fn3<? super T1, ? super A1, ? super A2, ? extends R1> f1, Fn3<? super T2, ? super A1, ? super A2, ? extends R2> f2, Fn3<? super T3, ? super A1, ? super A2, ? extends R3> f3, Fn3<? super T4, ? super A1, ? super A2, ? extends R4> f4, Fn3<? super T5, ? super A1, ? super A2, ? extends R5> f5) {
                Objects.requireNonNull(f1, "f1 is null");
                Objects.requireNonNull(f2, "f2 is null");
                Objects.requireNonNull(f3, "f3 is null");
                Objects.requireNonNull(f4, "f4 is null");
                Objects.requireNonNull(f5, "f5 is null");
                Stream<Tuple2<A1, A2>> stream = this.right.toStream();
                Iterative1<T1> i1 = this.left.create(this.left.iterableStream1());
                Iterative1<T2> i2 = this.left.create(this.left.iterableStream2());
                Iterative1<T3> i3 = this.left.create(this.left.iterableStream3());
                Iterative1<T4> i4 = this.left.create(this.left.iterableStream4());
                Iterative1<T5> i5 = this.left.create(this.left.iterableStream5());
                Iterative1 iter1 = this.left.splitLt1().create((this.cross ? i1.pushBackCrossOf(stream) : i1.pushBackInlineOf(stream)).reduce((Fn2 & Serializable)(t1, tuple) -> f1.apply(t1, tuple._1(), tuple._2())).iterableStream1());
                Iterative2 iter2 = this.left.splitLt2().create(iter1, (this.cross ? i2.pushBackCrossOf(stream) : i2.pushBackInlineOf(stream)).reduce((Fn2 & Serializable)(t2, tuple) -> f2.apply(t2, tuple._1(), tuple._2())).iterableStream1());
                Iterative3 iter3 = this.left.splitLt3().create(iter2, (this.cross ? i3.pushBackCrossOf(stream) : i3.pushBackInlineOf(stream)).reduce((Fn2 & Serializable)(t3, tuple) -> f3.apply(t3, tuple._1(), tuple._2())).iterableStream1());
                Iterative4 iter4 = this.left.splitLt4().create(iter3, (this.cross ? i4.pushBackCrossOf(stream) : i4.pushBackInlineOf(stream)).reduce((Fn2 & Serializable)(t4, tuple) -> f4.apply(t4, tuple._1(), tuple._2())).iterableStream1());
                return this.left.create(iter4, (this.cross ? i5.pushBackCrossOf(stream) : i5.pushBackInlineOf(stream)).reduce((Fn2 & Serializable)(t5, tuple) -> f5.apply(t5, tuple._1(), tuple._2())).iterableStream1());
            }

            @Override
            public <R1, R2, R3, R4, R5> Iterative5<R1, R2, R3, R4, R5> inverseMapping(Fn3<? super A1, ? super A2, ? super T1, ? extends R1> f1, Fn3<? super A1, ? super A2, ? super T2, ? extends R2> f2, Fn3<? super A1, ? super A2, ? super T3, ? extends R3> f3, Fn3<? super A1, ? super A2, ? super T4, ? extends R4> f4, Fn3<? super A1, ? super A2, ? super T5, ? extends R5> f5) {
                return this.mapping((Fn3 & Serializable)(t1, a1, a2) -> f1.apply(a1, a2, t1), (Fn3 & Serializable)(t2, a1, a2) -> f2.apply(a1, a2, t2), (Fn3 & Serializable)(t3, a1, a2) -> f3.apply(a1, a2, t3), (Fn3 & Serializable)(t4, a1, a2) -> f4.apply(a1, a2, t4), (Fn3 & Serializable)(t5, a1, a2) -> f5.apply(a1, a2, t5));
            }

            @Override
            public <R5> Iterative5<T1, T2, T3, T4, R5> mappingRt1(Fn3<? super T5, ? super A1, ? super A2, ? extends R5> f5) {
                return this.mapping(IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1, f5);
            }

            @Override
            public <R1> Iterative5<R1, T2, T3, T4, T5> mappingLt1(Fn3<? super T1, ? super A1, ? super A2, ? extends R1> f1) {
                return this.mapping(f1, IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1);
            }

            @Override
            public <R4, R5> Iterative5<T1, T2, T3, R4, R5> mappingRt2(Fn3<? super T4, ? super A1, ? super A2, ? extends R4> f4, Fn3<? super T5, ? super A1, ? super A2, ? extends R5> f5) {
                return this.mapping(IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1, f4, f5);
            }

            @Override
            public <R1, R2> Iterative5<R1, R2, T3, T4, T5> mappingLt2(Fn3<? super T1, ? super A1, ? super A2, ? extends R1> f1, Fn3<? super T2, ? super A1, ? super A2, ? extends R2> f2) {
                return this.mapping(f1, f2, IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1);
            }

            @Override
            public <R3, R4, R5> Iterative5<T1, T2, R3, R4, R5> mappingRt3(Fn3<? super T3, ? super A1, ? super A2, ? extends R3> f3, Fn3<? super T4, ? super A1, ? super A2, ? extends R4> f4, Fn3<? super T5, ? super A1, ? super A2, ? extends R5> f5) {
                return this.mapping(IterativeInternals::get1, IterativeInternals::get1, f3, f4, f5);
            }

            @Override
            public <R1, R2, R3> Iterative5<R1, R2, R3, T4, T5> mappingLt3(Fn3<? super T1, ? super A1, ? super A2, ? extends R1> f1, Fn3<? super T2, ? super A1, ? super A2, ? extends R2> f2, Fn3<? super T3, ? super A1, ? super A2, ? extends R3> f3) {
                return this.mapping(f1, f2, f3, IterativeInternals::get1, IterativeInternals::get1);
            }

            @Override
            public <R2, R3, R4, R5> Iterative5<T1, R2, R3, R4, R5> mappingRt4(Fn3<? super T2, ? super A1, ? super A2, ? extends R2> f2, Fn3<? super T3, ? super A1, ? super A2, ? extends R3> f3, Fn3<? super T4, ? super A1, ? super A2, ? extends R4> f4, Fn3<? super T5, ? super A1, ? super A2, ? extends R5> f5) {
                return this.mapping(IterativeInternals::get1, f2, f3, f4, f5);
            }

            @Override
            public <R1, R2, R3, R4> Iterative5<R1, R2, R3, R4, T5> mappingLt4(Fn3<? super T1, ? super A1, ? super A2, ? extends R1> f1, Fn3<? super T2, ? super A1, ? super A2, ? extends R2> f2, Fn3<? super T3, ? super A1, ? super A2, ? extends R3> f3, Fn3<? super T4, ? super A1, ? super A2, ? extends R4> f4) {
                return this.mapping(f1, f2, f3, f4, IterativeInternals::get1);
            }

            @Override
            public <R1, R2> Iterative5Args2<T1, T2, T3, T4, T5, R1, R2> map(Fn1<? super A1, ? extends R1> f1, Fn1<? super A2, ? extends R2> f2) {
                return new Iterative5Args2Impl<T1, T2, T3, T4, T5, R1, R2>(this.left, this.right.map(f1, f2), this.cross);
            }

            @Override
            public <R1> Iterative5Args2<T1, T2, T3, T4, T5, R1, A2> map1(Fn1<? super A1, ? extends R1> f1) {
                return new Iterative5Args2Impl<T1, T2, T3, T4, T5, R1, A2>(this.left, this.right.map1(f1), this.cross);
            }

            @Override
            public <R2> Iterative5Args2<T1, T2, T3, T4, T5, A1, R2> map2(Fn1<? super A2, ? extends R2> f2) {
                return new Iterative5Args2Impl<T1, T2, T3, T4, T5, A1, R2>(this.left, this.right.map2(f2), this.cross);
            }

            @Override
            public <R1, R2> Iterative5Args2<T1, T2, T3, T4, T5, R1, R2> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative5Args2Impl(this.left, this.right.flatMap(f1, f2), this.cross);
            }

            @Override
            public <R1> Iterative5Args2<T1, T2, T3, T4, T5, R1, A2> flatMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative5Args2Impl(this.left, this.right.flatMap1(f1), this.cross);
            }

            @Override
            public <R2> Iterative5Args2<T1, T2, T3, T4, T5, A1, R2> flatMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative5Args2Impl(this.left, this.right.flatMap2(f2), this.cross);
            }

            @Override
            public <R1, R2> Iterative5Args2<T1, T2, T3, T4, T5, R1, R2> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1, Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative5Args2Impl(this.left, this.right.inlineMap(f1, f2), this.cross);
            }

            @Override
            public <R1> Iterative5Args2<T1, T2, T3, T4, T5, R1, A2> inlineMap1(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative5Args2Impl(this.left, this.right.inlineMap1(f1), this.cross);
            }

            @Override
            public <R2> Iterative5Args2<T1, T2, T3, T4, T5, A1, R2> inlineMap2(Fn1<? super A2, ? extends Iterable<? extends R2>> f2) {
                return new Iterative5Args2Impl(this.left, this.right.inlineMap2(f2), this.cross);
            }

            @Override
            public Iterative5Args2<T1, T2, T3, T4, T5, A1, A2> filter(Pr1<? super A1> p1, Pr1<? super A2> p2) {
                return new Iterative5Args2Impl<T1, T2, T3, T4, T5, A1, A2>(this.left, this.right.filter(p1, p2), this.cross);
            }

            @Override
            public Iterative5Args2<T1, T2, T3, T4, T5, A1, A2> filter1(Pr1<? super A1> p1) {
                return new Iterative5Args2Impl<T1, T2, T3, T4, T5, A1, A2>(this.left, this.right.filter1(p1), this.cross);
            }

            @Override
            public Iterative5Args2<T1, T2, T3, T4, T5, A1, A2> filter2(Pr1<? super A2> p2) {
                return new Iterative5Args2Impl<T1, T2, T3, T4, T5, A1, A2>(this.left, this.right.filter2(p2), this.cross);
            }

        }

    }

    public static interface Iterative5Args1<T1, T2, T3, T4, T5, A1> extends Iterative5Args<T1, T2, T3, T4, T5> {

        public <R1, R2, R3, R4, R5> Iterative5<R1, R2, R3, R4, R5> mapping(Fn2<? super T1, ? super A1, ? extends R1> var1, Fn2<? super T2, ? super A1, ? extends R2> var2, Fn2<? super T3, ? super A1, ? extends R3> var3, Fn2<? super T4, ? super A1, ? extends R4> var4, Fn2<? super T5, ? super A1, ? extends R5> var5);

        public <R1, R2, R3, R4, R5> Iterative5<R1, R2, R3, R4, R5> inverseMapping(Fn2<? super A1, ? super T1, ? extends R1> var1, Fn2<? super A1, ? super T2, ? extends R2> var2, Fn2<? super A1, ? super T3, ? extends R3> var3, Fn2<? super A1, ? super T4, ? extends R4> var4, Fn2<? super A1, ? super T5, ? extends R5> var5);

        public <R5> Iterative5<T1, T2, T3, T4, R5> mappingRt1(Fn2<? super T5, ? super A1, ? extends R5> var1);

        public <R1> Iterative5<R1, T2, T3, T4, T5> mappingLt1(Fn2<? super T1, ? super A1, ? extends R1> var1);

        public <R4, R5> Iterative5<T1, T2, T3, R4, R5> mappingRt2(Fn2<? super T4, ? super A1, ? extends R4> var1, Fn2<? super T5, ? super A1, ? extends R5> var2);

        public <R1, R2> Iterative5<R1, R2, T3, T4, T5> mappingLt2(Fn2<? super T1, ? super A1, ? extends R1> var1, Fn2<? super T2, ? super A1, ? extends R2> var2);

        public <R3, R4, R5> Iterative5<T1, T2, R3, R4, R5> mappingRt3(Fn2<? super T3, ? super A1, ? extends R3> var1, Fn2<? super T4, ? super A1, ? extends R4> var2, Fn2<? super T5, ? super A1, ? extends R5> var3);

        public <R1, R2, R3> Iterative5<R1, R2, R3, T4, T5> mappingLt3(Fn2<? super T1, ? super A1, ? extends R1> var1, Fn2<? super T2, ? super A1, ? extends R2> var2, Fn2<? super T3, ? super A1, ? extends R3> var3);

        public <R2, R3, R4, R5> Iterative5<T1, R2, R3, R4, R5> mappingRt4(Fn2<? super T2, ? super A1, ? extends R2> var1, Fn2<? super T3, ? super A1, ? extends R3> var2, Fn2<? super T4, ? super A1, ? extends R4> var3, Fn2<? super T5, ? super A1, ? extends R5> var4);

        public <R1, R2, R3, R4> Iterative5<R1, R2, R3, R4, T5> mappingLt4(Fn2<? super T1, ? super A1, ? extends R1> var1, Fn2<? super T2, ? super A1, ? extends R2> var2, Fn2<? super T3, ? super A1, ? extends R3> var3, Fn2<? super T4, ? super A1, ? extends R4> var4);

        public <R1> Iterative5Args1<T1, T2, T3, T4, T5, R1> map(Fn1<? super A1, ? extends R1> var1);

        public <R1> Iterative5Args1<T1, T2, T3, T4, T5, R1> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> var1);

        public <R1> Iterative5Args1<T1, T2, T3, T4, T5, R1> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> var1);

        public Iterative5Args1<T1, T2, T3, T4, T5, A1> filter(Pr1<? super A1> var1);

        public static class Iterative5Args1Impl<T1, T2, T3, T4, T5, A1> implements Iterative5Args1<T1, T2, T3, T4, T5, A1> {

            Iterative5<T1, T2, T3, T4, T5> left;
            Iterative1<A1> right;
            boolean cross;

            Iterative5Args1Impl(Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> left, Iterative1<? extends A1> right, boolean cross) {
                Objects.requireNonNull(left, "left is null");
                Objects.requireNonNull(right, "right is null");
                this.left = left;
                this.right = right;
                this.cross = cross;
            }

            @Override
            public <R1, R2, R3, R4, R5> Iterative5<R1, R2, R3, R4, R5> mapping(Fn2<? super T1, ? super A1, ? extends R1> f1, Fn2<? super T2, ? super A1, ? extends R2> f2, Fn2<? super T3, ? super A1, ? extends R3> f3, Fn2<? super T4, ? super A1, ? extends R4> f4, Fn2<? super T5, ? super A1, ? extends R5> f5) {
                Objects.requireNonNull(f1, "f1 is null");
                Objects.requireNonNull(f2, "f2 is null");
                Objects.requireNonNull(f3, "f3 is null");
                Objects.requireNonNull(f4, "f4 is null");
                Objects.requireNonNull(f5, "f5 is null");
                Stream<Tuple1<A1>> stream = this.right.toStream();
                Iterative1<T1> i1 = this.left.create(this.left.iterableStream1());
                Iterative1<T2> i2 = this.left.create(this.left.iterableStream2());
                Iterative1<T3> i3 = this.left.create(this.left.iterableStream3());
                Iterative1<T4> i4 = this.left.create(this.left.iterableStream4());
                Iterative1<T5> i5 = this.left.create(this.left.iterableStream5());
                Iterative1 iter1 = this.left.splitLt1().create((this.cross ? i1.pushBackCrossOf(stream) : i1.pushBackInlineOf(stream)).reduce((Fn2 & Serializable)(t1, tuple) -> f1.apply(t1, tuple._1())).iterableStream1());
                Iterative2 iter2 = this.left.splitLt2().create(iter1, (this.cross ? i2.pushBackCrossOf(stream) : i2.pushBackInlineOf(stream)).reduce((Fn2 & Serializable)(t2, tuple) -> f2.apply(t2, tuple._1())).iterableStream1());
                Iterative3 iter3 = this.left.splitLt3().create(iter2, (this.cross ? i3.pushBackCrossOf(stream) : i3.pushBackInlineOf(stream)).reduce((Fn2 & Serializable)(t3, tuple) -> f3.apply(t3, tuple._1())).iterableStream1());
                Iterative4 iter4 = this.left.splitLt4().create(iter3, (this.cross ? i4.pushBackCrossOf(stream) : i4.pushBackInlineOf(stream)).reduce((Fn2 & Serializable)(t4, tuple) -> f4.apply(t4, tuple._1())).iterableStream1());
                return this.left.create(iter4, (this.cross ? i5.pushBackCrossOf(stream) : i5.pushBackInlineOf(stream)).reduce((Fn2 & Serializable)(t5, tuple) -> f5.apply(t5, tuple._1())).iterableStream1());
            }

            @Override
            public <R1, R2, R3, R4, R5> Iterative5<R1, R2, R3, R4, R5> inverseMapping(Fn2<? super A1, ? super T1, ? extends R1> f1, Fn2<? super A1, ? super T2, ? extends R2> f2, Fn2<? super A1, ? super T3, ? extends R3> f3, Fn2<? super A1, ? super T4, ? extends R4> f4, Fn2<? super A1, ? super T5, ? extends R5> f5) {
                return this.mapping((Fn2 & Serializable)(t1, a1) -> f1.apply(a1, t1), (Fn2 & Serializable)(t2, a1) -> f2.apply(a1, t2), (Fn2 & Serializable)(t3, a1) -> f3.apply(a1, t3), (Fn2 & Serializable)(t4, a1) -> f4.apply(a1, t4), (Fn2 & Serializable)(t5, a1) -> f5.apply(a1, t5));
            }

            @Override
            public <R5> Iterative5<T1, T2, T3, T4, R5> mappingRt1(Fn2<? super T5, ? super A1, ? extends R5> f5) {
                return this.mapping(IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1, f5);
            }

            @Override
            public <R1> Iterative5<R1, T2, T3, T4, T5> mappingLt1(Fn2<? super T1, ? super A1, ? extends R1> f1) {
                return this.mapping(f1, IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1);
            }

            @Override
            public <R4, R5> Iterative5<T1, T2, T3, R4, R5> mappingRt2(Fn2<? super T4, ? super A1, ? extends R4> f4, Fn2<? super T5, ? super A1, ? extends R5> f5) {
                return this.mapping(IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1, f4, f5);
            }

            @Override
            public <R1, R2> Iterative5<R1, R2, T3, T4, T5> mappingLt2(Fn2<? super T1, ? super A1, ? extends R1> f1, Fn2<? super T2, ? super A1, ? extends R2> f2) {
                return this.mapping(f1, f2, IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1);
            }

            @Override
            public <R3, R4, R5> Iterative5<T1, T2, R3, R4, R5> mappingRt3(Fn2<? super T3, ? super A1, ? extends R3> f3, Fn2<? super T4, ? super A1, ? extends R4> f4, Fn2<? super T5, ? super A1, ? extends R5> f5) {
                return this.mapping(IterativeInternals::get1, IterativeInternals::get1, f3, f4, f5);
            }

            @Override
            public <R1, R2, R3> Iterative5<R1, R2, R3, T4, T5> mappingLt3(Fn2<? super T1, ? super A1, ? extends R1> f1, Fn2<? super T2, ? super A1, ? extends R2> f2, Fn2<? super T3, ? super A1, ? extends R3> f3) {
                return this.mapping(f1, f2, f3, IterativeInternals::get1, IterativeInternals::get1);
            }

            @Override
            public <R2, R3, R4, R5> Iterative5<T1, R2, R3, R4, R5> mappingRt4(Fn2<? super T2, ? super A1, ? extends R2> f2, Fn2<? super T3, ? super A1, ? extends R3> f3, Fn2<? super T4, ? super A1, ? extends R4> f4, Fn2<? super T5, ? super A1, ? extends R5> f5) {
                return this.mapping(IterativeInternals::get1, f2, f3, f4, f5);
            }

            @Override
            public <R1, R2, R3, R4> Iterative5<R1, R2, R3, R4, T5> mappingLt4(Fn2<? super T1, ? super A1, ? extends R1> f1, Fn2<? super T2, ? super A1, ? extends R2> f2, Fn2<? super T3, ? super A1, ? extends R3> f3, Fn2<? super T4, ? super A1, ? extends R4> f4) {
                return this.mapping(f1, f2, f3, f4, IterativeInternals::get1);
            }

            @Override
            public <R1> Iterative5Args1<T1, T2, T3, T4, T5, R1> map(Fn1<? super A1, ? extends R1> f1) {
                return new Iterative5Args1Impl<T1, T2, T3, T4, T5, R1>(this.left, this.right.map(f1), this.cross);
            }

            @Override
            public <R1> Iterative5Args1<T1, T2, T3, T4, T5, R1> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative5Args1Impl(this.left, this.right.flatMap(f1), this.cross);
            }

            @Override
            public <R1> Iterative5Args1<T1, T2, T3, T4, T5, R1> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative5Args1Impl(this.left, this.right.inlineMap(f1), this.cross);
            }

            @Override
            public Iterative5Args1<T1, T2, T3, T4, T5, A1> filter(Pr1<? super A1> p1) {
                return new Iterative5Args1Impl<T1, T2, T3, T4, T5, A1>(this.left, this.right.filter(p1), this.cross);
            }

        }

    }

}

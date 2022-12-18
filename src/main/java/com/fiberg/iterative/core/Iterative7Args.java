package com.fiberg.iterative.core;

import com.fiberg.iterative.core.Iterative1;
import com.fiberg.iterative.core.Iterative2;
import com.fiberg.iterative.core.Iterative3;
import com.fiberg.iterative.core.Iterative4;
import com.fiberg.iterative.core.Iterative5;
import com.fiberg.iterative.core.Iterative6;
import com.fiberg.iterative.core.Iterative7;
import com.fiberg.iterative.core.IterativeInternals;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fn2;
import com.fiberg.iterative.function.Pr1;
import io.vavr.Tuple1;
import io.vavr.collection.Stream;
import java.io.Serializable;
import java.util.Objects;

public interface Iterative7Args<T1, T2, T3, T4, T5, T6, T7> {

    public static interface Iterative7Args1<T1, T2, T3, T4, T5, T6, T7, A1> extends Iterative7Args<T1, T2, T3, T4, T5, T6, T7> {

        public <R1, R2, R3, R4, R5, R6, R7> Iterative7<R1, R2, R3, R4, R5, R6, R7> mapping(Fn2<? super T1, ? super A1, ? extends R1> var1, Fn2<? super T2, ? super A1, ? extends R2> var2, Fn2<? super T3, ? super A1, ? extends R3> var3, Fn2<? super T4, ? super A1, ? extends R4> var4, Fn2<? super T5, ? super A1, ? extends R5> var5, Fn2<? super T6, ? super A1, ? extends R6> var6, Fn2<? super T7, ? super A1, ? extends R7> var7);

        public <R1, R2, R3, R4, R5, R6, R7> Iterative7<R1, R2, R3, R4, R5, R6, R7> inverseMapping(Fn2<? super A1, ? super T1, ? extends R1> var1, Fn2<? super A1, ? super T2, ? extends R2> var2, Fn2<? super A1, ? super T3, ? extends R3> var3, Fn2<? super A1, ? super T4, ? extends R4> var4, Fn2<? super A1, ? super T5, ? extends R5> var5, Fn2<? super A1, ? super T6, ? extends R6> var6, Fn2<? super A1, ? super T7, ? extends R7> var7);

        public <R7> Iterative7<T1, T2, T3, T4, T5, T6, R7> mappingRt1(Fn2<? super T7, ? super A1, ? extends R7> var1);

        public <R1> Iterative7<R1, T2, T3, T4, T5, T6, T7> mappingLt1(Fn2<? super T1, ? super A1, ? extends R1> var1);

        public <R6, R7> Iterative7<T1, T2, T3, T4, T5, R6, R7> mappingRt2(Fn2<? super T6, ? super A1, ? extends R6> var1, Fn2<? super T7, ? super A1, ? extends R7> var2);

        public <R1, R2> Iterative7<R1, R2, T3, T4, T5, T6, T7> mappingLt2(Fn2<? super T1, ? super A1, ? extends R1> var1, Fn2<? super T2, ? super A1, ? extends R2> var2);

        public <R5, R6, R7> Iterative7<T1, T2, T3, T4, R5, R6, R7> mappingRt3(Fn2<? super T5, ? super A1, ? extends R5> var1, Fn2<? super T6, ? super A1, ? extends R6> var2, Fn2<? super T7, ? super A1, ? extends R7> var3);

        public <R1, R2, R3> Iterative7<R1, R2, R3, T4, T5, T6, T7> mappingLt3(Fn2<? super T1, ? super A1, ? extends R1> var1, Fn2<? super T2, ? super A1, ? extends R2> var2, Fn2<? super T3, ? super A1, ? extends R3> var3);

        public <R4, R5, R6, R7> Iterative7<T1, T2, T3, R4, R5, R6, R7> mappingRt4(Fn2<? super T4, ? super A1, ? extends R4> var1, Fn2<? super T5, ? super A1, ? extends R5> var2, Fn2<? super T6, ? super A1, ? extends R6> var3, Fn2<? super T7, ? super A1, ? extends R7> var4);

        public <R1, R2, R3, R4> Iterative7<R1, R2, R3, R4, T5, T6, T7> mappingLt4(Fn2<? super T1, ? super A1, ? extends R1> var1, Fn2<? super T2, ? super A1, ? extends R2> var2, Fn2<? super T3, ? super A1, ? extends R3> var3, Fn2<? super T4, ? super A1, ? extends R4> var4);

        public <R3, R4, R5, R6, R7> Iterative7<T1, T2, R3, R4, R5, R6, R7> mappingRt5(Fn2<? super T3, ? super A1, ? extends R3> var1, Fn2<? super T4, ? super A1, ? extends R4> var2, Fn2<? super T5, ? super A1, ? extends R5> var3, Fn2<? super T6, ? super A1, ? extends R6> var4, Fn2<? super T7, ? super A1, ? extends R7> var5);

        public <R1, R2, R3, R4, R5> Iterative7<R1, R2, R3, R4, R5, T6, T7> mappingLt5(Fn2<? super T1, ? super A1, ? extends R1> var1, Fn2<? super T2, ? super A1, ? extends R2> var2, Fn2<? super T3, ? super A1, ? extends R3> var3, Fn2<? super T4, ? super A1, ? extends R4> var4, Fn2<? super T5, ? super A1, ? extends R5> var5);

        public <R2, R3, R4, R5, R6, R7> Iterative7<T1, R2, R3, R4, R5, R6, R7> mappingRt6(Fn2<? super T2, ? super A1, ? extends R2> var1, Fn2<? super T3, ? super A1, ? extends R3> var2, Fn2<? super T4, ? super A1, ? extends R4> var3, Fn2<? super T5, ? super A1, ? extends R5> var4, Fn2<? super T6, ? super A1, ? extends R6> var5, Fn2<? super T7, ? super A1, ? extends R7> var6);

        public <R1, R2, R3, R4, R5, R6> Iterative7<R1, R2, R3, R4, R5, R6, T7> mappingLt6(Fn2<? super T1, ? super A1, ? extends R1> var1, Fn2<? super T2, ? super A1, ? extends R2> var2, Fn2<? super T3, ? super A1, ? extends R3> var3, Fn2<? super T4, ? super A1, ? extends R4> var4, Fn2<? super T5, ? super A1, ? extends R5> var5, Fn2<? super T6, ? super A1, ? extends R6> var6);

        public <R1> Iterative7Args1<T1, T2, T3, T4, T5, T6, T7, R1> map(Fn1<? super A1, ? extends R1> var1);

        public <R1> Iterative7Args1<T1, T2, T3, T4, T5, T6, T7, R1> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> var1);

        public <R1> Iterative7Args1<T1, T2, T3, T4, T5, T6, T7, R1> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> var1);

        public Iterative7Args1<T1, T2, T3, T4, T5, T6, T7, A1> filter(Pr1<? super A1> var1);

        public static class Iterative7Args1Impl<T1, T2, T3, T4, T5, T6, T7, A1> implements Iterative7Args1<T1, T2, T3, T4, T5, T6, T7, A1> {

            Iterative7<T1, T2, T3, T4, T5, T6, T7> left;
            Iterative1<A1> right;
            boolean cross;

            Iterative7Args1Impl(Iterative7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> left, Iterative1<? extends A1> right, boolean cross) {
                Objects.requireNonNull(left, "left is null");
                Objects.requireNonNull(right, "right is null");
                this.left = left;
                this.right = right;
                this.cross = cross;
            }

            @Override
            public <R1, R2, R3, R4, R5, R6, R7> Iterative7<R1, R2, R3, R4, R5, R6, R7> mapping(Fn2<? super T1, ? super A1, ? extends R1> f1, Fn2<? super T2, ? super A1, ? extends R2> f2, Fn2<? super T3, ? super A1, ? extends R3> f3, Fn2<? super T4, ? super A1, ? extends R4> f4, Fn2<? super T5, ? super A1, ? extends R5> f5, Fn2<? super T6, ? super A1, ? extends R6> f6, Fn2<? super T7, ? super A1, ? extends R7> f7) {
                Objects.requireNonNull(f1, "f1 is null");
                Objects.requireNonNull(f2, "f2 is null");
                Objects.requireNonNull(f3, "f3 is null");
                Objects.requireNonNull(f4, "f4 is null");
                Objects.requireNonNull(f5, "f5 is null");
                Objects.requireNonNull(f6, "f6 is null");
                Objects.requireNonNull(f7, "f7 is null");
                Stream<Tuple1<A1>> stream = this.right.toStream();
                Iterative1<T1> i1 = this.left.create(this.left.iterableStream1());
                Iterative1<T2> i2 = this.left.create(this.left.iterableStream2());
                Iterative1<T3> i3 = this.left.create(this.left.iterableStream3());
                Iterative1<T4> i4 = this.left.create(this.left.iterableStream4());
                Iterative1<T5> i5 = this.left.create(this.left.iterableStream5());
                Iterative1<T6> i6 = this.left.create(this.left.iterableStream6());
                Iterative1<T7> i7 = this.left.create(this.left.iterableStream7());
                Iterative1 iter1 = this.left.splitLt1().create((this.cross ? i1.pushBackCrossOf(stream) : i1.pushBackInlineOf(stream)).reduce((Fn2 & Serializable) (t1, tuple) -> f1.apply(t1, tuple._1())).iterableStream1());
                Iterative2 iter2 = this.left.splitLt2().create(iter1, (this.cross ? i2.pushBackCrossOf(stream) : i2.pushBackInlineOf(stream)).reduce((Fn2 & Serializable) (t2, tuple) -> f2.apply(t2, tuple._1())).iterableStream1());
                Iterative3 iter3 = this.left.splitLt3().create(iter2, (this.cross ? i3.pushBackCrossOf(stream) : i3.pushBackInlineOf(stream)).reduce((Fn2 & Serializable) (t3, tuple) -> f3.apply(t3, tuple._1())).iterableStream1());
                Iterative4 iter4 = this.left.splitLt4().create(iter3, (this.cross ? i4.pushBackCrossOf(stream) : i4.pushBackInlineOf(stream)).reduce((Fn2 & Serializable) (t4, tuple) -> f4.apply(t4, tuple._1())).iterableStream1());
                Iterative5 iter5 = this.left.splitLt5().create(iter4, (this.cross ? i5.pushBackCrossOf(stream) : i5.pushBackInlineOf(stream)).reduce((Fn2 & Serializable) (t5, tuple) -> f5.apply(t5, tuple._1())).iterableStream1());
                Iterative6 iter6 = this.left.splitLt6().create(iter5, (this.cross ? i6.pushBackCrossOf(stream) : i6.pushBackInlineOf(stream)).reduce((Fn2 & Serializable) (t6, tuple) -> f6.apply(t6, tuple._1())).iterableStream1());
                return this.left.create(iter6, (this.cross ? i7.pushBackCrossOf(stream) : i7.pushBackInlineOf(stream)).reduce((Fn2 & Serializable) (t7, tuple) -> f7.apply(t7, tuple._1())).iterableStream1());
            }

            @Override
            public <R1, R2, R3, R4, R5, R6, R7> Iterative7<R1, R2, R3, R4, R5, R6, R7> inverseMapping(Fn2<? super A1, ? super T1, ? extends R1> f1, Fn2<? super A1, ? super T2, ? extends R2> f2, Fn2<? super A1, ? super T3, ? extends R3> f3, Fn2<? super A1, ? super T4, ? extends R4> f4, Fn2<? super A1, ? super T5, ? extends R5> f5, Fn2<? super A1, ? super T6, ? extends R6> f6, Fn2<? super A1, ? super T7, ? extends R7> f7) {
                return this.mapping((Fn2 & Serializable) (t1, a1) -> f1.apply(a1, t1), (Fn2 & Serializable) (t2, a1) -> f2.apply(a1, t2), (Fn2 & Serializable) (t3, a1) -> f3.apply(a1, t3), (Fn2 & Serializable) (t4, a1) -> f4.apply(a1, t4), (Fn2 & Serializable) (t5, a1) -> f5.apply(a1, t5), (Fn2 & Serializable) (t6, a1) -> f6.apply(a1, t6), (Fn2 & Serializable) (t7, a1) -> f7.apply(a1, t7));
            }

            @Override
            public <R7> Iterative7<T1, T2, T3, T4, T5, T6, R7> mappingRt1(Fn2<? super T7, ? super A1, ? extends R7> f7) {
                return this.mapping(IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1, f7);
            }

            @Override
            public <R1> Iterative7<R1, T2, T3, T4, T5, T6, T7> mappingLt1(Fn2<? super T1, ? super A1, ? extends R1> f1) {
                return this.mapping(f1, IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1);
            }

            @Override
            public <R6, R7> Iterative7<T1, T2, T3, T4, T5, R6, R7> mappingRt2(Fn2<? super T6, ? super A1, ? extends R6> f6, Fn2<? super T7, ? super A1, ? extends R7> f7) {
                return this.mapping(IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1, f6, f7);
            }

            @Override
            public <R1, R2> Iterative7<R1, R2, T3, T4, T5, T6, T7> mappingLt2(Fn2<? super T1, ? super A1, ? extends R1> f1, Fn2<? super T2, ? super A1, ? extends R2> f2) {
                return this.mapping(f1, f2, IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1);
            }

            @Override
            public <R5, R6, R7> Iterative7<T1, T2, T3, T4, R5, R6, R7> mappingRt3(Fn2<? super T5, ? super A1, ? extends R5> f5, Fn2<? super T6, ? super A1, ? extends R6> f6, Fn2<? super T7, ? super A1, ? extends R7> f7) {
                return this.mapping(IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1, f5, f6, f7);
            }

            @Override
            public <R1, R2, R3> Iterative7<R1, R2, R3, T4, T5, T6, T7> mappingLt3(Fn2<? super T1, ? super A1, ? extends R1> f1, Fn2<? super T2, ? super A1, ? extends R2> f2, Fn2<? super T3, ? super A1, ? extends R3> f3) {
                return this.mapping(f1, f2, f3, IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1);
            }

            @Override
            public <R4, R5, R6, R7> Iterative7<T1, T2, T3, R4, R5, R6, R7> mappingRt4(Fn2<? super T4, ? super A1, ? extends R4> f4, Fn2<? super T5, ? super A1, ? extends R5> f5, Fn2<? super T6, ? super A1, ? extends R6> f6, Fn2<? super T7, ? super A1, ? extends R7> f7) {
                return this.mapping(IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1, f4, f5, f6, f7);
            }

            @Override
            public <R1, R2, R3, R4> Iterative7<R1, R2, R3, R4, T5, T6, T7> mappingLt4(Fn2<? super T1, ? super A1, ? extends R1> f1, Fn2<? super T2, ? super A1, ? extends R2> f2, Fn2<? super T3, ? super A1, ? extends R3> f3, Fn2<? super T4, ? super A1, ? extends R4> f4) {
                return this.mapping(f1, f2, f3, f4, IterativeInternals::get1, IterativeInternals::get1, IterativeInternals::get1);
            }

            @Override
            public <R3, R4, R5, R6, R7> Iterative7<T1, T2, R3, R4, R5, R6, R7> mappingRt5(Fn2<? super T3, ? super A1, ? extends R3> f3, Fn2<? super T4, ? super A1, ? extends R4> f4, Fn2<? super T5, ? super A1, ? extends R5> f5, Fn2<? super T6, ? super A1, ? extends R6> f6, Fn2<? super T7, ? super A1, ? extends R7> f7) {
                return this.mapping(IterativeInternals::get1, IterativeInternals::get1, f3, f4, f5, f6, f7);
            }

            @Override
            public <R1, R2, R3, R4, R5> Iterative7<R1, R2, R3, R4, R5, T6, T7> mappingLt5(Fn2<? super T1, ? super A1, ? extends R1> f1, Fn2<? super T2, ? super A1, ? extends R2> f2, Fn2<? super T3, ? super A1, ? extends R3> f3, Fn2<? super T4, ? super A1, ? extends R4> f4, Fn2<? super T5, ? super A1, ? extends R5> f5) {
                return this.mapping(f1, f2, f3, f4, f5, IterativeInternals::get1, IterativeInternals::get1);
            }

            @Override
            public <R2, R3, R4, R5, R6, R7> Iterative7<T1, R2, R3, R4, R5, R6, R7> mappingRt6(Fn2<? super T2, ? super A1, ? extends R2> f2, Fn2<? super T3, ? super A1, ? extends R3> f3, Fn2<? super T4, ? super A1, ? extends R4> f4, Fn2<? super T5, ? super A1, ? extends R5> f5, Fn2<? super T6, ? super A1, ? extends R6> f6, Fn2<? super T7, ? super A1, ? extends R7> f7) {
                return this.mapping(IterativeInternals::get1, f2, f3, f4, f5, f6, f7);
            }

            @Override
            public <R1, R2, R3, R4, R5, R6> Iterative7<R1, R2, R3, R4, R5, R6, T7> mappingLt6(Fn2<? super T1, ? super A1, ? extends R1> f1, Fn2<? super T2, ? super A1, ? extends R2> f2, Fn2<? super T3, ? super A1, ? extends R3> f3, Fn2<? super T4, ? super A1, ? extends R4> f4, Fn2<? super T5, ? super A1, ? extends R5> f5, Fn2<? super T6, ? super A1, ? extends R6> f6) {
                return this.mapping(f1, f2, f3, f4, f5, f6, IterativeInternals::get1);
            }

            @Override
            public <R1> Iterative7Args1<T1, T2, T3, T4, T5, T6, T7, R1> map(Fn1<? super A1, ? extends R1> f1) {
                return new Iterative7Args1Impl<T1, T2, T3, T4, T5, T6, T7, R1>(this.left, this.right.map(f1), this.cross);
            }

            @Override
            public <R1> Iterative7Args1<T1, T2, T3, T4, T5, T6, T7, R1> flatMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative7Args1Impl(this.left, this.right.flatMap(f1), this.cross);
            }

            @Override
            public <R1> Iterative7Args1<T1, T2, T3, T4, T5, T6, T7, R1> inlineMap(Fn1<? super A1, ? extends Iterable<? extends R1>> f1) {
                return new Iterative7Args1Impl(this.left, this.right.inlineMap(f1), this.cross);
            }

            @Override
            public Iterative7Args1<T1, T2, T3, T4, T5, T6, T7, A1> filter(Pr1<? super A1> p1) {
                return new Iterative7Args1Impl<T1, T2, T3, T4, T5, T6, T7, A1>(this.left, this.right.filter(p1), this.cross);
            }

        }

    }

}

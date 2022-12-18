package com.fiberg.iterative.function;

import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fn2;
import com.fiberg.iterative.function.Fn3;
import com.fiberg.iterative.function.Fn4;
import com.fiberg.iterative.function.Fn5;
import com.fiberg.iterative.function.Fn6;
import com.fiberg.iterative.function.Fn7;
import com.fiberg.iterative.function.Fn8;
import com.fiberg.iterative.function.Fnc1;
import com.fiberg.iterative.function.Fnc2;
import com.fiberg.iterative.function.Fnc3;
import com.fiberg.iterative.function.Fnc4;
import com.fiberg.iterative.function.Fnc5;
import com.fiberg.iterative.function.Fnc6;
import com.fiberg.iterative.function.Fnc7;
import com.fiberg.iterative.function.Fnc8;
import com.fiberg.iterative.function.Pr1;
import com.fiberg.iterative.function.Pr2;
import com.fiberg.iterative.function.Pr3;
import com.fiberg.iterative.function.Pr4;
import com.fiberg.iterative.function.Pr5;
import com.fiberg.iterative.function.Pr6;
import com.fiberg.iterative.function.Pr7;
import com.fiberg.iterative.function.Pr8;
import com.fiberg.iterative.function.Prc1;
import com.fiberg.iterative.function.Prc2;
import com.fiberg.iterative.function.Prc3;
import com.fiberg.iterative.function.Prc4;
import com.fiberg.iterative.function.Prc5;
import com.fiberg.iterative.function.Prc6;
import com.fiberg.iterative.function.Prc7;
import com.fiberg.iterative.function.Prc8;
import com.fiberg.iterative.function.Sp;
import com.fiberg.iterative.function.Spc;
import io.vavr.Tuple;
import io.vavr.Tuple1;
import io.vavr.Tuple2;
import io.vavr.Tuple3;
import io.vavr.Tuple4;
import io.vavr.Tuple5;
import io.vavr.Tuple6;
import io.vavr.Tuple7;
import io.vavr.Tuple8;
import io.vavr.collection.List;
import java.io.Serializable;
import java.util.Objects;

public interface Switcher<TUPLE extends Tuple, R> {

    public static <T1, R> Fn1<T1, R> fn1(Fn1<SwitcherComparator1<T1, R>, Fn1<T1, R>> transformer) {
        return (Fn1) transformer.apply(Switcher.fn1());
    }

    public static <T1, T2, R> Fn2<T1, T2, R> fn2(Fn1<SwitcherComparator2<T1, T2, R>, Fn2<T1, T2, R>> transformer) {
        return (Fn2) transformer.apply(Switcher.fn2());
    }

    public static <T1, T2, T3, R> Fn3<T1, T2, T3, R> fn3(Fn1<SwitcherComparator3<T1, T2, T3, R>, Fn3<T1, T2, T3, R>> transformer) {
        return (Fn3) transformer.apply(Switcher.fn3());
    }

    public static <T1, T2, T3, T4, R> Fn4<T1, T2, T3, T4, R> fn4(Fn1<SwitcherComparator4<T1, T2, T3, T4, R>, Fn4<T1, T2, T3, T4, R>> transformer) {
        return (Fn4) transformer.apply(Switcher.fn4());
    }

    public static <T1, T2, T3, T4, T5, R> Fn5<T1, T2, T3, T4, T5, R> fn5(Fn1<SwitcherComparator5<T1, T2, T3, T4, T5, R>, Fn5<T1, T2, T3, T4, T5, R>> transformer) {
        return (Fn5) transformer.apply(Switcher.fn5());
    }

    public static <T1, T2, T3, T4, T5, T6, R> Fn6<T1, T2, T3, T4, T5, T6, R> fn6(Fn1<SwitcherComparator6<T1, T2, T3, T4, T5, T6, R>, Fn6<T1, T2, T3, T4, T5, T6, R>> transformer) {
        return (Fn6) transformer.apply(Switcher.fn6());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn7<T1, T2, T3, T4, T5, T6, T7, R> fn7(Fn1<SwitcherComparator7<T1, T2, T3, T4, T5, T6, T7, R>, Fn7<T1, T2, T3, T4, T5, T6, T7, R>> transformer) {
        return (Fn7) transformer.apply(Switcher.fn7());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> fn8(Fn1<SwitcherComparator8<T1, T2, T3, T4, T5, T6, T7, T8, R>, Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R>> transformer) {
        return (Fn8) transformer.apply(Switcher.fn8());
    }

    public static <T1, R> Fnc1<T1, R> fnc1(Fn1<SwitcherCheckedComparator1<T1, R>, Fnc1<T1, R>> transformer) {
        return (Fnc1) transformer.apply(Switcher.fnc1());
    }

    public static <T1, T2, R> Fnc2<T1, T2, R> fnc2(Fn1<SwitcherCheckedComparator2<T1, T2, R>, Fnc2<T1, T2, R>> transformer) {
        return (Fnc2) transformer.apply(Switcher.fnc2());
    }

    public static <T1, T2, T3, R> Fnc3<T1, T2, T3, R> fnc3(Fn1<SwitcherCheckedComparator3<T1, T2, T3, R>, Fnc3<T1, T2, T3, R>> transformer) {
        return (Fnc3) transformer.apply(Switcher.fnc3());
    }

    public static <T1, T2, T3, T4, R> Fnc4<T1, T2, T3, T4, R> fnc4(Fn1<SwitcherCheckedComparator4<T1, T2, T3, T4, R>, Fnc4<T1, T2, T3, T4, R>> transformer) {
        return (Fnc4) transformer.apply(Switcher.fnc4());
    }

    public static <T1, T2, T3, T4, T5, R> Fnc5<T1, T2, T3, T4, T5, R> fnc5(Fn1<SwitcherCheckedComparator5<T1, T2, T3, T4, T5, R>, Fnc5<T1, T2, T3, T4, T5, R>> transformer) {
        return (Fnc5) transformer.apply(Switcher.fnc5());
    }

    public static <T1, T2, T3, T4, T5, T6, R> Fnc6<T1, T2, T3, T4, T5, T6, R> fnc6(Fn1<SwitcherCheckedComparator6<T1, T2, T3, T4, T5, T6, R>, Fnc6<T1, T2, T3, T4, T5, T6, R>> transformer) {
        return (Fnc6) transformer.apply(Switcher.fnc6());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fnc7<T1, T2, T3, T4, T5, T6, T7, R> fnc7(Fn1<SwitcherCheckedComparator7<T1, T2, T3, T4, T5, T6, T7, R>, Fnc7<T1, T2, T3, T4, T5, T6, T7, R>> transformer) {
        return (Fnc7) transformer.apply(Switcher.fnc7());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> fnc8(Fn1<SwitcherCheckedComparator8<T1, T2, T3, T4, T5, T6, T7, T8, R>, Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R>> transformer) {
        return (Fnc8) transformer.apply(Switcher.fnc8());
    }

    public static <T1, R> SwitcherComparator1<T1, R> fn1() {
        return new Switcher1();
    }

    public static <T1, T2, R> SwitcherComparator2<T1, T2, R> fn2() {
        return new Switcher2();
    }

    public static <T1, T2, T3, R> SwitcherComparator3<T1, T2, T3, R> fn3() {
        return new Switcher3();
    }

    public static <T1, T2, T3, T4, R> SwitcherComparator4<T1, T2, T3, T4, R> fn4() {
        return new Switcher4();
    }

    public static <T1, T2, T3, T4, T5, R> SwitcherComparator5<T1, T2, T3, T4, T5, R> fn5() {
        return new Switcher5();
    }

    public static <T1, T2, T3, T4, T5, T6, R> SwitcherComparator6<T1, T2, T3, T4, T5, T6, R> fn6() {
        return new Switcher6();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> SwitcherComparator7<T1, T2, T3, T4, T5, T6, T7, R> fn7() {
        return new Switcher7();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> SwitcherComparator8<T1, T2, T3, T4, T5, T6, T7, T8, R> fn8() {
        return new Switcher8();
    }

    public static <T1, R> SwitcherCheckedComparator1<T1, R> fnc1() {
        return new SwitcherChecked1();
    }

    public static <T1, T2, R> SwitcherCheckedComparator2<T1, T2, R> fnc2() {
        return new SwitcherChecked2();
    }

    public static <T1, T2, T3, R> SwitcherCheckedComparator3<T1, T2, T3, R> fnc3() {
        return new SwitcherChecked3();
    }

    public static <T1, T2, T3, T4, R> SwitcherCheckedComparator4<T1, T2, T3, T4, R> fnc4() {
        return new SwitcherChecked4();
    }

    public static <T1, T2, T3, T4, T5, R> SwitcherCheckedComparator5<T1, T2, T3, T4, T5, R> fnc5() {
        return new SwitcherChecked5();
    }

    public static <T1, T2, T3, T4, T5, T6, R> SwitcherCheckedComparator6<T1, T2, T3, T4, T5, T6, R> fnc6() {
        return new SwitcherChecked6();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> SwitcherCheckedComparator7<T1, T2, T3, T4, T5, T6, T7, R> fnc7() {
        return new SwitcherChecked7();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> SwitcherCheckedComparator8<T1, T2, T3, T4, T5, T6, T7, T8, R> fnc8() {
        return new SwitcherChecked8();
    }

    public static abstract class SwitcherCheckedAbst<TUPLE extends Tuple, R> extends SwitcherCheckedBaseAbst<TUPLE, R> implements Switcher<TUPLE, R>, SwitcherCheckedTupleComparator<TUPLE, R>, SwitcherCheckedTupleTranformer<TUPLE, R> {

        SwitcherCheckedAbst() {
        }

        private SwitcherCheckedAbst(List<Tuple2<Prc1<? super TUPLE>, Fnc1<? super TUPLE, ? extends R>>> transformations, Prc1<? super TUPLE> p, Fnc1<? super TUPLE, ? extends R> f) {
            super(transformations, p, f);
        }

        private SwitcherCheckedAbst(List<Tuple2<Prc1<? super TUPLE>, Fnc1<? super TUPLE, ? extends R>>> transformations, Fnc1<? super TUPLE, ? extends R> f) {
            super(transformations, f);
        }

        @Override
        public abstract SwitcherCheckedTupleComparator<TUPLE, R> map(Fnc1<? super TUPLE, ? extends R> var1);

        @Override
        public abstract SwitcherCheckedTupleTranformer<TUPLE, R> onPredicate(Prc1<? super TUPLE> var1);

        static <T, S> Fnc1<T, S> emptyTransformer() {
            return (Fnc1 & Serializable) ignore -> {
                throw new UnsupportedOperationException("Unimplemented transformer method");
            };
        }

        static <TUPLE extends Tuple, R> Fnc1<TUPLE, R> transformerTupleValue(R r) {
            return Fnc1.value(r);
        }

        static <TUPLE extends Tuple, R> Fnc1<TUPLE, R> transformerTupleSupplier(Spc<? extends R> s) {
            return Spc.narrow(s).ignoring1();
        }

        static <T, R> Fnc1<T, R> transformerValue(R r) {
            return Fnc1.value(r);
        }

        static <TUPLE extends Tuple> Prc1<TUPLE> comparatorTupleValue(TUPLE tuple) {
            return (Prc1 & Serializable) t -> Objects.equals(t, tuple);
        }

        static <T> Prc1<T> comparatorValue(T t) {
            return (Prc1 & Serializable) o -> Objects.equals(o, t);
        }

        static <T> Prc1<T> comparatorSupplierChecked(Spc<? extends T> s) {
            return (Prc1 & Serializable) t -> Objects.equals(t, s.toFunction().ignoring1());
        }

        static <T> Pr1<T> comparatorSupplier(Sp<? extends T> s) {
            return (Pr1 & Serializable) t -> Objects.equals(t, s.toFunction().ignoring1());
        }

    }

    public static abstract class SwitcherCheckedBaseAbst<TUPLE extends Tuple, R> implements Switcher<TUPLE, R>, SwitcherCheckedComparator<TUPLE, R>, SwitcherCheckedTranformer<TUPLE, R> {

        List<Tuple2<Prc1<? super TUPLE>, Fnc1<? super TUPLE, ? extends R>>> transformations;

        SwitcherCheckedBaseAbst() {
            this.transformations = List.of((Object[]) new Tuple2[0]);
        }

        private SwitcherCheckedBaseAbst(List<Tuple2<Prc1<? super TUPLE>, Fnc1<? super TUPLE, ? extends R>>> transformations, Prc1<? super TUPLE> p, Fnc1<? super TUPLE, ? extends R> f) {
            this.transformations = transformations.append((Object) Tuple.of(p, f));
        }

        private SwitcherCheckedBaseAbst(List<Tuple2<Prc1<? super TUPLE>, Fnc1<? super TUPLE, ? extends R>>> transformations, Fnc1<? super TUPLE, ? extends R> f) {
            this.transformations = transformations.dropRight(1).append((Object) Tuple.of((Object) ((Tuple2) transformations.last())._1(), f));
        }

        static <T> T throwNotMatching() {
            throw new IllegalStateException("At least one predicate must match on iterative map on");
        }

        @Override
        public Fnc1<TUPLE, R> onDefaultTupled(Fnc1<? super TUPLE, ? extends R> f) {
            this.transformations = this.transformations.append((Object) Tuple.of(Prc1.value(true), f));
            return (Fnc1 & Serializable) elem -> {
                for (Tuple2 tuple : this.transformations) {
                    if (!((Prc1) tuple._1()).test(elem)) continue;
                    return ((Fnc1) tuple._2()).apply(elem);
                }
                return SwitcherCheckedBaseAbst.throwNotMatching();
            };
        }

    }

    public static class SwitcherChecked8<T1, T2, T3, T4, T5, T6, T7, T8, R> extends SwitcherCheckedAbst<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, R> implements SwitcherCheckedTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R>, SwitcherCheckedComparator8<T1, T2, T3, T4, T5, T6, T7, T8, R> {

        SwitcherChecked8() {
        }

        private SwitcherChecked8(List<Tuple2<Prc1<? super Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>>, Fnc1<? super Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, ? extends R>>> transformations, Prc1<? super Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> p, Fnc1<? super Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, ? extends R> f) {
            super(transformations, p, f);
        }

        private SwitcherChecked8(List<Tuple2<Prc1<? super Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>>, Fnc1<? super Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, ? extends R>>> transformations, Fnc1<? super Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, ? extends R> f) {
            super(transformations, f);
        }

        @Override
        public SwitcherCheckedTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onPredicate(Prc1<? super Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> p) {
            return new SwitcherChecked8(this.transformations, p, SwitcherCheckedAbst.emptyTransformer());
        }

        @Override
        public SwitcherCheckedComparator8<T1, T2, T3, T4, T5, T6, T7, T8, R> map(Fnc1<? super Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, ? extends R> f) {
            return new SwitcherChecked8<T1, T2, T3, T4, T5, T6, T7, T8, R>(this.transformations, f);
        }

    }

    public static interface SwitcherCheckedComparator8<T1, T2, T3, T4, T5, T6, T7, T8, R> extends SwitcherCheckedTupleComparator<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, R> {

        default public SwitcherCheckedTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onEquals(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
            return this.onPredicate(SwitcherCheckedAbst.comparatorTupleValue(Tuple.of(t1, t2, t3, t4, t5, t6, t7, t8)));
        }

        default public SwitcherCheckedTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onEquals(Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8> tuple) {
            return this.onPredicate(SwitcherCheckedAbst.comparatorTupleValue(tuple));
        }

        default public SwitcherCheckedTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onEquals1(T1 t1) {
            return this.onPredicate1(SwitcherCheckedAbst.comparatorValue(t1));
        }

        default public SwitcherCheckedTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onEquals2(T2 t2) {
            return this.onPredicate2(SwitcherCheckedAbst.comparatorValue(t2));
        }

        default public SwitcherCheckedTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onEquals3(T3 t3) {
            return this.onPredicate3(SwitcherCheckedAbst.comparatorValue(t3));
        }

        default public SwitcherCheckedTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onEquals4(T4 t4) {
            return this.onPredicate4(SwitcherCheckedAbst.comparatorValue(t4));
        }

        default public SwitcherCheckedTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onEquals5(T5 t5) {
            return this.onPredicate5(SwitcherCheckedAbst.comparatorValue(t5));
        }

        default public SwitcherCheckedTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onEquals6(T6 t6) {
            return this.onPredicate6(SwitcherCheckedAbst.comparatorValue(t6));
        }

        default public SwitcherCheckedTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onEquals7(T7 t7) {
            return this.onPredicate7(SwitcherCheckedAbst.comparatorValue(t7));
        }

        default public SwitcherCheckedTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onEquals8(T8 t8) {
            return this.onPredicate(SwitcherCheckedAbst.comparatorValue(t8));
        }

        default public SwitcherCheckedTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onEquals(Spc<? extends Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> s) {
            return this.onPredicate(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onEquals1(Spc<? extends T1> s) {
            return this.onPredicate1(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onEquals2(Spc<? extends T2> s) {
            return this.onPredicate2(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onEquals3(Spc<? extends T3> s) {
            return this.onPredicate3(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onEquals4(Spc<? extends T4> s) {
            return this.onPredicate4(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onEquals5(Spc<? extends T5> s) {
            return this.onPredicate5(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onEquals6(Spc<? extends T6> s) {
            return this.onPredicate6(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onEquals7(Spc<? extends T7> s) {
            return this.onPredicate7(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onEquals8(Spc<? extends T8> s) {
            return this.onPredicate8(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onPredicate(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
            return this.onPredicate(Prc8.tuple(p));
        }

        public SwitcherCheckedTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onPredicate(Prc1<? super Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> var1);

        default public SwitcherCheckedTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onPredicate1(Prc1<? super T1> p) {
            return this.onPredicate(p.ignoring7Rt());
        }

        default public SwitcherCheckedTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onPredicate2(Prc1<? super T2> p) {
            return this.onPredicate(p.ignoring6Rt().ignoring1Lt());
        }

        default public SwitcherCheckedTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onPredicate3(Prc1<? super T3> p) {
            return this.onPredicate(p.ignoring5Rt().ignoring2Lt());
        }

        default public SwitcherCheckedTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onPredicate4(Prc1<? super T4> p) {
            return this.onPredicate(p.ignoring4Rt().ignoring3Lt());
        }

        default public SwitcherCheckedTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onPredicate5(Prc1<? super T5> p) {
            return this.onPredicate(p.ignoring3Rt().ignoring4Lt());
        }

        default public SwitcherCheckedTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onPredicate6(Prc1<? super T6> p) {
            return this.onPredicate(p.ignoring2Rt().ignoring5Lt());
        }

        default public SwitcherCheckedTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onPredicate7(Prc1<? super T7> p) {
            return this.onPredicate(p.ignoring1Rt().ignoring6Lt());
        }

        default public SwitcherCheckedTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onPredicate8(Prc1<? super T8> p) {
            return this.onPredicate(p.ignoring7Lt());
        }

        default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> onDefaultThrow() {
            return this.onDefaults(SwitcherCheckedAbst.emptyTransformer());
        }

        default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> onDefaults() {
            return this.onDefaults(Fnc8.empty());
        }

        default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> onDefaults(R r) {
            return this.onDefaults(SwitcherCheckedAbst.transformerValue(r));
        }

        default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> onDefaults(Spc<? extends R> s) {
            return this.onDefaults(s.ignoring1());
        }

        default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> onDefaults(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
            return this.onDefaults(Fnc8.tuple(f));
        }

        default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> onDefaults1(Fnc1<? super T1, ? extends R> f) {
            return this.onDefaults(Fnc8.tuple(f.ignoring7Rt()));
        }

        default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> onDefaults2(Fnc1<? super T2, ? extends R> f) {
            return this.onDefaults(Fnc8.tuple(f.ignoring6Rt().ignoring1Lt()));
        }

        default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> onDefaults3(Fnc1<? super T3, ? extends R> f) {
            return this.onDefaults(Fnc8.tuple(f.ignoring5Rt().ignoring2Lt()));
        }

        default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> onDefaults4(Fnc1<? super T4, ? extends R> f) {
            return this.onDefaults(Fnc8.tuple(f.ignoring4Rt().ignoring3Lt()));
        }

        default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> onDefaults5(Fnc1<? super T5, ? extends R> f) {
            return this.onDefaults(Fnc8.tuple(f.ignoring3Rt().ignoring4Lt()));
        }

        default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> onDefaults6(Fnc1<? super T6, ? extends R> f) {
            return this.onDefaults(Fnc8.tuple(f.ignoring2Rt().ignoring5Lt()));
        }

        default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> onDefaults7(Fnc1<? super T7, ? extends R> f) {
            return this.onDefaults(Fnc8.tuple(f.ignoring1Rt().ignoring6Lt()));
        }

        default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> onDefaults8(Fnc1<? super T8, ? extends R> f) {
            return this.onDefaults(Fnc8.tuple(f.ignoring7Lt()));
        }

        default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> onDefaults(Fnc1<? super Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, ? extends R> f) {
            return (Fnc8 & Serializable) (t1, t2, t3, t4, t5, t6, t7, t8) -> this.onDefaultTupled(f).apply((Object) Tuple.of((Object) t1, (Object) t2, (Object) t3, (Object) t4, (Object) t5, (Object) t6, (Object) t7, (Object) t8));
        }

    }

    public static interface SwitcherCheckedTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> extends SwitcherCheckedTupleTranformer<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, R> {

        default public SwitcherCheckedComparator8<T1, T2, T3, T4, T5, T6, T7, T8, R> value(R r) {
            return this.map(SwitcherCheckedAbst.transformerTupleValue(r));
        }

        default public SwitcherCheckedComparator8<T1, T2, T3, T4, T5, T6, T7, T8, R> value(Spc<? extends R> s) {
            return this.map(SwitcherCheckedAbst.transformerTupleSupplier(s));
        }

        default public SwitcherCheckedComparator8<T1, T2, T3, T4, T5, T6, T7, T8, R> map(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
            return this.map(Fnc8.tuple(f));
        }

        default public SwitcherCheckedComparator8<T1, T2, T3, T4, T5, T6, T7, T8, R> map1(Fnc1<? super T1, ? extends R> f) {
            return this.map(Fnc8.tuple(f.ignoring7Rt()));
        }

        default public SwitcherCheckedComparator8<T1, T2, T3, T4, T5, T6, T7, T8, R> map2(Fnc1<? super T2, ? extends R> f) {
            return this.map(Fnc8.tuple(f.ignoring6Rt().ignoring1Lt()));
        }

        default public SwitcherCheckedComparator8<T1, T2, T3, T4, T5, T6, T7, T8, R> map3(Fnc1<? super T3, ? extends R> f) {
            return this.map(Fnc8.tuple(f.ignoring5Rt().ignoring2Lt()));
        }

        default public SwitcherCheckedComparator8<T1, T2, T3, T4, T5, T6, T7, T8, R> map4(Fnc1<? super T4, ? extends R> f) {
            return this.map(Fnc8.tuple(f.ignoring4Rt().ignoring3Lt()));
        }

        default public SwitcherCheckedComparator8<T1, T2, T3, T4, T5, T6, T7, T8, R> map5(Fnc1<? super T5, ? extends R> f) {
            return this.map(Fnc8.tuple(f.ignoring3Rt().ignoring4Lt()));
        }

        default public SwitcherCheckedComparator8<T1, T2, T3, T4, T5, T6, T7, T8, R> map6(Fnc1<? super T6, ? extends R> f) {
            return this.map(Fnc8.tuple(f.ignoring2Rt().ignoring5Lt()));
        }

        default public SwitcherCheckedComparator8<T1, T2, T3, T4, T5, T6, T7, T8, R> map7(Fnc1<? super T7, ? extends R> f) {
            return this.map(Fnc8.tuple(f.ignoring1Rt().ignoring6Lt()));
        }

        default public SwitcherCheckedComparator8<T1, T2, T3, T4, T5, T6, T7, T8, R> map8(Fnc1<? super T8, ? extends R> f) {
            return this.map(Fnc8.tuple(f.ignoring7Lt()));
        }

        public SwitcherCheckedComparator8<T1, T2, T3, T4, T5, T6, T7, T8, R> map(Fnc1<? super Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, ? extends R> var1);
    }

    public static class SwitcherChecked7<T1, T2, T3, T4, T5, T6, T7, R> extends SwitcherCheckedAbst<Tuple7<T1, T2, T3, T4, T5, T6, T7>, R> implements SwitcherCheckedTranformer7<T1, T2, T3, T4, T5, T6, T7, R>, SwitcherCheckedComparator7<T1, T2, T3, T4, T5, T6, T7, R> {

        SwitcherChecked7() {
        }

        private SwitcherChecked7(List<Tuple2<Prc1<? super Tuple7<T1, T2, T3, T4, T5, T6, T7>>, Fnc1<? super Tuple7<T1, T2, T3, T4, T5, T6, T7>, ? extends R>>> transformations, Prc1<? super Tuple7<T1, T2, T3, T4, T5, T6, T7>> p, Fnc1<? super Tuple7<T1, T2, T3, T4, T5, T6, T7>, ? extends R> f) {
            super(transformations, p, f);
        }

        private SwitcherChecked7(List<Tuple2<Prc1<? super Tuple7<T1, T2, T3, T4, T5, T6, T7>>, Fnc1<? super Tuple7<T1, T2, T3, T4, T5, T6, T7>, ? extends R>>> transformations, Fnc1<? super Tuple7<T1, T2, T3, T4, T5, T6, T7>, ? extends R> f) {
            super(transformations, f);
        }

        @Override
        public SwitcherCheckedTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onPredicate(Prc1<? super Tuple7<T1, T2, T3, T4, T5, T6, T7>> p) {
            return new SwitcherChecked7(this.transformations, p, SwitcherCheckedAbst.emptyTransformer());
        }

        @Override
        public SwitcherCheckedComparator7<T1, T2, T3, T4, T5, T6, T7, R> map(Fnc1<? super Tuple7<T1, T2, T3, T4, T5, T6, T7>, ? extends R> f) {
            return new SwitcherChecked7<T1, T2, T3, T4, T5, T6, T7, R>(this.transformations, f);
        }

    }

    public static interface SwitcherCheckedComparator7<T1, T2, T3, T4, T5, T6, T7, R> extends SwitcherCheckedTupleComparator<Tuple7<T1, T2, T3, T4, T5, T6, T7>, R> {

        default public SwitcherCheckedTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onEquals(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
            return this.onPredicate(SwitcherCheckedAbst.comparatorTupleValue(Tuple.of(t1, t2, t3, t4, t5, t6, t7)));
        }

        default public SwitcherCheckedTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onEquals(Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> tuple) {
            return this.onPredicate(SwitcherCheckedAbst.comparatorTupleValue(tuple));
        }

        default public SwitcherCheckedTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onEquals1(T1 t1) {
            return this.onPredicate1(SwitcherCheckedAbst.comparatorValue(t1));
        }

        default public SwitcherCheckedTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onEquals2(T2 t2) {
            return this.onPredicate2(SwitcherCheckedAbst.comparatorValue(t2));
        }

        default public SwitcherCheckedTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onEquals3(T3 t3) {
            return this.onPredicate3(SwitcherCheckedAbst.comparatorValue(t3));
        }

        default public SwitcherCheckedTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onEquals4(T4 t4) {
            return this.onPredicate4(SwitcherCheckedAbst.comparatorValue(t4));
        }

        default public SwitcherCheckedTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onEquals5(T5 t5) {
            return this.onPredicate5(SwitcherCheckedAbst.comparatorValue(t5));
        }

        default public SwitcherCheckedTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onEquals6(T6 t6) {
            return this.onPredicate6(SwitcherCheckedAbst.comparatorValue(t6));
        }

        default public SwitcherCheckedTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onEquals7(T7 t7) {
            return this.onPredicate7(SwitcherCheckedAbst.comparatorValue(t7));
        }

        default public SwitcherCheckedTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onEquals(Spc<? extends Tuple7<T1, T2, T3, T4, T5, T6, T7>> s) {
            return this.onPredicate(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onEquals1(Spc<? extends T1> s) {
            return this.onPredicate1(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onEquals2(Spc<? extends T2> s) {
            return this.onPredicate2(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onEquals3(Spc<? extends T3> s) {
            return this.onPredicate3(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onEquals4(Spc<? extends T4> s) {
            return this.onPredicate4(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onEquals5(Spc<? extends T5> s) {
            return this.onPredicate5(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onEquals6(Spc<? extends T6> s) {
            return this.onPredicate6(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onEquals7(Spc<? extends T7> s) {
            return this.onPredicate7(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onPredicate(Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
            return this.onPredicate(Prc7.tuple(p));
        }

        default public SwitcherCheckedTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onPredicate1(Prc1<? super T1> p) {
            return this.onPredicate(p.ignoring6Rt());
        }

        default public SwitcherCheckedTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onPredicate2(Prc1<? super T2> p) {
            return this.onPredicate(p.ignoring5Rt().ignoring1Lt());
        }

        default public SwitcherCheckedTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onPredicate3(Prc1<? super T3> p) {
            return this.onPredicate(p.ignoring4Rt().ignoring2Lt());
        }

        default public SwitcherCheckedTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onPredicate4(Prc1<? super T4> p) {
            return this.onPredicate(p.ignoring3Rt().ignoring3Lt());
        }

        default public SwitcherCheckedTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onPredicate5(Prc1<? super T5> p) {
            return this.onPredicate(p.ignoring2Rt().ignoring4Lt());
        }

        default public SwitcherCheckedTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onPredicate6(Prc1<? super T6> p) {
            return this.onPredicate(p.ignoring1Rt().ignoring5Lt());
        }

        default public SwitcherCheckedTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onPredicate7(Prc1<? super T7> p) {
            return this.onPredicate(p.ignoring6Lt());
        }

        public SwitcherCheckedTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onPredicate(Prc1<? super Tuple7<T1, T2, T3, T4, T5, T6, T7>> var1);

        default public Fnc7<T1, T2, T3, T4, T5, T6, T7, R> onDefaultThrow() {
            return this.onDefaults(SwitcherCheckedAbst.emptyTransformer());
        }

        default public Fnc7<T1, T2, T3, T4, T5, T6, T7, R> onDefaults() {
            return this.onDefaults(Fnc7.empty());
        }

        default public Fnc7<T1, T2, T3, T4, T5, T6, T7, R> onDefaults(R r) {
            return this.onDefaults(SwitcherCheckedAbst.transformerValue(r));
        }

        default public Fnc7<T1, T2, T3, T4, T5, T6, T7, R> onDefaults(Spc<? extends R> s) {
            return this.onDefaults(s.ignoring1());
        }

        default public Fnc7<T1, T2, T3, T4, T5, T6, T7, R> onDefaults(Fnc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
            return this.onDefaults(Fnc7.tuple(f));
        }

        default public Fnc7<T1, T2, T3, T4, T5, T6, T7, R> onDefaults1(Fnc1<? super T1, ? extends R> f) {
            return this.onDefaults(Fnc7.tuple(f.ignoring6Rt()));
        }

        default public Fnc7<T1, T2, T3, T4, T5, T6, T7, R> onDefaults2(Fnc1<? super T2, ? extends R> f) {
            return this.onDefaults(Fnc7.tuple(f.ignoring5Rt().ignoring1Lt()));
        }

        default public Fnc7<T1, T2, T3, T4, T5, T6, T7, R> onDefaults3(Fnc1<? super T3, ? extends R> f) {
            return this.onDefaults(Fnc7.tuple(f.ignoring4Rt().ignoring2Lt()));
        }

        default public Fnc7<T1, T2, T3, T4, T5, T6, T7, R> onDefaults4(Fnc1<? super T4, ? extends R> f) {
            return this.onDefaults(Fnc7.tuple(f.ignoring3Rt().ignoring3Lt()));
        }

        default public Fnc7<T1, T2, T3, T4, T5, T6, T7, R> onDefaults5(Fnc1<? super T5, ? extends R> f) {
            return this.onDefaults(Fnc7.tuple(f.ignoring2Rt().ignoring4Lt()));
        }

        default public Fnc7<T1, T2, T3, T4, T5, T6, T7, R> onDefaults6(Fnc1<? super T6, ? extends R> f) {
            return this.onDefaults(Fnc7.tuple(f.ignoring1Rt().ignoring5Lt()));
        }

        default public Fnc7<T1, T2, T3, T4, T5, T6, T7, R> onDefaults7(Fnc1<? super T7, ? extends R> f) {
            return this.onDefaults(Fnc7.tuple(f.ignoring6Lt()));
        }

        default public Fnc7<T1, T2, T3, T4, T5, T6, T7, R> onDefaults(Fnc1<? super Tuple7<T1, T2, T3, T4, T5, T6, T7>, ? extends R> f) {
            return (Fnc7 & Serializable) (t1, t2, t3, t4, t5, t6, t7) -> this.onDefaultTupled(f).apply((Object) Tuple.of((Object) t1, (Object) t2, (Object) t3, (Object) t4, (Object) t5, (Object) t6, (Object) t7));
        }

    }

    public static interface SwitcherCheckedTranformer7<T1, T2, T3, T4, T5, T6, T7, R> extends SwitcherCheckedTupleTranformer<Tuple7<T1, T2, T3, T4, T5, T6, T7>, R> {

        default public SwitcherCheckedComparator7<T1, T2, T3, T4, T5, T6, T7, R> value(R r) {
            return this.map(SwitcherCheckedAbst.transformerTupleValue(r));
        }

        default public SwitcherCheckedComparator7<T1, T2, T3, T4, T5, T6, T7, R> value(Spc<? extends R> s) {
            return this.map(SwitcherCheckedAbst.transformerTupleSupplier(s));
        }

        default public SwitcherCheckedComparator7<T1, T2, T3, T4, T5, T6, T7, R> map(Fnc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
            return this.map(Fnc7.tuple(f));
        }

        default public SwitcherCheckedComparator7<T1, T2, T3, T4, T5, T6, T7, R> map1(Fnc1<? super T1, ? extends R> f) {
            return this.map(Fnc7.tuple(f.ignoring6Rt()));
        }

        default public SwitcherCheckedComparator7<T1, T2, T3, T4, T5, T6, T7, R> map2(Fnc1<? super T2, ? extends R> f) {
            return this.map(Fnc7.tuple(f.ignoring5Rt().ignoring1Lt()));
        }

        default public SwitcherCheckedComparator7<T1, T2, T3, T4, T5, T6, T7, R> map3(Fnc1<? super T3, ? extends R> f) {
            return this.map(Fnc7.tuple(f.ignoring4Rt().ignoring2Lt()));
        }

        default public SwitcherCheckedComparator7<T1, T2, T3, T4, T5, T6, T7, R> map4(Fnc1<? super T4, ? extends R> f) {
            return this.map(Fnc7.tuple(f.ignoring3Rt().ignoring3Lt()));
        }

        default public SwitcherCheckedComparator7<T1, T2, T3, T4, T5, T6, T7, R> map5(Fnc1<? super T5, ? extends R> f) {
            return this.map(Fnc7.tuple(f.ignoring2Rt().ignoring4Lt()));
        }

        default public SwitcherCheckedComparator7<T1, T2, T3, T4, T5, T6, T7, R> map6(Fnc1<? super T6, ? extends R> f) {
            return this.map(Fnc7.tuple(f.ignoring1Rt().ignoring5Lt()));
        }

        default public SwitcherCheckedComparator7<T1, T2, T3, T4, T5, T6, T7, R> map7(Fnc1<? super T7, ? extends R> f) {
            return this.map(Fnc7.tuple(f.ignoring6Lt()));
        }

        public SwitcherCheckedComparator7<T1, T2, T3, T4, T5, T6, T7, R> map(Fnc1<? super Tuple7<T1, T2, T3, T4, T5, T6, T7>, ? extends R> var1);
    }

    public static class SwitcherChecked6<T1, T2, T3, T4, T5, T6, R> extends SwitcherCheckedAbst<Tuple6<T1, T2, T3, T4, T5, T6>, R> implements SwitcherCheckedTranformer6<T1, T2, T3, T4, T5, T6, R>, SwitcherCheckedComparator6<T1, T2, T3, T4, T5, T6, R> {

        SwitcherChecked6() {
        }

        private SwitcherChecked6(List<Tuple2<Prc1<? super Tuple6<T1, T2, T3, T4, T5, T6>>, Fnc1<? super Tuple6<T1, T2, T3, T4, T5, T6>, ? extends R>>> transformations, Prc1<? super Tuple6<T1, T2, T3, T4, T5, T6>> p, Fnc1<? super Tuple6<T1, T2, T3, T4, T5, T6>, ? extends R> f) {
            super(transformations, p, f);
        }

        private SwitcherChecked6(List<Tuple2<Prc1<? super Tuple6<T1, T2, T3, T4, T5, T6>>, Fnc1<? super Tuple6<T1, T2, T3, T4, T5, T6>, ? extends R>>> transformations, Fnc1<? super Tuple6<T1, T2, T3, T4, T5, T6>, ? extends R> f) {
            super(transformations, f);
        }

        @Override
        public SwitcherCheckedTranformer6<T1, T2, T3, T4, T5, T6, R> onPredicate(Prc1<? super Tuple6<T1, T2, T3, T4, T5, T6>> p) {
            return new SwitcherChecked6(this.transformations, p, SwitcherCheckedAbst.emptyTransformer());
        }

        @Override
        public SwitcherCheckedComparator6<T1, T2, T3, T4, T5, T6, R> map(Fnc1<? super Tuple6<T1, T2, T3, T4, T5, T6>, ? extends R> f) {
            return new SwitcherChecked6<T1, T2, T3, T4, T5, T6, R>(this.transformations, f);
        }

    }

    public static interface SwitcherCheckedComparator6<T1, T2, T3, T4, T5, T6, R> extends SwitcherCheckedTupleComparator<Tuple6<T1, T2, T3, T4, T5, T6>, R> {

        default public SwitcherCheckedTranformer6<T1, T2, T3, T4, T5, T6, R> onEquals(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
            return this.onPredicate(SwitcherCheckedAbst.comparatorTupleValue(Tuple.of(t1, t2, t3, t4, t5, t6)));
        }

        default public SwitcherCheckedTranformer6<T1, T2, T3, T4, T5, T6, R> onEquals(Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> tuple) {
            return this.onPredicate(SwitcherCheckedAbst.comparatorTupleValue(tuple));
        }

        default public SwitcherCheckedTranformer6<T1, T2, T3, T4, T5, T6, R> onEquals1(T1 t1) {
            return this.onPredicate1(SwitcherCheckedAbst.comparatorValue(t1));
        }

        default public SwitcherCheckedTranformer6<T1, T2, T3, T4, T5, T6, R> onEquals2(T2 t2) {
            return this.onPredicate2(SwitcherCheckedAbst.comparatorValue(t2));
        }

        default public SwitcherCheckedTranformer6<T1, T2, T3, T4, T5, T6, R> onEquals3(T3 t3) {
            return this.onPredicate3(SwitcherCheckedAbst.comparatorValue(t3));
        }

        default public SwitcherCheckedTranformer6<T1, T2, T3, T4, T5, T6, R> onEquals4(T4 t4) {
            return this.onPredicate4(SwitcherCheckedAbst.comparatorValue(t4));
        }

        default public SwitcherCheckedTranformer6<T1, T2, T3, T4, T5, T6, R> onEquals5(T5 t5) {
            return this.onPredicate5(SwitcherCheckedAbst.comparatorValue(t5));
        }

        default public SwitcherCheckedTranformer6<T1, T2, T3, T4, T5, T6, R> onEquals6(T6 t6) {
            return this.onPredicate6(SwitcherCheckedAbst.comparatorValue(t6));
        }

        default public SwitcherCheckedTranformer6<T1, T2, T3, T4, T5, T6, R> onEquals(Spc<? extends Tuple6<T1, T2, T3, T4, T5, T6>> s) {
            return this.onPredicate(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer6<T1, T2, T3, T4, T5, T6, R> onEquals1(Spc<? extends T1> s) {
            return this.onPredicate1(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer6<T1, T2, T3, T4, T5, T6, R> onEquals2(Spc<? extends T2> s) {
            return this.onPredicate2(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer6<T1, T2, T3, T4, T5, T6, R> onEquals3(Spc<? extends T3> s) {
            return this.onPredicate3(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer6<T1, T2, T3, T4, T5, T6, R> onEquals4(Spc<? extends T4> s) {
            return this.onPredicate4(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer6<T1, T2, T3, T4, T5, T6, R> onEquals5(Spc<? extends T5> s) {
            return this.onPredicate5(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer6<T1, T2, T3, T4, T5, T6, R> onEquals6(Spc<? extends T6> s) {
            return this.onPredicate6(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer6<T1, T2, T3, T4, T5, T6, R> onPredicate(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
            return this.onPredicate(Prc6.tuple(p));
        }

        public SwitcherCheckedTranformer6<T1, T2, T3, T4, T5, T6, R> onPredicate(Prc1<? super Tuple6<T1, T2, T3, T4, T5, T6>> var1);

        default public SwitcherCheckedTranformer6<T1, T2, T3, T4, T5, T6, R> onPredicate1(Prc1<? super T1> p) {
            return this.onPredicate(p.ignoring5Rt());
        }

        default public SwitcherCheckedTranformer6<T1, T2, T3, T4, T5, T6, R> onPredicate2(Prc1<? super T2> p) {
            return this.onPredicate(p.ignoring4Rt().ignoring1Lt());
        }

        default public SwitcherCheckedTranformer6<T1, T2, T3, T4, T5, T6, R> onPredicate3(Prc1<? super T3> p) {
            return this.onPredicate(p.ignoring3Rt().ignoring2Lt());
        }

        default public SwitcherCheckedTranformer6<T1, T2, T3, T4, T5, T6, R> onPredicate4(Prc1<? super T4> p) {
            return this.onPredicate(p.ignoring2Rt().ignoring3Lt());
        }

        default public SwitcherCheckedTranformer6<T1, T2, T3, T4, T5, T6, R> onPredicate5(Prc1<? super T5> p) {
            return this.onPredicate(p.ignoring1Rt().ignoring4Lt());
        }

        default public SwitcherCheckedTranformer6<T1, T2, T3, T4, T5, T6, R> onPredicate6(Prc1<? super T6> p) {
            return this.onPredicate(p.ignoring5Lt());
        }

        default public Fnc6<T1, T2, T3, T4, T5, T6, R> onDefaultThrow() {
            return this.onDefaults(SwitcherCheckedAbst.emptyTransformer());
        }

        default public Fnc6<T1, T2, T3, T4, T5, T6, R> onDefaults() {
            return this.onDefaults(Fnc6.empty());
        }

        default public Fnc6<T1, T2, T3, T4, T5, T6, R> onDefaults(R r) {
            return this.onDefaults(SwitcherCheckedAbst.transformerValue(r));
        }

        default public Fnc6<T1, T2, T3, T4, T5, T6, R> onDefaults(Spc<? extends R> s) {
            return this.onDefaults(s.ignoring1());
        }

        default public Fnc6<T1, T2, T3, T4, T5, T6, R> onDefaults(Fnc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f) {
            return this.onDefaults(Fnc6.tuple(f));
        }

        default public Fnc6<T1, T2, T3, T4, T5, T6, R> onDefaults1(Fnc1<? super T1, ? extends R> f) {
            return this.onDefaults(Fnc6.tuple(f.ignoring5Rt()));
        }

        default public Fnc6<T1, T2, T3, T4, T5, T6, R> onDefaults2(Fnc1<? super T2, ? extends R> f) {
            return this.onDefaults(Fnc6.tuple(f.ignoring4Rt().ignoring1Lt()));
        }

        default public Fnc6<T1, T2, T3, T4, T5, T6, R> onDefaults3(Fnc1<? super T3, ? extends R> f) {
            return this.onDefaults(Fnc6.tuple(f.ignoring3Rt().ignoring2Lt()));
        }

        default public Fnc6<T1, T2, T3, T4, T5, T6, R> onDefaults4(Fnc1<? super T4, ? extends R> f) {
            return this.onDefaults(Fnc6.tuple(f.ignoring2Rt().ignoring3Lt()));
        }

        default public Fnc6<T1, T2, T3, T4, T5, T6, R> onDefaults5(Fnc1<? super T5, ? extends R> f) {
            return this.onDefaults(Fnc6.tuple(f.ignoring1Rt().ignoring4Lt()));
        }

        default public Fnc6<T1, T2, T3, T4, T5, T6, R> onDefaults6(Fnc1<? super T6, ? extends R> f) {
            return this.onDefaults(Fnc6.tuple(f.ignoring5Lt()));
        }

        default public Fnc6<T1, T2, T3, T4, T5, T6, R> onDefaults(Fnc1<? super Tuple6<T1, T2, T3, T4, T5, T6>, ? extends R> f) {
            return (Fnc6 & Serializable) (t1, t2, t3, t4, t5, t6) -> this.onDefaultTupled(f).apply((Object) Tuple.of((Object) t1, (Object) t2, (Object) t3, (Object) t4, (Object) t5, (Object) t6));
        }

    }

    public static interface SwitcherCheckedTranformer6<T1, T2, T3, T4, T5, T6, R> extends SwitcherCheckedTupleTranformer<Tuple6<T1, T2, T3, T4, T5, T6>, R> {

        default public SwitcherCheckedComparator6<T1, T2, T3, T4, T5, T6, R> value(R r) {
            return this.map(SwitcherCheckedAbst.transformerTupleValue(r));
        }

        default public SwitcherCheckedComparator6<T1, T2, T3, T4, T5, T6, R> value(Spc<? extends R> s) {
            return this.map(SwitcherCheckedAbst.transformerTupleSupplier(s));
        }

        default public SwitcherCheckedComparator6<T1, T2, T3, T4, T5, T6, R> map(Fnc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f) {
            return this.map(Fnc6.tuple(f));
        }

        default public SwitcherCheckedComparator6<T1, T2, T3, T4, T5, T6, R> map1(Fnc1<? super T1, ? extends R> f) {
            return this.map(Fnc6.tuple(f.ignoring5Rt()));
        }

        default public SwitcherCheckedComparator6<T1, T2, T3, T4, T5, T6, R> map2(Fnc1<? super T2, ? extends R> f) {
            return this.map(Fnc6.tuple(f.ignoring4Rt().ignoring1Lt()));
        }

        default public SwitcherCheckedComparator6<T1, T2, T3, T4, T5, T6, R> map3(Fnc1<? super T3, ? extends R> f) {
            return this.map(Fnc6.tuple(f.ignoring3Rt().ignoring2Lt()));
        }

        default public SwitcherCheckedComparator6<T1, T2, T3, T4, T5, T6, R> map4(Fnc1<? super T4, ? extends R> f) {
            return this.map(Fnc6.tuple(f.ignoring2Rt().ignoring3Lt()));
        }

        default public SwitcherCheckedComparator6<T1, T2, T3, T4, T5, T6, R> map5(Fnc1<? super T5, ? extends R> f) {
            return this.map(Fnc6.tuple(f.ignoring1Rt().ignoring4Lt()));
        }

        default public SwitcherCheckedComparator6<T1, T2, T3, T4, T5, T6, R> map6(Fnc1<? super T6, ? extends R> f) {
            return this.map(Fnc6.tuple(f.ignoring5Lt()));
        }

        public SwitcherCheckedComparator6<T1, T2, T3, T4, T5, T6, R> map(Fnc1<? super Tuple6<T1, T2, T3, T4, T5, T6>, ? extends R> var1);
    }

    public static class SwitcherChecked5<T1, T2, T3, T4, T5, R> extends SwitcherCheckedAbst<Tuple5<T1, T2, T3, T4, T5>, R> implements SwitcherCheckedTranformer5<T1, T2, T3, T4, T5, R>, SwitcherCheckedComparator5<T1, T2, T3, T4, T5, R> {

        SwitcherChecked5() {
        }

        private SwitcherChecked5(List<Tuple2<Prc1<? super Tuple5<T1, T2, T3, T4, T5>>, Fnc1<? super Tuple5<T1, T2, T3, T4, T5>, ? extends R>>> transformations, Prc1<? super Tuple5<T1, T2, T3, T4, T5>> p, Fnc1<? super Tuple5<T1, T2, T3, T4, T5>, ? extends R> f) {
            super(transformations, p, f);
        }

        private SwitcherChecked5(List<Tuple2<Prc1<? super Tuple5<T1, T2, T3, T4, T5>>, Fnc1<? super Tuple5<T1, T2, T3, T4, T5>, ? extends R>>> transformations, Fnc1<? super Tuple5<T1, T2, T3, T4, T5>, ? extends R> f) {
            super(transformations, f);
        }

        @Override
        public SwitcherCheckedTranformer5<T1, T2, T3, T4, T5, R> onPredicate(Prc1<? super Tuple5<T1, T2, T3, T4, T5>> p) {
            return new SwitcherChecked5(this.transformations, p, SwitcherCheckedAbst.emptyTransformer());
        }

        @Override
        public SwitcherCheckedComparator5<T1, T2, T3, T4, T5, R> map(Fnc1<? super Tuple5<T1, T2, T3, T4, T5>, ? extends R> f) {
            return new SwitcherChecked5<T1, T2, T3, T4, T5, R>(this.transformations, f);
        }

    }

    public static interface SwitcherCheckedComparator5<T1, T2, T3, T4, T5, R> extends SwitcherCheckedTupleComparator<Tuple5<T1, T2, T3, T4, T5>, R> {

        default public SwitcherCheckedTranformer5<T1, T2, T3, T4, T5, R> onEquals(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
            return this.onPredicate(SwitcherCheckedAbst.comparatorTupleValue(Tuple.of(t1, t2, t3, t4, t5)));
        }

        default public SwitcherCheckedTranformer5<T1, T2, T3, T4, T5, R> onEquals(Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> tuple) {
            return this.onPredicate(SwitcherCheckedAbst.comparatorTupleValue(tuple));
        }

        default public SwitcherCheckedTranformer5<T1, T2, T3, T4, T5, R> onEquals1(T1 t1) {
            return this.onPredicate1(SwitcherCheckedAbst.comparatorValue(t1));
        }

        default public SwitcherCheckedTranformer5<T1, T2, T3, T4, T5, R> onEquals2(T2 t2) {
            return this.onPredicate2(SwitcherCheckedAbst.comparatorValue(t2));
        }

        default public SwitcherCheckedTranformer5<T1, T2, T3, T4, T5, R> onEquals3(T3 t3) {
            return this.onPredicate3(SwitcherCheckedAbst.comparatorValue(t3));
        }

        default public SwitcherCheckedTranformer5<T1, T2, T3, T4, T5, R> onEquals4(T4 t4) {
            return this.onPredicate4(SwitcherCheckedAbst.comparatorValue(t4));
        }

        default public SwitcherCheckedTranformer5<T1, T2, T3, T4, T5, R> onEquals5(T5 t5) {
            return this.onPredicate5(SwitcherCheckedAbst.comparatorValue(t5));
        }

        default public SwitcherCheckedTranformer5<T1, T2, T3, T4, T5, R> onEquals(Spc<? extends Tuple5<T1, T2, T3, T4, T5>> s) {
            return this.onPredicate(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer5<T1, T2, T3, T4, T5, R> onEquals1(Spc<? extends T1> s) {
            return this.onPredicate1(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer5<T1, T2, T3, T4, T5, R> onEquals2(Spc<? extends T2> s) {
            return this.onPredicate2(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer5<T1, T2, T3, T4, T5, R> onEquals3(Spc<? extends T3> s) {
            return this.onPredicate3(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer5<T1, T2, T3, T4, T5, R> onEquals4(Spc<? extends T4> s) {
            return this.onPredicate4(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer5<T1, T2, T3, T4, T5, R> onEquals5(Spc<? extends T5> s) {
            return this.onPredicate5(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer5<T1, T2, T3, T4, T5, R> onPredicate(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
            return this.onPredicate(Prc5.tuple(p));
        }

        default public SwitcherCheckedTranformer5<T1, T2, T3, T4, T5, R> onPredicate1(Prc1<? super T1> p) {
            return this.onPredicate(p.ignoring4Rt());
        }

        default public SwitcherCheckedTranformer5<T1, T2, T3, T4, T5, R> onPredicate2(Prc1<? super T2> p) {
            return this.onPredicate(p.ignoring3Rt().ignoring1Lt());
        }

        default public SwitcherCheckedTranformer5<T1, T2, T3, T4, T5, R> onPredicate3(Prc1<? super T3> p) {
            return this.onPredicate(p.ignoring2Rt().ignoring2Lt());
        }

        default public SwitcherCheckedTranformer5<T1, T2, T3, T4, T5, R> onPredicate4(Prc1<? super T4> p) {
            return this.onPredicate(p.ignoring1Rt().ignoring3Lt());
        }

        default public SwitcherCheckedTranformer5<T1, T2, T3, T4, T5, R> onPredicate5(Prc1<? super T5> p) {
            return this.onPredicate(p.ignoring4Lt());
        }

        public SwitcherCheckedTranformer5<T1, T2, T3, T4, T5, R> onPredicate(Prc1<? super Tuple5<T1, T2, T3, T4, T5>> var1);

        default public Fnc5<T1, T2, T3, T4, T5, R> onDefaultThrow() {
            return this.onDefaults(SwitcherCheckedAbst.emptyTransformer());
        }

        default public Fnc5<T1, T2, T3, T4, T5, R> onDefaults() {
            return this.onDefaults(Fnc5.empty());
        }

        default public Fnc5<T1, T2, T3, T4, T5, R> onDefaults(R r) {
            return this.onDefaults(SwitcherCheckedAbst.transformerValue(r));
        }

        default public Fnc5<T1, T2, T3, T4, T5, R> onDefaults(Spc<? extends R> s) {
            return this.onDefaults(s.ignoring1());
        }

        default public Fnc5<T1, T2, T3, T4, T5, R> onDefaults(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
            return this.onDefaults(Fnc5.tuple(f));
        }

        default public Fnc5<T1, T2, T3, T4, T5, R> onDefaults1(Fnc1<? super T1, ? extends R> f) {
            return this.onDefaults(Fnc5.tuple(f.ignoring4Rt()));
        }

        default public Fnc5<T1, T2, T3, T4, T5, R> onDefaults2(Fnc1<? super T2, ? extends R> f) {
            return this.onDefaults(Fnc5.tuple(f.ignoring3Rt().ignoring1Lt()));
        }

        default public Fnc5<T1, T2, T3, T4, T5, R> onDefaults3(Fnc1<? super T3, ? extends R> f) {
            return this.onDefaults(Fnc5.tuple(f.ignoring2Rt().ignoring2Lt()));
        }

        default public Fnc5<T1, T2, T3, T4, T5, R> onDefaults4(Fnc1<? super T4, ? extends R> f) {
            return this.onDefaults(Fnc5.tuple(f.ignoring1Rt().ignoring3Lt()));
        }

        default public Fnc5<T1, T2, T3, T4, T5, R> onDefaults5(Fnc1<? super T5, ? extends R> f) {
            return this.onDefaults(Fnc5.tuple(f.ignoring4Lt()));
        }

        default public Fnc5<T1, T2, T3, T4, T5, R> onDefaults(Fnc1<? super Tuple5<T1, T2, T3, T4, T5>, ? extends R> f) {
            return (Fnc5 & Serializable) (t1, t2, t3, t4, t5) -> this.onDefaultTupled(f).apply((Object) Tuple.of((Object) t1, (Object) t2, (Object) t3, (Object) t4, (Object) t5));
        }

    }

    public static interface SwitcherCheckedTranformer5<T1, T2, T3, T4, T5, R> extends SwitcherCheckedTupleTranformer<Tuple5<T1, T2, T3, T4, T5>, R> {

        default public SwitcherCheckedComparator5<T1, T2, T3, T4, T5, R> value(R r) {
            return this.map(SwitcherCheckedAbst.transformerTupleValue(r));
        }

        default public SwitcherCheckedComparator5<T1, T2, T3, T4, T5, R> value(Spc<? extends R> s) {
            return this.map(SwitcherCheckedAbst.transformerTupleSupplier(s));
        }

        default public SwitcherCheckedComparator5<T1, T2, T3, T4, T5, R> map(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
            return this.map(Fnc5.tuple(f));
        }

        default public SwitcherCheckedComparator5<T1, T2, T3, T4, T5, R> map1(Fnc1<? super T1, ? extends R> f) {
            return this.map(Fnc5.tuple(f.ignoring4Rt()));
        }

        default public SwitcherCheckedComparator5<T1, T2, T3, T4, T5, R> map2(Fnc1<? super T2, ? extends R> f) {
            return this.map(Fnc5.tuple(f.ignoring3Rt().ignoring1Lt()));
        }

        default public SwitcherCheckedComparator5<T1, T2, T3, T4, T5, R> map3(Fnc1<? super T3, ? extends R> f) {
            return this.map(Fnc5.tuple(f.ignoring2Rt().ignoring2Lt()));
        }

        default public SwitcherCheckedComparator5<T1, T2, T3, T4, T5, R> map4(Fnc1<? super T4, ? extends R> f) {
            return this.map(Fnc5.tuple(f.ignoring1Rt().ignoring3Lt()));
        }

        default public SwitcherCheckedComparator5<T1, T2, T3, T4, T5, R> map5(Fnc1<? super T5, ? extends R> f) {
            return this.map(Fnc5.tuple(f.ignoring4Lt()));
        }

        public SwitcherCheckedComparator5<T1, T2, T3, T4, T5, R> map(Fnc1<? super Tuple5<T1, T2, T3, T4, T5>, ? extends R> var1);
    }

    public static class SwitcherChecked4<T1, T2, T3, T4, R> extends SwitcherCheckedAbst<Tuple4<T1, T2, T3, T4>, R> implements SwitcherCheckedTranformer4<T1, T2, T3, T4, R>, SwitcherCheckedComparator4<T1, T2, T3, T4, R> {

        SwitcherChecked4() {
        }

        private SwitcherChecked4(List<Tuple2<Prc1<? super Tuple4<T1, T2, T3, T4>>, Fnc1<? super Tuple4<T1, T2, T3, T4>, ? extends R>>> transformations, Prc1<? super Tuple4<T1, T2, T3, T4>> p, Fnc1<? super Tuple4<T1, T2, T3, T4>, ? extends R> f) {
            super(transformations, p, f);
        }

        private SwitcherChecked4(List<Tuple2<Prc1<? super Tuple4<T1, T2, T3, T4>>, Fnc1<? super Tuple4<T1, T2, T3, T4>, ? extends R>>> transformations, Fnc1<? super Tuple4<T1, T2, T3, T4>, ? extends R> f) {
            super(transformations, f);
        }

        @Override
        public SwitcherCheckedTranformer4<T1, T2, T3, T4, R> onPredicate(Prc1<? super Tuple4<T1, T2, T3, T4>> p) {
            return new SwitcherChecked4(this.transformations, p, SwitcherCheckedAbst.emptyTransformer());
        }

        @Override
        public SwitcherCheckedComparator4<T1, T2, T3, T4, R> map(Fnc1<? super Tuple4<T1, T2, T3, T4>, ? extends R> f) {
            return new SwitcherChecked4<T1, T2, T3, T4, R>(this.transformations, f);
        }

    }

    public static interface SwitcherCheckedComparator4<T1, T2, T3, T4, R> extends SwitcherCheckedTupleComparator<Tuple4<T1, T2, T3, T4>, R> {

        default public SwitcherCheckedTranformer4<T1, T2, T3, T4, R> onEquals(T1 t1, T2 t2, T3 t3, T4 t4) {
            return this.onPredicate(SwitcherCheckedAbst.comparatorTupleValue(Tuple.of(t1, t2, t3, t4)));
        }

        default public SwitcherCheckedTranformer4<T1, T2, T3, T4, R> onEquals(Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4> tuple) {
            return this.onPredicate(SwitcherCheckedAbst.comparatorTupleValue(tuple));
        }

        default public SwitcherCheckedTranformer4<T1, T2, T3, T4, R> onEquals1(T1 t1) {
            return this.onPredicate1(SwitcherCheckedAbst.comparatorValue(t1));
        }

        default public SwitcherCheckedTranformer4<T1, T2, T3, T4, R> onEquals2(T2 t2) {
            return this.onPredicate2(SwitcherCheckedAbst.comparatorValue(t2));
        }

        default public SwitcherCheckedTranformer4<T1, T2, T3, T4, R> onEquals3(T3 t3) {
            return this.onPredicate3(SwitcherCheckedAbst.comparatorValue(t3));
        }

        default public SwitcherCheckedTranformer4<T1, T2, T3, T4, R> onEquals4(T4 t4) {
            return this.onPredicate4(SwitcherCheckedAbst.comparatorValue(t4));
        }

        default public SwitcherCheckedTranformer4<T1, T2, T3, T4, R> onEquals(Spc<? extends Tuple4<T1, T2, T3, T4>> s) {
            return this.onPredicate(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer4<T1, T2, T3, T4, R> onEquals1(Spc<? extends T1> s) {
            return this.onPredicate1(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer4<T1, T2, T3, T4, R> onEquals2(Spc<? extends T2> s) {
            return this.onPredicate2(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer4<T1, T2, T3, T4, R> onEquals3(Spc<? extends T3> s) {
            return this.onPredicate3(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer4<T1, T2, T3, T4, R> onEquals4(Spc<? extends T4> s) {
            return this.onPredicate4(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer4<T1, T2, T3, T4, R> onPredicate(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p) {
            return this.onPredicate(Prc4.tuple(p));
        }

        public SwitcherCheckedTranformer4<T1, T2, T3, T4, R> onPredicate(Prc1<? super Tuple4<T1, T2, T3, T4>> var1);

        default public SwitcherCheckedTranformer4<T1, T2, T3, T4, R> onPredicate1(Prc1<? super T1> p) {
            return this.onPredicate(p.ignoring3Rt());
        }

        default public SwitcherCheckedTranformer4<T1, T2, T3, T4, R> onPredicate2(Prc1<? super T2> p) {
            return this.onPredicate(p.ignoring2Rt().ignoring1Lt());
        }

        default public SwitcherCheckedTranformer4<T1, T2, T3, T4, R> onPredicate3(Prc1<? super T3> p) {
            return this.onPredicate(p.ignoring1Rt().ignoring2Lt());
        }

        default public SwitcherCheckedTranformer4<T1, T2, T3, T4, R> onPredicate4(Prc1<? super T4> p) {
            return this.onPredicate(p.ignoring3Lt());
        }

        default public Fnc4<T1, T2, T3, T4, R> onDefaultThrow() {
            return this.onDefaults(SwitcherCheckedAbst.emptyTransformer());
        }

        default public Fnc4<T1, T2, T3, T4, R> onDefaults() {
            return this.onDefaults(Fnc4.empty());
        }

        default public Fnc4<T1, T2, T3, T4, R> onDefaults(R r) {
            return this.onDefaults(SwitcherCheckedAbst.transformerValue(r));
        }

        default public Fnc4<T1, T2, T3, T4, R> onDefaults(Spc<? extends R> s) {
            return this.onDefaults(s.ignoring1());
        }

        default public Fnc4<T1, T2, T3, T4, R> onDefaults(Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
            return this.onDefaults(Fnc4.tuple(f));
        }

        default public Fnc4<T1, T2, T3, T4, R> onDefaults1(Fnc1<? super T1, ? extends R> f) {
            return this.onDefaults(Fnc4.tuple(f.ignoring3Rt()));
        }

        default public Fnc4<T1, T2, T3, T4, R> onDefaults2(Fnc1<? super T2, ? extends R> f) {
            return this.onDefaults(Fnc4.tuple(f.ignoring2Rt().ignoring1Lt()));
        }

        default public Fnc4<T1, T2, T3, T4, R> onDefaults3(Fnc1<? super T3, ? extends R> f) {
            return this.onDefaults(Fnc4.tuple(f.ignoring1Rt().ignoring2Lt()));
        }

        default public Fnc4<T1, T2, T3, T4, R> onDefaults4(Fnc1<? super T4, ? extends R> f) {
            return this.onDefaults(Fnc4.tuple(f.ignoring3Lt()));
        }

        default public Fnc4<T1, T2, T3, T4, R> onDefaults(Fnc1<? super Tuple4<T1, T2, T3, T4>, ? extends R> f) {
            return (Fnc4 & Serializable) (t1, t2, t3, t4) -> this.onDefaultTupled(f).apply((Object) Tuple.of((Object) t1, (Object) t2, (Object) t3, (Object) t4));
        }

    }

    public static interface SwitcherCheckedTranformer4<T1, T2, T3, T4, R> extends SwitcherCheckedTupleTranformer<Tuple4<T1, T2, T3, T4>, R> {

        default public SwitcherCheckedComparator4<T1, T2, T3, T4, R> value(R r) {
            return this.map(SwitcherCheckedAbst.transformerTupleValue(r));
        }

        default public SwitcherCheckedComparator4<T1, T2, T3, T4, R> value(Spc<? extends R> s) {
            return this.map(SwitcherCheckedAbst.transformerTupleSupplier(s));
        }

        default public SwitcherCheckedComparator4<T1, T2, T3, T4, R> map(Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
            return this.map(Fnc4.tuple(f));
        }

        default public SwitcherCheckedComparator4<T1, T2, T3, T4, R> map1(Fnc1<? super T1, ? extends R> f) {
            return this.map(Fnc4.tuple(f.ignoring3Rt()));
        }

        default public SwitcherCheckedComparator4<T1, T2, T3, T4, R> map2(Fnc1<? super T2, ? extends R> f) {
            return this.map(Fnc4.tuple(f.ignoring2Rt().ignoring1Lt()));
        }

        default public SwitcherCheckedComparator4<T1, T2, T3, T4, R> map3(Fnc1<? super T3, ? extends R> f) {
            return this.map(Fnc4.tuple(f.ignoring1Rt().ignoring2Lt()));
        }

        default public SwitcherCheckedComparator4<T1, T2, T3, T4, R> map4(Fnc1<? super T4, ? extends R> f) {
            return this.map(Fnc4.tuple(f.ignoring3Lt()));
        }

        public SwitcherCheckedComparator4<T1, T2, T3, T4, R> map(Fnc1<? super Tuple4<T1, T2, T3, T4>, ? extends R> var1);
    }

    public static class SwitcherChecked3<T1, T2, T3, R> extends SwitcherCheckedAbst<Tuple3<T1, T2, T3>, R> implements SwitcherCheckedTranformer3<T1, T2, T3, R>, SwitcherCheckedComparator3<T1, T2, T3, R> {

        SwitcherChecked3() {
        }

        private SwitcherChecked3(List<Tuple2<Prc1<? super Tuple3<T1, T2, T3>>, Fnc1<? super Tuple3<T1, T2, T3>, ? extends R>>> transformations, Prc1<? super Tuple3<T1, T2, T3>> p, Fnc1<? super Tuple3<T1, T2, T3>, ? extends R> f) {
            super(transformations, p, f);
        }

        private SwitcherChecked3(List<Tuple2<Prc1<? super Tuple3<T1, T2, T3>>, Fnc1<? super Tuple3<T1, T2, T3>, ? extends R>>> transformations, Fnc1<? super Tuple3<T1, T2, T3>, ? extends R> f) {
            super(transformations, f);
        }

        @Override
        public SwitcherCheckedTranformer3<T1, T2, T3, R> onPredicate(Prc1<? super Tuple3<T1, T2, T3>> p) {
            return new SwitcherChecked3(this.transformations, p, SwitcherCheckedAbst.emptyTransformer());
        }

        @Override
        public SwitcherCheckedComparator3<T1, T2, T3, R> map(Fnc1<? super Tuple3<T1, T2, T3>, ? extends R> f) {
            return new SwitcherChecked3<T1, T2, T3, R>(this.transformations, f);
        }

    }

    public static interface SwitcherCheckedComparator3<T1, T2, T3, R> extends SwitcherCheckedTupleComparator<Tuple3<T1, T2, T3>, R> {

        default public SwitcherCheckedTranformer3<T1, T2, T3, R> onEquals(T1 t1, T2 t2, T3 t3) {
            return this.onPredicate(SwitcherCheckedAbst.comparatorTupleValue(Tuple.of(t1, t2, t3)));
        }

        default public SwitcherCheckedTranformer3<T1, T2, T3, R> onEquals(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple) {
            return this.onPredicate(SwitcherCheckedAbst.comparatorTupleValue(tuple));
        }

        default public SwitcherCheckedTranformer3<T1, T2, T3, R> onEquals1(T1 t1) {
            return this.onPredicate1(SwitcherCheckedAbst.comparatorValue(t1));
        }

        default public SwitcherCheckedTranformer3<T1, T2, T3, R> onEquals2(T2 t2) {
            return this.onPredicate2(SwitcherCheckedAbst.comparatorValue(t2));
        }

        default public SwitcherCheckedTranformer3<T1, T2, T3, R> onEquals3(T3 t3) {
            return this.onPredicate3(SwitcherCheckedAbst.comparatorValue(t3));
        }

        default public SwitcherCheckedTranformer3<T1, T2, T3, R> onEquals(Spc<? extends Tuple3<T1, T2, T3>> s) {
            return this.onPredicate(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer3<T1, T2, T3, R> onEquals1(Spc<? extends T1> s) {
            return this.onPredicate1(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer3<T1, T2, T3, R> onEquals2(Spc<? extends T2> s) {
            return this.onPredicate2(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer3<T1, T2, T3, R> onEquals3(Spc<? extends T3> s) {
            return this.onPredicate3(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer3<T1, T2, T3, R> onPredicate(Prc3<? super T1, ? super T2, ? super T3> p) {
            return this.onPredicate(Prc3.tuple(p));
        }

        public SwitcherCheckedTranformer3<T1, T2, T3, R> onPredicate(Prc1<? super Tuple3<T1, T2, T3>> var1);

        default public SwitcherCheckedTranformer3<T1, T2, T3, R> onPredicate1(Prc1<? super T1> p) {
            return this.onPredicate(p.ignoring2Rt());
        }

        default public SwitcherCheckedTranformer3<T1, T2, T3, R> onPredicate2(Prc1<? super T2> p) {
            return this.onPredicate(p.ignoring1Rt().ignoring1Lt());
        }

        default public SwitcherCheckedTranformer3<T1, T2, T3, R> onPredicate3(Prc1<? super T3> p) {
            return this.onPredicate(p.ignoring2Lt());
        }

        default public Fnc3<T1, T2, T3, R> onDefaultThrow() {
            return this.onDefaults(SwitcherCheckedAbst.emptyTransformer());
        }

        default public Fnc3<T1, T2, T3, R> onDefaults() {
            return this.onDefaults(Fnc3.empty());
        }

        default public Fnc3<T1, T2, T3, R> onDefaults(R r) {
            return this.onDefaults(SwitcherCheckedAbst.transformerValue(r));
        }

        default public Fnc3<T1, T2, T3, R> onDefaults(Spc<? extends R> s) {
            return this.onDefaults(s.ignoring1());
        }

        default public Fnc3<T1, T2, T3, R> onDefaults(Fnc3<? super T1, ? super T2, ? super T3, ? extends R> f) {
            return this.onDefaults(Fnc3.tuple(f));
        }

        default public Fnc3<T1, T2, T3, R> onDefaults1(Fnc1<? super T1, ? extends R> f) {
            return this.onDefaults(Fnc3.tuple(f.ignoring2Rt()));
        }

        default public Fnc3<T1, T2, T3, R> onDefaults2(Fnc1<? super T2, ? extends R> f) {
            return this.onDefaults(Fnc3.tuple(f.ignoring1Rt().ignoring1Lt()));
        }

        default public Fnc3<T1, T2, T3, R> onDefaults3(Fnc1<? super T3, ? extends R> f) {
            return this.onDefaults(Fnc3.tuple(f.ignoring2Lt()));
        }

        default public Fnc3<T1, T2, T3, R> onDefaults(Fnc1<? super Tuple3<T1, T2, T3>, ? extends R> f) {
            return (Fnc3 & Serializable) (t1, t2, t3) -> this.onDefaultTupled(f).apply((Object) Tuple.of((Object) t1, (Object) t2, (Object) t3));
        }

    }

    public static interface SwitcherCheckedTranformer3<T1, T2, T3, R> extends SwitcherCheckedTupleTranformer<Tuple3<T1, T2, T3>, R> {

        default public SwitcherCheckedComparator3<T1, T2, T3, R> value(R r) {
            return this.map(SwitcherCheckedAbst.transformerTupleValue(r));
        }

        default public SwitcherCheckedComparator3<T1, T2, T3, R> value(Spc<? extends R> s) {
            return this.map(SwitcherCheckedAbst.transformerTupleSupplier(s));
        }

        default public SwitcherCheckedComparator3<T1, T2, T3, R> map(Fnc3<? super T1, ? super T2, ? super T3, ? extends R> f) {
            return this.map(Fnc3.tuple(f));
        }

        default public SwitcherCheckedComparator3<T1, T2, T3, R> map1(Fnc1<? super T1, ? extends R> f) {
            return this.map(Fnc3.tuple(f.ignoring2Rt()));
        }

        default public SwitcherCheckedComparator3<T1, T2, T3, R> map2(Fnc1<? super T2, ? extends R> f) {
            return this.map(Fnc3.tuple(f.ignoring1Rt().ignoring1Lt()));
        }

        default public SwitcherCheckedComparator3<T1, T2, T3, R> map3(Fnc1<? super T3, ? extends R> f) {
            return this.map(Fnc3.tuple(f.ignoring2Lt()));
        }

        public SwitcherCheckedComparator3<T1, T2, T3, R> map(Fnc1<? super Tuple3<T1, T2, T3>, ? extends R> var1);
    }

    public static class SwitcherChecked2<T1, T2, R> extends SwitcherCheckedAbst<Tuple2<T1, T2>, R> implements SwitcherCheckedTranformer2<T1, T2, R>, SwitcherCheckedComparator2<T1, T2, R> {

        SwitcherChecked2() {
        }

        private SwitcherChecked2(List<Tuple2<Prc1<? super Tuple2<T1, T2>>, Fnc1<? super Tuple2<T1, T2>, ? extends R>>> transformations, Prc1<? super Tuple2<T1, T2>> p, Fnc1<? super Tuple2<T1, T2>, ? extends R> f) {
            super(transformations, p, f);
        }

        private SwitcherChecked2(List<Tuple2<Prc1<? super Tuple2<T1, T2>>, Fnc1<? super Tuple2<T1, T2>, ? extends R>>> transformations, Fnc1<? super Tuple2<T1, T2>, ? extends R> f) {
            super(transformations, f);
        }

        @Override
        public SwitcherCheckedTranformer2<T1, T2, R> onPredicate(Prc1<? super Tuple2<T1, T2>> p) {
            return new SwitcherChecked2(this.transformations, p, SwitcherCheckedAbst.emptyTransformer());
        }

        @Override
        public SwitcherCheckedComparator2<T1, T2, R> map(Fnc1<? super Tuple2<T1, T2>, ? extends R> f) {
            return new SwitcherChecked2<T1, T2, R>(this.transformations, f);
        }

    }

    public static interface SwitcherCheckedComparator2<T1, T2, R> extends SwitcherCheckedTupleComparator<Tuple2<T1, T2>, R> {

        default public SwitcherCheckedTranformer2<T1, T2, R> onEquals(T1 t1, T2 t2) {
            return this.onPredicate(SwitcherCheckedAbst.comparatorTupleValue(Tuple.of(t1, t2)));
        }

        default public SwitcherCheckedTranformer2<T1, T2, R> onEquals(Tuple2<? extends T1, ? extends T2> tuple) {
            return this.onPredicate(SwitcherCheckedAbst.comparatorTupleValue(tuple));
        }

        default public SwitcherCheckedTranformer2<T1, T2, R> onEquals1(T1 t1) {
            return this.onPredicate1(SwitcherCheckedAbst.comparatorValue(t1));
        }

        default public SwitcherCheckedTranformer2<T1, T2, R> onEquals2(T2 t2) {
            return this.onPredicate2(SwitcherCheckedAbst.comparatorValue(t2));
        }

        default public SwitcherCheckedTranformer2<T1, T2, R> onEquals(Spc<? extends Tuple2<T1, T2>> s) {
            return this.onPredicate(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer2<T1, T2, R> onEquals1(Spc<? extends T1> s) {
            return this.onPredicate1(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer2<T1, T2, R> onEquals2(Spc<? extends T2> s) {
            return this.onPredicate2(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        default public SwitcherCheckedTranformer2<T1, T2, R> onPredicate(Prc2<? super T1, ? super T2> p) {
            return this.onPredicate(Prc2.tuple(p));
        }

        public SwitcherCheckedTranformer2<T1, T2, R> onPredicate(Prc1<? super Tuple2<T1, T2>> var1);

        default public SwitcherCheckedTranformer2<T1, T2, R> onPredicate1(Prc1<? super T1> p) {
            return this.onPredicate(p.ignoring1Rt());
        }

        default public SwitcherCheckedTranformer2<T1, T2, R> onPredicate2(Prc1<? super T2> p) {
            return this.onPredicate(p.ignoring1Lt());
        }

        default public Fnc2<T1, T2, R> onDefaultThrow() {
            return this.onDefaults(SwitcherCheckedAbst.emptyTransformer());
        }

        default public Fnc2<T1, T2, R> onDefaults() {
            return this.onDefaults(Fnc2.empty());
        }

        default public Fnc2<T1, T2, R> onDefaults(R r) {
            return this.onDefaults(SwitcherCheckedAbst.transformerValue(r));
        }

        default public Fnc2<T1, T2, R> onDefaults(Spc<? extends R> s) {
            return this.onDefaults(s.ignoring1());
        }

        default public Fnc2<T1, T2, R> onDefaults(Fnc2<? super T1, ? super T2, ? extends R> f) {
            return this.onDefaults(Fnc2.tuple(f));
        }

        default public Fnc2<T1, T2, R> onDefaults1(Fnc1<? super T1, ? extends R> f) {
            return this.onDefaults(Fnc2.tuple(f.ignoring1Rt()));
        }

        default public Fnc2<T1, T2, R> onDefaults2(Fnc1<? super T2, ? extends R> f) {
            return this.onDefaults(Fnc2.tuple(f.ignoring1Lt()));
        }

        default public Fnc2<T1, T2, R> onDefaults(Fnc1<? super Tuple2<T1, T2>, ? extends R> f) {
            return (Fnc2 & Serializable) (t1, t2) -> this.onDefaultTupled(f).apply((Object) Tuple.of((Object) t1, (Object) t2));
        }

    }

    public static interface SwitcherCheckedTranformer2<T1, T2, R> extends SwitcherCheckedTupleTranformer<Tuple2<T1, T2>, R> {

        default public SwitcherCheckedComparator2<T1, T2, R> value(R r) {
            return this.map(SwitcherCheckedAbst.transformerTupleValue(r));
        }

        default public SwitcherCheckedComparator2<T1, T2, R> value(Spc<? extends R> s) {
            return this.map(SwitcherCheckedAbst.transformerTupleSupplier(s));
        }

        default public SwitcherCheckedComparator2<T1, T2, R> map(Fnc2<? super T1, ? super T2, ? extends R> f) {
            return this.map(Fnc2.tuple(f));
        }

        default public SwitcherCheckedComparator2<T1, T2, R> map1(Fnc1<? super T1, ? extends R> f) {
            return this.map(Fnc2.tuple(f.ignoring1Rt()));
        }

        default public SwitcherCheckedComparator2<T1, T2, R> map2(Fnc1<? super T2, ? extends R> f) {
            return this.map(Fnc2.tuple(f.ignoring1Lt()));
        }

        public SwitcherCheckedComparator2<T1, T2, R> map(Fnc1<? super Tuple2<T1, T2>, ? extends R> var1);
    }

    public static class SwitcherChecked1<T1, R> extends SwitcherCheckedBaseAbst<Tuple1<T1>, R> implements SwitcherCheckedTranformer1<T1, R>, SwitcherCheckedComparator1<T1, R> {

        SwitcherChecked1() {
        }

        private SwitcherChecked1(List<Tuple2<Prc1<? super Tuple1<T1>>, Fnc1<? super Tuple1<T1>, ? extends R>>> transformations, Prc1<? super Tuple1<T1>> p, Fnc1<? super Tuple1<T1>, ? extends R> f) {
            super(transformations, p, f);
        }

        private SwitcherChecked1(List<Tuple2<Prc1<? super Tuple1<T1>>, Fnc1<? super Tuple1<T1>, ? extends R>>> transformations, Fnc1<? super Tuple1<T1>, ? extends R> f) {
            super(transformations, f);
        }

        @Override
        public SwitcherCheckedTranformer1<T1, R> onPredicate(Prc1<? super T1> p) {
            return new SwitcherChecked1(this.transformations, Prc1.tuple(p), SwitcherCheckedAbst.emptyTransformer());
        }

        @Override
        public SwitcherCheckedComparator1<T1, R> map(Fnc1<? super T1, ? extends R> f) {
            return new SwitcherChecked1<T1, R>(this.transformations, Fnc1.tuple(f));
        }

    }

    public static interface SwitcherCheckedComparator1<T1, R> extends SwitcherCheckedComparator<Tuple1<T1>, R> {

        default public SwitcherCheckedTranformer1<T1, R> onEquals(T1 t1) {
            return this.onPredicate(SwitcherCheckedAbst.comparatorValue(t1));
        }

        default public SwitcherCheckedTranformer1<T1, R> onEquals(Tuple1<? extends T1> tuple) {
            return this.onPredicate(SwitcherCheckedAbst.comparatorValue(tuple._1()));
        }

        default public SwitcherCheckedTranformer1<T1, R> onEquals(Spc<? extends T1> s) {
            return this.onPredicate(SwitcherCheckedAbst.comparatorSupplierChecked(s));
        }

        public SwitcherCheckedTranformer1<T1, R> onPredicate(Prc1<? super T1> var1);

        default public Fnc1<T1, R> onDefaultThrow() {
            return this.onDefaults(SwitcherCheckedAbst.emptyTransformer());
        }

        default public Fnc1<T1, R> onDefaults() {
            return this.onDefaults(Fnc1.empty());
        }

        default public Fnc1<T1, R> onDefaults(R r) {
            return this.onDefaults(SwitcherCheckedAbst.transformerValue(r));
        }

        default public Fnc1<T1, R> onDefaults(Spc<? extends R> s) {
            return this.onDefaults(s.ignoring1());
        }

        default public Fnc1<T1, R> onDefaults(Fnc1<? super T1, ? extends R> f) {
            return (Fnc1 & Serializable) t1 -> this.onDefaultTupled(Fnc1.tuple(f)).apply((Object) Tuple.of((Object) t1));
        }

    }

    public static interface SwitcherCheckedTranformer1<T1, R> extends SwitcherCheckedTranformer<Tuple1<T1>, R> {

        default public SwitcherCheckedComparator1<T1, R> value(R r) {
            return this.map(SwitcherCheckedAbst.transformerValue(r));
        }

        default public SwitcherCheckedComparator1<T1, R> value(Spc<? extends R> s) {
            return this.map(s.ignoring1());
        }

        public SwitcherCheckedComparator1<T1, R> map(Fnc1<? super T1, ? extends R> var1);
    }

    public static interface SwitcherCheckedTupleComparator<TUPLE extends Tuple, R> extends SwitcherCheckedComparator<TUPLE, R> {

        public SwitcherCheckedTupleTranformer<TUPLE, R> onPredicate(Prc1<? super TUPLE> var1);
    }

    public static interface SwitcherCheckedComparator<TUPLE extends Tuple, R> {

        public Fnc1<TUPLE, R> onDefaultTupled(Fnc1<? super TUPLE, ? extends R> var1);
    }

    public static interface SwitcherCheckedTupleTranformer<TUPLE extends Tuple, R> extends SwitcherCheckedTranformer<TUPLE, R> {

        public SwitcherCheckedTupleComparator<TUPLE, R> map(Fnc1<? super TUPLE, ? extends R> var1);
    }

    public static interface SwitcherCheckedTranformer<TUPLE extends Tuple, R> {

    }

    public static abstract class SwitcherAbst<TUPLE extends Tuple, R> extends SwitcherBaseAbst<TUPLE, R> implements Switcher<TUPLE, R>, SwitcherTupleComparator<TUPLE, R>, SwitcherTupleTranformer<TUPLE, R> {

        SwitcherAbst() {
        }

        private SwitcherAbst(List<Tuple2<Pr1<? super TUPLE>, Fn1<? super TUPLE, ? extends R>>> transformations, Pr1<? super TUPLE> p, Fn1<? super TUPLE, ? extends R> f) {
            super(transformations, p, f);
        }

        private SwitcherAbst(List<Tuple2<Pr1<? super TUPLE>, Fn1<? super TUPLE, ? extends R>>> transformations, Fn1<? super TUPLE, ? extends R> f) {
            super(transformations, f);
        }

        @Override
        public abstract SwitcherTupleComparator<TUPLE, R> map(Fn1<? super TUPLE, ? extends R> var1);

        @Override
        public abstract SwitcherTupleTranformer<TUPLE, R> onPredicate(Pr1<? super TUPLE> var1);

        static <T, S> Fn1<T, S> emptyTransformer() {
            return (Fn1 & Serializable) ignore -> {
                throw new UnsupportedOperationException("Unimplemented transformer method");
            };
        }

        static <TUPLE extends Tuple, R> Fn1<TUPLE, R> transformerTupleValue(R r) {
            return Fn1.value(r);
        }

        static <TUPLE extends Tuple, R> Fn1<TUPLE, R> transformerTupleSupplier(Sp<? extends R> s) {
            return Sp.narrow(s).toFunction().ignoring1();
        }

        static <T, R> Fn1<T, R> transformerValue(R r) {
            return Fn1.value(r);
        }

        static <TUPLE extends Tuple> Pr1<TUPLE> comparatorTupleValue(TUPLE tuple) {
            return (Pr1 & Serializable) t -> Objects.equals(t, tuple);
        }

        static <T> Pr1<T> comparatorValue(T t) {
            return (Pr1 & Serializable) o -> Objects.equals(o, t);
        }

        static <T> Pr1<T> comparatorSupplierChecked(Sp<? extends T> s) {
            return (Pr1 & Serializable) t -> Objects.equals(t, s.toFunction().ignoring1());
        }

    }

    public static abstract class SwitcherBaseAbst<TUPLE extends Tuple, R> implements Switcher<TUPLE, R>, SwitcherComparator<TUPLE, R>, SwitcherTranformer<TUPLE, R> {

        List<Tuple2<Pr1<? super TUPLE>, Fn1<? super TUPLE, ? extends R>>> transformations;

        SwitcherBaseAbst() {
            this.transformations = List.of((Object[]) new Tuple2[0]);
        }

        private SwitcherBaseAbst(List<Tuple2<Pr1<? super TUPLE>, Fn1<? super TUPLE, ? extends R>>> transformations, Pr1<? super TUPLE> p, Fn1<? super TUPLE, ? extends R> f) {
            this.transformations = transformations.append((Object) Tuple.of(p, f));
        }

        private SwitcherBaseAbst(List<Tuple2<Pr1<? super TUPLE>, Fn1<? super TUPLE, ? extends R>>> transformations, Fn1<? super TUPLE, ? extends R> f) {
            this.transformations = transformations.dropRight(1).append((Object) Tuple.of((Object) ((Tuple2) transformations.last())._1(), f));
        }

        static <T> T throwNotMatching() {
            throw new IllegalStateException("At least one predicate must match on iterative map on");
        }

        @Override
        public Fn1<TUPLE, R> onDefaultTupled(Fn1<? super TUPLE, ? extends R> f) {
            this.transformations = this.transformations.append((Object) Tuple.of(Pr1.value(true), f));
            return (Fn1 & Serializable) elem -> {
                for (Tuple2 tuple : this.transformations) {
                    if (!((Pr1) tuple._1()).test(elem)) continue;
                    return ((Fn1) tuple._2()).apply(elem);
                }
                return SwitcherBaseAbst.throwNotMatching();
            };
        }

    }

    public static class Switcher8<T1, T2, T3, T4, T5, T6, T7, T8, R> extends SwitcherAbst<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, R> implements SwitcherTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R>, SwitcherComparator8<T1, T2, T3, T4, T5, T6, T7, T8, R> {

        Switcher8() {
        }

        private Switcher8(List<Tuple2<Pr1<? super Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>>, Fn1<? super Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, ? extends R>>> transformations, Pr1<? super Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> p, Fn1<? super Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, ? extends R> f) {
            super(transformations, p, f);
        }

        private Switcher8(List<Tuple2<Pr1<? super Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>>, Fn1<? super Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, ? extends R>>> transformations, Fn1<? super Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, ? extends R> f) {
            super(transformations, f);
        }

        @Override
        public SwitcherTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onPredicate(Pr1<? super Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> p) {
            return new Switcher8(this.transformations, p, SwitcherAbst.emptyTransformer());
        }

        @Override
        public SwitcherComparator8<T1, T2, T3, T4, T5, T6, T7, T8, R> map(Fn1<? super Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, ? extends R> f) {
            return new Switcher8<T1, T2, T3, T4, T5, T6, T7, T8, R>(this.transformations, f);
        }

    }

    public static interface SwitcherComparator8<T1, T2, T3, T4, T5, T6, T7, T8, R> extends SwitcherTupleComparator<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, R> {

        default public SwitcherTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onEquals(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
            return this.onPredicate(SwitcherAbst.comparatorTupleValue(Tuple.of(t1, t2, t3, t4, t5, t6, t7, t8)));
        }

        default public SwitcherTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onEquals(Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8> tuple) {
            return this.onPredicate(SwitcherAbst.comparatorTupleValue(tuple));
        }

        default public SwitcherTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onEquals1(T1 t1) {
            return this.onPredicate1(SwitcherAbst.comparatorValue(t1));
        }

        default public SwitcherTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onEquals2(T2 t2) {
            return this.onPredicate2(SwitcherAbst.comparatorValue(t2));
        }

        default public SwitcherTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onEquals3(T3 t3) {
            return this.onPredicate3(SwitcherAbst.comparatorValue(t3));
        }

        default public SwitcherTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onEquals4(T4 t4) {
            return this.onPredicate4(SwitcherAbst.comparatorValue(t4));
        }

        default public SwitcherTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onEquals5(T5 t5) {
            return this.onPredicate5(SwitcherAbst.comparatorValue(t5));
        }

        default public SwitcherTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onEquals6(T6 t6) {
            return this.onPredicate6(SwitcherAbst.comparatorValue(t6));
        }

        default public SwitcherTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onEquals7(T7 t7) {
            return this.onPredicate7(SwitcherAbst.comparatorValue(t7));
        }

        default public SwitcherTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onEquals8(T8 t8) {
            return this.onPredicate8(SwitcherAbst.comparatorValue(t8));
        }

        default public SwitcherTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onEquals(Sp<? extends Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> s) {
            return this.onPredicate(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onEquals1(Sp<? extends T1> s) {
            return this.onPredicate1(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onEquals2(Sp<? extends T2> s) {
            return this.onPredicate2(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onEquals3(Sp<? extends T3> s) {
            return this.onPredicate3(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onEquals4(Sp<? extends T4> s) {
            return this.onPredicate4(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onEquals5(Sp<? extends T5> s) {
            return this.onPredicate5(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onEquals6(Sp<? extends T6> s) {
            return this.onPredicate6(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onEquals7(Sp<? extends T7> s) {
            return this.onPredicate7(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onEquals8(Sp<? extends T8> s) {
            return this.onPredicate8(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onPredicate(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
            return this.onPredicate(Pr8.tuple(p));
        }

        public SwitcherTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onPredicate(Pr1<? super Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> var1);

        default public SwitcherTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onPredicate1(Pr1<? super T1> p) {
            return this.onPredicate(p.ignoring7Rt());
        }

        default public SwitcherTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onPredicate2(Pr1<? super T2> p) {
            return this.onPredicate(p.ignoring6Rt().ignoring1Lt());
        }

        default public SwitcherTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onPredicate3(Pr1<? super T3> p) {
            return this.onPredicate(p.ignoring5Rt().ignoring2Lt());
        }

        default public SwitcherTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onPredicate4(Pr1<? super T4> p) {
            return this.onPredicate(p.ignoring4Rt().ignoring3Lt());
        }

        default public SwitcherTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onPredicate5(Pr1<? super T5> p) {
            return this.onPredicate(p.ignoring3Rt().ignoring4Lt());
        }

        default public SwitcherTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onPredicate6(Pr1<? super T6> p) {
            return this.onPredicate(p.ignoring2Rt().ignoring5Lt());
        }

        default public SwitcherTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onPredicate7(Pr1<? super T7> p) {
            return this.onPredicate(p.ignoring1Rt().ignoring6Lt());
        }

        default public SwitcherTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> onPredicate8(Pr1<? super T8> p) {
            return this.onPredicate(p.ignoring7Lt());
        }

        default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> onDefaultThrow() {
            return this.onDefaults(SwitcherAbst.emptyTransformer());
        }

        default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> onDefaults() {
            return this.onDefaults(Fn8.empty());
        }

        default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> onDefaults(R r) {
            return this.onDefaults(SwitcherAbst.transformerValue(r));
        }

        default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> onDefaults(Sp<? extends R> s) {
            return this.onDefaults(s.toFunction().ignoring1());
        }

        default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> onDefaults(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
            return this.onDefaults(Fn8.tuple(f));
        }

        default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> onDefaults1(Fn1<? super T1, ? extends R> f) {
            return this.onDefaults(Fn8.tuple(f.ignoring7Rt()));
        }

        default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> onDefaults2(Fn1<? super T2, ? extends R> f) {
            return this.onDefaults(Fn8.tuple(f.ignoring6Rt().ignoring1Lt()));
        }

        default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> onDefaults3(Fn1<? super T3, ? extends R> f) {
            return this.onDefaults(Fn8.tuple(f.ignoring5Rt().ignoring2Lt()));
        }

        default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> onDefaults4(Fn1<? super T4, ? extends R> f) {
            return this.onDefaults(Fn8.tuple(f.ignoring4Rt().ignoring3Lt()));
        }

        default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> onDefaults5(Fn1<? super T5, ? extends R> f) {
            return this.onDefaults(Fn8.tuple(f.ignoring3Rt().ignoring4Lt()));
        }

        default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> onDefaults6(Fn1<? super T6, ? extends R> f) {
            return this.onDefaults(Fn8.tuple(f.ignoring2Rt().ignoring5Lt()));
        }

        default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> onDefaults7(Fn1<? super T7, ? extends R> f) {
            return this.onDefaults(Fn8.tuple(f.ignoring1Rt().ignoring6Lt()));
        }

        default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> onDefaults8(Fn1<? super T8, ? extends R> f) {
            return this.onDefaults(Fn8.tuple(f.ignoring7Lt()));
        }

        default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> onDefaults(Fn1<? super Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, ? extends R> f) {
            return (Fn8 & Serializable) (t1, t2, t3, t4, t5, t6, t7, t8) -> this.onDefaultTupled(f).apply((Object) Tuple.of((Object) t1, (Object) t2, (Object) t3, (Object) t4, (Object) t5, (Object) t6, (Object) t7, (Object) t8));
        }

    }

    public static interface SwitcherTranformer8<T1, T2, T3, T4, T5, T6, T7, T8, R> extends SwitcherTupleTranformer<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, R> {

        default public SwitcherComparator8<T1, T2, T3, T4, T5, T6, T7, T8, R> value(R r) {
            return this.map(SwitcherAbst.transformerTupleValue(r));
        }

        default public SwitcherComparator8<T1, T2, T3, T4, T5, T6, T7, T8, R> value(Sp<? extends R> s) {
            return this.map(SwitcherAbst.transformerTupleSupplier(s));
        }

        default public SwitcherComparator8<T1, T2, T3, T4, T5, T6, T7, T8, R> map(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
            return this.map(Fn8.tuple(f));
        }

        default public SwitcherComparator8<T1, T2, T3, T4, T5, T6, T7, T8, R> map1(Fn1<? super T1, ? extends R> f) {
            return this.map(Fn8.tuple(f.ignoring7Rt()));
        }

        default public SwitcherComparator8<T1, T2, T3, T4, T5, T6, T7, T8, R> map2(Fn1<? super T2, ? extends R> f) {
            return this.map(Fn8.tuple(f.ignoring6Rt().ignoring1Lt()));
        }

        default public SwitcherComparator8<T1, T2, T3, T4, T5, T6, T7, T8, R> map3(Fn1<? super T3, ? extends R> f) {
            return this.map(Fn8.tuple(f.ignoring5Rt().ignoring2Lt()));
        }

        default public SwitcherComparator8<T1, T2, T3, T4, T5, T6, T7, T8, R> map4(Fn1<? super T4, ? extends R> f) {
            return this.map(Fn8.tuple(f.ignoring4Rt().ignoring3Lt()));
        }

        default public SwitcherComparator8<T1, T2, T3, T4, T5, T6, T7, T8, R> map5(Fn1<? super T5, ? extends R> f) {
            return this.map(Fn8.tuple(f.ignoring3Rt().ignoring4Lt()));
        }

        default public SwitcherComparator8<T1, T2, T3, T4, T5, T6, T7, T8, R> map6(Fn1<? super T6, ? extends R> f) {
            return this.map(Fn8.tuple(f.ignoring2Rt().ignoring5Lt()));
        }

        default public SwitcherComparator8<T1, T2, T3, T4, T5, T6, T7, T8, R> map7(Fn1<? super T7, ? extends R> f) {
            return this.map(Fn8.tuple(f.ignoring1Rt().ignoring6Lt()));
        }

        default public SwitcherComparator8<T1, T2, T3, T4, T5, T6, T7, T8, R> map8(Fn1<? super T8, ? extends R> f) {
            return this.map(Fn8.tuple(f.ignoring7Lt()));
        }

        public SwitcherComparator8<T1, T2, T3, T4, T5, T6, T7, T8, R> map(Fn1<? super Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, ? extends R> var1);
    }

    public static class Switcher7<T1, T2, T3, T4, T5, T6, T7, R> extends SwitcherAbst<Tuple7<T1, T2, T3, T4, T5, T6, T7>, R> implements SwitcherTranformer7<T1, T2, T3, T4, T5, T6, T7, R>, SwitcherComparator7<T1, T2, T3, T4, T5, T6, T7, R> {

        Switcher7() {
        }

        private Switcher7(List<Tuple2<Pr1<? super Tuple7<T1, T2, T3, T4, T5, T6, T7>>, Fn1<? super Tuple7<T1, T2, T3, T4, T5, T6, T7>, ? extends R>>> transformations, Pr1<? super Tuple7<T1, T2, T3, T4, T5, T6, T7>> p, Fn1<? super Tuple7<T1, T2, T3, T4, T5, T6, T7>, ? extends R> f) {
            super(transformations, p, f);
        }

        private Switcher7(List<Tuple2<Pr1<? super Tuple7<T1, T2, T3, T4, T5, T6, T7>>, Fn1<? super Tuple7<T1, T2, T3, T4, T5, T6, T7>, ? extends R>>> transformations, Fn1<? super Tuple7<T1, T2, T3, T4, T5, T6, T7>, ? extends R> f) {
            super(transformations, f);
        }

        @Override
        public SwitcherTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onPredicate(Pr1<? super Tuple7<T1, T2, T3, T4, T5, T6, T7>> p) {
            return new Switcher7(this.transformations, p, SwitcherAbst.emptyTransformer());
        }

        @Override
        public SwitcherComparator7<T1, T2, T3, T4, T5, T6, T7, R> map(Fn1<? super Tuple7<T1, T2, T3, T4, T5, T6, T7>, ? extends R> f) {
            return new Switcher7<T1, T2, T3, T4, T5, T6, T7, R>(this.transformations, f);
        }

    }

    public static interface SwitcherComparator7<T1, T2, T3, T4, T5, T6, T7, R> extends SwitcherTupleComparator<Tuple7<T1, T2, T3, T4, T5, T6, T7>, R> {

        default public SwitcherTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onEquals(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
            return this.onPredicate(SwitcherAbst.comparatorTupleValue(Tuple.of(t1, t2, t3, t4, t5, t6, t7)));
        }

        default public SwitcherTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onEquals(Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> tuple) {
            return this.onPredicate(SwitcherAbst.comparatorTupleValue(tuple));
        }

        default public SwitcherTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onEquals1(T1 t1) {
            return this.onPredicate1(SwitcherAbst.comparatorValue(t1));
        }

        default public SwitcherTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onEquals2(T2 t2) {
            return this.onPredicate2(SwitcherAbst.comparatorValue(t2));
        }

        default public SwitcherTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onEquals3(T3 t3) {
            return this.onPredicate3(SwitcherAbst.comparatorValue(t3));
        }

        default public SwitcherTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onEquals4(T4 t4) {
            return this.onPredicate4(SwitcherAbst.comparatorValue(t4));
        }

        default public SwitcherTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onEquals5(T5 t5) {
            return this.onPredicate5(SwitcherAbst.comparatorValue(t5));
        }

        default public SwitcherTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onEquals6(T6 t6) {
            return this.onPredicate6(SwitcherAbst.comparatorValue(t6));
        }

        default public SwitcherTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onEquals7(T7 t7) {
            return this.onPredicate7(SwitcherAbst.comparatorValue(t7));
        }

        default public SwitcherTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onEquals(Sp<? extends Tuple7<T1, T2, T3, T4, T5, T6, T7>> s) {
            return this.onPredicate(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onEquals1(Sp<? extends T1> s) {
            return this.onPredicate1(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onEquals2(Sp<? extends T2> s) {
            return this.onPredicate2(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onEquals3(Sp<? extends T3> s) {
            return this.onPredicate3(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onEquals4(Sp<? extends T4> s) {
            return this.onPredicate4(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onEquals5(Sp<? extends T5> s) {
            return this.onPredicate5(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onEquals6(Sp<? extends T6> s) {
            return this.onPredicate6(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onEquals7(Sp<? extends T7> s) {
            return this.onPredicate7(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onPredicate(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
            return this.onPredicate(Pr7.tuple(p));
        }

        default public SwitcherTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onPredicate1(Pr1<? super T1> p) {
            return this.onPredicate(p.ignoring6Rt());
        }

        default public SwitcherTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onPredicate2(Pr1<? super T2> p) {
            return this.onPredicate(p.ignoring5Rt().ignoring1Lt());
        }

        default public SwitcherTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onPredicate3(Pr1<? super T3> p) {
            return this.onPredicate(p.ignoring4Rt().ignoring2Lt());
        }

        default public SwitcherTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onPredicate4(Pr1<? super T4> p) {
            return this.onPredicate(p.ignoring3Rt().ignoring3Lt());
        }

        default public SwitcherTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onPredicate5(Pr1<? super T5> p) {
            return this.onPredicate(p.ignoring2Rt().ignoring4Lt());
        }

        default public SwitcherTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onPredicate6(Pr1<? super T6> p) {
            return this.onPredicate(p.ignoring1Rt().ignoring5Lt());
        }

        default public SwitcherTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onPredicate7(Pr1<? super T7> p) {
            return this.onPredicate(p.ignoring6Lt());
        }

        public SwitcherTranformer7<T1, T2, T3, T4, T5, T6, T7, R> onPredicate(Pr1<? super Tuple7<T1, T2, T3, T4, T5, T6, T7>> var1);

        default public Fn7<T1, T2, T3, T4, T5, T6, T7, R> onDefaultThrow() {
            return this.onDefaults(SwitcherAbst.emptyTransformer());
        }

        default public Fn7<T1, T2, T3, T4, T5, T6, T7, R> onDefaults() {
            return this.onDefaults(Fn7.empty());
        }

        default public Fn7<T1, T2, T3, T4, T5, T6, T7, R> onDefaults(R r) {
            return this.onDefaults(SwitcherAbst.transformerValue(r));
        }

        default public Fn7<T1, T2, T3, T4, T5, T6, T7, R> onDefaults(Sp<? extends R> s) {
            return this.onDefaults(s.toFunction().ignoring1());
        }

        default public Fn7<T1, T2, T3, T4, T5, T6, T7, R> onDefaults(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
            return this.onDefaults(Fn7.tuple(f));
        }

        default public Fn7<T1, T2, T3, T4, T5, T6, T7, R> onDefaults1(Fn1<? super T1, ? extends R> f) {
            return this.onDefaults(Fn7.tuple(f.ignoring6Rt()));
        }

        default public Fn7<T1, T2, T3, T4, T5, T6, T7, R> onDefaults2(Fn1<? super T2, ? extends R> f) {
            return this.onDefaults(Fn7.tuple(f.ignoring5Rt().ignoring1Lt()));
        }

        default public Fn7<T1, T2, T3, T4, T5, T6, T7, R> onDefaults3(Fn1<? super T3, ? extends R> f) {
            return this.onDefaults(Fn7.tuple(f.ignoring4Rt().ignoring2Lt()));
        }

        default public Fn7<T1, T2, T3, T4, T5, T6, T7, R> onDefaults4(Fn1<? super T4, ? extends R> f) {
            return this.onDefaults(Fn7.tuple(f.ignoring3Rt().ignoring3Lt()));
        }

        default public Fn7<T1, T2, T3, T4, T5, T6, T7, R> onDefaults5(Fn1<? super T5, ? extends R> f) {
            return this.onDefaults(Fn7.tuple(f.ignoring2Rt().ignoring4Lt()));
        }

        default public Fn7<T1, T2, T3, T4, T5, T6, T7, R> onDefaults6(Fn1<? super T6, ? extends R> f) {
            return this.onDefaults(Fn7.tuple(f.ignoring1Rt().ignoring5Lt()));
        }

        default public Fn7<T1, T2, T3, T4, T5, T6, T7, R> onDefaults7(Fn1<? super T7, ? extends R> f) {
            return this.onDefaults(Fn7.tuple(f.ignoring6Lt()));
        }

        default public Fn7<T1, T2, T3, T4, T5, T6, T7, R> onDefaults(Fn1<? super Tuple7<T1, T2, T3, T4, T5, T6, T7>, ? extends R> f) {
            return (Fn7 & Serializable) (t1, t2, t3, t4, t5, t6, t7) -> this.onDefaultTupled(f).apply((Object) Tuple.of((Object) t1, (Object) t2, (Object) t3, (Object) t4, (Object) t5, (Object) t6, (Object) t7));
        }

    }

    public static interface SwitcherTranformer7<T1, T2, T3, T4, T5, T6, T7, R> extends SwitcherTupleTranformer<Tuple7<T1, T2, T3, T4, T5, T6, T7>, R> {

        default public SwitcherComparator7<T1, T2, T3, T4, T5, T6, T7, R> value(R r) {
            return this.map(SwitcherAbst.transformerTupleValue(r));
        }

        default public SwitcherComparator7<T1, T2, T3, T4, T5, T6, T7, R> value(Sp<? extends R> s) {
            return this.map(SwitcherAbst.transformerTupleSupplier(s));
        }

        default public SwitcherComparator7<T1, T2, T3, T4, T5, T6, T7, R> map(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
            return this.map(Fn7.tuple(f));
        }

        default public SwitcherComparator7<T1, T2, T3, T4, T5, T6, T7, R> map1(Fn1<? super T1, ? extends R> f) {
            return this.map(Fn7.tuple(f.ignoring6Rt()));
        }

        default public SwitcherComparator7<T1, T2, T3, T4, T5, T6, T7, R> map2(Fn1<? super T2, ? extends R> f) {
            return this.map(Fn7.tuple(f.ignoring5Rt().ignoring1Lt()));
        }

        default public SwitcherComparator7<T1, T2, T3, T4, T5, T6, T7, R> map3(Fn1<? super T3, ? extends R> f) {
            return this.map(Fn7.tuple(f.ignoring4Rt().ignoring2Lt()));
        }

        default public SwitcherComparator7<T1, T2, T3, T4, T5, T6, T7, R> map4(Fn1<? super T4, ? extends R> f) {
            return this.map(Fn7.tuple(f.ignoring3Rt().ignoring3Lt()));
        }

        default public SwitcherComparator7<T1, T2, T3, T4, T5, T6, T7, R> map5(Fn1<? super T5, ? extends R> f) {
            return this.map(Fn7.tuple(f.ignoring2Rt().ignoring4Lt()));
        }

        default public SwitcherComparator7<T1, T2, T3, T4, T5, T6, T7, R> map6(Fn1<? super T6, ? extends R> f) {
            return this.map(Fn7.tuple(f.ignoring1Rt().ignoring5Lt()));
        }

        default public SwitcherComparator7<T1, T2, T3, T4, T5, T6, T7, R> map7(Fn1<? super T7, ? extends R> f) {
            return this.map(Fn7.tuple(f.ignoring6Lt()));
        }

        public SwitcherComparator7<T1, T2, T3, T4, T5, T6, T7, R> map(Fn1<? super Tuple7<T1, T2, T3, T4, T5, T6, T7>, ? extends R> var1);
    }

    public static class Switcher6<T1, T2, T3, T4, T5, T6, R> extends SwitcherAbst<Tuple6<T1, T2, T3, T4, T5, T6>, R> implements SwitcherTranformer6<T1, T2, T3, T4, T5, T6, R>, SwitcherComparator6<T1, T2, T3, T4, T5, T6, R> {

        Switcher6() {
        }

        private Switcher6(List<Tuple2<Pr1<? super Tuple6<T1, T2, T3, T4, T5, T6>>, Fn1<? super Tuple6<T1, T2, T3, T4, T5, T6>, ? extends R>>> transformations, Pr1<? super Tuple6<T1, T2, T3, T4, T5, T6>> p, Fn1<? super Tuple6<T1, T2, T3, T4, T5, T6>, ? extends R> f) {
            super(transformations, p, f);
        }

        private Switcher6(List<Tuple2<Pr1<? super Tuple6<T1, T2, T3, T4, T5, T6>>, Fn1<? super Tuple6<T1, T2, T3, T4, T5, T6>, ? extends R>>> transformations, Fn1<? super Tuple6<T1, T2, T3, T4, T5, T6>, ? extends R> f) {
            super(transformations, f);
        }

        @Override
        public SwitcherTranformer6<T1, T2, T3, T4, T5, T6, R> onPredicate(Pr1<? super Tuple6<T1, T2, T3, T4, T5, T6>> p) {
            return new Switcher6(this.transformations, p, SwitcherAbst.emptyTransformer());
        }

        @Override
        public SwitcherComparator6<T1, T2, T3, T4, T5, T6, R> map(Fn1<? super Tuple6<T1, T2, T3, T4, T5, T6>, ? extends R> f) {
            return new Switcher6<T1, T2, T3, T4, T5, T6, R>(this.transformations, f);
        }

    }

    public static interface SwitcherComparator6<T1, T2, T3, T4, T5, T6, R> extends SwitcherTupleComparator<Tuple6<T1, T2, T3, T4, T5, T6>, R> {

        default public SwitcherTranformer6<T1, T2, T3, T4, T5, T6, R> onEquals(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
            return this.onPredicate(SwitcherAbst.comparatorTupleValue(Tuple.of(t1, t2, t3, t4, t5, t6)));
        }

        default public SwitcherTranformer6<T1, T2, T3, T4, T5, T6, R> onEquals(Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> tuple) {
            return this.onPredicate(SwitcherAbst.comparatorTupleValue(tuple));
        }

        default public SwitcherTranformer6<T1, T2, T3, T4, T5, T6, R> onEquals1(T1 t1) {
            return this.onPredicate1(SwitcherAbst.comparatorValue(t1));
        }

        default public SwitcherTranformer6<T1, T2, T3, T4, T5, T6, R> onEquals2(T2 t2) {
            return this.onPredicate2(SwitcherAbst.comparatorValue(t2));
        }

        default public SwitcherTranformer6<T1, T2, T3, T4, T5, T6, R> onEquals3(T3 t3) {
            return this.onPredicate3(SwitcherAbst.comparatorValue(t3));
        }

        default public SwitcherTranformer6<T1, T2, T3, T4, T5, T6, R> onEquals4(T4 t4) {
            return this.onPredicate4(SwitcherAbst.comparatorValue(t4));
        }

        default public SwitcherTranformer6<T1, T2, T3, T4, T5, T6, R> onEquals5(T5 t5) {
            return this.onPredicate5(SwitcherAbst.comparatorValue(t5));
        }

        default public SwitcherTranformer6<T1, T2, T3, T4, T5, T6, R> onEquals6(T6 t6) {
            return this.onPredicate6(SwitcherAbst.comparatorValue(t6));
        }

        default public SwitcherTranformer6<T1, T2, T3, T4, T5, T6, R> onEquals(Sp<? extends Tuple6<T1, T2, T3, T4, T5, T6>> s) {
            return this.onPredicate(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer6<T1, T2, T3, T4, T5, T6, R> onEquals1(Sp<? extends T1> s) {
            return this.onPredicate1(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer6<T1, T2, T3, T4, T5, T6, R> onEquals2(Sp<? extends T2> s) {
            return this.onPredicate2(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer6<T1, T2, T3, T4, T5, T6, R> onEquals3(Sp<? extends T3> s) {
            return this.onPredicate3(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer6<T1, T2, T3, T4, T5, T6, R> onEquals4(Sp<? extends T4> s) {
            return this.onPredicate4(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer6<T1, T2, T3, T4, T5, T6, R> onEquals5(Sp<? extends T5> s) {
            return this.onPredicate5(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer6<T1, T2, T3, T4, T5, T6, R> onEquals6(Sp<? extends T6> s) {
            return this.onPredicate6(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer6<T1, T2, T3, T4, T5, T6, R> onPredicate(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
            return this.onPredicate(Pr6.tuple(p));
        }

        public SwitcherTranformer6<T1, T2, T3, T4, T5, T6, R> onPredicate(Pr1<? super Tuple6<T1, T2, T3, T4, T5, T6>> var1);

        default public SwitcherTranformer6<T1, T2, T3, T4, T5, T6, R> onPredicate1(Pr1<? super T1> p) {
            return this.onPredicate(p.ignoring5Rt());
        }

        default public SwitcherTranformer6<T1, T2, T3, T4, T5, T6, R> onPredicate2(Pr1<? super T2> p) {
            return this.onPredicate(p.ignoring4Rt().ignoring1Lt());
        }

        default public SwitcherTranformer6<T1, T2, T3, T4, T5, T6, R> onPredicate3(Pr1<? super T3> p) {
            return this.onPredicate(p.ignoring3Rt().ignoring2Lt());
        }

        default public SwitcherTranformer6<T1, T2, T3, T4, T5, T6, R> onPredicate4(Pr1<? super T4> p) {
            return this.onPredicate(p.ignoring2Rt().ignoring3Lt());
        }

        default public SwitcherTranformer6<T1, T2, T3, T4, T5, T6, R> onPredicate5(Pr1<? super T5> p) {
            return this.onPredicate(p.ignoring1Rt().ignoring4Lt());
        }

        default public SwitcherTranformer6<T1, T2, T3, T4, T5, T6, R> onPredicate6(Pr1<? super T6> p) {
            return this.onPredicate(p.ignoring5Lt());
        }

        default public Fn6<T1, T2, T3, T4, T5, T6, R> onDefaultThrow() {
            return this.onDefaults(SwitcherAbst.emptyTransformer());
        }

        default public Fn6<T1, T2, T3, T4, T5, T6, R> onDefaults() {
            return this.onDefaults(Fn6.empty());
        }

        default public Fn6<T1, T2, T3, T4, T5, T6, R> onDefaults(R r) {
            return this.onDefaults(SwitcherAbst.transformerValue(r));
        }

        default public Fn6<T1, T2, T3, T4, T5, T6, R> onDefaults(Sp<? extends R> s) {
            return this.onDefaults(s.toFunction().ignoring1());
        }

        default public Fn6<T1, T2, T3, T4, T5, T6, R> onDefaults(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f) {
            return this.onDefaults(Fn6.tuple(f));
        }

        default public Fn6<T1, T2, T3, T4, T5, T6, R> onDefaults1(Fn1<? super T1, ? extends R> f) {
            return this.onDefaults(Fn6.tuple(f.ignoring5Rt()));
        }

        default public Fn6<T1, T2, T3, T4, T5, T6, R> onDefaults2(Fn1<? super T2, ? extends R> f) {
            return this.onDefaults(Fn6.tuple(f.ignoring4Rt().ignoring1Lt()));
        }

        default public Fn6<T1, T2, T3, T4, T5, T6, R> onDefaults3(Fn1<? super T3, ? extends R> f) {
            return this.onDefaults(Fn6.tuple(f.ignoring3Rt().ignoring2Lt()));
        }

        default public Fn6<T1, T2, T3, T4, T5, T6, R> onDefaults4(Fn1<? super T4, ? extends R> f) {
            return this.onDefaults(Fn6.tuple(f.ignoring2Rt().ignoring3Lt()));
        }

        default public Fn6<T1, T2, T3, T4, T5, T6, R> onDefaults5(Fn1<? super T5, ? extends R> f) {
            return this.onDefaults(Fn6.tuple(f.ignoring1Rt().ignoring4Lt()));
        }

        default public Fn6<T1, T2, T3, T4, T5, T6, R> onDefaults6(Fn1<? super T6, ? extends R> f) {
            return this.onDefaults(Fn6.tuple(f.ignoring5Lt()));
        }

        default public Fn6<T1, T2, T3, T4, T5, T6, R> onDefaults(Fn1<? super Tuple6<T1, T2, T3, T4, T5, T6>, ? extends R> f) {
            return (Fn6 & Serializable) (t1, t2, t3, t4, t5, t6) -> this.onDefaultTupled(f).apply((Object) Tuple.of((Object) t1, (Object) t2, (Object) t3, (Object) t4, (Object) t5, (Object) t6));
        }

    }

    public static interface SwitcherTranformer6<T1, T2, T3, T4, T5, T6, R> extends SwitcherTupleTranformer<Tuple6<T1, T2, T3, T4, T5, T6>, R> {

        default public SwitcherComparator6<T1, T2, T3, T4, T5, T6, R> value(R r) {
            return this.map(SwitcherAbst.transformerTupleValue(r));
        }

        default public SwitcherComparator6<T1, T2, T3, T4, T5, T6, R> value(Sp<? extends R> s) {
            return this.map(SwitcherAbst.transformerTupleSupplier(s));
        }

        default public SwitcherComparator6<T1, T2, T3, T4, T5, T6, R> map(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f) {
            return this.map(Fn6.tuple(f));
        }

        default public SwitcherComparator6<T1, T2, T3, T4, T5, T6, R> map1(Fn1<? super T1, ? extends R> f) {
            return this.map(Fn6.tuple(f.ignoring5Rt()));
        }

        default public SwitcherComparator6<T1, T2, T3, T4, T5, T6, R> map2(Fn1<? super T2, ? extends R> f) {
            return this.map(Fn6.tuple(f.ignoring4Rt().ignoring1Lt()));
        }

        default public SwitcherComparator6<T1, T2, T3, T4, T5, T6, R> map3(Fn1<? super T3, ? extends R> f) {
            return this.map(Fn6.tuple(f.ignoring3Rt().ignoring2Lt()));
        }

        default public SwitcherComparator6<T1, T2, T3, T4, T5, T6, R> map4(Fn1<? super T4, ? extends R> f) {
            return this.map(Fn6.tuple(f.ignoring2Rt().ignoring3Lt()));
        }

        default public SwitcherComparator6<T1, T2, T3, T4, T5, T6, R> map5(Fn1<? super T5, ? extends R> f) {
            return this.map(Fn6.tuple(f.ignoring1Rt().ignoring4Lt()));
        }

        default public SwitcherComparator6<T1, T2, T3, T4, T5, T6, R> map6(Fn1<? super T6, ? extends R> f) {
            return this.map(Fn6.tuple(f.ignoring5Lt()));
        }

        public SwitcherComparator6<T1, T2, T3, T4, T5, T6, R> map(Fn1<? super Tuple6<T1, T2, T3, T4, T5, T6>, ? extends R> var1);
    }

    public static class Switcher5<T1, T2, T3, T4, T5, R> extends SwitcherAbst<Tuple5<T1, T2, T3, T4, T5>, R> implements SwitcherTranformer5<T1, T2, T3, T4, T5, R>, SwitcherComparator5<T1, T2, T3, T4, T5, R> {

        Switcher5() {
        }

        private Switcher5(List<Tuple2<Pr1<? super Tuple5<T1, T2, T3, T4, T5>>, Fn1<? super Tuple5<T1, T2, T3, T4, T5>, ? extends R>>> transformations, Pr1<? super Tuple5<T1, T2, T3, T4, T5>> p, Fn1<? super Tuple5<T1, T2, T3, T4, T5>, ? extends R> f) {
            super(transformations, p, f);
        }

        private Switcher5(List<Tuple2<Pr1<? super Tuple5<T1, T2, T3, T4, T5>>, Fn1<? super Tuple5<T1, T2, T3, T4, T5>, ? extends R>>> transformations, Fn1<? super Tuple5<T1, T2, T3, T4, T5>, ? extends R> f) {
            super(transformations, f);
        }

        @Override
        public SwitcherTranformer5<T1, T2, T3, T4, T5, R> onPredicate(Pr1<? super Tuple5<T1, T2, T3, T4, T5>> p) {
            return new Switcher5(this.transformations, p, SwitcherAbst.emptyTransformer());
        }

        @Override
        public SwitcherComparator5<T1, T2, T3, T4, T5, R> map(Fn1<? super Tuple5<T1, T2, T3, T4, T5>, ? extends R> f) {
            return new Switcher5<T1, T2, T3, T4, T5, R>(this.transformations, f);
        }

    }

    public static interface SwitcherComparator5<T1, T2, T3, T4, T5, R> extends SwitcherTupleComparator<Tuple5<T1, T2, T3, T4, T5>, R> {

        default public SwitcherTranformer5<T1, T2, T3, T4, T5, R> onEquals(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
            return this.onPredicate(SwitcherAbst.comparatorTupleValue(Tuple.of(t1, t2, t3, t4, t5)));
        }

        default public SwitcherTranformer5<T1, T2, T3, T4, T5, R> onEquals(Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> tuple) {
            return this.onPredicate(SwitcherAbst.comparatorTupleValue(tuple));
        }

        default public SwitcherTranformer5<T1, T2, T3, T4, T5, R> onEquals1(T1 t1) {
            return this.onPredicate1(SwitcherAbst.comparatorValue(t1));
        }

        default public SwitcherTranformer5<T1, T2, T3, T4, T5, R> onEquals2(T2 t2) {
            return this.onPredicate2(SwitcherAbst.comparatorValue(t2));
        }

        default public SwitcherTranformer5<T1, T2, T3, T4, T5, R> onEquals3(T3 t3) {
            return this.onPredicate3(SwitcherAbst.comparatorValue(t3));
        }

        default public SwitcherTranformer5<T1, T2, T3, T4, T5, R> onEquals4(T4 t4) {
            return this.onPredicate4(SwitcherAbst.comparatorValue(t4));
        }

        default public SwitcherTranformer5<T1, T2, T3, T4, T5, R> onEquals5(T5 t5) {
            return this.onPredicate5(SwitcherAbst.comparatorValue(t5));
        }

        default public SwitcherTranformer5<T1, T2, T3, T4, T5, R> onEquals(Sp<? extends Tuple5<T1, T2, T3, T4, T5>> s) {
            return this.onPredicate(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer5<T1, T2, T3, T4, T5, R> onEquals1(Sp<? extends T1> s) {
            return this.onPredicate1(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer5<T1, T2, T3, T4, T5, R> onEquals2(Sp<? extends T2> s) {
            return this.onPredicate2(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer5<T1, T2, T3, T4, T5, R> onEquals3(Sp<? extends T3> s) {
            return this.onPredicate3(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer5<T1, T2, T3, T4, T5, R> onEquals4(Sp<? extends T4> s) {
            return this.onPredicate4(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer5<T1, T2, T3, T4, T5, R> onEquals5(Sp<? extends T5> s) {
            return this.onPredicate5(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer5<T1, T2, T3, T4, T5, R> onPredicate(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
            return this.onPredicate(Pr5.tuple(p));
        }

        default public SwitcherTranformer5<T1, T2, T3, T4, T5, R> onPredicate1(Pr1<? super T1> p) {
            return this.onPredicate(p.ignoring4Rt());
        }

        default public SwitcherTranformer5<T1, T2, T3, T4, T5, R> onPredicate2(Pr1<? super T2> p) {
            return this.onPredicate(p.ignoring3Rt().ignoring1Lt());
        }

        default public SwitcherTranformer5<T1, T2, T3, T4, T5, R> onPredicate3(Pr1<? super T3> p) {
            return this.onPredicate(p.ignoring2Rt().ignoring2Lt());
        }

        default public SwitcherTranformer5<T1, T2, T3, T4, T5, R> onPredicate4(Pr1<? super T4> p) {
            return this.onPredicate(p.ignoring1Rt().ignoring3Lt());
        }

        default public SwitcherTranformer5<T1, T2, T3, T4, T5, R> onPredicate5(Pr1<? super T5> p) {
            return this.onPredicate(p.ignoring4Lt());
        }

        public SwitcherTranformer5<T1, T2, T3, T4, T5, R> onPredicate(Pr1<? super Tuple5<T1, T2, T3, T4, T5>> var1);

        default public Fn5<T1, T2, T3, T4, T5, R> onDefaultThrow() {
            return this.onDefaults(SwitcherAbst.emptyTransformer());
        }

        default public Fn5<T1, T2, T3, T4, T5, R> onDefaults() {
            return this.onDefaults(Fn5.empty());
        }

        default public Fn5<T1, T2, T3, T4, T5, R> onDefaults(R r) {
            return this.onDefaults(SwitcherAbst.transformerValue(r));
        }

        default public Fn5<T1, T2, T3, T4, T5, R> onDefaults(Sp<? extends R> s) {
            return this.onDefaults(s.toFunction().ignoring1());
        }

        default public Fn5<T1, T2, T3, T4, T5, R> onDefaults(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
            return this.onDefaults(Fn5.tuple(f));
        }

        default public Fn5<T1, T2, T3, T4, T5, R> onDefaults1(Fn1<? super T1, ? extends R> f) {
            return this.onDefaults(Fn5.tuple(f.ignoring4Rt()));
        }

        default public Fn5<T1, T2, T3, T4, T5, R> onDefaults2(Fn1<? super T2, ? extends R> f) {
            return this.onDefaults(Fn5.tuple(f.ignoring3Rt().ignoring1Lt()));
        }

        default public Fn5<T1, T2, T3, T4, T5, R> onDefaults3(Fn1<? super T3, ? extends R> f) {
            return this.onDefaults(Fn5.tuple(f.ignoring2Rt().ignoring2Lt()));
        }

        default public Fn5<T1, T2, T3, T4, T5, R> onDefaults4(Fn1<? super T4, ? extends R> f) {
            return this.onDefaults(Fn5.tuple(f.ignoring1Rt().ignoring3Lt()));
        }

        default public Fn5<T1, T2, T3, T4, T5, R> onDefaults5(Fn1<? super T5, ? extends R> f) {
            return this.onDefaults(Fn5.tuple(f.ignoring4Lt()));
        }

        default public Fn5<T1, T2, T3, T4, T5, R> onDefaults(Fn1<? super Tuple5<T1, T2, T3, T4, T5>, ? extends R> f) {
            return (Fn5 & Serializable) (t1, t2, t3, t4, t5) -> this.onDefaultTupled(f).apply((Object) Tuple.of((Object) t1, (Object) t2, (Object) t3, (Object) t4, (Object) t5));
        }

    }

    public static interface SwitcherTranformer5<T1, T2, T3, T4, T5, R> extends SwitcherTupleTranformer<Tuple5<T1, T2, T3, T4, T5>, R> {

        default public SwitcherComparator5<T1, T2, T3, T4, T5, R> value(R r) {
            return this.map(SwitcherAbst.transformerTupleValue(r));
        }

        default public SwitcherComparator5<T1, T2, T3, T4, T5, R> value(Sp<? extends R> s) {
            return this.map(SwitcherAbst.transformerTupleSupplier(s));
        }

        default public SwitcherComparator5<T1, T2, T3, T4, T5, R> map(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
            return this.map(Fn5.tuple(f));
        }

        default public SwitcherComparator5<T1, T2, T3, T4, T5, R> map1(Fn1<? super T1, ? extends R> f) {
            return this.map(Fn5.tuple(f.ignoring4Rt()));
        }

        default public SwitcherComparator5<T1, T2, T3, T4, T5, R> map2(Fn1<? super T2, ? extends R> f) {
            return this.map(Fn5.tuple(f.ignoring3Rt().ignoring1Lt()));
        }

        default public SwitcherComparator5<T1, T2, T3, T4, T5, R> map3(Fn1<? super T3, ? extends R> f) {
            return this.map(Fn5.tuple(f.ignoring2Rt().ignoring2Lt()));
        }

        default public SwitcherComparator5<T1, T2, T3, T4, T5, R> map4(Fn1<? super T4, ? extends R> f) {
            return this.map(Fn5.tuple(f.ignoring1Rt().ignoring3Lt()));
        }

        default public SwitcherComparator5<T1, T2, T3, T4, T5, R> map5(Fn1<? super T5, ? extends R> f) {
            return this.map(Fn5.tuple(f.ignoring4Lt()));
        }

        public SwitcherComparator5<T1, T2, T3, T4, T5, R> map(Fn1<? super Tuple5<T1, T2, T3, T4, T5>, ? extends R> var1);
    }

    public static class Switcher4<T1, T2, T3, T4, R> extends SwitcherAbst<Tuple4<T1, T2, T3, T4>, R> implements SwitcherTranformer4<T1, T2, T3, T4, R>, SwitcherComparator4<T1, T2, T3, T4, R> {

        Switcher4() {
        }

        private Switcher4(List<Tuple2<Pr1<? super Tuple4<T1, T2, T3, T4>>, Fn1<? super Tuple4<T1, T2, T3, T4>, ? extends R>>> transformations, Pr1<? super Tuple4<T1, T2, T3, T4>> p, Fn1<? super Tuple4<T1, T2, T3, T4>, ? extends R> f) {
            super(transformations, p, f);
        }

        private Switcher4(List<Tuple2<Pr1<? super Tuple4<T1, T2, T3, T4>>, Fn1<? super Tuple4<T1, T2, T3, T4>, ? extends R>>> transformations, Fn1<? super Tuple4<T1, T2, T3, T4>, ? extends R> f) {
            super(transformations, f);
        }

        @Override
        public SwitcherTranformer4<T1, T2, T3, T4, R> onPredicate(Pr1<? super Tuple4<T1, T2, T3, T4>> p) {
            return new Switcher4(this.transformations, p, SwitcherAbst.emptyTransformer());
        }

        @Override
        public SwitcherComparator4<T1, T2, T3, T4, R> map(Fn1<? super Tuple4<T1, T2, T3, T4>, ? extends R> f) {
            return new Switcher4<T1, T2, T3, T4, R>(this.transformations, f);
        }

    }

    public static interface SwitcherComparator4<T1, T2, T3, T4, R> extends SwitcherTupleComparator<Tuple4<T1, T2, T3, T4>, R> {

        default public SwitcherTranformer4<T1, T2, T3, T4, R> onEquals(T1 t1, T2 t2, T3 t3, T4 t4) {
            return this.onPredicate(SwitcherAbst.comparatorTupleValue(Tuple.of(t1, t2, t3, t4)));
        }

        default public SwitcherTranformer4<T1, T2, T3, T4, R> onEquals(Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4> tuple) {
            return this.onPredicate(SwitcherAbst.comparatorTupleValue(tuple));
        }

        default public SwitcherTranformer4<T1, T2, T3, T4, R> onEquals1(T1 t1) {
            return this.onPredicate1(SwitcherAbst.comparatorValue(t1));
        }

        default public SwitcherTranformer4<T1, T2, T3, T4, R> onEquals2(T2 t2) {
            return this.onPredicate2(SwitcherAbst.comparatorValue(t2));
        }

        default public SwitcherTranformer4<T1, T2, T3, T4, R> onEquals3(T3 t3) {
            return this.onPredicate3(SwitcherAbst.comparatorValue(t3));
        }

        default public SwitcherTranformer4<T1, T2, T3, T4, R> onEquals4(T4 t4) {
            return this.onPredicate4(SwitcherAbst.comparatorValue(t4));
        }

        default public SwitcherTranformer4<T1, T2, T3, T4, R> onEquals(Sp<? extends Tuple4<T1, T2, T3, T4>> s) {
            return this.onPredicate(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer4<T1, T2, T3, T4, R> onEquals1(Sp<? extends T1> s) {
            return this.onPredicate1(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer4<T1, T2, T3, T4, R> onEquals2(Sp<? extends T2> s) {
            return this.onPredicate2(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer4<T1, T2, T3, T4, R> onEquals3(Sp<? extends T3> s) {
            return this.onPredicate3(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer4<T1, T2, T3, T4, R> onEquals4(Sp<? extends T4> s) {
            return this.onPredicate4(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer4<T1, T2, T3, T4, R> onPredicate(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p) {
            return this.onPredicate(Pr4.tuple(p));
        }

        public SwitcherTranformer4<T1, T2, T3, T4, R> onPredicate(Pr1<? super Tuple4<T1, T2, T3, T4>> var1);

        default public SwitcherTranformer4<T1, T2, T3, T4, R> onPredicate1(Pr1<? super T1> p) {
            return this.onPredicate(p.ignoring3Rt());
        }

        default public SwitcherTranformer4<T1, T2, T3, T4, R> onPredicate2(Pr1<? super T2> p) {
            return this.onPredicate(p.ignoring2Rt().ignoring1Lt());
        }

        default public SwitcherTranformer4<T1, T2, T3, T4, R> onPredicate3(Pr1<? super T3> p) {
            return this.onPredicate(p.ignoring1Rt().ignoring2Lt());
        }

        default public SwitcherTranformer4<T1, T2, T3, T4, R> onPredicate4(Pr1<? super T4> p) {
            return this.onPredicate(p.ignoring3Lt());
        }

        default public Fn4<T1, T2, T3, T4, R> onDefaultThrow() {
            return this.onDefaults(SwitcherAbst.emptyTransformer());
        }

        default public Fn4<T1, T2, T3, T4, R> onDefaults() {
            return this.onDefaults(Fn4.empty());
        }

        default public Fn4<T1, T2, T3, T4, R> onDefaults(R r) {
            return this.onDefaults(SwitcherAbst.transformerValue(r));
        }

        default public Fn4<T1, T2, T3, T4, R> onDefaults(Sp<? extends R> s) {
            return this.onDefaults(s.toFunction().ignoring1());
        }

        default public Fn4<T1, T2, T3, T4, R> onDefaults(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
            return this.onDefaults(Fn4.tuple(f));
        }

        default public Fn4<T1, T2, T3, T4, R> onDefaults1(Fn1<? super T1, ? extends R> f) {
            return this.onDefaults(Fn4.tuple(f.ignoring3Rt()));
        }

        default public Fn4<T1, T2, T3, T4, R> onDefaults2(Fn1<? super T2, ? extends R> f) {
            return this.onDefaults(Fn4.tuple(f.ignoring2Rt().ignoring1Lt()));
        }

        default public Fn4<T1, T2, T3, T4, R> onDefaults3(Fn1<? super T3, ? extends R> f) {
            return this.onDefaults(Fn4.tuple(f.ignoring1Rt().ignoring2Lt()));
        }

        default public Fn4<T1, T2, T3, T4, R> onDefaults4(Fn1<? super T4, ? extends R> f) {
            return this.onDefaults(Fn4.tuple(f.ignoring3Lt()));
        }

        default public Fn4<T1, T2, T3, T4, R> onDefaults(Fn1<? super Tuple4<T1, T2, T3, T4>, ? extends R> f) {
            return (Fn4 & Serializable) (t1, t2, t3, t4) -> this.onDefaultTupled(f).apply((Object) Tuple.of((Object) t1, (Object) t2, (Object) t3, (Object) t4));
        }

    }

    public static interface SwitcherTranformer4<T1, T2, T3, T4, R> extends SwitcherTupleTranformer<Tuple4<T1, T2, T3, T4>, R> {

        default public SwitcherComparator4<T1, T2, T3, T4, R> value(R r) {
            return this.map(SwitcherAbst.transformerTupleValue(r));
        }

        default public SwitcherComparator4<T1, T2, T3, T4, R> value(Sp<? extends R> s) {
            return this.map(SwitcherAbst.transformerTupleSupplier(s));
        }

        default public SwitcherComparator4<T1, T2, T3, T4, R> map(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
            return this.map(Fn4.tuple(f));
        }

        default public SwitcherComparator4<T1, T2, T3, T4, R> map1(Fn1<? super T1, ? extends R> f) {
            return this.map(Fn4.tuple(f.ignoring3Rt()));
        }

        default public SwitcherComparator4<T1, T2, T3, T4, R> map2(Fn1<? super T2, ? extends R> f) {
            return this.map(Fn4.tuple(f.ignoring2Rt().ignoring1Lt()));
        }

        default public SwitcherComparator4<T1, T2, T3, T4, R> map3(Fn1<? super T3, ? extends R> f) {
            return this.map(Fn4.tuple(f.ignoring1Rt().ignoring2Lt()));
        }

        default public SwitcherComparator4<T1, T2, T3, T4, R> map4(Fn1<? super T4, ? extends R> f) {
            return this.map(Fn4.tuple(f.ignoring3Lt()));
        }

        public SwitcherComparator4<T1, T2, T3, T4, R> map(Fn1<? super Tuple4<T1, T2, T3, T4>, ? extends R> var1);
    }

    public static class Switcher3<T1, T2, T3, R> extends SwitcherAbst<Tuple3<T1, T2, T3>, R> implements SwitcherTranformer3<T1, T2, T3, R>, SwitcherComparator3<T1, T2, T3, R> {

        Switcher3() {
        }

        private Switcher3(List<Tuple2<Pr1<? super Tuple3<T1, T2, T3>>, Fn1<? super Tuple3<T1, T2, T3>, ? extends R>>> transformations, Pr1<? super Tuple3<T1, T2, T3>> p, Fn1<? super Tuple3<T1, T2, T3>, ? extends R> f) {
            super(transformations, p, f);
        }

        private Switcher3(List<Tuple2<Pr1<? super Tuple3<T1, T2, T3>>, Fn1<? super Tuple3<T1, T2, T3>, ? extends R>>> transformations, Fn1<? super Tuple3<T1, T2, T3>, ? extends R> f) {
            super(transformations, f);
        }

        @Override
        public SwitcherTranformer3<T1, T2, T3, R> onPredicate(Pr1<? super Tuple3<T1, T2, T3>> p) {
            return new Switcher3(this.transformations, p, SwitcherAbst.emptyTransformer());
        }

        @Override
        public SwitcherComparator3<T1, T2, T3, R> map(Fn1<? super Tuple3<T1, T2, T3>, ? extends R> f) {
            return new Switcher3<T1, T2, T3, R>(this.transformations, f);
        }

    }

    public static interface SwitcherComparator3<T1, T2, T3, R> extends SwitcherTupleComparator<Tuple3<T1, T2, T3>, R> {

        default public SwitcherTranformer3<T1, T2, T3, R> onEquals(T1 t1, T2 t2, T3 t3) {
            return this.onPredicate(SwitcherAbst.comparatorTupleValue(Tuple.of(t1, t2, t3)));
        }

        default public SwitcherTranformer3<T1, T2, T3, R> onEquals(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple) {
            return this.onPredicate(SwitcherAbst.comparatorTupleValue(tuple));
        }

        default public SwitcherTranformer3<T1, T2, T3, R> onEquals1(T1 t1) {
            return this.onPredicate1(SwitcherAbst.comparatorValue(t1));
        }

        default public SwitcherTranformer3<T1, T2, T3, R> onEquals2(T2 t2) {
            return this.onPredicate2(SwitcherAbst.comparatorValue(t2));
        }

        default public SwitcherTranformer3<T1, T2, T3, R> onEquals3(T3 t3) {
            return this.onPredicate3(SwitcherAbst.comparatorValue(t3));
        }

        default public SwitcherTranformer3<T1, T2, T3, R> onEquals(Sp<? extends Tuple3<T1, T2, T3>> s) {
            return this.onPredicate(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer3<T1, T2, T3, R> onEquals1(Sp<? extends T1> s) {
            return this.onPredicate1(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer3<T1, T2, T3, R> onEquals2(Sp<? extends T2> s) {
            return this.onPredicate2(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer3<T1, T2, T3, R> onEquals3(Sp<? extends T3> s) {
            return this.onPredicate3(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer3<T1, T2, T3, R> onPredicate(Pr3<? super T1, ? super T2, ? super T3> p) {
            return this.onPredicate(Pr3.tuple(p));
        }

        public SwitcherTranformer3<T1, T2, T3, R> onPredicate(Pr1<? super Tuple3<T1, T2, T3>> var1);

        default public SwitcherTranformer3<T1, T2, T3, R> onPredicate1(Pr1<? super T1> p) {
            return this.onPredicate(p.ignoring2Rt());
        }

        default public SwitcherTranformer3<T1, T2, T3, R> onPredicate2(Pr1<? super T2> p) {
            return this.onPredicate(p.ignoring1Rt().ignoring1Lt());
        }

        default public SwitcherTranformer3<T1, T2, T3, R> onPredicate3(Pr1<? super T3> p) {
            return this.onPredicate(p.ignoring2Lt());
        }

        default public Fn3<T1, T2, T3, R> onDefaultThrow() {
            return this.onDefaults(SwitcherAbst.emptyTransformer());
        }

        default public Fn3<T1, T2, T3, R> onDefaults() {
            return this.onDefaults(Fn3.empty());
        }

        default public Fn3<T1, T2, T3, R> onDefaults(R r) {
            return this.onDefaults(SwitcherAbst.transformerValue(r));
        }

        default public Fn3<T1, T2, T3, R> onDefaults(Sp<? extends R> s) {
            return this.onDefaults(s.toFunction().ignoring1());
        }

        default public Fn3<T1, T2, T3, R> onDefaults(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f) {
            return this.onDefaults(Fn3.tuple(f));
        }

        default public Fn3<T1, T2, T3, R> onDefaults1(Fn1<? super T1, ? extends R> f) {
            return this.onDefaults(Fn3.tuple(f.ignoring2Rt()));
        }

        default public Fn3<T1, T2, T3, R> onDefaults2(Fn1<? super T2, ? extends R> f) {
            return this.onDefaults(Fn3.tuple(f.ignoring1Rt().ignoring1Lt()));
        }

        default public Fn3<T1, T2, T3, R> onDefaults3(Fn1<? super T3, ? extends R> f) {
            return this.onDefaults(Fn3.tuple(f.ignoring2Lt()));
        }

        default public Fn3<T1, T2, T3, R> onDefaults(Fn1<? super Tuple3<T1, T2, T3>, ? extends R> f) {
            return (Fn3 & Serializable) (t1, t2, t3) -> this.onDefaultTupled(f).apply((Object) Tuple.of((Object) t1, (Object) t2, (Object) t3));
        }

    }

    public static interface SwitcherTranformer3<T1, T2, T3, R> extends SwitcherTupleTranformer<Tuple3<T1, T2, T3>, R> {

        default public SwitcherComparator3<T1, T2, T3, R> value(R r) {
            return this.map(SwitcherAbst.transformerTupleValue(r));
        }

        default public SwitcherComparator3<T1, T2, T3, R> value(Sp<? extends R> s) {
            return this.map(SwitcherAbst.transformerTupleSupplier(s));
        }

        default public SwitcherComparator3<T1, T2, T3, R> map(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f) {
            return this.map(Fn3.tuple(f));
        }

        default public SwitcherComparator3<T1, T2, T3, R> map1(Fn1<? super T1, ? extends R> f) {
            return this.map(Fn3.tuple(f.ignoring2Rt()));
        }

        default public SwitcherComparator3<T1, T2, T3, R> map2(Fn1<? super T2, ? extends R> f) {
            return this.map(Fn3.tuple(f.ignoring1Rt().ignoring1Lt()));
        }

        default public SwitcherComparator3<T1, T2, T3, R> map3(Fn1<? super T3, ? extends R> f) {
            return this.map(Fn3.tuple(f.ignoring2Lt()));
        }

        public SwitcherComparator3<T1, T2, T3, R> map(Fn1<? super Tuple3<T1, T2, T3>, ? extends R> var1);
    }

    public static class Switcher2<T1, T2, R> extends SwitcherAbst<Tuple2<T1, T2>, R> implements SwitcherTranformer2<T1, T2, R>, SwitcherComparator2<T1, T2, R> {

        Switcher2() {
        }

        private Switcher2(List<Tuple2<Pr1<? super Tuple2<T1, T2>>, Fn1<? super Tuple2<T1, T2>, ? extends R>>> transformations, Pr1<? super Tuple2<T1, T2>> p, Fn1<? super Tuple2<T1, T2>, ? extends R> f) {
            super(transformations, p, f);
        }

        private Switcher2(List<Tuple2<Pr1<? super Tuple2<T1, T2>>, Fn1<? super Tuple2<T1, T2>, ? extends R>>> transformations, Fn1<? super Tuple2<T1, T2>, ? extends R> f) {
            super(transformations, f);
        }

        @Override
        public SwitcherTranformer2<T1, T2, R> onPredicate(Pr1<? super Tuple2<T1, T2>> p) {
            return new Switcher2(this.transformations, p, SwitcherAbst.emptyTransformer());
        }

        @Override
        public SwitcherComparator2<T1, T2, R> map(Fn1<? super Tuple2<T1, T2>, ? extends R> f) {
            return new Switcher2<T1, T2, R>(this.transformations, f);
        }

    }

    public static interface SwitcherComparator2<T1, T2, R> extends SwitcherTupleComparator<Tuple2<T1, T2>, R> {

        default public SwitcherTranformer2<T1, T2, R> onEquals(T1 t1, T2 t2) {
            return this.onPredicate(SwitcherAbst.comparatorTupleValue(Tuple.of(t1, t2)));
        }

        default public SwitcherTranformer2<T1, T2, R> onEquals(Tuple2<? extends T1, ? extends T2> tuple) {
            return this.onPredicate(SwitcherAbst.comparatorTupleValue(tuple));
        }

        default public SwitcherTranformer2<T1, T2, R> onEquals1(T1 t1) {
            return this.onPredicate1(SwitcherAbst.comparatorValue(t1));
        }

        default public SwitcherTranformer2<T1, T2, R> onEquals2(T2 t2) {
            return this.onPredicate2(SwitcherAbst.comparatorValue(t2));
        }

        default public SwitcherTranformer2<T1, T2, R> onEquals(Sp<? extends Tuple2<T1, T2>> s) {
            return this.onPredicate(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer2<T1, T2, R> onEquals1(Sp<? extends T1> s) {
            return this.onPredicate1(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer2<T1, T2, R> onEquals2(Sp<? extends T2> s) {
            return this.onPredicate2(SwitcherCheckedAbst.comparatorSupplier(s));
        }

        default public SwitcherTranformer2<T1, T2, R> onPredicate(Pr2<? super T1, ? super T2> p) {
            return this.onPredicate(Pr2.tuple(p));
        }

        public SwitcherTranformer2<T1, T2, R> onPredicate(Pr1<? super Tuple2<T1, T2>> var1);

        default public SwitcherTranformer2<T1, T2, R> onPredicate1(Pr1<? super T1> p) {
            return this.onPredicate(p.ignoring1Rt());
        }

        default public SwitcherTranformer2<T1, T2, R> onPredicate2(Pr1<? super T2> p) {
            return this.onPredicate(p.ignoring1Lt());
        }

        default public Fn2<T1, T2, R> onDefaultThrow() {
            return this.onDefaults(SwitcherAbst.emptyTransformer());
        }

        default public Fn2<T1, T2, R> onDefaults() {
            return this.onDefaults(Fn2.empty());
        }

        default public Fn2<T1, T2, R> onDefaults(R r) {
            return this.onDefaults(SwitcherAbst.transformerValue(r));
        }

        default public Fn2<T1, T2, R> onDefaults(Sp<? extends R> s) {
            return this.onDefaults(s.toFunction().ignoring1());
        }

        default public Fn2<T1, T2, R> onDefaults(Fn2<? super T1, ? super T2, ? extends R> f) {
            return this.onDefaults(Fn2.tuple(f));
        }

        default public Fn2<T1, T2, R> onDefaults1(Fn1<? super T1, ? extends R> f) {
            return this.onDefaults(Fn2.tuple(f.ignoring1Rt()));
        }

        default public Fn2<T1, T2, R> onDefaults2(Fn1<? super T2, ? extends R> f) {
            return this.onDefaults(Fn2.tuple(f.ignoring1Lt()));
        }

        default public Fn2<T1, T2, R> onDefaults(Fn1<? super Tuple2<T1, T2>, ? extends R> f) {
            return (Fn2 & Serializable) (t1, t2) -> this.onDefaultTupled(f).apply((Object) Tuple.of((Object) t1, (Object) t2));
        }

    }

    public static interface SwitcherTranformer2<T1, T2, R> extends SwitcherTupleTranformer<Tuple2<T1, T2>, R> {

        default public SwitcherComparator2<T1, T2, R> value(R r) {
            return this.map(SwitcherAbst.transformerTupleValue(r));
        }

        default public SwitcherComparator2<T1, T2, R> value(Sp<? extends R> s) {
            return this.map(SwitcherAbst.transformerTupleSupplier(s));
        }

        default public SwitcherComparator2<T1, T2, R> map(Fn2<? super T1, ? super T2, ? extends R> f) {
            return this.map(Fn2.tuple(f));
        }

        default public SwitcherComparator2<T1, T2, R> map1(Fn1<? super T1, ? extends R> f) {
            return this.map(Fn2.tuple(f.ignoring1Rt()));
        }

        default public SwitcherComparator2<T1, T2, R> map2(Fn1<? super T2, ? extends R> f) {
            return this.map(Fn2.tuple(f.ignoring1Lt()));
        }

        public SwitcherComparator2<T1, T2, R> map(Fn1<? super Tuple2<T1, T2>, ? extends R> var1);
    }

    public static class Switcher1<T1, R> extends SwitcherBaseAbst<Tuple1<T1>, R> implements SwitcherTranformer1<T1, R>, SwitcherComparator1<T1, R> {

        Switcher1() {
        }

        private Switcher1(List<Tuple2<Pr1<? super Tuple1<T1>>, Fn1<? super Tuple1<T1>, ? extends R>>> transformations, Pr1<? super Tuple1<T1>> p, Fn1<? super Tuple1<T1>, ? extends R> f) {
            super(transformations, p, f);
        }

        private Switcher1(List<Tuple2<Pr1<? super Tuple1<T1>>, Fn1<? super Tuple1<T1>, ? extends R>>> transformations, Fn1<? super Tuple1<T1>, ? extends R> f) {
            super(transformations, f);
        }

        @Override
        public SwitcherTranformer1<T1, R> onPredicate(Pr1<? super T1> p) {
            return new Switcher1(this.transformations, Pr1.tuple(p), SwitcherAbst.emptyTransformer());
        }

        @Override
        public SwitcherComparator1<T1, R> map(Fn1<? super T1, ? extends R> f) {
            return new Switcher1<T1, R>(this.transformations, Fn1.tuple(f));
        }

    }

    public static interface SwitcherComparator1<T1, R> extends SwitcherComparator<Tuple1<T1>, R> {

        default public SwitcherTranformer1<T1, R> onEquals(T1 t1) {
            return this.onPredicate(SwitcherAbst.comparatorValue(t1));
        }

        default public SwitcherTranformer1<T1, R> onEquals(Tuple1<? extends T1> tuple) {
            return this.onPredicate(SwitcherAbst.comparatorValue(tuple._1()));
        }

        default public SwitcherTranformer1<T1, R> onEquals(Sp<? extends T1> s) {
            return this.onPredicate(SwitcherAbst.comparatorSupplierChecked(s));
        }

        public SwitcherTranformer1<T1, R> onPredicate(Pr1<? super T1> var1);

        default public Fn1<T1, R> onDefaultThrow() {
            return this.onDefaults(SwitcherAbst.emptyTransformer());
        }

        default public Fn1<T1, R> onDefaults() {
            return this.onDefaults(Fn1.empty());
        }

        default public Fn1<T1, R> onDefaults(R r) {
            return this.onDefaults(SwitcherAbst.transformerValue(r));
        }

        default public Fn1<T1, R> onDefaults(Sp<? extends R> s) {
            return this.onDefaults(s.toFunction().ignoring1());
        }

        default public Fn1<T1, R> onDefaults(Fn1<? super T1, ? extends R> f) {
            return (Fn1 & Serializable) t1 -> this.onDefaultTupled(Fn1.tuple(f)).apply((Object) Tuple.of((Object) t1));
        }

    }

    public static interface SwitcherTranformer1<T1, R> extends SwitcherTranformer<Tuple1<T1>, R> {

        default public SwitcherComparator1<T1, R> value(R r) {
            return this.map(SwitcherAbst.transformerValue(r));
        }

        default public SwitcherComparator1<T1, R> value(Sp<? extends R> s) {
            return this.map(s.toFunction().ignoring1());
        }

        public SwitcherComparator1<T1, R> map(Fn1<? super T1, ? extends R> var1);
    }

    public static interface SwitcherTupleComparator<TUPLE extends Tuple, R> extends SwitcherComparator<TUPLE, R> {

        public SwitcherTupleTranformer<TUPLE, R> onPredicate(Pr1<? super TUPLE> var1);
    }

    public static interface SwitcherComparator<TUPLE extends Tuple, R> {

        public Fn1<TUPLE, R> onDefaultTupled(Fn1<? super TUPLE, ? extends R> var1);
    }

    public static interface SwitcherTupleTranformer<TUPLE extends Tuple, R> extends SwitcherTranformer<TUPLE, R> {

        public SwitcherTupleComparator<TUPLE, R> map(Fn1<? super TUPLE, ? extends R> var1);
    }

    public static interface SwitcherTranformer<TUPLE extends Tuple, R> {

    }

}

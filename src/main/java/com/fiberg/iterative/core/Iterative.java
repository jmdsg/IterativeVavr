package com.fiberg.iterative.core;

import com.fiberg.iterative.function.*;
import io.vavr.*;
import io.vavr.collection.*;
import io.vavr.control.Option;
import io.vavr.control.Try;
import org.apache.commons.collections4.comparators.NullComparator;

import java.util.Objects;

public interface Iterative extends IterativeWrapper {

    public static IterativeBuilder.RegularBuilder builder() {
        return new IterativeBuilder.BuilderRegularImpl();
    }

    public static IterativeBuilder.IterativeBuilderArgAccRegCro cross() {
        return new IterativeBuilder.BuilderRegularImpl().cross();
    }

    public static IterativeBuilder.IterativeBuilderArgAccRegInl inline() {
        return new IterativeBuilder.BuilderRegularImpl().inline();
    }

    public static IterativeBuilder.IterativeBuilderIteArgReg nullable() {
        return new IterativeBuilder.BuilderRegularImpl().nullable();
    }

    public static IterativeBuilder.IterativeBuilderIteArgReg nonNullable() {
        return new IterativeBuilder.BuilderRegularImpl().nonNullable();
    }

    public static IterativeBuilder.IterativeBuilderIteAccReg regularArgs() {
        return new IterativeBuilder.BuilderRegularImpl().regularArgs();
    }

    public static IterativeBuilder.IterativeBuilderIteAccTup tupleArgs() {
        return new IterativeBuilder.BuilderTupleCrossImpl();
    }

    public static Iterative0 narrow(Iterative0 iterative) {
        return iterative;
    }

    public static <T1> Iterative1<T1> narrow(Iterative1<? extends T1> iterative) {
        return Iterative1.narrow(iterative);
    }

    public static <T1, T2> Iterative2<T1, T2> narrow(Iterative2<? extends T1, ? extends T2> iterative) {
        return Iterative2.narrow(iterative);
    }

    public static <T1, T2, T3> Iterative3<T1, T2, T3> narrow(Iterative3<? extends T1, ? extends T2, ? extends T3> iterative) {
        return Iterative3.narrow(iterative);
    }

    public static <T1, T2, T3, T4> Iterative4<T1, T2, T3, T4> narrow(Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4> iterative) {
        return Iterative4.narrow(iterative);
    }

    public static <T1, T2, T3, T4, T5> Iterative5<T1, T2, T3, T4, T5> narrow(Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> iterative) {
        return Iterative5.narrow(iterative);
    }

    public static <T1, T2, T3, T4, T5, T6> Iterative6<T1, T2, T3, T4, T5, T6> narrow(Iterative6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> iterative) {
        return Iterative6.narrow(iterative);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Iterative7<T1, T2, T3, T4, T5, T6, T7> narrow(Iterative7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> iterative) {
        return Iterative7.narrow(iterative);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> narrow(Iterative8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8> iterative) {
        return Iterative8.narrow(iterative);
    }

    public static Iterative0 empty0() {
        return new IterativeBuilder.BuilderRegularImpl().empty0();
    }

    public static <T1> Iterative1<T1> empty1() {
        return new IterativeBuilder.BuilderRegularImpl().empty1();
    }

    public static <T1, T2> Iterative2Cross<T1, T2> empty2() {
        return new IterativeBuilder.BuilderRegularImpl().empty2();
    }

    public static <T1, T2, T3> Iterative3Cross<T1, T2, T3> empty3() {
        return new IterativeBuilder.BuilderRegularImpl().empty3();
    }

    public static <T1, T2, T3, T4> Iterative4Cross<T1, T2, T3, T4> empty4() {
        return new IterativeBuilder.BuilderRegularImpl().empty4();
    }

    public static <T1, T2, T3, T4, T5> Iterative5Cross<T1, T2, T3, T4, T5> empty5() {
        return new IterativeBuilder.BuilderRegularImpl().empty5();
    }

    public static <T1, T2, T3, T4, T5, T6> Iterative6Cross<T1, T2, T3, T4, T5, T6> empty6() {
        return new IterativeBuilder.BuilderRegularImpl().empty6();
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> empty7() {
        return new IterativeBuilder.BuilderRegularImpl().empty7();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> empty8() {
        return new IterativeBuilder.BuilderRegularImpl().empty8();
    }

    public static <T1> Iterative1<T1> from(T1 t1) {
        return new IterativeBuilder.BuilderRegularImpl().from(t1);
    }

    public static <T1, T2> Iterative2Cross<T1, T2> from(T1 t1, T2 t2) {
        return new IterativeBuilder.BuilderRegularImpl().from(t1, t2);
    }

    public static <T1, T2, T3> Iterative3Cross<T1, T2, T3> from(T1 t1, T2 t2, T3 t3) {
        return new IterativeBuilder.BuilderRegularImpl().from(t1, t2, t3);
    }

    public static <T1, T2, T3, T4> Iterative4Cross<T1, T2, T3, T4> from(T1 t1, T2 t2, T3 t3, T4 t4) {
        return new IterativeBuilder.BuilderRegularImpl().from(t1, t2, t3, t4);
    }

    public static <T1, T2, T3, T4, T5> Iterative5Cross<T1, T2, T3, T4, T5> from(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return new IterativeBuilder.BuilderRegularImpl().from(t1, t2, t3, t4, t5);
    }

    public static <T1, T2, T3, T4, T5, T6> Iterative6Cross<T1, T2, T3, T4, T5, T6> from(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return new IterativeBuilder.BuilderRegularImpl().from(t1, t2, t3, t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> from(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return new IterativeBuilder.BuilderRegularImpl().from(t1, t2, t3, t4, t5, t6, t7);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> from(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return new IterativeBuilder.BuilderRegularImpl().from(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    public static <T1> Iterative1<T1> fromTuple(Tuple1<? extends T1> tuple) {
        return Wither.withArgs(Tuple.<T1>narrow(tuple)).apply(Fn1.tuple(new IterativeBuilder.BuilderRegularImpl().inline()::from)).apply();
    }

    public static <T1, T2> Iterative2Inline<T1, T2> fromTuple(Tuple2<? extends T1, ? extends T2> tuple) {
        return Wither.withArgs(Tuple.<T1, T2>narrow(tuple)).apply(Fn2.tuple((t1, t2) -> new IterativeBuilder.BuilderRegularImpl().inline().from(t1, t2))).apply();
    }

    public static <T1, T2, T3> Iterative3Inline<T1, T2, T3> fromTuple(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple) {
        return Wither.withArgs(Tuple.<T1, T2, T3>narrow(tuple)).apply(Fn3.tuple((t1, t2, t3) -> new IterativeBuilder.BuilderRegularImpl().inline().from(t1, t2, t3))).apply();
    }

    public static <T1, T2, T3, T4> Iterative4Inline<T1, T2, T3, T4> fromTuple(Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4> tuple) {
        return Wither.withArgs(Tuple.<T1, T2, T3, T4>narrow(tuple)).apply(Fn4.tuple((t1, t2, t3, t4) -> new IterativeBuilder.BuilderRegularImpl().inline().from(t1, t2, t3, t4))).apply();
    }

    public static <T1, T2, T3, T4, T5> Iterative5Inline<T1, T2, T3, T4, T5> fromTuple(Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> tuple) {
        return Wither.withArgs(Tuple.<T1, T2, T3, T4, T5>narrow(tuple)).apply(Fn5.tuple((t1, t2, t3, t4, t5) -> new IterativeBuilder.BuilderRegularImpl().inline().from(t1, t2, t3, t4, t5))).apply();
    }

    public static <T1, T2, T3, T4, T5, T6> Iterative6Inline<T1, T2, T3, T4, T5, T6> fromTuple(Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> tuple) {
        return Wither.withArgs(Tuple.<T1, T2, T3, T4, T5, T6>narrow(tuple)).apply(Fn6.tuple((t1, t2, t3, t4, t5, t6) -> new IterativeBuilder.BuilderRegularImpl().inline().from(t1, t2, t3, t4, t5, t6))).apply();
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Iterative7Inline<T1, T2, T3, T4, T5, T6, T7> fromTuple(Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> tuple) {
        return Wither.withArgs(Tuple.<T1, T2, T3, T4, T5, T6, T7>narrow(tuple)).apply(Fn7.tuple((t1, t2, t3, t4, t5, t6, t7) -> new IterativeBuilder.BuilderRegularImpl().inline().from(t1, t2, t3, t4, t5, t6, t7))).apply();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Inline<T1, T2, T3, T4, T5, T6, T7, T8> fromTuple(Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8> tuple) {
        return Wither.withArgs(Tuple.<T1, T2, T3, T4, T5, T6, T7, T8>narrow(tuple)).apply(Fn8.tuple((t1, t2, t3, t4, t5, t6, t7, t8) -> new IterativeBuilder.BuilderRegularImpl().inline().from(t1, t2, t3, t4, t5, t6, t7, t8))).apply();
    }

    public static <T1> Iterative1<T1> ofTuple1(Iterable<? extends Tuple1<? extends T1>> iterable) {
        return Iterative.of(iterable).inlineBranch(Tuple1::_1);
    }

    public static <T1, T2> Iterative2Inline<T1, T2> ofTuple2(Iterable<? extends Tuple2<? extends T1, ? extends T2>> iterable) {
        return Iterative.of(iterable).inlineBranch(Tuple2::_1, Tuple2::_2);
    }

    public static <T1, T2, T3> Iterative3Inline<T1, T2, T3> ofTuple3(Iterable<? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> iterable) {
        return Iterative.of(iterable).inlineBranch(Tuple3::_1, Tuple3::_2, Tuple3::_3);
    }

    public static <T1, T2, T3, T4> Iterative4Inline<T1, T2, T3, T4> ofTuple4(Iterable<? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> iterable) {
        return Iterative.of(iterable).inlineBranch(Tuple4::_1, Tuple4::_2, Tuple4::_3, Tuple4::_4);
    }

    public static <T1, T2, T3, T4, T5> Iterative5Inline<T1, T2, T3, T4, T5> ofTuple5(Iterable<? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> iterable) {
        return Iterative.of(iterable).inlineBranch(Tuple5::_1, Tuple5::_2, Tuple5::_3, Tuple5::_4, Tuple5::_5);
    }

    public static <T1, T2, T3, T4, T5, T6> Iterative6Inline<T1, T2, T3, T4, T5, T6> ofTuple6(Iterable<? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> iterable) {
        return Iterative.of(iterable).inlineBranch(Tuple6::_1, Tuple6::_2, Tuple6::_3, Tuple6::_4, Tuple6::_5, Tuple6::_6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Iterative7Inline<T1, T2, T3, T4, T5, T6, T7> ofTuple7(Iterable<? extends Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> iterable) {
        return Iterative.of(iterable).inlineBranch(Tuple7::_1, Tuple7::_2, Tuple7::_3, Tuple7::_4, Tuple7::_5, Tuple7::_6, Tuple7::_7);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Inline<T1, T2, T3, T4, T5, T6, T7, T8> ofTuple8(Iterable<? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> iterable) {
        return Iterative.of(iterable).inlineBranch(Tuple8::_1, Tuple8::_2, Tuple8::_3, Tuple8::_4, Tuple8::_5, Tuple8::_6, Tuple8::_7, Tuple8::_8);
    }

    public static Iterative0 of() {
        return new IterativeBuilder.BuilderRegularImpl().of();
    }

    public static <T1> Iterative1<T1> of(Iterable<? extends T1> t1) {
        return new IterativeBuilder.BuilderRegularImpl().of(t1);
    }

    public static <T1, T2> Iterative2Cross<T1, T2> of(Iterable<? extends T1> t1, Iterable<? extends T2> t2) {
        return new IterativeBuilder.BuilderRegularImpl().of(t1, t2);
    }

    public static <T1, T2> Iterative2Cross<T1, T2> of(Iterative1<? extends T1> iterative, Iterable<? extends T2> elem) {
        return new IterativeBuilder.BuilderRegularImpl().of(iterative, elem);
    }

    public static <T1, T2, T3> Iterative3Cross<T1, T2, T3> of(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Iterable<? extends T3> t3) {
        return new IterativeBuilder.BuilderRegularImpl().of(t1, t2, t3);
    }

    public static <T1, T2, T3> Iterative3Cross<T1, T2, T3> of(Iterative2<? extends T1, ? extends T2> iterative, Iterable<? extends T3> elem) {
        return new IterativeBuilder.BuilderRegularImpl().of(iterative, elem);
    }

    public static <T1, T2, T3, T4> Iterative4Cross<T1, T2, T3, T4> of(Iterative3<? extends T1, ? extends T2, ? extends T3> iterative, Iterable<? extends T4> elem) {
        return new IterativeBuilder.BuilderRegularImpl().of(iterative, elem);
    }

    public static <T1, T2, T3, T4> Iterative4Cross<T1, T2, T3, T4> of(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Iterable<? extends T3> t3, Iterable<? extends T4> t4) {
        return new IterativeBuilder.BuilderRegularImpl().of(t1, t2, t3, t4);
    }

    public static <T1, T2, T3, T4, T5> Iterative5Cross<T1, T2, T3, T4, T5> of(Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4> iterative, Iterable<? extends T5> elem) {
        return new IterativeBuilder.BuilderRegularImpl().of(iterative, elem);
    }

    public static <T1, T2, T3, T4, T5> Iterative5Cross<T1, T2, T3, T4, T5> of(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Iterable<? extends T3> t3, Iterable<? extends T4> t4, Iterable<? extends T5> t5) {
        return new IterativeBuilder.BuilderRegularImpl().of(t1, t2, t3, t4, t5);
    }

    public static <T1, T2, T3, T4, T5, T6> Iterative6Cross<T1, T2, T3, T4, T5, T6> of(Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> iterative, Iterable<? extends T6> elem) {
        return new IterativeBuilder.BuilderRegularImpl().of(iterative, elem);
    }

    public static <T1, T2, T3, T4, T5, T6> Iterative6Cross<T1, T2, T3, T4, T5, T6> of(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Iterable<? extends T3> t3, Iterable<? extends T4> t4, Iterable<? extends T5> t5, Iterable<? extends T6> t6) {
        return new IterativeBuilder.BuilderRegularImpl().of(t1, t2, t3, t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> of(Iterative6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> iterative, Iterable<? extends T7> elem) {
        return new IterativeBuilder.BuilderRegularImpl().of(iterative, elem);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> of(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Iterable<? extends T3> t3, Iterable<? extends T4> t4, Iterable<? extends T5> t5, Iterable<? extends T6> t6, Iterable<? extends T7> t7) {
        return new IterativeBuilder.BuilderRegularImpl().of(t1, t2, t3, t4, t5, t6, t7);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> of(Iterative7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> iterative, Iterable<? extends T8> elem) {
        return new IterativeBuilder.BuilderRegularImpl().of(iterative, elem);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> of(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Iterable<? extends T3> t3, Iterable<? extends T4> t4, Iterable<? extends T5> t5, Iterable<? extends T6> t6, Iterable<? extends T7> t7, Iterable<? extends T8> t8) {
        return new IterativeBuilder.BuilderRegularImpl().of(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    public static <T1> Iterative1<T1> by(Iterable<? extends Stream<? extends T1>> t1) {
        return new IterativeBuilder.BuilderRegularImpl().by(t1);
    }

    public static <T1, T2> Iterative2Cross<T1, T2> by(Iterable<? extends Stream<? extends T1>> t1, Iterable<? extends Stream<? extends T2>> t2) {
        return new IterativeBuilder.BuilderRegularImpl().by(t1, t2);
    }

    public static <T1, T2> Iterative2Cross<T1, T2> by(Iterative1<? extends T1> iterative, Iterable<? extends Stream<? extends T2>> elem) {
        return new IterativeBuilder.BuilderRegularImpl().by(iterative, elem);
    }

    public static <T1, T2, T3> Iterative3Cross<T1, T2, T3> by(Iterable<? extends Stream<? extends T1>> t1, Iterable<? extends Stream<? extends T2>> t2, Iterable<? extends Stream<? extends T3>> t3) {
        return new IterativeBuilder.BuilderRegularImpl().by(t1, t2, t3);
    }

    public static <T1, T2, T3> Iterative3Cross<T1, T2, T3> by(Iterative2<? extends T1, ? extends T2> iterative, Iterable<? extends Stream<? extends T3>> elem) {
        return new IterativeBuilder.BuilderRegularImpl().by(iterative, elem);
    }

    public static <T1, T2, T3, T4> Iterative4Cross<T1, T2, T3, T4> by(Iterable<? extends Stream<? extends T1>> t1, Iterable<? extends Stream<? extends T2>> t2, Iterable<? extends Stream<? extends T3>> t3, Iterable<? extends Stream<? extends T4>> t4) {
        return new IterativeBuilder.BuilderRegularImpl().by(t1, t2, t3, t4);
    }

    public static <T1, T2, T3, T4> Iterative4Cross<T1, T2, T3, T4> by(Iterative3<? extends T1, ? extends T2, ? extends T3> iterative, Iterable<? extends Stream<? extends T4>> elem) {
        return new IterativeBuilder.BuilderRegularImpl().by(iterative, elem);
    }

    public static <T1, T2, T3, T4, T5> Iterative5Cross<T1, T2, T3, T4, T5> by(Iterable<? extends Stream<? extends T1>> t1, Iterable<? extends Stream<? extends T2>> t2, Iterable<? extends Stream<? extends T3>> t3, Iterable<? extends Stream<? extends T4>> t4, Iterable<? extends Stream<? extends T5>> t5) {
        return new IterativeBuilder.BuilderRegularImpl().by(t1, t2, t3, t4, t5);
    }

    public static <T1, T2, T3, T4, T5> Iterative5Cross<T1, T2, T3, T4, T5> by(Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4> iterative, Iterable<? extends Stream<? extends T5>> elem) {
        return new IterativeBuilder.BuilderRegularImpl().by(iterative, elem);
    }

    public static <T1, T2, T3, T4, T5, T6> Iterative6Cross<T1, T2, T3, T4, T5, T6> by(Iterable<? extends Stream<? extends T1>> t1, Iterable<? extends Stream<? extends T2>> t2, Iterable<? extends Stream<? extends T3>> t3, Iterable<? extends Stream<? extends T4>> t4, Iterable<? extends Stream<? extends T5>> t5, Iterable<? extends Stream<? extends T6>> t6) {
        return new IterativeBuilder.BuilderRegularImpl().by(t1, t2, t3, t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6> Iterative6Cross<T1, T2, T3, T4, T5, T6> by(Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> iterative, Iterable<? extends Stream<? extends T6>> elem) {
        return new IterativeBuilder.BuilderRegularImpl().by(iterative, elem);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> by(Iterable<? extends Stream<? extends T1>> t1, Iterable<? extends Stream<? extends T2>> t2, Iterable<? extends Stream<? extends T3>> t3, Iterable<? extends Stream<? extends T4>> t4, Iterable<? extends Stream<? extends T5>> t5, Iterable<? extends Stream<? extends T6>> t6, Iterable<? extends Stream<? extends T7>> t7) {
        return new IterativeBuilder.BuilderRegularImpl().by(t1, t2, t3, t4, t5, t6, t7);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> by(Iterative6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> iterative, Iterable<? extends Stream<? extends T7>> elem) {
        return new IterativeBuilder.BuilderRegularImpl().by(iterative, elem);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> by(Iterable<? extends Stream<? extends T1>> t1, Iterable<? extends Stream<? extends T2>> t2, Iterable<? extends Stream<? extends T3>> t3, Iterable<? extends Stream<? extends T4>> t4, Iterable<? extends Stream<? extends T5>> t5, Iterable<? extends Stream<? extends T6>> t6, Iterable<? extends Stream<? extends T7>> t7, Iterable<? extends Stream<? extends T8>> t8) {
        return new IterativeBuilder.BuilderRegularImpl().by(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> by(Iterative7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> iterative, Iterable<? extends Stream<? extends T8>> elem) {
        return new IterativeBuilder.BuilderRegularImpl().by(iterative, elem);
    }

    public static <W> Option<W> wrapNullable(W t1) {
        return Option.some(t1);
    }

    public static <W> Option<W> wrapNonNullable(W t1) {
        return Option.of(t1);
    }

    public static <W> Try<W> wrapTryNullable(W t1) {
        return Iterative.wrapNullable(t1).toTry();
    }

    public static <W> Try<W> wrapTryNonNullable(W t1) {
        return Iterative.wrapNonNullable(t1).toTry();
    }

    public static <T extends Comparable<? super T>> Iterative2<T, T> joinFullOf(Iterable<? extends T> t1, Iterable<? extends T> t2) {
        return Iterative.joinFullOf(t1, t2, Fn1.identity(), Fn1.identity());
    }

    public static <T, C extends Comparable<? super C>> Iterative2<T, T> joinFullOf(Iterable<? extends T> t1, Iterable<? extends T> t2, Fn1<? super T, ? extends C> m) {
        return Iterative.joinFullOf(t1, t2, m, m);
    }

    public static <T1, T2 extends Comparable<? super T2>> Iterative2<T1, T2> joinFullOf1(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Fn1<? super T1, ? extends T2> m) {
        return Iterative.joinFullOf(t1, t2, m, Fn1.identity());
    }

    public static <T1 extends Comparable<? super T1>, T2> Iterative2<T1, T2> joinFullOf2(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Fn1<? super T2, ? extends T1> m) {
        return Iterative.joinFullOf(t1, t2, Fn1.identity(), m);
    }

    public static <T1, T2, C extends Comparable<? super C>> Iterative2<T1, T2> joinFullOf(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Fn1<? super T1, ? extends C> m1, Fn1<? super T2, ? extends C> m2) {
        return Joiner.makeJoin(t1, t2, m1, m2, Set::addAll);
    }

    public static <T extends Comparable<? super T>> Iterative2<T, T> joinOuterOf(Iterable<? extends T> t1, Iterable<? extends T> t2) {
        return Iterative.joinOuterOf(t1, t2, Fn1.identity(), Fn1.identity());
    }

    public static <T, C extends Comparable<? super C>> Iterative2<T, T> joinOuterOf(Iterable<? extends T> t1, Iterable<? extends T> t2, Fn1<? super T, ? extends C> m) {
        return Iterative.joinOuterOf(t1, t2, m, m);
    }

    public static <T1, T2 extends Comparable<? super T2>> Iterative2<T1, T2> joinOuterOf1(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Fn1<? super T1, ? extends T2> m) {
        return Iterative.joinOuterOf(t1, t2, m, Fn1.identity());
    }

    public static <T1 extends Comparable<? super T1>, T2> Iterative2<T1, T2> joinOuterOf2(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Fn1<? super T2, ? extends T1> m) {
        return Iterative.joinOuterOf(t1, t2, Fn1.identity(), m);
    }

    public static <T1, T2, C extends Comparable<? super C>> Iterative2<T1, T2> joinOuterOf(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Fn1<? super T1, ? extends C> m1, Fn1<? super T2, ? extends C> m2) {
        return Joiner.makeJoin(t1, t2, m1, m2, (s1, s2) -> s1.filter(Pr1.negate(s2::contains)).addAll(s2.filter(Pr1.negate(s1::contains))));
    }

    public static <T extends Comparable<? super T>> Iterative2<T, T> joinRightOf(Iterable<? extends T> t1, Iterable<? extends T> t2) {
        return Iterative.joinRightOf(t1, t2, Fn1.identity(), Fn1.identity());
    }

    public static <T, C extends Comparable<? super C>> Iterative2<T, T> joinRightOf(Iterable<? extends T> t1, Iterable<? extends T> t2, Fn1<? super T, ? extends C> m) {
        return Iterative.joinRightOf(t1, t2, m, m);
    }

    public static <T1, T2 extends Comparable<? super T2>> Iterative2<T1, T2> joinRightOf1(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Fn1<? super T1, ? extends T2> m) {
        return Iterative.joinRightOf(t1, t2, m, Fn1.identity());
    }

    public static <T1 extends Comparable<? super T1>, T2> Iterative2<T1, T2> joinRightOf2(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Fn1<? super T2, ? extends T1> m) {
        return Iterative.joinRightOf(t1, t2, Fn1.identity(), m);
    }

    public static <T1, T2, C extends Comparable<? super C>> Iterative2<T1, T2> joinRightOf(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Fn1<? super T1, ? extends C> m1, Fn1<? super T2, ? extends C> m2) {
        return Joiner.makeJoin(t1, t2, m1, m2, Fn1.<Set<C>>identity().ignoring1Lt());
    }

    public static <T extends Comparable<? super T>> Iterative2<T, T> joinLeftOf(Iterable<? extends T> t1, Iterable<? extends T> t2) {
        return Iterative.joinLeftOf(t1, t2, Fn1.identity(), Fn1.identity());
    }

    public static <T, C extends Comparable<? super C>> Iterative2<T, T> joinLeftOf(Iterable<? extends T> t1, Iterable<? extends T> t2, Fn1<? super T, ? extends C> m) {
        return Iterative.joinLeftOf(t1, t2, m, m);
    }

    public static <T1, T2 extends Comparable<? super T2>> Iterative2<T1, T2> joinLeftOf1(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Fn1<? super T1, ? extends T2> m) {
        return Iterative.joinLeftOf(t1, t2, m, Fn1.identity());
    }

    public static <T1 extends Comparable<? super T1>, T2> Iterative2<T1, T2> joinLeftOf2(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Fn1<? super T2, ? extends T1> m) {
        return Iterative.joinLeftOf(t1, t2, Fn1.identity(), m);
    }

    public static <T1, T2, C extends Comparable<? super C>> Iterative2<T1, T2> joinLeftOf(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Fn1<? super T1, ? extends C> m1, Fn1<? super T2, ? extends C> m2) {
        return Joiner.makeJoin(t1, t2, m1, m2, Fn1.<Set<C>>identity().ignoring1Rt());
    }

    public static <T extends Comparable<? super T>> Iterative2<T, T> joinOf(Iterable<? extends T> t1, Iterable<? extends T> t2) {
        return Iterative.joinOf(t1, t2, Fn1.identity(), Fn1.identity());
    }

    public static <T, C extends Comparable<? super C>> Iterative2<T, T> joinOf(Iterable<? extends T> t1, Iterable<? extends T> t2, Fn1<? super T, ? extends C> m) {
        return Iterative.joinOf(t1, t2, m, m);
    }

    public static <T1, T2 extends Comparable<? super T2>> Iterative2<T1, T2> joinOf1(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Fn1<? super T1, ? extends T2> m) {
        return Iterative.joinOf(t1, t2, m, Fn1.identity());
    }

    public static <T1 extends Comparable<? super T1>, T2> Iterative2<T1, T2> joinOf2(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Fn1<? super T2, ? extends T1> m) {
        return Iterative.joinOf(t1, t2, Fn1.identity(), m);
    }

    public static <T1, T2, C extends Comparable<? super C>> Iterative2<T1, T2> joinOf(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Fn1<? super T1, ? extends C> m1, Fn1<? super T2, ? extends C> m2) {
        return Joiner.makeJoin(t1, t2, m1, m2, (s1, s2) -> s1.filter(s2::contains));
    }

    public Stream<? extends Tuple> toTupleStream();

    public Stream<? extends Tuple> toStream();

    public Iterator<Iterable<?>> iterators();

    default public Stream<Throwable> failures() {
        return this.iterators().toStream().map(Stream::ofAll).map(Traversable::headOption).map(Value::toTry).filter(Try::isFailure).map(Try::getCause);
    }

    default public Iterator<Iterable<?>> iteratorsOfClass(Class<?> c) {
        Objects.requireNonNull(c, "c is null");
        return this.iterators().filter(iterator -> c.isAssignableFrom(iterator.getClass()));
    }

    default public Iterator<Stream<?>> iteratorsOfStream() {
        return this.iterators().filter(iterator -> iterator instanceof Stream).map(IterativeInternals::force);
    }

    default public Iterator<Option<?>> iteratorsOfOption() {
        return this.iterators().filter(iterator -> iterator instanceof Option).map(IterativeInternals::force);
    }

    default public Iterator<Try<?>> iteratorsOfTry() {
        return this.iterators().filter(iterator -> iterator instanceof Try).map(IterativeInternals::force);
    }

    default public Iterative onSuccess(Rn r) {
        Objects.requireNonNull(r, "r is null");
        this.toStream().headOption().forEach(tuple -> r.run());
        return this;
    }

    default public Iterative onFailure(Rn r) {
        Objects.requireNonNull(r, "r is null");
        this.toStream().toTry().recover(t -> null).filter(Objects::isNull).forEach(tuple -> r.run());
        return this;
    }

    default public boolean isSuccessful() {
        return this.toStream().headOption().isDefined();
    }

    default public boolean isFailure() {
        return this.toStream().headOption().isEmpty();
    }

    public static class Joiner {

        static <T1, T2, C extends Comparable<? super C>> Iterative2<T1, T2> makeJoin(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Fn1<? super T1, ? extends C> m1, Fn1<? super T2, ? extends C> m2, Fn2<? super Set<C>, ? super Set<C>, ? extends Set<C>> joiner) {
            final Map<C, Stream<T1>> t1s = Stream.<T1>ofAll(t1).groupBy(m1);
            final Map<C, Stream<T2>> t2s = Stream.<T2>ofAll(t2).groupBy(m2);
            final SortedSet<C> keys = joiner.apply(t1s.keySet(), t2s.keySet()).toSortedSet(new NullComparator<>());
            final Iterable<Stream<T1>> iterable1 = Iterative.<T1>nullable().of(keys).inlineBranch(key -> t1s.getOrElse(key, Stream.of((T1) null))).iterable1();
            final Iterable<Stream<T2>> iterable2 = Iterative.<T2>nullable().of(keys).inlineBranch(key -> t2s.getOrElse(key, Stream.of((T2) null))).iterable1();
            return Iterative.nullable().inline().by(iterable1, iterable2);
        }

    }

}

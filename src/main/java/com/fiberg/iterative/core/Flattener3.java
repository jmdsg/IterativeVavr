package com.fiberg.iterative.core;

import io.vavr.Tuple;
import io.vavr.Tuple1;
import io.vavr.Tuple2;
import io.vavr.Tuple3;
import io.vavr.Tuple4;
import io.vavr.Tuple5;
import io.vavr.Tuple6;
import io.vavr.Tuple7;
import io.vavr.Tuple8;

public interface Flattener3 {

    public static <T1, T2, T3> Tuple3<T1, T2, T3> flat3(T1 t1, T2 t2, T3 t3) {
        return Tuple.of(t1, t2, t3);
    }

    public static <T1, T2, T3> Tuple3<T1, T2, T3> flat3(T1 t1, T2 t2, Tuple1<? extends T3> tuple3) {
        return Tuple.of(t1, t2, tuple3._1());
    }

    public static <T1, T2, T3> Tuple3<T1, T2, T3> flat3(T1 t1, Tuple1<? extends T2> tuple2, T3 t3) {
        return Tuple.of(t1, tuple2._1(), t3);
    }

    public static <T1, T2, T3> Tuple3<T1, T2, T3> flat3(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3) {
        return Tuple.of(t1, tuple2._1(), tuple3._1());
    }

    public static <T1, T2, T3> Tuple3<T1, T2, T3> flat3(Tuple1<? extends T1> tuple1, T2 t2, T3 t3) {
        return Tuple.of(tuple1._1(), t2, t3);
    }

    public static <T1, T2, T3> Tuple3<T1, T2, T3> flat3(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3) {
        return Tuple.of(tuple1._1(), t2, tuple3._1());
    }

    public static <T1, T2, T3> Tuple3<T1, T2, T3> flat3(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3);
    }

    public static <T1, T2, T3> Tuple3<T1, T2, T3> flat3(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1());
    }

    public static <T1, T2, T3, T4> Tuple4<T1, T2, T3, T4> flat4(T1 t1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3) {
        return Tuple.of(t1, t2, tuple3._1(), tuple3._2());
    }

    public static <T1, T2, T3, T4> Tuple4<T1, T2, T3, T4> flat4(T1 t1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple3._2());
    }

    public static <T1, T2, T3, T4> Tuple4<T1, T2, T3, T4> flat4(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), t3);
    }

    public static <T1, T2, T3, T4> Tuple4<T1, T2, T3, T4> flat4(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple3._1());
    }

    public static <T1, T2, T3, T4> Tuple4<T1, T2, T3, T4> flat4(Tuple1<? extends T1> tuple1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple3._2());
    }

    public static <T1, T2, T3, T4> Tuple4<T1, T2, T3, T4> flat4(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple3._2());
    }

    public static <T1, T2, T3, T4> Tuple4<T1, T2, T3, T4> flat4(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), t3);
    }

    public static <T1, T2, T3, T4> Tuple4<T1, T2, T3, T4> flat4(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple3._1());
    }

    public static <T1, T2, T3, T4> Tuple4<T1, T2, T3, T4> flat4(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, T4 t3) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, t3);
    }

    public static <T1, T2, T3, T4> Tuple4<T1, T2, T3, T4> flat4(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, Tuple1<? extends T4> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, tuple3._1());
    }

    public static <T1, T2, T3, T4> Tuple4<T1, T2, T3, T4> flat4(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 t3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), t3);
    }

    public static <T1, T2, T3, T4> Tuple4<T1, T2, T3, T4> flat4(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple3._1());
    }

    public static <T1, T2, T3, T4, T5> Tuple5<T1, T2, T3, T4, T5> flat5(T1 t1, T2 t2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3) {
        return Tuple.of(t1, t2, tuple3._1(), tuple3._2(), tuple3._3());
    }

    public static <T1, T2, T3, T4, T5> Tuple5<T1, T2, T3, T4, T5> flat5(T1 t1, Tuple1<? extends T2> tuple2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple3._2(), tuple3._3());
    }

    public static <T1, T2, T3, T4, T5> Tuple5<T1, T2, T3, T4, T5> flat5(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple3._1(), tuple3._2());
    }

    public static <T1, T2, T3, T4, T5> Tuple5<T1, T2, T3, T4, T5> flat5(T1 t1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, T5 t3) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple2._3(), t3);
    }

    public static <T1, T2, T3, T4, T5> Tuple5<T1, T2, T3, T4, T5> flat5(T1 t1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple2._3(), tuple3._1());
    }

    public static <T1, T2, T3, T4, T5> Tuple5<T1, T2, T3, T4, T5> flat5(Tuple1<? extends T1> tuple1, T2 t2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple3._2(), tuple3._3());
    }

    public static <T1, T2, T3, T4, T5> Tuple5<T1, T2, T3, T4, T5> flat5(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple3._2(), tuple3._3());
    }

    public static <T1, T2, T3, T4, T5> Tuple5<T1, T2, T3, T4, T5> flat5(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple3._1(), tuple3._2());
    }

    public static <T1, T2, T3, T4, T5> Tuple5<T1, T2, T3, T4, T5> flat5(Tuple1<? extends T1> tuple1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, T5 t3) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple2._3(), t3);
    }

    public static <T1, T2, T3, T4, T5> Tuple5<T1, T2, T3, T4, T5> flat5(Tuple1<? extends T1> tuple1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple2._3(), tuple3._1());
    }

    public static <T1, T2, T3, T4, T5> Tuple5<T1, T2, T3, T4, T5> flat5(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, Tuple2<? extends T4, ? extends T5> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, tuple3._1(), tuple3._2());
    }

    public static <T1, T2, T3, T4, T5> Tuple5<T1, T2, T3, T4, T5> flat5(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple3._1(), tuple3._2());
    }

    public static <T1, T2, T3, T4, T5> Tuple5<T1, T2, T3, T4, T5> flat5(Tuple2<? extends T1, ? extends T2> tuple1, Tuple2<? extends T3, ? extends T4> tuple2, T5 t3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple2._2(), t3);
    }

    public static <T1, T2, T3, T4, T5> Tuple5<T1, T2, T3, T4, T5> flat5(Tuple2<? extends T1, ? extends T2> tuple1, Tuple2<? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple2._2(), tuple3._1());
    }

    public static <T1, T2, T3, T4, T5> Tuple5<T1, T2, T3, T4, T5> flat5(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, T4 t2, T5 t3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), t2, t3);
    }

    public static <T1, T2, T3, T4, T5> Tuple5<T1, T2, T3, T4, T5> flat5(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, T4 t2, Tuple1<? extends T5> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), t2, tuple3._1());
    }

    public static <T1, T2, T3, T4, T5> Tuple5<T1, T2, T3, T4, T5> flat5(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple1<? extends T4> tuple2, T5 t3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple2._1(), t3);
    }

    public static <T1, T2, T3, T4, T5> Tuple5<T1, T2, T3, T4, T5> flat5(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple1<? extends T4> tuple2, Tuple1<? extends T5> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple2._1(), tuple3._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 t1, T2 t2, Tuple4<? extends T3, ? extends T4, ? extends T5, ? extends T6> tuple3) {
        return Tuple.of(t1, t2, tuple3._1(), tuple3._2(), tuple3._3(), tuple3._4());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 t1, Tuple1<? extends T2> tuple2, Tuple4<? extends T3, ? extends T4, ? extends T5, ? extends T6> tuple3) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple3._2(), tuple3._3(), tuple3._4());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple3) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple3._1(), tuple3._2(), tuple3._3());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 t1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple2<? extends T5, ? extends T6> tuple3) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple2._3(), tuple3._1(), tuple3._2());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 t1, Tuple4<? extends T2, ? extends T3, ? extends T4, ? extends T5> tuple2, T6 t3) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple2._3(), tuple2._4(), t3);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 t1, Tuple4<? extends T2, ? extends T3, ? extends T4, ? extends T5> tuple2, Tuple1<? extends T6> tuple3) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple2._3(), tuple2._4(), tuple3._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, T2 t2, Tuple4<? extends T3, ? extends T4, ? extends T5, ? extends T6> tuple3) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple3._2(), tuple3._3(), tuple3._4());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple4<? extends T3, ? extends T4, ? extends T5, ? extends T6> tuple3) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple3._2(), tuple3._3(), tuple3._4());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple3) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple3._1(), tuple3._2(), tuple3._3());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple2<? extends T5, ? extends T6> tuple3) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple2._3(), tuple3._1(), tuple3._2());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, Tuple4<? extends T2, ? extends T3, ? extends T4, ? extends T5> tuple2, T6 t3) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple2._3(), tuple2._4(), t3);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, Tuple4<? extends T2, ? extends T3, ? extends T4, ? extends T5> tuple2, Tuple1<? extends T6> tuple3) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple2._3(), tuple2._4(), tuple3._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, tuple3._1(), tuple3._2(), tuple3._3());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple3._1(), tuple3._2(), tuple3._3());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple2<? extends T1, ? extends T2> tuple1, Tuple2<? extends T3, ? extends T4> tuple2, Tuple2<? extends T5, ? extends T6> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple2._2(), tuple3._1(), tuple3._2());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple2<? extends T1, ? extends T2> tuple1, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple2, T6 t3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple2._2(), tuple2._3(), t3);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple2<? extends T1, ? extends T2> tuple1, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple2, Tuple1<? extends T6> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple2._2(), tuple2._3(), tuple3._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, T4 t2, Tuple2<? extends T5, ? extends T6> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), t2, tuple3._1(), tuple3._2());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple1<? extends T4> tuple2, Tuple2<? extends T5, ? extends T6> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple2._1(), tuple3._1(), tuple3._2());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple2<? extends T4, ? extends T5> tuple2, T6 t3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple2._1(), tuple2._2(), t3);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple2<? extends T4, ? extends T5> tuple2, Tuple1<? extends T6> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple2._1(), tuple2._2(), tuple3._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4> tuple1, T5 t2, T6 t3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple1._4(), t2, t3);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4> tuple1, T5 t2, Tuple1<? extends T6> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple1._4(), t2, tuple3._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4> tuple1, Tuple1<? extends T5> tuple2, T6 t3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple1._4(), tuple2._1(), t3);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4> tuple1, Tuple1<? extends T5> tuple2, Tuple1<? extends T6> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple1._4(), tuple2._1(), tuple3._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, T2 t2, Tuple5<? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> tuple3) {
        return Tuple.of(t1, t2, tuple3._1(), tuple3._2(), tuple3._3(), tuple3._4(), tuple3._5());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple1<? extends T2> tuple2, Tuple5<? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> tuple3) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple3._2(), tuple3._3(), tuple3._4(), tuple3._5());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple4<? extends T4, ? extends T5, ? extends T6, ? extends T7> tuple3) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple3._1(), tuple3._2(), tuple3._3(), tuple3._4());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple3) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple2._3(), tuple3._1(), tuple3._2(), tuple3._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple4<? extends T2, ? extends T3, ? extends T4, ? extends T5> tuple2, Tuple2<? extends T6, ? extends T7> tuple3) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple2._3(), tuple2._4(), tuple3._1(), tuple3._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple5<? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> tuple2, T7 t3) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple2._3(), tuple2._4(), tuple2._5(), t3);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple5<? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> tuple2, Tuple1<? extends T7> tuple3) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple2._3(), tuple2._4(), tuple2._5(), tuple3._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 t2, Tuple5<? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> tuple3) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple3._2(), tuple3._3(), tuple3._4(), tuple3._5());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple5<? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> tuple3) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple3._2(), tuple3._3(), tuple3._4(), tuple3._5());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple4<? extends T4, ? extends T5, ? extends T6, ? extends T7> tuple3) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple3._1(), tuple3._2(), tuple3._3(), tuple3._4());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple3) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple2._3(), tuple3._1(), tuple3._2(), tuple3._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple4<? extends T2, ? extends T3, ? extends T4, ? extends T5> tuple2, Tuple2<? extends T6, ? extends T7> tuple3) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple2._3(), tuple2._4(), tuple3._1(), tuple3._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple5<? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> tuple2, T7 t3) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple2._3(), tuple2._4(), tuple2._5(), t3);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple5<? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> tuple2, Tuple1<? extends T7> tuple3) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple2._3(), tuple2._4(), tuple2._5(), tuple3._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, Tuple4<? extends T4, ? extends T5, ? extends T6, ? extends T7> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, tuple3._1(), tuple3._2(), tuple3._3(), tuple3._4());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple4<? extends T4, ? extends T5, ? extends T6, ? extends T7> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple3._1(), tuple3._2(), tuple3._3(), tuple3._4());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, Tuple2<? extends T3, ? extends T4> tuple2, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple2._2(), tuple3._1(), tuple3._2(), tuple3._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple2, Tuple2<? extends T6, ? extends T7> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple2._2(), tuple2._3(), tuple3._1(), tuple3._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, Tuple4<? extends T3, ? extends T4, ? extends T5, ? extends T6> tuple2, T7 t3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple2._2(), tuple2._3(), tuple2._4(), t3);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, Tuple4<? extends T3, ? extends T4, ? extends T5, ? extends T6> tuple2, Tuple1<? extends T7> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple2._2(), tuple2._3(), tuple2._4(), tuple3._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, T4 t2, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), t2, tuple3._1(), tuple3._2(), tuple3._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple1<? extends T4> tuple2, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple2._1(), tuple3._1(), tuple3._2(), tuple3._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple2<? extends T4, ? extends T5> tuple2, Tuple2<? extends T6, ? extends T7> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple2._1(), tuple2._2(), tuple3._1(), tuple3._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple2, T7 t3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple2._1(), tuple2._2(), tuple2._3(), t3);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple2, Tuple1<? extends T7> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple2._1(), tuple2._2(), tuple2._3(), tuple3._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4> tuple1, T5 t2, Tuple2<? extends T6, ? extends T7> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple1._4(), t2, tuple3._1(), tuple3._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4> tuple1, Tuple1<? extends T5> tuple2, Tuple2<? extends T6, ? extends T7> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple1._4(), tuple2._1(), tuple3._1(), tuple3._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4> tuple1, Tuple2<? extends T5, ? extends T6> tuple2, T7 t3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple1._4(), tuple2._1(), tuple2._2(), t3);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4> tuple1, Tuple2<? extends T5, ? extends T6> tuple2, Tuple1<? extends T7> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple1._4(), tuple2._1(), tuple2._2(), tuple3._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> tuple1, T6 t2, T7 t3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple1._4(), tuple1._5(), t2, t3);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> tuple1, T6 t2, Tuple1<? extends T7> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple1._4(), tuple1._5(), t2, tuple3._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> tuple1, Tuple1<? extends T6> tuple2, T7 t3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple1._4(), tuple1._5(), tuple2._1(), t3);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> tuple1, Tuple1<? extends T6> tuple2, Tuple1<? extends T7> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple1._4(), tuple1._5(), tuple2._1(), tuple3._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple6<? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8> tuple3) {
        return Tuple.of(t1, t2, tuple3._1(), tuple3._2(), tuple3._3(), tuple3._4(), tuple3._5(), tuple3._6());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple6<? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8> tuple3) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple3._2(), tuple3._3(), tuple3._4(), tuple3._5(), tuple3._6());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple5<? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8> tuple3) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple3._1(), tuple3._2(), tuple3._3(), tuple3._4(), tuple3._5());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple4<? extends T5, ? extends T6, ? extends T7, ? extends T8> tuple3) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple2._3(), tuple3._1(), tuple3._2(), tuple3._3(), tuple3._4());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple4<? extends T2, ? extends T3, ? extends T4, ? extends T5> tuple2, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple3) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple2._3(), tuple2._4(), tuple3._1(), tuple3._2(), tuple3._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple5<? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> tuple2, Tuple2<? extends T7, ? extends T8> tuple3) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple2._3(), tuple2._4(), tuple2._5(), tuple3._1(), tuple3._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple6<? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> tuple2, T8 t3) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple2._3(), tuple2._4(), tuple2._5(), tuple2._6(), t3);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple6<? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> tuple2, Tuple1<? extends T8> tuple3) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple2._3(), tuple2._4(), tuple2._5(), tuple2._6(), tuple3._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple6<? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8> tuple3) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple3._2(), tuple3._3(), tuple3._4(), tuple3._5(), tuple3._6());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple6<? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8> tuple3) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple3._2(), tuple3._3(), tuple3._4(), tuple3._5(), tuple3._6());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple5<? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8> tuple3) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple3._1(), tuple3._2(), tuple3._3(), tuple3._4(), tuple3._5());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple4<? extends T5, ? extends T6, ? extends T7, ? extends T8> tuple3) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple2._3(), tuple3._1(), tuple3._2(), tuple3._3(), tuple3._4());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple4<? extends T2, ? extends T3, ? extends T4, ? extends T5> tuple2, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple3) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple2._3(), tuple2._4(), tuple3._1(), tuple3._2(), tuple3._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple5<? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> tuple2, Tuple2<? extends T7, ? extends T8> tuple3) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple2._3(), tuple2._4(), tuple2._5(), tuple3._1(), tuple3._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple6<? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> tuple2, T8 t3) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple2._3(), tuple2._4(), tuple2._5(), tuple2._6(), t3);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple6<? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> tuple2, Tuple1<? extends T8> tuple3) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple2._3(), tuple2._4(), tuple2._5(), tuple2._6(), tuple3._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, Tuple5<? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, tuple3._1(), tuple3._2(), tuple3._3(), tuple3._4(), tuple3._5());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple5<? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple3._1(), tuple3._2(), tuple3._3(), tuple3._4(), tuple3._5());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple2<? extends T3, ? extends T4> tuple2, Tuple4<? extends T5, ? extends T6, ? extends T7, ? extends T8> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple2._2(), tuple3._1(), tuple3._2(), tuple3._3(), tuple3._4());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple2, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple2._2(), tuple2._3(), tuple3._1(), tuple3._2(), tuple3._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple4<? extends T3, ? extends T4, ? extends T5, ? extends T6> tuple2, Tuple2<? extends T7, ? extends T8> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple2._2(), tuple2._3(), tuple2._4(), tuple3._1(), tuple3._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple5<? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> tuple2, T8 t3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple2._2(), tuple2._3(), tuple2._4(), tuple2._5(), t3);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple5<? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> tuple2, Tuple1<? extends T8> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple2._2(), tuple2._3(), tuple2._4(), tuple2._5(), tuple3._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, T4 t2, Tuple4<? extends T5, ? extends T6, ? extends T7, ? extends T8> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), t2, tuple3._1(), tuple3._2(), tuple3._3(), tuple3._4());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple1<? extends T4> tuple2, Tuple4<? extends T5, ? extends T6, ? extends T7, ? extends T8> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple2._1(), tuple3._1(), tuple3._2(), tuple3._3(), tuple3._4());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple2<? extends T4, ? extends T5> tuple2, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple2._1(), tuple2._2(), tuple3._1(), tuple3._2(), tuple3._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple2, Tuple2<? extends T7, ? extends T8> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple2._1(), tuple2._2(), tuple2._3(), tuple3._1(), tuple3._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple4<? extends T4, ? extends T5, ? extends T6, ? extends T7> tuple2, T8 t3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple2._1(), tuple2._2(), tuple2._3(), tuple2._4(), t3);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple4<? extends T4, ? extends T5, ? extends T6, ? extends T7> tuple2, Tuple1<? extends T8> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple2._1(), tuple2._2(), tuple2._3(), tuple2._4(), tuple3._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4> tuple1, T5 t2, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple1._4(), t2, tuple3._1(), tuple3._2(), tuple3._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4> tuple1, Tuple1<? extends T5> tuple2, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple1._4(), tuple2._1(), tuple3._1(), tuple3._2(), tuple3._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4> tuple1, Tuple2<? extends T5, ? extends T6> tuple2, Tuple2<? extends T7, ? extends T8> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple1._4(), tuple2._1(), tuple2._2(), tuple3._1(), tuple3._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4> tuple1, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple2, T8 t3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple1._4(), tuple2._1(), tuple2._2(), tuple2._3(), t3);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4> tuple1, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple2, Tuple1<? extends T8> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple1._4(), tuple2._1(), tuple2._2(), tuple2._3(), tuple3._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> tuple1, T6 t2, Tuple2<? extends T7, ? extends T8> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple1._4(), tuple1._5(), t2, tuple3._1(), tuple3._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> tuple1, Tuple1<? extends T6> tuple2, Tuple2<? extends T7, ? extends T8> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple1._4(), tuple1._5(), tuple2._1(), tuple3._1(), tuple3._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> tuple1, Tuple2<? extends T6, ? extends T7> tuple2, T8 t3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple1._4(), tuple1._5(), tuple2._1(), tuple2._2(), t3);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> tuple1, Tuple2<? extends T6, ? extends T7> tuple2, Tuple1<? extends T8> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple1._4(), tuple1._5(), tuple2._1(), tuple2._2(), tuple3._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> tuple1, T7 t2, T8 t3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple1._4(), tuple1._5(), tuple1._6(), t2, t3);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> tuple1, T7 t2, Tuple1<? extends T8> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple1._4(), tuple1._5(), tuple1._6(), t2, tuple3._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> tuple1, Tuple1<? extends T7> tuple2, T8 t3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple1._4(), tuple1._5(), tuple1._6(), tuple2._1(), t3);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> tuple1, Tuple1<? extends T7> tuple2, Tuple1<? extends T8> tuple3) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple1._4(), tuple1._5(), tuple1._6(), tuple2._1(), tuple3._1());
    }

}

package com.fiberg.iterative.core;

import io.vavr.*;

public interface Flattener6 {

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return Tuple.of(t1, t2, t3, t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(t1, t2, t3, t4, t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 t1, T2 t2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6) {
        return Tuple.of(t1, t2, t3, t4, tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 t1, T2 t2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(t1, t2, t3, t4, tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 t1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6) {
        return Tuple.of(t1, t2, t3, tuple4._1(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 t1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(t1, t2, t3, tuple4._1(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 t1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6) {
        return Tuple.of(t1, t2, t3, tuple4._1(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 t1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(t1, t2, t3, tuple4._1(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, T6 t6) {
        return Tuple.of(t1, t2, tuple3._1(), t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), t4, t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6) {
        return Tuple.of(t1, t2, tuple3._1(), t4, tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), t4, tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return Tuple.of(t1, tuple2._1(), t3, t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(t1, tuple2._1(), t3, t4, t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6) {
        return Tuple.of(t1, tuple2._1(), t3, t4, tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(t1, tuple2._1(), t3, t4, tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, T6 t6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), t4, t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), t4, tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), t4, tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return Tuple.of(tuple1._1(), t2, t3, t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(tuple1._1(), t2, t3, t4, t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6) {
        return Tuple.of(tuple1._1(), t2, t3, t4, tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(tuple1._1(), t2, t3, t4, tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, T6 t6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), t4, t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), t4, tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), t4, tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, t4, t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, t4, tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, t4, tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, T6 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), t4, t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), t4, tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), t4, tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(t1, t2, t3, t4, t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, T2 t2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(t1, t2, t3, t4, tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, T2 t2, T3 t3, T4 t4, Tuple2<? extends T5, ? extends T6> tuple5, T7 t6) {
        return Tuple.of(t1, t2, t3, t4, tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, T2 t2, T3 t3, T4 t4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(t1, t2, t3, t4, tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(t1, t2, t3, tuple4._1(), t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(t1, t2, t3, tuple4._1(), tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, T7 t6) {
        return Tuple.of(t1, t2, t3, tuple4._1(), tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(t1, t2, t3, tuple4._1(), tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, T2 t2, T3 t3, Tuple2<? extends T4, ? extends T5> tuple4, T6 t5, T7 t6) {
        return Tuple.of(t1, t2, t3, tuple4._1(), tuple4._2(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, T2 t2, T3 t3, Tuple2<? extends T4, ? extends T5> tuple4, T6 t5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(t1, t2, t3, tuple4._1(), tuple4._2(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, T2 t2, T3 t3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 t6) {
        return Tuple.of(t1, t2, t3, tuple4._1(), tuple4._2(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, T2 t2, T3 t3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(t1, t2, t3, tuple4._1(), tuple4._2(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), t4, t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), t4, tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, Tuple2<? extends T5, ? extends T6> tuple5, T7 t6) {
        return Tuple.of(t1, t2, tuple3._1(), t4, tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), t4, tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, T7 t6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, T6 t5, T7 t6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), tuple4._2(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, T6 t5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), tuple4._2(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 t6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), tuple4._2(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), tuple4._2(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, T5 t4, T6 t5, T7 t6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple3._2(), t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, T5 t4, T6 t5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple3._2(), t4, t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, T5 t4, Tuple1<? extends T6> tuple5, T7 t6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple3._2(), t4, tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, T5 t4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple3._2(), t4, tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 t5, T7 t6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple3._2(), tuple4._1(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 t5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple3._2(), tuple4._1(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 t6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple3._2(), tuple4._1(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple3._2(), tuple4._1(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, T5 t5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(t1, tuple2._1(), t3, t4, t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(t1, tuple2._1(), t3, t4, tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, Tuple2<? extends T5, ? extends T6> tuple5, T7 t6) {
        return Tuple.of(t1, tuple2._1(), t3, t4, tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(t1, tuple2._1(), t3, t4, tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, T7 t6) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple2<? extends T4, ? extends T5> tuple4, T6 t5, T7 t6) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), tuple4._2(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple2<? extends T4, ? extends T5> tuple4, T6 t5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), tuple4._2(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 t6) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), tuple4._2(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), tuple4._2(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), t4, t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), t4, tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, Tuple2<? extends T5, ? extends T6> tuple5, T7 t6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), t4, tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), t4, tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, T7 t6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, T6 t5, T7 t6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), tuple4._2(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, T6 t5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), tuple4._2(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 t6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), tuple4._2(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), tuple4._2(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, T5 t4, T6 t5, T7 t6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple3._2(), t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, T5 t4, T6 t5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple3._2(), t4, t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, T5 t4, Tuple1<? extends T6> tuple5, T7 t6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple3._2(), t4, tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, T5 t4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple3._2(), t4, tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 t5, T7 t6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple3._2(), tuple4._1(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 t5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple3._2(), tuple4._1(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 t6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple3._2(), tuple4._1(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple3._2(), tuple4._1(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, T5 t4, T6 t5, T7 t6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), t3, t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, T5 t4, T6 t5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), t3, t4, t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, T5 t4, Tuple1<? extends T6> tuple5, T7 t6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), t3, t4, tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, T5 t4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), t3, t4, tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, Tuple1<? extends T5> tuple4, T6 t5, T7 t6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), t3, tuple4._1(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, Tuple1<? extends T5> tuple4, T6 t5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), t3, tuple4._1(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 t6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), t3, tuple4._1(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), t3, tuple4._1(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 t4, T6 t5, T7 t6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple3._1(), t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 t4, T6 t5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple3._1(), t4, t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 t4, Tuple1<? extends T6> tuple5, T7 t6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple3._1(), t4, tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 t4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple3._1(), t4, tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 t5, T7 t6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple3._1(), tuple4._1(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 t5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple3._1(), tuple4._1(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 t6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple3._1(), tuple4._1(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, T4 t4, T5 t5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), t2, t3, t4, t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), t2, t3, t4, tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, T4 t4, Tuple2<? extends T5, ? extends T6> tuple5, T7 t6) {
        return Tuple.of(tuple1._1(), t2, t3, t4, tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, T4 t4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), t2, t3, t4, tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, T7 t6) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple2<? extends T4, ? extends T5> tuple4, T6 t5, T7 t6) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), tuple4._2(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple2<? extends T4, ? extends T5> tuple4, T6 t5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), tuple4._2(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 t6) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), tuple4._2(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), tuple4._2(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), t4, t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), t4, tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, Tuple2<? extends T5, ? extends T6> tuple5, T7 t6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), t4, tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), t4, tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, T7 t6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, T6 t5, T7 t6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), tuple4._2(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, T6 t5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), tuple4._2(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 t6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), tuple4._2(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), tuple4._2(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, T5 t4, T6 t5, T7 t6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple3._2(), t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, T5 t4, T6 t5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple3._2(), t4, t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, T5 t4, Tuple1<? extends T6> tuple5, T7 t6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple3._2(), t4, tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, T5 t4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple3._2(), t4, tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 t5, T7 t6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple3._2(), tuple4._1(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 t5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple3._2(), tuple4._1(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 t6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple3._2(), tuple4._1(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple3._2(), tuple4._1(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, T5 t5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, t4, t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, t4, tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, Tuple2<? extends T5, ? extends T6> tuple5, T7 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, t4, tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, t4, tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, T7 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple2<? extends T4, ? extends T5> tuple4, T6 t5, T7 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), tuple4._2(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple2<? extends T4, ? extends T5> tuple4, T6 t5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), tuple4._2(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), tuple4._2(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), tuple4._2(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), t4, t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), t4, tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, Tuple2<? extends T5, ? extends T6> tuple5, T7 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), t4, tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), t4, tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, T7 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, T6 t5, T7 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), tuple4._2(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, T6 t5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), tuple4._2(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), tuple4._2(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), tuple4._2(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, T5 t4, T6 t5, T7 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple3._2(), t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, T5 t4, T6 t5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple3._2(), t4, t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, T5 t4, Tuple1<? extends T6> tuple5, T7 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple3._2(), t4, tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, T5 t4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple3._2(), t4, tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 t5, T7 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple3._2(), tuple4._1(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 t5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple3._2(), tuple4._1(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple3._2(), tuple4._1(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple3._2(), tuple4._1(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, T5 t4, T6 t5, T7 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), t3, t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, T5 t4, T6 t5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), t3, t4, t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, T5 t4, Tuple1<? extends T6> tuple5, T7 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), t3, t4, tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, T5 t4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), t3, t4, tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, Tuple1<? extends T5> tuple4, T6 t5, T7 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), t3, tuple4._1(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, Tuple1<? extends T5> tuple4, T6 t5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), t3, tuple4._1(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), t3, tuple4._1(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), t3, tuple4._1(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 t4, T6 t5, T7 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple3._1(), t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 t4, T6 t5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple3._1(), t4, t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 t4, Tuple1<? extends T6> tuple5, T7 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple3._1(), t4, tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 t4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple3._1(), t4, tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 t5, T7 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple3._1(), tuple4._1(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 t5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple3._1(), tuple4._1(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple3._1(), tuple4._1(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, T4 t3, T5 t4, T6 t5, T7 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, t3, t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, T4 t3, T5 t4, T6 t5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, t3, t4, t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, T4 t3, T5 t4, Tuple1<? extends T6> tuple5, T7 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, t3, t4, tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, T4 t3, T5 t4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, t3, t4, tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, T4 t3, Tuple1<? extends T5> tuple4, T6 t5, T7 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, t3, tuple4._1(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, T4 t3, Tuple1<? extends T5> tuple4, T6 t5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, t3, tuple4._1(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, T4 t3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, t3, tuple4._1(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, T4 t3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, t3, tuple4._1(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, Tuple1<? extends T4> tuple3, T5 t4, T6 t5, T7 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, tuple3._1(), t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, Tuple1<? extends T4> tuple3, T5 t4, T6 t5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, tuple3._1(), t4, t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, Tuple1<? extends T4> tuple3, T5 t4, Tuple1<? extends T6> tuple5, T7 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, tuple3._1(), t4, tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, Tuple1<? extends T4> tuple3, T5 t4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, tuple3._1(), t4, tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 t5, T7 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, tuple3._1(), tuple4._1(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 t5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, tuple3._1(), tuple4._1(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, tuple3._1(), tuple4._1(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 t3, T5 t4, T6 t5, T7 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), t3, t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 t3, T5 t4, T6 t5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), t3, t4, t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 t3, T5 t4, Tuple1<? extends T6> tuple5, T7 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), t3, t4, tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 t3, T5 t4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), t3, t4, tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 t3, Tuple1<? extends T5> tuple4, T6 t5, T7 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), t3, tuple4._1(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 t3, Tuple1<? extends T5> tuple4, T6 t5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), t3, tuple4._1(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 t3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), t3, tuple4._1(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 t3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), t3, tuple4._1(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 t4, T6 t5, T7 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple3._1(), t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 t4, T6 t5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple3._1(), t4, t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 t4, Tuple1<? extends T6> tuple5, T7 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple3._1(), t4, tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 t4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple3._1(), t4, tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 t5, T7 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple3._1(), tuple4._1(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 t5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple3._1(), tuple4._1(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, t2, t3, t4, t5, tuple6._1(), tuple6._2(), tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, t2, t3, t4, tuple5._1(), tuple6._1(), tuple6._2(), tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, T4 t4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, t2, t3, t4, tuple5._1(), tuple5._2(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, T4 t4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(t1, t2, t3, t4, tuple5._1(), tuple5._2(), tuple5._3(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, T4 t4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, t2, t3, t4, tuple5._1(), tuple5._2(), tuple5._3(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, t2, t3, tuple4._1(), t5, tuple6._1(), tuple6._2(), tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, t2, t3, tuple4._1(), tuple5._1(), tuple6._1(), tuple6._2(), tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, t2, t3, tuple4._1(), tuple5._1(), tuple5._2(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(t1, t2, t3, tuple4._1(), tuple5._1(), tuple5._2(), tuple5._3(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, t2, t3, tuple4._1(), tuple5._1(), tuple5._2(), tuple5._3(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, Tuple2<? extends T4, ? extends T5> tuple4, T6 t5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, t2, t3, tuple4._1(), tuple4._2(), t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, t2, t3, tuple4._1(), tuple4._2(), tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(t1, t2, t3, tuple4._1(), tuple4._2(), tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, t2, t3, tuple4._1(), tuple4._2(), tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, T7 t5, T8 t6) {
        return Tuple.of(t1, t2, t3, tuple4._1(), tuple4._2(), tuple4._3(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, t2, t3, tuple4._1(), tuple4._2(), tuple4._3(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(t1, t2, t3, tuple4._1(), tuple4._2(), tuple4._3(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, t2, t3, tuple4._1(), tuple4._2(), tuple4._3(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), t4, t5, tuple6._1(), tuple6._2(), tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), t4, tuple5._1(), tuple6._1(), tuple6._2(), tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), t4, tuple5._1(), tuple5._2(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(t1, t2, tuple3._1(), t4, tuple5._1(), tuple5._2(), tuple5._3(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), t4, tuple5._1(), tuple5._2(), tuple5._3(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), t5, tuple6._1(), tuple6._2(), tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), tuple6._2(), tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), tuple5._1(), tuple5._2(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), tuple5._1(), tuple5._2(), tuple5._3(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), tuple5._1(), tuple5._2(), tuple5._3(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, T6 t5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), tuple4._2(), t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), tuple4._2(), tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), tuple4._2(), tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), tuple4._2(), tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, T7 t5, T8 t6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), tuple4._2(), tuple4._3(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), tuple4._2(), tuple4._3(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), tuple4._2(), tuple4._3(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), tuple4._2(), tuple4._3(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, T5 t4, T6 t5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple3._2(), t4, t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, T5 t4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple3._2(), t4, tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, T5 t4, Tuple2<? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple3._2(), t4, tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, T5 t4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple3._2(), t4, tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 t5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple3._2(), tuple4._1(), t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple3._2(), tuple4._1(), tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple3._2(), tuple4._1(), tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple3._2(), tuple4._1(), tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, T7 t5, T8 t6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple3._2(), tuple4._1(), tuple4._2(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple3._2(), tuple4._1(), tuple4._2(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple3._2(), tuple4._1(), tuple4._2(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple3._2(), tuple4._1(), tuple4._2(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, T6 t4, T7 t5, T8 t6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple3._2(), tuple3._3(), t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, T6 t4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple3._2(), tuple3._3(), t4, t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, T6 t4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple3._2(), tuple3._3(), t4, tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, T6 t4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple3._2(), tuple3._3(), t4, tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 t5, T8 t6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple3._2(), tuple3._3(), tuple4._1(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple3._2(), tuple3._3(), tuple4._1(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple3._2(), tuple3._3(), tuple4._1(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, t2, tuple3._1(), tuple3._2(), tuple3._3(), tuple4._1(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, T5 t5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), t3, t4, t5, tuple6._1(), tuple6._2(), tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), t3, t4, tuple5._1(), tuple6._1(), tuple6._2(), tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), t3, t4, tuple5._1(), tuple5._2(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(t1, tuple2._1(), t3, t4, tuple5._1(), tuple5._2(), tuple5._3(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), t3, t4, tuple5._1(), tuple5._2(), tuple5._3(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), t5, tuple6._1(), tuple6._2(), tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), tuple5._1(), tuple6._1(), tuple6._2(), tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), tuple5._1(), tuple5._2(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), tuple5._1(), tuple5._2(), tuple5._3(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), tuple5._1(), tuple5._2(), tuple5._3(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple2<? extends T4, ? extends T5> tuple4, T6 t5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), tuple4._2(), t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), tuple4._2(), tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), tuple4._2(), tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), tuple4._2(), tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, T7 t5, T8 t6) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), tuple4._2(), tuple4._3(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), tuple4._2(), tuple4._3(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), tuple4._2(), tuple4._3(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), tuple4._2(), tuple4._3(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), t4, t5, tuple6._1(), tuple6._2(), tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), t4, tuple5._1(), tuple6._1(), tuple6._2(), tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), t4, tuple5._1(), tuple5._2(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), t4, tuple5._1(), tuple5._2(), tuple5._3(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), t4, tuple5._1(), tuple5._2(), tuple5._3(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), t5, tuple6._1(), tuple6._2(), tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), tuple6._2(), tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), tuple5._2(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), tuple5._2(), tuple5._3(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), tuple5._2(), tuple5._3(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, T6 t5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), tuple4._2(), t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), tuple4._2(), tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), tuple4._2(), tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), tuple4._2(), tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, T7 t5, T8 t6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), tuple4._2(), tuple4._3(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), tuple4._2(), tuple4._3(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), tuple4._2(), tuple4._3(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), tuple4._2(), tuple4._3(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, T5 t4, T6 t5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple3._2(), t4, t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, T5 t4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple3._2(), t4, tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, T5 t4, Tuple2<? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple3._2(), t4, tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, T5 t4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple3._2(), t4, tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 t5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple3._2(), tuple4._1(), t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple3._2(), tuple4._1(), tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple3._2(), tuple4._1(), tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple3._2(), tuple4._1(), tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, T7 t5, T8 t6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple3._2(), tuple4._1(), tuple4._2(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple3._2(), tuple4._1(), tuple4._2(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple3._2(), tuple4._1(), tuple4._2(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple3._2(), tuple4._1(), tuple4._2(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, T6 t4, T7 t5, T8 t6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple3._2(), tuple3._3(), t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, T6 t4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple3._2(), tuple3._3(), t4, t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, T6 t4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple3._2(), tuple3._3(), t4, tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, T6 t4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple3._2(), tuple3._3(), t4, tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 t5, T8 t6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple3._2(), tuple3._3(), tuple4._1(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple3._2(), tuple3._3(), tuple4._1(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple3._2(), tuple3._3(), tuple4._1(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple3._2(), tuple3._3(), tuple4._1(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, T5 t4, T6 t5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), t3, t4, t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, T5 t4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), t3, t4, tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, T5 t4, Tuple2<? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), t3, t4, tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, T5 t4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), t3, t4, tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, Tuple1<? extends T5> tuple4, T6 t5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), t3, tuple4._1(), t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), t3, tuple4._1(), tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), t3, tuple4._1(), tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), t3, tuple4._1(), tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, Tuple2<? extends T5, ? extends T6> tuple4, T7 t5, T8 t6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), t3, tuple4._1(), tuple4._2(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, Tuple2<? extends T5, ? extends T6> tuple4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), t3, tuple4._1(), tuple4._2(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), t3, tuple4._1(), tuple4._2(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), t3, tuple4._1(), tuple4._2(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 t4, T6 t5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple3._1(), t4, t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 t4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple3._1(), t4, tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 t4, Tuple2<? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple3._1(), t4, tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 t4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple3._1(), t4, tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 t5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple3._1(), tuple4._1(), t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple3._1(), tuple4._1(), tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple3._1(), tuple4._1(), tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, T7 t5, T8 t6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple3._1(), tuple4._1(), tuple4._2(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple3._1(), tuple4._1(), tuple4._2(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple3._1(), tuple4._1(), tuple4._2(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple3._1(), tuple4._1(), tuple4._2(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, T6 t4, T7 t5, T8 t6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple3._1(), tuple3._2(), t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, T6 t4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple3._1(), tuple3._2(), t4, t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, T6 t4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple3._1(), tuple3._2(), t4, tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, T6 t4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple3._1(), tuple3._2(), t4, tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 t5, T8 t6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple3._1(), tuple3._2(), tuple4._1(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple3._1(), tuple3._2(), tuple4._1(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple3._1(), tuple3._2(), tuple4._1(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple3._1(), tuple3._2(), tuple4._1(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, T5 t3, T6 t4, T7 t5, T8 t6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple2._3(), t3, t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, T5 t3, T6 t4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple2._3(), t3, t4, t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, T5 t3, T6 t4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple2._3(), t3, t4, tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, T5 t3, T6 t4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple2._3(), t3, t4, tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, T5 t3, Tuple1<? extends T6> tuple4, T7 t5, T8 t6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple2._3(), t3, tuple4._1(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, T5 t3, Tuple1<? extends T6> tuple4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple2._3(), t3, tuple4._1(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, T5 t3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple2._3(), t3, tuple4._1(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, T5 t3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple2._3(), t3, tuple4._1(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, T6 t4, T7 t5, T8 t6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple2._3(), tuple3._1(), t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, T6 t4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple2._3(), tuple3._1(), t4, t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, T6 t4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple2._3(), tuple3._1(), t4, tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, T6 t4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple2._3(), tuple3._1(), t4, tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 t5, T8 t6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple2._3(), tuple3._1(), tuple4._1(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple2._3(), tuple3._1(), tuple4._1(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple2._3(), tuple3._1(), tuple4._1(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(t1, tuple2._1(), tuple2._2(), tuple2._3(), tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, T4 t4, T5 t5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), t2, t3, t4, t5, tuple6._1(), tuple6._2(), tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), t2, t3, t4, tuple5._1(), tuple6._1(), tuple6._2(), tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, T4 t4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), t2, t3, t4, tuple5._1(), tuple5._2(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, T4 t4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), t2, t3, t4, tuple5._1(), tuple5._2(), tuple5._3(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, T4 t4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), t2, t3, t4, tuple5._1(), tuple5._2(), tuple5._3(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), t5, tuple6._1(), tuple6._2(), tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), tuple5._1(), tuple6._1(), tuple6._2(), tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), tuple5._1(), tuple5._2(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), tuple5._1(), tuple5._2(), tuple5._3(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), tuple5._1(), tuple5._2(), tuple5._3(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple2<? extends T4, ? extends T5> tuple4, T6 t5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), tuple4._2(), t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), tuple4._2(), tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), tuple4._2(), tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), tuple4._2(), tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, T7 t5, T8 t6) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), tuple4._2(), tuple4._3(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), tuple4._2(), tuple4._3(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), tuple4._2(), tuple4._3(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), tuple4._2(), tuple4._3(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), t4, t5, tuple6._1(), tuple6._2(), tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), t4, tuple5._1(), tuple6._1(), tuple6._2(), tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), t4, tuple5._1(), tuple5._2(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), t4, tuple5._1(), tuple5._2(), tuple5._3(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), t4, tuple5._1(), tuple5._2(), tuple5._3(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), t5, tuple6._1(), tuple6._2(), tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), tuple6._2(), tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), tuple5._1(), tuple5._2(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), tuple5._1(), tuple5._2(), tuple5._3(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), tuple5._1(), tuple5._2(), tuple5._3(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, T6 t5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), tuple4._2(), t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), tuple4._2(), tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), tuple4._2(), tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), tuple4._2(), tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, T7 t5, T8 t6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), tuple4._2(), tuple4._3(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), tuple4._2(), tuple4._3(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), tuple4._2(), tuple4._3(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), tuple4._2(), tuple4._3(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, T5 t4, T6 t5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple3._2(), t4, t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, T5 t4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple3._2(), t4, tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, T5 t4, Tuple2<? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple3._2(), t4, tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, T5 t4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple3._2(), t4, tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 t5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple3._2(), tuple4._1(), t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple3._2(), tuple4._1(), tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple3._2(), tuple4._1(), tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple3._2(), tuple4._1(), tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, T7 t5, T8 t6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple3._2(), tuple4._1(), tuple4._2(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple3._2(), tuple4._1(), tuple4._2(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple3._2(), tuple4._1(), tuple4._2(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple3._2(), tuple4._1(), tuple4._2(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, T6 t4, T7 t5, T8 t6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple3._2(), tuple3._3(), t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, T6 t4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple3._2(), tuple3._3(), t4, t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, T6 t4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple3._2(), tuple3._3(), t4, tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, T6 t4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple3._2(), tuple3._3(), t4, tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 t5, T8 t6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple3._2(), tuple3._3(), tuple4._1(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple3._2(), tuple3._3(), tuple4._1(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple3._2(), tuple3._3(), tuple4._1(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple3._2(), tuple3._3(), tuple4._1(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, T5 t5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, t4, t5, tuple6._1(), tuple6._2(), tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, t4, tuple5._1(), tuple6._1(), tuple6._2(), tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, t4, tuple5._1(), tuple5._2(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, t4, tuple5._1(), tuple5._2(), tuple5._3(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, t4, tuple5._1(), tuple5._2(), tuple5._3(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), t5, tuple6._1(), tuple6._2(), tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), tuple5._1(), tuple6._1(), tuple6._2(), tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), tuple5._1(), tuple5._2(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), tuple5._1(), tuple5._2(), tuple5._3(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), tuple5._1(), tuple5._2(), tuple5._3(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple2<? extends T4, ? extends T5> tuple4, T6 t5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), tuple4._2(), t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), tuple4._2(), tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), tuple4._2(), tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), tuple4._2(), tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, T7 t5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), tuple4._2(), tuple4._3(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), tuple4._2(), tuple4._3(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), tuple4._2(), tuple4._3(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), tuple4._2(), tuple4._3(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), t4, t5, tuple6._1(), tuple6._2(), tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), t4, tuple5._1(), tuple6._1(), tuple6._2(), tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), t4, tuple5._1(), tuple5._2(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), t4, tuple5._1(), tuple5._2(), tuple5._3(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), t4, tuple5._1(), tuple5._2(), tuple5._3(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), t5, tuple6._1(), tuple6._2(), tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), tuple6._2(), tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), tuple5._2(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), tuple5._2(), tuple5._3(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), tuple5._2(), tuple5._3(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, T6 t5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), tuple4._2(), t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), tuple4._2(), tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), tuple4._2(), tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), tuple4._2(), tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, T7 t5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), tuple4._2(), tuple4._3(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), tuple4._2(), tuple4._3(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), tuple4._2(), tuple4._3(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), tuple4._2(), tuple4._3(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, T5 t4, T6 t5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple3._2(), t4, t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, T5 t4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple3._2(), t4, tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, T5 t4, Tuple2<? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple3._2(), t4, tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, T5 t4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple3._2(), t4, tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 t5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple3._2(), tuple4._1(), t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple3._2(), tuple4._1(), tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple3._2(), tuple4._1(), tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple3._2(), tuple4._1(), tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, T7 t5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple3._2(), tuple4._1(), tuple4._2(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple3._2(), tuple4._1(), tuple4._2(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple3._2(), tuple4._1(), tuple4._2(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple3._2(), tuple4._1(), tuple4._2(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, T6 t4, T7 t5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple3._2(), tuple3._3(), t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, T6 t4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple3._2(), tuple3._3(), t4, t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, T6 t4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple3._2(), tuple3._3(), t4, tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, T6 t4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple3._2(), tuple3._3(), t4, tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 t5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple3._2(), tuple3._3(), tuple4._1(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple3._2(), tuple3._3(), tuple4._1(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple3._2(), tuple3._3(), tuple4._1(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple3._2(), tuple3._3(), tuple4._1(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, T5 t4, T6 t5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), t3, t4, t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, T5 t4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), t3, t4, tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, T5 t4, Tuple2<? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), t3, t4, tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, T5 t4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), t3, t4, tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, Tuple1<? extends T5> tuple4, T6 t5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), t3, tuple4._1(), t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), t3, tuple4._1(), tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), t3, tuple4._1(), tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), t3, tuple4._1(), tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, Tuple2<? extends T5, ? extends T6> tuple4, T7 t5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), t3, tuple4._1(), tuple4._2(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, Tuple2<? extends T5, ? extends T6> tuple4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), t3, tuple4._1(), tuple4._2(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), t3, tuple4._1(), tuple4._2(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 t3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), t3, tuple4._1(), tuple4._2(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 t4, T6 t5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple3._1(), t4, t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 t4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple3._1(), t4, tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 t4, Tuple2<? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple3._1(), t4, tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 t4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple3._1(), t4, tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 t5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple3._1(), tuple4._1(), t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple3._1(), tuple4._1(), tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple3._1(), tuple4._1(), tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, T7 t5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple3._1(), tuple4._1(), tuple4._2(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple3._1(), tuple4._1(), tuple4._2(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple3._1(), tuple4._1(), tuple4._2(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple3._1(), tuple4._1(), tuple4._2(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, T6 t4, T7 t5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple3._1(), tuple3._2(), t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, T6 t4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple3._1(), tuple3._2(), t4, t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, T6 t4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple3._1(), tuple3._2(), t4, tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, T6 t4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple3._1(), tuple3._2(), t4, tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 t5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple3._1(), tuple3._2(), tuple4._1(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple3._1(), tuple3._2(), tuple4._1(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple3._1(), tuple3._2(), tuple4._1(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple3._1(), tuple3._2(), tuple4._1(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, T5 t3, T6 t4, T7 t5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple2._3(), t3, t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, T5 t3, T6 t4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple2._3(), t3, t4, t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, T5 t3, T6 t4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple2._3(), t3, t4, tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, T5 t3, T6 t4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple2._3(), t3, t4, tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, T5 t3, Tuple1<? extends T6> tuple4, T7 t5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple2._3(), t3, tuple4._1(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, T5 t3, Tuple1<? extends T6> tuple4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple2._3(), t3, tuple4._1(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, T5 t3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple2._3(), t3, tuple4._1(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, T5 t3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple2._3(), t3, tuple4._1(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, T6 t4, T7 t5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple2._3(), tuple3._1(), t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, T6 t4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple2._3(), tuple3._1(), t4, t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, T6 t4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple2._3(), tuple3._1(), t4, tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, T6 t4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple2._3(), tuple3._1(), t4, tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 t5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple2._3(), tuple3._1(), tuple4._1(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple2._3(), tuple3._1(), tuple4._1(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple2._3(), tuple3._1(), tuple4._1(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple2._2(), tuple2._3(), tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, T4 t3, T5 t4, T6 t5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, t3, t4, t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, T4 t3, T5 t4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, t3, t4, tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, T4 t3, T5 t4, Tuple2<? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, t3, t4, tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, T4 t3, T5 t4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, t3, t4, tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, T4 t3, Tuple1<? extends T5> tuple4, T6 t5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, t3, tuple4._1(), t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, T4 t3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, t3, tuple4._1(), tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, T4 t3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, t3, tuple4._1(), tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, T4 t3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, t3, tuple4._1(), tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, T4 t3, Tuple2<? extends T5, ? extends T6> tuple4, T7 t5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, t3, tuple4._1(), tuple4._2(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, T4 t3, Tuple2<? extends T5, ? extends T6> tuple4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, t3, tuple4._1(), tuple4._2(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, T4 t3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, t3, tuple4._1(), tuple4._2(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, T4 t3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, t3, tuple4._1(), tuple4._2(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, Tuple1<? extends T4> tuple3, T5 t4, T6 t5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, tuple3._1(), t4, t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, Tuple1<? extends T4> tuple3, T5 t4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, tuple3._1(), t4, tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, Tuple1<? extends T4> tuple3, T5 t4, Tuple2<? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, tuple3._1(), t4, tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, Tuple1<? extends T4> tuple3, T5 t4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, tuple3._1(), t4, tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 t5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, tuple3._1(), tuple4._1(), t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, tuple3._1(), tuple4._1(), tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, tuple3._1(), tuple4._1(), tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, Tuple1<? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, T7 t5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, tuple3._1(), tuple4._1(), tuple4._2(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, Tuple1<? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, tuple3._1(), tuple4._1(), tuple4._2(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, Tuple1<? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, tuple3._1(), tuple4._1(), tuple4._2(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, Tuple1<? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, tuple3._1(), tuple4._1(), tuple4._2(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, Tuple2<? extends T4, ? extends T5> tuple3, T6 t4, T7 t5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, tuple3._1(), tuple3._2(), t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, Tuple2<? extends T4, ? extends T5> tuple3, T6 t4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, tuple3._1(), tuple3._2(), t4, t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, Tuple2<? extends T4, ? extends T5> tuple3, T6 t4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, tuple3._1(), tuple3._2(), t4, tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, Tuple2<? extends T4, ? extends T5> tuple3, T6 t4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, tuple3._1(), tuple3._2(), t4, tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, Tuple2<? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 t5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, tuple3._1(), tuple3._2(), tuple4._1(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, Tuple2<? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, tuple3._1(), tuple3._2(), tuple4._1(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, Tuple2<? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, tuple3._1(), tuple3._2(), tuple4._1(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 t2, Tuple2<? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), t2, tuple3._1(), tuple3._2(), tuple4._1(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 t3, T5 t4, T6 t5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), t3, t4, t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 t3, T5 t4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), t3, t4, tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 t3, T5 t4, Tuple2<? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), t3, t4, tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 t3, T5 t4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), t3, t4, tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 t3, Tuple1<? extends T5> tuple4, T6 t5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), t3, tuple4._1(), t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 t3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), t3, tuple4._1(), tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 t3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), t3, tuple4._1(), tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 t3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), t3, tuple4._1(), tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 t3, Tuple2<? extends T5, ? extends T6> tuple4, T7 t5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), t3, tuple4._1(), tuple4._2(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 t3, Tuple2<? extends T5, ? extends T6> tuple4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), t3, tuple4._1(), tuple4._2(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 t3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), t3, tuple4._1(), tuple4._2(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 t3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), t3, tuple4._1(), tuple4._2(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 t4, T6 t5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple3._1(), t4, t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 t4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple3._1(), t4, tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 t4, Tuple2<? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple3._1(), t4, tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 t4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple3._1(), t4, tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 t5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple3._1(), tuple4._1(), t5, tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), tuple5._2(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), tuple5._2(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, T7 t5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple3._1(), tuple4._1(), tuple4._2(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple3._1(), tuple4._1(), tuple4._2(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple3._1(), tuple4._1(), tuple4._2(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple3._1(), tuple4._1(), tuple4._2(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, T6 t4, T7 t5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple3._1(), tuple3._2(), t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, T6 t4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple3._1(), tuple3._2(), t4, t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, T6 t4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple3._1(), tuple3._2(), t4, tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, T6 t4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple3._1(), tuple3._2(), t4, tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 t5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple3._1(), tuple3._2(), tuple4._1(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple3._1(), tuple3._2(), tuple4._1(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple3._1(), tuple3._2(), tuple4._1(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple3._1(), tuple3._2(), tuple4._1(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple2<? extends T3, ? extends T4> tuple2, T5 t3, T6 t4, T7 t5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple2._2(), t3, t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple2<? extends T3, ? extends T4> tuple2, T5 t3, T6 t4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple2._2(), t3, t4, t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple2<? extends T3, ? extends T4> tuple2, T5 t3, T6 t4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple2._2(), t3, t4, tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple2<? extends T3, ? extends T4> tuple2, T5 t3, T6 t4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple2._2(), t3, t4, tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple2<? extends T3, ? extends T4> tuple2, T5 t3, Tuple1<? extends T6> tuple4, T7 t5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple2._2(), t3, tuple4._1(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple2<? extends T3, ? extends T4> tuple2, T5 t3, Tuple1<? extends T6> tuple4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple2._2(), t3, tuple4._1(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple2<? extends T3, ? extends T4> tuple2, T5 t3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple2._2(), t3, tuple4._1(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple2<? extends T3, ? extends T4> tuple2, T5 t3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple2._2(), t3, tuple4._1(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple2<? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, T6 t4, T7 t5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple2._2(), tuple3._1(), t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple2<? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, T6 t4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple2._2(), tuple3._1(), t4, t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple2<? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, T6 t4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple2._2(), tuple3._1(), t4, tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple2<? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, T6 t4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple2._2(), tuple3._1(), t4, tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple2<? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 t5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple2._2(), tuple3._1(), tuple4._1(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple2<? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple2._2(), tuple3._1(), tuple4._1(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple2<? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple2._2(), tuple3._1(), tuple4._1(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple2<? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple2._1(), tuple2._2(), tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, T4 t2, T5 t3, T6 t4, T7 t5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), t2, t3, t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, T4 t2, T5 t3, T6 t4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), t2, t3, t4, t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, T4 t2, T5 t3, T6 t4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), t2, t3, t4, tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, T4 t2, T5 t3, T6 t4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), t2, t3, t4, tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, T4 t2, T5 t3, Tuple1<? extends T6> tuple4, T7 t5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), t2, t3, tuple4._1(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, T4 t2, T5 t3, Tuple1<? extends T6> tuple4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), t2, t3, tuple4._1(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, T4 t2, T5 t3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), t2, t3, tuple4._1(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, T4 t2, T5 t3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), t2, t3, tuple4._1(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, T4 t2, Tuple1<? extends T5> tuple3, T6 t4, T7 t5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), t2, tuple3._1(), t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, T4 t2, Tuple1<? extends T5> tuple3, T6 t4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), t2, tuple3._1(), t4, t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, T4 t2, Tuple1<? extends T5> tuple3, T6 t4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), t2, tuple3._1(), t4, tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, T4 t2, Tuple1<? extends T5> tuple3, T6 t4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), t2, tuple3._1(), t4, tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, T4 t2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 t5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), t2, tuple3._1(), tuple4._1(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, T4 t2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), t2, tuple3._1(), tuple4._1(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, T4 t2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), t2, tuple3._1(), tuple4._1(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, T4 t2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), t2, tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple1<? extends T4> tuple2, T5 t3, T6 t4, T7 t5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple2._1(), t3, t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple1<? extends T4> tuple2, T5 t3, T6 t4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple2._1(), t3, t4, t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple1<? extends T4> tuple2, T5 t3, T6 t4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple2._1(), t3, t4, tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple1<? extends T4> tuple2, T5 t3, T6 t4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple2._1(), t3, t4, tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple1<? extends T4> tuple2, T5 t3, Tuple1<? extends T6> tuple4, T7 t5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple2._1(), t3, tuple4._1(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple1<? extends T4> tuple2, T5 t3, Tuple1<? extends T6> tuple4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple2._1(), t3, tuple4._1(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple1<? extends T4> tuple2, T5 t3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple2._1(), t3, tuple4._1(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple1<? extends T4> tuple2, T5 t3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple2._1(), t3, tuple4._1(), tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple1<? extends T4> tuple2, Tuple1<? extends T5> tuple3, T6 t4, T7 t5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple2._1(), tuple3._1(), t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple1<? extends T4> tuple2, Tuple1<? extends T5> tuple3, T6 t4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple2._1(), tuple3._1(), t4, t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple1<? extends T4> tuple2, Tuple1<? extends T5> tuple3, T6 t4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple2._1(), tuple3._1(), t4, tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple1<? extends T4> tuple2, Tuple1<? extends T5> tuple3, T6 t4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple2._1(), tuple3._1(), t4, tuple5._1(), tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple1<? extends T4> tuple2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 t5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple2._1(), tuple3._1(), tuple4._1(), t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple1<? extends T4> tuple2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 t5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple2._1(), tuple3._1(), tuple4._1(), t5, tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple1<? extends T4> tuple2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 t6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple1<? extends T4> tuple2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1());
    }

}

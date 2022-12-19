package com.fiberg.iterative.core;

import io.vavr.Tuple;
import io.vavr.Tuple1;
import io.vavr.Tuple8;

public interface Flattener8 {

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Tuple.of(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, t2, t3, t4, t5, t6, t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(t1, t2, t3, t4, t5, t6, tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, t2, t3, t4, t5, t6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6, T7 t7, T8 t8) {
        return Tuple.of(t1, t2, t3, t4, t5, tuple6._1(), t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, t2, t3, t4, t5, tuple6._1(), t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(t1, t2, t3, t4, t5, tuple6._1(), tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, t2, t3, t4, t5, tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6, T7 t7, T8 t8) {
        return Tuple.of(t1, t2, t3, t4, tuple5._1(), t6, t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, t2, t3, t4, tuple5._1(), t6, t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(t1, t2, t3, t4, tuple5._1(), t6, tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, t2, t3, t4, tuple5._1(), t6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 t7, T8 t8) {
        return Tuple.of(t1, t2, t3, t4, tuple5._1(), tuple6._1(), t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, t2, t3, t4, tuple5._1(), tuple6._1(), t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(t1, t2, t3, t4, tuple5._1(), tuple6._1(), tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, t2, t3, t4, tuple5._1(), tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Tuple.of(t1, t2, t3, tuple4._1(), t5, t6, t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, t2, t3, tuple4._1(), t5, t6, t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(t1, t2, t3, tuple4._1(), t5, t6, tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, t2, t3, tuple4._1(), t5, t6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6, T7 t7, T8 t8) {
        return Tuple.of(t1, t2, t3, tuple4._1(), t5, tuple6._1(), t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, t2, t3, tuple4._1(), t5, tuple6._1(), t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(t1, t2, t3, tuple4._1(), t5, tuple6._1(), tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, t2, t3, tuple4._1(), t5, tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6, T7 t7, T8 t8) {
        return Tuple.of(t1, t2, t3, tuple4._1(), tuple5._1(), t6, t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, t2, t3, tuple4._1(), tuple5._1(), t6, t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(t1, t2, t3, tuple4._1(), tuple5._1(), t6, tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, t2, t3, tuple4._1(), tuple5._1(), t6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 t7, T8 t8) {
        return Tuple.of(t1, t2, t3, tuple4._1(), tuple5._1(), tuple6._1(), t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, t2, t3, tuple4._1(), tuple5._1(), tuple6._1(), t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(t1, t2, t3, tuple4._1(), tuple5._1(), tuple6._1(), tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, t2, t3, tuple4._1(), tuple5._1(), tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Tuple.of(t1, t2, tuple3._1(), t4, t5, t6, t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, T6 t6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, t2, tuple3._1(), t4, t5, t6, t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, T6 t6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(t1, t2, tuple3._1(), t4, t5, t6, tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, T6 t6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, t2, tuple3._1(), t4, t5, t6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6, T7 t7, T8 t8) {
        return Tuple.of(t1, t2, tuple3._1(), t4, t5, tuple6._1(), t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, t2, tuple3._1(), t4, t5, tuple6._1(), t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(t1, t2, tuple3._1(), t4, t5, tuple6._1(), tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, t2, tuple3._1(), t4, t5, tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6, T7 t7, T8 t8) {
        return Tuple.of(t1, t2, tuple3._1(), t4, tuple5._1(), t6, t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, t2, tuple3._1(), t4, tuple5._1(), t6, t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(t1, t2, tuple3._1(), t4, tuple5._1(), t6, tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, t2, tuple3._1(), t4, tuple5._1(), t6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 t7, T8 t8) {
        return Tuple.of(t1, t2, tuple3._1(), t4, tuple5._1(), tuple6._1(), t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, t2, tuple3._1(), t4, tuple5._1(), tuple6._1(), t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(t1, t2, tuple3._1(), t4, tuple5._1(), tuple6._1(), tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, t2, tuple3._1(), t4, tuple5._1(), tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), t5, t6, t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), t5, t6, t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), t5, t6, tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), t5, t6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6, T7 t7, T8 t8) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), t5, tuple6._1(), t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), t5, tuple6._1(), t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), t5, tuple6._1(), tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), t5, tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6, T7 t7, T8 t8) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), tuple5._1(), t6, t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), tuple5._1(), t6, t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), tuple5._1(), t6, tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), tuple5._1(), t6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 t7, T8 t8) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, t2, tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Tuple.of(t1, tuple2._1(), t3, t4, t5, t6, t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, tuple2._1(), t3, t4, t5, t6, t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, T5 t5, T6 t6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(t1, tuple2._1(), t3, t4, t5, t6, tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, T5 t5, T6 t6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, tuple2._1(), t3, t4, t5, t6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6, T7 t7, T8 t8) {
        return Tuple.of(t1, tuple2._1(), t3, t4, t5, tuple6._1(), t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, tuple2._1(), t3, t4, t5, tuple6._1(), t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(t1, tuple2._1(), t3, t4, t5, tuple6._1(), tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, tuple2._1(), t3, t4, t5, tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6, T7 t7, T8 t8) {
        return Tuple.of(t1, tuple2._1(), t3, t4, tuple5._1(), t6, t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, tuple2._1(), t3, t4, tuple5._1(), t6, t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(t1, tuple2._1(), t3, t4, tuple5._1(), t6, tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, tuple2._1(), t3, t4, tuple5._1(), t6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 t7, T8 t8) {
        return Tuple.of(t1, tuple2._1(), t3, t4, tuple5._1(), tuple6._1(), t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, tuple2._1(), t3, t4, tuple5._1(), tuple6._1(), t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(t1, tuple2._1(), t3, t4, tuple5._1(), tuple6._1(), tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, tuple2._1(), t3, t4, tuple5._1(), tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), t5, t6, t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), t5, t6, t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), t5, t6, tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), t5, t6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6, T7 t7, T8 t8) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), t5, tuple6._1(), t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), t5, tuple6._1(), t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), t5, tuple6._1(), tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), t5, tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6, T7 t7, T8 t8) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), tuple5._1(), t6, t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), tuple5._1(), t6, t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), tuple5._1(), t6, tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), tuple5._1(), t6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 t7, T8 t8) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), tuple5._1(), tuple6._1(), t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), tuple5._1(), tuple6._1(), t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), tuple5._1(), tuple6._1(), tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, tuple2._1(), t3, tuple4._1(), tuple5._1(), tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), t4, t5, t6, t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, T6 t6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), t4, t5, t6, t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, T6 t6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), t4, t5, t6, tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, T6 t6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), t4, t5, t6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6, T7 t7, T8 t8) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), t4, t5, tuple6._1(), t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), t4, t5, tuple6._1(), t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), t4, t5, tuple6._1(), tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), t4, t5, tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6, T7 t7, T8 t8) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), t4, tuple5._1(), t6, t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), t4, tuple5._1(), t6, t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), t4, tuple5._1(), t6, tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), t4, tuple5._1(), t6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 t7, T8 t8) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), t4, tuple5._1(), tuple6._1(), t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), t4, tuple5._1(), tuple6._1(), t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), t4, tuple5._1(), tuple6._1(), tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), t4, tuple5._1(), tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), t5, t6, t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), t5, t6, t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), t5, t6, tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), t5, t6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6, T7 t7, T8 t8) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), t5, tuple6._1(), t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), t5, tuple6._1(), t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), t5, tuple6._1(), tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), t5, tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6, T7 t7, T8 t8) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), t6, t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), t6, t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), t6, tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), t6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 t7, T8 t8) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 t1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(t1, tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Tuple.of(tuple1._1(), t2, t3, t4, t5, t6, t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), t2, t3, t4, t5, t6, t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(tuple1._1(), t2, t3, t4, t5, t6, tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), t2, t3, t4, t5, t6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6, T7 t7, T8 t8) {
        return Tuple.of(tuple1._1(), t2, t3, t4, t5, tuple6._1(), t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), t2, t3, t4, t5, tuple6._1(), t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(tuple1._1(), t2, t3, t4, t5, tuple6._1(), tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), t2, t3, t4, t5, tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6, T7 t7, T8 t8) {
        return Tuple.of(tuple1._1(), t2, t3, t4, tuple5._1(), t6, t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), t2, t3, t4, tuple5._1(), t6, t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(tuple1._1(), t2, t3, t4, tuple5._1(), t6, tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), t2, t3, t4, tuple5._1(), t6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 t7, T8 t8) {
        return Tuple.of(tuple1._1(), t2, t3, t4, tuple5._1(), tuple6._1(), t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), t2, t3, t4, tuple5._1(), tuple6._1(), t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(tuple1._1(), t2, t3, t4, tuple5._1(), tuple6._1(), tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), t2, t3, t4, tuple5._1(), tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), t5, t6, t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), t5, t6, t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), t5, t6, tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), t5, t6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6, T7 t7, T8 t8) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), t5, tuple6._1(), t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), t5, tuple6._1(), t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), t5, tuple6._1(), tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), t5, tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6, T7 t7, T8 t8) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), tuple5._1(), t6, t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), tuple5._1(), t6, t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), tuple5._1(), t6, tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), tuple5._1(), t6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 t7, T8 t8) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), tuple5._1(), tuple6._1(), t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), tuple5._1(), tuple6._1(), t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), tuple5._1(), tuple6._1(), tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), t2, t3, tuple4._1(), tuple5._1(), tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), t4, t5, t6, t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, T6 t6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), t4, t5, t6, t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, T6 t6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), t4, t5, t6, tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, T6 t6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), t4, t5, t6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6, T7 t7, T8 t8) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), t4, t5, tuple6._1(), t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), t4, t5, tuple6._1(), t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), t4, t5, tuple6._1(), tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), t4, t5, tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6, T7 t7, T8 t8) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), t4, tuple5._1(), t6, t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), t4, tuple5._1(), t6, t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), t4, tuple5._1(), t6, tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), t4, tuple5._1(), t6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 t7, T8 t8) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), t4, tuple5._1(), tuple6._1(), t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), t4, tuple5._1(), tuple6._1(), t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), t4, tuple5._1(), tuple6._1(), tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), t4, tuple5._1(), tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), t5, t6, t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), t5, t6, t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), t5, t6, tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), t5, t6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6, T7 t7, T8 t8) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), t5, tuple6._1(), t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), t5, tuple6._1(), t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), t5, tuple6._1(), tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), t5, tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6, T7 t7, T8 t8) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), tuple5._1(), t6, t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), tuple5._1(), t6, t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), tuple5._1(), t6, tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), tuple5._1(), t6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 t7, T8 t8) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 t2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), t2, tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, t4, t5, t6, t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, t4, t5, t6, t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, T5 t5, T6 t6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, t4, t5, t6, tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, T5 t5, T6 t6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, t4, t5, t6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6, T7 t7, T8 t8) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, t4, t5, tuple6._1(), t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, t4, t5, tuple6._1(), t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, t4, t5, tuple6._1(), tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, t4, t5, tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6, T7 t7, T8 t8) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, t4, tuple5._1(), t6, t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, t4, tuple5._1(), t6, t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, t4, tuple5._1(), t6, tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, t4, tuple5._1(), t6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 t7, T8 t8) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, t4, tuple5._1(), tuple6._1(), t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, t4, tuple5._1(), tuple6._1(), t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, t4, tuple5._1(), tuple6._1(), tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, t4, tuple5._1(), tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), t5, t6, t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), t5, t6, t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), t5, t6, tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), t5, t6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6, T7 t7, T8 t8) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), t5, tuple6._1(), t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), t5, tuple6._1(), t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), t5, tuple6._1(), tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), t5, tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6, T7 t7, T8 t8) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), tuple5._1(), t6, t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), tuple5._1(), t6, t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), tuple5._1(), t6, tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), tuple5._1(), t6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 t7, T8 t8) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), tuple5._1(), tuple6._1(), t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), tuple5._1(), tuple6._1(), t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), tuple5._1(), tuple6._1(), tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 t3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), t3, tuple4._1(), tuple5._1(), tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), t4, t5, t6, t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, T6 t6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), t4, t5, t6, t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, T6 t6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), t4, t5, t6, tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, T6 t6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), t4, t5, t6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6, T7 t7, T8 t8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), t4, t5, tuple6._1(), t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), t4, t5, tuple6._1(), t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), t4, t5, tuple6._1(), tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, T5 t5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), t4, t5, tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6, T7 t7, T8 t8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), t4, tuple5._1(), t6, t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), t4, tuple5._1(), t6, t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), t4, tuple5._1(), t6, tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, T6 t6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), t4, tuple5._1(), t6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 t7, T8 t8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), t4, tuple5._1(), tuple6._1(), t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), t4, tuple5._1(), tuple6._1(), t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), t4, tuple5._1(), tuple6._1(), tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 t4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), t4, tuple5._1(), tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), t5, t6, t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), t5, t6, t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), t5, t6, tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, T6 t6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), t5, t6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6, T7 t7, T8 t8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), t5, tuple6._1(), t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), t5, tuple6._1(), t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), t5, tuple6._1(), tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 t5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), t5, tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6, T7 t7, T8 t8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), t6, t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), t6, t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), t6, tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 t6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), t6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 t7, T8 t8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 t7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), t7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 t8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), tuple7._1(), t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), tuple7._1(), tuple8._1());
    }

}

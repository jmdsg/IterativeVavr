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

public interface Flattener1 {

    public static <T1> Tuple1<T1> flat1(T1 t1) {
        return Tuple.of(t1);
    }

    public static <T1> Tuple1<T1> flat1(Tuple1<? extends T1> tuple1) {
        return Tuple.of(tuple1._1());
    }

    public static <T1, T2> Tuple2<T1, T2> flat2(Tuple2<? extends T1, ? extends T2> tuple1) {
        return Tuple.of(tuple1._1(), tuple1._2());
    }

    public static <T1, T2, T3> Tuple3<T1, T2, T3> flat3(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3());
    }

    public static <T1, T2, T3, T4> Tuple4<T1, T2, T3, T4> flat4(Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4> tuple1) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple1._4());
    }

    public static <T1, T2, T3, T4, T5> Tuple5<T1, T2, T3, T4, T5> flat5(Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> tuple1) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple1._4(), tuple1._5());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> tuple1) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple1._4(), tuple1._5(), tuple1._6());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> tuple1) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple1._4(), tuple1._5(), tuple1._6(), tuple1._7());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8> tuple1) {
        return Tuple.of(tuple1._1(), tuple1._2(), tuple1._3(), tuple1._4(), tuple1._5(), tuple1._6(), tuple1._7(), tuple1._8());
    }

}

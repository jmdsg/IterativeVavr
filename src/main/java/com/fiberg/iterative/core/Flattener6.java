package com.fiberg.iterative.core;

import io.vavr.Tuple;
import io.vavr.Tuple1;
import io.vavr.Tuple2;
import io.vavr.Tuple3;
import io.vavr.Tuple6;
import io.vavr.Tuple7;
import io.vavr.Tuple8;

public interface Flattener6 {

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 arg1, T2 arg2, T3 arg3, T4 arg4, T5 arg5, T6 arg6) {
        return Tuple.of(arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 arg1, T2 arg2, T3 arg3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(arg1, arg2, arg3, arg4, arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 arg1, T2 arg2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6) {
        return Tuple.of(arg1, arg2, arg3, arg4, (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 arg1, T2 arg2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(arg1, arg2, arg3, arg4, (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 arg1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6) {
        return Tuple.of(arg1, arg2, arg3, (Object)tuple4._1(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 arg1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(arg1, arg2, arg3, (Object)tuple4._1(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 arg1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6) {
        return Tuple.of(arg1, arg2, arg3, (Object)tuple4._1(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 arg1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(arg1, arg2, arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, T6 arg6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), arg4, arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), arg4, arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), arg4, (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple4._1(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple4._1(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, T5 arg5, T6 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), arg3, arg4, arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), arg3, arg4, arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), arg3, arg4, (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), arg3, arg4, (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), arg3, (Object)tuple4._1(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), arg3, (Object)tuple4._1(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, T6 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), arg4, arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), arg4, arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, T4 arg4, T5 arg5, T6 arg6) {
        return Tuple.of((Object)tuple1._1(), arg2, arg3, arg4, arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, arg3, arg4, arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6) {
        return Tuple.of((Object)tuple1._1(), arg2, arg3, arg4, (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, arg3, arg4, (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6) {
        return Tuple.of((Object)tuple1._1(), arg2, arg3, (Object)tuple4._1(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, arg3, (Object)tuple4._1(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6) {
        return Tuple.of((Object)tuple1._1(), arg2, arg3, (Object)tuple4._1(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, T6 arg6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), arg4, arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), arg4, arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), arg4, (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, T5 arg5, T6 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), arg3, arg4, arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), arg3, arg4, arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), arg3, arg4, (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), arg3, arg4, (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, T6 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), arg4, arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), arg4, arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> flat6(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, T2 arg2, T3 arg3, T4 arg4, T5 arg5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(arg1, arg2, arg3, arg4, arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, T2 arg2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(arg1, arg2, arg3, arg4, (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, T2 arg2, T3 arg3, T4 arg4, Tuple2<? extends T5, ? extends T6> tuple5, T7 arg6) {
        return Tuple.of(arg1, arg2, arg3, arg4, (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, T2 arg2, T3 arg3, T4 arg4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(arg1, arg2, arg3, arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(arg1, arg2, arg3, (Object)tuple4._1(), arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(arg1, arg2, arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, T7 arg6) {
        return Tuple.of(arg1, arg2, arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(arg1, arg2, arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, T2 arg2, T3 arg3, Tuple2<? extends T4, ? extends T5> tuple4, T6 arg5, T7 arg6) {
        return Tuple.of(arg1, arg2, arg3, (Object)tuple4._1(), (Object)tuple4._2(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, T2 arg2, T3 arg3, Tuple2<? extends T4, ? extends T5> tuple4, T6 arg5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(arg1, arg2, arg3, (Object)tuple4._1(), (Object)tuple4._2(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, T2 arg2, T3 arg3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 arg6) {
        return Tuple.of(arg1, arg2, arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, T2 arg2, T3 arg3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(arg1, arg2, arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), arg4, arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple2<? extends T5, ? extends T6> tuple5, T7 arg6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple4._1(), arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, T7 arg6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, T6 arg5, T7 arg6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, T6 arg5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 arg6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, T5 arg4, T6 arg5, T7 arg6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple3._2(), arg4, arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, T5 arg4, T6 arg5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple3._2(), arg4, arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, T5 arg4, Tuple1<? extends T6> tuple5, T7 arg6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple3._2(), arg4, (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, T5 arg4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple3._2(), arg4, (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 arg5, T7 arg6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 arg5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 arg6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, T5 arg5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), arg3, arg4, arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), arg3, arg4, (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, Tuple2<? extends T5, ? extends T6> tuple5, T7 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), arg3, arg4, (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), arg3, arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), arg3, (Object)tuple4._1(), arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, T7 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple2<? extends T4, ? extends T5> tuple4, T6 arg5, T7 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple4._2(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple2<? extends T4, ? extends T5> tuple4, T6 arg5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple4._2(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), arg4, arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple2<? extends T5, ? extends T6> tuple5, T7 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, T7 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, T6 arg5, T7 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, T6 arg5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, T5 arg4, T6 arg5, T7 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), arg4, arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, T5 arg4, T6 arg5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), arg4, arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, T5 arg4, Tuple1<? extends T6> tuple5, T7 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), arg4, (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, T5 arg4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), arg4, (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 arg5, T7 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 arg5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, T5 arg4, T6 arg5, T7 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), arg3, arg4, arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, T5 arg4, T6 arg5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), arg3, arg4, arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, T5 arg4, Tuple1<? extends T6> tuple5, T7 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), arg3, arg4, (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, T5 arg4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), arg3, arg4, (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, Tuple1<? extends T5> tuple4, T6 arg5, T7 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), arg3, (Object)tuple4._1(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, Tuple1<? extends T5> tuple4, T6 arg5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), arg3, (Object)tuple4._1(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 arg4, T6 arg5, T7 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), arg4, arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 arg4, T6 arg5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), arg4, arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 arg4, Tuple1<? extends T6> tuple5, T7 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 arg4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 arg5, T7 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple4._1(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 arg5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple4._1(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, T4 arg4, T5 arg5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, arg3, arg4, arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, arg3, arg4, (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, T4 arg4, Tuple2<? extends T5, ? extends T6> tuple5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), arg2, arg3, arg4, (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, T4 arg4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, arg3, arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, arg3, (Object)tuple4._1(), arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), arg2, arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple2<? extends T4, ? extends T5> tuple4, T6 arg5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), arg2, arg3, (Object)tuple4._1(), (Object)tuple4._2(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple2<? extends T4, ? extends T5> tuple4, T6 arg5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, arg3, (Object)tuple4._1(), (Object)tuple4._2(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), arg2, arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), arg4, arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple2<? extends T5, ? extends T6> tuple5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, T6 arg5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, T6 arg5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, T5 arg4, T6 arg5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple3._2(), arg4, arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, T5 arg4, T6 arg5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple3._2(), arg4, arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, T5 arg4, Tuple1<? extends T6> tuple5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple3._2(), arg4, (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, T5 arg4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple3._2(), arg4, (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 arg5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 arg5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, T5 arg5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), arg3, arg4, arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), arg3, arg4, (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, Tuple2<? extends T5, ? extends T6> tuple5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), arg3, arg4, (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), arg3, arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple2<? extends T4, ? extends T5> tuple4, T6 arg5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple4._2(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple2<? extends T4, ? extends T5> tuple4, T6 arg5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple4._2(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), arg4, arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple2<? extends T5, ? extends T6> tuple5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple2<? extends T6, ? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, T6 arg5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, T6 arg5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, T5 arg4, T6 arg5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), arg4, arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, T5 arg4, T6 arg5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), arg4, arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, T5 arg4, Tuple1<? extends T6> tuple5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), arg4, (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, T5 arg4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), arg4, (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 arg5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 arg5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, T5 arg4, T6 arg5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), arg3, arg4, arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, T5 arg4, T6 arg5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), arg3, arg4, arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, T5 arg4, Tuple1<? extends T6> tuple5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), arg3, arg4, (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, T5 arg4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), arg3, arg4, (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, Tuple1<? extends T5> tuple4, T6 arg5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), arg3, (Object)tuple4._1(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, Tuple1<? extends T5> tuple4, T6 arg5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), arg3, (Object)tuple4._1(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 arg4, T6 arg5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), arg4, arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 arg4, T6 arg5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), arg4, arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 arg4, Tuple1<? extends T6> tuple5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 arg4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 arg5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple4._1(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 arg5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple4._1(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, T4 arg3, T5 arg4, T6 arg5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, arg3, arg4, arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, T4 arg3, T5 arg4, T6 arg5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, arg3, arg4, arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, T4 arg3, T5 arg4, Tuple1<? extends T6> tuple5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, arg3, arg4, (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, T4 arg3, T5 arg4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, arg3, arg4, (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, T4 arg3, Tuple1<? extends T5> tuple4, T6 arg5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, arg3, (Object)tuple4._1(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, T4 arg3, Tuple1<? extends T5> tuple4, T6 arg5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, arg3, (Object)tuple4._1(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, T4 arg3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, arg3, (Object)tuple4._1(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, T4 arg3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, Tuple1<? extends T4> tuple3, T5 arg4, T6 arg5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, (Object)tuple3._1(), arg4, arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, Tuple1<? extends T4> tuple3, T5 arg4, T6 arg5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, (Object)tuple3._1(), arg4, arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, Tuple1<? extends T4> tuple3, T5 arg4, Tuple1<? extends T6> tuple5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, (Object)tuple3._1(), arg4, (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, Tuple1<? extends T4> tuple3, T5 arg4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 arg5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 arg5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 arg3, T5 arg4, T6 arg5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), arg3, arg4, arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 arg3, T5 arg4, T6 arg5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), arg3, arg4, arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 arg3, T5 arg4, Tuple1<? extends T6> tuple5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), arg3, arg4, (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 arg3, T5 arg4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), arg3, arg4, (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 arg3, Tuple1<? extends T5> tuple4, T6 arg5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 arg3, Tuple1<? extends T5> tuple4, T6 arg5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 arg3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 arg3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 arg4, T6 arg5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple3._1(), arg4, arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 arg4, T6 arg5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple3._1(), arg4, arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 arg4, Tuple1<? extends T6> tuple5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 arg4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 arg5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 arg5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, T7 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> flat7(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple1<? extends T7> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, T4 arg4, T5 arg5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, arg2, arg3, arg4, arg5, (Object)tuple6._1(), (Object)tuple6._2(), (Object)tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, arg2, arg3, arg4, (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2(), (Object)tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, T4 arg4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, arg2, arg3, arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, T4 arg4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of(arg1, arg2, arg3, arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple5._3(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, T4 arg4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, arg2, arg3, arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple5._3(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, arg2, arg3, (Object)tuple4._1(), arg5, (Object)tuple6._1(), (Object)tuple6._2(), (Object)tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, arg2, arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2(), (Object)tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, arg2, arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of(arg1, arg2, arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple5._3(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, arg2, arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple5._3(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, Tuple2<? extends T4, ? extends T5> tuple4, T6 arg5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, arg2, arg3, (Object)tuple4._1(), (Object)tuple4._2(), arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, arg2, arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of(arg1, arg2, arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, arg2, arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, T7 arg5, T8 arg6) {
        return Tuple.of(arg1, arg2, arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple4._3(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, arg2, arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple4._3(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of(arg1, arg2, arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple4._3(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, arg2, arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple4._3(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), arg4, arg5, (Object)tuple6._1(), (Object)tuple6._2(), (Object)tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2(), (Object)tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple5._3(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple5._3(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple4._1(), arg5, (Object)tuple6._1(), (Object)tuple6._2(), (Object)tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2(), (Object)tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple5._3(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple5._3(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, T6 arg5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, T7 arg5, T8 arg6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple4._3(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple4._3(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple4._3(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple4._3(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, T5 arg4, T6 arg5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple3._2(), arg4, arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, T5 arg4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple3._2(), arg4, (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, T5 arg4, Tuple2<? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple3._2(), arg4, (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, T5 arg4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple3._2(), arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 arg5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, T7 arg5, T8 arg6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple4._2(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple4._2(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, T6 arg4, T7 arg5, T8 arg6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple3._3(), arg4, arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, T6 arg4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple3._3(), arg4, arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, T6 arg4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple3._3(), arg4, (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, T6 arg4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple3._3(), arg4, (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 arg5, T8 arg6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple3._3(), (Object)tuple4._1(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple3._3(), (Object)tuple4._1(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple3._3(), (Object)tuple4._1(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple3._3(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, T5 arg5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), arg3, arg4, arg5, (Object)tuple6._1(), (Object)tuple6._2(), (Object)tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), arg3, arg4, (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2(), (Object)tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), arg3, arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), arg3, arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple5._3(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), arg3, arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple5._3(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), arg3, (Object)tuple4._1(), arg5, (Object)tuple6._1(), (Object)tuple6._2(), (Object)tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2(), (Object)tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple5._3(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple5._3(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple2<? extends T4, ? extends T5> tuple4, T6 arg5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple4._2(), arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, T7 arg5, T8 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple4._3(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple4._3(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple4._3(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple4._3(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), arg4, arg5, (Object)tuple6._1(), (Object)tuple6._2(), (Object)tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2(), (Object)tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple5._3(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple5._3(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), arg5, (Object)tuple6._1(), (Object)tuple6._2(), (Object)tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2(), (Object)tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple5._3(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple5._3(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, T6 arg5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, T7 arg5, T8 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple4._3(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple4._3(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple4._3(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple4._3(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, T5 arg4, T6 arg5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), arg4, arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, T5 arg4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), arg4, (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, T5 arg4, Tuple2<? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), arg4, (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, T5 arg4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 arg5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, T7 arg5, T8 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple4._2(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple4._2(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, T6 arg4, T7 arg5, T8 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple3._3(), arg4, arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, T6 arg4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple3._3(), arg4, arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, T6 arg4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple3._3(), arg4, (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, T6 arg4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple3._3(), arg4, (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 arg5, T8 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple3._3(), (Object)tuple4._1(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple3._3(), (Object)tuple4._1(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple3._3(), (Object)tuple4._1(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple3._3(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, T5 arg4, T6 arg5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), arg3, arg4, arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, T5 arg4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), arg3, arg4, (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, T5 arg4, Tuple2<? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), arg3, arg4, (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, T5 arg4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), arg3, arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, Tuple1<? extends T5> tuple4, T6 arg5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), arg3, (Object)tuple4._1(), arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, Tuple2<? extends T5, ? extends T6> tuple4, T7 arg5, T8 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), arg3, (Object)tuple4._1(), (Object)tuple4._2(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, Tuple2<? extends T5, ? extends T6> tuple4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), arg3, (Object)tuple4._1(), (Object)tuple4._2(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 arg4, T6 arg5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), arg4, arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 arg4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 arg4, Tuple2<? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 arg4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 arg5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple4._1(), arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, T7 arg5, T8 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, T6 arg4, T7 arg5, T8 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple3._2(), arg4, arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, T6 arg4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple3._2(), arg4, arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, T6 arg4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple3._2(), arg4, (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, T6 arg4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple3._2(), arg4, (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 arg5, T8 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, T5 arg3, T6 arg4, T7 arg5, T8 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple2._3(), arg3, arg4, arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, T5 arg3, T6 arg4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple2._3(), arg3, arg4, arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, T5 arg3, T6 arg4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple2._3(), arg3, arg4, (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, T5 arg3, T6 arg4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple2._3(), arg3, arg4, (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, T5 arg3, Tuple1<? extends T6> tuple4, T7 arg5, T8 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple2._3(), arg3, (Object)tuple4._1(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, T5 arg3, Tuple1<? extends T6> tuple4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple2._3(), arg3, (Object)tuple4._1(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, T5 arg3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple2._3(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, T5 arg3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple2._3(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, T6 arg4, T7 arg5, T8 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple2._3(), (Object)tuple3._1(), arg4, arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, T6 arg4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple2._3(), (Object)tuple3._1(), arg4, arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, T6 arg4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple2._3(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, T6 arg4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple2._3(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 arg5, T8 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple2._3(), (Object)tuple3._1(), (Object)tuple4._1(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple2._3(), (Object)tuple3._1(), (Object)tuple4._1(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple2._3(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of(arg1, (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple2._3(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, T4 arg4, T5 arg5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, arg3, arg4, arg5, (Object)tuple6._1(), (Object)tuple6._2(), (Object)tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, arg3, arg4, (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2(), (Object)tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, T4 arg4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, arg3, arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, T4 arg4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), arg2, arg3, arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple5._3(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, T4 arg4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, arg3, arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple5._3(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, arg3, (Object)tuple4._1(), arg5, (Object)tuple6._1(), (Object)tuple6._2(), (Object)tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2(), (Object)tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), arg2, arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple5._3(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple5._3(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple2<? extends T4, ? extends T5> tuple4, T6 arg5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, arg3, (Object)tuple4._1(), (Object)tuple4._2(), arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), arg2, arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, T7 arg5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), arg2, arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple4._3(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple4._3(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), arg2, arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple4._3(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple4._3(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), arg4, arg5, (Object)tuple6._1(), (Object)tuple6._2(), (Object)tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2(), (Object)tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple5._3(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple5._3(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), arg5, (Object)tuple6._1(), (Object)tuple6._2(), (Object)tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2(), (Object)tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple5._3(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple5._3(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, T6 arg5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, T7 arg5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple4._3(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple4._3(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple4._3(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple4._3(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, T5 arg4, T6 arg5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple3._2(), arg4, arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, T5 arg4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple3._2(), arg4, (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, T5 arg4, Tuple2<? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple3._2(), arg4, (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, T5 arg4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple3._2(), arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 arg5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, T7 arg5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple4._2(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple4._2(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, T6 arg4, T7 arg5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple3._3(), arg4, arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, T6 arg4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple3._3(), arg4, arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, T6 arg4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple3._3(), arg4, (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, T6 arg4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple3._3(), arg4, (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 arg5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple3._3(), (Object)tuple4._1(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple3._3(), (Object)tuple4._1(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple3._3(), (Object)tuple4._1(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple3._3(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, T5 arg5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), arg3, arg4, arg5, (Object)tuple6._1(), (Object)tuple6._2(), (Object)tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), arg3, arg4, (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2(), (Object)tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), arg3, arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), arg3, arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple5._3(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), arg3, arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple5._3(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), arg5, (Object)tuple6._1(), (Object)tuple6._2(), (Object)tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2(), (Object)tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple5._3(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple5._3(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple2<? extends T4, ? extends T5> tuple4, T6 arg5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple4._2(), arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, T7 arg5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple4._3(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple4._3(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple4._3(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple4._3(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), arg4, arg5, (Object)tuple6._1(), (Object)tuple6._2(), (Object)tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2(), (Object)tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple5._3(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple5._3(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), arg5, (Object)tuple6._1(), (Object)tuple6._2(), (Object)tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple3<? extends T6, ? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2(), (Object)tuple6._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple2<? extends T5, ? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple5._3(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple3<? extends T5, ? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple5._3(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, T6 arg5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple2<? extends T4, ? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, T7 arg5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple4._3(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple4._3(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple4._3(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple3<? extends T4, ? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple4._3(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, T5 arg4, T6 arg5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), arg4, arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, T5 arg4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), arg4, (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, T5 arg4, Tuple2<? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), arg4, (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, T5 arg4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 arg5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, T7 arg5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple4._2(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple4._2(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple2<? extends T3, ? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, T6 arg4, T7 arg5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple3._3(), arg4, arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, T6 arg4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple3._3(), arg4, arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, T6 arg4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple3._3(), arg4, (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, T6 arg4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple3._3(), arg4, (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 arg5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple3._3(), (Object)tuple4._1(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple3._3(), (Object)tuple4._1(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple3._3(), (Object)tuple4._1(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple3<? extends T3, ? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple3._3(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, T5 arg4, T6 arg5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), arg3, arg4, arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, T5 arg4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), arg3, arg4, (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, T5 arg4, Tuple2<? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), arg3, arg4, (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, T5 arg4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), arg3, arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, Tuple1<? extends T5> tuple4, T6 arg5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), arg3, (Object)tuple4._1(), arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, Tuple2<? extends T5, ? extends T6> tuple4, T7 arg5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), arg3, (Object)tuple4._1(), (Object)tuple4._2(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, Tuple2<? extends T5, ? extends T6> tuple4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), arg3, (Object)tuple4._1(), (Object)tuple4._2(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, T4 arg3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 arg4, T6 arg5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), arg4, arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 arg4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 arg4, Tuple2<? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 arg4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 arg5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple4._1(), arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, T7 arg5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, T6 arg4, T7 arg5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple3._2(), arg4, arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, T6 arg4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple3._2(), arg4, arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, T6 arg4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple3._2(), arg4, (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, T6 arg4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple3._2(), arg4, (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 arg5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple2<? extends T2, ? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, T5 arg3, T6 arg4, T7 arg5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple2._3(), arg3, arg4, arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, T5 arg3, T6 arg4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple2._3(), arg3, arg4, arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, T5 arg3, T6 arg4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple2._3(), arg3, arg4, (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, T5 arg3, T6 arg4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple2._3(), arg3, arg4, (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, T5 arg3, Tuple1<? extends T6> tuple4, T7 arg5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple2._3(), arg3, (Object)tuple4._1(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, T5 arg3, Tuple1<? extends T6> tuple4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple2._3(), arg3, (Object)tuple4._1(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, T5 arg3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple2._3(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, T5 arg3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple2._3(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, T6 arg4, T7 arg5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple2._3(), (Object)tuple3._1(), arg4, arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, T6 arg4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple2._3(), (Object)tuple3._1(), arg4, arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, T6 arg4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple2._3(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, T6 arg4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple2._3(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 arg5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple2._3(), (Object)tuple3._1(), (Object)tuple4._1(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple2._3(), (Object)tuple3._1(), (Object)tuple4._1(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple2._3(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple3<? extends T2, ? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple2._3(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, T4 arg3, T5 arg4, T6 arg5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, arg3, arg4, arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, T4 arg3, T5 arg4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, arg3, arg4, (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, T4 arg3, T5 arg4, Tuple2<? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, arg3, arg4, (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, T4 arg3, T5 arg4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, arg3, arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, T4 arg3, Tuple1<? extends T5> tuple4, T6 arg5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, arg3, (Object)tuple4._1(), arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, T4 arg3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, T4 arg3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, T4 arg3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, T4 arg3, Tuple2<? extends T5, ? extends T6> tuple4, T7 arg5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, arg3, (Object)tuple4._1(), (Object)tuple4._2(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, T4 arg3, Tuple2<? extends T5, ? extends T6> tuple4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, arg3, (Object)tuple4._1(), (Object)tuple4._2(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, T4 arg3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, T4 arg3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, Tuple1<? extends T4> tuple3, T5 arg4, T6 arg5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, (Object)tuple3._1(), arg4, arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, Tuple1<? extends T4> tuple3, T5 arg4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, Tuple1<? extends T4> tuple3, T5 arg4, Tuple2<? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, Tuple1<? extends T4> tuple3, T5 arg4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 arg5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, Tuple1<? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, T7 arg5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, Tuple1<? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, Tuple1<? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, Tuple1<? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, Tuple2<? extends T4, ? extends T5> tuple3, T6 arg4, T7 arg5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, (Object)tuple3._1(), (Object)tuple3._2(), arg4, arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, Tuple2<? extends T4, ? extends T5> tuple3, T6 arg4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, (Object)tuple3._1(), (Object)tuple3._2(), arg4, arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, Tuple2<? extends T4, ? extends T5> tuple3, T6 arg4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, (Object)tuple3._1(), (Object)tuple3._2(), arg4, (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, Tuple2<? extends T4, ? extends T5> tuple3, T6 arg4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, (Object)tuple3._1(), (Object)tuple3._2(), arg4, (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, Tuple2<? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 arg5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, Tuple2<? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, Tuple2<? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, T3 arg2, Tuple2<? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), arg2, (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 arg3, T5 arg4, T6 arg5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), arg3, arg4, arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 arg3, T5 arg4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), arg3, arg4, (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 arg3, T5 arg4, Tuple2<? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), arg3, arg4, (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 arg3, T5 arg4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), arg3, arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 arg3, Tuple1<? extends T5> tuple4, T6 arg5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 arg3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 arg3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 arg3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 arg3, Tuple2<? extends T5, ? extends T6> tuple4, T7 arg5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple4._2(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 arg3, Tuple2<? extends T5, ? extends T6> tuple4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple4._2(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 arg3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, T4 arg3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 arg4, T6 arg5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple3._1(), arg4, arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 arg4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 arg4, Tuple2<? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, T5 arg4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, T6 arg5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), arg5, (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple1<? extends T6> tuple5, Tuple2<? extends T7, ? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1(), (Object)tuple6._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple1<? extends T5> tuple4, Tuple2<? extends T6, ? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple5._2(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, T7 arg5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple1<? extends T4> tuple3, Tuple2<? extends T5, ? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple4._2(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, T6 arg4, T7 arg5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), arg4, arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, T6 arg4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), arg4, arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, T6 arg4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), arg4, (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, T6 arg4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), arg4, (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 arg5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple1<? extends T3> tuple2, Tuple2<? extends T4, ? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple3._2(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple2<? extends T3, ? extends T4> tuple2, T5 arg3, T6 arg4, T7 arg5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple2._2(), arg3, arg4, arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple2<? extends T3, ? extends T4> tuple2, T5 arg3, T6 arg4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple2._2(), arg3, arg4, arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple2<? extends T3, ? extends T4> tuple2, T5 arg3, T6 arg4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple2._2(), arg3, arg4, (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple2<? extends T3, ? extends T4> tuple2, T5 arg3, T6 arg4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple2._2(), arg3, arg4, (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple2<? extends T3, ? extends T4> tuple2, T5 arg3, Tuple1<? extends T6> tuple4, T7 arg5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple2._2(), arg3, (Object)tuple4._1(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple2<? extends T3, ? extends T4> tuple2, T5 arg3, Tuple1<? extends T6> tuple4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple2._2(), arg3, (Object)tuple4._1(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple2<? extends T3, ? extends T4> tuple2, T5 arg3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple2._2(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple2<? extends T3, ? extends T4> tuple2, T5 arg3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple2._2(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple2<? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, T6 arg4, T7 arg5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), arg4, arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple2<? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, T6 arg4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), arg4, arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple2<? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, T6 arg4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple2<? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, T6 arg4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple2<? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 arg5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple4._1(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple2<? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple4._1(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple2<? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple2<? extends T1, ? extends T2> tuple1, Tuple2<? extends T3, ? extends T4> tuple2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple2._1(), (Object)tuple2._2(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, T4 arg2, T5 arg3, T6 arg4, T7 arg5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple1._3(), arg2, arg3, arg4, arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, T4 arg2, T5 arg3, T6 arg4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple1._3(), arg2, arg3, arg4, arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, T4 arg2, T5 arg3, T6 arg4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple1._3(), arg2, arg3, arg4, (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, T4 arg2, T5 arg3, T6 arg4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple1._3(), arg2, arg3, arg4, (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, T4 arg2, T5 arg3, Tuple1<? extends T6> tuple4, T7 arg5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple1._3(), arg2, arg3, (Object)tuple4._1(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, T4 arg2, T5 arg3, Tuple1<? extends T6> tuple4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple1._3(), arg2, arg3, (Object)tuple4._1(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, T4 arg2, T5 arg3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple1._3(), arg2, arg3, (Object)tuple4._1(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, T4 arg2, T5 arg3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple1._3(), arg2, arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, T4 arg2, Tuple1<? extends T5> tuple3, T6 arg4, T7 arg5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple1._3(), arg2, (Object)tuple3._1(), arg4, arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, T4 arg2, Tuple1<? extends T5> tuple3, T6 arg4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple1._3(), arg2, (Object)tuple3._1(), arg4, arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, T4 arg2, Tuple1<? extends T5> tuple3, T6 arg4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple1._3(), arg2, (Object)tuple3._1(), arg4, (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, T4 arg2, Tuple1<? extends T5> tuple3, T6 arg4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple1._3(), arg2, (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, T4 arg2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 arg5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple1._3(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, T4 arg2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple1._3(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, T4 arg2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple1._3(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, T4 arg2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple1._3(), arg2, (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple1<? extends T4> tuple2, T5 arg3, T6 arg4, T7 arg5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple1._3(), (Object)tuple2._1(), arg3, arg4, arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple1<? extends T4> tuple2, T5 arg3, T6 arg4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple1._3(), (Object)tuple2._1(), arg3, arg4, arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple1<? extends T4> tuple2, T5 arg3, T6 arg4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple1._3(), (Object)tuple2._1(), arg3, arg4, (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple1<? extends T4> tuple2, T5 arg3, T6 arg4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple1._3(), (Object)tuple2._1(), arg3, arg4, (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple1<? extends T4> tuple2, T5 arg3, Tuple1<? extends T6> tuple4, T7 arg5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple1._3(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple1<? extends T4> tuple2, T5 arg3, Tuple1<? extends T6> tuple4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple1._3(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple1<? extends T4> tuple2, T5 arg3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple1._3(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple1<? extends T4> tuple2, T5 arg3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple1._3(), (Object)tuple2._1(), arg3, (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple1<? extends T4> tuple2, Tuple1<? extends T5> tuple3, T6 arg4, T7 arg5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple1._3(), (Object)tuple2._1(), (Object)tuple3._1(), arg4, arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple1<? extends T4> tuple2, Tuple1<? extends T5> tuple3, T6 arg4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple1._3(), (Object)tuple2._1(), (Object)tuple3._1(), arg4, arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple1<? extends T4> tuple2, Tuple1<? extends T5> tuple3, T6 arg4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple1._3(), (Object)tuple2._1(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple1<? extends T4> tuple2, Tuple1<? extends T5> tuple3, T6 arg4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple1._3(), (Object)tuple2._1(), (Object)tuple3._1(), arg4, (Object)tuple5._1(), (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple1<? extends T4> tuple2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 arg5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple1._3(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), arg5, arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple1<? extends T4> tuple2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, T7 arg5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple1._3(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), arg5, (Object)tuple6._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple1<? extends T4> tuple2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, T8 arg6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple1._3(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), arg6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple1, Tuple1<? extends T4> tuple2, Tuple1<? extends T5> tuple3, Tuple1<? extends T6> tuple4, Tuple1<? extends T7> tuple5, Tuple1<? extends T8> tuple6) {
        return Tuple.of((Object)tuple1._1(), (Object)tuple1._2(), (Object)tuple1._3(), (Object)tuple2._1(), (Object)tuple3._1(), (Object)tuple4._1(), (Object)tuple5._1(), (Object)tuple6._1());
    }

}

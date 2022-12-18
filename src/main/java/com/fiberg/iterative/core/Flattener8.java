package com.fiberg.iterative.core;

import io.vavr.Tuple;
import io.vavr.Tuple1;
import io.vavr.Tuple8;

public interface Flattener8 {

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, T4 arg4, T5 arg5, T6 arg6, T7 arg7, T8 arg8) {
        return Tuple.of(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, T4 arg4, T5 arg5, T6 arg6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, arg2, arg3, arg4, arg5, arg6, arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, T4 arg4, T5 arg5, T6 arg6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(arg1, arg2, arg3, arg4, arg5, arg6, tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, T4 arg4, T5 arg5, T6 arg6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, arg2, arg3, arg4, arg5, arg6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6, T7 arg7, T8 arg8) {
        return Tuple.of(arg1, arg2, arg3, arg4, arg5, tuple6._1(), arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, arg2, arg3, arg4, arg5, tuple6._1(), arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(arg1, arg2, arg3, arg4, arg5, tuple6._1(), tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, arg2, arg3, arg4, arg5, tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6, T7 arg7, T8 arg8) {
        return Tuple.of(arg1, arg2, arg3, arg4, tuple5._1(), arg6, arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, arg2, arg3, arg4, tuple5._1(), arg6, arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(arg1, arg2, arg3, arg4, tuple5._1(), arg6, tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, arg2, arg3, arg4, tuple5._1(), arg6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 arg7, T8 arg8) {
        return Tuple.of(arg1, arg2, arg3, arg4, tuple5._1(), tuple6._1(), arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, arg2, arg3, arg4, tuple5._1(), tuple6._1(), arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(arg1, arg2, arg3, arg4, tuple5._1(), tuple6._1(), tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, arg2, arg3, arg4, tuple5._1(), tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6, T7 arg7, T8 arg8) {
        return Tuple.of(arg1, arg2, arg3, tuple4._1(), arg5, arg6, arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, arg2, arg3, tuple4._1(), arg5, arg6, arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(arg1, arg2, arg3, tuple4._1(), arg5, arg6, tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, arg2, arg3, tuple4._1(), arg5, arg6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6, T7 arg7, T8 arg8) {
        return Tuple.of(arg1, arg2, arg3, tuple4._1(), arg5, tuple6._1(), arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, arg2, arg3, tuple4._1(), arg5, tuple6._1(), arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(arg1, arg2, arg3, tuple4._1(), arg5, tuple6._1(), tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, arg2, arg3, tuple4._1(), arg5, tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6, T7 arg7, T8 arg8) {
        return Tuple.of(arg1, arg2, arg3, tuple4._1(), tuple5._1(), arg6, arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, arg2, arg3, tuple4._1(), tuple5._1(), arg6, arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(arg1, arg2, arg3, tuple4._1(), tuple5._1(), arg6, tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, arg2, arg3, tuple4._1(), tuple5._1(), arg6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 arg7, T8 arg8) {
        return Tuple.of(arg1, arg2, arg3, tuple4._1(), tuple5._1(), tuple6._1(), arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, arg2, arg3, tuple4._1(), tuple5._1(), tuple6._1(), arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(arg1, arg2, arg3, tuple4._1(), tuple5._1(), tuple6._1(), tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, arg2, arg3, tuple4._1(), tuple5._1(), tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, T6 arg6, T7 arg7, T8 arg8) {
        return Tuple.of(arg1, arg2, tuple3._1(), arg4, arg5, arg6, arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, T6 arg6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, arg2, tuple3._1(), arg4, arg5, arg6, arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, T6 arg6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(arg1, arg2, tuple3._1(), arg4, arg5, arg6, tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, T6 arg6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, arg2, tuple3._1(), arg4, arg5, arg6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6, T7 arg7, T8 arg8) {
        return Tuple.of(arg1, arg2, tuple3._1(), arg4, arg5, tuple6._1(), arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, arg2, tuple3._1(), arg4, arg5, tuple6._1(), arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(arg1, arg2, tuple3._1(), arg4, arg5, tuple6._1(), tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, arg2, tuple3._1(), arg4, arg5, tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6, T7 arg7, T8 arg8) {
        return Tuple.of(arg1, arg2, tuple3._1(), arg4, tuple5._1(), arg6, arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, arg2, tuple3._1(), arg4, tuple5._1(), arg6, arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(arg1, arg2, tuple3._1(), arg4, tuple5._1(), arg6, tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, arg2, tuple3._1(), arg4, tuple5._1(), arg6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 arg7, T8 arg8) {
        return Tuple.of(arg1, arg2, tuple3._1(), arg4, tuple5._1(), tuple6._1(), arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, arg2, tuple3._1(), arg4, tuple5._1(), tuple6._1(), arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(arg1, arg2, tuple3._1(), arg4, tuple5._1(), tuple6._1(), tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, arg2, tuple3._1(), arg4, tuple5._1(), tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6, T7 arg7, T8 arg8) {
        return Tuple.of(arg1, arg2, tuple3._1(), tuple4._1(), arg5, arg6, arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, arg2, tuple3._1(), tuple4._1(), arg5, arg6, arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(arg1, arg2, tuple3._1(), tuple4._1(), arg5, arg6, tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, arg2, tuple3._1(), tuple4._1(), arg5, arg6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6, T7 arg7, T8 arg8) {
        return Tuple.of(arg1, arg2, tuple3._1(), tuple4._1(), arg5, tuple6._1(), arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, arg2, tuple3._1(), tuple4._1(), arg5, tuple6._1(), arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(arg1, arg2, tuple3._1(), tuple4._1(), arg5, tuple6._1(), tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, arg2, tuple3._1(), tuple4._1(), arg5, tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6, T7 arg7, T8 arg8) {
        return Tuple.of(arg1, arg2, tuple3._1(), tuple4._1(), tuple5._1(), arg6, arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, arg2, tuple3._1(), tuple4._1(), tuple5._1(), arg6, arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(arg1, arg2, tuple3._1(), tuple4._1(), tuple5._1(), arg6, tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, arg2, tuple3._1(), tuple4._1(), tuple5._1(), arg6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 arg7, T8 arg8) {
        return Tuple.of(arg1, arg2, tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, arg2, tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(arg1, arg2, tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, arg2, tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, T5 arg5, T6 arg6, T7 arg7, T8 arg8) {
        return Tuple.of(arg1, tuple2._1(), arg3, arg4, arg5, arg6, arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, T5 arg5, T6 arg6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, tuple2._1(), arg3, arg4, arg5, arg6, arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, T5 arg5, T6 arg6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(arg1, tuple2._1(), arg3, arg4, arg5, arg6, tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, T5 arg5, T6 arg6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, tuple2._1(), arg3, arg4, arg5, arg6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6, T7 arg7, T8 arg8) {
        return Tuple.of(arg1, tuple2._1(), arg3, arg4, arg5, tuple6._1(), arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, tuple2._1(), arg3, arg4, arg5, tuple6._1(), arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(arg1, tuple2._1(), arg3, arg4, arg5, tuple6._1(), tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, tuple2._1(), arg3, arg4, arg5, tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6, T7 arg7, T8 arg8) {
        return Tuple.of(arg1, tuple2._1(), arg3, arg4, tuple5._1(), arg6, arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, tuple2._1(), arg3, arg4, tuple5._1(), arg6, arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(arg1, tuple2._1(), arg3, arg4, tuple5._1(), arg6, tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, tuple2._1(), arg3, arg4, tuple5._1(), arg6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 arg7, T8 arg8) {
        return Tuple.of(arg1, tuple2._1(), arg3, arg4, tuple5._1(), tuple6._1(), arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, tuple2._1(), arg3, arg4, tuple5._1(), tuple6._1(), arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(arg1, tuple2._1(), arg3, arg4, tuple5._1(), tuple6._1(), tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, tuple2._1(), arg3, arg4, tuple5._1(), tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6, T7 arg7, T8 arg8) {
        return Tuple.of(arg1, tuple2._1(), arg3, tuple4._1(), arg5, arg6, arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, tuple2._1(), arg3, tuple4._1(), arg5, arg6, arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(arg1, tuple2._1(), arg3, tuple4._1(), arg5, arg6, tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, tuple2._1(), arg3, tuple4._1(), arg5, arg6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6, T7 arg7, T8 arg8) {
        return Tuple.of(arg1, tuple2._1(), arg3, tuple4._1(), arg5, tuple6._1(), arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, tuple2._1(), arg3, tuple4._1(), arg5, tuple6._1(), arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(arg1, tuple2._1(), arg3, tuple4._1(), arg5, tuple6._1(), tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, tuple2._1(), arg3, tuple4._1(), arg5, tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6, T7 arg7, T8 arg8) {
        return Tuple.of(arg1, tuple2._1(), arg3, tuple4._1(), tuple5._1(), arg6, arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, tuple2._1(), arg3, tuple4._1(), tuple5._1(), arg6, arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(arg1, tuple2._1(), arg3, tuple4._1(), tuple5._1(), arg6, tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, tuple2._1(), arg3, tuple4._1(), tuple5._1(), arg6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 arg7, T8 arg8) {
        return Tuple.of(arg1, tuple2._1(), arg3, tuple4._1(), tuple5._1(), tuple6._1(), arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, tuple2._1(), arg3, tuple4._1(), tuple5._1(), tuple6._1(), arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(arg1, tuple2._1(), arg3, tuple4._1(), tuple5._1(), tuple6._1(), tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, tuple2._1(), arg3, tuple4._1(), tuple5._1(), tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, T6 arg6, T7 arg7, T8 arg8) {
        return Tuple.of(arg1, tuple2._1(), tuple3._1(), arg4, arg5, arg6, arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, T6 arg6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, tuple2._1(), tuple3._1(), arg4, arg5, arg6, arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, T6 arg6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(arg1, tuple2._1(), tuple3._1(), arg4, arg5, arg6, tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, T6 arg6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, tuple2._1(), tuple3._1(), arg4, arg5, arg6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6, T7 arg7, T8 arg8) {
        return Tuple.of(arg1, tuple2._1(), tuple3._1(), arg4, arg5, tuple6._1(), arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, tuple2._1(), tuple3._1(), arg4, arg5, tuple6._1(), arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(arg1, tuple2._1(), tuple3._1(), arg4, arg5, tuple6._1(), tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, tuple2._1(), tuple3._1(), arg4, arg5, tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6, T7 arg7, T8 arg8) {
        return Tuple.of(arg1, tuple2._1(), tuple3._1(), arg4, tuple5._1(), arg6, arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, tuple2._1(), tuple3._1(), arg4, tuple5._1(), arg6, arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(arg1, tuple2._1(), tuple3._1(), arg4, tuple5._1(), arg6, tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, tuple2._1(), tuple3._1(), arg4, tuple5._1(), arg6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 arg7, T8 arg8) {
        return Tuple.of(arg1, tuple2._1(), tuple3._1(), arg4, tuple5._1(), tuple6._1(), arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, tuple2._1(), tuple3._1(), arg4, tuple5._1(), tuple6._1(), arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(arg1, tuple2._1(), tuple3._1(), arg4, tuple5._1(), tuple6._1(), tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, tuple2._1(), tuple3._1(), arg4, tuple5._1(), tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6, T7 arg7, T8 arg8) {
        return Tuple.of(arg1, tuple2._1(), tuple3._1(), tuple4._1(), arg5, arg6, arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, tuple2._1(), tuple3._1(), tuple4._1(), arg5, arg6, arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(arg1, tuple2._1(), tuple3._1(), tuple4._1(), arg5, arg6, tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, tuple2._1(), tuple3._1(), tuple4._1(), arg5, arg6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6, T7 arg7, T8 arg8) {
        return Tuple.of(arg1, tuple2._1(), tuple3._1(), tuple4._1(), arg5, tuple6._1(), arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, tuple2._1(), tuple3._1(), tuple4._1(), arg5, tuple6._1(), arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(arg1, tuple2._1(), tuple3._1(), tuple4._1(), arg5, tuple6._1(), tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, tuple2._1(), tuple3._1(), tuple4._1(), arg5, tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6, T7 arg7, T8 arg8) {
        return Tuple.of(arg1, tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), arg6, arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), arg6, arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(arg1, tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), arg6, tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), arg6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 arg7, T8 arg8) {
        return Tuple.of(arg1, tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(arg1, tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(T1 arg1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(arg1, tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, T4 arg4, T5 arg5, T6 arg6, T7 arg7, T8 arg8) {
        return Tuple.of(tuple1._1(), arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, T4 arg4, T5 arg5, T6 arg6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), arg2, arg3, arg4, arg5, arg6, arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, T4 arg4, T5 arg5, T6 arg6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(tuple1._1(), arg2, arg3, arg4, arg5, arg6, tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, T4 arg4, T5 arg5, T6 arg6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), arg2, arg3, arg4, arg5, arg6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6, T7 arg7, T8 arg8) {
        return Tuple.of(tuple1._1(), arg2, arg3, arg4, arg5, tuple6._1(), arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), arg2, arg3, arg4, arg5, tuple6._1(), arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(tuple1._1(), arg2, arg3, arg4, arg5, tuple6._1(), tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), arg2, arg3, arg4, arg5, tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6, T7 arg7, T8 arg8) {
        return Tuple.of(tuple1._1(), arg2, arg3, arg4, tuple5._1(), arg6, arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), arg2, arg3, arg4, tuple5._1(), arg6, arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(tuple1._1(), arg2, arg3, arg4, tuple5._1(), arg6, tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), arg2, arg3, arg4, tuple5._1(), arg6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 arg7, T8 arg8) {
        return Tuple.of(tuple1._1(), arg2, arg3, arg4, tuple5._1(), tuple6._1(), arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), arg2, arg3, arg4, tuple5._1(), tuple6._1(), arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(tuple1._1(), arg2, arg3, arg4, tuple5._1(), tuple6._1(), tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), arg2, arg3, arg4, tuple5._1(), tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6, T7 arg7, T8 arg8) {
        return Tuple.of(tuple1._1(), arg2, arg3, tuple4._1(), arg5, arg6, arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), arg2, arg3, tuple4._1(), arg5, arg6, arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(tuple1._1(), arg2, arg3, tuple4._1(), arg5, arg6, tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), arg2, arg3, tuple4._1(), arg5, arg6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6, T7 arg7, T8 arg8) {
        return Tuple.of(tuple1._1(), arg2, arg3, tuple4._1(), arg5, tuple6._1(), arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), arg2, arg3, tuple4._1(), arg5, tuple6._1(), arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(tuple1._1(), arg2, arg3, tuple4._1(), arg5, tuple6._1(), tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), arg2, arg3, tuple4._1(), arg5, tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6, T7 arg7, T8 arg8) {
        return Tuple.of(tuple1._1(), arg2, arg3, tuple4._1(), tuple5._1(), arg6, arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), arg2, arg3, tuple4._1(), tuple5._1(), arg6, arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(tuple1._1(), arg2, arg3, tuple4._1(), tuple5._1(), arg6, tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), arg2, arg3, tuple4._1(), tuple5._1(), arg6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 arg7, T8 arg8) {
        return Tuple.of(tuple1._1(), arg2, arg3, tuple4._1(), tuple5._1(), tuple6._1(), arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), arg2, arg3, tuple4._1(), tuple5._1(), tuple6._1(), arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(tuple1._1(), arg2, arg3, tuple4._1(), tuple5._1(), tuple6._1(), tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), arg2, arg3, tuple4._1(), tuple5._1(), tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, T6 arg6, T7 arg7, T8 arg8) {
        return Tuple.of(tuple1._1(), arg2, tuple3._1(), arg4, arg5, arg6, arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, T6 arg6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), arg2, tuple3._1(), arg4, arg5, arg6, arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, T6 arg6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(tuple1._1(), arg2, tuple3._1(), arg4, arg5, arg6, tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, T6 arg6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), arg2, tuple3._1(), arg4, arg5, arg6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6, T7 arg7, T8 arg8) {
        return Tuple.of(tuple1._1(), arg2, tuple3._1(), arg4, arg5, tuple6._1(), arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), arg2, tuple3._1(), arg4, arg5, tuple6._1(), arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(tuple1._1(), arg2, tuple3._1(), arg4, arg5, tuple6._1(), tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), arg2, tuple3._1(), arg4, arg5, tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6, T7 arg7, T8 arg8) {
        return Tuple.of(tuple1._1(), arg2, tuple3._1(), arg4, tuple5._1(), arg6, arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), arg2, tuple3._1(), arg4, tuple5._1(), arg6, arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(tuple1._1(), arg2, tuple3._1(), arg4, tuple5._1(), arg6, tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), arg2, tuple3._1(), arg4, tuple5._1(), arg6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 arg7, T8 arg8) {
        return Tuple.of(tuple1._1(), arg2, tuple3._1(), arg4, tuple5._1(), tuple6._1(), arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), arg2, tuple3._1(), arg4, tuple5._1(), tuple6._1(), arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(tuple1._1(), arg2, tuple3._1(), arg4, tuple5._1(), tuple6._1(), tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), arg2, tuple3._1(), arg4, tuple5._1(), tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6, T7 arg7, T8 arg8) {
        return Tuple.of(tuple1._1(), arg2, tuple3._1(), tuple4._1(), arg5, arg6, arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), arg2, tuple3._1(), tuple4._1(), arg5, arg6, arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(tuple1._1(), arg2, tuple3._1(), tuple4._1(), arg5, arg6, tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), arg2, tuple3._1(), tuple4._1(), arg5, arg6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6, T7 arg7, T8 arg8) {
        return Tuple.of(tuple1._1(), arg2, tuple3._1(), tuple4._1(), arg5, tuple6._1(), arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), arg2, tuple3._1(), tuple4._1(), arg5, tuple6._1(), arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(tuple1._1(), arg2, tuple3._1(), tuple4._1(), arg5, tuple6._1(), tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), arg2, tuple3._1(), tuple4._1(), arg5, tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6, T7 arg7, T8 arg8) {
        return Tuple.of(tuple1._1(), arg2, tuple3._1(), tuple4._1(), tuple5._1(), arg6, arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), arg2, tuple3._1(), tuple4._1(), tuple5._1(), arg6, arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(tuple1._1(), arg2, tuple3._1(), tuple4._1(), tuple5._1(), arg6, tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), arg2, tuple3._1(), tuple4._1(), tuple5._1(), arg6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 arg7, T8 arg8) {
        return Tuple.of(tuple1._1(), arg2, tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), arg2, tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(tuple1._1(), arg2, tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, T2 arg2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), arg2, tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, T5 arg5, T6 arg6, T7 arg7, T8 arg8) {
        return Tuple.of(tuple1._1(), tuple2._1(), arg3, arg4, arg5, arg6, arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, T5 arg5, T6 arg6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), arg3, arg4, arg5, arg6, arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, T5 arg5, T6 arg6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(tuple1._1(), tuple2._1(), arg3, arg4, arg5, arg6, tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, T5 arg5, T6 arg6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), arg3, arg4, arg5, arg6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6, T7 arg7, T8 arg8) {
        return Tuple.of(tuple1._1(), tuple2._1(), arg3, arg4, arg5, tuple6._1(), arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), arg3, arg4, arg5, tuple6._1(), arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(tuple1._1(), tuple2._1(), arg3, arg4, arg5, tuple6._1(), tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), arg3, arg4, arg5, tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6, T7 arg7, T8 arg8) {
        return Tuple.of(tuple1._1(), tuple2._1(), arg3, arg4, tuple5._1(), arg6, arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), arg3, arg4, tuple5._1(), arg6, arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(tuple1._1(), tuple2._1(), arg3, arg4, tuple5._1(), arg6, tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), arg3, arg4, tuple5._1(), arg6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 arg7, T8 arg8) {
        return Tuple.of(tuple1._1(), tuple2._1(), arg3, arg4, tuple5._1(), tuple6._1(), arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), arg3, arg4, tuple5._1(), tuple6._1(), arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(tuple1._1(), tuple2._1(), arg3, arg4, tuple5._1(), tuple6._1(), tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), arg3, arg4, tuple5._1(), tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6, T7 arg7, T8 arg8) {
        return Tuple.of(tuple1._1(), tuple2._1(), arg3, tuple4._1(), arg5, arg6, arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), arg3, tuple4._1(), arg5, arg6, arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(tuple1._1(), tuple2._1(), arg3, tuple4._1(), arg5, arg6, tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), arg3, tuple4._1(), arg5, arg6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6, T7 arg7, T8 arg8) {
        return Tuple.of(tuple1._1(), tuple2._1(), arg3, tuple4._1(), arg5, tuple6._1(), arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), arg3, tuple4._1(), arg5, tuple6._1(), arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(tuple1._1(), tuple2._1(), arg3, tuple4._1(), arg5, tuple6._1(), tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), arg3, tuple4._1(), arg5, tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6, T7 arg7, T8 arg8) {
        return Tuple.of(tuple1._1(), tuple2._1(), arg3, tuple4._1(), tuple5._1(), arg6, arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), arg3, tuple4._1(), tuple5._1(), arg6, arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(tuple1._1(), tuple2._1(), arg3, tuple4._1(), tuple5._1(), arg6, tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), arg3, tuple4._1(), tuple5._1(), arg6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 arg7, T8 arg8) {
        return Tuple.of(tuple1._1(), tuple2._1(), arg3, tuple4._1(), tuple5._1(), tuple6._1(), arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), arg3, tuple4._1(), tuple5._1(), tuple6._1(), arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(tuple1._1(), tuple2._1(), arg3, tuple4._1(), tuple5._1(), tuple6._1(), tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, T3 arg3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), arg3, tuple4._1(), tuple5._1(), tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, T6 arg6, T7 arg7, T8 arg8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), arg4, arg5, arg6, arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, T6 arg6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), arg4, arg5, arg6, arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, T6 arg6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), arg4, arg5, arg6, tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, T6 arg6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), arg4, arg5, arg6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6, T7 arg7, T8 arg8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), arg4, arg5, tuple6._1(), arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), arg4, arg5, tuple6._1(), arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), arg4, arg5, tuple6._1(), tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, T5 arg5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), arg4, arg5, tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6, T7 arg7, T8 arg8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), arg4, tuple5._1(), arg6, arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), arg4, tuple5._1(), arg6, arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), arg4, tuple5._1(), arg6, tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, T6 arg6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), arg4, tuple5._1(), arg6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 arg7, T8 arg8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), arg4, tuple5._1(), tuple6._1(), arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), arg4, tuple5._1(), tuple6._1(), arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), arg4, tuple5._1(), tuple6._1(), tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, T4 arg4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), arg4, tuple5._1(), tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6, T7 arg7, T8 arg8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), arg5, arg6, arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), arg5, arg6, arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), arg5, arg6, tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, T6 arg6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), arg5, arg6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6, T7 arg7, T8 arg8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), arg5, tuple6._1(), arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), arg5, tuple6._1(), arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), arg5, tuple6._1(), tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, T5 arg5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), arg5, tuple6._1(), tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6, T7 arg7, T8 arg8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), arg6, arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), arg6, arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), arg6, tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, T6 arg6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), arg6, tuple7._1(), tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 arg7, T8 arg8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), arg7, arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, T7 arg7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), arg7, tuple8._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, T8 arg8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), tuple7._1(), arg8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> flat8(Tuple1<? extends T1> tuple1, Tuple1<? extends T2> tuple2, Tuple1<? extends T3> tuple3, Tuple1<? extends T4> tuple4, Tuple1<? extends T5> tuple5, Tuple1<? extends T6> tuple6, Tuple1<? extends T7> tuple7, Tuple1<? extends T8> tuple8) {
        return Tuple.of(tuple1._1(), tuple2._1(), tuple3._1(), tuple4._1(), tuple5._1(), tuple6._1(), tuple7._1(), tuple8._1());
    }

}

package com.fiberg.iterative.core;

import io.vavr.control.Option;
import io.vavr.control.Try;

public interface IterativeInternals {

    public static <R, S extends R> R cast(S t) {
        return t;
    }

    public static <R> R force(Object t) {
        @SuppressWarnings("unchecked")
        final R r = t;
        return r;
    }

    public static <R> R identity(R r) {
        return r;
    }

    public static <R> Try<R> identityTry(Try<? extends R> r) {
        @SuppressWarnings("unchecked")
        final Try<R> t = (Try<R>) r;
        return t;
    }

    public static <R> Option<R> identityOption(Option<? extends R> r) {
        @SuppressWarnings("unchecked")
        final Option<R> o = (Option<R>) r;
        return o;
    }

    public static <R> Iterable<R> identityIterable(Iterable<? extends R> r) {
        @SuppressWarnings("unchecked")
        final Iterable<R> i = (Iterable<R>) r;
        return i;
    }

    public static Boolean toPredicate(Boolean r) {
        return r;
    }

    public static <T> void nothing(T element) {
    }

    public static <T> T none() {
        return null;
    }

    public static <T, T1> T none(T1 t1) {
        return null;
    }

    public static <T, T1, T2> T none(T1 t1, T2 t2) {
        return null;
    }

    public static <T, T1, T2, T3> T none(T1 t1, T2 t2, T3 t3) {
        return null;
    }

    public static <T, T1, T2, T3, T4> T none(T1 t1, T2 t2, T3 t3, T4 t4) {
        return null;
    }

    public static <T, T1, T2, T3, T4, T5> T none(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return null;
    }

    public static <T, T1, T2, T3, T4, T5, T6> T none(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return null;
    }

    public static <T, T1, T2, T3, T4, T5, T6, T7> T none(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return null;
    }

    public static <T, T1, T2, T3, T4, T5, T6, T7, T8> T none(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return null;
    }

    public static <T1> T1 get1(T1 t1) {
        return t1;
    }

    public static <T1, T2> T1 get1(T1 t1, T2 t2) {
        return t1;
    }

    public static <T1, T2> T2 get2(T1 t1, T2 t2) {
        return t2;
    }

    public static <T1, T2, T3> T1 get1(T1 t1, T2 t2, T3 t3) {
        return t1;
    }

    public static <T1, T2, T3> T2 get2(T1 t1, T2 t2, T3 t3) {
        return t2;
    }

    public static <T1, T2, T3> T3 get3(T1 t1, T2 t2, T3 t3) {
        return t3;
    }

    public static <T1, T2, T3, T4> T1 get1(T1 t1, T2 t2, T3 t3, T4 t4) {
        return t1;
    }

    public static <T1, T2, T3, T4> T2 get2(T1 t1, T2 t2, T3 t3, T4 t4) {
        return t2;
    }

    public static <T1, T2, T3, T4> T3 get3(T1 t1, T2 t2, T3 t3, T4 t4) {
        return t3;
    }

    public static <T1, T2, T3, T4> T4 get4(T1 t1, T2 t2, T3 t3, T4 t4) {
        return t4;
    }

    public static <T1, T2, T3, T4, T5> T1 get1(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return t1;
    }

    public static <T1, T2, T3, T4, T5> T2 get2(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return t2;
    }

    public static <T1, T2, T3, T4, T5> T3 get3(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return t3;
    }

    public static <T1, T2, T3, T4, T5> T4 get4(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return t4;
    }

    public static <T1, T2, T3, T4, T5> T5 get5(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return t5;
    }

    public static <T1, T2, T3, T4, T5, T6> T1 get1(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return t1;
    }

    public static <T1, T2, T3, T4, T5, T6> T2 get2(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return t2;
    }

    public static <T1, T2, T3, T4, T5, T6> T3 get3(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return t3;
    }

    public static <T1, T2, T3, T4, T5, T6> T4 get4(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return t4;
    }

    public static <T1, T2, T3, T4, T5, T6> T5 get5(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return t5;
    }

    public static <T1, T2, T3, T4, T5, T6> T6 get6(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return t6;
    }

    public static <T1, T2, T3, T4, T5, T6, T7> T1 get1(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return t1;
    }

    public static <T1, T2, T3, T4, T5, T6, T7> T2 get2(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return t2;
    }

    public static <T1, T2, T3, T4, T5, T6, T7> T3 get3(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return t3;
    }

    public static <T1, T2, T3, T4, T5, T6, T7> T4 get4(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return t4;
    }

    public static <T1, T2, T3, T4, T5, T6, T7> T5 get5(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return t5;
    }

    public static <T1, T2, T3, T4, T5, T6, T7> T6 get6(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return t6;
    }

    public static <T1, T2, T3, T4, T5, T6, T7> T7 get7(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return t7;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> T1 get1(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return t1;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> T2 get2(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return t2;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> T3 get3(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return t3;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> T4 get4(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return t4;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> T5 get5(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return t5;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> T6 get6(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return t6;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> T7 get7(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return t7;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> T8 get8(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return t8;
    }

}

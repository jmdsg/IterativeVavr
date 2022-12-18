package com.fiberg.iterative.core;

import com.fiberg.iterative.function.*;
import io.vavr.Tuple;
import io.vavr.Tuple0;
import io.vavr.Tuple1;
import io.vavr.Tuple2;
import io.vavr.Tuple3;
import io.vavr.Tuple4;
import io.vavr.Tuple5;
import io.vavr.Tuple6;
import io.vavr.Tuple7;
import io.vavr.Tuple8;
import java.io.Serializable;
import java.util.function.Function;

public interface Tupler {

    public static <T1, R> Fn1<Tuple1<T1>, Tuple1<R>> apply1Tp1(Fn1<? super T1, ? extends R> f) {
        return Tupler1.apply1(f);
    }

    public static <T1> Pr1<Tuple1<T1>> test1Tp1(Pr1<? super T1> p) {
        return Tupler1.test1(p);
    }

    public static <T1> Cs1<Tuple1<T1>> accept1Tp1(Cs1<? super T1> c) {
        return Tupler1.accept1(c);
    }

    public static <T1, T2, R> Fn1<Tuple2<T1, T2>, Tuple2<R, T2>> apply1Tp2(Fn1<? super T1, ? extends R> f) {
        return Tupler2.apply1(f);
    }

    public static <T1, T2, R> Fn1<Tuple2<T1, T2>, Tuple2<T1, R>> apply2Tp2(Fn1<? super T2, ? extends R> f) {
        return Tupler2.apply2(f);
    }

    public static <T1, T2> Pr1<Tuple2<T1, T2>> test1Tp2(Pr1<? super T1> p) {
        return Tupler2.test1(p);
    }

    public static <T1, T2> Pr1<Tuple2<T1, T2>> test2Tp2(Pr1<? super T2> p) {
        return Tupler2.test2(p);
    }

    public static <T1, T2> Cs1<Tuple2<T1, T2>> accept1Tp2(Cs1<? super T1> c) {
        return Tupler2.accept1(c);
    }

    public static <T1, T2> Cs1<Tuple2<T1, T2>> accept2Tp2(Cs1<? super T2> c) {
        return Tupler2.accept2(c);
    }

    public static <T1, T2, T3, R> Fn1<Tuple3<T1, T2, T3>, Tuple3<R, T2, T3>> apply1Tp3(Fn1<? super T1, ? extends R> f) {
        return Tupler3.apply1(f);
    }

    public static <T1, T2, T3, R> Fn1<Tuple3<T1, T2, T3>, Tuple3<T1, R, T3>> apply2Tp3(Fn1<? super T2, ? extends R> f) {
        return Tupler3.apply2(f);
    }

    public static <T1, T2, T3, R> Fn1<Tuple3<T1, T2, T3>, Tuple3<T1, T2, R>> apply3Tp3(Fn1<? super T3, ? extends R> f) {
        return Tupler3.apply3(f);
    }

    public static <T1, T2, T3> Pr1<Tuple3<T1, T2, T3>> test1Tp3(Pr1<? super T1> p) {
        return Tupler3.test1(p);
    }

    public static <T1, T2, T3> Pr1<Tuple3<T1, T2, T3>> test2Tp3(Pr1<? super T2> p) {
        return Tupler3.test2(p);
    }

    public static <T1, T2, T3> Pr1<Tuple3<T1, T2, T3>> test3Tp3(Pr1<? super T3> p) {
        return Tupler3.test3(p);
    }

    public static <T1, T2, T3> Cs1<Tuple3<T1, T2, T3>> accept1Tp3(Cs1<? super T1> c) {
        return Tupler3.accept1(c);
    }

    public static <T1, T2, T3> Cs1<Tuple3<T1, T2, T3>> accept2Tp3(Cs1<? super T2> c) {
        return Tupler3.accept2(c);
    }

    public static <T1, T2, T3> Cs1<Tuple3<T1, T2, T3>> accept3Tp3(Cs1<? super T3> c) {
        return Tupler3.accept3(c);
    }

    public static <T1, T2, T3, T4, R> Fn1<Tuple4<T1, T2, T3, T4>, Tuple4<R, T2, T3, T4>> apply1Tp4(Fn1<? super T1, ? extends R> f) {
        return Tupler4.apply1(f);
    }

    public static <T1, T2, T3, T4, R> Fn1<Tuple4<T1, T2, T3, T4>, Tuple4<T1, R, T3, T4>> apply2Tp4(Fn1<? super T2, ? extends R> f) {
        return Tupler4.apply2(f);
    }

    public static <T1, T2, T3, T4, R> Fn1<Tuple4<T1, T2, T3, T4>, Tuple4<T1, T2, R, T4>> apply3Tp4(Fn1<? super T3, ? extends R> f) {
        return Tupler4.apply3(f);
    }

    public static <T1, T2, T3, T4, R> Fn1<Tuple4<T1, T2, T3, T4>, Tuple4<T1, T2, T3, R>> apply4Tp4(Fn1<? super T4, ? extends R> f) {
        return Tupler4.apply4(f);
    }

    public static <T1, T2, T3, T4> Pr1<Tuple4<T1, T2, T3, T4>> test1Tp4(Pr1<? super T1> p) {
        return Tupler4.test1(p);
    }

    public static <T1, T2, T3, T4> Pr1<Tuple4<T1, T2, T3, T4>> test2Tp4(Pr1<? super T2> p) {
        return Tupler4.test2(p);
    }

    public static <T1, T2, T3, T4> Pr1<Tuple4<T1, T2, T3, T4>> test3Tp4(Pr1<? super T3> p) {
        return Tupler4.test3(p);
    }

    public static <T1, T2, T3, T4> Pr1<Tuple4<T1, T2, T3, T4>> test4Tp4(Pr1<? super T4> p) {
        return Tupler4.test4(p);
    }

    public static <T1, T2, T3, T4> Cs1<Tuple4<T1, T2, T3, T4>> accept1Tp4(Cs1<? super T1> c) {
        return Tupler4.accept1(c);
    }

    public static <T1, T2, T3, T4> Cs1<Tuple4<T1, T2, T3, T4>> accept2Tp4(Cs1<? super T2> c) {
        return Tupler4.accept2(c);
    }

    public static <T1, T2, T3, T4> Cs1<Tuple4<T1, T2, T3, T4>> accept3Tp4(Cs1<? super T3> c) {
        return Tupler4.accept3(c);
    }

    public static <T1, T2, T3, T4> Cs1<Tuple4<T1, T2, T3, T4>> accept4Tp4(Cs1<? super T4> c) {
        return Tupler4.accept4(c);
    }

    public static <T1, T2, T3, T4, T5, R> Fn1<Tuple5<T1, T2, T3, T4, T5>, Tuple5<R, T2, T3, T4, T5>> apply1Tp5(Fn1<? super T1, ? extends R> f) {
        return Tupler5.apply1(f);
    }

    public static <T1, T2, T3, T4, T5, R> Fn1<Tuple5<T1, T2, T3, T4, T5>, Tuple5<T1, R, T3, T4, T5>> apply2Tp5(Fn1<? super T2, ? extends R> f) {
        return Tupler5.apply2(f);
    }

    public static <T1, T2, T3, T4, T5, R> Fn1<Tuple5<T1, T2, T3, T4, T5>, Tuple5<T1, T2, R, T4, T5>> apply3Tp5(Fn1<? super T3, ? extends R> f) {
        return Tupler5.apply3(f);
    }

    public static <T1, T2, T3, T4, T5, R> Fn1<Tuple5<T1, T2, T3, T4, T5>, Tuple5<T1, T2, T3, R, T5>> apply4Tp5(Fn1<? super T4, ? extends R> f) {
        return Tupler5.apply4(f);
    }

    public static <T1, T2, T3, T4, T5, R> Fn1<Tuple5<T1, T2, T3, T4, T5>, Tuple5<T1, T2, T3, T4, R>> apply5Tp5(Fn1<? super T5, ? extends R> f) {
        return Tupler5.apply5(f);
    }

    public static <T1, T2, T3, T4, T5> Pr1<Tuple5<T1, T2, T3, T4, T5>> test1Tp5(Pr1<? super T1> p) {
        return Tupler5.test1(p);
    }

    public static <T1, T2, T3, T4, T5> Pr1<Tuple5<T1, T2, T3, T4, T5>> test2Tp5(Pr1<? super T2> p) {
        return Tupler5.test2(p);
    }

    public static <T1, T2, T3, T4, T5> Pr1<Tuple5<T1, T2, T3, T4, T5>> test3Tp5(Pr1<? super T3> p) {
        return Tupler5.test3(p);
    }

    public static <T1, T2, T3, T4, T5> Pr1<Tuple5<T1, T2, T3, T4, T5>> test4Tp5(Pr1<? super T4> p) {
        return Tupler5.test4(p);
    }

    public static <T1, T2, T3, T4, T5> Pr1<Tuple5<T1, T2, T3, T4, T5>> test5Tp5(Pr1<? super T5> p) {
        return Tupler5.test5(p);
    }

    public static <T1, T2, T3, T4, T5> Cs1<Tuple5<T1, T2, T3, T4, T5>> accept1Tp5(Cs1<? super T1> c) {
        return Tupler5.accept1(c);
    }

    public static <T1, T2, T3, T4, T5> Cs1<Tuple5<T1, T2, T3, T4, T5>> accept2Tp5(Cs1<? super T2> c) {
        return Tupler5.accept2(c);
    }

    public static <T1, T2, T3, T4, T5> Cs1<Tuple5<T1, T2, T3, T4, T5>> accept3Tp5(Cs1<? super T3> c) {
        return Tupler5.accept3(c);
    }

    public static <T1, T2, T3, T4, T5> Cs1<Tuple5<T1, T2, T3, T4, T5>> accept4Tp5(Cs1<? super T4> c) {
        return Tupler5.accept4(c);
    }

    public static <T1, T2, T3, T4, T5> Cs1<Tuple5<T1, T2, T3, T4, T5>> accept5Tp5(Cs1<? super T5> c) {
        return Tupler5.accept5(c);
    }

    public static <T1, T2, T3, T4, T5, T6, R> Fn1<Tuple6<T1, T2, T3, T4, T5, T6>, Tuple6<R, T2, T3, T4, T5, T6>> apply1Tp6(Fn1<? super T1, ? extends R> f) {
        return Tupler6.apply1(f);
    }

    public static <T1, T2, T3, T4, T5, T6, R> Fn1<Tuple6<T1, T2, T3, T4, T5, T6>, Tuple6<T1, R, T3, T4, T5, T6>> apply2Tp6(Fn1<? super T2, ? extends R> f) {
        return Tupler6.apply2(f);
    }

    public static <T1, T2, T3, T4, T5, T6, R> Fn1<Tuple6<T1, T2, T3, T4, T5, T6>, Tuple6<T1, T2, R, T4, T5, T6>> apply3Tp6(Fn1<? super T3, ? extends R> f) {
        return Tupler6.apply3(f);
    }

    public static <T1, T2, T3, T4, T5, T6, R> Fn1<Tuple6<T1, T2, T3, T4, T5, T6>, Tuple6<T1, T2, T3, R, T5, T6>> apply4Tp6(Fn1<? super T4, ? extends R> f) {
        return Tupler6.apply4(f);
    }

    public static <T1, T2, T3, T4, T5, T6, R> Fn1<Tuple6<T1, T2, T3, T4, T5, T6>, Tuple6<T1, T2, T3, T4, R, T6>> apply5Tp6(Fn1<? super T5, ? extends R> f) {
        return Tupler6.apply5(f);
    }

    public static <T1, T2, T3, T4, T5, T6, R> Fn1<Tuple6<T1, T2, T3, T4, T5, T6>, Tuple6<T1, T2, T3, T4, T5, R>> apply6Tp6(Fn1<? super T6, ? extends R> f) {
        return Tupler6.apply6(f);
    }

    public static <T1, T2, T3, T4, T5, T6> Pr1<Tuple6<T1, T2, T3, T4, T5, T6>> test1Tp6(Pr1<? super T1> p) {
        return Tupler6.test1(p);
    }

    public static <T1, T2, T3, T4, T5, T6> Pr1<Tuple6<T1, T2, T3, T4, T5, T6>> test2Tp6(Pr1<? super T2> p) {
        return Tupler6.test2(p);
    }

    public static <T1, T2, T3, T4, T5, T6> Pr1<Tuple6<T1, T2, T3, T4, T5, T6>> test3Tp6(Pr1<? super T3> p) {
        return Tupler6.test3(p);
    }

    public static <T1, T2, T3, T4, T5, T6> Pr1<Tuple6<T1, T2, T3, T4, T5, T6>> test4Tp6(Pr1<? super T4> p) {
        return Tupler6.test4(p);
    }

    public static <T1, T2, T3, T4, T5, T6> Pr1<Tuple6<T1, T2, T3, T4, T5, T6>> test5Tp6(Pr1<? super T5> p) {
        return Tupler6.test5(p);
    }

    public static <T1, T2, T3, T4, T5, T6> Pr1<Tuple6<T1, T2, T3, T4, T5, T6>> test6Tp6(Pr1<? super T6> p) {
        return Tupler6.test6(p);
    }

    public static <T1, T2, T3, T4, T5, T6> Cs1<Tuple6<T1, T2, T3, T4, T5, T6>> accept1Tp6(Cs1<? super T1> c) {
        return Tupler6.accept1(c);
    }

    public static <T1, T2, T3, T4, T5, T6> Cs1<Tuple6<T1, T2, T3, T4, T5, T6>> accept2Tp6(Cs1<? super T2> c) {
        return Tupler6.accept2(c);
    }

    public static <T1, T2, T3, T4, T5, T6> Cs1<Tuple6<T1, T2, T3, T4, T5, T6>> accept3Tp6(Cs1<? super T3> c) {
        return Tupler6.accept3(c);
    }

    public static <T1, T2, T3, T4, T5, T6> Cs1<Tuple6<T1, T2, T3, T4, T5, T6>> accept4Tp6(Cs1<? super T4> c) {
        return Tupler6.accept4(c);
    }

    public static <T1, T2, T3, T4, T5, T6> Cs1<Tuple6<T1, T2, T3, T4, T5, T6>> accept5Tp6(Cs1<? super T5> c) {
        return Tupler6.accept5(c);
    }

    public static <T1, T2, T3, T4, T5, T6> Cs1<Tuple6<T1, T2, T3, T4, T5, T6>> accept6Tp6(Cs1<? super T6> c) {
        return Tupler6.accept6(c);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn1<Tuple7<T1, T2, T3, T4, T5, T6, T7>, Tuple7<R, T2, T3, T4, T5, T6, T7>> apply1Tp7(Fn1<? super T1, ? extends R> f) {
        return Tupler7.apply1(f);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn1<Tuple7<T1, T2, T3, T4, T5, T6, T7>, Tuple7<T1, R, T3, T4, T5, T6, T7>> apply2Tp7(Fn1<? super T2, ? extends R> f) {
        return Tupler7.apply2(f);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn1<Tuple7<T1, T2, T3, T4, T5, T6, T7>, Tuple7<T1, T2, R, T4, T5, T6, T7>> apply3Tp7(Fn1<? super T3, ? extends R> f) {
        return Tupler7.apply3(f);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn1<Tuple7<T1, T2, T3, T4, T5, T6, T7>, Tuple7<T1, T2, T3, R, T5, T6, T7>> apply4Tp7(Fn1<? super T4, ? extends R> f) {
        return Tupler7.apply4(f);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn1<Tuple7<T1, T2, T3, T4, T5, T6, T7>, Tuple7<T1, T2, T3, T4, R, T6, T7>> apply5Tp7(Fn1<? super T5, ? extends R> f) {
        return Tupler7.apply5(f);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn1<Tuple7<T1, T2, T3, T4, T5, T6, T7>, Tuple7<T1, T2, T3, T4, T5, R, T7>> apply6Tp7(Fn1<? super T6, ? extends R> f) {
        return Tupler7.apply6(f);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fn1<Tuple7<T1, T2, T3, T4, T5, T6, T7>, Tuple7<T1, T2, T3, T4, T5, T6, R>> apply7Tp7(Fn1<? super T7, ? extends R> f) {
        return Tupler7.apply7(f);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> test1Tp7(Pr1<? super T1> p) {
        return Tupler7.test1(p);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> test2Tp7(Pr1<? super T2> p) {
        return Tupler7.test2(p);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> test3Tp7(Pr1<? super T3> p) {
        return Tupler7.test3(p);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> test4Tp7(Pr1<? super T4> p) {
        return Tupler7.test4(p);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> test5Tp7(Pr1<? super T5> p) {
        return Tupler7.test5(p);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> test6Tp7(Pr1<? super T6> p) {
        return Tupler7.test6(p);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> test7Tp7(Pr1<? super T7> p) {
        return Tupler7.test7(p);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Cs1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> accept1Tp7(Cs1<? super T1> c) {
        return Tupler7.accept1(c);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Cs1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> accept2Tp7(Cs1<? super T2> c) {
        return Tupler7.accept2(c);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Cs1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> accept3Tp7(Cs1<? super T3> c) {
        return Tupler7.accept3(c);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Cs1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> accept4Tp7(Cs1<? super T4> c) {
        return Tupler7.accept4(c);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Cs1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> accept5Tp7(Cs1<? super T5> c) {
        return Tupler7.accept5(c);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Cs1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> accept6Tp7(Cs1<? super T6> c) {
        return Tupler7.accept6(c);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Cs1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> accept7Tp7(Cs1<? super T7> c) {
        return Tupler7.accept7(c);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, Tuple8<R, T2, T3, T4, T5, T6, T7, T8>> apply1Tp8(Fn1<? super T1, ? extends R> f) {
        return Tupler8.apply1(f);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, Tuple8<T1, R, T3, T4, T5, T6, T7, T8>> apply2Tp8(Fn1<? super T2, ? extends R> f) {
        return Tupler8.apply2(f);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, Tuple8<T1, T2, R, T4, T5, T6, T7, T8>> apply3Tp8(Fn1<? super T3, ? extends R> f) {
        return Tupler8.apply3(f);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, Tuple8<T1, T2, T3, R, T5, T6, T7, T8>> apply4Tp8(Fn1<? super T4, ? extends R> f) {
        return Tupler8.apply4(f);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, Tuple8<T1, T2, T3, T4, R, T6, T7, T8>> apply5Tp8(Fn1<? super T5, ? extends R> f) {
        return Tupler8.apply5(f);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, Tuple8<T1, T2, T3, T4, T5, R, T7, T8>> apply6Tp8(Fn1<? super T6, ? extends R> f) {
        return Tupler8.apply6(f);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, Tuple8<T1, T2, T3, T4, T5, T6, R, T8>> apply7Tp8(Fn1<? super T7, ? extends R> f) {
        return Tupler8.apply7(f);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, Tuple8<T1, T2, T3, T4, T5, T6, T7, R>> apply8Tp8(Fn1<? super T8, ? extends R> f) {
        return Tupler8.apply8(f);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> test1Tp8(Pr1<? super T1> p) {
        return Tupler8.test1(p);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> test2Tp8(Pr1<? super T2> p) {
        return Tupler8.test2(p);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> test3Tp8(Pr1<? super T3> p) {
        return Tupler8.test3(p);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> test4Tp8(Pr1<? super T4> p) {
        return Tupler8.test4(p);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> test5Tp8(Pr1<? super T5> p) {
        return Tupler8.test5(p);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> test6Tp8(Pr1<? super T6> p) {
        return Tupler8.test6(p);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> test7Tp8(Pr1<? super T7> p) {
        return Tupler8.test7(p);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> test8Tp8(Pr1<? super T8> p) {
        return Tupler8.test8(p);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> accept1Tp8(Cs1<? super T1> c) {
        return Tupler8.accept1(c);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> accept2Tp8(Cs1<? super T2> c) {
        return Tupler8.accept2(c);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> accept3Tp8(Cs1<? super T3> c) {
        return Tupler8.accept3(c);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> accept4Tp8(Cs1<? super T4> c) {
        return Tupler8.accept4(c);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> accept5Tp8(Cs1<? super T5> c) {
        return Tupler8.accept5(c);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> accept6Tp8(Cs1<? super T6> c) {
        return Tupler8.accept6(c);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> accept7Tp8(Cs1<? super T7> c) {
        return Tupler8.accept7(c);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> accept8Tp8(Cs1<? super T8> c) {
        return Tupler8.accept8(c);
    }

    public static <T1, R> Fnc1<Tuple1<T1>, Tuple1<R>> applyChecked1Tp1(Fnc1<? super T1, ? extends R> f) {
        return Tupler1.applyChecked1(f);
    }

    public static <T1> Prc1<Tuple1<T1>> testChecked1Tp1(Prc1<? super T1> p) {
        return Tupler1.testChecked1(p);
    }

    public static <T1> Csc1<Tuple1<T1>> acceptChecked1Tp1(Csc1<? super T1> c) {
        return Tupler1.acceptChecked1(c);
    }

    public static <T1, T2, R> Fnc1<Tuple2<T1, T2>, Tuple2<R, T2>> applyChecked1Tp2(Fnc1<? super T1, ? extends R> f) {
        return Tupler2.applyChecked1(f);
    }

    public static <T1, T2, R> Fnc1<Tuple2<T1, T2>, Tuple2<T1, R>> applyChecked2Tp2(Fnc1<? super T2, ? extends R> f) {
        return Tupler2.applyChecked2(f);
    }

    public static <T1, T2> Prc1<Tuple2<T1, T2>> testChecked1Tp2(Prc1<? super T1> p) {
        return Tupler2.testChecked1(p);
    }

    public static <T1, T2> Prc1<Tuple2<T1, T2>> testChecked2Tp2(Prc1<? super T2> p) {
        return Tupler2.testChecked2(p);
    }

    public static <T1, T2> Csc1<Tuple2<T1, T2>> acceptChecked1Tp2(Csc1<? super T1> c) {
        return Tupler2.acceptChecked1(c);
    }

    public static <T1, T2> Csc1<Tuple2<T1, T2>> acceptChecked2Tp2(Csc1<? super T2> c) {
        return Tupler2.acceptChecked2(c);
    }

    public static <T1, T2, T3, R> Fnc1<Tuple3<T1, T2, T3>, Tuple3<R, T2, T3>> applyChecked1Tp3(Fnc1<? super T1, ? extends R> f) {
        return Tupler3.applyChecked1(f);
    }

    public static <T1, T2, T3, R> Fnc1<Tuple3<T1, T2, T3>, Tuple3<T1, R, T3>> applyChecked2Tp3(Fnc1<? super T2, ? extends R> f) {
        return Tupler3.applyChecked2(f);
    }

    public static <T1, T2, T3, R> Fnc1<Tuple3<T1, T2, T3>, Tuple3<T1, T2, R>> applyChecked3Tp3(Fnc1<? super T3, ? extends R> f) {
        return Tupler3.applyChecked3(f);
    }

    public static <T1, T2, T3> Prc1<Tuple3<T1, T2, T3>> testChecked1Tp3(Prc1<? super T1> p) {
        return Tupler3.testChecked1(p);
    }

    public static <T1, T2, T3> Prc1<Tuple3<T1, T2, T3>> testChecked2Tp3(Prc1<? super T2> p) {
        return Tupler3.testChecked2(p);
    }

    public static <T1, T2, T3> Prc1<Tuple3<T1, T2, T3>> testChecked3Tp3(Prc1<? super T3> p) {
        return Tupler3.testChecked3(p);
    }

    public static <T1, T2, T3> Csc1<Tuple3<T1, T2, T3>> acceptChecked1Tp3(Csc1<? super T1> c) {
        return Tupler3.acceptChecked1(c);
    }

    public static <T1, T2, T3> Csc1<Tuple3<T1, T2, T3>> acceptChecked2Tp3(Csc1<? super T2> c) {
        return Tupler3.acceptChecked2(c);
    }

    public static <T1, T2, T3> Csc1<Tuple3<T1, T2, T3>> acceptChecked3Tp3(Csc1<? super T3> c) {
        return Tupler3.acceptChecked3(c);
    }

    public static <T1, T2, T3, T4, R> Fnc1<Tuple4<T1, T2, T3, T4>, Tuple4<R, T2, T3, T4>> applyChecked1Tp4(Fnc1<? super T1, ? extends R> f) {
        return Tupler4.applyChecked1(f);
    }

    public static <T1, T2, T3, T4, R> Fnc1<Tuple4<T1, T2, T3, T4>, Tuple4<T1, R, T3, T4>> applyChecked2Tp4(Fnc1<? super T2, ? extends R> f) {
        return Tupler4.applyChecked2(f);
    }

    public static <T1, T2, T3, T4, R> Fnc1<Tuple4<T1, T2, T3, T4>, Tuple4<T1, T2, R, T4>> applyChecked3Tp4(Fnc1<? super T3, ? extends R> f) {
        return Tupler4.applyChecked3(f);
    }

    public static <T1, T2, T3, T4, R> Fnc1<Tuple4<T1, T2, T3, T4>, Tuple4<T1, T2, T3, R>> applyChecked4Tp4(Fnc1<? super T4, ? extends R> f) {
        return Tupler4.applyChecked4(f);
    }

    public static <T1, T2, T3, T4> Prc1<Tuple4<T1, T2, T3, T4>> testChecked1Tp4(Prc1<? super T1> p) {
        return Tupler4.testChecked1(p);
    }

    public static <T1, T2, T3, T4> Prc1<Tuple4<T1, T2, T3, T4>> testChecked2Tp4(Prc1<? super T2> p) {
        return Tupler4.testChecked2(p);
    }

    public static <T1, T2, T3, T4> Prc1<Tuple4<T1, T2, T3, T4>> testChecked3Tp4(Prc1<? super T3> p) {
        return Tupler4.testChecked3(p);
    }

    public static <T1, T2, T3, T4> Prc1<Tuple4<T1, T2, T3, T4>> testChecked4Tp4(Prc1<? super T4> p) {
        return Tupler4.testChecked4(p);
    }

    public static <T1, T2, T3, T4> Csc1<Tuple4<T1, T2, T3, T4>> acceptChecked1Tp4(Csc1<? super T1> c) {
        return Tupler4.acceptChecked1(c);
    }

    public static <T1, T2, T3, T4> Csc1<Tuple4<T1, T2, T3, T4>> acceptChecked2Tp4(Csc1<? super T2> c) {
        return Tupler4.acceptChecked2(c);
    }

    public static <T1, T2, T3, T4> Csc1<Tuple4<T1, T2, T3, T4>> acceptChecked3Tp4(Csc1<? super T3> c) {
        return Tupler4.acceptChecked3(c);
    }

    public static <T1, T2, T3, T4> Csc1<Tuple4<T1, T2, T3, T4>> acceptChecked4Tp4(Csc1<? super T4> c) {
        return Tupler4.acceptChecked4(c);
    }

    public static <T1, T2, T3, T4, T5, R> Fnc1<Tuple5<T1, T2, T3, T4, T5>, Tuple5<R, T2, T3, T4, T5>> applyChecked1Tp5(Fnc1<? super T1, ? extends R> f) {
        return Tupler5.applyChecked1(f);
    }

    public static <T1, T2, T3, T4, T5, R> Fnc1<Tuple5<T1, T2, T3, T4, T5>, Tuple5<T1, R, T3, T4, T5>> applyChecked2Tp5(Fnc1<? super T2, ? extends R> f) {
        return Tupler5.applyChecked2(f);
    }

    public static <T1, T2, T3, T4, T5, R> Fnc1<Tuple5<T1, T2, T3, T4, T5>, Tuple5<T1, T2, R, T4, T5>> applyChecked3Tp5(Fnc1<? super T3, ? extends R> f) {
        return Tupler5.applyChecked3(f);
    }

    public static <T1, T2, T3, T4, T5, R> Fnc1<Tuple5<T1, T2, T3, T4, T5>, Tuple5<T1, T2, T3, R, T5>> applyChecked4Tp5(Fnc1<? super T4, ? extends R> f) {
        return Tupler5.applyChecked4(f);
    }

    public static <T1, T2, T3, T4, T5, R> Fnc1<Tuple5<T1, T2, T3, T4, T5>, Tuple5<T1, T2, T3, T4, R>> applyChecked5Tp5(Fnc1<? super T5, ? extends R> f) {
        return Tupler5.applyChecked5(f);
    }

    public static <T1, T2, T3, T4, T5> Prc1<Tuple5<T1, T2, T3, T4, T5>> testChecked1Tp5(Prc1<? super T1> p) {
        return Tupler5.testChecked1(p);
    }

    public static <T1, T2, T3, T4, T5> Prc1<Tuple5<T1, T2, T3, T4, T5>> testChecked2Tp5(Prc1<? super T2> p) {
        return Tupler5.testChecked2(p);
    }

    public static <T1, T2, T3, T4, T5> Prc1<Tuple5<T1, T2, T3, T4, T5>> testChecked3Tp5(Prc1<? super T3> p) {
        return Tupler5.testChecked3(p);
    }

    public static <T1, T2, T3, T4, T5> Prc1<Tuple5<T1, T2, T3, T4, T5>> testChecked4Tp5(Prc1<? super T4> p) {
        return Tupler5.testChecked4(p);
    }

    public static <T1, T2, T3, T4, T5> Prc1<Tuple5<T1, T2, T3, T4, T5>> testChecked5Tp5(Prc1<? super T5> p) {
        return Tupler5.testChecked5(p);
    }

    public static <T1, T2, T3, T4, T5> Csc1<Tuple5<T1, T2, T3, T4, T5>> acceptChecked1Tp5(Csc1<? super T1> c) {
        return Tupler5.acceptChecked1(c);
    }

    public static <T1, T2, T3, T4, T5> Csc1<Tuple5<T1, T2, T3, T4, T5>> acceptChecked2Tp5(Csc1<? super T2> c) {
        return Tupler5.acceptChecked2(c);
    }

    public static <T1, T2, T3, T4, T5> Csc1<Tuple5<T1, T2, T3, T4, T5>> acceptChecked3Tp5(Csc1<? super T3> c) {
        return Tupler5.acceptChecked3(c);
    }

    public static <T1, T2, T3, T4, T5> Csc1<Tuple5<T1, T2, T3, T4, T5>> acceptChecked4Tp5(Csc1<? super T4> c) {
        return Tupler5.acceptChecked4(c);
    }

    public static <T1, T2, T3, T4, T5> Csc1<Tuple5<T1, T2, T3, T4, T5>> acceptChecked5Tp5(Csc1<? super T5> c) {
        return Tupler5.acceptChecked5(c);
    }

    public static <T1, T2, T3, T4, T5, T6, R> Fnc1<Tuple6<T1, T2, T3, T4, T5, T6>, Tuple6<R, T2, T3, T4, T5, T6>> applyChecked1Tp6(Fnc1<? super T1, ? extends R> f) {
        return Tupler6.applyChecked1(f);
    }

    public static <T1, T2, T3, T4, T5, T6, R> Fnc1<Tuple6<T1, T2, T3, T4, T5, T6>, Tuple6<T1, R, T3, T4, T5, T6>> applyChecked2Tp6(Fnc1<? super T2, ? extends R> f) {
        return Tupler6.applyChecked2(f);
    }

    public static <T1, T2, T3, T4, T5, T6, R> Fnc1<Tuple6<T1, T2, T3, T4, T5, T6>, Tuple6<T1, T2, R, T4, T5, T6>> applyChecked3Tp6(Fnc1<? super T3, ? extends R> f) {
        return Tupler6.applyChecked3(f);
    }

    public static <T1, T2, T3, T4, T5, T6, R> Fnc1<Tuple6<T1, T2, T3, T4, T5, T6>, Tuple6<T1, T2, T3, R, T5, T6>> applyChecked4Tp6(Fnc1<? super T4, ? extends R> f) {
        return Tupler6.applyChecked4(f);
    }

    public static <T1, T2, T3, T4, T5, T6, R> Fnc1<Tuple6<T1, T2, T3, T4, T5, T6>, Tuple6<T1, T2, T3, T4, R, T6>> applyChecked5Tp6(Fnc1<? super T5, ? extends R> f) {
        return Tupler6.applyChecked5(f);
    }

    public static <T1, T2, T3, T4, T5, T6, R> Fnc1<Tuple6<T1, T2, T3, T4, T5, T6>, Tuple6<T1, T2, T3, T4, T5, R>> applyChecked6Tp6(Fnc1<? super T6, ? extends R> f) {
        return Tupler6.applyChecked6(f);
    }

    public static <T1, T2, T3, T4, T5, T6> Prc1<Tuple6<T1, T2, T3, T4, T5, T6>> testChecked1Tp6(Prc1<? super T1> p) {
        return Tupler6.testChecked1(p);
    }

    public static <T1, T2, T3, T4, T5, T6> Prc1<Tuple6<T1, T2, T3, T4, T5, T6>> testChecked2Tp6(Prc1<? super T2> p) {
        return Tupler6.testChecked2(p);
    }

    public static <T1, T2, T3, T4, T5, T6> Prc1<Tuple6<T1, T2, T3, T4, T5, T6>> testChecked3Tp6(Prc1<? super T3> p) {
        return Tupler6.testChecked3(p);
    }

    public static <T1, T2, T3, T4, T5, T6> Prc1<Tuple6<T1, T2, T3, T4, T5, T6>> testChecked4Tp6(Prc1<? super T4> p) {
        return Tupler6.testChecked4(p);
    }

    public static <T1, T2, T3, T4, T5, T6> Prc1<Tuple6<T1, T2, T3, T4, T5, T6>> testChecked5Tp6(Prc1<? super T5> p) {
        return Tupler6.testChecked5(p);
    }

    public static <T1, T2, T3, T4, T5, T6> Prc1<Tuple6<T1, T2, T3, T4, T5, T6>> testChecked6Tp6(Prc1<? super T6> p) {
        return Tupler6.testChecked6(p);
    }

    public static <T1, T2, T3, T4, T5, T6> Csc1<Tuple6<T1, T2, T3, T4, T5, T6>> acceptChecked1Tp6(Csc1<? super T1> c) {
        return Tupler6.acceptChecked1(c);
    }

    public static <T1, T2, T3, T4, T5, T6> Csc1<Tuple6<T1, T2, T3, T4, T5, T6>> acceptChecked2Tp6(Csc1<? super T2> c) {
        return Tupler6.acceptChecked2(c);
    }

    public static <T1, T2, T3, T4, T5, T6> Csc1<Tuple6<T1, T2, T3, T4, T5, T6>> acceptChecked3Tp6(Csc1<? super T3> c) {
        return Tupler6.acceptChecked3(c);
    }

    public static <T1, T2, T3, T4, T5, T6> Csc1<Tuple6<T1, T2, T3, T4, T5, T6>> acceptChecked4Tp6(Csc1<? super T4> c) {
        return Tupler6.acceptChecked4(c);
    }

    public static <T1, T2, T3, T4, T5, T6> Csc1<Tuple6<T1, T2, T3, T4, T5, T6>> acceptChecked5Tp6(Csc1<? super T5> c) {
        return Tupler6.acceptChecked5(c);
    }

    public static <T1, T2, T3, T4, T5, T6> Csc1<Tuple6<T1, T2, T3, T4, T5, T6>> acceptChecked6Tp6(Csc1<? super T6> c) {
        return Tupler6.acceptChecked6(c);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fnc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>, Tuple7<R, T2, T3, T4, T5, T6, T7>> applyChecked1Tp7(Fnc1<? super T1, ? extends R> f) {
        return Tupler7.applyChecked1(f);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fnc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>, Tuple7<T1, R, T3, T4, T5, T6, T7>> applyChecked2Tp7(Fnc1<? super T2, ? extends R> f) {
        return Tupler7.applyChecked2(f);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fnc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>, Tuple7<T1, T2, R, T4, T5, T6, T7>> applyChecked3Tp7(Fnc1<? super T3, ? extends R> f) {
        return Tupler7.applyChecked3(f);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fnc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>, Tuple7<T1, T2, T3, R, T5, T6, T7>> applyChecked4Tp7(Fnc1<? super T4, ? extends R> f) {
        return Tupler7.applyChecked4(f);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fnc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>, Tuple7<T1, T2, T3, T4, R, T6, T7>> applyChecked5Tp7(Fnc1<? super T5, ? extends R> f) {
        return Tupler7.applyChecked5(f);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fnc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>, Tuple7<T1, T2, T3, T4, T5, R, T7>> applyChecked6Tp7(Fnc1<? super T6, ? extends R> f) {
        return Tupler7.applyChecked6(f);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fnc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>, Tuple7<T1, T2, T3, T4, T5, T6, R>> applyChecked7Tp7(Fnc1<? super T7, ? extends R> f) {
        return Tupler7.applyChecked7(f);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> testChecked1Tp7(Prc1<? super T1> p) {
        return Tupler7.testChecked1(p);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> testChecked2Tp7(Prc1<? super T2> p) {
        return Tupler7.testChecked2(p);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> testChecked3Tp7(Prc1<? super T3> p) {
        return Tupler7.testChecked3(p);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> testChecked4Tp7(Prc1<? super T4> p) {
        return Tupler7.testChecked4(p);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> testChecked5Tp7(Prc1<? super T5> p) {
        return Tupler7.testChecked5(p);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> testChecked6Tp7(Prc1<? super T6> p) {
        return Tupler7.testChecked6(p);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> testChecked7Tp7(Prc1<? super T7> p) {
        return Tupler7.testChecked7(p);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Csc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> acceptChecked1Tp7(Csc1<? super T1> c) {
        return Tupler7.acceptChecked1(c);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Csc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> acceptChecked2Tp7(Csc1<? super T2> c) {
        return Tupler7.acceptChecked2(c);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Csc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> acceptChecked3Tp7(Csc1<? super T3> c) {
        return Tupler7.acceptChecked3(c);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Csc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> acceptChecked4Tp7(Csc1<? super T4> c) {
        return Tupler7.acceptChecked4(c);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Csc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> acceptChecked5Tp7(Csc1<? super T5> c) {
        return Tupler7.acceptChecked5(c);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Csc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> acceptChecked6Tp7(Csc1<? super T6> c) {
        return Tupler7.acceptChecked6(c);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Csc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> acceptChecked7Tp7(Csc1<? super T7> c) {
        return Tupler7.acceptChecked7(c);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, Tuple8<R, T2, T3, T4, T5, T6, T7, T8>> applyChecked1Tp8(Fnc1<? super T1, ? extends R> f) {
        return Tupler8.applyChecked1(f);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, Tuple8<T1, R, T3, T4, T5, T6, T7, T8>> applyChecked2Tp8(Fnc1<? super T2, ? extends R> f) {
        return Tupler8.applyChecked2(f);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, Tuple8<T1, T2, R, T4, T5, T6, T7, T8>> applyChecked3Tp8(Fnc1<? super T3, ? extends R> f) {
        return Tupler8.applyChecked3(f);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, Tuple8<T1, T2, T3, R, T5, T6, T7, T8>> applyChecked4Tp8(Fnc1<? super T4, ? extends R> f) {
        return Tupler8.applyChecked4(f);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, Tuple8<T1, T2, T3, T4, R, T6, T7, T8>> applyChecked5Tp8(Fnc1<? super T5, ? extends R> f) {
        return Tupler8.applyChecked5(f);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, Tuple8<T1, T2, T3, T4, T5, R, T7, T8>> applyChecked6Tp8(Fnc1<? super T6, ? extends R> f) {
        return Tupler8.applyChecked6(f);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, Tuple8<T1, T2, T3, T4, T5, T6, R, T8>> applyChecked7Tp8(Fnc1<? super T7, ? extends R> f) {
        return Tupler8.applyChecked7(f);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, Tuple8<T1, T2, T3, T4, T5, T6, T7, R>> applyChecked8Tp8(Fnc1<? super T8, ? extends R> f) {
        return Tupler8.applyChecked8(f);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> testChecked1Tp8(Prc1<? super T1> p) {
        return Tupler8.testChecked1(p);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> testChecked2Tp8(Prc1<? super T2> p) {
        return Tupler8.testChecked2(p);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> testChecked3Tp8(Prc1<? super T3> p) {
        return Tupler8.testChecked3(p);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> testChecked4Tp8(Prc1<? super T4> p) {
        return Tupler8.testChecked4(p);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> testChecked5Tp8(Prc1<? super T5> p) {
        return Tupler8.testChecked5(p);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> testChecked6Tp8(Prc1<? super T6> p) {
        return Tupler8.testChecked6(p);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> testChecked7Tp8(Prc1<? super T7> p) {
        return Tupler8.testChecked7(p);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> testChecked8Tp8(Prc1<? super T8> p) {
        return Tupler8.testChecked8(p);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> acceptChecked1Tp8(Csc1<? super T1> c) {
        return Tupler8.acceptChecked1(c);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> acceptChecked2Tp8(Csc1<? super T2> c) {
        return Tupler8.acceptChecked2(c);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> acceptChecked3Tp8(Csc1<? super T3> c) {
        return Tupler8.acceptChecked3(c);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> acceptChecked4Tp8(Csc1<? super T4> c) {
        return Tupler8.acceptChecked4(c);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> acceptChecked5Tp8(Csc1<? super T5> c) {
        return Tupler8.acceptChecked5(c);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> acceptChecked6Tp8(Csc1<? super T6> c) {
        return Tupler8.acceptChecked6(c);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> acceptChecked7Tp8(Csc1<? super T7> c) {
        return Tupler8.acceptChecked7(c);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> acceptChecked8Tp8(Csc1<? super T8> c) {
        return Tupler8.acceptChecked8(c);
    }

    public static <T1> Tuple1<T1> invert(Tuple1<? super T1> tuple) {
        @SuppressWarnings("unchecked")
        final Tuple1<T1> inverted = Tuple.of((T1) tuple._1());
        return inverted;
    }

    public static <T1, T2> Tuple2<T2, T1> invert(Tuple2<? super T1, ? super T2> tuple) {
        @SuppressWarnings("unchecked")
        final Tuple2<T2, T1> inverted = Tuple.of((T2) tuple._2(), (T1) tuple._1());
        return inverted;
    }

    public static <T1, T2, T3> Tuple3<T3, T2, T1> invert(Tuple3<? super T1, ? super T2, ? super T3> tuple) {
        @SuppressWarnings("unchecked")
        final Tuple3<T3, T2, T1> inverted = Tuple.of((T3) tuple._3(), (T2) tuple._2(), (T1) tuple._1());
        return inverted;
    }

    public static <T1, T2, T3, T4> Tuple4<T4, T3, T2, T1> invert(Tuple4<? super T1, ? super T2, ? super T3, ? super T4> tuple) {
        @SuppressWarnings("unchecked")
        final Tuple4<T4, T3, T2, T1> inverted = Tuple.of((T4) tuple._4(), (T3) tuple._3(), (T2) tuple._2(), (T1) tuple._1());
        return inverted;
    }

    public static <T1, T2, T3, T4, T5> Tuple5<T5, T4, T3, T2, T1> invert(Tuple5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> tuple) {
        @SuppressWarnings("unchecked")
        final Tuple5<T5, T4, T3, T2, T1> inverted = Tuple.of((T5) tuple._5(), (T4) tuple._4(), (T3) tuple._3(), (T2) tuple._2(), (T1) tuple._1());
        return inverted;
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T6, T5, T4, T3, T2, T1> invert(Tuple6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> tuple) {
        @SuppressWarnings("unchecked")
        final Tuple6<T6, T5, T4, T3, T2, T1> inverted = Tuple.of((T6) tuple._6(), (T5) tuple._5(), (T4) tuple._4(), (T3) tuple._3(), (T2) tuple._2(), (T1) tuple._1());
        return inverted;
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T7, T6, T5, T4, T3, T2, T1> invert(Tuple7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> tuple) {
        @SuppressWarnings("unchecked")
        final Tuple7<T7, T6, T5, T4, T3, T2, T1> inverted = Tuple.of((T7) tuple._7(), (T6) tuple._6(), (T5) tuple._5(), (T4) tuple._4(), (T3) tuple._3(), (T2) tuple._2(), (T1) tuple._1());
        return inverted;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T8, T7, T6, T5, T4, T3, T2, T1> invert(Tuple8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> tuple) {
        @SuppressWarnings("unchecked")
        final Tuple8<T8, T7, T6, T5, T4, T3, T2, T1> inverted = Tuple.of((T8) tuple._8(), (T7) tuple._7(), (T6) tuple._6(), (T5) tuple._5(), (T4) tuple._4(), (T3) tuple._3(), (T2) tuple._2(), (T1) tuple._1());
        return inverted;
    }

    public static <T1> Tuple0 drop(Tuple1<? extends T1> tuple) {
        return Tuple.empty();
    }

    public static <T1, T2> Tuple1<T2> dropLt(Tuple2<? extends T1, ? extends T2> tuple) {
        return Tuple.of(tuple._2());
    }

    public static <T1, T2> Tuple1<T1> dropRt(Tuple2<? extends T1, ? extends T2> tuple) {
        return Tuple.of(tuple._1());
    }

    public static <T1, T2, T3> Tuple2<T2, T3> dropLt1(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple) {
        return Tuple.of(tuple._2(), tuple._3());
    }

    public static <T1, T2, T3> Tuple2<T1, T2> dropRt1(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple) {
        return Tuple.of(tuple._1(), tuple._2());
    }

    public static <T1, T2, T3> Tuple1<T3> dropLt2(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple) {
        return Tuple.of(tuple._3());
    }

    public static <T1, T2, T3> Tuple1<T1> dropRt2(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple) {
        return Tuple.of(tuple._1());
    }

    public static <T1, T2, T3, T4> Tuple3<T2, T3, T4> dropLt1(Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4> tuple) {
        return Tuple.of(tuple._2(), tuple._3(), tuple._4());
    }

    public static <T1, T2, T3, T4> Tuple3<T1, T2, T3> dropRt1(Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4> tuple) {
        return Tuple.of(tuple._1(), tuple._2(), tuple._3());
    }

    public static <T1, T2, T3, T4> Tuple2<T3, T4> dropLt2(Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4> tuple) {
        return Tuple.of(tuple._3(), tuple._4());
    }

    public static <T1, T2, T3, T4> Tuple2<T1, T2> dropRt2(Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4> tuple) {
        return Tuple.of(tuple._1(), tuple._2());
    }

    public static <T1, T2, T3, T4> Tuple1<T4> dropLt3(Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4> tuple) {
        return Tuple.of(tuple._4());
    }

    public static <T1, T2, T3, T4> Tuple1<T1> dropRt3(Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4> tuple) {
        return Tuple.of(tuple._1());
    }

    public static <T1, T2, T3, T4, T5> Tuple4<T2, T3, T4, T5> dropLt1(Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> tuple) {
        return Tuple.of(tuple._2(), tuple._3(), tuple._4(), tuple._5());
    }

    public static <T1, T2, T3, T4, T5> Tuple4<T1, T2, T3, T4> dropRt1(Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> tuple) {
        return Tuple.of(tuple._1(), tuple._2(), tuple._3(), tuple._4());
    }

    public static <T1, T2, T3, T4, T5> Tuple3<T3, T4, T5> dropLt2(Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> tuple) {
        return Tuple.of(tuple._3(), tuple._4(), tuple._5());
    }

    public static <T1, T2, T3, T4, T5> Tuple3<T1, T2, T3> dropRt2(Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> tuple) {
        return Tuple.of(tuple._1(), tuple._2(), tuple._3());
    }

    public static <T1, T2, T3, T4, T5> Tuple2<T4, T5> dropLt3(Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> tuple) {
        return Tuple.of(tuple._4(), tuple._5());
    }

    public static <T1, T2, T3, T4, T5> Tuple2<T1, T2> dropRt3(Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> tuple) {
        return Tuple.of(tuple._1(), tuple._2());
    }

    public static <T1, T2, T3, T4, T5> Tuple1<T5> dropLt4(Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> tuple) {
        return Tuple.of(tuple._5());
    }

    public static <T1, T2, T3, T4, T5> Tuple1<T1> dropRt4(Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> tuple) {
        return Tuple.of(tuple._1());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple5<T2, T3, T4, T5, T6> dropLt1(Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> tuple) {
        return Tuple.of(tuple._2(), tuple._3(), tuple._4(), tuple._5(), tuple._6());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple5<T1, T2, T3, T4, T5> dropRt1(Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> tuple) {
        return Tuple.of(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple4<T3, T4, T5, T6> dropLt2(Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> tuple) {
        return Tuple.of(tuple._3(), tuple._4(), tuple._5(), tuple._6());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple4<T1, T2, T3, T4> dropRt2(Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> tuple) {
        return Tuple.of(tuple._1(), tuple._2(), tuple._3(), tuple._4());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple3<T4, T5, T6> dropLt3(Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> tuple) {
        return Tuple.of(tuple._4(), tuple._5(), tuple._6());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple3<T1, T2, T3> dropRt3(Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> tuple) {
        return Tuple.of(tuple._1(), tuple._2(), tuple._3());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple2<T5, T6> dropLt4(Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> tuple) {
        return Tuple.of(tuple._5(), tuple._6());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple2<T1, T2> dropRt4(Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> tuple) {
        return Tuple.of(tuple._1(), tuple._2());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple1<T6> dropLt5(Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> tuple) {
        return Tuple.of(tuple._6());
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple1<T1> dropRt5(Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> tuple) {
        return Tuple.of(tuple._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple6<T2, T3, T4, T5, T6, T7> dropLt1(Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> tuple) {
        return Tuple.of(tuple._2(), tuple._3(), tuple._4(), tuple._5(), tuple._6(), tuple._7());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple6<T1, T2, T3, T4, T5, T6> dropRt1(Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> tuple) {
        return Tuple.of(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5(), tuple._6());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple5<T3, T4, T5, T6, T7> dropLt2(Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> tuple) {
        return Tuple.of(tuple._3(), tuple._4(), tuple._5(), tuple._6(), tuple._7());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple5<T1, T2, T3, T4, T5> dropRt2(Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> tuple) {
        return Tuple.of(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple4<T4, T5, T6, T7> dropLt3(Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> tuple) {
        return Tuple.of(tuple._4(), tuple._5(), tuple._6(), tuple._7());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple4<T1, T2, T3, T4> dropRt3(Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> tuple) {
        return Tuple.of(tuple._1(), tuple._2(), tuple._3(), tuple._4());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple3<T5, T6, T7> dropLt4(Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> tuple) {
        return Tuple.of(tuple._5(), tuple._6(), tuple._7());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple3<T1, T2, T3> dropRt4(Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> tuple) {
        return Tuple.of(tuple._1(), tuple._2(), tuple._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple2<T6, T7> dropLt5(Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> tuple) {
        return Tuple.of(tuple._6(), tuple._7());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple2<T1, T2> dropRt5(Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> tuple) {
        return Tuple.of(tuple._1(), tuple._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple1<T7> dropLt6(Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> tuple) {
        return Tuple.of(tuple._7());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple1<T1> dropRt6(Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> tuple) {
        return Tuple.of(tuple._1());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple7<T2, T3, T4, T5, T6, T7, T8> dropLt1(Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8> tuple) {
        return Tuple.of(tuple._2(), tuple._3(), tuple._4(), tuple._5(), tuple._6(), tuple._7(), tuple._8());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple7<T1, T2, T3, T4, T5, T6, T7> dropRt1(Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8> tuple) {
        return Tuple.of(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5(), tuple._6(), tuple._7());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple6<T3, T4, T5, T6, T7, T8> dropLt2(Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8> tuple) {
        return Tuple.of(tuple._3(), tuple._4(), tuple._5(), tuple._6(), tuple._7(), tuple._8());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple6<T1, T2, T3, T4, T5, T6> dropRt2(Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8> tuple) {
        return Tuple.of(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5(), tuple._6());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple5<T4, T5, T6, T7, T8> dropLt3(Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8> tuple) {
        return Tuple.of(tuple._4(), tuple._5(), tuple._6(), tuple._7(), tuple._8());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple5<T1, T2, T3, T4, T5> dropRt3(Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8> tuple) {
        return Tuple.of(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple4<T5, T6, T7, T8> dropLt4(Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8> tuple) {
        return Tuple.of(tuple._5(), tuple._6(), tuple._7(), tuple._8());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple4<T1, T2, T3, T4> dropRt4(Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8> tuple) {
        return Tuple.of(tuple._1(), tuple._2(), tuple._3(), tuple._4());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple3<T6, T7, T8> dropLt5(Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8> tuple) {
        return Tuple.of(tuple._6(), tuple._7(), tuple._8());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple3<T1, T2, T3> dropRt5(Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8> tuple) {
        return Tuple.of(tuple._1(), tuple._2(), tuple._3());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple2<T7, T8> dropLt6(Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8> tuple) {
        return Tuple.of(tuple._7(), tuple._8());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple2<T1, T2> dropRt6(Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8> tuple) {
        return Tuple.of(tuple._1(), tuple._2());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple1<T8> dropLt7(Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8> tuple) {
        return Tuple.of(tuple._8());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple1<T1> dropRt7(Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8> tuple) {
        return Tuple.of(tuple._1());
    }

    public static interface Tupler8 extends Tupler {

        public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, Tuple8<R, T2, T3, T4, T5, T6, T7, T8>> apply1(Fn1<? super T1, ? extends R> f) {
            return tuple -> tuple.map1(f);
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, Tuple8<T1, R, T3, T4, T5, T6, T7, T8>> apply2(Fn1<? super T2, ? extends R> f) {
            return tuple -> tuple.map2(f);
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, Tuple8<T1, T2, R, T4, T5, T6, T7, T8>> apply3(Fn1<? super T3, ? extends R> f) {
            return tuple -> tuple.map3(f);
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, Tuple8<T1, T2, T3, R, T5, T6, T7, T8>> apply4(Fn1<? super T4, ? extends R> f) {
            return tuple -> tuple.map4(f);
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, Tuple8<T1, T2, T3, T4, R, T6, T7, T8>> apply5(Fn1<? super T5, ? extends R> f) {
            return tuple -> tuple.map5(f);
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, Tuple8<T1, T2, T3, T4, T5, R, T7, T8>> apply6(Fn1<? super T6, ? extends R> f) {
            return tuple -> tuple.map6(f);
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, Tuple8<T1, T2, T3, T4, T5, T6, R, T8>> apply7(Fn1<? super T7, ? extends R> f) {
            return tuple -> tuple.map7(f);
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fn1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, Tuple8<T1, T2, T3, T4, T5, T6, T7, R>> apply8(Fn1<? super T8, ? extends R> f) {
            return tuple -> tuple.map8(f);
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> test1(Pr1<? super T1> p) {
            return Pr1.<T1>narrow(p).<T2, T3, T4, T5, T6, T7, T8>ignoring7Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> test2(Pr1<? super T2> p) {
            return Pr1.<T2>narrow(p).<T1>ignoring1Lt().<T3, T4, T5, T6, T7, T8>ignoring6Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> test3(Pr1<? super T3> p) {
            return Pr1.<T3>narrow(p).<T1, T2>ignoring2Lt().<T4, T5, T6, T7, T8>ignoring5Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> test4(Pr1<? super T4> p) {
            return Pr1.<T4>narrow(p).<T1, T2, T3>ignoring3Lt().<T5, T6, T7, T8>ignoring4Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> test5(Pr1<? super T5> p) {
            return Pr1.<T5>narrow(p).<T1, T2, T3, T4>ignoring4Lt().<T6, T7, T8>ignoring3Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> test6(Pr1<? super T6> p) {
            return Pr1.<T6>narrow(p).<T1, T2, T3, T4, T5>ignoring5Lt().<T7, T8>ignoring2Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> test7(Pr1<? super T7> p) {
            return Pr1.<T7>narrow(p).<T1, T2, T3, T4, T5, T6>ignoring6Lt().<T8>ignoring1Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> test8(Pr1<? super T8> p) {
            return Pr1.<T8>narrow(p).<T1, T2, T3, T4, T5, T6, T7>ignoring7Lt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> accept1(Cs1<? super T1> c) {
            return Cs1.<T1>narrow(c).<T2, T3, T4, T5, T6, T7, T8>ignoring7Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> accept2(Cs1<? super T2> c) {
            return Cs1.<T2>narrow(c).<T1>ignoring1Lt().<T3, T4, T5, T6, T7, T8>ignoring6Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> accept3(Cs1<? super T3> c) {
            return Cs1.<T3>narrow(c).<T1, T2>ignoring2Lt().<T4, T5, T6, T7, T8>ignoring5Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> accept4(Cs1<? super T4> c) {
            return Cs1.<T4>narrow(c).<T1, T2, T3>ignoring3Lt().<T5, T6, T7, T8>ignoring4Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> accept5(Cs1<? super T5> c) {
            return Cs1.<T5>narrow(c).<T1, T2, T3, T4>ignoring4Lt().<T6, T7, T8>ignoring3Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> accept6(Cs1<? super T6> c) {
            return Cs1.<T6>narrow(c).<T1, T2, T3, T4, T5>ignoring5Lt().<T7, T8>ignoring2Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> accept7(Cs1<? super T7> c) {
            return Cs1.<T7>narrow(c).<T1, T2, T3, T4, T5, T6>ignoring6Lt().<T8>ignoring1Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8> Cs1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> accept8(Cs1<? super T8> c) {
            return Cs1.<T8>narrow(c).<T1, T2, T3, T4, T5, T6, T7>ignoring7Lt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, Tuple8<R, T2, T3, T4, T5, T6, T7, T8>> applyChecked1(Fnc1<? super T1, ? extends R> f) {
            return tuple -> tuple.map1(f.unchecked());
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, Tuple8<T1, R, T3, T4, T5, T6, T7, T8>> applyChecked2(Fnc1<? super T2, ? extends R> f) {
            return tuple -> tuple.map2(f.unchecked());
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, Tuple8<T1, T2, R, T4, T5, T6, T7, T8>> applyChecked3(Fnc1<? super T3, ? extends R> f) {
            return tuple -> tuple.map3(f.unchecked());
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, Tuple8<T1, T2, T3, R, T5, T6, T7, T8>> applyChecked4(Fnc1<? super T4, ? extends R> f) {
            return tuple -> tuple.map4(f.unchecked());
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, Tuple8<T1, T2, T3, T4, R, T6, T7, T8>> applyChecked5(Fnc1<? super T5, ? extends R> f) {
            return tuple -> tuple.map5(f.unchecked());
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, Tuple8<T1, T2, T3, T4, T5, R, T7, T8>> applyChecked6(Fnc1<? super T6, ? extends R> f) {
            return tuple -> tuple.map6(f.unchecked());
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, Tuple8<T1, T2, T3, T4, T5, T6, R, T8>> applyChecked7(Fnc1<? super T7, ? extends R> f) {
            return tuple -> tuple.map7(f.unchecked());
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, Tuple8<T1, T2, T3, T4, T5, T6, T7, R>> applyChecked8(Fnc1<? super T8, ? extends R> f) {
            return tuple -> tuple.map8(f.unchecked());
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> testChecked1(Prc1<? super T1> p) {
            return Prc1.<T1>narrow(p).<T2, T3, T4, T5, T6, T7, T8>ignoring7Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> testChecked2(Prc1<? super T2> p) {
            return Prc1.<T2>narrow(p).<T1>ignoring1Lt().<T3, T4, T5, T6, T7, T8>ignoring6Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> testChecked3(Prc1<? super T3> p) {
            return Prc1.<T3>narrow(p).<T1, T2>ignoring2Lt().<T4, T5, T6, T7, T8>ignoring5Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> testChecked4(Prc1<? super T4> p) {
            return Prc1.<T4>narrow(p).<T1, T2, T3>ignoring3Lt().<T5, T6, T7, T8>ignoring4Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> testChecked5(Prc1<? super T5> p) {
            return Prc1.<T5>narrow(p).<T1, T2, T3, T4>ignoring4Lt().<T6, T7, T8>ignoring3Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> testChecked6(Prc1<? super T6> p) {
            return Prc1.<T6>narrow(p).<T1, T2, T3, T4, T5>ignoring5Lt().<T7, T8>ignoring2Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> testChecked7(Prc1<? super T7> p) {
            return Prc1.<T7>narrow(p).<T1, T2, T3, T4, T5, T6>ignoring6Lt().<T8>ignoring1Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> testChecked8(Prc1<? super T8> p) {
            return Prc1.<T8>narrow(p).<T1, T2, T3, T4, T5, T6, T7>ignoring7Lt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> acceptChecked1(Csc1<? super T1> c) {
            return Csc1.<T1>narrow(c).<T2, T3, T4, T5, T6, T7, T8>ignoring7Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> acceptChecked2(Csc1<? super T2> c) {
            return Csc1.<T2>narrow(c).<T1>ignoring1Lt().<T3, T4, T5, T6, T7, T8>ignoring6Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> acceptChecked3(Csc1<? super T3> c) {
            return Csc1.<T3>narrow(c).<T1, T2>ignoring2Lt().<T4, T5, T6, T7, T8>ignoring5Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> acceptChecked4(Csc1<? super T4> c) {
            return Csc1.<T4>narrow(c).<T1, T2, T3>ignoring3Lt().<T5, T6, T7, T8>ignoring4Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> acceptChecked5(Csc1<? super T5> c) {
            return Csc1.<T5>narrow(c).<T1, T2, T3, T4>ignoring4Lt().<T6, T7, T8>ignoring3Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> acceptChecked6(Csc1<? super T6> c) {
            return Csc1.<T6>narrow(c).<T1, T2, T3, T4, T5>ignoring5Lt().<T7, T8>ignoring2Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> acceptChecked7(Csc1<? super T7> c) {
            return Csc1.<T7>narrow(c).<T1, T2, T3, T4, T5, T6>ignoring6Lt().<T8>ignoring1Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> acceptChecked8(Csc1<? super T8> c) {
            return Csc1.<T8>narrow(c).<T1, T2, T3, T4, T5, T6, T7>ignoring7Lt().tupled();
        }

    }

    public static interface Tupler7 extends Tupler {

        public static <T1, T2, T3, T4, T5, T6, T7, R> Fn1<Tuple7<T1, T2, T3, T4, T5, T6, T7>, Tuple7<R, T2, T3, T4, T5, T6, T7>> apply1(Fn1<? super T1, ? extends R> f) {
            return tuple -> tuple.map1(f);
        }

        public static <T1, T2, T3, T4, T5, T6, T7, R> Fn1<Tuple7<T1, T2, T3, T4, T5, T6, T7>, Tuple7<T1, R, T3, T4, T5, T6, T7>> apply2(Fn1<? super T2, ? extends R> f) {
            return tuple -> tuple.map2(f);
        }

        public static <T1, T2, T3, T4, T5, T6, T7, R> Fn1<Tuple7<T1, T2, T3, T4, T5, T6, T7>, Tuple7<T1, T2, R, T4, T5, T6, T7>> apply3(Fn1<? super T3, ? extends R> f) {
            return tuple -> tuple.map3(f);
        }

        public static <T1, T2, T3, T4, T5, T6, T7, R> Fn1<Tuple7<T1, T2, T3, T4, T5, T6, T7>, Tuple7<T1, T2, T3, R, T5, T6, T7>> apply4(Fn1<? super T4, ? extends R> f) {
            return tuple -> tuple.map4(f);
        }

        public static <T1, T2, T3, T4, T5, T6, T7, R> Fn1<Tuple7<T1, T2, T3, T4, T5, T6, T7>, Tuple7<T1, T2, T3, T4, R, T6, T7>> apply5(Fn1<? super T5, ? extends R> f) {
            return tuple -> tuple.map5(f);
        }

        public static <T1, T2, T3, T4, T5, T6, T7, R> Fn1<Tuple7<T1, T2, T3, T4, T5, T6, T7>, Tuple7<T1, T2, T3, T4, T5, R, T7>> apply6(Fn1<? super T6, ? extends R> f) {
            return tuple -> tuple.map6(f);
        }

        public static <T1, T2, T3, T4, T5, T6, T7, R> Fn1<Tuple7<T1, T2, T3, T4, T5, T6, T7>, Tuple7<T1, T2, T3, T4, T5, T6, R>> apply7(Fn1<? super T7, ? extends R> f) {
            return tuple -> tuple.map7(f);
        }

        public static <T1, T2, T3, T4, T5, T6, T7> Pr1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> test1(Pr1<? super T1> p) {
            return Pr1.<T1>narrow(p).<T2, T3, T4, T5, T6, T7>ignoring6Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7> Pr1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> test2(Pr1<? super T2> p) {
            return Pr1.<T2>narrow(p).<T1>ignoring1Lt().<T3, T4, T5, T6, T7>ignoring5Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7> Pr1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> test3(Pr1<? super T3> p) {
            return Pr1.<T3>narrow(p).<T1, T2>ignoring2Lt().<T4, T5, T6, T7>ignoring4Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7> Pr1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> test4(Pr1<? super T4> p) {
            return Pr1.<T4>narrow(p).<T1, T2, T3>ignoring3Lt().<T5, T6, T7>ignoring3Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7> Pr1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> test5(Pr1<? super T5> p) {
            return Pr1.<T5>narrow(p).<T1, T2, T3, T4>ignoring4Lt().<T6, T7>ignoring2Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7> Pr1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> test6(Pr1<? super T6> p) {
            return Pr1.<T6>narrow(p).<T1, T2, T3, T4, T5>ignoring5Lt().<T7>ignoring1Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7> Pr1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> test7(Pr1<? super T7> p) {
            return Pr1.<T7>narrow(p).<T1, T2, T3, T4, T5, T6>ignoring6Lt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7> Cs1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> accept1(Cs1<? super T1> c) {
            return Cs1.<T1>narrow(c).<T2, T3, T4, T5, T6, T7>ignoring6Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7> Cs1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> accept2(Cs1<? super T2> c) {
            return Cs1.<T2>narrow(c).<T1>ignoring1Lt().<T3, T4, T5, T6, T7>ignoring5Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7> Cs1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> accept3(Cs1<? super T3> c) {
            return Cs1.<T3>narrow(c).<T1, T2>ignoring2Lt().<T4, T5, T6, T7>ignoring4Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7> Cs1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> accept4(Cs1<? super T4> c) {
            return Cs1.<T4>narrow(c).<T1, T2, T3>ignoring3Lt().<T5, T6, T7>ignoring3Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7> Cs1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> accept5(Cs1<? super T5> c) {
            return Cs1.<T5>narrow(c).<T1, T2, T3, T4>ignoring4Lt().<T6, T7>ignoring2Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7> Cs1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> accept6(Cs1<? super T6> c) {
            return Cs1.<T6>narrow(c).<T1, T2, T3, T4, T5>ignoring5Lt().<T7>ignoring1Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7> Cs1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> accept7(Cs1<? super T7> c) {
            return Cs1.<T7>narrow(c).<T1, T2, T3, T4, T5, T6>ignoring6Lt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7, R> Fnc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>, Tuple7<R, T2, T3, T4, T5, T6, T7>> applyChecked1(Fnc1<? super T1, ? extends R> f) {
            return tuple -> tuple.map1(f.unchecked());
        }

        public static <T1, T2, T3, T4, T5, T6, T7, R> Fnc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>, Tuple7<T1, R, T3, T4, T5, T6, T7>> applyChecked2(Fnc1<? super T2, ? extends R> f) {
            return tuple -> tuple.map2(f.unchecked());
        }

        public static <T1, T2, T3, T4, T5, T6, T7, R> Fnc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>, Tuple7<T1, T2, R, T4, T5, T6, T7>> applyChecked3(Fnc1<? super T3, ? extends R> f) {
            return tuple -> tuple.map3(f.unchecked());
        }

        public static <T1, T2, T3, T4, T5, T6, T7, R> Fnc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>, Tuple7<T1, T2, T3, R, T5, T6, T7>> applyChecked4(Fnc1<? super T4, ? extends R> f) {
            return tuple -> tuple.map4(f.unchecked());
        }

        public static <T1, T2, T3, T4, T5, T6, T7, R> Fnc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>, Tuple7<T1, T2, T3, T4, R, T6, T7>> applyChecked5(Fnc1<? super T5, ? extends R> f) {
            return tuple -> tuple.map5(f.unchecked());
        }

        public static <T1, T2, T3, T4, T5, T6, T7, R> Fnc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>, Tuple7<T1, T2, T3, T4, T5, R, T7>> applyChecked6(Fnc1<? super T6, ? extends R> f) {
            return tuple -> tuple.map6(f.unchecked());
        }

        public static <T1, T2, T3, T4, T5, T6, T7, R> Fnc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>, Tuple7<T1, T2, T3, T4, T5, T6, R>> applyChecked7(Fnc1<? super T7, ? extends R> f) {
            return tuple -> tuple.map7(f.unchecked());
        }

        public static <T1, T2, T3, T4, T5, T6, T7> Prc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> testChecked1(Prc1<? super T1> p) {
            return Prc1.<T1>narrow(p).<T2, T3, T4, T5, T6, T7>ignoring6Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7> Prc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> testChecked2(Prc1<? super T2> p) {
            return Prc1.<T2>narrow(p).<T1>ignoring1Lt().<T3, T4, T5, T6, T7>ignoring5Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7> Prc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> testChecked3(Prc1<? super T3> p) {
            return Prc1.<T3>narrow(p).<T1, T2>ignoring2Lt().<T4, T5, T6, T7>ignoring4Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7> Prc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> testChecked4(Prc1<? super T4> p) {
            return Prc1.<T4>narrow(p).<T1, T2, T3>ignoring3Lt().<T5, T6, T7>ignoring3Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7> Prc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> testChecked5(Prc1<? super T5> p) {
            return Prc1.<T5>narrow(p).<T1, T2, T3, T4>ignoring4Lt().<T6, T7>ignoring2Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7> Prc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> testChecked6(Prc1<? super T6> p) {
            return Prc1.<T6>narrow(p).<T1, T2, T3, T4, T5>ignoring5Lt().<T7>ignoring1Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7> Prc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> testChecked7(Prc1<? super T7> p) {
            return Prc1.<T7>narrow(p).<T1, T2, T3, T4, T5, T6>ignoring6Lt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7> Csc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> acceptChecked1(Csc1<? super T1> c) {
            return Csc1.<T1>narrow(c).<T2, T3, T4, T5, T6, T7>ignoring6Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7> Csc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> acceptChecked2(Csc1<? super T2> c) {
            return Csc1.<T2>narrow(c).<T1>ignoring1Lt().<T3, T4, T5, T6, T7>ignoring5Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7> Csc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> acceptChecked3(Csc1<? super T3> c) {
            return Csc1.<T3>narrow(c).<T1, T2>ignoring2Lt().<T4, T5, T6, T7>ignoring4Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7> Csc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> acceptChecked4(Csc1<? super T4> c) {
            return Csc1.<T4>narrow(c).<T1, T2, T3>ignoring3Lt().<T5, T6, T7>ignoring3Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7> Csc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> acceptChecked5(Csc1<? super T5> c) {
            return Csc1.<T5>narrow(c).<T1, T2, T3, T4>ignoring4Lt().<T6, T7>ignoring2Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7> Csc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> acceptChecked6(Csc1<? super T6> c) {
            return Csc1.<T6>narrow(c).<T1, T2, T3, T4, T5>ignoring5Lt().<T7>ignoring1Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, T7> Csc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> acceptChecked7(Csc1<? super T7> c) {
            return Csc1.<T7>narrow(c).<T1, T2, T3, T4, T5, T6>ignoring6Lt().tupled();
        }

    }

    public static interface Tupler6 extends Tupler {

        public static <T1, T2, T3, T4, T5, T6, R> Fn1<Tuple6<T1, T2, T3, T4, T5, T6>, Tuple6<R, T2, T3, T4, T5, T6>> apply1(Fn1<? super T1, ? extends R> f) {
            return tuple -> tuple.map1(f);
        }

        public static <T1, T2, T3, T4, T5, T6, R> Fn1<Tuple6<T1, T2, T3, T4, T5, T6>, Tuple6<T1, R, T3, T4, T5, T6>> apply2(Fn1<? super T2, ? extends R> f) {
            return tuple -> tuple.map2(f);
        }

        public static <T1, T2, T3, T4, T5, T6, R> Fn1<Tuple6<T1, T2, T3, T4, T5, T6>, Tuple6<T1, T2, R, T4, T5, T6>> apply3(Fn1<? super T3, ? extends R> f) {
            return tuple -> tuple.map3(f);
        }

        public static <T1, T2, T3, T4, T5, T6, R> Fn1<Tuple6<T1, T2, T3, T4, T5, T6>, Tuple6<T1, T2, T3, R, T5, T6>> apply4(Fn1<? super T4, ? extends R> f) {
            return tuple -> tuple.map4(f);
        }

        public static <T1, T2, T3, T4, T5, T6, R> Fn1<Tuple6<T1, T2, T3, T4, T5, T6>, Tuple6<T1, T2, T3, T4, R, T6>> apply5(Fn1<? super T5, ? extends R> f) {
            return tuple -> tuple.map5(f);
        }

        public static <T1, T2, T3, T4, T5, T6, R> Fn1<Tuple6<T1, T2, T3, T4, T5, T6>, Tuple6<T1, T2, T3, T4, T5, R>> apply6(Fn1<? super T6, ? extends R> f) {
            return tuple -> tuple.map6(f);
        }

        public static <T1, T2, T3, T4, T5, T6> Pr1<Tuple6<T1, T2, T3, T4, T5, T6>> test1(Pr1<? super T1> p) {
            return Pr1.<T1>narrow(p).<T2, T3, T4, T5, T6>ignoring5Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6> Pr1<Tuple6<T1, T2, T3, T4, T5, T6>> test2(Pr1<? super T2> p) {
            return Pr1.<T2>narrow(p).<T1>ignoring1Lt().<T3, T4, T5, T6>ignoring4Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6> Pr1<Tuple6<T1, T2, T3, T4, T5, T6>> test3(Pr1<? super T3> p) {
            return Pr1.<T3>narrow(p).<T1, T2>ignoring2Lt().<T4, T5, T6>ignoring3Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6> Pr1<Tuple6<T1, T2, T3, T4, T5, T6>> test4(Pr1<? super T4> p) {
            return Pr1.<T4>narrow(p).<T1, T2, T3>ignoring3Lt().<T5, T6>ignoring2Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6> Pr1<Tuple6<T1, T2, T3, T4, T5, T6>> test5(Pr1<? super T5> p) {
            return Pr1.<T5>narrow(p).<T1, T2, T3, T4>ignoring4Lt().<T6>ignoring1Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6> Pr1<Tuple6<T1, T2, T3, T4, T5, T6>> test6(Pr1<? super T6> p) {
            return Pr1.<T6>narrow(p).<T1, T2, T3, T4, T5>ignoring5Lt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6> Cs1<Tuple6<T1, T2, T3, T4, T5, T6>> accept1(Cs1<? super T1> c) {
            return Cs1.<T1>narrow(c).<T2, T3, T4, T5, T6>ignoring5Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6> Cs1<Tuple6<T1, T2, T3, T4, T5, T6>> accept2(Cs1<? super T2> c) {
            return Cs1.<T2>narrow(c).<T1>ignoring1Lt().<T3, T4, T5, T6>ignoring4Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6> Cs1<Tuple6<T1, T2, T3, T4, T5, T6>> accept3(Cs1<? super T3> c) {
            return Cs1.<T3>narrow(c).<T1, T2>ignoring2Lt().<T4, T5, T6>ignoring3Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6> Cs1<Tuple6<T1, T2, T3, T4, T5, T6>> accept4(Cs1<? super T4> c) {
            return Cs1.<T4>narrow(c).<T1, T2, T3>ignoring3Lt().<T5, T6>ignoring2Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6> Cs1<Tuple6<T1, T2, T3, T4, T5, T6>> accept5(Cs1<? super T5> c) {
            return Cs1.<T5>narrow(c).<T1, T2, T3, T4>ignoring4Lt().<T6>ignoring1Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6> Cs1<Tuple6<T1, T2, T3, T4, T5, T6>> accept6(Cs1<? super T6> c) {
            return Cs1.<T6>narrow(c).<T1, T2, T3, T4, T5>ignoring5Lt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6, R> Fnc1<Tuple6<T1, T2, T3, T4, T5, T6>, Tuple6<R, T2, T3, T4, T5, T6>> applyChecked1(Fnc1<? super T1, ? extends R> f) {
            return tuple -> tuple.map1(f.unchecked());
        }

        public static <T1, T2, T3, T4, T5, T6, R> Fnc1<Tuple6<T1, T2, T3, T4, T5, T6>, Tuple6<T1, R, T3, T4, T5, T6>> applyChecked2(Fnc1<? super T2, ? extends R> f) {
            return tuple -> tuple.map2(f.unchecked());
        }

        public static <T1, T2, T3, T4, T5, T6, R> Fnc1<Tuple6<T1, T2, T3, T4, T5, T6>, Tuple6<T1, T2, R, T4, T5, T6>> applyChecked3(Fnc1<? super T3, ? extends R> f) {
            return tuple -> tuple.map3(f.unchecked());
        }

        public static <T1, T2, T3, T4, T5, T6, R> Fnc1<Tuple6<T1, T2, T3, T4, T5, T6>, Tuple6<T1, T2, T3, R, T5, T6>> applyChecked4(Fnc1<? super T4, ? extends R> f) {
            return tuple -> tuple.map4(f.unchecked());
        }

        public static <T1, T2, T3, T4, T5, T6, R> Fnc1<Tuple6<T1, T2, T3, T4, T5, T6>, Tuple6<T1, T2, T3, T4, R, T6>> applyChecked5(Fnc1<? super T5, ? extends R> f) {
            return tuple -> tuple.map5(f.unchecked());
        }

        public static <T1, T2, T3, T4, T5, T6, R> Fnc1<Tuple6<T1, T2, T3, T4, T5, T6>, Tuple6<T1, T2, T3, T4, T5, R>> applyChecked6(Fnc1<? super T6, ? extends R> f) {
            return tuple -> tuple.map6(f.unchecked());
        }

        public static <T1, T2, T3, T4, T5, T6> Prc1<Tuple6<T1, T2, T3, T4, T5, T6>> testChecked1(Prc1<? super T1> p) {
            return Prc1.<T1>narrow(p).<T2, T3, T4, T5, T6>ignoring5Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6> Prc1<Tuple6<T1, T2, T3, T4, T5, T6>> testChecked2(Prc1<? super T2> p) {
            return Prc1.<T2>narrow(p).<T1>ignoring1Lt().<T3, T4, T5, T6>ignoring4Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6> Prc1<Tuple6<T1, T2, T3, T4, T5, T6>> testChecked3(Prc1<? super T3> p) {
            return Prc1.<T3>narrow(p).<T1, T2>ignoring2Lt().<T4, T5, T6>ignoring3Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6> Prc1<Tuple6<T1, T2, T3, T4, T5, T6>> testChecked4(Prc1<? super T4> p) {
            return Prc1.<T4>narrow(p).<T1, T2, T3>ignoring3Lt().<T5, T6>ignoring2Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6> Prc1<Tuple6<T1, T2, T3, T4, T5, T6>> testChecked5(Prc1<? super T5> p) {
            return Prc1.<T5>narrow(p).<T1, T2, T3, T4>ignoring4Lt().<T6>ignoring1Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6> Prc1<Tuple6<T1, T2, T3, T4, T5, T6>> testChecked6(Prc1<? super T6> p) {
            return Prc1.<T6>narrow(p).<T1, T2, T3, T4, T5>ignoring5Lt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6> Csc1<Tuple6<T1, T2, T3, T4, T5, T6>> acceptChecked1(Csc1<? super T1> c) {
            return Csc1.<T1>narrow(c).<T2, T3, T4, T5, T6>ignoring5Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6> Csc1<Tuple6<T1, T2, T3, T4, T5, T6>> acceptChecked2(Csc1<? super T2> c) {
            return Csc1.<T2>narrow(c).<T1>ignoring1Lt().<T3, T4, T5, T6>ignoring4Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6> Csc1<Tuple6<T1, T2, T3, T4, T5, T6>> acceptChecked3(Csc1<? super T3> c) {
            return Csc1.<T3>narrow(c).<T1, T2>ignoring2Lt().<T4, T5, T6>ignoring3Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6> Csc1<Tuple6<T1, T2, T3, T4, T5, T6>> acceptChecked4(Csc1<? super T4> c) {
            return Csc1.<T4>narrow(c).<T1, T2, T3>ignoring3Lt().<T5, T6>ignoring2Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6> Csc1<Tuple6<T1, T2, T3, T4, T5, T6>> acceptChecked5(Csc1<? super T5> c) {
            return Csc1.<T5>narrow(c).<T1, T2, T3, T4>ignoring4Lt().<T6>ignoring1Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5, T6> Csc1<Tuple6<T1, T2, T3, T4, T5, T6>> acceptChecked6(Csc1<? super T6> c) {
            return Csc1.<T6>narrow(c).<T1, T2, T3, T4, T5>ignoring5Lt().tupled();
        }

    }

    public static interface Tupler5 extends Tupler {

        public static <T1, T2, T3, T4, T5, R> Fn1<Tuple5<T1, T2, T3, T4, T5>, Tuple5<R, T2, T3, T4, T5>> apply1(Fn1<? super T1, ? extends R> f) {
            return tuple -> tuple.map1(f);
        }

        public static <T1, T2, T3, T4, T5, R> Fn1<Tuple5<T1, T2, T3, T4, T5>, Tuple5<T1, R, T3, T4, T5>> apply2(Fn1<? super T2, ? extends R> f) {
            return tuple -> tuple.map2(f);
        }

        public static <T1, T2, T3, T4, T5, R> Fn1<Tuple5<T1, T2, T3, T4, T5>, Tuple5<T1, T2, R, T4, T5>> apply3(Fn1<? super T3, ? extends R> f) {
            return tuple -> tuple.map3(f);
        }

        public static <T1, T2, T3, T4, T5, R> Fn1<Tuple5<T1, T2, T3, T4, T5>, Tuple5<T1, T2, T3, R, T5>> apply4(Fn1<? super T4, ? extends R> f) {
            return tuple -> tuple.map4(f);
        }

        public static <T1, T2, T3, T4, T5, R> Fn1<Tuple5<T1, T2, T3, T4, T5>, Tuple5<T1, T2, T3, T4, R>> apply5(Fn1<? super T5, ? extends R> f) {
            return tuple -> tuple.map5(f);
        }

        public static <T1, T2, T3, T4, T5> Pr1<Tuple5<T1, T2, T3, T4, T5>> test1(Pr1<? super T1> p) {
            return Pr1.<T1>narrow(p).<T2, T3, T4, T5>ignoring4Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5> Pr1<Tuple5<T1, T2, T3, T4, T5>> test2(Pr1<? super T2> p) {
            return Pr1.<T2>narrow(p).<T1>ignoring1Lt().<T3, T4, T5>ignoring3Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5> Pr1<Tuple5<T1, T2, T3, T4, T5>> test3(Pr1<? super T3> p) {
            return Pr1.<T3>narrow(p).<T1, T2>ignoring2Lt().<T4, T5>ignoring2Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5> Pr1<Tuple5<T1, T2, T3, T4, T5>> test4(Pr1<? super T4> p) {
            return Pr1.<T4>narrow(p).<T1, T2, T3>ignoring3Lt().<T5>ignoring1Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5> Pr1<Tuple5<T1, T2, T3, T4, T5>> test5(Pr1<? super T5> p) {
            return Pr1.<T5>narrow(p).<T1, T2, T3, T4>ignoring4Lt().tupled();
        }

        public static <T1, T2, T3, T4, T5> Cs1<Tuple5<T1, T2, T3, T4, T5>> accept1(Cs1<? super T1> c) {
            return Cs1.<T1>narrow(c).<T2, T3, T4, T5>ignoring4Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5> Cs1<Tuple5<T1, T2, T3, T4, T5>> accept2(Cs1<? super T2> c) {
            return Cs1.<T2>narrow(c).<T1>ignoring1Lt().<T3, T4, T5>ignoring3Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5> Cs1<Tuple5<T1, T2, T3, T4, T5>> accept3(Cs1<? super T3> c) {
            return Cs1.<T3>narrow(c).<T1, T2>ignoring2Lt().<T4, T5>ignoring2Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5> Cs1<Tuple5<T1, T2, T3, T4, T5>> accept4(Cs1<? super T4> c) {
            return Cs1.<T4>narrow(c).<T1, T2, T3>ignoring3Lt().<T5>ignoring1Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5> Cs1<Tuple5<T1, T2, T3, T4, T5>> accept5(Cs1<? super T5> c) {
            return Cs1.<T5>narrow(c).<T1, T2, T3, T4>ignoring4Lt().tupled();
        }

        public static <T1, T2, T3, T4, T5, R> Fnc1<Tuple5<T1, T2, T3, T4, T5>, Tuple5<R, T2, T3, T4, T5>> applyChecked1(Fnc1<? super T1, ? extends R> f) {
            return tuple -> tuple.map1(f.unchecked());
        }

        public static <T1, T2, T3, T4, T5, R> Fnc1<Tuple5<T1, T2, T3, T4, T5>, Tuple5<T1, R, T3, T4, T5>> applyChecked2(Fnc1<? super T2, ? extends R> f) {
            return tuple -> tuple.map2(f.unchecked());
        }

        public static <T1, T2, T3, T4, T5, R> Fnc1<Tuple5<T1, T2, T3, T4, T5>, Tuple5<T1, T2, R, T4, T5>> applyChecked3(Fnc1<? super T3, ? extends R> f) {
            return tuple -> tuple.map3(f.unchecked());
        }

        public static <T1, T2, T3, T4, T5, R> Fnc1<Tuple5<T1, T2, T3, T4, T5>, Tuple5<T1, T2, T3, R, T5>> applyChecked4(Fnc1<? super T4, ? extends R> f) {
            return tuple -> tuple.map4(f.unchecked());
        }

        public static <T1, T2, T3, T4, T5, R> Fnc1<Tuple5<T1, T2, T3, T4, T5>, Tuple5<T1, T2, T3, T4, R>> applyChecked5(Fnc1<? super T5, ? extends R> f) {
            return tuple -> tuple.map5(f.unchecked());
        }

        public static <T1, T2, T3, T4, T5> Prc1<Tuple5<T1, T2, T3, T4, T5>> testChecked1(Prc1<? super T1> p) {
            return Prc1.<T1>narrow(p).<T2, T3, T4, T5>ignoring4Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5> Prc1<Tuple5<T1, T2, T3, T4, T5>> testChecked2(Prc1<? super T2> p) {
            return Prc1.<T2>narrow(p).<T1>ignoring1Lt().<T3, T4, T5>ignoring3Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5> Prc1<Tuple5<T1, T2, T3, T4, T5>> testChecked3(Prc1<? super T3> p) {
            return Prc1.<T3>narrow(p).<T1, T2>ignoring2Lt().<T4, T5>ignoring2Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5> Prc1<Tuple5<T1, T2, T3, T4, T5>> testChecked4(Prc1<? super T4> p) {
            return Prc1.<T4>narrow(p).<T1, T2, T3>ignoring3Lt().<T5>ignoring1Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5> Prc1<Tuple5<T1, T2, T3, T4, T5>> testChecked5(Prc1<? super T5> p) {
            return Prc1.<T5>narrow(p).<T1, T2, T3, T4>ignoring4Lt().tupled();
        }

        public static <T1, T2, T3, T4, T5> Csc1<Tuple5<T1, T2, T3, T4, T5>> acceptChecked1(Csc1<? super T1> c) {
            return Csc1.<T1>narrow(c).<T2, T3, T4, T5>ignoring4Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5> Csc1<Tuple5<T1, T2, T3, T4, T5>> acceptChecked2(Csc1<? super T2> c) {
            return Csc1.<T2>narrow(c).<T1>ignoring1Lt().<T3, T4, T5>ignoring3Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5> Csc1<Tuple5<T1, T2, T3, T4, T5>> acceptChecked3(Csc1<? super T3> c) {
            return Csc1.<T3>narrow(c).<T1, T2>ignoring2Lt().<T4, T5>ignoring2Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5> Csc1<Tuple5<T1, T2, T3, T4, T5>> acceptChecked4(Csc1<? super T4> c) {
            return Csc1.<T4>narrow(c).<T1, T2, T3>ignoring3Lt().<T5>ignoring1Rt().tupled();
        }

        public static <T1, T2, T3, T4, T5> Csc1<Tuple5<T1, T2, T3, T4, T5>> acceptChecked5(Csc1<? super T5> c) {
            return Csc1.<T5>narrow(c).<T1, T2, T3, T4>ignoring4Lt().tupled();
        }

    }

    public static interface Tupler4 extends Tupler {

        public static <T1, T2, T3, T4, R> Fn1<Tuple4<T1, T2, T3, T4>, Tuple4<R, T2, T3, T4>> apply1(Fn1<? super T1, ? extends R> f) {
            return tuple -> tuple.map1(f);
        }

        public static <T1, T2, T3, T4, R> Fn1<Tuple4<T1, T2, T3, T4>, Tuple4<T1, R, T3, T4>> apply2(Fn1<? super T2, ? extends R> f) {
            return tuple -> tuple.map2(f);
        }

        public static <T1, T2, T3, T4, R> Fn1<Tuple4<T1, T2, T3, T4>, Tuple4<T1, T2, R, T4>> apply3(Fn1<? super T3, ? extends R> f) {
            return tuple -> tuple.map3(f);
        }

        public static <T1, T2, T3, T4, R> Fn1<Tuple4<T1, T2, T3, T4>, Tuple4<T1, T2, T3, R>> apply4(Fn1<? super T4, ? extends R> f) {
            return tuple -> tuple.map4(f);
        }

        public static <T1, T2, T3, T4> Pr1<Tuple4<T1, T2, T3, T4>> test1(Pr1<? super T1> p) {
            return Pr1.<T1>narrow(p).<T2, T3, T4>ignoring3Rt().tupled();
        }

        public static <T1, T2, T3, T4> Pr1<Tuple4<T1, T2, T3, T4>> test2(Pr1<? super T2> p) {
            return Pr1.<T2>narrow(p).<T1>ignoring1Lt().<T3, T4>ignoring2Rt().tupled();
        }

        public static <T1, T2, T3, T4> Pr1<Tuple4<T1, T2, T3, T4>> test3(Pr1<? super T3> p) {
            return Pr1.<T3>narrow(p).<T1, T2>ignoring2Lt().<T4>ignoring1Rt().tupled();
        }

        public static <T1, T2, T3, T4> Pr1<Tuple4<T1, T2, T3, T4>> test4(Pr1<? super T4> p) {
            return Pr1.<T4>narrow(p).<T1, T2, T3>ignoring3Lt().tupled();
        }

        public static <T1, T2, T3, T4> Cs1<Tuple4<T1, T2, T3, T4>> accept1(Cs1<? super T1> c) {
            return Cs1.<T1>narrow(c).<T2, T3, T4>ignoring3Rt().tupled();
        }

        public static <T1, T2, T3, T4> Cs1<Tuple4<T1, T2, T3, T4>> accept2(Cs1<? super T2> c) {
            return Cs1.<T2>narrow(c).<T1>ignoring1Lt().<T3, T4>ignoring2Rt().tupled();
        }

        public static <T1, T2, T3, T4> Cs1<Tuple4<T1, T2, T3, T4>> accept3(Cs1<? super T3> c) {
            return Cs1.<T3>narrow(c).<T1, T2>ignoring2Lt().<T4>ignoring1Rt().tupled();
        }

        public static <T1, T2, T3, T4> Cs1<Tuple4<T1, T2, T3, T4>> accept4(Cs1<? super T4> c) {
            return Cs1.<T4>narrow(c).<T1, T2, T3>ignoring3Lt().tupled();
        }

        public static <T1, T2, T3, T4, R> Fnc1<Tuple4<T1, T2, T3, T4>, Tuple4<R, T2, T3, T4>> applyChecked1(Fnc1<? super T1, ? extends R> f) {
            return tuple -> tuple.map1(f.unchecked());
        }

        public static <T1, T2, T3, T4, R> Fnc1<Tuple4<T1, T2, T3, T4>, Tuple4<T1, R, T3, T4>> applyChecked2(Fnc1<? super T2, ? extends R> f) {
            return tuple -> tuple.map2(f.unchecked());
        }

        public static <T1, T2, T3, T4, R> Fnc1<Tuple4<T1, T2, T3, T4>, Tuple4<T1, T2, R, T4>> applyChecked3(Fnc1<? super T3, ? extends R> f) {
            return tuple -> tuple.map3(f.unchecked());
        }

        public static <T1, T2, T3, T4, R> Fnc1<Tuple4<T1, T2, T3, T4>, Tuple4<T1, T2, T3, R>> applyChecked4(Fnc1<? super T4, ? extends R> f) {
            return tuple -> tuple.map4(f.unchecked());
        }

        public static <T1, T2, T3, T4> Prc1<Tuple4<T1, T2, T3, T4>> testChecked1(Prc1<? super T1> p) {
            return Prc1.<T1>narrow(p).<T2, T3, T4>ignoring3Rt().tupled();
        }

        public static <T1, T2, T3, T4> Prc1<Tuple4<T1, T2, T3, T4>> testChecked2(Prc1<? super T2> p) {
            return Prc1.<T2>narrow(p).<T1>ignoring1Lt().<T3, T4>ignoring2Rt().tupled();
        }

        public static <T1, T2, T3, T4> Prc1<Tuple4<T1, T2, T3, T4>> testChecked3(Prc1<? super T3> p) {
            return Prc1.<T3>narrow(p).<T1, T2>ignoring2Lt().<T4>ignoring1Rt().tupled();
        }

        public static <T1, T2, T3, T4> Prc1<Tuple4<T1, T2, T3, T4>> testChecked4(Prc1<? super T4> p) {
            return Prc1.<T4>narrow(p).<T1, T2, T3>ignoring3Lt().tupled();
        }

        public static <T1, T2, T3, T4> Csc1<Tuple4<T1, T2, T3, T4>> acceptChecked1(Csc1<? super T1> c) {
            return Csc1.<T1>narrow(c).<T2, T3, T4>ignoring3Rt().tupled();
        }

        public static <T1, T2, T3, T4> Csc1<Tuple4<T1, T2, T3, T4>> acceptChecked2(Csc1<? super T2> c) {
            return Csc1.<T2>narrow(c).<T1>ignoring1Lt().<T3, T4>ignoring2Rt().tupled();
        }

        public static <T1, T2, T3, T4> Csc1<Tuple4<T1, T2, T3, T4>> acceptChecked3(Csc1<? super T3> c) {
            return Csc1.<T3>narrow(c).<T1, T2>ignoring2Lt().<T4>ignoring1Rt().tupled();
        }

        public static <T1, T2, T3, T4> Csc1<Tuple4<T1, T2, T3, T4>> acceptChecked4(Csc1<? super T4> c) {
            return Csc1.<T4>narrow(c).<T1, T2, T3>ignoring3Lt().tupled();
        }

    }

    public static interface Tupler3 extends Tupler {

        public static <T1, T2, T3, R> Fn1<Tuple3<T1, T2, T3>, Tuple3<R, T2, T3>> apply1(Fn1<? super T1, ? extends R> f) {
            return tuple -> tuple.map1(f);
        }

        public static <T1, T2, T3, R> Fn1<Tuple3<T1, T2, T3>, Tuple3<T1, R, T3>> apply2(Fn1<? super T2, ? extends R> f) {
            return tuple -> tuple.map2(f);
        }

        public static <T1, T2, T3, R> Fn1<Tuple3<T1, T2, T3>, Tuple3<T1, T2, R>> apply3(Fn1<? super T3, ? extends R> f) {
            return tuple -> tuple.map3(f);
        }

        public static <T1, T2, T3> Pr1<Tuple3<T1, T2, T3>> test1(Pr1<? super T1> p) {
            return Pr1.<T1>narrow(p).<T2, T3>ignoring2Rt().tupled();
        }

        public static <T1, T2, T3> Pr1<Tuple3<T1, T2, T3>> test2(Pr1<? super T2> p) {
            return Pr1.<T2>narrow(p).<T1>ignoring1Lt().<T3>ignoring1Rt().tupled();
        }

        public static <T1, T2, T3> Pr1<Tuple3<T1, T2, T3>> test3(Pr1<? super T3> p) {
            return Pr1.<T3>narrow(p).<T1, T2>ignoring2Lt().tupled();
        }

        public static <T1, T2, T3> Cs1<Tuple3<T1, T2, T3>> accept1(Cs1<? super T1> c) {
            return Cs1.<T1>narrow(c).<T2, T3>ignoring2Rt().tupled();
        }

        public static <T1, T2, T3> Cs1<Tuple3<T1, T2, T3>> accept2(Cs1<? super T2> c) {
            return Cs1.<T2>narrow(c).<T1>ignoring1Lt().<T3>ignoring1Rt().tupled();
        }

        public static <T1, T2, T3> Cs1<Tuple3<T1, T2, T3>> accept3(Cs1<? super T3> c) {
            return Cs1.<T3>narrow(c).<T1, T2>ignoring2Lt().tupled();
        }

        public static <T1, T2, T3, R> Fnc1<Tuple3<T1, T2, T3>, Tuple3<R, T2, T3>> applyChecked1(Fnc1<? super T1, ? extends R> f) {
            return tuple -> tuple.map1(f.unchecked());
        }

        public static <T1, T2, T3, R> Fnc1<Tuple3<T1, T2, T3>, Tuple3<T1, R, T3>> applyChecked2(Fnc1<? super T2, ? extends R> f) {
            return tuple -> tuple.map2(f.unchecked());
        }

        public static <T1, T2, T3, R> Fnc1<Tuple3<T1, T2, T3>, Tuple3<T1, T2, R>> applyChecked3(Fnc1<? super T3, ? extends R> f) {
            return tuple -> tuple.map3(f.unchecked());
        }

        public static <T1, T2, T3> Prc1<Tuple3<T1, T2, T3>> testChecked1(Prc1<? super T1> p) {
            return Prc1.<T1>narrow(p).<T2, T3>ignoring2Rt().tupled();
        }

        public static <T1, T2, T3> Prc1<Tuple3<T1, T2, T3>> testChecked2(Prc1<? super T2> p) {
            return Prc1.<T2>narrow(p).<T1>ignoring1Lt().<T3>ignoring1Rt().tupled();
        }

        public static <T1, T2, T3> Prc1<Tuple3<T1, T2, T3>> testChecked3(Prc1<? super T3> p) {
            return Prc1.<T3>narrow(p).<T1, T2>ignoring2Lt().tupled();
        }

        public static <T1, T2, T3> Csc1<Tuple3<T1, T2, T3>> acceptChecked1(Csc1<? super T1> c) {
            return Csc1.<T1>narrow(c).<T2, T3>ignoring2Rt().tupled();
        }

        public static <T1, T2, T3> Csc1<Tuple3<T1, T2, T3>> acceptChecked2(Csc1<? super T2> c) {
            return Csc1.<T2>narrow(c).<T1>ignoring1Lt().<T3>ignoring1Rt().tupled();
        }

        public static <T1, T2, T3> Csc1<Tuple3<T1, T2, T3>> acceptChecked3(Csc1<? super T3> c) {
            return Csc1.<T3>narrow(c).<T1, T2>ignoring2Lt().tupled();
        }

    }

    public static interface Tupler2 extends Tupler {

        public static <T1, T2, R> Fn1<Tuple2<T1, T2>, Tuple2<R, T2>> apply1(Fn1<? super T1, ? extends R> f) {
            return tuple -> tuple.map1(f);
        }

        public static <T1, T2, R> Fn1<Tuple2<T1, T2>, Tuple2<T1, R>> apply2(Fn1<? super T2, ? extends R> f) {
            return tuple -> tuple.map2(f);
        }

        public static <T1, T2> Pr1<Tuple2<T1, T2>> test1(Pr1<? super T1> p) {
            return Pr1.<T1>narrow(p).<T2>ignoring1Rt().tupled();
        }

        public static <T1, T2> Pr1<Tuple2<T1, T2>> test2(Pr1<? super T2> p) {
            return Pr1.<T2>narrow(p).<T1>ignoring1Lt().tupled();
        }

        public static <T1, T2> Cs1<Tuple2<T1, T2>> accept1(Cs1<? super T1> c) {
            return Cs1.<T1>narrow(c).<T2>ignoring1Rt().tupled();
        }

        public static <T1, T2> Cs1<Tuple2<T1, T2>> accept2(Cs1<? super T2> c) {
            return Cs1.<T2>narrow(c).<T1>ignoring1Lt().tupled();
        }

        public static <T1, T2, R> Fnc1<Tuple2<T1, T2>, Tuple2<R, T2>> applyChecked1(Fnc1<? super T1, ? extends R> f) {
            return tuple -> tuple.map1(f.unchecked());
        }

        public static <T1, T2, R> Fnc1<Tuple2<T1, T2>, Tuple2<T1, R>> applyChecked2(Fnc1<? super T2, ? extends R> f) {
            return tuple -> tuple.map2(f.unchecked());
        }

        public static <T1, T2> Prc1<Tuple2<T1, T2>> testChecked1(Prc1<? super T1> p) {
            return Prc1.<T1>narrow(p).<T2>ignoring1Rt().tupled();
        }

        public static <T1, T2> Prc1<Tuple2<T1, T2>> testChecked2(Prc1<? super T2> p) {
            return Prc1.<T2>narrow(p).<T1>ignoring1Lt().tupled();
        }

        public static <T1, T2> Csc1<Tuple2<T1, T2>> acceptChecked1(Csc1<? super T1> c) {
            return Csc1.<T1>narrow(c).<T2>ignoring1Rt().tupled();
        }

        public static <T1, T2> Csc1<Tuple2<T1, T2>> acceptChecked2(Csc1<? super T2> c) {
            return Csc1.<T2>narrow(c).<T1>ignoring1Lt().tupled();
        }

    }

    public static interface Tupler1 extends Tupler {

        public static <T1, R> Fn1<Tuple1<T1>, Tuple1<R>> apply1(Fn1<? super T1, ? extends R> f) {
            return tuple -> tuple.map(f);
        }

        public static <T1> Pr1<Tuple1<T1>> test1(Pr1<? super T1> p) {
            return Pr1.<T1>narrow(p).tupled();
        }

        public static <T1> Cs1<Tuple1<T1>> accept1(Cs1<? super T1> c) {
            return Cs1.<T1>narrow(c).tupled();
        }

        public static <T1, R> Fnc1<Tuple1<T1>, Tuple1<R>> applyChecked1(Fnc1<? super T1, ? extends R> f) {
            return tuple -> tuple.map(f.unchecked());
        }

        public static <T1> Prc1<Tuple1<T1>> testChecked1(Prc1<? super T1> p) {
            return Prc1.<T1>narrow(p).tupled();
        }

        public static <T1> Csc1<Tuple1<T1>> acceptChecked1(Csc1<? super T1> c) {
            return Csc1.<T1>narrow(c).tupled();
        }

    }

}

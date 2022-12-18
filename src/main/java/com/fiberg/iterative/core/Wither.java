package com.fiberg.iterative.core;

import com.fiberg.iterative.core.Args1;
import com.fiberg.iterative.core.Args2;
import com.fiberg.iterative.core.Args3;
import com.fiberg.iterative.core.Args4;
import com.fiberg.iterative.core.Args5;
import com.fiberg.iterative.core.Args6;
import com.fiberg.iterative.core.Args7;
import com.fiberg.iterative.core.Args8;
import com.fiberg.iterative.function.Sp;
import io.vavr.Tuple1;
import io.vavr.Tuple2;
import io.vavr.Tuple3;
import io.vavr.Tuple4;
import io.vavr.Tuple5;
import io.vavr.Tuple6;
import io.vavr.Tuple7;
import io.vavr.Tuple8;

public interface Wither {

    public static <T1> Args1<T1> withTuple(Tuple1<? extends T1> tuple) {
        @SuppressWarnings("unchecked")
        final Args1<T1> args = (Args1<T1>) new Args1<Object>(tuple._1());
        return args;
    }

    public static <T1, T2> Args2<T1, T2> withTuple(Tuple2<? extends T1, ? extends T2> tuple) {
        @SuppressWarnings("unchecked")
        final Args2<T1, T2> args = (Args2<T1, T2>) new Args2<Object, Object>(tuple._1(), tuple._2());
        return args;
    }

    public static <T1, T2, T3> Args3<T1, T2, T3> withTuple(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple) {
        @SuppressWarnings("unchecked")
        final Args3<T1, T2, T3> args = (Args3<T1, T2, T3>) new Args3<Object, Object, Object>(tuple._1(), tuple._2(), tuple._3());
        return args;
    }

    public static <T1, T2, T3, T4> Args4<T1, T2, T3, T4> withTuple(Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4> tuple) {
        @SuppressWarnings("unchecked")
        final Args4<T1, T2, T3, T4> args = (Args4<T1, T2, T3, T4>) new Args4<Object, Object, Object, Object>(tuple._1(), tuple._2(), tuple._3(), tuple._4());
        return args;
    }

    public static <T1, T2, T3, T4, T5> Args5<T1, T2, T3, T4, T5> withTuple(Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> tuple) {
        @SuppressWarnings("unchecked")
        final Args5<T1, T2, T3, T4, T5> args = (Args5<T1, T2, T3, T4, T5>) new Args5<Object, Object, Object, Object, Object>(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5());
        return args;
    }

    public static <T1, T2, T3, T4, T5, T6> Args6<T1, T2, T3, T4, T5, T6> withTuple(Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> tuple) {
        @SuppressWarnings("unchecked")
        final Args6<T1, T2, T3, T4, T5, T6> args = (Args6<T1, T2, T3, T4, T5, T6>) new Args6<Object, Object, Object, Object, Object, Object>(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5(), tuple._6());
        return args;
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Args7<T1, T2, T3, T4, T5, T6, T7> withTuple(Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> tuple) {
        @SuppressWarnings("unchecked")
        final Args7<T1, T2, T3, T4, T5, T6, T7> args = (Args7<T1, T2, T3, T4, T5, T6, T7>) new Args7<Object, Object, Object, Object, Object, Object, Object>(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5(), tuple._6(), tuple._7());
        return args;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Args8<T1, T2, T3, T4, T5, T6, T7, T8> withTuple(Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8> tuple) {
        @SuppressWarnings("unchecked")
        final Args8<T1, T2, T3, T4, T5, T6, T7, T8> args = (Args8<T1, T2, T3, T4, T5, T6, T7, T8>) new Args8<Object, Object, Object, Object, Object, Object, Object, Object>(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5(), tuple._6(), tuple._7(), tuple._8());
        return args;
    }

    public static <T1> Args1<T1> withArgs(T1 t1) {
        return new Args1<T1>(t1);
    }

    public static <T1, T2> Args2<T1, T2> withArgs(T1 t1, T2 t2) {
        return new Args2<T1, T2>(t1, t2);
    }

    public static <T1, T2, T3> Args3<T1, T2, T3> withArgs(T1 t1, T2 t2, T3 t3) {
        return new Args3<T1, T2, T3>(t1, t2, t3);
    }

    public static <T1, T2, T3, T4> Args4<T1, T2, T3, T4> withArgs(T1 t1, T2 t2, T3 t3, T4 t4) {
        return new Args4<T1, T2, T3, T4>(t1, t2, t3, t4);
    }

    public static <T1, T2, T3, T4, T5> Args5<T1, T2, T3, T4, T5> withArgs(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return new Args5<T1, T2, T3, T4, T5>(t1, t2, t3, t4, t5);
    }

    public static <T1, T2, T3, T4, T5, T6> Args6<T1, T2, T3, T4, T5, T6> withArgs(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return new Args6<T1, T2, T3, T4, T5, T6>(t1, t2, t3, t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Args7<T1, T2, T3, T4, T5, T6, T7> withArgs(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return new Args7<T1, T2, T3, T4, T5, T6, T7>(t1, t2, t3, t4, t5, t6, t7);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Args8<T1, T2, T3, T4, T5, T6, T7, T8> withArgs(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return new Args8<T1, T2, T3, T4, T5, T6, T7, T8>(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    public static <T1> Args1<T1> fromArgs(Sp<? extends T1> s1) {
        return Wither.withArgs(s1.get());
    }

    public static <T1, T2> Args2<T1, T2> fromArgs(Sp<? extends T1> s1, Sp<? extends T2> s2) {
        return Wither.withArgs(s1.get(), s2.get());
    }

    public static <T1, T2, T3> Args3<T1, T2, T3> fromArgs(Sp<? extends T1> s1, Sp<? extends T2> s2, Sp<? extends T3> s3) {
        return Wither.withArgs(s1.get(), s2.get(), s3.get());
    }

    public static <T1, T2, T3, T4> Args4<T1, T2, T3, T4> fromArgs(Sp<? extends T1> s1, Sp<? extends T2> s2, Sp<? extends T3> s3, Sp<? extends T4> s4) {
        return Wither.withArgs(s1.get(), s2.get(), s3.get(), s4.get());
    }

    public static <T1, T2, T3, T4, T5> Args5<T1, T2, T3, T4, T5> fromArgs(Sp<? extends T1> s1, Sp<? extends T2> s2, Sp<? extends T3> s3, Sp<? extends T4> s4, Sp<? extends T5> s5) {
        return Wither.withArgs(s1.get(), s2.get(), s3.get(), s4.get(), s5.get());
    }

    public static <T1, T2, T3, T4, T5, T6> Args6<T1, T2, T3, T4, T5, T6> fromArgs(Sp<? extends T1> s1, Sp<? extends T2> s2, Sp<? extends T3> s3, Sp<? extends T4> s4, Sp<? extends T5> s5, Sp<? extends T6> s6) {
        return Wither.withArgs(s1.get(), s2.get(), s3.get(), s4.get(), s5.get(), s6.get());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Args7<T1, T2, T3, T4, T5, T6, T7> fromArgs(Sp<? extends T1> s1, Sp<? extends T2> s2, Sp<? extends T3> s3, Sp<? extends T4> s4, Sp<? extends T5> s5, Sp<? extends T6> s6, Sp<? extends T7> s7) {
        return Wither.withArgs(s1.get(), s2.get(), s3.get(), s4.get(), s5.get(), s6.get(), s7.get());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Args8<T1, T2, T3, T4, T5, T6, T7, T8> fromArgs(Sp<? extends T1> s1, Sp<? extends T2> s2, Sp<? extends T3> s3, Sp<? extends T4> s4, Sp<? extends T5> s5, Sp<? extends T6> s6, Sp<? extends T7> s7, Sp<? extends T8> s8) {
        return Wither.withArgs(s1.get(), s2.get(), s3.get(), s4.get(), s5.get(), s6.get(), s7.get(), s8.get());
    }

    public static <T1> Args1<T1> fromTuple1(Sp<? extends Tuple1<? extends T1>> s) {
        return Wither.withTuple(s.get());
    }

    public static <T1, T2> Args2<T1, T2> fromTuple2(Sp<? extends Tuple2<? extends T1, ? extends T2>> s) {
        return Wither.withTuple(s.get());
    }

    public static <T1, T2, T3> Args3<T1, T2, T3> fromTuple3(Sp<? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> s) {
        return Wither.withTuple(s.get());
    }

    public static <T1, T2, T3, T4> Args4<T1, T2, T3, T4> fromTuple4(Sp<? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> s) {
        return Wither.withTuple(s.get());
    }

    public static <T1, T2, T3, T4, T5> Args5<T1, T2, T3, T4, T5> fromTuple5(Sp<? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> s) {
        return Wither.withTuple(s.get());
    }

    public static <T1, T2, T3, T4, T5, T6> Args6<T1, T2, T3, T4, T5, T6> fromTuple6(Sp<? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> s) {
        return Wither.withTuple(s.get());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Args7<T1, T2, T3, T4, T5, T6, T7> fromTuple7(Sp<? extends Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> s) {
        return Wither.withTuple(s.get());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Args8<T1, T2, T3, T4, T5, T6, T7, T8> fromTuple8(Sp<? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> s) {
        return Wither.withTuple(s.get());
    }

}

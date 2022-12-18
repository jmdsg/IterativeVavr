package com.fiberg.iterative.core;

import com.fiberg.iterative.core.IterativeInternals;
import com.fiberg.iterative.core.SimpleIterative;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fn2;
import com.fiberg.iterative.function.Pr1;
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
import io.vavr.collection.Stream;
import io.vavr.collection.Traversable;
import io.vavr.control.Option;
import io.vavr.control.Try;
import java.io.Serializable;

interface IterativeHandler {

    public static final String NEXT_LINE = "\r\n";
    public static final String TAB = "    ";
    public static final String EMPTY = "";

    public static Stream<Tuple0> cross() {
        return Stream.empty();
    }

    public static <T1> Stream<Tuple1<T1>> cross(Iterable<? extends T1> t1) {
        return Stream.ofAll(t1).map(Tuple::of);
    }

    public static <T1, T2> Stream<Tuple2<T1, T2>> cross(Iterable<? extends T1> t1, Iterable<? extends T2> t2) {
        return Stream.ofAll(t1).flatMap(p1 -> Stream.ofAll((Iterable) t2).map(p2 -> Tuple.of((Object) p1, (Object) p2)));
    }

    public static <T1, T2, T3> Stream<Tuple3<T1, T2, T3>> cross(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Iterable<? extends T3> t3) {
        return Stream.ofAll(t1).flatMap(p1 -> Stream.ofAll((Iterable) t2).flatMap(p2 -> Stream.ofAll((Iterable) t3).map(p3 -> Tuple.of((Object) p1, (Object) p2, (Object) p3))));
    }

    public static <T1, T2, T3, T4> Stream<Tuple4<T1, T2, T3, T4>> cross(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Iterable<? extends T3> t3, Iterable<? extends T4> t4) {
        return Stream.ofAll(t1).flatMap(p1 -> Stream.ofAll((Iterable) t2).flatMap(p2 -> Stream.ofAll((Iterable) t3).flatMap(p3 -> Stream.ofAll((Iterable) t4).map(p4 -> Tuple.of((Object) p1, (Object) p2, (Object) p3, (Object) p4)))));
    }

    public static <T1, T2, T3, T4, T5> Stream<Tuple5<T1, T2, T3, T4, T5>> cross(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Iterable<? extends T3> t3, Iterable<? extends T4> t4, Iterable<? extends T5> t5) {
        Stream st1 = Stream.ofAll(t1);
        Stream st2 = Stream.ofAll(t2);
        Stream st3 = Stream.ofAll(t3);
        Stream st4 = Stream.ofAll(t4);
        Stream st5 = Stream.ofAll(t5);
        Stream st12 = st1.crossProduct((Iterable) st2).toStream();
        Stream st34 = st3.crossProduct((Iterable) st4).toStream();
        Stream st1234 = st12.crossProduct((Iterable) st34).toStream().map(tuple -> Tuple.of((Object) ((Tuple2) tuple._1())._1(), (Object) ((Tuple2) tuple._1())._2(), (Object) ((Tuple2) tuple._2())._1(), (Object) ((Tuple2) tuple._2())._2()));
        return st1234.crossProduct((Iterable) st5).toStream().map(tuple -> Tuple.of((Object) ((Tuple4) tuple._1())._1(), (Object) ((Tuple4) tuple._1())._2(), (Object) ((Tuple4) tuple._1())._3(), (Object) ((Tuple4) tuple._1())._4(), (Object) tuple._2()));
    }

    public static <T1, T2, T3, T4, T5, T6> Stream<Tuple6<T1, T2, T3, T4, T5, T6>> cross(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Iterable<? extends T3> t3, Iterable<? extends T4> t4, Iterable<? extends T5> t5, Iterable<? extends T6> t6) {
        Stream st1 = Stream.ofAll(t1);
        Stream st2 = Stream.ofAll(t2);
        Stream st3 = Stream.ofAll(t3);
        Stream st4 = Stream.ofAll(t4);
        Stream st5 = Stream.ofAll(t5);
        Stream st6 = Stream.ofAll(t6);
        Stream st12 = st1.crossProduct((Iterable) st2).toStream();
        Stream st34 = st3.crossProduct((Iterable) st4).toStream();
        Stream st56 = st5.crossProduct((Iterable) st6).toStream();
        Stream st1234 = st12.crossProduct((Iterable) st34).toStream().map(tuple -> Tuple.of((Object) ((Tuple2) tuple._1())._1(), (Object) ((Tuple2) tuple._1())._2(), (Object) ((Tuple2) tuple._2())._1(), (Object) ((Tuple2) tuple._2())._2()));
        return st1234.crossProduct((Iterable) st56).toStream().map(tuple -> Tuple.of((Object) ((Tuple4) tuple._1())._1(), (Object) ((Tuple4) tuple._1())._2(), (Object) ((Tuple4) tuple._1())._3(), (Object) ((Tuple4) tuple._1())._4(), (Object) ((Tuple2) tuple._2())._1(), (Object) ((Tuple2) tuple._2())._2()));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Stream<Tuple7<T1, T2, T3, T4, T5, T6, T7>> cross(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Iterable<? extends T3> t3, Iterable<? extends T4> t4, Iterable<? extends T5> t5, Iterable<? extends T6> t6, Iterable<? extends T7> t7) {
        Stream st1 = Stream.ofAll(t1);
        Stream st2 = Stream.ofAll(t2);
        Stream st3 = Stream.ofAll(t3);
        Stream st4 = Stream.ofAll(t4);
        Stream st5 = Stream.ofAll(t5);
        Stream st6 = Stream.ofAll(t6);
        Stream st7 = Stream.ofAll(t7);
        Stream st12 = st1.crossProduct((Iterable) st2).toStream();
        Stream st34 = st3.crossProduct((Iterable) st4).toStream();
        Stream st56 = st5.crossProduct((Iterable) st6).toStream();
        Stream st567 = st56.crossProduct((Iterable) st7).toStream().map(tuple -> Tuple.of((Object) ((Tuple2) tuple._1())._1(), (Object) ((Tuple2) tuple._1())._2(), (Object) tuple._2()));
        Stream st1234 = st12.crossProduct((Iterable) st34).toStream().map(tuple -> Tuple.of((Object) ((Tuple2) tuple._1())._1(), (Object) ((Tuple2) tuple._1())._2(), (Object) ((Tuple2) tuple._2())._1(), (Object) ((Tuple2) tuple._2())._2()));
        return st1234.crossProduct((Iterable) st567).toStream().map(tuple -> Tuple.of((Object) ((Tuple4) tuple._1())._1(), (Object) ((Tuple4) tuple._1())._2(), (Object) ((Tuple4) tuple._1())._3(), (Object) ((Tuple4) tuple._1())._4(), (Object) ((Tuple3) tuple._2())._1(), (Object) ((Tuple3) tuple._2())._2(), (Object) ((Tuple3) tuple._2())._3()));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Stream<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> cross(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Iterable<? extends T3> t3, Iterable<? extends T4> t4, Iterable<? extends T5> t5, Iterable<? extends T6> t6, Iterable<? extends T7> t7, Iterable<? extends T8> t8) {
        Stream st1 = Stream.ofAll(t1);
        Stream st2 = Stream.ofAll(t2);
        Stream st3 = Stream.ofAll(t3);
        Stream st4 = Stream.ofAll(t4);
        Stream st5 = Stream.ofAll(t5);
        Stream st6 = Stream.ofAll(t6);
        Stream st7 = Stream.ofAll(t7);
        Stream st8 = Stream.ofAll(t8);
        Stream st12 = st1.crossProduct((Iterable) st2).toStream();
        Stream st34 = st3.crossProduct((Iterable) st4).toStream();
        Stream st56 = st5.crossProduct((Iterable) st6).toStream();
        Stream st78 = st7.crossProduct((Iterable) st8).toStream();
        Stream st5678 = st56.crossProduct((Iterable) st78).toStream().map(tuple -> Tuple.of((Object) ((Tuple2) tuple._1())._1(), (Object) ((Tuple2) tuple._1())._2(), (Object) ((Tuple2) tuple._2())._1(), (Object) ((Tuple2) tuple._2())._2()));
        Stream st1234 = st12.crossProduct((Iterable) st34).toStream().map(tuple -> Tuple.of((Object) ((Tuple2) tuple._1())._1(), (Object) ((Tuple2) tuple._1())._2(), (Object) ((Tuple2) tuple._2())._1(), (Object) ((Tuple2) tuple._2())._2()));
        return st1234.crossProduct((Iterable) st5678).toStream().map(tuple -> Tuple.of((Object) ((Tuple4) tuple._1())._1(), (Object) ((Tuple4) tuple._1())._2(), (Object) ((Tuple4) tuple._1())._3(), (Object) ((Tuple4) tuple._1())._4(), (Object) ((Tuple4) tuple._2())._1(), (Object) ((Tuple4) tuple._2())._2(), (Object) ((Tuple4) tuple._2())._3(), (Object) ((Tuple4) tuple._2())._4()));
    }

    public static <T1> Stream<Iterable<T1>> transform(Iterable<? extends Stream<? extends T1>> iter) {
        if (iter instanceof Option || iter instanceof Try) {
            return Stream.of(SimpleIterative.of(iter).inlineMap(IterativeInternals::entity).toIterable());
        }
        return Stream.ofAll(iter).map(stream -> stream.map(IterativeInternals::entity));
    }

    public static <T1> Iterable<Stream<T1>> clean(Iterable<? extends Stream<? extends T1>> elem) {
        return SimpleIterative.of(elem).filter(Pr1.of(Traversable::isEmpty).negated()).map((Fn1 & Serializable) stream -> stream.map(IterativeInternals::entity)).toIterable();
    }

    public static <T1> Iterable<Stream<T1>> streamWrap(Iterable<? extends T1> t1) {
        return SimpleIterative.of(t1).map(Stream::of).toIterable();
    }

    public static String typeIndicator(boolean isCross) {
        return String.format("%s%s%s", TAB, isCross ? "><" : "||", NEXT_LINE);
    }

    public static String iterativeHeader(int size) {
        return String.format("-------- MainIterative[%d] --------%s", size, NEXT_LINE);
    }

    public static <T> String iterableStreamToString(Iterable<? extends Stream<? extends T>> iterable, int iterableNumber) {
        return Stream.ofAll(iterable).zipWithIndex().map(Fn2.tuple((Fn2 & Serializable) (stream, streamIndex) -> stream.zipWithIndex().map(Fn2.tuple((Fn2 & Serializable) (element, elementIndex) -> String.format("%s%s%s{%d} is (%s) -> %s%s", TAB, TAB, TAB, elementIndex, element == null ? "?" : element.getClass().getName(), element, NEXT_LINE))).prepend((Object) String.format("%s%s-- Stream{%d} --%s", TAB, TAB, streamIndex, NEXT_LINE)).mkString())).prepend((Object) String.format("%s---- Iterable{%d} ----%s", TAB, iterableNumber - 1, NEXT_LINE)).mkString();
    }

}

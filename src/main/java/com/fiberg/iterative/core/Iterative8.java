package com.fiberg.iterative.core;

import com.fiberg.iterative.core.Iterative;
import com.fiberg.iterative.core.Iterative1;
import com.fiberg.iterative.core.Iterative2;
import com.fiberg.iterative.core.Iterative3;
import com.fiberg.iterative.core.Iterative4;
import com.fiberg.iterative.core.Iterative5;
import com.fiberg.iterative.core.Iterative6;
import com.fiberg.iterative.core.Iterative7;
import com.fiberg.iterative.core.Iterative8Cross;
import com.fiberg.iterative.core.Iterative8Getter;
import com.fiberg.iterative.core.Iterative8Inline;
import com.fiberg.iterative.core.IterativeConstructor;
import com.fiberg.iterative.core.IterativeGetter;
import com.fiberg.iterative.core.IterativeHandler;
import com.fiberg.iterative.core.IterativeInternals;
import com.fiberg.iterative.core.IterativeSupplier;
import com.fiberg.iterative.core.SimpleIterative;
import com.fiberg.iterative.function.Cs1;
import com.fiberg.iterative.function.Cs2;
import com.fiberg.iterative.function.Cs3;
import com.fiberg.iterative.function.Cs4;
import com.fiberg.iterative.function.Cs5;
import com.fiberg.iterative.function.Cs6;
import com.fiberg.iterative.function.Cs7;
import com.fiberg.iterative.function.Cs8;
import com.fiberg.iterative.function.Fn0;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fn2;
import com.fiberg.iterative.function.Fn3;
import com.fiberg.iterative.function.Fn4;
import com.fiberg.iterative.function.Fn5;
import com.fiberg.iterative.function.Fn6;
import com.fiberg.iterative.function.Fn7;
import com.fiberg.iterative.function.Fn8;
import com.fiberg.iterative.function.Fnc8;
import com.fiberg.iterative.function.Pr1;
import com.fiberg.iterative.function.Pr8;
import com.fiberg.iterative.function.Rn;
import com.fiberg.iterative.function.Sp;
import io.vavr.Tuple;
import io.vavr.Tuple6;
import io.vavr.Tuple8;
import io.vavr.collection.Iterator;
import io.vavr.collection.Seq;
import io.vavr.collection.Stream;
import io.vavr.control.Option;
import io.vavr.control.Try;
import io.vavr.control.Validation;
import java.io.Serializable;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public interface Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> extends IterativeConstructor {

    public static final int CARDINALITY = 8;

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> empty() {
        return Iterative.empty8();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> emptyNullable() {
        return Iterative.nullable().empty8();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> narrow(Iterative8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8> iterative) {
        @SuppressWarnings("unchecked")
        final Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> iter = (Iterative8<T1, T2, T3, T4, T5, T6, T7, T8>) iterative;
        return iter;
    }

    public String toStringContent();

    public Stream<Tuple8<Iterable<T1>, Iterable<T2>, Iterable<T3>, Iterable<T4>, Iterable<T5>, Iterable<T6>, Iterable<T7>, Iterable<T8>>> toTupleStream();

    public Stream<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> toStream();

    public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> nonNullable();

    public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> nullable();

    public Iterable<T1> iterable1();

    public Iterable<T2> iterable2();

    public Iterable<T3> iterable3();

    public Iterable<T4> iterable4();

    public Iterable<T5> iterable5();

    public Iterable<T6> iterable6();

    public Iterable<T7> iterable7();

    public Iterable<T8> iterable8();

    public Iterable<Stream<T1>> iterableStream1();

    public Iterable<Stream<T2>> iterableStream2();

    public Iterable<Stream<T3>> iterableStream3();

    public Iterable<Stream<T4>> iterableStream4();

    public Iterable<Stream<T5>> iterableStream5();

    public Iterable<Stream<T6>> iterableStream6();

    public Iterable<Stream<T7>> iterableStream7();

    public Iterable<Stream<T8>> iterableStream8();

    public Iterative7<T1, T2, T3, T4, T5, T6, T7> innerIterative();

    public Iterative1<T1> splitLt1();

    public Iterative2<T1, T2> splitLt2();

    public Iterative3<T1, T2, T3> splitLt3();

    public Iterative4<T1, T2, T3, T4> splitLt4();

    public Iterative5<T1, T2, T3, T4, T5> splitLt5();

    public Iterative6<T1, T2, T3, T4, T5, T6> splitLt6();

    public Iterative7<T1, T2, T3, T4, T5, T6, T7> splitLt7();

    public Iterative1<T8> splitRt1();

    public Iterative2<T7, T8> splitRt2();

    public Iterative3<T6, T7, T8> splitRt3();

    public Iterative4<T5, T6, T7, T8> splitRt4();

    public Iterative5<T4, T5, T6, T7, T8> splitRt5();

    public Iterative6<T3, T4, T5, T6, T7, T8> splitRt6();

    public Iterative7<T2, T3, T4, T5, T6, T7, T8> splitRt7();

    public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceCross2();

    public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceCross3();

    public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceCross4();

    public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceCross5();

    public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceCross6();

    public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceCross7();

    public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> forceCross8();

    public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> forceCrossAll();

    public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceInline2();

    public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceInline3();

    public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceInline4();

    public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceInline5();

    public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceInline6();

    public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceInline7();

    public Iterative8Inline<T1, T2, T3, T4, T5, T6, T7, T8> forceInline8();

    public Iterative8Inline<T1, T2, T3, T4, T5, T6, T7, T8> forceInlineAll();

    public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceCleanEmpty1();

    public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceCleanEmpty2();

    public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceCleanEmpty3();

    public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceCleanEmpty4();

    public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceCleanEmpty5();

    public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceCleanEmpty6();

    public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceCleanEmpty7();

    public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceCleanEmpty8();

    public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceCleanEmptyAll();

    public Iterative7<T1, T2, T3, T4, T5, T6, T7> popBack(Cs1<? super T8> var1);

    public Iterative7<T1, T2, T3, T4, T5, T6, T7> popBackChain(Cs1<? super T8> var1);

    public Iterative7<T2, T3, T4, T5, T6, T7, T8> popFront(Cs1<? super T1> var1);

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> popBack() {
        return this.popBack(Cs1.empty());
    }

    default public Iterative7<T2, T3, T4, T5, T6, T7, T8> popFront() {
        return this.popFront(Cs1.empty());
    }

    public Iterative6<T1, T2, T3, T4, T5, T6> popBack2(Cs2<? super T7, ? super T8> var1);

    public Iterative6<T1, T2, T3, T4, T5, T6> popBackChain2(Cs2<? super T7, ? super T8> var1);

    public Iterative6<T3, T4, T5, T6, T7, T8> popFront2(Cs2<? super T1, ? super T2> var1);

    default public Iterative6<T1, T2, T3, T4, T5, T6> popBack2(Cs1<? super T7> c7, Cs1<? super T8> c8) {
        return this.popBack(c8).popBack(c7);
    }

    default public Iterative6<T3, T4, T5, T6, T7, T8> popFront2(Cs1<? super T1> c1, Cs1<? super T2> c2) {
        return this.popFront(c1).popFront(c2);
    }

    default public Iterative6<T1, T2, T3, T4, T5, T6> popBack2() {
        return this.popBack2(Cs1.empty(), Cs1.empty());
    }

    default public Iterative6<T3, T4, T5, T6, T7, T8> popFront2() {
        return this.popFront2(Cs1.empty(), Cs1.empty());
    }

    public Iterative5<T1, T2, T3, T4, T5> popBack3(Cs3<? super T6, ? super T7, ? super T8> var1);

    public Iterative5<T1, T2, T3, T4, T5> popBackChain3(Cs3<? super T6, ? super T7, ? super T8> var1);

    public Iterative5<T4, T5, T6, T7, T8> popFront3(Cs3<? super T1, ? super T2, ? super T3> var1);

    default public Iterative5<T1, T2, T3, T4, T5> popBack3(Cs1<? super T6> c6, Cs1<? super T7> c7, Cs1<? super T8> c8) {
        return this.popBack(c8).popBack(c7).popBack(c6);
    }

    default public Iterative5<T4, T5, T6, T7, T8> popFront3(Cs1<? super T1> c1, Cs1<? super T2> c2, Cs1<? super T3> c3) {
        return this.popFront(c1).popFront(c2).popFront(c3);
    }

    default public Iterative5<T1, T2, T3, T4, T5> popBack3() {
        return this.popBack3(Cs1.empty(), Cs1.empty(), Cs1.empty());
    }

    default public Iterative5<T4, T5, T6, T7, T8> popFront3() {
        return this.popFront3(Cs1.empty(), Cs1.empty(), Cs1.empty());
    }

    public Iterative4<T1, T2, T3, T4> popBack4(Cs4<? super T5, ? super T6, ? super T7, ? super T8> var1);

    public Iterative4<T1, T2, T3, T4> popBackChain4(Cs4<? super T5, ? super T6, ? super T7, ? super T8> var1);

    public Iterative4<T5, T6, T7, T8> popFront4(Cs4<? super T1, ? super T2, ? super T3, ? super T4> var1);

    default public Iterative4<T1, T2, T3, T4> popBack4(Cs1<? super T5> c5, Cs1<? super T6> c6, Cs1<? super T7> c7, Cs1<? super T8> c8) {
        return this.popBack(c8).popBack(c7).popBack(c6).popBack(c5);
    }

    default public Iterative4<T5, T6, T7, T8> popFront4(Cs1<? super T1> c1, Cs1<? super T2> c2, Cs1<? super T3> c3, Cs1<? super T4> c4) {
        return this.popFront(c1).popFront(c2).popFront(c3).popFront(c4);
    }

    default public Iterative4<T1, T2, T3, T4> popBack4() {
        return this.popBack4(Cs1.empty(), Cs1.empty(), Cs1.empty(), Cs1.empty());
    }

    default public Iterative4<T5, T6, T7, T8> popFront4() {
        return this.popFront4(Cs1.empty(), Cs1.empty(), Cs1.empty(), Cs1.empty());
    }

    public Iterative3<T1, T2, T3> popBack5(Cs5<? super T4, ? super T5, ? super T6, ? super T7, ? super T8> var1);

    public Iterative3<T1, T2, T3> popBackChain5(Cs5<? super T4, ? super T5, ? super T6, ? super T7, ? super T8> var1);

    public Iterative3<T6, T7, T8> popFront5(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> var1);

    default public Iterative3<T1, T2, T3> popBack5(Cs1<? super T4> c4, Cs1<? super T5> c5, Cs1<? super T6> c6, Cs1<? super T7> c7, Cs1<? super T8> c8) {
        return this.popBack(c8).popBack(c7).popBack(c6).popBack(c5).popBack(c4);
    }

    default public Iterative3<T6, T7, T8> popFront5(Cs1<? super T1> c1, Cs1<? super T2> c2, Cs1<? super T3> c3, Cs1<? super T4> c4, Cs1<? super T5> c5) {
        return this.popFront(c1).popFront(c2).popFront(c3).popFront(c4).popFront(c5);
    }

    default public Iterative3<T1, T2, T3> popBack5() {
        return this.popBack5(Cs1.empty(), Cs1.empty(), Cs1.empty(), Cs1.empty(), Cs1.empty());
    }

    default public Iterative3<T6, T7, T8> popFront5() {
        return this.popFront5(Cs1.empty(), Cs1.empty(), Cs1.empty(), Cs1.empty(), Cs1.empty());
    }

    public Iterative2<T1, T2> popBack6(Cs6<? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> var1);

    public Iterative2<T1, T2> popBackChain6(Cs6<? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> var1);

    public Iterative2<T7, T8> popFront6(Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> var1);

    default public Iterative2<T1, T2> popBack6(Cs1<? super T3> c3, Cs1<? super T4> c4, Cs1<? super T5> c5, Cs1<? super T6> c6, Cs1<? super T7> c7, Cs1<? super T8> c8) {
        return this.popBack(c8).popBack(c7).popBack(c6).popBack(c5).popBack(c4).popBack(c3);
    }

    default public Iterative2<T7, T8> popFront6(Cs1<? super T1> c1, Cs1<? super T2> c2, Cs1<? super T3> c3, Cs1<? super T4> c4, Cs1<? super T5> c5, Cs1<? super T6> c6) {
        return this.popFront(c1).popFront(c2).popFront(c3).popFront(c4).popFront(c5).popFront(c6);
    }

    default public Iterative2<T1, T2> popBack6() {
        return this.popBack6(Cs1.empty(), Cs1.empty(), Cs1.empty(), Cs1.empty(), Cs1.empty(), Cs1.empty());
    }

    default public Iterative2<T7, T8> popFront6() {
        return this.popFront6(Cs1.empty(), Cs1.empty(), Cs1.empty(), Cs1.empty(), Cs1.empty(), Cs1.empty());
    }

    public Iterative1<T1> popBack7(Cs7<? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> var1);

    public Iterative1<T1> popBackChain7(Cs7<? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> var1);

    public Iterative1<T8> popFront7(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> var1);

    default public Iterative1<T1> popBack7(Cs1<? super T2> c2, Cs1<? super T3> c3, Cs1<? super T4> c4, Cs1<? super T5> c5, Cs1<? super T6> c6, Cs1<? super T7> c7, Cs1<? super T8> c8) {
        return this.popBack(c8).popBack(c7).popBack(c6).popBack(c5).popBack(c4).popBack(c3).popBack(c2);
    }

    default public Iterative1<T8> popFront7(Cs1<? super T1> c1, Cs1<? super T2> c2, Cs1<? super T3> c3, Cs1<? super T4> c4, Cs1<? super T5> c5, Cs1<? super T6> c6, Cs1<? super T7> c7) {
        return this.popFront(c1).popFront(c2).popFront(c3).popFront(c4).popFront(c5).popFront(c6).popFront(c7);
    }

    default public Iterative1<T1> popBack7() {
        return this.popBack7(Cs1.empty(), Cs1.empty(), Cs1.empty(), Cs1.empty(), Cs1.empty(), Cs1.empty(), Cs1.empty());
    }

    default public Iterative1<T8> popFront7() {
        return this.popFront7(Cs1.empty(), Cs1.empty(), Cs1.empty(), Cs1.empty(), Cs1.empty(), Cs1.empty(), Cs1.empty());
    }

    public <R1, R2, R3, R4, R5, R6, R7, R8> Iterative8<R1, R2, R3, R4, R5, R6, R7, R8> map(Fn1<? super T1, ? extends R1> var1, Fn1<? super T2, ? extends R2> var2, Fn1<? super T3, ? extends R3> var3, Fn1<? super T4, ? extends R4> var4, Fn1<? super T5, ? extends R5> var5, Fn1<? super T6, ? extends R6> var6, Fn1<? super T7, ? extends R7> var7, Fn1<? super T8, ? extends R8> var8);

    public <R1, R2, R3, R4, R5, R6, R7, R8> Iterative8<R1, R2, R3, R4, R5, R6, R7, R8> inlineMap(Fn1<? super T1, ? extends Iterable<? extends R1>> var1, Fn1<? super T2, ? extends Iterable<? extends R2>> var2, Fn1<? super T3, ? extends Iterable<? extends R3>> var3, Fn1<? super T4, ? extends Iterable<? extends R4>> var4, Fn1<? super T5, ? extends Iterable<? extends R5>> var5, Fn1<? super T6, ? extends Iterable<? extends R6>> var6, Fn1<? super T7, ? extends Iterable<? extends R7>> var7, Fn1<? super T8, ? extends Iterable<? extends R8>> var8);

    public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> filter(Pr1<? super T1> var1, Pr1<? super T2> var2, Pr1<? super T3> var3, Pr1<? super T4> var4, Pr1<? super T5> var5, Pr1<? super T6> var6, Pr1<? super T7> var7, Pr1<? super T8> var8);

    default public <R1, R2, R3, R4, R5, R6, R7, R8> Iterative8<R1, R2, R3, R4, R5, R6, R7, R8> flatMap(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5, Fn1<? super T6, ? extends Iterable<? extends R6>> f6, Fn1<? super T7, ? extends Iterable<? extends R7>> f7, Fn1<? super T8, ? extends Iterable<? extends R8>> f8) {
        return this.inlineMap(f1, f2, f3, f4, f5, f6, f7, f8).forceFlatAll();
    }

    @Override
    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> onSuccess(Rn r) {
        return this.onSuccess(r.ignoring1());
    }

    @Override
    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> onFailure(Rn r) {
        return this.onFailure(r.ignoring1());
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> execute(Cs1<? super Iterative8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> c) {
        Objects.requireNonNull(c, "c is null");
        c.accept(this);
        return this;
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> onFailure(Cs1<? super Iterative8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> c) {
        Objects.requireNonNull(c, "c is null");
        this.toStream().toTry().recover(t -> null).filter(Objects::isNull).forEach(tuple -> c.accept(this));
        return this;
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> onSuccess(Cs1<? super Iterative8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> c) {
        Objects.requireNonNull(c, "c is null");
        this.toStream().headOption().forEach(tuple -> c.accept(this));
        return this;
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> onSuccessful(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
        return this.forEach(c);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> recover1(T1 t1) {
        return this.splitLt7().recover1(t1).pushBackBy(this.iterableStream8());
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> recover1Of(Iterable<? extends T1> t1) {
        return this.splitLt7().recover1Of(t1).pushBackBy(this.iterableStream8());
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> recover1By(Iterable<? extends Stream<? extends T1>> t1) {
        return this.splitLt7().recover1By(t1).pushBackBy(this.iterableStream8());
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> recover2(T2 t2) {
        return this.splitLt7().recover2(t2).pushBackBy(this.iterableStream8());
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> recover2Of(Iterable<? extends T2> t2) {
        return this.splitLt7().recover2Of(t2).pushBackBy(this.iterableStream8());
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> recover2By(Iterable<? extends Stream<? extends T2>> t2) {
        return this.splitLt7().recover2By(t2).pushBackBy(this.iterableStream8());
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> recover3(T3 t3) {
        return this.splitLt7().recover3(t3).pushBackBy(this.iterableStream8());
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> recover3Of(Iterable<? extends T3> t3) {
        return this.splitLt7().recover3Of(t3).pushBackBy(this.iterableStream8());
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> recover3By(Iterable<? extends Stream<? extends T3>> t3) {
        return this.splitLt7().recover3By(t3).pushBackBy(this.iterableStream8());
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> recover4(T4 t4) {
        return this.splitLt7().recover4(t4).pushBackBy(this.iterableStream8());
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> recover4Of(Iterable<? extends T4> t4) {
        return this.splitLt7().recover4Of(t4).pushBackBy(this.iterableStream8());
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> recover4By(Iterable<? extends Stream<? extends T4>> t4) {
        return this.splitLt7().recover4By(t4).pushBackBy(this.iterableStream8());
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> recover5(T5 t5) {
        return this.splitLt7().recover5(t5).pushBackBy(this.iterableStream8());
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> recover5Of(Iterable<? extends T5> t5) {
        return this.splitLt7().recover5Of(t5).pushBackBy(this.iterableStream8());
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> recover5By(Iterable<? extends Stream<? extends T5>> t5) {
        return this.splitLt7().recover5By(t5).pushBackBy(this.iterableStream8());
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> recover6(T6 t6) {
        return this.splitLt7().recover6(t6).pushBackBy(this.iterableStream8());
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> recover6Of(Iterable<? extends T6> t6) {
        return this.splitLt7().recover6Of(t6).pushBackBy(this.iterableStream8());
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> recover6By(Iterable<? extends Stream<? extends T6>> t6) {
        return this.splitLt7().recover6By(t6).pushBackBy(this.iterableStream8());
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> recover7(T7 t7) {
        return this.splitLt7().recover7(t7).pushBackBy(this.iterableStream8());
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> recover7Of(Iterable<? extends T7> t7) {
        return this.splitLt7().recover7Of(t7).pushBackBy(this.iterableStream8());
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> recover7By(Iterable<? extends Stream<? extends T7>> t7) {
        return this.splitLt7().recover7By(t7).pushBackBy(this.iterableStream8());
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> recover8(T8 t8) {
        return this.splitRt1().isFailure() ? this.splitLt7().<T8>pushBack(t8) : this;
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> recover8Of(Iterable<? extends T8> t8) {
        return this.splitRt1().isFailure() ? this.splitLt7().<T8>pushBackOf(t8) : this;
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> recover8By(Iterable<? extends Stream<? extends T8>> t8) {
        return this.splitRt1().isFailure() ? this.splitLt7().<T8>pushBackBy(t8) : this;
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forEach(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
        Objects.requireNonNull(c, "c is null");
        this.toStream().forEach(Cs8.tuple(c));
        return this;
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forEach(Rn r) {
        return this.forEach(r.ignoring8());
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forEach1(Cs1<? super T1> c) {
        return this.forEach(c.ignoring7Rt());
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forEach2(Cs1<? super T2> c) {
        return this.forEach(c.ignoring6Rt().ignoring1Lt());
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forEach3(Cs1<? super T3> c) {
        return this.forEach(c.ignoring5Rt().ignoring2Lt());
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forEach4(Cs1<? super T4> c) {
        return this.forEach(c.ignoring4Rt().ignoring3Lt());
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forEach5(Cs1<? super T5> c) {
        return this.forEach(c.ignoring3Rt().ignoring4Lt());
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forEach6(Cs1<? super T6> c) {
        return this.forEach(c.ignoring2Rt().ignoring5Lt());
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forEach7(Cs1<? super T7> c) {
        return this.forEach(c.ignoring1Rt().ignoring6Lt());
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forEach8(Cs1<? super T8> c) {
        return this.forEach(c.ignoring7Lt());
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forEachWhen1(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c, Pr1<? super T1> p) {
        return this.forEachWhen(c, p, Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true));
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forEachWhen2(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c, Pr1<? super T2> p) {
        return this.forEachWhen(c, Pr1.value(true), p, Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true));
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forEachWhen3(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c, Pr1<? super T3> p) {
        return this.forEachWhen(c, Pr1.value(true), Pr1.value(true), p, Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true));
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forEachWhen4(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c, Pr1<? super T4> p) {
        return this.forEachWhen(c, Pr1.value(true), Pr1.value(true), Pr1.value(true), p, Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true));
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forEachWhen5(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c, Pr1<? super T5> p) {
        return this.forEachWhen(c, Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), p, Pr1.value(true), Pr1.value(true), Pr1.value(true));
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forEachWhen6(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c, Pr1<? super T6> p) {
        return this.forEachWhen(c, Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), p, Pr1.value(true), Pr1.value(true));
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forEachWhen7(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c, Pr1<? super T7> p) {
        return this.forEachWhen(c, Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), p, Pr1.value(true));
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forEachWhen8(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c, Pr1<? super T8> p) {
        return this.forEachWhen(c, Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), p);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forEachWhen(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c, Pr1<? super T1> p1, Pr1<? super T2> p2, Pr1<? super T3> p3, Pr1<? super T4> p4, Pr1<? super T5> p5, Pr1<? super T6> p6, Pr1<? super T7> p7, Pr1<? super T8> p8) {
        Objects.requireNonNull(c, "c is null");
        Objects.requireNonNull(p1, "p1 is null");
        Objects.requireNonNull(p2, "p2 is null");
        Objects.requireNonNull(p3, "p3 is null");
        Objects.requireNonNull(p4, "p4 is null");
        Objects.requireNonNull(p5, "p5 is null");
        Objects.requireNonNull(p6, "p6 is null");
        Objects.requireNonNull(p7, "p7 is null");
        Objects.requireNonNull(p8, "p8 is null");
        this.filter(p1, p2, p3, p4, p5, p6, p7, p8).toStream().forEach(Cs8.tuple(c));
        return this;
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forEachWhen(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c, Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        Objects.requireNonNull(c, "c is null");
        Objects.requireNonNull(p, "p is null");
        this.toStream().filter(Pr8.tuple(p)).forEach(Cs8.tuple(c));
        return this;
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forEach1When(Cs1<? super T1> c, Pr1<? super T1> p) {
        return this.forEachWhen1(c.ignoring7Rt(), p);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forEach2When(Cs1<? super T2> c, Pr1<? super T2> p) {
        return this.forEachWhen2(c.ignoring6Rt().ignoring1Lt(), p);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forEach3When(Cs1<? super T3> c, Pr1<? super T3> p) {
        return this.forEachWhen3(c.ignoring5Rt().ignoring2Lt(), p);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forEach4When(Cs1<? super T4> c, Pr1<? super T4> p) {
        return this.forEachWhen4(c.ignoring4Rt().ignoring3Lt(), p);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forEach5When(Cs1<? super T5> c, Pr1<? super T5> p) {
        return this.forEachWhen5(c.ignoring3Rt().ignoring4Lt(), p);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forEach6When(Cs1<? super T6> c, Pr1<? super T6> p) {
        return this.forEachWhen6(c.ignoring2Rt().ignoring5Lt(), p);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forEach7When(Cs1<? super T7> c, Pr1<? super T7> p) {
        return this.forEachWhen7(c.ignoring1Rt().ignoring6Lt(), p);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forEach8When(Cs1<? super T8> c, Pr1<? super T8> p) {
        return this.forEachWhen8(c.ignoring7Lt(), p);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> replace1When(Fn1<? super T1, ? extends T1> f, Pr1<? super T1> p) {
        return this.map1(t -> p.test(t) ? f.apply(t) : t);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> replace1When(Sp<? extends T1> s, Pr1<? super T1> p) {
        return this.replace1When(s.toFunction().ignoring1(), p);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> replace1When(T1 t, Pr1<? super T1> p) {
        return this.replace1When(Fn1.value(t), p);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> replace2When(Fn1<? super T2, ? extends T2> f, Pr1<? super T2> p) {
        return this.map2(t -> p.test(t) ? f.apply(t) : t);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> replace2When(Sp<? extends T2> s, Pr1<? super T2> p) {
        return this.replace2When(s.toFunction().ignoring1(), p);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> replace2When(T2 t, Pr1<? super T2> p) {
        return this.replace2When(Fn1.value(t), p);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> replace3When(Fn1<? super T3, ? extends T3> f, Pr1<? super T3> p) {
        return this.map3(t -> p.test(t) ? f.apply(t) : t);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> replace3When(Sp<? extends T3> s, Pr1<? super T3> p) {
        return this.replace3When(s.toFunction().ignoring1(), p);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> replace3When(T3 t, Pr1<? super T3> p) {
        return this.replace3When(Fn1.value(t), p);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> replace4When(Fn1<? super T4, ? extends T4> f, Pr1<? super T4> p) {
        return this.map4(t -> p.test(t) ? f.apply(t) : t);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> replace4When(Sp<? extends T4> s, Pr1<? super T4> p) {
        return this.replace4When(s.toFunction().ignoring1(), p);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> replace4When(T4 t, Pr1<? super T4> p) {
        return this.replace4When(Fn1.value(t), p);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> replace5When(Fn1<? super T5, ? extends T5> f, Pr1<? super T5> p) {
        return this.map5(t -> p.test(t) ? f.apply(t) : t);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> replace5When(Sp<? extends T5> s, Pr1<? super T5> p) {
        return this.replace5When(s.toFunction().ignoring1(), p);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> replace5When(T5 t, Pr1<? super T5> p) {
        return this.replace5When(Fn1.value(t), p);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> replace6When(Fn1<? super T6, ? extends T6> f, Pr1<? super T6> p) {
        return this.map6(t -> p.test(t) ? f.apply(t) : t);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> replace6When(Sp<? extends T6> s, Pr1<? super T6> p) {
        return this.replace6When(s.toFunction().ignoring1(), p);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> replace6When(T6 t, Pr1<? super T6> p) {
        return this.replace6When(Fn1.value(t), p);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> replace7When(Fn1<? super T7, ? extends T7> f, Pr1<? super T7> p) {
        return this.map7(t -> p.test(t) ? f.apply(t) : t);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> replace7When(Sp<? extends T7> s, Pr1<? super T7> p) {
        return this.replace7When(s.toFunction().ignoring1(), p);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> replace7When(T7 t, Pr1<? super T7> p) {
        return this.replace7When(Fn1.value(t), p);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> replace8When(Fn1<? super T8, ? extends T8> f, Pr1<? super T8> p) {
        return this.map8(t -> p.test(t) ? f.apply(t) : t);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> replace8When(Sp<? extends T8> s, Pr1<? super T8> p) {
        return this.replace8When(s.toFunction().ignoring1(), p);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> replace8When(T8 t, Pr1<? super T8> p) {
        return this.replace8When(Fn1.value(t), p);
    }

    default public Iterable<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> yield() {
        return this.yield(Tuple::of);
    }

    default public <R> Iterable<R> yield(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.toStream().map(Fn8.tuple(f)).flatMap(this::wrap);
    }

    default public Stream<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> yieldStream() {
        return this.yieldStream(Tuple::of);
    }

    default public <R> Stream<R> yieldStream(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.toStream().map(Fn8.tuple(f)).flatMap(this::wrap);
    }

    default public <R> Stream<R> yieldFlatStream(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends Iterable<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.yieldStream(f).flatMap(IterativeInternals::identity).flatMap(this::wrap);
    }

    default public Option<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> yieldOption() {
        return this.yieldOption(Tuple::of);
    }

    default public <R> Option<R> yieldOption(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.toStream().headOption().map(Fn8.tuple(f)).flatMap(this::wrap);
    }

    default public <R> Option<R> yieldFlatOption(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends Option<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.yieldOption(f).flatMap(IterativeInternals::identity).flatMap(this::wrap);
    }

    default public Try<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> yieldTry() {
        return this.yieldTry(Tuple::of);
    }

    default public <R> Try<R> yieldTry(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.toStream().headOption().toTry().mapTry(Fnc8.tuple(f)).flatMap(this::wrapTry);
    }

    default public <R> Try<R> yieldFlatTry(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends Try<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.yieldTry(f).flatMap(IterativeInternals::identity).flatMap(this::wrapTry);
    }

    default public Validation<Seq<Throwable>, Stream<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>>> validateStream() {
        return this.validateStream(Tuple::of);
    }

    default public <R> Validation<Seq<Throwable>, Stream<R>> validateStream(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldStream(f));
        }
        return Validation.invalid(failures);
    }

    default public <R> Validation<Seq<Throwable>, Stream<R>> validateFlatStream(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends Iterable<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldFlatStream(f));
        }
        return Validation.invalid(failures);
    }

    default public Validation<Seq<Throwable>, Option<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>>> validateOption() {
        return this.validateOption(Tuple::of);
    }

    default public <R> Validation<Seq<Throwable>, Option<R>> validateOption(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldOption(f));
        }
        return Validation.invalid(failures);
    }

    default public <R> Validation<Seq<Throwable>, Option<R>> validateFlatOption(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends Option<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldFlatOption(f));
        }
        return Validation.invalid(failures);
    }

    default public Validation<Seq<Throwable>, Try<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>>> validateTry() {
        return this.validateTry(Tuple::of);
    }

    default public <R> Validation<Seq<Throwable>, Try<R>> validateTry(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldTry(f));
        }
        return Validation.invalid(failures);
    }

    default public <R> Validation<Seq<Throwable>, Try<R>> validateFlatTry(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends Try<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldFlatTry(f));
        }
        return Validation.invalid(failures);
    }

    default public <R> Iterative8<R, T2, T3, T4, T5, T6, T7, T8> map1(Fn1<? super T1, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.map(f, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity);
    }

    default public <R> Iterative8<T1, R, T3, T4, T5, T6, T7, T8> map2(Fn1<? super T2, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.map(IterativeInternals::identity, f, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity);
    }

    default public <R> Iterative8<T1, T2, R, T4, T5, T6, T7, T8> map3(Fn1<? super T3, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.map(IterativeInternals::identity, IterativeInternals::identity, f, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity);
    }

    default public <R> Iterative8<T1, T2, T3, R, T5, T6, T7, T8> map4(Fn1<? super T4, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.map(IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, f, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity);
    }

    default public <R> Iterative8<T1, T2, T3, T4, R, T6, T7, T8> map5(Fn1<? super T5, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.map(IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, f, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity);
    }

    default public <R> Iterative8<T1, T2, T3, T4, T5, R, T7, T8> map6(Fn1<? super T6, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.map(IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, f, IterativeInternals::identity, IterativeInternals::identity);
    }

    default public <R> Iterative8<T1, T2, T3, T4, T5, T6, R, T8> map7(Fn1<? super T7, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.map(IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, f, IterativeInternals::identity);
    }

    default public <R> Iterative8<T1, T2, T3, T4, T5, T6, T7, R> map8(Fn1<? super T8, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.map(IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, f);
    }

    default public <R7, R8> Iterative8<T1, T2, T3, T4, T5, T6, R7, R8> mapRt2(Fn1<? super T7, ? extends R7> f7, Fn1<? super T8, ? extends R8> f8) {
        return this.map(IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, f7, f8);
    }

    default public <R1, R2> Iterative8<R1, R2, T3, T4, T5, T6, T7, T8> mapLt2(Fn1<? super T1, ? extends R1> f1, Fn1<? super T2, ? extends R2> f2) {
        return this.map(f1, f2, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity);
    }

    default public <R6, R7, R8> Iterative8<T1, T2, T3, T4, T5, R6, R7, R8> mapRt3(Fn1<? super T6, ? extends R6> f6, Fn1<? super T7, ? extends R7> f7, Fn1<? super T8, ? extends R8> f8) {
        return this.map(IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, f6, f7, f8);
    }

    default public <R1, R2, R3> Iterative8<R1, R2, R3, T4, T5, T6, T7, T8> mapLt3(Fn1<? super T1, ? extends R1> f1, Fn1<? super T2, ? extends R2> f2, Fn1<? super T3, ? extends R3> f3) {
        return this.map(f1, f2, f3, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity);
    }

    default public <R5, R6, R7, R8> Iterative8<T1, T2, T3, T4, R5, R6, R7, R8> mapRt4(Fn1<? super T5, ? extends R5> f5, Fn1<? super T6, ? extends R6> f6, Fn1<? super T7, ? extends R7> f7, Fn1<? super T8, ? extends R8> f8) {
        return this.map(IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, f5, f6, f7, f8);
    }

    default public <R1, R2, R3, R4> Iterative8<R1, R2, R3, R4, T5, T6, T7, T8> mapLt4(Fn1<? super T1, ? extends R1> f1, Fn1<? super T2, ? extends R2> f2, Fn1<? super T3, ? extends R3> f3, Fn1<? super T4, ? extends R4> f4) {
        return this.map(f1, f2, f3, f4, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity);
    }

    default public <R4, R5, R6, R7, R8> Iterative8<T1, T2, T3, R4, R5, R6, R7, R8> mapRt5(Fn1<? super T4, ? extends R4> f4, Fn1<? super T5, ? extends R5> f5, Fn1<? super T6, ? extends R6> f6, Fn1<? super T7, ? extends R7> f7, Fn1<? super T8, ? extends R8> f8) {
        return this.map(IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, f4, f5, f6, f7, f8);
    }

    default public <R1, R2, R3, R4, R5> Iterative8<R1, R2, R3, R4, R5, T6, T7, T8> mapLt5(Fn1<? super T1, ? extends R1> f1, Fn1<? super T2, ? extends R2> f2, Fn1<? super T3, ? extends R3> f3, Fn1<? super T4, ? extends R4> f4, Fn1<? super T5, ? extends R5> f5) {
        return this.map(f1, f2, f3, f4, f5, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity);
    }

    default public <R3, R4, R5, R6, R7, R8> Iterative8<T1, T2, R3, R4, R5, R6, R7, R8> mapRt6(Fn1<? super T3, ? extends R3> f3, Fn1<? super T4, ? extends R4> f4, Fn1<? super T5, ? extends R5> f5, Fn1<? super T6, ? extends R6> f6, Fn1<? super T7, ? extends R7> f7, Fn1<? super T8, ? extends R8> f8) {
        return this.map(IterativeInternals::identity, IterativeInternals::identity, f3, f4, f5, f6, f7, f8);
    }

    default public <R1, R2, R3, R4, R5, R6> Iterative8<R1, R2, R3, R4, R5, R6, T7, T8> mapLt6(Fn1<? super T1, ? extends R1> f1, Fn1<? super T2, ? extends R2> f2, Fn1<? super T3, ? extends R3> f3, Fn1<? super T4, ? extends R4> f4, Fn1<? super T5, ? extends R5> f5, Fn1<? super T6, ? extends R6> f6) {
        return this.map(f1, f2, f3, f4, f5, f6, IterativeInternals::identity, IterativeInternals::identity);
    }

    default public <R2, R3, R4, R5, R6, R7, R8> Iterative8<T1, R2, R3, R4, R5, R6, R7, R8> mapRt7(Fn1<? super T2, ? extends R2> f2, Fn1<? super T3, ? extends R3> f3, Fn1<? super T4, ? extends R4> f4, Fn1<? super T5, ? extends R5> f5, Fn1<? super T6, ? extends R6> f6, Fn1<? super T7, ? extends R7> f7, Fn1<? super T8, ? extends R8> f8) {
        return this.map(IterativeInternals::identity, f2, f3, f4, f5, f6, f7, f8);
    }

    default public <R1, R2, R3, R4, R5, R6, R7> Iterative8<R1, R2, R3, R4, R5, R6, R7, T8> mapLt7(Fn1<? super T1, ? extends R1> f1, Fn1<? super T2, ? extends R2> f2, Fn1<? super T3, ? extends R3> f3, Fn1<? super T4, ? extends R4> f4, Fn1<? super T5, ? extends R5> f5, Fn1<? super T6, ? extends R6> f6, Fn1<? super T7, ? extends R7> f7) {
        return this.map(f1, f2, f3, f4, f5, f6, f7, IterativeInternals::identity);
    }

    default public <R> Iterative8<R, T2, T3, T4, T5, T6, T7, T8> inlineMap1(Fn1<? super T1, ? extends Iterable<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.inlineMap(f, this::wrap, this::wrap, this::wrap, this::wrap, this::wrap, this::wrap, this::wrap);
    }

    default public <R> Iterative8<T1, R, T3, T4, T5, T6, T7, T8> inlineMap2(Fn1<? super T2, ? extends Iterable<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.inlineMap(this::wrap, f, this::wrap, this::wrap, this::wrap, this::wrap, this::wrap, this::wrap);
    }

    default public <R> Iterative8<T1, T2, R, T4, T5, T6, T7, T8> inlineMap3(Fn1<? super T3, ? extends Iterable<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.inlineMap(this::wrap, this::wrap, f, this::wrap, this::wrap, this::wrap, this::wrap, this::wrap);
    }

    default public <R> Iterative8<T1, T2, T3, R, T5, T6, T7, T8> inlineMap4(Fn1<? super T4, ? extends Iterable<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.inlineMap(this::wrap, this::wrap, this::wrap, f, this::wrap, this::wrap, this::wrap, this::wrap);
    }

    default public <R> Iterative8<T1, T2, T3, T4, R, T6, T7, T8> inlineMap5(Fn1<? super T5, ? extends Iterable<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.inlineMap(this::wrap, this::wrap, this::wrap, this::wrap, f, this::wrap, this::wrap, this::wrap);
    }

    default public <R> Iterative8<T1, T2, T3, T4, T5, R, T7, T8> inlineMap6(Fn1<? super T6, ? extends Iterable<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.inlineMap(this::wrap, this::wrap, this::wrap, this::wrap, this::wrap, f, this::wrap, this::wrap);
    }

    default public <R> Iterative8<T1, T2, T3, T4, T5, T6, R, T8> inlineMap7(Fn1<? super T7, ? extends Iterable<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.inlineMap(this::wrap, this::wrap, this::wrap, this::wrap, this::wrap, this::wrap, f, this::wrap);
    }

    default public <R> Iterative8<T1, T2, T3, T4, T5, T6, T7, R> inlineMap8(Fn1<? super T8, ? extends Iterable<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.inlineMap(this::wrap, this::wrap, this::wrap, this::wrap, this::wrap, this::wrap, this::wrap, f);
    }

    default public <R7, R8> Iterative8<T1, T2, T3, T4, T5, T6, R7, R8> inlineMapRt2(Fn1<? super T7, ? extends Iterable<? extends R7>> f7, Fn1<? super T8, ? extends Iterable<? extends R8>> f8) {
        return this.inlineMap(this::wrap, this::wrap, this::wrap, this::wrap, this::wrap, this::wrap, f7, f8);
    }

    default public <R1, R2> Iterative8<R1, R2, T3, T4, T5, T6, T7, T8> inlineMapLt2(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2) {
        return this.inlineMap(f1, f2, this::wrap, this::wrap, this::wrap, this::wrap, this::wrap, this::wrap);
    }

    default public <R6, R7, R8> Iterative8<T1, T2, T3, T4, T5, R6, R7, R8> inlineMapRt3(Fn1<? super T6, ? extends Iterable<? extends R6>> f6, Fn1<? super T7, ? extends Iterable<? extends R7>> f7, Fn1<? super T8, ? extends Iterable<? extends R8>> f8) {
        return this.inlineMap(this::wrap, this::wrap, this::wrap, this::wrap, this::wrap, f6, f7, f8);
    }

    default public <R1, R2, R3> Iterative8<R1, R2, R3, T4, T5, T6, T7, T8> inlineMapLt3(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3) {
        return this.inlineMap(f1, f2, f3, this::wrap, this::wrap, this::wrap, this::wrap, this::wrap);
    }

    default public <R5, R6, R7, R8> Iterative8<T1, T2, T3, T4, R5, R6, R7, R8> inlineMapRt4(Fn1<? super T5, ? extends Iterable<? extends R5>> f5, Fn1<? super T6, ? extends Iterable<? extends R6>> f6, Fn1<? super T7, ? extends Iterable<? extends R7>> f7, Fn1<? super T8, ? extends Iterable<? extends R8>> f8) {
        return this.inlineMap(this::wrap, this::wrap, this::wrap, this::wrap, f5, f6, f7, f8);
    }

    default public <R1, R2, R3, R4> Iterative8<R1, R2, R3, R4, T5, T6, T7, T8> inlineMapLt4(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4) {
        return this.inlineMap(f1, f2, f3, f4, this::wrap, this::wrap, this::wrap, this::wrap);
    }

    default public <R4, R5, R6, R7, R8> Iterative8<T1, T2, T3, R4, R5, R6, R7, R8> inlineMapRt5(Fn1<? super T4, ? extends Iterable<? extends R4>> f4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5, Fn1<? super T6, ? extends Iterable<? extends R6>> f6, Fn1<? super T7, ? extends Iterable<? extends R7>> f7, Fn1<? super T8, ? extends Iterable<? extends R8>> f8) {
        return this.inlineMap(this::wrap, this::wrap, this::wrap, f4, f5, f6, f7, f8);
    }

    default public <R1, R2, R3, R4, R5> Iterative8<R1, R2, R3, R4, R5, T6, T7, T8> inlineMapLt5(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5) {
        return this.inlineMap(f1, f2, f3, f4, f5, this::wrap, this::wrap, this::wrap);
    }

    default public <R3, R4, R5, R6, R7, R8> Iterative8<T1, T2, R3, R4, R5, R6, R7, R8> inlineMapRt6(Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5, Fn1<? super T6, ? extends Iterable<? extends R6>> f6, Fn1<? super T7, ? extends Iterable<? extends R7>> f7, Fn1<? super T8, ? extends Iterable<? extends R8>> f8) {
        return this.inlineMap(this::wrap, this::wrap, f3, f4, f5, f6, f7, f8);
    }

    default public <R1, R2, R3, R4, R5, R6> Iterative8<R1, R2, R3, R4, R5, R6, T7, T8> inlineMapLt6(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5, Fn1<? super T6, ? extends Iterable<? extends R6>> f6) {
        return this.inlineMap(f1, f2, f3, f4, f5, f6, this::wrap, this::wrap);
    }

    default public <R2, R3, R4, R5, R6, R7, R8> Iterative8<T1, R2, R3, R4, R5, R6, R7, R8> inlineMapRt7(Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5, Fn1<? super T6, ? extends Iterable<? extends R6>> f6, Fn1<? super T7, ? extends Iterable<? extends R7>> f7, Fn1<? super T8, ? extends Iterable<? extends R8>> f8) {
        return this.inlineMap(this::wrap, f2, f3, f4, f5, f6, f7, f8);
    }

    default public <R1, R2, R3, R4, R5, R6, R7> Iterative8<R1, R2, R3, R4, R5, R6, R7, T8> inlineMapLt7(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5, Fn1<? super T6, ? extends Iterable<? extends R6>> f6, Fn1<? super T7, ? extends Iterable<? extends R7>> f7) {
        return this.inlineMap(f1, f2, f3, f4, f5, f6, f7, this::wrap);
    }

    default public <R> Iterative8<R, T2, T3, T4, T5, T6, T7, T8> flatMap1(Fn1<? super T1, ? extends Iterable<? extends R>> f) {
        return this.inlineMap1(f).forceFlat1();
    }

    default public <R> Iterative8<T1, R, T3, T4, T5, T6, T7, T8> flatMap2(Fn1<? super T2, ? extends Iterable<? extends R>> f) {
        return this.inlineMap2(f).forceFlat2();
    }

    default public <R> Iterative8<T1, T2, R, T4, T5, T6, T7, T8> flatMap3(Fn1<? super T3, ? extends Iterable<? extends R>> f) {
        return this.inlineMap3(f).forceFlat3();
    }

    default public <R> Iterative8<T1, T2, T3, R, T5, T6, T7, T8> flatMap4(Fn1<? super T4, ? extends Iterable<? extends R>> f) {
        return this.inlineMap4(f).forceFlat4();
    }

    default public <R> Iterative8<T1, T2, T3, T4, R, T6, T7, T8> flatMap5(Fn1<? super T5, ? extends Iterable<? extends R>> f) {
        return this.inlineMap5(f).forceFlat5();
    }

    default public <R> Iterative8<T1, T2, T3, T4, T5, R, T7, T8> flatMap6(Fn1<? super T6, ? extends Iterable<? extends R>> f) {
        return this.inlineMap6(f).forceFlat6();
    }

    default public <R> Iterative8<T1, T2, T3, T4, T5, T6, R, T8> flatMap7(Fn1<? super T7, ? extends Iterable<? extends R>> f) {
        return this.inlineMap7(f).forceFlat7();
    }

    default public <R> Iterative8<T1, T2, T3, T4, T5, T6, T7, R> flatMap8(Fn1<? super T8, ? extends Iterable<? extends R>> f) {
        return this.inlineMap8(f).forceFlat8();
    }

    default public <R7, R8> Iterative8<T1, T2, T3, T4, T5, T6, R7, R8> flatMapRt2(Fn1<? super T7, ? extends Iterable<? extends R7>> f7, Fn1<? super T8, ? extends Iterable<? extends R8>> f8) {
        return this.inlineMapRt2(f7, f8).forceFlat2();
    }

    default public <R1, R2> Iterative8<R1, R2, T3, T4, T5, T6, T7, T8> flatMapLt2(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2) {
        return this.inlineMapLt2(f1, f2).forceFlat2();
    }

    default public <R6, R7, R8> Iterative8<T1, T2, T3, T4, T5, R6, R7, R8> flatMapRt3(Fn1<? super T6, ? extends Iterable<? extends R6>> f6, Fn1<? super T7, ? extends Iterable<? extends R7>> f7, Fn1<? super T8, ? extends Iterable<? extends R8>> f8) {
        return this.inlineMapRt3(f6, f7, f8).forceFlat3();
    }

    default public <R1, R2, R3> Iterative8<R1, R2, R3, T4, T5, T6, T7, T8> flatMapLt3(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3) {
        return this.inlineMapLt3(f1, f2, f3).forceFlat3();
    }

    default public <R5, R6, R7, R8> Iterative8<T1, T2, T3, T4, R5, R6, R7, R8> flatMapRt4(Fn1<? super T5, ? extends Iterable<? extends R5>> f5, Fn1<? super T6, ? extends Iterable<? extends R6>> f6, Fn1<? super T7, ? extends Iterable<? extends R7>> f7, Fn1<? super T8, ? extends Iterable<? extends R8>> f8) {
        return this.inlineMapRt4(f5, f6, f7, f8).forceFlat4();
    }

    default public <R1, R2, R3, R4> Iterative8<R1, R2, R3, R4, T5, T6, T7, T8> flatMapLt4(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4) {
        return this.inlineMapLt4(f1, f2, f3, f4).forceFlat4();
    }

    default public <R4, R5, R6, R7, R8> Iterative8<T1, T2, T3, R4, R5, R6, R7, R8> flatMapRt5(Fn1<? super T4, ? extends Iterable<? extends R4>> f4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5, Fn1<? super T6, ? extends Iterable<? extends R6>> f6, Fn1<? super T7, ? extends Iterable<? extends R7>> f7, Fn1<? super T8, ? extends Iterable<? extends R8>> f8) {
        return this.inlineMapRt5(f4, f5, f6, f7, f8).forceFlat5();
    }

    default public <R1, R2, R3, R4, R5> Iterative8<R1, R2, R3, R4, R5, T6, T7, T8> flatMapLt5(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5) {
        return this.inlineMapLt5(f1, f2, f3, f4, f5).forceFlat5();
    }

    default public <R3, R4, R5, R6, R7, R8> Iterative8<T1, T2, R3, R4, R5, R6, R7, R8> flatMapRt6(Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5, Fn1<? super T6, ? extends Iterable<? extends R6>> f6, Fn1<? super T7, ? extends Iterable<? extends R7>> f7, Fn1<? super T8, ? extends Iterable<? extends R8>> f8) {
        return this.inlineMapRt6(f3, f4, f5, f6, f7, f8).forceFlat6();
    }

    default public <R1, R2, R3, R4, R5, R6> Iterative8<R1, R2, R3, R4, R5, R6, T7, T8> flatMapLt6(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5, Fn1<? super T6, ? extends Iterable<? extends R6>> f6) {
        return this.inlineMapLt6(f1, f2, f3, f4, f5, f6).forceFlat6();
    }

    default public <R2, R3, R4, R5, R6, R7, R8> Iterative8<T1, R2, R3, R4, R5, R6, R7, R8> flatMapRt7(Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5, Fn1<? super T6, ? extends Iterable<? extends R6>> f6, Fn1<? super T7, ? extends Iterable<? extends R7>> f7, Fn1<? super T8, ? extends Iterable<? extends R8>> f8) {
        return this.inlineMapRt7(f2, f3, f4, f5, f6, f7, f8).forceFlat7();
    }

    default public <R1, R2, R3, R4, R5, R6, R7> Iterative8<R1, R2, R3, R4, R5, R6, R7, T8> flatMapLt7(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5, Fn1<? super T6, ? extends Iterable<? extends R6>> f6, Fn1<? super T7, ? extends Iterable<? extends R7>> f7) {
        return this.inlineMapLt7(f1, f2, f3, f4, f5, f6, f7).forceFlat7();
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> filter1(Pr1<? super T1> p) {
        Objects.requireNonNull(p, "p is null");
        return this.filter(p, Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true));
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> filter2(Pr1<? super T2> p) {
        Objects.requireNonNull(p, "p is null");
        return this.filter(Pr1.value(true), p, Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true));
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> filter3(Pr1<? super T3> p) {
        Objects.requireNonNull(p, "p is null");
        return this.filter(Pr1.value(true), Pr1.value(true), p, Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true));
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> filter4(Pr1<? super T4> p) {
        Objects.requireNonNull(p, "p is null");
        return this.filter(Pr1.value(true), Pr1.value(true), Pr1.value(true), p, Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true));
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> filter5(Pr1<? super T5> p) {
        Objects.requireNonNull(p, "p is null");
        return this.filter(Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), p, Pr1.value(true), Pr1.value(true), Pr1.value(true));
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> filter6(Pr1<? super T6> p) {
        Objects.requireNonNull(p, "p is null");
        return this.filter(Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), p, Pr1.value(true), Pr1.value(true));
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> filter7(Pr1<? super T7> p) {
        Objects.requireNonNull(p, "p is null");
        return this.filter(Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), p, Pr1.value(true));
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> filter8(Pr1<? super T8> p) {
        Objects.requireNonNull(p, "p is null");
        return this.filter(Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), p);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> filterRt2(Pr1<? super T7> p7, Pr1<? super T8> p8) {
        return this.filter(Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), p7, p8);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> filterLt2(Pr1<? super T1> p1, Pr1<? super T2> p2) {
        return this.filter(p1, p2, Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true));
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> filterRt3(Pr1<? super T6> p6, Pr1<? super T7> p7, Pr1<? super T8> p8) {
        return this.filter(Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), p6, p7, p8);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> filterLt3(Pr1<? super T1> p1, Pr1<? super T2> p2, Pr1<? super T3> p3) {
        return this.filter(p1, p2, p3, Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true));
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> filterRt4(Pr1<? super T5> p5, Pr1<? super T6> p6, Pr1<? super T7> p7, Pr1<? super T8> p8) {
        return this.filter(Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), p5, p6, p7, p8);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> filterLt4(Pr1<? super T1> p1, Pr1<? super T2> p2, Pr1<? super T3> p3, Pr1<? super T4> p4) {
        return this.filter(p1, p2, p3, p4, Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true));
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> filterRt5(Pr1<? super T4> p4, Pr1<? super T5> p5, Pr1<? super T6> p6, Pr1<? super T7> p7, Pr1<? super T8> p8) {
        return this.filter(Pr1.value(true), Pr1.value(true), Pr1.value(true), p4, p5, p6, p7, p8);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> filterLt5(Pr1<? super T1> p1, Pr1<? super T2> p2, Pr1<? super T3> p3, Pr1<? super T4> p4, Pr1<? super T5> p5) {
        return this.filter(p1, p2, p3, p4, p5, Pr1.value(true), Pr1.value(true), Pr1.value(true));
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> filterRt6(Pr1<? super T3> p3, Pr1<? super T4> p4, Pr1<? super T5> p5, Pr1<? super T6> p6, Pr1<? super T7> p7, Pr1<? super T8> p8) {
        return this.filter(Pr1.value(true), Pr1.value(true), p3, p4, p5, p6, p7, p8);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> filterLt6(Pr1<? super T1> p1, Pr1<? super T2> p2, Pr1<? super T3> p3, Pr1<? super T4> p4, Pr1<? super T5> p5, Pr1<? super T6> p6) {
        return this.filter(p1, p2, p3, p4, p5, p6, Pr1.value(true), Pr1.value(true));
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> filterRt7(Pr1<? super T2> p2, Pr1<? super T3> p3, Pr1<? super T4> p4, Pr1<? super T5> p5, Pr1<? super T6> p6, Pr1<? super T7> p7, Pr1<? super T8> p8) {
        return this.filter(Pr1.value(true), p2, p3, p4, p5, p6, p7, p8);
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> filterLt7(Pr1<? super T1> p1, Pr1<? super T2> p2, Pr1<? super T3> p3, Pr1<? super T4> p4, Pr1<? super T5> p5, Pr1<? super T6> p6, Pr1<? super T7> p7) {
        return this.filter(p1, p2, p3, p4, p5, p6, p7, Pr1.value(true));
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceInlineFlat() {
        return Iterative.ofTuple8(this.yieldStream());
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceFlat1() {
        return this.create(this.splitLt7().forceFlat1(), this.iterableStream8());
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceFlat2() {
        return this.create(this.splitLt7().forceFlat2(), this.iterableStream8());
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceFlat3() {
        return this.create(this.splitLt7().forceFlat3(), this.iterableStream8());
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceFlat4() {
        return this.create(this.splitLt7().forceFlat4(), this.iterableStream8());
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceFlat5() {
        return this.create(this.splitLt7().forceFlat5(), this.iterableStream8());
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceFlat6() {
        return this.create(this.splitLt7().forceFlat6(), this.iterableStream8());
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceFlat7() {
        return this.create(this.splitLt7().forceFlat7(), this.iterableStream8());
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceFlat8() {
        return this.create(this.splitLt7(), IterativeHandler.streamWrap(this.iterable8()));
    }

    default public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceFlatAll() {
        return this.create(this.splitLt7().forceFlatAll(), IterativeHandler.streamWrap(this.iterable8()));
    }

    default public <R> R getOnSuccessOrNull(Fn1<? super Iterative8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>, ? extends R> f) {
        return this.getterOnSuccess(f).onFailure(Sp.empty());
    }

    default public <R> R getOnSuccessOrThrow(Fn1<? super Iterative8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>, ? extends R> f) {
        return this.<R>getterOnSuccess(Fn1.narrow(f)).onFailure(Fn0.<String, R>pass(IterativeGetter::throwableSupplier, "tuple").toSupplier());
    }

    default public Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> getOrElse(Sp<? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> s) {
        return this.getterOnSuccess().onFailure(s.afterApply(Tuple::narrow));
    }

    default public Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> getOrElse(Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8> t) {
        return this.getterOnSuccess().onFailure(Sp.value(Tuple.narrow(t)));
    }

    default public Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> getOrNull() {
        return this.getterOnSuccess().onFailure(Sp.empty());
    }

    default public Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> getOrThrow() {
        return this.getterOnSuccess().onFailure(Fn0.<String, Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>>pass(IterativeGetter::throwableSupplier, "tuple").toSupplier());
    }

    default public Iterative8Getter<T1, T2, T3, T4, T5, T6, T7, T8> getter() {
        return new Iterative8Getter.Iterative8GetterImpl<>(this);
    }

    default public Iterative8Getter.Iterative8Fail<T1, T2, T3, T4, T5, T6, T7, T8, Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> getterOnSuccess() {
        return this.getter().onSuccess();
    }

    default public <R> Iterative8Getter.Iterative8Fail<T1, T2, T3, T4, T5, T6, T7, T8, R> getterOnSuccess(R r) {
        return this.getter().onSuccess(r);
    }

    default public <R> Iterative8Getter.Iterative8Fail<T1, T2, T3, T4, T5, T6, T7, T8, R> getterOnSuccess(Sp<? extends R> s) {
        return this.getter().onSuccess(s);
    }

    default public <R> Iterative8Getter.Iterative8Fail<T1, T2, T3, T4, T5, T6, T7, T8, R> getterOnSuccess(Fn1<? super Iterative8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>, ? extends R> f) {
        return this.getter().onSuccess(f);
    }

    default public <R> Iterative8Getter.Iterative8Success<T1, T2, T3, T4, T5, T6, T7, T8, R> getterOnFailure(R r) {
        return this.getter().onFailure(r);
    }

    default public <R> Iterative8Getter.Iterative8Success<T1, T2, T3, T4, T5, T6, T7, T8, R> getterOnFailure(Sp<? extends R> s) {
        return this.getter().onFailure(s);
    }

    default public <R> Iterative8Getter.Iterative8Success<T1, T2, T3, T4, T5, T6, T7, T8, R> getterOnFailure(Fn1<? super Iterative8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>, ? extends R> f) {
        return this.getter().onFailure(f);
    }

    default public Iterative1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> reduce() {
        return this.reduce(Tuple::of);
    }

    default public <R> Iterative1<R> reduce(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.create(this.toTupleStream().map(Fn8.tuple(IterativeHandler::cross)).map(stream -> stream.map(Fn8.tuple(f))));
    }

    default public <R> Iterative7<T1, T2, T3, T4, T5, T6, R> reduceSimpleRt2(Fn2<? super T7, ? super T8, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.splitLt7().create(this.splitLt6(), this.splitRt2().reduce(f).iterableStream1());
    }

    default public <R> Iterative7<T1, T2, T3, T4, T5, T6, R> reduceChainRt2(Fn2<? super T7, ? super T8, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.splitLt7().create(this.splitLt6(), this.reduce((a1, a2, a3, a4, a5, a6, a7, a8) -> f.apply(a7, a8)).iterableStream1());
    }

    default public <R> Iterative7<R, T3, T4, T5, T6, T7, T8> reduceSimpleLt2(Fn2<? super T1, ? super T2, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.create(this.splitLt7().reduceSimpleLt2(f), this.iterableStream8());
    }

    default public <R> Iterative7<R, T3, T4, T5, T6, T7, T8> reduceChainLt2(Fn2<? super T1, ? super T2, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.reduceSimpleLt2(f);
    }

    default public <R> Iterative6<T1, T2, T3, T4, T5, R> reduceSimpleRt3(Fn3<? super T6, ? super T7, ? super T8, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.splitLt7().create(this.splitLt5(), this.splitRt3().reduce(f).iterableStream1());
    }

    default public <R> Iterative6<T1, T2, T3, T4, T5, R> reduceChainRt3(Fn3<? super T6, ? super T7, ? super T8, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.splitLt7().create(this.splitLt5(), this.reduce((a1, a2, a3, a4, a5, a6, a7, a8) -> f.apply(a6, a7, a8)).iterableStream1());
    }

    default public <R> Iterative6<R, T4, T5, T6, T7, T8> reduceSimpleLt3(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.create(this.splitLt7().reduceSimpleLt3(f), this.iterableStream8());
    }

    default public <R> Iterative6<R, T4, T5, T6, T7, T8> reduceChainLt3(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        return this.reduceSimpleLt3(f);
    }

    default public <R> Iterative5<T1, T2, T3, T4, R> reduceSimpleRt4(Fn4<? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.splitLt7().create(this.splitLt4(), this.splitRt4().reduce(f).iterableStream1());
    }

    default public <R> Iterative5<T1, T2, T3, T4, R> reduceChainRt4(Fn4<? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.splitLt7().create(this.splitLt4(), this.reduce((a1, a2, a3, a4, a5, a6, a7, a8) -> f.apply(a5, a6, a7, a8)).iterableStream1());
    }

    default public <R> Iterative5<R, T5, T6, T7, T8> reduceSimpleLt4(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.create(this.splitLt7().reduceSimpleLt4(f), this.iterableStream8());
    }

    default public <R> Iterative5<R, T5, T6, T7, T8> reduceChainLt4(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
        return this.reduceSimpleLt4(f);
    }

    default public <R> Iterative4<T1, T2, T3, R> reduceSimpleRt5(Fn5<? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.splitLt7().create(this.splitLt3(), this.splitRt5().reduce(f).iterableStream1());
    }

    default public <R> Iterative4<T1, T2, T3, R> reduceChainRt5(Fn5<? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.splitLt7().create(this.splitLt3(), this.reduce((a1, a2, a3, a4, a5, a6, a7, a8) -> f.apply(a4, a5, a6, a7, a8)).iterableStream1());
    }

    default public <R> Iterative4<R, T6, T7, T8> reduceSimpleLt5(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.create(this.splitLt7().reduceSimpleLt5(f), this.iterableStream8());
    }

    default public <R> Iterative4<R, T6, T7, T8> reduceChainLt5(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        return this.reduceSimpleLt5(f);
    }

    default public <R> Iterative3<T1, T2, R> reduceSimpleRt6(Fn6<? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.splitLt7().create(this.splitLt2(), this.splitRt6().reduce(f).iterableStream1());
    }

    default public <R> Iterative3<T1, T2, R> reduceChainRt6(Fn6<? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.splitLt7().create(this.splitLt2(), this.reduce((a1, a2, a3, a4, a5, a6, a7, a8) -> f.apply(a3, a4, a5, a6, a7, a8)).iterableStream1());
    }

    default public <R> Iterative3<R, T7, T8> reduceSimpleLt6(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.create(this.splitLt7().reduceSimpleLt6(f), this.iterableStream8());
    }

    default public <R> Iterative3<R, T7, T8> reduceChainLt6(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f) {
        return this.reduceSimpleLt6(f);
    }

    default public <R> Iterative2<T1, R> reduceSimpleRt7(Fn7<? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.splitLt7().create(this.splitLt1(), this.splitRt7().reduce(f).iterableStream1());
    }

    default public <R> Iterative2<T1, R> reduceChainRt7(Fn7<? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.splitLt7().create(this.splitLt1(), this.reduce((a1, a2, a3, a4, a5, a6, a7, a8) -> f.apply(a2, a3, a4, a5, a6, a7, a8)).iterableStream1());
    }

    default public <R> Iterative2<R, T8> reduceSimpleLt7(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.create(this.splitLt7().reduce(f), this.iterableStream8());
    }

    default public <R> Iterative2<R, T8> reduceChainLt7(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
        return this.reduceSimpleLt7(f);
    }

    default public IterativeSupplier.Iterative1Supplier7.TransformSupplier<T1, T2, T3, T4, T5, T6, T7, T8> iterativeSupplier() {
        return new IterativeSupplier.Iterative1Supplier7.Iterative1Supplier7Impl<>(this);
    }

    default public IterativeSupplier.Iterative1Supplier7.TransformSupplier<T1, T2, T3, T4, T5, T6, T7, T8> crossSupplierAllLt() {
        return new IterativeSupplier.Iterative1Supplier7.Iterative1Supplier7Impl<>(this.forceCrossAll());
    }

    default public IterativeSupplier.Iterative1Supplier7.TransformSupplier<T1, T2, T3, T4, T5, T6, T7, T8> inlineSupplierAllLt() {
        return new IterativeSupplier.Iterative1Supplier7.Iterative1Supplier7Impl<>(this.forceInlineAll());
    }

    default public IterativeSupplier.Iterative1Supplier7.TransformSupplier<T8, T1, T2, T3, T4, T5, T6, T7> crossSupplierAllRt() {
        return new IterativeSupplier.Iterative1Supplier7.Iterative1Supplier7Impl<>(this.forceCrossAll().popBack().pushFrontCrossBy(this.iterableStream8()));
    }

    default public IterativeSupplier.Iterative1Supplier7.TransformSupplier<T8, T1, T2, T3, T4, T5, T6, T7> inlineSupplierAllRt() {
        return new IterativeSupplier.Iterative1Supplier7.Iterative1Supplier7Impl<>(this.forceInlineAll().popBack().pushFrontInlineBy(this.iterableStream8()));
    }

    default public IterativeSupplier.Iterative1Supplier7.TransformSupplier<T1, T2, T3, T4, T5, T6, T7, T8> crossSupplierLt() {
        return new IterativeSupplier.Iterative1Supplier7.Iterative1Supplier7Impl<>(this.forceCross2());
    }

    default public IterativeSupplier.Iterative1Supplier7.TransformSupplier<T1, T2, T3, T4, T5, T6, T7, T8> inlineSupplierLt() {
        return new IterativeSupplier.Iterative1Supplier7.Iterative1Supplier7Impl<>(this.forceInline2());
    }

    default public IterativeSupplier.Iterative1Supplier7.TransformSupplier<T8, T1, T2, T3, T4, T5, T6, T7> crossSupplierRt() {
        return new IterativeSupplier.Iterative1Supplier7.Iterative1Supplier7Impl<>(this.popBack().pushFrontCrossBy(this.iterableStream8()));
    }

    default public IterativeSupplier.Iterative1Supplier7.TransformSupplier<T8, T1, T2, T3, T4, T5, T6, T7> inlineSupplierRt() {
        return new IterativeSupplier.Iterative1Supplier7.Iterative1Supplier7Impl<>(this.popBack().pushFrontInlineBy(this.iterableStream8()));
    }

    public static abstract class Iterative8Abstract<T1, T2, T3, T4, T5, T6, T7, T8> implements Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> {

        protected final Iterative7<T1, T2, T3, T4, T5, T6, T7> iterative;
        protected final Iterable<Stream<T8>> right;

        Iterative8Abstract(Iterative7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> iterative, Iterable<? extends T8> right) {
            Objects.requireNonNull(iterative, "iterative is null");
            Objects.requireNonNull(right, "right is null");
            this.iterative = Iterative.narrow(iterative);
            this.right = SimpleIterative.<T8>of(right).inlineMap(this::wrap).map(Stream::of).toIterable();
        }

        Iterative8Abstract(Iterative7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> iterative, Iterable<? extends Stream<? extends T8>> right, boolean ign) {
            Objects.requireNonNull(iterative, "iterative is null");
            Objects.requireNonNull(right, "right is null");
            this.iterative = Iterative.narrow(iterative);
            this.right = SimpleIterative.of(right).map(iter -> iter.flatMap(this::wrap));
        }

        @Override
        public Stream<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> toStream() {
            return this.toTupleStream().map(Fn8.tuple(IterativeHandler::cross)).flatMap(IterativeInternals::identityIterable);
        }

        @Override
        public Iterator<Iterable<?>> iterators() {
            return Iterator.concat(Stream.of(this.iterative.iterators()).append(Iterator.of(SimpleIterative.of(this.right).inlineMap(IterativeInternals::identityIterable).toIterable())));
        }

        @Override
        public Iterable<T1> iterable1() {
            return this.iterative.iterable1();
        }

        @Override
        public Iterable<T2> iterable2() {
            return this.iterative.iterable2();
        }

        @Override
        public Iterable<T3> iterable3() {
            return this.iterative.iterable3();
        }

        @Override
        public Iterable<T4> iterable4() {
            return this.iterative.iterable4();
        }

        @Override
        public Iterable<T5> iterable5() {
            return this.iterative.iterable5();
        }

        @Override
        public Iterable<T6> iterable6() {
            return this.iterative.iterable6();
        }

        @Override
        public Iterable<T7> iterable7() {
            return this.iterative.iterable7();
        }

        @Override
        public Iterable<T8> iterable8() {
            return SimpleIterative.of(this.right).inlineMap(IterativeInternals::identityIterable);
        }

        @Override
        public Iterable<Stream<T1>> iterableStream1() {
            return this.iterative.iterableStream1();
        }

        @Override
        public Iterable<Stream<T2>> iterableStream2() {
            return this.iterative.iterableStream2();
        }

        @Override
        public Iterable<Stream<T3>> iterableStream3() {
            return this.iterative.iterableStream3();
        }

        @Override
        public Iterable<Stream<T4>> iterableStream4() {
            return this.iterative.iterableStream4();
        }

        @Override
        public Iterable<Stream<T5>> iterableStream5() {
            return this.iterative.iterableStream5();
        }

        @Override
        public Iterable<Stream<T6>> iterableStream6() {
            return this.iterative.iterableStream6();
        }

        @Override
        public Iterable<Stream<T7>> iterableStream7() {
            return this.iterative.iterableStream7();
        }

        @Override
        public Iterable<Stream<T8>> iterableStream8() {
            return this.right;
        }

        @Override
        public Iterative7<T1, T2, T3, T4, T5, T6, T7> innerIterative() {
            return this.iterative;
        }

        @Override
        public Iterative1<T1> splitLt1() {
            return this.splitLt2().splitLt();
        }

        @Override
        public Iterative2<T1, T2> splitLt2() {
            return this.splitLt3().splitLt2();
        }

        @Override
        public Iterative3<T1, T2, T3> splitLt3() {
            return this.splitLt5().splitLt3();
        }

        @Override
        public Iterative4<T1, T2, T3, T4> splitLt4() {
            return this.splitLt5().splitLt4();
        }

        @Override
        public Iterative5<T1, T2, T3, T4, T5> splitLt5() {
            return this.splitLt6().splitLt5();
        }

        @Override
        public Iterative6<T1, T2, T3, T4, T5, T6> splitLt6() {
            return this.splitLt7().splitLt6();
        }

        @Override
        public Iterative7<T1, T2, T3, T4, T5, T6, T7> splitLt7() {
            return this.innerIterative();
        }

        @Override
        public Iterative1<T8> splitRt1() {
            return this.splitRt2().splitRt();
        }

        @Override
        public Iterative2<T7, T8> splitRt2() {
            return this.splitRt3().splitRt2();
        }

        @Override
        public Iterative3<T6, T7, T8> splitRt3() {
            return this.splitRt4().splitRt3();
        }

        @Override
        public Iterative4<T5, T6, T7, T8> splitRt4() {
            return this.splitRt5().splitRt4();
        }

        @Override
        public Iterative5<T4, T5, T6, T7, T8> splitRt5() {
            return this.splitRt6().splitRt5();
        }

        @Override
        public Iterative6<T3, T4, T5, T6, T7, T8> splitRt6() {
            return this.splitRt7().splitRt6();
        }

        @Override
        public Iterative7<T2, T3, T4, T5, T6, T7, T8> splitRt7() {
            return this.popFront();
        }

        @Override
        public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceCross2() {
            return this.create(this.iterative.forceCross2(), this.right);
        }

        @Override
        public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceCross3() {
            return this.create(this.iterative.forceCross3(), this.right);
        }

        @Override
        public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceCross4() {
            return this.create(this.iterative.forceCross4(), this.right);
        }

        @Override
        public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceCross5() {
            return this.create(this.iterative.forceCross5(), this.right);
        }

        @Override
        public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceCross6() {
            return this.create(this.iterative.forceCross6(), this.right);
        }

        @Override
        public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceCross7() {
            return this.create(this.iterative.forceCross7(), this.right);
        }

        @Override
        public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> forceCross8() {
            return this.createCross(this.iterative, this.right);
        }

        @Override
        public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> forceCrossAll() {
            return this.createCross(this.iterative.forceCrossAll(), this.right);
        }

        @Override
        public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceInline2() {
            return this.createInline(this.iterative.forceInline2(), this.right);
        }

        @Override
        public Iterative8Inline<T1, T2, T3, T4, T5, T6, T7, T8> forceInline3() {
            return this.createInline(this.iterative.forceInline3(), this.right);
        }

        @Override
        public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceInline4() {
            return this.createInline(this.iterative.forceInline4(), this.right);
        }

        @Override
        public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceInline5() {
            return this.createInline(this.iterative.forceInline5(), this.right);
        }

        @Override
        public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceInline6() {
            return this.createInline(this.iterative.forceInline6(), this.right);
        }

        @Override
        public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceInline7() {
            return this.createInline(this.iterative.forceInline7(), this.right);
        }

        @Override
        public Iterative8Inline<T1, T2, T3, T4, T5, T6, T7, T8> forceInline8() {
            return this.createInline(this.iterative, this.right);
        }

        @Override
        public Iterative8Inline<T1, T2, T3, T4, T5, T6, T7, T8> forceInlineAll() {
            return this.createInline(this.iterative.forceInlineAll(), this.right);
        }

        @Override
        public Iterative7<T1, T2, T3, T4, T5, T6, T7> popBack(Cs1<? super T8> c) {
            Objects.requireNonNull(c, "c is null");
            SimpleIterative.of(this.iterable8()).toIterable().forEach(c);
            return this.iterative;
        }

        @Override
        public Iterative7<T1, T2, T3, T4, T5, T6, T7> popBackChain(Cs1<? super T8> c) {
            Objects.requireNonNull(c, "c is null");
            this.toStream().forEach(Cs8.tuple(c.ignoring7Lt()));
            return this.splitLt7();
        }

        @Override
        public Iterative7<T2, T3, T4, T5, T6, T7, T8> popFront(Cs1<? super T1> c) {
            Objects.requireNonNull(c, "c is null");
            return this.create(this.iterative.popFront(c), this.iterableStream8());
        }

        @Override
        public Iterative6<T1, T2, T3, T4, T5, T6> popBack2(Cs2<? super T7, ? super T8> c) {
            Objects.requireNonNull(c, "c is null");
            this.splitRt2().forEach(c);
            return this.splitLt6();
        }

        @Override
        public Iterative6<T1, T2, T3, T4, T5, T6> popBackChain2(Cs2<? super T7, ? super T8> c) {
            Objects.requireNonNull(c, "c is null");
            this.toStream().forEach(Cs8.tuple(c.ignoring6Lt()));
            return this.splitLt6();
        }

        @Override
        public Iterative6<T3, T4, T5, T6, T7, T8> popFront2(Cs2<? super T1, ? super T2> c) {
            Objects.requireNonNull(c, "c is null");
            this.splitLt2().forEach(c);
            return this.splitRt6();
        }

        @Override
        public Iterative5<T1, T2, T3, T4, T5> popBack3(Cs3<? super T6, ? super T7, ? super T8> c) {
            Objects.requireNonNull(c, "c is null");
            this.splitRt3().forEach(c);
            return this.splitLt5();
        }

        @Override
        public Iterative5<T1, T2, T3, T4, T5> popBackChain3(Cs3<? super T6, ? super T7, ? super T8> c) {
            Objects.requireNonNull(c, "c is null");
            this.toStream().forEach(Cs8.tuple(c.ignoring5Lt()));
            return this.splitLt5();
        }

        @Override
        public Iterative5<T4, T5, T6, T7, T8> popFront3(Cs3<? super T1, ? super T2, ? super T3> c) {
            Objects.requireNonNull(c, "c is null");
            this.splitLt3().forEach(c);
            return this.splitRt5();
        }

        @Override
        public Iterative4<T1, T2, T3, T4> popBack4(Cs4<? super T5, ? super T6, ? super T7, ? super T8> c) {
            Objects.requireNonNull(c, "c is null");
            this.splitRt4().forEach(c);
            return this.splitLt4();
        }

        @Override
        public Iterative4<T1, T2, T3, T4> popBackChain4(Cs4<? super T5, ? super T6, ? super T7, ? super T8> c) {
            Objects.requireNonNull(c, "c is null");
            this.toStream().forEach(Cs8.tuple(c.ignoring4Lt()));
            return this.splitLt4();
        }

        @Override
        public Iterative4<T5, T6, T7, T8> popFront4(Cs4<? super T1, ? super T2, ? super T3, ? super T4> c) {
            Objects.requireNonNull(c, "c is null");
            this.splitLt4().forEach(c);
            return this.splitRt4();
        }

        @Override
        public Iterative3<T1, T2, T3> popBack5(Cs5<? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
            Objects.requireNonNull(c, "c is null");
            this.splitRt5().forEach(c);
            return this.splitLt3();
        }

        @Override
        public Iterative3<T1, T2, T3> popBackChain5(Cs5<? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
            Objects.requireNonNull(c, "c is null");
            this.toStream().forEach(Cs8.tuple(c.ignoring3Lt()));
            return this.splitLt3();
        }

        @Override
        public Iterative3<T6, T7, T8> popFront5(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
            Objects.requireNonNull(c, "c is null");
            this.splitLt5().forEach(c);
            return this.splitRt3();
        }

        @Override
        public Iterative2<T1, T2> popBack6(Cs6<? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
            Objects.requireNonNull(c, "c is null");
            this.splitRt6().forEach(c);
            return this.splitLt2();
        }

        @Override
        public Iterative2<T1, T2> popBackChain6(Cs6<? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
            Objects.requireNonNull(c, "c is null");
            this.toStream().forEach(Cs8.tuple(c.ignoring2Lt()));
            return this.splitLt2();
        }

        @Override
        public Iterative2<T7, T8> popFront6(Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c) {
            Objects.requireNonNull(c, "c is null");
            this.splitLt6().forEach(c);
            return this.splitRt2();
        }

        @Override
        public Iterative1<T1> popBack7(Cs7<? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
            Objects.requireNonNull(c, "c is null");
            this.splitRt7().forEach(c);
            return this.splitLt1();
        }

        @Override
        public Iterative1<T1> popBackChain7(Cs7<? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
            Objects.requireNonNull(c, "c is null");
            this.toStream().forEach(Cs8.tuple(c.ignoring1Lt()));
            return this.splitLt1();
        }

        @Override
        public Iterative1<T8> popFront7(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c) {
            Objects.requireNonNull(c, "c is null");
            this.splitLt7().forEach(c);
            return this.splitRt1();
        }

        @Override
        public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> nonNullable() {
            return this.isNullable() ? this.create(this.iterative, this.right) : this;
        }

        @Override
        public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> nullable() {
            return this.isNullable() ? this : this.create(this.iterative, this.right);
        }

        @Override
        public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceCleanEmpty1() {
            return this.create(this.iterative.forceCleanEmpty1(), this.right);
        }

        @Override
        public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceCleanEmpty2() {
            return this.create(this.iterative.forceCleanEmpty2(), this.right);
        }

        @Override
        public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceCleanEmpty3() {
            return this.create(this.iterative.forceCleanEmpty3(), this.right);
        }

        @Override
        public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceCleanEmpty4() {
            return this.create(this.iterative.forceCleanEmpty4(), this.right);
        }

        @Override
        public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceCleanEmpty5() {
            return this.create(this.iterative.forceCleanEmpty5(), this.right);
        }

        @Override
        public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceCleanEmpty6() {
            return this.create(this.iterative.forceCleanEmpty6(), this.right);
        }

        @Override
        public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceCleanEmpty7() {
            return this.create(this.iterative.forceCleanEmpty7(), this.right);
        }

        @Override
        public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceCleanEmpty8() {
            return this.create(this.iterative, IterativeHandler.clean(this.right));
        }

        @Override
        public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> forceCleanEmptyAll() {
            return this.create(this.iterative.forceCleanEmptyAll(), IterativeHandler.clean(this.right));
        }

        @Override
        public <R1, R2, R3, R4, R5, R6, R7, R8> Iterative8<R1, R2, R3, R4, R5, R6, R7, R8> map(Fn1<? super T1, ? extends R1> f1, Fn1<? super T2, ? extends R2> f2, Fn1<? super T3, ? extends R3> f3, Fn1<? super T4, ? extends R4> f4, Fn1<? super T5, ? extends R5> f5, Fn1<? super T6, ? extends R6> f6, Fn1<? super T7, ? extends R7> f7, Fn1<? super T8, ? extends R8> f8) {
            Objects.requireNonNull(f1, "f1 is null");
            Objects.requireNonNull(f2, "f2 is null");
            Objects.requireNonNull(f3, "f3 is null");
            Objects.requireNonNull(f4, "f4 is null");
            Objects.requireNonNull(f5, "f5 is null");
            Objects.requireNonNull(f6, "f6 is null");
            Objects.requireNonNull(f7, "f7 is null");
            Objects.requireNonNull(f8, "f8 is null");
            return this.create(this.iterative.map(f1, f2, f3, f4, f5, f6, f7), SimpleIterative.of(this.iterableStream8()).map(iter -> iter.<R8>map(f8).flatMap(this::wrap)).toIterable());
        }

        @Override
        public <R1, R2, R3, R4, R5, R6, R7, R8> Iterative8<R1, R2, R3, R4, R5, R6, R7, R8> inlineMap(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5, Fn1<? super T6, ? extends Iterable<? extends R6>> f6, Fn1<? super T7, ? extends Iterable<? extends R7>> f7, Fn1<? super T8, ? extends Iterable<? extends R8>> f8) {
            Objects.requireNonNull(f1, "f1 is null");
            Objects.requireNonNull(f2, "f2 is null");
            Objects.requireNonNull(f3, "f3 is null");
            Objects.requireNonNull(f4, "f4 is null");
            Objects.requireNonNull(f5, "f5 is null");
            Objects.requireNonNull(f6, "f6 is null");
            Objects.requireNonNull(f7, "f7 is null");
            Objects.requireNonNull(f8, "f8 is null");
            return this.create(this.iterative.inlineMap(f1, f2, f3, f4, f5, f6, f7), SimpleIterative.of(this.iterableStream8()).map(iter -> iter.<R8>flatMap(f8).flatMap(this::wrap)).toIterable());
        }

        @Override
        public Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> filter(Pr1<? super T1> p1, Pr1<? super T2> p2, Pr1<? super T3> p3, Pr1<? super T4> p4, Pr1<? super T5> p5, Pr1<? super T6> p6, Pr1<? super T7> p7, Pr1<? super T8> p8) {
            Objects.requireNonNull(p1, "p1 is null");
            Objects.requireNonNull(p2, "p2 is null");
            Objects.requireNonNull(p3, "p3 is null");
            Objects.requireNonNull(p4, "p4 is null");
            Objects.requireNonNull(p5, "p5 is null");
            Objects.requireNonNull(p6, "p6 is null");
            Objects.requireNonNull(p7, "p7 is null");
            Objects.requireNonNull(p8, "p8 is null");
            return this.create(this.iterative.filter(p1, p2, p3, p4, p5, p6, p7), SimpleIterative.of(this.iterableStream8()).map(iter -> iter.<T8>filter(p8).flatMap(this::wrap)).toIterable());
        }

        @Override
        public String toStringContent() {
            return Stream.of(this.innerIterative().toStringContent(), IterativeHandler.typeIndicator(this.isCross()), IterativeHandler.iterableStreamToString(this.iterableStream8(), 8)).mkString();
        }

        public String toString() {
            return IterativeHandler.iterativeHeader(8) + this.toStringContent();
        }

    }

}

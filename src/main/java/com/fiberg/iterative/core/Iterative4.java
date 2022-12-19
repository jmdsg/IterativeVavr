package com.fiberg.iterative.core;

import com.fiberg.iterative.core.Iterative;
import com.fiberg.iterative.core.Iterative1;
import com.fiberg.iterative.core.Iterative1Args;
import com.fiberg.iterative.core.Iterative2;
import com.fiberg.iterative.core.Iterative2Args;
import com.fiberg.iterative.core.Iterative3;
import com.fiberg.iterative.core.Iterative3Args;
import com.fiberg.iterative.core.Iterative4Args;
import com.fiberg.iterative.core.Iterative4Cross;
import com.fiberg.iterative.core.Iterative4Getter;
import com.fiberg.iterative.core.Iterative4Inline;
import com.fiberg.iterative.core.Iterative5;
import com.fiberg.iterative.core.Iterative5Cross;
import com.fiberg.iterative.core.Iterative5Inline;
import com.fiberg.iterative.core.Iterative6;
import com.fiberg.iterative.core.Iterative6Cross;
import com.fiberg.iterative.core.Iterative6Inline;
import com.fiberg.iterative.core.Iterative7;
import com.fiberg.iterative.core.Iterative7Cross;
import com.fiberg.iterative.core.Iterative7Inline;
import com.fiberg.iterative.core.Iterative8;
import com.fiberg.iterative.core.Iterative8Cross;
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
import com.fiberg.iterative.function.Fn0;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fn2;
import com.fiberg.iterative.function.Fn3;
import com.fiberg.iterative.function.Fn4;
import com.fiberg.iterative.function.Fnc4;
import com.fiberg.iterative.function.Pr1;
import com.fiberg.iterative.function.Pr4;
import com.fiberg.iterative.function.Rn;
import com.fiberg.iterative.function.Sp;
import io.vavr.Tuple;
import io.vavr.Tuple2;
import io.vavr.Tuple4;
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

public interface Iterative4<T1, T2, T3, T4> extends IterativeConstructor {

    public static final int CARDINALITY = 4;

    public static <T1, T2, T3, T4> Iterative4<T1, T2, T3, T4> empty() {
        return Iterative.empty4();
    }

    public static <T1, T2, T3, T4> Iterative4<T1, T2, T3, T4> emptyNullable() {
        return Iterative.nullable().empty4();
    }

    public static <T1, T2, T3, T4> Iterative4<T1, T2, T3, T4> narrow(Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4> iterative) {
        @SuppressWarnings("unchecked")
        final Iterative4<T1, T2, T3, T4> iter = (Iterative4<T1, T2, T3, T4>) iterative;
        return iter;
    }

    public String toStringContent();

    public Stream<Tuple4<Iterable<T1>, Iterable<T2>, Iterable<T3>, Iterable<T4>>> toTupleStream();

    public Stream<Tuple4<T1, T2, T3, T4>> toStream();

    public Iterative4<T1, T2, T3, T4> nonNullable();

    public Iterative4<T1, T2, T3, T4> nullable();

    public Iterable<T1> iterable1();

    public Iterable<T2> iterable2();

    public Iterable<T3> iterable3();

    public Iterable<T4> iterable4();

    public Iterable<Stream<T1>> iterableStream1();

    public Iterable<Stream<T2>> iterableStream2();

    public Iterable<Stream<T3>> iterableStream3();

    public Iterable<Stream<T4>> iterableStream4();

    public Iterative3<T1, T2, T3> innerIterative();

    public Iterative1<T1> splitLt1();

    public Iterative2<T1, T2> splitLt2();

    public Iterative3<T1, T2, T3> splitLt3();

    public Iterative1<T4> splitRt1();

    public Iterative2<T3, T4> splitRt2();

    public Iterative3<T2, T3, T4> splitRt3();

    public Iterative4<T1, T2, T3, T4> forceCross2();

    public Iterative4<T1, T2, T3, T4> forceCross3();

    public Iterative4Cross<T1, T2, T3, T4> forceCross4();

    public Iterative4Cross<T1, T2, T3, T4> forceCrossAll();

    public Iterative4<T1, T2, T3, T4> forceInline2();

    public Iterative4<T1, T2, T3, T4> forceInline3();

    public Iterative4Inline<T1, T2, T3, T4> forceInline4();

    public Iterative4Inline<T1, T2, T3, T4> forceInlineAll();

    public Iterative4<T1, T2, T3, T4> forceCleanEmpty1();

    public Iterative4<T1, T2, T3, T4> forceCleanEmpty2();

    public Iterative4<T1, T2, T3, T4> forceCleanEmpty3();

    public Iterative4<T1, T2, T3, T4> forceCleanEmpty4();

    public Iterative4<T1, T2, T3, T4> forceCleanEmptyAll();

    public <T5> Iterative5<T1, T2, T3, T4, T5> pushBackBy(Iterable<? extends Stream<? extends T5>> i1);

    public <T5> Iterative5Cross<T1, T2, T3, T4, T5> pushBackCrossBy(Iterable<? extends Stream<? extends T5>> i1);

    public <T5> Iterative5Inline<T1, T2, T3, T4, T5> pushBackInlineBy(Iterable<? extends Stream<? extends T5>> i1);

    public <T0> Iterative5<T0, T1, T2, T3, T4> pushFrontBy(Iterable<? extends Stream<? extends T0>> i1);

    public <T0> Iterative5<T0, T1, T2, T3, T4> pushFrontCrossBy(Iterable<? extends Stream<? extends T0>> i1);

    public <T0> Iterative5<T0, T1, T2, T3, T4> pushFrontInlineBy(Iterable<? extends Stream<? extends T0>> i1);

    public Iterative3<T1, T2, T3> popBack(Cs1<? super T4> c1);

    public Iterative3<T1, T2, T3> popBackChain(Cs1<? super T4> c1);

    public Iterative3<T2, T3, T4> popFront(Cs1<? super T1> c1);

    default public Iterative3<T1, T2, T3> popBack() {
        return this.popBack(Cs1.empty());
    }

    default public Iterative3<T2, T3, T4> popFront() {
        return this.popFront(Cs1.empty());
    }

    public Iterative2<T1, T2> popBack2(Cs2<? super T3, ? super T4> c1);

    public Iterative2<T1, T2> popBackChain2(Cs2<? super T3, ? super T4> c1);

    public Iterative2<T3, T4> popFront2(Cs2<? super T1, ? super T2> c1);

    default public Iterative2<T1, T2> popBack2(Cs1<? super T3> c3, Cs1<? super T4> c4) {
        return this.popBack(c4).popBack(c3);
    }

    default public Iterative2<T3, T4> popFront2(Cs1<? super T1> c1, Cs1<? super T2> c2) {
        return this.popFront(c1).popFront(c2);
    }

    default public Iterative2<T1, T2> popBack2() {
        return this.popBack2(Cs1.empty(), Cs1.empty());
    }

    default public Iterative2<T3, T4> popFront2() {
        return this.popFront2(Cs1.empty(), Cs1.empty());
    }

    public Iterative1<T1> popBack3(Cs3<? super T2, ? super T3, ? super T4> c1);

    public Iterative1<T1> popBackChain3(Cs3<? super T2, ? super T3, ? super T4> c1);

    public Iterative1<T4> popFront3(Cs3<? super T1, ? super T2, ? super T3> c1);

    default public Iterative1<T1> popBack3(Cs1<? super T2> c2, Cs1<? super T3> c3, Cs1<? super T4> c4) {
        return this.popBack(c4).popBack(c3).popBack(c2);
    }

    default public Iterative1<T4> popFront3(Cs1<? super T1> c1, Cs1<? super T2> c2, Cs1<? super T3> c3) {
        return this.popFront(c1).popFront(c2).popFront(c3);
    }

    default public Iterative1<T1> popBack3() {
        return this.popBack3(Cs1.empty(), Cs1.empty(), Cs1.empty());
    }

    default public Iterative1<T4> popFront3() {
        return this.popFront3(Cs1.empty(), Cs1.empty(), Cs1.empty());
    }

    public <R1, R2, R3, R4> Iterative4<R1, R2, R3, R4> map(Fn1<? super T1, ? extends R1> f1, Fn1<? super T2, ? extends R2> f2, Fn1<? super T3, ? extends R3> f3, Fn1<? super T4, ? extends R4> f4);

    public <R1, R2, R3, R4> Iterative4<R1, R2, R3, R4> inlineMap(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> i2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> i4);

    public Iterative4<T1, T2, T3, T4> filter(Pr1<? super T1> p1, Pr1<? super T2> p2, Pr1<? super T3> p3, Pr1<? super T4> p4);

    default public <R1, R2, R3, R4> Iterative4<R1, R2, R3, R4> flatMap(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4) {
        return this.inlineMap(f1, f2, f3, f4).forceFlatAll();
    }

    @Override
    default public Iterative4<T1, T2, T3, T4> onSuccess(Rn r) {
        return this.onSuccess(r.ignoring1());
    }

    @Override
    default public Iterative4<T1, T2, T3, T4> onFailure(Rn r) {
        return this.onFailure(r.ignoring1());
    }

    default public Iterative4<T1, T2, T3, T4> execute(Cs1<? super Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> c) {
        Objects.requireNonNull(c, "c is null");
        c.accept(this);
        return this;
    }

    default public Iterative4<T1, T2, T3, T4> onFailure(Cs1<? super Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> c) {
        Objects.requireNonNull(c, "c is null");
        this.toStream().toTry().recover(t -> null).filter(Objects::isNull).forEach(tuple -> c.accept(this));
        return this;
    }

    default public Iterative4<T1, T2, T3, T4> onSuccess(Cs1<? super Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> c) {
        Objects.requireNonNull(c, "c is null");
        this.toStream().headOption().forEach(tuple -> c.accept(this));
        return this;
    }

    default public Iterative4<T1, T2, T3, T4> onSuccessful(Cs4<? super T1, ? super T2, ? super T3, ? super T4> c) {
        return this.forEach(c);
    }

    default public Iterative4<T1, T2, T3, T4> recover1(T1 t1) {
        return this.splitLt3().recover1(t1).pushBackBy(this.iterableStream4());
    }

    default public Iterative4<T1, T2, T3, T4> recover1Of(Iterable<? extends T1> t1) {
        return this.splitLt3().recover1Of(t1).pushBackBy(this.iterableStream4());
    }

    default public Iterative4<T1, T2, T3, T4> recover1By(Iterable<? extends Stream<? extends T1>> t1) {
        return this.splitLt3().recover1By(t1).pushBackBy(this.iterableStream4());
    }

    default public Iterative4<T1, T2, T3, T4> recover2(T2 t2) {
        return this.splitLt3().recover2(t2).pushBackBy(this.iterableStream4());
    }

    default public Iterative4<T1, T2, T3, T4> recover2Of(Iterable<? extends T2> t2) {
        return this.splitLt3().recover2Of(t2).pushBackBy(this.iterableStream4());
    }

    default public Iterative4<T1, T2, T3, T4> recover2By(Iterable<? extends Stream<? extends T2>> t2) {
        return this.splitLt3().recover2By(t2).pushBackBy(this.iterableStream4());
    }

    default public Iterative4<T1, T2, T3, T4> recover3(T3 t3) {
        return this.splitLt3().recover3(t3).pushBackBy(this.iterableStream4());
    }

    default public Iterative4<T1, T2, T3, T4> recover3Of(Iterable<? extends T3> t3) {
        return this.splitLt3().recover3Of(t3).pushBackBy(this.iterableStream4());
    }

    default public Iterative4<T1, T2, T3, T4> recover3By(Iterable<? extends Stream<? extends T3>> t3) {
        return this.splitLt3().recover3By(t3).pushBackBy(this.iterableStream4());
    }

    default public Iterative4<T1, T2, T3, T4> recover4(T4 t4) {
        return this.splitRt1().isFailure() ? this.splitLt3().<T4>pushBack(t4) : this;
    }

    default public Iterative4<T1, T2, T3, T4> recover4Of(Iterable<? extends T4> t4) {
        return this.splitRt1().isFailure() ? this.splitLt3().<T4>pushBackOf(t4) : this;
    }

    default public Iterative4<T1, T2, T3, T4> recover4By(Iterable<? extends Stream<? extends T4>> t4) {
        return this.splitRt1().isFailure() ? this.splitLt3().<T4>pushBackBy(t4) : this;
    }

    default public Iterative4<T1, T2, T3, T4> forEach(Cs4<? super T1, ? super T2, ? super T3, ? super T4> c) {
        Objects.requireNonNull(c, "c is null");
        this.toStream().forEach(Cs4.tuple(c));
        return this;
    }

    default public Iterative4<T1, T2, T3, T4> forEach(Rn r) {
        return this.forEach(r.ignoring4());
    }

    default public Iterative4<T1, T2, T3, T4> forEach1(Cs1<? super T1> c) {
        return this.forEach(c.ignoring3Rt());
    }

    default public Iterative4<T1, T2, T3, T4> forEach2(Cs1<? super T2> c) {
        return this.forEach(c.ignoring2Rt().ignoring1Lt());
    }

    default public Iterative4<T1, T2, T3, T4> forEach3(Cs1<? super T3> c) {
        return this.forEach(c.ignoring1Rt().ignoring2Lt());
    }

    default public Iterative4<T1, T2, T3, T4> forEach4(Cs1<? super T4> c) {
        return this.forEach(c.ignoring3Lt());
    }

    default public Iterative4<T1, T2, T3, T4> forEachWhen1(Cs4<? super T1, ? super T2, ? super T3, ? super T4> c, Pr1<? super T1> p) {
        return this.forEachWhen(c, p, Pr1.value(true), Pr1.value(true), Pr1.value(true));
    }

    default public Iterative4<T1, T2, T3, T4> forEachWhen2(Cs4<? super T1, ? super T2, ? super T3, ? super T4> c, Pr1<? super T2> p) {
        return this.forEachWhen(c, Pr1.value(true), p, Pr1.value(true), Pr1.value(true));
    }

    default public Iterative4<T1, T2, T3, T4> forEachWhen3(Cs4<? super T1, ? super T2, ? super T3, ? super T4> c, Pr1<? super T3> p) {
        return this.forEachWhen(c, Pr1.value(true), Pr1.value(true), p, Pr1.value(true));
    }

    default public Iterative4<T1, T2, T3, T4> forEachWhen4(Cs4<? super T1, ? super T2, ? super T3, ? super T4> c, Pr1<? super T4> p) {
        return this.forEachWhen(c, Pr1.value(true), Pr1.value(true), Pr1.value(true), p);
    }

    default public Iterative4<T1, T2, T3, T4> forEachWhen(Cs4<? super T1, ? super T2, ? super T3, ? super T4> c, Pr1<? super T1> p1, Pr1<? super T2> p2, Pr1<? super T3> p3, Pr1<? super T4> p4) {
        Objects.requireNonNull(c, "c is null");
        Objects.requireNonNull(p1, "p1 is null");
        Objects.requireNonNull(p2, "p2 is null");
        Objects.requireNonNull(p3, "p3 is null");
        Objects.requireNonNull(p4, "p4 is null");
        this.filter(p1, p2, p3, p4).toStream().forEach(Cs4.tuple(c));
        return this;
    }

    default public Iterative4<T1, T2, T3, T4> forEachWhen(Cs4<? super T1, ? super T2, ? super T3, ? super T4> c, Pr4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        Objects.requireNonNull(c, "c is null");
        Objects.requireNonNull(p, "p is null");
        this.toStream().filter(Pr4.tuple(p)).forEach(Cs4.tuple(c));
        return this;
    }

    default public Iterative4<T1, T2, T3, T4> forEach1When(Cs1<? super T1> c, Pr1<? super T1> p) {
        return this.forEachWhen1(c.ignoring3Rt(), p);
    }

    default public Iterative4<T1, T2, T3, T4> forEach2When(Cs1<? super T2> c, Pr1<? super T2> p) {
        return this.forEachWhen2(c.ignoring2Rt().ignoring1Lt(), p);
    }

    default public Iterative4<T1, T2, T3, T4> forEach3When(Cs1<? super T3> c, Pr1<? super T3> p) {
        return this.forEachWhen3(c.ignoring1Rt().ignoring2Lt(), p);
    }

    default public Iterative4<T1, T2, T3, T4> forEach4When(Cs1<? super T4> c, Pr1<? super T4> p) {
        return this.forEachWhen4(c.ignoring3Lt(), p);
    }

    default public Iterative4<T1, T2, T3, T4> replace1When(Fn1<? super T1, ? extends T1> f, Pr1<? super T1> p) {
        return this.map1(t -> p.test(t) ? f.apply(t) : t);
    }

    default public Iterative4<T1, T2, T3, T4> replace1When(Sp<? extends T1> s, Pr1<? super T1> p) {
        return this.replace1When(s.toFunction().ignoring1(), p);
    }

    default public Iterative4<T1, T2, T3, T4> replace1When(T1 t, Pr1<? super T1> p) {
        return this.replace1When(Fn1.value(t), p);
    }

    default public Iterative4<T1, T2, T3, T4> replace2When(Fn1<? super T2, ? extends T2> f, Pr1<? super T2> p) {
        return this.map2(t -> p.test(t) ? f.apply(t) : t);
    }

    default public Iterative4<T1, T2, T3, T4> replace2When(Sp<? extends T2> s, Pr1<? super T2> p) {
        return this.replace2When(s.toFunction().ignoring1(), p);
    }

    default public Iterative4<T1, T2, T3, T4> replace2When(T2 t, Pr1<? super T2> p) {
        return this.replace2When(Fn1.value(t), p);
    }

    default public Iterative4<T1, T2, T3, T4> replace3When(Fn1<? super T3, ? extends T3> f, Pr1<? super T3> p) {
        return this.map3(t -> p.test(t) ? f.apply(t) : t);
    }

    default public Iterative4<T1, T2, T3, T4> replace3When(Sp<? extends T3> s, Pr1<? super T3> p) {
        return this.replace3When(s.toFunction().ignoring1(), p);
    }

    default public Iterative4<T1, T2, T3, T4> replace3When(T3 t, Pr1<? super T3> p) {
        return this.replace3When(Fn1.value(t), p);
    }

    default public Iterative4<T1, T2, T3, T4> replace4When(Fn1<? super T4, ? extends T4> f, Pr1<? super T4> p) {
        return this.map4(t -> p.test(t) ? f.apply(t) : t);
    }

    default public Iterative4<T1, T2, T3, T4> replace4When(Sp<? extends T4> s, Pr1<? super T4> p) {
        return this.replace4When(s.toFunction().ignoring1(), p);
    }

    default public Iterative4<T1, T2, T3, T4> replace4When(T4 t, Pr1<? super T4> p) {
        return this.replace4When(Fn1.value(t), p);
    }

    default public Iterable<Tuple4<T1, T2, T3, T4>> yield() {
        return this.yield(Tuple::of);
    }

    default public <R> Iterable<R> yield(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.toStream().map(Fn4.tuple(f)).flatMap(this::wrap);
    }

    default public Stream<Tuple4<T1, T2, T3, T4>> yieldStream() {
        return this.yieldStream(Tuple::of);
    }

    default public <R> Stream<R> yieldStream(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.toStream().map(Fn4.tuple(f)).flatMap(this::wrap);
    }

    default public <R> Stream<R> yieldFlatStream(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends Iterable<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.yieldStream(f).flatMap(IterativeInternals::identity).flatMap(this::wrap);
    }

    default public Option<Tuple4<T1, T2, T3, T4>> yieldOption() {
        return this.yieldOption(Tuple::of);
    }

    default public <R> Option<R> yieldOption(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.toStream().headOption().map(Fn4.tuple(f)).flatMap(this::wrap);
    }

    default public <R> Option<R> yieldFlatOption(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends Option<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.yieldOption(f).flatMap(IterativeInternals::identity).flatMap(this::wrap);
    }

    default public Try<Tuple4<T1, T2, T3, T4>> yieldTry() {
        return this.yieldTry(Tuple::of);
    }

    default public <R> Try<R> yieldTry(Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.toStream().headOption().toTry().mapTry(Fnc4.tuple(f)).flatMap(this::wrapTry);
    }

    default public <R> Try<R> yieldFlatTry(Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends Try<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.yieldTry(f).flatMap(IterativeInternals::identity).flatMap(this::wrapTry);
    }

    default public Validation<Seq<Throwable>, Stream<Tuple4<T1, T2, T3, T4>>> validateStream() {
        return this.validateStream(Tuple::of);
    }

    default public <R> Validation<Seq<Throwable>, Stream<R>> validateStream(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldStream(f));
        }
        return Validation.invalid(failures);
    }

    default public <R> Validation<Seq<Throwable>, Stream<R>> validateFlatStream(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends Iterable<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldFlatStream(f));
        }
        return Validation.invalid(failures);
    }

    default public Validation<Seq<Throwable>, Option<Tuple4<T1, T2, T3, T4>>> validateOption() {
        return this.validateOption(Tuple::of);
    }

    default public <R> Validation<Seq<Throwable>, Option<R>> validateOption(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldOption(f));
        }
        return Validation.invalid(failures);
    }

    default public <R> Validation<Seq<Throwable>, Option<R>> validateFlatOption(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends Option<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldFlatOption(f));
        }
        return Validation.invalid(failures);
    }

    default public Validation<Seq<Throwable>, Try<Tuple4<T1, T2, T3, T4>>> validateTry() {
        return this.validateTry(Tuple::of);
    }

    default public <R> Validation<Seq<Throwable>, Try<R>> validateTry(Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldTry(f));
        }
        return Validation.invalid(failures);
    }

    default public <R> Validation<Seq<Throwable>, Try<R>> validateFlatTry(Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends Try<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldFlatTry(f));
        }
        return Validation.invalid(failures);
    }

    default public <R> Iterative4<R, T2, T3, T4> map1(Fn1<? super T1, ? extends R> f) {
        return this.map(f, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity);
    }

    default public <R> Iterative4<T1, R, T3, T4> map2(Fn1<? super T2, ? extends R> f) {
        return this.map(IterativeInternals::identity, f, IterativeInternals::identity, IterativeInternals::identity);
    }

    default public <R> Iterative4<T1, T2, R, T4> map3(Fn1<? super T3, ? extends R> f) {
        return this.map(IterativeInternals::identity, IterativeInternals::identity, f, IterativeInternals::identity);
    }

    default public <R> Iterative4<T1, T2, T3, R> map4(Fn1<? super T4, ? extends R> f) {
        return this.map(IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, f);
    }

    default public <R3, R4> Iterative4<T1, T2, R3, R4> mapRt2(Fn1<? super T3, ? extends R3> f3, Fn1<? super T4, ? extends R4> f4) {
        return this.map(IterativeInternals::identity, IterativeInternals::identity, f3, f4);
    }

    default public <R1, R2> Iterative4<R1, R2, T3, T4> mapLt2(Fn1<? super T1, ? extends R1> f1, Fn1<? super T2, ? extends R2> f2) {
        return this.map(f1, f2, IterativeInternals::identity, IterativeInternals::identity);
    }

    default public <R2, R3, R4> Iterative4<T1, R2, R3, R4> mapRt3(Fn1<? super T2, ? extends R2> f2, Fn1<? super T3, ? extends R3> f3, Fn1<? super T4, ? extends R4> f4) {
        return this.map(IterativeInternals::identity, f2, f3, f4);
    }

    default public <R1, R2, R3> Iterative4<R1, R2, R3, T4> mapLt3(Fn1<? super T1, ? extends R1> f1, Fn1<? super T2, ? extends R2> f2, Fn1<? super T3, ? extends R3> f3) {
        return this.map(f1, f2, f3, IterativeInternals::identity);
    }

    default public <R> Iterative4<R, T2, T3, T4> inlineMap1(Fn1<? super T1, ? extends Iterable<? extends R>> f) {
        return this.inlineMap(f, this::wrap, this::wrap, this::wrap);
    }

    default public <R> Iterative4<T1, R, T3, T4> inlineMap2(Fn1<? super T2, ? extends Iterable<? extends R>> f) {
        return this.inlineMap(this::wrap, f, this::wrap, this::wrap);
    }

    default public <R> Iterative4<T1, T2, R, T4> inlineMap3(Fn1<? super T3, ? extends Iterable<? extends R>> f) {
        return this.inlineMap(this::wrap, this::wrap, f, this::wrap);
    }

    default public <R> Iterative4<T1, T2, T3, R> inlineMap4(Fn1<? super T4, ? extends Iterable<? extends R>> f) {
        return this.inlineMap(this::wrap, this::wrap, this::wrap, f);
    }

    default public <R3, R4> Iterative4<T1, T2, R3, R4> inlineMapRt2(Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4) {
        return this.inlineMap(this::wrap, this::wrap, f3, f4);
    }

    default public <R1, R2> Iterative4<R1, R2, T3, T4> inlineMapLt2(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2) {
        return this.inlineMap(f1, f2, this::wrap, this::wrap);
    }

    default public <R2, R3, R4> Iterative4<T1, R2, R3, R4> inlineMapRt3(Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4) {
        return this.inlineMap(this::wrap, f2, f3, f4);
    }

    default public <R1, R2, R3> Iterative4<R1, R2, R3, T4> inlineMapLt3(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3) {
        return this.inlineMap(f1, f2, f3, this::wrap);
    }

    default public <R> Iterative4<R, T2, T3, T4> flatMap1(Fn1<? super T1, ? extends Iterable<? extends R>> f) {
        return this.inlineMap1(f).forceFlat1();
    }

    default public <R> Iterative4<T1, R, T3, T4> flatMap2(Fn1<? super T2, ? extends Iterable<? extends R>> f) {
        return this.inlineMap2(f).forceFlat2();
    }

    default public <R> Iterative4<T1, T2, R, T4> flatMap3(Fn1<? super T3, ? extends Iterable<? extends R>> f) {
        return this.inlineMap3(f).forceFlat3();
    }

    default public <R> Iterative4<T1, T2, T3, R> flatMap4(Fn1<? super T4, ? extends Iterable<? extends R>> f) {
        return this.inlineMap4(f).forceFlat4();
    }

    default public <R3, R4> Iterative4<T1, T2, R3, R4> flatMapRt2(Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4) {
        return this.inlineMapRt2(f3, f4).forceFlat2();
    }

    default public <R1, R2> Iterative4<R1, R2, T3, T4> flatMapLt2(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2) {
        return this.inlineMapLt2(f1, f2).forceFlat2();
    }

    default public <R2, R3, R4> Iterative4<T1, R2, R3, R4> flatMapRt3(Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4) {
        return this.inlineMapRt3(f2, f3, f4).forceFlat3();
    }

    default public <R1, R2, R3> Iterative4<R1, R2, R3, T4> flatMapLt3(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3) {
        return this.inlineMapLt3(f1, f2, f3).forceFlat3();
    }

    default public Iterative4<T1, T2, T3, T4> filter1(Pr1<? super T1> p) {
        return this.filter(p, Pr1.value(true), Pr1.value(true), Pr1.value(true));
    }

    default public Iterative4<T1, T2, T3, T4> filter2(Pr1<? super T2> p) {
        return this.filter(Pr1.value(true), p, Pr1.value(true), Pr1.value(true));
    }

    default public Iterative4<T1, T2, T3, T4> filter3(Pr1<? super T3> p) {
        return this.filter(Pr1.value(true), Pr1.value(true), p, Pr1.value(true));
    }

    default public Iterative4<T1, T2, T3, T4> filter4(Pr1<? super T4> p) {
        return this.filter(Pr1.value(true), Pr1.value(true), Pr1.value(true), p);
    }

    default public Iterative4<T1, T2, T3, T4> filterRt2(Pr1<? super T3> p3, Pr1<? super T4> p4) {
        return this.filter(Pr1.value(true), Pr1.value(true), p3, p4);
    }

    default public Iterative4<T1, T2, T3, T4> filterLt2(Pr1<? super T1> p1, Pr1<? super T2> p2) {
        return this.filter(p1, p2, Pr1.value(true), Pr1.value(true));
    }

    default public Iterative4<T1, T2, T3, T4> filterRt3(Pr1<? super T2> p2, Pr1<? super T3> p3, Pr1<? super T4> p4) {
        return this.filter(Pr1.value(true), p2, p3, p4);
    }

    default public Iterative4<T1, T2, T3, T4> filterLt3(Pr1<? super T1> p1, Pr1<? super T2> p2, Pr1<? super T3> p3) {
        return this.filter(p1, p2, p3, Pr1.value(true));
    }

    default public <T5> Iterative5<T1, T2, T3, T4, T5> pushBackOf(Iterable<? extends T5> t5) {
        return this.pushBackBy(IterativeHandler.streamWrap(t5));
    }

    default public <T5> Iterative5Cross<T1, T2, T3, T4, T5> pushBackCrossOf(Iterable<? extends T5> t5) {
        return this.pushBackCrossBy(IterativeHandler.streamWrap(t5));
    }

    default public <T5> Iterative5Inline<T1, T2, T3, T4, T5> pushBackInlineOf(Iterable<? extends T5> t5) {
        return this.pushBackInlineBy(IterativeHandler.streamWrap(t5));
    }

    default public <T0> Iterative5<T0, T1, T2, T3, T4> pushFrontOf(Iterable<? extends T0> t0) {
        return this.pushFrontBy(IterativeHandler.streamWrap(t0));
    }

    default public <T0> Iterative5<T0, T1, T2, T3, T4> pushFrontCrossOf(Iterable<? extends T0> t0) {
        return this.pushFrontCrossBy(IterativeHandler.streamWrap(t0));
    }

    default public <T0> Iterative5<T0, T1, T2, T3, T4> pushFrontInlineOf(Iterable<? extends T0> t0) {
        return this.pushFrontInlineBy(IterativeHandler.streamWrap(t0));
    }

    default public <T5> Iterative5<T1, T2, T3, T4, T5> pushBack(T5 t5) {
        return this.pushBackOf(this.wrap(t5));
    }

    default public <T5> Iterative5Cross<T1, T2, T3, T4, T5> pushBackCross(T5 t5) {
        return this.pushBackCrossOf(this.wrap(t5));
    }

    default public <T5> Iterative5Inline<T1, T2, T3, T4, T5> pushBackInline(T5 t5) {
        return this.pushBackInlineOf(this.wrap(t5));
    }

    default public <T0> Iterative5<T0, T1, T2, T3, T4> pushFront(T0 t0) {
        return this.pushFrontOf(this.wrap(t0));
    }

    default public <T0> Iterative5<T0, T1, T2, T3, T4> pushFrontCross(T0 t0) {
        return this.pushFrontCrossOf(this.wrap(t0));
    }

    default public <T0> Iterative5<T0, T1, T2, T3, T4> pushFrontInline(T0 t0) {
        return this.pushFrontInlineOf(this.wrap(t0));
    }

    default public <B1, B2> Iterative6<T1, T2, T3, T4, B1, B2> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2) {
        return this.<B1>pushBackBy(b1).<B2>pushBackBy(b2);
    }

    default public <B1, B2> Iterative6Cross<T1, T2, T3, T4, B1, B2> pushBackCrossBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2) {
        return this.<B1>pushBackCrossBy(b1).<B2>pushBackCrossBy(b2);
    }

    default public <B1, B2> Iterative6Inline<T1, T2, T3, T4, B1, B2> pushBackInlineBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2) {
        return this.<B1>pushBackInlineBy(b1).<B2>pushBackInlineBy(b2);
    }

    default public <F1, F2> Iterative6<F1, F2, T1, T2, T3, T4> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return this.<F2>pushFrontBy(f2).<F1>pushFrontBy(f1);
    }

    default public <F1, F2> Iterative6<F1, F2, T1, T2, T3, T4> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return this.<F2>pushFrontCrossBy(f2).<F1>pushFrontCrossBy(f1);
    }

    default public <F1, F2> Iterative6<F1, F2, T1, T2, T3, T4> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return this.<F2>pushFrontInlineBy(f2).<F1>pushFrontInlineBy(f1);
    }

    default public <B1, B2> Iterative6<T1, T2, T3, T4, B1, B2> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2) {
        return this.<B1>pushBackOf(b1).<B2>pushBackOf(b2);
    }

    default public <B1, B2> Iterative6Cross<T1, T2, T3, T4, B1, B2> pushBackCrossOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2) {
        return this.<B1>pushBackCrossOf(b1).<B2>pushBackCrossOf(b2);
    }

    default public <B1, B2> Iterative6Inline<T1, T2, T3, T4, B1, B2> pushBackInlineOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2) {
        return this.<B1>pushBackInlineOf(b1).<B2>pushBackInlineOf(b2);
    }

    default public <F1, F2> Iterative6<F1, F2, T1, T2, T3, T4> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return this.<F2>pushFrontOf(f2).<F1>pushFrontOf(f1);
    }

    default public <F1, F2> Iterative6<F1, F2, T1, T2, T3, T4> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return this.<F2>pushFrontCrossOf(f2).<F1>pushFrontCrossOf(f1);
    }

    default public <F1, F2> Iterative6<F1, F2, T1, T2, T3, T4> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return this.<F2>pushFrontInlineOf(f2).<F1>pushFrontInlineOf(f1);
    }

    default public <B1, B2> Iterative6<T1, T2, T3, T4, B1, B2> pushBack(B1 b1, B2 b2) {
        return this.<B1>pushBack(b1).<B2>pushBack(b2);
    }

    default public <B1, B2> Iterative6Cross<T1, T2, T3, T4, B1, B2> pushBackCross(B1 b1, B2 b2) {
        return this.<B1>pushBackCross(b1).<B2>pushBackCross(b2);
    }

    default public <B1, B2> Iterative6Inline<T1, T2, T3, T4, B1, B2> pushBackInline(B1 b1, B2 b2) {
        return this.<B1>pushBackInline(b1).<B2>pushBackInline(b2);
    }

    default public <F1, F2> Iterative6<F1, F2, T1, T2, T3, T4> pushFront(F1 f1, F2 f2) {
        return this.<F2>pushFront(f2).<F1>pushFront(f1);
    }

    default public <F1, F2> Iterative6<F1, F2, T1, T2, T3, T4> pushFrontCross(F1 f1, F2 f2) {
        return this.<F2>pushFrontCross(f2).<F1>pushFrontCross(f1);
    }

    default public <F1, F2> Iterative6<F1, F2, T1, T2, T3, T4> pushFrontInline(F1 f1, F2 f2) {
        return this.<F2>pushFrontInline(f2).<F1>pushFrontInline(f1);
    }

    default public <B1, B2, B3> Iterative7<T1, T2, T3, T4, B1, B2, B3> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3) {
        return this.<B1>pushBackBy(b1).<B2>pushBackBy(b2).<B3>pushBackBy(b3);
    }

    default public <B1, B2, B3> Iterative7Cross<T1, T2, T3, T4, B1, B2, B3> pushBackCrossBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3) {
        return this.<B1>pushBackCrossBy(b1).<B2>pushBackCrossBy(b2).<B3>pushBackCrossBy(b3);
    }

    default public <B1, B2, B3> Iterative7Inline<T1, T2, T3, T4, B1, B2, B3> pushBackInlineBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3) {
        return this.<B1>pushBackInlineBy(b1).<B2>pushBackInlineBy(b2).<B3>pushBackInlineBy(b3);
    }

    default public <F1, F2, F3> Iterative7<F1, F2, F3, T1, T2, T3, T4> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3) {
        return this.<F3>pushFrontBy(f3).<F2>pushFrontBy(f2).<F1>pushFrontBy(f1);
    }

    default public <F1, F2, F3> Iterative7<F1, F2, F3, T1, T2, T3, T4> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3) {
        return this.<F3>pushFrontCrossBy(f3).<F2>pushFrontCrossBy(f2).<F1>pushFrontCrossBy(f1);
    }

    default public <F1, F2, F3> Iterative7<F1, F2, F3, T1, T2, T3, T4> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3) {
        return this.<F3>pushFrontInlineBy(f3).<F2>pushFrontInlineBy(f2).<F1>pushFrontInlineBy(f1);
    }

    default public <B1, B2, B3> Iterative7<T1, T2, T3, T4, B1, B2, B3> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3) {
        return this.<B1>pushBackOf(b1).<B2>pushBackOf(b2).<B3>pushBackOf(b3);
    }

    default public <B1, B2, B3> Iterative7Cross<T1, T2, T3, T4, B1, B2, B3> pushBackCrossOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3) {
        return this.<B1>pushBackCrossOf(b1).<B2>pushBackCrossOf(b2).<B3>pushBackCrossOf(b3);
    }

    default public <B1, B2, B3> Iterative7Inline<T1, T2, T3, T4, B1, B2, B3> pushBackInlineOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3) {
        return this.<B1>pushBackInlineOf(b1).<B2>pushBackInlineOf(b2).<B3>pushBackInlineOf(b3);
    }

    default public <F1, F2, F3> Iterative7<F1, F2, F3, T1, T2, T3, T4> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3) {
        return this.<F3>pushFrontOf(f3).<F2>pushFrontOf(f2).<F1>pushFrontOf(f1);
    }

    default public <F1, F2, F3> Iterative7<F1, F2, F3, T1, T2, T3, T4> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3) {
        return this.<F3>pushFrontCrossOf(f3).<F2>pushFrontCrossOf(f2).<F1>pushFrontCrossOf(f1);
    }

    default public <F1, F2, F3> Iterative7<F1, F2, F3, T1, T2, T3, T4> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3) {
        return this.<F3>pushFrontInlineOf(f3).<F2>pushFrontInlineOf(f2).<F1>pushFrontInlineOf(f1);
    }

    default public <B1, B2, B3> Iterative7<T1, T2, T3, T4, B1, B2, B3> pushBack(B1 b1, B2 b2, B3 b3) {
        return this.<B1>pushBack(b1).<B2>pushBack(b2).<B3>pushBack(b3);
    }

    default public <B1, B2, B3> Iterative7Cross<T1, T2, T3, T4, B1, B2, B3> pushBackCross(B1 b1, B2 b2, B3 b3) {
        return this.<B1>pushBackCross(b1).<B2>pushBackCross(b2).<B3>pushBackCross(b3);
    }

    default public <B1, B2, B3> Iterative7Inline<T1, T2, T3, T4, B1, B2, B3> pushBackInline(B1 b1, B2 b2, B3 b3) {
        return this.<B1>pushBackInline(b1).<B2>pushBackInline(b2).<B3>pushBackInline(b3);
    }

    default public <F1, F2, F3> Iterative7<F1, F2, F3, T1, T2, T3, T4> pushFront(F1 f1, F2 f2, F3 f3) {
        return this.<F3>pushFront(f3).<F2>pushFront(f2).<F1>pushFront(f1);
    }

    default public <F1, F2, F3> Iterative7<F1, F2, F3, T1, T2, T3, T4> pushFrontCross(F1 f1, F2 f2, F3 f3) {
        return this.<F3>pushFrontCross(f3).<F2>pushFrontCross(f2).<F1>pushFrontCross(f1);
    }

    default public <F1, F2, F3> Iterative7<F1, F2, F3, T1, T2, T3, T4> pushFrontInline(F1 f1, F2 f2, F3 f3) {
        return this.<F3>pushFrontInline(f3).<F2>pushFrontInline(f2).<F1>pushFrontInline(f1);
    }

    default public <B1, B2, B3, B4> Iterative8<T1, T2, T3, T4, B1, B2, B3, B4> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4) {
        return this.<B1>pushBackBy(b1).<B2>pushBackBy(b2).<B3>pushBackBy(b3).<B4>pushBackBy(b4);
    }

    default public <B1, B2, B3, B4> Iterative8Cross<T1, T2, T3, T4, B1, B2, B3, B4> pushBackCrossBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4) {
        return this.<B1>pushBackCrossBy(b1).<B2>pushBackCrossBy(b2).<B3>pushBackCrossBy(b3).<B4>pushBackCrossBy(b4);
    }

    default public <B1, B2, B3, B4> Iterative8Inline<T1, T2, T3, T4, B1, B2, B3, B4> pushBackInlineBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4) {
        return this.<B1>pushBackInlineBy(b1).<B2>pushBackInlineBy(b2).<B3>pushBackInlineBy(b3).<B4>pushBackInlineBy(b4);
    }

    default public <F1, F2, F3, F4> Iterative8<F1, F2, F3, F4, T1, T2, T3, T4> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4) {
        return this.<F4>pushFrontBy(f4).<F3>pushFrontBy(f3).<F2>pushFrontBy(f2).<F1>pushFrontBy(f1);
    }

    default public <F1, F2, F3, F4> Iterative8<F1, F2, F3, F4, T1, T2, T3, T4> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4) {
        return this.<F4>pushFrontCrossBy(f4).<F3>pushFrontCrossBy(f3).<F2>pushFrontCrossBy(f2).<F1>pushFrontCrossBy(f1);
    }

    default public <F1, F2, F3, F4> Iterative8<F1, F2, F3, F4, T1, T2, T3, T4> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4) {
        return this.<F4>pushFrontInlineBy(f4).<F3>pushFrontInlineBy(f3).<F2>pushFrontInlineBy(f2).<F1>pushFrontInlineBy(f1);
    }

    default public <B1, B2, B3, B4> Iterative8<T1, T2, T3, T4, B1, B2, B3, B4> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4) {
        return this.<B1>pushBackOf(b1).<B2>pushBackOf(b2).<B3>pushBackOf(b3).<B4>pushBackOf(b4);
    }

    default public <B1, B2, B3, B4> Iterative8Cross<T1, T2, T3, T4, B1, B2, B3, B4> pushBackCrossOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4) {
        return this.<B1>pushBackCrossOf(b1).<B2>pushBackCrossOf(b2).<B3>pushBackCrossOf(b3).<B4>pushBackCrossOf(b4);
    }

    default public <B1, B2, B3, B4> Iterative8Inline<T1, T2, T3, T4, B1, B2, B3, B4> pushBackInlineOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4) {
        return this.<B1>pushBackInlineOf(b1).<B2>pushBackInlineOf(b2).<B3>pushBackInlineOf(b3).<B4>pushBackInlineOf(b4);
    }

    default public <F1, F2, F3, F4> Iterative8<F1, F2, F3, F4, T1, T2, T3, T4> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4) {
        return this.<F4>pushFrontOf(f4).<F3>pushFrontOf(f3).<F2>pushFrontOf(f2).<F1>pushFrontOf(f1);
    }

    default public <F1, F2, F3, F4> Iterative8<F1, F2, F3, F4, T1, T2, T3, T4> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4) {
        return this.<F4>pushFrontCrossOf(f4).<F3>pushFrontCrossOf(f3).<F2>pushFrontCrossOf(f2).<F1>pushFrontCrossOf(f1);
    }

    default public <F1, F2, F3, F4> Iterative8<F1, F2, F3, F4, T1, T2, T3, T4> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4) {
        return this.<F4>pushFrontInlineOf(f4).<F3>pushFrontInlineOf(f3).<F2>pushFrontInlineOf(f2).<F1>pushFrontInlineOf(f1);
    }

    default public <B1, B2, B3, B4> Iterative8<T1, T2, T3, T4, B1, B2, B3, B4> pushBack(B1 b1, B2 b2, B3 b3, B4 b4) {
        return this.<B1>pushBack(b1).<B2>pushBack(b2).<B3>pushBack(b3).<B4>pushBack(b4);
    }

    default public <B1, B2, B3, B4> Iterative8Cross<T1, T2, T3, T4, B1, B2, B3, B4> pushBackCross(B1 b1, B2 b2, B3 b3, B4 b4) {
        return this.<B1>pushBackCross(b1).<B2>pushBackCross(b2).<B3>pushBackCross(b3).<B4>pushBackCross(b4);
    }

    default public <B1, B2, B3, B4> Iterative8Inline<T1, T2, T3, T4, B1, B2, B3, B4> pushBackInline(B1 b1, B2 b2, B3 b3, B4 b4) {
        return this.<B1>pushBackInline(b1).<B2>pushBackInline(b2).<B3>pushBackInline(b3).<B4>pushBackInline(b4);
    }

    default public <F1, F2, F3, F4> Iterative8<F1, F2, F3, F4, T1, T2, T3, T4> pushFront(F1 f1, F2 f2, F3 f3, F4 f4) {
        return this.<F4>pushFront(f4).<F3>pushFront(f3).<F2>pushFront(f2).<F1>pushFront(f1);
    }

    default public <F1, F2, F3, F4> Iterative8<F1, F2, F3, F4, T1, T2, T3, T4> pushFrontCross(F1 f1, F2 f2, F3 f3, F4 f4) {
        return this.<F4>pushFrontCross(f4).<F3>pushFrontCross(f3).<F2>pushFrontCross(f2).<F1>pushFrontCross(f1);
    }

    default public <F1, F2, F3, F4> Iterative8<F1, F2, F3, F4, T1, T2, T3, T4> pushFrontInline(F1 f1, F2 f2, F3 f3, F4 f4) {
        return this.<F4>pushFrontInline(f4).<F3>pushFrontInline(f3).<F2>pushFrontInline(f2).<F1>pushFrontInline(f1);
    }

    default public Iterative4<T1, T2, T3, T4> forceInlineFlat() {
        return Iterative.ofTuple4(this.yieldStream());
    }

    default public Iterative4<T1, T2, T3, T4> forceFlat1() {
        return this.create(this.splitLt3().forceFlat1(), this.iterableStream4());
    }

    default public Iterative4<T1, T2, T3, T4> forceFlat2() {
        return this.create(this.splitLt3().forceFlat2(), this.iterableStream4());
    }

    default public Iterative4<T1, T2, T3, T4> forceFlat3() {
        return this.create(this.splitLt3().forceFlat3(), this.iterableStream4());
    }

    default public Iterative4<T1, T2, T3, T4> forceFlat4() {
        return this.create(this.splitLt3(), IterativeHandler.streamWrap(this.iterable4()));
    }

    default public Iterative4<T1, T2, T3, T4> forceFlatAll() {
        return this.create(this.splitLt3().forceFlatAll(), IterativeHandler.streamWrap(this.iterable4()));
    }

    default public <R> R getOnSuccessOrNull(Fn1<? super Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4>, ? extends R> f) {
        return this.getterOnSuccess(f).onFailure(Sp.empty());
    }

    default public <R> R getOnSuccessOrThrow(Fn1<? super Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4>, ? extends R> f) {
        return this.<R>getterOnSuccess(Fn1.narrow(f)).onFailure(Fn0.<String, R>pass(IterativeGetter::throwableSupplier, "tuple").toSupplier());
    }

    default public Tuple4<T1, T2, T3, T4> getOrElse(Sp<? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> s) {
        return this.getterOnSuccess().onFailure(s.afterApply(Tuple::narrow));
    }

    default public Tuple4<T1, T2, T3, T4> getOrElse(Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4> t) {
        return this.getterOnSuccess().onFailure(Sp.value(Tuple.narrow(t)));
    }

    default public Tuple4<T1, T2, T3, T4> getOrNull() {
        return this.getterOnSuccess().onFailure(Sp.empty());
    }

    default public Tuple4<T1, T2, T3, T4> getOrThrow() {
        return this.getterOnSuccess().onFailure(Fn0.<String, Tuple4<T1, T2, T3, T4>>pass(IterativeGetter::throwableSupplier, "tuple").toSupplier());
    }

    default public Iterative4Getter<T1, T2, T3, T4> getter() {
        return new Iterative4Getter.Iterative4GetterImpl<>(this);
    }

    default public Iterative4Getter.Iterative4Fail<T1, T2, T3, T4, Tuple4<T1, T2, T3, T4>> getterOnSuccess() {
        return this.getter().onSuccess();
    }

    default public <R> Iterative4Getter.Iterative4Fail<T1, T2, T3, T4, R> getterOnSuccess(R r) {
        return this.getter().onSuccess(r);
    }

    default public <R> Iterative4Getter.Iterative4Fail<T1, T2, T3, T4, R> getterOnSuccess(Sp<? extends R> s) {
        return this.getter().onSuccess(s);
    }

    default public <R> Iterative4Getter.Iterative4Fail<T1, T2, T3, T4, R> getterOnSuccess(Fn1<? super Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4>, ? extends R> f) {
        return this.getter().onSuccess(f);
    }

    default public <R> Iterative4Getter.Iterative4Success<T1, T2, T3, T4, R> getterOnFailure(R r) {
        return this.getter().onFailure(r);
    }

    default public <R> Iterative4Getter.Iterative4Success<T1, T2, T3, T4, R> getterOnFailure(Sp<? extends R> s) {
        return this.getter().onFailure(s);
    }

    default public <R> Iterative4Getter.Iterative4Success<T1, T2, T3, T4, R> getterOnFailure(Fn1<? super Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4>, ? extends R> f) {
        return this.getter().onFailure(f);
    }

    default public Iterative1<Tuple4<T1, T2, T3, T4>> reduce() {
        return this.reduce(Tuple::of);
    }

    default public <R> Iterative1<R> reduce(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.create(this.toTupleStream().map(Fn4.tuple(IterativeHandler::cross)).map(stream -> stream.map(Fn4.tuple(f))));
    }

    default public <R> Iterative3<T1, T2, R> reduceSimpleRt2(Fn2<? super T3, ? super T4, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.splitLt3().create(this.splitLt2(), this.splitRt2().reduce(f).iterableStream1());
    }

    default public <R> Iterative3<T1, T2, R> reduceChainRt2(Fn2<? super T3, ? super T4, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.splitLt3().create(this.splitLt2(), this.reduce((a1, a2, a3, a4) -> f.apply(a3, a4)).iterableStream1());
    }

    default public <R> Iterative3<R, T3, T4> reduceSimpleLt2(Fn2<? super T1, ? super T2, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.create(this.splitLt3().reduceSimpleLt(f), this.iterableStream4());
    }

    default public <R> Iterative3<R, T3, T4> reduceChainLt2(Fn2<? super T1, ? super T2, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.reduceSimpleLt2(f);
    }

    default public <R> Iterative2<T1, R> reduceSimpleRt3(Fn3<? super T2, ? super T3, ? super T4, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.splitLt3().create(this.splitLt1(), this.splitRt3().reduce(f).iterableStream1());
    }

    default public <R> Iterative2<T1, R> reduceChainRt3(Fn3<? super T2, ? super T3, ? super T4, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.splitLt3().create(this.splitLt1(), this.reduce((a1, a2, a3, a4) -> f.apply(a2, a3, a4)).iterableStream1());
    }

    default public <R> Iterative2<R, T4> reduceSimpleLt3(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.create(this.splitLt3().reduce(f), this.iterableStream4());
    }

    default public <R> Iterative2<R, T4> reduceChainLt3(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        return this.reduceSimpleLt3(f);
    }

    default public <A1> Iterative4Args.Iterative4Args1<T1, T2, T3, T4, A1> crossArgs(A1 a1) {
        return this.crossArgsOf(this.wrap(a1));
    }

    default public <A1> Iterative4Args.Iterative4Args1<T1, T2, T3, T4, A1> crossArgsOf(Iterable<? extends A1> a1) {
        return new Iterative4Args.Iterative4Args1.Iterative4Args1Impl<>(this, this.accessBuilder().cross().of(a1), true);
    }

    default public <A1, A2> Iterative4Args.Iterative4Args2<T1, T2, T3, T4, A1, A2> crossArgs(A1 a1, A2 a2) {
        return this.crossArgsOf(this.wrap(a1), this.wrap(a2));
    }

    default public <A1, A2> Iterative4Args.Iterative4Args2<T1, T2, T3, T4, A1, A2> crossArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2) {
        return new Iterative4Args.Iterative4Args2.Iterative4Args2Impl<>(this, this.accessBuilder().cross().of(a1, a2), true);
    }

    default public <A1, A2, A3> Iterative4Args.Iterative4Args3<T1, T2, T3, T4, A1, A2, A3> crossArgs(A1 a1, A2 a2, A3 a3) {
        return this.crossArgsOf(this.wrap(a1), this.wrap(a2), this.wrap(a3));
    }

    default public <A1, A2, A3> Iterative4Args.Iterative4Args3<T1, T2, T3, T4, A1, A2, A3> crossArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3) {
        return new Iterative4Args.Iterative4Args3.Iterative4Args3Impl<>(this, this.accessBuilder().cross().of(a1, a2, a3), true);
    }

    default public <A1, A2, A3, A4> Iterative4Args.Iterative4Args4<T1, T2, T3, T4, A1, A2, A3, A4> crossArgs(A1 a1, A2 a2, A3 a3, A4 a4) {
        return this.crossArgsOf(this.wrap(a1), this.wrap(a2), this.wrap(a3), this.wrap(a4));
    }

    default public <A1, A2, A3, A4> Iterative4Args.Iterative4Args4<T1, T2, T3, T4, A1, A2, A3, A4> crossArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4) {
        return new Iterative4Args.Iterative4Args4.Iterative4Args4Impl<>(this, this.accessBuilder().cross().of(a1, a2, a3, a4), true);
    }

    default public <A1> Iterative4Args.Iterative4Args1<T1, T2, T3, T4, A1> inlineArgs(A1 a1) {
        return this.inlineArgsOf(this.wrap(a1));
    }

    default public <A1> Iterative4Args.Iterative4Args1<T1, T2, T3, T4, A1> inlineArgsOf(Iterable<? extends A1> a1) {
        return new Iterative4Args.Iterative4Args1.Iterative4Args1Impl<>(this, this.accessBuilder().inline().of(a1), false);
    }

    default public <A1, A2> Iterative4Args.Iterative4Args2<T1, T2, T3, T4, A1, A2> inlineArgs(A1 a1, A2 a2) {
        return this.inlineArgsOf(this.wrap(a1), this.wrap(a2));
    }

    default public <A1, A2> Iterative4Args.Iterative4Args2<T1, T2, T3, T4, A1, A2> inlineArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2) {
        return new Iterative4Args.Iterative4Args2.Iterative4Args2Impl<>(this, this.accessBuilder().inline().of(a1, a2), false);
    }

    default public <A1, A2, A3> Iterative4Args.Iterative4Args3<T1, T2, T3, T4, A1, A2, A3> inlineArgs(A1 a1, A2 a2, A3 a3) {
        return this.inlineArgsOf(this.wrap(a1), this.wrap(a2), this.wrap(a3));
    }

    default public <A1, A2, A3> Iterative4Args.Iterative4Args3<T1, T2, T3, T4, A1, A2, A3> inlineArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3) {
        return new Iterative4Args.Iterative4Args3.Iterative4Args3Impl<>(this, this.accessBuilder().inline().of(a1, a2, a3), false);
    }

    default public <A1, A2, A3, A4> Iterative4Args.Iterative4Args4<T1, T2, T3, T4, A1, A2, A3, A4> inlineArgs(A1 a1, A2 a2, A3 a3, A4 a4) {
        return this.inlineArgsOf(this.wrap(a1), this.wrap(a2), this.wrap(a3), this.wrap(a4));
    }

    default public <A1, A2, A3, A4> Iterative4Args.Iterative4Args4<T1, T2, T3, T4, A1, A2, A3, A4> inlineArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4) {
        return new Iterative4Args.Iterative4Args4.Iterative4Args4Impl<>(this, this.accessBuilder().inline().of(a1, a2, a3, a4), false);
    }

    default public Iterative3Args.Iterative3Args1<T1, T2, T3, T4> inlineArgsRt1() {
        return new Iterative3Args.Iterative3Args1.Iterative3Args1Impl<>(this.splitLt3(), this.splitRt1(), false);
    }

    default public Iterative3Args.Iterative3Args1<T2, T3, T4, T1> inlineArgsLt1() {
        return new Iterative3Args.Iterative3Args1.Iterative3Args1Impl<>(this.splitRt3(), this.splitLt1(), false);
    }

    default public Iterative3Args.Iterative3Args1<T1, T2, T3, T4> crossArgsRt1() {
        return new Iterative3Args.Iterative3Args1.Iterative3Args1Impl<>(this.splitLt3(), this.splitRt1(), true);
    }

    default public Iterative3Args.Iterative3Args1<T2, T3, T4, T1> crossArgsLt1() {
        return new Iterative3Args.Iterative3Args1.Iterative3Args1Impl<>(this.splitRt3(), this.splitLt1(), true);
    }

    default public Iterative2Args.Iterative2Args2<T1, T2, T3, T4> inlineArgsRt2() {
        return new Iterative2Args.Iterative2Args2.Iterative2Args2Impl<>(this.splitLt2(), this.splitRt2(), false);
    }

    default public Iterative2Args.Iterative2Args2<T3, T4, T1, T2> inlineArgsLt2() {
        return new Iterative2Args.Iterative2Args2.Iterative2Args2Impl<>(this.splitRt2(), this.splitLt2(), false);
    }

    default public Iterative2Args.Iterative2Args2<T1, T2, T3, T4> crossArgsRt2() {
        return new Iterative2Args.Iterative2Args2.Iterative2Args2Impl<>(this.splitLt2(), this.splitRt2(), true);
    }

    default public Iterative2Args.Iterative2Args2<T3, T4, T1, T2> crossArgsLt2() {
        return new Iterative2Args.Iterative2Args2.Iterative2Args2Impl<>(this.splitRt2(), this.splitLt2(), true);
    }

    default public Iterative1Args.Iterative1Args3<T1, T2, T3, T4> inlineArgsRt3() {
        return new Iterative1Args.Iterative1Args3.Iterative1Args3Impl<>(this.splitLt1(), this.splitRt3(), false);
    }

    default public Iterative1Args.Iterative1Args3<T4, T1, T2, T3> inlineArgsLt3() {
        return new Iterative1Args.Iterative1Args3.Iterative1Args3Impl<>(this.splitRt1(), this.splitLt3(), false);
    }

    default public Iterative1Args.Iterative1Args3<T1, T2, T3, T4> crossArgsRt3() {
        return new Iterative1Args.Iterative1Args3.Iterative1Args3Impl<>(this.splitLt1(), this.splitRt3(), true);
    }

    default public Iterative1Args.Iterative1Args3<T4, T1, T2, T3> crossArgsLt3() {
        return new Iterative1Args.Iterative1Args3.Iterative1Args3Impl<>(this.splitRt1(), this.splitLt3(), true);
    }

    default public IterativeSupplier.Iterative1Supplier3.TransformSupplier<T1, T2, T3, T4> iterativeSupplier() {
        return new IterativeSupplier.Iterative1Supplier3.Iterative1Supplier3Impl<>(this);
    }

    default public IterativeSupplier.Iterative1Supplier3.TransformSupplier<T1, T2, T3, T4> crossSupplierAllLt() {
        return new IterativeSupplier.Iterative1Supplier3.Iterative1Supplier3Impl<>(this.forceCrossAll());
    }

    default public IterativeSupplier.Iterative1Supplier3.TransformSupplier<T1, T2, T3, T4> inlineSupplierAllLt() {
        return new IterativeSupplier.Iterative1Supplier3.Iterative1Supplier3Impl<>(this.forceInlineAll());
    }

    default public IterativeSupplier.Iterative1Supplier3.TransformSupplier<T4, T1, T2, T3> crossSupplierAllRt() {
        return new IterativeSupplier.Iterative1Supplier3.Iterative1Supplier3Impl<>(this.forceCrossAll().popBack().pushFrontCrossBy(this.iterableStream4()));
    }

    default public IterativeSupplier.Iterative1Supplier3.TransformSupplier<T4, T1, T2, T3> inlineSupplierAllRt() {
        return new IterativeSupplier.Iterative1Supplier3.Iterative1Supplier3Impl<>(this.forceInlineAll().popBack().pushFrontInlineBy(this.iterableStream4()));
    }

    default public IterativeSupplier.Iterative1Supplier3.TransformSupplier<T1, T2, T3, T4> crossSupplierLt() {
        return new IterativeSupplier.Iterative1Supplier3.Iterative1Supplier3Impl<>(this.forceCross2());
    }

    default public IterativeSupplier.Iterative1Supplier3.TransformSupplier<T1, T2, T3, T4> inlineSupplierLt() {
        return new IterativeSupplier.Iterative1Supplier3.Iterative1Supplier3Impl<>(this.forceInline2());
    }

    default public IterativeSupplier.Iterative1Supplier3.TransformSupplier<T4, T1, T2, T3> crossSupplierRt() {
        return new IterativeSupplier.Iterative1Supplier3.Iterative1Supplier3Impl<>(this.popBack().pushFrontCrossBy(this.iterableStream4()));
    }

    default public IterativeSupplier.Iterative1Supplier3.TransformSupplier<T4, T1, T2, T3> inlineSupplierRt() {
        return new IterativeSupplier.Iterative1Supplier3.Iterative1Supplier3Impl<>(this.popBack().pushFrontInlineBy(this.iterableStream4()));
    }

    default public <A1> Iterative5<T1, T2, T3, T4, A1> crossJoinRt(Iterative1<? extends A1> iterative) {
        return this.createCross(this, iterative.iterableStream1());
    }

    default public <A1> Iterative5<A1, T1, T2, T3, T4> crossJoinLt(Iterative1<? extends A1> iterative) {
        return this.pushFrontCrossBy(iterative.iterableStream1());
    }

    default public <A1, A2> Iterative6<T1, T2, T3, T4, A1, A2> crossJoinRt(Iterative2<? extends A1, ? extends A2> iterative) {
        return this.create(this.crossJoinRt(iterative.splitLt()), iterative.iterableStream2(), iterative.isCross());
    }

    default public <A1, A2> Iterative6<A1, A2, T1, T2, T3, T4> crossJoinLt(Iterative2<? extends A1, ? extends A2> iterative) {
        return iterative.isCross() ? this.<A2>crossJoinLt(iterative.splitRt()).pushFrontCrossBy(iterative.iterableStream1()) : this.<A2>crossJoinLt(iterative.splitRt()).pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1, A2, A3> Iterative7<T1, T2, T3, T4, A1, A2, A3> crossJoinRt(Iterative3<? extends A1, ? extends A2, ? extends A3> iterative) {
        return this.create(this.crossJoinRt(iterative.splitLt2()), iterative.iterableStream3(), iterative.isCross());
    }

    default public <A1, A2, A3> Iterative7<A1, A2, A3, T1, T2, T3, T4> crossJoinLt(Iterative3<? extends A1, ? extends A2, ? extends A3> iterative) {
        return iterative.splitLt2().isCross() ? this.<A2, A3>crossJoinLt(iterative.splitRt2()).pushFrontCrossBy(iterative.iterableStream1()) : this.<A2, A3>crossJoinLt(iterative.splitRt2()).pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1, A2, A3, A4> Iterative8<T1, T2, T3, T4, A1, A2, A3, A4> crossJoinRt(Iterative4<? extends A1, ? extends A2, ? extends A3, ? extends A4> iterative) {
        return this.create(this.crossJoinRt(iterative.splitLt3()), iterative.iterableStream4(), iterative.isCross());
    }

    default public <A1, A2, A3, A4> Iterative8<A1, A2, A3, A4, T1, T2, T3, T4> crossJoinLt(Iterative4<? extends A1, ? extends A2, ? extends A3, ? extends A4> iterative) {
        return iterative.splitLt2().isCross() ? this.<A2, A3, A4>crossJoinLt(iterative.splitRt3()).pushFrontCrossBy(iterative.iterableStream1()) : this.<A2, A3, A4>crossJoinLt(iterative.splitRt3()).pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1> Iterative5<T1, T2, T3, T4, A1> inlineJoinRt(Iterative1<? extends A1> iterative) {
        return this.createInline(this, iterative.iterableStream1());
    }

    default public <A1> Iterative5<A1, T1, T2, T3, T4> inlineJoinLt(Iterative1<? extends A1> iterative) {
        return this.pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1, A2> Iterative6<T1, T2, T3, T4, A1, A2> inlineJoinRt(Iterative2<? extends A1, ? extends A2> iterative) {
        return this.create(this.inlineJoinRt(iterative.splitLt()), iterative.iterableStream2(), iterative.isCross());
    }

    default public <A1, A2> Iterative6<A1, A2, T1, T2, T3, T4> inlineJoinLt(Iterative2<? extends A1, ? extends A2> iterative) {
        return iterative.isCross() ? this.<A2>inlineJoinLt(iterative.splitRt()).pushFrontCrossBy(iterative.iterableStream1()) : this.<A2>inlineJoinLt(iterative.splitRt()).pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1, A2, A3> Iterative7<T1, T2, T3, T4, A1, A2, A3> inlineJoinRt(Iterative3<? extends A1, ? extends A2, ? extends A3> iterative) {
        return this.create(this.inlineJoinRt(iterative.splitLt2()), iterative.iterableStream3(), iterative.isCross());
    }

    default public <A1, A2, A3> Iterative7<A1, A2, A3, T1, T2, T3, T4> inlineJoinLt(Iterative3<? extends A1, ? extends A2, ? extends A3> iterative) {
        return iterative.splitLt2().isCross() ? this.<A2, A3>inlineJoinLt(iterative.splitRt2()).pushFrontCrossBy(iterative.iterableStream1()) : this.<A2, A3>inlineJoinLt(iterative.splitRt2()).pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1, A2, A3, A4> Iterative8<T1, T2, T3, T4, A1, A2, A3, A4> inlineJoinRt(Iterative4<? extends A1, ? extends A2, ? extends A3, ? extends A4> iterative) {
        return this.create(this.inlineJoinRt(iterative.splitLt3()), iterative.iterableStream4(), iterative.isCross());
    }

    default public <A1, A2, A3, A4> Iterative8<A1, A2, A3, A4, T1, T2, T3, T4> inlineJoinLt(Iterative4<? extends A1, ? extends A2, ? extends A3, ? extends A4> iterative) {
        return iterative.splitLt2().isCross() ? this.<A2, A3, A4>inlineJoinLt(iterative.splitRt3()).pushFrontCrossBy(iterative.iterableStream1()) : this.<A2, A3, A4>inlineJoinLt(iterative.splitRt3()).pushFrontInlineBy(iterative.iterableStream1());
    }

    public static abstract class Iterative4Abstract<T1, T2, T3, T4> implements Iterative4<T1, T2, T3, T4> {

        protected final Iterative3<T1, T2, T3> iterative;
        protected final Iterable<Stream<T4>> right;

        Iterative4Abstract(Iterative3<? extends T1, ? extends T2, ? extends T3> iterative, Iterable<? extends T4> right) {
            Objects.requireNonNull(iterative, "iterative is null");
            Objects.requireNonNull(right, "right is null");
            this.iterative = Iterative.narrow(iterative);
            this.right = SimpleIterative.<T4>of(right).inlineMap(this::wrap).map(Stream::of).toIterable();
        }

        Iterative4Abstract(Iterative3<? extends T1, ? extends T2, ? extends T3> iterative, Iterable<? extends Stream<? extends T4>> right, boolean ign) {
            Objects.requireNonNull(iterative, "iterative is null");
            Objects.requireNonNull(right, "right is null");
            this.iterative = Iterative.narrow(iterative);
            this.right = SimpleIterative.of(right).map(iter -> iter.flatMap(this::wrap));
        }

        @Override
        public Stream<Tuple4<T1, T2, T3, T4>> toStream() {
            return this.toTupleStream().map(Fn4.tuple(IterativeHandler::cross)).flatMap(IterativeInternals::identityIterable);
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
            return this.right;
        }

        @Override
        public Iterative3<T1, T2, T3> innerIterative() {
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
            return this.innerIterative();
        }

        @Override
        public Iterative1<T4> splitRt1() {
            return this.splitRt2().splitRt();
        }

        @Override
        public Iterative2<T3, T4> splitRt2() {
            return this.splitRt3().splitRt2();
        }

        @Override
        public Iterative3<T2, T3, T4> splitRt3() {
            return this.popFront();
        }

        @Override
        public Iterative4<T1, T2, T3, T4> forceCross2() {
            return this.create(this.iterative.forceCross2(), this.right);
        }

        @Override
        public Iterative4<T1, T2, T3, T4> forceCross3() {
            return this.create(this.iterative.forceCross3(), this.right);
        }

        @Override
        public Iterative4Cross<T1, T2, T3, T4> forceCross4() {
            return this.createCross(this.iterative, this.right);
        }

        @Override
        public Iterative4Cross<T1, T2, T3, T4> forceCrossAll() {
            return this.createCross(this.iterative.forceCrossAll(), this.right);
        }

        @Override
        public Iterative4<T1, T2, T3, T4> forceInline2() {
            return this.createInline(this.iterative.forceInline2(), this.right);
        }

        @Override
        public Iterative4Inline<T1, T2, T3, T4> forceInline3() {
            return this.createInline(this.iterative.forceInline3(), this.right);
        }

        @Override
        public Iterative4Inline<T1, T2, T3, T4> forceInline4() {
            return this.createInline(this.iterative, this.right);
        }

        @Override
        public Iterative4Inline<T1, T2, T3, T4> forceInlineAll() {
            return this.createInline(this.iterative.forceInlineAll(), this.right);
        }

        @Override
        public <T5> Iterative5<T1, T2, T3, T4, T5> pushBackBy(Iterable<? extends Stream<? extends T5>> t5) {
            return this.create(this, t5);
        }

        @Override
        public <T5> Iterative5Cross<T1, T2, T3, T4, T5> pushBackCrossBy(Iterable<? extends Stream<? extends T5>> t5) {
            return this.createCross(this, t5);
        }

        @Override
        public <T5> Iterative5Inline<T1, T2, T3, T4, T5> pushBackInlineBy(Iterable<? extends Stream<? extends T5>> t5) {
            return this.createInline(this, t5);
        }

        @Override
        public <T0> Iterative5<T0, T1, T2, T3, T4> pushFrontBy(Iterable<? extends Stream<? extends T0>> t0) {
            return this.create(this.iterative.<T0>pushFrontBy(t0), this.right);
        }

        @Override
        public <T0> Iterative5<T0, T1, T2, T3, T4> pushFrontCrossBy(Iterable<? extends Stream<? extends T0>> t0) {
            return this.create(this.iterative.<T0>pushFrontCrossBy(t0), this.right);
        }

        @Override
        public <T0> Iterative5<T0, T1, T2, T3, T4> pushFrontInlineBy(Iterable<? extends Stream<? extends T0>> t0) {
            return this.create(this.iterative.<T0>pushFrontInlineBy(t0), this.right);
        }

        @Override
        public Iterative3<T1, T2, T3> popBack(Cs1<? super T4> c) {
            Objects.requireNonNull(c, "c is null");
            SimpleIterative.of(this.iterable4()).toIterable().forEach(c);
            return this.iterative;
        }

        @Override
        public Iterative3<T1, T2, T3> popBackChain(Cs1<? super T4> c) {
            Objects.requireNonNull(c, "c is null");
            this.toStream().forEach(Cs4.tuple(c.ignoring3Lt()));
            return this.splitLt3();
        }

        @Override
        public Iterative3<T2, T3, T4> popFront(Cs1<? super T1> c) {
            Objects.requireNonNull(c, "c is null");
            return this.create(this.iterative.popFront(c), this.iterableStream4());
        }

        @Override
        public Iterative2<T1, T2> popBack2(Cs2<? super T3, ? super T4> c) {
            Objects.requireNonNull(c, "c is null");
            this.splitRt2().forEach(c);
            return this.splitLt2();
        }

        @Override
        public Iterative2<T1, T2> popBackChain2(Cs2<? super T3, ? super T4> c) {
            Objects.requireNonNull(c, "c is null");
            this.toStream().forEach(Cs4.tuple(c.ignoring2Lt()));
            return this.splitLt2();
        }

        @Override
        public Iterative2<T3, T4> popFront2(Cs2<? super T1, ? super T2> c) {
            Objects.requireNonNull(c, "c is null");
            this.splitLt2().forEach(c);
            return this.splitRt2();
        }

        @Override
        public Iterative1<T1> popBack3(Cs3<? super T2, ? super T3, ? super T4> c) {
            Objects.requireNonNull(c, "c is null");
            this.splitRt3().forEach(c);
            return this.splitLt1();
        }

        @Override
        public Iterative1<T1> popBackChain3(Cs3<? super T2, ? super T3, ? super T4> c) {
            Objects.requireNonNull(c, "c is null");
            this.toStream().forEach(Cs4.tuple(c.ignoring1Lt()));
            return this.splitLt1();
        }

        @Override
        public Iterative1<T4> popFront3(Cs3<? super T1, ? super T2, ? super T3> c) {
            Objects.requireNonNull(c, "c is null");
            this.splitLt3().forEach(c);
            return this.splitRt1();
        }

        @Override
        public Iterative4<T1, T2, T3, T4> nonNullable() {
            return this.isNullable() ? this.create(this.iterative, this.right) : this;
        }

        @Override
        public Iterative4<T1, T2, T3, T4> nullable() {
            return this.isNullable() ? this : this.create(this.iterative, this.right);
        }

        @Override
        public Iterative4<T1, T2, T3, T4> forceCleanEmpty1() {
            return this.create(this.iterative.forceCleanEmpty1(), this.right);
        }

        @Override
        public Iterative4<T1, T2, T3, T4> forceCleanEmpty2() {
            return this.create(this.iterative.forceCleanEmpty2(), this.right);
        }

        @Override
        public Iterative4<T1, T2, T3, T4> forceCleanEmpty3() {
            return this.create(this.iterative.forceCleanEmpty3(), this.right);
        }

        @Override
        public Iterative4<T1, T2, T3, T4> forceCleanEmpty4() {
            return this.create(this.iterative, IterativeHandler.clean(this.right));
        }

        @Override
        public Iterative4<T1, T2, T3, T4> forceCleanEmptyAll() {
            return this.create(this.iterative.forceCleanEmptyAll(), IterativeHandler.clean(this.right));
        }

        @Override
        public <R1, R2, R3, R4> Iterative4<R1, R2, R3, R4> map(Fn1<? super T1, ? extends R1> f1, Fn1<? super T2, ? extends R2> f2, Fn1<? super T3, ? extends R3> f3, Fn1<? super T4, ? extends R4> f4) {
            Objects.requireNonNull(f1, "f1 is null");
            Objects.requireNonNull(f2, "f2 is null");
            Objects.requireNonNull(f3, "f3 is null");
            Objects.requireNonNull(f4, "f4 is null");
            return this.create(this.iterative.map(f1, f2, f3), SimpleIterative.of(this.iterableStream4()).map(iter -> iter.<R4>map(f4).flatMap(this::wrap)).toIterable());
        }

        @Override
        public <R1, R2, R3, R4> Iterative4<R1, R2, R3, R4> inlineMap(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4) {
            Objects.requireNonNull(f1, "f1 is null");
            Objects.requireNonNull(f2, "f2 is null");
            Objects.requireNonNull(f3, "f3 is null");
            Objects.requireNonNull(f4, "f4 is null");
            return this.create(this.iterative.inlineMap(f1, f2, f3), SimpleIterative.of(this.iterableStream4()).map(iter -> iter.<R4>flatMap(f4).flatMap(this::wrap)).toIterable());
        }

        @Override
        public Iterative4<T1, T2, T3, T4> filter(Pr1<? super T1> p1, Pr1<? super T2> p2, Pr1<? super T3> p3, Pr1<? super T4> p4) {
            Objects.requireNonNull(p1, "p1 is null");
            Objects.requireNonNull(p2, "p2 is null");
            Objects.requireNonNull(p3, "p3 is null");
            Objects.requireNonNull(p4, "p4 is null");
            return this.create(this.iterative.filter(p1, p2, p3), SimpleIterative.of(this.iterableStream4()).map(iter -> iter.<T4>filter(p4).flatMap(this::wrap)).toIterable());
        }

        @Override
        public String toStringContent() {
            return Stream.of(this.innerIterative().toStringContent(), IterativeHandler.typeIndicator(this.isCross()), IterativeHandler.iterableStreamToString(this.iterableStream4(), 4)).mkString();
        }

        public String toString() {
            return IterativeHandler.iterativeHeader(4) + this.toStringContent();
        }

    }

}

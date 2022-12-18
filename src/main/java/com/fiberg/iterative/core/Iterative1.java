package com.fiberg.iterative.core;

import com.fiberg.iterative.core.Iterative;
import com.fiberg.iterative.core.Iterative0;
import com.fiberg.iterative.core.Iterative1Args;
import com.fiberg.iterative.core.Iterative1Getter;
import com.fiberg.iterative.core.Iterative2;
import com.fiberg.iterative.core.Iterative2Cross;
import com.fiberg.iterative.core.Iterative2Inline;
import com.fiberg.iterative.core.Iterative3;
import com.fiberg.iterative.core.Iterative3Cross;
import com.fiberg.iterative.core.Iterative3Inline;
import com.fiberg.iterative.core.Iterative4;
import com.fiberg.iterative.core.Iterative4Cross;
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
import com.fiberg.iterative.core.IterativeWrapper;
import com.fiberg.iterative.core.SimpleIterative;
import com.fiberg.iterative.function.Cs1;
import com.fiberg.iterative.function.Fn0;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fnc1;
import com.fiberg.iterative.function.Pr1;
import com.fiberg.iterative.function.Rn;
import com.fiberg.iterative.function.Sp;
import io.vavr.Tuple;
import io.vavr.Tuple1;
import io.vavr.Tuple2;
import io.vavr.Tuple3;
import io.vavr.Tuple4;
import io.vavr.Tuple5;
import io.vavr.Tuple6;
import io.vavr.Tuple7;
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

public interface Iterative1<T1> extends IterativeConstructor {

    public static final int CARDINALITY = 1;

    public static <T1> Iterative1<T1> empty() {
        return Iterative.empty1();
    }

    public static <T1> Iterative1<T1> emptyNullable() {
        return Iterative.nullable().empty1();
    }

    public String toStringContent();

    public Iterable<T1> iterable1();

    public Iterable<Stream<T1>> iterableStream1();

    public Stream<Tuple1<Iterable<T1>>> toTupleStream();

    public Stream<Tuple1<T1>> toStream();

    @Override
    public Iterative1<T1> onSuccess(Rn var1);

    @Override
    public Iterative1<T1> onFailure(Rn var1);

    public Iterative1<T1> nonNullable();

    public Iterative1<T1> nullable();

    public <T2> Iterative2Cross<T1, T2> pushBackBy(Iterable<? extends Stream<? extends T2>> var1);

    public <T2> Iterative2Cross<T1, T2> pushBackCrossBy(Iterable<? extends Stream<? extends T2>> var1);

    public <T2> Iterative2Inline<T1, T2> pushBackInlineBy(Iterable<? extends Stream<? extends T2>> var1);

    public <T0> Iterative2Cross<T0, T1> pushFrontBy(Iterable<? extends Stream<? extends T0>> var1);

    public <T0> Iterative2Cross<T0, T1> pushFrontCrossBy(Iterable<? extends Stream<? extends T0>> var1);

    public <T0> Iterative2Inline<T0, T1> pushFrontInlineBy(Iterable<? extends Stream<? extends T0>> var1);

    public <R1> Iterative1<R1> map(Fn1<? super T1, ? extends R1> var1);

    public <R1> Iterative1<R1> inlineMap(Fn1<? super T1, ? extends Iterable<? extends R1>> var1);

    public Iterative1<T1> filter(Pr1<? super T1> var1);

    default public <R1> Iterative1<R1> flatMap(Fn1<? super T1, ? extends Iterable<? extends R1>> f1) {
        return this.inlineMap(f1).forceFlatAll();
    }

    default public Iterable<T1> yield() {
        return this.yield(IterativeInternals::entity);
    }

    default public <R> Iterable<R> yield(Fn1<? super T1, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.toStream().map(Fn1.tuple(f)).flatMap(this::wrap);
    }

    default public Stream<T1> yieldStream() {
        return this.yieldStream((Fn1 & Serializable) x -> x);
    }

    default public <R> Stream<R> yieldStream(Fn1<? super T1, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.toStream().map(Fn1.tuple(f)).flatMap(this::wrap);
    }

    default public <R> Stream<R> yieldFlatStream(Fn1<? super T1, ? extends Iterable<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.yieldStream(f).flatMap(IterativeInternals::entity).flatMap(this::wrap);
    }

    default public Option<T1> yieldOption() {
        return this.yieldOption(IterativeInternals::entity);
    }

    default public <R> Option<R> yieldOption(Fn1<? super T1, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.toStream().headOption().map(Fn1.tuple(f)).flatMap(this::wrap);
    }

    default public <R> Option<R> yieldFlatOption(Fn1<? super T1, ? extends Option<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.yieldOption(f).flatMap(IterativeInternals::entity).flatMap(this::wrap);
    }

    default public Try<T1> yieldTry() {
        return this.yieldTry(IterativeInternals::entity);
    }

    default public <R> Try<R> yieldTry(Fnc1<? super T1, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.toStream().headOption().toTry().mapTry(Fnc1.tuple(f)).flatMap(this::wrapTry);
    }

    default public <R> Try<R> yieldFlatTry(Fnc1<? super T1, ? extends Try<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.yieldTry(f).flatMap(IterativeInternals::entity).flatMap(this::wrapTry);
    }

    default public Validation<Seq<Throwable>, Stream<Tuple1<T1>>> validateStream() {
        return this.validateStream(Tuple::of);
    }

    default public <R> Validation<Seq<Throwable>, Stream<R>> validateStream(Fn1<? super T1, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldStream(f));
        }
        return Validation.invalid(failures);
    }

    default public <R> Validation<Seq<Throwable>, Stream<R>> validateFlatStream(Fn1<? super T1, ? extends Iterable<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldFlatStream(f));
        }
        return Validation.invalid(failures);
    }

    default public Validation<Seq<Throwable>, Option<Tuple1<T1>>> validateOption() {
        return this.validateOption(Tuple::of);
    }

    default public <R> Validation<Seq<Throwable>, Option<R>> validateOption(Fn1<? super T1, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldOption(f));
        }
        return Validation.invalid(failures);
    }

    default public <R> Validation<Seq<Throwable>, Option<R>> validateFlatOption(Fn1<? super T1, ? extends Option<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldFlatOption(f));
        }
        return Validation.invalid(failures);
    }

    default public Validation<Seq<Throwable>, Try<Tuple1<T1>>> validateTry() {
        return this.validateTry(Tuple::of);
    }

    default public <R> Validation<Seq<Throwable>, Try<R>> validateTry(Fnc1<? super T1, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldTry(f));
        }
        return Validation.invalid(failures);
    }

    default public <R> Validation<Seq<Throwable>, Try<R>> validateFlatTry(Fnc1<? super T1, ? extends Try<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldFlatTry(f));
        }
        return Validation.invalid(failures);
    }

    default public Iterative1<T1> forEach(Cs1<? super T1> c) {
        Objects.requireNonNull(c, "c is null");
        this.toStream().forEach(Cs1.tuple(c));
        return this;
    }

    default public Iterative1<T1> forEachWhen(Cs1<? super T1> c, Pr1<? super T1> p) {
        Objects.requireNonNull(c, "c is null");
        Objects.requireNonNull(p, "p is null");
        this.filter(p).toStream().forEach(Cs1.tuple(c));
        return this;
    }

    default public Iterative1<T1> forEach(Rn r) {
        return this.forEach(r.ignoring1());
    }

    default public Iterative1<T1> execute(Cs1<? super Iterative1<? extends T1>> c) {
        Objects.requireNonNull(c, "c is null");
        c.accept(this);
        return this;
    }

    default public Iterative1<T1> onFailure(Cs1<? super Iterative1<? extends T1>> c) {
        Objects.requireNonNull(c, "c is null");
        this.toStream().toTry().recover(t -> null).filter(Objects::isNull).forEach(tuple -> c.accept(this));
        return this;
    }

    default public Iterative1<T1> onSuccess(Cs1<? super Iterative1<? extends T1>> c) {
        Objects.requireNonNull(c, "c is null");
        this.toStream().headOption().forEach(tuple -> c.accept(this));
        return this;
    }

    default public Iterative1<T1> onSuccessful(Cs1<? super T1> c) {
        return this.forEach(c);
    }

    default public Iterative1<T1> recover(T1 t1) {
        return this.isFailure() ? this.pushBack(t1).popFront() : this;
    }

    default public Iterative1<T1> recoverOf(Iterable<? extends T1> t1) {
        return this.isFailure() ? this.pushBackOf(t1).popFront() : this;
    }

    default public Iterative1<T1> recoverBy(Iterable<? extends Stream<? extends T1>> t1) {
        return this.isFailure() ? this.pushBackBy(t1).popFront() : this;
    }

    default public Iterative1<T1> replaceWhen(Fn1<? super T1, ? extends T1> f, Pr1<? super T1> p) {
        return this.map((Fn1 & Serializable) t -> p.test(t) ? f.apply(t) : t);
    }

    default public Iterative1<T1> replaceWhen(Sp<? extends T1> s, Pr1<? super T1> p) {
        return this.replaceWhen((T1) s.toFunction().ignoring1(), p);
    }

    default public Iterative1<T1> replaceWhen(T1 t, Pr1<? super T1> p) {
        return this.replaceWhen((T1) Fn1.value(t), p);
    }

    default public <B1> Iterative2Cross<T1, B1> pushBackOf(Iterable<? extends B1> b1) {
        return this.pushBackBy(IterativeHandler.streamWrap(b1));
    }

    default public <B1> Iterative2Cross<T1, B1> pushBackCrossOf(Iterable<? extends B1> b1) {
        return this.pushBackCrossBy(IterativeHandler.streamWrap(b1));
    }

    default public <B1> Iterative2Inline<T1, B1> pushBackInlineOf(Iterable<? extends B1> b1) {
        return this.pushBackInlineBy(IterativeHandler.streamWrap(b1));
    }

    default public <F1> Iterative2Cross<F1, T1> pushFrontOf(Iterable<? extends F1> f1) {
        return this.pushFrontBy(IterativeHandler.streamWrap(f1));
    }

    default public <F1> Iterative2Cross<F1, T1> pushFrontCrossOf(Iterable<? extends F1> f1) {
        return this.pushFrontCrossBy(IterativeHandler.streamWrap(f1));
    }

    default public <F1> Iterative2Inline<F1, T1> pushFrontInlineOf(Iterable<? extends F1> f1) {
        return this.pushFrontInlineBy(IterativeHandler.streamWrap(f1));
    }

    default public <B1> Iterative2Cross<T1, B1> pushBack(B1 b1) {
        return this.pushBackOf((Iterable<? extends B1>) this.wrap(b1));
    }

    default public <B1> Iterative2Cross<T1, B1> pushBackCross(B1 b1) {
        return this.pushBackCrossOf((Iterable<? extends B1>) this.wrap(b1));
    }

    default public <B1> Iterative2Inline<T1, B1> pushBackInline(B1 b1) {
        return this.pushBackInlineOf((Iterable<? extends B1>) this.wrap(b1));
    }

    default public <F1> Iterative2Cross<F1, T1> pushFront(F1 f1) {
        return this.pushFrontOf((Iterable<? extends F1>) this.wrap(f1));
    }

    default public <F1> Iterative2Cross<F1, T1> pushFrontCross(F1 f1) {
        return this.pushFrontCrossOf((Iterable<? extends F1>) this.wrap(f1));
    }

    default public <F1> Iterative2Inline<F1, T1> pushFrontInline(F1 f1) {
        return this.pushFrontInlineOf((Iterable<? extends F1>) this.wrap(f1));
    }

    default public <B1, B2> Iterative3Cross<T1, B1, B2> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2) {
        return this.pushBackBy(b1).pushBackBy(b2);
    }

    default public <B1, B2> Iterative3Cross<T1, B1, B2> pushBackCrossBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2) {
        return this.pushBackCrossBy(b1).pushBackCrossBy(b2);
    }

    default public <B1, B2> Iterative3Inline<T1, B1, B2> pushBackInlineBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2) {
        return this.pushBackInlineBy(b1).pushBackInlineBy(b2);
    }

    default public <F1, F2> Iterative3Cross<F1, F2, T1> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return this.pushFrontBy(f2).pushFrontBy(f1);
    }

    default public <F1, F2> Iterative3Cross<F1, F2, T1> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return this.pushFrontCrossBy(f2).pushFrontCrossBy(f1);
    }

    default public <F1, F2> Iterative3Inline<F1, F2, T1> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return this.pushFrontInlineBy(f2).pushFrontInlineBy(f1);
    }

    default public <B1, B2> Iterative3Cross<T1, B1, B2> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2) {
        return this.pushBackOf(b1).pushBackOf(b2);
    }

    default public <B1, B2> Iterative3Cross<T1, B1, B2> pushBackCrossOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2) {
        return this.pushBackCrossOf(b1).pushBackCrossOf(b2);
    }

    default public <B1, B2> Iterative3Inline<T1, B1, B2> pushBackInlineOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2) {
        return this.pushBackInlineOf(b1).pushBackInlineOf(b2);
    }

    default public <F1, F2> Iterative3Cross<F1, F2, T1> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return this.pushFrontOf(f2).pushFrontOf(f1);
    }

    default public <F1, F2> Iterative3Cross<F1, F2, T1> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return this.pushFrontCrossOf(f2).pushFrontCrossOf(f1);
    }

    default public <F1, F2> Iterative3Inline<F1, F2, T1> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return this.pushFrontInlineOf(f2).pushFrontInlineOf(f1);
    }

    default public <B1, B2> Iterative3Cross<T1, B1, B2> pushBack(B1 b1, B2 b2) {
        return this.pushBack(b1).pushBack(b2);
    }

    default public <B1, B2> Iterative3Cross<T1, B1, B2> pushBackCross(B1 b1, B2 b2) {
        return this.pushBackCross(b1).pushBackCross(b2);
    }

    default public <B1, B2> Iterative3Inline<T1, B1, B2> pushBackInline(B1 b1, B2 b2) {
        return this.pushBackInline(b1).pushBackInline(b2);
    }

    default public <F1, F2> Iterative3Cross<F1, F2, T1> pushFront(F1 f1, F2 f2) {
        return this.pushFront(f2).pushFront(f1);
    }

    default public <F1, F2> Iterative3Cross<F1, F2, T1> pushFrontCross(F1 f1, F2 f2) {
        return this.pushFrontCross(f2).pushFrontCross(f1);
    }

    default public <F1, F2> Iterative3Inline<F1, F2, T1> pushFrontInline(F1 f1, F2 f2) {
        return this.pushFrontInline(f2).pushFrontInline(f1);
    }

    default public <B1, B2, B3> Iterative4Cross<T1, B1, B2, B3> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3) {
        return this.pushBackBy(b1).pushBackBy(b2).pushBackBy(b3);
    }

    default public <B1, B2, B3> Iterative4Cross<T1, B1, B2, B3> pushBackCrossBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3) {
        return this.pushBackCrossBy(b1).pushBackCrossBy(b2).pushBackCrossBy(b3);
    }

    default public <B1, B2, B3> Iterative4Inline<T1, B1, B2, B3> pushBackInlineBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3) {
        return this.pushBackInlineBy(b1).pushBackInlineBy(b2).pushBackInlineBy(b3);
    }

    default public <F1, F2, F3> Iterative4Cross<F1, F2, F3, T1> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3) {
        return this.pushFrontBy(f3).pushFrontBy(f2).pushFrontBy(f1);
    }

    default public <F1, F2, F3> Iterative4Cross<F1, F2, F3, T1> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3) {
        return this.pushFrontCrossBy(f3).pushFrontCrossBy(f2).pushFrontCrossBy(f1);
    }

    default public <F1, F2, F3> Iterative4Inline<F1, F2, F3, T1> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3) {
        return this.pushFrontInlineBy(f3).pushFrontInlineBy(f2).pushFrontInlineBy(f1);
    }

    default public <B1, B2, B3> Iterative4Cross<T1, B1, B2, B3> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3) {
        return this.pushBackOf(b1).pushBackOf(b2).pushBackOf(b3);
    }

    default public <B1, B2, B3> Iterative4Cross<T1, B1, B2, B3> pushBackCrossOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3) {
        return this.pushBackCrossOf(b1).pushBackCrossOf(b2).pushBackCrossOf(b3);
    }

    default public <B1, B2, B3> Iterative4Inline<T1, B1, B2, B3> pushBackInlineOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3) {
        return this.pushBackInlineOf(b1).pushBackInlineOf(b2).pushBackInlineOf(b3);
    }

    default public <F1, F2, F3> Iterative4Cross<F1, F2, F3, T1> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3) {
        return this.pushFrontOf(f3).pushFrontOf(f2).pushFrontOf(f1);
    }

    default public <F1, F2, F3> Iterative4Cross<F1, F2, F3, T1> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3) {
        return this.pushFrontCrossOf(f3).pushFrontCrossOf(f2).pushFrontCrossOf(f1);
    }

    default public <F1, F2, F3> Iterative4Inline<F1, F2, F3, T1> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3) {
        return this.pushFrontInlineOf(f3).pushFrontInlineOf(f2).pushFrontInlineOf(f1);
    }

    default public <B1, B2, B3> Iterative4Cross<T1, B1, B2, B3> pushBack(B1 b1, B2 b2, B3 b3) {
        return this.pushBack(b1).pushBack(b2).pushBack(b3);
    }

    default public <B1, B2, B3> Iterative4Cross<T1, B1, B2, B3> pushBackCross(B1 b1, B2 b2, B3 b3) {
        return this.pushBackCross(b1).pushBackCross(b2).pushBackCross(b3);
    }

    default public <B1, B2, B3> Iterative4Inline<T1, B1, B2, B3> pushBackInline(B1 b1, B2 b2, B3 b3) {
        return this.pushBackInline(b1).pushBackInline(b2).pushBackInline(b3);
    }

    default public <F1, F2, F3> Iterative4Cross<F1, F2, F3, T1> pushFront(F1 f1, F2 f2, F3 f3) {
        return this.pushFront(f3).pushFront(f2).pushFront(f1);
    }

    default public <F1, F2, F3> Iterative4Cross<F1, F2, F3, T1> pushFrontCross(F1 f1, F2 f2, F3 f3) {
        return this.pushFrontCross(f3).pushFrontCross(f2).pushFrontCross(f1);
    }

    default public <F1, F2, F3> Iterative4Inline<F1, F2, F3, T1> pushFrontInline(F1 f1, F2 f2, F3 f3) {
        return this.pushFrontInline(f3).pushFrontInline(f2).pushFrontInline(f1);
    }

    default public <B1, B2, B3, B4> Iterative5Cross<T1, B1, B2, B3, B4> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4) {
        return this.pushBackBy(b1).pushBackBy(b2).pushBackBy(b3).pushBackBy(b4);
    }

    default public <B1, B2, B3, B4> Iterative5Cross<T1, B1, B2, B3, B4> pushBackCrossBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4) {
        return this.pushBackCrossBy(b1).pushBackCrossBy(b2).pushBackCrossBy(b3).pushBackCrossBy(b4);
    }

    default public <B1, B2, B3, B4> Iterative5Inline<T1, B1, B2, B3, B4> pushBackInlineBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4) {
        return this.pushBackInlineBy(b1).pushBackInlineBy(b2).pushBackInlineBy(b3).pushBackInlineBy(b4);
    }

    default public <F1, F2, F3, F4> Iterative5Cross<F1, F2, F3, F4, T1> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4) {
        return this.pushFrontBy(f4).pushFrontBy(f3).pushFrontBy(f2).pushFrontBy(f1);
    }

    default public <F1, F2, F3, F4> Iterative5Cross<F1, F2, F3, F4, T1> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4) {
        return this.pushFrontCrossBy(f4).pushFrontCrossBy(f3).pushFrontCrossBy(f2).pushFrontCrossBy(f1);
    }

    default public <F1, F2, F3, F4> Iterative5Inline<F1, F2, F3, F4, T1> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4) {
        return this.pushFrontInlineBy(f4).pushFrontInlineBy(f3).pushFrontInlineBy(f2).pushFrontInlineBy(f1);
    }

    default public <B1, B2, B3, B4> Iterative5Cross<T1, B1, B2, B3, B4> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4) {
        return this.pushBackOf(b1).pushBackOf(b2).pushBackOf(b3).pushBackOf(b4);
    }

    default public <B1, B2, B3, B4> Iterative5Cross<T1, B1, B2, B3, B4> pushBackCrossOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4) {
        return this.pushBackCrossOf(b1).pushBackCrossOf(b2).pushBackCrossOf(b3).pushBackCrossOf(b4);
    }

    default public <B1, B2, B3, B4> Iterative5Inline<T1, B1, B2, B3, B4> pushBackInlineOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4) {
        return this.pushBackInlineOf(b1).pushBackInlineOf(b2).pushBackInlineOf(b3).pushBackInlineOf(b4);
    }

    default public <F1, F2, F3, F4> Iterative5Cross<F1, F2, F3, F4, T1> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4) {
        return this.pushFrontOf(f4).pushFrontOf(f3).pushFrontOf(f2).pushFrontOf(f1);
    }

    default public <F1, F2, F3, F4> Iterative5Cross<F1, F2, F3, F4, T1> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4) {
        return this.pushFrontCrossOf(f4).pushFrontCrossOf(f3).pushFrontCrossOf(f2).pushFrontCrossOf(f1);
    }

    default public <F1, F2, F3, F4> Iterative5Inline<F1, F2, F3, F4, T1> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4) {
        return this.pushFrontInlineOf(f4).pushFrontInlineOf(f3).pushFrontInlineOf(f2).pushFrontInlineOf(f1);
    }

    default public <B1, B2, B3, B4> Iterative5Cross<T1, B1, B2, B3, B4> pushBack(B1 b1, B2 b2, B3 b3, B4 b4) {
        return this.pushBack(b1).pushBack(b2).pushBack(b3).pushBack(b4);
    }

    default public <B1, B2, B3, B4> Iterative5Cross<T1, B1, B2, B3, B4> pushBackCross(B1 b1, B2 b2, B3 b3, B4 b4) {
        return this.pushBackCross(b1).pushBackCross(b2).pushBackCross(b3).pushBackCross(b4);
    }

    default public <B1, B2, B3, B4> Iterative5Inline<T1, B1, B2, B3, B4> pushBackInline(B1 b1, B2 b2, B3 b3, B4 b4) {
        return this.pushBackInline(b1).pushBackInline(b2).pushBackInline(b3).pushBackInline(b4);
    }

    default public <F1, F2, F3, F4> Iterative5Cross<F1, F2, F3, F4, T1> pushFront(F1 f1, F2 f2, F3 f3, F4 f4) {
        return this.pushFront(f4).pushFront(f3).pushFront(f2).pushFront(f1);
    }

    default public <F1, F2, F3, F4> Iterative5Cross<F1, F2, F3, F4, T1> pushFrontCross(F1 f1, F2 f2, F3 f3, F4 f4) {
        return this.pushFrontCross(f4).pushFrontCross(f3).pushFrontCross(f2).pushFrontCross(f1);
    }

    default public <F1, F2, F3, F4> Iterative5Inline<F1, F2, F3, F4, T1> pushFrontInline(F1 f1, F2 f2, F3 f3, F4 f4) {
        return this.pushFrontInline(f4).pushFrontInline(f3).pushFrontInline(f2).pushFrontInline(f1);
    }

    default public <B1, B2, B3, B4, B5> Iterative6Cross<T1, B1, B2, B3, B4, B5> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4, Iterable<? extends Stream<? extends B5>> b5) {
        return this.pushBackBy(b1).pushBackBy(b2).pushBackBy(b3).pushBackBy(b4).pushBackBy(b5);
    }

    default public <B1, B2, B3, B4, B5> Iterative6Cross<T1, B1, B2, B3, B4, B5> pushBackCrossBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4, Iterable<? extends Stream<? extends B5>> b5) {
        return this.pushBackCrossBy(b1).pushBackCrossBy(b2).pushBackCrossBy(b3).pushBackCrossBy(b4).pushBackCrossBy(b5);
    }

    default public <B1, B2, B3, B4, B5> Iterative6Inline<T1, B1, B2, B3, B4, B5> pushBackInlineBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4, Iterable<? extends Stream<? extends B5>> b5) {
        return this.pushBackInlineBy(b1).pushBackInlineBy(b2).pushBackInlineBy(b3).pushBackInlineBy(b4).pushBackInlineBy(b5);
    }

    default public <F1, F2, F3, F4, F5> Iterative6Cross<F1, F2, F3, F4, F5, T1> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5) {
        return this.pushFrontBy(f5).pushFrontBy(f4).pushFrontBy(f3).pushFrontBy(f2).pushFrontBy(f1);
    }

    default public <F1, F2, F3, F4, F5> Iterative6Cross<F1, F2, F3, F4, F5, T1> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5) {
        return this.pushFrontCrossBy(f5).pushFrontCrossBy(f4).pushFrontCrossBy(f3).pushFrontCrossBy(f2).pushFrontCrossBy(f1);
    }

    default public <F1, F2, F3, F4, F5> Iterative6Inline<F1, F2, F3, F4, F5, T1> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5) {
        return this.pushFrontInlineBy(f5).pushFrontInlineBy(f4).pushFrontInlineBy(f3).pushFrontInlineBy(f2).pushFrontInlineBy(f1);
    }

    default public <B1, B2, B3, B4, B5> Iterative6Cross<T1, B1, B2, B3, B4, B5> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4, Iterable<? extends B5> b5) {
        return this.pushBackOf(b1).pushBackOf(b2).pushBackOf(b3).pushBackOf(b4).pushBackOf(b5);
    }

    default public <B1, B2, B3, B4, B5> Iterative6Cross<T1, B1, B2, B3, B4, B5> pushBackCrossOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4, Iterable<? extends B5> b5) {
        return this.pushBackCrossOf(b1).pushBackCrossOf(b2).pushBackCrossOf(b3).pushBackCrossOf(b4).pushBackCrossOf(b5);
    }

    default public <B1, B2, B3, B4, B5> Iterative6Inline<T1, B1, B2, B3, B4, B5> pushBackInlineOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4, Iterable<? extends B5> b5) {
        return this.pushBackInlineOf(b1).pushBackInlineOf(b2).pushBackInlineOf(b3).pushBackInlineOf(b4).pushBackInlineOf(b5);
    }

    default public <F1, F2, F3, F4, F5> Iterative6Cross<F1, F2, F3, F4, F5, T1> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5) {
        return this.pushFrontOf(f5).pushFrontOf(f4).pushFrontOf(f3).pushFrontOf(f2).pushFrontOf(f1);
    }

    default public <F1, F2, F3, F4, F5> Iterative6Cross<F1, F2, F3, F4, F5, T1> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5) {
        return this.pushFrontCrossOf(f5).pushFrontCrossOf(f4).pushFrontCrossOf(f3).pushFrontCrossOf(f2).pushFrontCrossOf(f1);
    }

    default public <F1, F2, F3, F4, F5> Iterative6Inline<F1, F2, F3, F4, F5, T1> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5) {
        return this.pushFrontInlineOf(f5).pushFrontInlineOf(f4).pushFrontInlineOf(f3).pushFrontInlineOf(f2).pushFrontInlineOf(f1);
    }

    default public <B1, B2, B3, B4, B5> Iterative6Cross<T1, B1, B2, B3, B4, B5> pushBack(B1 b1, B2 b2, B3 b3, B4 b4, B5 b5) {
        return this.pushBack(b1).pushBack(b2).pushBack(b3).pushBack(b4).pushBack(b5);
    }

    default public <B1, B2, B3, B4, B5> Iterative6Cross<T1, B1, B2, B3, B4, B5> pushBackCross(B1 b1, B2 b2, B3 b3, B4 b4, B5 b5) {
        return this.pushBackCross(b1).pushBackCross(b2).pushBackCross(b3).pushBackCross(b4).pushBackCross(b5);
    }

    default public <B1, B2, B3, B4, B5> Iterative6Inline<T1, B1, B2, B3, B4, B5> pushBackInline(B1 b1, B2 b2, B3 b3, B4 b4, B5 b5) {
        return this.pushBackInline(b1).pushBackInline(b2).pushBackInline(b3).pushBackInline(b4).pushBackInline(b5);
    }

    default public <F1, F2, F3, F4, F5> Iterative6Cross<F1, F2, F3, F4, F5, T1> pushFront(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5) {
        return this.pushFront(f5).pushFront(f4).pushFront(f3).pushFront(f2).pushFront(f1);
    }

    default public <F1, F2, F3, F4, F5> Iterative6Cross<F1, F2, F3, F4, F5, T1> pushFrontCross(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5) {
        return this.pushFrontCross(f5).pushFrontCross(f4).pushFrontCross(f3).pushFrontCross(f2).pushFrontCross(f1);
    }

    default public <F1, F2, F3, F4, F5> Iterative6Inline<F1, F2, F3, F4, F5, T1> pushFrontInline(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5) {
        return this.pushFrontInline(f5).pushFrontInline(f4).pushFrontInline(f3).pushFrontInline(f2).pushFrontInline(f1);
    }

    default public <B1, B2, B3, B4, B5, B6> Iterative7Cross<T1, B1, B2, B3, B4, B5, B6> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4, Iterable<? extends Stream<? extends B5>> b5, Iterable<? extends Stream<? extends B6>> b6) {
        return this.pushBackBy(b1).pushBackBy(b2).pushBackBy(b3).pushBackBy(b4).pushBackBy(b5).pushBackBy(b6);
    }

    default public <B1, B2, B3, B4, B5, B6> Iterative7Cross<T1, B1, B2, B3, B4, B5, B6> pushBackCrossBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4, Iterable<? extends Stream<? extends B5>> b5, Iterable<? extends Stream<? extends B6>> b6) {
        return this.pushBackCrossBy(b1).pushBackCrossBy(b2).pushBackCrossBy(b3).pushBackCrossBy(b4).pushBackCrossBy(b5).pushBackCrossBy(b6);
    }

    default public <B1, B2, B3, B4, B5, B6> Iterative7Inline<T1, B1, B2, B3, B4, B5, B6> pushBackInlineBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4, Iterable<? extends Stream<? extends B5>> b5, Iterable<? extends Stream<? extends B6>> b6) {
        return this.pushBackInlineBy(b1).pushBackInlineBy(b2).pushBackInlineBy(b3).pushBackInlineBy(b4).pushBackInlineBy(b5).pushBackInlineBy(b6);
    }

    default public <F1, F2, F3, F4, F5, F6> Iterative7Cross<F1, F2, F3, F4, F5, F6, T1> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5, Iterable<? extends Stream<? extends F6>> f6) {
        return this.pushFrontBy(f6).pushFrontBy(f5).pushFrontBy(f4).pushFrontBy(f3).pushFrontBy(f2).pushFrontBy(f1);
    }

    default public <F1, F2, F3, F4, F5, F6> Iterative7Cross<F1, F2, F3, F4, F5, F6, T1> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5, Iterable<? extends Stream<? extends F6>> f6) {
        return this.pushFrontCrossBy(f6).pushFrontCrossBy(f5).pushFrontCrossBy(f4).pushFrontCrossBy(f3).pushFrontCrossBy(f2).pushFrontCrossBy(f1);
    }

    default public <F1, F2, F3, F4, F5, F6> Iterative7Inline<F1, F2, F3, F4, F5, F6, T1> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5, Iterable<? extends Stream<? extends F6>> f6) {
        return this.pushFrontInlineBy(f6).pushFrontInlineBy(f5).pushFrontInlineBy(f4).pushFrontInlineBy(f3).pushFrontInlineBy(f2).pushFrontInlineBy(f1);
    }

    default public <B1, B2, B3, B4, B5, B6> Iterative7Cross<T1, B1, B2, B3, B4, B5, B6> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4, Iterable<? extends B5> b5, Iterable<? extends B6> b6) {
        return this.pushBackOf(b1).pushBackOf(b2).pushBackOf(b3).pushBackOf(b4).pushBackOf(b5).pushBackOf(b6);
    }

    default public <B1, B2, B3, B4, B5, B6> Iterative7Cross<T1, B1, B2, B3, B4, B5, B6> pushBackCrossOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4, Iterable<? extends B5> b5, Iterable<? extends B6> b6) {
        return this.pushBackCrossOf(b1).pushBackCrossOf(b2).pushBackCrossOf(b3).pushBackCrossOf(b4).pushBackCrossOf(b5).pushBackCrossOf(b6);
    }

    default public <B1, B2, B3, B4, B5, B6> Iterative7Inline<T1, B1, B2, B3, B4, B5, B6> pushBackInlineOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4, Iterable<? extends B5> b5, Iterable<? extends B6> b6) {
        return this.pushBackInlineOf(b1).pushBackInlineOf(b2).pushBackInlineOf(b3).pushBackInlineOf(b4).pushBackInlineOf(b5).pushBackInlineOf(b6);
    }

    default public <F1, F2, F3, F4, F5, F6> Iterative7Cross<F1, F2, F3, F4, F5, F6, T1> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5, Iterable<? extends F6> f6) {
        return this.pushFrontOf(f6).pushFrontOf(f5).pushFrontOf(f4).pushFrontOf(f3).pushFrontOf(f2).pushFrontOf(f1);
    }

    default public <F1, F2, F3, F4, F5, F6> Iterative7Cross<F1, F2, F3, F4, F5, F6, T1> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5, Iterable<? extends F6> f6) {
        return this.pushFrontCrossOf(f6).pushFrontCrossOf(f5).pushFrontCrossOf(f4).pushFrontCrossOf(f3).pushFrontCrossOf(f2).pushFrontCrossOf(f1);
    }

    default public <F1, F2, F3, F4, F5, F6> Iterative7Inline<F1, F2, F3, F4, F5, F6, T1> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5, Iterable<? extends F6> f6) {
        return this.pushFrontInlineOf(f6).pushFrontInlineOf(f5).pushFrontInlineOf(f4).pushFrontInlineOf(f3).pushFrontInlineOf(f2).pushFrontInlineOf(f1);
    }

    default public <B1, B2, B3, B4, B5, B6> Iterative7Cross<T1, B1, B2, B3, B4, B5, B6> pushBack(B1 b1, B2 b2, B3 b3, B4 b4, B5 b5, B6 b6) {
        return this.pushBack(b1).pushBack(b2).pushBack(b3).pushBack(b4).pushBack(b5).pushBack(b6);
    }

    default public <B1, B2, B3, B4, B5, B6> Iterative7Cross<T1, B1, B2, B3, B4, B5, B6> pushBackCross(B1 b1, B2 b2, B3 b3, B4 b4, B5 b5, B6 b6) {
        return this.pushBackCross(b1).pushBackCross(b2).pushBackCross(b3).pushBackCross(b4).pushBackCross(b5).pushBackCross(b6);
    }

    default public <B1, B2, B3, B4, B5, B6> Iterative7Inline<T1, B1, B2, B3, B4, B5, B6> pushBackInline(B1 b1, B2 b2, B3 b3, B4 b4, B5 b5, B6 b6) {
        return this.pushBackInline(b1).pushBackInline(b2).pushBackInline(b3).pushBackInline(b4).pushBackInline(b5).pushBackInline(b6);
    }

    default public <F1, F2, F3, F4, F5, F6> Iterative7Cross<F1, F2, F3, F4, F5, F6, T1> pushFront(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5, F6 f6) {
        return this.pushFront(f6).pushFront(f5).pushFront(f4).pushFront(f3).pushFront(f2).pushFront(f1);
    }

    default public <F1, F2, F3, F4, F5, F6> Iterative7Cross<F1, F2, F3, F4, F5, F6, T1> pushFrontCross(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5, F6 f6) {
        return this.pushFrontCross(f6).pushFrontCross(f5).pushFrontCross(f4).pushFrontCross(f3).pushFrontCross(f2).pushFrontCross(f1);
    }

    default public <F1, F2, F3, F4, F5, F6> Iterative7Inline<F1, F2, F3, F4, F5, F6, T1> pushFrontInline(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5, F6 f6) {
        return this.pushFrontInline(f6).pushFrontInline(f5).pushFrontInline(f4).pushFrontInline(f3).pushFrontInline(f2).pushFrontInline(f1);
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Iterative8Cross<T1, B1, B2, B3, B4, B5, B6, B7> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4, Iterable<? extends Stream<? extends B5>> b5, Iterable<? extends Stream<? extends B6>> b6, Iterable<? extends Stream<? extends B7>> b7) {
        return this.pushBackBy(b1).pushBackBy(b2).pushBackBy(b3).pushBackBy(b4).pushBackBy(b5).pushBackBy(b6).pushBackBy(b7);
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Iterative8Cross<T1, B1, B2, B3, B4, B5, B6, B7> pushBackCrossBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4, Iterable<? extends Stream<? extends B5>> b5, Iterable<? extends Stream<? extends B6>> b6, Iterable<? extends Stream<? extends B7>> b7) {
        return this.pushBackCrossBy(b1).pushBackCrossBy(b2).pushBackCrossBy(b3).pushBackCrossBy(b4).pushBackCrossBy(b5).pushBackCrossBy(b6).pushBackCrossBy(b7);
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Iterative8Inline<T1, B1, B2, B3, B4, B5, B6, B7> pushBackInlineBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4, Iterable<? extends Stream<? extends B5>> b5, Iterable<? extends Stream<? extends B6>> b6, Iterable<? extends Stream<? extends B7>> b7) {
        return this.pushBackInlineBy(b1).pushBackInlineBy(b2).pushBackInlineBy(b3).pushBackInlineBy(b4).pushBackInlineBy(b5).pushBackInlineBy(b6).pushBackInlineBy(b7);
    }

    default public <F1, F2, F3, F4, F5, F6, F7> Iterative8Cross<F1, F2, F3, F4, F5, F6, F7, T1> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5, Iterable<? extends Stream<? extends F6>> f6, Iterable<? extends Stream<? extends F7>> f7) {
        return this.pushFrontBy(f7).pushFrontBy(f6).pushFrontBy(f5).pushFrontBy(f4).pushFrontBy(f3).pushFrontBy(f2).pushFrontBy(f1);
    }

    default public <F1, F2, F3, F4, F5, F6, F7> Iterative8Cross<F1, F2, F3, F4, F5, F6, F7, T1> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5, Iterable<? extends Stream<? extends F6>> f6, Iterable<? extends Stream<? extends F7>> f7) {
        return this.pushFrontCrossBy(f7).pushFrontCrossBy(f6).pushFrontCrossBy(f5).pushFrontCrossBy(f4).pushFrontCrossBy(f3).pushFrontCrossBy(f2).pushFrontCrossBy(f1);
    }

    default public <F1, F2, F3, F4, F5, F6, F7> Iterative8Inline<F1, F2, F3, F4, F5, F6, F7, T1> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5, Iterable<? extends Stream<? extends F6>> f6, Iterable<? extends Stream<? extends F7>> f7) {
        return this.pushFrontInlineBy(f7).pushFrontInlineBy(f6).pushFrontInlineBy(f5).pushFrontInlineBy(f4).pushFrontInlineBy(f3).pushFrontInlineBy(f2).pushFrontInlineBy(f1);
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Iterative8Cross<T1, B1, B2, B3, B4, B5, B6, B7> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4, Iterable<? extends B5> b5, Iterable<? extends B6> b6, Iterable<? extends B7> b7) {
        return this.pushBackOf(b1).pushBackOf(b2).pushBackOf(b3).pushBackOf(b4).pushBackOf(b5).pushBackOf(b6).pushBackOf(b7);
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Iterative8Cross<T1, B1, B2, B3, B4, B5, B6, B7> pushBackCrossOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4, Iterable<? extends B5> b5, Iterable<? extends B6> b6, Iterable<? extends B7> b7) {
        return this.pushBackCrossOf(b1).pushBackCrossOf(b2).pushBackCrossOf(b3).pushBackCrossOf(b4).pushBackCrossOf(b5).pushBackCrossOf(b6).pushBackCrossOf(b7);
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Iterative8Inline<T1, B1, B2, B3, B4, B5, B6, B7> pushBackInlineOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4, Iterable<? extends B5> b5, Iterable<? extends B6> b6, Iterable<? extends B7> b7) {
        return this.pushBackInlineOf(b1).pushBackInlineOf(b2).pushBackInlineOf(b3).pushBackInlineOf(b4).pushBackInlineOf(b5).pushBackInlineOf(b6).pushBackInlineOf(b7);
    }

    default public <F1, F2, F3, F4, F5, F6, F7> Iterative8Cross<F1, F2, F3, F4, F5, F6, F7, T1> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5, Iterable<? extends F6> f6, Iterable<? extends F7> f7) {
        return this.pushFrontOf(f7).pushFrontOf(f6).pushFrontOf(f5).pushFrontOf(f4).pushFrontOf(f3).pushFrontOf(f2).pushFrontOf(f1);
    }

    default public <F1, F2, F3, F4, F5, F6, F7> Iterative8Cross<F1, F2, F3, F4, F5, F6, F7, T1> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5, Iterable<? extends F6> f6, Iterable<? extends F7> f7) {
        return this.pushFrontCrossOf(f7).pushFrontCrossOf(f6).pushFrontCrossOf(f5).pushFrontCrossOf(f4).pushFrontCrossOf(f3).pushFrontCrossOf(f2).pushFrontCrossOf(f1);
    }

    default public <F1, F2, F3, F4, F5, F6, F7> Iterative8Inline<F1, F2, F3, F4, F5, F6, F7, T1> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5, Iterable<? extends F6> f6, Iterable<? extends F7> f7) {
        return this.pushFrontInlineOf(f7).pushFrontInlineOf(f6).pushFrontInlineOf(f5).pushFrontInlineOf(f4).pushFrontInlineOf(f3).pushFrontInlineOf(f2).pushFrontInlineOf(f1);
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Iterative8Cross<T1, B1, B2, B3, B4, B5, B6, B7> pushBack(B1 b1, B2 b2, B3 b3, B4 b4, B5 b5, B6 b6, B7 b7) {
        return this.pushBack(b1).pushBack(b2).pushBack(b3).pushBack(b4).pushBack(b5).pushBack(b6).pushBack(b7);
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Iterative8Cross<T1, B1, B2, B3, B4, B5, B6, B7> pushBackCross(B1 b1, B2 b2, B3 b3, B4 b4, B5 b5, B6 b6, B7 b7) {
        return this.pushBackCross(b1).pushBackCross(b2).pushBackCross(b3).pushBackCross(b4).pushBackCross(b5).pushBackCross(b6).pushBackCross(b7);
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Iterative8Inline<T1, B1, B2, B3, B4, B5, B6, B7> pushBackInline(B1 b1, B2 b2, B3 b3, B4 b4, B5 b5, B6 b6, B7 b7) {
        return this.pushBackInline(b1).pushBackInline(b2).pushBackInline(b3).pushBackInline(b4).pushBackInline(b5).pushBackInline(b6).pushBackInline(b7);
    }

    default public <F1, F2, F3, F4, F5, F6, F7> Iterative8Cross<F1, F2, F3, F4, F5, F6, F7, T1> pushFront(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5, F6 f6, F7 f7) {
        return this.pushFront(f7).pushFront(f6).pushFront(f5).pushFront(f4).pushFront(f3).pushFront(f2).pushFront(f1);
    }

    default public <F1, F2, F3, F4, F5, F6, F7> Iterative8Cross<F1, F2, F3, F4, F5, F6, F7, T1> pushFrontCross(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5, F6 f6, F7 f7) {
        return this.pushFrontCross(f7).pushFrontCross(f6).pushFrontCross(f5).pushFrontCross(f4).pushFrontCross(f3).pushFrontCross(f2).pushFrontCross(f1);
    }

    default public <F1, F2, F3, F4, F5, F6, F7> Iterative8Inline<F1, F2, F3, F4, F5, F6, F7, T1> pushFrontInline(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5, F6 f6, F7 f7) {
        return this.pushFrontInline(f7).pushFrontInline(f6).pushFrontInline(f5).pushFrontInline(f4).pushFrontInline(f3).pushFrontInline(f2).pushFrontInline(f1);
    }

    default public Iterative0 pop(Cs1<? super T1> c) {
        Objects.requireNonNull(c, "c is null");
        SimpleIterative.of(this.iterable1()).toIterable().forEach(c);
        return this.create();
    }

    default public Iterative0 pop() {
        return this.pop(Cs1.empty());
    }

    default public Iterative1<T1> forceCleanEmpty1() {
        return this.create(IterativeHandler.clean(this.iterableStream1()));
    }

    default public Iterative1<T1> forceCleanEmptyAll() {
        return this.forceCleanEmpty1();
    }

    default public Iterative1<T1> forceFlat1() {
        return this.create(IterativeHandler.streamWrap(this.iterable1()));
    }

    default public Iterative1<T1> forceFlatAll() {
        return this.forceFlat1();
    }

    default public <R> R getOnSuccessOrNull(Fn1<? super Iterative1<? extends T1>, ? extends R> f) {
        return (R) this.getterOnSuccess(f).onFailure(Sp.empty());
    }

    default public <R> R getOnSuccessOrThrow(Fn1<? super Iterative1<? extends T1>, ? extends R> f) {
        return (R) this.getterOnSuccess(Fn1.narrow(f)).onFailure(Fn0.pass(IterativeGetter::throwableSupplier, "tuple").toSupplier());
    }

    default public T1 getOrElse(Sp<? extends T1> s) {
        return (T1) this.getterOnSuccess().onFailure((T1) s);
    }

    default public T1 getOrElse(T1 t) {
        return (T1) this.getterOnSuccess().onFailure((T1) Sp.value(t));
    }

    default public T1 getOrNull() {
        return (T1) this.getterOnSuccess().onFailure((T1) Sp.empty());
    }

    default public T1 getOrThrow() {
        return (T1) this.getterOnSuccess().onFailure((T1) Fn0.pass(IterativeGetter::throwableSupplier, "tuple").toSupplier());
    }

    default public Iterative1Getter<T1> getter() {
        return new Iterative1Getter.Iterative1GetterImpl(this);
    }

    default public Iterative1Getter.Iterative1Fail<T1, T1> getterOnSuccess() {
        return this.getter().onSuccess();
    }

    default public <R> Iterative1Getter.Iterative1Fail<T1, R> getterOnSuccess(R r) {
        return this.getter().onSuccess(r);
    }

    default public <R> Iterative1Getter.Iterative1Fail<T1, R> getterOnSuccess(Sp<? extends R> s) {
        return this.getter().onSuccess(s);
    }

    default public <R> Iterative1Getter.Iterative1Fail<T1, R> getterOnSuccess(Fn1<? super Iterative1<? extends T1>, ? extends R> f) {
        return this.getter().onSuccess(f);
    }

    default public <R> Iterative1Getter.Iterative1Success<T1, R> getterOnFailure(R r) {
        return this.getter().onFailure(r);
    }

    default public <R> Iterative1Getter.Iterative1Success<T1, R> getterOnFailure(Sp<? extends R> s) {
        return this.getter().onFailure(s);
    }

    default public <R> Iterative1Getter.Iterative1Success<T1, R> getterOnFailure(Fn1<? super Iterative1<? extends T1>, ? extends R> f) {
        return this.getter().onFailure(f);
    }

    default public <R1> Iterative1<R1> inlineTuple1(Fn1<? super T1, ? extends Tuple1<? extends R1>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.map(f).inlineBranch(Tuple1::_1);
    }

    default public <R1, R2> Iterative2Inline<R1, R2> inlineTuple2(Fn1<? super T1, ? extends Tuple2<? extends R1, ? extends R2>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.map(f).inlineBranch(Tuple2::_1, Tuple2::_2);
    }

    default public <R1, R2, R3> Iterative3Inline<R1, R2, R3> inlineTuple3(Fn1<? super T1, ? extends Tuple3<? extends R1, ? extends R2, ? extends R3>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.map(f).inlineBranch(Tuple3::_1, Tuple3::_2, Tuple3::_3);
    }

    default public <R1, R2, R3, R4> Iterative4Inline<R1, R2, R3, R4> inlineTuple4(Fn1<? super T1, ? extends Tuple4<? extends R1, ? extends R2, ? extends R3, ? extends R4>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.map(f).inlineBranch(Tuple4::_1, Tuple4::_2, Tuple4::_3, Tuple4::_4);
    }

    default public <R1, R2, R3, R4, R5> Iterative5Inline<R1, R2, R3, R4, R5> inlineTuple5(Fn1<? super T1, ? extends Tuple5<? extends R1, ? extends R2, ? extends R3, ? extends R4, ? extends R5>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.map(f).inlineBranch(Tuple5::_1, Tuple5::_2, Tuple5::_3, Tuple5::_4, Tuple5::_5);
    }

    default public <R1, R2, R3, R4, R5, R6> Iterative6Inline<R1, R2, R3, R4, R5, R6> inlineTuple6(Fn1<? super T1, ? extends Tuple6<? extends R1, ? extends R2, ? extends R3, ? extends R4, ? extends R5, ? extends R6>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.map(f).inlineBranch(Tuple6::_1, Tuple6::_2, Tuple6::_3, Tuple6::_4, Tuple6::_5, Tuple6::_6);
    }

    default public <R1, R2, R3, R4, R5, R6, R7> Iterative7Inline<R1, R2, R3, R4, R5, R6, R7> inlineTuple7(Fn1<? super T1, ? extends Tuple7<? extends R1, ? extends R2, ? extends R3, ? extends R4, ? extends R5, ? extends R6, ? extends R7>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.map(f).inlineBranch(Tuple7::_1, Tuple7::_2, Tuple7::_3, Tuple7::_4, Tuple7::_5, Tuple7::_6, Tuple7::_7);
    }

    default public <R1, R2, R3, R4, R5, R6, R7, R8> Iterative8Inline<R1, R2, R3, R4, R5, R6, R7, R8> inlineTuple8(Fn1<? super T1, ? extends Tuple8<? extends R1, ? extends R2, ? extends R3, ? extends R4, ? extends R5, ? extends R6, ? extends R7, ? extends R8>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.map(f).inlineBranch(Tuple8::_1, Tuple8::_2, Tuple8::_3, Tuple8::_4, Tuple8::_5, Tuple8::_6, Tuple8::_7, Tuple8::_8);
    }

    default public <R1> Iterative2Cross<T1, R1> crossTrunk(Fn1<? super T1, ? extends R1> f1) {
        return this.createCross(this, this.map(f1).iterableStream1());
    }

    default public <R1, R2> Iterative3Cross<T1, R1, R2> crossTrunk(Fn1<? super T1, ? extends R1> f1, Fn1<? super T1, ? extends R2> f2) {
        return this.createCross(this.crossTrunk(f1), this.map(f2).iterableStream1());
    }

    default public <R> Iterative3Cross<T1, R, R> crossTrunk2(Fn1<? super T1, ? extends R> f) {
        return this.crossTrunk(f, f);
    }

    default public <R1, R2, R3> Iterative4Cross<T1, R1, R2, R3> crossTrunk(Fn1<? super T1, ? extends R1> f1, Fn1<? super T1, ? extends R2> f2, Fn1<? super T1, ? extends R3> f3) {
        return this.createCross(this.crossTrunk(f1, f2), this.map(f3).iterableStream1());
    }

    default public <R> Iterative4Cross<T1, R, R, R> crossTrunk3(Fn1<? super T1, ? extends R> f) {
        return this.crossTrunk(f, f, f);
    }

    default public <R1, R2, R3, R4> Iterative5Cross<T1, R1, R2, R3, R4> crossTrunk(Fn1<? super T1, ? extends R1> f1, Fn1<? super T1, ? extends R2> f2, Fn1<? super T1, ? extends R3> f3, Fn1<? super T1, ? extends R4> f4) {
        return this.createCross(this.crossTrunk(f1, f2, f3), this.map(f4).iterableStream1());
    }

    default public <R> Iterative5Cross<T1, R, R, R, R> crossTrunk4(Fn1<? super T1, ? extends R> f) {
        return this.crossTrunk(f, f, f, f);
    }

    default public <R1, R2, R3, R4, R5> Iterative6Cross<T1, R1, R2, R3, R4, R5> crossTrunk(Fn1<? super T1, ? extends R1> f1, Fn1<? super T1, ? extends R2> f2, Fn1<? super T1, ? extends R3> f3, Fn1<? super T1, ? extends R4> f4, Fn1<? super T1, ? extends R5> f5) {
        return this.createCross(this.crossTrunk(f1, f2, f3, f4), this.map(f5).iterableStream1());
    }

    default public <R> Iterative6Cross<T1, R, R, R, R, R> crossTrunk5(Fn1<? super T1, ? extends R> f) {
        return this.crossTrunk(f, f, f, f, f);
    }

    default public <R1, R2, R3, R4, R5, R6> Iterative7Cross<T1, R1, R2, R3, R4, R5, R6> crossTrunk(Fn1<? super T1, ? extends R1> f1, Fn1<? super T1, ? extends R2> f2, Fn1<? super T1, ? extends R3> f3, Fn1<? super T1, ? extends R4> f4, Fn1<? super T1, ? extends R5> f5, Fn1<? super T1, ? extends R6> f6) {
        return this.createCross(this.crossTrunk(f1, f2, f3, f4, f5), this.map(f6).iterableStream1());
    }

    default public <R> Iterative7Cross<T1, R, R, R, R, R, R> crossTrunk6(Fn1<? super T1, ? extends R> f) {
        return this.crossTrunk(f, f, f, f, f, f);
    }

    default public <R1, R2, R3, R4, R5, R6, R7> Iterative8Cross<T1, R1, R2, R3, R4, R5, R6, R7> crossTrunk(Fn1<? super T1, ? extends R1> f1, Fn1<? super T1, ? extends R2> f2, Fn1<? super T1, ? extends R3> f3, Fn1<? super T1, ? extends R4> f4, Fn1<? super T1, ? extends R5> f5, Fn1<? super T1, ? extends R6> f6, Fn1<? super T1, ? extends R7> f7) {
        return this.createCross(this.crossTrunk(f1, f2, f3, f4, f5, f6), this.map(f7).iterableStream1());
    }

    default public <R> Iterative8Cross<T1, R, R, R, R, R, R, R> crossTrunk7(Fn1<? super T1, ? extends R> f) {
        return this.crossTrunk(f, f, f, f, f, f, f);
    }

    default public <R1> Iterative2Inline<T1, R1> inlineTrunk(Fn1<? super T1, ? extends R1> f1) {
        return this.createInline(this, this.map(f1).iterableStream1());
    }

    default public <R1, R2> Iterative3Inline<T1, R1, R2> inlineTrunk(Fn1<? super T1, ? extends R1> f1, Fn1<? super T1, ? extends R2> f2) {
        return this.createInline(this.inlineTrunk(f1), this.map(f2).iterableStream1());
    }

    default public <R> Iterative3Inline<T1, R, R> inlineTrunk2(Fn1<? super T1, ? extends R> f) {
        return this.inlineTrunk(f, f);
    }

    default public <R1, R2, R3> Iterative4Inline<T1, R1, R2, R3> inlineTrunk(Fn1<? super T1, ? extends R1> f1, Fn1<? super T1, ? extends R2> f2, Fn1<? super T1, ? extends R3> f3) {
        return this.createInline(this.inlineTrunk(f1, f2), this.map(f3).iterableStream1());
    }

    default public <R> Iterative4Inline<T1, R, R, R> inlineTrunk3(Fn1<? super T1, ? extends R> f) {
        return this.inlineTrunk(f, f, f);
    }

    default public <R1, R2, R3, R4> Iterative5Inline<T1, R1, R2, R3, R4> inlineTrunk(Fn1<? super T1, ? extends R1> f1, Fn1<? super T1, ? extends R2> f2, Fn1<? super T1, ? extends R3> f3, Fn1<? super T1, ? extends R4> f4) {
        return this.createInline(this.inlineTrunk(f1, f2, f3), this.map(f4).iterableStream1());
    }

    default public <R> Iterative5Inline<T1, R, R, R, R> inlineTrunk4(Fn1<? super T1, ? extends R> f) {
        return this.inlineTrunk(f, f, f, f);
    }

    default public <R1, R2, R3, R4, R5> Iterative6Inline<T1, R1, R2, R3, R4, R5> inlineTrunk(Fn1<? super T1, ? extends R1> f1, Fn1<? super T1, ? extends R2> f2, Fn1<? super T1, ? extends R3> f3, Fn1<? super T1, ? extends R4> f4, Fn1<? super T1, ? extends R5> f5) {
        return this.createInline(this.inlineTrunk(f1, f2, f3, f4), this.map(f5).iterableStream1());
    }

    default public <R> Iterative6Inline<T1, R, R, R, R, R> inlineTrunk5(Fn1<? super T1, ? extends R> f) {
        return this.inlineTrunk(f, f, f, f, f);
    }

    default public <R1, R2, R3, R4, R5, R6> Iterative7Inline<T1, R1, R2, R3, R4, R5, R6> inlineTrunk(Fn1<? super T1, ? extends R1> f1, Fn1<? super T1, ? extends R2> f2, Fn1<? super T1, ? extends R3> f3, Fn1<? super T1, ? extends R4> f4, Fn1<? super T1, ? extends R5> f5, Fn1<? super T1, ? extends R6> f6) {
        return this.createInline(this.inlineTrunk(f1, f2, f3, f4, f5), this.map(f6).iterableStream1());
    }

    default public <R> Iterative7Inline<T1, R, R, R, R, R, R> inlineTrunk6(Fn1<? super T1, ? extends R> f) {
        return this.inlineTrunk(f, f, f, f, f, f);
    }

    default public <R1, R2, R3, R4, R5, R6, R7> Iterative8Inline<T1, R1, R2, R3, R4, R5, R6, R7> inlineTrunk(Fn1<? super T1, ? extends R1> f1, Fn1<? super T1, ? extends R2> f2, Fn1<? super T1, ? extends R3> f3, Fn1<? super T1, ? extends R4> f4, Fn1<? super T1, ? extends R5> f5, Fn1<? super T1, ? extends R6> f6, Fn1<? super T1, ? extends R7> f7) {
        return this.createInline(this.inlineTrunk(f1, f2, f3, f4, f5, f6), this.map(f7).iterableStream1());
    }

    default public <R> Iterative8Inline<T1, R, R, R, R, R, R, R> inlineTrunk7(Fn1<? super T1, ? extends R> f) {
        return this.inlineTrunk(f, f, f, f, f, f, f);
    }

    default public <R1> Iterative1<R1> crossBranch(Fn1<? super T1, ? extends R1> f1) {
        return this.createCross(this, this.map(f1).iterableStream1()).popFront();
    }

    default public <R1, R2> Iterative2Cross<R1, R2> crossBranch(Fn1<? super T1, ? extends R1> f1, Fn1<? super T1, ? extends R2> f2) {
        return this.createCross(this.crossBranch(f1), this.map(f2).iterableStream1());
    }

    default public <R> Iterative2Cross<R, R> crossBranch2(Fn1<? super T1, ? extends R> f) {
        return this.crossBranch(f, f);
    }

    default public <R1, R2, R3> Iterative3Cross<R1, R2, R3> crossBranch(Fn1<? super T1, ? extends R1> f1, Fn1<? super T1, ? extends R2> f2, Fn1<? super T1, ? extends R3> f3) {
        return this.createCross(this.crossBranch(f1, f2), this.map(f3).iterableStream1());
    }

    default public <R> Iterative3Cross<R, R, R> crossBranch3(Fn1<? super T1, ? extends R> f) {
        return this.crossBranch(f, f, f);
    }

    default public <R1, R2, R3, R4> Iterative4Cross<R1, R2, R3, R4> crossBranch(Fn1<? super T1, ? extends R1> f1, Fn1<? super T1, ? extends R2> f2, Fn1<? super T1, ? extends R3> f3, Fn1<? super T1, ? extends R4> f4) {
        return this.createCross(this.crossBranch(f1, f2, f3), this.map(f4).iterableStream1());
    }

    default public <R> Iterative4Cross<R, R, R, R> crossBranch4(Fn1<? super T1, ? extends R> f) {
        return this.crossBranch(f, f, f, f);
    }

    default public <R1, R2, R3, R4, R5> Iterative5Cross<R1, R2, R3, R4, R5> crossBranch(Fn1<? super T1, ? extends R1> f1, Fn1<? super T1, ? extends R2> f2, Fn1<? super T1, ? extends R3> f3, Fn1<? super T1, ? extends R4> f4, Fn1<? super T1, ? extends R5> f5) {
        return this.createCross(this.crossBranch(f1, f2, f3, f4), this.map(f5).iterableStream1());
    }

    default public <R> Iterative5Cross<R, R, R, R, R> crossBranch5(Fn1<? super T1, ? extends R> f) {
        return this.crossBranch(f, f, f, f, f);
    }

    default public <R1, R2, R3, R4, R5, R6> Iterative6Cross<R1, R2, R3, R4, R5, R6> crossBranch(Fn1<? super T1, ? extends R1> f1, Fn1<? super T1, ? extends R2> f2, Fn1<? super T1, ? extends R3> f3, Fn1<? super T1, ? extends R4> f4, Fn1<? super T1, ? extends R5> f5, Fn1<? super T1, ? extends R6> f6) {
        return this.createCross(this.crossBranch(f1, f2, f3, f4, f5), this.map(f6).iterableStream1());
    }

    default public <R> Iterative6Cross<R, R, R, R, R, R> crossBranch6(Fn1<? super T1, ? extends R> f) {
        return this.crossBranch(f, f, f, f, f, f);
    }

    default public <R1, R2, R3, R4, R5, R6, R7> Iterative7Cross<R1, R2, R3, R4, R5, R6, R7> crossBranch(Fn1<? super T1, ? extends R1> f1, Fn1<? super T1, ? extends R2> f2, Fn1<? super T1, ? extends R3> f3, Fn1<? super T1, ? extends R4> f4, Fn1<? super T1, ? extends R5> f5, Fn1<? super T1, ? extends R6> f6, Fn1<? super T1, ? extends R7> f7) {
        return this.createCross(this.crossBranch(f1, f2, f3, f4, f5, f6), this.map(f7).iterableStream1());
    }

    default public <R> Iterative7Cross<R, R, R, R, R, R, R> crossBranch7(Fn1<? super T1, ? extends R> f) {
        return this.crossBranch(f, f, f, f, f, f, f);
    }

    default public <R1, R2, R3, R4, R5, R6, R7, R8> Iterative8Cross<R1, R2, R3, R4, R5, R6, R7, R8> crossBranch(Fn1<? super T1, ? extends R1> f1, Fn1<? super T1, ? extends R2> f2, Fn1<? super T1, ? extends R3> f3, Fn1<? super T1, ? extends R4> f4, Fn1<? super T1, ? extends R5> f5, Fn1<? super T1, ? extends R6> f6, Fn1<? super T1, ? extends R7> f7, Fn1<? super T1, ? extends R8> f8) {
        return this.createCross(this.crossBranch(f1, f2, f3, f4, f5, f6, f7), this.map(f8).iterableStream1());
    }

    default public <R> Iterative8Cross<R, R, R, R, R, R, R, R> crossBranch8(Fn1<? super T1, ? extends R> f) {
        return this.crossBranch(f, f, f, f, f, f, f, f);
    }

    default public <R1> Iterative1<R1> inlineBranch(Fn1<? super T1, ? extends R1> f1) {
        return this.createInline(this, this.map(f1).iterableStream1()).popFront();
    }

    default public <R1, R2> Iterative2Inline<R1, R2> inlineBranch(Fn1<? super T1, ? extends R1> f1, Fn1<? super T1, ? extends R2> f2) {
        return this.createInline(this.inlineBranch(f1), this.map(f2).iterableStream1());
    }

    default public <R> Iterative2Inline<R, R> inlineBranch2(Fn1<? super T1, ? extends R> f) {
        return this.inlineBranch(f, f);
    }

    default public <R1, R2, R3> Iterative3Inline<R1, R2, R3> inlineBranch(Fn1<? super T1, ? extends R1> f1, Fn1<? super T1, ? extends R2> f2, Fn1<? super T1, ? extends R3> f3) {
        return this.createInline(this.inlineBranch(f1, f2), this.map(f3).iterableStream1());
    }

    default public <R> Iterative3Inline<R, R, R> inlineBranch3(Fn1<? super T1, ? extends R> f) {
        return this.inlineBranch(f, f, f);
    }

    default public <R1, R2, R3, R4> Iterative4Inline<R1, R2, R3, R4> inlineBranch(Fn1<? super T1, ? extends R1> f1, Fn1<? super T1, ? extends R2> f2, Fn1<? super T1, ? extends R3> f3, Fn1<? super T1, ? extends R4> f4) {
        return this.createInline(this.inlineBranch(f1, f2, f3), this.map(f4).iterableStream1());
    }

    default public <R> Iterative4Inline<R, R, R, R> inlineBranch4(Fn1<? super T1, ? extends R> f) {
        return this.inlineBranch(f, f, f, f);
    }

    default public <R1, R2, R3, R4, R5> Iterative5Inline<R1, R2, R3, R4, R5> inlineBranch(Fn1<? super T1, ? extends R1> f1, Fn1<? super T1, ? extends R2> f2, Fn1<? super T1, ? extends R3> f3, Fn1<? super T1, ? extends R4> f4, Fn1<? super T1, ? extends R5> f5) {
        return this.createInline(this.inlineBranch(f1, f2, f3, f4), this.map(f5).iterableStream1());
    }

    default public <R> Iterative5Inline<R, R, R, R, R> inlineBranch5(Fn1<? super T1, ? extends R> f) {
        return this.inlineBranch(f, f, f, f, f);
    }

    default public <R1, R2, R3, R4, R5, R6> Iterative6Inline<R1, R2, R3, R4, R5, R6> inlineBranch(Fn1<? super T1, ? extends R1> f1, Fn1<? super T1, ? extends R2> f2, Fn1<? super T1, ? extends R3> f3, Fn1<? super T1, ? extends R4> f4, Fn1<? super T1, ? extends R5> f5, Fn1<? super T1, ? extends R6> f6) {
        return this.createInline(this.inlineBranch(f1, f2, f3, f4, f5), this.map(f6).iterableStream1());
    }

    default public <R> Iterative6Inline<R, R, R, R, R, R> inlineBranch6(Fn1<? super T1, ? extends R> f) {
        return this.inlineBranch(f, f, f, f, f, f);
    }

    default public <R1, R2, R3, R4, R5, R6, R7> Iterative7Inline<R1, R2, R3, R4, R5, R6, R7> inlineBranch(Fn1<? super T1, ? extends R1> f1, Fn1<? super T1, ? extends R2> f2, Fn1<? super T1, ? extends R3> f3, Fn1<? super T1, ? extends R4> f4, Fn1<? super T1, ? extends R5> f5, Fn1<? super T1, ? extends R6> f6, Fn1<? super T1, ? extends R7> f7) {
        return this.createInline(this.inlineBranch(f1, f2, f3, f4, f5, f6), this.map(f7).iterableStream1());
    }

    default public <R> Iterative7Inline<R, R, R, R, R, R, R> inlineBranch7(Fn1<? super T1, ? extends R> f) {
        return this.inlineBranch(f, f, f, f, f, f, f);
    }

    default public <R1, R2, R3, R4, R5, R6, R7, R8> Iterative8Inline<R1, R2, R3, R4, R5, R6, R7, R8> inlineBranch(Fn1<? super T1, ? extends R1> f1, Fn1<? super T1, ? extends R2> f2, Fn1<? super T1, ? extends R3> f3, Fn1<? super T1, ? extends R4> f4, Fn1<? super T1, ? extends R5> f5, Fn1<? super T1, ? extends R6> f6, Fn1<? super T1, ? extends R7> f7, Fn1<? super T1, ? extends R8> f8) {
        return this.createInline(this.inlineBranch(f1, f2, f3, f4, f5, f6, f7), this.map(f8).iterableStream1());
    }

    default public <R> Iterative8Inline<R, R, R, R, R, R, R, R> inlineBranch8(Fn1<? super T1, ? extends R> f) {
        return this.inlineBranch(f, f, f, f, f, f, f, f);
    }

    default public <A1> Iterative1Args.Iterative1Args1<T1, A1> crossArgs(A1 a1) {
        return this.crossArgsOf((Iterable<? extends A1>) this.wrap(a1));
    }

    default public <A1> Iterative1Args.Iterative1Args1<T1, A1> crossArgsOf(Iterable<? extends A1> a1) {
        return new Iterative1Args.Iterative1Args1.Iterative1Args1Impl(this, this.accessBuilder().cross().of(a1), true);
    }

    default public <A1, A2> Iterative1Args.Iterative1Args2<T1, A1, A2> crossArgs(A1 a1, A2 a2) {
        return this.crossArgsOf((Iterable<? extends A1>) this.wrap(a1), (Iterable<? extends A2>) this.wrap(a2));
    }

    default public <A1, A2> Iterative1Args.Iterative1Args2<T1, A1, A2> crossArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2) {
        return new Iterative1Args.Iterative1Args2.Iterative1Args2Impl(this, this.accessBuilder().cross().of(a1, (Iterable) a2), true);
    }

    default public <A1, A2, A3> Iterative1Args.Iterative1Args3<T1, A1, A2, A3> crossArgs(A1 a1, A2 a2, A3 a3) {
        return this.crossArgsOf((Iterable<? extends A1>) this.wrap(a1), (Iterable<? extends A2>) this.wrap(a2), (Iterable<? extends A3>) this.wrap(a3));
    }

    default public <A1, A2, A3> Iterative1Args.Iterative1Args3<T1, A1, A2, A3> crossArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3) {
        return new Iterative1Args.Iterative1Args3.Iterative1Args3Impl(this, this.accessBuilder().cross().of(a1, a2, a3), true);
    }

    default public <A1, A2, A3, A4> Iterative1Args.Iterative1Args4<T1, A1, A2, A3, A4> crossArgs(A1 a1, A2 a2, A3 a3, A4 a4) {
        return this.crossArgsOf((Iterable<? extends A1>) this.wrap(a1), (Iterable<? extends A2>) this.wrap(a2), (Iterable<? extends A3>) this.wrap(a3), (Iterable<? extends A4>) this.wrap(a4));
    }

    default public <A1, A2, A3, A4> Iterative1Args.Iterative1Args4<T1, A1, A2, A3, A4> crossArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4) {
        return new Iterative1Args.Iterative1Args4.Iterative1Args4Impl(this, this.accessBuilder().cross().of(a1, a2, a3, a4), true);
    }

    default public <A1, A2, A3, A4, A5> Iterative1Args.Iterative1Args5<T1, A1, A2, A3, A4, A5> crossArgs(A1 a1, A2 a2, A3 a3, A4 a4, A5 a5) {
        return this.crossArgsOf((Iterable<? extends A1>) this.wrap(a1), (Iterable<? extends A2>) this.wrap(a2), (Iterable<? extends A3>) this.wrap(a3), (Iterable<? extends A4>) this.wrap(a4), (Iterable<? extends A5>) this.wrap(a5));
    }

    default public <A1, A2, A3, A4, A5> Iterative1Args.Iterative1Args5<T1, A1, A2, A3, A4, A5> crossArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5) {
        return new Iterative1Args.Iterative1Args5.Iterative1Args5Impl(this, this.accessBuilder().cross().of(a1, a2, a3, a4, a5), true);
    }

    default public <A1, A2, A3, A4, A5, A6> Iterative1Args.Iterative1Args6<T1, A1, A2, A3, A4, A5, A6> crossArgs(A1 a1, A2 a2, A3 a3, A4 a4, A5 a5, A6 a6) {
        return this.crossArgsOf((Iterable<? extends A1>) this.wrap(a1), (Iterable<? extends A2>) this.wrap(a2), (Iterable<? extends A3>) this.wrap(a3), (Iterable<? extends A4>) this.wrap(a4), (Iterable<? extends A5>) this.wrap(a5), (Iterable<? extends A6>) this.wrap(a6));
    }

    default public <A1, A2, A3, A4, A5, A6> Iterative1Args.Iterative1Args6<T1, A1, A2, A3, A4, A5, A6> crossArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5, Iterable<? extends A6> a6) {
        return new Iterative1Args.Iterative1Args6.Iterative1Args6Impl(this, this.accessBuilder().cross().of(a1, a2, a3, a4, a5, a6), true);
    }

    default public <A1, A2, A3, A4, A5, A6, A7> Iterative1Args.Iterative1Args7<T1, A1, A2, A3, A4, A5, A6, A7> crossArgs(A1 a1, A2 a2, A3 a3, A4 a4, A5 a5, A6 a6, A7 a7) {
        return this.crossArgsOf((Iterable<? extends A1>) this.wrap(a1), (Iterable<? extends A2>) this.wrap(a2), (Iterable<? extends A3>) this.wrap(a3), (Iterable<? extends A4>) this.wrap(a4), (Iterable<? extends A5>) this.wrap(a5), (Iterable<? extends A6>) this.wrap(a6), (Iterable<? extends A7>) this.wrap(a7));
    }

    default public <A1, A2, A3, A4, A5, A6, A7> Iterative1Args.Iterative1Args7<T1, A1, A2, A3, A4, A5, A6, A7> crossArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5, Iterable<? extends A6> a6, Iterable<? extends A7> a7) {
        return new Iterative1Args.Iterative1Args7.Iterative1Args7Impl(this, this.accessBuilder().cross().of(a1, a2, a3, a4, a5, a6, a7), true);
    }

    default public <A1> Iterative1Args.Iterative1Args1<T1, A1> inlineArgs(A1 a1) {
        return this.inlineArgsOf((Iterable<? extends A1>) this.wrap(a1));
    }

    default public <A1> Iterative1Args.Iterative1Args1<T1, A1> inlineArgsOf(Iterable<? extends A1> a1) {
        return new Iterative1Args.Iterative1Args1.Iterative1Args1Impl(this, this.accessBuilder().inline().of(a1), false);
    }

    default public <A1, A2> Iterative1Args.Iterative1Args2<T1, A1, A2> inlineArgs(A1 a1, A2 a2) {
        return this.inlineArgsOf((Iterable<? extends A1>) this.wrap(a1), (Iterable<? extends A2>) this.wrap(a2));
    }

    default public <A1, A2> Iterative1Args.Iterative1Args2<T1, A1, A2> inlineArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2) {
        return new Iterative1Args.Iterative1Args2.Iterative1Args2Impl(this, this.accessBuilder().inline().of(a1, (Iterable) a2), false);
    }

    default public <A1, A2, A3> Iterative1Args.Iterative1Args3<T1, A1, A2, A3> inlineArgs(A1 a1, A2 a2, A3 a3) {
        return this.inlineArgsOf((Iterable<? extends A1>) this.wrap(a1), (Iterable<? extends A2>) this.wrap(a2), (Iterable<? extends A3>) this.wrap(a3));
    }

    default public <A1, A2, A3> Iterative1Args.Iterative1Args3<T1, A1, A2, A3> inlineArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3) {
        return new Iterative1Args.Iterative1Args3.Iterative1Args3Impl(this, this.accessBuilder().inline().of(a1, a2, a3), false);
    }

    default public <A1, A2, A3, A4> Iterative1Args.Iterative1Args4<T1, A1, A2, A3, A4> inlineArgs(A1 a1, A2 a2, A3 a3, A4 a4) {
        return this.inlineArgsOf((Iterable<? extends A1>) this.wrap(a1), (Iterable<? extends A2>) this.wrap(a2), (Iterable<? extends A3>) this.wrap(a3), (Iterable<? extends A4>) this.wrap(a4));
    }

    default public <A1, A2, A3, A4> Iterative1Args.Iterative1Args4<T1, A1, A2, A3, A4> inlineArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4) {
        return new Iterative1Args.Iterative1Args4.Iterative1Args4Impl(this, this.accessBuilder().inline().of(a1, a2, a3, a4), false);
    }

    default public <A1, A2, A3, A4, A5> Iterative1Args.Iterative1Args5<T1, A1, A2, A3, A4, A5> inlineArgs(A1 a1, A2 a2, A3 a3, A4 a4, A5 a5) {
        return this.inlineArgsOf((Iterable<? extends A1>) this.wrap(a1), (Iterable<? extends A2>) this.wrap(a2), (Iterable<? extends A3>) this.wrap(a3), (Iterable<? extends A4>) this.wrap(a4), (Iterable<? extends A5>) this.wrap(a5));
    }

    default public <A1, A2, A3, A4, A5> Iterative1Args.Iterative1Args5<T1, A1, A2, A3, A4, A5> inlineArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5) {
        return new Iterative1Args.Iterative1Args5.Iterative1Args5Impl(this, this.accessBuilder().inline().of(a1, a2, a3, a4, a5), false);
    }

    default public <A1, A2, A3, A4, A5, A6> Iterative1Args.Iterative1Args6<T1, A1, A2, A3, A4, A5, A6> inlineArgs(A1 a1, A2 a2, A3 a3, A4 a4, A5 a5, A6 a6) {
        return this.inlineArgsOf((Iterable<? extends A1>) this.wrap(a1), (Iterable<? extends A2>) this.wrap(a2), (Iterable<? extends A3>) this.wrap(a3), (Iterable<? extends A4>) this.wrap(a4), (Iterable<? extends A5>) this.wrap(a5), (Iterable<? extends A6>) this.wrap(a6));
    }

    default public <A1, A2, A3, A4, A5, A6> Iterative1Args.Iterative1Args6<T1, A1, A2, A3, A4, A5, A6> inlineArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5, Iterable<? extends A6> a6) {
        return new Iterative1Args.Iterative1Args6.Iterative1Args6Impl(this, this.accessBuilder().inline().of(a1, a2, a3, a4, a5, a6), false);
    }

    default public <A1, A2, A3, A4, A5, A6, A7> Iterative1Args.Iterative1Args7<T1, A1, A2, A3, A4, A5, A6, A7> inlineArgs(A1 a1, A2 a2, A3 a3, A4 a4, A5 a5, A6 a6, A7 a7) {
        return this.inlineArgsOf((Iterable<? extends A1>) this.wrap(a1), (Iterable<? extends A2>) this.wrap(a2), (Iterable<? extends A3>) this.wrap(a3), (Iterable<? extends A4>) this.wrap(a4), (Iterable<? extends A5>) this.wrap(a5), (Iterable<? extends A6>) this.wrap(a6), (Iterable<? extends A7>) this.wrap(a7));
    }

    default public <A1, A2, A3, A4, A5, A6, A7> Iterative1Args.Iterative1Args7<T1, A1, A2, A3, A4, A5, A6, A7> inlineArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5, Iterable<? extends A6> a6, Iterable<? extends A7> a7) {
        return new Iterative1Args.Iterative1Args7.Iterative1Args7Impl(this, this.accessBuilder().inline().of(a1, a2, a3, a4, a5, a6, a7), false);
    }

    default public <A1> IterativeSupplier.Iterative1Supplier1.TransformSupplier<T1, A1> crossSupplierOf(Iterable<? extends A1> a1) {
        return new IterativeSupplier.Iterative1Supplier1.Iterative1Supplier1Impl<T1, A1>(this.pushBackCrossOf(a1));
    }

    default public <A1> IterativeSupplier.Iterative1Supplier1.TransformSupplier<T1, A1> inlineSupplierOf(Iterable<? extends A1> a1) {
        return new IterativeSupplier.Iterative1Supplier1.Iterative1Supplier1Impl<T1, A1>(this.pushBackInlineOf(a1));
    }

    default public <A1> IterativeSupplier.Iterative1Supplier1.TransformSupplier<T1, A1> crossSupplier(A1 a1) {
        return this.crossSupplierOf((Iterable<? extends A1>) this.wrap(a1));
    }

    default public <A1> IterativeSupplier.Iterative1Supplier1.TransformSupplier<T1, A1> inlineSupplier(A1 a1) {
        return this.inlineSupplierOf((Iterable<? extends A1>) this.wrap(a1));
    }

    default public <A1, A2> IterativeSupplier.Iterative1Supplier2.TransformSupplier<T1, A1, A2> crossSupplierOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2) {
        return new IterativeSupplier.Iterative1Supplier2.Iterative1Supplier2Impl(this.pushBackCrossOf(a1).pushBackCrossOf(a2));
    }

    default public <A1, A2> IterativeSupplier.Iterative1Supplier2.TransformSupplier<T1, A1, A2> inlineSupplierOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2) {
        return new IterativeSupplier.Iterative1Supplier2.Iterative1Supplier2Impl(this.pushBackInlineOf(a1).pushBackInlineOf(a2));
    }

    default public <A1, A2> IterativeSupplier.Iterative1Supplier2.TransformSupplier<T1, A1, A2> crossSupplier(A1 a1, A2 a2) {
        return this.crossSupplierOf((Iterable<? extends A1>) this.wrap(a1), (Iterable<? extends A2>) this.wrap(a2));
    }

    default public <A1, A2> IterativeSupplier.Iterative1Supplier2.TransformSupplier<T1, A1, A2> inlineSupplier(A1 a1, A2 a2) {
        return this.inlineSupplierOf((Iterable<? extends A1>) this.wrap(a1), (Iterable<? extends A2>) this.wrap(a2));
    }

    default public <A1, A2, A3> IterativeSupplier.Iterative1Supplier3.TransformSupplier<T1, A1, A2, A3> crossSupplierOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3) {
        return new IterativeSupplier.Iterative1Supplier3.Iterative1Supplier3Impl(this.pushBackCrossOf(a1).pushBackCrossOf(a2).pushBackCrossOf(a3));
    }

    default public <A1, A2, A3> IterativeSupplier.Iterative1Supplier3.TransformSupplier<T1, A1, A2, A3> inlineSupplierOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3) {
        return new IterativeSupplier.Iterative1Supplier3.Iterative1Supplier3Impl(this.pushBackInlineOf(a1).pushBackInlineOf(a2).pushBackInlineOf(a3));
    }

    default public <A1, A2, A3> IterativeSupplier.Iterative1Supplier3.TransformSupplier<T1, A1, A2, A3> crossSupplier(A1 a1, A2 a2, A3 a3) {
        return this.crossSupplierOf((Iterable<? extends A1>) this.wrap(a1), (Iterable<? extends A2>) this.wrap(a2), (Iterable<? extends A3>) this.wrap(a3));
    }

    default public <A1, A2, A3> IterativeSupplier.Iterative1Supplier3.TransformSupplier<T1, A1, A2, A3> inlineSupplier(A1 a1, A2 a2, A3 a3) {
        return this.inlineSupplierOf((Iterable<? extends A1>) this.wrap(a1), (Iterable<? extends A2>) this.wrap(a2), (Iterable<? extends A3>) this.wrap(a3));
    }

    default public <A1, A2, A3, A4> IterativeSupplier.Iterative1Supplier4.TransformSupplier<T1, A1, A2, A3, A4> crossSupplierOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4) {
        return new IterativeSupplier.Iterative1Supplier4.Iterative1Supplier4Impl(this.pushBackCrossOf(a1).pushBackCrossOf(a2).pushBackCrossOf(a3).pushBackCrossOf(a4));
    }

    default public <A1, A2, A3, A4> IterativeSupplier.Iterative1Supplier4.TransformSupplier<T1, A1, A2, A3, A4> inlineSupplierOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4) {
        return new IterativeSupplier.Iterative1Supplier4.Iterative1Supplier4Impl(this.pushBackInlineOf(a1).pushBackInlineOf(a2).pushBackInlineOf(a3).pushBackInlineOf(a4));
    }

    default public <A1, A2, A3, A4> IterativeSupplier.Iterative1Supplier4.TransformSupplier<T1, A1, A2, A3, A4> crossSupplier(A1 a1, A2 a2, A3 a3, A4 a4) {
        return this.crossSupplierOf((Iterable<? extends A1>) this.wrap(a1), (Iterable<? extends A2>) this.wrap(a2), (Iterable<? extends A3>) this.wrap(a3), (Iterable<? extends A4>) this.wrap(a4));
    }

    default public <A1, A2, A3, A4> IterativeSupplier.Iterative1Supplier4.TransformSupplier<T1, A1, A2, A3, A4> inlineSupplier(A1 a1, A2 a2, A3 a3, A4 a4) {
        return this.inlineSupplierOf((Iterable<? extends A1>) this.wrap(a1), (Iterable<? extends A2>) this.wrap(a2), (Iterable<? extends A3>) this.wrap(a3), (Iterable<? extends A4>) this.wrap(a4));
    }

    default public <A1, A2, A3, A4, A5> IterativeSupplier.Iterative1Supplier5.TransformSupplier<T1, A1, A2, A3, A4, A5> crossSupplierOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5) {
        return new IterativeSupplier.Iterative1Supplier5.Iterative1Supplier5Impl(this.pushBackCrossOf(a1).pushBackCrossOf(a2).pushBackCrossOf(a3).pushBackCrossOf(a4).pushBackCrossOf(a5));
    }

    default public <A1, A2, A3, A4, A5> IterativeSupplier.Iterative1Supplier5.TransformSupplier<T1, A1, A2, A3, A4, A5> inlineSupplierOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5) {
        return new IterativeSupplier.Iterative1Supplier5.Iterative1Supplier5Impl(this.pushBackInlineOf(a1).pushBackInlineOf(a2).pushBackInlineOf(a3).pushBackInlineOf(a4).pushBackInlineOf(a5));
    }

    default public <A1, A2, A3, A4, A5> IterativeSupplier.Iterative1Supplier5.TransformSupplier<T1, A1, A2, A3, A4, A5> crossSupplier(A1 a1, A2 a2, A3 a3, A4 a4, A5 a5) {
        return this.crossSupplierOf((Iterable<? extends A1>) this.wrap(a1), (Iterable<? extends A2>) this.wrap(a2), (Iterable<? extends A3>) this.wrap(a3), (Iterable<? extends A4>) this.wrap(a4), (Iterable<? extends A5>) this.wrap(a5));
    }

    default public <A1, A2, A3, A4, A5> IterativeSupplier.Iterative1Supplier5.TransformSupplier<T1, A1, A2, A3, A4, A5> inlineSupplier(A1 a1, A2 a2, A3 a3, A4 a4, A5 a5) {
        return this.inlineSupplierOf((Iterable<? extends A1>) this.wrap(a1), (Iterable<? extends A2>) this.wrap(a2), (Iterable<? extends A3>) this.wrap(a3), (Iterable<? extends A4>) this.wrap(a4), (Iterable<? extends A5>) this.wrap(a5));
    }

    default public <A1, A2, A3, A4, A5, A6> IterativeSupplier.Iterative1Supplier6.TransformSupplier<T1, A1, A2, A3, A4, A5, A6> crossSupplierOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5, Iterable<? extends A6> a6) {
        return new IterativeSupplier.Iterative1Supplier6.Iterative1Supplier6Impl(this.pushBackCrossOf(a1).pushBackCrossOf(a2).pushBackCrossOf(a3).pushBackCrossOf(a4).pushBackCrossOf(a5).pushBackCrossOf(a6));
    }

    default public <A1, A2, A3, A4, A5, A6> IterativeSupplier.Iterative1Supplier6.TransformSupplier<T1, A1, A2, A3, A4, A5, A6> inlineSupplierOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5, Iterable<? extends A6> a6) {
        return new IterativeSupplier.Iterative1Supplier6.Iterative1Supplier6Impl(this.pushBackInlineOf(a1).pushBackInlineOf(a2).pushBackInlineOf(a3).pushBackInlineOf(a4).pushBackInlineOf(a5).pushBackInlineOf(a6));
    }

    default public <A1, A2, A3, A4, A5, A6> IterativeSupplier.Iterative1Supplier6.TransformSupplier<T1, A1, A2, A3, A4, A5, A6> crossSupplier(A1 a1, A2 a2, A3 a3, A4 a4, A5 a5, A6 a6) {
        return this.crossSupplierOf((Iterable<? extends A1>) this.wrap(a1), (Iterable<? extends A2>) this.wrap(a2), (Iterable<? extends A3>) this.wrap(a3), (Iterable<? extends A4>) this.wrap(a4), (Iterable<? extends A5>) this.wrap(a5), (Iterable<? extends A6>) this.wrap(a6));
    }

    default public <A1, A2, A3, A4, A5, A6> IterativeSupplier.Iterative1Supplier6.TransformSupplier<T1, A1, A2, A3, A4, A5, A6> inlineSupplier(A1 a1, A2 a2, A3 a3, A4 a4, A5 a5, A6 a6) {
        return this.inlineSupplierOf((Iterable<? extends A1>) this.wrap(a1), (Iterable<? extends A2>) this.wrap(a2), (Iterable<? extends A3>) this.wrap(a3), (Iterable<? extends A4>) this.wrap(a4), (Iterable<? extends A5>) this.wrap(a5), (Iterable<? extends A6>) this.wrap(a6));
    }

    default public <A1, A2, A3, A4, A5, A6, A7> IterativeSupplier.Iterative1Supplier7.TransformSupplier<T1, A1, A2, A3, A4, A5, A6, A7> crossSupplierOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5, Iterable<? extends A6> a6, Iterable<? extends A7> a7) {
        return new IterativeSupplier.Iterative1Supplier7.Iterative1Supplier7Impl(this.pushBackCrossOf(a1).pushBackCrossOf(a2).pushBackCrossOf(a3).pushBackCrossOf(a4).pushBackCrossOf(a5).pushBackCrossOf(a6).pushBackCrossOf(a7));
    }

    default public <A1, A2, A3, A4, A5, A6, A7> IterativeSupplier.Iterative1Supplier7.TransformSupplier<T1, A1, A2, A3, A4, A5, A6, A7> inlineSupplierOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5, Iterable<? extends A6> a6, Iterable<? extends A7> a7) {
        return new IterativeSupplier.Iterative1Supplier7.Iterative1Supplier7Impl(this.pushBackInlineOf(a1).pushBackInlineOf(a2).pushBackInlineOf(a3).pushBackInlineOf(a4).pushBackInlineOf(a5).pushBackInlineOf(a6).pushBackInlineOf(a7));
    }

    default public <A1, A2, A3, A4, A5, A6, A7> IterativeSupplier.Iterative1Supplier7.TransformSupplier<T1, A1, A2, A3, A4, A5, A6, A7> crossSupplier(A1 a1, A2 a2, A3 a3, A4 a4, A5 a5, A6 a6, A7 a7) {
        return this.crossSupplierOf((Iterable<? extends A1>) this.wrap(a1), (Iterable<? extends A2>) this.wrap(a2), (Iterable<? extends A3>) this.wrap(a3), (Iterable<? extends A4>) this.wrap(a4), (Iterable<? extends A5>) this.wrap(a5), (Iterable<? extends A6>) this.wrap(a6), (Iterable<? extends A7>) this.wrap(a7));
    }

    default public <A1, A2, A3, A4, A5, A6, A7> IterativeSupplier.Iterative1Supplier7.TransformSupplier<T1, A1, A2, A3, A4, A5, A6, A7> inlineSupplier(A1 a1, A2 a2, A3 a3, A4 a4, A5 a5, A6 a6, A7 a7) {
        return this.inlineSupplierOf((Iterable<? extends A1>) this.wrap(a1), (Iterable<? extends A2>) this.wrap(a2), (Iterable<? extends A3>) this.wrap(a3), (Iterable<? extends A4>) this.wrap(a4), (Iterable<? extends A5>) this.wrap(a5), (Iterable<? extends A6>) this.wrap(a6), (Iterable<? extends A7>) this.wrap(a7));
    }

    default public <A1> Iterative2<T1, A1> crossJoinRt(Iterative1<? extends A1> iterative) {
        return this.createCross(this, iterative.iterableStream1());
    }

    default public <A1> Iterative2<A1, T1> crossJoinLt(Iterative1<? extends A1> iterative) {
        return this.pushFrontCrossBy(iterative.iterableStream1());
    }

    default public <A1, A2> Iterative3<T1, A1, A2> crossJoinRt(Iterative2<? extends A1, ? extends A2> iterative) {
        return this.create(this.crossJoinRt(iterative.splitLt()), iterative.iterableStream2(), iterative.isCross());
    }

    default public <A1, A2> Iterative3<A1, A2, T1> crossJoinLt(Iterative2<? extends A1, ? extends A2> iterative) {
        return iterative.isCross() ? this.crossJoinLt(iterative.splitRt()).pushFrontCrossBy(iterative.iterableStream1()) : this.crossJoinLt(iterative.splitRt()).pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1, A2, A3> Iterative4<T1, A1, A2, A3> crossJoinRt(Iterative3<? extends A1, ? extends A2, ? extends A3> iterative) {
        return this.create(this.crossJoinRt(iterative.splitLt2()), iterative.iterableStream3(), iterative.isCross());
    }

    default public <A1, A2, A3> Iterative4<A1, A2, A3, T1> crossJoinLt(Iterative3<? extends A1, ? extends A2, ? extends A3> iterative) {
        return iterative.splitLt2().isCross() ? this.crossJoinLt(iterative.splitRt2()).pushFrontCrossBy(iterative.iterableStream1()) : this.crossJoinLt(iterative.splitRt2()).pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1, A2, A3, A4> Iterative5<T1, A1, A2, A3, A4> crossJoinRt(Iterative4<? extends A1, ? extends A2, ? extends A3, ? extends A4> iterative) {
        return this.create(this.crossJoinRt(iterative.splitLt3()), iterative.iterableStream4(), iterative.isCross());
    }

    default public <A1, A2, A3, A4> Iterative5<A1, A2, A3, A4, T1> crossJoinLt(Iterative4<? extends A1, ? extends A2, ? extends A3, ? extends A4> iterative) {
        return iterative.splitLt2().isCross() ? this.crossJoinLt(iterative.splitRt3()).pushFrontCrossBy(iterative.iterableStream1()) : this.crossJoinLt(iterative.splitRt3()).pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1, A2, A3, A4, A5> Iterative6<T1, A1, A2, A3, A4, A5> crossJoinRt(Iterative5<? extends A1, ? extends A2, ? extends A3, ? extends A4, ? extends A5> iterative) {
        return this.create(this.crossJoinRt(iterative.splitLt4()), iterative.iterableStream5(), iterative.isCross());
    }

    default public <A1, A2, A3, A4, A5> Iterative6<A1, A2, A3, A4, A5, T1> crossJoinLt(Iterative5<? extends A1, ? extends A2, ? extends A3, ? extends A4, ? extends A5> iterative) {
        return iterative.splitLt2().isCross() ? this.crossJoinLt(iterative.splitRt4()).pushFrontCrossBy(iterative.iterableStream1()) : this.crossJoinLt(iterative.splitRt4()).pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1, A2, A3, A4, A5, A6> Iterative7<T1, A1, A2, A3, A4, A5, A6> crossJoinRt(Iterative6<? extends A1, ? extends A2, ? extends A3, ? extends A4, ? extends A5, ? extends A6> iterative) {
        return this.create(this.crossJoinRt(iterative.splitLt5()), iterative.iterableStream6(), iterative.isCross());
    }

    default public <A1, A2, A3, A4, A5, A6> Iterative7<A1, A2, A3, A4, A5, A6, T1> crossJoinLt(Iterative6<? extends A1, ? extends A2, ? extends A3, ? extends A4, ? extends A5, ? extends A6> iterative) {
        return iterative.splitLt2().isCross() ? this.crossJoinLt(iterative.splitRt5()).pushFrontCrossBy(iterative.iterableStream1()) : this.crossJoinLt(iterative.splitRt5()).pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1, A2, A3, A4, A5, A6, A7> Iterative8<T1, A1, A2, A3, A4, A5, A6, A7> crossJoinRt(Iterative7<? extends A1, ? extends A2, ? extends A3, ? extends A4, ? extends A5, ? extends A6, ? extends A7> iterative) {
        return this.create(this.crossJoinRt(iterative.splitLt6()), iterative.iterableStream7(), iterative.isCross());
    }

    default public <A1, A2, A3, A4, A5, A6, A7> Iterative8<A1, A2, A3, A4, A5, A6, A7, T1> crossJoinLt(Iterative7<? extends A1, ? extends A2, ? extends A3, ? extends A4, ? extends A5, ? extends A6, ? extends A7> iterative) {
        return iterative.splitLt2().isCross() ? this.crossJoinLt(iterative.splitRt6()).pushFrontCrossBy(iterative.iterableStream1()) : this.crossJoinLt(iterative.splitRt6()).pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1> Iterative2<T1, A1> inlineJoinRt(Iterative1<? extends A1> iterative) {
        return this.createInline(this, iterative.iterableStream1());
    }

    default public <A1> Iterative2<A1, T1> inlineJoinLt(Iterative1<? extends A1> iterative) {
        return this.pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1, A2> Iterative3<T1, A1, A2> inlineJoinRt(Iterative2<? extends A1, ? extends A2> iterative) {
        return this.create(this.inlineJoinRt(iterative.splitLt()), iterative.iterableStream2(), iterative.isCross());
    }

    default public <A1, A2> Iterative3<A1, A2, T1> inlineJoinLt(Iterative2<? extends A1, ? extends A2> iterative) {
        return iterative.isCross() ? this.inlineJoinLt(iterative.splitRt()).pushFrontCrossBy(iterative.iterableStream1()) : this.inlineJoinLt(iterative.splitRt()).pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1, A2, A3> Iterative4<T1, A1, A2, A3> inlineJoinRt(Iterative3<? extends A1, ? extends A2, ? extends A3> iterative) {
        return this.create(this.inlineJoinRt(iterative.splitLt2()), iterative.iterableStream3(), iterative.isCross());
    }

    default public <A1, A2, A3> Iterative4<A1, A2, A3, T1> inlineJoinLt(Iterative3<? extends A1, ? extends A2, ? extends A3> iterative) {
        return iterative.splitLt2().isCross() ? this.inlineJoinLt(iterative.splitRt2()).pushFrontCrossBy(iterative.iterableStream1()) : this.inlineJoinLt(iterative.splitRt2()).pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1, A2, A3, A4> Iterative5<T1, A1, A2, A3, A4> inlineJoinRt(Iterative4<? extends A1, ? extends A2, ? extends A3, ? extends A4> iterative) {
        return this.create(this.inlineJoinRt(iterative.splitLt3()), iterative.iterableStream4(), iterative.isCross());
    }

    default public <A1, A2, A3, A4> Iterative5<A1, A2, A3, A4, T1> inlineJoinLt(Iterative4<? extends A1, ? extends A2, ? extends A3, ? extends A4> iterative) {
        return iterative.splitLt2().isCross() ? this.inlineJoinLt(iterative.splitRt3()).pushFrontCrossBy(iterative.iterableStream1()) : this.inlineJoinLt(iterative.splitRt3()).pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1, A2, A3, A4, A5> Iterative6<T1, A1, A2, A3, A4, A5> inlineJoinRt(Iterative5<? extends A1, ? extends A2, ? extends A3, ? extends A4, ? extends A5> iterative) {
        return this.create(this.inlineJoinRt(iterative.splitLt4()), iterative.iterableStream5(), iterative.isCross());
    }

    default public <A1, A2, A3, A4, A5> Iterative6<A1, A2, A3, A4, A5, T1> inlineJoinLt(Iterative5<? extends A1, ? extends A2, ? extends A3, ? extends A4, ? extends A5> iterative) {
        return iterative.splitLt2().isCross() ? this.inlineJoinLt(iterative.splitRt4()).pushFrontCrossBy(iterative.iterableStream1()) : this.inlineJoinLt(iterative.splitRt4()).pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1, A2, A3, A4, A5, A6> Iterative7<T1, A1, A2, A3, A4, A5, A6> inlineJoinRt(Iterative6<? extends A1, ? extends A2, ? extends A3, ? extends A4, ? extends A5, ? extends A6> iterative) {
        return this.create(this.inlineJoinRt(iterative.splitLt5()), iterative.iterableStream6(), iterative.isCross());
    }

    default public <A1, A2, A3, A4, A5, A6> Iterative7<A1, A2, A3, A4, A5, A6, T1> inlineJoinLt(Iterative6<? extends A1, ? extends A2, ? extends A3, ? extends A4, ? extends A5, ? extends A6> iterative) {
        return iterative.splitLt2().isCross() ? this.inlineJoinLt(iterative.splitRt5()).pushFrontCrossBy(iterative.iterableStream1()) : this.inlineJoinLt(iterative.splitRt5()).pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1, A2, A3, A4, A5, A6, A7> Iterative8<T1, A1, A2, A3, A4, A5, A6, A7> inlineJoinRt(Iterative7<? extends A1, ? extends A2, ? extends A3, ? extends A4, ? extends A5, ? extends A6, ? extends A7> iterative) {
        return this.create(this.inlineJoinRt(iterative.splitLt6()), iterative.iterableStream7(), iterative.isCross());
    }

    default public <A1, A2, A3, A4, A5, A6, A7> Iterative8<A1, A2, A3, A4, A5, A6, A7, T1> inlineJoinLt(Iterative7<? extends A1, ? extends A2, ? extends A3, ? extends A4, ? extends A5, ? extends A6, ? extends A7> iterative) {
        return iterative.splitLt2().isCross() ? this.inlineJoinLt(iterative.splitRt6()).pushFrontCrossBy(iterative.iterableStream1()) : this.inlineJoinLt(iterative.splitRt6()).pushFrontInlineBy(iterative.iterableStream1());
    }

    public static class Iterative1NonNullable<T1> extends Iterative1Abstract<T1> implements Iterative1<T1>, IterativeWrapper.IterativeWrapperNonNullable, IterativeWrapper.IterativeCross {

        Iterative1NonNullable(Iterable<? extends T1> elem) {
            super(elem);
        }

        Iterative1NonNullable(Iterable<? extends Stream<? extends T1>> elem, boolean ign) {
            super(elem, ign);
        }

    }

    public static class Iterative1Nullable<T1> extends Iterative1Abstract<T1> implements Iterative1<T1>, IterativeWrapper.IterativeWrapperNullable, IterativeWrapper.IterativeCross {

        Iterative1Nullable(Iterable<? extends T1> elem) {
            super(elem);
        }

        Iterative1Nullable(Iterable<? extends Stream<? extends T1>> elem, boolean ign) {
            super(elem, ign);
        }

    }

    public static abstract class Iterative1Abstract<T1> implements Iterative1<T1> {

        final Iterable<Stream<T1>> elem;

        Iterative1Abstract(Iterable<? extends T1> elem) {
            Objects.requireNonNull(elem, "elem is null");
            this.elem = SimpleIterative.of(elem).inlineMap(this::wrap).map(Stream::of).toIterable();
        }

        Iterative1Abstract(Iterable<? extends Stream<? extends T1>> elem, boolean ign) {
            Objects.requireNonNull(elem, "elem is null");
            this.elem = SimpleIterative.of(elem).map((Fn1 & Serializable) iter -> iter.flatMap(this::wrap));
        }

        @Override
        public Iterative1<T1> onSuccess(Rn r) {
            return this.onSuccess(r.ignoring1());
        }

        @Override
        public Iterative1<T1> onFailure(Rn r) {
            return this.onFailure(r.ignoring1());
        }

        @Override
        public Iterator<Iterable<?>> iterators() {
            return Iterator.of(SimpleIterative.of(this.elem).inlineMap(IterativeInternals::entity).toIterable());
        }

        @Override
        public Iterable<T1> iterable1() {
            return SimpleIterative.of(this.elem).inlineMap(IterativeInternals::entityIterable);
        }

        @Override
        public Iterable<Stream<T1>> iterableStream1() {
            return this.elem;
        }

        @Override
        public Stream<Tuple1<Iterable<T1>>> toTupleStream() {
            return IterativeHandler.transform(this.iterableStream1()).map(Tuple::of);
        }

        @Override
        public Stream<Tuple1<T1>> toStream() {
            return this.toTupleStream().map(Tuple1::_1).flatMap(IterativeInternals::entityIterable).map(Tuple::of);
        }

        @Override
        public <R1> Iterative1<R1> map(Fn1<? super T1, ? extends R1> f1) {
            Objects.requireNonNull(f1, "f1 is null");
            return this.create(SimpleIterative.of(this.iterableStream1()).map((Fn1 & Serializable) iter -> iter.map((Function) ((Object) f1)).flatMap(this::wrap)).toIterable());
        }

        @Override
        public <R1> Iterative1<R1> inlineMap(Fn1<? super T1, ? extends Iterable<? extends R1>> f1) {
            Objects.requireNonNull(f1, "f1 is null");
            return this.create(SimpleIterative.of(this.iterableStream1()).map((Fn1 & Serializable) iter -> iter.flatMap((Function) ((Object) f1)).flatMap(this::wrap)).toIterable());
        }

        @Override
        public Iterative1<T1> filter(Pr1<? super T1> p1) {
            Objects.requireNonNull(p1, "p1 is null");
            return this.create(SimpleIterative.of(this.iterableStream1()).map((Fn1 & Serializable) iter -> iter.filter((Predicate) p1).flatMap(this::wrap)).toIterable());
        }

        @Override
        public <T2> Iterative2Cross<T1, T2> pushBackBy(Iterable<? extends Stream<? extends T2>> t2) {
            return this.createCross(this, t2);
        }

        @Override
        public <T2> Iterative2Cross<T1, T2> pushBackCrossBy(Iterable<? extends Stream<? extends T2>> t2) {
            return this.createCross(this, t2);
        }

        @Override
        public <T2> Iterative2Inline<T1, T2> pushBackInlineBy(Iterable<? extends Stream<? extends T2>> t2) {
            return this.createInline(this, t2);
        }

        @Override
        public <T0> Iterative2Cross<T0, T1> pushFrontBy(Iterable<? extends Stream<? extends T0>> t0) {
            return this.createCross(this.create(t0), this.elem);
        }

        @Override
        public <T0> Iterative2Cross<T0, T1> pushFrontCrossBy(Iterable<? extends Stream<? extends T0>> t0) {
            return this.createCross(this.create(t0), this.elem);
        }

        @Override
        public <T0> Iterative2Inline<T0, T1> pushFrontInlineBy(Iterable<? extends Stream<? extends T0>> t0) {
            return this.createInline(this.create(t0), this.elem);
        }

        @Override
        public Iterative1<T1> nonNullable() {
            return this.isNonNullable() ? this : Iterative.by(this.elem);
        }

        @Override
        public Iterative1<T1> nullable() {
            return this.isNullable() ? this : Iterative.nullable().by(this.elem);
        }

        @Override
        public String toStringContent() {
            return IterativeHandler.iterableStreamToString(this.iterableStream1(), 1);
        }

        public String toString() {
            return IterativeHandler.iterativeHeader(1) + this.toStringContent();
        }

    }

}

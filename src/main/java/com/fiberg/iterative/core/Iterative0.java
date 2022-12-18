package com.fiberg.iterative.core;

import com.fiberg.iterative.core.Iterative;
import com.fiberg.iterative.core.Iterative1;
import com.fiberg.iterative.core.Iterative2Cross;
import com.fiberg.iterative.core.Iterative2Inline;
import com.fiberg.iterative.core.Iterative3Cross;
import com.fiberg.iterative.core.Iterative3Inline;
import com.fiberg.iterative.core.Iterative4Cross;
import com.fiberg.iterative.core.Iterative4Inline;
import com.fiberg.iterative.core.Iterative5Cross;
import com.fiberg.iterative.core.Iterative5Inline;
import com.fiberg.iterative.core.Iterative6Cross;
import com.fiberg.iterative.core.Iterative6Inline;
import com.fiberg.iterative.core.Iterative7Cross;
import com.fiberg.iterative.core.Iterative7Inline;
import com.fiberg.iterative.core.Iterative8Cross;
import com.fiberg.iterative.core.Iterative8Inline;
import com.fiberg.iterative.core.IterativeConstructor;
import com.fiberg.iterative.core.IterativeHandler;
import com.fiberg.iterative.core.IterativeInternals;
import com.fiberg.iterative.core.IterativeWrapper;
import com.fiberg.iterative.function.Cs1;
import com.fiberg.iterative.function.Fn0;
import com.fiberg.iterative.function.Fnc0;
import com.fiberg.iterative.function.Rn;
import io.vavr.Tuple0;
import io.vavr.collection.Iterator;
import io.vavr.collection.Seq;
import io.vavr.collection.Stream;
import io.vavr.control.Option;
import io.vavr.control.Try;
import io.vavr.control.Validation;
import java.util.Objects;

public interface Iterative0 extends IterativeConstructor {

    public static final int CARDINALITY = 0;

    public static Iterative0 empty() {
        return Iterative.of();
    }

    public static Iterative0 emptyNullable() {
        return Iterative.nullable().of();
    }

    public String toStringContent();

    default public Stream<Tuple0> toTupleStream() {
        return Stream.empty();
    }

    default public Stream<Tuple0> toStream() {
        return this.toTupleStream();
    }

    @Override
    default public Iterative0 onSuccess(Rn r) {
        return this;
    }

    @Override
    default public Iterative0 onFailure(Rn r) {
        return this;
    }

    default public <R> Iterable<R> yield(Fn0<? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.toStream().map(Fn0.tuple(f)).flatMap(this::wrap);
    }

    default public <R> Stream<R> yieldStream(Fn0<? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.toStream().map(Fn0.tuple(f)).flatMap(this::wrap);
    }

    default public <R> Stream<R> yieldFlatStream(Fn0<? extends Iterable<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.yieldStream(f).flatMap(IterativeInternals::entity).flatMap(this::wrap);
    }

    default public <R> Option<R> yieldOption(Fn0<? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.toStream().headOption().map(Fn0.tuple(f)).flatMap(this::wrap);
    }

    default public <R> Option<R> yieldFlatOption(Fn0<? extends Option<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.yieldOption(f).flatMap(IterativeInternals::entity).flatMap(this::wrap);
    }

    default public <R> Try<R> yieldTry(Fnc0<? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.toStream().headOption().toTry().mapTry(Fnc0.tuple(f)).flatMap(this::wrapTry);
    }

    default public <R> Try<R> yieldFlatTry(Fnc0<? extends Try<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.yieldTry(f).flatMap(IterativeInternals::entity).flatMap(this::wrapTry);
    }

    default public <R> Validation<Seq<Throwable>, Stream<R>> validateStream(Fn0<? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldStream(f));
        }
        return Validation.invalid(failures);
    }

    default public <R> Validation<Seq<Throwable>, Stream<R>> validateFlatStream(Fn0<? extends Iterable<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldFlatStream(f));
        }
        return Validation.invalid(failures);
    }

    default public <R> Validation<Seq<Throwable>, Option<R>> validateOption(Fn0<? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldOption(f));
        }
        return Validation.invalid(failures);
    }

    default public <R> Validation<Seq<Throwable>, Option<R>> validateFlatOption(Fn0<? extends Option<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldFlatOption(f));
        }
        return Validation.invalid(failures);
    }

    default public <R> Validation<Seq<Throwable>, Try<R>> validateTry(Fnc0<? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldTry(f));
        }
        return Validation.invalid(failures);
    }

    default public <R> Validation<Seq<Throwable>, Try<R>> validateFlatTry(Fnc0<? extends Try<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldFlatTry(f));
        }
        return Validation.invalid(failures);
    }

    default public Iterative0 execute(Cs1<? super Iterative0> c) {
        Objects.requireNonNull(c, "c is null");
        c.accept(this);
        return this;
    }

    @Override
    default public Iterator<Iterable<?>> iterators() {
        return Iterator.empty();
    }

    default public <T1> Iterative1<T1> pushBy(Iterable<? extends Stream<? extends T1>> t1) {
        return this.create(t1);
    }

    default public <T1> Iterative1<T1> pushOf(Iterable<? extends T1> t1) {
        return this.pushBy(IterativeHandler.streamWrap(t1));
    }

    default public <T1> Iterative1<T1> push(T1 t1) {
        return this.pushOf((Iterable<? extends T1>)this.wrap(t1));
    }

    default public <B1, B2> Iterative2Cross<B1, B2> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2) {
        return this.pushBy(b1).pushBackBy(b2);
    }

    default public <B1, B2> Iterative2Cross<B1, B2> pushBackCrossBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2) {
        return this.pushBy(b1).pushBackCrossBy(b2);
    }

    default public <B1, B2> Iterative2Inline<B1, B2> pushBackInlineBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2) {
        return this.pushBy(b1).pushBackInlineBy(b2);
    }

    default public <F1, F2> Iterative2Cross<F1, F2> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return this.pushBy(f2).pushFrontBy(f1);
    }

    default public <F1, F2> Iterative2Cross<F1, F2> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return this.pushBy(f2).pushFrontCrossBy(f1);
    }

    default public <F1, F2> Iterative2Inline<F1, F2> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return this.pushBy(f2).pushFrontInlineBy(f1);
    }

    default public <B1, B2> Iterative2Cross<B1, B2> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2) {
        return this.pushOf(b1).pushBackOf(b2);
    }

    default public <B1, B2> Iterative2Cross<B1, B2> pushBackCrossOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2) {
        return this.pushOf(b1).pushBackCrossOf(b2);
    }

    default public <B1, B2> Iterative2Inline<B1, B2> pushBackInlineOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2) {
        return this.pushOf(b1).pushBackInlineOf(b2);
    }

    default public <F1, F2> Iterative2Cross<F1, F2> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return this.pushOf(f2).pushFrontOf(f1);
    }

    default public <F1, F2> Iterative2Cross<F1, F2> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return this.pushOf(f2).pushFrontCrossOf(f1);
    }

    default public <F1, F2> Iterative2Inline<F1, F2> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return this.pushOf(f2).pushFrontInlineOf(f1);
    }

    default public <B1, B2> Iterative2Cross<B1, B2> pushBack(B1 b1, B2 b2) {
        return this.push(b1).pushBack(b2);
    }

    default public <B1, B2> Iterative2Cross<B1, B2> pushBackCross(B1 b1, B2 b2) {
        return this.push(b1).pushBackCross(b2);
    }

    default public <B1, B2> Iterative2Inline<B1, B2> pushBackInline(B1 b1, B2 b2) {
        return this.push(b1).pushBackInline(b2);
    }

    default public <F1, F2> Iterative2Cross<F1, F2> pushFront(F1 f1, F2 f2) {
        return this.push(f2).pushFront(f1);
    }

    default public <F1, F2> Iterative2Cross<F1, F2> pushFrontCross(F1 f1, F2 f2) {
        return this.push(f2).pushFrontCross(f1);
    }

    default public <F1, F2> Iterative2Inline<F1, F2> pushFrontInline(F1 f1, F2 f2) {
        return this.push(f2).pushFrontInline(f1);
    }

    default public <B1, B2, B3> Iterative3Cross<B1, B2, B3> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3) {
        return this.pushBy(b1).pushBackBy(b2).pushBackBy(b3);
    }

    default public <B1, B2, B3> Iterative3Cross<B1, B2, B3> pushBackCrossBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3) {
        return this.pushBy(b1).pushBackCrossBy(b2).pushBackCrossBy(b3);
    }

    default public <B1, B2, B3> Iterative3Inline<B1, B2, B3> pushBackInlineBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3) {
        return this.pushBy(b1).pushBackInlineBy(b2).pushBackInlineBy(b3);
    }

    default public <F1, F2, F3> Iterative3Cross<F1, F2, F3> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3) {
        return this.pushBy(f3).pushFrontBy(f2).pushFrontBy(f1);
    }

    default public <F1, F2, F3> Iterative3Cross<F1, F2, F3> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3) {
        return this.pushBy(f3).pushFrontCrossBy(f2).pushFrontCrossBy(f1);
    }

    default public <F1, F2, F3> Iterative3Inline<F1, F2, F3> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3) {
        return this.pushBy(f3).pushFrontInlineBy(f2).pushFrontInlineBy(f1);
    }

    default public <B1, B2, B3> Iterative3Cross<B1, B2, B3> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3) {
        return this.pushOf(b1).pushBackOf(b2).pushBackOf(b3);
    }

    default public <B1, B2, B3> Iterative3Cross<B1, B2, B3> pushBackCrossOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3) {
        return this.pushOf(b1).pushBackCrossOf(b2).pushBackCrossOf(b3);
    }

    default public <B1, B2, B3> Iterative3Inline<B1, B2, B3> pushBackInlineOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3) {
        return this.pushOf(b1).pushBackInlineOf(b2).pushBackInlineOf(b3);
    }

    default public <F1, F2, F3> Iterative3Cross<F1, F2, F3> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3) {
        return this.pushOf(f3).pushFrontOf(f2).pushFrontOf(f1);
    }

    default public <F1, F2, F3> Iterative3Cross<F1, F2, F3> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3) {
        return this.pushOf(f3).pushFrontCrossOf(f2).pushFrontCrossOf(f1);
    }

    default public <F1, F2, F3> Iterative3Inline<F1, F2, F3> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3) {
        return this.pushOf(f3).pushFrontInlineOf(f2).pushFrontInlineOf(f1);
    }

    default public <B1, B2, B3> Iterative3Cross<B1, B2, B3> pushBack(B1 b1, B2 b2, B3 b3) {
        return this.push(b1).pushBack(b2).pushBack(b3);
    }

    default public <B1, B2, B3> Iterative3Cross<B1, B2, B3> pushBackCross(B1 b1, B2 b2, B3 b3) {
        return this.push(b1).pushBackCross(b2).pushBackCross(b3);
    }

    default public <B1, B2, B3> Iterative3Inline<B1, B2, B3> pushBackInline(B1 b1, B2 b2, B3 b3) {
        return this.push(b1).pushBackInline(b2).pushBackInline(b3);
    }

    default public <F1, F2, F3> Iterative3Cross<F1, F2, F3> pushFront(F1 f1, F2 f2, F3 f3) {
        return this.push(f3).pushFront(f2).pushFront(f1);
    }

    default public <F1, F2, F3> Iterative3Cross<F1, F2, F3> pushFrontCross(F1 f1, F2 f2, F3 f3) {
        return this.push(f3).pushFrontCross(f2).pushFrontCross(f1);
    }

    default public <F1, F2, F3> Iterative3Inline<F1, F2, F3> pushFrontInline(F1 f1, F2 f2, F3 f3) {
        return this.push(f3).pushFrontInline(f2).pushFrontInline(f1);
    }

    default public <B1, B2, B3, B4> Iterative4Cross<B1, B2, B3, B4> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4) {
        return this.pushBy(b1).pushBackBy(b2).pushBackBy(b3).pushBackBy(b4);
    }

    default public <B1, B2, B3, B4> Iterative4Cross<B1, B2, B3, B4> pushBackCrossBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4) {
        return this.pushBy(b1).pushBackCrossBy(b2).pushBackCrossBy(b3).pushBackCrossBy(b4);
    }

    default public <B1, B2, B3, B4> Iterative4Inline<B1, B2, B3, B4> pushBackInlineBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4) {
        return this.pushBy(b1).pushBackInlineBy(b2).pushBackInlineBy(b3).pushBackInlineBy(b4);
    }

    default public <F1, F2, F3, F4> Iterative4Cross<F1, F2, F3, F4> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4) {
        return this.pushBy(f4).pushFrontBy(f3).pushFrontBy(f2).pushFrontBy(f1);
    }

    default public <F1, F2, F3, F4> Iterative4Cross<F1, F2, F3, F4> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4) {
        return this.pushBy(f4).pushFrontCrossBy(f3).pushFrontCrossBy(f2).pushFrontCrossBy(f1);
    }

    default public <F1, F2, F3, F4> Iterative4Inline<F1, F2, F3, F4> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4) {
        return this.pushBy(f4).pushFrontInlineBy(f3).pushFrontInlineBy(f2).pushFrontInlineBy(f1);
    }

    default public <B1, B2, B3, B4> Iterative4Cross<B1, B2, B3, B4> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4) {
        return this.pushOf(b1).pushBackOf(b2).pushBackOf(b3).pushBackOf(b4);
    }

    default public <B1, B2, B3, B4> Iterative4Cross<B1, B2, B3, B4> pushBackCrossOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4) {
        return this.pushOf(b1).pushBackCrossOf(b2).pushBackCrossOf(b3).pushBackCrossOf(b4);
    }

    default public <B1, B2, B3, B4> Iterative4Inline<B1, B2, B3, B4> pushBackInlineOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4) {
        return this.pushOf(b1).pushBackInlineOf(b2).pushBackInlineOf(b3).pushBackInlineOf(b4);
    }

    default public <F1, F2, F3, F4> Iterative4Cross<F1, F2, F3, F4> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4) {
        return this.pushOf(f4).pushFrontOf(f3).pushFrontOf(f2).pushFrontOf(f1);
    }

    default public <F1, F2, F3, F4> Iterative4Cross<F1, F2, F3, F4> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4) {
        return this.pushOf(f4).pushFrontCrossOf(f3).pushFrontCrossOf(f2).pushFrontCrossOf(f1);
    }

    default public <F1, F2, F3, F4> Iterative4Inline<F1, F2, F3, F4> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4) {
        return this.pushOf(f4).pushFrontInlineOf(f3).pushFrontInlineOf(f2).pushFrontInlineOf(f1);
    }

    default public <B1, B2, B3, B4> Iterative4Cross<B1, B2, B3, B4> pushBack(B1 b1, B2 b2, B3 b3, B4 b4) {
        return this.push(b1).pushBack(b2).pushBack(b3).pushBack(b4);
    }

    default public <B1, B2, B3, B4> Iterative4Cross<B1, B2, B3, B4> pushBackCross(B1 b1, B2 b2, B3 b3, B4 b4) {
        return this.push(b1).pushBackCross(b2).pushBackCross(b3).pushBackCross(b4);
    }

    default public <B1, B2, B3, B4> Iterative4Inline<B1, B2, B3, B4> pushBackInline(B1 b1, B2 b2, B3 b3, B4 b4) {
        return this.push(b1).pushBackInline(b2).pushBackInline(b3).pushBackInline(b4);
    }

    default public <F1, F2, F3, F4> Iterative4Cross<F1, F2, F3, F4> pushFront(F1 f1, F2 f2, F3 f3, F4 f4) {
        return this.push(f4).pushFront(f3).pushFront(f2).pushFront(f1);
    }

    default public <F1, F2, F3, F4> Iterative4Cross<F1, F2, F3, F4> pushFrontCross(F1 f1, F2 f2, F3 f3, F4 f4) {
        return this.push(f4).pushFrontCross(f3).pushFrontCross(f2).pushFrontCross(f1);
    }

    default public <F1, F2, F3, F4> Iterative4Inline<F1, F2, F3, F4> pushFrontInline(F1 f1, F2 f2, F3 f3, F4 f4) {
        return this.push(f4).pushFrontInline(f3).pushFrontInline(f2).pushFrontInline(f1);
    }

    default public <B1, B2, B3, B4, B5> Iterative5Cross<B1, B2, B3, B4, B5> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4, Iterable<? extends Stream<? extends B5>> b5) {
        return this.pushBy(b1).pushBackBy(b2).pushBackBy(b3).pushBackBy(b4).pushBackBy(b5);
    }

    default public <B1, B2, B3, B4, B5> Iterative5Cross<B1, B2, B3, B4, B5> pushBackCrossBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4, Iterable<? extends Stream<? extends B5>> b5) {
        return this.pushBy(b1).pushBackCrossBy(b2).pushBackCrossBy(b3).pushBackCrossBy(b4).pushBackCrossBy(b5);
    }

    default public <B1, B2, B3, B4, B5> Iterative5Inline<B1, B2, B3, B4, B5> pushBackInlineBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4, Iterable<? extends Stream<? extends B5>> b5) {
        return this.pushBy(b1).pushBackInlineBy(b2).pushBackInlineBy(b3).pushBackInlineBy(b4).pushBackInlineBy(b5);
    }

    default public <F1, F2, F3, F4, F5> Iterative5Cross<F1, F2, F3, F4, F5> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5) {
        return this.pushBy(f5).pushFrontBy(f4).pushFrontBy(f3).pushFrontBy(f2).pushFrontBy(f1);
    }

    default public <F1, F2, F3, F4, F5> Iterative5Cross<F1, F2, F3, F4, F5> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5) {
        return this.pushBy(f5).pushFrontCrossBy(f4).pushFrontCrossBy(f3).pushFrontCrossBy(f2).pushFrontCrossBy(f1);
    }

    default public <F1, F2, F3, F4, F5> Iterative5Inline<F1, F2, F3, F4, F5> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5) {
        return this.pushBy(f5).pushFrontInlineBy(f4).pushFrontInlineBy(f3).pushFrontInlineBy(f2).pushFrontInlineBy(f1);
    }

    default public <B1, B2, B3, B4, B5> Iterative5Cross<B1, B2, B3, B4, B5> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4, Iterable<? extends B5> b5) {
        return this.pushOf(b1).pushBackOf(b2).pushBackOf(b3).pushBackOf(b4).pushBackOf(b5);
    }

    default public <B1, B2, B3, B4, B5> Iterative5Cross<B1, B2, B3, B4, B5> pushBackCrossOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4, Iterable<? extends B5> b5) {
        return this.pushOf(b1).pushBackCrossOf(b2).pushBackCrossOf(b3).pushBackCrossOf(b4).pushBackCrossOf(b5);
    }

    default public <B1, B2, B3, B4, B5> Iterative5Inline<B1, B2, B3, B4, B5> pushBackInlineOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4, Iterable<? extends B5> b5) {
        return this.pushOf(b1).pushBackInlineOf(b2).pushBackInlineOf(b3).pushBackInlineOf(b4).pushBackInlineOf(b5);
    }

    default public <F1, F2, F3, F4, F5> Iterative5Cross<F1, F2, F3, F4, F5> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5) {
        return this.pushOf(f5).pushFrontOf(f4).pushFrontOf(f3).pushFrontOf(f2).pushFrontOf(f1);
    }

    default public <F1, F2, F3, F4, F5> Iterative5Cross<F1, F2, F3, F4, F5> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5) {
        return this.pushOf(f5).pushFrontCrossOf(f4).pushFrontCrossOf(f3).pushFrontCrossOf(f2).pushFrontCrossOf(f1);
    }

    default public <F1, F2, F3, F4, F5> Iterative5Inline<F1, F2, F3, F4, F5> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5) {
        return this.pushOf(f5).pushFrontInlineOf(f4).pushFrontInlineOf(f3).pushFrontInlineOf(f2).pushFrontInlineOf(f1);
    }

    default public <B1, B2, B3, B4, B5> Iterative5Cross<B1, B2, B3, B4, B5> pushBack(B1 b1, B2 b2, B3 b3, B4 b4, B5 b5) {
        return this.push(b1).pushBack(b2).pushBack(b3).pushBack(b4).pushBack(b5);
    }

    default public <B1, B2, B3, B4, B5> Iterative5Cross<B1, B2, B3, B4, B5> pushBackCross(B1 b1, B2 b2, B3 b3, B4 b4, B5 b5) {
        return this.push(b1).pushBackCross(b2).pushBackCross(b3).pushBackCross(b4).pushBackCross(b5);
    }

    default public <B1, B2, B3, B4, B5> Iterative5Inline<B1, B2, B3, B4, B5> pushBackInline(B1 b1, B2 b2, B3 b3, B4 b4, B5 b5) {
        return this.push(b1).pushBackInline(b2).pushBackInline(b3).pushBackInline(b4).pushBackInline(b5);
    }

    default public <F1, F2, F3, F4, F5> Iterative5Cross<F1, F2, F3, F4, F5> pushFront(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5) {
        return this.push(f5).pushFront(f4).pushFront(f3).pushFront(f2).pushFront(f1);
    }

    default public <F1, F2, F3, F4, F5> Iterative5Cross<F1, F2, F3, F4, F5> pushFrontCross(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5) {
        return this.push(f5).pushFrontCross(f4).pushFrontCross(f3).pushFrontCross(f2).pushFrontCross(f1);
    }

    default public <F1, F2, F3, F4, F5> Iterative5Inline<F1, F2, F3, F4, F5> pushFrontInline(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5) {
        return this.push(f5).pushFrontInline(f4).pushFrontInline(f3).pushFrontInline(f2).pushFrontInline(f1);
    }

    default public <B1, B2, B3, B4, B5, B6> Iterative6Cross<B1, B2, B3, B4, B5, B6> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4, Iterable<? extends Stream<? extends B5>> b5, Iterable<? extends Stream<? extends B6>> b6) {
        return this.pushBy(b1).pushBackBy(b2).pushBackBy(b3).pushBackBy(b4).pushBackBy(b5).pushBackBy(b6);
    }

    default public <B1, B2, B3, B4, B5, B6> Iterative6Cross<B1, B2, B3, B4, B5, B6> pushBackCrossBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4, Iterable<? extends Stream<? extends B5>> b5, Iterable<? extends Stream<? extends B6>> b6) {
        return this.pushBy(b1).pushBackCrossBy(b2).pushBackCrossBy(b3).pushBackCrossBy(b4).pushBackCrossBy(b5).pushBackCrossBy(b6);
    }

    default public <B1, B2, B3, B4, B5, B6> Iterative6Inline<B1, B2, B3, B4, B5, B6> pushBackInlineBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4, Iterable<? extends Stream<? extends B5>> b5, Iterable<? extends Stream<? extends B6>> b6) {
        return this.pushBy(b1).pushBackInlineBy(b2).pushBackInlineBy(b3).pushBackInlineBy(b4).pushBackInlineBy(b5).pushBackInlineBy(b6);
    }

    default public <F1, F2, F3, F4, F5, F6> Iterative6Cross<F1, F2, F3, F4, F5, F6> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5, Iterable<? extends Stream<? extends F6>> f6) {
        return this.pushBy(f6).pushFrontBy(f5).pushFrontBy(f4).pushFrontBy(f3).pushFrontBy(f2).pushFrontBy(f1);
    }

    default public <F1, F2, F3, F4, F5, F6> Iterative6Cross<F1, F2, F3, F4, F5, F6> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5, Iterable<? extends Stream<? extends F6>> f6) {
        return this.pushBy(f6).pushFrontCrossBy(f5).pushFrontCrossBy(f4).pushFrontCrossBy(f3).pushFrontCrossBy(f2).pushFrontCrossBy(f1);
    }

    default public <F1, F2, F3, F4, F5, F6> Iterative6Inline<F1, F2, F3, F4, F5, F6> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5, Iterable<? extends Stream<? extends F6>> f6) {
        return this.pushBy(f6).pushFrontInlineBy(f5).pushFrontInlineBy(f4).pushFrontInlineBy(f3).pushFrontInlineBy(f2).pushFrontInlineBy(f1);
    }

    default public <B1, B2, B3, B4, B5, B6> Iterative6Cross<B1, B2, B3, B4, B5, B6> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4, Iterable<? extends B5> b5, Iterable<? extends B6> b6) {
        return this.pushOf(b1).pushBackOf(b2).pushBackOf(b3).pushBackOf(b4).pushBackOf(b5).pushBackOf(b6);
    }

    default public <B1, B2, B3, B4, B5, B6> Iterative6Cross<B1, B2, B3, B4, B5, B6> pushBackCrossOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4, Iterable<? extends B5> b5, Iterable<? extends B6> b6) {
        return this.pushOf(b1).pushBackCrossOf(b2).pushBackCrossOf(b3).pushBackCrossOf(b4).pushBackCrossOf(b5).pushBackCrossOf(b6);
    }

    default public <B1, B2, B3, B4, B5, B6> Iterative6Inline<B1, B2, B3, B4, B5, B6> pushBackInlineOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4, Iterable<? extends B5> b5, Iterable<? extends B6> b6) {
        return this.pushOf(b1).pushBackInlineOf(b2).pushBackInlineOf(b3).pushBackInlineOf(b4).pushBackInlineOf(b5).pushBackInlineOf(b6);
    }

    default public <F1, F2, F3, F4, F5, F6> Iterative6Cross<F1, F2, F3, F4, F5, F6> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5, Iterable<? extends F6> f6) {
        return this.pushOf(f6).pushFrontOf(f5).pushFrontOf(f4).pushFrontOf(f3).pushFrontOf(f2).pushFrontOf(f1);
    }

    default public <F1, F2, F3, F4, F5, F6> Iterative6Cross<F1, F2, F3, F4, F5, F6> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5, Iterable<? extends F6> f6) {
        return this.pushOf(f6).pushFrontCrossOf(f5).pushFrontCrossOf(f4).pushFrontCrossOf(f3).pushFrontCrossOf(f2).pushFrontCrossOf(f1);
    }

    default public <F1, F2, F3, F4, F5, F6> Iterative6Inline<F1, F2, F3, F4, F5, F6> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5, Iterable<? extends F6> f6) {
        return this.pushOf(f6).pushFrontInlineOf(f5).pushFrontInlineOf(f4).pushFrontInlineOf(f3).pushFrontInlineOf(f2).pushFrontInlineOf(f1);
    }

    default public <B1, B2, B3, B4, B5, B6> Iterative6Cross<B1, B2, B3, B4, B5, B6> pushBack(B1 b1, B2 b2, B3 b3, B4 b4, B5 b5, B6 b6) {
        return this.push(b1).pushBack(b2).pushBack(b3).pushBack(b4).pushBack(b5).pushBack(b6);
    }

    default public <B1, B2, B3, B4, B5, B6> Iterative6Cross<B1, B2, B3, B4, B5, B6> pushBackCross(B1 b1, B2 b2, B3 b3, B4 b4, B5 b5, B6 b6) {
        return this.push(b1).pushBackCross(b2).pushBackCross(b3).pushBackCross(b4).pushBackCross(b5).pushBackCross(b6);
    }

    default public <B1, B2, B3, B4, B5, B6> Iterative6Inline<B1, B2, B3, B4, B5, B6> pushBackInline(B1 b1, B2 b2, B3 b3, B4 b4, B5 b5, B6 b6) {
        return this.push(b1).pushBackInline(b2).pushBackInline(b3).pushBackInline(b4).pushBackInline(b5).pushBackInline(b6);
    }

    default public <F1, F2, F3, F4, F5, F6> Iterative6Cross<F1, F2, F3, F4, F5, F6> pushFront(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5, F6 f6) {
        return this.push(f6).pushFront(f5).pushFront(f4).pushFront(f3).pushFront(f2).pushFront(f1);
    }

    default public <F1, F2, F3, F4, F5, F6> Iterative6Cross<F1, F2, F3, F4, F5, F6> pushFrontCross(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5, F6 f6) {
        return this.push(f6).pushFrontCross(f5).pushFrontCross(f4).pushFrontCross(f3).pushFrontCross(f2).pushFrontCross(f1);
    }

    default public <F1, F2, F3, F4, F5, F6> Iterative6Inline<F1, F2, F3, F4, F5, F6> pushFrontInline(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5, F6 f6) {
        return this.push(f6).pushFrontInline(f5).pushFrontInline(f4).pushFrontInline(f3).pushFrontInline(f2).pushFrontInline(f1);
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Iterative7Cross<B1, B2, B3, B4, B5, B6, B7> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4, Iterable<? extends Stream<? extends B5>> b5, Iterable<? extends Stream<? extends B6>> b6, Iterable<? extends Stream<? extends B7>> b7) {
        return this.pushBy(b1).pushBackBy(b2).pushBackBy(b3).pushBackBy(b4).pushBackBy(b5).pushBackBy(b6).pushBackBy(b7);
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Iterative7Cross<B1, B2, B3, B4, B5, B6, B7> pushBackCrossBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4, Iterable<? extends Stream<? extends B5>> b5, Iterable<? extends Stream<? extends B6>> b6, Iterable<? extends Stream<? extends B7>> b7) {
        return this.pushBy(b1).pushBackCrossBy(b2).pushBackCrossBy(b3).pushBackCrossBy(b4).pushBackCrossBy(b5).pushBackCrossBy(b6).pushBackCrossBy(b7);
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Iterative7Inline<B1, B2, B3, B4, B5, B6, B7> pushBackInlineBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4, Iterable<? extends Stream<? extends B5>> b5, Iterable<? extends Stream<? extends B6>> b6, Iterable<? extends Stream<? extends B7>> b7) {
        return this.pushBy(b1).pushBackInlineBy(b2).pushBackInlineBy(b3).pushBackInlineBy(b4).pushBackInlineBy(b5).pushBackInlineBy(b6).pushBackInlineBy(b7);
    }

    default public <F1, F2, F3, F4, F5, F6, F7> Iterative7Cross<F1, F2, F3, F4, F5, F6, F7> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5, Iterable<? extends Stream<? extends F6>> f6, Iterable<? extends Stream<? extends F7>> f7) {
        return this.pushBy(f7).pushFrontBy(f6).pushFrontBy(f5).pushFrontBy(f4).pushFrontBy(f3).pushFrontBy(f2).pushFrontBy(f1);
    }

    default public <F1, F2, F3, F4, F5, F6, F7> Iterative7Cross<F1, F2, F3, F4, F5, F6, F7> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5, Iterable<? extends Stream<? extends F6>> f6, Iterable<? extends Stream<? extends F7>> f7) {
        return this.pushBy(f7).pushFrontCrossBy(f6).pushFrontCrossBy(f5).pushFrontCrossBy(f4).pushFrontCrossBy(f3).pushFrontCrossBy(f2).pushFrontCrossBy(f1);
    }

    default public <F1, F2, F3, F4, F5, F6, F7> Iterative7Inline<F1, F2, F3, F4, F5, F6, F7> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5, Iterable<? extends Stream<? extends F6>> f6, Iterable<? extends Stream<? extends F7>> f7) {
        return this.pushBy(f7).pushFrontInlineBy(f6).pushFrontInlineBy(f5).pushFrontInlineBy(f4).pushFrontInlineBy(f3).pushFrontInlineBy(f2).pushFrontInlineBy(f1);
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Iterative7Cross<B1, B2, B3, B4, B5, B6, B7> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4, Iterable<? extends B5> b5, Iterable<? extends B6> b6, Iterable<? extends B7> b7) {
        return this.pushOf(b1).pushBackOf(b2).pushBackOf(b3).pushBackOf(b4).pushBackOf(b5).pushBackOf(b6).pushBackOf(b7);
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Iterative7Cross<B1, B2, B3, B4, B5, B6, B7> pushBackCrossOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4, Iterable<? extends B5> b5, Iterable<? extends B6> b6, Iterable<? extends B7> b7) {
        return this.pushOf(b1).pushBackCrossOf(b2).pushBackCrossOf(b3).pushBackCrossOf(b4).pushBackCrossOf(b5).pushBackCrossOf(b6).pushBackCrossOf(b7);
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Iterative7Inline<B1, B2, B3, B4, B5, B6, B7> pushBackInlineOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4, Iterable<? extends B5> b5, Iterable<? extends B6> b6, Iterable<? extends B7> b7) {
        return this.pushOf(b1).pushBackInlineOf(b2).pushBackInlineOf(b3).pushBackInlineOf(b4).pushBackInlineOf(b5).pushBackInlineOf(b6).pushBackInlineOf(b7);
    }

    default public <F1, F2, F3, F4, F5, F6, F7> Iterative7Cross<F1, F2, F3, F4, F5, F6, F7> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5, Iterable<? extends F6> f6, Iterable<? extends F7> f7) {
        return this.pushOf(f7).pushFrontOf(f6).pushFrontOf(f5).pushFrontOf(f4).pushFrontOf(f3).pushFrontOf(f2).pushFrontOf(f1);
    }

    default public <F1, F2, F3, F4, F5, F6, F7> Iterative7Cross<F1, F2, F3, F4, F5, F6, F7> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5, Iterable<? extends F6> f6, Iterable<? extends F7> f7) {
        return this.pushOf(f7).pushFrontCrossOf(f6).pushFrontCrossOf(f5).pushFrontCrossOf(f4).pushFrontCrossOf(f3).pushFrontCrossOf(f2).pushFrontCrossOf(f1);
    }

    default public <F1, F2, F3, F4, F5, F6, F7> Iterative7Inline<F1, F2, F3, F4, F5, F6, F7> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5, Iterable<? extends F6> f6, Iterable<? extends F7> f7) {
        return this.pushOf(f7).pushFrontInlineOf(f6).pushFrontInlineOf(f5).pushFrontInlineOf(f4).pushFrontInlineOf(f3).pushFrontInlineOf(f2).pushFrontInlineOf(f1);
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Iterative7Cross<B1, B2, B3, B4, B5, B6, B7> pushBack(B1 b1, B2 b2, B3 b3, B4 b4, B5 b5, B6 b6, B7 b7) {
        return this.push(b1).pushBack(b2).pushBack(b3).pushBack(b4).pushBack(b5).pushBack(b6).pushBack(b7);
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Iterative7Cross<B1, B2, B3, B4, B5, B6, B7> pushBackCross(B1 b1, B2 b2, B3 b3, B4 b4, B5 b5, B6 b6, B7 b7) {
        return this.push(b1).pushBackCross(b2).pushBackCross(b3).pushBackCross(b4).pushBackCross(b5).pushBackCross(b6).pushBackCross(b7);
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Iterative7Inline<B1, B2, B3, B4, B5, B6, B7> pushBackInline(B1 b1, B2 b2, B3 b3, B4 b4, B5 b5, B6 b6, B7 b7) {
        return this.push(b1).pushBackInline(b2).pushBackInline(b3).pushBackInline(b4).pushBackInline(b5).pushBackInline(b6).pushBackInline(b7);
    }

    default public <F1, F2, F3, F4, F5, F6, F7> Iterative7Cross<F1, F2, F3, F4, F5, F6, F7> pushFront(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5, F6 f6, F7 f7) {
        return this.push(f7).pushFront(f6).pushFront(f5).pushFront(f4).pushFront(f3).pushFront(f2).pushFront(f1);
    }

    default public <F1, F2, F3, F4, F5, F6, F7> Iterative7Cross<F1, F2, F3, F4, F5, F6, F7> pushFrontCross(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5, F6 f6, F7 f7) {
        return this.push(f7).pushFrontCross(f6).pushFrontCross(f5).pushFrontCross(f4).pushFrontCross(f3).pushFrontCross(f2).pushFrontCross(f1);
    }

    default public <F1, F2, F3, F4, F5, F6, F7> Iterative7Inline<F1, F2, F3, F4, F5, F6, F7> pushFrontInline(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5, F6 f6, F7 f7) {
        return this.push(f7).pushFrontInline(f6).pushFrontInline(f5).pushFrontInline(f4).pushFrontInline(f3).pushFrontInline(f2).pushFrontInline(f1);
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Iterative8Cross<B1, B2, B3, B4, B5, B6, B7, B8> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4, Iterable<? extends Stream<? extends B5>> b5, Iterable<? extends Stream<? extends B6>> b6, Iterable<? extends Stream<? extends B7>> b7, Iterable<? extends Stream<? extends B8>> b8) {
        return this.pushBy(b1).pushBackBy(b2).pushBackBy(b3).pushBackBy(b4).pushBackBy(b5).pushBackBy(b6).pushBackBy(b7).pushBackBy(b8);
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Iterative8Cross<B1, B2, B3, B4, B5, B6, B7, B8> pushBackCrossBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4, Iterable<? extends Stream<? extends B5>> b5, Iterable<? extends Stream<? extends B6>> b6, Iterable<? extends Stream<? extends B7>> b7, Iterable<? extends Stream<? extends B8>> b8) {
        return this.pushBy(b1).pushBackCrossBy(b2).pushBackCrossBy(b3).pushBackCrossBy(b4).pushBackCrossBy(b5).pushBackCrossBy(b6).pushBackCrossBy(b7).pushBackCrossBy(b8);
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Iterative8Inline<B1, B2, B3, B4, B5, B6, B7, B8> pushBackInlineBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4, Iterable<? extends Stream<? extends B5>> b5, Iterable<? extends Stream<? extends B6>> b6, Iterable<? extends Stream<? extends B7>> b7, Iterable<? extends Stream<? extends B8>> b8) {
        return this.pushBy(b1).pushBackInlineBy(b2).pushBackInlineBy(b3).pushBackInlineBy(b4).pushBackInlineBy(b5).pushBackInlineBy(b6).pushBackInlineBy(b7).pushBackInlineBy(b8);
    }

    default public <F1, F2, F3, F4, F5, F6, F7, F8> Iterative8Cross<F1, F2, F3, F4, F5, F6, F7, F8> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5, Iterable<? extends Stream<? extends F6>> f6, Iterable<? extends Stream<? extends F7>> f7, Iterable<? extends Stream<? extends F8>> f8) {
        return this.pushBy(f8).pushFrontBy(f7).pushFrontBy(f6).pushFrontBy(f5).pushFrontBy(f4).pushFrontBy(f3).pushFrontBy(f2).pushFrontBy(f1);
    }

    default public <F1, F2, F3, F4, F5, F6, F7, F8> Iterative8Cross<F1, F2, F3, F4, F5, F6, F7, F8> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5, Iterable<? extends Stream<? extends F6>> f6, Iterable<? extends Stream<? extends F7>> f7, Iterable<? extends Stream<? extends F8>> f8) {
        return this.pushBy(f8).pushFrontCrossBy(f7).pushFrontCrossBy(f6).pushFrontCrossBy(f5).pushFrontCrossBy(f4).pushFrontCrossBy(f3).pushFrontCrossBy(f2).pushFrontCrossBy(f1);
    }

    default public <F1, F2, F3, F4, F5, F6, F7, F8> Iterative8Inline<F1, F2, F3, F4, F5, F6, F7, F8> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5, Iterable<? extends Stream<? extends F6>> f6, Iterable<? extends Stream<? extends F7>> f7, Iterable<? extends Stream<? extends F8>> f8) {
        return this.pushBy(f8).pushFrontInlineBy(f7).pushFrontInlineBy(f6).pushFrontInlineBy(f5).pushFrontInlineBy(f4).pushFrontInlineBy(f3).pushFrontInlineBy(f2).pushFrontInlineBy(f1);
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Iterative8Cross<B1, B2, B3, B4, B5, B6, B7, B8> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4, Iterable<? extends B5> b5, Iterable<? extends B6> b6, Iterable<? extends B7> b7, Iterable<? extends B8> b8) {
        return this.pushOf(b1).pushBackOf(b2).pushBackOf(b3).pushBackOf(b4).pushBackOf(b5).pushBackOf(b6).pushBackOf(b7).pushBackOf(b8);
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Iterative8Cross<B1, B2, B3, B4, B5, B6, B7, B8> pushBackCrossOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4, Iterable<? extends B5> b5, Iterable<? extends B6> b6, Iterable<? extends B7> b7, Iterable<? extends B8> b8) {
        return this.pushOf(b1).pushBackCrossOf(b2).pushBackCrossOf(b3).pushBackCrossOf(b4).pushBackCrossOf(b5).pushBackCrossOf(b6).pushBackCrossOf(b7).pushBackCrossOf(b8);
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Iterative8Inline<B1, B2, B3, B4, B5, B6, B7, B8> pushBackInlineOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4, Iterable<? extends B5> b5, Iterable<? extends B6> b6, Iterable<? extends B7> b7, Iterable<? extends B8> b8) {
        return this.pushOf(b1).pushBackInlineOf(b2).pushBackInlineOf(b3).pushBackInlineOf(b4).pushBackInlineOf(b5).pushBackInlineOf(b6).pushBackInlineOf(b7).pushBackInlineOf(b8);
    }

    default public <F1, F2, F3, F4, F5, F6, F7, F8> Iterative8Cross<F1, F2, F3, F4, F5, F6, F7, F8> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5, Iterable<? extends F6> f6, Iterable<? extends F7> f7, Iterable<? extends F8> f8) {
        return this.pushOf(f8).pushFrontOf(f7).pushFrontOf(f6).pushFrontOf(f5).pushFrontOf(f4).pushFrontOf(f3).pushFrontOf(f2).pushFrontOf(f1);
    }

    default public <F1, F2, F3, F4, F5, F6, F7, F8> Iterative8Cross<F1, F2, F3, F4, F5, F6, F7, F8> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5, Iterable<? extends F6> f6, Iterable<? extends F7> f7, Iterable<? extends F8> f8) {
        return this.pushOf(f8).pushFrontCrossOf(f7).pushFrontCrossOf(f6).pushFrontCrossOf(f5).pushFrontCrossOf(f4).pushFrontCrossOf(f3).pushFrontCrossOf(f2).pushFrontCrossOf(f1);
    }

    default public <F1, F2, F3, F4, F5, F6, F7, F8> Iterative8Inline<F1, F2, F3, F4, F5, F6, F7, F8> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5, Iterable<? extends F6> f6, Iterable<? extends F7> f7, Iterable<? extends F8> f8) {
        return this.pushOf(f8).pushFrontInlineOf(f7).pushFrontInlineOf(f6).pushFrontInlineOf(f5).pushFrontInlineOf(f4).pushFrontInlineOf(f3).pushFrontInlineOf(f2).pushFrontInlineOf(f1);
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Iterative8Cross<B1, B2, B3, B4, B5, B6, B7, B8> pushBack(B1 b1, B2 b2, B3 b3, B4 b4, B5 b5, B6 b6, B7 b7, B8 b8) {
        return this.push(b1).pushBack(b2).pushBack(b3).pushBack(b4).pushBack(b5).pushBack(b6).pushBack(b7).pushBack(b8);
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Iterative8Cross<B1, B2, B3, B4, B5, B6, B7, B8> pushBackCross(B1 b1, B2 b2, B3 b3, B4 b4, B5 b5, B6 b6, B7 b7, B8 b8) {
        return this.push(b1).pushBackCross(b2).pushBackCross(b3).pushBackCross(b4).pushBackCross(b5).pushBackCross(b6).pushBackCross(b7).pushBackCross(b8);
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Iterative8Inline<B1, B2, B3, B4, B5, B6, B7, B8> pushBackInline(B1 b1, B2 b2, B3 b3, B4 b4, B5 b5, B6 b6, B7 b7, B8 b8) {
        return this.push(b1).pushBackInline(b2).pushBackInline(b3).pushBackInline(b4).pushBackInline(b5).pushBackInline(b6).pushBackInline(b7).pushBackInline(b8);
    }

    default public <F1, F2, F3, F4, F5, F6, F7, F8> Iterative8Cross<F1, F2, F3, F4, F5, F6, F7, F8> pushFront(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5, F6 f6, F7 f7, F8 f8) {
        return this.push(f8).pushFront(f7).pushFront(f6).pushFront(f5).pushFront(f4).pushFront(f3).pushFront(f2).pushFront(f1);
    }

    default public <F1, F2, F3, F4, F5, F6, F7, F8> Iterative8Cross<F1, F2, F3, F4, F5, F6, F7, F8> pushFrontCross(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5, F6 f6, F7 f7, F8 f8) {
        return this.push(f8).pushFrontCross(f7).pushFrontCross(f6).pushFrontCross(f5).pushFrontCross(f4).pushFrontCross(f3).pushFrontCross(f2).pushFrontCross(f1);
    }

    default public <F1, F2, F3, F4, F5, F6, F7, F8> Iterative8Inline<F1, F2, F3, F4, F5, F6, F7, F8> pushFrontInline(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5, F6 f6, F7 f7, F8 f8) {
        return this.push(f8).pushFrontInline(f7).pushFrontInline(f6).pushFrontInline(f5).pushFrontInline(f4).pushFrontInline(f3).pushFrontInline(f2).pushFrontInline(f1);
    }

    default public Iterative nonNullable() {
        return this.isNullable() ? Iterative.of() : this;
    }

    default public Iterative nullable() {
        return this.isNullable() ? this : Iterative.nullable().of();
    }

    public static class Iterative0NonNullable extends Iterative0Abst implements Iterative0, IterativeWrapper.IterativeWrapperNonNullable, IterativeWrapper.IterativeCross {

    }

    public static class Iterative0Nullable extends Iterative0Abst implements Iterative0, IterativeWrapper.IterativeWrapperNullable, IterativeWrapper.IterativeCross {

    }

    public static abstract class Iterative0Abst implements Iterative0 {

        @Override
        public String toStringContent() {
            return "";
        }

        public String toString() {
            return IterativeHandler.iterativeHeader(0) + this.toStringContent();
        }

    }

}

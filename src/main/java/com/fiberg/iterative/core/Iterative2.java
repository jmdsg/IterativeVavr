package com.fiberg.iterative.core;

import com.fiberg.iterative.core.Iterative;
import com.fiberg.iterative.core.Iterative1;
import com.fiberg.iterative.core.Iterative1Args;
import com.fiberg.iterative.core.Iterative2Args;
import com.fiberg.iterative.core.Iterative2Cross;
import com.fiberg.iterative.core.Iterative2Getter;
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
import com.fiberg.iterative.core.SimpleIterative;
import com.fiberg.iterative.function.Cs1;
import com.fiberg.iterative.function.Cs2;
import com.fiberg.iterative.function.Fn0;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fn2;
import com.fiberg.iterative.function.Fnc2;
import com.fiberg.iterative.function.Pr1;
import com.fiberg.iterative.function.Pr2;
import com.fiberg.iterative.function.Rn;
import com.fiberg.iterative.function.Sp;
import io.vavr.Tuple;
import io.vavr.Tuple2;
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

public interface Iterative2<T1, T2> extends IterativeConstructor {

    public static final int CARDINALITY = 2;

    public static <T1, T2> Iterative2<T1, T2> empty() {
        return Iterative.empty2();
    }

    public static <T1, T2> Iterative2<T1, T2> emptyNullable() {
        return Iterative.nullable().empty2();
    }

    public String toStringContent();

    public Stream<Tuple2<Iterable<T1>, Iterable<T2>>> toTupleStream();

    public Stream<Tuple2<T1, T2>> toStream();

    public Iterative2<T1, T2> nonNullable();

    public Iterative2<T1, T2> nullable();

    public Iterable<T1> iterable1();

    public Iterable<T2> iterable2();

    public Iterable<Stream<T1>> iterableStream1();

    public Iterable<Stream<T2>> iterableStream2();

    public Iterative1<T1> innerIterative();

    public Iterative1<T1> splitLt();

    public Iterative1<T2> splitRt();

    public Iterative2Cross<T1, T2> forceCross2();

    public Iterative2Cross<T1, T2> forceCrossAll();

    public Iterative2Inline<T1, T2> forceInline2();

    public Iterative2Inline<T1, T2> forceInlineAll();

    public Iterative2<T1, T2> forceCleanEmpty1();

    public Iterative2<T1, T2> forceCleanEmpty2();

    public Iterative2<T1, T2> forceCleanEmptyAll();

    public <T3> Iterative3<T1, T2, T3> pushBackBy(Iterable<? extends Stream<? extends T3>> var1);

    public <T3> Iterative3Cross<T1, T2, T3> pushBackCrossBy(Iterable<? extends Stream<? extends T3>> var1);

    public <T3> Iterative3Inline<T1, T2, T3> pushBackInlineBy(Iterable<? extends Stream<? extends T3>> var1);

    public <T0> Iterative3<T0, T1, T2> pushFrontBy(Iterable<? extends Stream<? extends T0>> var1);

    public <T0> Iterative3<T0, T1, T2> pushFrontCrossBy(Iterable<? extends Stream<? extends T0>> var1);

    public <T0> Iterative3<T0, T1, T2> pushFrontInlineBy(Iterable<? extends Stream<? extends T0>> var1);

    public Iterative1<T1> popBack(Cs1<? super T2> var1);

    public Iterative1<T1> popBackChain(Cs1<? super T2> var1);

    public Iterative1<T2> popFront(Cs1<? super T1> var1);

    default public Iterative1<T1> popBack() {
        return this.popBack(Cs1.empty());
    }

    default public Iterative1<T2> popFront() {
        return this.popFront(Cs1.empty());
    }

    public <R1, R2> Iterative2<R1, R2> map(Fn1<? super T1, ? extends R1> var1, Fn1<? super T2, ? extends R2> var2);

    public <R1, R2> Iterative2<R1, R2> inlineMap(Fn1<? super T1, ? extends Iterable<? extends R1>> var1, Fn1<? super T2, ? extends Iterable<? extends R2>> var2);

    public Iterative2<T1, T2> filter(Pr1<? super T1> var1, Pr1<? super T2> var2);

    default public <R1, R2> Iterative2<R1, R2> flatMap(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2) {
        return this.inlineMap(f1, f2).forceFlatAll();
    }

    @Override
    default public Iterative2<T1, T2> onSuccess(Rn r) {
        return this.onSuccess(r.ignoring1());
    }

    @Override
    default public Iterative2<T1, T2> onFailure(Rn r) {
        return this.onFailure(r.ignoring1());
    }

    default public Iterative2<T1, T2> execute(Cs1<? super Iterative2<? extends T1, ? extends T2>> c) {
        Objects.requireNonNull(c, "c is null");
        c.accept(this);
        return this;
    }

    default public Iterative2<T1, T2> onFailure(Cs1<? super Iterative2<? extends T1, ? extends T2>> c) {
        Objects.requireNonNull(c, "c is null");
        this.toStream().toTry().recover(t -> null).filter(Objects::isNull).forEach(tuple -> c.accept(this));
        return this;
    }

    default public Iterative2<T1, T2> onSuccess(Cs1<? super Iterative2<? extends T1, ? extends T2>> c) {
        Objects.requireNonNull(c, "c is null");
        this.toStream().headOption().forEach(tuple -> c.accept(this));
        return this;
    }

    default public Iterative2<T1, T2> onSuccessful(Cs2<? super T1, ? super T2> c) {
        return this.forEach(c);
    }

    default public Iterative2<T1, T2> recover1(T1 t1) {
        return this.splitLt().recover(t1).pushBackBy(this.iterableStream2());
    }

    default public Iterative2<T1, T2> recover1Of(Iterable<? extends T1> t1) {
        return this.splitLt().recoverOf(t1).pushBackBy(this.iterableStream2());
    }

    default public Iterative2<T1, T2> recover1By(Iterable<? extends Stream<? extends T1>> t1) {
        return this.splitLt().recoverBy(t1).pushBackBy(this.iterableStream2());
    }

    default public Iterative2<T1, T2> recover2(T2 t2) {
        return this.splitRt().isFailure() ? this.splitLt().pushBack(t2) : this;
    }

    default public Iterative2<T1, T2> recover2Of(Iterable<? extends T2> t2) {
        return this.splitRt().isFailure() ? this.splitLt().pushBackOf(t2) : this;
    }

    default public Iterative2<T1, T2> recover2By(Iterable<? extends Stream<? extends T2>> t2) {
        return this.splitRt().isFailure() ? this.splitLt().pushBackBy(t2) : this;
    }

    default public Iterative2<T1, T2> replace1When(Fn1<? super T1, ? extends T1> f, Pr1<? super T1> p) {
        return this.map1((Fn1 & Serializable)t -> p.test(t) ? f.apply(t) : t);
    }

    default public Iterative2<T1, T2> replace1When(Sp<? extends T1> s, Pr1<? super T1> p) {
        return this.replace1When((T1)s.toFunction().ignoring1(), p);
    }

    default public Iterative2<T1, T2> replace1When(T1 t, Pr1<? super T1> p) {
        return this.replace1When((T1)Fn1.value(t), p);
    }

    default public Iterative2<T1, T2> replace2When(Fn1<? super T2, ? extends T2> f, Pr1<? super T2> p) {
        return this.map2((Fn1 & Serializable)t -> p.test(t) ? f.apply(t) : t);
    }

    default public Iterative2<T1, T2> replace2When(Sp<? extends T2> s, Pr1<? super T2> p) {
        return this.replace2When((T2)s.toFunction().ignoring1(), p);
    }

    default public Iterative2<T1, T2> replace2When(T2 t, Pr1<? super T2> p) {
        return this.replace2When((T2)Fn1.value(t), p);
    }

    default public Iterative2<T1, T2> forEach(Cs2<? super T1, ? super T2> c) {
        Objects.requireNonNull(c, "c is null");
        this.toStream().forEach(Cs2.tuple(c));
        return this;
    }

    default public Iterative2<T1, T2> forEach1(Cs1<? super T1> c) {
        return this.forEach(c.ignoring1Rt());
    }

    default public Iterative2<T1, T2> forEach2(Cs1<? super T2> c) {
        return this.forEach(c.ignoring1Lt());
    }

    default public Iterative2<T1, T2> forEach(Rn r) {
        return this.forEach(r.ignoring2());
    }

    default public Iterative2<T1, T2> forEachWhen1(Cs2<? super T1, ? super T2> c, Pr1<? super T1> p) {
        return this.forEachWhen(c, p, Pr1.value(true));
    }

    default public Iterative2<T1, T2> forEachWhen2(Cs2<? super T1, ? super T2> c, Pr1<? super T2> p) {
        return this.forEachWhen(c, Pr1.value(true), p);
    }

    default public Iterative2<T1, T2> forEach1When(Cs1<? super T1> c, Pr1<? super T1> p) {
        return this.forEachWhen1(c.ignoring1Rt(), p);
    }

    default public Iterative2<T1, T2> forEach2When(Cs1<? super T2> c, Pr1<? super T2> p) {
        return this.forEachWhen2(c.ignoring1Lt(), p);
    }

    default public Iterative2<T1, T2> forEachWhen(Cs2<? super T1, ? super T2> c, Pr1<? super T1> p1, Pr1<? super T2> p2) {
        Objects.requireNonNull(c, "c is null");
        Objects.requireNonNull(p1, "p1 is null");
        Objects.requireNonNull(p2, "p2 is null");
        this.filter(p1, p2).toStream().forEach(Cs2.tuple(c));
        return this;
    }

    default public Iterative2<T1, T2> forEachWhen(Cs2<? super T1, ? super T2> c, Pr2<? super T1, ? super T2> p) {
        Objects.requireNonNull(c, "c is null");
        Objects.requireNonNull(p, "p is null");
        this.toStream().filter(Pr2.tuple(p)).forEach(Cs2.tuple(c));
        return this;
    }

    default public Iterable<Tuple2<T1, T2>> yield() {
        return this.yield(Tuple::of);
    }

    default public <R> Iterable<R> yield(Fn2<? super T1, ? super T2, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.toStream().map(Fn2.tuple(f)).flatMap(this::wrap);
    }

    default public Stream<Tuple2<T1, T2>> yieldStream() {
        return this.yieldStream(Tuple::of);
    }

    default public <R> Stream<R> yieldStream(Fn2<? super T1, ? super T2, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.toStream().map(Fn2.tuple(f)).flatMap(this::wrap);
    }

    default public <R> Stream<R> yieldFlatStream(Fn2<? super T1, ? super T2, ? extends Iterable<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.yieldStream(f).flatMap(IterativeInternals::entity).flatMap(this::wrap);
    }

    default public Option<Tuple2<T1, T2>> yieldOption() {
        return this.yieldOption(Tuple::of);
    }

    default public <R> Option<R> yieldOption(Fn2<? super T1, ? super T2, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.toStream().headOption().map(Fn2.tuple(f)).flatMap(this::wrap);
    }

    default public <R> Option<R> yieldFlatOption(Fn2<? super T1, ? super T2, ? extends Option<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.yieldOption(f).flatMap(IterativeInternals::entity).flatMap(this::wrap);
    }

    default public Try<Tuple2<T1, T2>> yieldTry() {
        return this.yieldTry(Tuple::of);
    }

    default public <R> Try<R> yieldTry(Fnc2<? super T1, ? super T2, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.toStream().headOption().toTry().mapTry(Fnc2.tuple(f)).flatMap(this::wrapTry);
    }

    default public <R> Try<R> yieldFlatTry(Fnc2<? super T1, ? super T2, ? extends Try<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.yieldTry(f).flatMap(IterativeInternals::entity).flatMap(this::wrapTry);
    }

    default public Validation<Seq<Throwable>, Stream<Tuple2<T1, T2>>> validateStream() {
        return this.validateStream(Tuple::of);
    }

    default public <R> Validation<Seq<Throwable>, Stream<R>> validateStream(Fn2<? super T1, ? super T2, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldStream(f));
        }
        return Validation.invalid(failures);
    }

    default public <R> Validation<Seq<Throwable>, Stream<R>> validateFlatStream(Fn2<? super T1, ? super T2, ? extends Iterable<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldFlatStream(f));
        }
        return Validation.invalid(failures);
    }

    default public Validation<Seq<Throwable>, Option<Tuple2<T1, T2>>> validateOption() {
        return this.validateOption(Tuple::of);
    }

    default public <R> Validation<Seq<Throwable>, Option<R>> validateOption(Fn2<? super T1, ? super T2, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldOption(f));
        }
        return Validation.invalid(failures);
    }

    default public <R> Validation<Seq<Throwable>, Option<R>> validateFlatOption(Fn2<? super T1, ? super T2, ? extends Option<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldFlatOption(f));
        }
        return Validation.invalid(failures);
    }

    default public Validation<Seq<Throwable>, Try<Tuple2<T1, T2>>> validateTry() {
        return this.validateTry(Tuple::of);
    }

    default public <R> Validation<Seq<Throwable>, Try<R>> validateTry(Fnc2<? super T1, ? super T2, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldTry(f));
        }
        return Validation.invalid(failures);
    }

    default public <R> Validation<Seq<Throwable>, Try<R>> validateFlatTry(Fnc2<? super T1, ? super T2, ? extends Try<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldFlatTry(f));
        }
        return Validation.invalid(failures);
    }

    default public <R> Iterative2<R, T2> map1(Fn1<? super T1, ? extends R> f) {
        return this.map(f, IterativeInternals::entity);
    }

    default public <R> Iterative2<T1, R> map2(Fn1<? super T2, ? extends R> f) {
        return this.map(IterativeInternals::entity, f);
    }

    default public <R> Iterative2<R, T2> inlineMap1(Fn1<? super T1, ? extends Iterable<? extends R>> f) {
        return this.inlineMap(f, this::wrap);
    }

    default public <R> Iterative2<T1, R> inlineMap2(Fn1<? super T2, ? extends Iterable<? extends R>> f) {
        return this.inlineMap(this::wrap, f);
    }

    default public <R> Iterative2<R, T2> flatMap1(Fn1<? super T1, ? extends Iterable<? extends R>> f) {
        return this.inlineMap1(f).forceFlat1();
    }

    default public <R> Iterative2<T1, R> flatMap2(Fn1<? super T2, ? extends Iterable<? extends R>> f) {
        return this.inlineMap2(f).forceFlat2();
    }

    default public Iterative2<T1, T2> filter1(Pr1<? super T1> p) {
        return this.filter(p, Pr1.value(true));
    }

    default public Iterative2<T1, T2> filter2(Pr1<? super T2> p) {
        return this.filter(Pr1.value(true), p);
    }

    default public <T3> Iterative3<T1, T2, T3> pushBackOf(Iterable<? extends T3> t3) {
        return this.pushBackBy(IterativeHandler.streamWrap(t3));
    }

    default public <T3> Iterative3Cross<T1, T2, T3> pushBackCrossOf(Iterable<? extends T3> t3) {
        return this.pushBackCrossBy(IterativeHandler.streamWrap(t3));
    }

    default public <T3> Iterative3Inline<T1, T2, T3> pushBackInlineOf(Iterable<? extends T3> t3) {
        return this.pushBackInlineBy(IterativeHandler.streamWrap(t3));
    }

    default public <T0> Iterative3<T0, T1, T2> pushFrontOf(Iterable<? extends T0> t0) {
        return this.pushFrontBy(IterativeHandler.streamWrap(t0));
    }

    default public <T0> Iterative3<T0, T1, T2> pushFrontCrossOf(Iterable<? extends T0> t0) {
        return this.pushFrontCrossBy(IterativeHandler.streamWrap(t0));
    }

    default public <T0> Iterative3<T0, T1, T2> pushFrontInlineOf(Iterable<? extends T0> t0) {
        return this.pushFrontInlineBy(IterativeHandler.streamWrap(t0));
    }

    default public <T3> Iterative3<T1, T2, T3> pushBack(T3 t3) {
        return this.pushBackOf((Iterable<? extends T3>)this.wrap(t3));
    }

    default public <T3> Iterative3Cross<T1, T2, T3> pushBackCross(T3 t3) {
        return this.pushBackCrossOf((Iterable<? extends T3>)this.wrap(t3));
    }

    default public <T3> Iterative3Inline<T1, T2, T3> pushBackInline(T3 t3) {
        return this.pushBackInlineOf((Iterable<? extends T3>)this.wrap(t3));
    }

    default public <T0> Iterative3<T0, T1, T2> pushFront(T0 t0) {
        return this.pushFrontOf((Iterable<? extends T0>)this.wrap(t0));
    }

    default public <T0> Iterative3<T0, T1, T2> pushFrontCross(T0 t0) {
        return this.pushFrontCrossOf((Iterable<? extends T0>)this.wrap(t0));
    }

    default public <T0> Iterative3<T0, T1, T2> pushFrontInline(T0 t0) {
        return this.pushFrontInlineOf((Iterable<? extends T0>)this.wrap(t0));
    }

    default public <B1, B2> Iterative4<T1, T2, B1, B2> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2) {
        return this.pushBackBy(b1).pushBackBy(b2);
    }

    default public <B1, B2> Iterative4Cross<T1, T2, B1, B2> pushBackCrossBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2) {
        return this.pushBackCrossBy(b1).pushBackCrossBy(b2);
    }

    default public <B1, B2> Iterative4Inline<T1, T2, B1, B2> pushBackInlineBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2) {
        return this.pushBackInlineBy(b1).pushBackInlineBy(b2);
    }

    default public <F1, F2> Iterative4<F1, F2, T1, T2> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return this.pushFrontBy(f2).pushFrontBy(f1);
    }

    default public <F1, F2> Iterative4<F1, F2, T1, T2> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return this.pushFrontCrossBy(f2).pushFrontCrossBy(f1);
    }

    default public <F1, F2> Iterative4<F1, F2, T1, T2> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return this.pushFrontInlineBy(f2).pushFrontInlineBy(f1);
    }

    default public <B1, B2> Iterative4<T1, T2, B1, B2> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2) {
        return this.pushBackOf(b1).pushBackOf(b2);
    }

    default public <B1, B2> Iterative4Cross<T1, T2, B1, B2> pushBackCrossOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2) {
        return this.pushBackCrossOf(b1).pushBackCrossOf(b2);
    }

    default public <B1, B2> Iterative4Inline<T1, T2, B1, B2> pushBackInlineOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2) {
        return this.pushBackInlineOf(b1).pushBackInlineOf(b2);
    }

    default public <F1, F2> Iterative4<F1, F2, T1, T2> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return this.pushFrontOf(f2).pushFrontOf(f1);
    }

    default public <F1, F2> Iterative4<F1, F2, T1, T2> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return this.pushFrontCrossOf(f2).pushFrontCrossOf(f1);
    }

    default public <F1, F2> Iterative4<F1, F2, T1, T2> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return this.pushFrontInlineOf(f2).pushFrontInlineOf(f1);
    }

    default public <B1, B2> Iterative4<T1, T2, B1, B2> pushBack(B1 b1, B2 b2) {
        return this.pushBack(b1).pushBack(b2);
    }

    default public <B1, B2> Iterative4Cross<T1, T2, B1, B2> pushBackCross(B1 b1, B2 b2) {
        return this.pushBackCross(b1).pushBackCross(b2);
    }

    default public <B1, B2> Iterative4Inline<T1, T2, B1, B2> pushBackInline(B1 b1, B2 b2) {
        return this.pushBackInline(b1).pushBackInline(b2);
    }

    default public <F1, F2> Iterative4<F1, F2, T1, T2> pushFront(F1 f1, F2 f2) {
        return this.pushFront(f2).pushFront(f1);
    }

    default public <F1, F2> Iterative4<F1, F2, T1, T2> pushFrontCross(F1 f1, F2 f2) {
        return this.pushFrontCross(f2).pushFrontCross(f1);
    }

    default public <F1, F2> Iterative4<F1, F2, T1, T2> pushFrontInline(F1 f1, F2 f2) {
        return this.pushFrontInline(f2).pushFrontInline(f1);
    }

    default public <B1, B2, B3> Iterative5<T1, T2, B1, B2, B3> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3) {
        return this.pushBackBy(b1).pushBackBy(b2).pushBackBy(b3);
    }

    default public <B1, B2, B3> Iterative5Cross<T1, T2, B1, B2, B3> pushBackCrossBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3) {
        return this.pushBackCrossBy(b1).pushBackCrossBy(b2).pushBackCrossBy(b3);
    }

    default public <B1, B2, B3> Iterative5Inline<T1, T2, B1, B2, B3> pushBackInlineBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3) {
        return this.pushBackInlineBy(b1).pushBackInlineBy(b2).pushBackInlineBy(b3);
    }

    default public <F1, F2, F3> Iterative5<F1, F2, F3, T1, T2> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3) {
        return this.pushFrontBy(f3).pushFrontBy(f2).pushFrontBy(f1);
    }

    default public <F1, F2, F3> Iterative5<F1, F2, F3, T1, T2> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3) {
        return this.pushFrontCrossBy(f3).pushFrontCrossBy(f2).pushFrontCrossBy(f1);
    }

    default public <F1, F2, F3> Iterative5<F1, F2, F3, T1, T2> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3) {
        return this.pushFrontInlineBy(f3).pushFrontInlineBy(f2).pushFrontInlineBy(f1);
    }

    default public <B1, B2, B3> Iterative5<T1, T2, B1, B2, B3> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3) {
        return this.pushBackOf(b1).pushBackOf(b2).pushBackOf(b3);
    }

    default public <B1, B2, B3> Iterative5Cross<T1, T2, B1, B2, B3> pushBackCrossOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3) {
        return this.pushBackCrossOf(b1).pushBackCrossOf(b2).pushBackCrossOf(b3);
    }

    default public <B1, B2, B3> Iterative5Inline<T1, T2, B1, B2, B3> pushBackInlineOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3) {
        return this.pushBackInlineOf(b1).pushBackInlineOf(b2).pushBackInlineOf(b3);
    }

    default public <F1, F2, F3> Iterative5<F1, F2, F3, T1, T2> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3) {
        return this.pushFrontOf(f3).pushFrontOf(f2).pushFrontOf(f1);
    }

    default public <F1, F2, F3> Iterative5<F1, F2, F3, T1, T2> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3) {
        return this.pushFrontCrossOf(f3).pushFrontCrossOf(f2).pushFrontCrossOf(f1);
    }

    default public <F1, F2, F3> Iterative5<F1, F2, F3, T1, T2> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3) {
        return this.pushFrontInlineOf(f3).pushFrontInlineOf(f2).pushFrontInlineOf(f1);
    }

    default public <B1, B2, B3> Iterative5<T1, T2, B1, B2, B3> pushBack(B1 b1, B2 b2, B3 b3) {
        return this.pushBack(b1).pushBack(b2).pushBack(b3);
    }

    default public <B1, B2, B3> Iterative5Cross<T1, T2, B1, B2, B3> pushBackCross(B1 b1, B2 b2, B3 b3) {
        return this.pushBackCross(b1).pushBackCross(b2).pushBackCross(b3);
    }

    default public <B1, B2, B3> Iterative5Inline<T1, T2, B1, B2, B3> pushBackInline(B1 b1, B2 b2, B3 b3) {
        return this.pushBackInline(b1).pushBackInline(b2).pushBackInline(b3);
    }

    default public <F1, F2, F3> Iterative5<F1, F2, F3, T1, T2> pushFront(F1 f1, F2 f2, F3 f3) {
        return this.pushFront(f3).pushFront(f2).pushFront(f1);
    }

    default public <F1, F2, F3> Iterative5<F1, F2, F3, T1, T2> pushFrontCross(F1 f1, F2 f2, F3 f3) {
        return this.pushFrontCross(f3).pushFrontCross(f2).pushFrontCross(f1);
    }

    default public <F1, F2, F3> Iterative5<F1, F2, F3, T1, T2> pushFrontInline(F1 f1, F2 f2, F3 f3) {
        return this.pushFrontInline(f3).pushFrontInline(f2).pushFrontInline(f1);
    }

    default public <B1, B2, B3, B4> Iterative6<T1, T2, B1, B2, B3, B4> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4) {
        return this.pushBackBy(b1).pushBackBy(b2).pushBackBy(b3).pushBackBy(b4);
    }

    default public <B1, B2, B3, B4> Iterative6Cross<T1, T2, B1, B2, B3, B4> pushBackCrossBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4) {
        return this.pushBackCrossBy(b1).pushBackCrossBy(b2).pushBackCrossBy(b3).pushBackCrossBy(b4);
    }

    default public <B1, B2, B3, B4> Iterative6Inline<T1, T2, B1, B2, B3, B4> pushBackInlineBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4) {
        return this.pushBackInlineBy(b1).pushBackInlineBy(b2).pushBackInlineBy(b3).pushBackInlineBy(b4);
    }

    default public <F1, F2, F3, F4> Iterative6<F1, F2, F3, F4, T1, T2> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4) {
        return this.pushFrontBy(f4).pushFrontBy(f3).pushFrontBy(f2).pushFrontBy(f1);
    }

    default public <F1, F2, F3, F4> Iterative6<F1, F2, F3, F4, T1, T2> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4) {
        return this.pushFrontCrossBy(f4).pushFrontCrossBy(f3).pushFrontCrossBy(f2).pushFrontCrossBy(f1);
    }

    default public <F1, F2, F3, F4> Iterative6<F1, F2, F3, F4, T1, T2> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4) {
        return this.pushFrontInlineBy(f4).pushFrontInlineBy(f3).pushFrontInlineBy(f2).pushFrontInlineBy(f1);
    }

    default public <B1, B2, B3, B4> Iterative6<T1, T2, B1, B2, B3, B4> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4) {
        return this.pushBackOf(b1).pushBackOf(b2).pushBackOf(b3).pushBackOf(b4);
    }

    default public <B1, B2, B3, B4> Iterative6Cross<T1, T2, B1, B2, B3, B4> pushBackCrossOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4) {
        return this.pushBackCrossOf(b1).pushBackCrossOf(b2).pushBackCrossOf(b3).pushBackCrossOf(b4);
    }

    default public <B1, B2, B3, B4> Iterative6Inline<T1, T2, B1, B2, B3, B4> pushBackInlineOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4) {
        return this.pushBackInlineOf(b1).pushBackInlineOf(b2).pushBackInlineOf(b3).pushBackInlineOf(b4);
    }

    default public <F1, F2, F3, F4> Iterative6<F1, F2, F3, F4, T1, T2> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4) {
        return this.pushFrontOf(f4).pushFrontOf(f3).pushFrontOf(f2).pushFrontOf(f1);
    }

    default public <F1, F2, F3, F4> Iterative6<F1, F2, F3, F4, T1, T2> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4) {
        return this.pushFrontCrossOf(f4).pushFrontCrossOf(f3).pushFrontCrossOf(f2).pushFrontCrossOf(f1);
    }

    default public <F1, F2, F3, F4> Iterative6<F1, F2, F3, F4, T1, T2> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4) {
        return this.pushFrontInlineOf(f4).pushFrontInlineOf(f3).pushFrontInlineOf(f2).pushFrontInlineOf(f1);
    }

    default public <B1, B2, B3, B4> Iterative6<T1, T2, B1, B2, B3, B4> pushBack(B1 b1, B2 b2, B3 b3, B4 b4) {
        return this.pushBack(b1).pushBack(b2).pushBack(b3).pushBack(b4);
    }

    default public <B1, B2, B3, B4> Iterative6Cross<T1, T2, B1, B2, B3, B4> pushBackCross(B1 b1, B2 b2, B3 b3, B4 b4) {
        return this.pushBackCross(b1).pushBackCross(b2).pushBackCross(b3).pushBackCross(b4);
    }

    default public <B1, B2, B3, B4> Iterative6Inline<T1, T2, B1, B2, B3, B4> pushBackInline(B1 b1, B2 b2, B3 b3, B4 b4) {
        return this.pushBackInline(b1).pushBackInline(b2).pushBackInline(b3).pushBackInline(b4);
    }

    default public <F1, F2, F3, F4> Iterative6<F1, F2, F3, F4, T1, T2> pushFront(F1 f1, F2 f2, F3 f3, F4 f4) {
        return this.pushFront(f4).pushFront(f3).pushFront(f2).pushFront(f1);
    }

    default public <F1, F2, F3, F4> Iterative6<F1, F2, F3, F4, T1, T2> pushFrontCross(F1 f1, F2 f2, F3 f3, F4 f4) {
        return this.pushFrontCross(f4).pushFrontCross(f3).pushFrontCross(f2).pushFrontCross(f1);
    }

    default public <F1, F2, F3, F4> Iterative6<F1, F2, F3, F4, T1, T2> pushFrontInline(F1 f1, F2 f2, F3 f3, F4 f4) {
        return this.pushFrontInline(f4).pushFrontInline(f3).pushFrontInline(f2).pushFrontInline(f1);
    }

    default public <B1, B2, B3, B4, B5> Iterative7<T1, T2, B1, B2, B3, B4, B5> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4, Iterable<? extends Stream<? extends B5>> b5) {
        return this.pushBackBy(b1).pushBackBy(b2).pushBackBy(b3).pushBackBy(b4).pushBackBy(b5);
    }

    default public <B1, B2, B3, B4, B5> Iterative7Cross<T1, T2, B1, B2, B3, B4, B5> pushBackCrossBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4, Iterable<? extends Stream<? extends B5>> b5) {
        return this.pushBackCrossBy(b1).pushBackCrossBy(b2).pushBackCrossBy(b3).pushBackCrossBy(b4).pushBackCrossBy(b5);
    }

    default public <B1, B2, B3, B4, B5> Iterative7Inline<T1, T2, B1, B2, B3, B4, B5> pushBackInlineBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4, Iterable<? extends Stream<? extends B5>> b5) {
        return this.pushBackInlineBy(b1).pushBackInlineBy(b2).pushBackInlineBy(b3).pushBackInlineBy(b4).pushBackInlineBy(b5);
    }

    default public <F1, F2, F3, F4, F5> Iterative7<F1, F2, F3, F4, F5, T1, T2> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5) {
        return this.pushFrontBy(f5).pushFrontBy(f4).pushFrontBy(f3).pushFrontBy(f2).pushFrontBy(f1);
    }

    default public <F1, F2, F3, F4, F5> Iterative7<F1, F2, F3, F4, F5, T1, T2> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5) {
        return this.pushFrontCrossBy(f5).pushFrontCrossBy(f4).pushFrontCrossBy(f3).pushFrontCrossBy(f2).pushFrontCrossBy(f1);
    }

    default public <F1, F2, F3, F4, F5> Iterative7<F1, F2, F3, F4, F5, T1, T2> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5) {
        return this.pushFrontInlineBy(f5).pushFrontInlineBy(f4).pushFrontInlineBy(f3).pushFrontInlineBy(f2).pushFrontInlineBy(f1);
    }

    default public <B1, B2, B3, B4, B5> Iterative7<T1, T2, B1, B2, B3, B4, B5> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4, Iterable<? extends B5> b5) {
        return this.pushBackOf(b1).pushBackOf(b2).pushBackOf(b3).pushBackOf(b4).pushBackOf(b5);
    }

    default public <B1, B2, B3, B4, B5> Iterative7Cross<T1, T2, B1, B2, B3, B4, B5> pushBackCrossOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4, Iterable<? extends B5> b5) {
        return this.pushBackCrossOf(b1).pushBackCrossOf(b2).pushBackCrossOf(b3).pushBackCrossOf(b4).pushBackCrossOf(b5);
    }

    default public <B1, B2, B3, B4, B5> Iterative7Inline<T1, T2, B1, B2, B3, B4, B5> pushBackInlineOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4, Iterable<? extends B5> b5) {
        return this.pushBackInlineOf(b1).pushBackInlineOf(b2).pushBackInlineOf(b3).pushBackInlineOf(b4).pushBackInlineOf(b5);
    }

    default public <F1, F2, F3, F4, F5> Iterative7<F1, F2, F3, F4, F5, T1, T2> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5) {
        return this.pushFrontOf(f5).pushFrontOf(f4).pushFrontOf(f3).pushFrontOf(f2).pushFrontOf(f1);
    }

    default public <F1, F2, F3, F4, F5> Iterative7<F1, F2, F3, F4, F5, T1, T2> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5) {
        return this.pushFrontCrossOf(f5).pushFrontCrossOf(f4).pushFrontCrossOf(f3).pushFrontCrossOf(f2).pushFrontCrossOf(f1);
    }

    default public <F1, F2, F3, F4, F5> Iterative7<F1, F2, F3, F4, F5, T1, T2> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5) {
        return this.pushFrontInlineOf(f5).pushFrontInlineOf(f4).pushFrontInlineOf(f3).pushFrontInlineOf(f2).pushFrontInlineOf(f1);
    }

    default public <B1, B2, B3, B4, B5> Iterative7<T1, T2, B1, B2, B3, B4, B5> pushBack(B1 b1, B2 b2, B3 b3, B4 b4, B5 b5) {
        return this.pushBack(b1).pushBack(b2).pushBack(b3).pushBack(b4).pushBack(b5);
    }

    default public <B1, B2, B3, B4, B5> Iterative7Cross<T1, T2, B1, B2, B3, B4, B5> pushBackCross(B1 b1, B2 b2, B3 b3, B4 b4, B5 b5) {
        return this.pushBackCross(b1).pushBackCross(b2).pushBackCross(b3).pushBackCross(b4).pushBackCross(b5);
    }

    default public <B1, B2, B3, B4, B5> Iterative7Inline<T1, T2, B1, B2, B3, B4, B5> pushBackInline(B1 b1, B2 b2, B3 b3, B4 b4, B5 b5) {
        return this.pushBackInline(b1).pushBackInline(b2).pushBackInline(b3).pushBackInline(b4).pushBackInline(b5);
    }

    default public <F1, F2, F3, F4, F5> Iterative7<F1, F2, F3, F4, F5, T1, T2> pushFront(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5) {
        return this.pushFront(f5).pushFront(f4).pushFront(f3).pushFront(f2).pushFront(f1);
    }

    default public <F1, F2, F3, F4, F5> Iterative7<F1, F2, F3, F4, F5, T1, T2> pushFrontCross(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5) {
        return this.pushFrontCross(f5).pushFrontCross(f4).pushFrontCross(f3).pushFrontCross(f2).pushFrontCross(f1);
    }

    default public <F1, F2, F3, F4, F5> Iterative7<F1, F2, F3, F4, F5, T1, T2> pushFrontInline(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5) {
        return this.pushFrontInline(f5).pushFrontInline(f4).pushFrontInline(f3).pushFrontInline(f2).pushFrontInline(f1);
    }

    default public <B1, B2, B3, B4, B5, B6> Iterative8<T1, T2, B1, B2, B3, B4, B5, B6> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4, Iterable<? extends Stream<? extends B5>> b5, Iterable<? extends Stream<? extends B6>> b6) {
        return this.pushBackBy(b1).pushBackBy(b2).pushBackBy(b3).pushBackBy(b4).pushBackBy(b5).pushBackBy(b6);
    }

    default public <B1, B2, B3, B4, B5, B6> Iterative8Cross<T1, T2, B1, B2, B3, B4, B5, B6> pushBackCrossBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4, Iterable<? extends Stream<? extends B5>> b5, Iterable<? extends Stream<? extends B6>> b6) {
        return this.pushBackCrossBy(b1).pushBackCrossBy(b2).pushBackCrossBy(b3).pushBackCrossBy(b4).pushBackCrossBy(b5).pushBackCrossBy(b6);
    }

    default public <B1, B2, B3, B4, B5, B6> Iterative8Inline<T1, T2, B1, B2, B3, B4, B5, B6> pushBackInlineBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4, Iterable<? extends Stream<? extends B5>> b5, Iterable<? extends Stream<? extends B6>> b6) {
        return this.pushBackInlineBy(b1).pushBackInlineBy(b2).pushBackInlineBy(b3).pushBackInlineBy(b4).pushBackInlineBy(b5).pushBackInlineBy(b6);
    }

    default public <F1, F2, F3, F4, F5, F6> Iterative8<F1, F2, F3, F4, F5, F6, T1, T2> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5, Iterable<? extends Stream<? extends F6>> f6) {
        return this.pushFrontBy(f6).pushFrontBy(f5).pushFrontBy(f4).pushFrontBy(f3).pushFrontBy(f2).pushFrontBy(f1);
    }

    default public <F1, F2, F3, F4, F5, F6> Iterative8<F1, F2, F3, F4, F5, F6, T1, T2> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5, Iterable<? extends Stream<? extends F6>> f6) {
        return this.pushFrontCrossBy(f6).pushFrontCrossBy(f5).pushFrontCrossBy(f4).pushFrontCrossBy(f3).pushFrontCrossBy(f2).pushFrontCrossBy(f1);
    }

    default public <F1, F2, F3, F4, F5, F6> Iterative8<F1, F2, F3, F4, F5, F6, T1, T2> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5, Iterable<? extends Stream<? extends F6>> f6) {
        return this.pushFrontInlineBy(f6).pushFrontInlineBy(f5).pushFrontInlineBy(f4).pushFrontInlineBy(f3).pushFrontInlineBy(f2).pushFrontInlineBy(f1);
    }

    default public <B1, B2, B3, B4, B5, B6> Iterative8<T1, T2, B1, B2, B3, B4, B5, B6> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4, Iterable<? extends B5> b5, Iterable<? extends B6> b6) {
        return this.pushBackOf(b1).pushBackOf(b2).pushBackOf(b3).pushBackOf(b4).pushBackOf(b5).pushBackOf(b6);
    }

    default public <B1, B2, B3, B4, B5, B6> Iterative8Cross<T1, T2, B1, B2, B3, B4, B5, B6> pushBackCrossOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4, Iterable<? extends B5> b5, Iterable<? extends B6> b6) {
        return this.pushBackCrossOf(b1).pushBackCrossOf(b2).pushBackCrossOf(b3).pushBackCrossOf(b4).pushBackCrossOf(b5).pushBackCrossOf(b6);
    }

    default public <B1, B2, B3, B4, B5, B6> Iterative8Inline<T1, T2, B1, B2, B3, B4, B5, B6> pushBackInlineOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4, Iterable<? extends B5> b5, Iterable<? extends B6> b6) {
        return this.pushBackInlineOf(b1).pushBackInlineOf(b2).pushBackInlineOf(b3).pushBackInlineOf(b4).pushBackInlineOf(b5).pushBackInlineOf(b6);
    }

    default public <F1, F2, F3, F4, F5, F6> Iterative8<F1, F2, F3, F4, F5, F6, T1, T2> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5, Iterable<? extends F6> f6) {
        return this.pushFrontOf(f6).pushFrontOf(f5).pushFrontOf(f4).pushFrontOf(f3).pushFrontOf(f2).pushFrontOf(f1);
    }

    default public <F1, F2, F3, F4, F5, F6> Iterative8<F1, F2, F3, F4, F5, F6, T1, T2> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5, Iterable<? extends F6> f6) {
        return this.pushFrontCrossOf(f6).pushFrontCrossOf(f5).pushFrontCrossOf(f4).pushFrontCrossOf(f3).pushFrontCrossOf(f2).pushFrontCrossOf(f1);
    }

    default public <F1, F2, F3, F4, F5, F6> Iterative8<F1, F2, F3, F4, F5, F6, T1, T2> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5, Iterable<? extends F6> f6) {
        return this.pushFrontInlineOf(f6).pushFrontInlineOf(f5).pushFrontInlineOf(f4).pushFrontInlineOf(f3).pushFrontInlineOf(f2).pushFrontInlineOf(f1);
    }

    default public <B1, B2, B3, B4, B5, B6> Iterative8<T1, T2, B1, B2, B3, B4, B5, B6> pushBack(B1 b1, B2 b2, B3 b3, B4 b4, B5 b5, B6 b6) {
        return this.pushBack(b1).pushBack(b2).pushBack(b3).pushBack(b4).pushBack(b5).pushBack(b6);
    }

    default public <B1, B2, B3, B4, B5, B6> Iterative8Cross<T1, T2, B1, B2, B3, B4, B5, B6> pushBackCross(B1 b1, B2 b2, B3 b3, B4 b4, B5 b5, B6 b6) {
        return this.pushBackCross(b1).pushBackCross(b2).pushBackCross(b3).pushBackCross(b4).pushBackCross(b5).pushBackCross(b6);
    }

    default public <B1, B2, B3, B4, B5, B6> Iterative8Inline<T1, T2, B1, B2, B3, B4, B5, B6> pushBackInline(B1 b1, B2 b2, B3 b3, B4 b4, B5 b5, B6 b6) {
        return this.pushBackInline(b1).pushBackInline(b2).pushBackInline(b3).pushBackInline(b4).pushBackInline(b5).pushBackInline(b6);
    }

    default public <F1, F2, F3, F4, F5, F6> Iterative8<F1, F2, F3, F4, F5, F6, T1, T2> pushFront(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5, F6 f6) {
        return this.pushFront(f6).pushFront(f5).pushFront(f4).pushFront(f3).pushFront(f2).pushFront(f1);
    }

    default public <F1, F2, F3, F4, F5, F6> Iterative8<F1, F2, F3, F4, F5, F6, T1, T2> pushFrontCross(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5, F6 f6) {
        return this.pushFrontCross(f6).pushFrontCross(f5).pushFrontCross(f4).pushFrontCross(f3).pushFrontCross(f2).pushFrontCross(f1);
    }

    default public <F1, F2, F3, F4, F5, F6> Iterative8<F1, F2, F3, F4, F5, F6, T1, T2> pushFrontInline(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5, F6 f6) {
        return this.pushFrontInline(f6).pushFrontInline(f5).pushFrontInline(f4).pushFrontInline(f3).pushFrontInline(f2).pushFrontInline(f1);
    }

    default public Iterative2<T1, T2> forceInlineFlat() {
        return Iterative.ofTuple2(this.yieldStream());
    }

    default public Iterative2<T1, T2> forceFlat1() {
        return this.create(this.splitLt().forceFlat1(), this.iterableStream2());
    }

    default public Iterative2<T1, T2> forceFlat2() {
        return this.create(this.splitLt(), IterativeHandler.streamWrap(this.iterable2()));
    }

    default public Iterative2<T1, T2> forceFlatAll() {
        return this.create(this.splitLt().forceFlatAll(), IterativeHandler.streamWrap(this.iterable2()));
    }

    default public <R> R getOnSuccessOrNull(Fn1<? super Iterative2<? extends T1, ? extends T2>, ? extends R> f) {
        return (R)this.getterOnSuccess(f).onFailure(Sp.empty());
    }

    default public <R> R getOnSuccessOrThrow(Fn1<? super Iterative2<? extends T1, ? extends T2>, ? extends R> f) {
        return (R)this.getterOnSuccess(Fn1.narrow(f)).onFailure(Fn0.pass(IterativeGetter::throwableSupplier, "tuple").toSupplier());
    }

    default public Tuple2<T1, T2> getOrElse(Sp<? extends Tuple2<? extends T1, ? extends T2>> s) {
        return (Tuple2)this.getterOnSuccess().onFailure((Tuple2<T1, T2>)s.afterApply(Tuple::narrow));
    }

    default public Tuple2<T1, T2> getOrElse(Tuple2<? extends T1, ? extends T2> t) {
        return (Tuple2)this.getterOnSuccess().onFailure((Tuple2<T1, T2>)Sp.value(Tuple.narrow(t)));
    }

    default public Tuple2<T1, T2> getOrNull() {
        return (Tuple2)this.getterOnSuccess().onFailure((Tuple2<T1, T2>)Sp.empty());
    }

    default public Tuple2<T1, T2> getOrThrow() {
        return (Tuple2)this.getterOnSuccess().onFailure((Tuple2<T1, T2>)Fn0.pass(IterativeGetter::throwableSupplier, "tuple").toSupplier());
    }

    default public Iterative2Getter<T1, T2> getter() {
        return new Iterative2Getter.Iterative2GetterImpl(this);
    }

    default public Iterative2Getter.Iterative2Fail<T1, T2, Tuple2<T1, T2>> getterOnSuccess() {
        return this.getter().onSuccess();
    }

    default public <R> Iterative2Getter.Iterative2Fail<T1, T2, R> getterOnSuccess(R r) {
        return this.getter().onSuccess(r);
    }

    default public <R> Iterative2Getter.Iterative2Fail<T1, T2, R> getterOnSuccess(Sp<? extends R> s) {
        return this.getter().onSuccess(s);
    }

    default public <R> Iterative2Getter.Iterative2Fail<T1, T2, R> getterOnSuccess(Fn1<? super Iterative2<? extends T1, ? extends T2>, ? extends R> f) {
        return this.getter().onSuccess(f);
    }

    default public <R> Iterative2Getter.Iterative2Success<T1, T2, R> getterOnFailure(R r) {
        return this.getter().onFailure(r);
    }

    default public <R> Iterative2Getter.Iterative2Success<T1, T2, R> getterOnFailure(Sp<? extends R> s) {
        return this.getter().onFailure(s);
    }

    default public <R> Iterative2Getter.Iterative2Success<T1, T2, R> getterOnFailure(Fn1<? super Iterative2<? extends T1, ? extends T2>, ? extends R> f) {
        return this.getter().onFailure(f);
    }

    default public Iterative1<Tuple2<T1, T2>> reduce() {
        return this.reduce(Tuple::of);
    }

    default public <R> Iterative1<R> reduce(Fn2<? super T1, ? super T2, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.create(this.toTupleStream().map(Fn2.tuple(IterativeHandler::cross)).map(stream -> stream.map(Fn2.tuple(f))));
    }

    default public <A1> Iterative2Args.Iterative2Args1<T1, T2, A1> crossArgs(A1 a1) {
        return this.crossArgsOf((Iterable<? extends A1>)this.wrap(a1));
    }

    default public <A1> Iterative2Args.Iterative2Args1<T1, T2, A1> crossArgsOf(Iterable<? extends A1> a1) {
        return new Iterative2Args.Iterative2Args1.Iterative2Args1Impl(this, this.accessBuilder().cross().of(a1), true);
    }

    default public <A1, A2> Iterative2Args.Iterative2Args2<T1, T2, A1, A2> crossArgs(A1 a1, A2 a2) {
        return this.crossArgsOf((Iterable<? extends A1>)this.wrap(a1), (Iterable<? extends A2>)this.wrap(a2));
    }

    default public <A1, A2> Iterative2Args.Iterative2Args2<T1, T2, A1, A2> crossArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2) {
        return new Iterative2Args.Iterative2Args2.Iterative2Args2Impl(this, this.accessBuilder().cross().of(a1, (Iterable)a2), true);
    }

    default public <A1, A2, A3> Iterative2Args.Iterative2Args3<T1, T2, A1, A2, A3> crossArgs(A1 a1, A2 a2, A3 a3) {
        return this.crossArgsOf((Iterable<? extends A1>)this.wrap(a1), (Iterable<? extends A2>)this.wrap(a2), (Iterable<? extends A3>)this.wrap(a3));
    }

    default public <A1, A2, A3> Iterative2Args.Iterative2Args3<T1, T2, A1, A2, A3> crossArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3) {
        return new Iterative2Args.Iterative2Args3.Iterative2Args3Impl(this, this.accessBuilder().cross().of(a1, a2, a3), true);
    }

    default public <A1, A2, A3, A4> Iterative2Args.Iterative2Args4<T1, T2, A1, A2, A3, A4> crossArgs(A1 a1, A2 a2, A3 a3, A4 a4) {
        return this.crossArgsOf((Iterable<? extends A1>)this.wrap(a1), (Iterable<? extends A2>)this.wrap(a2), (Iterable<? extends A3>)this.wrap(a3), (Iterable<? extends A4>)this.wrap(a4));
    }

    default public <A1, A2, A3, A4> Iterative2Args.Iterative2Args4<T1, T2, A1, A2, A3, A4> crossArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4) {
        return new Iterative2Args.Iterative2Args4.Iterative2Args4Impl(this, this.accessBuilder().cross().of(a1, a2, a3, a4), true);
    }

    default public <A1, A2, A3, A4, A5> Iterative2Args.Iterative2Args5<T1, T2, A1, A2, A3, A4, A5> crossArgs(A1 a1, A2 a2, A3 a3, A4 a4, A5 a5) {
        return this.crossArgsOf((Iterable<? extends A1>)this.wrap(a1), (Iterable<? extends A2>)this.wrap(a2), (Iterable<? extends A3>)this.wrap(a3), (Iterable<? extends A4>)this.wrap(a4), (Iterable<? extends A5>)this.wrap(a5));
    }

    default public <A1, A2, A3, A4, A5> Iterative2Args.Iterative2Args5<T1, T2, A1, A2, A3, A4, A5> crossArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5) {
        return new Iterative2Args.Iterative2Args5.Iterative2Args5Impl(this, this.accessBuilder().cross().of(a1, a2, a3, a4, a5), true);
    }

    default public <A1, A2, A3, A4, A5, A6> Iterative2Args.Iterative2Args6<T1, T2, A1, A2, A3, A4, A5, A6> crossArgs(A1 a1, A2 a2, A3 a3, A4 a4, A5 a5, A6 a6) {
        return this.crossArgsOf((Iterable<? extends A1>)this.wrap(a1), (Iterable<? extends A2>)this.wrap(a2), (Iterable<? extends A3>)this.wrap(a3), (Iterable<? extends A4>)this.wrap(a4), (Iterable<? extends A5>)this.wrap(a5), (Iterable<? extends A6>)this.wrap(a6));
    }

    default public <A1, A2, A3, A4, A5, A6> Iterative2Args.Iterative2Args6<T1, T2, A1, A2, A3, A4, A5, A6> crossArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5, Iterable<? extends A6> a6) {
        return new Iterative2Args.Iterative2Args6.Iterative2Args6Impl(this, this.accessBuilder().cross().of(a1, a2, a3, a4, a5, a6), true);
    }

    default public <A1> Iterative2Args.Iterative2Args1<T1, T2, A1> inlineArgs(A1 a1) {
        return this.inlineArgsOf((Iterable<? extends A1>)this.wrap(a1));
    }

    default public <A1> Iterative2Args.Iterative2Args1<T1, T2, A1> inlineArgsOf(Iterable<? extends A1> a1) {
        return new Iterative2Args.Iterative2Args1.Iterative2Args1Impl(this, this.accessBuilder().inline().of(a1), false);
    }

    default public <A1, A2> Iterative2Args.Iterative2Args2<T1, T2, A1, A2> inlineArgs(A1 a1, A2 a2) {
        return this.inlineArgsOf((Iterable<? extends A1>)this.wrap(a1), (Iterable<? extends A2>)this.wrap(a2));
    }

    default public <A1, A2> Iterative2Args.Iterative2Args2<T1, T2, A1, A2> inlineArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2) {
        return new Iterative2Args.Iterative2Args2.Iterative2Args2Impl(this, this.accessBuilder().inline().of(a1, (Iterable)a2), false);
    }

    default public <A1, A2, A3> Iterative2Args.Iterative2Args3<T1, T2, A1, A2, A3> inlineArgs(A1 a1, A2 a2, A3 a3) {
        return this.inlineArgsOf((Iterable<? extends A1>)this.wrap(a1), (Iterable<? extends A2>)this.wrap(a2), (Iterable<? extends A3>)this.wrap(a3));
    }

    default public <A1, A2, A3> Iterative2Args.Iterative2Args3<T1, T2, A1, A2, A3> inlineArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3) {
        return new Iterative2Args.Iterative2Args3.Iterative2Args3Impl(this, this.accessBuilder().inline().of(a1, a2, a3), false);
    }

    default public <A1, A2, A3, A4> Iterative2Args.Iterative2Args4<T1, T2, A1, A2, A3, A4> inlineArgs(A1 a1, A2 a2, A3 a3, A4 a4) {
        return this.inlineArgsOf((Iterable<? extends A1>)this.wrap(a1), (Iterable<? extends A2>)this.wrap(a2), (Iterable<? extends A3>)this.wrap(a3), (Iterable<? extends A4>)this.wrap(a4));
    }

    default public <A1, A2, A3, A4> Iterative2Args.Iterative2Args4<T1, T2, A1, A2, A3, A4> inlineArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4) {
        return new Iterative2Args.Iterative2Args4.Iterative2Args4Impl(this, this.accessBuilder().inline().of(a1, a2, a3, a4), false);
    }

    default public <A1, A2, A3, A4, A5> Iterative2Args.Iterative2Args5<T1, T2, A1, A2, A3, A4, A5> inlineArgs(A1 a1, A2 a2, A3 a3, A4 a4, A5 a5) {
        return this.inlineArgsOf((Iterable<? extends A1>)this.wrap(a1), (Iterable<? extends A2>)this.wrap(a2), (Iterable<? extends A3>)this.wrap(a3), (Iterable<? extends A4>)this.wrap(a4), (Iterable<? extends A5>)this.wrap(a5));
    }

    default public <A1, A2, A3, A4, A5> Iterative2Args.Iterative2Args5<T1, T2, A1, A2, A3, A4, A5> inlineArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5) {
        return new Iterative2Args.Iterative2Args5.Iterative2Args5Impl(this, this.accessBuilder().inline().of(a1, a2, a3, a4, a5), false);
    }

    default public <A1, A2, A3, A4, A5, A6> Iterative2Args.Iterative2Args6<T1, T2, A1, A2, A3, A4, A5, A6> inlineArgs(A1 a1, A2 a2, A3 a3, A4 a4, A5 a5, A6 a6) {
        return this.inlineArgsOf((Iterable<? extends A1>)this.wrap(a1), (Iterable<? extends A2>)this.wrap(a2), (Iterable<? extends A3>)this.wrap(a3), (Iterable<? extends A4>)this.wrap(a4), (Iterable<? extends A5>)this.wrap(a5), (Iterable<? extends A6>)this.wrap(a6));
    }

    default public <A1, A2, A3, A4, A5, A6> Iterative2Args.Iterative2Args6<T1, T2, A1, A2, A3, A4, A5, A6> inlineArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5, Iterable<? extends A6> a6) {
        return new Iterative2Args.Iterative2Args6.Iterative2Args6Impl(this, this.accessBuilder().inline().of(a1, a2, a3, a4, a5, a6), false);
    }

    default public Iterative1Args.Iterative1Args1<T1, T2> crossArgsRt() {
        return new Iterative1Args.Iterative1Args1.Iterative1Args1Impl<T1, T2>(this.splitLt(), this.splitRt(), true);
    }

    default public Iterative1Args.Iterative1Args1<T2, T1> crossArgsLt() {
        return new Iterative1Args.Iterative1Args1.Iterative1Args1Impl<T2, T1>(this.splitRt(), this.splitLt(), true);
    }

    default public Iterative1Args.Iterative1Args1<T1, T2> inlineArgsRt() {
        return new Iterative1Args.Iterative1Args1.Iterative1Args1Impl<T1, T2>(this.splitLt(), this.splitRt(), false);
    }

    default public Iterative1Args.Iterative1Args1<T2, T1> inlineArgsLt() {
        return new Iterative1Args.Iterative1Args1.Iterative1Args1Impl<T2, T1>(this.splitRt(), this.splitLt(), false);
    }

    default public IterativeSupplier.Iterative1Supplier1.TransformSupplier<T1, T2> iterativeSupplier() {
        return new IterativeSupplier.Iterative1Supplier1.Iterative1Supplier1Impl(this);
    }

    default public IterativeSupplier.Iterative1Supplier1.TransformSupplier<T1, T2> crossSupplierAllLt() {
        return new IterativeSupplier.Iterative1Supplier1.Iterative1Supplier1Impl<T1, T2>(this.forceCrossAll());
    }

    default public IterativeSupplier.Iterative1Supplier1.TransformSupplier<T1, T2> inlineSupplierAllLt() {
        return new IterativeSupplier.Iterative1Supplier1.Iterative1Supplier1Impl<T1, T2>(this.forceInlineAll());
    }

    default public IterativeSupplier.Iterative1Supplier1.TransformSupplier<T2, T1> crossSupplierAllRt() {
        return new IterativeSupplier.Iterative1Supplier1.Iterative1Supplier1Impl<T2, T1>(this.forceCrossAll().popBack().pushFrontCrossBy(this.iterableStream2()));
    }

    default public IterativeSupplier.Iterative1Supplier1.TransformSupplier<T2, T1> inlineSupplierAllRt() {
        return new IterativeSupplier.Iterative1Supplier1.Iterative1Supplier1Impl<T2, T1>(this.forceInlineAll().popBack().pushFrontInlineBy(this.iterableStream2()));
    }

    default public IterativeSupplier.Iterative1Supplier1.TransformSupplier<T1, T2> crossSupplierLt() {
        return new IterativeSupplier.Iterative1Supplier1.Iterative1Supplier1Impl<T1, T2>(this.forceCross2());
    }

    default public IterativeSupplier.Iterative1Supplier1.TransformSupplier<T1, T2> inlineSupplierLt() {
        return new IterativeSupplier.Iterative1Supplier1.Iterative1Supplier1Impl<T1, T2>(this.forceInline2());
    }

    default public IterativeSupplier.Iterative1Supplier1.TransformSupplier<T2, T1> crossSupplierRt() {
        return new IterativeSupplier.Iterative1Supplier1.Iterative1Supplier1Impl<T2, T1>(this.popBack().pushFrontCrossBy(this.iterableStream2()));
    }

    default public IterativeSupplier.Iterative1Supplier1.TransformSupplier<T2, T1> inlineSupplierRt() {
        return new IterativeSupplier.Iterative1Supplier1.Iterative1Supplier1Impl<T2, T1>(this.popBack().pushFrontInlineBy(this.iterableStream2()));
    }

    default public <A1> Iterative3<T1, T2, A1> crossJoinRt(Iterative1<? extends A1> iterative) {
        return this.createCross(this, iterative.iterableStream1());
    }

    default public <A1> Iterative3<A1, T1, T2> crossJoinLt(Iterative1<? extends A1> iterative) {
        return this.pushFrontCrossBy(iterative.iterableStream1());
    }

    default public <A1, A2> Iterative4<T1, T2, A1, A2> crossJoinRt(Iterative2<? extends A1, ? extends A2> iterative) {
        return this.create(this.crossJoinRt(iterative.splitLt()), iterative.iterableStream2(), iterative.isCross());
    }

    default public <A1, A2> Iterative4<A1, A2, T1, T2> crossJoinLt(Iterative2<? extends A1, ? extends A2> iterative) {
        return iterative.isCross() ? this.crossJoinLt(iterative.splitRt()).pushFrontCrossBy(iterative.iterableStream1()) : this.crossJoinLt(iterative.splitRt()).pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1, A2, A3> Iterative5<T1, T2, A1, A2, A3> crossJoinRt(Iterative3<? extends A1, ? extends A2, ? extends A3> iterative) {
        return this.create(this.crossJoinRt(iterative.splitLt2()), iterative.iterableStream3(), iterative.isCross());
    }

    default public <A1, A2, A3> Iterative5<A1, A2, A3, T1, T2> crossJoinLt(Iterative3<? extends A1, ? extends A2, ? extends A3> iterative) {
        return iterative.splitLt2().isCross() ? this.crossJoinLt(iterative.splitRt2()).pushFrontCrossBy(iterative.iterableStream1()) : this.crossJoinLt(iterative.splitRt2()).pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1, A2, A3, A4> Iterative6<T1, T2, A1, A2, A3, A4> crossJoinRt(Iterative4<? extends A1, ? extends A2, ? extends A3, ? extends A4> iterative) {
        return this.create(this.crossJoinRt(iterative.splitLt3()), iterative.iterableStream4(), iterative.isCross());
    }

    default public <A1, A2, A3, A4> Iterative6<A1, A2, A3, A4, T1, T2> crossJoinLt(Iterative4<? extends A1, ? extends A2, ? extends A3, ? extends A4> iterative) {
        return iterative.splitLt2().isCross() ? this.crossJoinLt(iterative.splitRt3()).pushFrontCrossBy(iterative.iterableStream1()) : this.crossJoinLt(iterative.splitRt3()).pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1, A2, A3, A4, A5> Iterative7<T1, T2, A1, A2, A3, A4, A5> crossJoinRt(Iterative5<? extends A1, ? extends A2, ? extends A3, ? extends A4, ? extends A5> iterative) {
        return this.create(this.crossJoinRt(iterative.splitLt4()), iterative.iterableStream5(), iterative.isCross());
    }

    default public <A1, A2, A3, A4, A5> Iterative7<A1, A2, A3, A4, A5, T1, T2> crossJoinLt(Iterative5<? extends A1, ? extends A2, ? extends A3, ? extends A4, ? extends A5> iterative) {
        return iterative.splitLt2().isCross() ? this.crossJoinLt(iterative.splitRt4()).pushFrontCrossBy(iterative.iterableStream1()) : this.crossJoinLt(iterative.splitRt4()).pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1, A2, A3, A4, A5, A6> Iterative8<T1, T2, A1, A2, A3, A4, A5, A6> crossJoinRt(Iterative6<? extends A1, ? extends A2, ? extends A3, ? extends A4, ? extends A5, ? extends A6> iterative) {
        return this.create(this.crossJoinRt(iterative.splitLt5()), iterative.iterableStream6(), iterative.isCross());
    }

    default public <A1, A2, A3, A4, A5, A6> Iterative8<A1, A2, A3, A4, A5, A6, T1, T2> crossJoinLt(Iterative6<? extends A1, ? extends A2, ? extends A3, ? extends A4, ? extends A5, ? extends A6> iterative) {
        return iterative.splitLt2().isCross() ? this.crossJoinLt(iterative.splitRt5()).pushFrontCrossBy(iterative.iterableStream1()) : this.crossJoinLt(iterative.splitRt5()).pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1> Iterative3<T1, T2, A1> inlineJoinRt(Iterative1<? extends A1> iterative) {
        return this.createInline(this, iterative.iterableStream1());
    }

    default public <A1> Iterative3<A1, T1, T2> inlineJoinLt(Iterative1<? extends A1> iterative) {
        return this.pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1, A2> Iterative4<T1, T2, A1, A2> inlineJoinRt(Iterative2<? extends A1, ? extends A2> iterative) {
        return this.create(this.inlineJoinRt(iterative.splitLt()), iterative.iterableStream2(), iterative.isCross());
    }

    default public <A1, A2> Iterative4<A1, A2, T1, T2> inlineJoinLt(Iterative2<? extends A1, ? extends A2> iterative) {
        return iterative.isCross() ? this.inlineJoinLt(iterative.splitRt()).pushFrontCrossBy(iterative.iterableStream1()) : this.inlineJoinLt(iterative.splitRt()).pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1, A2, A3> Iterative5<T1, T2, A1, A2, A3> inlineJoinRt(Iterative3<? extends A1, ? extends A2, ? extends A3> iterative) {
        return this.create(this.inlineJoinRt(iterative.splitLt2()), iterative.iterableStream3(), iterative.isCross());
    }

    default public <A1, A2, A3> Iterative5<A1, A2, A3, T1, T2> inlineJoinLt(Iterative3<? extends A1, ? extends A2, ? extends A3> iterative) {
        return iterative.splitLt2().isCross() ? this.inlineJoinLt(iterative.splitRt2()).pushFrontCrossBy(iterative.iterableStream1()) : this.inlineJoinLt(iterative.splitRt2()).pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1, A2, A3, A4> Iterative6<T1, T2, A1, A2, A3, A4> inlineJoinRt(Iterative4<? extends A1, ? extends A2, ? extends A3, ? extends A4> iterative) {
        return this.create(this.inlineJoinRt(iterative.splitLt3()), iterative.iterableStream4(), iterative.isCross());
    }

    default public <A1, A2, A3, A4> Iterative6<A1, A2, A3, A4, T1, T2> inlineJoinLt(Iterative4<? extends A1, ? extends A2, ? extends A3, ? extends A4> iterative) {
        return iterative.splitLt2().isCross() ? this.inlineJoinLt(iterative.splitRt3()).pushFrontCrossBy(iterative.iterableStream1()) : this.inlineJoinLt(iterative.splitRt3()).pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1, A2, A3, A4, A5> Iterative7<T1, T2, A1, A2, A3, A4, A5> inlineJoinRt(Iterative5<? extends A1, ? extends A2, ? extends A3, ? extends A4, ? extends A5> iterative) {
        return this.create(this.inlineJoinRt(iterative.splitLt4()), iterative.iterableStream5(), iterative.isCross());
    }

    default public <A1, A2, A3, A4, A5> Iterative7<A1, A2, A3, A4, A5, T1, T2> inlineJoinLt(Iterative5<? extends A1, ? extends A2, ? extends A3, ? extends A4, ? extends A5> iterative) {
        return iterative.splitLt2().isCross() ? this.inlineJoinLt(iterative.splitRt4()).pushFrontCrossBy(iterative.iterableStream1()) : this.inlineJoinLt(iterative.splitRt4()).pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1, A2, A3, A4, A5, A6> Iterative8<T1, T2, A1, A2, A3, A4, A5, A6> inlineJoinRt(Iterative6<? extends A1, ? extends A2, ? extends A3, ? extends A4, ? extends A5, ? extends A6> iterative) {
        return this.create(this.inlineJoinRt(iterative.splitLt5()), iterative.iterableStream6(), iterative.isCross());
    }

    default public <A1, A2, A3, A4, A5, A6> Iterative8<A1, A2, A3, A4, A5, A6, T1, T2> inlineJoinLt(Iterative6<? extends A1, ? extends A2, ? extends A3, ? extends A4, ? extends A5, ? extends A6> iterative) {
        return iterative.splitLt2().isCross() ? this.inlineJoinLt(iterative.splitRt5()).pushFrontCrossBy(iterative.iterableStream1()) : this.inlineJoinLt(iterative.splitRt5()).pushFrontInlineBy(iterative.iterableStream1());
    }

    public static abstract class Iterative2Abst<T1, T2> implements Iterative2<T1, T2> {

        protected final Iterative1<T1> iterative;
        protected final Iterable<Stream<T2>> right;

        Iterative2Abst(Iterative1<? extends T1> iterative, Iterable<? extends T2> right) {
            Objects.requireNonNull(iterative, "iterative is null");
            Objects.requireNonNull(right, "right is null");
            this.iterative = iterative;
            this.right = SimpleIterative.of(right).inlineMap(this::wrap).map(Stream::of).toIterable();
        }

        Iterative2Abst(Iterative1<? extends T1> iterative, Iterable<? extends Stream<? extends T2>> right, boolean ign) {
            Objects.requireNonNull(iterative, "iterative is null");
            Objects.requireNonNull(right, "right is null");
            this.iterative = iterative;
            this.right = SimpleIterative.of(right).map((Fn1 & Serializable)iter -> iter.flatMap(this::wrap));
        }

        @Override
        public Stream<Tuple2<T1, T2>> toStream() {
            return this.toTupleStream().map(Fn2.tuple(IterativeHandler::cross)).flatMap(IterativeInternals::entityIterable);
        }

        @Override
        public Iterator<Iterable<?>> iterators() {
            return Iterator.concat((Iterable)Stream.of(this.iterative.iterators()).append((Object)Iterator.of(SimpleIterative.of(this.right).inlineMap(IterativeInternals::entity).toIterable())));
        }

        @Override
        public Iterable<T1> iterable1() {
            return this.iterative.iterable1();
        }

        @Override
        public Iterable<T2> iterable2() {
            return SimpleIterative.of(this.right).inlineMap(IterativeInternals::entityIterable);
        }

        @Override
        public Iterable<Stream<T1>> iterableStream1() {
            return this.iterative.iterableStream1();
        }

        @Override
        public Iterable<Stream<T2>> iterableStream2() {
            return this.right;
        }

        @Override
        public Iterative1<T1> innerIterative() {
            return this.iterative;
        }

        @Override
        public Iterative1<T1> splitLt() {
            return this.innerIterative();
        }

        @Override
        public Iterative1<T2> splitRt() {
            return this.popFront();
        }

        @Override
        public Iterative2Cross<T1, T2> forceCross2() {
            return this.createCross(this.iterative, this.right);
        }

        @Override
        public Iterative2Cross<T1, T2> forceCrossAll() {
            return this.createCross(this.iterative, this.right);
        }

        @Override
        public Iterative2Inline<T1, T2> forceInline2() {
            return this.createInline(this.iterative, this.right);
        }

        @Override
        public Iterative2Inline<T1, T2> forceInlineAll() {
            return this.createInline(this.iterative, this.right);
        }

        @Override
        public <T3> Iterative3<T1, T2, T3> pushBackBy(Iterable<? extends Stream<? extends T3>> t3) {
            return this.create(this, t3);
        }

        @Override
        public <T3> Iterative3Cross<T1, T2, T3> pushBackCrossBy(Iterable<? extends Stream<? extends T3>> t3) {
            return this.createCross(this, t3);
        }

        @Override
        public <T3> Iterative3Inline<T1, T2, T3> pushBackInlineBy(Iterable<? extends Stream<? extends T3>> t3) {
            return this.createInline(this, t3);
        }

        @Override
        public <T0> Iterative3<T0, T1, T2> pushFrontBy(Iterable<? extends Stream<? extends T0>> t0) {
            return this.create(this.iterative.pushFrontBy(t0), this.right);
        }

        @Override
        public <T0> Iterative3<T0, T1, T2> pushFrontCrossBy(Iterable<? extends Stream<? extends T0>> t0) {
            return this.create(this.iterative.pushFrontCrossBy(t0), this.right);
        }

        @Override
        public <T0> Iterative3<T0, T1, T2> pushFrontInlineBy(Iterable<? extends Stream<? extends T0>> t0) {
            return this.create(this.iterative.pushFrontInlineBy(t0), this.right);
        }

        @Override
        public Iterative1<T1> popBack(Cs1<? super T2> c) {
            Objects.requireNonNull(c, "c is null");
            SimpleIterative.of(this.iterable2()).toIterable().forEach(c);
            return this.iterative;
        }

        @Override
        public Iterative1<T1> popBackChain(Cs1<? super T2> c) {
            Objects.requireNonNull(c, "c is null");
            this.toStream().forEach(Cs2.tuple(c.ignoring1Lt()));
            return this.splitLt();
        }

        @Override
        public Iterative1<T2> popFront(Cs1<? super T1> c) {
            Objects.requireNonNull(c, "c is null");
            SimpleIterative.of(this.iterable1()).toIterable().forEach(c);
            return this.create(this.iterableStream2());
        }

        @Override
        public Iterative2<T1, T2> nonNullable() {
            return this.isNullable() ? this.create(this.iterative, this.right) : this;
        }

        @Override
        public Iterative2<T1, T2> nullable() {
            return this.isNullable() ? this : this.create(this.iterative, this.right);
        }

        @Override
        public Iterative2<T1, T2> forceCleanEmpty1() {
            return this.create(this.iterative.forceCleanEmpty1(), this.right);
        }

        @Override
        public Iterative2<T1, T2> forceCleanEmpty2() {
            return this.create(this.iterative, IterativeHandler.clean(this.right));
        }

        @Override
        public Iterative2<T1, T2> forceCleanEmptyAll() {
            return this.create(this.iterative.forceCleanEmptyAll(), IterativeHandler.clean(this.right));
        }

        @Override
        public <R1, R2> Iterative2<R1, R2> map(Fn1<? super T1, ? extends R1> f1, Fn1<? super T2, ? extends R2> f2) {
            Objects.requireNonNull(f1, "f1 is null");
            Objects.requireNonNull(f2, "f2 is null");
            return this.create(this.iterative.map(f1), SimpleIterative.of(this.iterableStream2()).map((Fn1 & Serializable)iter -> iter.map((Function)((Object)f2)).flatMap(this::wrap)).toIterable());
        }

        @Override
        public <R1, R2> Iterative2<R1, R2> inlineMap(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2) {
            Objects.requireNonNull(f1, "f1 is null");
            Objects.requireNonNull(f2, "f2 is null");
            return this.create(this.iterative.inlineMap(f1), SimpleIterative.of(this.iterableStream2()).map((Fn1 & Serializable)iter -> iter.flatMap((Function)((Object)f2)).flatMap(this::wrap)).toIterable());
        }

        @Override
        public Iterative2<T1, T2> filter(Pr1<? super T1> p1, Pr1<? super T2> p2) {
            Objects.requireNonNull(p1, "p1 is null");
            Objects.requireNonNull(p2, "p2 is null");
            return this.create(this.iterative.filter(p1), SimpleIterative.of(this.iterableStream2()).map((Fn1 & Serializable)iter -> iter.filter((Predicate)p2).flatMap(this::wrap)).toIterable());
        }

        @Override
        public String toStringContent() {
            return Stream.of((Object[])new String[]{this.innerIterative().toStringContent(), IterativeHandler.typeIndicator(this.isCross()), IterativeHandler.iterableStreamToString(this.iterableStream2(), 2)}).mkString();
        }

        public String toString() {
            return IterativeHandler.iterativeHeader(2) + this.toStringContent();
        }

    }

}

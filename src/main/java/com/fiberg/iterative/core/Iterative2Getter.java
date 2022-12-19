package com.fiberg.iterative.core;

import com.fiberg.iterative.function.Fn0;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Sp;
import io.vavr.Tuple;
import io.vavr.Tuple2;

import java.util.Objects;

public interface Iterative2Getter<G1, G2> extends IterativeGetter {

    public Iterative2Fail<G1, G2, Tuple2<G1, G2>> onSuccess();

    public <R> Iterative2Fail<G1, G2, R> onSuccess(Fn1<? super Iterative2<? extends G1, ? extends G2>, ? extends R> f1);

    public <R> Iterative2Fail<G1, G2, R> onSuccess(Sp<? extends R> s1);

    public <R> Iterative2Fail<G1, G2, R> onSuccess(R r);

    public <R> Iterative2Success<G1, G2, R> onFailure(Fn1<? super Iterative2<? extends G1, ? extends G2>, ? extends R> f1);

    public <R> Iterative2Success<G1, G2, R> onFailure(Sp<? extends R> s1);

    public <R> Iterative2Success<G1, G2, R> onFailure(R r);

    public static interface Iterative2Success<G1, G2, R> {

        public R onSuccess(Fn1<? super Iterative2<? extends G1, ? extends G2>, ? extends R> f1);

        public R onSuccess(Sp<? extends R> s1);

        public R onSuccess(R r);

        public static class Iterative2SuccessImpl<G1, G2, R> extends Iterative2FinalGetter<G1, G2, R> implements Iterative2Success<G1, G2, R> {

            Iterative2SuccessImpl(Iterative2<? extends G1, ? extends G2> iterative, Sp<? extends R> s) {
                super(iterative, s);
            }

            @Override
            public R onSuccess(Fn1<? super Iterative2<? extends G1, ? extends G2>, ? extends R> f) {
                Objects.requireNonNull(f, "f is null");
                return (this.isSuccessful() ? f.apply(this.iterative) : this.s.get());
            }

            @Override
            public R onSuccess(Sp<? extends R> sp) {
                return this.onSuccess(sp.toFunction().ignoring1());
            }

            @Override
            public R onSuccess(R r) {
                return this.onSuccess(Fn1.value(r));
            }

        }

    }

    public static interface Iterative2Fail<G1, G2, R> {

        public R onFailure(Fn1<? super Iterative2<? extends G1, ? extends G2>, ? extends R> f1);

        public R onFailure(Sp<? extends R> s1);

        public R onFailure(R r);

        public R onFailureNull();

        public R onFailureThrow();

        public static class Iterative2FailImpl<G1, G2, R> extends Iterative2FinalGetter<G1, G2, R> implements Iterative2Fail<G1, G2, R> {

            Iterative2FailImpl(Iterative2<? extends G1, ? extends G2> iterative, Sp<? extends R> s) {
                super(iterative, s);
            }

            @Override
            public R onFailure(Fn1<? super Iterative2<? extends G1, ? extends G2>, ? extends R> f) {
                Objects.requireNonNull(f, "f is null");
                return (this.isSuccessful() ? this.s.get() : f.apply(this.iterative));
            }

            @Override
            public R onFailure(Sp<? extends R> sp) {
                return this.onFailure(sp.toFunction().ignoring1());
            }

            @Override
            public R onFailure(R r) {
                return this.onFailure(Fn1.value(r));
            }

            @Override
            public R onFailureNull() {
                return this.onFailure(Fn1.empty());
            }

            @Override
            public R onFailureThrow() {
                return this.onFailure(Fn0.<String, R>pass(IterativeGetter::throwableSupplier, "r").toSupplier());
            }

        }

    }

    public static abstract class Iterative2FinalGetter<G1, G2, R> {

        protected Iterative2<? extends G1, ? extends G2> iterative;
        protected Sp<? extends R> s;

        Iterative2FinalGetter(Iterative2<? extends G1, ? extends G2> iterative, Sp<? extends R> s) {
            this.iterative = iterative;
            this.s = s;
        }

        boolean isSuccessful() {
            return this.iterative.yieldOption(Tuple::of).isDefined();
        }

    }

    public static class Iterative2GetterImpl<G1, G2> implements Iterative2Getter<G1, G2> {

        protected Iterative2<? extends G1, ? extends G2> iterative;

        Iterative2GetterImpl(Iterative2<? extends G1, ? extends G2> iterative) {
            this.iterative = iterative;
        }

        @Override
        public Iterative2Fail<G1, G2, Tuple2<G1, G2>> onSuccess() {
            return new Iterative2Fail.Iterative2FailImpl<>(this.iterative, () -> this.iterative.<Tuple2<G1, G2>>yieldOption(Tuple::of).get());
        }

        @Override
        public <R> Iterative2Fail<G1, G2, R> onSuccess(Fn1<? super Iterative2<? extends G1, ? extends G2>, ? extends R> f) {
            Objects.requireNonNull(f, "f is null");
            return new Iterative2Fail.Iterative2FailImpl<>(this.iterative, f.toSupplier(this.iterative));
        }

        @Override
        public <R> Iterative2Fail<G1, G2, R> onSuccess(Sp<? extends R> s) {
            Objects.requireNonNull(s, "s is null");
            return new Iterative2Fail.Iterative2FailImpl<>(this.iterative, s);
        }

        @Override
        public <R> Iterative2Fail<G1, G2, R> onSuccess(R r) {
            return new Iterative2Fail.Iterative2FailImpl<>(this.iterative, () -> r);
        }

        @Override
        public <R> Iterative2Success<G1, G2, R> onFailure(Fn1<? super Iterative2<? extends G1, ? extends G2>, ? extends R> f) {
            Objects.requireNonNull(f, "f is null");
            return new Iterative2Success.Iterative2SuccessImpl<>(this.iterative, f.toSupplier(this.iterative));
        }

        @Override
        public <R> Iterative2Success<G1, G2, R> onFailure(Sp<? extends R> s) {
            Objects.requireNonNull(s, "s is null");
            return new Iterative2Success.Iterative2SuccessImpl<>(this.iterative, s);
        }

        @Override
        public <R> Iterative2Success<G1, G2, R> onFailure(R r) {
            return new Iterative2Success.Iterative2SuccessImpl<>(this.iterative, () -> r);
        }

    }

}

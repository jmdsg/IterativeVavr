package com.fiberg.iterative.core;

import com.fiberg.iterative.function.Fn0;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Sp;

import java.util.Objects;

public interface Iterative1Getter<G1> extends IterativeGetter {

    public Iterative1Fail<G1, G1> onSuccess();

    public <R> Iterative1Fail<G1, R> onSuccess(Fn1<? super Iterative1<? extends G1>, ? extends R> f1);

    public <R> Iterative1Fail<G1, R> onSuccess(Sp<? extends R> s1);

    public <R> Iterative1Fail<G1, R> onSuccess(R r);

    public <R> Iterative1Success<G1, R> onFailure(Fn1<? super Iterative1<? extends G1>, ? extends R> f1);

    public <R> Iterative1Success<G1, R> onFailure(Sp<? extends R> s1);

    public <R> Iterative1Success<G1, R> onFailure(R r);

    public static interface Iterative1Success<G1, R> {

        public R onSuccess(Fn1<? super Iterative1<? extends G1>, ? extends R> f1);

        public R onSuccess(Sp<? extends R> s1);

        public R onSuccess(R r);

        public static class Iterative1SuccessImpl<G1, R> extends Iterative1FinalGetter<G1, R> implements Iterative1Success<G1, R> {

            Iterative1SuccessImpl(Iterative1<? extends G1> iterative, Sp<? extends R> s) {
                super(iterative, s);
            }

            @Override
            public R onSuccess(Fn1<? super Iterative1<? extends G1>, ? extends R> f) {
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

    public static interface Iterative1Fail<G1, R> {

        public R onFailure(Fn1<? super Iterative1<? extends G1>, ? extends R> f1);

        public R onFailure(Sp<? extends R> s1);

        public R onFailure(R r);

        public R onFailureNull();

        public R onFailureThrow();

        public static class Iterative1FailImpl<G1, R> extends Iterative1FinalGetter<G1, R> implements Iterative1Fail<G1, R> {

            Iterative1FailImpl(Iterative1<? extends G1> iterative, Sp<? extends R> s) {
                super(iterative, s);
            }

            @Override
            public R onFailure(Fn1<? super Iterative1<? extends G1>, ? extends R> f) {
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

    public static abstract class Iterative1FinalGetter<G1, R> {

        protected Iterative1<? extends G1> iterative;
        protected Sp<? extends R> s;

        Iterative1FinalGetter(Iterative1<? extends G1> iterative, Sp<? extends R> s) {
            this.iterative = iterative;
            this.s = s;
        }

        boolean isSuccessful() {
            return this.iterative.yieldOption().isDefined();
        }

    }

    public static class Iterative1GetterImpl<G1> implements Iterative1Getter<G1> {

        protected Iterative1<? extends G1> iterative;

        Iterative1GetterImpl(Iterative1<? extends G1> iterative) {
            this.iterative = iterative;
        }

        @Override
        public Iterative1Fail<G1, G1> onSuccess() {
            return new Iterative1Fail.Iterative1FailImpl<>(this.iterative, () -> this.iterative.yieldOption().get());
        }

        @Override
        public <R> Iterative1Fail<G1, R> onSuccess(Fn1<? super Iterative1<? extends G1>, ? extends R> f) {
            Objects.requireNonNull(f, "f is null");
            return new Iterative1Fail.Iterative1FailImpl<>(this.iterative, f.toSupplier(this.iterative));
        }

        @Override
        public <R> Iterative1Fail<G1, R> onSuccess(Sp<? extends R> s) {
            Objects.requireNonNull(s, "s is null");
            return new Iterative1Fail.Iterative1FailImpl<>(this.iterative, s);
        }

        @Override
        public <R> Iterative1Fail<G1, R> onSuccess(R r) {
            return new Iterative1Fail.Iterative1FailImpl<>(this.iterative, () -> r);
        }

        @Override
        public <R> Iterative1Success<G1, R> onFailure(Fn1<? super Iterative1<? extends G1>, ? extends R> f) {
            Objects.requireNonNull(f, "f is null");
            return new Iterative1Success.Iterative1SuccessImpl<>(this.iterative, f.toSupplier(this.iterative));
        }

        @Override
        public <R> Iterative1Success<G1, R> onFailure(Sp<? extends R> s) {
            Objects.requireNonNull(s, "s is null");
            return new Iterative1Success.Iterative1SuccessImpl<>(this.iterative, s);
        }

        @Override
        public <R> Iterative1Success<G1, R> onFailure(R r) {
            return new Iterative1Success.Iterative1SuccessImpl<>(this.iterative, () -> r);
        }

    }

}

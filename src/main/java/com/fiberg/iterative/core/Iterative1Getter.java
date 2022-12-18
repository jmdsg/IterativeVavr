package com.fiberg.iterative.core;

import com.fiberg.iterative.core.Iterative1;
import com.fiberg.iterative.core.IterativeGetter;
import com.fiberg.iterative.function.Fn0;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Sp;
import java.io.Serializable;
import java.util.Objects;

public interface Iterative1Getter<G1> extends IterativeGetter {

    public Iterative1Fail<G1, G1> onSuccess();

    public <R> Iterative1Fail<G1, R> onSuccess(Fn1<? super Iterative1<? extends G1>, ? extends R> var1);

    public <R> Iterative1Fail<G1, R> onSuccess(Sp<? extends R> var1);

    public <R> Iterative1Fail<G1, R> onSuccess(R var1);

    public <R> Iterative1Success<G1, R> onFailure(Fn1<? super Iterative1<? extends G1>, ? extends R> var1);

    public <R> Iterative1Success<G1, R> onFailure(Sp<? extends R> var1);

    public <R> Iterative1Success<G1, R> onFailure(R var1);

    public static interface Iterative1Success<G1, R> {

        public R onSuccess(Fn1<? super Iterative1<? extends G1>, ? extends R> var1);

        public R onSuccess(Sp<? extends R> var1);

        public R onSuccess(R var1);

        public static class Iterative1SuccessImpl<G1, R> extends Iterative1FinalGetter<G1, R> implements Iterative1Success<G1, R> {

            Iterative1SuccessImpl(Iterative1<? extends G1> iterative, Sp<? extends R> s) {
                super(iterative, s);
            }

            @Override
            public R onSuccess(Fn1<? super Iterative1<? extends G1>, ? extends R> f) {
                Objects.requireNonNull(f, "f is null");
                return (R)(this.isSuccessful() ? f.apply(this.iterative) : this.s.get());
            }

            @Override
            public R onSuccess(Sp<? extends R> sp) {
                return (R)this.onSuccess((R)sp.toFunction().ignoring1());
            }

            @Override
            public R onSuccess(R r) {
                return (R)this.onSuccess((R)Fn1.value(r));
            }

        }

    }

    public static interface Iterative1Fail<G1, R> {

        public R onFailure(Fn1<? super Iterative1<? extends G1>, ? extends R> var1);

        public R onFailure(Sp<? extends R> var1);

        public R onFailure(R var1);

        public R onFailureNull();

        public R onFailureThrow();

        public static class Iterative1FailImpl<G1, R> extends Iterative1FinalGetter<G1, R> implements Iterative1Fail<G1, R> {

            Iterative1FailImpl(Iterative1<? extends G1> iterative, Sp<? extends R> s) {
                super(iterative, s);
            }

            @Override
            public R onFailure(Fn1<? super Iterative1<? extends G1>, ? extends R> f) {
                Objects.requireNonNull(f, "f is null");
                return (R)(this.isSuccessful() ? this.s.get() : f.apply(this.iterative));
            }

            @Override
            public R onFailure(Sp<? extends R> sp) {
                return (R)this.onFailure((R)sp.toFunction().ignoring1());
            }

            @Override
            public R onFailure(R r) {
                return (R)this.onFailure((R)Fn1.value(r));
            }

            @Override
            public R onFailureNull() {
                return (R)this.onFailure((R)Fn1.empty());
            }

            @Override
            public R onFailureThrow() {
                return (R)this.onFailure((R)Fn0.pass(IterativeGetter::throwableSupplier, "r").toSupplier());
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
            return new Iterative1Fail.Iterative1FailImpl(this.iterative, (Sp<Object> & Serializable)() -> this.iterative.yieldOption().get());
        }

        @Override
        public <R> Iterative1Fail<G1, R> onSuccess(Fn1<? super Iterative1<? extends G1>, ? extends R> f) {
            Objects.requireNonNull(f, "f is null");
            return new Iterative1Fail.Iterative1FailImpl<G1, R>(this.iterative, f.toSupplier(this.iterative));
        }

        @Override
        public <R> Iterative1Fail<G1, R> onSuccess(Sp<? extends R> s) {
            Objects.requireNonNull(s, "s is null");
            return new Iterative1Fail.Iterative1FailImpl<G1, R>(this.iterative, s);
        }

        @Override
        public <R> Iterative1Fail<G1, R> onSuccess(R r) {
            return new Iterative1Fail.Iterative1FailImpl(this.iterative, (Sp<Object> & Serializable)() -> r);
        }

        @Override
        public <R> Iterative1Success<G1, R> onFailure(Fn1<? super Iterative1<? extends G1>, ? extends R> f) {
            Objects.requireNonNull(f, "f is null");
            return new Iterative1Success.Iterative1SuccessImpl<G1, R>(this.iterative, f.toSupplier(this.iterative));
        }

        @Override
        public <R> Iterative1Success<G1, R> onFailure(Sp<? extends R> s) {
            Objects.requireNonNull(s, "s is null");
            return new Iterative1Success.Iterative1SuccessImpl<G1, R>(this.iterative, s);
        }

        @Override
        public <R> Iterative1Success<G1, R> onFailure(R r) {
            return new Iterative1Success.Iterative1SuccessImpl(this.iterative, (Sp<Object> & Serializable)() -> r);
        }

    }

}

package com.fiberg.iterative.core;

import com.fiberg.iterative.core.Iterative3;
import com.fiberg.iterative.core.IterativeGetter;
import com.fiberg.iterative.function.Fn0;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Sp;
import io.vavr.Tuple;
import io.vavr.Tuple3;
import java.io.Serializable;
import java.util.Objects;

public interface Iterative3Getter<G1, G2, G3> extends IterativeGetter {

    public Iterative3Fail<G1, G2, G3, Tuple3<G1, G2, G3>> onSuccess();

    public <R> Iterative3Fail<G1, G2, G3, R> onSuccess(Fn1<? super Iterative3<? extends G1, ? extends G2, ? extends G3>, ? extends R> var1);

    public <R> Iterative3Fail<G1, G2, G3, R> onSuccess(Sp<? extends R> var1);

    public <R> Iterative3Fail<G1, G2, G3, R> onSuccess(R var1);

    public <R> Iterative3Success<G1, G2, G3, R> onFailure(Fn1<? super Iterative3<? extends G1, ? extends G2, ? extends G3>, ? extends R> var1);

    public <R> Iterative3Success<G1, G2, G3, R> onFailure(Sp<? extends R> var1);

    public <R> Iterative3Success<G1, G2, G3, R> onFailure(R var1);

    public static interface Iterative3Success<G1, G2, G3, R> {

        public R onSuccess(Fn1<? super Iterative3<? extends G1, ? extends G2, ? extends G3>, ? extends R> var1);

        public R onSuccess(Sp<? extends R> var1);

        public R onSuccess(R var1);

        public static class Iterative3SuccessImpl<G1, G2, G3, R> extends Iterative3FinalGetter<G1, G2, G3, R> implements Iterative3Success<G1, G2, G3, R> {

            Iterative3SuccessImpl(Iterative3<? extends G1, ? extends G2, ? extends G3> iterative, Sp<? extends R> s) {
                super(iterative, s);
            }

            @Override
            public R onSuccess(Fn1<? super Iterative3<? extends G1, ? extends G2, ? extends G3>, ? extends R> f) {
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

    public static interface Iterative3Fail<G1, G2, G3, R> {

        public R onFailure(Fn1<? super Iterative3<? extends G1, ? extends G2, ? extends G3>, ? extends R> var1);

        public R onFailure(Sp<? extends R> var1);

        public R onFailure(R var1);

        public R onFailureNull();

        public R onFailureThrow();

        public static class Iterative3FailImpl<G1, G2, G3, R> extends Iterative3FinalGetter<G1, G2, G3, R> implements Iterative3Fail<G1, G2, G3, R> {

            Iterative3FailImpl(Iterative3<? extends G1, ? extends G2, ? extends G3> iterative, Sp<? extends R> s) {
                super(iterative, s);
            }

            @Override
            public R onFailure(Fn1<? super Iterative3<? extends G1, ? extends G2, ? extends G3>, ? extends R> f) {
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

    public static abstract class Iterative3FinalGetter<G1, G2, G3, R> {

        protected Iterative3<? extends G1, ? extends G2, ? extends G3> iterative;
        protected Sp<? extends R> s;

        Iterative3FinalGetter(Iterative3<? extends G1, ? extends G2, ? extends G3> iterative, Sp<? extends R> s) {
            this.iterative = iterative;
            this.s = s;
        }

        boolean isSuccessful() {
            return this.iterative.yieldOption(Tuple::of).isDefined();
        }

    }

    public static class Iterative3GetterImpl<G1, G2, G3> implements Iterative3Getter<G1, G2, G3> {

        protected Iterative3<? extends G1, ? extends G2, ? extends G3> iterative;

        Iterative3GetterImpl(Iterative3<? extends G1, ? extends G2, ? extends G3> iterative) {
            this.iterative = iterative;
        }

        @Override
        public Iterative3Fail<G1, G2, G3, Tuple3<G1, G2, G3>> onSuccess() {
            return new Iterative3Fail.Iterative3FailImpl<>(this.iterative, () -> this.iterative.<Tuple3<G1, G2, G3>>yieldOption(Tuple::of).get());
        }

        @Override
        public <R> Iterative3Fail<G1, G2, G3, R> onSuccess(Fn1<? super Iterative3<? extends G1, ? extends G2, ? extends G3>, ? extends R> f) {
            Objects.requireNonNull(f, "f is null");
            return new Iterative3Fail.Iterative3FailImpl<>(this.iterative, f.toSupplier(this.iterative));
        }

        @Override
        public <R> Iterative3Fail<G1, G2, G3, R> onSuccess(Sp<? extends R> s) {
            Objects.requireNonNull(s, "s is null");
            return new Iterative3Fail.Iterative3FailImpl<>(this.iterative, s);
        }

        @Override
        public <R> Iterative3Fail<G1, G2, G3, R> onSuccess(R r) {
            return new Iterative3Fail.Iterative3FailImpl<>(this.iterative, () -> r);
        }

        @Override
        public <R> Iterative3Success<G1, G2, G3, R> onFailure(Fn1<? super Iterative3<? extends G1, ? extends G2, ? extends G3>, ? extends R> f) {
            Objects.requireNonNull(f, "f is null");
            return new Iterative3Success.Iterative3SuccessImpl<>(this.iterative, f.toSupplier(this.iterative));
        }

        @Override
        public <R> Iterative3Success<G1, G2, G3, R> onFailure(Sp<? extends R> s) {
            Objects.requireNonNull(s, "s is null");
            return new Iterative3Success.Iterative3SuccessImpl<>(this.iterative, s);
        }

        @Override
        public <R> Iterative3Success<G1, G2, G3, R> onFailure(R r) {
            return new Iterative3Success.Iterative3SuccessImpl<>(this.iterative, () -> r);
        }

    }

}

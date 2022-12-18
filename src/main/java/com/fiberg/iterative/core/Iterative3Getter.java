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
                return (R) (this.isSuccessful() ? f.apply(this.iterative) : this.s.get());
            }

            @Override
            public R onSuccess(Sp<? extends R> sp) {
                return (R) this.onSuccess((R) sp.toFunction().ignoring1());
            }

            @Override
            public R onSuccess(R r) {
                return (R) this.onSuccess((R) Fn1.value(r));
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
                return (R) (this.isSuccessful() ? this.s.get() : f.apply(this.iterative));
            }

            @Override
            public R onFailure(Sp<? extends R> sp) {
                return (R) this.onFailure((R) sp.toFunction().ignoring1());
            }

            @Override
            public R onFailure(R r) {
                return (R) this.onFailure((R) Fn1.value(r));
            }

            @Override
            public R onFailureNull() {
                return (R) this.onFailure((R) Fn1.empty());
            }

            @Override
            public R onFailureThrow() {
                return (R) this.onFailure((R) Fn0.pass(IterativeGetter::throwableSupplier, "r").toSupplier());
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
            return new Iterative3Fail.Iterative3FailImpl(this.iterative, (Sp<Tuple3> & Serializable) () -> (Tuple3) this.iterative.yieldOption(Tuple::of).get());
        }

        @Override
        public <R> Iterative3Fail<G1, G2, G3, R> onSuccess(Fn1<? super Iterative3<? extends G1, ? extends G2, ? extends G3>, ? extends R> f) {
            Objects.requireNonNull(f, "f is null");
            return new Iterative3Fail.Iterative3FailImpl<G1, G2, G3, R>(this.iterative, f.toSupplier(this.iterative));
        }

        @Override
        public <R> Iterative3Fail<G1, G2, G3, R> onSuccess(Sp<? extends R> s) {
            Objects.requireNonNull(s, "s is null");
            return new Iterative3Fail.Iterative3FailImpl<G1, G2, G3, R>(this.iterative, s);
        }

        @Override
        public <R> Iterative3Fail<G1, G2, G3, R> onSuccess(R r) {
            return new Iterative3Fail.Iterative3FailImpl(this.iterative, (Sp<Object> & Serializable) () -> r);
        }

        @Override
        public <R> Iterative3Success<G1, G2, G3, R> onFailure(Fn1<? super Iterative3<? extends G1, ? extends G2, ? extends G3>, ? extends R> f) {
            Objects.requireNonNull(f, "f is null");
            return new Iterative3Success.Iterative3SuccessImpl<G1, G2, G3, R>(this.iterative, f.toSupplier(this.iterative));
        }

        @Override
        public <R> Iterative3Success<G1, G2, G3, R> onFailure(Sp<? extends R> s) {
            Objects.requireNonNull(s, "s is null");
            return new Iterative3Success.Iterative3SuccessImpl<G1, G2, G3, R>(this.iterative, s);
        }

        @Override
        public <R> Iterative3Success<G1, G2, G3, R> onFailure(R r) {
            return new Iterative3Success.Iterative3SuccessImpl(this.iterative, (Sp<Object> & Serializable) () -> r);
        }

    }

}

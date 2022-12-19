package com.fiberg.iterative.core;

import com.fiberg.iterative.core.Iterative5;
import com.fiberg.iterative.core.IterativeGetter;
import com.fiberg.iterative.function.Fn0;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Sp;
import io.vavr.Tuple;
import io.vavr.Tuple3;
import io.vavr.Tuple5;
import java.io.Serializable;
import java.util.Objects;

public interface Iterative5Getter<G1, G2, G3, G4, G5> extends IterativeGetter {

    public Iterative5Fail<G1, G2, G3, G4, G5, Tuple5<G1, G2, G3, G4, G5>> onSuccess();

    public <R> Iterative5Fail<G1, G2, G3, G4, G5, R> onSuccess(Fn1<? super Iterative5<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5>, ? extends R> var1);

    public <R> Iterative5Fail<G1, G2, G3, G4, G5, R> onSuccess(Sp<? extends R> var1);

    public <R> Iterative5Fail<G1, G2, G3, G4, G5, R> onSuccess(R var1);

    public <R> Iterative5Success<G1, G2, G3, G4, G5, R> onFailure(Fn1<? super Iterative5<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5>, ? extends R> var1);

    public <R> Iterative5Success<G1, G2, G3, G4, G5, R> onFailure(Sp<? extends R> var1);

    public <R> Iterative5Success<G1, G2, G3, G4, G5, R> onFailure(R var1);

    public static interface Iterative5Success<G1, G2, G3, G4, G5, R> {

        public R onSuccess(Fn1<? super Iterative5<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5>, ? extends R> var1);

        public R onSuccess(Sp<? extends R> var1);

        public R onSuccess(R var1);

        public static class Iterative5SuccessImpl<G1, G2, G3, G4, G5, R> extends Iterative5FinalGetter<G1, G2, G3, G4, G5, R> implements Iterative5Success<G1, G2, G3, G4, G5, R> {

            Iterative5SuccessImpl(Iterative5<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5> iterative, Sp<? extends R> s) {
                super(iterative, s);
            }

            @Override
            public R onSuccess(Fn1<? super Iterative5<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5>, ? extends R> f) {
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

    public static interface Iterative5Fail<G1, G2, G3, G4, G5, R> {

        public R onFailure(Fn1<? super Iterative5<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5>, ? extends R> var1);

        public R onFailure(Sp<? extends R> var1);

        public R onFailure(R var1);

        public R onFailureNull();

        public R onFailureThrow();

        public static class Iterative5FailImpl<G1, G2, G3, G4, G5, R> extends Iterative5FinalGetter<G1, G2, G3, G4, G5, R> implements Iterative5Fail<G1, G2, G3, G4, G5, R> {

            Iterative5FailImpl(Iterative5<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5> iterative, Sp<? extends R> s) {
                super(iterative, s);
            }

            @Override
            public R onFailure(Fn1<? super Iterative5<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5>, ? extends R> f) {
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

    public static abstract class Iterative5FinalGetter<G1, G2, G3, G4, G5, R> {

        protected Iterative5<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5> iterative;
        protected Sp<? extends R> s;

        Iterative5FinalGetter(Iterative5<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5> iterative, Sp<? extends R> s) {
            this.iterative = iterative;
            this.s = s;
        }

        boolean isSuccessful() {
            return this.iterative.yieldOption(Tuple::of).isDefined();
        }

    }

    public static class Iterative5GetterImpl<G1, G2, G3, G4, G5> implements Iterative5Getter<G1, G2, G3, G4, G5> {

        protected Iterative5<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5> iterative;

        Iterative5GetterImpl(Iterative5<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5> iterative) {
            this.iterative = iterative;
        }

        @Override
        public Iterative5Fail<G1, G2, G3, G4, G5, Tuple5<G1, G2, G3, G4, G5>> onSuccess() {
            return new Iterative5Fail.Iterative5FailImpl<>(this.iterative, () -> this.iterative.<Tuple5<G1, G2, G3, G4, G5>>yieldOption(Tuple::of).get());
        }

        @Override
        public <R> Iterative5Fail<G1, G2, G3, G4, G5, R> onSuccess(Fn1<? super Iterative5<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5>, ? extends R> f) {
            Objects.requireNonNull(f, "f is null");
            return new Iterative5Fail.Iterative5FailImpl<>(this.iterative, f.toSupplier(this.iterative));
        }

        @Override
        public <R> Iterative5Fail<G1, G2, G3, G4, G5, R> onSuccess(Sp<? extends R> s) {
            Objects.requireNonNull(s, "s is null");
            return new Iterative5Fail.Iterative5FailImpl<>(this.iterative, s);
        }

        @Override
        public <R> Iterative5Fail<G1, G2, G3, G4, G5, R> onSuccess(R r) {
            return new Iterative5Fail.Iterative5FailImpl<>(this.iterative, () -> r);
        }

        @Override
        public <R> Iterative5Success<G1, G2, G3, G4, G5, R> onFailure(Fn1<? super Iterative5<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5>, ? extends R> f) {
            Objects.requireNonNull(f, "f is null");
            return new Iterative5Success.Iterative5SuccessImpl<>(this.iterative, f.toSupplier(this.iterative));
        }

        @Override
        public <R> Iterative5Success<G1, G2, G3, G4, G5, R> onFailure(Sp<? extends R> s) {
            Objects.requireNonNull(s, "s is null");
            return new Iterative5Success.Iterative5SuccessImpl<>(this.iterative, s);
        }

        @Override
        public <R> Iterative5Success<G1, G2, G3, G4, G5, R> onFailure(R r) {
            return new Iterative5Success.Iterative5SuccessImpl<>(this.iterative, () -> r);
        }

    }

}

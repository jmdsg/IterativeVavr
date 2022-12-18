package com.fiberg.iterative.core;

import com.fiberg.iterative.core.Iterative8;
import com.fiberg.iterative.core.IterativeGetter;
import com.fiberg.iterative.function.Fn0;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Sp;
import io.vavr.Tuple;
import io.vavr.Tuple8;
import java.io.Serializable;
import java.util.Objects;

public interface Iterative8Getter<G1, G2, G3, G4, G5, G6, G7, G8> extends IterativeGetter {

    public Iterative8Fail<G1, G2, G3, G4, G5, G6, G7, G8, Tuple8<G1, G2, G3, G4, G5, G6, G7, G8>> onSuccess();

    public <R> Iterative8Fail<G1, G2, G3, G4, G5, G6, G7, G8, R> onSuccess(Fn1<? super Iterative8<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6, ? extends G7, ? extends G8>, ? extends R> var1);

    public <R> Iterative8Fail<G1, G2, G3, G4, G5, G6, G7, G8, R> onSuccess(Sp<? extends R> var1);

    public <R> Iterative8Fail<G1, G2, G3, G4, G5, G6, G7, G8, R> onSuccess(R var1);

    public <R> Iterative8Success<G1, G2, G3, G4, G5, G6, G7, G8, R> onFailure(Fn1<? super Iterative8<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6, ? extends G7, ? extends G8>, ? extends R> var1);

    public <R> Iterative8Success<G1, G2, G3, G4, G5, G6, G7, G8, R> onFailure(Sp<? extends R> var1);

    public <R> Iterative8Success<G1, G2, G3, G4, G5, G6, G7, G8, R> onFailure(R var1);

    public static interface Iterative8Success<G1, G2, G3, G4, G5, G6, G7, G8, R> {

        public R onSuccess(Fn1<? super Iterative8<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6, ? extends G7, ? extends G8>, ? extends R> var1);

        public R onSuccess(Sp<? extends R> var1);

        public R onSuccess(R var1);

        public static class Iterative8SuccessImpl<G1, G2, G3, G4, G5, G6, G7, G8, R> extends Iterative8FinalGetter<G1, G2, G3, G4, G5, G6, G7, G8, R> implements Iterative8Success<G1, G2, G3, G4, G5, G6, G7, G8, R> {

            Iterative8SuccessImpl(Iterative8<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6, ? extends G7, ? extends G8> iterative, Sp<? extends R> s) {
                super(iterative, s);
            }

            @Override
            public R onSuccess(Fn1<? super Iterative8<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6, ? extends G7, ? extends G8>, ? extends R> f) {
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

    public static interface Iterative8Fail<G1, G2, G3, G4, G5, G6, G7, G8, R> {

        public R onFailure(Fn1<? super Iterative8<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6, ? extends G7, ? extends G8>, ? extends R> var1);

        public R onFailure(Sp<? extends R> var1);

        public R onFailure(R var1);

        public R onFailureNull();

        public R onFailureThrow();

        public static class Iterative8FailImpl<G1, G2, G3, G4, G5, G6, G7, G8, R> extends Iterative8FinalGetter<G1, G2, G3, G4, G5, G6, G7, G8, R> implements Iterative8Fail<G1, G2, G3, G4, G5, G6, G7, G8, R> {

            Iterative8FailImpl(Iterative8<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6, ? extends G7, ? extends G8> iterative, Sp<? extends R> s) {
                super(iterative, s);
            }

            @Override
            public R onFailure(Fn1<? super Iterative8<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6, ? extends G7, ? extends G8>, ? extends R> f) {
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

    public static abstract class Iterative8FinalGetter<G1, G2, G3, G4, G5, G6, G7, G8, R> {

        protected Iterative8<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6, ? extends G7, ? extends G8> iterative;
        protected Sp<? extends R> s;

        Iterative8FinalGetter(Iterative8<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6, ? extends G7, ? extends G8> iterative, Sp<? extends R> s) {
            this.iterative = iterative;
            this.s = s;
        }

        boolean isSuccessful() {
            return this.iterative.yieldOption(Tuple::of).isDefined();
        }

    }

    public static class Iterative8GetterImpl<G1, G2, G3, G4, G5, G6, G7, G8> implements Iterative8Getter<G1, G2, G3, G4, G5, G6, G7, G8> {

        protected Iterative8<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6, ? extends G7, ? extends G8> iterative;

        Iterative8GetterImpl(Iterative8<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6, ? extends G7, ? extends G8> iterative) {
            this.iterative = iterative;
        }

        @Override
        public Iterative8Fail<G1, G2, G3, G4, G5, G6, G7, G8, Tuple8<G1, G2, G3, G4, G5, G6, G7, G8>> onSuccess() {
            return new Iterative8Fail.Iterative8FailImpl(this.iterative, (Sp<Tuple8> & Serializable) () -> (Tuple8) this.iterative.yieldOption(Tuple::of).get());
        }

        @Override
        public <R> Iterative8Fail<G1, G2, G3, G4, G5, G6, G7, G8, R> onSuccess(Fn1<? super Iterative8<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6, ? extends G7, ? extends G8>, ? extends R> f) {
            Objects.requireNonNull(f, "f is null");
            return new Iterative8Fail.Iterative8FailImpl<G1, G2, G3, G4, G5, G6, G7, G8, R>(this.iterative, f.toSupplier(this.iterative));
        }

        @Override
        public <R> Iterative8Fail<G1, G2, G3, G4, G5, G6, G7, G8, R> onSuccess(Sp<? extends R> s) {
            Objects.requireNonNull(s, "s is null");
            return new Iterative8Fail.Iterative8FailImpl<G1, G2, G3, G4, G5, G6, G7, G8, R>(this.iterative, s);
        }

        @Override
        public <R> Iterative8Fail<G1, G2, G3, G4, G5, G6, G7, G8, R> onSuccess(R r) {
            return new Iterative8Fail.Iterative8FailImpl(this.iterative, (Sp<Object> & Serializable) () -> r);
        }

        @Override
        public <R> Iterative8Success<G1, G2, G3, G4, G5, G6, G7, G8, R> onFailure(Fn1<? super Iterative8<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6, ? extends G7, ? extends G8>, ? extends R> f) {
            Objects.requireNonNull(f, "f is null");
            return new Iterative8Success.Iterative8SuccessImpl<G1, G2, G3, G4, G5, G6, G7, G8, R>(this.iterative, f.toSupplier(this.iterative));
        }

        @Override
        public <R> Iterative8Success<G1, G2, G3, G4, G5, G6, G7, G8, R> onFailure(Sp<? extends R> s) {
            Objects.requireNonNull(s, "s is null");
            return new Iterative8Success.Iterative8SuccessImpl<G1, G2, G3, G4, G5, G6, G7, G8, R>(this.iterative, s);
        }

        @Override
        public <R> Iterative8Success<G1, G2, G3, G4, G5, G6, G7, G8, R> onFailure(R r) {
            return new Iterative8Success.Iterative8SuccessImpl(this.iterative, (Sp<Object> & Serializable) () -> r);
        }

    }

}

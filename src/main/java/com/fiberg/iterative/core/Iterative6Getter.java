package com.fiberg.iterative.core;

import com.fiberg.iterative.core.Iterative6;
import com.fiberg.iterative.core.IterativeGetter;
import com.fiberg.iterative.function.Fn0;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Sp;
import io.vavr.Tuple;
import io.vavr.Tuple6;
import java.io.Serializable;
import java.util.Objects;

public interface Iterative6Getter<G1, G2, G3, G4, G5, G6> extends IterativeGetter {

    public Iterative6Fail<G1, G2, G3, G4, G5, G6, Tuple6<G1, G2, G3, G4, G5, G6>> onSuccess();

    public <R> Iterative6Fail<G1, G2, G3, G4, G5, G6, R> onSuccess(Fn1<? super Iterative6<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6>, ? extends R> var1);

    public <R> Iterative6Fail<G1, G2, G3, G4, G5, G6, R> onSuccess(Sp<? extends R> var1);

    public <R> Iterative6Fail<G1, G2, G3, G4, G5, G6, R> onSuccess(R var1);

    public <R> Iterative6Success<G1, G2, G3, G4, G5, G6, R> onFailure(Fn1<? super Iterative6<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6>, ? extends R> var1);

    public <R> Iterative6Success<G1, G2, G3, G4, G5, G6, R> onFailure(Sp<? extends R> var1);

    public <R> Iterative6Success<G1, G2, G3, G4, G5, G6, R> onFailure(R var1);

    public static interface Iterative6Success<G1, G2, G3, G4, G5, G6, R> {

        public R onSuccess(Fn1<? super Iterative6<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6>, ? extends R> var1);

        public R onSuccess(Sp<? extends R> var1);

        public R onSuccess(R var1);

        public static class Iterative6SuccessImpl<G1, G2, G3, G4, G5, G6, R> extends Iterative6FinalGetter<G1, G2, G3, G4, G5, G6, R> implements Iterative6Success<G1, G2, G3, G4, G5, G6, R> {

            Iterative6SuccessImpl(Iterative6<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6> iterative, Sp<? extends R> s) {
                super(iterative, s);
            }

            @Override
            public R onSuccess(Fn1<? super Iterative6<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6>, ? extends R> f) {
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

    public static interface Iterative6Fail<G1, G2, G3, G4, G5, G6, R> {

        public R onFailure(Fn1<? super Iterative6<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6>, ? extends R> var1);

        public R onFailure(Sp<? extends R> var1);

        public R onFailure(R var1);

        public R onFailureNull();

        public R onFailureThrow();

        public static class Iterative6FailImpl<G1, G2, G3, G4, G5, G6, R> extends Iterative6FinalGetter<G1, G2, G3, G4, G5, G6, R> implements Iterative6Fail<G1, G2, G3, G4, G5, G6, R> {

            Iterative6FailImpl(Iterative6<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6> iterative, Sp<? extends R> s) {
                super(iterative, s);
            }

            @Override
            public R onFailure(Fn1<? super Iterative6<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6>, ? extends R> f) {
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

    public static abstract class Iterative6FinalGetter<G1, G2, G3, G4, G5, G6, R> {

        protected Iterative6<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6> iterative;
        protected Sp<? extends R> s;

        Iterative6FinalGetter(Iterative6<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6> iterative, Sp<? extends R> s) {
            this.iterative = iterative;
            this.s = s;
        }

        boolean isSuccessful() {
            return this.iterative.yieldOption(Tuple::of).isDefined();
        }

    }

    public static class Iterative6GetterImpl<G1, G2, G3, G4, G5, G6> implements Iterative6Getter<G1, G2, G3, G4, G5, G6> {

        protected Iterative6<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6> iterative;

        Iterative6GetterImpl(Iterative6<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6> iterative) {
            this.iterative = iterative;
        }

        @Override
        public Iterative6Fail<G1, G2, G3, G4, G5, G6, Tuple6<G1, G2, G3, G4, G5, G6>> onSuccess() {
            return new Iterative6Fail.Iterative6FailImpl(this.iterative, (Sp<Tuple6> & Serializable)() -> (Tuple6)this.iterative.yieldOption(Tuple::of).get());
        }

        @Override
        public <R> Iterative6Fail<G1, G2, G3, G4, G5, G6, R> onSuccess(Fn1<? super Iterative6<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6>, ? extends R> f) {
            Objects.requireNonNull(f, "f is null");
            return new Iterative6Fail.Iterative6FailImpl<G1, G2, G3, G4, G5, G6, R>(this.iterative, f.toSupplier(this.iterative));
        }

        @Override
        public <R> Iterative6Fail<G1, G2, G3, G4, G5, G6, R> onSuccess(Sp<? extends R> s) {
            Objects.requireNonNull(s, "s is null");
            return new Iterative6Fail.Iterative6FailImpl<G1, G2, G3, G4, G5, G6, R>(this.iterative, s);
        }

        @Override
        public <R> Iterative6Fail<G1, G2, G3, G4, G5, G6, R> onSuccess(R r) {
            return new Iterative6Fail.Iterative6FailImpl(this.iterative, (Sp<Object> & Serializable)() -> r);
        }

        @Override
        public <R> Iterative6Success<G1, G2, G3, G4, G5, G6, R> onFailure(Fn1<? super Iterative6<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6>, ? extends R> f) {
            Objects.requireNonNull(f, "f is null");
            return new Iterative6Success.Iterative6SuccessImpl<G1, G2, G3, G4, G5, G6, R>(this.iterative, f.toSupplier(this.iterative));
        }

        @Override
        public <R> Iterative6Success<G1, G2, G3, G4, G5, G6, R> onFailure(Sp<? extends R> s) {
            Objects.requireNonNull(s, "s is null");
            return new Iterative6Success.Iterative6SuccessImpl<G1, G2, G3, G4, G5, G6, R>(this.iterative, s);
        }

        @Override
        public <R> Iterative6Success<G1, G2, G3, G4, G5, G6, R> onFailure(R r) {
            return new Iterative6Success.Iterative6SuccessImpl(this.iterative, (Sp<Object> & Serializable)() -> r);
        }

    }

}

package com.fiberg.iterative.core;

import com.fiberg.iterative.core.Iterative7;
import com.fiberg.iterative.core.IterativeGetter;
import com.fiberg.iterative.function.Fn0;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Sp;
import io.vavr.Tuple;
import io.vavr.Tuple7;
import java.io.Serializable;
import java.util.Objects;

public interface Iterative7Getter<G1, G2, G3, G4, G5, G6, G7> extends IterativeGetter {

    public Iterative7Fail<G1, G2, G3, G4, G5, G6, G7, Tuple7<G1, G2, G3, G4, G5, G6, G7>> onSuccess();

    public <R> Iterative7Fail<G1, G2, G3, G4, G5, G6, G7, R> onSuccess(Fn1<? super Iterative7<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6, ? extends G7>, ? extends R> var1);

    public <R> Iterative7Fail<G1, G2, G3, G4, G5, G6, G7, R> onSuccess(Sp<? extends R> var1);

    public <R> Iterative7Fail<G1, G2, G3, G4, G5, G6, G7, R> onSuccess(R var1);

    public <R> Iterative7Success<G1, G2, G3, G4, G5, G6, G7, R> onFailure(Fn1<? super Iterative7<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6, ? extends G7>, ? extends R> var1);

    public <R> Iterative7Success<G1, G2, G3, G4, G5, G6, G7, R> onFailure(Sp<? extends R> var1);

    public <R> Iterative7Success<G1, G2, G3, G4, G5, G6, G7, R> onFailure(R var1);

    public static interface Iterative7Success<G1, G2, G3, G4, G5, G6, G7, R> {

        public R onSuccess(Fn1<? super Iterative7<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6, ? extends G7>, ? extends R> var1);

        public R onSuccess(Sp<? extends R> var1);

        public R onSuccess(R var1);

        public static class Iterative7SuccessImpl<G1, G2, G3, G4, G5, G6, G7, R> extends Iterative7FinalGetter<G1, G2, G3, G4, G5, G6, G7, R> implements Iterative7Success<G1, G2, G3, G4, G5, G6, G7, R> {

            Iterative7SuccessImpl(Iterative7<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6, ? extends G7> iterative, Sp<? extends R> s) {
                super(iterative, s);
            }

            @Override
            public R onSuccess(Fn1<? super Iterative7<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6, ? extends G7>, ? extends R> f) {
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

    public static interface Iterative7Fail<G1, G2, G3, G4, G5, G6, G7, R> {

        public R onFailure(Fn1<? super Iterative7<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6, ? extends G7>, ? extends R> var1);

        public R onFailure(Sp<? extends R> var1);

        public R onFailure(R var1);

        public R onFailureNull();

        public R onFailureThrow();

        public static class Iterative7FailImpl<G1, G2, G3, G4, G5, G6, G7, R> extends Iterative7FinalGetter<G1, G2, G3, G4, G5, G6, G7, R> implements Iterative7Fail<G1, G2, G3, G4, G5, G6, G7, R> {

            Iterative7FailImpl(Iterative7<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6, ? extends G7> iterative, Sp<? extends R> s) {
                super(iterative, s);
            }

            @Override
            public R onFailure(Fn1<? super Iterative7<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6, ? extends G7>, ? extends R> f) {
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

    public static abstract class Iterative7FinalGetter<G1, G2, G3, G4, G5, G6, G7, R> {

        protected Iterative7<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6, ? extends G7> iterative;
        protected Sp<? extends R> s;

        Iterative7FinalGetter(Iterative7<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6, ? extends G7> iterative, Sp<? extends R> s) {
            this.iterative = iterative;
            this.s = s;
        }

        boolean isSuccessful() {
            return this.iterative.yieldOption(Tuple::of).isDefined();
        }

    }

    public static class Iterative7GetterImpl<G1, G2, G3, G4, G5, G6, G7> implements Iterative7Getter<G1, G2, G3, G4, G5, G6, G7> {

        protected Iterative7<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6, ? extends G7> iterative;

        Iterative7GetterImpl(Iterative7<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6, ? extends G7> iterative) {
            this.iterative = iterative;
        }

        @Override
        public Iterative7Fail<G1, G2, G3, G4, G5, G6, G7, Tuple7<G1, G2, G3, G4, G5, G6, G7>> onSuccess() {
            return new Iterative7Fail.Iterative7FailImpl(this.iterative, (Sp<Tuple7> & Serializable)() -> (Tuple7)this.iterative.yieldOption(Tuple::of).get());
        }

        @Override
        public <R> Iterative7Fail<G1, G2, G3, G4, G5, G6, G7, R> onSuccess(Fn1<? super Iterative7<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6, ? extends G7>, ? extends R> f) {
            Objects.requireNonNull(f, "f is null");
            return new Iterative7Fail.Iterative7FailImpl<G1, G2, G3, G4, G5, G6, G7, R>(this.iterative, f.toSupplier(this.iterative));
        }

        @Override
        public <R> Iterative7Fail<G1, G2, G3, G4, G5, G6, G7, R> onSuccess(Sp<? extends R> s) {
            Objects.requireNonNull(s, "s is null");
            return new Iterative7Fail.Iterative7FailImpl<G1, G2, G3, G4, G5, G6, G7, R>(this.iterative, s);
        }

        @Override
        public <R> Iterative7Fail<G1, G2, G3, G4, G5, G6, G7, R> onSuccess(R r) {
            return new Iterative7Fail.Iterative7FailImpl(this.iterative, (Sp<Object> & Serializable)() -> r);
        }

        @Override
        public <R> Iterative7Success<G1, G2, G3, G4, G5, G6, G7, R> onFailure(Fn1<? super Iterative7<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6, ? extends G7>, ? extends R> f) {
            Objects.requireNonNull(f, "f is null");
            return new Iterative7Success.Iterative7SuccessImpl<G1, G2, G3, G4, G5, G6, G7, R>(this.iterative, f.toSupplier(this.iterative));
        }

        @Override
        public <R> Iterative7Success<G1, G2, G3, G4, G5, G6, G7, R> onFailure(Sp<? extends R> s) {
            Objects.requireNonNull(s, "s is null");
            return new Iterative7Success.Iterative7SuccessImpl<G1, G2, G3, G4, G5, G6, G7, R>(this.iterative, s);
        }

        @Override
        public <R> Iterative7Success<G1, G2, G3, G4, G5, G6, G7, R> onFailure(R r) {
            return new Iterative7Success.Iterative7SuccessImpl(this.iterative, (Sp<Object> & Serializable)() -> r);
        }

    }

}

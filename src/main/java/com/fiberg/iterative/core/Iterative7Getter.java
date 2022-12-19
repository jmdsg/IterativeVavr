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

    public <R> Iterative7Fail<G1, G2, G3, G4, G5, G6, G7, R> onSuccess(Fn1<? super Iterative7<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6, ? extends G7>, ? extends R> f1);

    public <R> Iterative7Fail<G1, G2, G3, G4, G5, G6, G7, R> onSuccess(Sp<? extends R> s1);

    public <R> Iterative7Fail<G1, G2, G3, G4, G5, G6, G7, R> onSuccess(R r);

    public <R> Iterative7Success<G1, G2, G3, G4, G5, G6, G7, R> onFailure(Fn1<? super Iterative7<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6, ? extends G7>, ? extends R> f1);

    public <R> Iterative7Success<G1, G2, G3, G4, G5, G6, G7, R> onFailure(Sp<? extends R> s1);

    public <R> Iterative7Success<G1, G2, G3, G4, G5, G6, G7, R> onFailure(R r);

    public static interface Iterative7Success<G1, G2, G3, G4, G5, G6, G7, R> {

        public R onSuccess(Fn1<? super Iterative7<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6, ? extends G7>, ? extends R> f1);

        public R onSuccess(Sp<? extends R> s1);

        public R onSuccess(R r);

        public static class Iterative7SuccessImpl<G1, G2, G3, G4, G5, G6, G7, R> extends Iterative7FinalGetter<G1, G2, G3, G4, G5, G6, G7, R> implements Iterative7Success<G1, G2, G3, G4, G5, G6, G7, R> {

            Iterative7SuccessImpl(Iterative7<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6, ? extends G7> iterative, Sp<? extends R> s) {
                super(iterative, s);
            }

            @Override
            public R onSuccess(Fn1<? super Iterative7<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6, ? extends G7>, ? extends R> f) {
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

    public static interface Iterative7Fail<G1, G2, G3, G4, G5, G6, G7, R> {

        public R onFailure(Fn1<? super Iterative7<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6, ? extends G7>, ? extends R> f1);

        public R onFailure(Sp<? extends R> s1);

        public R onFailure(R r);

        public R onFailureNull();

        public R onFailureThrow();

        public static class Iterative7FailImpl<G1, G2, G3, G4, G5, G6, G7, R> extends Iterative7FinalGetter<G1, G2, G3, G4, G5, G6, G7, R> implements Iterative7Fail<G1, G2, G3, G4, G5, G6, G7, R> {

            Iterative7FailImpl(Iterative7<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6, ? extends G7> iterative, Sp<? extends R> s) {
                super(iterative, s);
            }

            @Override
            public R onFailure(Fn1<? super Iterative7<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6, ? extends G7>, ? extends R> f) {
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
            return new Iterative7Fail.Iterative7FailImpl<>(this.iterative, () -> this.iterative.<Tuple7<G1, G2, G3, G4, G5, G6, G7>>yieldOption(Tuple::of).get());
        }

        @Override
        public <R> Iterative7Fail<G1, G2, G3, G4, G5, G6, G7, R> onSuccess(Fn1<? super Iterative7<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6, ? extends G7>, ? extends R> f) {
            Objects.requireNonNull(f, "f is null");
            return new Iterative7Fail.Iterative7FailImpl<>(this.iterative, f.toSupplier(this.iterative));
        }

        @Override
        public <R> Iterative7Fail<G1, G2, G3, G4, G5, G6, G7, R> onSuccess(Sp<? extends R> s) {
            Objects.requireNonNull(s, "s is null");
            return new Iterative7Fail.Iterative7FailImpl<>(this.iterative, s);
        }

        @Override
        public <R> Iterative7Fail<G1, G2, G3, G4, G5, G6, G7, R> onSuccess(R r) {
            return new Iterative7Fail.Iterative7FailImpl<>(this.iterative, () -> r);
        }

        @Override
        public <R> Iterative7Success<G1, G2, G3, G4, G5, G6, G7, R> onFailure(Fn1<? super Iterative7<? extends G1, ? extends G2, ? extends G3, ? extends G4, ? extends G5, ? extends G6, ? extends G7>, ? extends R> f) {
            Objects.requireNonNull(f, "f is null");
            return new Iterative7Success.Iterative7SuccessImpl<>(this.iterative, f.toSupplier(this.iterative));
        }

        @Override
        public <R> Iterative7Success<G1, G2, G3, G4, G5, G6, G7, R> onFailure(Sp<? extends R> s) {
            Objects.requireNonNull(s, "s is null");
            return new Iterative7Success.Iterative7SuccessImpl<>(this.iterative, s);
        }

        @Override
        public <R> Iterative7Success<G1, G2, G3, G4, G5, G6, G7, R> onFailure(R r) {
            return new Iterative7Success.Iterative7SuccessImpl<>(this.iterative, () -> r);
        }

    }

}

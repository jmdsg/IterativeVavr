package com.fiberg.iterative.core;

import com.fiberg.iterative.core.Iterative4;
import com.fiberg.iterative.core.IterativeGetter;
import com.fiberg.iterative.function.Fn0;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Sp;
import io.vavr.Tuple;
import io.vavr.Tuple4;
import java.io.Serializable;
import java.util.Objects;

public interface Iterative4Getter<G1, G2, G3, G4> extends IterativeGetter {

    public Iterative4Fail<G1, G2, G3, G4, Tuple4<G1, G2, G3, G4>> onSuccess();

    public <R> Iterative4Fail<G1, G2, G3, G4, R> onSuccess(Fn1<? super Iterative4<? extends G1, ? extends G2, ? extends G3, ? extends G4>, ? extends R> var1);

    public <R> Iterative4Fail<G1, G2, G3, G4, R> onSuccess(Sp<? extends R> var1);

    public <R> Iterative4Fail<G1, G2, G3, G4, R> onSuccess(R var1);

    public <R> Iterative4Success<G1, G2, G3, G4, R> onFailure(Fn1<? super Iterative4<? extends G1, ? extends G2, ? extends G3, ? extends G4>, ? extends R> var1);

    public <R> Iterative4Success<G1, G2, G3, G4, R> onFailure(Sp<? extends R> var1);

    public <R> Iterative4Success<G1, G2, G3, G4, R> onFailure(R var1);

    public static interface Iterative4Success<G1, G2, G3, G4, R> {

        public R onSuccess(Fn1<? super Iterative4<? extends G1, ? extends G2, ? extends G3, ? extends G4>, ? extends R> var1);

        public R onSuccess(Sp<? extends R> var1);

        public R onSuccess(R var1);

        public static class Iterative4SuccessImpl<G1, G2, G3, G4, R> extends Iterative4FinalGetter<G1, G2, G3, G4, R> implements Iterative4Success<G1, G2, G3, G4, R> {

            Iterative4SuccessImpl(Iterative4<? extends G1, ? extends G2, ? extends G3, ? extends G4> iterative, Sp<? extends R> s) {
                super(iterative, s);
            }

            @Override
            public R onSuccess(Fn1<? super Iterative4<? extends G1, ? extends G2, ? extends G3, ? extends G4>, ? extends R> f) {
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

    public static interface Iterative4Fail<G1, G2, G3, G4, R> {

        public R onFailure(Fn1<? super Iterative4<? extends G1, ? extends G2, ? extends G3, ? extends G4>, ? extends R> var1);

        public R onFailure(Sp<? extends R> var1);

        public R onFailure(R var1);

        public R onFailureNull();

        public R onFailureThrow();

        public static class Iterative4FailImpl<G1, G2, G3, G4, R> extends Iterative4FinalGetter<G1, G2, G3, G4, R> implements Iterative4Fail<G1, G2, G3, G4, R> {

            Iterative4FailImpl(Iterative4<? extends G1, ? extends G2, ? extends G3, ? extends G4> iterative, Sp<? extends R> s) {
                super(iterative, s);
            }

            @Override
            public R onFailure(Fn1<? super Iterative4<? extends G1, ? extends G2, ? extends G3, ? extends G4>, ? extends R> f) {
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

    public static abstract class Iterative4FinalGetter<G1, G2, G3, G4, R> {

        protected Iterative4<? extends G1, ? extends G2, ? extends G3, ? extends G4> iterative;
        protected Sp<? extends R> s;

        Iterative4FinalGetter(Iterative4<? extends G1, ? extends G2, ? extends G3, ? extends G4> iterative, Sp<? extends R> s) {
            this.iterative = iterative;
            this.s = s;
        }

        boolean isSuccessful() {
            return this.iterative.yieldOption(Tuple::of).isDefined();
        }

    }

    public static class Iterative4GetterImpl<G1, G2, G3, G4> implements Iterative4Getter<G1, G2, G3, G4> {

        protected Iterative4<? extends G1, ? extends G2, ? extends G3, ? extends G4> iterative;

        Iterative4GetterImpl(Iterative4<? extends G1, ? extends G2, ? extends G3, ? extends G4> iterative) {
            this.iterative = iterative;
        }

        @Override
        public Iterative4Fail<G1, G2, G3, G4, Tuple4<G1, G2, G3, G4>> onSuccess() {
            return new Iterative4Fail.Iterative4FailImpl(this.iterative, (Sp<Tuple4> & Serializable)() -> (Tuple4)this.iterative.yieldOption(Tuple::of).get());
        }

        @Override
        public <R> Iterative4Fail<G1, G2, G3, G4, R> onSuccess(Fn1<? super Iterative4<? extends G1, ? extends G2, ? extends G3, ? extends G4>, ? extends R> f) {
            Objects.requireNonNull(f, "f is null");
            return new Iterative4Fail.Iterative4FailImpl<G1, G2, G3, G4, R>(this.iterative, f.toSupplier(this.iterative));
        }

        @Override
        public <R> Iterative4Fail<G1, G2, G3, G4, R> onSuccess(Sp<? extends R> s) {
            Objects.requireNonNull(s, "s is null");
            return new Iterative4Fail.Iterative4FailImpl<G1, G2, G3, G4, R>(this.iterative, s);
        }

        @Override
        public <R> Iterative4Fail<G1, G2, G3, G4, R> onSuccess(R r) {
            return new Iterative4Fail.Iterative4FailImpl(this.iterative, (Sp<Object> & Serializable)() -> r);
        }

        @Override
        public <R> Iterative4Success<G1, G2, G3, G4, R> onFailure(Fn1<? super Iterative4<? extends G1, ? extends G2, ? extends G3, ? extends G4>, ? extends R> f) {
            Objects.requireNonNull(f, "f is null");
            return new Iterative4Success.Iterative4SuccessImpl<G1, G2, G3, G4, R>(this.iterative, f.toSupplier(this.iterative));
        }

        @Override
        public <R> Iterative4Success<G1, G2, G3, G4, R> onFailure(Sp<? extends R> s) {
            Objects.requireNonNull(s, "s is null");
            return new Iterative4Success.Iterative4SuccessImpl<G1, G2, G3, G4, R>(this.iterative, s);
        }

        @Override
        public <R> Iterative4Success<G1, G2, G3, G4, R> onFailure(R r) {
            return new Iterative4Success.Iterative4SuccessImpl(this.iterative, (Sp<Object> & Serializable)() -> r);
        }

    }

}

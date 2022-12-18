package com.fiberg.iterative.core;

import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Pr1;
import io.vavr.collection.Stream;
import io.vavr.control.Option;
import io.vavr.control.Try;
import java.util.Iterator;
import java.util.Objects;

interface SimpleIterative<T1> extends Iterable<T1> {

    public static <T1> SimpleIterative<T1> of(Iterable<? extends T1> iter) {
        return new SimpleIterativeImpl<T1>(iter);
    }

    public <R> SimpleIterative<R> map(Fn1<? super T1, ? extends R> var1);

    public SimpleIterative<T1> filter(Pr1<? super T1> var1);

    public <R> SimpleIterative<R> inlineMap(Fn1<? super T1, ? extends Iterable<? extends R>> var1);

    public Iterable<T1> toIterable();

    public boolean isEmpty();

    public int length();

    public static class SimpleIterativeImpl<T1> implements SimpleIterative<T1> {

        private Iterable<? extends T1> iter;

        SimpleIterativeImpl(Iterable<? extends T1> iter) {
            this.iter = iter;
        }

        @Override
        public <R> SimpleIterative<R> map(Fn1<? super T1, ? extends R> f) {
            Objects.requireNonNull(f, "f is null");
            Object iterable = this.iter instanceof Option ? ((Option)this.iter).map(f) : (this.iter instanceof Try ? ((Try)this.iter).map(f) : Stream.ofAll(this.iter).map(f));
            return SimpleIterative.of(iterable);
        }

        @Override
        public SimpleIterative<T1> filter(Pr1<? super T1> p) {
            Objects.requireNonNull(p, "p is null");
            Object iterable = this.iter instanceof Option ? ((Option)this.iter).filter(p) : (this.iter instanceof Try ? ((Try)this.iter).filter(p) : Stream.ofAll(this.iter).filter(p));
            return SimpleIterative.of(iterable);
        }

        @Override
        public <R> SimpleIterative<R> inlineMap(Fn1<? super T1, ? extends Iterable<? extends R>> f) {
            Objects.requireNonNull(f, "f is null");
            Object iterable = this.iter instanceof Option ? ((Option)this.iter).flatMap(e -> {
                Iterable res = (Iterable)f.apply(e);
                if (res instanceof Option) {
                    return (Option)res;
                }
                return Stream.ofAll((Iterable)res).toOption();
            }) : (this.iter instanceof Try ? ((Try)this.iter).flatMap(e -> {
                Iterable res = (Iterable)f.apply(e);
                if (res instanceof Try) {
                    return (Try)res;
                }
                return Stream.ofAll((Iterable)res).toTry();
            }) : Stream.ofAll(this.iter).flatMap(f));
            return SimpleIterative.of(iterable);
        }

        @Override
        public Iterable<T1> toIterable() {
            return this.iter;
        }

        @Override
        public boolean isEmpty() {
            if (this.iter instanceof Option) {
                return ((Option)this.iter).isEmpty();
            }
            if (this.iter instanceof Try) {
                return ((Try)this.iter).isEmpty();
            }
            return Stream.ofAll(this.iter).isEmpty();
        }

        @Override
        public int length() {
            if (this.iter instanceof Option) {
                return ((Option)this.iter).isEmpty() ? 0 : 1;
            }
            if (this.iter instanceof Try) {
                return ((Try)this.iter).isEmpty() ? 0 : 1;
            }
            return Stream.ofAll(this.iter).length();
        }

        @Override
        public Iterator<T1> iterator() {
            return this.toIterable().iterator();
        }

    }

}

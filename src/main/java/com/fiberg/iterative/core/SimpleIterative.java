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

    public <R> SimpleIterative<R> map(Fn1<? super T1, ? extends R> f1);

    public SimpleIterative<T1> filter(Pr1<? super T1> p1);

    public <R> SimpleIterative<R> inlineMap(Fn1<? super T1, ? extends Iterable<? extends R>> f1);

    public Iterable<T1> toIterable();

    public boolean isEmpty();

    public int length();

    public static class SimpleIterativeImpl<T1> implements SimpleIterative<T1> {

        private final Iterable<? extends T1> iter;

        SimpleIterativeImpl(Iterable<? extends T1> iter) {
            this.iter = iter;
        }

        @Override
        public <R> SimpleIterative<R> map(Fn1<? super T1, ? extends R> f) {

            Objects.requireNonNull(f, "f is null");

            if (this.iter instanceof Option) {
                @SuppressWarnings("unchecked")
                final Option<T1> option = (Option<T1>) this.iter;
                final Iterable<R> iterable = option.map(f);
                return SimpleIterative.of(iterable);
            }

            if (this.iter instanceof Try) {
                @SuppressWarnings("unchecked")
                final Try<T1> trier = (Try<T1>) this.iter;
                final Iterable<R> iterable = trier.map(f);
                return SimpleIterative.of(iterable);
            }

            final Iterable<? extends R> iterable = Stream.ofAll(this.iter).map(f);
            return SimpleIterative.of(iterable);

        }

        @Override
        public SimpleIterative<T1> filter(Pr1<? super T1> p) {

            Objects.requireNonNull(p, "p is null");

            if (this.iter instanceof Option) {
                @SuppressWarnings("unchecked")
                final Option<T1> option = (Option<T1>) this.iter;
                final Option<T1> filtered = option.filter(p);
                return SimpleIterative.of(filtered);
            }

            if (this.iter instanceof Try) {
                @SuppressWarnings("unchecked")
                final Try<T1> trier = (Try<T1>) this.iter;
                final Try<T1> filtered = trier.filter(p);
                return SimpleIterative.of(filtered);
            }

            final Iterable<? extends T1> iterable = Stream.ofAll(this.iter).filter(p);
            return SimpleIterative.of(iterable);

        }

        @Override
        public <R> SimpleIterative<R> inlineMap(Fn1<? super T1, ? extends Iterable<? extends R>> f) {

            Objects.requireNonNull(f, "f is null");

            if (this.iter instanceof Option) {
                @SuppressWarnings("unchecked")
                final Option<T1> option = (Option<T1>) this.iter;
                final Option<R> iterable = option.flatMap(t1 -> {
                    @SuppressWarnings("unchecked")
                    final Iterable<R> res = (Iterable<R>) f.apply(t1);
                    if (res instanceof Option) {
                        return (Option<R>) res;
                    }
                    return Stream.ofAll(res).toOption();
                });
                return SimpleIterative.of(iterable);
            }

            if (this.iter instanceof Try) {
                @SuppressWarnings("unchecked")
                final Try<T1> trier = (Try<T1>) this.iter;
                final Try<R> iterable = trier.flatMap(t1 -> {
                    @SuppressWarnings("unchecked")
                    final Iterable<R> res = (Iterable<R>) f.apply(t1);
                    if (res instanceof Try) {
                        return (Try<R>) res;
                    }
                    return Stream.ofAll(res).toTry();
                });
                return SimpleIterative.of(iterable);
            }

            final Iterable<R> iterable = Stream.ofAll(this.iter).flatMap(f);
            return SimpleIterative.of(iterable);

        }

        @Override
        public Iterable<T1> toIterable() {
            @SuppressWarnings("unchecked")
            final Iterable<T1> iter = (Iterable<T1>) this.iter;
            return iter;
        }

        @Override
        public boolean isEmpty() {
            if (this.iter instanceof Option) {
                return ((Option<?>) this.iter).isEmpty();
            }
            if (this.iter instanceof Try) {
                return ((Try<?>) this.iter).isEmpty();
            }
            return Stream.ofAll(this.iter).isEmpty();
        }

        @Override
        public int length() {
            if (this.iter instanceof Option) {
                return ((Option<?>) this.iter).isEmpty() ? 0 : 1;
            }
            if (this.iter instanceof Try) {
                return ((Try<?>) this.iter).isEmpty() ? 0 : 1;
            }
            return Stream.ofAll(this.iter).length();
        }

        @Override
        public Iterator<T1> iterator() {
            return this.toIterable().iterator();
        }

    }

}

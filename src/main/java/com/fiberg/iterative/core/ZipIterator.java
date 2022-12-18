package com.fiberg.iterative.core;

import com.fiberg.iterative.function.Fn2;
import io.vavr.collection.Iterator;
import java.util.NoSuchElementException;

class ZipIterator<T1, T2, R> implements Iterator<R> {

    private final Iterator<T1> it1;
    private final Iterator<T2> it2;
    private final Fn2<T1, T2, R> mapper;

    ZipIterator(Iterator<T1> it1, Iterator<T2> it2, Fn2<T1, T2, R> mapper) {
        this.it1 = it1;
        this.it2 = it2;
        this.mapper = mapper;
    }

    public String toString() {
        return this.stringPrefix() + "(" + (this.isEmpty() ? "" : "?") + ")";
    }

    public final R next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException("next() on empty iterator");
        }
        return this.getNext();
    }

    public boolean hasNext() {
        return this.it1.hasNext() || this.it2.hasNext();
    }

    private R getNext() {
        if (!this.it1.hasNext() || !this.it2.hasNext()) {
            throw new IllegalStateException("Inlined iterables must have the same length");
        }
        return (R) this.mapper.apply(this.it1.next(), this.it2.next());
    }

}

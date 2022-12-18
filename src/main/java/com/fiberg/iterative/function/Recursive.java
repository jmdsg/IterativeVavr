package com.fiberg.iterative.function;

import com.fiberg.iterative.function.Fn1;

public class Recursive<I> {

    private I i;

    private Recursive() {
    }

    public static <I> I of(Fn1<RecursiveSupplier<I>, I> f) {
        Recursive<I> rec = new Recursive<I>();
        RecursiveSupplier sup = new RecursiveSupplier();
        rec.i = f.apply(sup);
        sup.i = rec.i;
        return rec.i;
    }

    public static class RecursiveSupplier<I> {

        private I i;

        public I call() {
            return this.i;
        }

    }

}

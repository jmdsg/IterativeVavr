package com.fiberg.iterative.function;

public class Recursive<I> {

    private I i;

    private Recursive() {

    }

    public static <I> I of(Fn1<RecursiveSupplier<I>, I> f) {
        final Recursive<I> rec = new Recursive<I>();
        final RecursiveSupplier<I> sup = new RecursiveSupplier<I>();
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

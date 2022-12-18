package com.fiberg.iterative.core;

import java.util.NoSuchElementException;

interface IterativeGetter {

    public static <R> R throwableSupplier(String element) {
        throw new NoSuchElementException(element);
    }

}

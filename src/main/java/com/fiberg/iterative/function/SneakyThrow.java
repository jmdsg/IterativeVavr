package com.fiberg.iterative.function;

interface SneakyThrow {

    public static <T extends Throwable, R> R sneakyThrow(Throwable t) throws T {
        @SuppressWarnings("unchecked")
        final T exception = (T) t;
        throw exception;
    }

}

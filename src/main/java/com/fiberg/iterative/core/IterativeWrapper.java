package com.fiberg.iterative.core;

import com.fiberg.iterative.core.Iterative;
import io.vavr.control.Option;
import io.vavr.control.Try;

interface IterativeWrapper {

    public <W> Option<W> wrap(W w);

    public <W> Try<W> wrapTry(W w);

    public boolean isNullable();

    public boolean isNonNullable();

    public boolean isCross();

    public boolean isInline();

    public static interface IterativeInline extends IterativeWrapper {

        @Override
        default public boolean isCross() {
            return false;
        }

        @Override
        default public boolean isInline() {
            return true;
        }

    }

    public static interface IterativeCross extends IterativeWrapper {

        @Override
        default public boolean isCross() {
            return true;
        }

        @Override
        default public boolean isInline() {
            return false;
        }

    }

    public static interface IterativeWrapperNonNullable extends IterativeWrapper {

        @Override
        default public <W> Option<W> wrap(W t1) {
            return Iterative.wrapNonNullable(t1);
        }

        @Override
        default public <W> Try<W> wrapTry(W t1) {
            return Iterative.wrapTryNonNullable(t1);
        }

        @Override
        default public boolean isNullable() {
            return false;
        }

        @Override
        default public boolean isNonNullable() {
            return true;
        }

    }

    public static interface IterativeWrapperNullable extends IterativeWrapper {

        @Override
        default public <W> Option<W> wrap(W t1) {
            return Iterative.wrapNullable(t1);
        }

        @Override
        default public <W> Try<W> wrapTry(W t1) {
            return Iterative.wrapTryNullable(t1);
        }

        @Override
        default public boolean isNullable() {
            return true;
        }

        @Override
        default public boolean isNonNullable() {
            return false;
        }

    }

}

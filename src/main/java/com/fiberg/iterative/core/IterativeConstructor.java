package com.fiberg.iterative.core;

import com.fiberg.iterative.core.Iterative;
import com.fiberg.iterative.core.Iterative0;
import com.fiberg.iterative.core.Iterative1;
import com.fiberg.iterative.core.Iterative2;
import com.fiberg.iterative.core.Iterative2Cross;
import com.fiberg.iterative.core.Iterative2Inline;
import com.fiberg.iterative.core.Iterative3;
import com.fiberg.iterative.core.Iterative3Cross;
import com.fiberg.iterative.core.Iterative3Inline;
import com.fiberg.iterative.core.Iterative4;
import com.fiberg.iterative.core.Iterative4Cross;
import com.fiberg.iterative.core.Iterative4Inline;
import com.fiberg.iterative.core.Iterative5;
import com.fiberg.iterative.core.Iterative5Cross;
import com.fiberg.iterative.core.Iterative5Inline;
import com.fiberg.iterative.core.Iterative6;
import com.fiberg.iterative.core.Iterative6Cross;
import com.fiberg.iterative.core.Iterative6Inline;
import com.fiberg.iterative.core.Iterative7;
import com.fiberg.iterative.core.Iterative7Cross;
import com.fiberg.iterative.core.Iterative7Inline;
import com.fiberg.iterative.core.Iterative8;
import com.fiberg.iterative.core.Iterative8Cross;
import com.fiberg.iterative.core.Iterative8Inline;
import com.fiberg.iterative.core.IterativeBuilder;
import io.vavr.collection.Stream;
import io.vavr.control.Option;

interface IterativeConstructor extends Iterative {

    public static IterativeBuilder.IterativeBuilderRegular builder(boolean cross, boolean nonNullable) {
        return Option.of(Iterative.builder())
                .map(nonNullable ? IterativeBuilder.RegularBuilder::nonNullable : IterativeBuilder.RegularBuilder::nullable)
                .map(cross ? IterativeBuilder.IterativeBuilderIteArgReg::cross : IterativeBuilder.IterativeBuilderIteArgReg::inline)
                .get();
    }

    public static IterativeBuilder.IterativeBuilderRegular builderIterate(boolean cross) {
        return Option.of(Iterative.builder())
                .map(cross ? IterativeBuilder.RegularBuilder::cross : IterativeBuilder.RegularBuilder::inline)
                .get();
    }

    public static IterativeBuilder.IterativeBuilderRegular builderAccess(boolean nonNullable) {
        return Option.of(Iterative.builder())
                .map(nonNullable ? IterativeBuilder.RegularBuilder::nonNullable : IterativeBuilder.RegularBuilder::nullable)
                .get();
    }

    default public IterativeBuilder.IterativeBuilderRegular builder() {
        return IterativeConstructor.builder(this.isCross(), this.isNonNullable());
    }

    default public IterativeBuilder.IterativeBuilderArgRegCro crossBuilder() {
        return Option.of(Iterative.builder())
                .map(this.isNullable() ? IterativeBuilder.RegularBuilder::nullable : IterativeBuilder.RegularBuilder::nonNullable)
                .map(IterativeBuilder.IterativeBuilderIteArgReg::cross)
                .get();
    }

    default public IterativeBuilder.IterativeBuilderArgRegInl inlineBuilder() {
        return Option.of(Iterative.builder())
                .map(this.isNullable() ? IterativeBuilder.RegularBuilder::nullable : IterativeBuilder.RegularBuilder::nonNullable)
                .map(IterativeBuilder.IterativeBuilderIteArgReg::inline)
                .get();
    }

    default public IterativeBuilder.IterativeBuilderIteArgReg accessBuilder() {
        return Option.of(Iterative.builder())
                .map(this.isNullable() ? IterativeBuilder.RegularBuilder::nullable : IterativeBuilder.RegularBuilder::nonNullable)
                .get();
    }

    default public IterativeBuilder.IterativeBuilderRegular accessBuilder(boolean cross) {
        return Option.of(Iterative.builder())
                .map(this.isNullable() ? IterativeBuilder.RegularBuilder::nullable : IterativeBuilder.RegularBuilder::nonNullable)
                .map(cross ? IterativeBuilder.IterativeBuilderIteArgReg::cross : IterativeBuilder.IterativeBuilderIteArgReg::inline)
                .get();
    }

    default public Iterative0 create() {
        return this.crossBuilder().of();
    }

    default public <T1> Iterative1<T1> create(Iterable<? extends Stream<? extends T1>> elem) {
        return this.crossBuilder().by(elem);
    }

    default public <T1, T2> Iterative2<T1, T2> create(Iterative1<? extends T1> iterative, Iterable<? extends Stream<? extends T2>> elem) {
        return this.builder().by(iterative, elem);
    }

    default public <T1, T2> Iterative2<T1, T2> create(Iterative1<? extends T1> iterative, Iterable<? extends Stream<? extends T2>> elem, boolean cross) {
        return this.accessBuilder(cross).by(iterative, elem);
    }

    default public <T1, T2> Iterative2Cross<T1, T2> createCross(Iterative1<? extends T1> iterative, Iterable<? extends Stream<? extends T2>> elem) {
        return this.crossBuilder().by(iterative, elem);
    }

    default public <T1, T2> Iterative2Inline<T1, T2> createInline(Iterative1<? extends T1> iterative, Iterable<? extends Stream<? extends T2>> elem) {
        return this.inlineBuilder().by(iterative, elem);
    }

    default public <T1, T2, T3> Iterative3<T1, T2, T3> create(Iterative2<? extends T1, ? extends T2> iterative, Iterable<? extends Stream<? extends T3>> elem) {
        return this.builder().by(iterative, elem);
    }

    default public <T1, T2, T3> Iterative3<T1, T2, T3> create(Iterative2<? extends T1, ? extends T2> iterative, Iterable<? extends Stream<? extends T3>> elem, boolean cross) {
        return this.accessBuilder(cross).by(iterative, elem);
    }

    default public <T1, T2, T3> Iterative3Cross<T1, T2, T3> createCross(Iterative2<? extends T1, ? extends T2> iterative, Iterable<? extends Stream<? extends T3>> elem) {
        return this.crossBuilder().by(iterative, elem);
    }

    default public <T1, T2, T3> Iterative3Inline<T1, T2, T3> createInline(Iterative2<? extends T1, ? extends T2> iterative, Iterable<? extends Stream<? extends T3>> elem) {
        return this.inlineBuilder().by(iterative, elem);
    }

    default public <T1, T2, T3, T4> Iterative4<T1, T2, T3, T4> create(Iterative3<? extends T1, ? extends T2, ? extends T3> iterative, Iterable<? extends Stream<? extends T4>> elem) {
        return this.builder().by(iterative, elem);
    }

    default public <T1, T2, T3, T4> Iterative4<T1, T2, T3, T4> create(Iterative3<? extends T1, ? extends T2, ? extends T3> iterative, Iterable<? extends Stream<? extends T4>> elem, boolean cross) {
        return this.accessBuilder(cross).by(iterative, elem);
    }

    default public <T1, T2, T3, T4> Iterative4Cross<T1, T2, T3, T4> createCross(Iterative3<? extends T1, ? extends T2, ? extends T3> iterative, Iterable<? extends Stream<? extends T4>> elem) {
        return this.crossBuilder().by(iterative, elem);
    }

    default public <T1, T2, T3, T4> Iterative4Inline<T1, T2, T3, T4> createInline(Iterative3<? extends T1, ? extends T2, ? extends T3> iterative, Iterable<? extends Stream<? extends T4>> elem) {
        return this.inlineBuilder().by(iterative, elem);
    }

    default public <T1, T2, T3, T4, T5> Iterative5<T1, T2, T3, T4, T5> create(Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4> iterative, Iterable<? extends Stream<? extends T5>> elem) {
        return this.builder().by(iterative, elem);
    }

    default public <T1, T2, T3, T4, T5> Iterative5<T1, T2, T3, T4, T5> create(Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4> iterative, Iterable<? extends Stream<? extends T5>> elem, boolean cross) {
        return this.accessBuilder(cross).by(iterative, elem);
    }

    default public <T1, T2, T3, T4, T5> Iterative5Cross<T1, T2, T3, T4, T5> createCross(Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4> iterative, Iterable<? extends Stream<? extends T5>> elem) {
        return this.crossBuilder().by(iterative, elem);
    }

    default public <T1, T2, T3, T4, T5> Iterative5Inline<T1, T2, T3, T4, T5> createInline(Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4> iterative, Iterable<? extends Stream<? extends T5>> elem) {
        return this.inlineBuilder().by(iterative, elem);
    }

    default public <T1, T2, T3, T4, T5, T6> Iterative6<T1, T2, T3, T4, T5, T6> create(Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> iterative, Iterable<? extends Stream<? extends T6>> elem) {
        return this.builder().by(iterative, elem);
    }

    default public <T1, T2, T3, T4, T5, T6> Iterative6<T1, T2, T3, T4, T5, T6> create(Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> iterative, Iterable<? extends Stream<? extends T6>> elem, boolean cross) {
        return this.accessBuilder(cross).by(iterative, elem);
    }

    default public <T1, T2, T3, T4, T5, T6> Iterative6Cross<T1, T2, T3, T4, T5, T6> createCross(Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> iterative, Iterable<? extends Stream<? extends T6>> elem) {
        return this.crossBuilder().by(iterative, elem);
    }

    default public <T1, T2, T3, T4, T5, T6> Iterative6Inline<T1, T2, T3, T4, T5, T6> createInline(Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> iterative, Iterable<? extends Stream<? extends T6>> elem) {
        return this.inlineBuilder().by(iterative, elem);
    }

    default public <T1, T2, T3, T4, T5, T6, T7> Iterative7<T1, T2, T3, T4, T5, T6, T7> create(Iterative6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> iterative, Iterable<? extends Stream<? extends T7>> elem) {
        return this.builder().by(iterative, elem);
    }

    default public <T1, T2, T3, T4, T5, T6, T7> Iterative7<T1, T2, T3, T4, T5, T6, T7> create(Iterative6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> iterative, Iterable<? extends Stream<? extends T7>> elem, boolean cross) {
        return this.accessBuilder(cross).by(iterative, elem);
    }

    default public <T1, T2, T3, T4, T5, T6, T7> Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> createCross(Iterative6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> iterative, Iterable<? extends Stream<? extends T7>> elem) {
        return this.crossBuilder().by(iterative, elem);
    }

    default public <T1, T2, T3, T4, T5, T6, T7> Iterative7Inline<T1, T2, T3, T4, T5, T6, T7> createInline(Iterative6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> iterative, Iterable<? extends Stream<? extends T7>> elem) {
        return this.inlineBuilder().by(iterative, elem);
    }

    default public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> create(Iterative7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> iterative, Iterable<? extends Stream<? extends T8>> elem) {
        return this.builder().by(iterative, elem);
    }

    default public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> create(Iterative7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> iterative, Iterable<? extends Stream<? extends T8>> elem, boolean cross) {
        return this.accessBuilder(cross).by(iterative, elem);
    }

    default public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> createCross(Iterative7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> iterative, Iterable<? extends Stream<? extends T8>> elem) {
        return this.crossBuilder().by(iterative, elem);
    }

    default public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Inline<T1, T2, T3, T4, T5, T6, T7, T8> createInline(Iterative7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> iterative, Iterable<? extends Stream<? extends T8>> elem) {
        return this.inlineBuilder().by(iterative, elem);
    }

}

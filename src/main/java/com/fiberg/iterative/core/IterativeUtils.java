package com.fiberg.iterative.core;

import com.fiberg.iterative.function.*;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

public interface IterativeUtils {

    public static <T, R> R ifDefined(T obj, Fn1<? super T, ? extends R> function) {
        Objects.requireNonNull(function, "function is null");
        return (Objects.nonNull(obj) ? function.apply(obj) : null);
    }

    public static <T, R> R ifDefined(T obj, Sp<? extends R> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return IterativeUtils.ifDefined(obj, supplier.toFunction().ignoring1());
    }

    public static <T, R> R ifDefined(T obj, R value) {
        return IterativeUtils.ifDefined(obj, Fn1.value(value));
    }

    public static <T extends CharSequence, R> R ifNotBlank(T obj, Fn1<? super T, ? extends R> function) {
        Objects.requireNonNull(function, "function is null");
        return (StringUtils.isNotBlank(obj) ? function.apply(obj) : null);
    }

    public static <T extends CharSequence, R> R ifNotBlank(T obj, Sp<? extends R> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return IterativeUtils.ifNotBlank(obj, supplier.toFunction().ignoring1());
    }

    public static <T extends CharSequence, R> R ifNotBlank(T obj, R value) {
        return IterativeUtils.ifNotBlank(obj, Fn1.value(value));
    }

    public static <T, R> R ifPredicate(T obj, Pr1<? super T> predicate, Fn1<? super T, ? extends R> function) {
        Objects.requireNonNull(predicate, "predicate is null");
        Objects.requireNonNull(function, "function is null");
        return (predicate.test(obj) ? function.apply(obj) : null);
    }

    public static <T, R> R ifPredicate(T obj, Pr1<? super T> predicate, Sp<? extends R> supplier) {
        Objects.requireNonNull(predicate, "predicate is null");
        Objects.requireNonNull(supplier, "supplier is null");
        return IterativeUtils.ifPredicate(obj, predicate, supplier.toFunction().ignoring1());
    }

    public static <T, R> R ifPredicate(T obj, Pr1<? super T> predicate, R value) {
        Objects.requireNonNull(predicate, "predicate is null");
        return IterativeUtils.ifPredicate(obj, predicate, Fn1.value(value));
    }

    public static <T, R> R ifAbsent(T obj, Sp<? extends R> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return Objects.isNull(obj) ? supplier.get() : null;
    }

    public static <T, R> R ifAbsent(T obj, R value) {
        return IterativeUtils.ifAbsent(obj, Sp.value(value));
    }

    public static <T, R> R ifDefinedOrDefault(T obj, Fn1<? super T, ? extends R> present, Sp<? extends R> absent) {
        Objects.requireNonNull(present, "present is null");
        Objects.requireNonNull(absent, "absent is null");
        return (Objects.nonNull(obj) ? present.apply(obj) : absent.get());
    }

    public static <T, R> R ifDefinedOrDefault(T obj, Fn1<? super T, ? extends R> present, R absent) {
        Objects.requireNonNull(present, "present is null");
        return IterativeUtils.ifDefinedOrDefault(obj, present, Sp.value(absent));
    }

    public static <T, R> R ifDefinedOrDefault(T obj, Sp<? extends R> present, Sp<? extends R> absent) {
        Objects.requireNonNull(present, "present is null");
        Objects.requireNonNull(absent, "absent is null");
        return IterativeUtils.ifDefinedOrDefault(obj, present.toFunction().ignoring1(), absent);
    }

    public static <T, R> R ifDefinedOrDefault(T obj, Sp<? extends R> present, R absent) {
        Objects.requireNonNull(present, "present is null");
        return IterativeUtils.ifDefinedOrDefault(obj, present.toFunction().ignoring1(), Sp.value(absent));
    }

    public static <T, R> R ifDefinedOrDefault(T obj, R present, Sp<? extends R> absent) {
        Objects.requireNonNull(absent, "absent is null");
        return IterativeUtils.ifDefinedOrDefault(obj, Fn1.value(present), absent);
    }

    public static <T, R> R ifDefinedOrDefault(T obj, R present, R absent) {
        return IterativeUtils.ifDefinedOrDefault(obj, Fn1.value(present), Sp.value(absent));
    }

    public static <T extends CharSequence, R> R ifNotBlankOrDefault(T obj, Fn1<? super T, ? extends R> present, Sp<? extends R> absent) {
        Objects.requireNonNull(present, "present is null");
        Objects.requireNonNull(absent, "absent is null");
        return (StringUtils.isNotBlank(obj) ? present.apply(obj) : absent.get());
    }

    public static <T extends CharSequence, R> R ifNotBlankOrDefault(T obj, Sp<? extends R> present, Sp<? extends R> absent) {
        Objects.requireNonNull(present, "present is null");
        Objects.requireNonNull(absent, "absent is null");
        return IterativeUtils.ifNotBlankOrDefault(obj, present.toFunction().ignoring1(), absent);
    }

    public static <T extends CharSequence, R> R ifNotBlankOrDefault(T obj, R present, Sp<? extends R> absent) {
        Objects.requireNonNull(absent, "absent is null");
        return IterativeUtils.ifNotBlankOrDefault(obj, Fn1.value(present), absent);
    }

    public static <T extends CharSequence, R> R ifNotBlankOrDefault(T obj, Fn1<? super T, ? extends R> present, R absent) {
        Objects.requireNonNull(present, "present is null");
        return (StringUtils.isNotBlank(obj) ? present.apply(obj) : absent);
    }

    public static <T extends CharSequence, R> R ifNotBlankOrDefault(T obj, Sp<? extends R> present, R absent) {
        Objects.requireNonNull(present, "present is null");
        return IterativeUtils.ifNotBlankOrDefault(obj, present.toFunction().ignoring1(), absent);
    }

    public static <T extends CharSequence, R> R ifNotBlankOrDefault(T obj, R present, R absent) {
        return IterativeUtils.ifNotBlankOrDefault(obj, Fn1.value(present), absent);
    }

    public static <T, R> R ifPredicateOrDefault(T obj, Pr1<? super T> predicate, Fn1<? super T, ? extends R> present, Sp<? extends R> absent) {
        Objects.requireNonNull(predicate, "predicate is null");
        Objects.requireNonNull(present, "present is null");
        Objects.requireNonNull(absent, "absent is null");
        return (predicate.test(obj) ? present.apply(obj) : absent.get());
    }

    public static <T, R> R ifPredicateOrDefault(T obj, Pr1<? super T> predicate, Sp<? extends R> present, Sp<? extends R> absent) {
        Objects.requireNonNull(predicate, "predicate is null");
        Objects.requireNonNull(present, "present is null");
        Objects.requireNonNull(absent, "absent is null");
        return IterativeUtils.ifPredicateOrDefault(obj, predicate, present.toFunction().ignoring1(), absent);
    }

    public static <T, R> R ifPredicateOrDefault(T obj, Pr1<? super T> predicate, R value, Sp<? extends R> absent) {
        Objects.requireNonNull(predicate, "predicate is null");
        Objects.requireNonNull(absent, "absent is null");
        return IterativeUtils.ifPredicateOrDefault(obj, predicate, Fn1.value(value), absent);
    }

    public static <T, R> R ifPredicateOrDefault(T obj, Pr1<? super T> predicate, Fn1<? super T, ? extends R> present, R absent) {
        Objects.requireNonNull(predicate, "predicate is null");
        Objects.requireNonNull(present, "present is null");
        return (predicate.test(obj) ? present.apply(obj) : absent);
    }

    public static <T, R> R ifPredicateOrDefault(T obj, Pr1<? super T> predicate, Sp<? extends R> present, R absent) {
        Objects.requireNonNull(predicate, "predicate is null");
        Objects.requireNonNull(present, "present is null");
        return IterativeUtils.ifPredicateOrDefault(obj, predicate, present.toFunction().ignoring1(), absent);
    }

    public static <T, R> R ifPredicateOrDefault(T obj, Pr1<? super T> predicate, R value, R absent) {
        Objects.requireNonNull(predicate, "predicate is null");
        return IterativeUtils.ifPredicateOrDefault(obj, predicate, Fn1.value(value), absent);
    }

    public static <T, R> boolean compareByMapping(T t1, T t2, Fn1<? super T, ? extends R> function, Pr2<? super R, ? super R> comparator) {
        Objects.requireNonNull(comparator, "comparator is null");
        Objects.requireNonNull(function, "function is null");
        return (Boolean) Iterative.from(t1, t2).map(function, function).yieldOption(comparator.toFunction()).getOrElse(false);
    }

    public static <T, R> boolean compareByMapping(T t1, T t2, Fn1<? super T, ? extends R> function) {
        Objects.requireNonNull(function, "function is null");
        return IterativeUtils.compareByMapping(t1, t2, function, Objects::equals);
    }

    public static <T, R> Pr2<T, T> comparatorByMapping(Fn1<? super T, ? extends R> function, Pr2<? super R, ? super R> comparator) {
        Objects.requireNonNull(comparator, "comparator is null");
        Objects.requireNonNull(function, "function is null");
        final Pr4<T, T, Fn1<T, R>, Pr2<R, R>> compareByMapping = Pr4.of(IterativeUtils::compareByMapping);
        return compareByMapping.testRt(Fn1.narrow(function), Pr2.narrow(comparator));
    }

    public static <T, R> Pr2<T, T> comparatorByMapping(Fn1<? super T, ? extends R> function) {
        Objects.requireNonNull(function, "function is null");
        final Pr3<T, T, Fn1<T, R>> compareByMapping = Pr3.of(IterativeUtils::compareByMapping);
        return compareByMapping.testRt(Fn1.narrow(function));
    }

}

package com.fiberg.iterative.function;

import com.fiberg.iterative.core.IterativeInternals;
import com.fiberg.iterative.function.Cs1;
import com.fiberg.iterative.function.Fn0;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Pr1;
import com.fiberg.iterative.function.Pr2;
import com.fiberg.iterative.function.Pr3;
import com.fiberg.iterative.function.Pr4;
import com.fiberg.iterative.function.Pr5;
import com.fiberg.iterative.function.Pr6;
import com.fiberg.iterative.function.Pr7;
import com.fiberg.iterative.function.Pr8;
import com.fiberg.iterative.function.Prc0;
import com.fiberg.iterative.function.Predicates;
import com.fiberg.iterative.function.Rn;
import com.fiberg.iterative.function.Sp;
import com.fiberg.iterative.function.Spc;
import io.vavr.Function0;
import io.vavr.Tuple;
import io.vavr.Tuple0;
import java.io.Serializable;
import java.util.Objects;

@FunctionalInterface
public interface Pr0 extends Function0<Boolean> {

    default public Boolean apply() {
        return this.test();
    }

    public static Pr0 empty() {
        return IterativeInternals::none;
    }

    public static Pr0 value(Boolean b) {
        return () -> b;
    }

    public static Pr0 of(Pr0 p) {
        return p;
    }

    public static Pr0 fromFunction(Fn0<? extends Boolean> f) {
        return f::apply;
    }

    public static Pr0 fromSupplier(Sp<? extends Boolean> s) {
        return s::get;
    }

    public static Pr0 negate(Pr0 p) {
        return p.negated();
    }

    public static Pr0 and(Pr0 ... ps) {
        Objects.requireNonNull(ps, "ps is null");
        return Predicates.and(ps);
    }

    public static Pr0 or(Pr0 ... ps) {
        Objects.requireNonNull(ps, "ps is null");
        return Predicates.or(ps);
    }

    public static Pr1<Tuple0> tuple(Pr0 p) {
        return Pr0.of(p).tupled();
    }

    public static Pr0 detuple(Pr1<? super Tuple0> p) {
        return () -> p.test(Tuple.empty());
    }

    public static Pr0 uncheck(Prc0 p) {
        Objects.requireNonNull(p, "p is null");
        return p.unchecked();
    }

    public static <T1> Pr0 pass(Pr1<? super T1> p, T1 t1) {
        return p.toPredicate(t1);
    }

    public static <T1, T2> Pr0 pass(Pr2<? super T1, ? super T2> p, T1 t1, T2 t2) {
        return p.toPredicate(t1, t2);
    }

    public static <T1, T2, T3> Pr0 pass(Pr3<? super T1, ? super T2, ? super T3> p, T1 t1, T2 t2, T3 t3) {
        return p.toPredicate(t1, t2, t3);
    }

    public static <T1, T2, T3, T4> Pr0 pass(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p, T1 t1, T2 t2, T3 t3, T4 t4) {
        return p.toPredicate(t1, t2, t3, t4);
    }

    public static <T1, T2, T3, T4, T5> Pr0 pass(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return p.toPredicate(t1, t2, t3, t4, t5);
    }

    public static <T1, T2, T3, T4, T5, T6> Pr0 pass(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return p.toPredicate(t1, t2, t3, t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr0 pass(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return p.toPredicate(t1, t2, t3, t4, t5, t6, t7);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr0 pass(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return p.toPredicate(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    public static <T1> boolean passAndTest(Pr1<? super T1> p, T1 t1) {
        return Pr0.pass(p, t1).test();
    }

    public static <T1, T2> boolean passAndTest(Pr2<? super T1, ? super T2> p, T1 t1, T2 t2) {
        return Pr0.pass(p, t1, t2).test();
    }

    public static <T1, T2, T3> boolean passAndTest(Pr3<? super T1, ? super T2, ? super T3> p, T1 t1, T2 t2, T3 t3) {
        return Pr0.pass(p, t1, t2, t3).test();
    }

    public static <T1, T2, T3, T4> boolean passAndTest(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p, T1 t1, T2 t2, T3 t3, T4 t4) {
        return Pr0.pass(p, t1, t2, t3, t4).test();
    }

    public static <T1, T2, T3, T4, T5> boolean passAndTest(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return Pr0.pass(p, t1, t2, t3, t4, t5).test();
    }

    public static <T1, T2, T3, T4, T5, T6> boolean passAndTest(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return Pr0.pass(p, t1, t2, t3, t4, t5, t6).test();
    }

    public static <T1, T2, T3, T4, T5, T6, T7> boolean passAndTest(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return Pr0.pass(p, t1, t2, t3, t4, t5, t6, t7).test();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> boolean passAndTest(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Pr0.pass(p, t1, t2, t3, t4, t5, t6, t7, t8).test();
    }

    public boolean test();

    default public <R> R evalued(Sp<? extends R> onSuccess, Sp<? extends R> onFailure) {
        return this.test() ? onSuccess.get() : onFailure.get();
    }

    default public <R> R evalued(Sp<? extends R> onSuccess, R onFailure) {
        return this.evalued(onSuccess, Sp.value(onFailure));
    }

    default public <R> R evalued(R onSuccess, Sp<? extends R> onFailure) {
        return this.evalued(Sp.value(onSuccess), onFailure);
    }

    default public <R> R evalued(R onSuccess, R onFailure) {
        return this.evalued(Sp.value(onSuccess), Sp.value(onFailure));
    }

    default public <R> R evaluedOnSuccess(Sp<? extends R> onSuccess) {
        return this.evalued(onSuccess, Sp.empty());
    }

    default public <R> R evaluedOnFailure(Sp<? extends R> onFailure) {
        return this.evalued(Sp.empty(), onFailure);
    }

    default public <R> R evaluedOnSuccess(R onSuccess) {
        return this.evalued(Sp.value(onSuccess), Sp.empty());
    }

    default public <R> R evaluedOnFailure(R onFailure) {
        return this.evalued(Sp.empty(), Sp.value(onFailure));
    }

    default public Sp<Boolean> toSupplier() {
        return this::test;
    }

    default public Fn0<Boolean> toFunction() {
        return this::test;
    }

    default public Rn toRunnable() {
        return this::test;
    }

    default public Pr0 afterRunOn(Rn onSuccess, Rn onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return () -> {
            Boolean value = this.test();
            (value != false ? onSuccess : onFailure).run();
            return value;
        };
    }

    default public Rn afterRunOnTo(Rn onSuccess, Rn onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return () -> (this.test() ? onSuccess : onFailure).run();
    }

    default public Pr0 afterTestOn(Pr1<Boolean> onSuccess, Pr1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.toFunction(), onFailure.toFunction());
    }

    default public Pr0 afterTestOn(Pr0 onSuccess, Pr0 onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterTestOn(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Pr0 afterApplyOn(Fn1<Boolean, Boolean> onSuccess, Fn1<Boolean, Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return Pr0.fromFunction(this.afterApplyOnTo(onSuccess, onFailure));
    }

    default public <R> Fn0<R> afterApplyOnTo(Fn1<Boolean, ? extends R> onSuccess, Fn1<Boolean, ? extends R> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return () -> {
            Boolean value = this.test();
            return (value != false ? onSuccess : onFailure).apply(value);
        };
    }

    default public Pr0 afterApplyOn(Fn0<Boolean> onSuccess, Fn0<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onFailure.ignoring1(), onFailure.ignoring1());
    }

    default public <R> Fn0<R> afterApplyOnTo(Fn0<? extends R> onSuccess, Fn0<? extends R> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOnTo(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Pr0 afterGetOn(Sp<Boolean> onSuccess, Sp<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public <R> Sp<R> afterGetOnTo(Sp<? extends R> onSuccess, Sp<? extends R> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOnTo(Sp.narrow(onSuccess).ignoring1(), Sp.narrow(onFailure).ignoring1()).toSupplier();
    }

    default public Rn afterAcceptOnTo(Cs1<Boolean> onSuccess, Cs1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOnTo(onSuccess.toFunction(null), onFailure.toFunction(null)).toRunnable();
    }

    default public Pr0 afterAcceptOn(Cs1<Boolean> onSuccess, Cs1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.toFunction(null), onFailure.toFunction(null));
    }

    default public Pr0 afterRun(Rn r) {
        return this.afterRunOn(r, r);
    }

    default public Rn afterRunTo(Rn r) {
        return this.afterRunOnTo(r, r);
    }

    default public Pr0 afterTest(Pr1<Boolean> p) {
        return this.afterTestOn(p, p);
    }

    default public Pr0 afterTest(Pr0 p) {
        return this.afterTestOn(p, p);
    }

    default public Pr0 afterApply(Fn1<Boolean, Boolean> f) {
        return this.afterApplyOn(f, f);
    }

    default public <R> Fn0<R> afterApplyTo(Fn1<Boolean, ? extends R> f) {
        return this.afterApplyOnTo(f, f);
    }

    default public Pr0 afterApply(Fn0<Boolean> f) {
        return this.afterApplyOn(f, f);
    }

    default public <R> Fn0<R> afterApplyTo(Fn0<? extends R> f) {
        return this.afterApplyOnTo(f, f);
    }

    default public Pr0 afterGet(Sp<Boolean> s) {
        return this.afterGetOn(s, s);
    }

    default public <R> Sp<R> afterGetTo(Sp<? extends R> s) {
        return this.afterGetOnTo(s, s);
    }

    default public Rn afterAcceptTo(Cs1<Boolean> c) {
        return this.afterAcceptOnTo(c, c);
    }

    default public Pr0 afterAccept(Cs1<Boolean> c) {
        return this.afterAcceptOn(c, c);
    }

    default public Pr0 beforeWrap(Pr1<? super Spc<Boolean>> wrap) {
        return Pr0.fromFunction(this.beforeWrapTo(wrap.toFunction()));
    }

    default public <W> Fn0<W> beforeWrapTo(Fn1<? super Spc<Boolean>, ? extends W> wrap) {
        return () -> wrap.apply(this.toSupplier().checked());
    }

    default public Pr0 afterRunOnSuccess(Rn r) {
        return this.afterRunOn(r, Rn.empty());
    }

    default public Rn afterRunOnSuccessTo(Rn r) {
        return this.afterRunOnTo(r, Rn.empty());
    }

    default public Pr0 afterTestOnSuccess(Pr1<Boolean> p) {
        return this.afterTestOn(p, Pr1.empty());
    }

    default public Pr0 afterTestOnSuccess(Pr0 p) {
        return this.afterTestOn(p, Pr0.empty());
    }

    default public Pr0 afterApplyOnSuccess(Fn1<Boolean, Boolean> f) {
        return this.afterApplyOn(f, Fn1.empty());
    }

    default public <R> Fn0<R> afterApplyOnSuccessTo(Fn1<Boolean, ? extends R> f) {
        return this.afterApplyOnTo(f, Fn1.empty());
    }

    default public Pr0 afterApplyOnSuccess(Fn0<Boolean> f) {
        return this.afterApplyOn(f, Fn0.empty());
    }

    default public <R> Fn0<R> afterApplyOnSuccessTo(Fn0<? extends R> f) {
        return this.afterApplyOnTo(f, Fn0.empty());
    }

    default public Pr0 afterGetOnSuccess(Sp<Boolean> s) {
        return this.afterGetOn(s, Sp.empty());
    }

    default public <R> Sp<R> afterGetOnSuccessTo(Sp<? extends R> s) {
        return this.afterGetOnTo(s, Sp.empty());
    }

    default public Rn afterAcceptOnSuccessTo(Cs1<Boolean> c) {
        return this.afterAcceptOnTo(c, Cs1.empty());
    }

    default public Pr0 afterAcceptOnSuccess(Cs1<Boolean> c) {
        return this.afterAcceptOn(c, Cs1.empty());
    }

    default public Pr0 afterRunOnFailure(Rn r) {
        return this.negated().afterRunOnSuccess(r);
    }

    default public Rn afterRunOnFailureTo(Rn r) {
        return this.negated().afterRunOnSuccessTo(r);
    }

    default public Pr0 afterTestOnFailure(Pr1<Boolean> p) {
        return this.negated().afterTestOnSuccess(p);
    }

    default public Pr0 afterTestOnFailure(Pr0 p) {
        return this.negated().afterTestOnSuccess(p);
    }

    default public Pr0 afterApplyOnFailure(Fn1<Boolean, Boolean> f) {
        return this.negated().afterApplyOnSuccess(f);
    }

    default public <R> Fn0<R> afterApplyOnFailureTo(Fn1<Boolean, ? extends R> f) {
        return this.negated().afterApplyOnSuccessTo(f);
    }

    default public Pr0 afterApplyOnFailure(Fn0<Boolean> f) {
        return this.negated().afterApplyOnSuccess(f);
    }

    default public <R> Fn0<R> afterApplyOnFailureTo(Fn0<? extends R> f) {
        return this.negated().afterApplyOnSuccessTo(f);
    }

    default public Pr0 afterGetOnFailure(Sp<Boolean> s) {
        return this.negated().afterGetOnSuccess(s);
    }

    default public <R> Sp<R> afterGetOnFailureTo(Sp<? extends R> s) {
        return this.negated().afterGetOnSuccessTo(s);
    }

    default public Rn afterAcceptOnFailureTo(Cs1<Boolean> c) {
        return this.negated().afterAcceptOnSuccessTo(c);
    }

    default public Pr0 afterAcceptOnFailure(Cs1<Boolean> c) {
        return this.negated().afterAcceptOnSuccess(c);
    }

    default public Pr0 beforeRun(Rn r) {
        Objects.requireNonNull(r, "r is null");
        return () -> {
            r.run();
            return this.test();
        };
    }

    default public Pr0 beforeTestOnSuccess(Pr0 p, Pr0 onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return () -> p.test() ? this.test() : onFailure.test();
    }

    default public Pr0 beforeTestOnSuccess(Pr0 p, Sp<? extends Boolean> onFailure) {
        return this.beforeTestOnSuccess(p, Pr0.fromSupplier(onFailure));
    }

    default public Pr0 beforeTestOnSuccess(Pr0 p, Boolean onFailure) {
        return this.beforeTestOnSuccess(p, Pr0.value(onFailure));
    }

    default public Pr0 beforeTestOnSuccess(Pr0 p) {
        return this.beforeTestOnSuccess(p, Pr0.empty());
    }

    default public Pr0 beforeTestOnFailure(Pr0 p, Pr0 onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Pr0 beforeTestOnFailure(Pr0 p, Sp<? extends Boolean> onSuccess) {
        return this.beforeTestOnFailure(p, Pr0.fromSupplier(onSuccess));
    }

    default public Pr0 beforeTestOnFailure(Pr0 p, Boolean onSuccess) {
        return this.beforeTestOnFailure(p, Pr0.value(onSuccess));
    }

    default public Pr0 beforeTestOnFailure(Pr0 p) {
        return this.beforeTestOnFailure(p, Pr0.empty());
    }

    default public Pr0 beforeSuccessPassingThroughTest(Pr0 p, Pr0 onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return () -> p.test() ? this.apply() : onFailure.apply();
    }

    default public Pr0 beforeSuccessPassingThroughTest(Pr0 p, Sp<? extends Boolean> onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Pr0.fromSupplier(onFailure));
    }

    default public Pr0 beforeSuccessPassingThroughTest(Pr0 p, Boolean onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Pr0.value(onFailure));
    }

    default public Pr0 beforeSuccessPassingThroughTest(Pr0 p) {
        return this.beforeSuccessPassingThroughTest(p, Pr0.empty());
    }

    default public Pr0 beforeFailurePassingThroughTest(Pr0 p, Pr0 onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Pr0 beforeFailurePassingThroughTest(Pr0 p, Sp<? extends Boolean> onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Pr0.fromSupplier(onSuccess));
    }

    default public Pr0 beforeFailurePassingThroughTest(Pr0 p, Boolean onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Pr0.value(onSuccess));
    }

    default public Pr0 beforeFailurePassingThroughTest(Pr0 p) {
        return this.beforeFailurePassingThroughTest(p, Pr0.empty());
    }

    default public Pr1<Tuple0> tupled() {
        return tuple -> this.test();
    }

    default public Pr0 currying() {
        return this;
    }

    default public Prc0 checked() {
        return this::test;
    }

    default public Pr0 negated() {
        return () -> !this.test();
    }

    default public Pr0 and(Pr0 p) {
        Objects.requireNonNull(p, "p is null");
        return () -> this.test() && p.test();
    }

    default public Pr0 or(Pr0 p) {
        Objects.requireNonNull(p, "p is null");
        return () -> this.test() || p.test();
    }

    default public <I1> Pr1<I1> ignoring1() {
        return i1 -> this.test();
    }

    default public <I1, I2> Pr2<I1, I2> ignoring2() {
        return (i1, i2) -> this.test();
    }

    default public <I1, I2, I3> Pr3<I1, I2, I3> ignoring3() {
        return (i1, i2, i3) -> this.test();
    }

    default public <I1, I2, I3, I4> Pr4<I1, I2, I3, I4> ignoring4() {
        return (i1, i2, i3, i4) -> this.test();
    }

    default public <I1, I2, I3, I4, I5> Pr5<I1, I2, I3, I4, I5> ignoring5() {
        return (i1, i2, i3, i4, i5) -> this.test();
    }

    default public <I1, I2, I3, I4, I5, I6> Pr6<I1, I2, I3, I4, I5, I6> ignoring6() {
        return (i1, i2, i3, i4, i5, i6) -> this.test();
    }

    default public <I1, I2, I3, I4, I5, I6, I7> Pr7<I1, I2, I3, I4, I5, I6, I7> ignoring7() {
        return (i1, i2, i3, i4, i5, i6, i7) -> this.test();
    }

    default public <I1, I2, I3, I4, I5, I6, I7, I8> Pr8<I1, I2, I3, I4, I5, I6, I7, I8> ignoring8() {
        return (i1, i2, i3, i4, i5, i6, i7, i8) -> this.test();
    }

    default public Pr0 memoized() {
        return ((Function0) super.memoized())::apply;
    }

}

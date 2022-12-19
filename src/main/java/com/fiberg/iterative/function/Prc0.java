package com.fiberg.iterative.function;

import com.fiberg.iterative.core.IterativeInternals;
import io.vavr.CheckedFunction0;
import io.vavr.Tuple;
import io.vavr.Tuple0;

import java.util.Objects;

@FunctionalInterface
public interface Prc0 extends CheckedFunction0<Boolean> {

    default public Boolean apply() throws Throwable {
        return this.test();
    }

    public static Prc0 empty() {
        return IterativeInternals::none;
    }

    public static Prc0 value(Boolean b) {
        return () -> b;
    }

    public static Prc0 of(Prc0 p) {
        return p;
    }

    public static Prc0 fromFunction(Fnc0<? extends Boolean> f) {
        return f::apply;
    }

    public static Prc0 fromSupplier(Spc<? extends Boolean> s) {
        return s::get;
    }

    public static Prc0 negate(Prc0 p) {
        return p.negated();
    }

    public static Prc0 and(Prc0 ... ps) {
        Objects.requireNonNull(ps, "ps is null");
        return Predicates.and(ps);
    }

    public static Prc0 or(Prc0 ... ps) {
        Objects.requireNonNull(ps, "ps is null");
        return Predicates.or(ps);
    }

    public static Prc1<Tuple0> tuple(Prc0 p) {
        return Prc0.of(p).tupled();
    }

    public static Prc0 detuple(Prc1<? super Tuple0> p) {
        return () -> p.test(Tuple.empty());
    }

    public static Prc0 check(Pr0 p) {
        Objects.requireNonNull(p, "p is null");
        return p.checked();
    }

    public static <T1> Prc0 pass(Prc1<? super T1> p, T1 t1) {
        return p.toPredicate(t1);
    }

    public static <T1, T2> Prc0 pass(Prc2<? super T1, ? super T2> p, T1 t1, T2 t2) {
        return p.toPredicate(t1, t2);
    }

    public static <T1, T2, T3> Prc0 pass(Prc3<? super T1, ? super T2, ? super T3> p, T1 t1, T2 t2, T3 t3) {
        return p.toPredicate(t1, t2, t3);
    }

    public static <T1, T2, T3, T4> Prc0 pass(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p, T1 t1, T2 t2, T3 t3, T4 t4) {
        return p.toPredicate(t1, t2, t3, t4);
    }

    public static <T1, T2, T3, T4, T5> Prc0 pass(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return p.toPredicate(t1, t2, t3, t4, t5);
    }

    public static <T1, T2, T3, T4, T5, T6> Prc0 pass(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return p.toPredicate(t1, t2, t3, t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc0 pass(Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return p.toPredicate(t1, t2, t3, t4, t5, t6, t7);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc0 pass(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return p.toPredicate(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    public Boolean test() throws Throwable;

    default public Spc<Boolean> toSupplier() {
        return this::test;
    }

    default public Fnc0<Boolean> toFunction() {
        return this::test;
    }

    default public Rnc toRunnable() {
        return this::test;
    }

    default public Prc0 afterRunOn(Rnc onSuccess, Rnc onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return () -> {
            boolean result = this.test();
            (result ? onSuccess : onFailure).run();
            return result;
        };
    }

    default public Rnc afterRunOnTo(Rnc onSuccess, Rnc onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return () -> (this.test() ? onSuccess : onFailure).run();
    }

    default public Prc0 afterTestOn(Prc1<Boolean> onSuccess, Prc1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.toFunction(), onFailure.toFunction());
    }

    default public Prc0 afterTestOn(Prc0 onSuccess, Prc0 onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterTestOn(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Prc0 afterApplyOn(Fnc1<Boolean, Boolean> onSuccess, Fnc1<Boolean, Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return Prc0.fromFunction(this.afterApplyOnTo(onSuccess, onFailure));
    }

    default public <R> Fnc0<R> afterApplyOnTo(Fnc1<Boolean, ? extends R> onSuccess, Fnc1<Boolean, ? extends R> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return () -> {
            boolean result = this.test();
            return (result ? onSuccess : onFailure).apply(result);
        };
    }

    default public Prc0 afterApplyOn(Fnc0<Boolean> onSuccess, Fnc0<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onFailure.ignoring1(), onFailure.ignoring1());
    }

    default public <R> Fnc0<R> afterApplyOnTo(Fnc0<? extends R> onSuccess, Fnc0<? extends R> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOnTo(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Prc0 afterGetOn(Spc<Boolean> onSuccess, Spc<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public <R> Spc<R> afterGetOnTo(Spc<? extends R> onSuccess, Spc<? extends R> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOnTo(Spc.narrow(onSuccess).ignoring1(), Spc.narrow(onFailure).ignoring1()).toSupplier();
    }

    default public Rnc afterAcceptOnTo(Csc1<Boolean> onSuccess, Csc1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOnTo(onSuccess.toFunction(null), onFailure.toFunction(null)).toRunnable();
    }

    default public Prc0 afterAcceptOn(Csc1<Boolean> onSuccess, Csc1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.toFunction(null), onFailure.toFunction(null));
    }

    default public Prc0 afterRun(Rnc r) {
        return this.afterRunOn(r, r);
    }

    default public Rnc afterRunTo(Rnc r) {
        return this.afterRunOnTo(r, r);
    }

    default public Prc0 afterTest(Prc1<Boolean> p) {
        return this.afterTestOn(p, p);
    }

    default public Prc0 afterTest(Prc0 p) {
        return this.afterTestOn(p, p);
    }

    default public Prc0 afterApply(Fnc1<Boolean, Boolean> f) {
        return this.afterApplyOn(f, f);
    }

    default public <R> Fnc0<R> afterApplyTo(Fnc1<Boolean, ? extends R> f) {
        return this.afterApplyOnTo(f, f);
    }

    default public Prc0 afterApply(Fnc0<Boolean> f) {
        return this.afterApplyOn(f, f);
    }

    default public <R> Fnc0<R> afterApplyTo(Fnc0<? extends R> f) {
        return this.afterApplyOnTo(f, f);
    }

    default public Prc0 afterGet(Spc<Boolean> s) {
        return this.afterGetOn(s, s);
    }

    default public <R> Spc<R> afterGetTo(Spc<? extends R> s) {
        return this.afterGetOnTo(s, s);
    }

    default public Rnc afterAcceptTo(Csc1<Boolean> c) {
        return this.afterAcceptOnTo(c, c);
    }

    default public Prc0 afterAccept(Csc1<Boolean> c) {
        return this.afterAcceptOn(c, c);
    }

    default public Pr0 beforeWrap(Pr1<? super Spc<Boolean>> wrap) {
        return Pr0.fromFunction(this.beforeWrapTo(wrap.toFunction()));
    }

    default public <W> Fn0<W> beforeWrapTo(Fn1<? super Spc<Boolean>, ? extends W> wrap) {
        return () -> wrap.apply(this.toSupplier());
    }

    default public Prc0 afterRunOnSuccess(Rnc r) {
        return this.afterRunOn(r, Rnc.empty());
    }

    default public Rnc afterRunOnSuccessTo(Rnc r) {
        return this.afterRunOnTo(r, Rnc.empty());
    }

    default public Prc0 afterTestOnSuccess(Prc1<Boolean> p) {
        return this.afterTestOn(p, Prc1.empty());
    }

    default public Prc0 afterTestOnSuccess(Prc0 p) {
        return this.afterTestOn(p, Prc0.empty());
    }

    default public Prc0 afterApplyOnSuccess(Fnc1<Boolean, Boolean> f) {
        return this.afterApplyOn(f, Fnc1.empty());
    }

    default public <R> Fnc0<R> afterApplyOnSuccessTo(Fnc1<Boolean, ? extends R> f) {
        return this.afterApplyOnTo(f, Fnc1.empty());
    }

    default public Prc0 afterApplyOnSuccess(Fnc0<Boolean> f) {
        return this.afterApplyOn(f, Fnc0.empty());
    }

    default public <R> Fnc0<R> afterApplyOnSuccessTo(Fnc0<? extends R> f) {
        return this.afterApplyOnTo(f, Fnc0.empty());
    }

    default public Prc0 afterGetOnSuccess(Spc<Boolean> s) {
        return this.afterGetOn(s, Spc.empty());
    }

    default public <R> Spc<R> afterGetOnSuccessTo(Spc<? extends R> s) {
        return this.afterGetOnTo(s, Spc.empty());
    }

    default public Rnc afterAcceptOnSuccessTo(Csc1<Boolean> c) {
        return this.afterAcceptOnTo(c, Csc1.empty());
    }

    default public Prc0 afterAcceptOnSuccess(Csc1<Boolean> c) {
        return this.afterAcceptOn(c, Csc1.empty());
    }

    default public Prc0 afterRunOnFailure(Rnc r) {
        return this.negated().afterRunOnSuccess(r);
    }

    default public Rnc afterRunOnFailureTo(Rnc r) {
        return this.negated().afterRunOnSuccessTo(r);
    }

    default public Prc0 afterTestOnFailure(Prc1<Boolean> p) {
        return this.negated().afterTestOnSuccess(p);
    }

    default public Prc0 afterTestOnFailure(Prc0 p) {
        return this.negated().afterTestOnSuccess(p);
    }

    default public Prc0 afterApplyOnFailure(Fnc1<Boolean, Boolean> f) {
        return this.negated().afterApplyOnSuccess(f);
    }

    default public <R> Fnc0<R> afterApplyOnFailureTo(Fnc1<Boolean, ? extends R> f) {
        return this.negated().afterApplyOnSuccessTo(f);
    }

    default public Prc0 afterApplyOnFailure(Fnc0<Boolean> f) {
        return this.negated().afterApplyOnSuccess(f);
    }

    default public <R> Fnc0<R> afterApplyOnFailureTo(Fnc0<? extends R> f) {
        return this.negated().afterApplyOnSuccessTo(f);
    }

    default public Prc0 afterGetOnFailure(Spc<Boolean> s) {
        return this.negated().afterGetOnSuccess(s);
    }

    default public <R> Spc<R> afterGetOnFailureTo(Spc<? extends R> s) {
        return this.negated().afterGetOnSuccessTo(s);
    }

    default public Rnc afterAcceptOnFailureTo(Csc1<Boolean> c) {
        return this.negated().afterAcceptOnSuccessTo(c);
    }

    default public Prc0 afterAcceptOnFailure(Csc1<Boolean> c) {
        return this.negated().afterAcceptOnSuccess(c);
    }

    default public Prc0 beforeRun(Rnc r) {
        Objects.requireNonNull(r, "r is null");
        return () -> {
            r.run();
            return this.test();
        };
    }

    default public Prc0 beforeTestOnSuccess(Prc0 p, Prc0 onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return () -> p.test() ? this.test() : onFailure.test();
    }

    default public Prc0 beforeTestOnSuccess(Prc0 p, Spc<? extends Boolean> onFailure) {
        return this.beforeTestOnSuccess(p, Prc0.fromSupplier(onFailure));
    }

    default public Prc0 beforeTestOnSuccess(Prc0 p, Boolean onFailure) {
        return this.beforeTestOnSuccess(p, Prc0.value(onFailure));
    }

    default public Prc0 beforeTestOnSuccess(Prc0 p) {
        return this.beforeTestOnSuccess(p, Prc0.empty());
    }

    default public Prc0 beforeTestOnFailure(Prc0 p, Prc0 onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Prc0 beforeTestOnFailure(Prc0 p, Spc<? extends Boolean> onSuccess) {
        return this.beforeTestOnFailure(p, Prc0.fromSupplier(onSuccess));
    }

    default public Prc0 beforeTestOnFailure(Prc0 p, Boolean onSuccess) {
        return this.beforeTestOnFailure(p, Prc0.value(onSuccess));
    }

    default public Prc0 beforeTestOnFailure(Prc0 p) {
        return this.beforeTestOnFailure(p, Prc0.empty());
    }

    default public Prc0 beforeSuccessPassingThroughTest(Prc0 p, Prc0 onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return () -> p.test() ? this.apply() : onFailure.apply();
    }

    default public Prc0 beforeSuccessPassingThroughTest(Prc0 p, Spc<? extends Boolean> onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Prc0.fromSupplier(onFailure));
    }

    default public Prc0 beforeSuccessPassingThroughTest(Prc0 p, Boolean onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Prc0.value(onFailure));
    }

    default public Prc0 beforeSuccessPassingThroughTest(Prc0 p) {
        return this.beforeSuccessPassingThroughTest(p, Prc0.empty());
    }

    default public Prc0 beforeFailurePassingThroughTest(Prc0 p, Prc0 onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Prc0 beforeFailurePassingThroughTest(Prc0 p, Spc<? extends Boolean> onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Prc0.fromSupplier(onSuccess));
    }

    default public Prc0 beforeFailurePassingThroughTest(Prc0 p, Boolean onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Prc0.value(onSuccess));
    }

    default public Prc0 beforeFailurePassingThroughTest(Prc0 p) {
        return this.beforeFailurePassingThroughTest(p, Prc0.empty());
    }

    default public Prc1<Tuple0> tupled() {
        return tuple -> this.test();
    }

    default public Prc0 currying() {
        return this;
    }

    default public Pr0 unchecked() {
        return () -> {
            try {
                return this.test();
            }
            catch (Throwable t) {
                return (Boolean) SneakyThrow.sneakyThrow(t);
            }
        };
    }

    default public Prc0 negated() {
        return () -> this.test() == false;
    }

    default public Prc0 and(Prc0 p) {
        Objects.requireNonNull(p, "p is null");
        return () -> this.test() && p.test();
    }

    default public Prc0 or(Prc0 p) {
        Objects.requireNonNull(p, "p is null");
        return () -> this.test() || p.test();
    }

    default public <I1> Prc1<I1> ignoring1() {
        return i1 -> this.test();
    }

    default public <I1, I2> Prc2<I1, I2> ignoring2() {
        return (i1, i2) -> this.test();
    }

    default public <I1, I2, I3> Prc3<I1, I2, I3> ignoring3() {
        return (i1, i2, i3) -> this.test();
    }

    default public <I1, I2, I3, I4> Prc4<I1, I2, I3, I4> ignoring4() {
        return (i1, i2, i3, i4) -> this.test();
    }

    default public <I1, I2, I3, I4, I5> Prc5<I1, I2, I3, I4, I5> ignoring5() {
        return (i1, i2, i3, i4, i5) -> this.test();
    }

    default public <I1, I2, I3, I4, I5, I6> Prc6<I1, I2, I3, I4, I5, I6> ignoring6() {
        return (i1, i2, i3, i4, i5, i6) -> this.test();
    }

    default public <I1, I2, I3, I4, I5, I6, I7> Prc7<I1, I2, I3, I4, I5, I6, I7> ignoring7() {
        return (i1, i2, i3, i4, i5, i6, i7) -> this.test();
    }

    default public <I1, I2, I3, I4, I5, I6, I7, I8> Prc8<I1, I2, I3, I4, I5, I6, I7, I8> ignoring8() {
        return (i1, i2, i3, i4, i5, i6, i7, i8) -> this.test();
    }

    default public Prc0 memoized() {
        return CheckedFunction0.super.memoized()::apply;
    }

    default public Pr0 recover(Fn1<? super Throwable, ? extends Pr0> recover) {
        Objects.requireNonNull(recover, "recover is null");
        return () -> {
            try {
                return this.test();
            }
            catch (Throwable throwable) {
                Pr0 pred = (Pr0) recover.apply(throwable);
                Objects.requireNonNull(pred, () -> "recover return null for " + throwable.getClass() + ": " + throwable.getMessage());
                return pred.test();
            }

        };
    }

}

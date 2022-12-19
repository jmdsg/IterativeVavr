package com.fiberg.iterative.function;

import com.fiberg.iterative.core.IterativeInternals;
import com.fiberg.iterative.function.Cs1;
import com.fiberg.iterative.function.Cs3;
import com.fiberg.iterative.function.Fn0;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fn2;
import com.fiberg.iterative.function.Fn3;
import com.fiberg.iterative.function.Fn4;
import com.fiberg.iterative.function.Fn5;
import com.fiberg.iterative.function.Fn6;
import com.fiberg.iterative.function.Fn7;
import com.fiberg.iterative.function.Fn8;
import com.fiberg.iterative.function.Pr0;
import com.fiberg.iterative.function.Pr1;
import com.fiberg.iterative.function.Pr2;
import com.fiberg.iterative.function.Pr4;
import com.fiberg.iterative.function.Pr5;
import com.fiberg.iterative.function.Pr6;
import com.fiberg.iterative.function.Pr7;
import com.fiberg.iterative.function.Pr8;
import com.fiberg.iterative.function.Prc3;
import com.fiberg.iterative.function.Predicates;
import com.fiberg.iterative.function.Rn;
import com.fiberg.iterative.function.Sp;
import com.fiberg.iterative.function.Spc;
import io.vavr.Function3;
import io.vavr.Tuple;
import io.vavr.Tuple3;
import java.io.Serializable;
import java.util.Objects;

@FunctionalInterface
public interface Pr3<T1, T2, T3> extends Function3<T1, T2, T3, Boolean> {

    default public Boolean apply(T1 t1, T2 t2, T3 t3) {
        return this.test(t1, t2, t3);
    }

    public static <T1, T2, T3> Pr3<T1, T2, T3> narrow(Pr3<? super T1, ? super T2, ? super T3> p) {
        @SuppressWarnings("unchecked")
        final Pr3<T1, T2, T3> pr = (Pr3<T1, T2, T3>) p;
        return pr;
    }

    public static <T1, T2, T3> Pr3<T1, T2, T3> empty() {
        return IterativeInternals::none;
    }

    public static <T1, T2, T3> Pr3<T1, T2, T3> value(Boolean b) {
        return (t1, t2, t3) -> b;
    }

    public static <T1, T2, T3> Pr3<T1, T2, T3> of(Pr3<? super T1, ? super T2, ? super T3> p) {
        return Pr3.narrow(p);
    }

    public static <T1, T2, T3> Pr3<T1, T2, T3> of1(Pr1<? super T1> f) {
        return Pr3.<T1, T2, T3>narrow(f.ignoring2Rt());
    }

    public static <T1, T2, T3> Pr3<T1, T2, T3> of2(Pr1<? super T2> f) {
        return Pr3.<T1, T2, T3>narrow(f.ignoring1Rt().ignoring1Lt());
    }

    public static <T1, T2, T3> Pr3<T1, T2, T3> of3(Pr1<? super T3> f) {
        return Pr3.<T1, T2, T3>narrow(f.ignoring2Lt());
    }

    public static <T1, T2, T3> Pr3<T1, T2, T3> fromFunction(Fn3<? super T1, ? super T2, ? super T3, Boolean> f) {
        return f::apply;
    }

    public static <T1, T2, T3> Pr3<T1, T2, T3> fromSupplier(Sp<? extends Boolean> s) {
        return Pr3.fromFunction(Sp.<Boolean>narrow(s).toFunction().ignoring3());
    }

    public static <T1, T2, T3> Pr3<T1, T2, T3> negate(Pr3<? super T1, ? super T2, ? super T3> p) {
        return Pr3.<T1, T2, T3>narrow(p.negated());
    }

    @SafeVarargs
    public static <T1, T2, T3> Pr3<T1, T2, T3> and(Pr3<? super T1, ? super T2, ? super T3> ... ps) {
        Objects.requireNonNull(ps, "ps is null");
        return Predicates.and(ps);
    }

    public static <T1, T2, T3> Pr3<T1, T2, T3> and(Pr3<? super T1, ? super T2, ? super T3> p, Pr0 ... ps) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(ps, "ps is null");
        return ps.length == 0 ? Pr3.narrow(p) : Pr3.<T1, T2, T3>narrow(p).and(Predicates.and(ps));
    }

    @SafeVarargs
    public static <T1, T2, T3> Pr3<T1, T2, T3> or(Pr3<? super T1, ? super T2, ? super T3> ... ps) {
        Objects.requireNonNull(ps, "ps is null");
        return Predicates.or(ps);
    }

    public static <T1, T2, T3> Pr3<T1, T2, T3> or(Pr3<? super T1, ? super T2, ? super T3> p, Pr0 ... ps) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(ps, "ps is null");
        return ps.length == 0 ? Pr3.narrow(p) : Pr3.<T1, T2, T3>narrow(p).or(Predicates.or(ps));
    }

    public static <T1, T2, T3> Pr1<Tuple3<T1, T2, T3>> tuple(Pr3<? super T1, ? super T2, ? super T3> p) {
        return Pr3.<T1, T2, T3>of(p).tupled();
    }

    public static <T1, T2, T3> Pr3<T1, T2, T3> detuple(Pr1<? super Tuple3<? extends T1, ? extends T2, ? extends T3>> p) {
        return (t1, t2, t3) -> p.test(Tuple.of(t1, t2, t3));
    }

    public static <T1, T2, T3> Pr3<T1, T2, T3> uncheck(Prc3<? super T1, ? super T2, ? super T3> p) {
        Objects.requireNonNull(p, "p is null");
        return Prc3.<T1, T2, T3>narrow(p).unchecked();
    }

    public static <T1, T2, T3> Pr3<T1, T2, T3> ignore(Pr0 p) {
        return p.ignoring3();
    }

    public static <T1, T2, T3> Pr3<T1, T2, T3> ignore2Rt(Pr1<? super T1> p) {
        return Pr1.<T1>narrow(p).ignoring2Rt();
    }

    public static <T1, T2, T3> Pr3<T1, T2, T3> ignore2Lt(Pr1<? super T3> p) {
        return Pr1.<T3>narrow(p).ignoring2Lt();
    }

    public static <T1, T2, T3> Pr3<T1, T2, T3> ignore1Rt(Pr2<? super T1, ? super T2> p) {
        return Pr2.<T1, T2>narrow(p).ignoring1Rt();
    }

    public static <T1, T2, T3> Pr3<T1, T2, T3> ignore1Lt(Pr2<? super T2, ? super T3> p) {
        return Pr2.<T2, T3>narrow(p).ignoring1Lt();
    }

    public static <T1, T2, T3, T4> Pr3<T1, T2, T3> passRt(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p, T4 t4) {
        return Pr3.narrow(p.testRt(t4));
    }

    public static <T1, T2, T3, T4, T5> Pr3<T1, T2, T3> passRt(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, T4 t4, T5 t5) {
        return Pr3.narrow(p.testRt(t4, t5));
    }

    public static <T1, T2, T3, T4, T5, T6> Pr3<T1, T2, T3> passRt(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, T4 t4, T5 t5, T6 t6) {
        return Pr3.narrow(p.testRt(t4, t5, t6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr3<T1, T2, T3> passRt(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, T4 t4, T5 t5, T6 t6, T7 t7) {
        return Pr3.narrow(p.testRt(t4, t5, t6, t7));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr3<T1, T2, T3> passRt(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Pr3.narrow(p.testRt(t4, t5, t6, t7, t8));
    }

    public static <T1, T2, T3, T4> Pr3<T2, T3, T4> passLt(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p, T1 t1) {
        return Pr3.narrow(p.testLt(t1));
    }

    public static <T1, T2, T3, T4, T5> Pr3<T3, T4, T5> passLt(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, T1 t1, T2 t2) {
        return Pr3.narrow(p.testLt(t1, t2));
    }

    public static <T1, T2, T3, T4, T5, T6> Pr3<T4, T5, T6> passLt(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, T1 t1, T2 t2, T3 t3) {
        return Pr3.narrow(p.testLt(t1, t2, t3));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr3<T5, T6, T7> passLt(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, T1 t1, T2 t2, T3 t3, T4 t4) {
        return Pr3.narrow(p.testLt(t1, t2, t3, t4));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr3<T6, T7, T8> passLt(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return Pr3.narrow(p.testLt(t1, t2, t3, t4, t5));
    }

    public static <T1, T2, T3> boolean passAndTest(Pr3<? super T1, ? super T2, ? super T3> p, T1 t1, T2 t2, T3 t3) {
        return Pr0.pass(p, t1, t2, t3).test();
    }

    public static <T1, T2, T3> Pr3<T3, T2, T1> invert(Pr3<? super T1, ? super T2, ? super T3> p) {
        return Pr3.<T1, T2, T3>narrow(p).inverted();
    }

    public boolean test(T1 t1, T2 t2, T3 t3);

    default public Pr2<T2, T3> testLt(T1 t1) {
        return (t2, t3) -> this.test(t1, t2, t3);
    }

    default public Pr1<T3> testLt(T1 t1, T2 t2) {
        return t3 -> this.test(t1, t2, t3);
    }

    default public Pr2<T1, T2> testRt(T3 t3) {
        return (t1, t2) -> this.test(t1, t2, t3);
    }

    default public Pr1<T1> testRt(T2 t2, T3 t3) {
        return t1 -> this.test(t1, t2, t3);
    }

    default public Fn3<T1, T2, T3, Boolean> toFunction() {
        return this::test;
    }

    default public Cs3<T1, T2, T3> toConsumer() {
        return this::test;
    }

    default public Pr0 toPredicate(T1 t1, T2 t2, T3 t3) {
        return () -> this.test(t1, t2, t3);
    }

    default public Sp<Boolean> toSupplier(T1 t1, T2 t2, T3 t3) {
        return this.toPredicate(t1, t2, t3).toSupplier();
    }

    default public Rn toRunnable(T1 t1, T2 t2, T3 t3) {
        return this.toPredicate(t1, t2, t3).toRunnable();
    }

    default public <R> R passEvaluated(Sp<? extends R> onSuccess, Sp<? extends R> onFailure, T1 t1, T2 t2, T3 t3) {
        return this.toPredicate(t1, t2, t3).evaluated(onSuccess, onFailure);
    }

    default public <R> R passEvaluated(Sp<? extends R> onSuccess, R onFailure, T1 t1, T2 t2, T3 t3) {
        return this.toPredicate(t1, t2, t3).evaluated(onSuccess, onFailure);
    }

    default public <R> R passEvaluated(R onSuccess, Sp<? extends R> onFailure, T1 t1, T2 t2, T3 t3) {
        return this.toPredicate(t1, t2, t3).evaluated(onSuccess, onFailure);
    }

    default public <R> R passEvaluated(R onSuccess, R onFailure, T1 t1, T2 t2, T3 t3) {
        return this.toPredicate(t1, t2, t3).evaluated(onSuccess, onFailure);
    }

    default public <R> R passEvaluatedOnSuccess(Sp<? extends R> onSuccess, T1 t1, T2 t2, T3 t3) {
        return this.toPredicate(t1, t2, t3).evaluatedOnSuccess(onSuccess);
    }

    default public <R> R passEvaluatedOnFailure(Sp<? extends R> onFailure, T1 t1, T2 t2, T3 t3) {
        return this.toPredicate(t1, t2, t3).evaluatedOnFailure(onFailure);
    }

    default public <R> R passEvaluatedOnSuccess(R onSuccess, T1 t1, T2 t2, T3 t3) {
        return this.toPredicate(t1, t2, t3).evaluatedOnSuccess(onSuccess);
    }

    default public <R> R passEvaluatedOnFailure(R onFailure, T1 t1, T2 t2, T3 t3) {
        return this.toPredicate(t1, t2, t3).evaluatedOnFailure(onFailure);
    }

    default public Pr3<T1, T2, T3> afterRunOn(Rn onSuccess, Rn onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3) -> {
            boolean result = this.test(t1, t2, t3);
            (result ? onSuccess : onFailure).run();
            return result;
        };
    }

    default public Pr3<T1, T2, T3> afterTestOn(Pr1<Boolean> onSuccess, Pr1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.toFunction(), onFailure.toFunction());
    }

    default public Pr3<T1, T2, T3> afterTestOn(Pr0 onSuccess, Pr0 onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterTestOn(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Pr3<T1, T2, T3> afterApplyOn(Fn1<Boolean, Boolean> onSuccess, Fn1<Boolean, Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return Pr3.fromFunction(this.afterApplyOnTo(onSuccess, onFailure));
    }

    default public <R> Fn3<T1, T2, T3, R> afterApplyOnTo(Fn1<Boolean, ? extends R> onSuccess, Fn1<Boolean, ? extends R> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3) -> {
            boolean result = this.test(t1, t2, t3);
            return (result ? onSuccess : onFailure).apply(result);
        };
    }

    default public Pr3<T1, T2, T3> afterApplyOn(Fn0<Boolean> onSuccess, Fn0<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onFailure.ignoring1(), onFailure.ignoring1());
    }

    default public <R> Fn3<T1, T2, T3, R> afterApplyOnTo(Fn0<? extends R> onSuccess, Fn0<? extends R> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOnTo(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Pr3<T1, T2, T3> afterGetOn(Sp<Boolean> onSuccess, Sp<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Cs3<T1, T2, T3> afterAcceptOnTo(Cs1<Boolean> onSuccess, Cs1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOnTo(onSuccess.toFunction(null), onFailure.toFunction(null)).toConsumer();
    }

    default public Pr3<T1, T2, T3> afterAcceptOn(Cs1<Boolean> onSuccess, Cs1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.toFunction(null), onFailure.toFunction(null));
    }

    default public Pr3<T1, T2, T3> afterRun(Rn r) {
        return this.afterRunOn(r, r);
    }

    default public Pr3<T1, T2, T3> afterTest(Pr1<Boolean> p) {
        return this.afterTestOn(p, p);
    }

    default public Pr3<T1, T2, T3> afterTest(Pr0 p) {
        return this.afterTestOn(p, p);
    }

    default public Pr3<T1, T2, T3> afterApply(Fn1<Boolean, Boolean> f) {
        return this.afterApplyOn(f, f);
    }

    default public <R> Fn3<T1, T2, T3, R> afterApplyTo(Fn1<Boolean, ? extends R> f) {
        return this.afterApplyOnTo(f, f);
    }

    default public Pr3<T1, T2, T3> afterApply(Fn0<Boolean> f) {
        return this.afterApplyOn(f, f);
    }

    default public <R> Fn3<T1, T2, T3, R> afterApplyTo(Fn0<? extends R> f) {
        return this.afterApplyOnTo(f, f);
    }

    default public Pr3<T1, T2, T3> afterGet(Sp<Boolean> s) {
        return this.afterGetOn(s, s);
    }

    default public Cs3<T1, T2, T3> afterAcceptTo(Cs1<Boolean> c) {
        return this.afterAcceptOnTo(c, c);
    }

    default public Pr3<T1, T2, T3> afterAccept(Cs1<Boolean> c) {
        return this.afterAcceptOn(c, c);
    }

    default public Pr3<T1, T2, T3> beforeWrap(Pr1<? super Spc<Boolean>> wrap) {
        return Pr3.fromFunction(this.beforeWrapTo(wrap.toFunction()));
    }

    default public <W> Fn3<T1, T2, T3, W> beforeWrapTo(Fn1<? super Spc<Boolean>, ? extends W> wrap) {
        return (t1, t2, t3) -> wrap.apply(this.toSupplier(t1, t2, t3).checked());
    }

    default public Pr3<T1, T2, T3> afterRunOnSuccess(Rn r) {
        return this.afterRunOn(r, Rn.empty());
    }

    default public Pr3<T1, T2, T3> afterTestOnSuccess(Pr1<Boolean> p) {
        return this.afterTestOn(p, Pr1.empty());
    }

    default public Pr3<T1, T2, T3> afterTestOnSuccess(Pr0 p) {
        return this.afterTestOn(p, Pr0.empty());
    }

    default public Pr3<T1, T2, T3> afterApplyOnSuccess(Fn1<Boolean, Boolean> f) {
        return this.afterApplyOn(f, Fn1.empty());
    }

    default public <R> Fn3<T1, T2, T3, R> afterApplyOnSuccessTo(Fn1<Boolean, ? extends R> f) {
        return this.afterApplyOnTo(f, Fn1.empty());
    }

    default public Pr3<T1, T2, T3> afterApplyOnSuccess(Fn0<Boolean> f) {
        return this.afterApplyOn(f, Fn0.empty());
    }

    default public <R> Fn3<T1, T2, T3, R> afterApplyOnSuccessTo(Fn0<? extends R> f) {
        return this.afterApplyOnTo(f, Fn0.empty());
    }

    default public Pr3<T1, T2, T3> afterGetOnSuccess(Sp<Boolean> s) {
        return this.afterGetOn(s, Sp.empty());
    }

    default public Cs3<T1, T2, T3> afterAcceptOnSuccessTo(Cs1<Boolean> c) {
        return this.afterAcceptOnTo(c, Cs1.empty());
    }

    default public Pr3<T1, T2, T3> afterAcceptOnSuccess(Cs1<Boolean> c) {
        return this.afterAcceptOn(c, Cs1.empty());
    }

    default public Pr3<T1, T2, T3> afterRunOnFailure(Rn r) {
        return this.negated().afterRunOnSuccess(r);
    }

    default public Pr3<T1, T2, T3> afterTestOnFailure(Pr1<Boolean> p) {
        return this.negated().afterTestOnSuccess(p);
    }

    default public Pr3<T1, T2, T3> afterTestOnFailure(Pr0 p) {
        return this.negated().afterTestOnSuccess(p);
    }

    default public Pr3<T1, T2, T3> afterApplyOnFailure(Fn1<Boolean, Boolean> f) {
        return this.negated().afterApplyOnSuccess(f);
    }

    default public <R> Fn3<T1, T2, T3, R> afterApplyOnFailureTo(Fn1<Boolean, ? extends R> f) {
        return this.negated().afterApplyOnSuccessTo(f);
    }

    default public Pr3<T1, T2, T3> afterApplyOnFailure(Fn0<Boolean> f) {
        return this.negated().afterApplyOnSuccess(f);
    }

    default public <R> Fn3<T1, T2, T3, R> afterApplyOnFailureTo(Fn0<? extends R> f) {
        return this.negated().afterApplyOnSuccessTo(f);
    }

    default public Pr3<T1, T2, T3> afterGetOnFailure(Sp<Boolean> s) {
        return this.negated().afterGetOnSuccess(s);
    }

    default public Cs3<T1, T2, T3> afterAcceptOnFailureTo(Cs1<Boolean> c) {
        return this.negated().afterAcceptOnSuccessTo(c);
    }

    default public Pr3<T1, T2, T3> afterAcceptOnFailure(Cs1<Boolean> c) {
        return this.negated().afterAcceptOnSuccess(c);
    }

    default public Pr3<T1, T2, T3> beforeRun(Rn r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2, t3) -> {
            r.run();
            return this.test(t1, t2, t3);
        };
    }

    default public <B1, B2, B3> Pr3<B1, B2, B3> beforeApply(Fn3<? super B1, ? super B2, ? super B3, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        return this.beforeApply3(f);
    }

    default public <B1> Pr1<B1> beforeApply1(Fn1<? super B1, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return b1 -> this.tupled().test(Tuple.narrow((f.apply(b1))));
    }

    default public <B1, B2> Pr2<B1, B2> beforeApply2(Fn2<? super B1, ? super B2, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2))));
    }

    default public <B1, B2, B3> Pr3<B1, B2, B3> beforeApply3(Fn3<? super B1, ? super B2, ? super B3, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3))));
    }

    default public <B1, B2, B3, B4> Pr4<B1, B2, B3, B4> beforeApply4(Fn4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4))));
    }

    default public <B1, B2, B3, B4, B5> Pr5<B1, B2, B3, B4, B5> beforeApply5(Fn5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5))));
    }

    default public <B1, B2, B3, B4, B5, B6> Pr6<B1, B2, B3, B4, B5, B6> beforeApply6(Fn6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Pr7<B1, B2, B3, B4, B5, B6, B7> beforeApply7(Fn7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Pr8<B1, B2, B3, B4, B5, B6, B7, B8> beforeApply8(Fn8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7, b8) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7, b8))));
    }

    default public Pr3<T1, T2, T3> beforeTestOnSuccess(Pr0 p, Pr3<? super T1, ? super T2, ? super T3> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3) -> p.test() ? this.test(t1, t2, t3) : onFailure.test(t1, t2, t3);
    }

    default public Pr3<T1, T2, T3> beforeTestOnSuccess(Pr0 p, Sp<? extends Boolean> onFailure) {
        return this.beforeTestOnSuccess(p, Pr3.fromSupplier(onFailure));
    }

    default public Pr3<T1, T2, T3> beforeTestOnSuccess(Pr0 p, Boolean onFailure) {
        return this.beforeTestOnSuccess(p, Pr3.value(onFailure));
    }

    default public Pr3<T1, T2, T3> beforeTestOnSuccess(Pr0 p) {
        return this.beforeTestOnSuccess(p, Pr3.empty());
    }

    default public Pr3<T1, T2, T3> beforeTestOnFailure(Pr0 p, Pr3<? super T1, ? super T2, ? super T3> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Pr3<T1, T2, T3> beforeTestOnFailure(Pr0 p, Sp<? extends Boolean> onSuccess) {
        return this.beforeTestOnFailure(p, Pr3.fromSupplier(onSuccess));
    }

    default public Pr3<T1, T2, T3> beforeTestOnFailure(Pr0 p, Boolean onSuccess) {
        return this.beforeTestOnFailure(p, Pr3.value(onSuccess));
    }

    default public Pr3<T1, T2, T3> beforeTestOnFailure(Pr0 p) {
        return this.beforeTestOnFailure(p, Pr3.empty());
    }

    default public Pr0 beforeGet(Sp<? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> s) {
        Objects.requireNonNull(s, "s is null");
        return () -> this.tupled().test(Tuple.narrow((s.get())));
    }

    default public Pr3<T3, T2, T1> inverted() {
        return (t3, t2, t1) -> this.test(t1, t2, t3);
    }

    default public <S> Pr3<T1, T2, T3> afterPassingThroughApplyOn(Fn3<? super T1, ? super T2, ? super T3, ? extends S> onSuccess, Fn3<? super T1, ? super T2, ? super T3, ? extends S> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3) -> {
            boolean result = this.test(t1, t2, t3);
            Fn3.narrow(result ? onSuccess : onFailure).apply(t1, t2, t3);
            return result;
        };
    }

    default public <S> Fn3<T1, T2, T3, S> afterPassingThroughApplyOnTo(Fn3<? super T1, ? super T2, ? super T3, ? extends S> onSuccess, Fn3<? super T1, ? super T2, ? super T3, ? extends S> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3) -> Fn3.narrow(this.test(t1, t2, t3) ? onSuccess : onFailure).apply(t1, t2, t3);
    }

    default public Pr3<T1, T2, T3> afterPassingThroughAcceptOn(Cs3<? super T1, ? super T2, ? super T3> onSuccess, Cs3<? super T1, ? super T2, ? super T3> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3) -> {
            boolean result = this.test(t1, t2, t3);
            Cs3.narrow(result ? onSuccess : onFailure).accept(t1, t2, t3);
            return result;
        };
    }

    default public Cs3<T1, T2, T3> afterPassingThroughAcceptOnTo(Cs3<? super T1, ? super T2, ? super T3> onSuccess, Cs3<? super T1, ? super T2, ? super T3> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3) -> Cs3.narrow(this.test(t1, t2, t3) ? onSuccess : onFailure).accept(t1, t2, t3);
    }

    default public Pr3<T1, T2, T3> afterPassingThroughTestOn(Pr3<? super T1, ? super T2, ? super T3> onSuccess, Pr3<? super T1, ? super T2, ? super T3> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3) -> Pr3.narrow(this.test(t1, t2, t3) ? onSuccess : onFailure).test(t1, t2, t3);
    }

    default public <S> Pr3<T1, T2, T3> afterPassingThroughApply(Fn3<? super T1, ? super T2, ? super T3, ? extends S> f) {
        return this.afterPassingThroughApplyOn(f, f);
    }

    default public <S> Fn3<T1, T2, T3, S> afterPassingThroughApplyTo(Fn3<? super T1, ? super T2, ? super T3, ? extends S> f) {
        return this.afterPassingThroughApplyOnTo(f, f);
    }

    default public Pr3<T1, T2, T3> afterPassingThroughAccept(Cs3<? super T1, ? super T2, ? super T3> c) {
        return this.afterPassingThroughAcceptOn(c, c);
    }

    default public Cs3<T1, T2, T3> afterPassingThroughAcceptTo(Cs3<? super T1, ? super T2, ? super T3> c) {
        return this.afterPassingThroughAcceptOnTo(c, c);
    }

    default public Pr3<T1, T2, T3> afterPassingThroughTest(Pr3<? super T1, ? super T2, ? super T3> p) {
        return this.afterPassingThroughTestOn(p, p);
    }

    default public <S> Pr3<T1, T2, T3> afterSuccessPassingThroughApply(Fn3<? super T1, ? super T2, ? super T3, ? extends S> onSuccess) {
        return this.afterPassingThroughApplyOn(onSuccess, Fn3.empty());
    }

    default public <S> Fn3<T1, T2, T3, S> afterSuccessPassingThroughApplyTo(Fn3<? super T1, ? super T2, ? super T3, ? extends S> onSuccess) {
        return this.afterPassingThroughApplyOnTo(onSuccess, Fn3.empty());
    }

    default public Pr3<T1, T2, T3> afterSuccessPassingThroughAccept(Cs3<? super T1, ? super T2, ? super T3> onSuccess) {
        return this.afterPassingThroughAcceptOn(onSuccess, Cs3.empty());
    }

    default public Cs3<T1, T2, T3> afterSuccessPassingThroughAcceptTo(Cs3<? super T1, ? super T2, ? super T3> onSuccess) {
        return this.afterPassingThroughAcceptOnTo(onSuccess, Cs3.empty());
    }

    default public Pr3<T1, T2, T3> afterSuccessPassingThroughTest(Pr3<? super T1, ? super T2, ? super T3> onSuccess) {
        return this.afterPassingThroughTestOn(onSuccess, Pr3.empty());
    }

    default public <S> Pr3<T1, T2, T3> afterFailurePassingThroughApply(Fn3<? super T1, ? super T2, ? super T3, ? extends S> onFailure) {
        return this.negated().afterSuccessPassingThroughApply(onFailure);
    }

    default public <S> Fn3<T1, T2, T3, S> afterFailurePassingThroughApplyTo(Fn3<? super T1, ? super T2, ? super T3, ? extends S> onFailure) {
        return this.negated().afterSuccessPassingThroughApplyTo(onFailure);
    }

    default public Pr3<T1, T2, T3> afterFailurePassingThroughAccept(Cs3<? super T1, ? super T2, ? super T3> onFailure) {
        return this.negated().afterSuccessPassingThroughAccept(onFailure);
    }

    default public Cs3<T1, T2, T3> afterFailurePassingThroughAcceptTo(Cs3<? super T1, ? super T2, ? super T3> onFailure) {
        return this.negated().afterSuccessPassingThroughAcceptTo(onFailure);
    }

    default public Pr3<T1, T2, T3> afterFailurePassingThroughTest(Pr3<? super T1, ? super T2, ? super T3> onFailure) {
        return this.negated().afterSuccessPassingThroughTest(onFailure);
    }

    default public <R> Pr3<T1, T2, T3> beforePassingThroughApply(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3) -> {
            f.apply(t1, t2, t3);
            return this.test(t1, t2, t3);
        };
    }

    default public Pr3<T1, T2, T3> beforePassingThroughTest(Pr3<? super T1, ? super T2, ? super T3> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3) -> {
            p.test(t1, t2, t3);
            return this.test(t1, t2, t3);
        };
    }

    default public Pr3<T1, T2, T3> beforePassingThroughAccept(Cs3<? super T1, ? super T2, ? super T3> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3) -> {
            c.accept(t1, t2, t3);
            return this.test(t1, t2, t3);
        };
    }

    default public Pr3<T1, T2, T3> beforeSuccessPassingThroughTest(Pr3<? super T1, ? super T2, ? super T3> p, Pr3<? super T1, ? super T2, ? super T3> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3) -> p.test(t1, t2, t3) ? this.test(t1, t2, t3) : onFailure.test(t1, t2, t3);
    }

    default public Pr3<T1, T2, T3> beforeSuccessPassingThroughTest(Pr3<? super T1, ? super T2, ? super T3> p, Sp<? extends Boolean> onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Pr3.fromSupplier(onFailure));
    }

    default public Pr3<T1, T2, T3> beforeSuccessPassingThroughTest(Pr3<? super T1, ? super T2, ? super T3> p, Boolean onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Pr3.value(onFailure));
    }

    default public Pr3<T1, T2, T3> beforeSuccessPassingThroughTest(Pr3<? super T1, ? super T2, ? super T3> p) {
        return this.beforeSuccessPassingThroughTest(p, Pr3.empty());
    }

    default public Pr3<T1, T2, T3> beforeFailurePassingThroughTest(Pr3<? super T1, ? super T2, ? super T3> p, Pr3<? super T1, ? super T2, ? super T3> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Pr3<T1, T2, T3> beforeFailurePassingThroughTest(Pr3<? super T1, ? super T2, ? super T3> p, Sp<? extends Boolean> onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Pr3.fromSupplier(onSuccess));
    }

    default public Pr3<T1, T2, T3> beforeFailurePassingThroughTest(Pr3<? super T1, ? super T2, ? super T3> p, Boolean onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Pr3.value(onSuccess));
    }

    default public Pr3<T1, T2, T3> beforeFailurePassingThroughTest(Pr3<? super T1, ? super T2, ? super T3> p) {
        return this.beforeFailurePassingThroughTest(p, Pr3.empty());
    }

    default public Pr1<Tuple3<T1, T2, T3>> tupled() {
        return tuple -> this.test(tuple._1(), tuple._2(), tuple._3());
    }

    default public Fn1<T1, Fn1<T2, Pr1<T3>>> currying() {
        return t1 -> t2 -> t3 -> this.test(t1, t2, t3);
    }

    default public Prc3<T1, T2, T3> checked() {
        return this::test;
    }

    default public Pr3<T1, T2, T3> negated() {
        return (t1, t2, t3) -> !this.test(t1, t2, t3);
    }

    default public Pr3<T1, T2, T3> and(Pr3<? super T1, ? super T2, ? super T3> p) {
        return (t1, t2, t3) -> this.test(t1, t2, t3) && p.test(t1, t2, t3);
    }

    default public Pr3<T1, T2, T3> or(Pr3<? super T1, ? super T2, ? super T3> p) {
        return (t1, t2, t3) -> this.test(t1, t2, t3) || p.test(t1, t2, t3);
    }

    default public Pr3<T1, T2, T3> and(Pr0 p) {
        return (t1, t2, t3) -> this.test(t1, t2, t3) && p.test();
    }

    default public Pr3<T1, T2, T3> or(Pr0 p) {
        return (t1, t2, t3) -> this.test(t1, t2, t3) || p.test();
    }

    default public <I1> Pr4<I1, T1, T2, T3> ignoring1Lt() {
        return (i1, t1, t2, t3) -> this.test(t1, t2, t3);
    }

    default public <I1> Pr4<T1, T2, T3, I1> ignoring1Rt() {
        return (t1, t2, t3, i1) -> this.test(t1, t2, t3);
    }

    default public <I1, I2> Pr5<I1, I2, T1, T2, T3> ignoring2Lt() {
        return (i1, i2, t1, t2, t3) -> this.test(t1, t2, t3);
    }

    default public <I1, I2> Pr5<T1, T2, T3, I1, I2> ignoring2Rt() {
        return (t1, t2, t3, i1, i2) -> this.test(t1, t2, t3);
    }

    default public <I1, I2, I3> Pr6<I1, I2, I3, T1, T2, T3> ignoring3Lt() {
        return (i1, i2, i3, t1, t2, t3) -> this.test(t1, t2, t3);
    }

    default public <I1, I2, I3> Pr6<T1, T2, T3, I1, I2, I3> ignoring3Rt() {
        return (t1, t2, t3, i1, i2, i3) -> this.test(t1, t2, t3);
    }

    default public <I1, I2, I3, I4> Pr7<I1, I2, I3, I4, T1, T2, T3> ignoring4Lt() {
        return (i1, i2, i3, i4, t1, t2, t3) -> this.test(t1, t2, t3);
    }

    default public <I1, I2, I3, I4> Pr7<T1, T2, T3, I1, I2, I3, I4> ignoring4Rt() {
        return (t1, t2, t3, i1, i2, i3, i4) -> this.test(t1, t2, t3);
    }

    default public <I1, I2, I3, I4, I5> Pr8<I1, I2, I3, I4, I5, T1, T2, T3> ignoring5Lt() {
        return (i1, i2, i3, i4, i5, t1, t2, t3) -> this.test(t1, t2, t3);
    }

    default public <I1, I2, I3, I4, I5> Pr8<T1, T2, T3, I1, I2, I3, I4, I5> ignoring5Rt() {
        return (t1, t2, t3, i1, i2, i3, i4, i5) -> this.test(t1, t2, t3);
    }

    default public Pr3<T1, T2, T3> memoized() {
        return Function3.super.memoized()::apply;
    }

}

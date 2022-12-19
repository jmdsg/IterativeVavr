package com.fiberg.iterative.function;

import com.fiberg.iterative.core.IterativeInternals;
import com.fiberg.iterative.function.Cs1;
import com.fiberg.iterative.function.Cs4;
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
import com.fiberg.iterative.function.Pr3;
import com.fiberg.iterative.function.Pr5;
import com.fiberg.iterative.function.Pr6;
import com.fiberg.iterative.function.Pr7;
import com.fiberg.iterative.function.Pr8;
import com.fiberg.iterative.function.Prc4;
import com.fiberg.iterative.function.Predicates;
import com.fiberg.iterative.function.Rn;
import com.fiberg.iterative.function.Sp;
import com.fiberg.iterative.function.Spc;
import io.vavr.Function4;
import io.vavr.Tuple;
import io.vavr.Tuple4;
import java.io.Serializable;
import java.util.Objects;

@FunctionalInterface
public interface Pr4<T1, T2, T3, T4> extends Function4<T1, T2, T3, T4, Boolean> {

    default public Boolean apply(T1 t1, T2 t2, T3 t3, T4 t4) {
        return this.test(t1, t2, t3, t4);
    }

    public static <T1, T2, T3, T4> Pr4<T1, T2, T3, T4> narrow(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        return p;
    }

    public static <T1, T2, T3, T4> Pr4<T1, T2, T3, T4> empty() {
        return IterativeInternals::none;
    }

    public static <T1, T2, T3, T4> Pr4<T1, T2, T3, T4> value(Boolean b) {
        return (t1, t2, t3, t4) -> b;
    }

    public static <T1, T2, T3, T4> Pr4<T1, T2, T3, T4> of(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        return Pr4.narrow(p);
    }

    public static <T1, T2, T3, T4> Pr4<T1, T2, T3, T4> of1(Pr1<? super T1> f) {
        return Pr4.narrow(f.ignoring3Rt());
    }

    public static <T1, T2, T3, T4> Pr4<T1, T2, T3, T4> of2(Pr1<? super T2> f) {
        return Pr4.narrow(f.ignoring2Rt().ignoring1Lt());
    }

    public static <T1, T2, T3, T4> Pr4<T1, T2, T3, T4> of3(Pr1<? super T3> f) {
        return Pr4.narrow(f.ignoring1Rt().ignoring2Lt());
    }

    public static <T1, T2, T3, T4> Pr4<T1, T2, T3, T4> of4(Pr1<? super T4> f) {
        return Pr4.narrow(f.ignoring3Lt());
    }

    public static <T1, T2, T3, T4> Pr4<T1, T2, T3, T4> fromFunction(Fn4<? super T1, ? super T2, ? super T3, ? super T4, Boolean> f) {
        return (arg_0, arg_1, arg_2, arg_3) -> f.apply(arg_0, arg_1, arg_2, arg_3);
    }

    public static <T1, T2, T3, T4> Pr4<T1, T2, T3, T4> fromSupplier(Sp<? extends Boolean> s) {
        return Pr4.fromFunction(Sp.narrow(s).toFunction().ignoring4());
    }

    public static <T1, T2, T3, T4> Pr4<T1, T2, T3, T4> negate(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        return Pr4.narrow(p.negated());
    }

    @SafeVarargs
    public static <T1, T2, T3, T4> Pr4<T1, T2, T3, T4> and(Pr4<? super T1, ? super T2, ? super T3, ? super T4> ... ps) {
        Objects.requireNonNull(ps, "ps is null");
        return Predicates.and(ps);
    }

    public static <T1, T2, T3, T4> Pr4<T1, T2, T3, T4> and(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p, Pr0 ... ps) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(ps, "ps is null");
        return ps.length == 0 ? Pr4.narrow(p) : Pr4.narrow(p).and(Predicates.and(ps));
    }

    @SafeVarargs
    public static <T1, T2, T3, T4> Pr4<T1, T2, T3, T4> or(Pr4<? super T1, ? super T2, ? super T3, ? super T4> ... ps) {
        Objects.requireNonNull(ps, "ps is null");
        return Predicates.or(ps);
    }

    public static <T1, T2, T3, T4> Pr4<T1, T2, T3, T4> or(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p, Pr0 ... ps) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(ps, "ps is null");
        return ps.length == 0 ? Pr4.narrow(p) : Pr4.narrow(p).or(Predicates.or(ps));
    }

    public static <T1, T2, T3, T4> Pr1<Tuple4<T1, T2, T3, T4>> tuple(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        return Pr4.of(p).tupled();
    }

    public static <T1, T2, T3, T4> Pr4<T1, T2, T3, T4> detuple(Pr1<? super Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> p) {
        return (t1, t2, t3, t4) -> p.test(Tuple.of(t1, t2, t3, t4));
    }

    public static <T1, T2, T3, T4> Pr4<T1, T2, T3, T4> uncheck(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        Objects.requireNonNull(p, "p is null");
        return Prc4.narrow(p).unchecked();
    }

    public static <T1, T2, T3, T4> Pr4<T1, T2, T3, T4> ignore(Pr0 p) {
        return p.ignoring4();
    }

    public static <T1, T2, T3, T4> Pr4<T1, T2, T3, T4> ignore3Rt(Pr1<? super T1> p) {
        return Pr1.narrow(p).ignoring3Rt();
    }

    public static <T1, T2, T3, T4> Pr4<T1, T2, T3, T4> ignore3Lt(Pr1<? super T4> p) {
        return Pr1.narrow(p).ignoring3Lt();
    }

    public static <T1, T2, T3, T4> Pr4<T1, T2, T3, T4> ignore2Rt(Pr2<? super T1, ? super T2> p) {
        return Pr2.narrow(p).ignoring2Rt();
    }

    public static <T1, T2, T3, T4> Pr4<T1, T2, T3, T4> ignore2Lt(Pr2<? super T3, ? super T4> p) {
        return Pr2.narrow(p).ignoring2Lt();
    }

    public static <T1, T2, T3, T4> Pr4<T1, T2, T3, T4> ignore1Rt(Pr3<? super T1, ? super T2, ? super T3> p) {
        return Pr3.narrow(p).ignoring1Rt();
    }

    public static <T1, T2, T3, T4> Pr4<T1, T2, T3, T4> ignore1Lt(Pr3<? super T2, ? super T3, ? super T4> p) {
        return Pr3.narrow(p).ignoring1Lt();
    }

    public static <T1, T2, T3, T4, T5> Pr4<T1, T2, T3, T4> passRt(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, T5 t5) {
        return Pr4.narrow(p.testRt(t5));
    }

    public static <T1, T2, T3, T4, T5, T6> Pr4<T1, T2, T3, T4> passRt(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, T5 t5, T6 t6) {
        return Pr4.narrow(p.testRt(t5, t6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr4<T1, T2, T3, T4> passRt(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, T5 t5, T6 t6, T7 t7) {
        return Pr4.narrow(p.testRt(t5, t6, t7));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr4<T1, T2, T3, T4> passRt(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Pr4.narrow(p.testRt(t5, t6, t7, t8));
    }

    public static <T1, T2, T3, T4, T5> Pr4<T2, T3, T4, T5> passLt(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, T1 t1) {
        return Pr4.narrow(p.testLt(t1));
    }

    public static <T1, T2, T3, T4, T5, T6> Pr4<T3, T4, T5, T6> passLt(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, T1 t1, T2 t2) {
        return Pr4.narrow(p.testLt(t1, t2));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr4<T4, T5, T6, T7> passLt(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, T1 t1, T2 t2, T3 t3) {
        return Pr4.narrow(p.testLt(t1, t2, t3));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr4<T5, T6, T7, T8> passLt(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, T1 t1, T2 t2, T3 t3, T4 t4) {
        return Pr4.narrow(p.testLt(t1, t2, t3, t4));
    }

    public static <T1, T2, T3, T4> boolean passAndTest(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p, T1 t1, T2 t2, T3 t3, T4 t4) {
        return Pr0.pass(p, t1, t2, t3, t4).test();
    }

    public static <T1, T2, T3, T4> Pr4<T4, T3, T2, T1> invert(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        return Pr4.narrow(p).inverted();
    }

    public boolean test(T1 var1, T2 var2, T3 var3, T4 var4);

    default public Pr3<T2, T3, T4> testLt(T1 t1) {
        return (t2, t3, t4) -> this.test(t1, t2, t3, t4);
    }

    default public Pr2<T3, T4> testLt(T1 t1, T2 t2) {
        return (t3, t4) -> this.test(t1, t2, t3, t4);
    }

    default public Pr1<T4> testLt(T1 t1, T2 t2, T3 t3) {
        return t4 -> this.test(t1, t2, t3, t4);
    }

    default public Pr3<T1, T2, T3> testRt(T4 t4) {
        return (t1, t2, t3) -> this.test(t1, t2, t3, t4);
    }

    default public Pr2<T1, T2> testRt(T3 t3, T4 t4) {
        return (t1, t2) -> this.test(t1, t2, t3, t4);
    }

    default public Pr1<T1> testRt(T2 t2, T3 t3, T4 t4) {
        return t1 -> this.test(t1, t2, t3, t4);
    }

    default public Fn4<T1, T2, T3, T4, Boolean> toFunction() {
        return (arg_0, arg_1, arg_2, arg_3) -> this.test(arg_0, arg_1, arg_2, arg_3);
    }

    default public Cs4<T1, T2, T3, T4> toConsumer() {
        return (arg_0, arg_1, arg_2, arg_3) -> this.test(arg_0, arg_1, arg_2, arg_3);
    }

    default public Pr0 toPredicate(T1 t1, T2 t2, T3 t3, T4 t4) {
        return () -> this.test(t1, t2, t3, t4);
    }

    default public Sp<Boolean> toSupplier(T1 t1, T2 t2, T3 t3, T4 t4) {
        return this.toPredicate(t1, t2, t3, t4).toSupplier();
    }

    default public Rn toRunnable(T1 t1, T2 t2, T3 t3, T4 t4) {
        return this.toPredicate(t1, t2, t3, t4).toRunnable();
    }

    default public <R> R passEvalued(Sp<? extends R> onSuccess, Sp<? extends R> onFailure, T1 t1, T2 t2, T3 t3, T4 t4) {
        return this.toPredicate(t1, t2, t3, t4).evalued(onSuccess, onFailure);
    }

    default public <R> R passEvalued(Sp<? extends R> onSuccess, R onFailure, T1 t1, T2 t2, T3 t3, T4 t4) {
        return this.toPredicate(t1, t2, t3, t4).evalued(onSuccess, onFailure);
    }

    default public <R> R passEvalued(R onSuccess, Sp<? extends R> onFailure, T1 t1, T2 t2, T3 t3, T4 t4) {
        return this.toPredicate(t1, t2, t3, t4).evalued(onSuccess, onFailure);
    }

    default public <R> R passEvalued(R onSuccess, R onFailure, T1 t1, T2 t2, T3 t3, T4 t4) {
        return this.toPredicate(t1, t2, t3, t4).evalued(onSuccess, onFailure);
    }

    default public <R> R passEvaluedOnSuccess(Sp<? extends R> onSuccess, T1 t1, T2 t2, T3 t3, T4 t4) {
        return this.toPredicate(t1, t2, t3, t4).evaluedOnSuccess(onSuccess);
    }

    default public <R> R passEvaluedOnFailure(Sp<? extends R> onFailure, T1 t1, T2 t2, T3 t3, T4 t4) {
        return this.toPredicate(t1, t2, t3, t4).evaluedOnFailure(onFailure);
    }

    default public <R> R passEvaluedOnSuccess(R onSuccess, T1 t1, T2 t2, T3 t3, T4 t4) {
        return this.toPredicate(t1, t2, t3, t4).evaluedOnSuccess(onSuccess);
    }

    default public <R> R passEvaluedOnFailure(R onFailure, T1 t1, T2 t2, T3 t3, T4 t4) {
        return this.toPredicate(t1, t2, t3, t4).evaluedOnFailure(onFailure);
    }

    default public Pr4<T1, T2, T3, T4> afterRunOn(Rn onSuccess, Rn onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4) -> {
            Boolean value = this.test(t1, t2, t3, t4);
            (value != false ? onSuccess : onFailure).run();
            return value;
        };
    }

    default public Pr4<T1, T2, T3, T4> afterTestOn(Pr1<Boolean> onSuccess, Pr1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.toFunction(), onFailure.toFunction());
    }

    default public Pr4<T1, T2, T3, T4> afterTestOn(Pr0 onSuccess, Pr0 onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterTestOn(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Pr4<T1, T2, T3, T4> afterApplyOn(Fn1<Boolean, Boolean> onSuccess, Fn1<Boolean, Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return Pr4.fromFunction(this.afterApplyOnTo(onSuccess, onFailure));
    }

    default public <R> Fn4<T1, T2, T3, T4, R> afterApplyOnTo(Fn1<Boolean, ? extends R> onSuccess, Fn1<Boolean, ? extends R> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4) -> {
            Boolean value = this.test(t1, t2, t3, t4);
            return (value != false ? onSuccess : onFailure).apply(value);
        };
    }

    default public Pr4<T1, T2, T3, T4> afterApplyOn(Fn0<Boolean> onSuccess, Fn0<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onFailure.ignoring1(), onFailure.ignoring1());
    }

    default public <R> Fn4<T1, T2, T3, T4, R> afterApplyOnTo(Fn0<? extends R> onSuccess, Fn0<? extends R> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOnTo(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Pr4<T1, T2, T3, T4> afterGetOn(Sp<Boolean> onSuccess, Sp<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Cs4<T1, T2, T3, T4> afterAcceptOnTo(Cs1<Boolean> onSuccess, Cs1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOnTo(onSuccess.toFunction(null), onFailure.toFunction(null)).toConsumer();
    }

    default public Pr4<T1, T2, T3, T4> afterAcceptOn(Cs1<Boolean> onSuccess, Cs1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.toFunction(null), onFailure.toFunction(null));
    }

    default public Pr4<T1, T2, T3, T4> afterRun(Rn r) {
        return this.afterRunOn(r, r);
    }

    default public Pr4<T1, T2, T3, T4> afterTest(Pr1<Boolean> p) {
        return this.afterTestOn(p, p);
    }

    default public Pr4<T1, T2, T3, T4> afterTest(Pr0 p) {
        return this.afterTestOn(p, p);
    }

    default public Pr4<T1, T2, T3, T4> afterApply(Fn1<Boolean, Boolean> f) {
        return this.afterApplyOn(f, f);
    }

    default public <R> Fn4<T1, T2, T3, T4, R> afterApplyTo(Fn1<Boolean, ? extends R> f) {
        return this.afterApplyOnTo(f, f);
    }

    default public Pr4<T1, T2, T3, T4> afterApply(Fn0<Boolean> f) {
        return this.afterApplyOn(f, f);
    }

    default public <R> Fn4<T1, T2, T3, T4, R> afterApplyTo(Fn0<? extends R> f) {
        return this.afterApplyOnTo(f, f);
    }

    default public Pr4<T1, T2, T3, T4> afterGet(Sp<Boolean> s) {
        return this.afterGetOn(s, s);
    }

    default public Cs4<T1, T2, T3, T4> afterAcceptTo(Cs1<Boolean> c) {
        return this.afterAcceptOnTo(c, c);
    }

    default public Pr4<T1, T2, T3, T4> afterAccept(Cs1<Boolean> c) {
        return this.afterAcceptOn(c, c);
    }

    default public Pr4<T1, T2, T3, T4> beforeWrap(Pr1<? super Spc<Boolean>> wrap) {
        return Pr4.fromFunction(this.beforeWrapTo(wrap.toFunction()));
    }

    default public <W> Fn4<T1, T2, T3, T4, W> beforeWrapTo(Fn1<? super Spc<Boolean>, ? extends W> wrap) {
        return (t1, t2, t3, t4) -> wrap.apply(this.toSupplier(t1, t2, t3, t4).checked());
    }

    default public Pr4<T1, T2, T3, T4> afterRunOnSuccess(Rn r) {
        return this.afterRunOn(r, Rn.empty());
    }

    default public Pr4<T1, T2, T3, T4> afterTestOnSuccess(Pr1<Boolean> p) {
        return this.afterTestOn(p, Pr1.empty());
    }

    default public Pr4<T1, T2, T3, T4> afterTestOnSuccess(Pr0 p) {
        return this.afterTestOn(p, Pr0.empty());
    }

    default public Pr4<T1, T2, T3, T4> afterApplyOnSuccess(Fn1<Boolean, Boolean> f) {
        return this.afterApplyOn(f, Fn1.empty());
    }

    default public <R> Fn4<T1, T2, T3, T4, R> afterApplyOnSuccessTo(Fn1<Boolean, ? extends R> f) {
        return this.afterApplyOnTo(f, Fn1.empty());
    }

    default public Pr4<T1, T2, T3, T4> afterApplyOnSuccess(Fn0<Boolean> f) {
        return this.afterApplyOn(f, Fn0.empty());
    }

    default public <R> Fn4<T1, T2, T3, T4, R> afterApplyOnSuccessTo(Fn0<? extends R> f) {
        return this.afterApplyOnTo(f, Fn0.empty());
    }

    default public Pr4<T1, T2, T3, T4> afterGetOnSuccess(Sp<Boolean> s) {
        return this.afterGetOn(s, Sp.empty());
    }

    default public Cs4<T1, T2, T3, T4> afterAcceptOnSuccessTo(Cs1<Boolean> c) {
        return this.afterAcceptOnTo(c, Cs1.empty());
    }

    default public Pr4<T1, T2, T3, T4> afterAcceptOnSuccess(Cs1<Boolean> c) {
        return this.afterAcceptOn(c, Cs1.empty());
    }

    default public Pr4<T1, T2, T3, T4> afterRunOnFailure(Rn r) {
        return this.negated().afterRunOnSuccess(r);
    }

    default public Pr4<T1, T2, T3, T4> afterTestOnFailure(Pr1<Boolean> p) {
        return this.negated().afterTestOnSuccess(p);
    }

    default public Pr4<T1, T2, T3, T4> afterTestOnFailure(Pr0 p) {
        return this.negated().afterTestOnSuccess(p);
    }

    default public Pr4<T1, T2, T3, T4> afterApplyOnFailure(Fn1<Boolean, Boolean> f) {
        return this.negated().afterApplyOnSuccess(f);
    }

    default public <R> Fn4<T1, T2, T3, T4, R> afterApplyOnFailureTo(Fn1<Boolean, ? extends R> f) {
        return this.negated().afterApplyOnSuccessTo(f);
    }

    default public Pr4<T1, T2, T3, T4> afterApplyOnFailure(Fn0<Boolean> f) {
        return this.negated().afterApplyOnSuccess(f);
    }

    default public <R> Fn4<T1, T2, T3, T4, R> afterApplyOnFailureTo(Fn0<? extends R> f) {
        return this.negated().afterApplyOnSuccessTo(f);
    }

    default public Pr4<T1, T2, T3, T4> afterGetOnFailure(Sp<Boolean> s) {
        return this.negated().afterGetOnSuccess(s);
    }

    default public Cs4<T1, T2, T3, T4> afterAcceptOnFailureTo(Cs1<Boolean> c) {
        return this.negated().afterAcceptOnSuccessTo(c);
    }

    default public Pr4<T1, T2, T3, T4> afterAcceptOnFailure(Cs1<Boolean> c) {
        return this.negated().afterAcceptOnSuccess(c);
    }

    default public Pr4<T1, T2, T3, T4> beforeRun(Rn r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2, t3, t4) -> {
            r.run();
            return this.test(t1, t2, t3, t4);
        };
    }

    default public <B1, B2, B3, B4> Pr4<B1, B2, B3, B4> beforeApply(Fn4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        return this.beforeApply4(f);
    }

    default public <B1> Pr1<B1> beforeApply1(Fn1<? super B1, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return b1 -> this.tupled().test(Tuple.narrow((f.apply(b1))));
    }

    default public <B1, B2> Pr2<B1, B2> beforeApply2(Fn2<? super B1, ? super B2, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2))));
    }

    default public <B1, B2, B3> Pr3<B1, B2, B3> beforeApply3(Fn3<? super B1, ? super B2, ? super B3, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3))));
    }

    default public <B1, B2, B3, B4> Pr4<B1, B2, B3, B4> beforeApply4(Fn4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4))));
    }

    default public <B1, B2, B3, B4, B5> Pr5<B1, B2, B3, B4, B5> beforeApply5(Fn5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5))));
    }

    default public <B1, B2, B3, B4, B5, B6> Pr6<B1, B2, B3, B4, B5, B6> beforeApply6(Fn6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Pr7<B1, B2, B3, B4, B5, B6, B7> beforeApply7(Fn7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Pr8<B1, B2, B3, B4, B5, B6, B7, B8> beforeApply8(Fn8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7, b8) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7, b8))));
    }

    default public Pr4<T1, T2, T3, T4> beforeTestOnSuccess(Pr0 p, Pr4<? super T1, ? super T2, ? super T3, ? super T4> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4) -> p.test() ? this.test(t1, t2, t3, t4) : onFailure.test(t1, t2, t3, t4);
    }

    default public Pr4<T1, T2, T3, T4> beforeTestOnSuccess(Pr0 p, Sp<? extends Boolean> onFailure) {
        return this.beforeTestOnSuccess(p, Pr4.fromSupplier(onFailure));
    }

    default public Pr4<T1, T2, T3, T4> beforeTestOnSuccess(Pr0 p, Boolean onFailure) {
        return this.beforeTestOnSuccess(p, Pr4.value(onFailure));
    }

    default public Pr4<T1, T2, T3, T4> beforeTestOnSuccess(Pr0 p) {
        return this.beforeTestOnSuccess(p, Pr4.empty());
    }

    default public Pr4<T1, T2, T3, T4> beforeTestOnFailure(Pr0 p, Pr4<? super T1, ? super T2, ? super T3, ? super T4> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Pr4<T1, T2, T3, T4> beforeTestOnFailure(Pr0 p, Sp<? extends Boolean> onSuccess) {
        return this.beforeTestOnFailure(p, Pr4.fromSupplier(onSuccess));
    }

    default public Pr4<T1, T2, T3, T4> beforeTestOnFailure(Pr0 p, Boolean onSuccess) {
        return this.beforeTestOnFailure(p, Pr4.value(onSuccess));
    }

    default public Pr4<T1, T2, T3, T4> beforeTestOnFailure(Pr0 p) {
        return this.beforeTestOnFailure(p, Pr4.empty());
    }

    default public Pr0 beforeGet(Sp<? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> s) {
        Objects.requireNonNull(s, "s is null");
        return () -> this.tupled().test(Tuple.narrow((s.get())));
    }

    default public Pr4<T4, T3, T2, T1> inverted() {
        return (t4, t3, t2, t1) -> this.test(t1, t2, t3, t4);
    }

    default public <S> Pr4<T1, T2, T3, T4> afterPassingThroughApplyOn(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends S> onSuccess, Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends S> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4) -> {
            Boolean result = this.test(t1, t2, t3, t4);
            Fn4.narrow(result != false ? onSuccess : onFailure).apply(t1, t2, t3, t4);
            return result;
        };
    }

    default public <S> Fn4<T1, T2, T3, T4, S> afterPassingThroughApplyOnTo(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends S> onSuccess, Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends S> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4) -> Fn4.narrow(this.test(t1, t2, t3, t4) ? onSuccess : onFailure).apply(t1, t2, t3, t4);
    }

    default public Pr4<T1, T2, T3, T4> afterPassingThroughAcceptOn(Cs4<? super T1, ? super T2, ? super T3, ? super T4> onSuccess, Cs4<? super T1, ? super T2, ? super T3, ? super T4> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4) -> {
            Boolean result = this.test(t1, t2, t3, t4);
            Cs4.narrow(result != false ? onSuccess : onFailure).accept(t1, t2, t3, t4);
            return result;
        };
    }

    default public Cs4<T1, T2, T3, T4> afterPassingThroughAcceptOnTo(Cs4<? super T1, ? super T2, ? super T3, ? super T4> onSuccess, Cs4<? super T1, ? super T2, ? super T3, ? super T4> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4) -> Cs4.narrow(this.test(t1, t2, t3, t4) ? onSuccess : onFailure).accept(t1, t2, t3, t4);
    }

    default public Pr4<T1, T2, T3, T4> afterPassingThroughTestOn(Pr4<? super T1, ? super T2, ? super T3, ? super T4> onSuccess, Pr4<? super T1, ? super T2, ? super T3, ? super T4> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4) -> Pr4.narrow(this.test(t1, t2, t3, t4) ? onSuccess : onFailure).test(t1, t2, t3, t4);
    }

    default public <S> Pr4<T1, T2, T3, T4> afterPassingThroughApply(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends S> f) {
        return this.afterPassingThroughApplyOn(f, f);
    }

    default public <S> Fn4<T1, T2, T3, T4, S> afterPassingThroughApplyTo(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends S> f) {
        return this.afterPassingThroughApplyOnTo(f, f);
    }

    default public Pr4<T1, T2, T3, T4> afterPassingThroughAccept(Cs4<? super T1, ? super T2, ? super T3, ? super T4> c) {
        return this.afterPassingThroughAcceptOn(c, c);
    }

    default public Cs4<T1, T2, T3, T4> afterPassingThroughAcceptTo(Cs4<? super T1, ? super T2, ? super T3, ? super T4> c) {
        return this.afterPassingThroughAcceptOnTo(c, c);
    }

    default public Pr4<T1, T2, T3, T4> afterPassingThroughTest(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        return this.afterPassingThroughTestOn(p, p);
    }

    default public <S> Pr4<T1, T2, T3, T4> afterSuccessPassingThroughApply(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends S> onSuccess) {
        return this.afterPassingThroughApplyOn(onSuccess, Fn4.empty());
    }

    default public <S> Fn4<T1, T2, T3, T4, S> afterSuccessPassingThroughApplyTo(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends S> onSuccess) {
        return this.afterPassingThroughApplyOnTo(onSuccess, Fn4.empty());
    }

    default public Pr4<T1, T2, T3, T4> afterSuccessPassingThroughAccept(Cs4<? super T1, ? super T2, ? super T3, ? super T4> onSuccess) {
        return this.afterPassingThroughAcceptOn(onSuccess, Cs4.empty());
    }

    default public Cs4<T1, T2, T3, T4> afterSuccessPassingThroughAcceptTo(Cs4<? super T1, ? super T2, ? super T3, ? super T4> onSuccess) {
        return this.afterPassingThroughAcceptOnTo(onSuccess, Cs4.empty());
    }

    default public Pr4<T1, T2, T3, T4> afterSuccessPassingThroughTest(Pr4<? super T1, ? super T2, ? super T3, ? super T4> onSuccess) {
        return this.afterPassingThroughTestOn(onSuccess, Pr4.empty());
    }

    default public <S> Pr4<T1, T2, T3, T4> afterFailurePassingThroughApply(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends S> onFailure) {
        return this.negated().afterSuccessPassingThroughApply(onFailure);
    }

    default public <S> Fn4<T1, T2, T3, T4, S> afterFailurePassingThroughApplyTo(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends S> onFailure) {
        return this.negated().afterSuccessPassingThroughApplyTo(onFailure);
    }

    default public Pr4<T1, T2, T3, T4> afterFailurePassingThroughAccept(Cs4<? super T1, ? super T2, ? super T3, ? super T4> onFailure) {
        return this.negated().afterSuccessPassingThroughAccept(onFailure);
    }

    default public Cs4<T1, T2, T3, T4> afterFailurePassingThroughAcceptTo(Cs4<? super T1, ? super T2, ? super T3, ? super T4> onFailure) {
        return this.negated().afterSuccessPassingThroughAcceptTo(onFailure);
    }

    default public Pr4<T1, T2, T3, T4> afterFailurePassingThroughTest(Pr4<? super T1, ? super T2, ? super T3, ? super T4> onFailure) {
        return this.negated().afterSuccessPassingThroughTest(onFailure);
    }

    default public <R> Pr4<T1, T2, T3, T4> beforePassingThroughApply(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4) -> {
            f.apply(t1, t2, t3, t4);
            return this.test(t1, t2, t3, t4);
        };
    }

    default public Pr4<T1, T2, T3, T4> beforePassingThroughTest(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4) -> {
            p.test(t1, t2, t3, t4);
            return this.test(t1, t2, t3, t4);
        };
    }

    default public Pr4<T1, T2, T3, T4> beforePassingThroughAccept(Cs4<? super T1, ? super T2, ? super T3, ? super T4> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4) -> {
            c.accept(t1, t2, t3, t4);
            return this.test(t1, t2, t3, t4);
        };
    }

    default public Pr4<T1, T2, T3, T4> beforeSuccessPassingThroughTest(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p, Pr4<? super T1, ? super T2, ? super T3, ? super T4> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4) -> p.test(t1, t2, t3, t4) ? this.test(t1, t2, t3, t4) : onFailure.test(t1, t2, t3, t4);
    }

    default public Pr4<T1, T2, T3, T4> beforeSuccessPassingThroughTest(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p, Sp<? extends Boolean> onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Pr4.fromSupplier(onFailure));
    }

    default public Pr4<T1, T2, T3, T4> beforeSuccessPassingThroughTest(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p, Boolean onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Pr4.value(onFailure));
    }

    default public Pr4<T1, T2, T3, T4> beforeSuccessPassingThroughTest(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        return this.beforeSuccessPassingThroughTest(p, Pr4.empty());
    }

    default public Pr4<T1, T2, T3, T4> beforeFailurePassingThroughTest(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p, Pr4<? super T1, ? super T2, ? super T3, ? super T4> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Pr4<T1, T2, T3, T4> beforeFailurePassingThroughTest(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p, Sp<? extends Boolean> onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Pr4.fromSupplier(onSuccess));
    }

    default public Pr4<T1, T2, T3, T4> beforeFailurePassingThroughTest(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p, Boolean onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Pr4.value(onSuccess));
    }

    default public Pr4<T1, T2, T3, T4> beforeFailurePassingThroughTest(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        return this.beforeFailurePassingThroughTest(p, Pr4.empty());
    }

    default public Pr1<Tuple4<T1, T2, T3, T4>> tupled() {
        return tuple -> this.test(tuple._1(), tuple._2(), tuple._3(), tuple._4());
    }

    default public Prc4<T1, T2, T3, T4> checked() {
        return (arg_0, arg_1, arg_2, arg_3) -> this.test(arg_0, arg_1, arg_2, arg_3);
    }

    default public Fn1<T1, Fn1<T2, Fn1<T3, Pr1<T4>>>> currying() {
        return t1 -> t2 -> t3 -> t4 -> this.test(t1, t2, t3, t4);
    }

    default public Pr4<T1, T2, T3, T4> negated() {
        return (t1, t2, t3, t4) -> !this.test(t1, t2, t3, t4);
    }

    default public Pr4<T1, T2, T3, T4> and(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        return (t1, t2, t3, t4) -> this.test(t1, t2, t3, t4) && p.test(t1, t2, t3, t4);
    }

    default public Pr4<T1, T2, T3, T4> or(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        return (t1, t2, t3, t4) -> this.test(t1, t2, t3, t4) || p.test(t1, t2, t3, t4);
    }

    default public Pr4<T1, T2, T3, T4> and(Pr0 p) {
        return (t1, t2, t3, t4) -> this.test(t1, t2, t3, t4) && p.test();
    }

    default public Pr4<T1, T2, T3, T4> or(Pr0 p) {
        return (t1, t2, t3, t4) -> this.test(t1, t2, t3, t4) || p.test();
    }

    default public <I1> Pr5<I1, T1, T2, T3, T4> ignoring1Lt() {
        return (i1, t1, t2, t3, t4) -> this.test(t1, t2, t3, t4);
    }

    default public <I1> Pr5<T1, T2, T3, T4, I1> ignoring1Rt() {
        return (t1, t2, t3, t4, i1) -> this.test(t1, t2, t3, t4);
    }

    default public <I1, I2> Pr6<I1, I2, T1, T2, T3, T4> ignoring2Lt() {
        return (i1, i2, t1, t2, t3, t4) -> this.test(t1, t2, t3, t4);
    }

    default public <I1, I2> Pr6<T1, T2, T3, T4, I1, I2> ignoring2Rt() {
        return (t1, t2, t3, t4, i1, i2) -> this.test(t1, t2, t3, t4);
    }

    default public <I1, I2, I3> Pr7<I1, I2, I3, T1, T2, T3, T4> ignoring3Lt() {
        return (i1, i2, i3, t1, t2, t3, t4) -> this.test(t1, t2, t3, t4);
    }

    default public <I1, I2, I3> Pr7<T1, T2, T3, T4, I1, I2, I3> ignoring3Rt() {
        return (t1, t2, t3, t4, i1, i2, i3) -> this.test(t1, t2, t3, t4);
    }

    default public <I1, I2, I3, I4> Pr8<I1, I2, I3, I4, T1, T2, T3, T4> ignoring4Lt() {
        return (i1, i2, i3, i4, t1, t2, t3, t4) -> this.test(t1, t2, t3, t4);
    }

    default public <I1, I2, I3, I4> Pr8<T1, T2, T3, T4, I1, I2, I3, I4> ignoring4Rt() {
        return (t1, t2, t3, t4, i1, i2, i3, i4) -> this.test(t1, t2, t3, t4);
    }

    default public Pr4<T1, T2, T3, T4> memoized() {
        return (arg_0, arg_1, arg_2, arg_3) -> ((Function4) super.memoized()).apply(arg_0, arg_1, arg_2, arg_3);
    }

}

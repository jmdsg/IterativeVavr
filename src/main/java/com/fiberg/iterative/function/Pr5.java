package com.fiberg.iterative.function;

import com.fiberg.iterative.core.IterativeInternals;
import com.fiberg.iterative.function.Cs1;
import com.fiberg.iterative.function.Cs5;
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
import com.fiberg.iterative.function.Pr4;
import com.fiberg.iterative.function.Pr6;
import com.fiberg.iterative.function.Pr7;
import com.fiberg.iterative.function.Pr8;
import com.fiberg.iterative.function.Prc5;
import com.fiberg.iterative.function.Predicates;
import com.fiberg.iterative.function.Rn;
import com.fiberg.iterative.function.Sp;
import com.fiberg.iterative.function.Spc;
import io.vavr.Function5;
import io.vavr.Tuple;
import io.vavr.Tuple5;
import java.io.Serializable;
import java.util.Objects;

@FunctionalInterface
public interface Pr5<T1, T2, T3, T4, T5> extends Function5<T1, T2, T3, T4, T5, Boolean> {

    default public Boolean apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return this.test(t1, t2, t3, t4, t5);
    }

    public static <T1, T2, T3, T4, T5> Pr5<T1, T2, T3, T4, T5> narrow(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        @SuppressWarnings("unchecked")
        final Pr5<T1, T2, T3, T4, T5> pr = (Pr5<T1, T2, T3, T4, T5>) p;
        return pr;
    }

    public static <T1, T2, T3, T4, T5> Pr5<T1, T2, T3, T4, T5> empty() {
        return IterativeInternals::none;
    }

    public static <T1, T2, T3, T4, T5> Pr5<T1, T2, T3, T4, T5> value(Boolean b) {
        return (t1, t2, t3, t4, t5) -> b;
    }

    public static <T1, T2, T3, T4, T5> Pr5<T1, T2, T3, T4, T5> of(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return Pr5.narrow(p);
    }

    public static <T1, T2, T3, T4, T5> Pr5<T1, T2, T3, T4, T5> of1(Pr1<? super T1> f) {
        return Pr5.<T1, T2, T3, T4, T5>narrow(f.ignoring4Rt());
    }

    public static <T1, T2, T3, T4, T5> Pr5<T1, T2, T3, T4, T5> of2(Pr1<? super T2> f) {
        return Pr5.<T1, T2, T3, T4, T5>narrow(f.ignoring3Rt().ignoring1Lt());
    }

    public static <T1, T2, T3, T4, T5> Pr5<T1, T2, T3, T4, T5> of3(Pr1<? super T3> f) {
        return Pr5.<T1, T2, T3, T4, T5>narrow(f.ignoring2Rt().ignoring2Lt());
    }

    public static <T1, T2, T3, T4, T5> Pr5<T1, T2, T3, T4, T5> of4(Pr1<? super T4> f) {
        return Pr5.<T1, T2, T3, T4, T5>narrow(f.ignoring1Rt().ignoring3Lt());
    }

    public static <T1, T2, T3, T4, T5> Pr5<T1, T2, T3, T4, T5> of5(Pr1<? super T5> f) {
        return Pr5.<T1, T2, T3, T4, T5>narrow(f.ignoring4Lt());
    }

    public static <T1, T2, T3, T4, T5> Pr5<T1, T2, T3, T4, T5> fromFunction(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, Boolean> f) {
        return (t1, t2, t3, t4, t5) -> f.apply(t1, t2, t3, t4, t5);
    }

    public static <T1, T2, T3, T4, T5> Pr5<T1, T2, T3, T4, T5> fromSupplier(Sp<? extends Boolean> s) {
        return Pr5.fromFunction(Sp.narrow(s).toFunction().ignoring5());
    }

    public static <T1, T2, T3, T4, T5> Pr5<T1, T2, T3, T4, T5> negate(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return Pr5.<T1, T2, T3, T4, T5>narrow(p.negated());
    }

    @SafeVarargs
    public static <T1, T2, T3, T4, T5> Pr5<T1, T2, T3, T4, T5> and(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> ... ps) {
        Objects.requireNonNull(ps, "ps is null");
        return Predicates.and(ps);
    }

    public static <T1, T2, T3, T4, T5> Pr5<T1, T2, T3, T4, T5> and(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, Pr0 ... ps) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(ps, "ps is null");
        return ps.length == 0 ? Pr5.narrow(p) : Pr5.narrow(p).and(Predicates.and(ps));
    }

    @SafeVarargs
    public static <T1, T2, T3, T4, T5> Pr5<T1, T2, T3, T4, T5> or(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> ... ps) {
        Objects.requireNonNull(ps, "ps is null");
        return Predicates.or(ps);
    }

    public static <T1, T2, T3, T4, T5> Pr5<T1, T2, T3, T4, T5> or(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, Pr0 ... ps) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(ps, "ps is null");
        return ps.length == 0 ? Pr5.narrow(p) : Pr5.narrow(p).or(Predicates.or(ps));
    }

    public static <T1, T2, T3, T4, T5> Pr1<Tuple5<T1, T2, T3, T4, T5>> tuple(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return Pr5.<T1, T2, T3, T4, T5>of(p).tupled();
    }

    public static <T1, T2, T3, T4, T5> Pr5<T1, T2, T3, T4, T5> detuple(Pr1<? super Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> p) {
        return (t1, t2, t3, t4, t5) -> p.test(Tuple.of(t1, t2, t3, t4, t5));
    }

    public static <T1, T2, T3, T4, T5> Pr5<T1, T2, T3, T4, T5> uncheck(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        Objects.requireNonNull(p, "p is null");
        return Prc5.<T1, T2, T3, T4, T5>narrow(p).unchecked();
    }

    public static <T1, T2, T3, T4, T5> Pr5<T1, T2, T3, T4, T5> ignore(Pr0 p) {
        return p.ignoring5();
    }

    public static <T1, T2, T3, T4, T5> Pr5<T1, T2, T3, T4, T5> ignore4Rt(Pr1<? super T1> p) {
        return Pr1.<T1>narrow(p).ignoring4Rt();
    }

    public static <T1, T2, T3, T4, T5> Pr5<T1, T2, T3, T4, T5> ignore4Lt(Pr1<? super T5> p) {
        return Pr1.<T5>narrow(p).ignoring4Lt();
    }

    public static <T1, T2, T3, T4, T5> Pr5<T1, T2, T3, T4, T5> ignore3Rt(Pr2<? super T1, ? super T2> p) {
        return Pr2.<T1, T2>narrow(p).ignoring3Rt();
    }

    public static <T1, T2, T3, T4, T5> Pr5<T1, T2, T3, T4, T5> ignore3Lt(Pr2<? super T4, ? super T5> p) {
        return Pr2.<T4, T5>narrow(p).ignoring3Lt();
    }

    public static <T1, T2, T3, T4, T5> Pr5<T1, T2, T3, T4, T5> ignore2Rt(Pr3<? super T1, ? super T2, ? super T3> p) {
        return Pr3.<T1, T2, T3>narrow(p).ignoring2Rt();
    }

    public static <T1, T2, T3, T4, T5> Pr5<T1, T2, T3, T4, T5> ignore2Lt(Pr3<? super T3, ? super T4, ? super T5> p) {
        return Pr3.<T3, T4, T5>narrow(p).ignoring2Lt();
    }

    public static <T1, T2, T3, T4, T5> Pr5<T1, T2, T3, T4, T5> ignore1Rt(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        return Pr4.<T1, T2, T3, T4>narrow(p).ignoring1Rt();
    }

    public static <T1, T2, T3, T4, T5> Pr5<T1, T2, T3, T4, T5> ignore1Lt(Pr4<? super T2, ? super T3, ? super T4, ? super T5> p) {
        return Pr4.<T2, T3, T4, T5>narrow(p).ignoring1Lt();
    }

    public static <T1, T2, T3, T4, T5, T6> Pr5<T1, T2, T3, T4, T5> passRt(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, T6 t6) {
        return Pr5.narrow(p.testRt(t6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr5<T1, T2, T3, T4, T5> passRt(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, T6 t6, T7 t7) {
        return Pr5.narrow(p.testRt(t6, t7));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr5<T1, T2, T3, T4, T5> passRt(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, T6 t6, T7 t7, T8 t8) {
        return Pr5.narrow(p.testRt(t6, t7, t8));
    }

    public static <T1, T2, T3, T4, T5, T6> Pr5<T2, T3, T4, T5, T6> passLt(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, T1 t1) {
        return Pr5.narrow(p.testLt(t1));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr5<T3, T4, T5, T6, T7> passLt(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, T1 t1, T2 t2) {
        return Pr5.narrow(p.testLt(t1, t2));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr5<T4, T5, T6, T7, T8> passLt(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, T1 t1, T2 t2, T3 t3) {
        return Pr5.narrow(p.testLt(t1, t2, t3));
    }

    public static <T1, T2, T3, T4, T5> boolean passAndTest(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return Pr0.pass(p, t1, t2, t3, t4, t5).test();
    }

    public static <T1, T2, T3, T4, T5> Pr5<T5, T4, T3, T2, T1> invert(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return Pr5.<T1, T2, T3, T4, T5>narrow(p).inverted();
    }

    public boolean test(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5);

    default public Pr4<T2, T3, T4, T5> testLt(T1 t1) {
        return (t2, t3, t4, t5) -> this.test(t1, t2, t3, t4, t5);
    }

    default public Pr3<T3, T4, T5> testLt(T1 t1, T2 t2) {
        return (t3, t4, t5) -> this.test(t1, t2, t3, t4, t5);
    }

    default public Pr2<T4, T5> testLt(T1 t1, T2 t2, T3 t3) {
        return (t4, t5) -> this.test(t1, t2, t3, t4, t5);
    }

    default public Pr1<T5> testLt(T1 t1, T2 t2, T3 t3, T4 t4) {
        return t5 -> this.test(t1, t2, t3, t4, t5);
    }

    default public Pr4<T1, T2, T3, T4> testRt(T5 t5) {
        return (t1, t2, t3, t4) -> this.test(t1, t2, t3, t4, t5);
    }

    default public Pr3<T1, T2, T3> testRt(T4 t4, T5 t5) {
        return (t1, t2, t3) -> this.test(t1, t2, t3, t4, t5);
    }

    default public Pr2<T1, T2> testRt(T3 t3, T4 t4, T5 t5) {
        return (t1, t2) -> this.test(t1, t2, t3, t4, t5);
    }

    default public Pr1<T1> testRt(T2 t2, T3 t3, T4 t4, T5 t5) {
        return t1 -> this.test(t1, t2, t3, t4, t5);
    }

    default public Fn5<T1, T2, T3, T4, T5, Boolean> toFunction() {
        return (t1, t2, t3, t4, t5) -> this.test(t1, t2, t3, t4, t5);
    }

    default public Cs5<T1, T2, T3, T4, T5> toConsumer() {
        return (t1, t2, t3, t4, t5) -> this.test(t1, t2, t3, t4, t5);
    }

    default public Pr0 toPredicate(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return () -> this.test(t1, t2, t3, t4, t5);
    }

    default public Sp<Boolean> toSupplier(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return this.toPredicate(t1, t2, t3, t4, t5).toSupplier();
    }

    default public Rn toRunnable(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return this.toPredicate(t1, t2, t3, t4, t5).toRunnable();
    }

    default public <R> R passEvalued(Sp<? extends R> onSuccess, Sp<? extends R> onFailure, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return this.toPredicate(t1, t2, t3, t4, t5).evalued(onSuccess, onFailure);
    }

    default public <R> R passEvalued(Sp<? extends R> onSuccess, R onFailure, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return this.toPredicate(t1, t2, t3, t4, t5).evalued(onSuccess, onFailure);
    }

    default public <R> R passEvalued(R onSuccess, Sp<? extends R> onFailure, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return this.toPredicate(t1, t2, t3, t4, t5).evalued(onSuccess, onFailure);
    }

    default public <R> R passEvalued(R onSuccess, R onFailure, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return this.toPredicate(t1, t2, t3, t4, t5).evalued(onSuccess, onFailure);
    }

    default public <R> R passEvaluedOnSuccess(Sp<? extends R> onSuccess, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return this.toPredicate(t1, t2, t3, t4, t5).evaluedOnSuccess(onSuccess);
    }

    default public <R> R passEvaluedOnFailure(Sp<? extends R> onFailure, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return this.toPredicate(t1, t2, t3, t4, t5).evaluedOnFailure(onFailure);
    }

    default public <R> R passEvaluedOnSuccess(R onSuccess, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return this.toPredicate(t1, t2, t3, t4, t5).evaluedOnSuccess(onSuccess);
    }

    default public <R> R passEvaluedOnFailure(R onFailure, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return this.toPredicate(t1, t2, t3, t4, t5).evaluedOnFailure(onFailure);
    }

    default public Pr5<T1, T2, T3, T4, T5> afterRunOn(Rn onSuccess, Rn onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5) -> {
            Boolean value = this.test(t1, t2, t3, t4, t5);
            (value != false ? onSuccess : onFailure).run();
            return value;
        };
    }

    default public Pr5<T1, T2, T3, T4, T5> afterTestOn(Pr1<Boolean> onSuccess, Pr1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.toFunction(), onFailure.toFunction());
    }

    default public Pr5<T1, T2, T3, T4, T5> afterTestOn(Pr0 onSuccess, Pr0 onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterTestOn(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Pr5<T1, T2, T3, T4, T5> afterApplyOn(Fn1<Boolean, Boolean> onSuccess, Fn1<Boolean, Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return Pr5.fromFunction(this.afterApplyOnTo(onSuccess, onFailure));
    }

    default public <R> Fn5<T1, T2, T3, T4, T5, R> afterApplyOnTo(Fn1<Boolean, ? extends R> onSuccess, Fn1<Boolean, ? extends R> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5) -> {
            Boolean value = this.test(t1, t2, t3, t4, t5);
            return (value != false ? onSuccess : onFailure).apply(value);
        };
    }

    default public Pr5<T1, T2, T3, T4, T5> afterApplyOn(Fn0<Boolean> onSuccess, Fn0<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onFailure.ignoring1(), onFailure.ignoring1());
    }

    default public <R> Fn5<T1, T2, T3, T4, T5, R> afterApplyOnTo(Fn0<? extends R> onSuccess, Fn0<? extends R> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOnTo(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Pr5<T1, T2, T3, T4, T5> afterGetOn(Sp<Boolean> onSuccess, Sp<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Cs5<T1, T2, T3, T4, T5> afterAcceptOnTo(Cs1<Boolean> onSuccess, Cs1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOnTo(onSuccess.toFunction(null), onFailure.toFunction(null)).toConsumer();
    }

    default public Pr5<T1, T2, T3, T4, T5> afterAcceptOn(Cs1<Boolean> onSuccess, Cs1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.toFunction(null), onFailure.toFunction(null));
    }

    default public Pr5<T1, T2, T3, T4, T5> afterRun(Rn r) {
        return this.afterRunOn(r, r);
    }

    default public Pr5<T1, T2, T3, T4, T5> afterTest(Pr1<Boolean> p) {
        return this.afterTestOn(p, p);
    }

    default public Pr5<T1, T2, T3, T4, T5> afterTest(Pr0 p) {
        return this.afterTestOn(p, p);
    }

    default public Pr5<T1, T2, T3, T4, T5> afterApply(Fn1<Boolean, Boolean> f) {
        return this.afterApplyOn(f, f);
    }

    default public <R> Fn5<T1, T2, T3, T4, T5, R> afterApplyTo(Fn1<Boolean, ? extends R> f) {
        return this.afterApplyOnTo(f, f);
    }

    default public Pr5<T1, T2, T3, T4, T5> afterApply(Fn0<Boolean> f) {
        return this.afterApplyOn(f, f);
    }

    default public <R> Fn5<T1, T2, T3, T4, T5, R> afterApplyTo(Fn0<? extends R> f) {
        return this.afterApplyOnTo(f, f);
    }

    default public Pr5<T1, T2, T3, T4, T5> afterGet(Sp<Boolean> s) {
        return this.afterGetOn(s, s);
    }

    default public Cs5<T1, T2, T3, T4, T5> afterAcceptTo(Cs1<Boolean> c) {
        return this.afterAcceptOnTo(c, c);
    }

    default public Pr5<T1, T2, T3, T4, T5> afterAccept(Cs1<Boolean> c) {
        return this.afterAcceptOn(c, c);
    }

    default public Pr5<T1, T2, T3, T4, T5> beforeWrap(Pr1<? super Spc<Boolean>> wrap) {
        return Pr5.fromFunction(this.beforeWrapTo(wrap.toFunction()));
    }

    default public <W> Fn5<T1, T2, T3, T4, T5, W> beforeWrapTo(Fn1<? super Spc<Boolean>, ? extends W> wrap) {
        return (t1, t2, t3, t4, t5) -> wrap.apply(this.toSupplier(t1, t2, t3, t4, t5).checked());
    }

    default public Pr5<T1, T2, T3, T4, T5> afterRunOnSuccess(Rn r) {
        return this.afterRunOn(r, Rn.empty());
    }

    default public Pr5<T1, T2, T3, T4, T5> afterTestOnSuccess(Pr1<Boolean> p) {
        return this.afterTestOn(p, Pr1.empty());
    }

    default public Pr5<T1, T2, T3, T4, T5> afterTestOnSuccess(Pr0 p) {
        return this.afterTestOn(p, Pr0.empty());
    }

    default public Pr5<T1, T2, T3, T4, T5> afterApplyOnSuccess(Fn1<Boolean, Boolean> f) {
        return this.afterApplyOn(f, Fn1.empty());
    }

    default public <R> Fn5<T1, T2, T3, T4, T5, R> afterApplyOnSuccessTo(Fn1<Boolean, ? extends R> f) {
        return this.afterApplyOnTo(f, Fn1.empty());
    }

    default public Pr5<T1, T2, T3, T4, T5> afterApplyOnSuccess(Fn0<Boolean> f) {
        return this.afterApplyOn(f, Fn0.empty());
    }

    default public <R> Fn5<T1, T2, T3, T4, T5, R> afterApplyOnSuccessTo(Fn0<? extends R> f) {
        return this.afterApplyOnTo(f, Fn0.empty());
    }

    default public Pr5<T1, T2, T3, T4, T5> afterGetOnSuccess(Sp<Boolean> s) {
        return this.afterGetOn(s, Sp.empty());
    }

    default public Cs5<T1, T2, T3, T4, T5> afterAcceptOnSuccessTo(Cs1<Boolean> c) {
        return this.afterAcceptOnTo(c, Cs1.empty());
    }

    default public Pr5<T1, T2, T3, T4, T5> afterAcceptOnSuccess(Cs1<Boolean> c) {
        return this.afterAcceptOn(c, Cs1.empty());
    }

    default public Pr5<T1, T2, T3, T4, T5> afterRunOnFailure(Rn r) {
        return this.negated().afterRunOnSuccess(r);
    }

    default public Pr5<T1, T2, T3, T4, T5> afterTestOnFailure(Pr1<Boolean> p) {
        return this.negated().afterTestOnSuccess(p);
    }

    default public Pr5<T1, T2, T3, T4, T5> afterTestOnFailure(Pr0 p) {
        return this.negated().afterTestOnSuccess(p);
    }

    default public Pr5<T1, T2, T3, T4, T5> afterApplyOnFailure(Fn1<Boolean, Boolean> f) {
        return this.negated().afterApplyOnSuccess(f);
    }

    default public <R> Fn5<T1, T2, T3, T4, T5, R> afterApplyOnFailureTo(Fn1<Boolean, ? extends R> f) {
        return this.negated().afterApplyOnSuccessTo(f);
    }

    default public Pr5<T1, T2, T3, T4, T5> afterApplyOnFailure(Fn0<Boolean> f) {
        return this.negated().afterApplyOnSuccess(f);
    }

    default public <R> Fn5<T1, T2, T3, T4, T5, R> afterApplyOnFailureTo(Fn0<? extends R> f) {
        return this.negated().afterApplyOnSuccessTo(f);
    }

    default public Pr5<T1, T2, T3, T4, T5> afterGetOnFailure(Sp<Boolean> s) {
        return this.negated().afterGetOnSuccess(s);
    }

    default public Cs5<T1, T2, T3, T4, T5> afterAcceptOnFailureTo(Cs1<Boolean> c) {
        return this.negated().afterAcceptOnSuccessTo(c);
    }

    default public Pr5<T1, T2, T3, T4, T5> afterAcceptOnFailure(Cs1<Boolean> c) {
        return this.negated().afterAcceptOnSuccess(c);
    }

    default public Pr5<T1, T2, T3, T4, T5> beforeRun(Rn r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2, t3, t4, t5) -> {
            r.run();
            return this.test(t1, t2, t3, t4, t5);
        };
    }

    default public <B1, B2, B3, B4, B5> Pr5<B1, B2, B3, B4, B5> beforeApply(Fn5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        return this.beforeApply5(f);
    }

    default public <B1> Pr1<B1> beforeApply1(Fn1<? super B1, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return b1 -> this.tupled().test(Tuple.narrow((f.apply(b1))));
    }

    default public <B1, B2> Pr2<B1, B2> beforeApply2(Fn2<? super B1, ? super B2, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2))));
    }

    default public <B1, B2, B3> Pr3<B1, B2, B3> beforeApply3(Fn3<? super B1, ? super B2, ? super B3, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3))));
    }

    default public <B1, B2, B3, B4> Pr4<B1, B2, B3, B4> beforeApply4(Fn4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4))));
    }

    default public <B1, B2, B3, B4, B5> Pr5<B1, B2, B3, B4, B5> beforeApply5(Fn5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5))));
    }

    default public <B1, B2, B3, B4, B5, B6> Pr6<B1, B2, B3, B4, B5, B6> beforeApply6(Fn6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Pr7<B1, B2, B3, B4, B5, B6, B7> beforeApply7(Fn7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Pr8<B1, B2, B3, B4, B5, B6, B7, B8> beforeApply8(Fn8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7, b8) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7, b8))));
    }

    default public Pr5<T1, T2, T3, T4, T5> beforeTestOnSuccess(Pr0 p, Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5) -> p.test() ? this.test(t1, t2, t3, t4, t5) : onFailure.test(t1, t2, t3, t4, t5);
    }

    default public Pr5<T1, T2, T3, T4, T5> beforeTestOnSuccess(Pr0 p, Sp<? extends Boolean> onFailure) {
        return this.beforeTestOnSuccess(p, Pr5.fromSupplier(onFailure));
    }

    default public Pr5<T1, T2, T3, T4, T5> beforeTestOnSuccess(Pr0 p, Boolean onFailure) {
        return this.beforeTestOnSuccess(p, Pr5.value(onFailure));
    }

    default public Pr5<T1, T2, T3, T4, T5> beforeTestOnSuccess(Pr0 p) {
        return this.beforeTestOnSuccess(p, Pr5.empty());
    }

    default public Pr5<T1, T2, T3, T4, T5> beforeTestOnFailure(Pr0 p, Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Pr5<T1, T2, T3, T4, T5> beforeTestOnFailure(Pr0 p, Sp<? extends Boolean> onSuccess) {
        return this.beforeTestOnFailure(p, Pr5.fromSupplier(onSuccess));
    }

    default public Pr5<T1, T2, T3, T4, T5> beforeTestOnFailure(Pr0 p, Boolean onSuccess) {
        return this.beforeTestOnFailure(p, Pr5.value(onSuccess));
    }

    default public Pr5<T1, T2, T3, T4, T5> beforeTestOnFailure(Pr0 p) {
        return this.beforeTestOnFailure(p, Pr5.empty());
    }

    default public Pr0 beforeGet(Sp<? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> s) {
        Objects.requireNonNull(s, "s is null");
        return () -> this.tupled().test(Tuple.narrow((s.get())));
    }

    default public Pr5<T5, T4, T3, T2, T1> inverted() {
        return (t5, t4, t3, t2, t1) -> this.test(t1, t2, t3, t4, t5);
    }

    default public <S> Pr5<T1, T2, T3, T4, T5> afterPassingThroughApplyOn(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends S> onSuccess, Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends S> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5) -> {
            Boolean result = this.test(t1, t2, t3, t4, t5);
            Fn5.narrow(result != false ? onSuccess : onFailure).apply(t1, t2, t3, t4, t5);
            return result;
        };
    }

    default public <S> Fn5<T1, T2, T3, T4, T5, S> afterPassingThroughApplyOnTo(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends S> onSuccess, Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends S> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5) -> Fn5.narrow(this.test(t1, t2, t3, t4, t5) ? onSuccess : onFailure).apply(t1, t2, t3, t4, t5);
    }

    default public Pr5<T1, T2, T3, T4, T5> afterPassingThroughAcceptOn(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onSuccess, Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5) -> {
            Boolean result = this.test(t1, t2, t3, t4, t5);
            Cs5.narrow(result != false ? onSuccess : onFailure).accept(t1, t2, t3, t4, t5);
            return result;
        };
    }

    default public Cs5<T1, T2, T3, T4, T5> afterPassingThroughAcceptOnTo(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onSuccess, Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5) -> Cs5.narrow(this.test(t1, t2, t3, t4, t5) ? onSuccess : onFailure).accept(t1, t2, t3, t4, t5);
    }

    default public Pr5<T1, T2, T3, T4, T5> afterPassingThroughTestOn(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onSuccess, Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5) -> Pr5.narrow(this.test(t1, t2, t3, t4, t5) ? onSuccess : onFailure).test(t1, t2, t3, t4, t5);
    }

    default public <S> Pr5<T1, T2, T3, T4, T5> afterPassingThroughApply(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends S> f) {
        return this.afterPassingThroughApplyOn(f, f);
    }

    default public <S> Fn5<T1, T2, T3, T4, T5, S> afterPassingThroughApplyTo(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends S> f) {
        return this.afterPassingThroughApplyOnTo(f, f);
    }

    default public Pr5<T1, T2, T3, T4, T5> afterPassingThroughAccept(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        return this.afterPassingThroughAcceptOn(c, c);
    }

    default public Cs5<T1, T2, T3, T4, T5> afterPassingThroughAcceptTo(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        return this.afterPassingThroughAcceptOnTo(c, c);
    }

    default public Pr5<T1, T2, T3, T4, T5> afterPassingThroughTest(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return this.afterPassingThroughTestOn(p, p);
    }

    default public <S> Pr5<T1, T2, T3, T4, T5> afterSuccessPassingThroughApply(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends S> onSuccess) {
        return this.afterPassingThroughApplyOn(onSuccess, Fn5.empty());
    }

    default public <S> Fn5<T1, T2, T3, T4, T5, S> afterSuccessPassingThroughApplyTo(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends S> onSuccess) {
        return this.afterPassingThroughApplyOnTo(onSuccess, Fn5.empty());
    }

    default public Pr5<T1, T2, T3, T4, T5> afterSuccessPassingThroughAccept(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onSuccess) {
        return this.afterPassingThroughAcceptOn(onSuccess, Cs5.empty());
    }

    default public Cs5<T1, T2, T3, T4, T5> afterSuccessPassingThroughAcceptTo(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onSuccess) {
        return this.afterPassingThroughAcceptOnTo(onSuccess, Cs5.empty());
    }

    default public Pr5<T1, T2, T3, T4, T5> afterSuccessPassingThroughTest(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onSuccess) {
        return this.afterPassingThroughTestOn(onSuccess, Pr5.empty());
    }

    default public <S> Pr5<T1, T2, T3, T4, T5> afterFailurePassingThroughApply(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends S> onFailure) {
        return this.negated().afterSuccessPassingThroughApply(onFailure);
    }

    default public <S> Fn5<T1, T2, T3, T4, T5, S> afterFailurePassingThroughApplyTo(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends S> onFailure) {
        return this.negated().afterSuccessPassingThroughApplyTo(onFailure);
    }

    default public Pr5<T1, T2, T3, T4, T5> afterFailurePassingThroughAccept(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onFailure) {
        return this.negated().afterSuccessPassingThroughAccept(onFailure);
    }

    default public Cs5<T1, T2, T3, T4, T5> afterFailurePassingThroughAcceptTo(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onFailure) {
        return this.negated().afterSuccessPassingThroughAcceptTo(onFailure);
    }

    default public Pr5<T1, T2, T3, T4, T5> afterFailurePassingThroughTest(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onFailure) {
        return this.negated().afterSuccessPassingThroughTest(onFailure);
    }

    default public <R> Pr5<T1, T2, T3, T4, T5> beforePassingThroughApply(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5) -> {
            f.apply(t1, t2, t3, t4, t5);
            return this.test(t1, t2, t3, t4, t5);
        };
    }

    default public Pr5<T1, T2, T3, T4, T5> beforePassingThroughTest(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5) -> {
            p.test(t1, t2, t3, t4, t5);
            return this.test(t1, t2, t3, t4, t5);
        };
    }

    default public Pr5<T1, T2, T3, T4, T5> beforePassingThroughAccept(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5) -> {
            c.accept(t1, t2, t3, t4, t5);
            return this.test(t1, t2, t3, t4, t5);
        };
    }

    default public Pr5<T1, T2, T3, T4, T5> beforeSuccessPassingThroughTest(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5) -> p.test(t1, t2, t3, t4, t5) ? this.test(t1, t2, t3, t4, t5) : onFailure.test(t1, t2, t3, t4, t5);
    }

    default public Pr5<T1, T2, T3, T4, T5> beforeSuccessPassingThroughTest(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, Sp<? extends Boolean> onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Pr5.fromSupplier(onFailure));
    }

    default public Pr5<T1, T2, T3, T4, T5> beforeSuccessPassingThroughTest(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, Boolean onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Pr5.value(onFailure));
    }

    default public Pr5<T1, T2, T3, T4, T5> beforeSuccessPassingThroughTest(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return this.beforeSuccessPassingThroughTest(p, Pr5.empty());
    }

    default public Pr5<T1, T2, T3, T4, T5> beforeFailurePassingThroughTest(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Pr5<T1, T2, T3, T4, T5> beforeFailurePassingThroughTest(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, Sp<? extends Boolean> onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Pr5.fromSupplier(onSuccess));
    }

    default public Pr5<T1, T2, T3, T4, T5> beforeFailurePassingThroughTest(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, Boolean onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Pr5.value(onSuccess));
    }

    default public Pr5<T1, T2, T3, T4, T5> beforeFailurePassingThroughTest(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return this.beforeFailurePassingThroughTest(p, Pr5.empty());
    }

    default public Pr1<Tuple5<T1, T2, T3, T4, T5>> tupled() {
        return tuple -> this.test(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5());
    }

    default public Prc5<T1, T2, T3, T4, T5> checked() {
        return this::test;
    }

    default public Fn1<T1, Fn1<T2, Fn1<T3, Fn1<T4, Pr1<T5>>>>> currying() {
        return t1 -> t2 -> t3 -> t4 -> t5 -> this.test(t1, t2, t3, t4, t5);
    }

    default public Pr5<T1, T2, T3, T4, T5> negated() {
        return (t1, t2, t3, t4, t5) -> !this.test(t1, t2, t3, t4, t5);
    }

    default public Pr5<T1, T2, T3, T4, T5> and(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return (t1, t2, t3, t4, t5) -> this.test(t1, t2, t3, t4, t5) && p.test(t1, t2, t3, t4, t5);
    }

    default public Pr5<T1, T2, T3, T4, T5> or(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return (t1, t2, t3, t4, t5) -> this.test(t1, t2, t3, t4, t5) || p.test(t1, t2, t3, t4, t5);
    }

    default public Pr5<T1, T2, T3, T4, T5> and(Pr0 p) {
        return (t1, t2, t3, t4, t5) -> this.test(t1, t2, t3, t4, t5) && p.test();
    }

    default public Pr5<T1, T2, T3, T4, T5> or(Pr0 p) {
        return (t1, t2, t3, t4, t5) -> this.test(t1, t2, t3, t4, t5) || p.test();
    }

    default public <I1> Pr6<I1, T1, T2, T3, T4, T5> ignoring1Lt() {
        return (i1, t1, t2, t3, t4, t5) -> this.test(t1, t2, t3, t4, t5);
    }

    default public <I1> Pr6<T1, T2, T3, T4, T5, I1> ignoring1Rt() {
        return (t1, t2, t3, t4, t5, i1) -> this.test(t1, t2, t3, t4, t5);
    }

    default public <I1, I2> Pr7<I1, I2, T1, T2, T3, T4, T5> ignoring2Lt() {
        return (i1, i2, t1, t2, t3, t4, t5) -> this.test(t1, t2, t3, t4, t5);
    }

    default public <I1, I2> Pr7<T1, T2, T3, T4, T5, I1, I2> ignoring2Rt() {
        return (t1, t2, t3, t4, t5, i1, i2) -> this.test(t1, t2, t3, t4, t5);
    }

    default public <I1, I2, I3> Pr8<I1, I2, I3, T1, T2, T3, T4, T5> ignoring3Lt() {
        return (i1, i2, i3, t1, t2, t3, t4, t5) -> this.test(t1, t2, t3, t4, t5);
    }

    default public <I1, I2, I3> Pr8<T1, T2, T3, T4, T5, I1, I2, I3> ignoring3Rt() {
        return (t1, t2, t3, t4, t5, i1, i2, i3) -> this.test(t1, t2, t3, t4, t5);
    }

    default public Pr5<T1, T2, T3, T4, T5> memoized() {
        return Function5.super.memoized()::apply;
    }

}

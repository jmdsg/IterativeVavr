package com.fiberg.iterative.function;

import com.fiberg.iterative.core.IterativeInternals;
import com.fiberg.iterative.function.Cs1;
import com.fiberg.iterative.function.Cs6;
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
import com.fiberg.iterative.function.Pr5;
import com.fiberg.iterative.function.Pr7;
import com.fiberg.iterative.function.Pr8;
import com.fiberg.iterative.function.Prc6;
import com.fiberg.iterative.function.Predicates;
import com.fiberg.iterative.function.Rn;
import com.fiberg.iterative.function.Sp;
import com.fiberg.iterative.function.Spc;
import io.vavr.Function6;
import io.vavr.Tuple;
import io.vavr.Tuple6;
import java.io.Serializable;
import java.util.Objects;

@FunctionalInterface
public interface Pr6<T1, T2, T3, T4, T5, T6> extends Function6<T1, T2, T3, T4, T5, T6, Boolean> {

    default public Boolean apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return this.test(t1, t2, t3, t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6> Pr6<T1, T2, T3, T4, T5, T6> narrow(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        return p;
    }

    public static <T1, T2, T3, T4, T5, T6> Pr6<T1, T2, T3, T4, T5, T6> empty() {
        return IterativeInternals::none;
    }

    public static <T1, T2, T3, T4, T5, T6> Pr6<T1, T2, T3, T4, T5, T6> value(Boolean b) {
        return (t1, t2, t3, t4, t5, t6) -> b;
    }

    public static <T1, T2, T3, T4, T5, T6> Pr6<T1, T2, T3, T4, T5, T6> of(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        return Pr6.narrow(p);
    }

    public static <T1, T2, T3, T4, T5, T6> Pr6<T1, T2, T3, T4, T5, T6> of1(Pr1<? super T1> f) {
        return Pr6.narrow(f.ignoring5Rt());
    }

    public static <T1, T2, T3, T4, T5, T6> Pr6<T1, T2, T3, T4, T5, T6> of2(Pr1<? super T2> f) {
        return Pr6.narrow(f.ignoring4Rt().ignoring1Lt());
    }

    public static <T1, T2, T3, T4, T5, T6> Pr6<T1, T2, T3, T4, T5, T6> of3(Pr1<? super T3> f) {
        return Pr6.narrow(f.ignoring3Rt().ignoring2Lt());
    }

    public static <T1, T2, T3, T4, T5, T6> Pr6<T1, T2, T3, T4, T5, T6> of4(Pr1<? super T4> f) {
        return Pr6.narrow(f.ignoring2Rt().ignoring3Lt());
    }

    public static <T1, T2, T3, T4, T5, T6> Pr6<T1, T2, T3, T4, T5, T6> of5(Pr1<? super T5> f) {
        return Pr6.narrow(f.ignoring1Rt().ignoring4Lt());
    }

    public static <T1, T2, T3, T4, T5, T6> Pr6<T1, T2, T3, T4, T5, T6> of6(Pr1<? super T6> f) {
        return Pr6.narrow(f.ignoring5Lt());
    }

    public static <T1, T2, T3, T4, T5, T6> Pr6<T1, T2, T3, T4, T5, T6> fromFunction(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, Boolean> f) {
        return (arg_0, arg_1, arg_2, arg_3, arg_4, arg_5) -> f.apply(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5);
    }

    public static <T1, T2, T3, T4, T5, T6> Pr6<T1, T2, T3, T4, T5, T6> fromSupplier(Sp<? extends Boolean> s) {
        return Pr6.fromFunction(Sp.narrow(s).toFunction().ignoring6());
    }

    public static <T1, T2, T3, T4, T5, T6> Pr6<T1, T2, T3, T4, T5, T6> negate(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        return Pr6.narrow(p.negated());
    }

    @SafeVarargs
    public static <T1, T2, T3, T4, T5, T6> Pr6<T1, T2, T3, T4, T5, T6> and(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> ... ps) {
        Objects.requireNonNull(ps, "ps is null");
        return Predicates.and(ps);
    }

    public static <T1, T2, T3, T4, T5, T6> Pr6<T1, T2, T3, T4, T5, T6> and(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, Pr0 ... ps) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(ps, "ps is null");
        return ps.length == 0 ? Pr6.narrow(p) : Pr6.narrow(p).and(Predicates.and(ps));
    }

    @SafeVarargs
    public static <T1, T2, T3, T4, T5, T6> Pr6<T1, T2, T3, T4, T5, T6> or(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> ... ps) {
        Objects.requireNonNull(ps, "ps is null");
        return Predicates.or(ps);
    }

    public static <T1, T2, T3, T4, T5, T6> Pr6<T1, T2, T3, T4, T5, T6> or(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, Pr0 ... ps) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(ps, "ps is null");
        return ps.length == 0 ? Pr6.narrow(p) : Pr6.narrow(p).or(Predicates.or(ps));
    }

    public static <T1, T2, T3, T4, T5, T6> Pr1<Tuple6<T1, T2, T3, T4, T5, T6>> tuple(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        return Pr6.of(p).tupled();
    }

    public static <T1, T2, T3, T4, T5, T6> Pr6<T1, T2, T3, T4, T5, T6> detuple(Pr1<? super Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> p) {
        return (t1, t2, t3, t4, t5, t6) -> p.test(Tuple.of(t1, t2, t3, t4, t5, t6));
    }

    public static <T1, T2, T3, T4, T5, T6> Pr6<T1, T2, T3, T4, T5, T6> uncheck(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        Objects.requireNonNull(p, "p is null");
        return Prc6.narrow(p).unchecked();
    }

    public static <T1, T2, T3, T4, T5, T6> Pr6<T1, T2, T3, T4, T5, T6> ignore(Pr0 p) {
        return p.ignoring6();
    }

    public static <T1, T2, T3, T4, T5, T6> Pr6<T1, T2, T3, T4, T5, T6> ignore5Rt(Pr1<? super T1> p) {
        return Pr1.narrow(p).ignoring5Rt();
    }

    public static <T1, T2, T3, T4, T5, T6> Pr6<T1, T2, T3, T4, T5, T6> ignore5Lt(Pr1<? super T6> p) {
        return Pr1.narrow(p).ignoring5Lt();
    }

    public static <T1, T2, T3, T4, T5, T6> Pr6<T1, T2, T3, T4, T5, T6> ignore4Rt(Pr2<? super T1, ? super T2> p) {
        return Pr2.narrow(p).ignoring4Rt();
    }

    public static <T1, T2, T3, T4, T5, T6> Pr6<T1, T2, T3, T4, T5, T6> ignore4Lt(Pr2<? super T5, ? super T6> p) {
        return Pr2.narrow(p).ignoring4Lt();
    }

    public static <T1, T2, T3, T4, T5, T6> Pr6<T1, T2, T3, T4, T5, T6> ignore3Rt(Pr3<? super T1, ? super T2, ? super T3> p) {
        return Pr3.narrow(p).ignoring3Rt();
    }

    public static <T1, T2, T3, T4, T5, T6> Pr6<T1, T2, T3, T4, T5, T6> ignore3Lt(Pr3<? super T4, ? super T5, ? super T6> p) {
        return Pr3.narrow(p).ignoring3Lt();
    }

    public static <T1, T2, T3, T4, T5, T6> Pr6<T1, T2, T3, T4, T5, T6> ignore2Rt(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        return Pr4.narrow(p).ignoring2Rt();
    }

    public static <T1, T2, T3, T4, T5, T6> Pr6<T1, T2, T3, T4, T5, T6> ignore2Lt(Pr4<? super T3, ? super T4, ? super T5, ? super T6> p) {
        return Pr4.narrow(p).ignoring2Lt();
    }

    public static <T1, T2, T3, T4, T5, T6> Pr6<T1, T2, T3, T4, T5, T6> ignore1Rt(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return Pr5.narrow(p).ignoring1Rt();
    }

    public static <T1, T2, T3, T4, T5, T6> Pr6<T1, T2, T3, T4, T5, T6> ignore1Lt(Pr5<? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        return Pr5.narrow(p).ignoring1Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr6<T1, T2, T3, T4, T5, T6> passRt(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, T7 t7) {
        return Pr6.narrow(p.testRt(t7));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr6<T1, T2, T3, T4, T5, T6> passRt(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, T7 t7, T8 t8) {
        return Pr6.narrow(p.testRt(t7, t8));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr6<T2, T3, T4, T5, T6, T7> passLt(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, T1 t1) {
        return Pr6.narrow(p.testLt(t1));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr6<T3, T4, T5, T6, T7, T8> passLt(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, T1 t1, T2 t2) {
        return Pr6.narrow(p.testLt(t1, t2));
    }

    public static <T1, T2, T3, T4, T5, T6> boolean passAndTest(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return Pr0.pass(p, t1, t2, t3, t4, t5, t6).test();
    }

    public static <T1, T2, T3, T4, T5, T6> Pr6<T6, T5, T4, T3, T2, T1> invert(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        return Pr6.narrow(p).inverted();
    }

    public boolean test(T1 var1, T2 var2, T3 var3, T4 var4, T5 var5, T6 var6);

    default public Pr5<T2, T3, T4, T5, T6> testLt(T1 t1) {
        return (t2, t3, t4, t5, t6) -> this.test(t1, t2, t3, t4, t5, t6);
    }

    default public Pr4<T3, T4, T5, T6> testLt(T1 t1, T2 t2) {
        return (t3, t4, t5, t6) -> this.test(t1, t2, t3, t4, t5, t6);
    }

    default public Pr3<T4, T5, T6> testLt(T1 t1, T2 t2, T3 t3) {
        return (t4, t5, t6) -> this.test(t1, t2, t3, t4, t5, t6);
    }

    default public Pr2<T5, T6> testLt(T1 t1, T2 t2, T3 t3, T4 t4) {
        return (t5, t6) -> this.test(t1, t2, t3, t4, t5, t6);
    }

    default public Pr1<T6> testLt(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return t6 -> this.test(t1, t2, t3, t4, t5, t6);
    }

    default public Pr5<T1, T2, T3, T4, T5> testRt(T6 t6) {
        return (t1, t2, t3, t4, t5) -> this.test(t1, t2, t3, t4, t5, t6);
    }

    default public Pr4<T1, T2, T3, T4> testRt(T5 t5, T6 t6) {
        return (t1, t2, t3, t4) -> this.test(t1, t2, t3, t4, t5, t6);
    }

    default public Pr3<T1, T2, T3> testRt(T4 t4, T5 t5, T6 t6) {
        return (t1, t2, t3) -> this.test(t1, t2, t3, t4, t5, t6);
    }

    default public Pr2<T1, T2> testRt(T3 t3, T4 t4, T5 t5, T6 t6) {
        return (t1, t2) -> this.test(t1, t2, t3, t4, t5, t6);
    }

    default public Pr1<T1> testRt(T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return t1 -> this.test(t1, t2, t3, t4, t5, t6);
    }

    default public Fn6<T1, T2, T3, T4, T5, T6, Boolean> toFunction() {
        return (arg_0, arg_1, arg_2, arg_3, arg_4, arg_5) -> this.test(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5);
    }

    default public Cs6<T1, T2, T3, T4, T5, T6> toConsumer() {
        return (arg_0, arg_1, arg_2, arg_3, arg_4, arg_5) -> this.test(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5);
    }

    default public Pr0 toPredicate(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return () -> this.test(t1, t2, t3, t4, t5, t6);
    }

    default public Sp<Boolean> toSupplier(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return this.toPredicate(t1, t2, t3, t4, t5, t6).toSupplier();
    }

    default public Rn toRunnable(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return this.toPredicate(t1, t2, t3, t4, t5, t6).toRunnable();
    }

    default public <R> R passEvalued(Sp<? extends R> onSuccess, Sp<? extends R> onFailure, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return this.toPredicate(t1, t2, t3, t4, t5, t6).evalued(onSuccess, onFailure);
    }

    default public <R> R passEvalued(Sp<? extends R> onSuccess, R onFailure, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return this.toPredicate(t1, t2, t3, t4, t5, t6).evalued(onSuccess, onFailure);
    }

    default public <R> R passEvalued(R onSuccess, Sp<? extends R> onFailure, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return this.toPredicate(t1, t2, t3, t4, t5, t6).evalued(onSuccess, onFailure);
    }

    default public <R> R passEvalued(R onSuccess, R onFailure, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return this.toPredicate(t1, t2, t3, t4, t5, t6).evalued(onSuccess, onFailure);
    }

    default public <R> R passEvaluedOnSuccess(Sp<? extends R> onSuccess, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return this.toPredicate(t1, t2, t3, t4, t5, t6).evaluedOnSuccess(onSuccess);
    }

    default public <R> R passEvaluedOnFailure(Sp<? extends R> onFailure, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return this.toPredicate(t1, t2, t3, t4, t5, t6).evaluedOnFailure(onFailure);
    }

    default public <R> R passEvaluedOnSuccess(R onSuccess, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return this.toPredicate(t1, t2, t3, t4, t5, t6).evaluedOnSuccess(onSuccess);
    }

    default public <R> R passEvaluedOnFailure(R onFailure, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return this.toPredicate(t1, t2, t3, t4, t5, t6).evaluedOnFailure(onFailure);
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> afterRunOn(Rn onSuccess, Rn onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6) -> {
            Boolean value = this.test(t1, t2, t3, t4, t5, t6);
            (value != false ? onSuccess : onFailure).run();
            return value;
        };
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> afterTestOn(Pr1<Boolean> onSuccess, Pr1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.toFunction(), onFailure.toFunction());
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> afterTestOn(Pr0 onSuccess, Pr0 onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterTestOn(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> afterApplyOn(Fn1<Boolean, Boolean> onSuccess, Fn1<Boolean, Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return Pr6.fromFunction(this.afterApplyOnTo(onSuccess, onFailure));
    }

    default public <R> Fn6<T1, T2, T3, T4, T5, T6, R> afterApplyOnTo(Fn1<Boolean, ? extends R> onSuccess, Fn1<Boolean, ? extends R> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6) -> {
            Boolean value = this.test(t1, t2, t3, t4, t5, t6);
            return (value != false ? onSuccess : onFailure).apply(value);
        };
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> afterApplyOn(Fn0<Boolean> onSuccess, Fn0<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onFailure.ignoring1(), onFailure.ignoring1());
    }

    default public <R> Fn6<T1, T2, T3, T4, T5, T6, R> afterApplyOnTo(Fn0<? extends R> onSuccess, Fn0<? extends R> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOnTo(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> afterGetOn(Sp<Boolean> onSuccess, Sp<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Cs6<T1, T2, T3, T4, T5, T6> afterAcceptOnTo(Cs1<Boolean> onSuccess, Cs1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOnTo(onSuccess.toFunction(null), onFailure.toFunction(null)).toConsumer();
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> afterAcceptOn(Cs1<Boolean> onSuccess, Cs1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.toFunction(null), onFailure.toFunction(null));
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> afterRun(Rn r) {
        return this.afterRunOn(r, r);
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> afterTest(Pr1<Boolean> p) {
        return this.afterTestOn(p, p);
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> afterTest(Pr0 p) {
        return this.afterTestOn(p, p);
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> afterApply(Fn1<Boolean, Boolean> f) {
        return this.afterApplyOn(f, f);
    }

    default public <R> Fn6<T1, T2, T3, T4, T5, T6, R> afterApplyTo(Fn1<Boolean, ? extends R> f) {
        return this.afterApplyOnTo(f, f);
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> afterApply(Fn0<Boolean> f) {
        return this.afterApplyOn(f, f);
    }

    default public <R> Fn6<T1, T2, T3, T4, T5, T6, R> afterApplyTo(Fn0<? extends R> f) {
        return this.afterApplyOnTo(f, f);
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> afterGet(Sp<Boolean> s) {
        return this.afterGetOn(s, s);
    }

    default public Cs6<T1, T2, T3, T4, T5, T6> afterAcceptTo(Cs1<Boolean> c) {
        return this.afterAcceptOnTo(c, c);
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> afterAccept(Cs1<Boolean> c) {
        return this.afterAcceptOn(c, c);
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> beforeWrap(Pr1<? super Spc<Boolean>> wrap) {
        return Pr6.fromFunction(this.beforeWrapTo(wrap.toFunction()));
    }

    default public <W> Fn6<T1, T2, T3, T4, T5, T6, W> beforeWrapTo(Fn1<? super Spc<Boolean>, ? extends W> wrap) {
        return (t1, t2, t3, t4, t5, t6) -> wrap.apply(this.toSupplier(t1, t2, t3, t4, t5, t6).checked());
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> afterRunOnSuccess(Rn r) {
        return this.afterRunOn(r, Rn.empty());
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> afterTestOnSuccess(Pr1<Boolean> p) {
        return this.afterTestOn(p, Pr1.empty());
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> afterTestOnSuccess(Pr0 p) {
        return this.afterTestOn(p, Pr0.empty());
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> afterApplyOnSuccess(Fn1<Boolean, Boolean> f) {
        return this.afterApplyOn(f, Fn1.empty());
    }

    default public <R> Fn6<T1, T2, T3, T4, T5, T6, R> afterApplyOnSuccessTo(Fn1<Boolean, ? extends R> f) {
        return this.afterApplyOnTo(f, Fn1.empty());
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> afterApplyOnSuccess(Fn0<Boolean> f) {
        return this.afterApplyOn(f, Fn0.empty());
    }

    default public <R> Fn6<T1, T2, T3, T4, T5, T6, R> afterApplyOnSuccessTo(Fn0<? extends R> f) {
        return this.afterApplyOnTo(f, Fn0.empty());
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> afterGetOnSuccess(Sp<Boolean> s) {
        return this.afterGetOn(s, Sp.empty());
    }

    default public Cs6<T1, T2, T3, T4, T5, T6> afterAcceptOnSuccessTo(Cs1<Boolean> c) {
        return this.afterAcceptOnTo(c, Cs1.empty());
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> afterAcceptOnSuccess(Cs1<Boolean> c) {
        return this.afterAcceptOn(c, Cs1.empty());
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> afterRunOnFailure(Rn r) {
        return this.negated().afterRunOnSuccess(r);
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> afterTestOnFailure(Pr1<Boolean> p) {
        return this.negated().afterTestOnSuccess(p);
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> afterTestOnFailure(Pr0 p) {
        return this.negated().afterTestOnSuccess(p);
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> afterApplyOnFailure(Fn1<Boolean, Boolean> f) {
        return this.negated().afterApplyOnSuccess(f);
    }

    default public <R> Fn6<T1, T2, T3, T4, T5, T6, R> afterApplyOnFailureTo(Fn1<Boolean, ? extends R> f) {
        return this.negated().afterApplyOnSuccessTo(f);
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> afterApplyOnFailure(Fn0<Boolean> f) {
        return this.negated().afterApplyOnSuccess(f);
    }

    default public <R> Fn6<T1, T2, T3, T4, T5, T6, R> afterApplyOnFailureTo(Fn0<? extends R> f) {
        return this.negated().afterApplyOnSuccessTo(f);
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> afterGetOnFailure(Sp<Boolean> s) {
        return this.negated().afterGetOnSuccess(s);
    }

    default public Cs6<T1, T2, T3, T4, T5, T6> afterAcceptOnFailureTo(Cs1<Boolean> c) {
        return this.negated().afterAcceptOnSuccessTo(c);
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> afterAcceptOnFailure(Cs1<Boolean> c) {
        return this.negated().afterAcceptOnSuccess(c);
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> beforeRun(Rn r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2, t3, t4, t5, t6) -> {
            r.run();
            return this.test(t1, t2, t3, t4, t5, t6);
        };
    }

    default public <B1, B2, B3, B4, B5, B6> Pr6<B1, B2, B3, B4, B5, B6> beforeApply(Fn6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> f) {
        return this.beforeApply6(f);
    }

    default public <B1> Pr1<B1> beforeApply1(Fn1<? super B1, ? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> f) {
        Objects.requireNonNull(f, "f is null");
        return b1 -> this.tupled().test(Tuple.narrow((f.apply(b1))));
    }

    default public <B1, B2> Pr2<B1, B2> beforeApply2(Fn2<? super B1, ? super B2, ? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2))));
    }

    default public <B1, B2, B3> Pr3<B1, B2, B3> beforeApply3(Fn3<? super B1, ? super B2, ? super B3, ? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3))));
    }

    default public <B1, B2, B3, B4> Pr4<B1, B2, B3, B4> beforeApply4(Fn4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4))));
    }

    default public <B1, B2, B3, B4, B5> Pr5<B1, B2, B3, B4, B5> beforeApply5(Fn5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5))));
    }

    default public <B1, B2, B3, B4, B5, B6> Pr6<B1, B2, B3, B4, B5, B6> beforeApply6(Fn6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Pr7<B1, B2, B3, B4, B5, B6, B7> beforeApply7(Fn7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Pr8<B1, B2, B3, B4, B5, B6, B7, B8> beforeApply8(Fn8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7, b8) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7, b8))));
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> beforeTestOnSuccess(Pr0 p, Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6) -> p.test() ? this.test(t1, t2, t3, t4, t5, t6) : onFailure.test(t1, t2, t3, t4, t5, t6);
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> beforeTestOnSuccess(Pr0 p, Sp<? extends Boolean> onFailure) {
        return this.beforeTestOnSuccess(p, Pr6.fromSupplier(onFailure));
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> beforeTestOnSuccess(Pr0 p, Boolean onFailure) {
        return this.beforeTestOnSuccess(p, Pr6.value(onFailure));
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> beforeTestOnSuccess(Pr0 p) {
        return this.beforeTestOnSuccess(p, Pr6.empty());
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> beforeTestOnFailure(Pr0 p, Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> beforeTestOnFailure(Pr0 p, Sp<? extends Boolean> onSuccess) {
        return this.beforeTestOnFailure(p, Pr6.fromSupplier(onSuccess));
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> beforeTestOnFailure(Pr0 p, Boolean onSuccess) {
        return this.beforeTestOnFailure(p, Pr6.value(onSuccess));
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> beforeTestOnFailure(Pr0 p) {
        return this.beforeTestOnFailure(p, Pr6.empty());
    }

    default public Pr0 beforeGet(Sp<? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> s) {
        Objects.requireNonNull(s, "s is null");
        return () -> this.tupled().test(Tuple.narrow((s.get())));
    }

    default public Pr6<T6, T5, T4, T3, T2, T1> inverted() {
        return (t6, t5, t4, t3, t2, t1) -> this.test(t1, t2, t3, t4, t5, t6);
    }

    default public <S> Pr6<T1, T2, T3, T4, T5, T6> afterPassingThroughApplyOn(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends S> onSuccess, Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends S> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6) -> {
            Boolean result = this.test(t1, t2, t3, t4, t5, t6);
            Fn6.narrow(result != false ? onSuccess : onFailure).apply(t1, t2, t3, t4, t5, t6);
            return result;
        };
    }

    default public <S> Fn6<T1, T2, T3, T4, T5, T6, S> afterPassingThroughApplyOnTo(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends S> onSuccess, Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends S> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6) -> Fn6.narrow(this.test(t1, t2, t3, t4, t5, t6) ? onSuccess : onFailure).apply(t1, t2, t3, t4, t5, t6);
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> afterPassingThroughAcceptOn(Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onSuccess, Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6) -> {
            Boolean result = this.test(t1, t2, t3, t4, t5, t6);
            Cs6.narrow(result != false ? onSuccess : onFailure).accept(t1, t2, t3, t4, t5, t6);
            return result;
        };
    }

    default public Cs6<T1, T2, T3, T4, T5, T6> afterPassingThroughAcceptOnTo(Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onSuccess, Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6) -> Cs6.narrow(this.test(t1, t2, t3, t4, t5, t6) ? onSuccess : onFailure).accept(t1, t2, t3, t4, t5, t6);
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> afterPassingThroughTestOn(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onSuccess, Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6) -> Pr6.narrow(this.test(t1, t2, t3, t4, t5, t6) ? onSuccess : onFailure).test(t1, t2, t3, t4, t5, t6);
    }

    default public <S> Pr6<T1, T2, T3, T4, T5, T6> afterPassingThroughApply(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends S> f) {
        return this.afterPassingThroughApplyOn(f, f);
    }

    default public <S> Fn6<T1, T2, T3, T4, T5, T6, S> afterPassingThroughApplyTo(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends S> f) {
        return this.afterPassingThroughApplyOnTo(f, f);
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> afterPassingThroughAccept(Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c) {
        return this.afterPassingThroughAcceptOn(c, c);
    }

    default public Cs6<T1, T2, T3, T4, T5, T6> afterPassingThroughAcceptTo(Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c) {
        return this.afterPassingThroughAcceptOnTo(c, c);
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> afterPassingThroughTest(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        return this.afterPassingThroughTestOn(p, p);
    }

    default public <S> Pr6<T1, T2, T3, T4, T5, T6> afterSuccessPassingThroughApply(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends S> onSuccess) {
        return this.afterPassingThroughApplyOn(onSuccess, Fn6.empty());
    }

    default public <S> Fn6<T1, T2, T3, T4, T5, T6, S> afterSuccessPassingThroughApplyTo(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends S> onSuccess) {
        return this.afterPassingThroughApplyOnTo(onSuccess, Fn6.empty());
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> afterSuccessPassingThroughAccept(Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onSuccess) {
        return this.afterPassingThroughAcceptOn(onSuccess, Cs6.empty());
    }

    default public Cs6<T1, T2, T3, T4, T5, T6> afterSuccessPassingThroughAcceptTo(Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onSuccess) {
        return this.afterPassingThroughAcceptOnTo(onSuccess, Cs6.empty());
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> afterSuccessPassingThroughTest(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onSuccess) {
        return this.afterPassingThroughTestOn(onSuccess, Pr6.empty());
    }

    default public <S> Pr6<T1, T2, T3, T4, T5, T6> afterFailurePassingThroughApply(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends S> onFailure) {
        return this.negated().afterSuccessPassingThroughApply(onFailure);
    }

    default public <S> Fn6<T1, T2, T3, T4, T5, T6, S> afterFailurePassingThroughApplyTo(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends S> onFailure) {
        return this.negated().afterSuccessPassingThroughApplyTo(onFailure);
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> afterFailurePassingThroughAccept(Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onFailure) {
        return this.negated().afterSuccessPassingThroughAccept(onFailure);
    }

    default public Cs6<T1, T2, T3, T4, T5, T6> afterFailurePassingThroughAcceptTo(Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onFailure) {
        return this.negated().afterSuccessPassingThroughAcceptTo(onFailure);
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> afterFailurePassingThroughTest(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onFailure) {
        return this.negated().afterSuccessPassingThroughTest(onFailure);
    }

    default public <R> Pr6<T1, T2, T3, T4, T5, T6> beforePassingThroughApply(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5, t6) -> {
            f.apply(t1, t2, t3, t4, t5, t6);
            return this.test(t1, t2, t3, t4, t5, t6);
        };
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> beforePassingThroughTest(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5, t6) -> {
            p.test(t1, t2, t3, t4, t5, t6);
            return this.test(t1, t2, t3, t4, t5, t6);
        };
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> beforePassingThroughAccept(Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5, t6) -> {
            c.accept(t1, t2, t3, t4, t5, t6);
            return this.test(t1, t2, t3, t4, t5, t6);
        };
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> beforeSuccessPassingThroughTest(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6) -> p.test(t1, t2, t3, t4, t5, t6) ? this.test(t1, t2, t3, t4, t5, t6) : onFailure.test(t1, t2, t3, t4, t5, t6);
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> beforeSuccessPassingThroughTest(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, Sp<? extends Boolean> onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Pr6.fromSupplier(onFailure));
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> beforeSuccessPassingThroughTest(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, Boolean onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Pr6.value(onFailure));
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> beforeSuccessPassingThroughTest(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        return this.beforeSuccessPassingThroughTest(p, Pr6.empty());
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> beforeFailurePassingThroughTest(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> beforeFailurePassingThroughTest(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, Sp<? extends Boolean> onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Pr6.fromSupplier(onSuccess));
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> beforeFailurePassingThroughTest(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, Boolean onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Pr6.value(onSuccess));
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> beforeFailurePassingThroughTest(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        return this.beforeFailurePassingThroughTest(p, Pr6.empty());
    }

    default public Pr1<Tuple6<T1, T2, T3, T4, T5, T6>> tupled() {
        return tuple -> this.test(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5(), tuple._6());
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> checked() {
        return (arg_0, arg_1, arg_2, arg_3, arg_4, arg_5) -> this.test(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5);
    }

    default public Fn1<T1, Fn1<T2, Fn1<T3, Fn1<T4, Fn1<T5, Pr1<T6>>>>>> currying() {
        return t1 -> t2 -> t3 -> t4 -> t5 -> t6 -> this.test(t1, t2, t3, t4, t5, t6);
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> negated() {
        return (t1, t2, t3, t4, t5, t6) -> !this.test(t1, t2, t3, t4, t5, t6);
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> and(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        return (t1, t2, t3, t4, t5, t6) -> this.test(t1, t2, t3, t4, t5, t6) && p.test(t1, t2, t3, t4, t5, t6);
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> or(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        return (t1, t2, t3, t4, t5, t6) -> this.test(t1, t2, t3, t4, t5, t6) || p.test(t1, t2, t3, t4, t5, t6);
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> and(Pr0 p) {
        return (t1, t2, t3, t4, t5, t6) -> this.test(t1, t2, t3, t4, t5, t6) && p.test();
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> or(Pr0 p) {
        return (t1, t2, t3, t4, t5, t6) -> this.test(t1, t2, t3, t4, t5, t6) || p.test();
    }

    default public <I1> Pr7<I1, T1, T2, T3, T4, T5, T6> ignoring1Lt() {
        return (i1, t1, t2, t3, t4, t5, t6) -> this.test(t1, t2, t3, t4, t5, t6);
    }

    default public <I1> Pr7<T1, T2, T3, T4, T5, T6, I1> ignoring1Rt() {
        return (t1, t2, t3, t4, t5, t6, i1) -> this.test(t1, t2, t3, t4, t5, t6);
    }

    default public <I1, I2> Pr8<I1, I2, T1, T2, T3, T4, T5, T6> ignoring2Lt() {
        return (i1, i2, t1, t2, t3, t4, t5, t6) -> this.test(t1, t2, t3, t4, t5, t6);
    }

    default public <I1, I2> Pr8<T1, T2, T3, T4, T5, T6, I1, I2> ignoring2Rt() {
        return (t1, t2, t3, t4, t5, t6, i1, i2) -> this.test(t1, t2, t3, t4, t5, t6);
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> memoized() {
        return (arg_0, arg_1, arg_2, arg_3, arg_4, arg_5) -> ((Function6) super.memoized()).apply(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5);
    }

}

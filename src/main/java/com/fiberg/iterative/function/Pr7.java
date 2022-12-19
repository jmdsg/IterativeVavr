package com.fiberg.iterative.function;

import com.fiberg.iterative.core.IterativeInternals;
import io.vavr.Function7;
import io.vavr.Tuple;
import io.vavr.Tuple7;

import java.util.Objects;

@FunctionalInterface
public interface Pr7<T1, T2, T3, T4, T5, T6, T7> extends Function7<T1, T2, T3, T4, T5, T6, T7, Boolean> {

    default public Boolean apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr7<T1, T2, T3, T4, T5, T6, T7> narrow(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        @SuppressWarnings("unchecked")
        final Pr7<T1, T2, T3, T4, T5, T6, T7> pr = (Pr7<T1, T2, T3, T4, T5, T6, T7>) p;
        return pr;
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr7<T1, T2, T3, T4, T5, T6, T7> empty() {
        return IterativeInternals::none;
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr7<T1, T2, T3, T4, T5, T6, T7> value(Boolean b) {
        return (t1, t2, t3, t4, t5, t6, t7) -> b;
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr7<T1, T2, T3, T4, T5, T6, T7> of(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        return Pr7.narrow(p);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr7<T1, T2, T3, T4, T5, T6, T7> of1(Pr1<? super T1> f) {
        return Pr7.<T1, T2, T3, T4, T5, T6, T7>narrow(f.ignoring6Rt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr7<T1, T2, T3, T4, T5, T6, T7> of2(Pr1<? super T2> f) {
        return Pr7.<T1, T2, T3, T4, T5, T6, T7>narrow(f.ignoring5Rt().ignoring1Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr7<T1, T2, T3, T4, T5, T6, T7> of3(Pr1<? super T3> f) {
        return Pr7.<T1, T2, T3, T4, T5, T6, T7>narrow(f.ignoring4Rt().ignoring2Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr7<T1, T2, T3, T4, T5, T6, T7> of4(Pr1<? super T4> f) {
        return Pr7.<T1, T2, T3, T4, T5, T6, T7>narrow(f.ignoring3Rt().ignoring3Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr7<T1, T2, T3, T4, T5, T6, T7> of5(Pr1<? super T5> f) {
        return Pr7.<T1, T2, T3, T4, T5, T6, T7>narrow(f.ignoring2Rt().ignoring4Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr7<T1, T2, T3, T4, T5, T6, T7> of6(Pr1<? super T6> f) {
        return Pr7.<T1, T2, T3, T4, T5, T6, T7>narrow(f.ignoring1Rt().ignoring5Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr7<T1, T2, T3, T4, T5, T6, T7> of7(Pr1<? super T7> f) {
        return Pr7.<T1, T2, T3, T4, T5, T6, T7>narrow(f.ignoring6Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr7<T1, T2, T3, T4, T5, T6, T7> fromFunction(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, Boolean> f) {
        return f::apply;
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr7<T1, T2, T3, T4, T5, T6, T7> fromSupplier(Sp<? extends Boolean> s) {
        return Pr7.fromFunction(Sp.<Boolean>narrow(s).toFunction().ignoring7());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr7<T1, T2, T3, T4, T5, T6, T7> negate(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        return Pr7.<T1, T2, T3, T4, T5, T6, T7>narrow(p.negated());
    }

    @SafeVarargs
    public static <T1, T2, T3, T4, T5, T6, T7> Pr7<T1, T2, T3, T4, T5, T6, T7> and(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> ... ps) {
        Objects.requireNonNull(ps, "ps is null");
        return Predicates.and(ps);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr7<T1, T2, T3, T4, T5, T6, T7> and(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, Pr0 ... ps) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(ps, "ps is null");
        return ps.length == 0 ? Pr7.narrow(p) : Pr7.<T1, T2, T3, T4, T5, T6, T7>narrow(p).and(Predicates.and(ps));
    }

    @SafeVarargs
    public static <T1, T2, T3, T4, T5, T6, T7> Pr7<T1, T2, T3, T4, T5, T6, T7> or(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> ... ps) {
        Objects.requireNonNull(ps, "ps is null");
        return Predicates.or(ps);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr7<T1, T2, T3, T4, T5, T6, T7> or(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, Pr0 ... ps) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(ps, "ps is null");
        return ps.length == 0 ? Pr7.narrow(p) : Pr7.<T1, T2, T3, T4, T5, T6, T7>narrow(p).or(Predicates.or(ps));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> tuple(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        return Pr7.<T1, T2, T3, T4, T5, T6, T7>of(p).tupled();
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr7<T1, T2, T3, T4, T5, T6, T7> detuple(Pr1<? super Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> p) {
        return (t1, t2, t3, t4, t5, t6, t7) -> p.test(Tuple.of(t1, t2, t3, t4, t5, t6, t7));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr7<T1, T2, T3, T4, T5, T6, T7> uncheck(Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        Objects.requireNonNull(p, "p is null");
        return Prc7.<T1, T2, T3, T4, T5, T6, T7>narrow(p).unchecked();
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr7<T1, T2, T3, T4, T5, T6, T7> ignore(Pr0 p) {
        return p.ignoring7();
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr7<T1, T2, T3, T4, T5, T6, T7> ignore6Rt(Pr1<? super T1> p) {
        return Pr1.<T1>narrow(p).ignoring6Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr7<T1, T2, T3, T4, T5, T6, T7> ignore6Lt(Pr1<? super T7> p) {
        return Pr1.<T7>narrow(p).ignoring6Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr7<T1, T2, T3, T4, T5, T6, T7> ignore5Rt(Pr2<? super T1, ? super T2> p) {
        return Pr2.<T1, T2>narrow(p).ignoring5Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr7<T1, T2, T3, T4, T5, T6, T7> ignore5Lt(Pr2<? super T6, ? super T7> p) {
        return Pr2.<T6, T7>narrow(p).ignoring5Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr7<T1, T2, T3, T4, T5, T6, T7> ignore4Rt(Pr3<? super T1, ? super T2, ? super T3> p) {
        return Pr3.<T1, T2, T3>narrow(p).ignoring4Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr7<T1, T2, T3, T4, T5, T6, T7> ignore4Lt(Pr3<? super T5, ? super T6, ? super T7> p) {
        return Pr3.<T5, T6, T7>narrow(p).ignoring4Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr7<T1, T2, T3, T4, T5, T6, T7> ignore3Rt(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        return Pr4.<T1, T2, T3, T4>narrow(p).ignoring3Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr7<T1, T2, T3, T4, T5, T6, T7> ignore3Lt(Pr4<? super T4, ? super T5, ? super T6, ? super T7> p) {
        return Pr4.<T4, T5, T6, T7>narrow(p).ignoring3Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr7<T1, T2, T3, T4, T5, T6, T7> ignore2Rt(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return Pr5.<T1, T2, T3, T4, T5>narrow(p).ignoring2Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr7<T1, T2, T3, T4, T5, T6, T7> ignore2Lt(Pr5<? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        return Pr5.<T3, T4, T5, T6, T7>narrow(p).ignoring2Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr7<T1, T2, T3, T4, T5, T6, T7> ignore1Rt(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        return Pr6.<T1, T2, T3, T4, T5, T6>narrow(p).ignoring1Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr7<T1, T2, T3, T4, T5, T6, T7> ignore1Lt(Pr6<? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        return Pr6.<T2, T3, T4, T5, T6, T7>narrow(p).ignoring1Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr7<T1, T2, T3, T4, T5, T6, T7> passRt(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, T8 t8) {
        return Pr7.narrow(p.testRt(t8));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr7<T2, T3, T4, T5, T6, T7, T8> passLt(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, T1 t1) {
        return Pr7.narrow(p.testLt(t1));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr7<T7, T6, T5, T4, T3, T2, T1> invert(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        return Pr7.<T1, T2, T3, T4, T5, T6, T7>narrow(p).inverted();
    }

    public boolean test(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7);

    default public Pr6<T2, T3, T4, T5, T6, T7> testLt(T1 t1) {
        return (t2, t3, t4, t5, t6, t7) -> this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Pr5<T3, T4, T5, T6, T7> testLt(T1 t1, T2 t2) {
        return (t3, t4, t5, t6, t7) -> this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Pr4<T4, T5, T6, T7> testLt(T1 t1, T2 t2, T3 t3) {
        return (t4, t5, t6, t7) -> this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Pr3<T5, T6, T7> testLt(T1 t1, T2 t2, T3 t3, T4 t4) {
        return (t5, t6, t7) -> this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Pr2<T6, T7> testLt(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return (t6, t7) -> this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Pr1<T7> testLt(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return t7 -> this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> testRt(T7 t7) {
        return (t1, t2, t3, t4, t5, t6) -> this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Pr5<T1, T2, T3, T4, T5> testRt(T6 t6, T7 t7) {
        return (t1, t2, t3, t4, t5) -> this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Pr4<T1, T2, T3, T4> testRt(T5 t5, T6 t6, T7 t7) {
        return (t1, t2, t3, t4) -> this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Pr3<T1, T2, T3> testRt(T4 t4, T5 t5, T6 t6, T7 t7) {
        return (t1, t2, t3) -> this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Pr2<T1, T2> testRt(T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return (t1, t2) -> this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Pr1<T1> testRt(T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return t1 -> this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> boolean passAndTest(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return Pr0.pass(p, t1, t2, t3, t4, t5, t6, t7).test();
    }

    default public Fn7<T1, T2, T3, T4, T5, T6, T7, Boolean> toFunction() {
        return this::test;
    }

    default public Cs7<T1, T2, T3, T4, T5, T6, T7> toConsumer() {
        return this::test;
    }

    default public Pr0 toPredicate(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return () -> this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Sp<Boolean> toSupplier(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return this.toPredicate(t1, t2, t3, t4, t5, t6, t7).toSupplier();
    }

    default public Rn toRunnable(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return this.toPredicate(t1, t2, t3, t4, t5, t6, t7).toRunnable();
    }

    default public <R> R passEvaluated(Sp<? extends R> onSuccess, Sp<? extends R> onFailure, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return this.toPredicate(t1, t2, t3, t4, t5, t6, t7).evaluated(onSuccess, onFailure);
    }

    default public <R> R passEvaluated(Sp<? extends R> onSuccess, R onFailure, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return this.toPredicate(t1, t2, t3, t4, t5, t6, t7).evaluated(onSuccess, onFailure);
    }

    default public <R> R passEvaluated(R onSuccess, Sp<? extends R> onFailure, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return this.toPredicate(t1, t2, t3, t4, t5, t6, t7).evaluated(onSuccess, onFailure);
    }

    default public <R> R passEvaluated(R onSuccess, R onFailure, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return this.toPredicate(t1, t2, t3, t4, t5, t6, t7).evaluated(onSuccess, onFailure);
    }

    default public <R> R passEvaluatedOnSuccess(Sp<? extends R> onSuccess, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return this.toPredicate(t1, t2, t3, t4, t5, t6, t7).evaluatedOnSuccess(onSuccess);
    }

    default public <R> R passEvaluatedOnFailure(Sp<? extends R> onFailure, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return this.toPredicate(t1, t2, t3, t4, t5, t6, t7).evaluatedOnFailure(onFailure);
    }

    default public <R> R passEvaluatedOnSuccess(R onSuccess, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return this.toPredicate(t1, t2, t3, t4, t5, t6, t7).evaluatedOnSuccess(onSuccess);
    }

    default public <R> R passEvaluatedOnFailure(R onFailure, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return this.toPredicate(t1, t2, t3, t4, t5, t6, t7).evaluatedOnFailure(onFailure);
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> afterRunOn(Rn onSuccess, Rn onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> {
            boolean result = this.test(t1, t2, t3, t4, t5, t6, t7);
            (result ? onSuccess : onFailure).run();
            return result;
        };
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> afterTestOn(Pr1<Boolean> onSuccess, Pr1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.toFunction(), onFailure.toFunction());
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> afterTestOn(Pr0 onSuccess, Pr0 onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterTestOn(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> afterApplyOn(Fn1<Boolean, Boolean> onSuccess, Fn1<Boolean, Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return Pr7.fromFunction(this.afterApplyOnTo(onSuccess, onFailure));
    }

    default public <R> Fn7<T1, T2, T3, T4, T5, T6, T7, R> afterApplyOnTo(Fn1<Boolean, ? extends R> onSuccess, Fn1<Boolean, ? extends R> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> {
            boolean result = this.test(t1, t2, t3, t4, t5, t6, t7);
            return (result ? onSuccess : onFailure).apply(result);
        };
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> afterApplyOn(Fn0<Boolean> onSuccess, Fn0<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onFailure.ignoring1(), onFailure.ignoring1());
    }

    default public <R> Fn7<T1, T2, T3, T4, T5, T6, T7, R> afterApplyOnTo(Fn0<? extends R> onSuccess, Fn0<? extends R> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOnTo(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> afterGetOn(Sp<Boolean> onSuccess, Sp<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Cs7<T1, T2, T3, T4, T5, T6, T7> afterAcceptOnTo(Cs1<Boolean> onSuccess, Cs1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOnTo(onSuccess.toFunction(null), onFailure.toFunction(null)).toConsumer();
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> afterAcceptOn(Cs1<Boolean> onSuccess, Cs1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.toFunction(null), onFailure.toFunction(null));
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> afterRun(Rn r) {
        return this.afterRunOn(r, r);
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> afterTest(Pr1<Boolean> p) {
        return this.afterTestOn(p, p);
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> afterTest(Pr0 p) {
        return this.afterTestOn(p, p);
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> afterApply(Fn1<Boolean, Boolean> f) {
        return this.afterApplyOn(f, f);
    }

    default public <R> Fn7<T1, T2, T3, T4, T5, T6, T7, R> afterApplyTo(Fn1<Boolean, ? extends R> f) {
        return this.afterApplyOnTo(f, f);
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> afterApply(Fn0<Boolean> f) {
        return this.afterApplyOn(f, f);
    }

    default public <R> Fn7<T1, T2, T3, T4, T5, T6, T7, R> afterApplyTo(Fn0<? extends R> f) {
        return this.afterApplyOnTo(f, f);
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> afterGet(Sp<Boolean> s) {
        return this.afterGetOn(s, s);
    }

    default public Cs7<T1, T2, T3, T4, T5, T6, T7> afterAcceptTo(Cs1<Boolean> c) {
        return this.afterAcceptOnTo(c, c);
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> afterAccept(Cs1<Boolean> c) {
        return this.afterAcceptOn(c, c);
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> beforeWrap(Pr1<? super Spc<Boolean>> wrap) {
        return Pr7.fromFunction(this.beforeWrapTo(wrap.toFunction()));
    }

    default public <W> Fn7<T1, T2, T3, T4, T5, T6, T7, W> beforeWrapTo(Fn1<? super Spc<Boolean>, ? extends W> wrap) {
        return (t1, t2, t3, t4, t5, t6, t7) -> wrap.apply(this.toSupplier(t1, t2, t3, t4, t5, t6, t7).checked());
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> afterRunOnSuccess(Rn r) {
        return this.afterRunOn(r, Rn.empty());
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> afterTestOnSuccess(Pr1<Boolean> p) {
        return this.afterTestOn(p, Pr1.empty());
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> afterTestOnSuccess(Pr0 p) {
        return this.afterTestOn(p, Pr0.empty());
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> afterApplyOnSuccess(Fn1<Boolean, Boolean> f) {
        return this.afterApplyOn(f, Fn1.empty());
    }

    default public <R> Fn7<T1, T2, T3, T4, T5, T6, T7, R> afterApplyOnSuccessTo(Fn1<Boolean, ? extends R> f) {
        return this.afterApplyOnTo(f, Fn1.empty());
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> afterApplyOnSuccess(Fn0<Boolean> f) {
        return this.afterApplyOn(f, Fn0.empty());
    }

    default public <R> Fn7<T1, T2, T3, T4, T5, T6, T7, R> afterApplyOnSuccessTo(Fn0<? extends R> f) {
        return this.afterApplyOnTo(f, Fn0.empty());
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> afterGetOnSuccess(Sp<Boolean> s) {
        return this.afterGetOn(s, Sp.empty());
    }

    default public Cs7<T1, T2, T3, T4, T5, T6, T7> afterAcceptOnSuccessTo(Cs1<Boolean> c) {
        return this.afterAcceptOnTo(c, Cs1.empty());
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> afterAcceptOnSuccess(Cs1<Boolean> c) {
        return this.afterAcceptOn(c, Cs1.empty());
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> afterRunOnFailure(Rn r) {
        return this.negated().afterRunOnSuccess(r);
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> afterTestOnFailure(Pr1<Boolean> p) {
        return this.negated().afterTestOnSuccess(p);
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> afterTestOnFailure(Pr0 p) {
        return this.negated().afterTestOnSuccess(p);
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> afterApplyOnFailure(Fn1<Boolean, Boolean> f) {
        return this.negated().afterApplyOnSuccess(f);
    }

    default public <R> Fn7<T1, T2, T3, T4, T5, T6, T7, R> afterApplyOnFailureTo(Fn1<Boolean, ? extends R> f) {
        return this.negated().afterApplyOnSuccessTo(f);
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> afterApplyOnFailure(Fn0<Boolean> f) {
        return this.negated().afterApplyOnSuccess(f);
    }

    default public <R> Fn7<T1, T2, T3, T4, T5, T6, T7, R> afterApplyOnFailureTo(Fn0<? extends R> f) {
        return this.negated().afterApplyOnSuccessTo(f);
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> afterGetOnFailure(Sp<Boolean> s) {
        return this.negated().afterGetOnSuccess(s);
    }

    default public Cs7<T1, T2, T3, T4, T5, T6, T7> afterAcceptOnFailureTo(Cs1<Boolean> c) {
        return this.negated().afterAcceptOnSuccessTo(c);
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> afterAcceptOnFailure(Cs1<Boolean> c) {
        return this.negated().afterAcceptOnSuccess(c);
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> beforeRun(Rn r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> {
            r.run();
            return this.test(t1, t2, t3, t4, t5, t6, t7);
        };
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Pr7<B1, B2, B3, B4, B5, B6, B7> beforeApply(Fn7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> f) {
        return this.beforeApply7(f);
    }

    default public <B1> Pr1<B1> beforeApply1(Fn1<? super B1, ? extends Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> f) {
        Objects.requireNonNull(f, "f is null");
        return b1 -> this.tupled().test(Tuple.narrow((f.apply(b1))));
    }

    default public <B1, B2> Pr2<B1, B2> beforeApply2(Fn2<? super B1, ? super B2, ? extends Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2))));
    }

    default public <B1, B2, B3> Pr3<B1, B2, B3> beforeApply3(Fn3<? super B1, ? super B2, ? super B3, ? extends Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3))));
    }

    default public <B1, B2, B3, B4> Pr4<B1, B2, B3, B4> beforeApply4(Fn4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4))));
    }

    default public <B1, B2, B3, B4, B5> Pr5<B1, B2, B3, B4, B5> beforeApply5(Fn5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5))));
    }

    default public <B1, B2, B3, B4, B5, B6> Pr6<B1, B2, B3, B4, B5, B6> beforeApply6(Fn6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Pr7<B1, B2, B3, B4, B5, B6, B7> beforeApply7(Fn7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Pr8<B1, B2, B3, B4, B5, B6, B7, B8> beforeApply8(Fn8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7, b8) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7, b8))));
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> beforeTestOnSuccess(Pr0 p, Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> p.test() ? this.test(t1, t2, t3, t4, t5, t6, t7) : onFailure.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> beforeTestOnSuccess(Pr0 p, Sp<? extends Boolean> onFailure) {
        return this.beforeTestOnSuccess(p, Pr7.fromSupplier(onFailure));
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> beforeTestOnSuccess(Pr0 p, Boolean onFailure) {
        return this.beforeTestOnSuccess(p, Pr7.value(onFailure));
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> beforeTestOnSuccess(Pr0 p) {
        return this.beforeTestOnSuccess(p, Pr7.empty());
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> beforeTestOnFailure(Pr0 p, Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> beforeTestOnFailure(Pr0 p, Sp<? extends Boolean> onSuccess) {
        return this.beforeTestOnFailure(p, Pr7.fromSupplier(onSuccess));
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> beforeTestOnFailure(Pr0 p, Boolean onSuccess) {
        return this.beforeTestOnFailure(p, Pr7.value(onSuccess));
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> beforeTestOnFailure(Pr0 p) {
        return this.beforeTestOnFailure(p, Pr7.empty());
    }

    default public Pr0 beforeGet(Sp<? extends Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> s) {
        Objects.requireNonNull(s, "s is null");
        return () -> this.tupled().test(Tuple.narrow((s.get())));
    }

    default public Pr7<T7, T6, T5, T4, T3, T2, T1> inverted() {
        return (t7, t6, t5, t4, t3, t2, t1) -> this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public <S> Pr7<T1, T2, T3, T4, T5, T6, T7> afterPassingThroughApplyOn(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends S> onSuccess, Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends S> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> {
            boolean result = this.test(t1, t2, t3, t4, t5, t6, t7);
            Fn7.narrow(result ? onSuccess : onFailure).apply(t1, t2, t3, t4, t5, t6, t7);
            return result;
        };
    }

    default public <S> Fn7<T1, T2, T3, T4, T5, T6, T7, S> afterPassingThroughApplyOnTo(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends S> onSuccess, Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends S> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> Fn7.narrow(this.test(t1, t2, t3, t4, t5, t6, t7) ? onSuccess : onFailure).apply(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> afterPassingThroughAcceptOn(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> onSuccess, Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> {
            boolean result = this.test(t1, t2, t3, t4, t5, t6, t7);
            Cs7.narrow(result ? onSuccess : onFailure).accept(t1, t2, t3, t4, t5, t6, t7);
            return result;
        };
    }

    default public Cs7<T1, T2, T3, T4, T5, T6, T7> afterPassingThroughAcceptOnTo(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> onSuccess, Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> Cs7.narrow(this.test(t1, t2, t3, t4, t5, t6, t7) ? onSuccess : onFailure).accept(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> afterPassingThroughTestOn(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> onSuccess, Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> Pr7.narrow(this.test(t1, t2, t3, t4, t5, t6, t7) ? onSuccess : onFailure).test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public <S> Pr7<T1, T2, T3, T4, T5, T6, T7> afterPassingThroughApply(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends S> f) {
        return this.afterPassingThroughApplyOn(f, f);
    }

    default public <S> Fn7<T1, T2, T3, T4, T5, T6, T7, S> afterPassingThroughApplyTo(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends S> f) {
        return this.afterPassingThroughApplyOnTo(f, f);
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> afterPassingThroughAccept(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c) {
        return this.afterPassingThroughAcceptOn(c, c);
    }

    default public Cs7<T1, T2, T3, T4, T5, T6, T7> afterPassingThroughAcceptTo(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c) {
        return this.afterPassingThroughAcceptOnTo(c, c);
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> afterPassingThroughTest(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        return this.afterPassingThroughTestOn(p, p);
    }

    default public <S> Pr7<T1, T2, T3, T4, T5, T6, T7> afterSuccessPassingThroughApply(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends S> onSuccess) {
        return this.afterPassingThroughApplyOn(onSuccess, Fn7.empty());
    }

    default public <S> Fn7<T1, T2, T3, T4, T5, T6, T7, S> afterSuccessPassingThroughApplyTo(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends S> onSuccess) {
        return this.afterPassingThroughApplyOnTo(onSuccess, Fn7.empty());
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> afterSuccessPassingThroughAccept(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> onSuccess) {
        return this.afterPassingThroughAcceptOn(onSuccess, Cs7.empty());
    }

    default public Cs7<T1, T2, T3, T4, T5, T6, T7> afterSuccessPassingThroughAcceptTo(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> onSuccess) {
        return this.afterPassingThroughAcceptOnTo(onSuccess, Cs7.empty());
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> afterSuccessPassingThroughTest(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> onSuccess) {
        return this.afterPassingThroughTestOn(onSuccess, Pr7.empty());
    }

    default public <S> Pr7<T1, T2, T3, T4, T5, T6, T7> afterFailurePassingThroughApply(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends S> onFailure) {
        return this.negated().afterSuccessPassingThroughApply(onFailure);
    }

    default public <S> Fn7<T1, T2, T3, T4, T5, T6, T7, S> afterFailurePassingThroughApplyTo(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends S> onFailure) {
        return this.negated().afterSuccessPassingThroughApplyTo(onFailure);
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> afterFailurePassingThroughAccept(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> onFailure) {
        return this.negated().afterSuccessPassingThroughAccept(onFailure);
    }

    default public Cs7<T1, T2, T3, T4, T5, T6, T7> afterFailurePassingThroughAcceptTo(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> onFailure) {
        return this.negated().afterSuccessPassingThroughAcceptTo(onFailure);
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> afterFailurePassingThroughTest(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> onFailure) {
        return this.negated().afterSuccessPassingThroughTest(onFailure);
    }

    default public <R> Pr7<T1, T2, T3, T4, T5, T6, T7> beforePassingThroughApply(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> {
            f.apply(t1, t2, t3, t4, t5, t6, t7);
            return this.test(t1, t2, t3, t4, t5, t6, t7);
        };
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> beforePassingThroughTest(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> {
            p.test(t1, t2, t3, t4, t5, t6, t7);
            return this.test(t1, t2, t3, t4, t5, t6, t7);
        };
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> beforePassingThroughAccept(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> {
            c.accept(t1, t2, t3, t4, t5, t6, t7);
            return this.test(t1, t2, t3, t4, t5, t6, t7);
        };
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> beforeSuccessPassingThroughTest(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> p.test(t1, t2, t3, t4, t5, t6, t7) ? this.test(t1, t2, t3, t4, t5, t6, t7) : onFailure.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> beforeSuccessPassingThroughTest(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, Sp<? extends Boolean> onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Pr7.fromSupplier(onFailure));
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> beforeSuccessPassingThroughTest(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, Boolean onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Pr7.value(onFailure));
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> beforeSuccessPassingThroughTest(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        return this.beforeSuccessPassingThroughTest(p, Pr7.empty());
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> beforeFailurePassingThroughTest(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> beforeFailurePassingThroughTest(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, Sp<? extends Boolean> onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Pr7.fromSupplier(onSuccess));
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> beforeFailurePassingThroughTest(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, Boolean onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Pr7.value(onSuccess));
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> beforeFailurePassingThroughTest(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        return this.beforeFailurePassingThroughTest(p, Pr7.empty());
    }

    default public Pr1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> tupled() {
        return tuple -> this.test(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5(), tuple._6(), tuple._7());
    }

    default public Fn1<T1, Fn1<T2, Fn1<T3, Fn1<T4, Fn1<T5, Fn1<T6, Pr1<T7>>>>>>> currying() {
        return t1 -> t2 -> t3 -> t4 -> t5 -> t6 -> t7 -> this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> checked() {
        return this::test;
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> negated() {
        return (t1, t2, t3, t4, t5, t6, t7) -> !this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> and(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        return (t1, t2, t3, t4, t5, t6, t7) -> this.test(t1, t2, t3, t4, t5, t6, t7) && p.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> or(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        return (t1, t2, t3, t4, t5, t6, t7) -> this.test(t1, t2, t3, t4, t5, t6, t7) || p.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> and(Pr0 p) {
        return (t1, t2, t3, t4, t5, t6, t7) -> this.test(t1, t2, t3, t4, t5, t6, t7) && p.test();
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> or(Pr0 p) {
        return (t1, t2, t3, t4, t5, t6, t7) -> this.test(t1, t2, t3, t4, t5, t6, t7) || p.test();
    }

    default public <I1> Pr8<I1, T1, T2, T3, T4, T5, T6, T7> ignoring1Lt() {
        return (i1, t1, t2, t3, t4, t5, t6, t7) -> this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public <I1> Pr8<T1, T2, T3, T4, T5, T6, T7, I1> ignoring1Rt() {
        return (t1, t2, t3, t4, t5, t6, t7, i1) -> this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> memoized() {
        return Function7.super.memoized()::apply;
    }

}

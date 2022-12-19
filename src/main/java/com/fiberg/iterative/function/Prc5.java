package com.fiberg.iterative.function;

import com.fiberg.iterative.core.IterativeInternals;
import io.vavr.CheckedFunction5;
import io.vavr.Tuple;
import io.vavr.Tuple5;

import java.util.Objects;

@FunctionalInterface
public interface Prc5<T1, T2, T3, T4, T5> extends CheckedFunction5<T1, T2, T3, T4, T5, Boolean> {

    default public Boolean apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) throws Throwable {
        return this.test(t1, t2, t3, t4, t5);
    }

    public static <T1, T2, T3, T4, T5> Prc5<T1, T2, T3, T4, T5> narrow(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        @SuppressWarnings("unchecked")
        final Prc5<T1, T2, T3, T4, T5> prc = (Prc5<T1, T2, T3, T4, T5>) p;
        return prc;
    }

    public static <T1, T2, T3, T4, T5> Prc5<T1, T2, T3, T4, T5> empty() {
        return IterativeInternals::none;
    }

    public static <T1, T2, T3, T4, T5> Prc5<T1, T2, T3, T4, T5> value(Boolean b) {
        return (t1, t2, t3, t4, t5) -> b;
    }

    public static <T1, T2, T3, T4, T5> Prc5<T1, T2, T3, T4, T5> of(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return Prc5.narrow(p);
    }

    public static <T1, T2, T3, T4, T5> Prc5<T1, T2, T3, T4, T5> of1(Prc1<? super T1> f) {
        return Prc5.<T1, T2, T3, T4, T5>narrow(f.ignoring4Rt());
    }

    public static <T1, T2, T3, T4, T5> Prc5<T1, T2, T3, T4, T5> of2(Prc1<? super T2> f) {
        return Prc5.<T1, T2, T3, T4, T5>narrow(f.ignoring3Rt().ignoring1Lt());
    }

    public static <T1, T2, T3, T4, T5> Prc5<T1, T2, T3, T4, T5> of3(Prc1<? super T3> f) {
        return Prc5.<T1, T2, T3, T4, T5>narrow(f.ignoring2Rt().ignoring2Lt());
    }

    public static <T1, T2, T3, T4, T5> Prc5<T1, T2, T3, T4, T5> of4(Prc1<? super T4> f) {
        return Prc5.<T1, T2, T3, T4, T5>narrow(f.ignoring1Rt().ignoring3Lt());
    }

    public static <T1, T2, T3, T4, T5> Prc5<T1, T2, T3, T4, T5> of5(Prc1<? super T5> f) {
        return Prc5.<T1, T2, T3, T4, T5>narrow(f.ignoring4Lt());
    }

    public static <T1, T2, T3, T4, T5> Prc5<T1, T2, T3, T4, T5> fromFunction(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, Boolean> f) {
        return f::apply;
    }

    public static <T1, T2, T3, T4, T5> Prc5<T1, T2, T3, T4, T5> fromSupplier(Spc<? extends Boolean> s) {
        return Prc5.fromFunction(Spc.<Boolean>narrow(s).toFunction().ignoring5());
    }

    public static <T1, T2, T3, T4, T5> Prc5<T1, T2, T3, T4, T5> negate(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return Prc5.<T1, T2, T3, T4, T5>narrow(p.negated());
    }

    @SafeVarargs
    public static <T1, T2, T3, T4, T5> Prc5<T1, T2, T3, T4, T5> and(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> ... ps) {
        Objects.requireNonNull(ps, "ps is null");
        return Predicates.and(ps);
    }

    public static <T1, T2, T3, T4, T5> Prc5<T1, T2, T3, T4, T5> and(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, Prc0 ... ps) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(ps, "ps is null");
        return ps.length == 0 ? Prc5.narrow(p) : Prc5.<T1, T2, T3, T4, T5>narrow(p).and(Predicates.and(ps));
    }

    @SafeVarargs
    public static <T1, T2, T3, T4, T5> Prc5<T1, T2, T3, T4, T5> or(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> ... ps) {
        Objects.requireNonNull(ps, "ps is null");
        return Predicates.or(ps);
    }

    public static <T1, T2, T3, T4, T5> Prc5<T1, T2, T3, T4, T5> or(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, Prc0 ... ps) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(ps, "ps is null");
        return ps.length == 0 ? Prc5.narrow(p) : Prc5.<T1, T2, T3, T4, T5>narrow(p).or(Predicates.or(ps));
    }

    public static <T1, T2, T3, T4, T5> Prc1<Tuple5<T1, T2, T3, T4, T5>> tuple(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return Prc5.<T1, T2, T3, T4, T5>of(p).tupled();
    }

    public static <T1, T2, T3, T4, T5> Prc5<T1, T2, T3, T4, T5> detuple(Prc1<? super Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> p) {
        return (t1, t2, t3, t4, t5) -> p.test(Tuple.of(t1, t2, t3, t4, t5));
    }

    public static <T1, T2, T3, T4, T5> Prc5<T1, T2, T3, T4, T5> check(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        Objects.requireNonNull(p, "p is null");
        return Pr5.<T1, T2, T3, T4, T5>narrow(p).checked();
    }

    public static <T1, T2, T3, T4, T5> Prc5<T1, T2, T3, T4, T5> ignore(Prc0 p) {
        return p.ignoring5();
    }

    public static <T1, T2, T3, T4, T5> Prc5<T1, T2, T3, T4, T5> ignore4Rt(Prc1<? super T1> p) {
        return Prc1.<T1>narrow(p).ignoring4Rt();
    }

    public static <T1, T2, T3, T4, T5> Prc5<T1, T2, T3, T4, T5> ignore4Lt(Prc1<? super T5> p) {
        return Prc1.<T5>narrow(p).ignoring4Lt();
    }

    public static <T1, T2, T3, T4, T5> Prc5<T1, T2, T3, T4, T5> ignore3Rt(Prc2<? super T1, ? super T2> p) {
        return Prc2.<T1, T2>narrow(p).ignoring3Rt();
    }

    public static <T1, T2, T3, T4, T5> Prc5<T1, T2, T3, T4, T5> ignore3Lt(Prc2<? super T4, ? super T5> p) {
        return Prc2.<T4, T5>narrow(p).ignoring3Lt();
    }

    public static <T1, T2, T3, T4, T5> Prc5<T1, T2, T3, T4, T5> ignore2Rt(Prc3<? super T1, ? super T2, ? super T3> p) {
        return Prc3.<T1, T2, T3>narrow(p).ignoring2Rt();
    }

    public static <T1, T2, T3, T4, T5> Prc5<T1, T2, T3, T4, T5> ignore2Lt(Prc3<? super T3, ? super T4, ? super T5> p) {
        return Prc3.<T3, T4, T5>narrow(p).ignoring2Lt();
    }

    public static <T1, T2, T3, T4, T5> Prc5<T1, T2, T3, T4, T5> ignore1Rt(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        return Prc4.<T1, T2, T3, T4>narrow(p).ignoring1Rt();
    }

    public static <T1, T2, T3, T4, T5> Prc5<T1, T2, T3, T4, T5> ignore1Lt(Prc4<? super T2, ? super T3, ? super T4, ? super T5> p) {
        return Prc4.<T2, T3, T4, T5>narrow(p).ignoring1Lt();
    }

    public static <T1, T2, T3, T4, T5, T6> Prc5<T1, T2, T3, T4, T5> passRt(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, T6 t6) {
        return Prc5.narrow(p.testRt(t6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc5<T1, T2, T3, T4, T5> passRt(Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, T6 t6, T7 t7) {
        return Prc5.narrow(p.testRt(t6, t7));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc5<T1, T2, T3, T4, T5> passRt(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, T6 t6, T7 t7, T8 t8) {
        return Prc5.narrow(p.testRt(t6, t7, t8));
    }

    public static <T1, T2, T3, T4, T5, T6> Prc5<T2, T3, T4, T5, T6> passLt(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, T1 t1) {
        return Prc5.narrow(p.testLt(t1));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc5<T3, T4, T5, T6, T7> passLt(Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, T1 t1, T2 t2) {
        return Prc5.narrow(p.testLt(t1, t2));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc5<T4, T5, T6, T7, T8> passLt(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, T1 t1, T2 t2, T3 t3) {
        return Prc5.narrow(p.testLt(t1, t2, t3));
    }

    public static <T1, T2, T3, T4, T5> Prc5<T5, T4, T3, T2, T1> invert(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return Prc5.<T1, T2, T3, T4, T5>narrow(p).inverted();
    }

    public boolean test(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) throws Throwable;

    default public Prc4<T2, T3, T4, T5> testLt(T1 t1) {
        return (t2, t3, t4, t5) -> this.test(t1, t2, t3, t4, t5);
    }

    default public Prc3<T3, T4, T5> testLt(T1 t1, T2 t2) {
        return (t3, t4, t5) -> this.test(t1, t2, t3, t4, t5);
    }

    default public Prc2<T4, T5> testLt(T1 t1, T2 t2, T3 t3) {
        return (t4, t5) -> this.test(t1, t2, t3, t4, t5);
    }

    default public Prc1<T5> testLt(T1 t1, T2 t2, T3 t3, T4 t4) {
        return t5 -> this.test(t1, t2, t3, t4, t5);
    }

    default public Prc4<T1, T2, T3, T4> testRt(T5 t5) {
        return (t1, t2, t3, t4) -> this.test(t1, t2, t3, t4, t5);
    }

    default public Prc3<T1, T2, T3> testRt(T4 t4, T5 t5) {
        return (t1, t2, t3) -> this.test(t1, t2, t3, t4, t5);
    }

    default public Prc2<T1, T2> testRt(T3 t3, T4 t4, T5 t5) {
        return (t1, t2) -> this.test(t1, t2, t3, t4, t5);
    }

    default public Prc1<T1> testRt(T2 t2, T3 t3, T4 t4, T5 t5) {
        return t1 -> this.test(t1, t2, t3, t4, t5);
    }

    default public Fnc5<T1, T2, T3, T4, T5, Boolean> toFunction() {
        return this::test;
    }

    default public Csc5<T1, T2, T3, T4, T5> toConsumer() {
        return this::test;
    }

    default public Prc0 toPredicate(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return () -> this.test(t1, t2, t3, t4, t5);
    }

    default public Spc<Boolean> toSupplier(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return this.toPredicate(t1, t2, t3, t4, t5).toSupplier();
    }

    default public Rnc toRunnable(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return this.toPredicate(t1, t2, t3, t4, t5).toRunnable();
    }

    default public Prc5<T1, T2, T3, T4, T5> afterRunOn(Rnc onSuccess, Rnc onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5) -> {
            boolean result = this.test(t1, t2, t3, t4, t5);
            (result ? onSuccess : onFailure).run();
            return result;
        };
    }

    default public Prc5<T1, T2, T3, T4, T5> afterTestOn(Prc1<Boolean> onSuccess, Prc1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.toFunction(), onFailure.toFunction());
    }

    default public Prc5<T1, T2, T3, T4, T5> afterTestOn(Prc0 onSuccess, Prc0 onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterTestOn(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Prc5<T1, T2, T3, T4, T5> afterApplyOn(Fnc1<Boolean, Boolean> onSuccess, Fnc1<Boolean, Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return Prc5.fromFunction(this.afterApplyOnTo(onSuccess, onFailure));
    }

    default public <R> Fnc5<T1, T2, T3, T4, T5, R> afterApplyOnTo(Fnc1<Boolean, ? extends R> onSuccess, Fnc1<Boolean, ? extends R> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5) -> {
            boolean result = this.test(t1, t2, t3, t4, t5);
            return (result ? onSuccess : onFailure).apply(result);
        };
    }

    default public Prc5<T1, T2, T3, T4, T5> afterApplyOn(Fnc0<Boolean> onSuccess, Fnc0<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onFailure.ignoring1(), onFailure.ignoring1());
    }

    default public <R> Fnc5<T1, T2, T3, T4, T5, R> afterApplyOnTo(Fnc0<? extends R> onSuccess, Fnc0<? extends R> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOnTo(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Prc5<T1, T2, T3, T4, T5> afterGetOn(Spc<Boolean> onSuccess, Spc<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Csc5<T1, T2, T3, T4, T5> afterAcceptOnTo(Csc1<Boolean> onSuccess, Csc1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOnTo(onSuccess.toFunction(null), onFailure.toFunction(null)).toConsumer();
    }

    default public Prc5<T1, T2, T3, T4, T5> afterAcceptOn(Csc1<Boolean> onSuccess, Csc1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.toFunction(null), onFailure.toFunction(null));
    }

    default public Prc5<T1, T2, T3, T4, T5> afterRun(Rnc r) {
        return this.afterRunOn(r, r);
    }

    default public Prc5<T1, T2, T3, T4, T5> afterTest(Prc1<Boolean> p) {
        return this.afterTestOn(p, p);
    }

    default public Prc5<T1, T2, T3, T4, T5> afterTest(Prc0 p) {
        return this.afterTestOn(p, p);
    }

    default public Prc5<T1, T2, T3, T4, T5> afterApply(Fnc1<Boolean, Boolean> f) {
        return this.afterApplyOn(f, f);
    }

    default public <R> Fnc5<T1, T2, T3, T4, T5, R> afterApplyTo(Fnc1<Boolean, ? extends R> f) {
        return this.afterApplyOnTo(f, f);
    }

    default public Prc5<T1, T2, T3, T4, T5> afterApply(Fnc0<Boolean> f) {
        return this.afterApplyOn(f, f);
    }

    default public <R> Fnc5<T1, T2, T3, T4, T5, R> afterApplyTo(Fnc0<? extends R> f) {
        return this.afterApplyOnTo(f, f);
    }

    default public Prc5<T1, T2, T3, T4, T5> afterGet(Spc<Boolean> s) {
        return this.afterGetOn(s, s);
    }

    default public Csc5<T1, T2, T3, T4, T5> afterAcceptTo(Csc1<Boolean> c) {
        return this.afterAcceptOnTo(c, c);
    }

    default public Prc5<T1, T2, T3, T4, T5> afterAccept(Csc1<Boolean> c) {
        return this.afterAcceptOn(c, c);
    }

    default public Pr5<T1, T2, T3, T4, T5> beforeWrap(Pr1<? super Spc<Boolean>> wrap) {
        return Pr5.fromFunction(this.beforeWrapTo(wrap.toFunction()));
    }

    default public <W> Fn5<T1, T2, T3, T4, T5, W> beforeWrapTo(Fn1<? super Spc<Boolean>, ? extends W> wrap) {
        return (t1, t2, t3, t4, t5) -> wrap.apply(this.toSupplier(t1, t2, t3, t4, t5));
    }

    default public Prc5<T1, T2, T3, T4, T5> afterRunOnSuccess(Rnc r) {
        return this.afterRunOn(r, Rnc.empty());
    }

    default public Prc5<T1, T2, T3, T4, T5> afterTestOnSuccess(Prc1<Boolean> p) {
        return this.afterTestOn(p, Prc1.empty());
    }

    default public Prc5<T1, T2, T3, T4, T5> afterTestOnSuccess(Prc0 p) {
        return this.afterTestOn(p, Prc0.empty());
    }

    default public Prc5<T1, T2, T3, T4, T5> afterApplyOnSuccess(Fnc1<Boolean, Boolean> f) {
        return this.afterApplyOn(f, Fnc1.empty());
    }

    default public <R> Fnc5<T1, T2, T3, T4, T5, R> afterApplyOnSuccessTo(Fnc1<Boolean, ? extends R> f) {
        return this.afterApplyOnTo(f, Fnc1.empty());
    }

    default public Prc5<T1, T2, T3, T4, T5> afterApplyOnSuccess(Fnc0<Boolean> f) {
        return this.afterApplyOn(f, Fnc0.empty());
    }

    default public <R> Fnc5<T1, T2, T3, T4, T5, R> afterApplyOnSuccessTo(Fnc0<? extends R> f) {
        return this.afterApplyOnTo(f, Fnc0.empty());
    }

    default public Prc5<T1, T2, T3, T4, T5> afterGetOnSuccess(Spc<Boolean> s) {
        return this.afterGetOn(s, Spc.empty());
    }

    default public Csc5<T1, T2, T3, T4, T5> afterAcceptOnSuccessTo(Csc1<Boolean> c) {
        return this.afterAcceptOnTo(c, Csc1.empty());
    }

    default public Prc5<T1, T2, T3, T4, T5> afterAcceptOnSuccess(Csc1<Boolean> c) {
        return this.afterAcceptOn(c, Csc1.empty());
    }

    default public Prc5<T1, T2, T3, T4, T5> afterRunOnFailure(Rnc r) {
        return this.negated().afterRunOnSuccess(r);
    }

    default public Prc5<T1, T2, T3, T4, T5> afterTestOnFailure(Prc1<Boolean> p) {
        return this.negated().afterTestOnSuccess(p);
    }

    default public Prc5<T1, T2, T3, T4, T5> afterTestOnFailure(Prc0 p) {
        return this.negated().afterTestOnSuccess(p);
    }

    default public Prc5<T1, T2, T3, T4, T5> afterApplyOnFailure(Fnc1<Boolean, Boolean> f) {
        return this.negated().afterApplyOnSuccess(f);
    }

    default public <R> Fnc5<T1, T2, T3, T4, T5, R> afterApplyOnFailureTo(Fnc1<Boolean, ? extends R> f) {
        return this.negated().afterApplyOnSuccessTo(f);
    }

    default public Prc5<T1, T2, T3, T4, T5> afterApplyOnFailure(Fnc0<Boolean> f) {
        return this.negated().afterApplyOnSuccess(f);
    }

    default public <R> Fnc5<T1, T2, T3, T4, T5, R> afterApplyOnFailureTo(Fnc0<? extends R> f) {
        return this.negated().afterApplyOnSuccessTo(f);
    }

    default public Prc5<T1, T2, T3, T4, T5> afterGetOnFailure(Spc<Boolean> s) {
        return this.negated().afterGetOnSuccess(s);
    }

    default public Csc5<T1, T2, T3, T4, T5> afterAcceptOnFailureTo(Csc1<Boolean> c) {
        return this.negated().afterAcceptOnSuccessTo(c);
    }

    default public Prc5<T1, T2, T3, T4, T5> afterAcceptOnFailure(Csc1<Boolean> c) {
        return this.negated().afterAcceptOnSuccess(c);
    }

    default public Prc5<T1, T2, T3, T4, T5> beforeRun(Rnc r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2, t3, t4, t5) -> {
            r.run();
            return this.test(t1, t2, t3, t4, t5);
        };
    }

    default public <B1, B2, B3, B4, B5> Prc5<B1, B2, B3, B4, B5> beforeApply(Fnc5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        return this.beforeApply5(f);
    }

    default public <B1> Prc1<B1> beforeApply1(Fnc1<? super B1, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return b1 -> this.tupled().test(Tuple.narrow((f.apply(b1))));
    }

    default public <B1, B2> Prc2<B1, B2> beforeApply2(Fnc2<? super B1, ? super B2, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2))));
    }

    default public <B1, B2, B3> Prc3<B1, B2, B3> beforeApply3(Fnc3<? super B1, ? super B2, ? super B3, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3))));
    }

    default public <B1, B2, B3, B4> Prc4<B1, B2, B3, B4> beforeApply4(Fnc4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4))));
    }

    default public <B1, B2, B3, B4, B5> Prc5<B1, B2, B3, B4, B5> beforeApply5(Fnc5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5))));
    }

    default public <B1, B2, B3, B4, B5, B6> Prc6<B1, B2, B3, B4, B5, B6> beforeApply6(Fnc6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Prc7<B1, B2, B3, B4, B5, B6, B7> beforeApply7(Fnc7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Prc8<B1, B2, B3, B4, B5, B6, B7, B8> beforeApply8(Fnc8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7, b8) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7, b8))));
    }

    default public Prc5<T1, T2, T3, T4, T5> beforeTestOnSuccess(Prc0 p, Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5) -> p.test() ? this.test(t1, t2, t3, t4, t5) : onFailure.test(t1, t2, t3, t4, t5);
    }

    default public Prc5<T1, T2, T3, T4, T5> beforeTestOnSuccess(Prc0 p, Spc<? extends Boolean> onFailure) {
        return this.beforeTestOnSuccess(p, Prc5.fromSupplier(onFailure));
    }

    default public Prc5<T1, T2, T3, T4, T5> beforeTestOnSuccess(Prc0 p, Boolean onFailure) {
        return this.beforeTestOnSuccess(p, Prc5.value(onFailure));
    }

    default public Prc5<T1, T2, T3, T4, T5> beforeTestOnSuccess(Prc0 p) {
        return this.beforeTestOnSuccess(p, Prc5.empty());
    }

    default public Prc5<T1, T2, T3, T4, T5> beforeTestOnFailure(Prc0 p, Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Prc5<T1, T2, T3, T4, T5> beforeTestOnFailure(Prc0 p, Spc<? extends Boolean> onSuccess) {
        return this.beforeTestOnFailure(p, Prc5.fromSupplier(onSuccess));
    }

    default public Prc5<T1, T2, T3, T4, T5> beforeTestOnFailure(Prc0 p, Boolean onSuccess) {
        return this.beforeTestOnFailure(p, Prc5.value(onSuccess));
    }

    default public Prc5<T1, T2, T3, T4, T5> beforeTestOnFailure(Prc0 p) {
        return this.beforeTestOnFailure(p, Prc5.empty());
    }

    default public Prc0 beforeGet(Spc<? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> s) {
        Objects.requireNonNull(s, "s is null");
        return () -> this.tupled().test(Tuple.narrow((s.get())));
    }

    default public Prc5<T5, T4, T3, T2, T1> inverted() {
        return (t5, t4, t3, t2, t1) -> this.test(t1, t2, t3, t4, t5);
    }

    default public <S> Prc5<T1, T2, T3, T4, T5> afterPassingThroughApplyOn(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends S> onSuccess, Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends S> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5) -> {
            boolean result = this.test(t1, t2, t3, t4, t5);
            Fnc5.narrow(result ? onSuccess : onFailure).apply(t1, t2, t3, t4, t5);
            return result;
        };
    }

    default public <S> Fnc5<T1, T2, T3, T4, T5, S> afterPassingThroughApplyOnTo(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends S> onSuccess, Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends S> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5) -> Fnc5.narrow(this.test(t1, t2, t3, t4, t5) ? onSuccess : onFailure).apply(t1, t2, t3, t4, t5);
    }

    default public Prc5<T1, T2, T3, T4, T5> afterPassingThroughAcceptOn(Csc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onSuccess, Csc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5) -> {
            boolean result = this.test(t1, t2, t3, t4, t5);
            Csc5.narrow(result ? onSuccess : onFailure).accept(t1, t2, t3, t4, t5);
            return result;
        };
    }

    default public Csc5<T1, T2, T3, T4, T5> afterPassingThroughAcceptOnTo(Csc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onSuccess, Csc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5) -> Csc5.narrow(this.test(t1, t2, t3, t4, t5) ? onSuccess : onFailure).accept(t1, t2, t3, t4, t5);
    }

    default public Prc5<T1, T2, T3, T4, T5> afterPassingThroughTestOn(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onSuccess, Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5) -> Prc5.narrow(this.test(t1, t2, t3, t4, t5) ? onSuccess : onFailure).test(t1, t2, t3, t4, t5);
    }

    default public <S> Prc5<T1, T2, T3, T4, T5> afterPassingThroughApply(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends S> f) {
        return this.afterPassingThroughApplyOn(f, f);
    }

    default public <S> Fnc5<T1, T2, T3, T4, T5, S> afterPassingThroughApplyTo(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends S> f) {
        return this.afterPassingThroughApplyOnTo(f, f);
    }

    default public Prc5<T1, T2, T3, T4, T5> afterPassingThroughAccept(Csc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        return this.afterPassingThroughAcceptOn(c, c);
    }

    default public Csc5<T1, T2, T3, T4, T5> afterPassingThroughAcceptTo(Csc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        return this.afterPassingThroughAcceptOnTo(c, c);
    }

    default public Prc5<T1, T2, T3, T4, T5> afterPassingThroughTest(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return this.afterPassingThroughTestOn(p, p);
    }

    default public <S> Prc5<T1, T2, T3, T4, T5> afterSuccessPassingThroughApply(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends S> onSuccess) {
        return this.afterPassingThroughApplyOn(onSuccess, Fnc5.empty());
    }

    default public <S> Fnc5<T1, T2, T3, T4, T5, S> afterSuccessPassingThroughApplyTo(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends S> onSuccess) {
        return this.afterPassingThroughApplyOnTo(onSuccess, Fnc5.empty());
    }

    default public Prc5<T1, T2, T3, T4, T5> afterSuccessPassingThroughAccept(Csc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onSuccess) {
        return this.afterPassingThroughAcceptOn(onSuccess, Csc5.empty());
    }

    default public Csc5<T1, T2, T3, T4, T5> afterSuccessPassingThroughAcceptTo(Csc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onSuccess) {
        return this.afterPassingThroughAcceptOnTo(onSuccess, Csc5.empty());
    }

    default public Prc5<T1, T2, T3, T4, T5> afterSuccessPassingThroughTest(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onSuccess) {
        return this.afterPassingThroughTestOn(onSuccess, Prc5.empty());
    }

    default public <S> Prc5<T1, T2, T3, T4, T5> afterFailurePassingThroughApply(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends S> onFailure) {
        return this.negated().afterSuccessPassingThroughApply(onFailure);
    }

    default public <S> Fnc5<T1, T2, T3, T4, T5, S> afterFailurePassingThroughApplyTo(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends S> onFailure) {
        return this.negated().afterSuccessPassingThroughApplyTo(onFailure);
    }

    default public Prc5<T1, T2, T3, T4, T5> afterFailurePassingThroughAccept(Csc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onFailure) {
        return this.negated().afterSuccessPassingThroughAccept(onFailure);
    }

    default public Csc5<T1, T2, T3, T4, T5> afterFailurePassingThroughAcceptTo(Csc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onFailure) {
        return this.negated().afterSuccessPassingThroughAcceptTo(onFailure);
    }

    default public Prc5<T1, T2, T3, T4, T5> afterFailurePassingThroughTest(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onFailure) {
        return this.negated().afterSuccessPassingThroughTest(onFailure);
    }

    default public <R> Prc5<T1, T2, T3, T4, T5> beforePassingThroughApply(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5) -> {
            f.apply(t1, t2, t3, t4, t5);
            return this.test(t1, t2, t3, t4, t5);
        };
    }

    default public Prc5<T1, T2, T3, T4, T5> beforePassingThroughTest(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5) -> {
            p.test(t1, t2, t3, t4, t5);
            return this.test(t1, t2, t3, t4, t5);
        };
    }

    default public Prc5<T1, T2, T3, T4, T5> beforePassingThroughAccept(Csc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5) -> {
            c.accept(t1, t2, t3, t4, t5);
            return this.test(t1, t2, t3, t4, t5);
        };
    }

    default public Prc5<T1, T2, T3, T4, T5> beforeSuccessPassingThroughTest(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5) -> p.test(t1, t2, t3, t4, t5) ? this.test(t1, t2, t3, t4, t5) : onFailure.test(t1, t2, t3, t4, t5);
    }

    default public Prc5<T1, T2, T3, T4, T5> beforeSuccessPassingThroughTest(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, Spc<? extends Boolean> onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Prc5.fromSupplier(onFailure));
    }

    default public Prc5<T1, T2, T3, T4, T5> beforeSuccessPassingThroughTest(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, Boolean onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Prc5.value(onFailure));
    }

    default public Prc5<T1, T2, T3, T4, T5> beforeSuccessPassingThroughTest(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return this.beforeSuccessPassingThroughTest(p, Prc5.empty());
    }

    default public Prc5<T1, T2, T3, T4, T5> beforeFailurePassingThroughTest(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Prc5<T1, T2, T3, T4, T5> beforeFailurePassingThroughTest(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, Spc<? extends Boolean> onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Prc5.fromSupplier(onSuccess));
    }

    default public Prc5<T1, T2, T3, T4, T5> beforeFailurePassingThroughTest(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, Boolean onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Prc5.value(onSuccess));
    }

    default public Prc5<T1, T2, T3, T4, T5> beforeFailurePassingThroughTest(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return this.beforeFailurePassingThroughTest(p, Prc5.empty());
    }

    default public Prc1<Tuple5<T1, T2, T3, T4, T5>> tupled() {
        return tuple -> this.test(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5());
    }

    default public Pr5<T1, T2, T3, T4, T5> unchecked() {
        return (t1, t2, t3, t4, t5) -> {
            try {
                return this.test(t1, t2, t3, t4, t5);
            }
            catch (Throwable t) {
                return (Boolean) SneakyThrow.sneakyThrow(t);
            }
        };
    }

    default public Fnc1<T1, Fnc1<T2, Fnc1<T3, Fnc1<T4, Prc1<T5>>>>> currying() {
        return t1 -> t2 -> t3 -> t4 -> t5 -> this.test(t1, t2, t3, t4, t5);
    }

    default public Prc5<T1, T2, T3, T4, T5> negated() {
        return (t1, t2, t3, t4, t5) -> !this.test(t1, t2, t3, t4, t5);
    }

    default public Prc5<T1, T2, T3, T4, T5> and(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return (t1, t2, t3, t4, t5) -> this.test(t1, t2, t3, t4, t5) && p.test(t1, t2, t3, t4, t5);
    }

    default public Prc5<T1, T2, T3, T4, T5> or(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return (t1, t2, t3, t4, t5) -> this.test(t1, t2, t3, t4, t5) || p.test(t1, t2, t3, t4, t5);
    }

    default public Prc5<T1, T2, T3, T4, T5> and(Prc0 p) {
        return (t1, t2, t3, t4, t5) -> this.test(t1, t2, t3, t4, t5) && p.test();
    }

    default public Prc5<T1, T2, T3, T4, T5> or(Prc0 p) {
        return (t1, t2, t3, t4, t5) -> this.test(t1, t2, t3, t4, t5) || p.test();
    }

    default public <I1> Prc6<I1, T1, T2, T3, T4, T5> ignoring1Lt() {
        return (i1, t1, t2, t3, t4, t5) -> this.test(t1, t2, t3, t4, t5);
    }

    default public <I1> Prc6<T1, T2, T3, T4, T5, I1> ignoring1Rt() {
        return (t1, t2, t3, t4, t5, i1) -> this.test(t1, t2, t3, t4, t5);
    }

    default public <I1, I2> Prc7<I1, I2, T1, T2, T3, T4, T5> ignoring2Lt() {
        return (i1, i2, t1, t2, t3, t4, t5) -> this.test(t1, t2, t3, t4, t5);
    }

    default public <I1, I2> Prc7<T1, T2, T3, T4, T5, I1, I2> ignoring2Rt() {
        return (t1, t2, t3, t4, t5, i1, i2) -> this.test(t1, t2, t3, t4, t5);
    }

    default public <I1, I2, I3> Prc8<I1, I2, I3, T1, T2, T3, T4, T5> ignoring3Lt() {
        return (i1, i2, i3, t1, t2, t3, t4, t5) -> this.test(t1, t2, t3, t4, t5);
    }

    default public <I1, I2, I3> Prc8<T1, T2, T3, T4, T5, I1, I2, I3> ignoring3Rt() {
        return (t1, t2, t3, t4, t5, i1, i2, i3) -> this.test(t1, t2, t3, t4, t5);
    }

    default public Prc5<T1, T2, T3, T4, T5> memoized() {
        return CheckedFunction5.super.memoized()::apply;
    }

    default public Pr5<T1, T2, T3, T4, T5> recover(Fn1<? super Throwable, ? extends Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5>> recover) {
        Objects.requireNonNull(recover, "recover is null");
        return (t1, t2, t3, t4, t5) -> {
            try {
                return this.test(t1, t2, t3, t4, t5);
            }
            catch (Throwable throwable) {
                Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> pred = recover.apply(throwable);
                Objects.requireNonNull(pred, () -> "recover return null for " + throwable.getClass() + ": " + throwable.getMessage());
                return pred.test(t1, t2, t3, t4, t5);
            }
        };
    }

}

package com.fiberg.iterative.function;

import com.fiberg.iterative.core.IterativeInternals;
import com.fiberg.iterative.function.Csc1;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fnc0;
import com.fiberg.iterative.function.Fnc1;
import com.fiberg.iterative.function.Fnc2;
import com.fiberg.iterative.function.Fnc3;
import com.fiberg.iterative.function.Fnc4;
import com.fiberg.iterative.function.Fnc5;
import com.fiberg.iterative.function.Fnc6;
import com.fiberg.iterative.function.Fnc7;
import com.fiberg.iterative.function.Fnc8;
import com.fiberg.iterative.function.Pr1;
import com.fiberg.iterative.function.Prc0;
import com.fiberg.iterative.function.Prc2;
import com.fiberg.iterative.function.Prc3;
import com.fiberg.iterative.function.Prc4;
import com.fiberg.iterative.function.Prc5;
import com.fiberg.iterative.function.Prc6;
import com.fiberg.iterative.function.Prc7;
import com.fiberg.iterative.function.Prc8;
import com.fiberg.iterative.function.Predicates;
import com.fiberg.iterative.function.Rnc;
import com.fiberg.iterative.function.SneakyThrow;
import com.fiberg.iterative.function.Spc;
import io.vavr.CheckedFunction1;
import io.vavr.CheckedPredicate;
import io.vavr.Tuple;
import io.vavr.Tuple1;
import java.io.Serializable;
import java.util.Objects;

@FunctionalInterface
public interface Prc1<T1> extends CheckedPredicate<T1>, CheckedFunction1<T1, Boolean> {

    default public Boolean apply(T1 t1) throws Throwable {
        return this.test(t1);
    }

    public static <T1> Prc1<T1> narrow(Prc1<? super T1> p) {
        @SuppressWarnings("unchecked")
        final Prc1<T1> prc = (Prc1<T1>) p;
        return prc;
    }

    public static <T1> Prc1<T1> empty() {
        return IterativeInternals::none;
    }

    public static <T1> Prc1<T1> value(Boolean b) {
        return t1 -> b;
    }

    public static <T1 extends Boolean> Prc1<T1> identity() {
        return IterativeInternals::identity;
    }

    public static <T1> Prc1<T1> of(Prc1<? super T1> p) {
        return Prc1.narrow(p);
    }

    public static <T1> Prc1<T1> fromFunction(Fnc1<? super T1, Boolean> f) {
        return f::apply;
    }

    public static <T1> Prc1<T1> fromSupplier(Spc<? extends Boolean> s) {
        return Prc1.fromFunction(Spc.narrow(s).toFunction().ignoring1());
    }

    public static <T1> Prc1<T1> negate(Prc1<? super T1> p) {
        return Prc1.<T1>narrow(p.negated());
    }

    @SafeVarargs
    public static <T1> Prc1<T1> and(Prc1<? super T1> ... ps) {
        Objects.requireNonNull(ps, "ps is null");
        return Predicates.and(ps);
    }

    public static <T1> Prc1<T1> and(Prc1<? super T1> p, Prc0 ... ps) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(ps, "ps is null");
        return ps.length == 0 ? Prc1.narrow(p) : Prc1.narrow(p).and(Predicates.and(ps));
    }

    @SafeVarargs
    public static <T1> Prc1<T1> or(Prc1<? super T1> ... ps) {
        Objects.requireNonNull(ps, "ps is null");
        return Predicates.or(ps);
    }

    public static <T1> Prc1<T1> or(Prc1<? super T1> p, Prc0 ... ps) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(ps, "ps is null");
        return ps.length == 0 ? Prc1.narrow(p) : Prc1.narrow(p).or(Predicates.or(ps));
    }

    public static <T1> Prc1<Tuple1<T1>> tuple(Prc1<? super T1> p) {
        return Prc1.<T1>of(p).tupled();
    }

    public static <T1> Prc1<T1> detuple(Prc1<? super Tuple1<? extends T1>> p) {
        return t1 -> p.test(Tuple.of(t1));
    }

    public static <T1> Prc1<T1> check(Pr1<? super T1> p) {
        Objects.requireNonNull(p, "p is null");
        return Pr1.narrow(p).checked();
    }

    public static <T1> Prc1<T1> ignore(Prc0 p) {
        return p.ignoring1();
    }

    public static <T1, T2> Prc1<T1> passRt(Prc2<? super T1, ? super T2> p, T2 t2) {
        return Prc1.narrow(p.testRt(t2));
    }

    public static <T1, T2, T3> Prc1<T1> passRt(Prc3<? super T1, ? super T2, ? super T3> p, T2 t2, T3 t3) {
        return Prc1.narrow(p.testRt(t2, t3));
    }

    public static <T1, T2, T3, T4> Prc1<T1> passRt(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p, T2 t2, T3 t3, T4 t4) {
        return Prc1.narrow(p.testRt(t2, t3, t4));
    }

    public static <T1, T2, T3, T4, T5> Prc1<T1> passRt(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, T2 t2, T3 t3, T4 t4, T5 t5) {
        return Prc1.narrow(p.testRt(t2, t3, t4, t5));
    }

    public static <T1, T2, T3, T4, T5, T6> Prc1<T1> passRt(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return Prc1.narrow(p.testRt(t2, t3, t4, t5, t6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc1<T1> passRt(Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return Prc1.narrow(p.testRt(t2, t3, t4, t5, t6, t7));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc1<T1> passRt(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Prc1.narrow(p.testRt(t2, t3, t4, t5, t6, t7, t8));
    }

    public static <T1, T2> Prc1<T2> passLt(Prc2<? super T1, ? super T2> p, T1 t1) {
        return Prc1.narrow(p.testLt(t1));
    }

    public static <T1, T2, T3> Prc1<T3> passLt(Prc3<? super T1, ? super T2, ? super T3> p, T1 t1, T2 t2) {
        return Prc1.narrow(p.testLt(t1, t2));
    }

    public static <T1, T2, T3, T4> Prc1<T4> passLt(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p, T1 t1, T2 t2, T3 t3) {
        return Prc1.narrow(p.testLt(t1, t2, t3));
    }

    public static <T1, T2, T3, T4, T5> Prc1<T5> passLt(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, T1 t1, T2 t2, T3 t3, T4 t4) {
        return Prc1.narrow(p.testLt(t1, t2, t3, t4));
    }

    public static <T1, T2, T3, T4, T5, T6> Prc1<T6> passLt(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return Prc1.narrow(p.testLt(t1, t2, t3, t4, t5));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc1<T7> passLt(Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return Prc1.narrow(p.testLt(t1, t2, t3, t4, t5, t6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc1<T8> passLt(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return Prc1.narrow(p.testLt(t1, t2, t3, t4, t5, t6, t7));
    }

    default public Fnc1<T1, Boolean> toFunction() {
        return this::test;
    }

    default public Csc1<T1> toConsumer() {
        return this::test;
    }

    default public Prc0 toPredicate(T1 t1) {
        return () -> this.test(t1);
    }

    default public Spc<Boolean> toSupplier(T1 t1) {
        return this.toPredicate(t1).toSupplier();
    }

    default public Rnc toRunnable(T1 t1) {
        return this.toPredicate(t1).toRunnable();
    }

    default public Prc1<T1> afterRunOn(Rnc onSuccess, Rnc onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return t1 -> {
            Boolean value = this.test(t1);
            (value != false ? onSuccess : onFailure).run();
            return value;
        };
    }

    default public Prc1<T1> afterTestOn(Prc1<Boolean> onSuccess, Prc1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.toFunction(), onFailure.toFunction());
    }

    default public Prc1<T1> afterTestOn(Prc0 onSuccess, Prc0 onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterTestOn(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Prc1<T1> afterApplyOn(Fnc1<Boolean, Boolean> onSuccess, Fnc1<Boolean, Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return Prc1.fromFunction(this.afterApplyOnTo(onSuccess, onFailure));
    }

    default public <R> Fnc1<T1, R> afterApplyOnTo(Fnc1<Boolean, ? extends R> onSuccess, Fnc1<Boolean, ? extends R> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return t1 -> {
            Boolean value = this.test(t1);
            return (value != false ? onSuccess : onFailure).apply(value);
        };
    }

    default public Prc1<T1> afterApplyOn(Fnc0<Boolean> onSuccess, Fnc0<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onFailure.ignoring1(), onFailure.ignoring1());
    }

    default public <R> Fnc1<T1, R> afterApplyOnTo(Fnc0<? extends R> onSuccess, Fnc0<? extends R> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOnTo(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Prc1<T1> afterGetOn(Spc<Boolean> onSuccess, Spc<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Csc1<T1> afterAcceptOnTo(Csc1<Boolean> onSuccess, Csc1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOnTo(onSuccess.toFunction(null), onFailure.toFunction(null)).toConsumer();
    }

    default public Prc1<T1> afterAcceptOn(Csc1<Boolean> onSuccess, Csc1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.toFunction(null), onFailure.toFunction(null));
    }

    default public Prc1<T1> afterRun(Rnc r) {
        return this.afterRunOn(r, r);
    }

    default public Prc1<T1> afterTest(Prc1<Boolean> p) {
        return this.afterTestOn(p, p);
    }

    default public Prc1<T1> afterTest(Prc0 p) {
        return this.afterTestOn(p, p);
    }

    default public Prc1<T1> afterApply(Fnc1<Boolean, Boolean> f) {
        return this.afterApplyOn(f, f);
    }

    default public <R> Fnc1<T1, R> afterApplyTo(Fnc1<Boolean, ? extends R> f) {
        return this.afterApplyOnTo(f, f);
    }

    default public Prc1<T1> afterApply(Fnc0<Boolean> f) {
        return this.afterApplyOn(f, f);
    }

    default public <R> Fnc1<T1, R> afterApplyTo(Fnc0<? extends R> f) {
        return this.afterApplyOnTo(f, f);
    }

    default public Prc1<T1> afterGet(Spc<Boolean> s) {
        return this.afterGetOn(s, s);
    }

    default public Csc1<T1> afterAcceptTo(Csc1<Boolean> c) {
        return this.afterAcceptOnTo(c, c);
    }

    default public Prc1<T1> afterAccept(Csc1<Boolean> c) {
        return this.afterAcceptOn(c, c);
    }

    default public Pr1<T1> beforeWrap(Pr1<? super Spc<Boolean>> wrap) {
        return Pr1.fromFunction(this.beforeWrapTo(wrap.toFunction()));
    }

    default public <W> Fn1<T1, W> beforeWrapTo(Fn1<? super Spc<Boolean>, ? extends W> wrap) {
        return t1 -> wrap.apply(this.toSupplier(t1));
    }

    default public Prc1<T1> afterRunOnSuccess(Rnc r) {
        return this.afterRunOn(r, Rnc.empty());
    }

    default public Prc1<T1> afterTestOnSuccess(Prc1<Boolean> p) {
        return this.afterTestOn(p, Prc1.empty());
    }

    default public Prc1<T1> afterTestOnSuccess(Prc0 p) {
        return this.afterTestOn(p, Prc0.empty());
    }

    default public Prc1<T1> afterApplyOnSuccess(Fnc1<Boolean, Boolean> f) {
        return this.afterApplyOn(f, Fnc1.empty());
    }

    default public <R> Fnc1<T1, R> afterApplyOnSuccessTo(Fnc1<Boolean, ? extends R> f) {
        return this.afterApplyOnTo(f, Fnc1.empty());
    }

    default public Prc1<T1> afterApplyOnSuccess(Fnc0<Boolean> f) {
        return this.afterApplyOn(f, Fnc0.empty());
    }

    default public <R> Fnc1<T1, R> afterApplyOnSuccessTo(Fnc0<? extends R> f) {
        return this.afterApplyOnTo(f, Fnc0.empty());
    }

    default public Prc1<T1> afterGetOnSuccess(Spc<Boolean> s) {
        return this.afterGetOn(s, Spc.empty());
    }

    default public Csc1<T1> afterAcceptOnSuccessTo(Csc1<Boolean> c) {
        return this.afterAcceptOnTo(c, Csc1.empty());
    }

    default public Prc1<T1> afterAcceptOnSuccess(Csc1<Boolean> c) {
        return this.afterAcceptOn(c, Csc1.empty());
    }

    default public Prc1<T1> afterRunOnFailure(Rnc r) {
        return this.negated().afterRunOnSuccess(r);
    }

    default public Prc1<T1> afterTestOnFailure(Prc1<Boolean> p) {
        return this.negated().afterTestOnSuccess(p);
    }

    default public Prc1<T1> afterTestOnFailure(Prc0 p) {
        return this.negated().afterTestOnSuccess(p);
    }

    default public Prc1<T1> afterApplyOnFailure(Fnc1<Boolean, Boolean> f) {
        return this.negated().afterApplyOnSuccess(f);
    }

    default public <R> Fnc1<T1, R> afterApplyOnFailureTo(Fnc1<Boolean, ? extends R> f) {
        return this.negated().afterApplyOnSuccessTo(f);
    }

    default public Prc1<T1> afterApplyOnFailure(Fnc0<Boolean> f) {
        return this.negated().afterApplyOnSuccess(f);
    }

    default public <R> Fnc1<T1, R> afterApplyOnFailureTo(Fnc0<? extends R> f) {
        return this.negated().afterApplyOnSuccessTo(f);
    }

    default public Prc1<T1> afterGetOnFailure(Spc<Boolean> s) {
        return this.negated().afterGetOnSuccess(s);
    }

    default public Csc1<T1> afterAcceptOnFailureTo(Csc1<Boolean> c) {
        return this.negated().afterAcceptOnSuccessTo(c);
    }

    default public Prc1<T1> afterAcceptOnFailure(Csc1<Boolean> c) {
        return this.negated().afterAcceptOnSuccess(c);
    }

    default public Prc1<T1> beforeRun(Rnc r) {
        Objects.requireNonNull(r, "r is null");
        return t1 -> {
            r.run();
            return this.test(t1);
        };
    }

    default public <B1> Prc1<B1> beforeApply(Fnc1<? super B1, ? extends T1> f) {
        return this.beforeApply1(f);
    }

    default public <B1> Prc1<B1> beforeApply1(Fnc1<? super B1, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return b1 -> this.test(f.apply(b1));
    }

    default public <B1, B2> Prc2<B1, B2> beforeApply2(Fnc2<? super B1, ? super B2, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2) -> this.test(f.apply(b1, b2));
    }

    default public <B1, B2, B3> Prc3<B1, B2, B3> beforeApply3(Fnc3<? super B1, ? super B2, ? super B3, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3) -> this.test(f.apply(b1, b2, b3));
    }

    default public <B1, B2, B3, B4> Prc4<B1, B2, B3, B4> beforeApply4(Fnc4<? super B1, ? super B2, ? super B3, ? super B4, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4) -> this.test(f.apply(b1, b2, b3, b4));
    }

    default public <B1, B2, B3, B4, B5> Prc5<B1, B2, B3, B4, B5> beforeApply5(Fnc5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5) -> this.test(f.apply(b1, b2, b3, b4, b5));
    }

    default public <B1, B2, B3, B4, B5, B6> Prc6<B1, B2, B3, B4, B5, B6> beforeApply6(Fnc6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6) -> this.test(f.apply(b1, b2, b3, b4, b5, b6));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Prc7<B1, B2, B3, B4, B5, B6, B7> beforeApply7(Fnc7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7) -> this.test(f.apply(b1, b2, b3, b4, b5, b6, b7));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Prc8<B1, B2, B3, B4, B5, B6, B7, B8> beforeApply8(Fnc8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7, b8) -> this.test(f.apply(b1, b2, b3, b4, b5, b6, b7, b8));
    }

    default public Prc1<T1> beforeTestOnSuccess(Prc0 p, Prc1<? super T1> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return t1 -> p.test() != false ? this.test(t1) : onFailure.test(t1);
    }

    default public Prc1<T1> beforeTestOnSuccess(Prc0 p, Spc<? extends Boolean> onFailure) {
        return this.beforeTestOnSuccess(p, Prc1.fromSupplier(onFailure));
    }

    default public Prc1<T1> beforeTestOnSuccess(Prc0 p, Boolean onFailure) {
        return this.beforeTestOnSuccess(p, Prc1.value(onFailure));
    }

    default public Prc1<T1> beforeTestOnSuccess(Prc0 p) {
        return this.beforeTestOnSuccess(p, Prc1.empty());
    }

    default public Prc1<T1> beforeTestOnFailure(Prc0 p, Prc1<? super T1> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Prc1<T1> beforeTestOnFailure(Prc0 p, Spc<? extends Boolean> onSuccess) {
        return this.beforeTestOnFailure(p, Prc1.fromSupplier(onSuccess));
    }

    default public Prc1<T1> beforeTestOnFailure(Prc0 p, Boolean onSuccess) {
        return this.beforeTestOnFailure(p, Prc1.value(onSuccess));
    }

    default public Prc1<T1> beforeTestOnFailure(Prc0 p) {
        return this.beforeTestOnFailure(p, Prc1.empty());
    }

    default public Prc0 beforeGet(Spc<? extends T1> s) {
        Objects.requireNonNull(s, "s is null");
        return () -> this.test(s.get());
    }

    default public <S> Prc1<T1> afterPassingThroughApplyOn(Fnc1<? super T1, ? extends S> onSuccess, Fnc1<? super T1, ? extends S> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return t1 -> {
            Boolean result = this.test(t1);
            Fnc1.narrow(result != false ? onSuccess : onFailure).apply(t1);
            return result;
        };
    }

    default public <S> Fnc1<T1, S> afterPassingThroughApplyOnTo(Fnc1<? super T1, ? extends S> onSuccess, Fnc1<? super T1, ? extends S> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return t1 -> Fnc1.narrow(this.test(t1) ? onSuccess : onFailure).apply(t1);
    }

    default public Prc1<T1> afterPassingThroughAcceptOn(Csc1<? super T1> onSuccess, Csc1<? super T1> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return t1 -> {
            Boolean result = this.test(t1);
            Csc1.narrow(result != false ? onSuccess : onFailure).accept(t1);
            return result;
        };
    }

    default public Csc1<T1> afterPassingThroughAcceptOnTo(Csc1<? super T1> onSuccess, Csc1<? super T1> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return t1 -> Csc1.narrow(this.test(t1) ? onSuccess : onFailure).accept(t1);
    }

    default public Prc1<T1> afterPassingThroughTestOn(Prc1<? super T1> onSuccess, Prc1<? super T1> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return t1 -> Prc1.narrow(this.test(t1) ? onSuccess : onFailure).test(t1);
    }

    default public <S> Prc1<T1> afterPassingThroughApply(Fnc1<? super T1, ? extends S> f) {
        return this.afterPassingThroughApplyOn(f, f);
    }

    default public <S> Fnc1<T1, S> afterPassingThroughApplyTo(Fnc1<? super T1, ? extends S> f) {
        return this.afterPassingThroughApplyOnTo(f, f);
    }

    default public Prc1<T1> afterPassingThroughAccept(Csc1<? super T1> c) {
        return this.afterPassingThroughAcceptOn(c, c);
    }

    default public Csc1<T1> afterPassingThroughAcceptTo(Csc1<? super T1> c) {
        return this.afterPassingThroughAcceptOnTo(c, c);
    }

    default public Prc1<T1> afterPassingThroughTest(Prc1<? super T1> p) {
        return this.afterPassingThroughTestOn(p, p);
    }

    default public <S> Prc1<T1> afterSuccessPassingThroughApply(Fnc1<? super T1, ? extends S> onSuccess) {
        return this.afterPassingThroughApplyOn(onSuccess, Fnc1.empty());
    }

    default public <S> Fnc1<T1, S> afterSuccessPassingThroughApplyTo(Fnc1<? super T1, ? extends S> onSuccess) {
        return this.afterPassingThroughApplyOnTo(onSuccess, Fnc1.empty());
    }

    default public Prc1<T1> afterSuccessPassingThroughAccept(Csc1<? super T1> onSuccess) {
        return this.afterPassingThroughAcceptOn(onSuccess, Csc1.empty());
    }

    default public Csc1<T1> afterSuccessPassingThroughAcceptTo(Csc1<? super T1> onSuccess) {
        return this.afterPassingThroughAcceptOnTo(onSuccess, Csc1.empty());
    }

    default public Prc1<T1> afterSuccessPassingThroughTest(Prc1<? super T1> onSuccess) {
        return this.afterPassingThroughTestOn(onSuccess, Prc1.empty());
    }

    default public <S> Prc1<T1> afterFailurePassingThroughApply(Fnc1<? super T1, ? extends S> onFailure) {
        return this.negated().afterSuccessPassingThroughApply(onFailure);
    }

    default public <S> Fnc1<T1, S> afterFailurePassingThroughApplyTo(Fnc1<? super T1, ? extends S> onFailure) {
        return this.negated().afterSuccessPassingThroughApplyTo(onFailure);
    }

    default public Prc1<T1> afterFailurePassingThroughAccept(Csc1<? super T1> onFailure) {
        return this.negated().afterSuccessPassingThroughAccept(onFailure);
    }

    default public Csc1<T1> afterFailurePassingThroughAcceptTo(Csc1<? super T1> onFailure) {
        return this.negated().afterSuccessPassingThroughAcceptTo(onFailure);
    }

    default public Prc1<T1> afterFailurePassingThroughTest(Prc1<? super T1> onFailure) {
        return this.negated().afterSuccessPassingThroughTest(onFailure);
    }

    default public <R> Prc1<T1> beforePassingThroughApply(Fnc1<? super T1, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return t1 -> {
            f.apply(t1);
            return this.test(t1);
        };
    }

    default public Prc1<T1> beforePassingThroughTest(Prc1<? super T1> p) {
        Objects.requireNonNull(p, "p is null");
        return t1 -> {
            p.test(t1);
            return this.test(t1);
        };
    }

    default public Prc1<T1> beforePassingThroughAccept(Csc1<? super T1> c) {
        Objects.requireNonNull(c, "c is null");
        return t1 -> {
            c.accept(t1);
            return this.test(t1);
        };
    }

    default public Prc1<T1> beforeSuccessPassingThroughTest(Prc1<? super T1> p, Prc1<? super T1> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return t1 -> p.test(t1) ? this.test(t1) : onFailure.test(t1);
    }

    default public Prc1<T1> beforeSuccessPassingThroughTest(Prc1<? super T1> p, Spc<? extends Boolean> onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Prc1.fromSupplier(onFailure));
    }

    default public Prc1<T1> beforeSuccessPassingThroughTest(Prc1<? super T1> p, Boolean onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Prc1.value(onFailure));
    }

    default public Prc1<T1> beforeSuccessPassingThroughTest(Prc1<? super T1> p) {
        return this.beforeSuccessPassingThroughTest(p, Prc1.empty());
    }

    default public Prc1<T1> beforeFailurePassingThroughTest(Prc1<? super T1> p, Prc1<? super T1> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Prc1<T1> beforeFailurePassingThroughTest(Prc1<? super T1> p, Spc<? extends Boolean> onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Prc1.fromSupplier(onSuccess));
    }

    default public Prc1<T1> beforeFailurePassingThroughTest(Prc1<? super T1> p, Boolean onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Prc1.value(onSuccess));
    }

    default public Prc1<T1> beforeFailurePassingThroughTest(Prc1<? super T1> p) {
        return this.beforeFailurePassingThroughTest(p, Prc1.empty());
    }

    default public Prc1<Tuple1<T1>> tupled() {
        return tuple -> this.test(tuple._1());
    }

    default public Prc1<T1> currying() {
        return this;
    }

    default public Pr1<T1> unchecked() {
        return t1 -> {
            try {
                return this.test(t1);
            }
            catch (Throwable t) {
                return (Boolean) SneakyThrow.sneakyThrow(t);
            }

        };
    }

    default public Prc1<T1> negated() {
        return ((CheckedPredicate) super.negate())::test;
    }

    default public Prc1<T1> and(CheckedPredicate<? super T1> p) {
        return t1 -> this.test(t1) && p.test(t1);
    }

    default public Prc1<T1> or(CheckedPredicate<? super T1> p) {
        return t1 -> this.test(t1) || p.test(t1);
    }

    default public Prc1<T1> and(Prc0 p) {
        return t1 -> this.test(t1) && p.test() != false;
    }

    default public Prc1<T1> or(Prc0 p) {
        return t1 -> this.test(t1) || p.test() != false;
    }

    default public <I1> Prc2<I1, T1> ignoring1Lt() {
        return (i1, t1) -> this.test(t1);
    }

    default public <I1> Prc2<T1, I1> ignoring1Rt() {
        return (t1, i1) -> this.test(t1);
    }

    default public <I1, I2> Prc3<I1, I2, T1> ignoring2Lt() {
        return (i1, i2, t1) -> this.test(t1);
    }

    default public <I1, I2> Prc3<T1, I1, I2> ignoring2Rt() {
        return (t1, i1, i2) -> this.test(t1);
    }

    default public <I1, I2, I3> Prc4<I1, I2, I3, T1> ignoring3Lt() {
        return (i1, i2, i3, t1) -> this.test(t1);
    }

    default public <I1, I2, I3> Prc4<T1, I1, I2, I3> ignoring3Rt() {
        return (t1, i1, i2, i3) -> this.test(t1);
    }

    default public <I1, I2, I3, I4> Prc5<I1, I2, I3, I4, T1> ignoring4Lt() {
        return (i1, i2, i3, i4, t1) -> this.test(t1);
    }

    default public <I1, I2, I3, I4> Prc5<T1, I1, I2, I3, I4> ignoring4Rt() {
        return (t1, i1, i2, i3, i4) -> this.test(t1);
    }

    default public <I1, I2, I3, I4, I5> Prc6<I1, I2, I3, I4, I5, T1> ignoring5Lt() {
        return (i1, i2, i3, i4, i5, t1) -> this.test(t1);
    }

    default public <I1, I2, I3, I4, I5> Prc6<T1, I1, I2, I3, I4, I5> ignoring5Rt() {
        return (t1, i1, i2, i3, i4, i5) -> this.test(t1);
    }

    default public <I1, I2, I3, I4, I5, I6> Prc7<I1, I2, I3, I4, I5, I6, T1> ignoring6Lt() {
        return (i1, i2, i3, i4, i5, i6, t1) -> this.test(t1);
    }

    default public <I1, I2, I3, I4, I5, I6> Prc7<T1, I1, I2, I3, I4, I5, I6> ignoring6Rt() {
        return (t1, i1, i2, i3, i4, i5, i6) -> this.test(t1);
    }

    default public <I1, I2, I3, I4, I5, I6, I7> Prc8<I1, I2, I3, I4, I5, I6, I7, T1> ignoring7Lt() {
        return (i1, i2, i3, i4, i5, i6, i7, t1) -> this.test(t1);
    }

    default public <I1, I2, I3, I4, I5, I6, I7> Prc8<T1, I1, I2, I3, I4, I5, I6, I7> ignoring7Rt() {
        return (t1, i1, i2, i3, i4, i5, i6, i7) -> this.test(t1);
    }

    default public Prc1<T1> memoized() {
        return CheckedFunction1.super.memoized()::apply;
    }

    default public Pr1<T1> recover(Fn1<? super Throwable, ? extends Pr1<? super T1>> recover) {
        Objects.requireNonNull(recover, "recover is null");
        return t1 -> {
            try {
                return this.test(t1);
            }
            catch (Throwable throwable) {
                Pr1 pred = (Pr1) recover.apply(throwable);
                Objects.requireNonNull(pred, () -> "recover return null for " + throwable.getClass() + ": " + throwable.getMessage());
                return pred.test(t1);
            }

        };
    }

}

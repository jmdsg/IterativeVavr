package com.fiberg.iterative.function;

import com.fiberg.iterative.core.IterativeInternals;
import com.fiberg.iterative.function.Csc1;
import com.fiberg.iterative.function.Csc3;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fn3;
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
import com.fiberg.iterative.function.Pr3;
import com.fiberg.iterative.function.Prc0;
import com.fiberg.iterative.function.Prc1;
import com.fiberg.iterative.function.Prc2;
import com.fiberg.iterative.function.Prc4;
import com.fiberg.iterative.function.Prc5;
import com.fiberg.iterative.function.Prc6;
import com.fiberg.iterative.function.Prc7;
import com.fiberg.iterative.function.Prc8;
import com.fiberg.iterative.function.Predicates;
import com.fiberg.iterative.function.Rnc;
import com.fiberg.iterative.function.SneakyThrow;
import com.fiberg.iterative.function.Spc;
import io.vavr.CheckedFunction3;
import io.vavr.Tuple;
import io.vavr.Tuple3;
import java.io.Serializable;
import java.util.Objects;

@FunctionalInterface
public interface Prc3<T1, T2, T3> extends CheckedFunction3<T1, T2, T3, Boolean> {

    default public Boolean apply(T1 t1, T2 t2, T3 t3) throws Throwable {
        return this.test(t1, t2, t3);
    }

    public static <T1, T2, T3> Prc3<T1, T2, T3> narrow(Prc3<? super T1, ? super T2, ? super T3> p) {
        return p;
    }

    public static <T1, T2, T3> Prc3<T1, T2, T3> empty() {
        return IterativeInternals::none;
    }

    public static <T1, T2, T3> Prc3<T1, T2, T3> value(Boolean b) {
        return (t1, t2, t3) -> b;
    }

    public static <T1, T2, T3> Prc3<T1, T2, T3> of(Prc3<? super T1, ? super T2, ? super T3> p) {
        return Prc3.narrow(p);
    }

    public static <T1, T2, T3> Prc3<T1, T2, T3> of1(Prc1<? super T1> f) {
        return Prc3.narrow(f.ignoring2Rt());
    }

    public static <T1, T2, T3> Prc3<T1, T2, T3> of2(Prc1<? super T2> f) {
        return Prc3.narrow(f.ignoring1Rt().ignoring1Lt());
    }

    public static <T1, T2, T3> Prc3<T1, T2, T3> of3(Prc1<? super T3> f) {
        return Prc3.narrow(f.ignoring2Lt());
    }

    public static <T1, T2, T3> Prc3<T1, T2, T3> fromFunction(Fnc3<? super T1, ? super T2, ? super T3, Boolean> f) {
        return (arg_0, arg_1, arg_2) -> f.apply(arg_0, arg_1, arg_2);
    }

    public static <T1, T2, T3> Prc3<T1, T2, T3> fromSupplier(Spc<? extends Boolean> s) {
        return Prc3.fromFunction(Spc.narrow(s).toFunction().ignoring3());
    }

    public static <T1, T2, T3> Prc3<T1, T2, T3> negate(Prc3<? super T1, ? super T2, ? super T3> p) {
        return Prc3.narrow(p.negated());
    }

    @SafeVarargs
    public static <T1, T2, T3> Prc3<T1, T2, T3> and(Prc3<? super T1, ? super T2, ? super T3> ... ps) {
        Objects.requireNonNull(ps, "ps is null");
        return Predicates.and(ps);
    }

    public static <T1, T2, T3> Prc3<T1, T2, T3> and(Prc3<? super T1, ? super T2, ? super T3> p, Prc0 ... ps) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(ps, "ps is null");
        return ps.length == 0 ? Prc3.narrow(p) : Prc3.narrow(p).and(Predicates.and(ps));
    }

    @SafeVarargs
    public static <T1, T2, T3> Prc3<T1, T2, T3> or(Prc3<? super T1, ? super T2, ? super T3> ... ps) {
        Objects.requireNonNull(ps, "ps is null");
        return Predicates.or(ps);
    }

    public static <T1, T2, T3> Prc3<T1, T2, T3> or(Prc3<? super T1, ? super T2, ? super T3> p, Prc0 ... ps) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(ps, "ps is null");
        return ps.length == 0 ? Prc3.narrow(p) : Prc3.narrow(p).or(Predicates.or(ps));
    }

    public static <T1, T2, T3> Prc1<Tuple3<T1, T2, T3>> tuple(Prc3<? super T1, ? super T2, ? super T3> p) {
        return Prc3.of(p).tupled();
    }

    public static <T1, T2, T3> Prc3<T1, T2, T3> detuple(Prc1<? super Tuple3<? extends T1, ? extends T2, ? extends T3>> p) {
        return (t1, t2, t3) -> p.test(Tuple.of(t1, t2, t3));
    }

    public static <T1, T2, T3> Prc3<T1, T2, T3> check(Pr3<? super T1, ? super T2, ? super T3> p) {
        Objects.requireNonNull(p, "p is null");
        return Pr3.narrow(p).checked();
    }

    public static <T1, T2, T3> Prc3<T1, T2, T3> ignore(Prc0 p) {
        return p.ignoring3();
    }

    public static <T1, T2, T3> Prc3<T1, T2, T3> ignore2Rt(Prc1<? super T1> p) {
        return Prc1.narrow(p).ignoring2Rt();
    }

    public static <T1, T2, T3> Prc3<T1, T2, T3> ignore2Lt(Prc1<? super T3> p) {
        return Prc1.narrow(p).ignoring2Lt();
    }

    public static <T1, T2, T3> Prc3<T1, T2, T3> ignore1Rt(Prc2<? super T1, ? super T2> p) {
        return Prc2.narrow(p).ignoring1Rt();
    }

    public static <T1, T2, T3> Prc3<T1, T2, T3> ignore1Lt(Prc2<? super T2, ? super T3> p) {
        return Prc2.narrow(p).ignoring1Lt();
    }

    public static <T1, T2, T3, T4> Prc3<T1, T2, T3> passRt(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p, T4 t4) {
        return Prc3.narrow(p.testRt(t4));
    }

    public static <T1, T2, T3, T4, T5> Prc3<T1, T2, T3> passRt(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, T4 t4, T5 t5) {
        return Prc3.narrow(p.testRt(t4, t5));
    }

    public static <T1, T2, T3, T4, T5, T6> Prc3<T1, T2, T3> passRt(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, T4 t4, T5 t5, T6 t6) {
        return Prc3.narrow(p.testRt(t4, t5, t6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc3<T1, T2, T3> passRt(Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, T4 t4, T5 t5, T6 t6, T7 t7) {
        return Prc3.narrow(p.testRt(t4, t5, t6, t7));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc3<T1, T2, T3> passRt(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Prc3.narrow(p.testRt(t4, t5, t6, t7, t8));
    }

    public static <T1, T2, T3, T4> Prc3<T2, T3, T4> passLt(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p, T1 t1) {
        return Prc3.narrow(p.testLt(t1));
    }

    public static <T1, T2, T3, T4, T5> Prc3<T3, T4, T5> passLt(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, T1 t1, T2 t2) {
        return Prc3.narrow(p.testLt(t1, t2));
    }

    public static <T1, T2, T3, T4, T5, T6> Prc3<T4, T5, T6> passLt(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, T1 t1, T2 t2, T3 t3) {
        return Prc3.narrow(p.testLt(t1, t2, t3));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc3<T5, T6, T7> passLt(Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, T1 t1, T2 t2, T3 t3, T4 t4) {
        return Prc3.narrow(p.testLt(t1, t2, t3, t4));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc3<T6, T7, T8> passLt(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return Prc3.narrow(p.testLt(t1, t2, t3, t4, t5));
    }

    public static <T1, T2, T3> Prc3<T3, T2, T1> invert(Prc3<? super T1, ? super T2, ? super T3> p) {
        return Prc3.narrow(p).inverted();
    }

    public boolean test(T1 var1, T2 var2, T3 var3) throws Throwable;

    default public Prc2<T2, T3> testLt(T1 t1) {
        return (t2, t3) -> this.test(t1, t2, t3);
    }

    default public Prc1<T3> testLt(T1 t1, T2 t2) {
        return t3 -> this.test(t1, t2, t3);
    }

    default public Prc2<T1, T2> testRt(T3 t3) {
        return (t1, t2) -> this.test(t1, t2, t3);
    }

    default public Prc1<T1> testRt(T2 t2, T3 t3) {
        return t1 -> this.test(t1, t2, t3);
    }

    default public Fnc3<T1, T2, T3, Boolean> toFunction() {
        return (arg_0, arg_1, arg_2) -> this.test(arg_0, arg_1, arg_2);
    }

    default public Csc3<T1, T2, T3> toConsumer() {
        return (arg_0, arg_1, arg_2) -> this.test(arg_0, arg_1, arg_2);
    }

    default public Prc0 toPredicate(T1 t1, T2 t2, T3 t3) {
        return () -> this.test(t1, t2, t3);
    }

    default public Spc<Boolean> toSupplier(T1 t1, T2 t2, T3 t3) {
        return this.toPredicate(t1, t2, t3).toSupplier();
    }

    default public Rnc toRunnable(T1 t1, T2 t2, T3 t3) {
        return this.toPredicate(t1, t2, t3).toRunnable();
    }

    default public Prc3<T1, T2, T3> afterRunOn(Rnc onSuccess, Rnc onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3) -> {
            Boolean value = this.test(t1, t2, t3);
            (value != false ? onSuccess : onFailure).run();
            return value;
        };
    }

    default public Prc3<T1, T2, T3> afterTestOn(Prc1<Boolean> onSuccess, Prc1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.toFunction(), onFailure.toFunction());
    }

    default public Prc3<T1, T2, T3> afterTestOn(Prc0 onSuccess, Prc0 onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterTestOn(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Prc3<T1, T2, T3> afterApplyOn(Fnc1<Boolean, Boolean> onSuccess, Fnc1<Boolean, Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return Prc3.fromFunction(this.afterApplyOnTo(onSuccess, onFailure));
    }

    default public <R> Fnc3<T1, T2, T3, R> afterApplyOnTo(Fnc1<Boolean, ? extends R> onSuccess, Fnc1<Boolean, ? extends R> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3) -> {
            Boolean value = this.test(t1, t2, t3);
            return (value != false ? onSuccess : onFailure).apply(value);
        };
    }

    default public Prc3<T1, T2, T3> afterApplyOn(Fnc0<Boolean> onSuccess, Fnc0<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onFailure.ignoring1(), onFailure.ignoring1());
    }

    default public <R> Fnc3<T1, T2, T3, R> afterApplyOnTo(Fnc0<? extends R> onSuccess, Fnc0<? extends R> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOnTo(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Prc3<T1, T2, T3> afterGetOn(Spc<Boolean> onSuccess, Spc<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Csc3<T1, T2, T3> afterAcceptOnTo(Csc1<Boolean> onSuccess, Csc1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOnTo(onSuccess.toFunction(null), onFailure.toFunction(null)).toConsumer();
    }

    default public Prc3<T1, T2, T3> afterAcceptOn(Csc1<Boolean> onSuccess, Csc1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.toFunction(null), onFailure.toFunction(null));
    }

    default public Prc3<T1, T2, T3> afterRun(Rnc r) {
        return this.afterRunOn(r, r);
    }

    default public Prc3<T1, T2, T3> afterTest(Prc1<Boolean> p) {
        return this.afterTestOn(p, p);
    }

    default public Prc3<T1, T2, T3> afterTest(Prc0 p) {
        return this.afterTestOn(p, p);
    }

    default public Prc3<T1, T2, T3> afterApply(Fnc1<Boolean, Boolean> f) {
        return this.afterApplyOn(f, f);
    }

    default public <R> Fnc3<T1, T2, T3, R> afterApplyTo(Fnc1<Boolean, ? extends R> f) {
        return this.afterApplyOnTo(f, f);
    }

    default public Prc3<T1, T2, T3> afterApply(Fnc0<Boolean> f) {
        return this.afterApplyOn(f, f);
    }

    default public <R> Fnc3<T1, T2, T3, R> afterApplyTo(Fnc0<? extends R> f) {
        return this.afterApplyOnTo(f, f);
    }

    default public Prc3<T1, T2, T3> afterGet(Spc<Boolean> s) {
        return this.afterGetOn(s, s);
    }

    default public Csc3<T1, T2, T3> afterAcceptTo(Csc1<Boolean> c) {
        return this.afterAcceptOnTo(c, c);
    }

    default public Prc3<T1, T2, T3> afterAccept(Csc1<Boolean> c) {
        return this.afterAcceptOn(c, c);
    }

    default public Pr3<T1, T2, T3> beforeWrap(Pr1<? super Spc<Boolean>> wrap) {
        return Pr3.fromFunction(this.beforeWrapTo(wrap.toFunction()));
    }

    default public <W> Fn3<T1, T2, T3, W> beforeWrapTo(Fn1<? super Spc<Boolean>, ? extends W> wrap) {
        return (t1, t2, t3) -> wrap.apply(this.toSupplier(t1, t2, t3));
    }

    default public Prc3<T1, T2, T3> afterRunOnSuccess(Rnc r) {
        return this.afterRunOn(r, Rnc.empty());
    }

    default public Prc3<T1, T2, T3> afterTestOnSuccess(Prc1<Boolean> p) {
        return this.afterTestOn(p, Prc1.empty());
    }

    default public Prc3<T1, T2, T3> afterTestOnSuccess(Prc0 p) {
        return this.afterTestOn(p, Prc0.empty());
    }

    default public Prc3<T1, T2, T3> afterApplyOnSuccess(Fnc1<Boolean, Boolean> f) {
        return this.afterApplyOn(f, Fnc1.empty());
    }

    default public <R> Fnc3<T1, T2, T3, R> afterApplyOnSuccessTo(Fnc1<Boolean, ? extends R> f) {
        return this.afterApplyOnTo(f, Fnc1.empty());
    }

    default public Prc3<T1, T2, T3> afterApplyOnSuccess(Fnc0<Boolean> f) {
        return this.afterApplyOn(f, Fnc0.empty());
    }

    default public <R> Fnc3<T1, T2, T3, R> afterApplyOnSuccessTo(Fnc0<? extends R> f) {
        return this.afterApplyOnTo(f, Fnc0.empty());
    }

    default public Prc3<T1, T2, T3> afterGetOnSuccess(Spc<Boolean> s) {
        return this.afterGetOn(s, Spc.empty());
    }

    default public Csc3<T1, T2, T3> afterAcceptOnSuccessTo(Csc1<Boolean> c) {
        return this.afterAcceptOnTo(c, Csc1.empty());
    }

    default public Prc3<T1, T2, T3> afterAcceptOnSuccess(Csc1<Boolean> c) {
        return this.afterAcceptOn(c, Csc1.empty());
    }

    default public Prc3<T1, T2, T3> afterRunOnFailure(Rnc r) {
        return this.negated().afterRunOnSuccess(r);
    }

    default public Prc3<T1, T2, T3> afterTestOnFailure(Prc1<Boolean> p) {
        return this.negated().afterTestOnSuccess(p);
    }

    default public Prc3<T1, T2, T3> afterTestOnFailure(Prc0 p) {
        return this.negated().afterTestOnSuccess(p);
    }

    default public Prc3<T1, T2, T3> afterApplyOnFailure(Fnc1<Boolean, Boolean> f) {
        return this.negated().afterApplyOnSuccess(f);
    }

    default public <R> Fnc3<T1, T2, T3, R> afterApplyOnFailureTo(Fnc1<Boolean, ? extends R> f) {
        return this.negated().afterApplyOnSuccessTo(f);
    }

    default public Prc3<T1, T2, T3> afterApplyOnFailure(Fnc0<Boolean> f) {
        return this.negated().afterApplyOnSuccess(f);
    }

    default public <R> Fnc3<T1, T2, T3, R> afterApplyOnFailureTo(Fnc0<? extends R> f) {
        return this.negated().afterApplyOnSuccessTo(f);
    }

    default public Prc3<T1, T2, T3> afterGetOnFailure(Spc<Boolean> s) {
        return this.negated().afterGetOnSuccess(s);
    }

    default public Csc3<T1, T2, T3> afterAcceptOnFailureTo(Csc1<Boolean> c) {
        return this.negated().afterAcceptOnSuccessTo(c);
    }

    default public Prc3<T1, T2, T3> afterAcceptOnFailure(Csc1<Boolean> c) {
        return this.negated().afterAcceptOnSuccess(c);
    }

    default public Prc3<T1, T2, T3> beforeRun(Rnc r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2, t3) -> {
            r.run();
            return this.test(t1, t2, t3);
        };
    }

    default public <B1, B2, B3> Prc3<B1, B2, B3> beforeApply(Fnc3<? super B1, ? super B2, ? super B3, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        return this.beforeApply3(f);
    }

    default public <B1> Prc1<B1> beforeApply1(Fnc1<? super B1, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return b1 -> this.tupled().test(Tuple.narrow((f.apply(b1))));
    }

    default public <B1, B2> Prc2<B1, B2> beforeApply2(Fnc2<? super B1, ? super B2, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2))));
    }

    default public <B1, B2, B3> Prc3<B1, B2, B3> beforeApply3(Fnc3<? super B1, ? super B2, ? super B3, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3))));
    }

    default public <B1, B2, B3, B4> Prc4<B1, B2, B3, B4> beforeApply4(Fnc4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4))));
    }

    default public <B1, B2, B3, B4, B5> Prc5<B1, B2, B3, B4, B5> beforeApply5(Fnc5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5))));
    }

    default public <B1, B2, B3, B4, B5, B6> Prc6<B1, B2, B3, B4, B5, B6> beforeApply6(Fnc6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Prc7<B1, B2, B3, B4, B5, B6, B7> beforeApply7(Fnc7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Prc8<B1, B2, B3, B4, B5, B6, B7, B8> beforeApply8(Fnc8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7, b8) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7, b8))));
    }

    default public Prc3<T1, T2, T3> beforeTestOnSuccess(Prc0 p, Prc3<? super T1, ? super T2, ? super T3> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3) -> p.test() != false ? this.test(t1, t2, t3) : onFailure.test(t1, t2, t3);
    }

    default public Prc3<T1, T2, T3> beforeTestOnSuccess(Prc0 p, Spc<? extends Boolean> onFailure) {
        return this.beforeTestOnSuccess(p, Prc3.fromSupplier(onFailure));
    }

    default public Prc3<T1, T2, T3> beforeTestOnSuccess(Prc0 p, Boolean onFailure) {
        return this.beforeTestOnSuccess(p, Prc3.value(onFailure));
    }

    default public Prc3<T1, T2, T3> beforeTestOnSuccess(Prc0 p) {
        return this.beforeTestOnSuccess(p, Prc3.empty());
    }

    default public Prc3<T1, T2, T3> beforeTestOnFailure(Prc0 p, Prc3<? super T1, ? super T2, ? super T3> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Prc3<T1, T2, T3> beforeTestOnFailure(Prc0 p, Spc<? extends Boolean> onSuccess) {
        return this.beforeTestOnFailure(p, Prc3.fromSupplier(onSuccess));
    }

    default public Prc3<T1, T2, T3> beforeTestOnFailure(Prc0 p, Boolean onSuccess) {
        return this.beforeTestOnFailure(p, Prc3.value(onSuccess));
    }

    default public Prc3<T1, T2, T3> beforeTestOnFailure(Prc0 p) {
        return this.beforeTestOnFailure(p, Prc3.empty());
    }

    default public Prc0 beforeGet(Spc<? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> s) {
        Objects.requireNonNull(s, "s is null");
        return () -> this.tupled().test(Tuple.narrow((s.get())));
    }

    default public Prc3<T3, T2, T1> inverted() {
        return (t3, t2, t1) -> this.test(t1, t2, t3);
    }

    default public <S> Prc3<T1, T2, T3> afterPassingThroughApplyOn(Fnc3<? super T1, ? super T2, ? super T3, ? extends S> onSuccess, Fnc3<? super T1, ? super T2, ? super T3, ? extends S> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3) -> {
            Boolean result = this.test(t1, t2, t3);
            Fnc3.narrow(result != false ? onSuccess : onFailure).apply(t1, t2, t3);
            return result;
        };
    }

    default public <S> Fnc3<T1, T2, T3, S> afterPassingThroughApplyOnTo(Fnc3<? super T1, ? super T2, ? super T3, ? extends S> onSuccess, Fnc3<? super T1, ? super T2, ? super T3, ? extends S> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3) -> Fnc3.narrow(this.test(t1, t2, t3) ? onSuccess : onFailure).apply(t1, t2, t3);
    }

    default public Prc3<T1, T2, T3> afterPassingThroughAcceptOn(Csc3<? super T1, ? super T2, ? super T3> onSuccess, Csc3<? super T1, ? super T2, ? super T3> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3) -> {
            Boolean result = this.test(t1, t2, t3);
            Csc3.narrow(result != false ? onSuccess : onFailure).accept(t1, t2, t3);
            return result;
        };
    }

    default public Csc3<T1, T2, T3> afterPassingThroughAcceptOnTo(Csc3<? super T1, ? super T2, ? super T3> onSuccess, Csc3<? super T1, ? super T2, ? super T3> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3) -> Csc3.narrow(this.test(t1, t2, t3) ? onSuccess : onFailure).accept(t1, t2, t3);
    }

    default public Prc3<T1, T2, T3> afterPassingThroughTestOn(Prc3<? super T1, ? super T2, ? super T3> onSuccess, Prc3<? super T1, ? super T2, ? super T3> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3) -> Prc3.narrow(this.test(t1, t2, t3) ? onSuccess : onFailure).test(t1, t2, t3);
    }

    default public <S> Prc3<T1, T2, T3> afterPassingThroughApply(Fnc3<? super T1, ? super T2, ? super T3, ? extends S> f) {
        return this.afterPassingThroughApplyOn(f, f);
    }

    default public <S> Fnc3<T1, T2, T3, S> afterPassingThroughApplyTo(Fnc3<? super T1, ? super T2, ? super T3, ? extends S> f) {
        return this.afterPassingThroughApplyOnTo(f, f);
    }

    default public Prc3<T1, T2, T3> afterPassingThroughAccept(Csc3<? super T1, ? super T2, ? super T3> c) {
        return this.afterPassingThroughAcceptOn(c, c);
    }

    default public Csc3<T1, T2, T3> afterPassingThroughAcceptTo(Csc3<? super T1, ? super T2, ? super T3> c) {
        return this.afterPassingThroughAcceptOnTo(c, c);
    }

    default public Prc3<T1, T2, T3> afterPassingThroughTest(Prc3<? super T1, ? super T2, ? super T3> p) {
        return this.afterPassingThroughTestOn(p, p);
    }

    default public <S> Prc3<T1, T2, T3> afterSuccessPassingThroughApply(Fnc3<? super T1, ? super T2, ? super T3, ? extends S> onSuccess) {
        return this.afterPassingThroughApplyOn(onSuccess, Fnc3.empty());
    }

    default public <S> Fnc3<T1, T2, T3, S> afterSuccessPassingThroughApplyTo(Fnc3<? super T1, ? super T2, ? super T3, ? extends S> onSuccess) {
        return this.afterPassingThroughApplyOnTo(onSuccess, Fnc3.empty());
    }

    default public Prc3<T1, T2, T3> afterSuccessPassingThroughAccept(Csc3<? super T1, ? super T2, ? super T3> onSuccess) {
        return this.afterPassingThroughAcceptOn(onSuccess, Csc3.empty());
    }

    default public Csc3<T1, T2, T3> afterSuccessPassingThroughAcceptTo(Csc3<? super T1, ? super T2, ? super T3> onSuccess) {
        return this.afterPassingThroughAcceptOnTo(onSuccess, Csc3.empty());
    }

    default public Prc3<T1, T2, T3> afterSuccessPassingThroughTest(Prc3<? super T1, ? super T2, ? super T3> onSuccess) {
        return this.afterPassingThroughTestOn(onSuccess, Prc3.empty());
    }

    default public <S> Prc3<T1, T2, T3> afterFailurePassingThroughApply(Fnc3<? super T1, ? super T2, ? super T3, ? extends S> onFailure) {
        return this.negated().afterSuccessPassingThroughApply(onFailure);
    }

    default public <S> Fnc3<T1, T2, T3, S> afterFailurePassingThroughApplyTo(Fnc3<? super T1, ? super T2, ? super T3, ? extends S> onFailure) {
        return this.negated().afterSuccessPassingThroughApplyTo(onFailure);
    }

    default public Prc3<T1, T2, T3> afterFailurePassingThroughAccept(Csc3<? super T1, ? super T2, ? super T3> onFailure) {
        return this.negated().afterSuccessPassingThroughAccept(onFailure);
    }

    default public Csc3<T1, T2, T3> afterFailurePassingThroughAcceptTo(Csc3<? super T1, ? super T2, ? super T3> onFailure) {
        return this.negated().afterSuccessPassingThroughAcceptTo(onFailure);
    }

    default public Prc3<T1, T2, T3> afterFailurePassingThroughTest(Prc3<? super T1, ? super T2, ? super T3> onFailure) {
        return this.negated().afterSuccessPassingThroughTest(onFailure);
    }

    default public <R> Prc3<T1, T2, T3> beforePassingThroughApply(Fnc3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3) -> {
            f.apply(t1, t2, t3);
            return this.test(t1, t2, t3);
        };
    }

    default public Prc3<T1, T2, T3> beforePassingThroughTest(Prc3<? super T1, ? super T2, ? super T3> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3) -> {
            p.test(t1, t2, t3);
            return this.test(t1, t2, t3);
        };
    }

    default public Prc3<T1, T2, T3> beforePassingThroughAccept(Csc3<? super T1, ? super T2, ? super T3> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3) -> {
            c.accept(t1, t2, t3);
            return this.test(t1, t2, t3);
        };
    }

    default public Prc3<T1, T2, T3> beforeSuccessPassingThroughTest(Prc3<? super T1, ? super T2, ? super T3> p, Prc3<? super T1, ? super T2, ? super T3> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3) -> p.test(t1, t2, t3) ? this.test(t1, t2, t3) : onFailure.test(t1, t2, t3);
    }

    default public Prc3<T1, T2, T3> beforeSuccessPassingThroughTest(Prc3<? super T1, ? super T2, ? super T3> p, Spc<? extends Boolean> onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Prc3.fromSupplier(onFailure));
    }

    default public Prc3<T1, T2, T3> beforeSuccessPassingThroughTest(Prc3<? super T1, ? super T2, ? super T3> p, Boolean onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Prc3.value(onFailure));
    }

    default public Prc3<T1, T2, T3> beforeSuccessPassingThroughTest(Prc3<? super T1, ? super T2, ? super T3> p) {
        return this.beforeSuccessPassingThroughTest(p, Prc3.empty());
    }

    default public Prc3<T1, T2, T3> beforeFailurePassingThroughTest(Prc3<? super T1, ? super T2, ? super T3> p, Prc3<? super T1, ? super T2, ? super T3> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Prc3<T1, T2, T3> beforeFailurePassingThroughTest(Prc3<? super T1, ? super T2, ? super T3> p, Spc<? extends Boolean> onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Prc3.fromSupplier(onSuccess));
    }

    default public Prc3<T1, T2, T3> beforeFailurePassingThroughTest(Prc3<? super T1, ? super T2, ? super T3> p, Boolean onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Prc3.value(onSuccess));
    }

    default public Prc3<T1, T2, T3> beforeFailurePassingThroughTest(Prc3<? super T1, ? super T2, ? super T3> p) {
        return this.beforeFailurePassingThroughTest(p, Prc3.empty());
    }

    default public Prc1<Tuple3<T1, T2, T3>> tupled() {
        return tuple -> this.test(tuple._1(), tuple._2(), tuple._3());
    }

    default public Fnc1<T1, Fnc1<T2, Prc1<T3>>> currying() {
        return t1 -> t2 -> t3 -> this.test(t1, t2, t3);
    }

    default public Pr3<T1, T2, T3> unchecked() {
        return (t1, t2, t3) -> {
            try {
                return this.test(t1, t2, t3);
            }
            catch (Throwable t) {
                return (Boolean) SneakyThrow.sneakyThrow(t);
            }

        };
    }

    default public Prc3<T1, T2, T3> negated() {
        return (t1, t2, t3) -> !this.test(t1, t2, t3);
    }

    default public Prc3<T1, T2, T3> and(Prc3<? super T1, ? super T2, ? super T3> p) {
        return (t1, t2, t3) -> this.test(t1, t2, t3) && p.test(t1, t2, t3);
    }

    default public Prc3<T1, T2, T3> or(Prc3<? super T1, ? super T2, ? super T3> p) {
        return (t1, t2, t3) -> this.test(t1, t2, t3) || p.test(t1, t2, t3);
    }

    default public Prc3<T1, T2, T3> and(Prc0 p) {
        return (t1, t2, t3) -> this.test(t1, t2, t3) && p.test() != false;
    }

    default public Prc3<T1, T2, T3> or(Prc0 p) {
        return (t1, t2, t3) -> this.test(t1, t2, t3) || p.test() != false;
    }

    default public <I1> Prc4<I1, T1, T2, T3> ignoring1Lt() {
        return (i1, t1, t2, t3) -> this.test(t1, t2, t3);
    }

    default public <I1> Prc4<T1, T2, T3, I1> ignoring1Rt() {
        return (t1, t2, t3, i1) -> this.test(t1, t2, t3);
    }

    default public <I1, I2> Prc5<I1, I2, T1, T2, T3> ignoring2Lt() {
        return (i1, i2, t1, t2, t3) -> this.test(t1, t2, t3);
    }

    default public <I1, I2> Prc5<T1, T2, T3, I1, I2> ignoring2Rt() {
        return (t1, t2, t3, i1, i2) -> this.test(t1, t2, t3);
    }

    default public <I1, I2, I3> Prc6<I1, I2, I3, T1, T2, T3> ignoring3Lt() {
        return (i1, i2, i3, t1, t2, t3) -> this.test(t1, t2, t3);
    }

    default public <I1, I2, I3> Prc6<T1, T2, T3, I1, I2, I3> ignoring3Rt() {
        return (t1, t2, t3, i1, i2, i3) -> this.test(t1, t2, t3);
    }

    default public <I1, I2, I3, I4> Prc7<I1, I2, I3, I4, T1, T2, T3> ignoring4Lt() {
        return (i1, i2, i3, i4, t1, t2, t3) -> this.test(t1, t2, t3);
    }

    default public <I1, I2, I3, I4> Prc7<T1, T2, T3, I1, I2, I3, I4> ignoring4Rt() {
        return (t1, t2, t3, i1, i2, i3, i4) -> this.test(t1, t2, t3);
    }

    default public <I1, I2, I3, I4, I5> Prc8<I1, I2, I3, I4, I5, T1, T2, T3> ignoring5Lt() {
        return (i1, i2, i3, i4, i5, t1, t2, t3) -> this.test(t1, t2, t3);
    }

    default public <I1, I2, I3, I4, I5> Prc8<T1, T2, T3, I1, I2, I3, I4, I5> ignoring5Rt() {
        return (t1, t2, t3, i1, i2, i3, i4, i5) -> this.test(t1, t2, t3);
    }

    default public Prc3<T1, T2, T3> memoized() {
        return (arg_0, arg_1, arg_2) -> ((CheckedFunction3) super.memoized()).apply(arg_0, arg_1, arg_2);
    }

    default public Pr3<T1, T2, T3> recover(Fn1<? super Throwable, ? extends Pr3<? super T1, ? super T2, ? super T3>> recover) {
        Objects.requireNonNull(recover, "recover is null");
        return (t1, t2, t3) -> {
            try {
                return this.test(t1, t2, t3);
            }
            catch (Throwable throwable) {
                Pr3 pred = (Pr3) recover.apply(throwable);
                Objects.requireNonNull(pred, () -> "recover return null for " + throwable.getClass() + ": " + throwable.getMessage());
                return pred.test(t1, t2, t3);
            }

        };
    }

}

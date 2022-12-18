package com.fiberg.iterative.function;

import com.fiberg.iterative.core.IterativeInternals;
import com.fiberg.iterative.function.Csc1;
import com.fiberg.iterative.function.Csc2;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fn2;
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
import com.fiberg.iterative.function.Pr2;
import com.fiberg.iterative.function.Prc0;
import com.fiberg.iterative.function.Prc1;
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
import io.vavr.CheckedFunction2;
import io.vavr.Tuple;
import io.vavr.Tuple2;
import java.io.Serializable;
import java.util.Objects;

@FunctionalInterface
public interface Prc2<T1, T2> extends CheckedFunction2<T1, T2, Boolean> {

    default public Boolean apply(T1 t1, T2 t2) throws Throwable {
        return this.test(t1, t2);
    }

    public static <T1, T2> Prc2<T1, T2> narrow(Prc2<? super T1, ? super T2> p) {
        return p;
    }

    public static <T1, T2> Prc2<T1, T2> empty() {
        return IterativeInternals::none;
    }

    public static <T1, T2> Prc2<T1, T2> value(Boolean b) {
        return (Prc2<Object, Object> & Serializable) (t1, t2) -> b;
    }

    public static <T1, T2> Prc2<T1, T2> of(Prc2<? super T1, ? super T2> p) {
        return Prc2.narrow(p);
    }

    public static <T1, T2> Prc2<T1, T2> of1(Prc1<? super T1> f) {
        return Prc2.narrow(f.ignoring1Rt());
    }

    public static <T1, T2> Prc2<T1, T2> of2(Prc1<? super T2> f) {
        return Prc2.narrow(f.ignoring1Lt());
    }

    public static <T1, T2> Prc2<T1, T2> fromFunction(Fnc2<? super T1, ? super T2, Boolean> f) {
        return (arg_0, arg_1) -> f.apply(arg_0, arg_1);
    }

    public static <T1, T2> Prc2<T1, T2> fromSupplier(Spc<? extends Boolean> s) {
        return Prc2.fromFunction(Spc.narrow(s).toFunction().ignoring2());
    }

    public static <T1, T2> Prc2<T1, T2> negate(Prc2<? super T1, ? super T2> p) {
        return Prc2.narrow(p.negated());
    }

    @SafeVarargs
    public static <T1, T2> Prc2<T1, T2> and(Prc2<? super T1, ? super T2> ... ps) {
        Objects.requireNonNull(ps, "ps is null");
        return Predicates.and(ps);
    }

    public static <T1, T2> Prc2<T1, T2> and(Prc2<? super T1, ? super T2> p, Prc0 ... ps) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(ps, "ps is null");
        return ps.length == 0 ? Prc2.narrow(p) : Prc2.narrow(p).and(Predicates.and(ps));
    }

    @SafeVarargs
    public static <T1, T2> Prc2<T1, T2> or(Prc2<? super T1, ? super T2> ... ps) {
        Objects.requireNonNull(ps, "ps is null");
        return Predicates.or(ps);
    }

    public static <T1, T2> Prc2<T1, T2> or(Prc2<? super T1, ? super T2> p, Prc0 ... ps) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(ps, "ps is null");
        return ps.length == 0 ? Prc2.narrow(p) : Prc2.narrow(p).or(Predicates.or(ps));
    }

    public static <T1, T2> Prc1<Tuple2<T1, T2>> tuple(Prc2<? super T1, ? super T2> p) {
        return Prc2.of(p).tupled();
    }

    public static <T1, T2> Prc2<T1, T2> detuple(Prc1<? super Tuple2<? extends T1, ? extends T2>> p) {
        return (Prc2<Object, Object> & Serializable) (t1, t2) -> p.test((Object) Tuple.of((Object) t1, (Object) t2));
    }

    public static <T1, T2> Prc2<T1, T2> check(Pr2<? super T1, ? super T2> p) {
        Objects.requireNonNull(p, "p is null");
        return Pr2.narrow(p).checked();
    }

    public static <T1, T2> Prc2<T1, T2> ignore(Prc0 p) {
        return p.ignoring2();
    }

    public static <T1, T2> Prc2<T1, T2> ignoreRt(Prc1<? super T1> p) {
        return Prc1.narrow(p).ignoring1Rt();
    }

    public static <T1, T2> Prc2<T1, T2> ignoreLt(Prc1<? super T2> p) {
        return Prc1.narrow(p).ignoring1Lt();
    }

    public static <T1, T2, T3> Prc2<T1, T2> passRt(Prc3<? super T1, ? super T2, ? super T3> p, T3 t3) {
        return Prc2.narrow(p.testRt(t3));
    }

    public static <T1, T2, T3, T4> Prc2<T1, T2> passRt(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p, T3 t3, T4 t4) {
        return Prc2.narrow(p.testRt(t3, t4));
    }

    public static <T1, T2, T3, T4, T5> Prc2<T1, T2> passRt(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, T3 t3, T4 t4, T5 t5) {
        return Prc2.narrow(p.testRt(t3, t4, t5));
    }

    public static <T1, T2, T3, T4, T5, T6> Prc2<T1, T2> passRt(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, T3 t3, T4 t4, T5 t5, T6 t6) {
        return Prc2.narrow(p.testRt(t3, t4, t5, t6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc2<T1, T2> passRt(Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return Prc2.narrow(p.testRt(t3, t4, t5, t6, t7));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc2<T1, T2> passRt(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Prc2.narrow(p.testRt(t3, t4, t5, t6, t7, t8));
    }

    public static <T1, T2, T3> Prc2<T2, T3> passLt(Prc3<? super T1, ? super T2, ? super T3> p, T1 t1) {
        return Prc2.narrow(p.testLt(t1));
    }

    public static <T1, T2, T3, T4> Prc2<T3, T4> passLt(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p, T1 t1, T2 t2) {
        return Prc2.narrow(p.testLt(t1, t2));
    }

    public static <T1, T2, T3, T4, T5> Prc2<T4, T5> passLt(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, T1 t1, T2 t2, T3 t3) {
        return Prc2.narrow(p.testLt(t1, t2, t3));
    }

    public static <T1, T2, T3, T4, T5, T6> Prc2<T5, T6> passLt(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, T1 t1, T2 t2, T3 t3, T4 t4) {
        return Prc2.narrow(p.testLt(t1, t2, t3, t4));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc2<T6, T7> passLt(Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return Prc2.narrow(p.testLt(t1, t2, t3, t4, t5));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc2<T7, T8> passLt(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return Prc2.narrow(p.testLt(t1, t2, t3, t4, t5, t6));
    }

    public static <T1, T2> Prc2<T2, T1> invert(Prc2<? super T1, ? super T2> p) {
        return Prc2.narrow(p).inverted();
    }

    public boolean test(T1 var1, T2 var2) throws Throwable;

    default public Prc1<T2> testLt(T1 t1) {
        return (Prc1 & Serializable) t2 -> this.test(t1, t2);
    }

    default public Prc1<T1> testRt(T2 t2) {
        return (Prc1 & Serializable) t1 -> this.test(t1, t2);
    }

    default public Fnc2<T1, T2, Boolean> toFunction() {
        return (arg_0, arg_1) -> this.test(arg_0, arg_1);
    }

    default public Csc2<T1, T2> toConsumer() {
        return (arg_0, arg_1) -> this.test(arg_0, arg_1);
    }

    default public Prc0 toPredicate(T1 t1, T2 t2) {
        return (Prc0 & Serializable) () -> this.test(t1, t2);
    }

    default public Spc<Boolean> toSupplier(T1 t1, T2 t2) {
        return this.toPredicate(t1, t2).toSupplier();
    }

    default public Rnc toRunnable(T1 t1, T2 t2) {
        return this.toPredicate(t1, t2).toRunnable();
    }

    default public Prc2<T1, T2> afterRunOn(Rnc onSuccess, Rnc onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (Prc2<Object, Object> & Serializable) (t1, t2) -> {
            Boolean value = this.test(t1, t2);
            (value != false ? onSuccess : onFailure).run();
            return value;
        };
    }

    default public Prc2<T1, T2> afterTestOn(Prc1<Boolean> onSuccess, Prc1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.toFunction(), onFailure.toFunction());
    }

    default public Prc2<T1, T2> afterTestOn(Prc0 onSuccess, Prc0 onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterTestOn(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Prc2<T1, T2> afterApplyOn(Fnc1<Boolean, Boolean> onSuccess, Fnc1<Boolean, Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return Prc2.fromFunction(this.afterApplyOnTo(onSuccess, onFailure));
    }

    default public <R> Fnc2<T1, T2, R> afterApplyOnTo(Fnc1<Boolean, ? extends R> onSuccess, Fnc1<Boolean, ? extends R> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (Fnc2 & Serializable) (t1, t2) -> {
            Boolean value = this.test(t1, t2);
            return (value != false ? onSuccess : onFailure).apply(value);
        };
    }

    default public Prc2<T1, T2> afterApplyOn(Fnc0<Boolean> onSuccess, Fnc0<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onFailure.ignoring1(), onFailure.ignoring1());
    }

    default public <R> Fnc2<T1, T2, R> afterApplyOnTo(Fnc0<? extends R> onSuccess, Fnc0<? extends R> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOnTo(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Prc2<T1, T2> afterGetOn(Spc<Boolean> onSuccess, Spc<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Csc2<T1, T2> afterAcceptOnTo(Csc1<Boolean> onSuccess, Csc1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOnTo(onSuccess.toFunction(null), onFailure.toFunction(null)).toConsumer();
    }

    default public Prc2<T1, T2> afterAcceptOn(Csc1<Boolean> onSuccess, Csc1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.toFunction(null), onFailure.toFunction(null));
    }

    default public Prc2<T1, T2> afterRun(Rnc r) {
        return this.afterRunOn(r, r);
    }

    default public Prc2<T1, T2> afterTest(Prc1<Boolean> p) {
        return this.afterTestOn(p, p);
    }

    default public Prc2<T1, T2> afterTest(Prc0 p) {
        return this.afterTestOn(p, p);
    }

    default public Prc2<T1, T2> afterApply(Fnc1<Boolean, Boolean> f) {
        return this.afterApplyOn(f, f);
    }

    default public <R> Fnc2<T1, T2, R> afterApplyTo(Fnc1<Boolean, ? extends R> f) {
        return this.afterApplyOnTo(f, f);
    }

    default public Prc2<T1, T2> afterApply(Fnc0<Boolean> f) {
        return this.afterApplyOn(f, f);
    }

    default public <R> Fnc2<T1, T2, R> afterApplyTo(Fnc0<? extends R> f) {
        return this.afterApplyOnTo(f, f);
    }

    default public Prc2<T1, T2> afterGet(Spc<Boolean> s) {
        return this.afterGetOn(s, s);
    }

    default public Csc2<T1, T2> afterAcceptTo(Csc1<Boolean> c) {
        return this.afterAcceptOnTo(c, c);
    }

    default public Prc2<T1, T2> afterAccept(Csc1<Boolean> c) {
        return this.afterAcceptOn(c, c);
    }

    default public Pr2<T1, T2> beforeWrap(Pr1<? super Spc<Boolean>> wrap) {
        return Pr2.fromFunction(this.beforeWrapTo(wrap.toFunction()));
    }

    default public <W> Fn2<T1, T2, W> beforeWrapTo(Fn1<? super Spc<Boolean>, ? extends W> wrap) {
        return (Fn2 & Serializable) (t1, t2) -> wrap.apply(this.toSupplier(t1, t2));
    }

    default public Prc2<T1, T2> afterRunOnSuccess(Rnc r) {
        return this.afterRunOn(r, Rnc.empty());
    }

    default public Prc2<T1, T2> afterTestOnSuccess(Prc1<Boolean> p) {
        return this.afterTestOn(p, Prc1.empty());
    }

    default public Prc2<T1, T2> afterTestOnSuccess(Prc0 p) {
        return this.afterTestOn(p, Prc0.empty());
    }

    default public Prc2<T1, T2> afterApplyOnSuccess(Fnc1<Boolean, Boolean> f) {
        return this.afterApplyOn(f, Fnc1.empty());
    }

    default public <R> Fnc2<T1, T2, R> afterApplyOnSuccessTo(Fnc1<Boolean, ? extends R> f) {
        return this.afterApplyOnTo(f, Fnc1.empty());
    }

    default public Prc2<T1, T2> afterApplyOnSuccess(Fnc0<Boolean> f) {
        return this.afterApplyOn(f, Fnc0.empty());
    }

    default public <R> Fnc2<T1, T2, R> afterApplyOnSuccessTo(Fnc0<? extends R> f) {
        return this.afterApplyOnTo(f, Fnc0.empty());
    }

    default public Prc2<T1, T2> afterGetOnSuccess(Spc<Boolean> s) {
        return this.afterGetOn(s, Spc.empty());
    }

    default public Csc2<T1, T2> afterAcceptOnSuccessTo(Csc1<Boolean> c) {
        return this.afterAcceptOnTo(c, Csc1.empty());
    }

    default public Prc2<T1, T2> afterAcceptOnSuccess(Csc1<Boolean> c) {
        return this.afterAcceptOn(c, Csc1.empty());
    }

    default public Prc2<T1, T2> afterRunOnFailure(Rnc r) {
        return this.negated().afterRunOnSuccess(r);
    }

    default public Prc2<T1, T2> afterTestOnFailure(Prc1<Boolean> p) {
        return this.negated().afterTestOnSuccess(p);
    }

    default public Prc2<T1, T2> afterTestOnFailure(Prc0 p) {
        return this.negated().afterTestOnSuccess(p);
    }

    default public Prc2<T1, T2> afterApplyOnFailure(Fnc1<Boolean, Boolean> f) {
        return this.negated().afterApplyOnSuccess(f);
    }

    default public <R> Fnc2<T1, T2, R> afterApplyOnFailureTo(Fnc1<Boolean, ? extends R> f) {
        return this.negated().afterApplyOnSuccessTo(f);
    }

    default public Prc2<T1, T2> afterApplyOnFailure(Fnc0<Boolean> f) {
        return this.negated().afterApplyOnSuccess(f);
    }

    default public <R> Fnc2<T1, T2, R> afterApplyOnFailureTo(Fnc0<? extends R> f) {
        return this.negated().afterApplyOnSuccessTo(f);
    }

    default public Prc2<T1, T2> afterGetOnFailure(Spc<Boolean> s) {
        return this.negated().afterGetOnSuccess(s);
    }

    default public Csc2<T1, T2> afterAcceptOnFailureTo(Csc1<Boolean> c) {
        return this.negated().afterAcceptOnSuccessTo(c);
    }

    default public Prc2<T1, T2> afterAcceptOnFailure(Csc1<Boolean> c) {
        return this.negated().afterAcceptOnSuccess(c);
    }

    default public Prc2<T1, T2> beforeRun(Rnc r) {
        Objects.requireNonNull(r, "r is null");
        return (Prc2<Object, Object> & Serializable) (t1, t2) -> {
            r.run();
            return this.test(t1, t2);
        };
    }

    default public <B1> Prc1<B1> beforeApply(Fnc1<? super B1, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        return this.beforeApply1(f);
    }

    default public <B1> Prc1<B1> beforeApply1(Fnc1<? super B1, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Prc1 & Serializable) b1 -> this.tupled().test((Object) Tuple.narrow((Tuple2) ((Tuple2) f.apply(b1))));
    }

    default public <B1, B2> Prc2<B1, B2> beforeApply2(Fnc2<? super B1, ? super B2, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Prc2<Object, Object> & Serializable) (b1, b2) -> this.tupled().test((Object) Tuple.narrow((Tuple2) ((Tuple2) f.apply(b1, b2))));
    }

    default public <B1, B2, B3> Prc3<B1, B2, B3> beforeApply3(Fnc3<? super B1, ? super B2, ? super B3, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Prc3<Object, Object, Object> & Serializable) (b1, b2, b3) -> this.tupled().test((Object) Tuple.narrow((Tuple2) ((Tuple2) f.apply(b1, b2, b3))));
    }

    default public <B1, B2, B3, B4> Prc4<B1, B2, B3, B4> beforeApply4(Fnc4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Prc4<Object, Object, Object, Object> & Serializable) (b1, b2, b3, b4) -> this.tupled().test((Object) Tuple.narrow((Tuple2) ((Tuple2) f.apply(b1, b2, b3, b4))));
    }

    default public <B1, B2, B3, B4, B5> Prc5<B1, B2, B3, B4, B5> beforeApply5(Fnc5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Prc5<Object, Object, Object, Object, Object> & Serializable) (b1, b2, b3, b4, b5) -> this.tupled().test((Object) Tuple.narrow((Tuple2) ((Tuple2) f.apply(b1, b2, b3, b4, b5))));
    }

    default public <B1, B2, B3, B4, B5, B6> Prc6<B1, B2, B3, B4, B5, B6> beforeApply6(Fnc6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Prc6<Object, Object, Object, Object, Object, Object> & Serializable) (b1, b2, b3, b4, b5, b6) -> this.tupled().test((Object) Tuple.narrow((Tuple2) ((Tuple2) f.apply(b1, b2, b3, b4, b5, b6))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Prc7<B1, B2, B3, B4, B5, B6, B7> beforeApply7(Fnc7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Prc7<Object, Object, Object, Object, Object, Object, Object> & Serializable) (b1, b2, b3, b4, b5, b6, b7) -> this.tupled().test((Object) Tuple.narrow((Tuple2) ((Tuple2) f.apply(b1, b2, b3, b4, b5, b6, b7))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Prc8<B1, B2, B3, B4, B5, B6, B7, B8> beforeApply8(Fnc8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Prc8<Object, Object, Object, Object, Object, Object, Object, Object> & Serializable) (b1, b2, b3, b4, b5, b6, b7, b8) -> this.tupled().test((Object) Tuple.narrow((Tuple2) ((Tuple2) f.apply(b1, b2, b3, b4, b5, b6, b7, b8))));
    }

    default public Prc2<T1, T2> beforeTestOnSuccess(Prc0 p, Prc2<? super T1, ? super T2> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (Prc2<Object, Object> & Serializable) (t1, t2) -> p.test() != false ? this.test(t1, t2) : onFailure.test(t1, t2);
    }

    default public Prc2<T1, T2> beforeTestOnSuccess(Prc0 p, Spc<? extends Boolean> onFailure) {
        return this.beforeTestOnSuccess(p, Prc2.fromSupplier(onFailure));
    }

    default public Prc2<T1, T2> beforeTestOnSuccess(Prc0 p, Boolean onFailure) {
        return this.beforeTestOnSuccess(p, Prc2.value(onFailure));
    }

    default public Prc2<T1, T2> beforeTestOnSuccess(Prc0 p) {
        return this.beforeTestOnSuccess(p, Prc2.empty());
    }

    default public Prc2<T1, T2> beforeTestOnFailure(Prc0 p, Prc2<? super T1, ? super T2> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Prc2<T1, T2> beforeTestOnFailure(Prc0 p, Spc<? extends Boolean> onSuccess) {
        return this.beforeTestOnFailure(p, Prc2.fromSupplier(onSuccess));
    }

    default public Prc2<T1, T2> beforeTestOnFailure(Prc0 p, Boolean onSuccess) {
        return this.beforeTestOnFailure(p, Prc2.value(onSuccess));
    }

    default public Prc2<T1, T2> beforeTestOnFailure(Prc0 p) {
        return this.beforeTestOnFailure(p, Prc2.empty());
    }

    default public Prc0 beforeGet(Spc<? extends Tuple2<? extends T1, ? extends T2>> s) {
        Objects.requireNonNull(s, "s is null");
        return (Prc0 & Serializable) () -> this.tupled().test((Object) Tuple.narrow((Tuple2) ((Tuple2) s.get())));
    }

    default public Prc2<T2, T1> inverted() {
        return (Prc2<Object, Object> & Serializable) (t2, t1) -> this.test(t1, t2);
    }

    default public <S> Prc2<T1, T2> afterPassingThroughApplyOn(Fnc2<? super T1, ? super T2, ? extends S> onSuccess, Fnc2<? super T1, ? super T2, ? extends S> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (Prc2<Object, Object> & Serializable) (t1, t2) -> {
            Boolean result = this.test(t1, t2);
            Fnc2.narrow(result != false ? onSuccess : onFailure).apply(t1, t2);
            return result;
        };
    }

    default public <S> Fnc2<T1, T2, S> afterPassingThroughApplyOnTo(Fnc2<? super T1, ? super T2, ? extends S> onSuccess, Fnc2<? super T1, ? super T2, ? extends S> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (Fnc2 & Serializable) (t1, t2) -> Fnc2.narrow(this.test(t1, t2) ? onSuccess : onFailure).apply(t1, t2);
    }

    default public Prc2<T1, T2> afterPassingThroughAcceptOn(Csc2<? super T1, ? super T2> onSuccess, Csc2<? super T1, ? super T2> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (Prc2<Object, Object> & Serializable) (t1, t2) -> {
            Boolean result = this.test(t1, t2);
            Csc2.narrow(result != false ? onSuccess : onFailure).accept(t1, t2);
            return result;
        };
    }

    default public Csc2<T1, T2> afterPassingThroughAcceptOnTo(Csc2<? super T1, ? super T2> onSuccess, Csc2<? super T1, ? super T2> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2) -> Csc2.narrow(this.test(t1, t2) ? onSuccess : onFailure).accept(t1, t2);
    }

    default public Prc2<T1, T2> afterPassingThroughTestOn(Prc2<? super T1, ? super T2> onSuccess, Prc2<? super T1, ? super T2> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (Prc2<Object, Object> & Serializable) (t1, t2) -> Prc2.narrow(this.test(t1, t2) ? onSuccess : onFailure).test(t1, t2);
    }

    default public <S> Prc2<T1, T2> afterPassingThroughApply(Fnc2<? super T1, ? super T2, ? extends S> f) {
        return this.afterPassingThroughApplyOn(f, f);
    }

    default public <S> Fnc2<T1, T2, S> afterPassingThroughApplyTo(Fnc2<? super T1, ? super T2, ? extends S> f) {
        return this.afterPassingThroughApplyOnTo(f, f);
    }

    default public Prc2<T1, T2> afterPassingThroughAccept(Csc2<? super T1, ? super T2> c) {
        return this.afterPassingThroughAcceptOn(c, c);
    }

    default public Csc2<T1, T2> afterPassingThroughAcceptTo(Csc2<? super T1, ? super T2> c) {
        return this.afterPassingThroughAcceptOnTo(c, c);
    }

    default public Prc2<T1, T2> afterPassingThroughTest(Prc2<? super T1, ? super T2> p) {
        return this.afterPassingThroughTestOn(p, p);
    }

    default public <S> Prc2<T1, T2> afterSuccessPassingThroughApply(Fnc2<? super T1, ? super T2, ? extends S> onSuccess) {
        return this.afterPassingThroughApplyOn(onSuccess, Fnc2.empty());
    }

    default public <S> Fnc2<T1, T2, S> afterSuccessPassingThroughApplyTo(Fnc2<? super T1, ? super T2, ? extends S> onSuccess) {
        return this.afterPassingThroughApplyOnTo(onSuccess, Fnc2.empty());
    }

    default public Prc2<T1, T2> afterSuccessPassingThroughAccept(Csc2<? super T1, ? super T2> onSuccess) {
        return this.afterPassingThroughAcceptOn(onSuccess, Csc2.empty());
    }

    default public Csc2<T1, T2> afterSuccessPassingThroughAcceptTo(Csc2<? super T1, ? super T2> onSuccess) {
        return this.afterPassingThroughAcceptOnTo(onSuccess, Csc2.empty());
    }

    default public Prc2<T1, T2> afterSuccessPassingThroughTest(Prc2<? super T1, ? super T2> onSuccess) {
        return this.afterPassingThroughTestOn(onSuccess, Prc2.empty());
    }

    default public <S> Prc2<T1, T2> afterFailurePassingThroughApply(Fnc2<? super T1, ? super T2, ? extends S> onFailure) {
        return this.negated().afterSuccessPassingThroughApply(onFailure);
    }

    default public <S> Fnc2<T1, T2, S> afterFailurePassingThroughApplyTo(Fnc2<? super T1, ? super T2, ? extends S> onFailure) {
        return this.negated().afterSuccessPassingThroughApplyTo(onFailure);
    }

    default public Prc2<T1, T2> afterFailurePassingThroughAccept(Csc2<? super T1, ? super T2> onFailure) {
        return this.negated().afterSuccessPassingThroughAccept(onFailure);
    }

    default public Csc2<T1, T2> afterFailurePassingThroughAcceptTo(Csc2<? super T1, ? super T2> onFailure) {
        return this.negated().afterSuccessPassingThroughAcceptTo(onFailure);
    }

    default public Prc2<T1, T2> afterFailurePassingThroughTest(Prc2<? super T1, ? super T2> onFailure) {
        return this.negated().afterSuccessPassingThroughTest(onFailure);
    }

    default public <R> Prc2<T1, T2> beforePassingThroughApply(Fnc2<? super T1, ? super T2, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (Prc2<Object, Object> & Serializable) (t1, t2) -> {
            f.apply(t1, t2);
            return this.test(t1, t2);
        };
    }

    default public Prc2<T1, T2> beforePassingThroughTest(Prc2<? super T1, ? super T2> p) {
        Objects.requireNonNull(p, "p is null");
        return (Prc2<Object, Object> & Serializable) (t1, t2) -> {
            p.test(t1, t2);
            return this.test(t1, t2);
        };
    }

    default public Prc2<T1, T2> beforePassingThroughAccept(Csc2<? super T1, ? super T2> c) {
        Objects.requireNonNull(c, "c is null");
        return (Prc2<Object, Object> & Serializable) (t1, t2) -> {
            c.accept(t1, t2);
            return this.test(t1, t2);
        };
    }

    default public Prc2<T1, T2> beforeSuccessPassingThroughTest(Prc2<? super T1, ? super T2> p, Prc2<? super T1, ? super T2> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (Prc2<Object, Object> & Serializable) (t1, t2) -> p.test(t1, t2) ? this.test(t1, t2) : onFailure.test(t1, t2);
    }

    default public Prc2<T1, T2> beforeSuccessPassingThroughTest(Prc2<? super T1, ? super T2> p, Spc<? extends Boolean> onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Prc2.fromSupplier(onFailure));
    }

    default public Prc2<T1, T2> beforeSuccessPassingThroughTest(Prc2<? super T1, ? super T2> p, Boolean onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Prc2.value(onFailure));
    }

    default public Prc2<T1, T2> beforeSuccessPassingThroughTest(Prc2<? super T1, ? super T2> p) {
        return this.beforeSuccessPassingThroughTest(p, Prc2.empty());
    }

    default public Prc2<T1, T2> beforeFailurePassingThroughTest(Prc2<? super T1, ? super T2> p, Prc2<? super T1, ? super T2> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Prc2<T1, T2> beforeFailurePassingThroughTest(Prc2<? super T1, ? super T2> p, Spc<? extends Boolean> onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Prc2.fromSupplier(onSuccess));
    }

    default public Prc2<T1, T2> beforeFailurePassingThroughTest(Prc2<? super T1, ? super T2> p, Boolean onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Prc2.value(onSuccess));
    }

    default public Prc2<T1, T2> beforeFailurePassingThroughTest(Prc2<? super T1, ? super T2> p) {
        return this.beforeFailurePassingThroughTest(p, Prc2.empty());
    }

    default public Prc1<Tuple2<T1, T2>> tupled() {
        return (Prc1 & Serializable) tuple -> this.test(tuple._1(), tuple._2());
    }

    default public Fnc1<T1, Prc1<T2>> currying() {
        return (Fnc1 & Serializable) t1 -> (Prc1 & Serializable) t2 -> this.test(t1, t2);
    }

    default public Pr2<T1, T2> unchecked() {
        return (Pr2<Object, Object> & Serializable) (t1, t2) -> {
            try {
                return this.test(t1, t2);
            }
            catch (Throwable t) {
                return (Boolean) SneakyThrow.sneakyThrow(t);
            }

        };
    }

    default public Prc2<T1, T2> negated() {
        return (Prc2<Object, Object> & Serializable) (t1, t2) -> !this.test(t1, t2);
    }

    default public Prc2<T1, T2> and(Prc2<? super T1, ? super T2> p) {
        return (Prc2<Object, Object> & Serializable) (t1, t2) -> this.test(t1, t2) && p.test(t1, t2);
    }

    default public Prc2<T1, T2> or(Prc2<? super T1, ? super T2> p) {
        return (Prc2<Object, Object> & Serializable) (t1, t2) -> this.test(t1, t2) || p.test(t1, t2);
    }

    default public Prc2<T1, T2> and(Prc0 p) {
        return (Prc2<Object, Object> & Serializable) (t1, t2) -> this.test(t1, t2) && p.test() != false;
    }

    default public Prc2<T1, T2> or(Prc0 p) {
        return (Prc2<Object, Object> & Serializable) (t1, t2) -> this.test(t1, t2) || p.test() != false;
    }

    default public <I1> Prc3<I1, T1, T2> ignoring1Lt() {
        return (Prc3<Object, Object, Object> & Serializable) (i1, t1, t2) -> this.test(t1, t2);
    }

    default public <I1> Prc3<T1, T2, I1> ignoring1Rt() {
        return (Prc3<Object, Object, Object> & Serializable) (t1, t2, i1) -> this.test(t1, t2);
    }

    default public <I1, I2> Prc4<I1, I2, T1, T2> ignoring2Lt() {
        return (Prc4<Object, Object, Object, Object> & Serializable) (i1, i2, t1, t2) -> this.test(t1, t2);
    }

    default public <I1, I2> Prc4<T1, T2, I1, I2> ignoring2Rt() {
        return (Prc4<Object, Object, Object, Object> & Serializable) (t1, t2, i1, i2) -> this.test(t1, t2);
    }

    default public <I1, I2, I3> Prc5<I1, I2, I3, T1, T2> ignoring3Lt() {
        return (Prc5<Object, Object, Object, Object, Object> & Serializable) (i1, i2, i3, t1, t2) -> this.test(t1, t2);
    }

    default public <I1, I2, I3> Prc5<T1, T2, I1, I2, I3> ignoring3Rt() {
        return (Prc5<Object, Object, Object, Object, Object> & Serializable) (t1, t2, i1, i2, i3) -> this.test(t1, t2);
    }

    default public <I1, I2, I3, I4> Prc6<I1, I2, I3, I4, T1, T2> ignoring4Lt() {
        return (Prc6<Object, Object, Object, Object, Object, Object> & Serializable) (i1, i2, i3, i4, t1, t2) -> this.test(t1, t2);
    }

    default public <I1, I2, I3, I4> Prc6<T1, T2, I1, I2, I3, I4> ignoring4Rt() {
        return (Prc6<Object, Object, Object, Object, Object, Object> & Serializable) (t1, t2, i1, i2, i3, i4) -> this.test(t1, t2);
    }

    default public <I1, I2, I3, I4, I5> Prc7<I1, I2, I3, I4, I5, T1, T2> ignoring5Lt() {
        return (Prc7<Object, Object, Object, Object, Object, Object, Object> & Serializable) (i1, i2, i3, i4, i5, t1, t2) -> this.test(t1, t2);
    }

    default public <I1, I2, I3, I4, I5> Prc7<T1, T2, I1, I2, I3, I4, I5> ignoring5Rt() {
        return (Prc7<Object, Object, Object, Object, Object, Object, Object> & Serializable) (t1, t2, i1, i2, i3, i4, i5) -> this.test(t1, t2);
    }

    default public <I1, I2, I3, I4, I5, I6> Prc8<I1, I2, I3, I4, I5, I6, T1, T2> ignoring6Lt() {
        return (Prc8<Object, Object, Object, Object, Object, Object, Object, Object> & Serializable) (i1, i2, i3, i4, i5, i6, t1, t2) -> this.test(t1, t2);
    }

    default public <I1, I2, I3, I4, I5, I6> Prc8<T1, T2, I1, I2, I3, I4, I5, I6> ignoring6Rt() {
        return (Prc8<Object, Object, Object, Object, Object, Object, Object, Object> & Serializable) (t1, t2, i1, i2, i3, i4, i5, i6) -> this.test(t1, t2);
    }

    default public Prc2<T1, T2> memoized() {
        return (arg_0, arg_1) -> ((CheckedFunction2) super.memoized()).apply(arg_0, arg_1);
    }

    default public Pr2<T1, T2> recover(Fn1<? super Throwable, ? extends Pr2<? super T1, ? super T2>> recover) {
        Objects.requireNonNull(recover, "recover is null");
        return (Pr2<Object, Object> & Serializable) (t1, t2) -> {
            try {
                return this.test(t1, t2);
            }
            catch (Throwable throwable) {
                Pr2 pred = (Pr2) recover.apply(throwable);
                Objects.requireNonNull(pred, () -> "recover return null for " + throwable.getClass() + ": " + throwable.getMessage());
                return pred.test(t1, t2);
            }

        };
    }

}

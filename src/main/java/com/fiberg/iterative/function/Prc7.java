package com.fiberg.iterative.function;

import com.fiberg.iterative.core.IterativeInternals;
import com.fiberg.iterative.function.Csc1;
import com.fiberg.iterative.function.Csc7;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fn7;
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
import com.fiberg.iterative.function.Pr7;
import com.fiberg.iterative.function.Prc0;
import com.fiberg.iterative.function.Prc1;
import com.fiberg.iterative.function.Prc2;
import com.fiberg.iterative.function.Prc3;
import com.fiberg.iterative.function.Prc4;
import com.fiberg.iterative.function.Prc5;
import com.fiberg.iterative.function.Prc6;
import com.fiberg.iterative.function.Prc8;
import com.fiberg.iterative.function.Predicates;
import com.fiberg.iterative.function.Rnc;
import com.fiberg.iterative.function.SneakyThrow;
import com.fiberg.iterative.function.Spc;
import io.vavr.CheckedFunction7;
import io.vavr.Tuple;
import io.vavr.Tuple7;
import java.io.Serializable;
import java.util.Objects;

@FunctionalInterface
public interface Prc7<T1, T2, T3, T4, T5, T6, T7> extends CheckedFunction7<T1, T2, T3, T4, T5, T6, T7, Boolean> {

    default public Boolean apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) throws Throwable {
        return this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc7<T1, T2, T3, T4, T5, T6, T7> narrow(Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        @SuppressWarnings("unchecked")
        final Prc7<T1, T2, T3, T4, T5, T6, T7> prc = (Prc7<T1, T2, T3, T4, T5, T6, T7>) p;
        return prc;
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc7<T1, T2, T3, T4, T5, T6, T7> empty() {
        return IterativeInternals::none;
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc7<T1, T2, T3, T4, T5, T6, T7> value(Boolean b) {
        return (t1, t2, t3, t4, t5, t6, t7) -> b;
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc7<T1, T2, T3, T4, T5, T6, T7> of(Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        return Prc7.narrow(p);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc7<T1, T2, T3, T4, T5, T6, T7> of1(Prc1<? super T1> f) {
        return Prc7.<T1, T2, T3, T4, T5, T6, T7>narrow(f.ignoring6Rt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc7<T1, T2, T3, T4, T5, T6, T7> of2(Prc1<? super T2> f) {
        return Prc7.<T1, T2, T3, T4, T5, T6, T7>narrow(f.ignoring5Rt().ignoring1Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc7<T1, T2, T3, T4, T5, T6, T7> of3(Prc1<? super T3> f) {
        return Prc7.<T1, T2, T3, T4, T5, T6, T7>narrow(f.ignoring4Rt().ignoring2Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc7<T1, T2, T3, T4, T5, T6, T7> of4(Prc1<? super T4> f) {
        return Prc7.<T1, T2, T3, T4, T5, T6, T7>narrow(f.ignoring3Rt().ignoring3Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc7<T1, T2, T3, T4, T5, T6, T7> of5(Prc1<? super T5> f) {
        return Prc7.<T1, T2, T3, T4, T5, T6, T7>narrow(f.ignoring2Rt().ignoring4Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc7<T1, T2, T3, T4, T5, T6, T7> of6(Prc1<? super T6> f) {
        return Prc7.<T1, T2, T3, T4, T5, T6, T7>narrow(f.ignoring1Rt().ignoring5Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc7<T1, T2, T3, T4, T5, T6, T7> of7(Prc1<? super T7> f) {
        return Prc7.<T1, T2, T3, T4, T5, T6, T7>narrow(f.ignoring6Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc7<T1, T2, T3, T4, T5, T6, T7> fromFunction(Fnc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, Boolean> f) {
        return (t1, t2, t3, t4, t5, t6, t7) -> f.apply(t1, t2, t3, t4, t5, t6, t7);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc7<T1, T2, T3, T4, T5, T6, T7> fromSupplier(Spc<? extends Boolean> s) {
        return Prc7.fromFunction(Spc.narrow(s).toFunction().ignoring7());
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc7<T1, T2, T3, T4, T5, T6, T7> negate(Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        return Prc7.<T1, T2, T3, T4, T5, T6, T7>narrow(p.negated());
    }

    @SafeVarargs
    public static <T1, T2, T3, T4, T5, T6, T7> Prc7<T1, T2, T3, T4, T5, T6, T7> and(Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> ... ps) {
        Objects.requireNonNull(ps, "ps is null");
        return Predicates.and(ps);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc7<T1, T2, T3, T4, T5, T6, T7> and(Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, Prc0 ... ps) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(ps, "ps is null");
        return ps.length == 0 ? Prc7.narrow(p) : Prc7.narrow(p).and(Predicates.and(ps));
    }

    @SafeVarargs
    public static <T1, T2, T3, T4, T5, T6, T7> Prc7<T1, T2, T3, T4, T5, T6, T7> or(Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> ... ps) {
        Objects.requireNonNull(ps, "ps is null");
        return Predicates.or(ps);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc7<T1, T2, T3, T4, T5, T6, T7> or(Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, Prc0 ... ps) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(ps, "ps is null");
        return ps.length == 0 ? Prc7.narrow(p) : Prc7.narrow(p).or(Predicates.or(ps));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> tuple(Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        return Prc7.<T1, T2, T3, T4, T5, T6, T7>of(p).tupled();
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc7<T1, T2, T3, T4, T5, T6, T7> detuple(Prc1<? super Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> p) {
        return (t1, t2, t3, t4, t5, t6, t7) -> p.test(Tuple.of(t1, t2, t3, t4, t5, t6, t7));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc7<T1, T2, T3, T4, T5, T6, T7> check(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        Objects.requireNonNull(p, "p is null");
        return Pr7.narrow(p).checked();
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc7<T1, T2, T3, T4, T5, T6, T7> ignore(Prc0 p) {
        return p.ignoring7();
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc7<T1, T2, T3, T4, T5, T6, T7> ignore6Rt(Prc1<? super T1> p) {
        return Prc1.<T1>narrow(p).ignoring6Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc7<T1, T2, T3, T4, T5, T6, T7> ignore6Lt(Prc1<? super T7> p) {
        return Prc1.<T7>narrow(p).ignoring6Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc7<T1, T2, T3, T4, T5, T6, T7> ignore5Rt(Prc2<? super T1, ? super T2> p) {
        return Prc2.<T1, T2>narrow(p).ignoring5Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc7<T1, T2, T3, T4, T5, T6, T7> ignore5Lt(Prc2<? super T6, ? super T7> p) {
        return Prc2.<T6, T7>narrow(p).ignoring5Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc7<T1, T2, T3, T4, T5, T6, T7> ignore4Rt(Prc3<? super T1, ? super T2, ? super T3> p) {
        return Prc3.<T1, T2, T3>narrow(p).ignoring4Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc7<T1, T2, T3, T4, T5, T6, T7> ignore4Lt(Prc3<? super T5, ? super T6, ? super T7> p) {
        return Prc3.<T5, T6, T7>narrow(p).ignoring4Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc7<T1, T2, T3, T4, T5, T6, T7> ignore3Rt(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        return Prc4.<T1, T2, T3, T4>narrow(p).ignoring3Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc7<T1, T2, T3, T4, T5, T6, T7> ignore3Lt(Prc4<? super T4, ? super T5, ? super T6, ? super T7> p) {
        return Prc4.<T4, T5, T6, T7>narrow(p).ignoring3Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc7<T1, T2, T3, T4, T5, T6, T7> ignore2Rt(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return Prc5.<T1, T2, T3, T4, T5>narrow(p).ignoring2Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc7<T1, T2, T3, T4, T5, T6, T7> ignore2Lt(Prc5<? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        return Prc5.<T3, T4, T5, T6, T7>narrow(p).ignoring2Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc7<T1, T2, T3, T4, T5, T6, T7> ignore1Rt(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        return Prc6.<T1, T2, T3, T4, T5, T6>narrow(p).ignoring1Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc7<T1, T2, T3, T4, T5, T6, T7> ignore1Lt(Prc6<? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        return Prc6.<T2, T3, T4, T5, T6, T7>narrow(p).ignoring1Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc7<T1, T2, T3, T4, T5, T6, T7> passRt(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, T8 t8) {
        return Prc7.narrow(p.testRt(t8));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc7<T2, T3, T4, T5, T6, T7, T8> passLt(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, T1 t1) {
        return Prc7.narrow(p.testLt(t1));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc7<T7, T6, T5, T4, T3, T2, T1> invert(Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        return Prc7.<T1, T2, T3, T4, T5, T6, T7>narrow(p).inverted();
    }

    public boolean test(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) throws Throwable;

    default public Prc6<T2, T3, T4, T5, T6, T7> testLt(T1 t1) {
        return (t2, t3, t4, t5, t6, t7) -> this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Prc5<T3, T4, T5, T6, T7> testLt(T1 t1, T2 t2) {
        return (t3, t4, t5, t6, t7) -> this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Prc4<T4, T5, T6, T7> testLt(T1 t1, T2 t2, T3 t3) {
        return (t4, t5, t6, t7) -> this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Prc3<T5, T6, T7> testLt(T1 t1, T2 t2, T3 t3, T4 t4) {
        return (t5, t6, t7) -> this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Prc2<T6, T7> testLt(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return (t6, t7) -> this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Prc1<T7> testLt(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return t7 -> this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> testRt(T7 t7) {
        return (t1, t2, t3, t4, t5, t6) -> this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Prc5<T1, T2, T3, T4, T5> testRt(T6 t6, T7 t7) {
        return (t1, t2, t3, t4, t5) -> this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Prc4<T1, T2, T3, T4> testRt(T5 t5, T6 t6, T7 t7) {
        return (t1, t2, t3, t4) -> this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Prc3<T1, T2, T3> testRt(T4 t4, T5 t5, T6 t6, T7 t7) {
        return (t1, t2, t3) -> this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Prc2<T1, T2> testRt(T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return (t1, t2) -> this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Prc1<T1> testRt(T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return t1 -> this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Fnc7<T1, T2, T3, T4, T5, T6, T7, Boolean> toFunction() {
        return (t1, t2, t3, t4, t5, t6, t7) -> this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Csc7<T1, T2, T3, T4, T5, T6, T7> toConsumer() {
        return (t1, t2, t3, t4, t5, t6, t7) -> this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Prc0 toPredicate(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return () -> this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Spc<Boolean> toSupplier(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return this.toPredicate(t1, t2, t3, t4, t5, t6, t7).toSupplier();
    }

    default public Rnc toRunnable(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return this.toPredicate(t1, t2, t3, t4, t5, t6, t7).toRunnable();
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> afterRunOn(Rnc onSuccess, Rnc onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> {
            Boolean value = this.test(t1, t2, t3, t4, t5, t6, t7);
            (value != false ? onSuccess : onFailure).run();
            return value;
        };
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> afterTestOn(Prc1<Boolean> onSuccess, Prc1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.toFunction(), onFailure.toFunction());
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> afterTestOn(Prc0 onSuccess, Prc0 onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterTestOn(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> afterApplyOn(Fnc1<Boolean, Boolean> onSuccess, Fnc1<Boolean, Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return Prc7.fromFunction(this.afterApplyOnTo(onSuccess, onFailure));
    }

    default public <R> Fnc7<T1, T2, T3, T4, T5, T6, T7, R> afterApplyOnTo(Fnc1<Boolean, ? extends R> onSuccess, Fnc1<Boolean, ? extends R> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> {
            Boolean value = this.test(t1, t2, t3, t4, t5, t6, t7);
            return (value != false ? onSuccess : onFailure).apply(value);
        };
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> afterApplyOn(Fnc0<Boolean> onSuccess, Fnc0<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onFailure.ignoring1(), onFailure.ignoring1());
    }

    default public <R> Fnc7<T1, T2, T3, T4, T5, T6, T7, R> afterApplyOnTo(Fnc0<? extends R> onSuccess, Fnc0<? extends R> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOnTo(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> afterGetOn(Spc<Boolean> onSuccess, Spc<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Csc7<T1, T2, T3, T4, T5, T6, T7> afterAcceptOnTo(Csc1<Boolean> onSuccess, Csc1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOnTo(onSuccess.toFunction(null), onFailure.toFunction(null)).toConsumer();
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> afterAcceptOn(Csc1<Boolean> onSuccess, Csc1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.toFunction(null), onFailure.toFunction(null));
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> afterRun(Rnc r) {
        return this.afterRunOn(r, r);
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> afterTest(Prc1<Boolean> p) {
        return this.afterTestOn(p, p);
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> afterTest(Prc0 p) {
        return this.afterTestOn(p, p);
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> afterApply(Fnc1<Boolean, Boolean> f) {
        return this.afterApplyOn(f, f);
    }

    default public <R> Fnc7<T1, T2, T3, T4, T5, T6, T7, R> afterApplyTo(Fnc1<Boolean, ? extends R> f) {
        return this.afterApplyOnTo(f, f);
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> afterApply(Fnc0<Boolean> f) {
        return this.afterApplyOn(f, f);
    }

    default public <R> Fnc7<T1, T2, T3, T4, T5, T6, T7, R> afterApplyTo(Fnc0<? extends R> f) {
        return this.afterApplyOnTo(f, f);
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> afterGet(Spc<Boolean> s) {
        return this.afterGetOn(s, s);
    }

    default public Csc7<T1, T2, T3, T4, T5, T6, T7> afterAcceptTo(Csc1<Boolean> c) {
        return this.afterAcceptOnTo(c, c);
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> afterAccept(Csc1<Boolean> c) {
        return this.afterAcceptOn(c, c);
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> beforeWrap(Pr1<? super Spc<Boolean>> wrap) {
        return Pr7.fromFunction(this.beforeWrapTo(wrap.toFunction()));
    }

    default public <W> Fn7<T1, T2, T3, T4, T5, T6, T7, W> beforeWrapTo(Fn1<? super Spc<Boolean>, ? extends W> wrap) {
        return (t1, t2, t3, t4, t5, t6, t7) -> wrap.apply(this.toSupplier(t1, t2, t3, t4, t5, t6, t7));
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> afterRunOnSuccess(Rnc r) {
        return this.afterRunOn(r, Rnc.empty());
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> afterTestOnSuccess(Prc1<Boolean> p) {
        return this.afterTestOn(p, Prc1.empty());
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> afterTestOnSuccess(Prc0 p) {
        return this.afterTestOn(p, Prc0.empty());
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> afterApplyOnSuccess(Fnc1<Boolean, Boolean> f) {
        return this.afterApplyOn(f, Fnc1.empty());
    }

    default public <R> Fnc7<T1, T2, T3, T4, T5, T6, T7, R> afterApplyOnSuccessTo(Fnc1<Boolean, ? extends R> f) {
        return this.afterApplyOnTo(f, Fnc1.empty());
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> afterApplyOnSuccess(Fnc0<Boolean> f) {
        return this.afterApplyOn(f, Fnc0.empty());
    }

    default public <R> Fnc7<T1, T2, T3, T4, T5, T6, T7, R> afterApplyOnSuccessTo(Fnc0<? extends R> f) {
        return this.afterApplyOnTo(f, Fnc0.empty());
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> afterGetOnSuccess(Spc<Boolean> s) {
        return this.afterGetOn(s, Spc.empty());
    }

    default public Csc7<T1, T2, T3, T4, T5, T6, T7> afterAcceptOnSuccessTo(Csc1<Boolean> c) {
        return this.afterAcceptOnTo(c, Csc1.empty());
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> afterAcceptOnSuccess(Csc1<Boolean> c) {
        return this.afterAcceptOn(c, Csc1.empty());
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> afterRunOnFailure(Rnc r) {
        return this.negated().afterRunOnSuccess(r);
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> afterTestOnFailure(Prc1<Boolean> p) {
        return this.negated().afterTestOnSuccess(p);
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> afterTestOnFailure(Prc0 p) {
        return this.negated().afterTestOnSuccess(p);
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> afterApplyOnFailure(Fnc1<Boolean, Boolean> f) {
        return this.negated().afterApplyOnSuccess(f);
    }

    default public <R> Fnc7<T1, T2, T3, T4, T5, T6, T7, R> afterApplyOnFailureTo(Fnc1<Boolean, ? extends R> f) {
        return this.negated().afterApplyOnSuccessTo(f);
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> afterApplyOnFailure(Fnc0<Boolean> f) {
        return this.negated().afterApplyOnSuccess(f);
    }

    default public <R> Fnc7<T1, T2, T3, T4, T5, T6, T7, R> afterApplyOnFailureTo(Fnc0<? extends R> f) {
        return this.negated().afterApplyOnSuccessTo(f);
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> afterGetOnFailure(Spc<Boolean> s) {
        return this.negated().afterGetOnSuccess(s);
    }

    default public Csc7<T1, T2, T3, T4, T5, T6, T7> afterAcceptOnFailureTo(Csc1<Boolean> c) {
        return this.negated().afterAcceptOnSuccessTo(c);
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> afterAcceptOnFailure(Csc1<Boolean> c) {
        return this.negated().afterAcceptOnSuccess(c);
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> beforeRun(Rnc r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> {
            r.run();
            return this.test(t1, t2, t3, t4, t5, t6, t7);
        };
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Prc7<B1, B2, B3, B4, B5, B6, B7> beforeApply(Fnc7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> f) {
        return this.beforeApply7(f);
    }

    default public <B1> Prc1<B1> beforeApply1(Fnc1<? super B1, ? extends Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> f) {
        Objects.requireNonNull(f, "f is null");
        return b1 -> this.tupled().test(Tuple.narrow((f.apply(b1))));
    }

    default public <B1, B2> Prc2<B1, B2> beforeApply2(Fnc2<? super B1, ? super B2, ? extends Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2))));
    }

    default public <B1, B2, B3> Prc3<B1, B2, B3> beforeApply3(Fnc3<? super B1, ? super B2, ? super B3, ? extends Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3))));
    }

    default public <B1, B2, B3, B4> Prc4<B1, B2, B3, B4> beforeApply4(Fnc4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4))));
    }

    default public <B1, B2, B3, B4, B5> Prc5<B1, B2, B3, B4, B5> beforeApply5(Fnc5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5))));
    }

    default public <B1, B2, B3, B4, B5, B6> Prc6<B1, B2, B3, B4, B5, B6> beforeApply6(Fnc6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Prc7<B1, B2, B3, B4, B5, B6, B7> beforeApply7(Fnc7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Prc8<B1, B2, B3, B4, B5, B6, B7, B8> beforeApply8(Fnc8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7, b8) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7, b8))));
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> beforeTestOnSuccess(Prc0 p, Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> p.test() != false ? this.test(t1, t2, t3, t4, t5, t6, t7) : onFailure.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> beforeTestOnSuccess(Prc0 p, Spc<? extends Boolean> onFailure) {
        return this.beforeTestOnSuccess(p, Prc7.fromSupplier(onFailure));
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> beforeTestOnSuccess(Prc0 p, Boolean onFailure) {
        return this.beforeTestOnSuccess(p, Prc7.value(onFailure));
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> beforeTestOnSuccess(Prc0 p) {
        return this.beforeTestOnSuccess(p, Prc7.empty());
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> beforeTestOnFailure(Prc0 p, Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> beforeTestOnFailure(Prc0 p, Spc<? extends Boolean> onSuccess) {
        return this.beforeTestOnFailure(p, Prc7.fromSupplier(onSuccess));
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> beforeTestOnFailure(Prc0 p, Boolean onSuccess) {
        return this.beforeTestOnFailure(p, Prc7.value(onSuccess));
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> beforeTestOnFailure(Prc0 p) {
        return this.beforeTestOnFailure(p, Prc7.empty());
    }

    default public Prc0 beforeGet(Spc<? extends Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> s) {
        Objects.requireNonNull(s, "s is null");
        return () -> this.tupled().test(Tuple.narrow((s.get())));
    }

    default public Prc7<T7, T6, T5, T4, T3, T2, T1> inverted() {
        return (t7, t6, t5, t4, t3, t2, t1) -> this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public <S> Prc7<T1, T2, T3, T4, T5, T6, T7> afterPassingThroughApplyOn(Fnc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends S> onSuccess, Fnc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends S> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> {
            Boolean result = this.test(t1, t2, t3, t4, t5, t6, t7);
            Fnc7.narrow(result != false ? onSuccess : onFailure).apply(t1, t2, t3, t4, t5, t6, t7);
            return result;
        };
    }

    default public <S> Fnc7<T1, T2, T3, T4, T5, T6, T7, S> afterPassingThroughApplyOnTo(Fnc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends S> onSuccess, Fnc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends S> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> Fnc7.narrow(this.test(t1, t2, t3, t4, t5, t6, t7) ? onSuccess : onFailure).apply(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> afterPassingThroughAcceptOn(Csc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> onSuccess, Csc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> {
            Boolean result = this.test(t1, t2, t3, t4, t5, t6, t7);
            Csc7.narrow(result != false ? onSuccess : onFailure).accept(t1, t2, t3, t4, t5, t6, t7);
            return result;
        };
    }

    default public Csc7<T1, T2, T3, T4, T5, T6, T7> afterPassingThroughAcceptOnTo(Csc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> onSuccess, Csc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> Csc7.narrow(this.test(t1, t2, t3, t4, t5, t6, t7) ? onSuccess : onFailure).accept(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> afterPassingThroughTestOn(Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> onSuccess, Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> Prc7.narrow(this.test(t1, t2, t3, t4, t5, t6, t7) ? onSuccess : onFailure).test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public <S> Prc7<T1, T2, T3, T4, T5, T6, T7> afterPassingThroughApply(Fnc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends S> f) {
        return this.afterPassingThroughApplyOn(f, f);
    }

    default public <S> Fnc7<T1, T2, T3, T4, T5, T6, T7, S> afterPassingThroughApplyTo(Fnc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends S> f) {
        return this.afterPassingThroughApplyOnTo(f, f);
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> afterPassingThroughAccept(Csc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c) {
        return this.afterPassingThroughAcceptOn(c, c);
    }

    default public Csc7<T1, T2, T3, T4, T5, T6, T7> afterPassingThroughAcceptTo(Csc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c) {
        return this.afterPassingThroughAcceptOnTo(c, c);
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> afterPassingThroughTest(Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        return this.afterPassingThroughTestOn(p, p);
    }

    default public <S> Prc7<T1, T2, T3, T4, T5, T6, T7> afterSuccessPassingThroughApply(Fnc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends S> onSuccess) {
        return this.afterPassingThroughApplyOn(onSuccess, Fnc7.empty());
    }

    default public <S> Fnc7<T1, T2, T3, T4, T5, T6, T7, S> afterSuccessPassingThroughApplyTo(Fnc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends S> onSuccess) {
        return this.afterPassingThroughApplyOnTo(onSuccess, Fnc7.empty());
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> afterSuccessPassingThroughAccept(Csc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> onSuccess) {
        return this.afterPassingThroughAcceptOn(onSuccess, Csc7.empty());
    }

    default public Csc7<T1, T2, T3, T4, T5, T6, T7> afterSuccessPassingThroughAcceptTo(Csc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> onSuccess) {
        return this.afterPassingThroughAcceptOnTo(onSuccess, Csc7.empty());
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> afterSuccessPassingThroughTest(Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> onSuccess) {
        return this.afterPassingThroughTestOn(onSuccess, Prc7.empty());
    }

    default public <S> Prc7<T1, T2, T3, T4, T5, T6, T7> afterFailurePassingThroughApply(Fnc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends S> onFailure) {
        return this.negated().afterSuccessPassingThroughApply(onFailure);
    }

    default public <S> Fnc7<T1, T2, T3, T4, T5, T6, T7, S> afterFailurePassingThroughApplyTo(Fnc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends S> onFailure) {
        return this.negated().afterSuccessPassingThroughApplyTo(onFailure);
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> afterFailurePassingThroughAccept(Csc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> onFailure) {
        return this.negated().afterSuccessPassingThroughAccept(onFailure);
    }

    default public Csc7<T1, T2, T3, T4, T5, T6, T7> afterFailurePassingThroughAcceptTo(Csc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> onFailure) {
        return this.negated().afterSuccessPassingThroughAcceptTo(onFailure);
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> afterFailurePassingThroughTest(Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> onFailure) {
        return this.negated().afterSuccessPassingThroughTest(onFailure);
    }

    default public <R> Prc7<T1, T2, T3, T4, T5, T6, T7> beforePassingThroughApply(Fnc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> {
            f.apply(t1, t2, t3, t4, t5, t6, t7);
            return this.test(t1, t2, t3, t4, t5, t6, t7);
        };
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> beforePassingThroughTest(Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> {
            p.test(t1, t2, t3, t4, t5, t6, t7);
            return this.test(t1, t2, t3, t4, t5, t6, t7);
        };
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> beforePassingThroughAccept(Csc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> {
            c.accept(t1, t2, t3, t4, t5, t6, t7);
            return this.test(t1, t2, t3, t4, t5, t6, t7);
        };
    }

    default public Prc1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> tupled() {
        return tuple -> this.test(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5(), tuple._6(), tuple._7());
    }

    default public Fnc1<T1, Fnc1<T2, Fnc1<T3, Fnc1<T4, Fnc1<T5, Fnc1<T6, Prc1<T7>>>>>>> currying() {
        return t1 -> t2 -> t3 -> t4 -> t5 -> t6 -> t7 -> this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> unchecked() {
        return (t1, t2, t3, t4, t5, t6, t7) -> {
            try {
                return this.test(t1, t2, t3, t4, t5, t6, t7);
            }
            catch (Throwable t) {
                return (Boolean) SneakyThrow.sneakyThrow(t);
            }

        };
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> negated() {
        return (t1, t2, t3, t4, t5, t6, t7) -> !this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> and(Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        return (t1, t2, t3, t4, t5, t6, t7) -> this.test(t1, t2, t3, t4, t5, t6, t7) && p.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> or(Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        return (t1, t2, t3, t4, t5, t6, t7) -> this.test(t1, t2, t3, t4, t5, t6, t7) || p.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> and(Prc0 p) {
        return (t1, t2, t3, t4, t5, t6, t7) -> this.test(t1, t2, t3, t4, t5, t6, t7) && p.test() != false;
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> or(Prc0 p) {
        return (t1, t2, t3, t4, t5, t6, t7) -> this.test(t1, t2, t3, t4, t5, t6, t7) || p.test() != false;
    }

    default public <I1> Prc8<I1, T1, T2, T3, T4, T5, T6, T7> ignoring1Lt() {
        return (i1, t1, t2, t3, t4, t5, t6, t7) -> this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public <I1> Prc8<T1, T2, T3, T4, T5, T6, T7, I1> ignoring1Rt() {
        return (t1, t2, t3, t4, t5, t6, t7, i1) -> this.test(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> memoized() {
        return (t1, t2, t3, t4, t5, t6, t7) -> ((CheckedFunction7) super.memoized()).apply(t1, t2, t3, t4, t5, t6, t7);
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> recover(Fn1<? super Throwable, ? extends Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7>> recover) {
        Objects.requireNonNull(recover, "recover is null");
        return (t1, t2, t3, t4, t5, t6, t7) -> {
            try {
                return this.test(t1, t2, t3, t4, t5, t6, t7);
            }
            catch (Throwable throwable) {
                Pr7 pred = (Pr7) recover.apply(throwable);
                Objects.requireNonNull(pred, () -> "recover return null for " + throwable.getClass() + ": " + throwable.getMessage());
                return pred.test(t1, t2, t3, t4, t5, t6, t7);
            }

        };
    }

}

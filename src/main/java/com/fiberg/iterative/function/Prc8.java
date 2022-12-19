package com.fiberg.iterative.function;

import com.fiberg.iterative.core.IterativeInternals;
import com.fiberg.iterative.function.Csc1;
import com.fiberg.iterative.function.Csc8;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fn8;
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
import com.fiberg.iterative.function.Pr8;
import com.fiberg.iterative.function.Prc0;
import com.fiberg.iterative.function.Prc1;
import com.fiberg.iterative.function.Prc2;
import com.fiberg.iterative.function.Prc3;
import com.fiberg.iterative.function.Prc4;
import com.fiberg.iterative.function.Prc5;
import com.fiberg.iterative.function.Prc6;
import com.fiberg.iterative.function.Prc7;
import com.fiberg.iterative.function.Predicates;
import com.fiberg.iterative.function.Rnc;
import com.fiberg.iterative.function.SneakyThrow;
import com.fiberg.iterative.function.Spc;
import io.vavr.CheckedFunction8;
import io.vavr.Tuple;
import io.vavr.Tuple8;
import java.io.Serializable;
import java.util.Objects;

@FunctionalInterface
public interface Prc8<T1, T2, T3, T4, T5, T6, T7, T8> extends CheckedFunction8<T1, T2, T3, T4, T5, T6, T7, T8, Boolean> {

    default public Boolean apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) throws Throwable {
        return this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> narrow(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        @SuppressWarnings("unchecked")
        final Prc8<T1, T2, T3, T4, T5, T6, T7, T8> prc = (Prc8<T1, T2, T3, T4, T5, T6, T7, T8>) p;
        return prc;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> empty() {
        return IterativeInternals::none;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> value(Boolean b) {
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> b;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> of(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        return Prc8.narrow(p);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> of1(Prc1<? super T1> f) {
        return Prc8.<T1, T2, T3, T4, T5, T6, T7, T8>narrow(f.ignoring7Rt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> of2(Prc1<? super T2> f) {
        return Prc8.<T1, T2, T3, T4, T5, T6, T7, T8>narrow(f.ignoring6Rt().ignoring1Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> of3(Prc1<? super T3> f) {
        return Prc8.<T1, T2, T3, T4, T5, T6, T7, T8>narrow(f.ignoring5Rt().ignoring2Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> of4(Prc1<? super T4> f) {
        return Prc8.<T1, T2, T3, T4, T5, T6, T7, T8>narrow(f.ignoring4Rt().ignoring3Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> of5(Prc1<? super T5> f) {
        return Prc8.<T1, T2, T3, T4, T5, T6, T7, T8>narrow(f.ignoring3Rt().ignoring4Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> of6(Prc1<? super T6> f) {
        return Prc8.<T1, T2, T3, T4, T5, T6, T7, T8>narrow(f.ignoring2Rt().ignoring5Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> of7(Prc1<? super T7> f) {
        return Prc8.<T1, T2, T3, T4, T5, T6, T7, T8>narrow(f.ignoring1Rt().ignoring6Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> of8(Prc1<? super T8> f) {
        return Prc8.<T1, T2, T3, T4, T5, T6, T7, T8>narrow(f.ignoring7Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> fromFunction(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, Boolean> f) {
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> f.apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> fromSupplier(Spc<? extends Boolean> s) {
        return Prc8.fromFunction(Spc.narrow(s).toFunction().ignoring8());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> negate(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        return Prc8.<T1, T2, T3, T4, T5, T6, T7, T8>narrow(p.negated());
    }

    @SafeVarargs
    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> and(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> ... ps) {
        Objects.requireNonNull(ps, "ps is null");
        return Predicates.and(ps);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> and(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, Prc0 ... ps) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(ps, "ps is null");
        return ps.length == 0 ? Prc8.narrow(p) : Prc8.narrow(p).and(Predicates.and(ps));
    }

    @SafeVarargs
    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> or(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> ... ps) {
        Objects.requireNonNull(ps, "ps is null");
        return Predicates.or(ps);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> or(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, Prc0 ... ps) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(ps, "ps is null");
        return ps.length == 0 ? Prc8.narrow(p) : Prc8.narrow(p).or(Predicates.or(ps));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> tuple(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        return Prc8.<T1, T2, T3, T4, T5, T6, T7, T8>of(p).tupled();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> detuple(Prc1<? super Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> p) {
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> p.test(Tuple.of(t1, t2, t3, t4, t5, t6, t7, t8));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> check(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        Objects.requireNonNull(p, "p is null");
        return Pr8.narrow(p).checked();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> ignore(Prc0 p) {
        return p.ignoring8();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> ignore7Rt(Prc1<? super T1> p) {
        return Prc1.<T1>narrow(p).ignoring7Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> ignore7Lt(Prc1<? super T8> p) {
        return Prc1.<T8>narrow(p).ignoring7Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> ignore6Rt(Prc2<? super T1, ? super T2> p) {
        return Prc2.<T1, T2>narrow(p).ignoring6Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> ignore6Lt(Prc2<? super T7, ? super T8> p) {
        return Prc2.<T7, T8>narrow(p).ignoring6Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> ignore5Rt(Prc3<? super T1, ? super T2, ? super T3> p) {
        return Prc3.<T1, T2, T3>narrow(p).ignoring5Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> ignore5Lt(Prc3<? super T6, ? super T7, ? super T8> p) {
        return Prc3.<T6, T7, T8>narrow(p).ignoring5Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> ignore4Rt(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        return Prc4.<T1, T2, T3, T4>narrow(p).ignoring4Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> ignore4Lt(Prc4<? super T5, ? super T6, ? super T7, ? super T8> p) {
        return Prc4.<T5, T6, T7, T8>narrow(p).ignoring4Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> ignore3Rt(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return Prc5.<T1, T2, T3, T4, T5>narrow(p).ignoring3Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> ignore3Lt(Prc5<? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        return Prc5.<T4, T5, T6, T7, T8>narrow(p).ignoring3Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> ignore2Rt(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        return Prc6.<T1, T2, T3, T4, T5, T6>narrow(p).ignoring2Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> ignore2Lt(Prc6<? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        return Prc6.<T3, T4, T5, T6, T7, T8>narrow(p).ignoring2Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> ignore1Rt(Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        return Prc7.<T1, T2, T3, T4, T5, T6, T7>narrow(p).ignoring1Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> ignore1Lt(Prc7<? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        return Prc7.<T2, T3, T4, T5, T6, T7, T8>narrow(p).ignoring1Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc8<T8, T7, T6, T5, T4, T3, T2, T1> invert(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        return Prc8.<T1, T2, T3, T4, T5, T6, T7, T8>narrow(p).inverted();
    }

    public boolean test(T1 var1, T2 var2, T3 var3, T4 var4, T5 var5, T6 var6, T7 var7, T8 var8) throws Throwable;

    default public Prc7<T2, T3, T4, T5, T6, T7, T8> testLt(T1 t1) {
        return (t2, t3, t4, t5, t6, t7, t8) -> this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Prc6<T3, T4, T5, T6, T7, T8> testLt(T1 t1, T2 t2) {
        return (t3, t4, t5, t6, t7, t8) -> this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Prc5<T4, T5, T6, T7, T8> testLt(T1 t1, T2 t2, T3 t3) {
        return (t4, t5, t6, t7, t8) -> this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Prc4<T5, T6, T7, T8> testLt(T1 t1, T2 t2, T3 t3, T4 t4) {
        return (t5, t6, t7, t8) -> this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Prc3<T6, T7, T8> testLt(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return (t6, t7, t8) -> this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Prc2<T7, T8> testLt(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return (t7, t8) -> this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Prc1<T8> testLt(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return t8 -> this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Prc7<T1, T2, T3, T4, T5, T6, T7> testRt(T8 t8) {
        return (t1, t2, t3, t4, t5, t6, t7) -> this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> testRt(T7 t7, T8 t8) {
        return (t1, t2, t3, t4, t5, t6) -> this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Prc5<T1, T2, T3, T4, T5> testRt(T6 t6, T7 t7, T8 t8) {
        return (t1, t2, t3, t4, t5) -> this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Prc4<T1, T2, T3, T4> testRt(T5 t5, T6 t6, T7 t7, T8 t8) {
        return (t1, t2, t3, t4) -> this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Prc3<T1, T2, T3> testRt(T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return (t1, t2, t3) -> this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Prc2<T1, T2> testRt(T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return (t1, t2) -> this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Prc1<T1> testRt(T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return t1 -> this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, Boolean> toFunction() {
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Csc8<T1, T2, T3, T4, T5, T6, T7, T8> toConsumer() {
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Prc0 toPredicate(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return () -> this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Spc<Boolean> toSupplier(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return this.toPredicate(t1, t2, t3, t4, t5, t6, t7, t8).toSupplier();
    }

    default public Rnc toRunnable(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return this.toPredicate(t1, t2, t3, t4, t5, t6, t7, t8).toRunnable();
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterRunOn(Rnc onSuccess, Rnc onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            Boolean value = this.test(t1, t2, t3, t4, t5, t6, t7, t8);
            (value != false ? onSuccess : onFailure).run();
            return value;
        };
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterTestOn(Prc1<Boolean> onSuccess, Prc1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.toFunction(), onFailure.toFunction());
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterTestOn(Prc0 onSuccess, Prc0 onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterTestOn(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterApplyOn(Fnc1<Boolean, Boolean> onSuccess, Fnc1<Boolean, Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return Prc8.fromFunction(this.afterApplyOnTo(onSuccess, onFailure));
    }

    default public <R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> afterApplyOnTo(Fnc1<Boolean, ? extends R> onSuccess, Fnc1<Boolean, ? extends R> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            Boolean value = this.test(t1, t2, t3, t4, t5, t6, t7, t8);
            return (value != false ? onSuccess : onFailure).apply(value);
        };
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterApplyOn(Fnc0<Boolean> onSuccess, Fnc0<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onFailure.ignoring1(), onFailure.ignoring1());
    }

    default public <R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> afterApplyOnTo(Fnc0<? extends R> onSuccess, Fnc0<? extends R> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOnTo(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterGetOn(Spc<Boolean> onSuccess, Spc<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Csc8<T1, T2, T3, T4, T5, T6, T7, T8> afterAcceptOnTo(Csc1<Boolean> onSuccess, Csc1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOnTo(onSuccess.toFunction(null), onFailure.toFunction(null)).toConsumer();
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterAcceptOn(Csc1<Boolean> onSuccess, Csc1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.toFunction(null), onFailure.toFunction(null));
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterRun(Rnc r) {
        return this.afterRunOn(r, r);
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterTest(Prc1<Boolean> p) {
        return this.afterTestOn(p, p);
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterTest(Prc0 p) {
        return this.afterTestOn(p, p);
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterApply(Fnc1<Boolean, Boolean> f) {
        return this.afterApplyOn(f, f);
    }

    default public <R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> afterApplyTo(Fnc1<Boolean, ? extends R> f) {
        return this.afterApplyOnTo(f, f);
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterApply(Fnc0<Boolean> f) {
        return this.afterApplyOn(f, f);
    }

    default public <R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> afterApplyTo(Fnc0<? extends R> f) {
        return this.afterApplyOnTo(f, f);
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterGet(Spc<Boolean> s) {
        return this.afterGetOn(s, s);
    }

    default public Csc8<T1, T2, T3, T4, T5, T6, T7, T8> afterAcceptTo(Csc1<Boolean> c) {
        return this.afterAcceptOnTo(c, c);
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterAccept(Csc1<Boolean> c) {
        return this.afterAcceptOn(c, c);
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> beforeWrap(Pr1<? super Spc<Boolean>> wrap) {
        return Pr8.fromFunction(this.beforeWrapTo(wrap.toFunction()));
    }

    default public <W> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, W> beforeWrapTo(Fn1<? super Spc<Boolean>, ? extends W> wrap) {
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> wrap.apply(this.toSupplier(t1, t2, t3, t4, t5, t6, t7, t8));
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterRunOnSuccess(Rnc r) {
        return this.afterRunOn(r, Rnc.empty());
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterTestOnSuccess(Prc1<Boolean> p) {
        return this.afterTestOn(p, Prc1.empty());
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterTestOnSuccess(Prc0 p) {
        return this.afterTestOn(p, Prc0.empty());
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterApplyOnSuccess(Fnc1<Boolean, Boolean> f) {
        return this.afterApplyOn(f, Fnc1.empty());
    }

    default public <R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> afterApplyOnSuccessTo(Fnc1<Boolean, ? extends R> f) {
        return this.afterApplyOnTo(f, Fnc1.empty());
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterApplyOnSuccess(Fnc0<Boolean> f) {
        return this.afterApplyOn(f, Fnc0.empty());
    }

    default public <R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> afterApplyOnSuccessTo(Fnc0<? extends R> f) {
        return this.afterApplyOnTo(f, Fnc0.empty());
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterGetOnSuccess(Spc<Boolean> s) {
        return this.afterGetOn(s, Spc.empty());
    }

    default public Csc8<T1, T2, T3, T4, T5, T6, T7, T8> afterAcceptOnSuccessTo(Csc1<Boolean> c) {
        return this.afterAcceptOnTo(c, Csc1.empty());
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterAcceptOnSuccess(Csc1<Boolean> c) {
        return this.afterAcceptOn(c, Csc1.empty());
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterRunOnFailure(Rnc r) {
        return this.negated().afterRunOnSuccess(r);
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterTestOnFailure(Prc1<Boolean> p) {
        return this.negated().afterTestOnSuccess(p);
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterTestOnFailure(Prc0 p) {
        return this.negated().afterTestOnSuccess(p);
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterApplyOnFailure(Fnc1<Boolean, Boolean> f) {
        return this.negated().afterApplyOnSuccess(f);
    }

    default public <R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> afterApplyOnFailureTo(Fnc1<Boolean, ? extends R> f) {
        return this.negated().afterApplyOnSuccessTo(f);
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterApplyOnFailure(Fnc0<Boolean> f) {
        return this.negated().afterApplyOnSuccess(f);
    }

    default public <R> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, R> afterApplyOnFailureTo(Fnc0<? extends R> f) {
        return this.negated().afterApplyOnSuccessTo(f);
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterGetOnFailure(Spc<Boolean> s) {
        return this.negated().afterGetOnSuccess(s);
    }

    default public Csc8<T1, T2, T3, T4, T5, T6, T7, T8> afterAcceptOnFailureTo(Csc1<Boolean> c) {
        return this.negated().afterAcceptOnSuccessTo(c);
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterAcceptOnFailure(Csc1<Boolean> c) {
        return this.negated().afterAcceptOnSuccess(c);
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> beforeRun(Rnc r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            r.run();
            return this.test(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Prc8<B1, B2, B3, B4, B5, B6, B7, B8> beforeApply(Fnc8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        return this.beforeApply8(f);
    }

    default public <B1> Prc1<B1> beforeApply1(Fnc1<? super B1, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return b1 -> this.tupled().test(Tuple.narrow((f.apply(b1))));
    }

    default public <B1, B2> Prc2<B1, B2> beforeApply2(Fnc2<? super B1, ? super B2, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2))));
    }

    default public <B1, B2, B3> Prc3<B1, B2, B3> beforeApply3(Fnc3<? super B1, ? super B2, ? super B3, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3))));
    }

    default public <B1, B2, B3, B4> Prc4<B1, B2, B3, B4> beforeApply4(Fnc4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4))));
    }

    default public <B1, B2, B3, B4, B5> Prc5<B1, B2, B3, B4, B5> beforeApply5(Fnc5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5))));
    }

    default public <B1, B2, B3, B4, B5, B6> Prc6<B1, B2, B3, B4, B5, B6> beforeApply6(Fnc6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Prc7<B1, B2, B3, B4, B5, B6, B7> beforeApply7(Fnc7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Prc8<B1, B2, B3, B4, B5, B6, B7, B8> beforeApply8(Fnc8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7, b8) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7, b8))));
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> beforeTestOnSuccess(Prc0 p, Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> p.test() != false ? this.test(t1, t2, t3, t4, t5, t6, t7, t8) : onFailure.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> beforeTestOnSuccess(Prc0 p, Spc<? extends Boolean> onFailure) {
        return this.beforeTestOnSuccess(p, Prc8.fromSupplier(onFailure));
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> beforeTestOnSuccess(Prc0 p, Boolean onFailure) {
        return this.beforeTestOnSuccess(p, Prc8.value(onFailure));
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> beforeTestOnSuccess(Prc0 p) {
        return this.beforeTestOnSuccess(p, Prc8.empty());
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> beforeTestOnFailure(Prc0 p, Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> beforeTestOnFailure(Prc0 p, Spc<? extends Boolean> onSuccess) {
        return this.beforeTestOnFailure(p, Prc8.fromSupplier(onSuccess));
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> beforeTestOnFailure(Prc0 p, Boolean onSuccess) {
        return this.beforeTestOnFailure(p, Prc8.value(onSuccess));
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> beforeTestOnFailure(Prc0 p) {
        return this.beforeTestOnFailure(p, Prc8.empty());
    }

    default public Prc0 beforeGet(Spc<? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> s) {
        Objects.requireNonNull(s, "s is null");
        return () -> this.tupled().test(Tuple.narrow((s.get())));
    }

    default public Prc8<T8, T7, T6, T5, T4, T3, T2, T1> inverted() {
        return (t8, t7, t6, t5, t4, t3, t2, t1) -> this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public <S> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterPassingThroughApplyOn(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends S> onSuccess, Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends S> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            Boolean result = this.test(t1, t2, t3, t4, t5, t6, t7, t8);
            Fnc8.narrow(result != false ? onSuccess : onFailure).apply(t1, t2, t3, t4, t5, t6, t7, t8);
            return result;
        };
    }

    default public <S> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, S> afterPassingThroughApplyOnTo(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends S> onSuccess, Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends S> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> Fnc8.narrow(this.test(t1, t2, t3, t4, t5, t6, t7, t8) ? onSuccess : onFailure).apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterPassingThroughAcceptOn(Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onSuccess, Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            Boolean result = this.test(t1, t2, t3, t4, t5, t6, t7, t8);
            Csc8.narrow(result != false ? onSuccess : onFailure).accept(t1, t2, t3, t4, t5, t6, t7, t8);
            return result;
        };
    }

    default public Csc8<T1, T2, T3, T4, T5, T6, T7, T8> afterPassingThroughAcceptOnTo(Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onSuccess, Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> Csc8.narrow(this.test(t1, t2, t3, t4, t5, t6, t7, t8) ? onSuccess : onFailure).accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterPassingThroughTestOn(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onSuccess, Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> Prc8.narrow(this.test(t1, t2, t3, t4, t5, t6, t7, t8) ? onSuccess : onFailure).test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public <S> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterPassingThroughApply(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends S> f) {
        return this.afterPassingThroughApplyOn(f, f);
    }

    default public <S> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, S> afterPassingThroughApplyTo(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends S> f) {
        return this.afterPassingThroughApplyOnTo(f, f);
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterPassingThroughAccept(Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
        return this.afterPassingThroughAcceptOn(c, c);
    }

    default public Csc8<T1, T2, T3, T4, T5, T6, T7, T8> afterPassingThroughAcceptTo(Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
        return this.afterPassingThroughAcceptOnTo(c, c);
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterPassingThroughTest(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        return this.afterPassingThroughTestOn(p, p);
    }

    default public <S> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterSuccessPassingThroughApply(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends S> onSuccess) {
        return this.afterPassingThroughApplyOn(onSuccess, Fnc8.empty());
    }

    default public <S> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, S> afterSuccessPassingThroughApplyTo(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends S> onSuccess) {
        return this.afterPassingThroughApplyOnTo(onSuccess, Fnc8.empty());
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterSuccessPassingThroughAccept(Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onSuccess) {
        return this.afterPassingThroughAcceptOn(onSuccess, Csc8.empty());
    }

    default public Csc8<T1, T2, T3, T4, T5, T6, T7, T8> afterSuccessPassingThroughAcceptTo(Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onSuccess) {
        return this.afterPassingThroughAcceptOnTo(onSuccess, Csc8.empty());
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterSuccessPassingThroughTest(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onSuccess) {
        return this.afterPassingThroughTestOn(onSuccess, Prc8.empty());
    }

    default public <S> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterFailurePassingThroughApply(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends S> onFailure) {
        return this.negated().afterSuccessPassingThroughApply(onFailure);
    }

    default public <S> Fnc8<T1, T2, T3, T4, T5, T6, T7, T8, S> afterFailurePassingThroughApplyTo(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends S> onFailure) {
        return this.negated().afterSuccessPassingThroughApplyTo(onFailure);
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterFailurePassingThroughAccept(Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onFailure) {
        return this.negated().afterSuccessPassingThroughAccept(onFailure);
    }

    default public Csc8<T1, T2, T3, T4, T5, T6, T7, T8> afterFailurePassingThroughAcceptTo(Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onFailure) {
        return this.negated().afterSuccessPassingThroughAcceptTo(onFailure);
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> afterFailurePassingThroughTest(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onFailure) {
        return this.negated().afterSuccessPassingThroughTest(onFailure);
    }

    default public <R> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> beforePassingThroughApply(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            f.apply(t1, t2, t3, t4, t5, t6, t7, t8);
            return this.test(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> beforePassingThroughTest(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            p.test(t1, t2, t3, t4, t5, t6, t7, t8);
            return this.test(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> beforePassingThroughAccept(Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            c.accept(t1, t2, t3, t4, t5, t6, t7, t8);
            return this.test(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> beforeSuccessPassingThroughTest(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> p.test(t1, t2, t3, t4, t5, t6, t7, t8) ? this.test(t1, t2, t3, t4, t5, t6, t7, t8) : onFailure.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> beforeSuccessPassingThroughTest(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, Spc<? extends Boolean> onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Prc8.fromSupplier(onFailure));
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> beforeSuccessPassingThroughTest(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, Boolean onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Prc8.value(onFailure));
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> beforeSuccessPassingThroughTest(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        return this.beforeSuccessPassingThroughTest(p, Prc8.empty());
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> beforeFailurePassingThroughTest(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> beforeFailurePassingThroughTest(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, Spc<? extends Boolean> onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Prc8.fromSupplier(onSuccess));
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> beforeFailurePassingThroughTest(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, Boolean onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Prc8.value(onSuccess));
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> beforeFailurePassingThroughTest(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        return this.beforeFailurePassingThroughTest(p, Prc8.empty());
    }

    default public Prc1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> tupled() {
        return tuple -> this.test(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5(), tuple._6(), tuple._7(), tuple._8());
    }

    default public Fnc1<T1, Fnc1<T2, Fnc1<T3, Fnc1<T4, Fnc1<T5, Fnc1<T6, Fnc1<T7, Prc1<T8>>>>>>>> currying() {
        return t1 -> t2 -> t3 -> t4 -> t5 -> t6 -> t7 -> t8 -> this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> unchecked() {
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            try {
                return this.test(t1, t2, t3, t4, t5, t6, t7, t8);
            }
            catch (Throwable t) {
                return (Boolean) SneakyThrow.sneakyThrow(t);
            }

        };
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> negated() {
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> !this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> and(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> this.test(t1, t2, t3, t4, t5, t6, t7, t8) && p.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> or(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> this.test(t1, t2, t3, t4, t5, t6, t7, t8) || p.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> and(Prc0 p) {
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> this.test(t1, t2, t3, t4, t5, t6, t7, t8) && p.test() != false;
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> or(Prc0 p) {
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> this.test(t1, t2, t3, t4, t5, t6, t7, t8) || p.test() != false;
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> memoized() {
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> ((CheckedFunction8) super.memoized()).apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> recover(Fn1<? super Throwable, ? extends Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8>> recover) {
        Objects.requireNonNull(recover, "recover is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> {
            try {
                return this.test(t1, t2, t3, t4, t5, t6, t7, t8);
            }
            catch (Throwable throwable) {
                Pr8 pred = (Pr8) recover.apply(throwable);
                Objects.requireNonNull(pred, () -> "recover return null for " + throwable.getClass() + ": " + throwable.getMessage());
                return pred.test(t1, t2, t3, t4, t5, t6, t7, t8);
            }

        };
    }

}

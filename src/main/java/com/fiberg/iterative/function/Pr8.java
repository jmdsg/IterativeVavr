package com.fiberg.iterative.function;

import com.fiberg.iterative.core.IterativeInternals;
import com.fiberg.iterative.function.Cs1;
import com.fiberg.iterative.function.Cs8;
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
import com.fiberg.iterative.function.Pr6;
import com.fiberg.iterative.function.Pr7;
import com.fiberg.iterative.function.Prc8;
import com.fiberg.iterative.function.Predicates;
import com.fiberg.iterative.function.Rn;
import com.fiberg.iterative.function.Sp;
import com.fiberg.iterative.function.Spc;
import io.vavr.Function8;
import io.vavr.Tuple;
import io.vavr.Tuple8;
import java.io.Serializable;
import java.util.Objects;

@FunctionalInterface
public interface Pr8<T1, T2, T3, T4, T5, T6, T7, T8> extends Function8<T1, T2, T3, T4, T5, T6, T7, T8, Boolean> {

    default public Boolean apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> narrow(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        return p;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> empty() {
        return IterativeInternals::none;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> value(Boolean b) {
        return (Pr8<Object, Object, Object, Object, Object, Object, Object, Object> & Serializable)(t1, t2, t3, t4, t5, t6, t7, t8) -> b;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> of(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        return Pr8.narrow(p);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> of1(Pr1<? super T1> f) {
        return Pr8.narrow(f.ignoring7Rt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> of2(Pr1<? super T2> f) {
        return Pr8.narrow(f.ignoring6Rt().ignoring1Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> of3(Pr1<? super T3> f) {
        return Pr8.narrow(f.ignoring5Rt().ignoring2Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> of4(Pr1<? super T4> f) {
        return Pr8.narrow(f.ignoring4Rt().ignoring3Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> of5(Pr1<? super T5> f) {
        return Pr8.narrow(f.ignoring3Rt().ignoring4Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> of6(Pr1<? super T6> f) {
        return Pr8.narrow(f.ignoring2Rt().ignoring5Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> of7(Pr1<? super T7> f) {
        return Pr8.narrow(f.ignoring1Rt().ignoring6Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> of8(Pr1<? super T8> f) {
        return Pr8.narrow(f.ignoring7Lt());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> fromFunction(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, Boolean> f) {
        return (arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6, arg_7) -> f.apply(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6, arg_7);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> fromSupplier(Sp<? extends Boolean> s) {
        return Pr8.fromFunction(Sp.narrow(s).toFunction().ignoring8());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> negate(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        return Pr8.narrow(p.negated());
    }

    @SafeVarargs
    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> and(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> ... ps) {
        Objects.requireNonNull(ps, "ps is null");
        return Predicates.and(ps);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> and(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, Pr0 ... ps) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(ps, "ps is null");
        return ps.length == 0 ? Pr8.narrow(p) : Pr8.narrow(p).and(Predicates.and(ps));
    }

    @SafeVarargs
    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> or(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> ... ps) {
        Objects.requireNonNull(ps, "ps is null");
        return Predicates.or(ps);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> or(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, Pr0 ... ps) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(ps, "ps is null");
        return ps.length == 0 ? Pr8.narrow(p) : Pr8.narrow(p).or(Predicates.or(ps));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> tuple(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        return Pr8.of(p).tupled();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> detuple(Pr1<? super Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> p) {
        return (Pr8<Object, Object, Object, Object, Object, Object, Object, Object> & Serializable)(t1, t2, t3, t4, t5, t6, t7, t8) -> p.test(Tuple.of((Object)t1, (Object)t2, (Object)t3, (Object)t4, (Object)t5, (Object)t6, (Object)t7, (Object)t8));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> uncheck(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        Objects.requireNonNull(p, "p is null");
        return Prc8.narrow(p).unchecked();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> ignore(Pr0 p) {
        return p.ignoring8();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> ignore7Rt(Pr1<? super T1> p) {
        return Pr1.narrow(p).ignoring7Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> ignore7Lt(Pr1<? super T8> p) {
        return Pr1.narrow(p).ignoring7Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> ignore6Rt(Pr2<? super T1, ? super T2> p) {
        return Pr2.narrow(p).ignoring6Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> ignore6Lt(Pr2<? super T7, ? super T8> p) {
        return Pr2.narrow(p).ignoring6Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> ignore5Rt(Pr3<? super T1, ? super T2, ? super T3> p) {
        return Pr3.narrow(p).ignoring5Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> ignore5Lt(Pr3<? super T6, ? super T7, ? super T8> p) {
        return Pr3.narrow(p).ignoring5Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> ignore4Rt(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        return Pr4.narrow(p).ignoring4Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> ignore4Lt(Pr4<? super T5, ? super T6, ? super T7, ? super T8> p) {
        return Pr4.narrow(p).ignoring4Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> ignore3Rt(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return Pr5.narrow(p).ignoring3Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> ignore3Lt(Pr5<? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        return Pr5.narrow(p).ignoring3Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> ignore2Rt(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        return Pr6.narrow(p).ignoring2Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> ignore2Lt(Pr6<? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        return Pr6.narrow(p).ignoring2Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> ignore1Rt(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        return Pr7.narrow(p).ignoring1Rt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> ignore1Lt(Pr7<? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        return Pr7.narrow(p).ignoring1Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr8<T8, T7, T6, T5, T4, T3, T2, T1> invert(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        return Pr8.narrow(p).inverted();
    }

    public boolean test(T1 var1, T2 var2, T3 var3, T4 var4, T5 var5, T6 var6, T7 var7, T8 var8);

    default public Pr7<T2, T3, T4, T5, T6, T7, T8> testLt(T1 t1) {
        return (Pr7<Object, Object, Object, Object, Object, Object, Object> & Serializable)(t2, t3, t4, t5, t6, t7, t8) -> this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Pr6<T3, T4, T5, T6, T7, T8> testLt(T1 t1, T2 t2) {
        return (Pr6<Object, Object, Object, Object, Object, Object> & Serializable)(t3, t4, t5, t6, t7, t8) -> this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Pr5<T4, T5, T6, T7, T8> testLt(T1 t1, T2 t2, T3 t3) {
        return (Pr5<Object, Object, Object, Object, Object> & Serializable)(t4, t5, t6, t7, t8) -> this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Pr4<T5, T6, T7, T8> testLt(T1 t1, T2 t2, T3 t3, T4 t4) {
        return (Pr4<Object, Object, Object, Object> & Serializable)(t5, t6, t7, t8) -> this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Pr3<T6, T7, T8> testLt(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return (Pr3<Object, Object, Object> & Serializable)(t6, t7, t8) -> this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Pr2<T7, T8> testLt(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return (Pr2<Object, Object> & Serializable)(t7, t8) -> this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Pr1<T8> testLt(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return (Pr1 & Serializable)t8 -> this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Pr7<T1, T2, T3, T4, T5, T6, T7> testRt(T8 t8) {
        return (Pr7<Object, Object, Object, Object, Object, Object, Object> & Serializable)(t1, t2, t3, t4, t5, t6, t7) -> this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> testRt(T7 t7, T8 t8) {
        return (Pr6<Object, Object, Object, Object, Object, Object> & Serializable)(t1, t2, t3, t4, t5, t6) -> this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Pr5<T1, T2, T3, T4, T5> testRt(T6 t6, T7 t7, T8 t8) {
        return (Pr5<Object, Object, Object, Object, Object> & Serializable)(t1, t2, t3, t4, t5) -> this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Pr4<T1, T2, T3, T4> testRt(T5 t5, T6 t6, T7 t7, T8 t8) {
        return (Pr4<Object, Object, Object, Object> & Serializable)(t1, t2, t3, t4) -> this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Pr3<T1, T2, T3> testRt(T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return (Pr3<Object, Object, Object> & Serializable)(t1, t2, t3) -> this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Pr2<T1, T2> testRt(T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return (Pr2<Object, Object> & Serializable)(t1, t2) -> this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Pr1<T1> testRt(T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return (Pr1 & Serializable)t1 -> this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> boolean passAndTest(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Pr0.pass(p, t1, t2, t3, t4, t5, t6, t7, t8).test();
    }

    default public Fn8<T1, T2, T3, T4, T5, T6, T7, T8, Boolean> toFunction() {
        return (arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6, arg_7) -> this.test(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6, arg_7);
    }

    default public Cs8<T1, T2, T3, T4, T5, T6, T7, T8> toConsumer() {
        return (arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6, arg_7) -> this.test(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6, arg_7);
    }

    default public Pr0 toPredicate(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return (Pr0 & Serializable)() -> this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Sp<Boolean> toSupplier(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return this.toPredicate(t1, t2, t3, t4, t5, t6, t7, t8).toSupplier();
    }

    default public Rn toRunnable(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return this.toPredicate(t1, t2, t3, t4, t5, t6, t7, t8).toRunnable();
    }

    default public <R> R passEvalued(Sp<? extends R> onSuccess, Sp<? extends R> onFailure, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return (R)this.toPredicate(t1, t2, t3, t4, t5, t6, t7, t8).evalued(onSuccess, onFailure);
    }

    default public <R> R passEvalued(Sp<? extends R> onSuccess, R onFailure, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return (R)this.toPredicate(t1, t2, t3, t4, t5, t6, t7, t8).evalued(onSuccess, onFailure);
    }

    default public <R> R passEvalued(R onSuccess, Sp<? extends R> onFailure, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return (R)this.toPredicate(t1, t2, t3, t4, t5, t6, t7, t8).evalued(onSuccess, onFailure);
    }

    default public <R> R passEvalued(R onSuccess, R onFailure, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return this.toPredicate(t1, t2, t3, t4, t5, t6, t7, t8).evalued(onSuccess, onFailure);
    }

    default public <R> R passEvaluedOnSuccess(Sp<? extends R> onSuccess, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return (R)this.toPredicate(t1, t2, t3, t4, t5, t6, t7, t8).evaluedOnSuccess(onSuccess);
    }

    default public <R> R passEvaluedOnFailure(Sp<? extends R> onFailure, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return (R)this.toPredicate(t1, t2, t3, t4, t5, t6, t7, t8).evaluedOnFailure(onFailure);
    }

    default public <R> R passEvaluedOnSuccess(R onSuccess, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return this.toPredicate(t1, t2, t3, t4, t5, t6, t7, t8).evaluedOnSuccess(onSuccess);
    }

    default public <R> R passEvaluedOnFailure(R onFailure, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return this.toPredicate(t1, t2, t3, t4, t5, t6, t7, t8).evaluedOnFailure(onFailure);
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterRunOn(Rn onSuccess, Rn onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (Pr8<Object, Object, Object, Object, Object, Object, Object, Object> & Serializable)(t1, t2, t3, t4, t5, t6, t7, t8) -> {
            Boolean value = this.test(t1, t2, t3, t4, t5, t6, t7, t8);
            (value != false ? onSuccess : onFailure).run();
            return value;
        };
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterTestOn(Pr1<Boolean> onSuccess, Pr1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.toFunction(), onFailure.toFunction());
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterTestOn(Pr0 onSuccess, Pr0 onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterTestOn(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterApplyOn(Fn1<Boolean, Boolean> onSuccess, Fn1<Boolean, Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return Pr8.fromFunction(this.afterApplyOnTo(onSuccess, onFailure));
    }

    default public <R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> afterApplyOnTo(Fn1<Boolean, ? extends R> onSuccess, Fn1<Boolean, ? extends R> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (Fn8 & Serializable)(t1, t2, t3, t4, t5, t6, t7, t8) -> {
            Boolean value = this.test(t1, t2, t3, t4, t5, t6, t7, t8);
            return (value != false ? onSuccess : onFailure).apply(value);
        };
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterApplyOn(Fn0<Boolean> onSuccess, Fn0<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onFailure.ignoring1(), onFailure.ignoring1());
    }

    default public <R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> afterApplyOnTo(Fn0<? extends R> onSuccess, Fn0<? extends R> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOnTo(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterGetOn(Sp<Boolean> onSuccess, Sp<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Cs8<T1, T2, T3, T4, T5, T6, T7, T8> afterAcceptOnTo(Cs1<Boolean> onSuccess, Cs1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOnTo(onSuccess.toFunction(null), onFailure.toFunction(null)).toConsumer();
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterAcceptOn(Cs1<Boolean> onSuccess, Cs1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.toFunction(null), onFailure.toFunction(null));
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterRun(Rn r) {
        return this.afterRunOn(r, r);
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterTest(Pr1<Boolean> p) {
        return this.afterTestOn(p, p);
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterTest(Pr0 p) {
        return this.afterTestOn(p, p);
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterApply(Fn1<Boolean, Boolean> f) {
        return this.afterApplyOn(f, f);
    }

    default public <R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> afterApplyTo(Fn1<Boolean, ? extends R> f) {
        return this.afterApplyOnTo(f, f);
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterApply(Fn0<Boolean> f) {
        return this.afterApplyOn(f, f);
    }

    default public <R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> afterApplyTo(Fn0<? extends R> f) {
        return this.afterApplyOnTo(f, f);
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterGet(Sp<Boolean> s) {
        return this.afterGetOn(s, s);
    }

    default public Cs8<T1, T2, T3, T4, T5, T6, T7, T8> afterAcceptTo(Cs1<Boolean> c) {
        return this.afterAcceptOnTo(c, c);
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterAccept(Cs1<Boolean> c) {
        return this.afterAcceptOn(c, c);
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> beforeWrap(Pr1<? super Spc<Boolean>> wrap) {
        return Pr8.fromFunction(this.beforeWrapTo(wrap.toFunction()));
    }

    default public <W> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, W> beforeWrapTo(Fn1<? super Spc<Boolean>, ? extends W> wrap) {
        return (Fn8 & Serializable)(t1, t2, t3, t4, t5, t6, t7, t8) -> wrap.apply(this.toSupplier(t1, t2, t3, t4, t5, t6, t7, t8).checked());
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterRunOnSuccess(Rn r) {
        return this.afterRunOn(r, Rn.empty());
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterTestOnSuccess(Pr1<Boolean> p) {
        return this.afterTestOn(p, Pr1.empty());
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterTestOnSuccess(Pr0 p) {
        return this.afterTestOn(p, Pr0.empty());
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterApplyOnSuccess(Fn1<Boolean, Boolean> f) {
        return this.afterApplyOn(f, Fn1.empty());
    }

    default public <R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> afterApplyOnSuccessTo(Fn1<Boolean, ? extends R> f) {
        return this.afterApplyOnTo(f, Fn1.empty());
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterApplyOnSuccess(Fn0<Boolean> f) {
        return this.afterApplyOn(f, Fn0.empty());
    }

    default public <R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> afterApplyOnSuccessTo(Fn0<? extends R> f) {
        return this.afterApplyOnTo(f, Fn0.empty());
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterGetOnSuccess(Sp<Boolean> s) {
        return this.afterGetOn(s, Sp.empty());
    }

    default public Cs8<T1, T2, T3, T4, T5, T6, T7, T8> afterAcceptOnSuccessTo(Cs1<Boolean> c) {
        return this.afterAcceptOnTo(c, Cs1.empty());
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterAcceptOnSuccess(Cs1<Boolean> c) {
        return this.afterAcceptOn(c, Cs1.empty());
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterRunOnFailure(Rn r) {
        return this.negated().afterRunOnSuccess(r);
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterTestOnFailure(Pr1<Boolean> p) {
        return this.negated().afterTestOnSuccess(p);
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterTestOnFailure(Pr0 p) {
        return this.negated().afterTestOnSuccess(p);
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterApplyOnFailure(Fn1<Boolean, Boolean> f) {
        return this.negated().afterApplyOnSuccess(f);
    }

    default public <R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> afterApplyOnFailureTo(Fn1<Boolean, ? extends R> f) {
        return this.negated().afterApplyOnSuccessTo(f);
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterApplyOnFailure(Fn0<Boolean> f) {
        return this.negated().afterApplyOnSuccess(f);
    }

    default public <R> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> afterApplyOnFailureTo(Fn0<? extends R> f) {
        return this.negated().afterApplyOnSuccessTo(f);
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterGetOnFailure(Sp<Boolean> s) {
        return this.negated().afterGetOnSuccess(s);
    }

    default public Cs8<T1, T2, T3, T4, T5, T6, T7, T8> afterAcceptOnFailureTo(Cs1<Boolean> c) {
        return this.negated().afterAcceptOnSuccessTo(c);
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterAcceptOnFailure(Cs1<Boolean> c) {
        return this.negated().afterAcceptOnSuccess(c);
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> beforeRun(Rn r) {
        Objects.requireNonNull(r, "r is null");
        return (Pr8<Object, Object, Object, Object, Object, Object, Object, Object> & Serializable)(t1, t2, t3, t4, t5, t6, t7, t8) -> {
            r.run();
            return this.test(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Pr8<B1, B2, B3, B4, B5, B6, B7, B8> beforeApply(Fn8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        return this.beforeApply8(f);
    }

    default public <B1> Pr1<B1> beforeApply1(Fn1<? super B1, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Pr1 & Serializable)b1 -> this.tupled().test(Tuple.narrow((Tuple8)((Tuple8)f.apply(b1))));
    }

    default public <B1, B2> Pr2<B1, B2> beforeApply2(Fn2<? super B1, ? super B2, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Pr2<Object, Object> & Serializable)(b1, b2) -> this.tupled().test(Tuple.narrow((Tuple8)((Tuple8)f.apply(b1, b2))));
    }

    default public <B1, B2, B3> Pr3<B1, B2, B3> beforeApply3(Fn3<? super B1, ? super B2, ? super B3, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Pr3<Object, Object, Object> & Serializable)(b1, b2, b3) -> this.tupled().test(Tuple.narrow((Tuple8)((Tuple8)f.apply(b1, b2, b3))));
    }

    default public <B1, B2, B3, B4> Pr4<B1, B2, B3, B4> beforeApply4(Fn4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Pr4<Object, Object, Object, Object> & Serializable)(b1, b2, b3, b4) -> this.tupled().test(Tuple.narrow((Tuple8)((Tuple8)f.apply(b1, b2, b3, b4))));
    }

    default public <B1, B2, B3, B4, B5> Pr5<B1, B2, B3, B4, B5> beforeApply5(Fn5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Pr5<Object, Object, Object, Object, Object> & Serializable)(b1, b2, b3, b4, b5) -> this.tupled().test(Tuple.narrow((Tuple8)((Tuple8)f.apply(b1, b2, b3, b4, b5))));
    }

    default public <B1, B2, B3, B4, B5, B6> Pr6<B1, B2, B3, B4, B5, B6> beforeApply6(Fn6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Pr6<Object, Object, Object, Object, Object, Object> & Serializable)(b1, b2, b3, b4, b5, b6) -> this.tupled().test(Tuple.narrow((Tuple8)((Tuple8)f.apply(b1, b2, b3, b4, b5, b6))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Pr7<B1, B2, B3, B4, B5, B6, B7> beforeApply7(Fn7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Pr7<Object, Object, Object, Object, Object, Object, Object> & Serializable)(b1, b2, b3, b4, b5, b6, b7) -> this.tupled().test(Tuple.narrow((Tuple8)((Tuple8)f.apply(b1, b2, b3, b4, b5, b6, b7))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Pr8<B1, B2, B3, B4, B5, B6, B7, B8> beforeApply8(Fn8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Pr8<Object, Object, Object, Object, Object, Object, Object, Object> & Serializable)(b1, b2, b3, b4, b5, b6, b7, b8) -> this.tupled().test(Tuple.narrow((Tuple8)((Tuple8)f.apply(b1, b2, b3, b4, b5, b6, b7, b8))));
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> beforeTestOnSuccess(Pr0 p, Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (Pr8<Object, Object, Object, Object, Object, Object, Object, Object> & Serializable)(t1, t2, t3, t4, t5, t6, t7, t8) -> p.test() ? this.test(t1, t2, t3, t4, t5, t6, t7, t8) : onFailure.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> beforeTestOnSuccess(Pr0 p, Sp<? extends Boolean> onFailure) {
        return this.beforeTestOnSuccess(p, Pr8.fromSupplier(onFailure));
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> beforeTestOnSuccess(Pr0 p, Boolean onFailure) {
        return this.beforeTestOnSuccess(p, Pr8.value(onFailure));
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> beforeTestOnSuccess(Pr0 p) {
        return this.beforeTestOnSuccess(p, Pr8.empty());
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> beforeTestOnFailure(Pr0 p, Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> beforeTestOnFailure(Pr0 p, Sp<? extends Boolean> onSuccess) {
        return this.beforeTestOnFailure(p, Pr8.fromSupplier(onSuccess));
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> beforeTestOnFailure(Pr0 p, Boolean onSuccess) {
        return this.beforeTestOnFailure(p, Pr8.value(onSuccess));
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> beforeTestOnFailure(Pr0 p) {
        return this.beforeTestOnFailure(p, Pr8.empty());
    }

    default public Pr0 beforeGet(Sp<? extends Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> s) {
        Objects.requireNonNull(s, "s is null");
        return (Pr0 & Serializable)() -> this.tupled().test(Tuple.narrow((Tuple8)((Tuple8)s.get())));
    }

    default public Pr8<T8, T7, T6, T5, T4, T3, T2, T1> inverted() {
        return (Pr8<Object, Object, Object, Object, Object, Object, Object, Object> & Serializable)(t8, t7, t6, t5, t4, t3, t2, t1) -> this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public <S> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterPassingThroughApplyOn(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends S> onSuccess, Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends S> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (Pr8<Object, Object, Object, Object, Object, Object, Object, Object> & Serializable)(t1, t2, t3, t4, t5, t6, t7, t8) -> {
            Boolean result = this.test(t1, t2, t3, t4, t5, t6, t7, t8);
            Fn8.narrow(result != false ? onSuccess : onFailure).apply(t1, t2, t3, t4, t5, t6, t7, t8);
            return result;
        };
    }

    default public <S> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, S> afterPassingThroughApplyOnTo(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends S> onSuccess, Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends S> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (Fn8 & Serializable)(t1, t2, t3, t4, t5, t6, t7, t8) -> Fn8.narrow(this.test(t1, t2, t3, t4, t5, t6, t7, t8) ? onSuccess : onFailure).apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterPassingThroughAcceptOn(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onSuccess, Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (Pr8<Object, Object, Object, Object, Object, Object, Object, Object> & Serializable)(t1, t2, t3, t4, t5, t6, t7, t8) -> {
            Boolean result = this.test(t1, t2, t3, t4, t5, t6, t7, t8);
            Cs8.narrow(result != false ? onSuccess : onFailure).accept(t1, t2, t3, t4, t5, t6, t7, t8);
            return result;
        };
    }

    default public Cs8<T1, T2, T3, T4, T5, T6, T7, T8> afterPassingThroughAcceptOnTo(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onSuccess, Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> Cs8.narrow(this.test(t1, t2, t3, t4, t5, t6, t7, t8) ? onSuccess : onFailure).accept(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterPassingThroughTestOn(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onSuccess, Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (Pr8<Object, Object, Object, Object, Object, Object, Object, Object> & Serializable)(t1, t2, t3, t4, t5, t6, t7, t8) -> Pr8.narrow(this.test(t1, t2, t3, t4, t5, t6, t7, t8) ? onSuccess : onFailure).test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public <S> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterPassingThroughApply(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends S> f) {
        return this.afterPassingThroughApplyOn(f, f);
    }

    default public <S> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, S> afterPassingThroughApplyTo(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends S> f) {
        return this.afterPassingThroughApplyOnTo(f, f);
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterPassingThroughAccept(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
        return this.afterPassingThroughAcceptOn(c, c);
    }

    default public Cs8<T1, T2, T3, T4, T5, T6, T7, T8> afterPassingThroughAcceptTo(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
        return this.afterPassingThroughAcceptOnTo(c, c);
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterPassingThroughTest(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        return this.afterPassingThroughTestOn(p, p);
    }

    default public <S> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterSuccessPassingThroughApply(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends S> onSuccess) {
        return this.afterPassingThroughApplyOn(onSuccess, Fn8.empty());
    }

    default public <S> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, S> afterSuccessPassingThroughApplyTo(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends S> onSuccess) {
        return this.afterPassingThroughApplyOnTo(onSuccess, Fn8.empty());
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterSuccessPassingThroughAccept(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onSuccess) {
        return this.afterPassingThroughAcceptOn(onSuccess, Cs8.empty());
    }

    default public Cs8<T1, T2, T3, T4, T5, T6, T7, T8> afterSuccessPassingThroughAcceptTo(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onSuccess) {
        return this.afterPassingThroughAcceptOnTo(onSuccess, Cs8.empty());
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterSuccessPassingThroughTest(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onSuccess) {
        return this.afterPassingThroughTestOn(onSuccess, Pr8.empty());
    }

    default public <S> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterFailurePassingThroughApply(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends S> onFailure) {
        return this.negated().afterSuccessPassingThroughApply(onFailure);
    }

    default public <S> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, S> afterFailurePassingThroughApplyTo(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends S> onFailure) {
        return this.negated().afterSuccessPassingThroughApplyTo(onFailure);
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterFailurePassingThroughAccept(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onFailure) {
        return this.negated().afterSuccessPassingThroughAccept(onFailure);
    }

    default public Cs8<T1, T2, T3, T4, T5, T6, T7, T8> afterFailurePassingThroughAcceptTo(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onFailure) {
        return this.negated().afterSuccessPassingThroughAcceptTo(onFailure);
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> afterFailurePassingThroughTest(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onFailure) {
        return this.negated().afterSuccessPassingThroughTest(onFailure);
    }

    default public <R> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> beforePassingThroughApply(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (Pr8<Object, Object, Object, Object, Object, Object, Object, Object> & Serializable)(t1, t2, t3, t4, t5, t6, t7, t8) -> {
            f.apply(t1, t2, t3, t4, t5, t6, t7, t8);
            return this.test(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> beforePassingThroughTest(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        Objects.requireNonNull(p, "p is null");
        return (Pr8<Object, Object, Object, Object, Object, Object, Object, Object> & Serializable)(t1, t2, t3, t4, t5, t6, t7, t8) -> {
            p.test(t1, t2, t3, t4, t5, t6, t7, t8);
            return this.test(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> beforePassingThroughAccept(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
        Objects.requireNonNull(c, "c is null");
        return (Pr8<Object, Object, Object, Object, Object, Object, Object, Object> & Serializable)(t1, t2, t3, t4, t5, t6, t7, t8) -> {
            c.accept(t1, t2, t3, t4, t5, t6, t7, t8);
            return this.test(t1, t2, t3, t4, t5, t6, t7, t8);
        };
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> beforeSuccessPassingThroughTest(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (Pr8<Object, Object, Object, Object, Object, Object, Object, Object> & Serializable)(t1, t2, t3, t4, t5, t6, t7, t8) -> p.test(t1, t2, t3, t4, t5, t6, t7, t8) ? ((Boolean)this.apply(t1, t2, t3, t4, t5, t6, t7, t8)).booleanValue() : onFailure.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> beforeSuccessPassingThroughTest(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, Sp<? extends Boolean> onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Pr8.fromSupplier(onFailure));
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> beforeSuccessPassingThroughTest(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, Boolean onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Pr8.value(onFailure));
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> beforeSuccessPassingThroughTest(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        return this.beforeSuccessPassingThroughTest(p, Pr8.empty());
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> beforeFailurePassingThroughTest(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> beforeFailurePassingThroughTest(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, Sp<? extends Boolean> onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Pr8.fromSupplier(onSuccess));
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> beforeFailurePassingThroughTest(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, Boolean onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Pr8.value(onSuccess));
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> beforeFailurePassingThroughTest(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        return this.beforeFailurePassingThroughTest(p, Pr8.empty());
    }

    default public Pr1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> tupled() {
        return (Pr1 & Serializable)tuple -> this.test(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5(), tuple._6(), tuple._7(), tuple._8());
    }

    default public Fn1<T1, Fn1<T2, Fn1<T3, Fn1<T4, Fn1<T5, Fn1<T6, Fn1<T7, Pr1<T8>>>>>>>> currying() {
        return (Fn1 & Serializable)t1 -> (Fn1 & Serializable)t2 -> (Fn1 & Serializable)t3 -> (Fn1 & Serializable)t4 -> (Fn1 & Serializable)t5 -> (Fn1 & Serializable)t6 -> (Fn1 & Serializable)t7 -> (Pr1 & Serializable)t8 -> this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Prc8<T1, T2, T3, T4, T5, T6, T7, T8> checked() {
        return (arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6, arg_7) -> this.test(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6, arg_7);
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> negated() {
        return (Pr8<Object, Object, Object, Object, Object, Object, Object, Object> & Serializable)(t1, t2, t3, t4, t5, t6, t7, t8) -> !this.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> and(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        return (Pr8<Object, Object, Object, Object, Object, Object, Object, Object> & Serializable)(t1, t2, t3, t4, t5, t6, t7, t8) -> this.test(t1, t2, t3, t4, t5, t6, t7, t8) && p.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> or(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p) {
        return (Pr8<Object, Object, Object, Object, Object, Object, Object, Object> & Serializable)(t1, t2, t3, t4, t5, t6, t7, t8) -> this.test(t1, t2, t3, t4, t5, t6, t7, t8) || p.test(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> and(Pr0 p) {
        return (Pr8<Object, Object, Object, Object, Object, Object, Object, Object> & Serializable)(t1, t2, t3, t4, t5, t6, t7, t8) -> this.test(t1, t2, t3, t4, t5, t6, t7, t8) && p.test();
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> or(Pr0 p) {
        return (Pr8<Object, Object, Object, Object, Object, Object, Object, Object> & Serializable)(t1, t2, t3, t4, t5, t6, t7, t8) -> this.test(t1, t2, t3, t4, t5, t6, t7, t8) || p.test();
    }

    default public Pr8<T1, T2, T3, T4, T5, T6, T7, T8> memoized() {
        return (arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6, arg_7) -> ((Function8)super.memoized()).apply(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6, arg_7);
    }

}

package com.fiberg.iterative.function;

import com.fiberg.iterative.core.IterativeInternals;
import com.fiberg.iterative.function.Csc1;
import com.fiberg.iterative.function.Csc6;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fn6;
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
import com.fiberg.iterative.function.Pr6;
import com.fiberg.iterative.function.Prc0;
import com.fiberg.iterative.function.Prc1;
import com.fiberg.iterative.function.Prc2;
import com.fiberg.iterative.function.Prc3;
import com.fiberg.iterative.function.Prc4;
import com.fiberg.iterative.function.Prc5;
import com.fiberg.iterative.function.Prc7;
import com.fiberg.iterative.function.Prc8;
import com.fiberg.iterative.function.Predicates;
import com.fiberg.iterative.function.Rnc;
import com.fiberg.iterative.function.SneakyThrow;
import com.fiberg.iterative.function.Spc;
import io.vavr.CheckedFunction6;
import io.vavr.Tuple;
import io.vavr.Tuple6;
import java.io.Serializable;
import java.util.Objects;

@FunctionalInterface
public interface Prc6<T1, T2, T3, T4, T5, T6> extends CheckedFunction6<T1, T2, T3, T4, T5, T6, Boolean> {

    default public Boolean apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) throws Throwable {
        return this.test(t1, t2, t3, t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6> Prc6<T1, T2, T3, T4, T5, T6> narrow(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        return p;
    }

    public static <T1, T2, T3, T4, T5, T6> Prc6<T1, T2, T3, T4, T5, T6> empty() {
        return IterativeInternals::none;
    }

    public static <T1, T2, T3, T4, T5, T6> Prc6<T1, T2, T3, T4, T5, T6> value(Boolean b) {
        return (Prc6<Object, Object, Object, Object, Object, Object> & Serializable) (t1, t2, t3, t4, t5, t6) -> b;
    }

    public static <T1, T2, T3, T4, T5, T6> Prc6<T1, T2, T3, T4, T5, T6> of(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        return Prc6.narrow(p);
    }

    public static <T1, T2, T3, T4, T5, T6> Prc6<T1, T2, T3, T4, T5, T6> of1(Prc1<? super T1> f) {
        return Prc6.narrow(f.ignoring5Rt());
    }

    public static <T1, T2, T3, T4, T5, T6> Prc6<T1, T2, T3, T4, T5, T6> of2(Prc1<? super T2> f) {
        return Prc6.narrow(f.ignoring4Rt().ignoring1Lt());
    }

    public static <T1, T2, T3, T4, T5, T6> Prc6<T1, T2, T3, T4, T5, T6> of3(Prc1<? super T3> f) {
        return Prc6.narrow(f.ignoring3Rt().ignoring2Lt());
    }

    public static <T1, T2, T3, T4, T5, T6> Prc6<T1, T2, T3, T4, T5, T6> of4(Prc1<? super T4> f) {
        return Prc6.narrow(f.ignoring2Rt().ignoring3Lt());
    }

    public static <T1, T2, T3, T4, T5, T6> Prc6<T1, T2, T3, T4, T5, T6> of5(Prc1<? super T5> f) {
        return Prc6.narrow(f.ignoring1Rt().ignoring4Lt());
    }

    public static <T1, T2, T3, T4, T5, T6> Prc6<T1, T2, T3, T4, T5, T6> of6(Prc1<? super T6> f) {
        return Prc6.narrow(f.ignoring5Lt());
    }

    public static <T1, T2, T3, T4, T5, T6> Prc6<T1, T2, T3, T4, T5, T6> fromFunction(Fnc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, Boolean> f) {
        return (arg_0, arg_1, arg_2, arg_3, arg_4, arg_5) -> f.apply(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5);
    }

    public static <T1, T2, T3, T4, T5, T6> Prc6<T1, T2, T3, T4, T5, T6> fromSupplier(Spc<? extends Boolean> s) {
        return Prc6.fromFunction(Spc.narrow(s).toFunction().ignoring6());
    }

    public static <T1, T2, T3, T4, T5, T6> Prc6<T1, T2, T3, T4, T5, T6> negate(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        return Prc6.narrow(p.negated());
    }

    @SafeVarargs
    public static <T1, T2, T3, T4, T5, T6> Prc6<T1, T2, T3, T4, T5, T6> and(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> ... ps) {
        Objects.requireNonNull(ps, "ps is null");
        return Predicates.and(ps);
    }

    public static <T1, T2, T3, T4, T5, T6> Prc6<T1, T2, T3, T4, T5, T6> and(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, Prc0 ... ps) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(ps, "ps is null");
        return ps.length == 0 ? Prc6.narrow(p) : Prc6.narrow(p).and(Predicates.and(ps));
    }

    @SafeVarargs
    public static <T1, T2, T3, T4, T5, T6> Prc6<T1, T2, T3, T4, T5, T6> or(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> ... ps) {
        Objects.requireNonNull(ps, "ps is null");
        return Predicates.or(ps);
    }

    public static <T1, T2, T3, T4, T5, T6> Prc6<T1, T2, T3, T4, T5, T6> or(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, Prc0 ... ps) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(ps, "ps is null");
        return ps.length == 0 ? Prc6.narrow(p) : Prc6.narrow(p).or(Predicates.or(ps));
    }

    public static <T1, T2, T3, T4, T5, T6> Prc1<Tuple6<T1, T2, T3, T4, T5, T6>> tuple(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        return Prc6.of(p).tupled();
    }

    public static <T1, T2, T3, T4, T5, T6> Prc6<T1, T2, T3, T4, T5, T6> detuple(Prc1<? super Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> p) {
        return (Prc6<Object, Object, Object, Object, Object, Object> & Serializable) (t1, t2, t3, t4, t5, t6) -> p.test((Object) Tuple.of((Object) t1, (Object) t2, (Object) t3, (Object) t4, (Object) t5, (Object) t6));
    }

    public static <T1, T2, T3, T4, T5, T6> Prc6<T1, T2, T3, T4, T5, T6> check(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        Objects.requireNonNull(p, "p is null");
        return Pr6.narrow(p).checked();
    }

    public static <T1, T2, T3, T4, T5, T6> Prc6<T1, T2, T3, T4, T5, T6> ignore(Prc0 p) {
        return p.ignoring6();
    }

    public static <T1, T2, T3, T4, T5, T6> Prc6<T1, T2, T3, T4, T5, T6> ignore5Rt(Prc1<? super T1> p) {
        return Prc1.narrow(p).ignoring5Rt();
    }

    public static <T1, T2, T3, T4, T5, T6> Prc6<T1, T2, T3, T4, T5, T6> ignore5Lt(Prc1<? super T6> p) {
        return Prc1.narrow(p).ignoring5Lt();
    }

    public static <T1, T2, T3, T4, T5, T6> Prc6<T1, T2, T3, T4, T5, T6> ignore4Rt(Prc2<? super T1, ? super T2> p) {
        return Prc2.narrow(p).ignoring4Rt();
    }

    public static <T1, T2, T3, T4, T5, T6> Prc6<T1, T2, T3, T4, T5, T6> ignore4Lt(Prc2<? super T5, ? super T6> p) {
        return Prc2.narrow(p).ignoring4Lt();
    }

    public static <T1, T2, T3, T4, T5, T6> Prc6<T1, T2, T3, T4, T5, T6> ignore3Rt(Prc3<? super T1, ? super T2, ? super T3> p) {
        return Prc3.narrow(p).ignoring3Rt();
    }

    public static <T1, T2, T3, T4, T5, T6> Prc6<T1, T2, T3, T4, T5, T6> ignore3Lt(Prc3<? super T4, ? super T5, ? super T6> p) {
        return Prc3.narrow(p).ignoring3Lt();
    }

    public static <T1, T2, T3, T4, T5, T6> Prc6<T1, T2, T3, T4, T5, T6> ignore2Rt(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        return Prc4.narrow(p).ignoring2Rt();
    }

    public static <T1, T2, T3, T4, T5, T6> Prc6<T1, T2, T3, T4, T5, T6> ignore2Lt(Prc4<? super T3, ? super T4, ? super T5, ? super T6> p) {
        return Prc4.narrow(p).ignoring2Lt();
    }

    public static <T1, T2, T3, T4, T5, T6> Prc6<T1, T2, T3, T4, T5, T6> ignore1Rt(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return Prc5.narrow(p).ignoring1Rt();
    }

    public static <T1, T2, T3, T4, T5, T6> Prc6<T1, T2, T3, T4, T5, T6> ignore1Lt(Prc5<? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        return Prc5.narrow(p).ignoring1Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc6<T1, T2, T3, T4, T5, T6> passRt(Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, T7 t7) {
        return Prc6.narrow(p.testRt(t7));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc6<T1, T2, T3, T4, T5, T6> passRt(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, T7 t7, T8 t8) {
        return Prc6.narrow(p.testRt(t7, t8));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc6<T2, T3, T4, T5, T6, T7> passLt(Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, T1 t1) {
        return Prc6.narrow(p.testLt(t1));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc6<T3, T4, T5, T6, T7, T8> passLt(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, T1 t1, T2 t2) {
        return Prc6.narrow(p.testLt(t1, t2));
    }

    public static <T1, T2, T3, T4, T5, T6> Prc6<T6, T5, T4, T3, T2, T1> invert(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        return Prc6.narrow(p).inverted();
    }

    public boolean test(T1 var1, T2 var2, T3 var3, T4 var4, T5 var5, T6 var6) throws Throwable;

    default public Prc5<T2, T3, T4, T5, T6> testLt(T1 t1) {
        return (Prc5<Object, Object, Object, Object, Object> & Serializable) (t2, t3, t4, t5, t6) -> this.test(t1, t2, t3, t4, t5, t6);
    }

    default public Prc4<T3, T4, T5, T6> testLt(T1 t1, T2 t2) {
        return (Prc4<Object, Object, Object, Object> & Serializable) (t3, t4, t5, t6) -> this.test(t1, t2, t3, t4, t5, t6);
    }

    default public Prc3<T4, T5, T6> testLt(T1 t1, T2 t2, T3 t3) {
        return (Prc3<Object, Object, Object> & Serializable) (t4, t5, t6) -> this.test(t1, t2, t3, t4, t5, t6);
    }

    default public Prc2<T5, T6> testLt(T1 t1, T2 t2, T3 t3, T4 t4) {
        return (Prc2<Object, Object> & Serializable) (t5, t6) -> this.test(t1, t2, t3, t4, t5, t6);
    }

    default public Prc1<T6> testLt(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return (Prc1 & Serializable) t6 -> this.test(t1, t2, t3, t4, t5, t6);
    }

    default public Prc5<T1, T2, T3, T4, T5> testRt(T6 t6) {
        return (Prc5<Object, Object, Object, Object, Object> & Serializable) (t1, t2, t3, t4, t5) -> this.test(t1, t2, t3, t4, t5, t6);
    }

    default public Prc4<T1, T2, T3, T4> testRt(T5 t5, T6 t6) {
        return (Prc4<Object, Object, Object, Object> & Serializable) (t1, t2, t3, t4) -> this.test(t1, t2, t3, t4, t5, t6);
    }

    default public Prc3<T1, T2, T3> testRt(T4 t4, T5 t5, T6 t6) {
        return (Prc3<Object, Object, Object> & Serializable) (t1, t2, t3) -> this.test(t1, t2, t3, t4, t5, t6);
    }

    default public Prc2<T1, T2> testRt(T3 t3, T4 t4, T5 t5, T6 t6) {
        return (Prc2<Object, Object> & Serializable) (t1, t2) -> this.test(t1, t2, t3, t4, t5, t6);
    }

    default public Prc1<T1> testRt(T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return (Prc1 & Serializable) t1 -> this.test(t1, t2, t3, t4, t5, t6);
    }

    default public Fnc6<T1, T2, T3, T4, T5, T6, Boolean> toFunction() {
        return (arg_0, arg_1, arg_2, arg_3, arg_4, arg_5) -> this.test(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5);
    }

    default public Csc6<T1, T2, T3, T4, T5, T6> toConsumer() {
        return (arg_0, arg_1, arg_2, arg_3, arg_4, arg_5) -> this.test(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5);
    }

    default public Prc0 toPredicate(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return (Prc0 & Serializable) () -> this.test(t1, t2, t3, t4, t5, t6);
    }

    default public Spc<Boolean> toSupplier(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return this.toPredicate(t1, t2, t3, t4, t5, t6).toSupplier();
    }

    default public Rnc toRunnable(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return this.toPredicate(t1, t2, t3, t4, t5, t6).toRunnable();
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> afterRunOn(Rnc onSuccess, Rnc onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (Prc6<Object, Object, Object, Object, Object, Object> & Serializable) (t1, t2, t3, t4, t5, t6) -> {
            Boolean value = this.test(t1, t2, t3, t4, t5, t6);
            (value != false ? onSuccess : onFailure).run();
            return value;
        };
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> afterTestOn(Prc1<Boolean> onSuccess, Prc1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.toFunction(), onFailure.toFunction());
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> afterTestOn(Prc0 onSuccess, Prc0 onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterTestOn(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> afterApplyOn(Fnc1<Boolean, Boolean> onSuccess, Fnc1<Boolean, Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return Prc6.fromFunction(this.afterApplyOnTo(onSuccess, onFailure));
    }

    default public <R> Fnc6<T1, T2, T3, T4, T5, T6, R> afterApplyOnTo(Fnc1<Boolean, ? extends R> onSuccess, Fnc1<Boolean, ? extends R> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (Fnc6 & Serializable) (t1, t2, t3, t4, t5, t6) -> {
            Boolean value = this.test(t1, t2, t3, t4, t5, t6);
            return (value != false ? onSuccess : onFailure).apply(value);
        };
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> afterApplyOn(Fnc0<Boolean> onSuccess, Fnc0<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onFailure.ignoring1(), onFailure.ignoring1());
    }

    default public <R> Fnc6<T1, T2, T3, T4, T5, T6, R> afterApplyOnTo(Fnc0<? extends R> onSuccess, Fnc0<? extends R> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOnTo(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> afterGetOn(Spc<Boolean> onSuccess, Spc<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Csc6<T1, T2, T3, T4, T5, T6> afterAcceptOnTo(Csc1<Boolean> onSuccess, Csc1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOnTo(onSuccess.toFunction(null), onFailure.toFunction(null)).toConsumer();
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> afterAcceptOn(Csc1<Boolean> onSuccess, Csc1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.toFunction(null), onFailure.toFunction(null));
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> afterRun(Rnc r) {
        return this.afterRunOn(r, r);
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> afterTest(Prc1<Boolean> p) {
        return this.afterTestOn(p, p);
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> afterTest(Prc0 p) {
        return this.afterTestOn(p, p);
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> afterApply(Fnc1<Boolean, Boolean> f) {
        return this.afterApplyOn(f, f);
    }

    default public <R> Fnc6<T1, T2, T3, T4, T5, T6, R> afterApplyTo(Fnc1<Boolean, ? extends R> f) {
        return this.afterApplyOnTo(f, f);
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> afterApply(Fnc0<Boolean> f) {
        return this.afterApplyOn(f, f);
    }

    default public <R> Fnc6<T1, T2, T3, T4, T5, T6, R> afterApplyTo(Fnc0<? extends R> f) {
        return this.afterApplyOnTo(f, f);
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> afterGet(Spc<Boolean> s) {
        return this.afterGetOn(s, s);
    }

    default public Csc6<T1, T2, T3, T4, T5, T6> afterAcceptTo(Csc1<Boolean> c) {
        return this.afterAcceptOnTo(c, c);
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> afterAccept(Csc1<Boolean> c) {
        return this.afterAcceptOn(c, c);
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> beforeWrap(Pr1<? super Spc<Boolean>> wrap) {
        return Pr6.fromFunction(this.beforeWrapTo(wrap.toFunction()));
    }

    default public <W> Fn6<T1, T2, T3, T4, T5, T6, W> beforeWrapTo(Fn1<? super Spc<Boolean>, ? extends W> wrap) {
        return (Fn6 & Serializable) (t1, t2, t3, t4, t5, t6) -> wrap.apply(this.toSupplier(t1, t2, t3, t4, t5, t6));
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> afterRunOnSuccess(Rnc r) {
        return this.afterRunOn(r, Rnc.empty());
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> afterTestOnSuccess(Prc1<Boolean> p) {
        return this.afterTestOn(p, Prc1.empty());
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> afterTestOnSuccess(Prc0 p) {
        return this.afterTestOn(p, Prc0.empty());
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> afterApplyOnSuccess(Fnc1<Boolean, Boolean> f) {
        return this.afterApplyOn(f, Fnc1.empty());
    }

    default public <R> Fnc6<T1, T2, T3, T4, T5, T6, R> afterApplyOnSuccessTo(Fnc1<Boolean, ? extends R> f) {
        return this.afterApplyOnTo(f, Fnc1.empty());
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> afterApplyOnSuccess(Fnc0<Boolean> f) {
        return this.afterApplyOn(f, Fnc0.empty());
    }

    default public <R> Fnc6<T1, T2, T3, T4, T5, T6, R> afterApplyOnSuccessTo(Fnc0<? extends R> f) {
        return this.afterApplyOnTo(f, Fnc0.empty());
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> afterGetOnSuccess(Spc<Boolean> s) {
        return this.afterGetOn(s, Spc.empty());
    }

    default public Csc6<T1, T2, T3, T4, T5, T6> afterAcceptOnSuccessTo(Csc1<Boolean> c) {
        return this.afterAcceptOnTo(c, Csc1.empty());
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> afterAcceptOnSuccess(Csc1<Boolean> c) {
        return this.afterAcceptOn(c, Csc1.empty());
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> afterRunOnFailure(Rnc r) {
        return this.negated().afterRunOnSuccess(r);
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> afterTestOnFailure(Prc1<Boolean> p) {
        return this.negated().afterTestOnSuccess(p);
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> afterTestOnFailure(Prc0 p) {
        return this.negated().afterTestOnSuccess(p);
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> afterApplyOnFailure(Fnc1<Boolean, Boolean> f) {
        return this.negated().afterApplyOnSuccess(f);
    }

    default public <R> Fnc6<T1, T2, T3, T4, T5, T6, R> afterApplyOnFailureTo(Fnc1<Boolean, ? extends R> f) {
        return this.negated().afterApplyOnSuccessTo(f);
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> afterApplyOnFailure(Fnc0<Boolean> f) {
        return this.negated().afterApplyOnSuccess(f);
    }

    default public <R> Fnc6<T1, T2, T3, T4, T5, T6, R> afterApplyOnFailureTo(Fnc0<? extends R> f) {
        return this.negated().afterApplyOnSuccessTo(f);
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> afterGetOnFailure(Spc<Boolean> s) {
        return this.negated().afterGetOnSuccess(s);
    }

    default public Csc6<T1, T2, T3, T4, T5, T6> afterAcceptOnFailureTo(Csc1<Boolean> c) {
        return this.negated().afterAcceptOnSuccessTo(c);
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> afterAcceptOnFailure(Csc1<Boolean> c) {
        return this.negated().afterAcceptOnSuccess(c);
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> beforeRun(Rnc r) {
        Objects.requireNonNull(r, "r is null");
        return (Prc6<Object, Object, Object, Object, Object, Object> & Serializable) (t1, t2, t3, t4, t5, t6) -> {
            r.run();
            return this.test(t1, t2, t3, t4, t5, t6);
        };
    }

    default public <B1, B2, B3, B4, B5, B6> Prc6<B1, B2, B3, B4, B5, B6> beforeApply(Fnc6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> f) {
        return this.beforeApply6(f);
    }

    default public <B1> Prc1<B1> beforeApply1(Fnc1<? super B1, ? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Prc1 & Serializable) b1 -> this.tupled().test((Object) Tuple.narrow((Tuple6) ((Tuple6) f.apply(b1))));
    }

    default public <B1, B2> Prc2<B1, B2> beforeApply2(Fnc2<? super B1, ? super B2, ? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Prc2<Object, Object> & Serializable) (b1, b2) -> this.tupled().test((Object) Tuple.narrow((Tuple6) ((Tuple6) f.apply(b1, b2))));
    }

    default public <B1, B2, B3> Prc3<B1, B2, B3> beforeApply3(Fnc3<? super B1, ? super B2, ? super B3, ? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Prc3<Object, Object, Object> & Serializable) (b1, b2, b3) -> this.tupled().test((Object) Tuple.narrow((Tuple6) ((Tuple6) f.apply(b1, b2, b3))));
    }

    default public <B1, B2, B3, B4> Prc4<B1, B2, B3, B4> beforeApply4(Fnc4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Prc4<Object, Object, Object, Object> & Serializable) (b1, b2, b3, b4) -> this.tupled().test((Object) Tuple.narrow((Tuple6) ((Tuple6) f.apply(b1, b2, b3, b4))));
    }

    default public <B1, B2, B3, B4, B5> Prc5<B1, B2, B3, B4, B5> beforeApply5(Fnc5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Prc5<Object, Object, Object, Object, Object> & Serializable) (b1, b2, b3, b4, b5) -> this.tupled().test((Object) Tuple.narrow((Tuple6) ((Tuple6) f.apply(b1, b2, b3, b4, b5))));
    }

    default public <B1, B2, B3, B4, B5, B6> Prc6<B1, B2, B3, B4, B5, B6> beforeApply6(Fnc6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Prc6<Object, Object, Object, Object, Object, Object> & Serializable) (b1, b2, b3, b4, b5, b6) -> this.tupled().test((Object) Tuple.narrow((Tuple6) ((Tuple6) f.apply(b1, b2, b3, b4, b5, b6))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Prc7<B1, B2, B3, B4, B5, B6, B7> beforeApply7(Fnc7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Prc7<Object, Object, Object, Object, Object, Object, Object> & Serializable) (b1, b2, b3, b4, b5, b6, b7) -> this.tupled().test((Object) Tuple.narrow((Tuple6) ((Tuple6) f.apply(b1, b2, b3, b4, b5, b6, b7))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Prc8<B1, B2, B3, B4, B5, B6, B7, B8> beforeApply8(Fnc8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Prc8<Object, Object, Object, Object, Object, Object, Object, Object> & Serializable) (b1, b2, b3, b4, b5, b6, b7, b8) -> this.tupled().test((Object) Tuple.narrow((Tuple6) ((Tuple6) f.apply(b1, b2, b3, b4, b5, b6, b7, b8))));
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> beforeTestOnSuccess(Prc0 p, Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (Prc6<Object, Object, Object, Object, Object, Object> & Serializable) (t1, t2, t3, t4, t5, t6) -> p.test() != false ? this.test(t1, t2, t3, t4, t5, t6) : onFailure.test(t1, t2, t3, t4, t5, t6);
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> beforeTestOnSuccess(Prc0 p, Spc<? extends Boolean> onFailure) {
        return this.beforeTestOnSuccess(p, Prc6.fromSupplier(onFailure));
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> beforeTestOnSuccess(Prc0 p, Boolean onFailure) {
        return this.beforeTestOnSuccess(p, Prc6.value(onFailure));
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> beforeTestOnSuccess(Prc0 p) {
        return this.beforeTestOnSuccess(p, Prc6.empty());
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> beforeTestOnFailure(Prc0 p, Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> beforeTestOnFailure(Prc0 p, Spc<? extends Boolean> onSuccess) {
        return this.beforeTestOnFailure(p, Prc6.fromSupplier(onSuccess));
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> beforeTestOnFailure(Prc0 p, Boolean onSuccess) {
        return this.beforeTestOnFailure(p, Prc6.value(onSuccess));
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> beforeTestOnFailure(Prc0 p) {
        return this.beforeTestOnFailure(p, Prc6.empty());
    }

    default public Prc0 beforeGet(Spc<? extends Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>> s) {
        Objects.requireNonNull(s, "s is null");
        return (Prc0 & Serializable) () -> this.tupled().test((Object) Tuple.narrow((Tuple6) ((Tuple6) s.get())));
    }

    default public Prc6<T6, T5, T4, T3, T2, T1> inverted() {
        return (Prc6<Object, Object, Object, Object, Object, Object> & Serializable) (t6, t5, t4, t3, t2, t1) -> this.test(t1, t2, t3, t4, t5, t6);
    }

    default public <S> Prc6<T1, T2, T3, T4, T5, T6> afterPassingThroughApplyOn(Fnc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends S> onSuccess, Fnc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends S> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (Prc6<Object, Object, Object, Object, Object, Object> & Serializable) (t1, t2, t3, t4, t5, t6) -> {
            Boolean result = this.test(t1, t2, t3, t4, t5, t6);
            Fnc6.narrow(result != false ? onSuccess : onFailure).apply(t1, t2, t3, t4, t5, t6);
            return result;
        };
    }

    default public <S> Fnc6<T1, T2, T3, T4, T5, T6, S> afterPassingThroughApplyOnTo(Fnc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends S> onSuccess, Fnc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends S> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (Fnc6 & Serializable) (t1, t2, t3, t4, t5, t6) -> Fnc6.narrow(this.test(t1, t2, t3, t4, t5, t6) ? onSuccess : onFailure).apply(t1, t2, t3, t4, t5, t6);
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> afterPassingThroughAcceptOn(Csc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onSuccess, Csc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (Prc6<Object, Object, Object, Object, Object, Object> & Serializable) (t1, t2, t3, t4, t5, t6) -> {
            Boolean result = this.test(t1, t2, t3, t4, t5, t6);
            Csc6.narrow(result != false ? onSuccess : onFailure).accept(t1, t2, t3, t4, t5, t6);
            return result;
        };
    }

    default public Csc6<T1, T2, T3, T4, T5, T6> afterPassingThroughAcceptOnTo(Csc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onSuccess, Csc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4, t5, t6) -> Csc6.narrow(this.test(t1, t2, t3, t4, t5, t6) ? onSuccess : onFailure).accept(t1, t2, t3, t4, t5, t6);
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> afterPassingThroughTestOn(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onSuccess, Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (Prc6<Object, Object, Object, Object, Object, Object> & Serializable) (t1, t2, t3, t4, t5, t6) -> Prc6.narrow(this.test(t1, t2, t3, t4, t5, t6) ? onSuccess : onFailure).test(t1, t2, t3, t4, t5, t6);
    }

    default public <S> Prc6<T1, T2, T3, T4, T5, T6> afterPassingThroughApply(Fnc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends S> f) {
        return this.afterPassingThroughApplyOn(f, f);
    }

    default public <S> Fnc6<T1, T2, T3, T4, T5, T6, S> afterPassingThroughApplyTo(Fnc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends S> f) {
        return this.afterPassingThroughApplyOnTo(f, f);
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> afterPassingThroughAccept(Csc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c) {
        return this.afterPassingThroughAcceptOn(c, c);
    }

    default public Csc6<T1, T2, T3, T4, T5, T6> afterPassingThroughAcceptTo(Csc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c) {
        return this.afterPassingThroughAcceptOnTo(c, c);
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> afterPassingThroughTest(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        return this.afterPassingThroughTestOn(p, p);
    }

    default public <S> Prc6<T1, T2, T3, T4, T5, T6> afterSuccessPassingThroughApply(Fnc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends S> onSuccess) {
        return this.afterPassingThroughApplyOn(onSuccess, Fnc6.empty());
    }

    default public <S> Fnc6<T1, T2, T3, T4, T5, T6, S> afterSuccessPassingThroughApplyTo(Fnc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends S> onSuccess) {
        return this.afterPassingThroughApplyOnTo(onSuccess, Fnc6.empty());
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> afterSuccessPassingThroughAccept(Csc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onSuccess) {
        return this.afterPassingThroughAcceptOn(onSuccess, Csc6.empty());
    }

    default public Csc6<T1, T2, T3, T4, T5, T6> afterSuccessPassingThroughAcceptTo(Csc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onSuccess) {
        return this.afterPassingThroughAcceptOnTo(onSuccess, Csc6.empty());
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> afterSuccessPassingThroughTest(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onSuccess) {
        return this.afterPassingThroughTestOn(onSuccess, Prc6.empty());
    }

    default public <S> Prc6<T1, T2, T3, T4, T5, T6> afterFailurePassingThroughApply(Fnc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends S> onFailure) {
        return this.negated().afterSuccessPassingThroughApply(onFailure);
    }

    default public <S> Fnc6<T1, T2, T3, T4, T5, T6, S> afterFailurePassingThroughApplyTo(Fnc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends S> onFailure) {
        return this.negated().afterSuccessPassingThroughApplyTo(onFailure);
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> afterFailurePassingThroughAccept(Csc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onFailure) {
        return this.negated().afterSuccessPassingThroughAccept(onFailure);
    }

    default public Csc6<T1, T2, T3, T4, T5, T6> afterFailurePassingThroughAcceptTo(Csc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onFailure) {
        return this.negated().afterSuccessPassingThroughAcceptTo(onFailure);
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> afterFailurePassingThroughTest(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onFailure) {
        return this.negated().afterSuccessPassingThroughTest(onFailure);
    }

    default public <R> Prc6<T1, T2, T3, T4, T5, T6> beforePassingThroughApply(Fnc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (Prc6<Object, Object, Object, Object, Object, Object> & Serializable) (t1, t2, t3, t4, t5, t6) -> {
            f.apply(t1, t2, t3, t4, t5, t6);
            return this.test(t1, t2, t3, t4, t5, t6);
        };
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> beforePassingThroughTest(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        Objects.requireNonNull(p, "p is null");
        return (Prc6<Object, Object, Object, Object, Object, Object> & Serializable) (t1, t2, t3, t4, t5, t6) -> {
            p.test(t1, t2, t3, t4, t5, t6);
            return this.test(t1, t2, t3, t4, t5, t6);
        };
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> beforePassingThroughAccept(Csc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c) {
        Objects.requireNonNull(c, "c is null");
        return (Prc6<Object, Object, Object, Object, Object, Object> & Serializable) (t1, t2, t3, t4, t5, t6) -> {
            c.accept(t1, t2, t3, t4, t5, t6);
            return this.test(t1, t2, t3, t4, t5, t6);
        };
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> beforeSuccessPassingThroughTest(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (Prc6<Object, Object, Object, Object, Object, Object> & Serializable) (t1, t2, t3, t4, t5, t6) -> p.test(t1, t2, t3, t4, t5, t6) ? this.test(t1, t2, t3, t4, t5, t6) : onFailure.test(t1, t2, t3, t4, t5, t6);
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> beforeSuccessPassingThroughTest(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, Spc<? extends Boolean> onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Prc6.fromSupplier(onFailure));
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> beforeSuccessPassingThroughTest(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, Boolean onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Prc6.value(onFailure));
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> beforeSuccessPassingThroughTest(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        return this.beforeSuccessPassingThroughTest(p, Prc6.empty());
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> beforeFailurePassingThroughTest(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> beforeFailurePassingThroughTest(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, Spc<? extends Boolean> onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Prc6.fromSupplier(onSuccess));
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> beforeFailurePassingThroughTest(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, Boolean onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Prc6.value(onSuccess));
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> beforeFailurePassingThroughTest(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        return this.beforeFailurePassingThroughTest(p, Prc6.empty());
    }

    default public Prc1<Tuple6<T1, T2, T3, T4, T5, T6>> tupled() {
        return (Prc1 & Serializable) tuple -> this.test(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5(), tuple._6());
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> unchecked() {
        return (Pr6<Object, Object, Object, Object, Object, Object> & Serializable) (t1, t2, t3, t4, t5, t6) -> {
            try {
                return this.test(t1, t2, t3, t4, t5, t6);
            }
            catch (Throwable t) {
                return (Boolean) SneakyThrow.sneakyThrow(t);
            }

        };
    }

    default public Fnc1<T1, Fnc1<T2, Fnc1<T3, Fnc1<T4, Fnc1<T5, Prc1<T6>>>>>> currying() {
        return (Fnc1 & Serializable) t1 -> (Fnc1 & Serializable) t2 -> (Fnc1 & Serializable) t3 -> (Fnc1 & Serializable) t4 -> (Fnc1 & Serializable) t5 -> (Prc1 & Serializable) t6 -> this.test(t1, t2, t3, t4, t5, t6);
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> negated() {
        return (Prc6<Object, Object, Object, Object, Object, Object> & Serializable) (t1, t2, t3, t4, t5, t6) -> !this.test(t1, t2, t3, t4, t5, t6);
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> and(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        return (Prc6<Object, Object, Object, Object, Object, Object> & Serializable) (t1, t2, t3, t4, t5, t6) -> this.test(t1, t2, t3, t4, t5, t6) && p.test(t1, t2, t3, t4, t5, t6);
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> or(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p) {
        return (Prc6<Object, Object, Object, Object, Object, Object> & Serializable) (t1, t2, t3, t4, t5, t6) -> this.test(t1, t2, t3, t4, t5, t6) || p.test(t1, t2, t3, t4, t5, t6);
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> and(Prc0 p) {
        return (Prc6<Object, Object, Object, Object, Object, Object> & Serializable) (t1, t2, t3, t4, t5, t6) -> this.test(t1, t2, t3, t4, t5, t6) && p.test() != false;
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> or(Prc0 p) {
        return (Prc6<Object, Object, Object, Object, Object, Object> & Serializable) (t1, t2, t3, t4, t5, t6) -> this.test(t1, t2, t3, t4, t5, t6) || p.test() != false;
    }

    default public <I1> Prc7<I1, T1, T2, T3, T4, T5, T6> ignoring1Lt() {
        return (Prc7<Object, Object, Object, Object, Object, Object, Object> & Serializable) (i1, t1, t2, t3, t4, t5, t6) -> this.test(t1, t2, t3, t4, t5, t6);
    }

    default public <I1> Prc7<T1, T2, T3, T4, T5, T6, I1> ignoring1Rt() {
        return (Prc7<Object, Object, Object, Object, Object, Object, Object> & Serializable) (t1, t2, t3, t4, t5, t6, i1) -> this.test(t1, t2, t3, t4, t5, t6);
    }

    default public <I1, I2> Prc8<I1, I2, T1, T2, T3, T4, T5, T6> ignoring2Lt() {
        return (Prc8<Object, Object, Object, Object, Object, Object, Object, Object> & Serializable) (i1, i2, t1, t2, t3, t4, t5, t6) -> this.test(t1, t2, t3, t4, t5, t6);
    }

    default public <I1, I2> Prc8<T1, T2, T3, T4, T5, T6, I1, I2> ignoring2Rt() {
        return (Prc8<Object, Object, Object, Object, Object, Object, Object, Object> & Serializable) (t1, t2, t3, t4, t5, t6, i1, i2) -> this.test(t1, t2, t3, t4, t5, t6);
    }

    default public Prc6<T1, T2, T3, T4, T5, T6> memoized() {
        return (arg_0, arg_1, arg_2, arg_3, arg_4, arg_5) -> ((CheckedFunction6) super.memoized()).apply(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5);
    }

    default public Pr6<T1, T2, T3, T4, T5, T6> recover(Fn1<? super Throwable, ? extends Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6>> recover) {
        Objects.requireNonNull(recover, "recover is null");
        return (Pr6<Object, Object, Object, Object, Object, Object> & Serializable) (t1, t2, t3, t4, t5, t6) -> {
            try {
                return this.test(t1, t2, t3, t4, t5, t6);
            }
            catch (Throwable throwable) {
                Pr6 pred = (Pr6) recover.apply(throwable);
                Objects.requireNonNull(pred, () -> "recover return null for " + throwable.getClass() + ": " + throwable.getMessage());
                return pred.test(t1, t2, t3, t4, t5, t6);
            }

        };
    }

}

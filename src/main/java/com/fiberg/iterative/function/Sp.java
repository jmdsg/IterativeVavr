package com.fiberg.iterative.function;

import com.fiberg.iterative.core.IterativeInternals;
import com.fiberg.iterative.function.Cs1;
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
import com.fiberg.iterative.function.Rn;
import com.fiberg.iterative.function.Spc;
import io.vavr.Function0;
import io.vavr.Tuple0;
import io.vavr.Value;
import io.vavr.control.Option;
import io.vavr.control.Try;
import java.io.Serializable;
import java.util.Objects;
import java.util.function.Supplier;

@FunctionalInterface
public interface Sp<R> extends Supplier<R>, Function0<R>, Fn0<R> {

    @Override
    public R get();

    public static <R> Sp<R> narrow(Sp<? extends R> s) {
        return s;
    }

    public static <R> Sp<R> empty() {
        return IterativeInternals::none;
    }

    public static <R> Sp<R> value(R r) {
        return (Sp<Object> & Serializable) () -> r;
    }

    public static <R> Sp<R> of(Sp<? extends R> s) {
        return Sp.narrow(s);
    }

    public static <R> Sp<R> unchecked(Spc<? extends R> s) {
        Objects.requireNonNull(s, "s is null");
        return Spc.narrow(s).unchecked();
    }

    public static <T1, R> Sp<R> pass(Fn1<? super T1, ? extends R> f, T1 t1) {
        return Fn1.narrow(f).toSupplier(t1);
    }

    public static <T1, T2, R> Sp<R> pass(Fn2<? super T1, ? super T2, ? extends R> f, T1 t1, T2 t2) {
        return Fn2.narrow(f).toSupplier(t1, t2);
    }

    public static <T1, T2, T3, R> Sp<R> pass(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f, T1 t1, T2 t2, T3 t3) {
        return Fn3.narrow(f).toSupplier(t1, t2, t3);
    }

    public static <T1, T2, T3, T4, R> Sp<R> pass(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4) {
        return Fn4.narrow(f).toSupplier(t1, t2, t3, t4);
    }

    public static <T1, T2, T3, T4, T5, R> Sp<R> pass(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return Fn5.narrow(f).toSupplier(t1, t2, t3, t4, t5);
    }

    public static <T1, T2, T3, T4, T5, T6, R> Sp<R> pass(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return Fn6.narrow(f).toSupplier(t1, t2, t3, t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Sp<R> pass(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return Fn7.narrow(f).toSupplier(t1, t2, t3, t4, t5, t6, t7);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Sp<R> pass(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Fn8.narrow(f).toSupplier(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    public static <T1, R> R passAndGet(Fn1<? super T1, ? extends R> f, T1 t1) {
        return Sp.pass(f, t1).get();
    }

    public static <T1, T2, R> R passAndGet(Fn2<? super T1, ? super T2, ? extends R> f, T1 t1, T2 t2) {
        return Sp.pass(f, t1, t2).get();
    }

    public static <T1, T2, T3, R> R passAndGet(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f, T1 t1, T2 t2, T3 t3) {
        return Sp.pass(f, t1, t2, t3).get();
    }

    public static <T1, T2, T3, T4, R> R passAndGet(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4) {
        return Sp.pass(f, t1, t2, t3, t4).get();
    }

    public static <T1, T2, T3, T4, T5, R> R passAndGet(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return Sp.pass(f, t1, t2, t3, t4, t5).get();
    }

    public static <T1, T2, T3, T4, T5, T6, R> R passAndGet(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return Sp.pass(f, t1, t2, t3, t4, t5, t6).get();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> R passAndGet(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return Sp.pass(f, t1, t2, t3, t4, t5, t6, t7).get();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> R passAndGet(Fn8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Sp.pass(f, t1, t2, t3, t4, t5, t6, t7, t8).get();
    }

    public static <R> Sp<Option<R>> lift(Sp<? extends R> s) {
        Objects.requireNonNull(s, "s is null");
        return Sp.liftTry(s).afterApply(Value::toOption);
    }

    public static <R> Sp<Try<R>> liftTry(Sp<? extends R> s) {
        Objects.requireNonNull(s, "s is null");
        return s.beforeWrap(Try::of);
    }

    default public R apply() {
        return this.get();
    }

    @Override
    default public Rn toRunnable() {
        return this::get;
    }

    default public Fn0<R> toFunction() {
        return this::get;
    }

    @Override
    default public Sp<R> afterRun(Rn r) {
        Objects.requireNonNull(r, "r is null");
        return (Sp<Object> & Serializable) () -> {
            R value = this.get();
            r.run();
            return value;
        };
    }

    @Override
    default public Rn afterRunTo(Rn r) {
        Objects.requireNonNull(r, "r is null");
        return () -> {
            this.get();
            r.run();
        };
    }

    @Override
    default public <V> Sp<V> afterApply(Fn1<? super R, ? extends V> f) {
        return this.afterApplyTo(f).toSupplier();
    }

    default public <V> Fn0<V> afterApplyTo(Fn1<? super R, ? extends V> f) {
        Objects.requireNonNull(f, "f is null");
        return (Fn0 & Serializable) () -> f.apply(this.get());
    }

    @Override
    default public <V> Sp<V> afterApply(Fn0<? extends V> f) {
        return this.afterApplyTo(f).toSupplier();
    }

    default public <V> Fn0<V> afterApplyTo(Fn0<? extends V> f) {
        Objects.requireNonNull(f, "f is null");
        return (Fn0 & Serializable) () -> f.ignoring1().apply(this.get());
    }

    @Override
    default public <V> Fn0<V> afterGet(Sp<? extends V> s) {
        Objects.requireNonNull(s, "s is null");
        return (Fn0 & Serializable) () -> s.ignoring1().apply(this.get());
    }

    default public Sp<Boolean> afterTest(Pr1<? super R> p) {
        return this.afterTestTo(p).toSupplier();
    }

    @Override
    default public Pr0 afterTestTo(Pr1<? super R> p) {
        Objects.requireNonNull(p, "p is null");
        return (Pr0 & Serializable) () -> p.test(this.get());
    }

    @Override
    default public Rn afterAcceptTo(Cs1<? super R> c) {
        Objects.requireNonNull(c, "c is null");
        return () -> c.accept(this.get());
    }

    @Override
    default public Sp<R> afterAccept(Cs1<? super R> c) {
        Objects.requireNonNull(c, "c is null");
        return (Sp<Object> & Serializable) () -> {
            R value = this.get();
            c.accept(value);
            return value;
        };
    }

    @Override
    default public <W> Sp<W> beforeWrap(Fn1<? super Spc<R>, ? extends W> wrap) {
        Objects.requireNonNull(wrap, "wrap is null");
        return (Sp<Object> & Serializable) () -> wrap.apply(this.checked());
    }

    @Override
    default public Sp<R> beforeRun(Rn r) {
        Objects.requireNonNull(r, "r is null");
        return (Sp<Object> & Serializable) () -> {
            r.run();
            return this.get();
        };
    }

    @Override
    default public Sp<R> beforeTestOnSuccess(Pr0 p, Sp<? extends R> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (Sp<Object> & Serializable) () -> p.test() ? this.apply() : onFailure.get();
    }

    @Override
    default public Sp<R> beforeTestOnSuccess(Pr0 p, R onFailure) {
        return this.beforeTestOnSuccess(p, Sp.value(onFailure));
    }

    @Override
    default public Sp<R> beforeTestOnSuccess(Pr0 p) {
        return this.beforeTestOnSuccess(p, Sp.empty());
    }

    @Override
    default public Sp<R> beforeTestOnFailure(Pr0 p, Sp<? extends R> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), (Sp) onSuccess);
    }

    @Override
    default public Sp<R> beforeTestOnFailure(Pr0 p, R onSuccess) {
        return this.beforeTestOnFailure(p, Sp.value(onSuccess));
    }

    @Override
    default public Sp<R> beforeTestOnFailure(Pr0 p) {
        return this.beforeTestOnFailure(p, Sp.empty());
    }

    @Override
    default public Sp<Option<R>> lift() {
        return Sp.lift(this);
    }

    @Override
    default public Sp<Try<R>> liftTry() {
        return Sp.liftTry(this);
    }

    @Override
    default public Spc<R> checked() {
        return this::get;
    }

    @Override
    default public <T1> Fn1<T1, R> ignoring1() {
        return (Fn1 & Serializable) t1 -> this.get();
    }

    @Override
    default public <T1, T2> Fn2<T1, T2, R> ignoring2() {
        return (Fn2 & Serializable) (t1, t2) -> this.get();
    }

    @Override
    default public <T1, T2, T3> Fn3<T1, T2, T3, R> ignoring3() {
        return (Fn3 & Serializable) (t1, t2, t3) -> this.get();
    }

    @Override
    default public <T1, T2, T3, T4> Fn4<T1, T2, T3, T4, R> ignoring4() {
        return (Fn4 & Serializable) (t1, t2, t3, t4) -> this.get();
    }

    @Override
    default public <T1, T2, T3, T4, T5> Fn5<T1, T2, T3, T4, T5, R> ignoring5() {
        return (Fn5 & Serializable) (t1, t2, t3, t4, t5) -> this.get();
    }

    @Override
    default public <T1, T2, T3, T4, T5, T6> Fn6<T1, T2, T3, T4, T5, T6, R> ignoring6() {
        return (Fn6 & Serializable) (t1, t2, t3, t4, t5, t6) -> this.get();
    }

    @Override
    default public <T1, T2, T3, T4, T5, T6, T7> Fn7<T1, T2, T3, T4, T5, T6, T7, R> ignoring7() {
        return (Fn7 & Serializable) (t1, t2, t3, t4, t5, t6, t7) -> this.get();
    }

    @Override
    default public <T1, T2, T3, T4, T5, T6, T7, T8> Fn8<T1, T2, T3, T4, T5, T6, T7, T8, R> ignoring8() {
        return (Fn8 & Serializable) (t1, t2, t3, t4, t5, t6, t7, t8) -> this.get();
    }

    @Override
    default public Fn1<Tuple0, R> tupled() {
        return Fn0.super.tupled();
    }

    @Override
    default public Sp<R> curried() {
        return ((Fn0) Fn0.super.curried())::apply;
    }

    @Override
    default public Sp<R> reversed() {
        return ((Fn0) Fn0.super.reversed())::apply;
    }

    @Override
    default public Sp<R> memoized() {
        return ((Fn0) Fn0.super.memoized())::apply;
    }

}

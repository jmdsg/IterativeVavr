package com.fiberg.iterative.function;

import com.fiberg.iterative.core.Wither;
import io.vavr.collection.Stream;

import java.util.Arrays;

interface Predicates {

    public static Pr0 and(Pr0 ... ps) {
        return () -> {
            boolean b = true;
            if (ps.length == 0) {
                return false;
            }
            for (int i = 0; i < ps.length && b; ++i) {
                b = ps[i].test();
            }
            return b;
        };
    }

    public static Pr0 or(Pr0 ... ps) {
        return () -> {
            boolean b = false;
            if (ps.length == 0) {
                return false;
            }
            for (int i = 0; i < ps.length && !b; ++i) {
                b = ps[i].test();
            }
            return b;
        };
    }

    public static Prc0 and(Prc0 ... ps) {
        return () -> {
            if (ps.length == 0) {
                return false;
            }
            boolean b = true;
            for (int i = 0; i < ps.length && b; ++i) {
                b = ps[i].test();
            }
            return b;
        };
    }

    public static Prc0 or(Prc0 ... ps) {
        return () -> {
            if (ps.length == 0) {
                return false;
            }
            boolean b = false;
            for (int i = 0; i < ps.length && !b; ++i) {
                b = ps[i].test();
            }
            return b;
        };
    }

    @SafeVarargs
    public static <T1> Pr1<T1> and(Pr1<? super T1> ... ps) {
        return t1 -> Predicates.and(Stream.ofAll(Arrays.asList(ps)).map(Wither.withArgs(t1)::test).toJavaArray(Pr0[]::new)).test();
    }

    @SafeVarargs
    public static <T1> Pr1<T1> or(Pr1<? super T1> ... ps) {
        return t1 -> Predicates.or(Stream.ofAll(Arrays.asList(ps)).map(Wither.withArgs(t1)::test).toJavaArray(Pr0[]::new)).test();
    }

    @SafeVarargs
    public static <T1, T2> Pr2<T1, T2> and(Pr2<? super T1, ? super T2> ... ps) {
        return (t1, t2) -> Predicates.and(Stream.ofAll(Arrays.asList(ps)).map(Wither.withArgs(t1, t2)::test).toJavaArray(Pr0[]::new)).test();
    }

    @SafeVarargs
    public static <T1, T2> Pr2<T1, T2> or(Pr2<? super T1, ? super T2> ... ps) {
        return (t1, t2) -> Predicates.or(Stream.ofAll(Arrays.asList(ps)).map(Wither.withArgs(t1, t2)::test).toJavaArray(Pr0[]::new)).test();
    }

    @SafeVarargs
    public static <T1, T2, T3> Pr3<T1, T2, T3> and(Pr3<? super T1, ? super T2, ? super T3> ... ps) {
        return (t1, t2, t3) -> Predicates.and(Stream.ofAll(Arrays.asList(ps)).map(Wither.withArgs(t1, t2, t3)::test).toJavaArray(Pr0[]::new)).test();
    }

    @SafeVarargs
    public static <T1, T2, T3> Pr3<T1, T2, T3> or(Pr3<? super T1, ? super T2, ? super T3> ... ps) {
        return (t1, t2, t3) -> Predicates.or(Stream.ofAll(Arrays.asList(ps)).map(Wither.withArgs(t1, t2, t3)::test).toJavaArray(Pr0[]::new)).test();
    }

    @SafeVarargs
    public static <T1, T2, T3, T4> Pr4<T1, T2, T3, T4> and(Pr4<? super T1, ? super T2, ? super T3, ? super T4> ... ps) {
        return (t1, t2, t3, t4) -> Predicates.and(Stream.ofAll(Arrays.asList(ps)).map(Wither.withArgs(t1, t2, t3, t4)::test).toJavaArray(Pr0[]::new)).test();
    }

    @SafeVarargs
    public static <T1, T2, T3, T4> Pr4<T1, T2, T3, T4> or(Pr4<? super T1, ? super T2, ? super T3, ? super T4> ... ps) {
        return (t1, t2, t3, t4) -> Predicates.or(Stream.ofAll(Arrays.asList(ps)).map(Wither.withArgs(t1, t2, t3, t4)::test).toJavaArray(Pr0[]::new)).test();
    }

    @SafeVarargs
    public static <T1, T2, T3, T4, T5> Pr5<T1, T2, T3, T4, T5> and(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> ... ps) {
        return (t1, t2, t3, t4, t5) -> Predicates.and(Stream.ofAll(Arrays.asList(ps)).map(Wither.withArgs(t1, t2, t3, t4, t5)::test).toJavaArray(Pr0[]::new)).test();
    }

    @SafeVarargs
    public static <T1, T2, T3, T4, T5> Pr5<T1, T2, T3, T4, T5> or(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> ... ps) {
        return (t1, t2, t3, t4, t5) -> Predicates.or(Stream.ofAll(Arrays.asList(ps)).map(Wither.withArgs(t1, t2, t3, t4, t5)::test).toJavaArray(Pr0[]::new)).test();
    }

    @SafeVarargs
    public static <T1, T2, T3, T4, T5, T6> Pr6<T1, T2, T3, T4, T5, T6> and(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> ... ps) {
        return (t1, t2, t3, t4, t5, t6) -> Predicates.and(Stream.ofAll(Arrays.asList(ps)).map(Wither.withArgs(t1, t2, t3, t4, t5, t6)::test).toJavaArray(Pr0[]::new)).test();
    }

    @SafeVarargs
    public static <T1, T2, T3, T4, T5, T6> Pr6<T1, T2, T3, T4, T5, T6> or(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> ... ps) {
        return (t1, t2, t3, t4, t5, t6) -> Predicates.or(Stream.ofAll(Arrays.asList(ps)).map(Wither.withArgs(t1, t2, t3, t4, t5, t6)::test).toJavaArray(Pr0[]::new)).test();
    }

    @SafeVarargs
    public static <T1, T2, T3, T4, T5, T6, T7> Pr7<T1, T2, T3, T4, T5, T6, T7> and(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> ... ps) {
        return (t1, t2, t3, t4, t5, t6, t7) -> Predicates.and(Stream.ofAll(Arrays.asList(ps)).map(Wither.withArgs(t1, t2, t3, t4, t5, t6, t7)::test).toJavaArray(Pr0[]::new)).test();
    }

    @SafeVarargs
    public static <T1, T2, T3, T4, T5, T6, T7> Pr7<T1, T2, T3, T4, T5, T6, T7> or(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> ... ps) {
        return (t1, t2, t3, t4, t5, t6, t7) -> Predicates.or(Stream.ofAll(Arrays.asList(ps)).map(Wither.withArgs(t1, t2, t3, t4, t5, t6, t7)::test).toJavaArray(Pr0[]::new)).test();
    }

    @SafeVarargs
    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> and(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> ... ps) {
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> Predicates.and(Stream.ofAll(Arrays.asList(ps)).map(Wither.withArgs(t1, t2, t3, t4, t5, t6, t7, t8)::test).toJavaArray(Pr0[]::new)).test();
    }

    @SafeVarargs
    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr8<T1, T2, T3, T4, T5, T6, T7, T8> or(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> ... ps) {
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> Predicates.or(Stream.ofAll(Arrays.asList(ps)).map(Wither.withArgs(t1, t2, t3, t4, t5, t6, t7, t8)::test).toJavaArray(Pr0[]::new)).test();
    }

    @SafeVarargs
    public static <T1> Prc1<T1> and(Prc1<? super T1> ... ps) {
        return t1 -> Predicates.and(Stream.ofAll(Arrays.asList(ps)).map(Wither.withArgs(t1)::testChecked).toJavaArray(Prc0[]::new)).test();
    }

    @SafeVarargs
    public static <T1> Prc1<T1> or(Prc1<? super T1> ... ps) {
        return t1 -> Predicates.or(Stream.ofAll(Arrays.asList(ps)).map(Wither.withArgs(t1)::testChecked).toJavaArray(Prc0[]::new)).test();
    }

    @SafeVarargs
    public static <T1, T2> Prc2<T1, T2> and(Prc2<? super T1, ? super T2> ... ps) {
        return (t1, t2) -> Predicates.and(Stream.ofAll(Arrays.asList(ps)).map(Wither.withArgs(t1, t2)::testChecked).toJavaArray(Prc0[]::new)).test();
    }

    @SafeVarargs
    public static <T1, T2> Prc2<T1, T2> or(Prc2<? super T1, ? super T2> ... ps) {
        return (t1, t2) -> Predicates.or(Stream.ofAll(Arrays.asList(ps)).map(Wither.withArgs(t1, t2)::testChecked).toJavaArray(Prc0[]::new)).test();
    }

    @SafeVarargs
    public static <T1, T2, T3> Prc3<T1, T2, T3> and(Prc3<? super T1, ? super T2, ? super T3> ... ps) {
        return (t1, t2, t3) -> Predicates.and(Stream.ofAll(Arrays.asList(ps)).map(Wither.withArgs(t1, t2, t3)::testChecked).toJavaArray(Prc0[]::new)).test();
    }

    @SafeVarargs
    public static <T1, T2, T3> Prc3<T1, T2, T3> or(Prc3<? super T1, ? super T2, ? super T3> ... ps) {
        return (t1, t2, t3) -> Predicates.or(Stream.ofAll(Arrays.asList(ps)).map(Wither.withArgs(t1, t2, t3)::testChecked).toJavaArray(Prc0[]::new)).test();
    }

    @SafeVarargs
    public static <T1, T2, T3, T4> Prc4<T1, T2, T3, T4> and(Prc4<? super T1, ? super T2, ? super T3, ? super T4> ... ps) {
        return (t1, t2, t3, t4) -> Predicates.and(Stream.ofAll(Arrays.asList(ps)).map(Wither.withArgs(t1, t2, t3, t4)::testChecked).toJavaArray(Prc0[]::new)).test();
    }

    @SafeVarargs
    public static <T1, T2, T3, T4> Prc4<T1, T2, T3, T4> or(Prc4<? super T1, ? super T2, ? super T3, ? super T4> ... ps) {
        return (t1, t2, t3, t4) -> Predicates.or(Stream.ofAll(Arrays.asList(ps)).map(Wither.withArgs(t1, t2, t3, t4)::testChecked).toJavaArray(Prc0[]::new)).test();
    }

    @SafeVarargs
    public static <T1, T2, T3, T4, T5> Prc5<T1, T2, T3, T4, T5> and(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> ... ps) {
        return (t1, t2, t3, t4, t5) -> Predicates.and(Stream.ofAll(Arrays.asList(ps)).map(Wither.withArgs(t1, t2, t3, t4, t5)::testChecked).toJavaArray(Prc0[]::new)).test();
    }

    @SafeVarargs
    public static <T1, T2, T3, T4, T5> Prc5<T1, T2, T3, T4, T5> or(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> ... ps) {
        return (t1, t2, t3, t4, t5) -> Predicates.or(Stream.ofAll(Arrays.asList(ps)).map(Wither.withArgs(t1, t2, t3, t4, t5)::testChecked).toJavaArray(Prc0[]::new)).test();
    }

    @SafeVarargs
    public static <T1, T2, T3, T4, T5, T6> Prc6<T1, T2, T3, T4, T5, T6> and(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> ... ps) {
        return (t1, t2, t3, t4, t5, t6) -> Predicates.and(Stream.ofAll(Arrays.asList(ps)).map(Wither.withArgs(t1, t2, t3, t4, t5, t6)::testChecked).toJavaArray(Prc0[]::new)).test();
    }

    @SafeVarargs
    public static <T1, T2, T3, T4, T5, T6> Prc6<T1, T2, T3, T4, T5, T6> or(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> ... ps) {
        return (t1, t2, t3, t4, t5, t6) -> Predicates.or(Stream.ofAll(Arrays.asList(ps)).map(Wither.withArgs(t1, t2, t3, t4, t5, t6)::testChecked).toJavaArray(Prc0[]::new)).test();
    }

    @SafeVarargs
    public static <T1, T2, T3, T4, T5, T6, T7> Prc7<T1, T2, T3, T4, T5, T6, T7> and(Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> ... ps) {
        return (t1, t2, t3, t4, t5, t6, t7) -> Predicates.and(Stream.ofAll(Arrays.asList(ps)).map(Wither.withArgs(t1, t2, t3, t4, t5, t6, t7)::testChecked).toJavaArray(Prc0[]::new)).test();
    }

    @SafeVarargs
    public static <T1, T2, T3, T4, T5, T6, T7> Prc7<T1, T2, T3, T4, T5, T6, T7> or(Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> ... ps) {
        return (t1, t2, t3, t4, t5, t6, t7) -> Predicates.or(Stream.ofAll(Arrays.asList(ps)).map(Wither.withArgs(t1, t2, t3, t4, t5, t6, t7)::testChecked).toJavaArray(Prc0[]::new)).test();
    }

    @SafeVarargs
    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> and(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> ... ps) {
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> Predicates.and(Stream.ofAll(Arrays.asList(ps)).map(Wither.withArgs(t1, t2, t3, t4, t5, t6, t7, t8)::testChecked).toJavaArray(Prc0[]::new)).test();
    }

    @SafeVarargs
    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc8<T1, T2, T3, T4, T5, T6, T7, T8> or(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> ... ps) {
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> Predicates.or(Stream.ofAll(Arrays.asList(ps)).map(Wither.withArgs(t1, t2, t3, t4, t5, t6, t7, t8)::testChecked).toJavaArray(Prc0[]::new)).test();
    }

}

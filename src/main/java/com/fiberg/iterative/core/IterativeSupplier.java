package com.fiberg.iterative.core;

import com.fiberg.iterative.core.Iterative1;
import com.fiberg.iterative.core.Iterative2;
import com.fiberg.iterative.core.Iterative3;
import com.fiberg.iterative.core.Iterative4;
import com.fiberg.iterative.core.Iterative5;
import com.fiberg.iterative.core.Iterative6;
import com.fiberg.iterative.core.Iterative7;
import com.fiberg.iterative.core.Iterative8;
import com.fiberg.iterative.core.IterativeHandler;
import com.fiberg.iterative.function.Cs2;
import io.vavr.collection.Stream;
import io.vavr.control.Option;

interface IterativeSupplier {

    public static interface Iterative1Supplier7<T1, A1, A2, A3, A4, A5, A6, A7> extends IterativeSupplier {

        public Iterative1Supplier6<T1, A2, A3, A4, A5, A6, A7> usingLt(Cs2<? super T1, ? super A1> var1);

        public Iterative1Supplier6<T1, A1, A2, A3, A4, A5, A6> usingRt(Cs2<? super T1, ? super A7> var1);

        public Iterative1Supplier6<T1, A2, A3, A4, A5, A6, A7> usingInlineLt(Cs2<? super T1, ? super A1> var1);

        public Iterative1Supplier6<T1, A1, A2, A3, A4, A5, A6> usingInlineRt(Cs2<? super T1, ? super A7> var1);

        public Iterative1Supplier6<T1, A2, A3, A4, A5, A6, A7> usingCrossLt(Cs2<? super T1, ? super A1> var1);

        public Iterative1Supplier6<T1, A1, A2, A3, A4, A5, A6> usingCrossRt(Cs2<? super T1, ? super A7> var1);

        public Iterative1<T1> toIterative();

        public Iterative8<T1, A1, A2, A3, A4, A5, A6, A7> innerIterative();

        public static class Iterative1Supplier7Impl<T1, A1, A2, A3, A4, A5, A6, A7> implements TransformSupplier<T1, A1, A2, A3, A4, A5, A6, A7> {

            private final Iterative8<T1, A1, A2, A3, A4, A5, A6, A7> iterative;

            Iterative1Supplier7Impl(Iterative8<? extends T1, ? extends A1, ? extends A2, ? extends A3, ? extends A4, ? extends A5, ? extends A6, ? extends A7> iterative) {
                @SuppressWarnings("unchecked")
                final Iterative8<T1, A1, A2, A3, A4, A5, A6, A7> iter = (Iterative8<T1, A1, A2, A3, A4, A5, A6, A7>) iterative;
                this.iterative = iter;
            }

            @Override
            public Iterative8<T1, A1, A2, A3, A4, A5, A6, A7> innerIterative() {
                return this.iterative;
            }

            @Override
            public Iterative1Supplier7<T1, A1, A2, A3, A4, A5, A6, A7> checkAll() {
                if (this.iterative.splitRt7().toStream().isEmpty()) {
                    final Iterative8Cross<T1, A1, A2, A3, A4, A5, A6, A7> iterative = this.iterative
                            .splitLt1()
                            .create(IterativeHandler.streamWrap(Option.<T1>none()))
                            .pushBackOf(Option.<A1>none())
                            .pushBackOf(Option.<A2>none())
                            .pushBackOf(Option.<A3>none())
                            .pushBackOf(Option.<A4>none())
                            .pushBackOf(Option.<A5>none())
                            .pushBackOf(Option.<A6>none())
                            .pushBackOf(Option.<A7>none());
                    return new Iterative1Supplier7Impl<>(iterative);
                } else {
                    return this;
                }
            }

            @Override
            public Iterative1Supplier7<T1, A1, A2, A3, A4, A5, A6, A7> checkArgs() {
                if (this.iterative.splitRt7().toStream().isEmpty()) {
                    final Iterative8Cross<T1, A1, A2, A3, A4, A5, A6, A7> iterative = this.iterative
                            .splitLt1()
                            .pushBackOf(Option.<A1>none())
                            .pushBackOf(Option.<A2>none())
                            .pushBackOf(Option.<A3>none())
                            .pushBackOf(Option.<A4>none())
                            .pushBackOf(Option.<A5>none())
                            .pushBackOf(Option.<A6>none())
                            .pushBackOf(Option.<A7>none());
                    return new Iterative1Supplier7Impl<>(iterative);
                } else {
                    return this;
                }
            }

            private Iterative1Supplier6<T1, A2, A3, A4, A5, A6, A7> usingLt(Cs2<? super T1, ? super A1> c, boolean isCross) {
                if (this.iterative.isCross() == isCross) {
                    this.iterative.splitLt2().forEach(c);
                } else {
                    this.iterative.create(this.iterative.splitLt1(), this.iterative.iterableStream2(), isCross).forEach(c);
                }
                boolean argLtCross = this.iterative.splitLt3().isCross();
                return new Iterative1Supplier6.Iterative1Supplier6Impl<>(argLtCross ? this.iterative.splitRt6().pushFrontCrossBy(this.iterative.iterableStream1()) : this.iterative.splitRt6().pushFrontInlineBy(this.iterative.iterableStream1()));
            }

            private Iterative1Supplier6<T1, A1, A2, A3, A4, A5, A6> usingRt(Cs2<? super T1, ? super A7> c, boolean isCross) {
                this.iterative.create(this.iterative.splitLt1(), this.iterative.iterableStream8(), isCross).forEach(c);
                return new Iterative1Supplier6.Iterative1Supplier6Impl<>(this.iterative.splitLt7());
            }

            @Override
            public Iterative1Supplier6<T1, A2, A3, A4, A5, A6, A7> usingLt(Cs2<? super T1, ? super A1> c) {
                return this.usingLt(c, this.iterative.splitLt2().isCross());
            }

            @Override
            public Iterative1Supplier6<T1, A1, A2, A3, A4, A5, A6> usingRt(Cs2<? super T1, ? super A7> c) {
                return this.usingRt(c, this.iterative.isCross());
            }

            @Override
            public Iterative1Supplier6<T1, A2, A3, A4, A5, A6, A7> usingInlineLt(Cs2<? super T1, ? super A1> c) {
                return this.usingLt(c, false);
            }

            @Override
            public Iterative1Supplier6<T1, A1, A2, A3, A4, A5, A6> usingInlineRt(Cs2<? super T1, ? super A7> c) {
                return this.usingRt(c, false);
            }

            @Override
            public Iterative1Supplier6<T1, A2, A3, A4, A5, A6, A7> usingCrossLt(Cs2<? super T1, ? super A1> c) {
                return this.usingLt(c, true);
            }

            @Override
            public Iterative1Supplier6<T1, A1, A2, A3, A4, A5, A6> usingCrossRt(Cs2<? super T1, ? super A7> c) {
                return this.usingRt(c, true);
            }

            @Override
            public Iterative1<T1> toIterative() {
                return this.iterative.splitLt1();
            }

        }

        public static interface TransformSupplier<T1, A1, A2, A3, A4, A5, A6, A7> extends Iterative1Supplier7<T1, A1, A2, A3, A4, A5, A6, A7> {

            public Iterative1Supplier7<T1, A1, A2, A3, A4, A5, A6, A7> checkAll();

            public Iterative1Supplier7<T1, A1, A2, A3, A4, A5, A6, A7> checkArgs();
        }

    }

    public static interface Iterative1Supplier6<T1, A1, A2, A3, A4, A5, A6> extends IterativeSupplier {

        public Iterative1Supplier5<T1, A2, A3, A4, A5, A6> usingLt(Cs2<? super T1, ? super A1> var1);

        public Iterative1Supplier5<T1, A1, A2, A3, A4, A5> usingRt(Cs2<? super T1, ? super A6> var1);

        public Iterative1Supplier5<T1, A2, A3, A4, A5, A6> usingInlineLt(Cs2<? super T1, ? super A1> var1);

        public Iterative1Supplier5<T1, A1, A2, A3, A4, A5> usingInlineRt(Cs2<? super T1, ? super A6> var1);

        public Iterative1Supplier5<T1, A2, A3, A4, A5, A6> usingCrossLt(Cs2<? super T1, ? super A1> var1);

        public Iterative1Supplier5<T1, A1, A2, A3, A4, A5> usingCrossRt(Cs2<? super T1, ? super A6> var1);

        public Iterative1<T1> toIterative();

        public Iterative7<T1, A1, A2, A3, A4, A5, A6> innerIterative();

        default public <A7> Iterative1Supplier7<T1, A1, A2, A3, A4, A5, A6, A7> pushBackCrossOf(Iterable<? extends A7> a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(this.innerIterative().pushBackCrossOf(a7));
        }

        default public <A7> Iterative1Supplier7<T1, A7, A1, A2, A3, A4, A5, A6> pushFrontCrossOf(Iterable<? extends A7> a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt6().pushFrontCrossOf(a7), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isCross()));
        }

        default public <A7> Iterative1Supplier7<T1, A1, A2, A3, A4, A5, A6, A7> pushBackCross(A7 a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(this.innerIterative().pushBackCross(a7));
        }

        default public <A7> Iterative1Supplier7<T1, A7, A1, A2, A3, A4, A5, A6> pushFrontCross(A7 a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt6().pushFrontCross(a7), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isCross()));
        }

        default public <A7> Iterative1Supplier7<T1, A1, A2, A3, A4, A5, A6, A7> pushBackInlineOf(Iterable<? extends A7> a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(this.innerIterative().pushBackInlineOf(a7));
        }

        default public <A7> Iterative1Supplier7<T1, A7, A1, A2, A3, A4, A5, A6> pushFrontInlineOf(Iterable<? extends A7> a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt6().pushFrontInlineOf(a7), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isInline()));
        }

        default public <A7> Iterative1Supplier7<T1, A1, A2, A3, A4, A5, A6, A7> pushBackInline(A7 a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(this.innerIterative().pushBackInline(a7));
        }

        default public <A7> Iterative1Supplier7<T1, A7, A1, A2, A3, A4, A5, A6> pushFrontInline(A7 a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt6().pushFrontInline(a7), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isInline()));
        }

        public static class Iterative1Supplier6Impl<T1, A1, A2, A3, A4, A5, A6> implements TransformSupplier<T1, A1, A2, A3, A4, A5, A6> {

            private final Iterative7<T1, A1, A2, A3, A4, A5, A6> iterative;

            Iterative1Supplier6Impl(Iterative7<? extends T1, ? extends A1, ? extends A2, ? extends A3, ? extends A4, ? extends A5, ? extends A6> iterative) {
                @SuppressWarnings("unchecked")
                final Iterative7<T1, A1, A2, A3, A4, A5, A6> iter = (Iterative7<T1, A1, A2, A3, A4, A5, A6>) iterative;
                this.iterative = iter;
            }

            @Override
            public Iterative7<T1, A1, A2, A3, A4, A5, A6> innerIterative() {
                return this.iterative;
            }

            @Override
            public Iterative1Supplier6<T1, A1, A2, A3, A4, A5, A6> checkAll() {
                if (this.iterative.splitRt6().toStream().isEmpty()) {
                    final Iterative7Cross<T1, A1, A2, A3, A4, A5, A6> iterative = this.iterative
                            .splitLt1()
                            .create(IterativeHandler.streamWrap(Option.<T1>none()))
                            .pushBackOf(Option.<A1>none())
                            .pushBackOf(Option.<A2>none())
                            .pushBackOf(Option.<A3>none())
                            .pushBackOf(Option.<A4>none())
                            .pushBackOf(Option.<A5>none())
                            .pushBackOf(Option.<A6>none());
                    return new Iterative1Supplier6.Iterative1Supplier6Impl<>(iterative);
                } else {
                    return this;
                }
            }

            @Override
            public Iterative1Supplier6<T1, A1, A2, A3, A4, A5, A6> checkArgs() {
                if (this.iterative.splitRt6().toStream().isEmpty()) {
                    final Iterative7Cross<T1, A1, A2, A3, A4, A5, A6> iterative = this.iterative
                            .splitLt1()
                            .pushBackOf(Option.<A1>none())
                            .pushBackOf(Option.<A2>none())
                            .pushBackOf(Option.<A3>none())
                            .pushBackOf(Option.<A4>none())
                            .pushBackOf(Option.<A5>none())
                            .pushBackOf(Option.<A6>none());
                    return new Iterative1Supplier6.Iterative1Supplier6Impl<>(iterative);
                } else {
                    return this;
                }
            }

            private Iterative1Supplier5<T1, A2, A3, A4, A5, A6> usingLt(Cs2<? super T1, ? super A1> c, boolean isCross) {
                if (this.iterative.isCross() == isCross) {
                    this.iterative.splitLt2().forEach(c);
                } else {
                    this.iterative.create(this.iterative.splitLt1(), this.iterative.iterableStream2(), isCross).forEach(c);
                }
                boolean argLtCross = this.iterative.splitLt3().isCross();
                return new Iterative1Supplier5.Iterative1Supplier5Impl<>(argLtCross ? this.iterative.splitRt5().pushFrontCrossBy(this.iterative.iterableStream1()) : this.iterative.splitRt5().pushFrontInlineBy(this.iterative.iterableStream1()));
            }

            private Iterative1Supplier5<T1, A1, A2, A3, A4, A5> usingRt(Cs2<? super T1, ? super A6> c, boolean isCross) {
                this.iterative.create(this.iterative.splitLt1(), this.iterative.iterableStream7(), isCross).forEach(c);
                return new Iterative1Supplier5.Iterative1Supplier5Impl<>(this.iterative.splitLt6());
            }

            @Override
            public Iterative1Supplier5<T1, A2, A3, A4, A5, A6> usingLt(Cs2<? super T1, ? super A1> c) {
                return this.usingLt(c, this.iterative.splitLt2().isCross());
            }

            @Override
            public Iterative1Supplier5<T1, A1, A2, A3, A4, A5> usingRt(Cs2<? super T1, ? super A6> c) {
                return this.usingRt(c, this.iterative.isCross());
            }

            @Override
            public Iterative1Supplier5<T1, A2, A3, A4, A5, A6> usingInlineLt(Cs2<? super T1, ? super A1> c) {
                return this.usingLt(c, false);
            }

            @Override
            public Iterative1Supplier5<T1, A1, A2, A3, A4, A5> usingInlineRt(Cs2<? super T1, ? super A6> c) {
                return this.usingRt(c, false);
            }

            @Override
            public Iterative1Supplier5<T1, A2, A3, A4, A5, A6> usingCrossLt(Cs2<? super T1, ? super A1> c) {
                return this.usingLt(c, true);
            }

            @Override
            public Iterative1Supplier5<T1, A1, A2, A3, A4, A5> usingCrossRt(Cs2<? super T1, ? super A6> c) {
                return this.usingRt(c, true);
            }

            @Override
            public Iterative1<T1> toIterative() {
                return this.iterative.splitLt1();
            }

        }

        public static interface TransformSupplier<T1, A1, A2, A3, A4, A5, A6> extends Iterative1Supplier6<T1, A1, A2, A3, A4, A5, A6> {

            public Iterative1Supplier6<T1, A1, A2, A3, A4, A5, A6> checkAll();

            public Iterative1Supplier6<T1, A1, A2, A3, A4, A5, A6> checkArgs();
        }

    }

    public static interface Iterative1Supplier5<T1, A1, A2, A3, A4, A5> extends IterativeSupplier {

        public Iterative1Supplier4<T1, A2, A3, A4, A5> usingLt(Cs2<? super T1, ? super A1> var1);

        public Iterative1Supplier4<T1, A1, A2, A3, A4> usingRt(Cs2<? super T1, ? super A5> var1);

        public Iterative1Supplier4<T1, A2, A3, A4, A5> usingInlineLt(Cs2<? super T1, ? super A1> var1);

        public Iterative1Supplier4<T1, A1, A2, A3, A4> usingInlineRt(Cs2<? super T1, ? super A5> var1);

        public Iterative1Supplier4<T1, A2, A3, A4, A5> usingCrossLt(Cs2<? super T1, ? super A1> var1);

        public Iterative1Supplier4<T1, A1, A2, A3, A4> usingCrossRt(Cs2<? super T1, ? super A5> var1);

        public Iterative1<T1> toIterative();

        public Iterative6<T1, A1, A2, A3, A4, A5> innerIterative();

        default public <A6> Iterative1Supplier6<T1, A1, A2, A3, A4, A5, A6> pushBackCrossOf(Iterable<? extends A6> a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(this.innerIterative().pushBackCrossOf(a6));
        }

        default public <A6, A7> Iterative1Supplier7<T1, A1, A2, A3, A4, A5, A6, A7> pushBackCrossOf(Iterable<? extends A6> a6, Iterable<? extends A7> a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(this.innerIterative().pushBackCrossOf(a6, a7));
        }

        default public <A6> Iterative1Supplier6<T1, A6, A1, A2, A3, A4, A5> pushFrontCrossOf(Iterable<? extends A6> a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt5().pushFrontCrossOf(a6), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isCross()));
        }

        default public <A6, A7> Iterative1Supplier7<T1, A6, A7, A1, A2, A3, A4, A5> pushFrontCrossOf(Iterable<? extends A6> a6, Iterable<? extends A7> a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt5().pushFrontCrossOf(a6, a7), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isCross()));
        }

        default public <A6> Iterative1Supplier6<T1, A1, A2, A3, A4, A5, A6> pushBackCross(A6 a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(this.innerIterative().pushBackCross(a6));
        }

        default public <A6, A7> Iterative1Supplier7<T1, A1, A2, A3, A4, A5, A6, A7> pushBackCross(A6 a6, A7 a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(this.innerIterative().pushBackCross(a6, a7));
        }

        default public <A6> Iterative1Supplier6<T1, A6, A1, A2, A3, A4, A5> pushFrontCross(A6 a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt5().pushFrontCross(a6), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isCross()));
        }

        default public <A6, A7> Iterative1Supplier7<T1, A6, A7, A1, A2, A3, A4, A5> pushFrontCross(A6 a6, A7 a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt5().pushFrontCross(a6, a7), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isCross()));
        }

        default public <A6> Iterative1Supplier6<T1, A1, A2, A3, A4, A5, A6> pushBackInlineOf(Iterable<? extends A6> a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(this.innerIterative().pushBackInlineOf(a6));
        }

        default public <A6, A7> Iterative1Supplier7<T1, A1, A2, A3, A4, A5, A6, A7> pushBackInlineOf(Iterable<? extends A6> a6, Iterable<? extends A7> a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(this.innerIterative().pushBackInlineOf(a6, a7));
        }

        default public <A6> Iterative1Supplier6<T1, A6, A1, A2, A3, A4, A5> pushFrontInlineOf(Iterable<? extends A6> a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt5().pushFrontInlineOf(a6), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isInline()));
        }

        default public <A6, A7> Iterative1Supplier7<T1, A6, A7, A1, A2, A3, A4, A5> pushFrontInlineOf(Iterable<? extends A6> a6, Iterable<? extends A7> a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt5().pushFrontInlineOf(a6, a7), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isInline()));
        }

        default public <A6> Iterative1Supplier6<T1, A1, A2, A3, A4, A5, A6> pushBackInline(A6 a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(this.innerIterative().pushBackInline(a6));
        }

        default public <A6, A7> Iterative1Supplier7<T1, A1, A2, A3, A4, A5, A6, A7> pushBackInline(A6 a6, A7 a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(this.innerIterative().pushBackInline(a6, a7));
        }

        default public <A6> Iterative1Supplier6<T1, A6, A1, A2, A3, A4, A5> pushFrontInline(A6 a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt5().pushFrontInline(a6), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isInline()));
        }

        default public <A6, A7> Iterative1Supplier7<T1, A6, A7, A1, A2, A3, A4, A5> pushFrontInline(A6 a6, A7 a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt5().pushFrontInline(a6, a7), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isInline()));
        }

        public static class Iterative1Supplier5Impl<T1, A1, A2, A3, A4, A5> implements TransformSupplier<T1, A1, A2, A3, A4, A5> {

            private final Iterative6<T1, A1, A2, A3, A4, A5> iterative;

            Iterative1Supplier5Impl(Iterative6<? extends T1, ? extends A1, ? extends A2, ? extends A3, ? extends A4, ? extends A5> iterative) {
                @SuppressWarnings("unchecked")
                final Iterative6<T1, A1, A2, A3, A4, A5> iter = (Iterative6<T1, A1, A2, A3, A4, A5>) iterative;
                this.iterative = iter;
            }

            @Override
            public Iterative6<T1, A1, A2, A3, A4, A5> innerIterative() {
                return this.iterative;
            }

            @Override
            public Iterative1Supplier5<T1, A1, A2, A3, A4, A5> checkAll() {
                if (this.iterative.splitRt5().toStream().isEmpty()) {
                    final Iterative6Cross<T1, A1, A2, A3, A4, A5> iterative = this.iterative
                            .splitLt1()
                            .create(IterativeHandler.streamWrap(Option.<T1>none()))
                            .pushBackOf(Option.<A1>none())
                            .pushBackOf(Option.<A2>none())
                            .pushBackOf(Option.<A3>none())
                            .pushBackOf(Option.<A4>none())
                            .pushBackOf(Option.<A5>none());
                    return new Iterative1Supplier5.Iterative1Supplier5Impl<>(iterative);
                } else {
                    return this;
                }
            }

            @Override
            public Iterative1Supplier5<T1, A1, A2, A3, A4, A5> checkArgs() {
                if (this.iterative.splitRt5().toStream().isEmpty()) {
                    final Iterative6Cross<T1, A1, A2, A3, A4, A5> iterative = this.iterative
                            .splitLt1()
                            .pushBackOf(Option.<A1>none())
                            .pushBackOf(Option.<A2>none())
                            .pushBackOf(Option.<A3>none())
                            .pushBackOf(Option.<A4>none())
                            .pushBackOf(Option.<A5>none());
                    return new Iterative1Supplier5.Iterative1Supplier5Impl<>(iterative);
                } else {
                    return this;
                }
            }

            private Iterative1Supplier4<T1, A2, A3, A4, A5> usingLt(Cs2<? super T1, ? super A1> c, boolean isCross) {
                if (this.iterative.isCross() == isCross) {
                    this.iterative.splitLt2().forEach(c);
                } else {
                    this.iterative.create(this.iterative.splitLt1(), this.iterative.iterableStream2(), isCross).forEach(c);
                }
                boolean argLtCross = this.iterative.splitLt3().isCross();
                return new Iterative1Supplier4.Iterative1Supplier4Impl<>(argLtCross ? this.iterative.splitRt4().pushFrontCrossBy(this.iterative.iterableStream1()) : this.iterative.splitRt4().pushFrontInlineBy(this.iterative.iterableStream1()));
            }

            private Iterative1Supplier4<T1, A1, A2, A3, A4> usingRt(Cs2<? super T1, ? super A5> c, boolean isCross) {
                this.iterative.create(this.iterative.splitLt1(), this.iterative.iterableStream6(), isCross).forEach(c);
                return new Iterative1Supplier4.Iterative1Supplier4Impl<>(this.iterative.splitLt5());
            }

            @Override
            public Iterative1Supplier4<T1, A2, A3, A4, A5> usingLt(Cs2<? super T1, ? super A1> c) {
                return this.usingLt(c, this.iterative.splitLt2().isCross());
            }

            @Override
            public Iterative1Supplier4<T1, A1, A2, A3, A4> usingRt(Cs2<? super T1, ? super A5> c) {
                return this.usingRt(c, this.iterative.isCross());
            }

            @Override
            public Iterative1Supplier4<T1, A2, A3, A4, A5> usingInlineLt(Cs2<? super T1, ? super A1> c) {
                return this.usingLt(c, false);
            }

            @Override
            public Iterative1Supplier4<T1, A1, A2, A3, A4> usingInlineRt(Cs2<? super T1, ? super A5> c) {
                return this.usingRt(c, false);
            }

            @Override
            public Iterative1Supplier4<T1, A2, A3, A4, A5> usingCrossLt(Cs2<? super T1, ? super A1> c) {
                return this.usingLt(c, true);
            }

            @Override
            public Iterative1Supplier4<T1, A1, A2, A3, A4> usingCrossRt(Cs2<? super T1, ? super A5> c) {
                return this.usingRt(c, true);
            }

            @Override
            public Iterative1<T1> toIterative() {
                return this.iterative.splitLt1();
            }

        }

        public static interface TransformSupplier<T1, A1, A2, A3, A4, A5> extends Iterative1Supplier5<T1, A1, A2, A3, A4, A5> {

            public Iterative1Supplier5<T1, A1, A2, A3, A4, A5> checkAll();

            public Iterative1Supplier5<T1, A1, A2, A3, A4, A5> checkArgs();
        }

    }

    public static interface Iterative1Supplier4<T1, A1, A2, A3, A4> extends IterativeSupplier {

        public Iterative1Supplier3<T1, A2, A3, A4> usingLt(Cs2<? super T1, ? super A1> var1);

        public Iterative1Supplier3<T1, A1, A2, A3> usingRt(Cs2<? super T1, ? super A4> var1);

        public Iterative1Supplier3<T1, A2, A3, A4> usingInlineLt(Cs2<? super T1, ? super A1> var1);

        public Iterative1Supplier3<T1, A1, A2, A3> usingInlineRt(Cs2<? super T1, ? super A4> var1);

        public Iterative1Supplier3<T1, A2, A3, A4> usingCrossLt(Cs2<? super T1, ? super A1> var1);

        public Iterative1Supplier3<T1, A1, A2, A3> usingCrossRt(Cs2<? super T1, ? super A4> var1);

        public Iterative1<T1> toIterative();

        public Iterative5<T1, A1, A2, A3, A4> innerIterative();

        default public <A5> Iterative1Supplier5<T1, A1, A2, A3, A4, A5> pushBackCrossOf(Iterable<? extends A5> a5) {
            return new Iterative1Supplier5.Iterative1Supplier5Impl<>(this.innerIterative().pushBackCrossOf(a5));
        }

        default public <A5, A6> Iterative1Supplier6<T1, A1, A2, A3, A4, A5, A6> pushBackCrossOf(Iterable<? extends A5> a5, Iterable<? extends A6> a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(this.innerIterative().pushBackCrossOf(a5, a6));
        }

        default public <A5, A6, A7> Iterative1Supplier7<T1, A1, A2, A3, A4, A5, A6, A7> pushBackCrossOf(Iterable<? extends A5> a5, Iterable<? extends A6> a6, Iterable<? extends A7> a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(this.innerIterative().pushBackCrossOf(a5, a6, a7));
        }

        default public <A5> Iterative1Supplier5<T1, A5, A1, A2, A3, A4> pushFrontCrossOf(Iterable<? extends A5> a5) {
            return new Iterative1Supplier5.Iterative1Supplier5Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt4().pushFrontCrossOf(a5), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isCross()));
        }

        default public <A5, A6> Iterative1Supplier6<T1, A5, A6, A1, A2, A3, A4> pushFrontCrossOf(Iterable<? extends A5> a5, Iterable<? extends A6> a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt4().pushFrontCrossOf(a5, a6), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isCross()));
        }

        default public <A5, A6, A7> Iterative1Supplier7<T1, A5, A6, A7, A1, A2, A3, A4> pushFrontCrossOf(Iterable<? extends A5> a5, Iterable<? extends A6> a6, Iterable<? extends A7> a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt4().pushFrontCrossOf(a5, a6, a7), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isCross()));
        }

        default public <A5> Iterative1Supplier5<T1, A1, A2, A3, A4, A5> pushBackCross(A5 a5) {
            return new Iterative1Supplier5.Iterative1Supplier5Impl<>(this.innerIterative().pushBackCross(a5));
        }

        default public <A5, A6> Iterative1Supplier6<T1, A1, A2, A3, A4, A5, A6> pushBackCross(A5 a5, A6 a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(this.innerIterative().pushBackCross(a5, a6));
        }

        default public <A5, A6, A7> Iterative1Supplier7<T1, A1, A2, A3, A4, A5, A6, A7> pushBackCross(A5 a5, A6 a6, A7 a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(this.innerIterative().pushBackCross(a5, a6, a7));
        }

        default public <A5> Iterative1Supplier5<T1, A5, A1, A2, A3, A4> pushFrontCross(A5 a5) {
            return new Iterative1Supplier5.Iterative1Supplier5Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt4().pushFrontCross(a5), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isCross()));
        }

        default public <A5, A6> Iterative1Supplier6<T1, A5, A6, A1, A2, A3, A4> pushFrontCross(A5 a5, A6 a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt4().pushFrontCross(a5, a6), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isCross()));
        }

        default public <A5, A6, A7> Iterative1Supplier7<T1, A5, A6, A7, A1, A2, A3, A4> pushFrontCross(A5 a5, A6 a6, A7 a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt4().pushFrontCross(a5, a6, a7), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isCross()));
        }

        default public <A5> Iterative1Supplier5<T1, A1, A2, A3, A4, A5> pushBackInlineOf(Iterable<? extends A5> a5) {
            return new Iterative1Supplier5.Iterative1Supplier5Impl<>(this.innerIterative().pushBackInlineOf(a5));
        }

        default public <A5, A6> Iterative1Supplier6<T1, A1, A2, A3, A4, A5, A6> pushBackInlineOf(Iterable<? extends A5> a5, Iterable<? extends A6> a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(this.innerIterative().pushBackInlineOf(a5, a6));
        }

        default public <A5, A6, A7> Iterative1Supplier7<T1, A1, A2, A3, A4, A5, A6, A7> pushBackInlineOf(Iterable<? extends A5> a5, Iterable<? extends A6> a6, Iterable<? extends A7> a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(this.innerIterative().pushBackInlineOf(a5, a6, a7));
        }

        default public <A5> Iterative1Supplier5<T1, A5, A1, A2, A3, A4> pushFrontInlineOf(Iterable<? extends A5> a5) {
            return new Iterative1Supplier5.Iterative1Supplier5Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt4().pushFrontInlineOf(a5), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isInline()));
        }

        default public <A5, A6> Iterative1Supplier6<T1, A5, A6, A1, A2, A3, A4> pushFrontInlineOf(Iterable<? extends A5> a5, Iterable<? extends A6> a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt4().pushFrontInlineOf(a5, a6), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isInline()));
        }

        default public <A5, A6, A7> Iterative1Supplier7<T1, A5, A6, A7, A1, A2, A3, A4> pushFrontInlineOf(Iterable<? extends A5> a5, Iterable<? extends A6> a6, Iterable<? extends A7> a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt4().pushFrontInlineOf(a5, a6, a7), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isInline()));
        }

        default public <A5> Iterative1Supplier5<T1, A1, A2, A3, A4, A5> pushBackInline(A5 a5) {
            return new Iterative1Supplier5.Iterative1Supplier5Impl<>(this.innerIterative().pushBackInline(a5));
        }

        default public <A5, A6> Iterative1Supplier6<T1, A1, A2, A3, A4, A5, A6> pushBackInline(A5 a5, A6 a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(this.innerIterative().pushBackInline(a5, a6));
        }

        default public <A5, A6, A7> Iterative1Supplier7<T1, A1, A2, A3, A4, A5, A6, A7> pushBackInline(A5 a5, A6 a6, A7 a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(this.innerIterative().pushBackInline(a5, a6, a7));
        }

        default public <A5> Iterative1Supplier5<T1, A5, A1, A2, A3, A4> pushFrontInline(A5 a5) {
            return new Iterative1Supplier5.Iterative1Supplier5Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt4().pushFrontInline(a5), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isInline()));
        }

        default public <A5, A6> Iterative1Supplier6<T1, A5, A6, A1, A2, A3, A4> pushFrontInline(A5 a5, A6 a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt4().pushFrontInline(a5, a6), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isInline()));
        }

        default public <A5, A6, A7> Iterative1Supplier7<T1, A5, A6, A7, A1, A2, A3, A4> pushFrontInline(A5 a5, A6 a6, A7 a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt4().pushFrontInline(a5, a6, a7), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isInline()));
        }

        public static class Iterative1Supplier4Impl<T1, A1, A2, A3, A4> implements TransformSupplier<T1, A1, A2, A3, A4> {

            private final Iterative5<T1, A1, A2, A3, A4> iterative;

            Iterative1Supplier4Impl(Iterative5<? extends T1, ? extends A1, ? extends A2, ? extends A3, ? extends A4> iterative) {
                @SuppressWarnings("unchecked")
                final Iterative5<T1, A1, A2, A3, A4> iter = (Iterative5<T1, A1, A2, A3, A4>) iterative;
                this.iterative = iter;
            }

            @Override
            public Iterative5<T1, A1, A2, A3, A4> innerIterative() {
                return this.iterative;
            }

            @Override
            public Iterative1Supplier4<T1, A1, A2, A3, A4> checkAll() {
                if (this.iterative.splitRt4().toStream().isEmpty()) {
                    final Iterative5Cross<T1, A1, A2, A3, A4> iterative = this.iterative
                            .splitLt1()
                            .create(IterativeHandler.streamWrap(Option.<T1>none()))
                            .pushBackOf(Option.<A1>none())
                            .pushBackOf(Option.<A2>none())
                            .pushBackOf(Option.<A3>none())
                            .pushBackOf(Option.<A4>none());
                    return new Iterative1Supplier4.Iterative1Supplier4Impl<>(iterative);
                } else {
                    return this;
                }
            }

            @Override
            public Iterative1Supplier4<T1, A1, A2, A3, A4> checkArgs() {
                if (this.iterative.splitRt4().toStream().isEmpty()) {
                    final Iterative5Cross<T1, A1, A2, A3, A4> iterative = this.iterative
                            .splitLt1()
                            .pushBackOf(Option.<A1>none())
                            .pushBackOf(Option.<A2>none())
                            .pushBackOf(Option.<A3>none())
                            .pushBackOf(Option.<A4>none());
                    return new Iterative1Supplier4.Iterative1Supplier4Impl<>(iterative);
                } else {
                    return this;
                }
            }

            private Iterative1Supplier3<T1, A2, A3, A4> usingLt(Cs2<? super T1, ? super A1> c, boolean isCross) {
                if (this.iterative.isCross() == isCross) {
                    this.iterative.splitLt2().forEach(c);
                } else {
                    this.iterative.create(this.iterative.splitLt1(), this.iterative.iterableStream2(), isCross).forEach(c);
                }
                boolean argLtCross = this.iterative.splitLt3().isCross();
                return new Iterative1Supplier3.Iterative1Supplier3Impl<>(argLtCross ? this.iterative.splitRt3().pushFrontCrossBy(this.iterative.iterableStream1()) : this.iterative.splitRt3().pushFrontInlineBy(this.iterative.iterableStream1()));
            }

            private Iterative1Supplier3<T1, A1, A2, A3> usingRt(Cs2<? super T1, ? super A4> c, boolean isCross) {
                this.iterative.create(this.iterative.splitLt1(), this.iterative.iterableStream5(), isCross).forEach(c);
                return new Iterative1Supplier3.Iterative1Supplier3Impl<>(this.iterative.splitLt4());
            }

            @Override
            public Iterative1Supplier3<T1, A2, A3, A4> usingLt(Cs2<? super T1, ? super A1> c) {
                return this.usingLt(c, this.iterative.splitLt2().isCross());
            }

            @Override
            public Iterative1Supplier3<T1, A1, A2, A3> usingRt(Cs2<? super T1, ? super A4> c) {
                return this.usingRt(c, this.iterative.isCross());
            }

            @Override
            public Iterative1Supplier3<T1, A2, A3, A4> usingInlineLt(Cs2<? super T1, ? super A1> c) {
                return this.usingLt(c, false);
            }

            @Override
            public Iterative1Supplier3<T1, A1, A2, A3> usingInlineRt(Cs2<? super T1, ? super A4> c) {
                return this.usingRt(c, false);
            }

            @Override
            public Iterative1Supplier3<T1, A2, A3, A4> usingCrossLt(Cs2<? super T1, ? super A1> c) {
                return this.usingLt(c, true);
            }

            @Override
            public Iterative1Supplier3<T1, A1, A2, A3> usingCrossRt(Cs2<? super T1, ? super A4> c) {
                return this.usingRt(c, true);
            }

            @Override
            public Iterative1<T1> toIterative() {
                return this.iterative.splitLt1();
            }

        }

        public static interface TransformSupplier<T1, A1, A2, A3, A4> extends Iterative1Supplier4<T1, A1, A2, A3, A4> {

            public Iterative1Supplier4<T1, A1, A2, A3, A4> checkAll();

            public Iterative1Supplier4<T1, A1, A2, A3, A4> checkArgs();
        }

    }

    public static interface Iterative1Supplier3<T1, A1, A2, A3> extends IterativeSupplier {

        public Iterative1Supplier2<T1, A2, A3> usingLt(Cs2<? super T1, ? super A1> var1);

        public Iterative1Supplier2<T1, A1, A2> usingRt(Cs2<? super T1, ? super A3> var1);

        public Iterative1Supplier2<T1, A2, A3> usingInlineLt(Cs2<? super T1, ? super A1> var1);

        public Iterative1Supplier2<T1, A1, A2> usingInlineRt(Cs2<? super T1, ? super A3> var1);

        public Iterative1Supplier2<T1, A2, A3> usingCrossLt(Cs2<? super T1, ? super A1> var1);

        public Iterative1Supplier2<T1, A1, A2> usingCrossRt(Cs2<? super T1, ? super A3> var1);

        public Iterative1<T1> toIterative();

        public Iterative4<T1, A1, A2, A3> innerIterative();

        default public <A4> Iterative1Supplier4<T1, A1, A2, A3, A4> pushBackCrossOf(Iterable<? extends A4> a4) {
            return new Iterative1Supplier4.Iterative1Supplier4Impl<>(this.innerIterative().pushBackCrossOf(a4));
        }

        default public <A4, A5> Iterative1Supplier5<T1, A1, A2, A3, A4, A5> pushBackCrossOf(Iterable<? extends A4> a4, Iterable<? extends A5> a5) {
            return new Iterative1Supplier5.Iterative1Supplier5Impl<>(this.innerIterative().pushBackCrossOf(a4, a5));
        }

        default public <A4, A5, A6> Iterative1Supplier6<T1, A1, A2, A3, A4, A5, A6> pushBackCrossOf(Iterable<? extends A4> a4, Iterable<? extends A5> a5, Iterable<? extends A6> a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(this.innerIterative().pushBackCrossOf(a4, a5, a6));
        }

        default public <A4, A5, A6, A7> Iterative1Supplier7<T1, A1, A2, A3, A4, A5, A6, A7> pushBackCrossOf(Iterable<? extends A4> a4, Iterable<? extends A5> a5, Iterable<? extends A6> a6, Iterable<? extends A7> a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(this.innerIterative().pushBackCrossOf(a4, a5, a6, a7));
        }

        default public <A4> Iterative1Supplier4<T1, A4, A1, A2, A3> pushFrontCrossOf(Iterable<? extends A4> a4) {
            return new Iterative1Supplier4.Iterative1Supplier4Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt3().pushFrontCrossOf(a4), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isCross()));
        }

        default public <A4, A5> Iterative1Supplier5<T1, A4, A5, A1, A2, A3> pushFrontCrossOf(Iterable<? extends A4> a4, Iterable<? extends A5> a5) {
            return new Iterative1Supplier5.Iterative1Supplier5Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt3().pushFrontCrossOf(a4, a5), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isCross()));
        }

        default public <A4, A5, A6> Iterative1Supplier6<T1, A4, A5, A6, A1, A2, A3> pushFrontCrossOf(Iterable<? extends A4> a4, Iterable<? extends A5> a5, Iterable<? extends A6> a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt3().pushFrontCrossOf(a4, a5, a6), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isCross()));
        }

        default public <A4, A5, A6, A7> Iterative1Supplier7<T1, A4, A5, A6, A7, A1, A2, A3> pushFrontCrossOf(Iterable<? extends A4> a4, Iterable<? extends A5> a5, Iterable<? extends A6> a6, Iterable<? extends A7> a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt3().pushFrontCrossOf(a4, a5, a6, a7), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isCross()));
        }

        default public <A4> Iterative1Supplier4<T1, A1, A2, A3, A4> pushBackCross(A4 a4) {
            return new Iterative1Supplier4.Iterative1Supplier4Impl<>(this.innerIterative().pushBackCross(a4));
        }

        default public <A4, A5> Iterative1Supplier5<T1, A1, A2, A3, A4, A5> pushBackCross(A4 a4, A5 a5) {
            return new Iterative1Supplier5.Iterative1Supplier5Impl<>(this.innerIterative().pushBackCross(a4, a5));
        }

        default public <A4, A5, A6> Iterative1Supplier6<T1, A1, A2, A3, A4, A5, A6> pushBackCross(A4 a4, A5 a5, A6 a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(this.innerIterative().pushBackCross(a4, a5, a6));
        }

        default public <A4, A5, A6, A7> Iterative1Supplier7<T1, A1, A2, A3, A4, A5, A6, A7> pushBackCross(A4 a4, A5 a5, A6 a6, A7 a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(this.innerIterative().pushBackCross(a4, a5, a6, a7));
        }

        default public <A4> Iterative1Supplier4<T1, A4, A1, A2, A3> pushFrontCross(A4 a4) {
            return new Iterative1Supplier4.Iterative1Supplier4Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt3().pushFrontCross(a4), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isCross()));
        }

        default public <A4, A5> Iterative1Supplier5<T1, A4, A5, A1, A2, A3> pushFrontCross(A4 a4, A5 a5) {
            return new Iterative1Supplier5.Iterative1Supplier5Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt3().pushFrontCross(a4, a5), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isCross()));
        }

        default public <A4, A5, A6> Iterative1Supplier6<T1, A4, A5, A6, A1, A2, A3> pushFrontCross(A4 a4, A5 a5, A6 a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt3().pushFrontCross(a4, a5, a6), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isCross()));
        }

        default public <A4, A5, A6, A7> Iterative1Supplier7<T1, A4, A5, A6, A7, A1, A2, A3> pushFrontCross(A4 a4, A5 a5, A6 a6, A7 a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt3().pushFrontCross(a4, a5, a6, a7), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isCross()));
        }

        default public <A4> Iterative1Supplier4<T1, A1, A2, A3, A4> pushBackInlineOf(Iterable<? extends A4> a4) {
            return new Iterative1Supplier4.Iterative1Supplier4Impl<>(this.innerIterative().pushBackInlineOf(a4));
        }

        default public <A4, A5> Iterative1Supplier5<T1, A1, A2, A3, A4, A5> pushBackInlineOf(Iterable<? extends A4> a4, Iterable<? extends A5> a5) {
            return new Iterative1Supplier5.Iterative1Supplier5Impl<>(this.innerIterative().pushBackInlineOf(a4, a5));
        }

        default public <A4, A5, A6> Iterative1Supplier6<T1, A1, A2, A3, A4, A5, A6> pushBackInlineOf(Iterable<? extends A4> a4, Iterable<? extends A5> a5, Iterable<? extends A6> a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(this.innerIterative().pushBackInlineOf(a4, a5, a6));
        }

        default public <A4, A5, A6, A7> Iterative1Supplier7<T1, A1, A2, A3, A4, A5, A6, A7> pushBackInlineOf(Iterable<? extends A4> a4, Iterable<? extends A5> a5, Iterable<? extends A6> a6, Iterable<? extends A7> a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(this.innerIterative().pushBackInlineOf(a4, a5, a6, a7));
        }

        default public <A4> Iterative1Supplier4<T1, A4, A1, A2, A3> pushFrontInlineOf(Iterable<? extends A4> a4) {
            return new Iterative1Supplier4.Iterative1Supplier4Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt3().pushFrontInlineOf(a4), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isInline()));
        }

        default public <A4, A5> Iterative1Supplier5<T1, A4, A5, A1, A2, A3> pushFrontInlineOf(Iterable<? extends A4> a4, Iterable<? extends A5> a5) {
            return new Iterative1Supplier5.Iterative1Supplier5Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt3().pushFrontInlineOf(a4, a5), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isInline()));
        }

        default public <A4, A5, A6> Iterative1Supplier6<T1, A4, A5, A6, A1, A2, A3> pushFrontInlineOf(Iterable<? extends A4> a4, Iterable<? extends A5> a5, Iterable<? extends A6> a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt3().pushFrontInlineOf(a4, a5, a6), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isInline()));
        }

        default public <A4, A5, A6, A7> Iterative1Supplier7<T1, A4, A5, A6, A7, A1, A2, A3> pushFrontInlineOf(Iterable<? extends A4> a4, Iterable<? extends A5> a5, Iterable<? extends A6> a6, Iterable<? extends A7> a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt3().pushFrontInlineOf(a4, a5, a6, a7), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isInline()));
        }

        default public <A4> Iterative1Supplier4<T1, A1, A2, A3, A4> pushBackInline(A4 a4) {
            return new Iterative1Supplier4.Iterative1Supplier4Impl<>(this.innerIterative().pushBackInline(a4));
        }

        default public <A4, A5> Iterative1Supplier5<T1, A1, A2, A3, A4, A5> pushBackInline(A4 a4, A5 a5) {
            return new Iterative1Supplier5.Iterative1Supplier5Impl<>(this.innerIterative().pushBackInline(a4, a5));
        }

        default public <A4, A5, A6> Iterative1Supplier6<T1, A1, A2, A3, A4, A5, A6> pushBackInline(A4 a4, A5 a5, A6 a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(this.innerIterative().pushBackInline(a4, a5, a6));
        }

        default public <A4, A5, A6, A7> Iterative1Supplier7<T1, A1, A2, A3, A4, A5, A6, A7> pushBackInline(A4 a4, A5 a5, A6 a6, A7 a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(this.innerIterative().pushBackInline(a4, a5, a6, a7));
        }

        default public <A4> Iterative1Supplier4<T1, A4, A1, A2, A3> pushFrontInline(A4 a4) {
            return new Iterative1Supplier4.Iterative1Supplier4Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt3().pushFrontInline(a4), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isInline()));
        }

        default public <A4, A5> Iterative1Supplier5<T1, A4, A5, A1, A2, A3> pushFrontInline(A4 a4, A5 a5) {
            return new Iterative1Supplier5.Iterative1Supplier5Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt3().pushFrontInline(a4, a5), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isInline()));
        }

        default public <A4, A5, A6> Iterative1Supplier6<T1, A4, A5, A6, A1, A2, A3> pushFrontInline(A4 a4, A5 a5, A6 a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt3().pushFrontInline(a4, a5, a6), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isInline()));
        }

        default public <A4, A5, A6, A7> Iterative1Supplier7<T1, A4, A5, A6, A7, A1, A2, A3> pushFrontInline(A4 a4, A5 a5, A6 a6, A7 a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt3().pushFrontInline(a4, a5, a6, a7), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isInline()));
        }

        public static class Iterative1Supplier3Impl<T1, A1, A2, A3> implements TransformSupplier<T1, A1, A2, A3> {

            private final Iterative4<T1, A1, A2, A3> iterative;

            Iterative1Supplier3Impl(Iterative4<? extends T1, ? extends A1, ? extends A2, ? extends A3> iterative) {
                @SuppressWarnings("unchecked")
                final Iterative4<T1, A1, A2, A3> iter = (Iterative4<T1, A1, A2, A3>) iterative;
                this.iterative = iter;
            }

            @Override
            public Iterative4<T1, A1, A2, A3> innerIterative() {
                return this.iterative;
            }

            @Override
            public Iterative1Supplier3<T1, A1, A2, A3> checkAll() {
                if (this.iterative.splitRt3().toStream().isEmpty()) {
                    final Iterative4Cross<T1, A1, A2, A3> iterative = this.iterative
                            .splitLt1()
                            .create(IterativeHandler.streamWrap(Option.<T1>none()))
                            .pushBackOf(Option.<A1>none())
                            .pushBackOf(Option.<A2>none())
                            .pushBackOf(Option.<A3>none());
                    return new Iterative1Supplier3.Iterative1Supplier3Impl<>(iterative);
                } else {
                    return this;
                }
            }

            @Override
            public Iterative1Supplier3<T1, A1, A2, A3> checkArgs() {
                if (this.iterative.splitRt3().toStream().isEmpty()) {
                    final Iterative4Cross<T1, A1, A2, A3> iterative = this.iterative
                            .splitLt1()
                            .pushBackOf(Option.<A1>none())
                            .pushBackOf(Option.<A2>none())
                            .pushBackOf(Option.<A3>none());
                    return new Iterative1Supplier3.Iterative1Supplier3Impl<>(iterative);
                } else {
                    return this;
                }
            }

            private Iterative1Supplier2<T1, A2, A3> usingLt(Cs2<? super T1, ? super A1> c, boolean isCross) {
                if (this.iterative.isCross() == isCross) {
                    this.iterative.splitLt2().forEach(c);
                } else {
                    this.iterative.create(this.iterative.splitLt1(), this.iterative.iterableStream2(), isCross).forEach(c);
                }
                boolean argLtCross = this.iterative.splitLt2().isCross();
                return new Iterative1Supplier2.Iterative1Supplier2Impl<>(argLtCross ? this.iterative.splitRt2().pushFrontCrossBy(this.iterative.iterableStream1()) : this.iterative.splitRt2().pushFrontInlineBy(this.iterative.iterableStream1()));
            }

            private Iterative1Supplier2<T1, A1, A2> usingRt(Cs2<? super T1, ? super A3> c, boolean isCross) {
                this.iterative.create(this.iterative.splitLt1(), this.iterative.iterableStream4(), isCross).forEach(c);
                return new Iterative1Supplier2.Iterative1Supplier2Impl<>(this.iterative.splitLt3());
            }

            @Override
            public Iterative1Supplier2<T1, A2, A3> usingLt(Cs2<? super T1, ? super A1> c) {
                return this.usingLt(c, this.iterative.splitLt2().isCross());
            }

            @Override
            public Iterative1Supplier2<T1, A1, A2> usingRt(Cs2<? super T1, ? super A3> c) {
                return this.usingRt(c, this.iterative.isCross());
            }

            @Override
            public Iterative1Supplier2<T1, A2, A3> usingInlineLt(Cs2<? super T1, ? super A1> c) {
                return this.usingLt(c, false);
            }

            @Override
            public Iterative1Supplier2<T1, A1, A2> usingInlineRt(Cs2<? super T1, ? super A3> c) {
                return this.usingRt(c, false);
            }

            @Override
            public Iterative1Supplier2<T1, A2, A3> usingCrossLt(Cs2<? super T1, ? super A1> c) {
                return this.usingLt(c, true);
            }

            @Override
            public Iterative1Supplier2<T1, A1, A2> usingCrossRt(Cs2<? super T1, ? super A3> c) {
                return this.usingRt(c, true);
            }

            @Override
            public Iterative1<T1> toIterative() {
                return this.iterative.splitLt1();
            }

        }

        public static interface TransformSupplier<T1, A1, A2, A3> extends Iterative1Supplier3<T1, A1, A2, A3> {

            public Iterative1Supplier3<T1, A1, A2, A3> checkAll();

            public Iterative1Supplier3<T1, A1, A2, A3> checkArgs();
        }

    }

    public static interface Iterative1Supplier2<T1, A1, A2> extends IterativeSupplier {

        public Iterative1Supplier1<T1, A2> usingLt(Cs2<? super T1, ? super A1> var1);

        public Iterative1Supplier1<T1, A1> usingRt(Cs2<? super T1, ? super A2> var1);

        public Iterative1Supplier1<T1, A2> usingInlineLt(Cs2<? super T1, ? super A1> var1);

        public Iterative1Supplier1<T1, A1> usingInlineRt(Cs2<? super T1, ? super A2> var1);

        public Iterative1Supplier1<T1, A2> usingCrossLt(Cs2<? super T1, ? super A1> var1);

        public Iterative1Supplier1<T1, A1> usingCrossRt(Cs2<? super T1, ? super A2> var1);

        public Iterative1<T1> toIterative();

        public Iterative3<T1, A1, A2> innerIterative();

        default public <A3> Iterative1Supplier3<T1, A1, A2, A3> pushBackCrossOf(Iterable<? extends A3> a3) {
            return new Iterative1Supplier3.Iterative1Supplier3Impl<>(this.innerIterative().pushBackCrossOf(a3));
        }

        default public <A3, A4> Iterative1Supplier4<T1, A1, A2, A3, A4> pushBackCrossOf(Iterable<? extends A3> a3, Iterable<? extends A4> a4) {
            return new Iterative1Supplier4.Iterative1Supplier4Impl<>(this.innerIterative().pushBackCrossOf(a3, a4));
        }

        default public <A3, A4, A5> Iterative1Supplier5<T1, A1, A2, A3, A4, A5> pushBackCrossOf(Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5) {
            return new Iterative1Supplier5.Iterative1Supplier5Impl<>(this.innerIterative().pushBackCrossOf(a3, a4, a5));
        }

        default public <A3, A4, A5, A6> Iterative1Supplier6<T1, A1, A2, A3, A4, A5, A6> pushBackCrossOf(Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5, Iterable<? extends A6> a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(this.innerIterative().pushBackCrossOf(a3, a4, a5, a6));
        }

        default public <A3, A4, A5, A6, A7> Iterative1Supplier7<T1, A1, A2, A3, A4, A5, A6, A7> pushBackCrossOf(Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5, Iterable<? extends A6> a6, Iterable<? extends A7> a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(this.innerIterative().pushBackCrossOf(a3, a4, a5, a6, a7));
        }

        default public <A3> Iterative1Supplier3<T1, A3, A1, A2> pushFrontCrossOf(Iterable<? extends A3> a3) {
            return new Iterative1Supplier3.Iterative1Supplier3Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt2().pushFrontCrossOf(a3), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isCross()));
        }

        default public <A3, A4> Iterative1Supplier4<T1, A3, A4, A1, A2> pushFrontCrossOf(Iterable<? extends A3> a3, Iterable<? extends A4> a4) {
            return new Iterative1Supplier4.Iterative1Supplier4Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt2().pushFrontCrossOf(a3, a4), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isCross()));
        }

        default public <A3, A4, A5> Iterative1Supplier5<T1, A3, A4, A5, A1, A2> pushFrontCrossOf(Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5) {
            return new Iterative1Supplier5.Iterative1Supplier5Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt2().pushFrontCrossOf(a3, a4, a5), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isCross()));
        }

        default public <A3, A4, A5, A6> Iterative1Supplier6<T1, A3, A4, A5, A6, A1, A2> pushFrontCrossOf(Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5, Iterable<? extends A6> a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt2().pushFrontCrossOf(a3, a4, a5, a6), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isCross()));
        }

        default public <A3, A4, A5, A6, A7> Iterative1Supplier7<T1, A3, A4, A5, A6, A7, A1, A2> pushFrontCrossOf(Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5, Iterable<? extends A6> a6, Iterable<? extends A7> a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt2().pushFrontCrossOf(a3, a4, a5, a6, a7), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isCross()));
        }

        default public <A3> Iterative1Supplier3<T1, A1, A2, A3> pushBackCross(A3 a3) {
            return new Iterative1Supplier3.Iterative1Supplier3Impl<>(this.innerIterative().pushBackCross(a3));
        }

        default public <A3, A4> Iterative1Supplier4<T1, A1, A2, A3, A4> pushBackCross(A3 a3, A4 a4) {
            return new Iterative1Supplier4.Iterative1Supplier4Impl<>(this.innerIterative().pushBackCross(a3, a4));
        }

        default public <A3, A4, A5> Iterative1Supplier5<T1, A1, A2, A3, A4, A5> pushBackCross(A3 a3, A4 a4, A5 a5) {
            return new Iterative1Supplier5.Iterative1Supplier5Impl<>(this.innerIterative().pushBackCross(a3, a4, a5));
        }

        default public <A3, A4, A5, A6> Iterative1Supplier6<T1, A1, A2, A3, A4, A5, A6> pushBackCross(A3 a3, A4 a4, A5 a5, A6 a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(this.innerIterative().pushBackCross(a3, a4, a5, a6));
        }

        default public <A3, A4, A5, A6, A7> Iterative1Supplier7<T1, A1, A2, A3, A4, A5, A6, A7> pushBackCross(A3 a3, A4 a4, A5 a5, A6 a6, A7 a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(this.innerIterative().pushBackCross(a3, a4, a5, a6, a7));
        }

        default public <A3> Iterative1Supplier3<T1, A3, A1, A2> pushFrontCross(A3 a3) {
            return new Iterative1Supplier3.Iterative1Supplier3Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt2().pushFrontCross(a3), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isCross()));
        }

        default public <A3, A4> Iterative1Supplier4<T1, A3, A4, A1, A2> pushFrontCross(A3 a3, A4 a4) {
            return new Iterative1Supplier4.Iterative1Supplier4Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt2().pushFrontCross(a3, a4), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isCross()));
        }

        default public <A3, A4, A5> Iterative1Supplier5<T1, A3, A4, A5, A1, A2> pushFrontCross(A3 a3, A4 a4, A5 a5) {
            return new Iterative1Supplier5.Iterative1Supplier5Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt2().pushFrontCross(a3, a4, a5), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isCross()));
        }

        default public <A3, A4, A5, A6> Iterative1Supplier6<T1, A3, A4, A5, A6, A1, A2> pushFrontCross(A3 a3, A4 a4, A5 a5, A6 a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt2().pushFrontCross(a3, a4, a5, a6), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isCross()));
        }

        default public <A3, A4, A5, A6, A7> Iterative1Supplier7<T1, A3, A4, A5, A6, A7, A1, A2> pushFrontCross(A3 a3, A4 a4, A5 a5, A6 a6, A7 a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt2().pushFrontCross(a3, a4, a5, a6, a7), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isCross()));
        }

        default public <A3> Iterative1Supplier3<T1, A1, A2, A3> pushBackInlineOf(Iterable<? extends A3> a3) {
            return new Iterative1Supplier3.Iterative1Supplier3Impl<>(this.innerIterative().pushBackInlineOf(a3));
        }

        default public <A3, A4> Iterative1Supplier4<T1, A1, A2, A3, A4> pushBackInlineOf(Iterable<? extends A3> a3, Iterable<? extends A4> a4) {
            return new Iterative1Supplier4.Iterative1Supplier4Impl<>(this.innerIterative().pushBackInlineOf(a3, a4));
        }

        default public <A3, A4, A5> Iterative1Supplier5<T1, A1, A2, A3, A4, A5> pushBackInlineOf(Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5) {
            return new Iterative1Supplier5.Iterative1Supplier5Impl<>(this.innerIterative().pushBackInlineOf(a3, a4, a5));
        }

        default public <A3, A4, A5, A6> Iterative1Supplier6<T1, A1, A2, A3, A4, A5, A6> pushBackInlineOf(Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5, Iterable<? extends A6> a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(this.innerIterative().pushBackInlineOf(a3, a4, a5, a6));
        }

        default public <A3, A4, A5, A6, A7> Iterative1Supplier7<T1, A1, A2, A3, A4, A5, A6, A7> pushBackInlineOf(Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5, Iterable<? extends A6> a6, Iterable<? extends A7> a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(this.innerIterative().pushBackInlineOf(a3, a4, a5, a6, a7));
        }

        default public <A3> Iterative1Supplier3<T1, A3, A1, A2> pushFrontInlineOf(Iterable<? extends A3> a3) {
            return new Iterative1Supplier3.Iterative1Supplier3Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt2().pushFrontInlineOf(a3), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isInline()));
        }

        default public <A3, A4> Iterative1Supplier4<T1, A3, A4, A1, A2> pushFrontInlineOf(Iterable<? extends A3> a3, Iterable<? extends A4> a4) {
            return new Iterative1Supplier4.Iterative1Supplier4Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt2().pushFrontInlineOf(a3, a4), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isInline()));
        }

        default public <A3, A4, A5> Iterative1Supplier5<T1, A3, A4, A5, A1, A2> pushFrontInlineOf(Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5) {
            return new Iterative1Supplier5.Iterative1Supplier5Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt2().pushFrontInlineOf(a3, a4, a5), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isInline()));
        }

        default public <A3, A4, A5, A6> Iterative1Supplier6<T1, A3, A4, A5, A6, A1, A2> pushFrontInlineOf(Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5, Iterable<? extends A6> a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt2().pushFrontInlineOf(a3, a4, a5, a6), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isInline()));
        }

        default public <A3, A4, A5, A6, A7> Iterative1Supplier7<T1, A3, A4, A5, A6, A7, A1, A2> pushFrontInlineOf(Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5, Iterable<? extends A6> a6, Iterable<? extends A7> a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt2().pushFrontInlineOf(a3, a4, a5, a6, a7), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isInline()));
        }

        default public <A3> Iterative1Supplier3<T1, A1, A2, A3> pushBackInline(A3 a3) {
            return new Iterative1Supplier3.Iterative1Supplier3Impl<>(this.innerIterative().pushBackInline(a3));
        }

        default public <A3, A4> Iterative1Supplier4<T1, A1, A2, A3, A4> pushBackInline(A3 a3, A4 a4) {
            return new Iterative1Supplier4.Iterative1Supplier4Impl<>(this.innerIterative().pushBackInline(a3, a4));
        }

        default public <A3, A4, A5> Iterative1Supplier5<T1, A1, A2, A3, A4, A5> pushBackInline(A3 a3, A4 a4, A5 a5) {
            return new Iterative1Supplier5.Iterative1Supplier5Impl<>(this.innerIterative().pushBackInline(a3, a4, a5));
        }

        default public <A3, A4, A5, A6> Iterative1Supplier6<T1, A1, A2, A3, A4, A5, A6> pushBackInline(A3 a3, A4 a4, A5 a5, A6 a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(this.innerIterative().pushBackInline(a3, a4, a5, a6));
        }

        default public <A3, A4, A5, A6, A7> Iterative1Supplier7<T1, A1, A2, A3, A4, A5, A6, A7> pushBackInline(A3 a3, A4 a4, A5 a5, A6 a6, A7 a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(this.innerIterative().pushBackInline(a3, a4, a5, a6, a7));
        }

        default public <A3> Iterative1Supplier3<T1, A3, A1, A2> pushFrontInline(A3 a3) {
            return new Iterative1Supplier3.Iterative1Supplier3Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt2().pushFrontInline(a3), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isInline()));
        }

        default public <A3, A4> Iterative1Supplier4<T1, A3, A4, A1, A2> pushFrontInline(A3 a3, A4 a4) {
            return new Iterative1Supplier4.Iterative1Supplier4Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt2().pushFrontInline(a3, a4), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isInline()));
        }

        default public <A3, A4, A5> Iterative1Supplier5<T1, A3, A4, A5, A1, A2> pushFrontInline(A3 a3, A4 a4, A5 a5) {
            return new Iterative1Supplier5.Iterative1Supplier5Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt2().pushFrontInline(a3, a4, a5), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isInline()));
        }

        default public <A3, A4, A5, A6> Iterative1Supplier6<T1, A3, A4, A5, A6, A1, A2> pushFrontInline(A3 a3, A4 a4, A5 a5, A6 a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt2().pushFrontInline(a3, a4, a5, a6), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isInline()));
        }

        default public <A3, A4, A5, A6, A7> Iterative1Supplier7<T1, A3, A4, A5, A6, A7, A1, A2> pushFrontInline(A3 a3, A4 a4, A5 a5, A6 a6, A7 a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt2().pushFrontInline(a3, a4, a5, a6, a7), this.innerIterative().iterableStream1(), this.innerIterative().splitLt2().isInline()));
        }

        public static class Iterative1Supplier2Impl<T1, A1, A2> implements TransformSupplier<T1, A1, A2> {

            private final Iterative3<T1, A1, A2> iterative;

            Iterative1Supplier2Impl(Iterative3<? extends T1, ? extends A1, ? extends A2> iterative) {
                @SuppressWarnings("unchecked")
                final Iterative3<T1, A1, A2> iter = (Iterative3<T1, A1, A2>) iterative;
                this.iterative = iter;
            }

            @Override
            public Iterative3<T1, A1, A2> innerIterative() {
                return this.iterative;
            }

            @Override
            public Iterative1Supplier2<T1, A1, A2> checkAll() {
                if (this.iterative.splitRt2().toStream().isEmpty()) {
                    final Iterative3Cross<T1, A1, A2> iterative = this.iterative
                            .splitLt1()
                            .create(IterativeHandler.streamWrap(Option.<T1>none()))
                            .pushBackOf(Option.<A1>none())
                            .pushBackOf(Option.<A2>none());
                    return new Iterative1Supplier2.Iterative1Supplier2Impl<>(iterative);
                } else {
                    return this;
                }
            }

            @Override
            public Iterative1Supplier2<T1, A1, A2> checkArgs() {
                if (this.iterative.splitRt2().toStream().isEmpty()) {
                    final Iterative3Cross<T1, A1, A2> iterative = this.iterative
                            .splitLt1()
                            .pushBackOf(Option.<A1>none())
                            .pushBackOf(Option.<A2>none());
                    return new Iterative1Supplier2.Iterative1Supplier2Impl<>(iterative);
                } else {
                    return this;
                }
            }

            private Iterative1Supplier1<T1, A2> usingLt(Cs2<? super T1, ? super A1> c, boolean isCross) {
                if (this.iterative.isCross() == isCross) {
                    this.iterative.splitLt2().forEach(c);
                } else {
                    this.iterative.create(this.iterative.splitLt1(), this.iterative.iterableStream2(), isCross).forEach(c);
                }
                boolean argLtCross = this.iterative.isCross();
                return new Iterative1Supplier1.Iterative1Supplier1Impl<>(argLtCross ? this.iterative.splitRt1().pushFrontCrossBy(this.iterative.iterableStream1()) : this.iterative.splitRt1().pushFrontInlineBy(this.iterative.iterableStream1()));
            }

            private Iterative1Supplier1<T1, A1> usingRt(Cs2<? super T1, ? super A2> c, boolean isCross) {
                this.iterative.create(this.iterative.splitLt1(), this.iterative.iterableStream3(), isCross).forEach(c);
                return new Iterative1Supplier1.Iterative1Supplier1Impl<>(this.iterative.splitLt2());
            }

            @Override
            public Iterative1Supplier1<T1, A2> usingLt(Cs2<? super T1, ? super A1> c) {
                return this.usingLt(c, this.iterative.splitLt1().isCross());
            }

            @Override
            public Iterative1Supplier1<T1, A1> usingRt(Cs2<? super T1, ? super A2> c) {
                return this.usingRt(c, this.iterative.isCross());
            }

            @Override
            public Iterative1Supplier1<T1, A2> usingInlineLt(Cs2<? super T1, ? super A1> c) {
                return this.usingLt(c, false);
            }

            @Override
            public Iterative1Supplier1<T1, A1> usingInlineRt(Cs2<? super T1, ? super A2> c) {
                return this.usingRt(c, false);
            }

            @Override
            public Iterative1Supplier1<T1, A2> usingCrossLt(Cs2<? super T1, ? super A1> c) {
                return this.usingLt(c, true);
            }

            @Override
            public Iterative1Supplier1<T1, A1> usingCrossRt(Cs2<? super T1, ? super A2> c) {
                return this.usingRt(c, true);
            }

            @Override
            public Iterative1<T1> toIterative() {
                return this.iterative.splitLt1();
            }

        }

        public static interface TransformSupplier<T1, A1, A2> extends Iterative1Supplier2<T1, A1, A2> {

            public Iterative1Supplier2<T1, A1, A2> checkAll();

            public Iterative1Supplier2<T1, A1, A2> checkArgs();
        }

    }

    public static interface Iterative1Supplier1<T1, A1> extends IterativeSupplier {

        public Iterative1<T1> using(Cs2<? super T1, ? super A1> var1);

        public Iterative1<T1> usingInline(Cs2<? super T1, ? super A1> var1);

        public Iterative1<T1> usingCross(Cs2<? super T1, ? super A1> var1);

        public Iterative1<T1> toIterative();

        public Iterative2<T1, A1> innerIterative();

        default public <A2> Iterative1Supplier2<T1, A1, A2> pushBackCrossOf(Iterable<? extends A2> a2) {
            return new Iterative1Supplier2.Iterative1Supplier2Impl<>(this.innerIterative().pushBackCrossOf(a2));
        }

        default public <A2, A3> Iterative1Supplier3<T1, A1, A2, A3> pushBackCrossOf(Iterable<? extends A2> a2, Iterable<? extends A3> a3) {
            return new Iterative1Supplier3.Iterative1Supplier3Impl<>(this.innerIterative().pushBackCrossOf(a2, a3));
        }

        default public <A2, A3, A4> Iterative1Supplier4<T1, A1, A2, A3, A4> pushBackCrossOf(Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4) {
            return new Iterative1Supplier4.Iterative1Supplier4Impl<>(this.innerIterative().pushBackCrossOf(a2, a3, a4));
        }

        default public <A2, A3, A4, A5> Iterative1Supplier5<T1, A1, A2, A3, A4, A5> pushBackCrossOf(Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5) {
            return new Iterative1Supplier5.Iterative1Supplier5Impl<>(this.innerIterative().pushBackCrossOf(a2, a3, a4, a5));
        }

        default public <A2, A3, A4, A5, A6> Iterative1Supplier6<T1, A1, A2, A3, A4, A5, A6> pushBackCrossOf(Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5, Iterable<? extends A6> a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(this.innerIterative().pushBackCrossOf(a2, a3, a4, a5, a6));
        }

        default public <A2, A3, A4, A5, A6, A7> Iterative1Supplier7<T1, A1, A2, A3, A4, A5, A6, A7> pushBackCrossOf(Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5, Iterable<? extends A6> a6, Iterable<? extends A7> a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(this.innerIterative().pushBackCrossOf(a2, a3, a4, a5, a6, a7));
        }

        default public <A2> Iterative1Supplier2<T1, A2, A1> pushFrontCrossOf(Iterable<? extends A2> a2) {
            return new Iterative1Supplier2.Iterative1Supplier2Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt().pushFrontCrossOf(a2), this.innerIterative().iterableStream1(), this.innerIterative().isCross()));
        }

        default public <A2, A3> Iterative1Supplier3<T1, A2, A3, A1> pushFrontCrossOf(Iterable<? extends A2> a2, Iterable<? extends A3> a3) {
            return new Iterative1Supplier3.Iterative1Supplier3Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt().pushFrontCrossOf(a2, a3), this.innerIterative().iterableStream1(), this.innerIterative().isCross()));
        }

        default public <A2, A3, A4> Iterative1Supplier4<T1, A2, A3, A4, A1> pushFrontCrossOf(Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4) {
            return new Iterative1Supplier4.Iterative1Supplier4Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt().pushFrontCrossOf(a2, a3, a4), this.innerIterative().iterableStream1(), this.innerIterative().isCross()));
        }

        default public <A2, A3, A4, A5> Iterative1Supplier5<T1, A2, A3, A4, A5, A1> pushFrontCrossOf(Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5) {
            return new Iterative1Supplier5.Iterative1Supplier5Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt().pushFrontCrossOf(a2, a3, a4, a5), this.innerIterative().iterableStream1(), this.innerIterative().isCross()));
        }

        default public <A2, A3, A4, A5, A6> Iterative1Supplier6<T1, A2, A3, A4, A5, A6, A1> pushFrontCrossOf(Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5, Iterable<? extends A6> a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt().pushFrontCrossOf(a2, a3, a4, a5, a6), this.innerIterative().iterableStream1(), this.innerIterative().isCross()));
        }

        default public <A2, A3, A4, A5, A6, A7> Iterative1Supplier7<T1, A2, A3, A4, A5, A6, A7, A1> pushFrontCrossOf(Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5, Iterable<? extends A6> a6, Iterable<? extends A7> a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt().pushFrontCrossOf(a2, a3, a4, a5, a6, a7), this.innerIterative().iterableStream1(), this.innerIterative().isCross()));
        }

        default public <A2> Iterative1Supplier2<T1, A1, A2> pushBackCross(A2 a2) {
            return new Iterative1Supplier2.Iterative1Supplier2Impl<>(this.innerIterative().pushBackCross(a2));
        }

        default public <A2, A3> Iterative1Supplier3<T1, A1, A2, A3> pushBackCross(A2 a2, A3 a3) {
            return new Iterative1Supplier3.Iterative1Supplier3Impl<>(this.innerIterative().pushBackCross(a2, a3));
        }

        default public <A2, A3, A4> Iterative1Supplier4<T1, A1, A2, A3, A4> pushBackCross(A2 a2, A3 a3, A4 a4) {
            return new Iterative1Supplier4.Iterative1Supplier4Impl<>(this.innerIterative().pushBackCross(a2, a3, a4));
        }

        default public <A2, A3, A4, A5> Iterative1Supplier5<T1, A1, A2, A3, A4, A5> pushBackCross(A2 a2, A3 a3, A4 a4, A5 a5) {
            return new Iterative1Supplier5.Iterative1Supplier5Impl<>(this.innerIterative().pushBackCross(a2, a3, a4, a5));
        }

        default public <A2, A3, A4, A5, A6> Iterative1Supplier6<T1, A1, A2, A3, A4, A5, A6> pushBackCross(A2 a2, A3 a3, A4 a4, A5 a5, A6 a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(this.innerIterative().pushBackCross(a2, a3, a4, a5, a6));
        }

        default public <A2, A3, A4, A5, A6, A7> Iterative1Supplier7<T1, A1, A2, A3, A4, A5, A6, A7> pushBackCross(A2 a2, A3 a3, A4 a4, A5 a5, A6 a6, A7 a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(this.innerIterative().pushBackCross(a2, a3, a4, a5, a6, a7));
        }

        default public <A2> Iterative1Supplier2<T1, A2, A1> pushFrontCross(A2 a2) {
            return new Iterative1Supplier2.Iterative1Supplier2Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt().pushFrontCross(a2), this.innerIterative().iterableStream1(), this.innerIterative().isCross()));
        }

        default public <A2, A3> Iterative1Supplier3<T1, A2, A3, A1> pushFrontCross(A2 a2, A3 a3) {
            return new Iterative1Supplier3.Iterative1Supplier3Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt().pushFrontCross(a2, a3), this.innerIterative().iterableStream1(), this.innerIterative().isCross()));
        }

        default public <A2, A3, A4> Iterative1Supplier4<T1, A2, A3, A4, A1> pushFrontCross(A2 a2, A3 a3, A4 a4) {
            return new Iterative1Supplier4.Iterative1Supplier4Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt().pushFrontCross(a2, a3, a4), this.innerIterative().iterableStream1(), this.innerIterative().isCross()));
        }

        default public <A2, A3, A4, A5> Iterative1Supplier5<T1, A2, A3, A4, A5, A1> pushFrontCross(A2 a2, A3 a3, A4 a4, A5 a5) {
            return new Iterative1Supplier5.Iterative1Supplier5Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt().pushFrontCross(a2, a3, a4, a5), this.innerIterative().iterableStream1(), this.innerIterative().isCross()));
        }

        default public <A2, A3, A4, A5, A6> Iterative1Supplier6<T1, A2, A3, A4, A5, A6, A1> pushFrontCross(A2 a2, A3 a3, A4 a4, A5 a5, A6 a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt().pushFrontCross(a2, a3, a4, a5, a6), this.innerIterative().iterableStream1(), this.innerIterative().isCross()));
        }

        default public <A2, A3, A4, A5, A6, A7> Iterative1Supplier7<T1, A2, A3, A4, A5, A6, A7, A1> pushFrontCross(A2 a2, A3 a3, A4 a4, A5 a5, A6 a6, A7 a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt().pushFrontCross(a2, a3, a4, a5, a6, a7), this.innerIterative().iterableStream1(), this.innerIterative().isCross()));
        }

        default public <A2> Iterative1Supplier2<T1, A1, A2> pushBackInlineOf(Iterable<? extends A2> a2) {
            return new Iterative1Supplier2.Iterative1Supplier2Impl<>(this.innerIterative().pushBackInlineOf(a2));
        }

        default public <A2, A3> Iterative1Supplier3<T1, A1, A2, A3> pushBackInlineOf(Iterable<? extends A2> a2, Iterable<? extends A3> a3) {
            return new Iterative1Supplier3.Iterative1Supplier3Impl<>(this.innerIterative().pushBackInlineOf(a2, a3));
        }

        default public <A2, A3, A4> Iterative1Supplier4<T1, A1, A2, A3, A4> pushBackInlineOf(Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4) {
            return new Iterative1Supplier4.Iterative1Supplier4Impl<>(this.innerIterative().pushBackInlineOf(a2, a3, a4));
        }

        default public <A2, A3, A4, A5> Iterative1Supplier5<T1, A1, A2, A3, A4, A5> pushBackInlineOf(Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5) {
            return new Iterative1Supplier5.Iterative1Supplier5Impl<>(this.innerIterative().pushBackInlineOf(a2, a3, a4, a5));
        }

        default public <A2, A3, A4, A5, A6> Iterative1Supplier6<T1, A1, A2, A3, A4, A5, A6> pushBackInlineOf(Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5, Iterable<? extends A6> a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(this.innerIterative().pushBackInlineOf(a2, a3, a4, a5, a6));
        }

        default public <A2, A3, A4, A5, A6, A7> Iterative1Supplier7<T1, A1, A2, A3, A4, A5, A6, A7> pushBackInlineOf(Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5, Iterable<? extends A6> a6, Iterable<? extends A7> a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(this.innerIterative().pushBackInlineOf(a2, a3, a4, a5, a6, a7));
        }

        default public <A2> Iterative1Supplier2<T1, A2, A1> pushFrontInlineOf(Iterable<? extends A2> a2) {
            return new Iterative1Supplier2.Iterative1Supplier2Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt().pushFrontInlineOf(a2), this.innerIterative().iterableStream1(), this.innerIterative().isInline()));
        }

        default public <A2, A3> Iterative1Supplier3<T1, A2, A3, A1> pushFrontInlineOf(Iterable<? extends A2> a2, Iterable<? extends A3> a3) {
            return new Iterative1Supplier3.Iterative1Supplier3Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt().pushFrontInlineOf(a2, a3), this.innerIterative().iterableStream1(), this.innerIterative().isInline()));
        }

        default public <A2, A3, A4> Iterative1Supplier4<T1, A2, A3, A4, A1> pushFrontInlineOf(Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4) {
            return new Iterative1Supplier4.Iterative1Supplier4Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt().pushFrontInlineOf(a2, a3, a4), this.innerIterative().iterableStream1(), this.innerIterative().isInline()));
        }

        default public <A2, A3, A4, A5> Iterative1Supplier5<T1, A2, A3, A4, A5, A1> pushFrontInlineOf(Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5) {
            return new Iterative1Supplier5.Iterative1Supplier5Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt().pushFrontInlineOf(a2, a3, a4, a5), this.innerIterative().iterableStream1(), this.innerIterative().isInline()));
        }

        default public <A2, A3, A4, A5, A6> Iterative1Supplier6<T1, A2, A3, A4, A5, A6, A1> pushFrontInlineOf(Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5, Iterable<? extends A6> a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt().pushFrontInlineOf(a2, a3, a4, a5, a6), this.innerIterative().iterableStream1(), this.innerIterative().isInline()));
        }

        default public <A2, A3, A4, A5, A6, A7> Iterative1Supplier7<T1, A2, A3, A4, A5, A6, A7, A1> pushFrontInlineOf(Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5, Iterable<? extends A6> a6, Iterable<? extends A7> a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt().pushFrontInlineOf(a2, a3, a4, a5, a6, a7), this.innerIterative().iterableStream1(), this.innerIterative().isInline()));
        }

        default public <A2> Iterative1Supplier2<T1, A1, A2> pushBackInline(A2 a2) {
            return new Iterative1Supplier2.Iterative1Supplier2Impl<>(this.innerIterative().pushBackInline(a2));
        }

        default public <A2, A3> Iterative1Supplier3<T1, A1, A2, A3> pushBackInline(A2 a2, A3 a3) {
            return new Iterative1Supplier3.Iterative1Supplier3Impl<>(this.innerIterative().pushBackInline(a2, a3));
        }

        default public <A2, A3, A4> Iterative1Supplier4<T1, A1, A2, A3, A4> pushBackInline(A2 a2, A3 a3, A4 a4) {
            return new Iterative1Supplier4.Iterative1Supplier4Impl<>(this.innerIterative().pushBackInline(a2, a3, a4));
        }

        default public <A2, A3, A4, A5> Iterative1Supplier5<T1, A1, A2, A3, A4, A5> pushBackInline(A2 a2, A3 a3, A4 a4, A5 a5) {
            return new Iterative1Supplier5.Iterative1Supplier5Impl<>(this.innerIterative().pushBackInline(a2, a3, a4, a5));
        }

        default public <A2, A3, A4, A5, A6> Iterative1Supplier6<T1, A1, A2, A3, A4, A5, A6> pushBackInline(A2 a2, A3 a3, A4 a4, A5 a5, A6 a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(this.innerIterative().pushBackInline(a2, a3, a4, a5, a6));
        }

        default public <A2, A3, A4, A5, A6, A7> Iterative1Supplier7<T1, A1, A2, A3, A4, A5, A6, A7> pushBackInline(A2 a2, A3 a3, A4 a4, A5 a5, A6 a6, A7 a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(this.innerIterative().pushBackInline(a2, a3, a4, a5, a6, a7));
        }

        default public <A2> Iterative1Supplier2<T1, A2, A1> pushFrontInline(A2 a2) {
            return new Iterative1Supplier2.Iterative1Supplier2Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt().pushFrontInline(a2), this.innerIterative().iterableStream1(), this.innerIterative().isInline()));
        }

        default public <A2, A3> Iterative1Supplier3<T1, A2, A3, A1> pushFrontInline(A2 a2, A3 a3) {
            return new Iterative1Supplier3.Iterative1Supplier3Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt().pushFrontInline(a2, a3), this.innerIterative().iterableStream1(), this.innerIterative().isInline()));
        }

        default public <A2, A3, A4> Iterative1Supplier4<T1, A2, A3, A4, A1> pushFrontInline(A2 a2, A3 a3, A4 a4) {
            return new Iterative1Supplier4.Iterative1Supplier4Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt().pushFrontInline(a2, a3, a4), this.innerIterative().iterableStream1(), this.innerIterative().isInline()));
        }

        default public <A2, A3, A4, A5> Iterative1Supplier5<T1, A2, A3, A4, A5, A1> pushFrontInline(A2 a2, A3 a3, A4 a4, A5 a5) {
            return new Iterative1Supplier5.Iterative1Supplier5Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt().pushFrontInline(a2, a3, a4, a5), this.innerIterative().iterableStream1(), this.innerIterative().isInline()));
        }

        default public <A2, A3, A4, A5, A6> Iterative1Supplier6<T1, A2, A3, A4, A5, A6, A1> pushFrontInline(A2 a2, A3 a3, A4 a4, A5 a5, A6 a6) {
            return new Iterative1Supplier6.Iterative1Supplier6Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt().pushFrontInline(a2, a3, a4, a5, a6), this.innerIterative().iterableStream1(), this.innerIterative().isInline()));
        }

        default public <A2, A3, A4, A5, A6, A7> Iterative1Supplier7<T1, A2, A3, A4, A5, A6, A7, A1> pushFrontInline(A2 a2, A3 a3, A4 a4, A5 a5, A6 a6, A7 a7) {
            return new Iterative1Supplier7.Iterative1Supplier7Impl<>(IterativePush.pushFrontArg(this.innerIterative().splitRt().pushFrontInline(a2, a3, a4, a5, a6, a7), this.innerIterative().iterableStream1(), this.innerIterative().isInline()));
        }

        public static class Iterative1Supplier1Impl<T1, A1> implements TransformSupplier<T1, A1> {

            private final Iterative2<T1, A1> iterative;

            Iterative1Supplier1Impl(Iterative2<? extends T1, ? extends A1> iterative) {
                @SuppressWarnings("unchecked")
                final Iterative2<T1, A1> iter = (Iterative2<T1, A1>) iterative;
                this.iterative = iter;
            }

            @Override
            public Iterative2<T1, A1> innerIterative() {
                return this.iterative;
            }

            @Override
            public Iterative1Supplier1<T1, A1> checkAll() {
                if (this.iterative.splitRt().toStream().isEmpty()) {
                    final Iterative2Cross<T1, A1> iterative = this.iterative
                            .splitLt()
                            .create(IterativeHandler.streamWrap(Option.<T1>none()))
                            .pushBackOf(Option.<A1>none());
                    return new Iterative1Supplier1.Iterative1Supplier1Impl<>(iterative);
                } else {
                    return this;
                }
            }

            @Override
            public Iterative1Supplier1<T1, A1> checkArgs() {
                if (this.iterative.splitRt().toStream().isEmpty()) {
                    final Iterative2Cross<T1, A1> iterative = this.iterative
                            .splitLt()
                            .pushBackOf(Option.<A1>none());
                    return new Iterative1Supplier1.Iterative1Supplier1Impl<>(iterative);
                } else {
                    return this;
                }
            }

            private Iterative1<T1> using(Cs2<? super T1, ? super A1> c, boolean isCross) {
                if (this.iterative.isCross() == isCross) {
                    this.iterative.forEach(c);
                } else {
                    this.iterative.create(this.iterative.splitLt(), this.iterative.iterableStream2(), isCross).forEach(c);
                }
                return this.iterative.splitLt();
            }

            @Override
            public Iterative1<T1> using(Cs2<? super T1, ? super A1> c) {
                return this.using(c, this.iterative.isCross());
            }

            @Override
            public Iterative1<T1> usingInline(Cs2<? super T1, ? super A1> c) {
                return this.using(c, false);
            }

            @Override
            public Iterative1<T1> usingCross(Cs2<? super T1, ? super A1> c) {
                return this.using(c, true);
            }

            @Override
            public Iterative1<T1> toIterative() {
                return this.iterative.splitLt();
            }

        }

        public static interface TransformSupplier<T1, A1> extends Iterative1Supplier1<T1, A1> {

            public Iterative1Supplier1<T1, A1> checkAll();

            public Iterative1Supplier1<T1, A1> checkArgs();
        }

    }

    public static interface IterativePush {

        public static <T1, A1, A2> Iterative3<T1, A2, A1> pushFrontArg(Iterative2<A2, A1> iterative, Iterable<? extends Stream<? extends T1>> iterable, boolean cross) {
            return cross ? iterative.pushFrontCrossBy(iterable) : iterative.pushFrontInlineBy(iterable);
        }

        public static <T1, A1, A2, A3> Iterative4<T1, A2, A3, A1> pushFrontArg(Iterative3<A2, A3, A1> iterative, Iterable<? extends Stream<? extends T1>> iterable, boolean cross) {
            return cross ? iterative.pushFrontCrossBy(iterable) : iterative.pushFrontInlineBy(iterable);
        }

        public static <T1, A1, A2, A3, A4> Iterative5<T1, A2, A3, A4, A1> pushFrontArg(Iterative4<A2, A3, A4, A1> iterative, Iterable<? extends Stream<? extends T1>> iterable, boolean cross) {
            return cross ? iterative.pushFrontCrossBy(iterable) : iterative.pushFrontInlineBy(iterable);
        }

        public static <T1, A1, A2, A3, A4, A5> Iterative6<T1, A2, A3, A4, A5, A1> pushFrontArg(Iterative5<A2, A3, A4, A5, A1> iterative, Iterable<? extends Stream<? extends T1>> iterable, boolean cross) {
            return cross ? iterative.pushFrontCrossBy(iterable) : iterative.pushFrontInlineBy(iterable);
        }

        public static <T1, A1, A2, A3, A4, A5, A6> Iterative7<T1, A2, A3, A4, A5, A6, A1> pushFrontArg(Iterative6<A2, A3, A4, A5, A6, A1> iterative, Iterable<? extends Stream<? extends T1>> iterable, boolean cross) {
            return cross ? iterative.pushFrontCrossBy(iterable) : iterative.pushFrontInlineBy(iterable);
        }

        public static <T1, A1, A2, A3, A4, A5, A6, A7> Iterative8<T1, A2, A3, A4, A5, A6, A7, A1> pushFrontArg(Iterative7<A2, A3, A4, A5, A6, A7, A1> iterative, Iterable<? extends Stream<? extends T1>> iterable, boolean cross) {
            return cross ? iterative.pushFrontCrossBy(iterable) : iterative.pushFrontInlineBy(iterable);
        }

    }

}

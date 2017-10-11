package com.qulix.shestakaa.maybe;

import java.util.NoSuchElementException;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public abstract class MaybeWithoutNull<T> {

    private static final MaybeWithoutNull<?> EMPTY = new Empty<Object>();

    private MaybeWithoutNull() {}

    public static <T> MaybeWithoutNull<T> empty() {
        return (MaybeWithoutNull<T>) EMPTY;
    }

    public static <T> MaybeWithoutNull<T> just(final T value) {
        return new Just<>(value);
    }

    public abstract boolean isDefined();

    public abstract T get();


    private static final class Empty<T> extends MaybeWithoutNull<T>
    {
        @Override
        public boolean isDefined() {
            return false;
        }

        @Override
        public T get() {
            throw new NoSuchElementException("No such value.");
        }
    }

    private static final class Just<T> extends MaybeWithoutNull<T>
    {
        private final T mValue;

        private Just(final T value) {
            mValue = value;
        }

        @Override
        public boolean isDefined() {
            return true;
        }

        @Override
        public T get() {
            return mValue;
        }
    }

}
package com.qulix.shestakaa.maybe.maybeWithoutNull;

import com.qulix.shestakaa.maybe.utils.Validator;

import java.util.NoSuchElementException;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public abstract class Maybe<T> {

    private static final Maybe<?> EMPTY = new Empty<Object>();

    private Maybe() {}

    public static <T> Maybe<T> empty() {
        //noinspection unchecked
        return (Maybe<T>) EMPTY;
    }

    public static <T> Maybe<T> just(final T value) {
        return new Just<>(value);
    }

    public abstract boolean isDefined();

    public abstract T get();


    private static final class Empty<T> extends Maybe<T>
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

    private static final class Just<T> extends Maybe<T>
    {
        private final T mValue;

        private Just(final T value) {
            Validator.isArgNotNull(value, "value");
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
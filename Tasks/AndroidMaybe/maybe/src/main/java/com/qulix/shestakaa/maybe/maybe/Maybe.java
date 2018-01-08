package com.qulix.shestakaa.maybe.maybe;

import com.qulix.shestakaa.maybe.utils.Validator;

import java.util.NoSuchElementException;

import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.Nullable;

@ParametersAreNonnullByDefault
public class Maybe<T> {

    private static final Maybe<?> EMPTY = new Maybe<>(null);

    @Nullable
    private final T mValue;

    private Maybe(@Nullable final T value) {
        mValue = value;
    }

    public static <T> Maybe<T> just(final T value) {
        Validator.isArgNotNull(value, "value");
        return new Maybe<>(value);
    }

    @SuppressWarnings("unchecked")
    public static <T> Maybe<T> empty() {
        return (Maybe<T>) EMPTY;
    }

    public T getOrThrow() {
        if (mValue == null) {
            throw new NoSuchElementException("No such value.");
        }
        return mValue;
    }

    public boolean isDefined() {
        return mValue != null;
    }

}

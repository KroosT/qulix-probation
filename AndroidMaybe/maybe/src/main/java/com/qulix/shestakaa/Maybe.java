package com.qulix.shestakaa;

import com.qulix.shestakaa.Utils.Validator;
import java.util.NoSuchElementException;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
class Maybe<T> {

    @Nullable
    private final T mValue;

    private Maybe(@Nullable final T value) {
        mValue = value;
    }

    public static <T> Maybe<T> just(final T value) {
        Validator.isArgNotNull(value, "value");
        return new Maybe<>(value);
    }

    public static <T> Maybe<T> empty() {
        return new Maybe<>((T) null);
    }

    public T getValueOrThrow() {
        if (mValue == null) {
            throw new NoSuchElementException("No such value.");
        }
        return mValue;
    }

    public boolean isDefined() {
        return mValue != null;
    }
}

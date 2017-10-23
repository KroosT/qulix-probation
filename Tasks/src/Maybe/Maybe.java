package Maybe;

import java.util.NoSuchElementException;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

import Utils.Validator;


@ParametersAreNonnullByDefault
class Maybe<T> {

    private final static Maybe<?> EMPTY = new Maybe<>(null);

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

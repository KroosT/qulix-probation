package Myabe;

import java.util.NoSuchElementException;

class Maybe<T> {

    private final T mValue;

    private Maybe(final T value) {
        mValue = value;
    }

    public static <T> Maybe<T> create(final T value) {
        return new Maybe<>(value);
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

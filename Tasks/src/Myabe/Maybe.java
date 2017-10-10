package Myabe;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

class Maybe<T> {

    private final List<T> mValue;

    Maybe() {
        mValue = new ArrayList<>();
    }

    void add(final T value) {
        mValue.add(value);
    }

    T get(final T value) {
        if (isDefined(value)) {
            return value;
        } else {
            throw new NoSuchElementException("Instance has no value.");
        }
    }

    private boolean isDefined(final T value) {
        return mValue.contains(value);
    }
}

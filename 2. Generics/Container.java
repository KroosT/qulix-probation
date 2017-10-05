package com.example;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Collections;

class Container<T> {

    private final ArrayList<T> array;

    Container() {
        this.array = new ArrayList<>();
    }

    Container(@NonNull final Container<T> container) {
        if (container == null) {
            throw new NullPointerException("Parameter cannot be null");
        }
        this.array = container.getArray();
    }

    private ArrayList<T> getArray() {
        return array;
    }

    void add(final T object) {
        array.add(object);
    }

    void remove(final int index) {
        array.remove(index);
    }

    void remove(final T object) {
        array.removeAll(Collections.singleton(object));
    }

    @Override
    public String toString() {
        return array.toString();
    }
}
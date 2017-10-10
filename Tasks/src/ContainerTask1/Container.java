package ContainerTask1;

import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Utils.Validator;

class Container<T> {

    private final List<T> mList;

    Container() {
        mList = new ArrayList<>();
    }

    Container(@NotNull final Container<T> container) {
        Validator.isArgNotNull(container, "container");
        mList = new ArrayList<>(container.getList());
    }

    List<T> getList() {
        return new ArrayList<>(mList);
    }

    void add(final T object) {
        mList.add(object);
    }

    T remove(final int index) {
        return mList.remove(index);
    }

    void remove(final T object) {
        mList.removeAll(Collections.singleton(object));
    }

    @Override
    public String toString() {
        return mList.toString();
    }

}
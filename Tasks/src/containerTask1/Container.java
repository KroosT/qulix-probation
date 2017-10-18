package containerTask1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.ParametersAreNonnullByDefault;

import utils.Validator;

@ParametersAreNonnullByDefault
class Container<T> {

    private final List<T> mList;

    Container() {
        mList = new ArrayList<>();
    }

    Container(final Container<T> container) {
        Validator.isArgNotNull(container, "container");
        mList = container.getList();
    }

    List<T> getList() {
        return new ArrayList<>(mList);
    }

    void add(final T object) {
        mList.add(object);
    }

    T removeAt(final int index) {
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
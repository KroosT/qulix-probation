package ContainerTask1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.ParametersAreNonnullByDefault;

import Utils.Validator;

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

    T removeByIndex(final int index) {
        return mList.remove(index);
    }

    void removeObject(final T object) {
        mList.removeAll(Collections.singleton(object));
    }

    @Override
    public String toString() {
        return mList.toString();
    }

}
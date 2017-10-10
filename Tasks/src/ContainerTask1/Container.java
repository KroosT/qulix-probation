package ContainerTask1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Container<T> {

    private final List<T> mList;

    Container() {
        mList = new ArrayList<>();
    }

    Container(final Container<T> container) {
        if (container == null) {
            mList = new ArrayList<>();
        } else {
            mList = new ArrayList<>(container.getList());
        }
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
package ContainerTask3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Container<T extends AnswersTo<E>, E> {

    private final List<T> mList;

    Container() {
        mList = new ArrayList<>();
    }

    Container(final Container<T, E> container) {
        if (container == null) {
            mList = new ArrayList<>();
        } else mList = new ArrayList<>(container.getList());
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

    Container<T, E> allThatAnswersTo(final E req) {
        final Container<T, E> containerThatAnswersTo = new Container<>();
        for (final T object : mList) {
            if (object.answersTo(req))
                containerThatAnswersTo.add(object);
        }
        return containerThatAnswersTo;
    }

    @Override
    public String toString() {
        return mList.toString();
    }

}
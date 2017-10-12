package ContainerTask2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.ParametersAreNonnullByDefault;

import Utils.Validator;

@ParametersAreNonnullByDefault
class Container<T extends AnswersTo> {

    private final List<T> mList;

    Container() {
        mList = new ArrayList<>();
    }

    Container(final Container<T> container) {
        Validator.isArgNotNull(container, "container");
        mList = new ArrayList<>(container.getList());

    }

    List<T> getList() {
        return new ArrayList<>(mList);
    }

    void add(final T object) {
        mList.add(object);
    }

    public T remove(final int index) {
        return mList.remove(index);
    }

    public void remove(final T object) {
        mList.removeAll(Collections.singleton(object));
    }

    Container<T> allThatAnswersTo(final String req) {
        Validator.isArgNotNull(req, "req");
        final Container<T> containerThatAnswersTo = new Container<>();
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

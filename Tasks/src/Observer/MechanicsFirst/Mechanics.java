package Observer.MechanicsFirst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Nonnull;

import Utils.Validator;

class Mechanics {

    private final List<Observer> mObservers = new ArrayList<>();

    // called by system
    private void onMousePosition(final int x, final int y) {
        for (final Observer observer : new ArrayList<>(mObservers)) {
            observer.onMousePositionEvent(Arrays.asList(x, y));
        }
    }

    public void subscribe(@Nonnull final Observer observer) {
        Validator.isArgNotNull(observer, "observer");
        mObservers.add(observer);
    }

    public void unsubscribe(@Nonnull final Observer observer) {
        Validator.isArgNotNull(observer, "observer");
        if (!mObservers.isEmpty()) {
            mObservers.remove(observer);
        }
    }

    public void call() {
        onMousePosition(21, 13);
    }

}

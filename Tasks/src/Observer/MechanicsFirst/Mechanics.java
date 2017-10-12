package Observer.MechanicsFirst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Mechanics {

    private final List<Observer> mObservers = new ArrayList<>();

    // called by system
    private void onMousePosition(final int x, final int y) {
        final List<Integer> params = Arrays.asList(x, y);
        notifyAllSubscribers("onMousePosition", params);
    }

    public void subscribe(final Observer observer) {
        mObservers.add(observer);
    }

    public void unsubscribe(final Observer observer) {
        mObservers.remove(observer);
    }

    public void call() {
        onMousePosition(21, 13);
    }

    private void notifyAllSubscribers(final String methodName, final List<Integer> params) {
        for (final Observer observer : mObservers) {
            observer.handleEvent(methodName, params);
        }
    }
}

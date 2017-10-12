package Observer.MechanicsThird;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Mechanics {

    private final List<Observer> mObservers = new ArrayList<>();

    // called by system
    private void onMousePosition(final int x, final int y) {
        for (final Observer observer : mObservers) {
            observer.onMousePositionEvent(Arrays.asList(x, y));
        }
    }

    // called by system
    private void onMouseClicked() {
        for (final Observer observer : mObservers) {
            observer.onMouseClickedEvent();
        }
    }

    // called by system
    private void onDiskAppeared() {
        for (final Observer observer : mObservers) {
            observer.onDiscAppearedEvent();
        }
    }

    // called by system
    private void onDiskLost() {
        for (final Observer observer : mObservers) {
            observer.onDiscLostEvent();
        }
    }

    public void subscribe(final Observer observer) {
        mObservers.add(observer);
    }

    public void unsubscribe(final Observer observer) {
        mObservers.remove(observer);
    }

    public void call() {
        onMousePosition(21, 13);
        onDiskAppeared();
        onMouseClicked();
        onDiskLost();
    }

}

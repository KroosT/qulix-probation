package DialogController;

class Dialog<T extends Controller> {
    private final T mController;

    Dialog(final T controller) {
        mController = controller;
    }

    // called by system
    public final void onOpened() {
        mController.onOpened();
    }

    // called by system
    public final void onClosed() {
        mController.onClosed();
    }

    final T getController() {
        return mController;
    }
}


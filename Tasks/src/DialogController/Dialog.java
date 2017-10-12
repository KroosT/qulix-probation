package DialogController;

import javax.annotation.ParametersAreNonnullByDefault;

import Utils.Validator;

@ParametersAreNonnullByDefault
class Dialog<T extends Controller> {
    private final T mController;

    Dialog(final T controller) {
        Validator.isArgNotNull(controller, "controller");
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


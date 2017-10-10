package DialogController;

class DateSelectDialog extends Dialog<DateSelector> {

    public DateSelectDialog(final DateSelector controller) {
        super(controller);
    }

    // called by system
    public final void onDateSelected() {
        super.getController().onDateSelected();
    }
}

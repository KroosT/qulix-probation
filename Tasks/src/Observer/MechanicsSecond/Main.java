package Observer.MechanicsSecond;

import java.util.List;

import javax.annotation.Nonnull;

import Utils.Validator;

class Main {
    public static void main(final String[] args) {
        final Mechanics mechanics = new Mechanics();

        for (int i = 0; i < 5; i++) {
            mechanics.subscribe(new Observer() {
                @Override
                public void onMousePositionEvent(@Nonnull final List<Integer> params) {
                    Validator.isArgNotNull(params, "params");
                    final StringBuilder event = new StringBuilder("Event: onMousePosition;")
                            .append(" Params: ");
                    for (final Integer param : params) {
                        event.append(param).append(" ");
                    }
                    System.out.println(event);
                }

                @Override
                public void onMouseClickedEvent() {
                    final StringBuilder event = new StringBuilder("Event: onMouseClicked;")
                            .append(" Params: no params");
                    System.out.println(event);
                }
            });
        }

        mechanics.call();
    }
}

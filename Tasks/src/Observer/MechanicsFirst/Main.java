package Observer.MechanicsFirst;

import Utils.Validator;

public class Main {
    public static void main(final String[] args) {
        final Mechanics mechanics = new Mechanics();

        for (int i = 0; i < 5; i++) {
            mechanics.subscribe((params) -> {
                Validator.isArgNotNull(params, "params");
                final StringBuilder event = new StringBuilder("Event: onMouseClick;")
                        .append(" Params: ");
                for (final Integer param : params) {
                    event.append(param).append(" ");
                }
                System.out.println(event);
            });
        }

        mechanics.call();
    }
}

package Observer.MechanicsFirst;

import java.util.List;

import javax.annotation.Nonnull;

import Utils.Validator;

public class Main {
    public static void main(final String[] args) {
        final Mechanics mechanics = new Mechanics();

        mechanics.subscribe(params -> {
            Validator.isArgNotNull(params, "params");
            final StringBuilder eventDescription = new StringBuilder("Observer first; ")
                    .append("Event: onMouseClick; ")
                    .append("Params: ");
            for (final Integer param : params) {
                eventDescription.append(param).append(" ");
            }
            System.out.println(eventDescription);
        });

        mechanics.subscribe(new Observer() {
            private int countOfOnMousePositionEventHappened = 0;

            @Override
            public void onMousePositionEvent(@Nonnull final List<Integer> params) {
                Validator.isArgNotNull(params, "params");

                countOfOnMousePositionEventHappened += 1;
                if (countOfOnMousePositionEventHappened > 3) {
                    mechanics.unsubscribe(this);
                }

                final StringBuilder eventDescription = new StringBuilder("Observer second; ")
                        .append("Event: onMouseClick; ")
                        .append("Params: ");
                for (final Integer param : params) {
                    eventDescription.append(param).append(" ");
                }
                System.out.println(eventDescription);
            }
        });


        mechanics.call();
        mechanics.call();
        mechanics.call();
        mechanics.call();
        mechanics.call();
        mechanics.call();
    }
}

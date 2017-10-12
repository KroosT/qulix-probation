package Observer.MechanicsFirst;

public class Main {
    public static void main(final String[] args) {
        final Mechanics mechanics = new Mechanics();

        for (int i = 0; i < 10; i++) {
            mechanics.subscribe((methodName, params) -> {
                final StringBuilder event = new StringBuilder("Method: ").append(methodName)
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

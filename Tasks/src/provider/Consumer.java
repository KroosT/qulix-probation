package provider;

import java.util.List;

class Consumer {
    public static void consume(final List<? extends A> as) {
        // actual processing is not relied to problem

    }

    public static void consume(final A as) {
        // actual processing is not relied to problem
    }
}
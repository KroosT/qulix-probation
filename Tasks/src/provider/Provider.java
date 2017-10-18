package provider;

import java.util.ArrayList;

class Provider {
    public void provide() {
        Consumer.consume(new ArrayList<B>());
    }

    public void provideB() {
        Consumer.consume(new B());
    }
}

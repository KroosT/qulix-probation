package provider;

import java.util.ArrayList;

class Provider {
    public void provideList() {
        Consumer.consume(new ArrayList<B>());
    }

    public void provide() {
        Consumer.consume(new B());
    }

    public void provideArray() {
        final B[] b = new B[]{ new B(), new B()};

        //error here
        b[1] = new C();

        //but there is no error at compile time, but error at runtime!
        final A[] a = b;
        a[1] = new C();

        Consumer.consume(new B[] {new B()});
    }
}

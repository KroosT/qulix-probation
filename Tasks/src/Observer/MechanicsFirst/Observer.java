package Observer.MechanicsFirst;

import java.util.List;

public interface Observer {
    void handleEvent(final String methodName, final List<Integer> params);
}

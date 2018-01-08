package Observer.MechanicsFirst;

import javax.annotation.Nonnull;

import java.util.List;

public interface Observer {
    void onMousePositionEvent(@Nonnull final List<Integer> params);
}

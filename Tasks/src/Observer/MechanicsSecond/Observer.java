package Observer.MechanicsSecond;

import java.util.List;

import javax.annotation.Nonnull;

public interface Observer {
    void onMousePositionEvent(@Nonnull final List<Integer> params);

    void onMouseClickedEvent();
}

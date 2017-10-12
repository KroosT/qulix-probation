package Observer.MechanicsThird;

import java.util.List;

import javax.annotation.Nonnull;

public interface Observer {

    void onMousePositionEvent(@Nonnull final List<Integer> params);

    void onMouseClickedEvent();

    void onDiscAppearedEvent();

    void onDiscLostEvent();

}
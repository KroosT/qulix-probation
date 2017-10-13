package ContainerTask2;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class ContainerTest {

    private Container<Realtek> mRealtekContainer;

    @Before
    public void init() {
        mRealtekContainer = new Container<>();
    }

    @Test
    public void testRemoveAtCorrectlyRemovesObjectByPassedIndex() throws Exception {
        final Realtek realtek1 = new Realtek("AUDIO");
        final Realtek realtek2 = new Realtek("AUDIO");
        final Realtek realtek3 = new Realtek("NETWORK");
        final Realtek realtek4 = new Realtek("NETWORK");
        final Realtek realtek5 = new Realtek("NETWORK");

        mRealtekContainer.add(realtek1);
        mRealtekContainer.add(realtek2);
        mRealtekContainer.add(realtek3);
        mRealtekContainer.add(realtek4);
        mRealtekContainer.add(realtek5);

        mRealtekContainer.removeAt(1);
        final List<Realtek> expected = Arrays.asList(realtek1, realtek3, realtek4, realtek5);

        assertThat(mRealtekContainer.getList()).isEqualTo(expected);
    }

    @Test
    public void testRemoveObjectCorrectlyRemovesPassedObject() throws Exception {
        final Realtek realtek1 = new Realtek("AUDIO");
        final Realtek realtek2 = new Realtek("AUDIO");
        final Realtek realtek3 = new Realtek("NETWORK");
        final Realtek realtek4 = new Realtek("NETWORK");
        final Realtek realtek5 = new Realtek("NETWORK");

        mRealtekContainer.add(realtek1);
        mRealtekContainer.add(realtek2);
        mRealtekContainer.add(realtek3);
        mRealtekContainer.add(realtek4);
        mRealtekContainer.add(realtek5);

        mRealtekContainer.remove(realtek3);

        final List<Realtek> expected = Arrays.asList(realtek1, realtek2, realtek4, realtek5);

        assertThat(mRealtekContainer.getList()).isEqualTo(expected);
    }

    @Test
    public void testCopyConstructorReturnsNotTheSameObject() throws Exception {
        mRealtekContainer.add(new Realtek("AUDIO"));
        mRealtekContainer.add(new Realtek("AUDIO"));
        mRealtekContainer.add(new Realtek("NETWORK"));

        final Container<Realtek> copy = new Container<>(mRealtekContainer);

        copy.removeAt(2);

        assertThat(mRealtekContainer.getList()).isNotEqualTo(copy.getList());
    }

    @Test
    public void testContainerFilterByCertainParameter() throws Exception {
        final Realtek realtek1 = new Realtek("AUDIO");
        final Realtek realtek2 = new Realtek("AUDIO");
        final Realtek realtek3 = new Realtek("NETWORK");
        final Realtek realtek4 = new Realtek("NETWORK");
        final Realtek realtek5 = new Realtek("NETWORK");

        mRealtekContainer.add(realtek1);
        mRealtekContainer.add(realtek2);
        mRealtekContainer.add(realtek3);
        mRealtekContainer.add(realtek4);
        mRealtekContainer.add(realtek5);

        final Container<Realtek> realtekContainerAnswersTo = mRealtekContainer.allThatAnswersTo("AUDIO");

        final List<Realtek> expected = Arrays.asList(realtek1, realtek2);

        assertThat(realtekContainerAnswersTo.getList()).isEqualTo(expected);
    }

}
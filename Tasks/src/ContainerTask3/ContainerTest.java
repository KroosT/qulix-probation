package ContainerTask3;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

import static ContainerTask3.RealtekProductType.AUDIO;
import static ContainerTask3.RealtekProductType.NETWORK;

public class ContainerTest {



    @Test
    public void testContainerFilterByStringParameter() throws Exception {

        final Container<Realtek, String> mContainer = new Container<>();

        final Realtek realtek1 = new Realtek("AUDIO");
        final Realtek realtek2 = new Realtek("AUDIO");
        final Realtek realtek3 = new Realtek("NETWORK");
        final Realtek realtek4 = new Realtek("NETWORK");
        final Realtek realtek5 = new Realtek("NETWORK");

        mContainer.add(realtek1);
        mContainer.add(realtek2);
        mContainer.add(realtek3);
        mContainer.add(realtek4);
        mContainer.add(realtek5);

        final Container<Realtek, String> containerAnswersTo = mContainer
                .allThatAnswersTo("AUDIO");
        final List<Realtek> expected = Arrays.asList(realtek1, realtek2);

        assertThat(containerAnswersTo.getList()).isEqualTo(expected);

    }

    @Test
    public void testContainerFilterByEnumParameter() throws Exception {

        final Container<RealtekNew, RealtekProductType> container = new Container<>();

        final RealtekNew realtek1 = new RealtekNew(AUDIO);
        final RealtekNew realtek2 = new RealtekNew(AUDIO);
        final RealtekNew realtek3 = new RealtekNew(NETWORK);
        final RealtekNew realtek4 = new RealtekNew(NETWORK);
        final RealtekNew realtek5 = new RealtekNew(NETWORK);

        container.add(realtek1);
        container.add(realtek2);
        container.add(realtek3);
        container.add(realtek4);
        container.add(realtek5);

        final Container<RealtekNew, RealtekProductType> containerAnswersTo =
                container.allThatAnswersTo(NETWORK);

        final List<RealtekNew> expected = Arrays.asList(realtek3, realtek4, realtek5);

        assertThat(containerAnswersTo.getList()).isEqualTo(expected);


    }

}
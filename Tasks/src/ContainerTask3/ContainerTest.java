package ContainerTask3;

import org.junit.Assert;
import org.junit.Test;

import static ContainerTask3.RealtekProductType.AUDIO;
import static ContainerTask3.RealtekProductType.NETWORK;

public class ContainerTest {
    @Test
    public void testContainerFilterByStringParameter() throws Exception {
        final Container<Realtek, String> realtekContainer = new Container<>();

        realtekContainer.add(new Realtek("Audio"));
        realtekContainer.add(new Realtek("Audio"));
        realtekContainer.add(new Realtek("Audio"));
        realtekContainer.add(new Realtek("Network"));
        realtekContainer.add(new Realtek("Network"));

        final Container<Realtek, String> realtekContainerAnswersTo = realtekContainer
                .allThatAnswersTo("AUDIO");

        Assert.assertEquals(realtekContainerAnswersTo.getList().size(), 3);
    }

    @Test
    public void testContainerFilterByEnumParameter() throws Exception {
        final Container<RealtekNew, RealtekProductType> realtekNewContainer = new Container<>();

        realtekNewContainer.add(new RealtekNew(AUDIO));
        realtekNewContainer.add(new RealtekNew(AUDIO));
        realtekNewContainer.add(new RealtekNew(AUDIO));
        realtekNewContainer.add(new RealtekNew(NETWORK));
        realtekNewContainer.add(new RealtekNew(NETWORK));

        final Container<RealtekNew, RealtekProductType> realtek2ContainerAnswersTo =
                realtekNewContainer.allThatAnswersTo(NETWORK);

        Assert.assertEquals(realtek2ContainerAnswersTo.getList().size(), 2);


    }

}
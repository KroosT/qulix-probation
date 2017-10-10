package ContainerTask3;

import org.junit.Assert;
import org.junit.Test;

import static ContainerTask3.RealtekProductType.AUDIO;
import static ContainerTask3.RealtekProductType.NETWORK;

public class ContainerTest {
    @Test
    public void allThatAnswersTo() throws Exception {
        final Container<Realtek, String> realtekContainer = new Container<>();
        final Container<RealtekNew, RealtekProductType> realtekNewContainer = new Container<>();
        realtekContainer.add(new Realtek("Audio"));
        realtekContainer.add(new Realtek("Audio"));
        realtekContainer.add(new Realtek("Audio"));
        realtekContainer.add(new Realtek("Network"));
        realtekContainer.add(new Realtek("Network"));
        realtekNewContainer.add(new RealtekNew(AUDIO));
        realtekNewContainer.add(new RealtekNew(AUDIO));
        realtekNewContainer.add(new RealtekNew(AUDIO));
        realtekNewContainer.add(new RealtekNew(NETWORK));
        realtekNewContainer.add(new RealtekNew(NETWORK));
        final Container<Realtek, String> realtekContainerAnswersTo = realtekContainer.allThatAnswersTo("AUDIO");
        final Container<RealtekNew, RealtekProductType> realtek2ContainerAnswersTo = realtekNewContainer.allThatAnswersTo(NETWORK);

        Assert.assertEquals(realtekContainerAnswersTo.getList().size(), 3);
        Assert.assertEquals(realtek2ContainerAnswersTo.getList().size(), 2);
    }

}
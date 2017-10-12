package ContainerTask2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContainerTest {

    @Test
    public void testContainerFilterByCertainParameter() throws Exception {
        final Container<Realtek> realtekContainer = new Container<>();
        realtekContainer.add(new Realtek("Audio"));
        realtekContainer.add(new Realtek("Audio"));
        realtekContainer.add(new Realtek("Audio"));
        realtekContainer.add(new Realtek("Network"));
        realtekContainer.add(new Realtek("Network"));
        final Container<Realtek> realtekContainerAnswersTo = realtekContainer.allThatAnswersTo("AUDIO");
        Assert.assertEquals(realtekContainerAnswersTo.getList().size(), 3);
    }

}
package ContainerTask1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContainerTest {

    private final Container<Integer> mContainerOfIntegers = new Container<>();

    @Before
    public void init() {
        mContainerOfIntegers.add(30);
        mContainerOfIntegers.add(28);
        mContainerOfIntegers.add(1);
        mContainerOfIntegers.add(28);
        mContainerOfIntegers.add(30);
        mContainerOfIntegers.add(28);
        mContainerOfIntegers.add(1);
    }

    @Test
    public void testRemoveObjectByIndex() throws Exception {
        final Integer removedItem = mContainerOfIntegers.removeAt(1);
        Assert.assertFalse("Container must not contain removed item any more",
                mContainerOfIntegers.getList().get(1).equals(removedItem));
    }

    @Test
    public void testRemoveObject() throws Exception {
        final Integer value = 28;
        mContainerOfIntegers.remove(value);
        Assert.assertFalse("Container must not contain removed item any more",
                mContainerOfIntegers.getList().contains(value));
    }

}
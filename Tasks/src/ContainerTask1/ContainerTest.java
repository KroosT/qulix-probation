package ContainerTask1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ContainerTest {

    private final Container<Integer> mContainerOfIntegers = new Container<>();
    private final Container<String> mContainerOfStrings = new Container<>();

    @Test
    public void add() throws Exception {
        mContainerOfIntegers.add(30);
        mContainerOfIntegers.add(28);
        mContainerOfIntegers.add(1);
        mContainerOfStrings.add("Realtek -");
        mContainerOfStrings.add("piece");
        mContainerOfStrings.add("of shit");
        final List<Integer> listOfIntegers = new ArrayList<>();
        final List<String> listOfString = new ArrayList<>();
        listOfIntegers.add(30);
        listOfIntegers.add(28);
        listOfIntegers.add(1);
        listOfString.add("Realtek -");
        listOfString.add("piece");
        listOfString.add("of shit");
        Assert.assertArrayEquals(listOfIntegers.toArray(), mContainerOfIntegers.getList().toArray());
        Assert.assertArrayEquals(listOfString.toArray(), mContainerOfStrings.getList().toArray());
    }

    @Test
    public void remove() throws Exception {
        mContainerOfIntegers.add(30);
        mContainerOfIntegers.add(28);
        mContainerOfIntegers.add(1);
        final Integer removedItem = mContainerOfIntegers.remove(1);
        Assert.assertFalse("Container must not contain removed item any more",
                mContainerOfIntegers.getList().contains(removedItem));
    }

    @Test
    public void remove1() throws Exception {
        final Integer value = 28;
        mContainerOfIntegers.add(30);
        mContainerOfIntegers.add(28);
        mContainerOfIntegers.add(1);
        mContainerOfIntegers.add(28);
        mContainerOfIntegers.remove(value);
        Assert.assertFalse("Container must not contain removed item any more",
                mContainerOfIntegers.getList().contains(value));
    }

    @Test
    public void copyContainer() throws Exception {
        final Container<Integer> integerContainer = new Container<>(mContainerOfIntegers);
        final Container<String> stringContainer = new Container<>(mContainerOfStrings);
        Assert.assertNotEquals(integerContainer, mContainerOfIntegers);
        Assert.assertNotEquals(stringContainer, mContainerOfStrings);

    }

}
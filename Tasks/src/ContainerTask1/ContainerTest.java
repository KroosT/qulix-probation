package ContainerTask1;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class ContainerTest {

    private Container<Integer> mContainerOfIntegers;

    @Before
    public void init() {
        mContainerOfIntegers = new Container<>();
    }

    @Test
    public void testRemoveAtCorrectlyRemovesObjectByPassedIndex() throws Exception {
        mContainerOfIntegers.add(30);
        mContainerOfIntegers.add(28);
        mContainerOfIntegers.add(1);
        mContainerOfIntegers.add(28);

        mContainerOfIntegers.removeAt(1);
        final List<Integer> expected = Arrays.asList(30, 1, 28);

        assertThat(mContainerOfIntegers.getList()).isEqualTo(expected);
    }

    @Test
    public void testRemoveObjectCorrectlyRemovesPassedObject() throws Exception {
        mContainerOfIntegers.add(30);
        mContainerOfIntegers.add(28);
        mContainerOfIntegers.add(1);

        mContainerOfIntegers.remove(28);
        final List<Integer> expected = Arrays.asList(30, 1);

        assertThat(mContainerOfIntegers.getList()).isEqualTo(expected);
    }

    @Test
    public void testCopyConstructorReturnsNotTheSameObject() throws Exception {
        mContainerOfIntegers.add(30);
        mContainerOfIntegers.add(28);
        mContainerOfIntegers.add(1);

        final Container<Integer> copy = new Container<>(mContainerOfIntegers);

        assertThat(copy.getList()).isNotSameAs(mContainerOfIntegers.getList());
    }
}
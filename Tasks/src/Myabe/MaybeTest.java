package Myabe;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

public class MaybeTest {

    private final Maybe<Integer> mIntegerMaybe = new Maybe<>();

    @Before
    public void setUp() throws Exception {
        mIntegerMaybe.add(20);
        mIntegerMaybe.add(124);
        mIntegerMaybe.add(2340);
        mIntegerMaybe.add(123);
        mIntegerMaybe.add(2123);
        mIntegerMaybe.add(1);
        mIntegerMaybe.add(13);
    }

    @Test
    public void testGet() throws Exception {
        Assert.assertEquals(mIntegerMaybe.get(2123), Integer.valueOf(2123));
        Assert.assertEquals(mIntegerMaybe.get(1), Integer.valueOf(1));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetWithException() {
        Assert.assertEquals(mIntegerMaybe.get(2), Integer.valueOf(123));
    }

}
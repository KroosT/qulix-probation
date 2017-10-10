package Myabe;

import org.junit.Assert;
import org.junit.Test;

import java.util.NoSuchElementException;

public class MaybeTest {

    private final Maybe<Integer> mIntegerMaybe = Maybe.create(229);
    private final Maybe<Integer> mNullMaybe = Maybe.create(null);

    @Test
    public void testGet() throws Exception {
        Integer integerValue = null;
        Integer nullValue = null;
        if (mIntegerMaybe.isDefined()) {
            integerValue = mIntegerMaybe.getValueOrThrow();
        }
        if (mNullMaybe.isDefined()) {
            nullValue = mNullMaybe.getValueOrThrow();
        }
        Assert.assertEquals(integerValue, Integer.valueOf(229));
        Assert.assertEquals(nullValue, null);
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetWithException() {
        Assert.assertEquals(mNullMaybe.getValueOrThrow(), null);
    }

}
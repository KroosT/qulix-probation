package com.qulix.shestakaa.maybe.MaybeWithoutNull;

import org.junit.Assert;
import org.junit.Test;

import java.util.NoSuchElementException;

public class MaybeTest {

    private final Maybe<Integer> empty = Maybe.empty();
    private final Maybe<Integer> mIntegerMaybe = Maybe.just(223);

    @Test
    public void testGet() throws Exception {
        Integer integerValue = null;
        Integer emptyValue = null;
        if (mIntegerMaybe.isDefined()) {
            integerValue = mIntegerMaybe.get();
        }
        if (empty.isDefined()) {
            emptyValue = empty.get();
        }
        Assert.assertEquals(integerValue, Integer.valueOf(223));
        Assert.assertEquals(emptyValue, null);
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetWithException() {
        empty.get();
    }
}
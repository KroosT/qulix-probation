package com.qulix.shestakaa.maybe.MaybeWithoutNull;

import org.junit.Assert;
import org.junit.Test;

import java.util.NoSuchElementException;

public class MaybeTest {

    private final Maybe<Integer> empty = Maybe.empty();
    private final Maybe<Integer> mIntegerMaybe = Maybe.just(229);

    @Test
    public void testGetOfIntegerMaybe() throws Exception {
        Integer integerValue = null;

        if (mIntegerMaybe.isDefined()) {
            integerValue = mIntegerMaybe.get();
        }

        Assert.assertEquals(integerValue, Integer.valueOf(229));
    }

    @Test
    public void testGetOfEmptyMaybe() throws Exception {
        Integer nullValue = null;

        if (empty.isDefined()) {
            nullValue = empty.get();
        }

        Assert.assertEquals(nullValue, null);
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetWithException() {
        empty.get();
    }
}
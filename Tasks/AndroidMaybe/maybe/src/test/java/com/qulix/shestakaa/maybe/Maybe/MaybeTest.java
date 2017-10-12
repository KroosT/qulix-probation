package com.qulix.shestakaa.maybe.Maybe;

import org.junit.Assert;
import org.junit.Test;

import java.util.NoSuchElementException;

public class MaybeTest {

    private final Maybe<Integer> mIntegerMaybe = Maybe.just(229);
    private final Maybe<Integer> mNullMaybe = Maybe.empty();

    @Test
    public void testGetOfIntegerMaybe() throws Exception {
        Integer integerValue = null;

        if (mIntegerMaybe.isDefined()) {
            integerValue = mIntegerMaybe.getOrThrow();
        }

        Assert.assertEquals(integerValue, Integer.valueOf(229));
    }

    @Test
    public void testGetOfNullMaybe() throws Exception {
        Integer nullValue = null;

        if (mNullMaybe.isDefined()) {
            nullValue = mNullMaybe.getOrThrow();
        }

        Assert.assertEquals(nullValue, null);
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetWithException() {
        Assert.assertEquals(mNullMaybe.getOrThrow(), null);
    }

}
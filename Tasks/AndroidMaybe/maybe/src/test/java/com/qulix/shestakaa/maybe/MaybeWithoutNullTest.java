package com.qulix.shestakaa.maybe;

import org.junit.Assert;
import org.junit.Test;

import java.util.NoSuchElementException;

public class MaybeWithoutNullTest {

    private final MaybeWithoutNull<Integer> empty = MaybeWithoutNull.empty();
    private final MaybeWithoutNull<Integer> mIntegerMaybeWithoutNull = MaybeWithoutNull.just(223);

    @Test
    public void testGet() throws Exception {
        Integer integerValue = null;
        Integer emptyValue = null;
        if (mIntegerMaybeWithoutNull.isDefined()) {
            integerValue = mIntegerMaybeWithoutNull.get();
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
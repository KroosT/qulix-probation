package com.qulix.shestakaa.maybe.maybe;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import java.util.NoSuchElementException;

public class MaybeTest {

    @Test
    public void testIsDefinedReturnsTrue() {
        final Maybe<Integer> integerMaybe = Maybe.just(229);
        assertThat(integerMaybe.isDefined()).isEqualTo(true);
    }

    @Test
    public void testIsDefinedReturnsFalse() {
        final Maybe<Integer> emptyMaybe = Maybe.empty();
        assertThat(emptyMaybe.isDefined()).isEqualTo(false);
    }

    @Test
    public void testGetOrThrowReturnsCorrectValue() throws Exception {
        final Maybe<Integer> integerMaybe = Maybe.just(229);
        assertThat(integerMaybe.getOrThrow()).isEqualTo(Integer.valueOf(229));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetOrThrowReturnsException() {
        final Maybe<Integer> emptyMaybe = Maybe.empty();
        emptyMaybe.getOrThrow();
    }

}
package Maybe;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.NoSuchElementException;

public class MaybeTest {

    @Test
    public void IfDefined_NonEmptyMaybe_True() {
        final Maybe<Integer> integerMaybe = Maybe.just(229);
        assertTrue(integerMaybe.isDefined());
    }

    @Test
    public void IfDefined_EmptyMaybe_False() {
        final Maybe<Integer> emptyMaybe = Maybe.empty();
        assertFalse(emptyMaybe.isDefined());
    }

    @Test
    public void GetOrThrow_NonEmptyMaybe_Value() throws Exception {
        final Maybe<Integer> integerMaybe = Maybe.just(229);
        assertEquals(integerMaybe.getOrThrow(), Integer.valueOf(229));
    }

    @Test(expected = NoSuchElementException.class)
    public void GetOrThrow_EmptyMaybe_Exception() throws Exception {

        final Maybe<Integer> emptyMaybe = Maybe.empty();
        final int value = emptyMaybe.getOrThrow();
    }

}
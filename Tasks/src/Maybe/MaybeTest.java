package Maybe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.NoSuchElementException;

public class MaybeTest {

    @Test
    public void testIfDefinedReturnsTrue() {
        final Maybe<Integer> integerMaybe = Maybe.just(229);
        assertEquals(integerMaybe.isDefined(), true);
    }

    @Test
    public void testIfDefinedReturnsFalse() {
        final Maybe<Integer> emptyMaybe = Maybe.empty();
        assertEquals(emptyMaybe.isDefined(), false);
    }

    @Test
    public void testGetOrThrowReturnsValue() throws Exception {
        final Maybe<Integer> integerMaybe = Maybe.just(229);
        assertEquals(integerMaybe.getOrThrow(), Integer.valueOf(229));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetOrThrowReturnsException() throws Exception {

        final Maybe<Integer> emptyMaybe = Maybe.empty();
        assertEquals(emptyMaybe.getOrThrow(), null);
    }

}
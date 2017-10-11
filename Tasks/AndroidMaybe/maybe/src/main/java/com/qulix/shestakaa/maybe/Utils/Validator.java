package com.qulix.shestakaa.maybe.Utils;

public class Validator {

    public static void isArgNotNull(final Object arg, final String name) {
        if (arg == null) {
            throw new IllegalArgumentException(name + " should not be null.");
        }
    }

}

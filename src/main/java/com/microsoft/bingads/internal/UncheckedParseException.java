package com.microsoft.bingads.internal;

import java.text.ParseException;

/**
 * Reserved for internal use.
 */
public class UncheckedParseException extends RuntimeException {
    public UncheckedParseException(ParseException cause) {
        super(cause);
    }
}

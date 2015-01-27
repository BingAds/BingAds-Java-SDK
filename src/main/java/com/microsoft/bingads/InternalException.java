package com.microsoft.bingads;

/**
 * This exception will be thrown if the SDK cannot perform some task due to an internal error.
 */
public class InternalException extends RuntimeException {
    public InternalException(Throwable cause) {
        super("Internal BingAds SDK exception has occured", cause);
    }
}

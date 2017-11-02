package com.microsoft.bingads;

/**
 * Allows to call an implementation that adds specified HTTP header for use with Bing Ads calls.
 */
public abstract class HeadersImpl {
    /**
     * Adds a header that should be used with Bing Ads calls.
     *
     * @param name header name
     * @param value header value
     */
    public abstract void addHeader(String name, String value);
}

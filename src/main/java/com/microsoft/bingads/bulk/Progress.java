package com.microsoft.bingads.bulk;

/**
 * Allows to track progress of some operation.
 * @param <T>
 */
public interface Progress<T> {

    /**
     * This method will be called when a new progress value is available.
     * @param value
     */
    public void report(T value);
}

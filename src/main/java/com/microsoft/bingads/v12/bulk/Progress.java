package com.microsoft.bingads.v12.bulk;

/**
 * Allows to track progress of a long running operation.
 *
 * @param <T> the type of report value
 */
public interface Progress<T> {

    /**
     * This method will be called when a new progress value is available.
     *
     * @param value the value to be reported
     */
    public void report(T value);
}

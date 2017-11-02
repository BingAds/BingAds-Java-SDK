package com.microsoft.bingads;

import java.util.concurrent.Future;

/**
 * Allows to handle results of an async method.
 *
 * @param <T> the type of result
 */
public interface AsyncCallback<T> {

    /**
     * Will be called when the result of the async method is available.
     *
     * @param result the future task
     */
    void onCompleted(Future<T> result);
}

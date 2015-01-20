package com.microsoft.bingads;

import java.util.concurrent.Future;

public interface AsyncCallback<T> {

    void onCompleted(Future<T> result);
}

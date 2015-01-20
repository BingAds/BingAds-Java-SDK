package com.microsoft.bingads.bulk;

import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import javax.xml.ws.Response;

public abstract class SyncResponse<T> implements Response<T> {

    @Override
    public boolean cancel(boolean mayInterruptIfRunning) {
        return false;
    }

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public boolean isDone() {
        return true;
    }

    @Override
    public T get(long timeout,
            TimeUnit unit) throws InterruptedException,
            ExecutionException, TimeoutException {
        return this.get();
    }

    @Override
    public Map<String, Object> getContext() {
        // TODO Auto-generated method stub
        return null;
    }
}

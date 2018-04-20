package com.microsoft.bingads.v11.api.test.operations;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import javax.xml.ws.Response;

import com.microsoft.bingads.internal.ServiceUtils;

public class CompleteResponse<T> implements Response<T> {

    T result;
    List<StringHeader> headers;
    
    public CompleteResponse(T result, List<StringHeader> headers) {
        this.result = result;
        this.headers = headers;
    }
    
    @Override
    public Map getContext() {
        Map<String, Object> map = new HashMap<String, Object>() {{
            put(ServiceUtils.TRACKING_KEY, headers.get(0).getStringContent());
        }};
        
        return map;
    }

    @Override
    public boolean cancel(boolean mayInterruptIfRunning) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public T get() throws InterruptedException, ExecutionException {
        return result;
    }

    @Override
    public T get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return result;
    }
    
}

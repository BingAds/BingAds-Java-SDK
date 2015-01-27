package com.microsoft.bingads.api.test.operations;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.xml.ws.Response;
import org.apache.cxf.headers.Header;

public class CompleteResponse<T> implements Response<T> {

    T result;
    List<Header> headers;
    
    public CompleteResponse(T result, List<Header> headers) {
        this.result = result;
        this.headers = headers;
    }
    
    @Override
    public Map getContext() {
        Map<String, Object> map = new HashMap<String, Object>() {{
            put(Header.HEADER_LIST, headers);
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

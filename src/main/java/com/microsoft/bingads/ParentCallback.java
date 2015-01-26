/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.bingads;

import com.microsoft.bingads.internal.ResultFuture;
import java.util.concurrent.Future;

/**
 * Reserved for internal use. 
 * @param <T>
 */
public class ParentCallback<T> implements AsyncCallback<T> {        
    
    private final ResultFuture<?> parentResultFuture;
    
    public ParentCallback(ResultFuture<?> parentResultFuture) {
        this.parentResultFuture = parentResultFuture;
    }
    
    public void onSuccess(T result) throws Exception {
        
    }
    
    @Override
    public void onCompleted(Future<T> result) {
        try {
            onSuccess(result.get());
        }
        catch (Throwable e) {
            parentResultFuture.setException(e);
        }
    }    
}

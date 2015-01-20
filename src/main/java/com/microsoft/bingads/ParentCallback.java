/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.bingads;

import com.microsoft.bingads.internal.ResponseFuture;
import java.util.concurrent.Future;

public class ParentCallback<T> implements AsyncCallback<T> {        
    
    private final ResponseFuture<?> parentResponseFuture;
    
    public ParentCallback(ResponseFuture<?> parentResponseFuture) {
        this.parentResponseFuture = parentResponseFuture;
    }
    
    public void onSuccess(T result) throws Exception {
        
    }
    
    @Override
    public void onCompleted(Future<T> result) {
        try {
            onSuccess(result.get());
        }
        catch (Throwable e) {
            parentResponseFuture.setException(e);
        }
    }    
}

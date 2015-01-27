package com.microsoft.bingads.api.test.entities;

public interface EqualityComparerWithDescription<T> {
    Boolean equals(T x, T y);
    
    String getDescripition(T obj);
}

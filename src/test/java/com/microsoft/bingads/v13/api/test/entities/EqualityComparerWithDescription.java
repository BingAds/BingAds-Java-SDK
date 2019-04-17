package com.microsoft.bingads.v13.api.test.entities;

public interface EqualityComparerWithDescription<T> {
    Boolean equals(T x, T y);
    
    String getDescription(T obj);
}

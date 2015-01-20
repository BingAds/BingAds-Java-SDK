/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.bingads.api.test.entities;

public interface EqualityComparerWithDescription<T> {
    Boolean equals(T x, T y);
    
    String getDescripition(T obj);
}

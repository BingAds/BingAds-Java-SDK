/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.bingads.internal.utilities;

public class Comparer {
    
    public static <T> Boolean compareNullable(T obj1, T obj2) {
        if (obj1 == null) {
            return obj2 == null;
        }
        
        return obj1.equals(obj2);
    }
}

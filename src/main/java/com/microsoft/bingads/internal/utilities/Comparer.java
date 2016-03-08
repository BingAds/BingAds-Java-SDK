package com.microsoft.bingads.internal.utilities;

public class Comparer {

    private Comparer() {
    }

    public static <T> Boolean compareNullable(T obj1, T obj2) {
        if (obj1 == null) {
            return obj2 == null;
        }
        
        return obj1.equals(obj2);
    }
}

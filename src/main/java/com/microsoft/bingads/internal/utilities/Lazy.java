package com.microsoft.bingads.internal.utilities;

import java.util.function.Supplier;

public class Lazy<T> {
    private volatile T value;

    private final Supplier<T> createValue;

    public Lazy(Supplier<T> createValue) {
        this.createValue = createValue;
    }
    
    public synchronized T getValue() {
        if (value == null) {
            value = createValue.get();
        }

        return value;
    }
}
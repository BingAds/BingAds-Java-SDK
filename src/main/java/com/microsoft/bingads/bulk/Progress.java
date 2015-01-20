package com.microsoft.bingads.bulk;

public interface Progress<T> {

    public void report(T value);
}

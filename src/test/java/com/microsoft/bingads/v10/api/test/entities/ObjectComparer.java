package com.microsoft.bingads.v10.api.test.entities;

// TODO Consider how to seamlessly support Collection of object.
public class ObjectComparer<T> implements EqualityComparerWithDescription<T> {

    @Override
    public Boolean equals(T x, T y) {
        return Util.toJson(x).equals(Util.toJson(y));
    }

    @Override
    public String getDescription(T object) {
        return Util.toJson(object);
    }
}

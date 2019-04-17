package com.microsoft.bingads.v13.internal.bulk;

import java.io.Closeable;

import com.microsoft.bingads.internal.functionalinterfaces.Predicate;

public interface BulkStreamReader extends Closeable {

    /**
     * Reads a single bulk object from the file
     *
     * @return the next bulk object from the file
     */
    public BulkObject read();

    /**
     * Attempts to read an entity of a particular type
     *
     * @param klazz the type to attempt to read
     * @return an entity which is of the correct type or null if the next object
     * is not of the correct type
     */
    public <T extends BulkObject> TryResult<T> tryRead(Class<T> klazz);

    /**
     * Attempts to read an entity of a particular type and which passes the
     * passed test function
     *
     * @param predicate A function with which to test the object
     * @param klazz the type to attempt to read
     * @return an entity which is of the correct type or null if the next object
     * is not of the correct type
     */
    public <T extends BulkObject> TryResult<T> tryRead(Predicate<T> predicate, Class<T> klazz);
}

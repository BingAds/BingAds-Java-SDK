package com.microsoft.bingads.internal.bulk.file;

import java.io.Closeable;
import java.util.Iterator;

public interface BulkObjectReader extends Closeable, Iterator<BulkObject> {

    /**
     * Reads the next csv row values, creates a new instance of the object and
     * populates it with the row values.
     *
     * @return Next {@link BulkObject}
     */
    BulkObject readNextBulkObject();
}

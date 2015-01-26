package com.microsoft.bingads.internal.bulk;

import java.io.Closeable;
import java.io.IOException;

public interface BulkObjectWriter extends Closeable {

    /**
     * Writes all relevant metadata to the file
     *
     * @throws IOException Occurs when the file can not be written
     */
    public abstract void writeFileMetadata() throws IOException;

    /**
     * Writes a single object to file
     *
     * @param bulkObject The object to be written to file
     * @throws IOException Occurs when the file can not be written
     */
    public abstract void writeObjectRow(BulkObject bulkObject)
            throws IOException;

}

package com.microsoft.bingads.v13.internal.bulk;

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
    public abstract void writeObjectRow(BulkObject bulkObject) throws IOException;

    /**
     * Writes a single object to file
     *
     * @param bulkObject The object to be written to file
     * @throws IOException Occurs when the file can not be written
     */
    public abstract void writeObjectRow(BulkObject bulkObject, boolean excludeReadonlyData) throws IOException;
    
    /**
     * Writes Bulk Header to output 
     *
     * @throws IOException Occurs when the outputstream can not be written
     */
    public abstract void writeHeaders() throws IOException;


    /**
     * Writes Bulk Format info to output 
     *
     * @throws IOException Occurs when the outputstream can not be written
     */
    public abstract void writeFormatVersion() throws IOException;
}

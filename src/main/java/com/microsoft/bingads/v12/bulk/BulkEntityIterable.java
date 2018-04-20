package com.microsoft.bingads.v12.bulk;

import com.microsoft.bingads.v12.bulk.entities.BulkEntity;
import com.microsoft.bingads.v12.internal.bulk.BulkStreamReader;
import com.microsoft.bingads.v12.internal.bulk.EntityIterator;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;

/**
 * Allows to iterate through a list of entities stored in a file.
 */
public class BulkEntityIterable implements Iterable<BulkEntity>, Closeable {

    private final BulkStreamReader reader;
    private final boolean isForFullDownload;
    
    private final EntityIterator entityIterator;

    /**
     * Reserved for internal use.
     *
     * @param reader the bulk stream reader instance
     * @param isForFullDownload is the reader for full download
     */
    public BulkEntityIterable(BulkStreamReader reader, boolean isForFullDownload) {
        this.reader = reader;
        this.isForFullDownload = isForFullDownload;
        entityIterator = new EntityIterator(reader, isForFullDownload);
    }

    @Override
    public Iterator<BulkEntity> iterator() {
        return entityIterator;
    }
    
    @Override
    public void close() throws IOException {
        reader.close();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.bingads.bulk;

import com.microsoft.bingads.bulk.entities.BulkEntity;
import com.microsoft.bingads.internal.bulk.BulkStreamReader;
import com.microsoft.bingads.internal.bulk.EntityIterator;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;

/**
 * Allows to iterate through a list of entities stored in a file.
 */
public class BulkEntityIterable implements Iterable<BulkEntity>, Closeable {

    private final BulkStreamReader reader;
    private final boolean isForFullDownload;

    /**
     * Reserved for internal use.
     * @param reader
     * @param isForFullDownload
     */
    public BulkEntityIterable(BulkStreamReader reader, boolean isForFullDownload) {
        this.reader = reader;
        this.isForFullDownload = isForFullDownload;
    }

    @Override
    public Iterator<BulkEntity> iterator() {
        return new EntityIterator(reader, isForFullDownload);
    }
    
    @Override
    public void close() throws IOException {
        reader.close();
    }
}

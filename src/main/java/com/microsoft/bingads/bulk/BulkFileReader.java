package com.microsoft.bingads.bulk;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.microsoft.bingads.bulk.entities.BulkEntity;
import com.microsoft.bingads.internal.bulk.entities.MultiRecordBulkEntity;
import com.microsoft.bingads.internal.bulk.file.BulkStreamReader;
import com.microsoft.bingads.internal.bulk.file.EntityIterator;
import com.microsoft.bingads.internal.bulk.file.ExtractChildEntitiesIterator;
import com.microsoft.bingads.internal.bulk.file.SimpleBulkStreamReader;
import java.io.File;

/**
 * Provides method to read (enumerate through) entities in bulk file
 *
 */
public class BulkFileReader implements Closeable {

    private BulkStreamReader bulkStreamReader;
    private String bulkFilePath;
    private ResultFileType fileType;

    /**
     * Creates new instance
     *
     * @param file Path of the bulk file to read
     * @param resultFileType The type of bulk file download which is being read
     * @throws FileNotFoundException
     * @throws UnsupportedEncodingException
     */
    public BulkFileReader(File file, ResultFileType resultFileType, DownloadFileType fileFormat) throws FileNotFoundException, UnsupportedEncodingException {
        this(new SimpleBulkStreamReader(file, fileFormat), resultFileType);
    }

    /**
     * For unit testing
     *
     * @param reader
     * @param isForFullDownload
     */
    public BulkFileReader(BulkStreamReader reader, ResultFileType fileType) {
        this.bulkStreamReader = reader;
        this.fileType = fileType;
    }

    /**
     * Enumerates through entities in the file
     *
     * @return an iterator over Entities
     */
    public BulkEntityIterable getEntities() {
        return new BulkEntityIterable(this.bulkStreamReader, isForFullDownload());
    }

    @Override
    public void close() throws IOException {
        this.bulkStreamReader.close();
    }

    public boolean isForFullDownload() {
        return this.fileType == ResultFileType.FULL_DOWNLOAD;
    }

    public String getBulkFilePath() {
        return bulkFilePath;
    }

    public static Iterator<BulkEntity> extractChildEntitiesIfNeeded(BulkEntity entity) {

        MultiRecordBulkEntity multirecordEntity = null;
        if (MultiRecordBulkEntity.class.isInstance(entity)) {
            multirecordEntity = MultiRecordBulkEntity.class.cast(entity);
        }

        // If the entity is a multiline entity and it has all child objects (delete all row was present), just return it
        if (multirecordEntity == null || multirecordEntity.allChildrenPresent()) {
            List<BulkEntity> entities = new ArrayList<BulkEntity>();
            entities.add(entity);
            return entities.iterator();
        } else {
            // If not all child objects are present (there was no delete all row and we only have part of the multiline entity), return child object individually
            return new ExtractChildEntitiesIterator(multirecordEntity.getChildEntities().iterator());
        }
    }
}

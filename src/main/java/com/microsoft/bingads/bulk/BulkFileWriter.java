package com.microsoft.bingads.bulk;

import java.io.Closeable;
import java.io.IOException;
import com.microsoft.bingads.bulk.entities.BulkEntity;
import com.microsoft.bingads.internal.bulk.file.BulkObjectWriter;
import com.microsoft.bingads.internal.bulk.file.SimpleBulkObjectWriter;
import java.io.File;

/**
 * Provides method to write entities to bulk file
 *
 */
public class BulkFileWriter implements Closeable {

    private BulkObjectWriter bulkObjectWriter;
    private boolean firstRowWritten = true;

    /**
     * Creates a new instance
     *
     * @param filePath Path of the bulk file to read     
     * @throws IOException
     */
    public BulkFileWriter(File filePath) throws IOException {
        this(filePath, DownloadFileType.CSV);
    }

    /**
     * Creates a new instance
     *
     * @param filePath Path of the bulk file to read
     * @param fileFormat Delimiter to separate columns of data by
     * @throws IOException
     */
    public BulkFileWriter(File filePath, DownloadFileType fileFormat) throws IOException {
        this.bulkObjectWriter = new SimpleBulkObjectWriter(filePath, fileFormat);
    }

    /**
     * Writes an entity to file
     *
     * <ul>
     * <li>Single Line Entity: Writes single line to describe content</li>
     * <li>Multi Line Entity: Writes lines to describe the entity and all its
     * children<li>
     * </ul>
     *
     * @param entity a bulk entity to be written to file
     * @throws IOException
     */
    public void writeEntity(BulkEntity entity) throws IOException {
        if (firstRowWritten) {
            this.bulkObjectWriter.writeFileMetadata();
            firstRowWritten = false;
        }

        entity.writeToStream(this.bulkObjectWriter);
    }

    @Override
    public void close() throws IOException {
        this.bulkObjectWriter.close();
    }
}

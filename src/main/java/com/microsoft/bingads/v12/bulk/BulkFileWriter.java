package com.microsoft.bingads.v12.bulk;

import com.microsoft.bingads.v12.bulk.entities.BulkEntity;
import com.microsoft.bingads.v12.internal.bulk.BulkObjectWriter;
import com.microsoft.bingads.v12.internal.bulk.SimpleBulkObjectWriter;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Provides methods to write bulk entities to a file.
 *
 */
public class BulkFileWriter implements Closeable {

    private BulkObjectWriter bulkObjectWriter;
    private boolean metadataWritten = false;

    /**
     * Creates a new instance of this class with the specified file path.
     *
     * @param filePath Path of the bulk file to read
     *
     * @throws IOException
     */
    public BulkFileWriter(File filePath) throws IOException {
        this(filePath, DownloadFileType.CSV);
    }

    /**
     * Creates a new instance of this class with the specified stream.
     *
     * @param outputStream OutputStream to write
     *
     * @throws IOException
     */
    public BulkFileWriter(OutputStream outputStream) throws IOException {
        this.bulkObjectWriter = new SimpleBulkObjectWriter(outputStream, DownloadFileType.CSV);
    }

    /**
     * Creates a new instance of this class with the specified stream.
     *
     * @param outputStream OutputStream to write
     *
     * @throws IOException
     */
    public BulkFileWriter(OutputStream outputStream, DownloadFileType fileFormat) throws IOException {
        this.bulkObjectWriter = new SimpleBulkObjectWriter(outputStream, fileFormat);
    }

    /**
     * Creates a new instance of this class with the specified file path and file format.
     *
     * @param filePath Path of the bulk file to read
     * @param fileFormat Delimiter to separate columns of data by
     *
     * @throws IOException
     */
    public BulkFileWriter(File filePath, DownloadFileType fileFormat) throws IOException {
        this.bulkObjectWriter = new SimpleBulkObjectWriter(filePath, fileFormat);
    }

    /**
     * Reserved for internal use.
     *
     * @param bulkObjectWriter Bulk object writer
     */
    public BulkFileWriter(BulkObjectWriter bulkObjectWriter) {
        this.bulkObjectWriter = bulkObjectWriter;
    }

    /**
     * Writes the specified entity to the file.
     *
     * <ul>
     * <li>Single Line Entity: Writes single line to describe content</li>
     * <li>Multi Line Entity: Writes lines to describe the entity and all its
     * children</li>
     * </ul>
     *
     * @param entity a bulk entity to be written to file
     * @param excludeReadonlyData indicates whether readonly data (such as errors, performance data etc.) should be excluded when writing to file
     *
     * @throws IOException
     */
    public void writeEntity(BulkEntity entity, boolean excludeReadonlyData) throws IOException {
        if (!metadataWritten) {
            this.bulkObjectWriter.writeFileMetadata();
            metadataWritten = true;
        }

        entity.writeToStream(this.bulkObjectWriter, excludeReadonlyData);
    }

    /**
     * Writes the specified entity to the file.
     *
     * <ul>
     * <li>Single Line Entity: Writes single line to describe content</li>
     * <li>Multi Line Entity: Writes lines to describe the entity and all its
     * children</li>
     * </ul>
     *
     * @param entity a bulk entity to be written to file
     * @throws IOException
     */
    public void writeEntity(BulkEntity entity) throws IOException {
        writeEntity(entity, false);
    }

    @Override
    public void close() throws IOException {
        this.bulkObjectWriter.close();
    }
}

package com.microsoft.bingads.v10.bulk;

import com.microsoft.bingads.v10.bulk.DownloadFileType;
import com.microsoft.bingads.v10.internal.bulk.BulkStreamReader;
import com.microsoft.bingads.v10.internal.bulk.SimpleBulkStreamReader;

import java.io.*;

/**
 * Provides a method to read bulk entities from a bulk file and make them accessible as an Iterable.
 */
public class BulkFileReader implements Closeable {

    private BulkStreamReader bulkStreamReader;
    private String bulkFilePath;
    private ResultFileType fileType;

    /**
     * Creates new instance
     *
     * @param file path of the bulk file to read
     * @param resultFileType the type of bulk file download which is being read
     * @param fileFormat the bulk file format
     *
     * @throws IOException
     */
    public BulkFileReader(File file, ResultFileType resultFileType, DownloadFileType fileFormat) throws IOException {
        this(new SimpleBulkStreamReader(file, fileFormat), resultFileType);
        bulkFilePath = file.getCanonicalPath();
    }

    /**
     * Creates new instance from given stream
     *
     * @param inputStream InputStream to read
     * @param resultFileType the type of bulk file download which is being read
     * @param fileFormat the bulk file format
     *
     * @throws IOException
     */
    public BulkFileReader(InputStream inputStream, ResultFileType resultFileType, DownloadFileType fileFormat) throws IOException {
        this(new SimpleBulkStreamReader(inputStream, fileFormat), resultFileType);
    }

    /**
     * Reserved for internal use.
     *
     * @param reader the bulk stream reader instance
     * @param fileType the type of bulk file download which is being read
     */
     public BulkFileReader(BulkStreamReader reader, ResultFileType fileType) {
        this.bulkStreamReader = reader;
        this.fileType = fileType;
    }

    /**
     * Returns entities stored in the file.
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

    /**
     * Reserved for internal use.
     */
    boolean isForFullDownload() {
        return this.fileType == ResultFileType.FULL_DOWNLOAD;
    }

    /**
     * Gets bulk file path.
     */
    public String getBulkFilePath() {
        return bulkFilePath;
    }
}

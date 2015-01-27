package com.microsoft.bingads.bulk;

import com.microsoft.bingads.internal.bulk.BulkStreamReader;
import com.microsoft.bingads.internal.bulk.SimpleBulkStreamReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

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
     * @param file Path of the bulk file to read
     * @param resultFileType The type of bulk file download which is being read
     * @param fileFormat
     * @throws FileNotFoundException
     * @throws UnsupportedEncodingException
     */
    public BulkFileReader(File file, ResultFileType resultFileType, DownloadFileType fileFormat) throws FileNotFoundException, UnsupportedEncodingException {
        this(new SimpleBulkStreamReader(file, fileFormat), resultFileType);
    }

    /**
     * Reserved for internal use.
     *
     * @param reader
     * @param fileType
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
     * @return
     */
    boolean isForFullDownload() {
        return this.fileType == ResultFileType.FULL_DOWNLOAD;
    }

    /**
     * Gets bulk file path.
     * @return
     */
    public String getBulkFilePath() {
        return bulkFilePath;
    }
}

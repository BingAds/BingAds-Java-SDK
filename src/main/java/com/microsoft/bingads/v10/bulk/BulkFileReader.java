package com.microsoft.bingads.v10.bulk;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;

import com.microsoft.bingads.v10.internal.bulk.BulkStreamReader;
import com.microsoft.bingads.v10.internal.bulk.SimpleBulkStreamReader;

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
     * @param deleteFileOnClose delete file on end of iteration?
     *
     * @throws IOException
     */
    public BulkFileReader(final File file, ResultFileType resultFileType, DownloadFileType fileFormat, final boolean deleteFileOnClose) throws IOException {
        this(new ClosingSimpleBulkStreamReader(file, fileFormat, deleteFileOnClose), resultFileType);
        this.bulkFilePath = file.getCanonicalPath();
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

    /**
     * {@link SimpleBulkStreamReader} that is able to delete its input file on {@link #close()}.
     */
    private static class ClosingSimpleBulkStreamReader extends SimpleBulkStreamReader {
        private final File file;
        private final boolean deleteFileOnClose;

        public ClosingSimpleBulkStreamReader(File file, DownloadFileType fileFormat, boolean deleteFileOnClose) throws IOException {
            super(file, fileFormat);
            this.file = file;
            this.deleteFileOnClose = deleteFileOnClose;
        }

        @Override
        public void close() throws IOException {
            try {
                super.close();
            } finally {
                if (deleteFileOnClose) {
                    file.delete();
                }
            }
        }
    }
}

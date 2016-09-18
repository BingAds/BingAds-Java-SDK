package com.microsoft.bingads.v10.internal.bulk;

import java.io.File;
import java.io.IOException;

import com.microsoft.bingads.v10.bulk.BulkFileReader;
import com.microsoft.bingads.v10.bulk.DownloadFileType;
import com.microsoft.bingads.v10.bulk.ResultFileType;

public class CSVBulkFileReaderFactory implements BulkFileReaderFactory {
    @Override
    public BulkFileReader createBulkFileReader(
            final File localFile, ResultFileType resultType, DownloadFileType downloadFileType, final boolean deleteFileOnClose)
            throws IOException {
        return new BulkFileReader(localFile, resultType, downloadFileType) {
            @Override
            public void close() throws IOException {
                try {
                    super.close();
                } finally {
                    if (deleteFileOnClose) {
                        localFile.delete();
                    }
                }
            }
        };
    }
}

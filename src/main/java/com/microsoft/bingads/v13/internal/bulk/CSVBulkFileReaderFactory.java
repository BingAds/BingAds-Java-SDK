package com.microsoft.bingads.v13.internal.bulk;

import java.io.File;
import java.io.IOException;

import com.microsoft.bingads.v13.bulk.BulkFileReader;
import com.microsoft.bingads.v13.bulk.DownloadFileType;
import com.microsoft.bingads.v13.bulk.ResultFileType;

public class CSVBulkFileReaderFactory implements BulkFileReaderFactory {

    @Override
    public BulkFileReader createBulkFileReader(File localFile,
            ResultFileType resultType, DownloadFileType downloadFileType, boolean deleteFileOnClose) throws IOException {
        return new BulkFileReader(localFile, resultType, downloadFileType, deleteFileOnClose);
    }

}

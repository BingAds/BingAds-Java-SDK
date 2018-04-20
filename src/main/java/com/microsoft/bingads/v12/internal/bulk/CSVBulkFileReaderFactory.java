package com.microsoft.bingads.v12.internal.bulk;

import com.microsoft.bingads.v12.bulk.BulkFileReader;
import com.microsoft.bingads.v12.bulk.DownloadFileType;
import com.microsoft.bingads.v12.bulk.ResultFileType;
import java.io.File;
import java.io.IOException;

public class CSVBulkFileReaderFactory implements BulkFileReaderFactory {

    @Override
    public BulkFileReader createBulkFileReader(File localFile,
            ResultFileType resultType, DownloadFileType downloadFileType, boolean deleteFileOnClose) throws IOException {
        return new BulkFileReader(localFile, resultType, downloadFileType, deleteFileOnClose);
    }

}

package com.microsoft.bingads.v10.internal.bulk;

import com.microsoft.bingads.v10.bulk.BulkFileReader;
import com.microsoft.bingads.v10.bulk.DownloadFileType;
import com.microsoft.bingads.v10.bulk.ResultFileType;
import java.io.File;
import java.io.IOException;

public class CSVBulkFileReaderFactory implements BulkFileReaderFactory {

    @Override
    public BulkFileReader createBulkFileReader(File localFile,
            ResultFileType resultType, DownloadFileType downloadFileType) throws IOException {
        return new BulkFileReader(localFile, resultType, downloadFileType);
    }

}

package com.microsoft.bingads.internal.utilities;

import com.microsoft.bingads.bulk.BulkFileReader;
import com.microsoft.bingads.bulk.DownloadFileType;
import com.microsoft.bingads.bulk.ResultFileType;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class CSVBulkFileReaderFactory implements BulkFileReaderFactory {

    @Override
    public BulkFileReader createBulkFileReader(File localFile,
            ResultFileType resultType, DownloadFileType downloadFileType) throws FileNotFoundException, UnsupportedEncodingException {
        return new BulkFileReader(localFile, resultType, downloadFileType);
    }

}

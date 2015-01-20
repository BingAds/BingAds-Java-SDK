package com.microsoft.bingads.internal.utilities;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import com.microsoft.bingads.bulk.BulkFileReader;
import com.microsoft.bingads.bulk.DownloadFileType;
import com.microsoft.bingads.bulk.ResultFileType;
import java.io.File;

public interface BulkFileReaderFactory {

    BulkFileReader createBulkFileReader(File localFile, ResultFileType fileType, DownloadFileType downloadFileType) throws FileNotFoundException, UnsupportedEncodingException;

}

package com.microsoft.bingads.v13.internal.bulk;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.microsoft.bingads.v13.bulk.DownloadFileType;
import com.microsoft.bingads.v13.bulk.ResultFileType;

public interface BulkEntityReaderFactory {

    public BulkEntityReadable createBulkFileReader(File localFile, ResultFileType fileType, DownloadFileType downloadFileType, boolean deleteFileOnClose)
            throws IOException;

    public BulkEntityReadable createBulkRowsReader(List<String> csvRows) throws IOException;

}

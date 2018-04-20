package com.microsoft.bingads.v12.internal.bulk;

import com.microsoft.bingads.v12.bulk.BulkFileReader;
import com.microsoft.bingads.v12.bulk.DownloadFileType;
import com.microsoft.bingads.v12.bulk.ResultFileType;
import java.io.File;
import java.io.IOException;

public interface BulkFileReaderFactory {

	BulkFileReader createBulkFileReader(File localFile, ResultFileType fileType, DownloadFileType downloadFileType, boolean deleteFileOnClose)
			throws IOException;

}

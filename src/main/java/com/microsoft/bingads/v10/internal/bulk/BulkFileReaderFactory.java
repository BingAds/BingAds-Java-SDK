package com.microsoft.bingads.v10.internal.bulk;

import com.microsoft.bingads.v10.bulk.BulkFileReader;
import com.microsoft.bingads.v10.bulk.DownloadFileType;
import com.microsoft.bingads.v10.bulk.ResultFileType;
import java.io.File;
import java.io.IOException;

public interface BulkFileReaderFactory {

	BulkFileReader createBulkFileReader(File localFile, ResultFileType fileType, DownloadFileType downloadFileType)
			throws IOException;

}

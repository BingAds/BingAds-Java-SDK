package com.microsoft.bingads.v13.internal.bulk;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.microsoft.bingads.v13.bulk.ArrayOfstring;
import com.microsoft.bingads.v13.bulk.BulkFileReader;
import com.microsoft.bingads.v13.bulk.DownloadFileType;
import com.microsoft.bingads.v13.bulk.ResultFileType;

public class CsvBulkEntityReaderFactory implements BulkEntityReaderFactory {

	@Override
    public BulkEntityReadable createBulkFileReader(File localFile, ResultFileType fileType,
			DownloadFileType downloadFileType, boolean deleteFileOnClose) throws IOException {
		return new BulkFileReader(localFile, fileType, downloadFileType, deleteFileOnClose);
	}

	@Override
	public BulkEntityReadable createBulkRowsReader(List<String> csvRows) throws IOException {
		return new BulkEntityReader(csvRows);
	}

}

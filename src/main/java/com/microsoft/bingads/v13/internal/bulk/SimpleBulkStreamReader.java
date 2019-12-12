package com.microsoft.bingads.v13.internal.bulk;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import com.microsoft.bingads.v13.bulk.DownloadFileType;

/**
 * Reads a bulk object and also its related data (for example corresponding
 * errors) from the stream
 */
public class SimpleBulkStreamReader extends SimpleBulkRecordReader {

    public SimpleBulkStreamReader(File file, DownloadFileType fileFormat) throws FileNotFoundException, UnsupportedEncodingException { 
        this(file, fileFormat, false);
    }

    public SimpleBulkStreamReader(File file, DownloadFileType fileFormat, boolean deleteFileOnClose) throws FileNotFoundException, UnsupportedEncodingException { 
        super(new SimpleBulkObjectReader(file, fileFormat == DownloadFileType.TSV ? '\t' : ','));
    }

    public SimpleBulkStreamReader(InputStream inputStream, DownloadFileType fileFormat) throws FileNotFoundException, UnsupportedEncodingException {
        super(new SimpleBulkObjectReader(inputStream, fileFormat == DownloadFileType.TSV ? '\t' : ','));
    }
}

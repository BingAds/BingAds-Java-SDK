package com.microsoft.bingads.v13.internal.bulk;

import java.io.FileNotFoundException;

import com.googlecode.jcsv.reader.CSVReader;
import com.microsoft.bingads.v13.bulk.BulkFileReader;
import com.microsoft.bingads.v13.bulk.ResultFileType;

public class TestFactory {

    public static BulkFileReader createBulkFileReader(BulkObjectReader objectReader, ResultFileType fileType) {
        BulkFileReader fileReader = new BulkFileReader(new SimpleBulkRecordReader(objectReader), fileType);

        return fileReader;
    }

    public static BulkFileReader createBulkFileReader(CSVReader<String[]> csvReader, BulkObjectFactory factory) throws FileNotFoundException {
        return  new BulkFileReader(new SimpleBulkRecordReader(new SimpleBulkObjectReader(csvReader, factory)), ResultFileType.PARTIAL_DOWNLOAD);
    }
}

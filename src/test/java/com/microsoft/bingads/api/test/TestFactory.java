package com.microsoft.bingads.api.test;

import java.io.FileNotFoundException;

import com.googlecode.jcsv.reader.CSVReader;
import com.microsoft.bingads.bulk.BulkFileReader;
import com.microsoft.bingads.bulk.ResultFileType;
import com.microsoft.bingads.internal.bulk.file.BulkObjectFactory;
import com.microsoft.bingads.internal.bulk.file.BulkObjectReader;
import com.microsoft.bingads.internal.bulk.file.SimpleBulkObjectReader;
import com.microsoft.bingads.internal.bulk.file.SimpleBulkStreamReader;

public class TestFactory {

    public static BulkFileReader createBulkFileReader(BulkObjectReader objectReader, ResultFileType fileType) {
        BulkFileReader fileReader = new BulkFileReader(new SimpleBulkStreamReader(objectReader), fileType);

        return fileReader;
    }

    public static BulkFileReader createBulkFileReader(CSVReader<String[]> csvReader, BulkObjectFactory factory) throws FileNotFoundException {
        BulkFileReader fileReader = new BulkFileReader(new SimpleBulkStreamReader(new SimpleBulkObjectReader(csvReader, factory)), ResultFileType.PARTIAL_DOWNLOAD);

        return fileReader;
    }
}

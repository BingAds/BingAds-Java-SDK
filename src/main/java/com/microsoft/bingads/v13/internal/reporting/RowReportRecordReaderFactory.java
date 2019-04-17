package com.microsoft.bingads.v13.internal.reporting;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import com.microsoft.bingads.v13.reporting.ReportFormat;

class RowReportRecordReaderFactory {

    static CsvReportRecordReader createReportRecordReader(String filePath, ReportFormat format) throws IOException {

        switch (format) {
        case CSV:
            return new CsvReportRecordReader(new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8")), ',');
        case TSV:
            return new CsvReportRecordReader(new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8")), '\t');
        }
        return null;
    }
    

    static CsvReportRecordReader createReportRecordReader(File file, ReportFormat format) throws IOException {

        switch (format) {
        case CSV:
            return new CsvReportRecordReader(new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8")), ',');
        case TSV:
            return new CsvReportRecordReader(new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8")), '\t');
        }
        return null;
    }

}

package com.microsoft.bingads.v13.internal.reporting;

import java.io.File;
import java.io.IOException;

import com.microsoft.bingads.v13.reporting.ReportFormat;

class RowReportStreamReader implements AutoCloseable {

    private RowReportRecordReader recordReader;
    
    RowReportStreamReader(File file, ReportFormat format) throws IOException {
        recordReader = new RowReportRecordReader(RowReportRecordReaderFactory.createReportRecordReader(file, format));
    }
    
    RowReportStreamReader(String filePath, ReportFormat format) throws IOException {
        recordReader = new RowReportRecordReader(RowReportRecordReaderFactory.createReportRecordReader(filePath, format));
    }

    @Override
    public void close() throws Exception {
        if (recordReader != null) {
            recordReader.close();
            recordReader = null;
        }
    }

    RowReportRecord read() {
        if (recordReader == null) return null;

        RowReportRecord result = recordReader.next();
        if (result != null) {
            return result;
        }

        try {
            // reaching here mean there is no more content to read. We'd close it.
            close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    

    void readReportHeader(RowReportHeaderParser reportHeaderParser) {
        while (recordReader != null && recordReader.readNextHeader(reportHeaderParser));
    }

}

package com.microsoft.bingads.v12.internal.reporting;

import java.io.File;
import java.io.IOException;

import com.microsoft.bingads.v12.reporting.Report;
import com.microsoft.bingads.v12.reporting.ReportFormat;
import com.microsoft.bingads.v12.reporting.ReportRecord;

/**
 * Internal use only.
 *
 */
public class RowReport extends Report {

    private RowReportRecordIterable recordIterable;

    private RowReportStreamReader reportStreamReader;

    public RowReport(File file, ReportFormat format) throws IOException {
        this(new RowReportStreamReader(file, format));
    }

    public RowReport(String filePath, ReportFormat format) throws IOException {
        this(new RowReportStreamReader(filePath, format));
    }

    private RowReport(RowReportStreamReader reportStreamReader) {
        this.reportStreamReader = reportStreamReader;
        this.reportHeader = new RowReportHeader(reportStreamReader);
        this.recordIterable = new RowReportRecordIterable(reportStreamReader);
    }

    @Override
    public Iterable<ReportRecord> getReportRecords() {
        return recordIterable;
    }

    @Override
    public void close() {
        try {
            if (reportStreamReader != null) {
                reportStreamReader.close();
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}

package com.microsoft.bingads.v12.reporting;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;

import javax.xml.stream.XMLStreamException;

import com.microsoft.bingads.v12.internal.reporting.RowReport;
import com.microsoft.bingads.v12.internal.reporting.XmlReport;

public class ReportFileReader implements Closeable {

    private Report report;

    private String reportFilePath;

    public ReportFileReader(String filePath, ReportFormat format) throws IOException, XMLStreamException {
        this(new File(filePath), format);
    }

    public ReportFileReader(File file, ReportFormat format) throws IOException, XMLStreamException {
        this.reportFilePath = file.getCanonicalPath();
        switch (format) {
        case CSV:
        case TSV:
            report = new RowReport(file, format);
            break;
        case XML:
            report = new XmlReport(file);
            break;
        }
    }

    @Override
    public void close() throws IOException {
        if (report != null) {
            report.close();
            report = null;
        }
    }

    public Report getReport() {
        return report;
    }

    public String getReportFilePath() throws IOException {
        return reportFilePath;
    }
}

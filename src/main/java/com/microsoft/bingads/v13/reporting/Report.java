package com.microsoft.bingads.v13.reporting;

import java.io.Closeable;
import java.util.Date;

import com.microsoft.bingads.v13.internal.reporting.ReportHeader;

public abstract class Report implements Closeable {

    protected ReportHeader reportHeader;

    public String[] getReportColumns() {
        return reportHeader.getReportColumns();
    }

    public String getReportName() {
        return reportHeader.getReportName();
    }

    public long getReportRecordCount() throws CouldNotGetReportingMetadataException {
        return reportHeader.getReportRecordCount();
    }

    public Date getReportTimeStart() {
        return reportHeader.getReportTimeStart();
    }

    public Date getReportTimeEnd() {
        return reportHeader.getReportTimeEnd();
    }

    public ReportAggregation getReportAggregation() {
        return reportHeader.getReportAggregation();
    }

    public Date getLastCompletedAvailableDate() {
        return reportHeader.getLastCompletedAvailableDate();
    }

    public boolean getPotentialIncompleteData() {
        return reportHeader.getPotentialIncompleteData();
    }

    public abstract Iterable<ReportRecord> getReportRecords();

}

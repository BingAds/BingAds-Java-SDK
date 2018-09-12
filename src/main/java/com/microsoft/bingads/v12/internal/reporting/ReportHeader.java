package com.microsoft.bingads.v12.internal.reporting;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import com.microsoft.bingads.v12.reporting.CouldNotGetReportingMetadataException;
import com.microsoft.bingads.v12.reporting.ReportAggregation;

/**
 * Internal use only.
 *
 */
public class ReportHeader {
    private String reportName;

    private long recordCount = -1;

    private String[] reportColumns;

    private Date reportTimeStart;

    private Date reportTimeEnd;

    private String timeZone;

    private ReportAggregation reportAggregation;

    private Date lastCompletedAvailableDate;

    private boolean potentialIncompleteData;

    public Date getLastCompletedAvailableDate() {
        return lastCompletedAvailableDate;
    }

    public void setLastCompletedAvailableDate(String strLastCompletedAvailableDate) {
        if (strLastCompletedAvailableDate == null) return;
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss a (Z)");
        format.setTimeZone(TimeZone.getTimeZone("UTC"));
        try {
            this.lastCompletedAvailableDate = format.parse(strLastCompletedAvailableDate);
        } catch (ParseException e) {
            System.out.println("Can not parse report LastCompletedAvailableDate from file.");
            // Ignore
        }
    }

    public String getReportName() {
        return reportName;
    }

    public String[] getReportColumns() {
        return reportColumns;
    }

    public Date getReportTimeStart() {
        return reportTimeStart;
    }

    public Date getReportTimeEnd() {
        return reportTimeEnd;
    }

    public void setReportTime(String strReportTime) {
        if (strReportTime == null) return;
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        format.setTimeZone(TimeZone.getTimeZone("UTC"));
        try {
            String[] reportTime = strReportTime.split(",");
            if (reportTime.length == 1) {
                this.reportTimeStart = format.parse(reportTime[0].trim());
                this.reportTimeEnd = this.reportTimeStart;
            } else if (reportTime.length == 2) {
                this.reportTimeStart = format.parse(reportTime[0].trim());
                this.reportTimeEnd = format.parse(reportTime[1].trim());
            }
        } catch (ParseException e) {
            System.out.println("Can not parse Report Time from file.");
            // Ignore
        }
    }

    public String getReportTimeZone() {
        return this.timeZone;
    }

    public void setReportTimeZone(String strReportTimeZone) {
        timeZone = strReportTimeZone;
    }

    public long getReportRecordCount() throws CouldNotGetReportingMetadataException {
        if (recordCount == -1) {
            throw new CouldNotGetReportingMetadataException("RecordCount");
        }
        return this.recordCount;
    }

    public ReportAggregation getReportAggregation() {
        return reportAggregation;
    }

    public void setReportAggregation(String reportAggregation) {
        try {
            this.reportAggregation = ReportAggregation.fromValue(reportAggregation);
        } catch (Exception e) {
            System.out.println("Can not parse report Aggregation from file.");
            // Ignore
        }
    }

    public void setReportName(String name) {
        this.reportName = name;
    }

    protected void setReportFilter(String reportFilter) {
        // TODO: report filter format to be define.
    }

    public boolean setReportColumns(String[] columns) {
        for (String s : columns) {
            // Validate column names in case "Exclude Column Header".
            // If there is a pure value, it should not be column names.
            if (s.matches("^(([1-9]\\d*\\.?\\d*)|(0\\.\\d*[1-9]))%?$")) {
                return false;
            }
        }
        this.reportColumns = columns;
        return true;
    }

    protected void setReportRecordCount(String recordCount) {
        try {
            this.recordCount = Long.parseLong(recordCount);
        } catch (Exception e) {
            System.out.println("Can not parse report ReportRecordCount from file.");
            // Ignore
        }
    }

    public boolean getPotentialIncompleteData() {
        return potentialIncompleteData;
    }

    public void setPotentialIncompleteData(String potentialIncompleteData) {
        try {
            this.potentialIncompleteData = Boolean.parseBoolean(potentialIncompleteData);
        } catch (Exception e) {
            System.out.println("Can not parse report PotentialIncompleteData from file.");
            // Ignore
        }
    }

}

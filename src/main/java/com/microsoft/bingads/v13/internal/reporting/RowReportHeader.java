package com.microsoft.bingads.v13.internal.reporting;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RowReportHeader extends ReportHeader implements RowReportHeaderParser {
    private static final String REPORT_NAME = "Report Name";

    private static final String REPORT_TIME = "Report Time";

    private static final String REPORT_AGGREGATION = "Report Aggregation";

    private static final String REPORT_FILTER = "Report Filter";

    private static final String TIME_ZONE = "Time Zone";

    private static final String ROWS = "Rows";

    private static final String LAST_COMPLETED_AVAILABLE_DAY = "Last Completed Available Day";

    public static final String POTENTIAL_INCOMPLETE_DATA = "Potential Incomplete Data";

    private static final Pattern headerPattern = Pattern.compile(
            "^(Potential Incomplete Data|Report Name|Report Time|Report Aggregation|Report Filter|Time Zone|Rows|Last Completed Available Day|Last Completed Available Hour): (.*)$");

    private RowReportStreamReader reportStreamReader;

    RowReportHeader(RowReportStreamReader reportStreamReader) {
        this.reportStreamReader = reportStreamReader;
        readReportHeader();
    }

    private void readReportHeader() {
        reportStreamReader.readReportHeader(this);
    }

    @Override
    public boolean parseHeader(String[] fields) {
        long validValueCount = Arrays.stream(fields).map(s -> s.trim()).filter(s -> s != null && s.length() > 0)
                .count();
        if (validValueCount == 1 && fields[0].contains(":")) {
            parseReportMetadata(fields[0]);
            return true;
        } else {
            return setReportColumns(fields);
        }
    }

    private void parseReportMetadata(String header) {
        if (header == null) {
            return;
        }

        Matcher matcher = headerPattern.matcher(header);
        if (matcher.matches() == false) {
            return;
        }
        String headerName = matcher.group(1);
        String headerValue = matcher.group(2).trim();

        switch (headerName) {
        case REPORT_NAME:
            this.setReportName(headerValue);
            break;
        case REPORT_TIME:
            this.setReportTime(headerValue);
            break;
        case TIME_ZONE:
            this.setReportTimeZone(headerValue);
            break;
        case LAST_COMPLETED_AVAILABLE_DAY:
            this.setLastCompletedAvailableDate(headerValue);
            break;
        case REPORT_AGGREGATION:
            this.setReportAggregation(headerValue);
            break;
        case REPORT_FILTER:
            this.setReportFilter(headerValue);
            break;
        case ROWS:
            this.setReportRecordCount(headerValue);
            break;
        case POTENTIAL_INCOMPLETE_DATA:
            this.setPotentialIncompleteData(headerValue);
            break;
        default:
            // TODO:
            break;
        }

    }

}

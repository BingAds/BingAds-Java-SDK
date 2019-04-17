package com.microsoft.bingads.v13.internal.reporting;

import com.microsoft.bingads.v13.reporting.ReportRecord;

class RowReportRecordIterable implements Iterable<ReportRecord> {

    private RowReportRecordIterator it;
        
    RowReportRecordIterable(RowReportStreamReader reportStreamReader) {
        it = new RowReportRecordIterator(reportStreamReader);
    }

    @Override
    public RowReportRecordIterator iterator() {
        return it;
    }

}

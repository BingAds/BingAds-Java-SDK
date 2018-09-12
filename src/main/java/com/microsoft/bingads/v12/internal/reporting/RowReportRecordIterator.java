package com.microsoft.bingads.v12.internal.reporting;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.microsoft.bingads.v12.reporting.ReportRecord;

class RowReportRecordIterator implements Iterator<ReportRecord> {

    private RowReportStreamReader reader;

    private Iterator<ReportRecord> nextBatch = null;

    RowReportRecordIterator(RowReportStreamReader reportStreamReader) {
        this.reader = reportStreamReader;
    }

    @Override
    public boolean hasNext() {
        this.updateNextBatch();
        return (this.nextBatch != null && this.nextBatch.hasNext());
    }

    @Override
    public ReportRecord next() {
        this.updateNextBatch();

        if (this.nextBatch != null && this.nextBatch.hasNext()) {
            ReportRecord returnEntity = this.nextBatch.next();
            return returnEntity;
        }

        // Something went wrong and we got an unexpected object from the file at
        // this point...
        throw new UnsupportedOperationException("Invalid report object returned!!!");
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    private void updateNextBatch() {
        if (this.nextBatch == null || !this.nextBatch.hasNext()) {
            this.nextBatch = readNextBatch();
        }
    }

    private Iterator<ReportRecord> readNextBatch() {
        // Parse the next row in the file.
        RowReportRecord next = this.reader.read();

        // If returned object is null means we have reached the end of file
        if (next == null) {
            return null;
        }

        List<ReportRecord> records = new ArrayList<ReportRecord>();
        records.add(next);
        return records.iterator();
    }

}

package com.microsoft.bingads.v13.api.test.operations;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import com.microsoft.bingads.v13.bulk.BulkOperationProgressInfo;
import com.microsoft.bingads.v13.bulk.Progress;

public class TestProgress implements Progress<BulkOperationProgressInfo> {

    private final List<Integer> reportedProgressValues = new ArrayList<Integer>();
    
    @Override
    public void report(BulkOperationProgressInfo value) {
        reportedProgressValues.add(value.getPercentComplete());
    }
    
    public void AssertReportedProgress(List<Integer> expectedProgress) {
        //verify that progress could be reported successfully
        assertTrue(reportedProgressValues.size() > 0);
    }
}

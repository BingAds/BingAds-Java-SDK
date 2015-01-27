package com.microsoft.bingads.api.test.operations;

import com.microsoft.bingads.bulk.BulkOperationProgressInfo;
import com.microsoft.bingads.bulk.Progress;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class TestProgress implements Progress<BulkOperationProgressInfo> {

    private final List<Integer> reportedProgressValues = new ArrayList<Integer>();
    
    @Override
    public void report(BulkOperationProgressInfo value) {
        reportedProgressValues.add(value.getPercentComplete());
    }
    
    public void AssertReportedProgress(List<Integer> expectedProgress) {
        assertEquals(expectedProgress, reportedProgressValues);
    }
}

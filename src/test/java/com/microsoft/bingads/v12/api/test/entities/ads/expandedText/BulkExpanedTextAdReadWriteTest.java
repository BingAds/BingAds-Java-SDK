package com.microsoft.bingads.v12.api.test.entities.ads.expandedText;

import org.junit.Test;

import com.microsoft.bingads.v12.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v12.bulk.entities.BulkExpandedTextAd;

public class BulkExpanedTextAdReadWriteTest {

    @Test
    public void bulkExpandedTextAd_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkExpandedTextAd());
    }
}
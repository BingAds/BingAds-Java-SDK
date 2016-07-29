package com.microsoft.bingads.v10.api.test.entities.ads.expandedText;

import com.microsoft.bingads.v10.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v10.bulk.entities.BulkExpandedTextAd;
import org.junit.Test;

public class BulkExpanedTextAdReadWriteTest {

    @Test
    public void bulkExpandedTextAd_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkExpandedTextAd());
    }
}
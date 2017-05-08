package com.microsoft.bingads.v11.api.test.entities.ads.expandedText;

import com.microsoft.bingads.v11.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v11.bulk.entities.BulkExpandedTextAd;
import org.junit.Test;

public class BulkExpanedTextAdReadWriteTest {

    @Test
    public void bulkExpandedTextAd_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkExpandedTextAd());
    }
}
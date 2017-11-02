package com.microsoft.bingads.v11.api.test.entities.ads.text;

import com.microsoft.bingads.v11.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v11.bulk.entities.BulkTextAd;
import org.junit.Test;

public class BulkTextAdReadWriteTest {

    @Test
    public void bulkTextAd_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkTextAd());
    }
}
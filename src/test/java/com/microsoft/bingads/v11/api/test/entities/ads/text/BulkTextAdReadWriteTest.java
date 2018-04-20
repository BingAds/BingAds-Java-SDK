package com.microsoft.bingads.v11.api.test.entities.ads.text;

import org.junit.Test;

import com.microsoft.bingads.v11.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v11.bulk.entities.BulkTextAd;

public class BulkTextAdReadWriteTest {

    @Test
    public void bulkTextAd_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkTextAd());
    }
}
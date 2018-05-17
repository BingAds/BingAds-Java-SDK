package com.microsoft.bingads.v11.api.test.entities.ads.responsive;

import org.junit.Test;

import com.microsoft.bingads.v11.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v11.bulk.entities.BulkResponsiveAd;

public class BulkResponsiveAdReadWriteTest {

    @Test
    public void bulkResponsiveAd_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkResponsiveAd());
    }
}
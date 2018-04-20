package com.microsoft.bingads.v12.api.test.entities.ads.product;

import org.junit.Test;

import com.microsoft.bingads.v12.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v12.bulk.entities.BulkProductAd;

public class BulkProductAdReadWriteTest {

    @Test
    public void bulkProductAd_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkProductAd());
    }
}
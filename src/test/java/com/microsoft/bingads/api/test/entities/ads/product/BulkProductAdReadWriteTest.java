package com.microsoft.bingads.api.test.entities.ads.product;

import com.microsoft.bingads.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.bulk.entities.BulkProductAd;
import org.junit.Test;

public class BulkProductAdReadWriteTest {

    @Test
    public void bulkProductAd_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkProductAd());
    }
}
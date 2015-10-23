package com.microsoft.bingads.v10.api.test.entities.ads.product;

import com.microsoft.bingads.v10.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v10.bulk.entities.BulkProductAd;
import org.junit.Test;

public class BulkProductAdReadWriteTest {

    @Test
    public void bulkProductAd_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkProductAd());
    }
}
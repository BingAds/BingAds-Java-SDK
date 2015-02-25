package com.microsoft.bingads.api.test.entities.ads.mobile;

import com.microsoft.bingads.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.bulk.entities.BulkMobileAd;
import org.junit.Test;

public class BulkMobileAdReadWriteTest {

    @Test
    public void bulkMobileAd_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkMobileAd());
    }
}
package com.microsoft.bingads.v11.api.test.entities.ads.appInstall;

import org.junit.Test;

import com.microsoft.bingads.v11.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v11.bulk.entities.BulkAppInstallAd;

public class BulkAppInstallAdReadWriteTest {

    @Test
    public void bulkAppInstallAd_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkAppInstallAd());
    }
}
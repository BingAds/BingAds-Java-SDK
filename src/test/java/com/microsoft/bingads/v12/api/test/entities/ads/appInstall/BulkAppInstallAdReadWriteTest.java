package com.microsoft.bingads.v12.api.test.entities.ads.appInstall;

import org.junit.Test;

import com.microsoft.bingads.v12.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v12.bulk.entities.BulkAppInstallAd;

public class BulkAppInstallAdReadWriteTest {

    @Test
    public void bulkAppInstallAd_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkAppInstallAd());
    }
}
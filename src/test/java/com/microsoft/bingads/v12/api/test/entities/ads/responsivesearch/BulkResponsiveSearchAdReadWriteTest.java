package com.microsoft.bingads.v12.api.test.entities.ads.responsivesearch;

import org.junit.Test;

import com.microsoft.bingads.v12.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v12.bulk.entities.BulkResponsiveSearchAd;

public class BulkResponsiveSearchAdReadWriteTest {

    @Test
    public void bulkResponsiveSearchAd_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkResponsiveSearchAd());
    }
}
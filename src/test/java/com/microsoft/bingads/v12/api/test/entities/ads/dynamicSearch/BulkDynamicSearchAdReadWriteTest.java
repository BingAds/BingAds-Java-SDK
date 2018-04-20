package com.microsoft.bingads.v12.api.test.entities.ads.dynamicSearch;

import org.junit.Test;

import com.microsoft.bingads.v12.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v12.bulk.entities.BulkDynamicSearchAd;

public class BulkDynamicSearchAdReadWriteTest {

    @Test
    public void bulkExpandedTextAd_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkDynamicSearchAd());
    }
}
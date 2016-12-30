package com.microsoft.bingads.v10.api.test.entities.ads.dynamicSearch;

import com.microsoft.bingads.v10.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v10.bulk.entities.BulkDynamicSearchAd;
import org.junit.Test;

public class BulkDynamicSearchAdReadWriteTest {

    @Test
    public void bulkExpandedTextAd_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkDynamicSearchAd());
    }
}
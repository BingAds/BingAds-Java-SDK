package com.microsoft.bingads.v11.api.test.entities.ad_extension.review;

import org.junit.Test;

import com.microsoft.bingads.v11.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupReviewAdExtension;

public class BulkAdGroupReviewAdExtensionReadWriteTest {

    @Test
    public void bulkAdGroupReviewAdExtension_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkAdGroupReviewAdExtension());
    }
}
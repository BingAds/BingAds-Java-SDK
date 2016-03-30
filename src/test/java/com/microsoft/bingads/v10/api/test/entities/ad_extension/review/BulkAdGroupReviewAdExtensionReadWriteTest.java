package com.microsoft.bingads.v10.api.test.entities.ad_extension.review;

import com.microsoft.bingads.v10.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v10.bulk.entities.BulkAdGroupReviewAdExtension;
import org.junit.Test;

public class BulkAdGroupReviewAdExtensionReadWriteTest {

    @Test
    public void bulkAdGroupReviewAdExtension_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkAdGroupReviewAdExtension());
    }
}
package com.microsoft.bingads.v11.api.test.entities.ad_extension.review;

import com.microsoft.bingads.v11.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignReviewAdExtension;
import org.junit.Test;

public class BulkCampaignReviewAdExtensionReadWriteTest {

    @Test
    public void bulkCampaignImageAdExtension_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkCampaignReviewAdExtension());
    }
}
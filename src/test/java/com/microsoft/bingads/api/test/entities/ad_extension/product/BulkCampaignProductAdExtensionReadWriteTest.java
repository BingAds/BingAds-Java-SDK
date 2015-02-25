package com.microsoft.bingads.api.test.entities.ad_extension.product;

import com.microsoft.bingads.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.bulk.entities.BulkCampaignProductAdExtension;
import org.junit.Test;

public class BulkCampaignProductAdExtensionReadWriteTest {

    @Test
    public void bulkCampaignProductAdExtension_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkCampaignProductAdExtension());
    }
}
package com.microsoft.bingads.v11.api.test.entities.ad_extension.image;

import com.microsoft.bingads.v11.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignImageAdExtension;
import org.junit.Test;

public class BulkCampaignImageAdExtensionReadWriteTest {

    @Test
    public void bulkCampaignImageAdExtension_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkCampaignImageAdExtension());
    }
}
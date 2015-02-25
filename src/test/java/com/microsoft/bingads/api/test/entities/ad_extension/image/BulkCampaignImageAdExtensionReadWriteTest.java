package com.microsoft.bingads.api.test.entities.ad_extension.image;

import com.microsoft.bingads.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.bulk.entities.BulkCampaignImageAdExtension;
import org.junit.Test;

public class BulkCampaignImageAdExtensionReadWriteTest {

    @Test
    public void bulkCampaignImageAdExtension_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkCampaignImageAdExtension());
    }
}
package com.microsoft.bingads.api.test.entities.ad_extension.app;

import com.microsoft.bingads.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.bulk.entities.BulkCampaignAppAdExtension;
import org.junit.Test;

public class BulkCampaignAppAdExtensionReadWriteTest {

    @Test
    public void bulkCampaignImageAdExtension_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkCampaignAppAdExtension());
    }
}
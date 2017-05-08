package com.microsoft.bingads.v11.api.test.entities.ad_extension.app;

import com.microsoft.bingads.v11.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignAppAdExtension;
import org.junit.Test;

public class BulkCampaignAppAdExtensionReadWriteTest {

    @Test
    public void bulkCampaignImageAdExtension_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkCampaignAppAdExtension());
    }
}
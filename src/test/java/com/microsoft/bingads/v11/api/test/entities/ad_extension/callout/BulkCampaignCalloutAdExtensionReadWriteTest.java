package com.microsoft.bingads.v11.api.test.entities.ad_extension.callout;

import com.microsoft.bingads.v11.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignCalloutAdExtension;
import org.junit.Test;

public class BulkCampaignCalloutAdExtensionReadWriteTest {

    @Test
    public void bulkCampaignImageAdExtension_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkCampaignCalloutAdExtension());
    }
}
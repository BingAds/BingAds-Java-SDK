package com.microsoft.bingads.v12.api.test.entities.ad_extension.callout;

import org.junit.Test;

import com.microsoft.bingads.v12.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaignCalloutAdExtension;

public class BulkCampaignCalloutAdExtensionReadWriteTest {

    @Test
    public void bulkCampaignImageAdExtension_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkCampaignCalloutAdExtension());
    }
}
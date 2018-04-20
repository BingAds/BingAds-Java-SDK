package com.microsoft.bingads.v11.api.test.entities.ad_extension.call;

import org.junit.Test;

import com.microsoft.bingads.v11.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignCallAdExtension;

public class BulkCampaignCallAdExtensionReadWriteTest {

    @Test
    public void bulkCampaignCallAdExtension_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkCampaignCallAdExtension());
    }
}
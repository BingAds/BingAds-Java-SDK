package com.microsoft.bingads.v12.api.test.entities.ad_extension.location;

import org.junit.Test;

import com.microsoft.bingads.v12.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaignLocationAdExtension;

public class BulkCampaignLocationAdExtensionReadWriteTest {

    @Test
    public void bulkCampaignLocationAdExtension_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkCampaignLocationAdExtension());
    }
}
package com.microsoft.bingads.api.test.entities.ad_extension.location;

import com.microsoft.bingads.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.bulk.entities.BulkCampaignLocationAdExtension;
import org.junit.Test;

public class BulkCampaignLocationAdExtensionReadWriteTest {

    @Test
    public void bulkCampaignLocationAdExtension_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkCampaignLocationAdExtension());
    }
}
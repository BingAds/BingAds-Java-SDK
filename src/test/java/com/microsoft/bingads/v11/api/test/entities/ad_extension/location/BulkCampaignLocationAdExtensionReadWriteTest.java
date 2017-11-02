package com.microsoft.bingads.v11.api.test.entities.ad_extension.location;

import com.microsoft.bingads.v11.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignLocationAdExtension;
import org.junit.Test;

public class BulkCampaignLocationAdExtensionReadWriteTest {

    @Test
    public void bulkCampaignLocationAdExtension_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkCampaignLocationAdExtension());
    }
}
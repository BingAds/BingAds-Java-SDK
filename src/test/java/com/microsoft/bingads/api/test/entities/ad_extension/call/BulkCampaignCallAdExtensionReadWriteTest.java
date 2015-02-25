package com.microsoft.bingads.api.test.entities.ad_extension.call;

import com.microsoft.bingads.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.bulk.entities.BulkCampaignCallAdExtension;
import org.junit.Test;

public class BulkCampaignCallAdExtensionReadWriteTest {

    @Test
    public void bulkCampaignCallAdExtension_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkCampaignCallAdExtension());
    }
}
package com.microsoft.bingads.v12.api.test.entities.ad_extension.app;

import org.junit.Test;

import com.microsoft.bingads.v12.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaignAppAdExtension;

public class BulkCampaignAppAdExtensionReadWriteTest {

    @Test
    public void bulkCampaignAppAdExtension_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkCampaignAppAdExtension());
    }
}
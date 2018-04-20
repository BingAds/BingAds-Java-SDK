package com.microsoft.bingads.v12.api.test.entities.ad_extension.site_link;

import org.junit.Test;

import com.microsoft.bingads.v12.bulk.entities.BulkCampaignSitelinkAdExtension;
import com.microsoft.bingads.v12.api.test.entities.PerformanceDataTestHelper;

public class BulkCampaignSitelinkAdExtensionReadWriteTest {

    @Test
    public void bulkCampaignSiteLinkAdExtension_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkCampaignSitelinkAdExtension());
    }
}
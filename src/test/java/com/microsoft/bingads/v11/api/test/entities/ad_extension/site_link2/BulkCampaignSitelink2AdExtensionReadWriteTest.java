package com.microsoft.bingads.v11.api.test.entities.ad_extension.site_link2;

import com.microsoft.bingads.v11.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignSitelink2AdExtension;
import org.junit.Test;

public class BulkCampaignSitelink2AdExtensionReadWriteTest {

    @Test
    public void bulkCampaignSiteLinkAdExtension_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkCampaignSitelink2AdExtension());
    }
}
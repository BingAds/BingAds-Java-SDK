package com.microsoft.bingads.api.test.entities.ad_extension.site_link;

import com.microsoft.bingads.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.bulk.entities.BulkCampaignSiteLinkAdExtension;
import org.junit.Test;

public class BulkCampaignSiteLinkAdExtensionReadWriteTest {

    @Test
    public void bulkCampaignSiteLinkAdExtension_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkCampaignSiteLinkAdExtension());
    }
}
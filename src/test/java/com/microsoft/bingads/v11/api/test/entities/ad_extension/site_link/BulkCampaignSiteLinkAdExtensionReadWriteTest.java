package com.microsoft.bingads.v11.api.test.entities.ad_extension.site_link;

import com.microsoft.bingads.v11.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignSiteLinkAdExtension;
import org.junit.Test;

public class BulkCampaignSiteLinkAdExtensionReadWriteTest {

    @Test
    public void bulkCampaignSiteLinkAdExtension_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkCampaignSiteLinkAdExtension());
    }
}
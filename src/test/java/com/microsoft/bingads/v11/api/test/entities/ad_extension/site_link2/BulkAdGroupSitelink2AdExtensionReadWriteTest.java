package com.microsoft.bingads.v11.api.test.entities.ad_extension.site_link2;

import com.microsoft.bingads.v11.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupSitelink2AdExtension;

import org.junit.Test;

public class BulkAdGroupSitelink2AdExtensionReadWriteTest {

    @Test
    public void bulkAdGroupSiteLinkAdExtension_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkAdGroupSitelink2AdExtension());
    }
}
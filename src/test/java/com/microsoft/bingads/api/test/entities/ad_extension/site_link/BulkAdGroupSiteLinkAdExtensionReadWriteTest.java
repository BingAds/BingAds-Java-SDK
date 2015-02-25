package com.microsoft.bingads.api.test.entities.ad_extension.site_link;

import com.microsoft.bingads.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.bulk.entities.BulkAdGroupSiteLinkAdExtension;
import org.junit.Test;

public class BulkAdGroupSiteLinkAdExtensionReadWriteTest {

    @Test
    public void bulkAdGroupSiteLinkAdExtension_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkAdGroupSiteLinkAdExtension());
    }
}
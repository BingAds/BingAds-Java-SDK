package com.microsoft.bingads.v12.api.test.entities.ad_extension.site_link;

import org.junit.Test;

import com.microsoft.bingads.v12.bulk.entities.BulkAdGroupSitelinkAdExtension;
import com.microsoft.bingads.v12.api.test.entities.PerformanceDataTestHelper;

public class BulkAdGroupSitelinkAdExtensionReadWriteTest {

    @Test
    public void bulkAdGroupSiteLinkAdExtension_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkAdGroupSitelinkAdExtension());
    }
}
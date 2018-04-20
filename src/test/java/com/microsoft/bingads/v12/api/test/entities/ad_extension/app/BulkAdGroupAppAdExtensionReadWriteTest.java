package com.microsoft.bingads.v12.api.test.entities.ad_extension.app;

import org.junit.Test;

import com.microsoft.bingads.v12.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v12.bulk.entities.BulkAdGroupAppAdExtension;

public class BulkAdGroupAppAdExtensionReadWriteTest {

    @Test
    public void bulkAdGroupAppAdExtension_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkAdGroupAppAdExtension());
    }
}
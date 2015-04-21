package com.microsoft.bingads.api.test.entities.ad_extension.app;

import com.microsoft.bingads.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.bulk.entities.BulkAdGroupAppAdExtension;
import org.junit.Test;

public class BulkAdGroupAppAdExtensionReadWriteTest {

    @Test
    public void bulkAdGroupAppAdExtension_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkAdGroupAppAdExtension());
    }
}
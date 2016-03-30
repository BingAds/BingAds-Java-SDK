package com.microsoft.bingads.v10.api.test.entities.ad_extension.callout;

import com.microsoft.bingads.v10.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v10.bulk.entities.BulkAdGroupCalloutAdExtension;
import org.junit.Test;

public class BulkAdGroupCalloutAdExtensionReadWriteTest {

    @Test
    public void bulkAdGroupCalloutAdExtension_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkAdGroupCalloutAdExtension());
    }
}
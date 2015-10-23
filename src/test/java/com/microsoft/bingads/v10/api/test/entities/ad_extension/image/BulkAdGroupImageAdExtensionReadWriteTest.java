package com.microsoft.bingads.v10.api.test.entities.ad_extension.image;

import com.microsoft.bingads.v10.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v10.bulk.entities.BulkAdGroupImageAdExtension;
import org.junit.Test;

public class BulkAdGroupImageAdExtensionReadWriteTest {

    @Test
    public void bulkAdGroupImageAdExtension_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkAdGroupImageAdExtension());
    }
}
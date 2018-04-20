package com.microsoft.bingads.v12.api.test.entities.ad_extension.image;

import org.junit.Test;

import com.microsoft.bingads.v12.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v12.bulk.entities.BulkAdGroupImageAdExtension;

public class BulkAdGroupImageAdExtensionReadWriteTest {

    @Test
    public void bulkAdGroupImageAdExtension_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkAdGroupImageAdExtension());
    }
}
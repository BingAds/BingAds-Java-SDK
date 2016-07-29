package com.microsoft.bingads.v10.api.test.entities.ad_extension.structuredSnippet;

import com.microsoft.bingads.v10.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v10.bulk.entities.BulkAdGroupStructuredSnippetAdExtension;

import org.junit.Test;

public class BulkAdGroupStructuredSnippetAdExtensionReadWriteTest {

    @Test
    public void bulkAdGroupStructuredSnippetAdExtension_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkAdGroupStructuredSnippetAdExtension());
    }
}
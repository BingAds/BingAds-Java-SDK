package com.microsoft.bingads.v12.api.test.entities.ad_extension.structuredSnippet;

import org.junit.Test;

import com.microsoft.bingads.v12.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v12.bulk.entities.BulkAdGroupStructuredSnippetAdExtension;

public class BulkAdGroupStructuredSnippetAdExtensionReadWriteTest {

    @Test
    public void bulkAdGroupStructuredSnippetAdExtension_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkAdGroupStructuredSnippetAdExtension());
    }
}
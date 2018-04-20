package com.microsoft.bingads.v12.api.test.entities.ad_extension.structuredSnippet;

import org.junit.Test;

import com.microsoft.bingads.v12.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaignStructuredSnippetAdExtension;

public class BulkCampaignStructuredSnippetAdExtensionReadWriteTest {

    @Test
    public void bulkCampaignStructuredSnippetAdExtension_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkCampaignStructuredSnippetAdExtension());
    }
}
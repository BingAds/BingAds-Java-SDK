package com.microsoft.bingads.v10.api.test.entities.ad_extension.structuredSnippet;

import com.microsoft.bingads.v10.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignStructuredSnippetAdExtension;

import org.junit.Test;

public class BulkCampaignStructuredSnippetAdExtensionReadWriteTest {

    @Test
    public void bulkCampaignStructuredSnippetAdExtension_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkCampaignStructuredSnippetAdExtension());
    }
}
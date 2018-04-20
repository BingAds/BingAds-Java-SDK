package com.microsoft.bingads.v12.api.test.entities.campaign;

import org.junit.Test;

import com.microsoft.bingads.v12.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v12.api.test.entities.QualityScoreDataTestHelper;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaign;

public class BulkCampaignReadWriteTest {

    @Test
    public void bulkCampaign_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkCampaign());
    }

    @Test
    public void bulkCampaign_ReadQSData_WriteToFile() {
        QualityScoreDataTestHelper.testQualityScoreDataReadWrite(new BulkCampaign());
    }
}
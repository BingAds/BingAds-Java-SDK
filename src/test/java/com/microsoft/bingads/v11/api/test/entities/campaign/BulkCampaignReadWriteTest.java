package com.microsoft.bingads.v11.api.test.entities.campaign;

import com.microsoft.bingads.v11.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v11.api.test.entities.QualityScoreDataTestHelper;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaign;
import org.junit.Test;

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
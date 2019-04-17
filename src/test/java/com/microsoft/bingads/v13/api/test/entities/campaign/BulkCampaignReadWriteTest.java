package com.microsoft.bingads.v13.api.test.entities.campaign;

import org.junit.Test;

import com.microsoft.bingads.v13.api.test.entities.QualityScoreDataTestHelper;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaign;

public class BulkCampaignReadWriteTest {

    @Test
    public void bulkCampaign_ReadQSData_WriteToFile() {
        QualityScoreDataTestHelper.testQualityScoreDataReadWrite(new BulkCampaign());
    }
}
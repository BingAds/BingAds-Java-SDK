package com.microsoft.bingads.v13.api.test.entities.audience;

import org.junit.Test;

import com.microsoft.bingads.v13.api.test.entities.QualityScoreDataTestHelper;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroup;

public class BulkProductAudienceReadWriteTest {
    
    @Test
    public void bulkAdGroup_ReadQSData_WriteToFile() {
        QualityScoreDataTestHelper.testQualityScoreDataReadWrite(new BulkAdGroup());
    }
}

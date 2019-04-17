package com.microsoft.bingads.v13.api.test.entities.adgroup;

import org.junit.Test;

import com.microsoft.bingads.v13.api.test.entities.QualityScoreDataTestHelper;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroup;

public class BulkAdGroupReadWriteTest {
    
    @Test
    public void bulkAdGroup_ReadQSData_WriteToFile() {
        QualityScoreDataTestHelper.testQualityScoreDataReadWrite(new BulkAdGroup());
    }
}

package com.microsoft.bingads.v12.api.test.entities.audience;

import org.junit.Test;

import com.microsoft.bingads.v12.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v12.api.test.entities.QualityScoreDataTestHelper;
import com.microsoft.bingads.v12.bulk.entities.BulkAdGroup;

public class BulkProductAudienceReadWriteTest {
    
    @Test
    public void bulkAdGroup_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkAdGroup());
    }

    @Test
    public void bulkAdGroup_ReadQSData_WriteToFile() {
        QualityScoreDataTestHelper.testQualityScoreDataReadWrite(new BulkAdGroup());
    }
}

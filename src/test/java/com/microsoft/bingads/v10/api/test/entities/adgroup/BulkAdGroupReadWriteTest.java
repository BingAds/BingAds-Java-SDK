package com.microsoft.bingads.v10.api.test.entities.adgroup;

import com.microsoft.bingads.v10.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v10.api.test.entities.QualityScoreDataTestHelper;
import com.microsoft.bingads.v10.bulk.entities.BulkAdGroup;
import org.junit.Test;

public class BulkAdGroupReadWriteTest {
    
    @Test
    public void bulkAdGroup_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkAdGroup());
    }

    @Test
    public void bulkAdGroup_ReadQSData_WriteToFile() {
        QualityScoreDataTestHelper.testQualityScoreDataReadWrite(new BulkAdGroup());
    }
}

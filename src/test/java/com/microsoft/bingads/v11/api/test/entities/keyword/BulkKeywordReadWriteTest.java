package com.microsoft.bingads.v11.api.test.entities.keyword;

import com.microsoft.bingads.v11.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v11.api.test.entities.QualityScoreDataTestHelper;
import com.microsoft.bingads.v11.bulk.entities.BulkKeyword;
import org.junit.Test;

public class BulkKeywordReadWriteTest {
    
    @Test
    public void bulkKeyword_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkKeyword());       
    }

    @Test
    public void bulkKeyword_ReadQSData_WriteToFile() {
        QualityScoreDataTestHelper.testQualityScoreDataReadWrite(new BulkKeyword());
    }
}

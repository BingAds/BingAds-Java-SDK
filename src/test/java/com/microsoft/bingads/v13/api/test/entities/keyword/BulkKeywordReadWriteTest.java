package com.microsoft.bingads.v13.api.test.entities.keyword;

import org.junit.Test;

import com.microsoft.bingads.v13.api.test.entities.QualityScoreDataTestHelper;
import com.microsoft.bingads.v13.bulk.entities.BulkKeyword;

public class BulkKeywordReadWriteTest {

    @Test
    public void bulkKeyword_ReadQSData_WriteToFile() {
        QualityScoreDataTestHelper.testQualityScoreDataReadWrite(new BulkKeyword());
    }
}

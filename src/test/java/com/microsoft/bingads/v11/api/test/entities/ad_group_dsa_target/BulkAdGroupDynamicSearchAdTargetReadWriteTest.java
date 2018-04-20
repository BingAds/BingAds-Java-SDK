package com.microsoft.bingads.v11.api.test.entities.ad_group_dsa_target;

import org.junit.Test;

import com.microsoft.bingads.v11.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupDynamicSearchAdTarget;

public class BulkAdGroupDynamicSearchAdTargetReadWriteTest {

    @Test
    public void bulkCampaign_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkAdGroupDynamicSearchAdTarget());
    }

}
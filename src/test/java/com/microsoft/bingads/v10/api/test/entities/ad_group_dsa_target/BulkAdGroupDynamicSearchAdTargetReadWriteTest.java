package com.microsoft.bingads.v10.api.test.entities.ad_group_dsa_target;

import com.microsoft.bingads.v10.api.test.entities.PerformanceDataTestHelper;
import com.microsoft.bingads.v10.bulk.entities.BulkAdGroupDynamicSearchAdTarget;
import org.junit.Test;

public class BulkAdGroupDynamicSearchAdTargetReadWriteTest {

    @Test
    public void bulkCampaign_ReadPerfData_WriteToFile() {
        PerformanceDataTestHelper.testPerformanceDataReadWrite(new BulkAdGroupDynamicSearchAdTarget());
    }

}
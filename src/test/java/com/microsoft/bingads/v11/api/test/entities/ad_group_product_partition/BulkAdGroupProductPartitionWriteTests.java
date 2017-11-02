package com.microsoft.bingads.v11.api.test.entities.ad_group_product_partition;

import com.microsoft.bingads.v11.api.test.entities.ad_group_product_partition.write.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        WriteIdTest.class,
        WriteParentIdTest.class,
        WriteStatusTest.class,
        WriteCampaignNameTest.class,
        WriteAdGroupNameTest.class,
        WriteParentCriterionIdTest.class,
        WritePartitionTypeTest.class,
        WriteProductConditionTest.class,
        WriteProductValueTest.class,
        WriteCriterionBidTest.class
})
public class BulkAdGroupProductPartitionWriteTests {
}

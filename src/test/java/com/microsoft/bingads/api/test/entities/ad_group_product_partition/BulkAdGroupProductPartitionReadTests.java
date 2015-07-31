package com.microsoft.bingads.api.test.entities.ad_group_product_partition;

import com.microsoft.bingads.api.test.entities.ad_group_product_partition.read.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ReadIdTest.class,
        ReadParentIdTest.class,
        ReadStatusTest.class,
        ReadCampaignNameTest.class,
        ReadAdGroupNameTest.class,
        ReadParentCriterionIdTest.class,
        ReadPartitionTypeTest.class,
        ReadProductConditionTest.class,
        ReadProductValueTest.class,
        ReadCriterionBidTest.class
})
public class BulkAdGroupProductPartitionReadTests {
}

package com.microsoft.bingads.v12.api.test.entities.ad_group_product_partition;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v12.api.test.entities.ad_group_product_partition.read.ReadAdGroupNameTest;
import com.microsoft.bingads.v12.api.test.entities.ad_group_product_partition.read.ReadCampaignNameTest;
import com.microsoft.bingads.v12.api.test.entities.ad_group_product_partition.read.ReadCriterionBidAdjustmentTest;
import com.microsoft.bingads.v12.api.test.entities.ad_group_product_partition.read.ReadCriterionBidTest;
import com.microsoft.bingads.v12.api.test.entities.ad_group_product_partition.read.ReadFusTest;
import com.microsoft.bingads.v12.api.test.entities.ad_group_product_partition.read.ReadIdTest;
import com.microsoft.bingads.v12.api.test.entities.ad_group_product_partition.read.ReadParentCriterionIdTest;
import com.microsoft.bingads.v12.api.test.entities.ad_group_product_partition.read.ReadParentIdTest;
import com.microsoft.bingads.v12.api.test.entities.ad_group_product_partition.read.ReadPartitionTypeTest;
import com.microsoft.bingads.v12.api.test.entities.ad_group_product_partition.read.ReadProductConditionTest;
import com.microsoft.bingads.v12.api.test.entities.ad_group_product_partition.read.ReadProductValueTest;
import com.microsoft.bingads.v12.api.test.entities.ad_group_product_partition.read.ReadStatusTest;

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
        ReadCriterionBidTest.class,
        ReadCriterionBidAdjustmentTest.class,
        ReadFusTest.class
})
public class BulkAdGroupProductPartitionReadTests {
}

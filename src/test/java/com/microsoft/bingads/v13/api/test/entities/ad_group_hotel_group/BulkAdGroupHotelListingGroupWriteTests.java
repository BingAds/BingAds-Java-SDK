package com.microsoft.bingads.v13.api.test.entities.ad_group_hotel_group;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v13.api.test.entities.ad_group_hotel_group.write.WriteAttributeTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_hotel_group.write.WriteOperandTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_product_partition.write.WriteAdGroupNameTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_product_partition.write.WriteCampaignNameTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_product_partition.write.WriteCriterionBidAdjustmentTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_product_partition.write.WriteCriterionBidTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_product_partition.write.WriteFusTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_product_partition.write.WriteIdTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_product_partition.write.WriteParentCriterionIdTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_product_partition.write.WriteParentIdTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_product_partition.write.WritePartitionTypeTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_product_partition.write.WriteProductConditionTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_product_partition.write.WriteProductValueTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_product_partition.write.WriteStatusTest;

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
        WriteCriterionBidTest.class,
        WriteCriterionBidAdjustmentTest.class,
        WriteFusTest.class,
        WriteAttributeTest.class,
        WriteOperandTest.class
})
public class BulkAdGroupHotelListingGroupWriteTests {
}

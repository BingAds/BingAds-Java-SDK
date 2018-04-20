package com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.location;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.location.read.BulkAdGroupLocationCriterionReadAdGroupNameTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.location.read.BulkAdGroupLocationCriterionReadBidAdjustmentTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.location.read.BulkAdGroupLocationCriterionReadCampaignNameTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.location.read.BulkAdGroupLocationCriterionReadDisplayNameTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.location.read.BulkAdGroupLocationCriterionReadIdTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.location.read.BulkAdGroupLocationCriterionReadLoctionTypeTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.location.read.BulkAdGroupLocationCriterionReadParentIdTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.location.read.BulkAdGroupLocationCriterionReadStatusTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.location.read.BulkAdGroupLocationCriterionReadTargetTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkAdGroupLocationCriterionReadIdTest.class,
        BulkAdGroupLocationCriterionReadParentIdTest.class,
        BulkAdGroupLocationCriterionReadStatusTest.class,
        BulkAdGroupLocationCriterionReadTargetTest.class,
        BulkAdGroupLocationCriterionReadAdGroupNameTest.class,
        BulkAdGroupLocationCriterionReadCampaignNameTest.class,
        BulkAdGroupLocationCriterionReadBidAdjustmentTest.class,
        BulkAdGroupLocationCriterionReadLoctionTypeTest.class,
        BulkAdGroupLocationCriterionReadDisplayNameTest.class
})
public class BulkAdGroupLocationCriterionReadTests {
}

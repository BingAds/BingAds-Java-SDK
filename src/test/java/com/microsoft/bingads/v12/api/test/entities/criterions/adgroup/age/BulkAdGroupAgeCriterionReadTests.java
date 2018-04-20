package com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.age;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.age.read.BulkAdGroupAgeCriterionReadAdGroupNameTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.age.read.BulkAdGroupAgeCriterionReadBidAdjustmentTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.age.read.BulkAdGroupAgeCriterionReadCampaignNameTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.age.read.BulkAdGroupAgeCriterionReadIdTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.age.read.BulkAdGroupAgeCriterionReadParentIdTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.age.read.BulkAdGroupAgeCriterionReadStatusTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.age.read.BulkAdGroupAgeCriterionReadTargetTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkAdGroupAgeCriterionReadIdTest.class,
        BulkAdGroupAgeCriterionReadParentIdTest.class,
        BulkAdGroupAgeCriterionReadStatusTest.class,
        BulkAdGroupAgeCriterionReadTargetTest.class,
        BulkAdGroupAgeCriterionReadAdGroupNameTest.class,
        BulkAdGroupAgeCriterionReadCampaignNameTest.class,
        BulkAdGroupAgeCriterionReadBidAdjustmentTest.class
})
public class BulkAdGroupAgeCriterionReadTests {
}

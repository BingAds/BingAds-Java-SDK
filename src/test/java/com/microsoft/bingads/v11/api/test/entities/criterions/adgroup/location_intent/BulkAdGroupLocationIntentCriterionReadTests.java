package com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.location_intent;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.location_intent.read.BulkAdGroupLocationIntentCriterionReadAdGroupNameTest;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.location_intent.read.BulkAdGroupLocationIntentCriterionReadCampaignNameTest;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.location_intent.read.BulkAdGroupLocationIntentCriterionReadIdTest;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.location_intent.read.BulkAdGroupLocationIntentCriterionReadParentIdTest;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.location_intent.read.BulkAdGroupLocationIntentCriterionReadStatusTest;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.location_intent.read.BulkAdGroupLocationIntentCriterionReadTargetTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkAdGroupLocationIntentCriterionReadIdTest.class,
        BulkAdGroupLocationIntentCriterionReadParentIdTest.class,
        BulkAdGroupLocationIntentCriterionReadStatusTest.class,
        BulkAdGroupLocationIntentCriterionReadTargetTest.class,
        BulkAdGroupLocationIntentCriterionReadAdGroupNameTest.class,
        BulkAdGroupLocationIntentCriterionReadCampaignNameTest.class
})
public class BulkAdGroupLocationIntentCriterionReadTests {
}

package com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.location_intent;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.location_intent.write.BulkAdGroupLocationIntentCriterionWriteAdGroupNameTest;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.location_intent.write.BulkAdGroupLocationIntentCriterionWriteCampaignNameTest;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.location_intent.write.BulkAdGroupLocationIntentCriterionWriteIdTest;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.location_intent.write.BulkAdGroupLocationIntentCriterionWriteParentIdTest;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.location_intent.write.BulkAdGroupLocationIntentCriterionWriteStatusTest;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.location_intent.write.BulkAdGroupLocationIntentCriterionWriteTargetTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkAdGroupLocationIntentCriterionWriteIdTest.class,
        BulkAdGroupLocationIntentCriterionWriteParentIdTest.class,
        BulkAdGroupLocationIntentCriterionWriteStatusTest.class,
        BulkAdGroupLocationIntentCriterionWriteAdGroupNameTest.class,
        BulkAdGroupLocationIntentCriterionWriteCampaignNameTest.class,
        BulkAdGroupLocationIntentCriterionWriteTargetTest.class
})
public class BulkAdGroupLocationIntentCriterionWriteTests {
}

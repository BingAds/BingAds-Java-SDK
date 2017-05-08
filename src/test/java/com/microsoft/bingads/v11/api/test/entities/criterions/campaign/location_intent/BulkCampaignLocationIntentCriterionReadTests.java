package com.microsoft.bingads.v11.api.test.entities.criterions.campaign.location_intent;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v11.api.test.entities.criterions.campaign.location_intent.read.BulkCampaignLocationIntentCriterionReadCampaignNameTest;import com.microsoft.bingads.v11.api.test.entities.criterions.campaign.location_intent.read.BulkCampaignLocationIntentCriterionReadIdTest;
import com.microsoft.bingads.v11.api.test.entities.criterions.campaign.location_intent.read.BulkCampaignLocationIntentCriterionReadParentIdTest;
import com.microsoft.bingads.v11.api.test.entities.criterions.campaign.location_intent.read.BulkCampaignLocationIntentCriterionReadStatusTest;
import com.microsoft.bingads.v11.api.test.entities.criterions.campaign.location_intent.read.BulkCampaignLocationIntentCriterionReadTargetTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkCampaignLocationIntentCriterionReadIdTest.class,
        BulkCampaignLocationIntentCriterionReadParentIdTest.class,
        BulkCampaignLocationIntentCriterionReadStatusTest.class,
        BulkCampaignLocationIntentCriterionReadTargetTest.class,
        BulkCampaignLocationIntentCriterionReadCampaignNameTest.class,
        BulkCampaignLocationIntentCriterionReadCampaignNameTest.class
})
public class BulkCampaignLocationIntentCriterionReadTests {
}

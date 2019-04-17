package com.microsoft.bingads.v13.api.test.entities.criterions.campaign.location_intent;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.location_intent.write.BulkCampaignLocationIntentCriterionWriteCampaignNameTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.location_intent.write.BulkCampaignLocationIntentCriterionWriteIdTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.location_intent.write.BulkCampaignLocationIntentCriterionWriteParentIdTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.location_intent.write.BulkCampaignLocationIntentCriterionWriteStatusTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.location_intent.write.BulkCampaignLocationIntentCriterionWriteTargetTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkCampaignLocationIntentCriterionWriteIdTest.class,
        BulkCampaignLocationIntentCriterionWriteParentIdTest.class,
        BulkCampaignLocationIntentCriterionWriteStatusTest.class,
        BulkCampaignLocationIntentCriterionWriteCampaignNameTest.class,
        BulkCampaignLocationIntentCriterionWriteCampaignNameTest.class,
        BulkCampaignLocationIntentCriterionWriteTargetTest.class
})
public class BulkCampaignLocationIntentCriterionWriteTests {
}

package com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_age;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_age.write.BulkCampaignNegativeAgeCriterionWriteCampaignNameTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_age.write.BulkCampaignNegativeAgeCriterionWriteIdTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_age.write.BulkCampaignNegativeAgeCriterionWriteParentIdTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_age.write.BulkCampaignNegativeAgeCriterionWriteStatusTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_age.write.BulkCampaignNegativeAgeCriterionWriteTargetTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkCampaignNegativeAgeCriterionWriteIdTest.class,
        BulkCampaignNegativeAgeCriterionWriteParentIdTest.class,
        BulkCampaignNegativeAgeCriterionWriteStatusTest.class,
        BulkCampaignNegativeAgeCriterionWriteTargetTest.class,
        BulkCampaignNegativeAgeCriterionWriteCampaignNameTest.class,
})
public class BulkCampaignNegativeAgeCriterionWriteTests {
}

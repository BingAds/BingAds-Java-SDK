package com.microsoft.bingads.v11.api.test.entities.criterions.campaign.age;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v11.api.test.entities.criterions.campaign.age.write.BulkCampaignAgeCriterionWriteBidAdjustmentTest;
import com.microsoft.bingads.v11.api.test.entities.criterions.campaign.age.write.BulkCampaignAgeCriterionWriteCampaignNameTest;
import com.microsoft.bingads.v11.api.test.entities.criterions.campaign.age.write.BulkCampaignAgeCriterionWriteIdTest;
import com.microsoft.bingads.v11.api.test.entities.criterions.campaign.age.write.BulkCampaignAgeCriterionWriteParentIdTest;
import com.microsoft.bingads.v11.api.test.entities.criterions.campaign.age.write.BulkCampaignAgeCriterionWriteStatusTest;
import com.microsoft.bingads.v11.api.test.entities.criterions.campaign.age.write.BulkCampaignAgeCriterionWriteTargetTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkCampaignAgeCriterionWriteIdTest.class,
        BulkCampaignAgeCriterionWriteParentIdTest.class,
        BulkCampaignAgeCriterionWriteStatusTest.class,
        BulkCampaignAgeCriterionWriteCampaignNameTest.class,
        BulkCampaignAgeCriterionWriteTargetTest.class,
        BulkCampaignAgeCriterionWriteBidAdjustmentTest.class
})
public class BulkCampaignAgeCriterionWriteTests {
}

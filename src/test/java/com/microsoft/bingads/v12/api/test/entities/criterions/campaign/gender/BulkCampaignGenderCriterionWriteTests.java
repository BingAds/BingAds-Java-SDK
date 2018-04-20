package com.microsoft.bingads.v12.api.test.entities.criterions.campaign.gender;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.gender.write.BulkCampaignGenderCriterionWriteBidAdjustmentTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.gender.write.BulkCampaignGenderCriterionWriteCampaignNameTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.gender.write.BulkCampaignGenderCriterionWriteIdTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.gender.write.BulkCampaignGenderCriterionWriteParentIdTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.gender.write.BulkCampaignGenderCriterionWriteStatusTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.gender.write.BulkCampaignGenderCriterionWriteTargetTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkCampaignGenderCriterionWriteIdTest.class,
        BulkCampaignGenderCriterionWriteParentIdTest.class,
        BulkCampaignGenderCriterionWriteStatusTest.class,
        BulkCampaignGenderCriterionWriteCampaignNameTest.class,
        BulkCampaignGenderCriterionWriteCampaignNameTest.class,
        BulkCampaignGenderCriterionWriteTargetTest.class,
        BulkCampaignGenderCriterionWriteBidAdjustmentTest.class,
})
public class BulkCampaignGenderCriterionWriteTests {
}

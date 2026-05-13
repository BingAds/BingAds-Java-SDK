package com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_gender;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_gender.write.BulkCampaignNegativeGenderCriterionWriteCampaignNameTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_gender.write.BulkCampaignNegativeGenderCriterionWriteIdTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_gender.write.BulkCampaignNegativeGenderCriterionWriteParentIdTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_gender.write.BulkCampaignNegativeGenderCriterionWriteStatusTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_gender.write.BulkCampaignNegativeGenderCriterionWriteTargetTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkCampaignNegativeGenderCriterionWriteIdTest.class,
        BulkCampaignNegativeGenderCriterionWriteParentIdTest.class,
        BulkCampaignNegativeGenderCriterionWriteStatusTest.class,
        BulkCampaignNegativeGenderCriterionWriteTargetTest.class,
        BulkCampaignNegativeGenderCriterionWriteCampaignNameTest.class,
})
public class BulkCampaignNegativeGenderCriterionWriteTests {
}

package com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_gender;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_gender.read.BulkCampaignNegativeGenderCriterionReadCampaignNameTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_gender.read.BulkCampaignNegativeGenderCriterionReadIdTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_gender.read.BulkCampaignNegativeGenderCriterionReadParentIdTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_gender.read.BulkCampaignNegativeGenderCriterionReadStatusTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_gender.read.BulkCampaignNegativeGenderCriterionReadTargetTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkCampaignNegativeGenderCriterionReadIdTest.class,
        BulkCampaignNegativeGenderCriterionReadParentIdTest.class,
        BulkCampaignNegativeGenderCriterionReadStatusTest.class,
        BulkCampaignNegativeGenderCriterionReadTargetTest.class,
        BulkCampaignNegativeGenderCriterionReadCampaignNameTest.class,
})
public class BulkCampaignNegativeGenderCriterionReadTests {
}

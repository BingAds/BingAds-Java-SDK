package com.microsoft.bingads.v13.api.test.entities.criterions.campaign.gender;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.gender.read.BulkCampaignGenderCriterionReadBidAdjustmentTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.gender.read.BulkCampaignGenderCriterionReadCampaignNameTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.gender.read.BulkCampaignGenderCriterionReadIdTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.gender.read.BulkCampaignGenderCriterionReadParentIdTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.gender.read.BulkCampaignGenderCriterionReadStatusTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.gender.read.BulkCampaignGenderCriterionReadTargetTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkCampaignGenderCriterionReadIdTest.class,
        BulkCampaignGenderCriterionReadParentIdTest.class,
        BulkCampaignGenderCriterionReadStatusTest.class,
        BulkCampaignGenderCriterionReadTargetTest.class,
        BulkCampaignGenderCriterionReadCampaignNameTest.class,
        BulkCampaignGenderCriterionReadCampaignNameTest.class,
        BulkCampaignGenderCriterionReadBidAdjustmentTest.class
})
public class BulkCampaignGenderCriterionReadTests {
}

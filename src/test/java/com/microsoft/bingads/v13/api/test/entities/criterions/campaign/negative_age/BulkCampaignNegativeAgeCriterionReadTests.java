package com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_age;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_age.read.BulkCampaignNegativeAgeCriterionReadCampaignNameTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_age.read.BulkCampaignNegativeAgeCriterionReadIdTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_age.read.BulkCampaignNegativeAgeCriterionReadParentIdTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_age.read.BulkCampaignNegativeAgeCriterionReadStatusTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_age.read.BulkCampaignNegativeAgeCriterionReadTargetTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkCampaignNegativeAgeCriterionReadIdTest.class,
        BulkCampaignNegativeAgeCriterionReadParentIdTest.class,
        BulkCampaignNegativeAgeCriterionReadStatusTest.class,
        BulkCampaignNegativeAgeCriterionReadTargetTest.class,
        BulkCampaignNegativeAgeCriterionReadCampaignNameTest.class,
})
public class BulkCampaignNegativeAgeCriterionReadTests {
}

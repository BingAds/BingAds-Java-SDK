package com.microsoft.bingads.v12.api.test.entities.criterions.campaign.age;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.age.read.BulkCampaignAgeCriterionReadBidAdjustmentTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.age.read.BulkCampaignAgeCriterionReadCampaignNameTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.age.read.BulkCampaignAgeCriterionReadIdTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.age.read.BulkCampaignAgeCriterionReadParentIdTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.age.read.BulkCampaignAgeCriterionReadStatusTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.age.read.BulkCampaignAgeCriterionReadTargetTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkCampaignAgeCriterionReadIdTest.class,
        BulkCampaignAgeCriterionReadParentIdTest.class,
        BulkCampaignAgeCriterionReadStatusTest.class,
        BulkCampaignAgeCriterionReadTargetTest.class,
        BulkCampaignAgeCriterionReadCampaignNameTest.class,
        BulkCampaignAgeCriterionReadCampaignNameTest.class,
        BulkCampaignAgeCriterionReadBidAdjustmentTest.class
})
public class BulkCampaignAgeCriterionReadTests {
}

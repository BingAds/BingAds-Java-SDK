package com.microsoft.bingads.v13.api.test.entities.criterions.campaign.location;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.location.read.BulkCampaignLocationCriterionReadBidAdjustmentTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.location.read.BulkCampaignLocationCriterionReadCampaignNameTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.location.read.BulkCampaignLocationCriterionReadCashbackAdjustmentTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.location.read.BulkCampaignLocationCriterionReadDisplayNameTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.location.read.BulkCampaignLocationCriterionReadIdTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.location.read.BulkCampaignLocationCriterionReadLoctionTypeTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.location.read.BulkCampaignLocationCriterionReadParentIdTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.location.read.BulkCampaignLocationCriterionReadStatusTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.location.read.BulkCampaignLocationCriterionReadTargetTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkCampaignLocationCriterionReadIdTest.class,
        BulkCampaignLocationCriterionReadParentIdTest.class,
        BulkCampaignLocationCriterionReadStatusTest.class,
        BulkCampaignLocationCriterionReadTargetTest.class,
        BulkCampaignLocationCriterionReadCampaignNameTest.class,
        BulkCampaignLocationCriterionReadCampaignNameTest.class,
        BulkCampaignLocationCriterionReadBidAdjustmentTest.class,
        BulkCampaignLocationCriterionReadLoctionTypeTest.class,
        BulkCampaignLocationCriterionReadDisplayNameTest.class,
        BulkCampaignLocationCriterionReadCashbackAdjustmentTest.class
})
public class BulkCampaignLocationCriterionReadTests {
}

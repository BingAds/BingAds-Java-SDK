package com.microsoft.bingads.v13.api.test.entities.criterions.campaign.device;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.device.read.BulkCampaignDeviceCriterionReadBidAdjustmentTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.device.read.BulkCampaignDeviceCriterionReadCampaignNameTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.device.read.BulkCampaignDeviceCriterionReadCashbackAdjustmentTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.device.read.BulkCampaignDeviceCriterionReadIdTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.device.read.BulkCampaignDeviceCriterionReadOsNamesTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.device.read.BulkCampaignDeviceCriterionReadParentIdTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.device.read.BulkCampaignDeviceCriterionReadStatusTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.device.read.BulkCampaignDeviceCriterionReadTargetTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkCampaignDeviceCriterionReadIdTest.class,
        BulkCampaignDeviceCriterionReadParentIdTest.class,
        BulkCampaignDeviceCriterionReadStatusTest.class,
        BulkCampaignDeviceCriterionReadTargetTest.class,
        BulkCampaignDeviceCriterionReadCampaignNameTest.class,
        BulkCampaignDeviceCriterionReadCampaignNameTest.class,
        BulkCampaignDeviceCriterionReadBidAdjustmentTest.class,
        BulkCampaignDeviceCriterionReadOsNamesTest.class,
        BulkCampaignDeviceCriterionReadCashbackAdjustmentTest.class
})
public class BulkCampaignDeviceCriterionReadTests {
}

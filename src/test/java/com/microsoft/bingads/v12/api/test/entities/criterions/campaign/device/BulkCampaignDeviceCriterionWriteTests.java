package com.microsoft.bingads.v12.api.test.entities.criterions.campaign.device;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.device.write.BulkCampaignDeviceCriterionWriteBidAdjustmentTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.device.write.BulkCampaignDeviceCriterionWriteCampaignNameTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.device.write.BulkCampaignDeviceCriterionWriteIdTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.device.write.BulkCampaignDeviceCriterionWriteOsNamesTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.device.write.BulkCampaignDeviceCriterionWriteParentIdTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.device.write.BulkCampaignDeviceCriterionWriteStatusTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.device.write.BulkCampaignDeviceCriterionWriteTargetTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkCampaignDeviceCriterionWriteIdTest.class,
        BulkCampaignDeviceCriterionWriteParentIdTest.class,
        BulkCampaignDeviceCriterionWriteStatusTest.class,
        BulkCampaignDeviceCriterionWriteCampaignNameTest.class,
        BulkCampaignDeviceCriterionWriteCampaignNameTest.class,
        BulkCampaignDeviceCriterionWriteTargetTest.class,
        BulkCampaignDeviceCriterionWriteBidAdjustmentTest.class,
        BulkCampaignDeviceCriterionWriteOsNamesTest.class
})
public class BulkCampaignDeviceCriterionWriteTests {
}

package com.microsoft.bingads.v12.api.test.entities.criterions.campaign.daytime;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.daytime.write.BulkCampaignDayTimeCriterionWriteBidAdjustmentTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.daytime.write.BulkCampaignDayTimeCriterionWriteCampaignNameTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.daytime.write.BulkCampaignDayTimeCriterionWriteFromHourTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.daytime.write.BulkCampaignDayTimeCriterionWriteFromMinuteTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.daytime.write.BulkCampaignDayTimeCriterionWriteIdTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.daytime.write.BulkCampaignDayTimeCriterionWriteParentIdTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.daytime.write.BulkCampaignDayTimeCriterionWriteStatusTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.daytime.write.BulkCampaignDayTimeCriterionWriteTargetTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.daytime.write.BulkCampaignDayTimeCriterionWriteToHourTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.daytime.write.BulkCampaignDayTimeCriterionWriteToMinuteTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkCampaignDayTimeCriterionWriteIdTest.class,
        BulkCampaignDayTimeCriterionWriteParentIdTest.class,
        BulkCampaignDayTimeCriterionWriteStatusTest.class,
        BulkCampaignDayTimeCriterionWriteCampaignNameTest.class,
        BulkCampaignDayTimeCriterionWriteTargetTest.class,
        BulkCampaignDayTimeCriterionWriteBidAdjustmentTest.class,
        BulkCampaignDayTimeCriterionWriteFromHourTest.class,
        BulkCampaignDayTimeCriterionWriteToHourTest.class,
        BulkCampaignDayTimeCriterionWriteFromMinuteTest.class,
        BulkCampaignDayTimeCriterionWriteToMinuteTest.class
})
public class BulkCampaignDayTimeCriterionWriteTests {
}

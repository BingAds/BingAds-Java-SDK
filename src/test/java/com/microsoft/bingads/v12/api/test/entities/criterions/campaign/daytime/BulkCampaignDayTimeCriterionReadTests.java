package com.microsoft.bingads.v12.api.test.entities.criterions.campaign.daytime;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.daytime.read.BulkCampaignDayTimeCriterionReadBidAdjustmentTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.daytime.read.BulkCampaignDayTimeCriterionReadCampaignNameTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.daytime.read.BulkCampaignDayTimeCriterionReadFromHourTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.daytime.read.BulkCampaignDayTimeCriterionReadFromMinuteTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.daytime.read.BulkCampaignDayTimeCriterionReadIdTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.daytime.read.BulkCampaignDayTimeCriterionReadParentIdTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.daytime.read.BulkCampaignDayTimeCriterionReadStatusTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.daytime.read.BulkCampaignDayTimeCriterionReadTargetTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.daytime.read.BulkCampaignDayTimeCriterionReadToHourTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.daytime.read.BulkCampaignDayTimeCriterionReadToMinuteTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkCampaignDayTimeCriterionReadIdTest.class,
        BulkCampaignDayTimeCriterionReadParentIdTest.class,
        BulkCampaignDayTimeCriterionReadStatusTest.class,
        BulkCampaignDayTimeCriterionReadTargetTest.class,
        BulkCampaignDayTimeCriterionReadCampaignNameTest.class,
        BulkCampaignDayTimeCriterionReadCampaignNameTest.class,
        BulkCampaignDayTimeCriterionReadBidAdjustmentTest.class,
        BulkCampaignDayTimeCriterionReadFromHourTest.class,
        BulkCampaignDayTimeCriterionReadToHourTest.class,
        BulkCampaignDayTimeCriterionReadFromMinuteTest.class,
        BulkCampaignDayTimeCriterionReadToMinuteTest.class
})
public class BulkCampaignDayTimeCriterionReadTests {
}

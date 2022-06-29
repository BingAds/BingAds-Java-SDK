package com.microsoft.bingads.v13.api.test.entities.campaign_conversion_goal;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.campaign_conversion_goal.read.BulkCampaignConversionGoalReadTests;
import com.microsoft.bingads.v13.api.test.entities.campaign_conversion_goal.write.BulkCampaignConversionGoalWriteTests;

@RunWith(Suite.class)
@SuiteClasses({
        BulkCampaignConversionGoalReadTests.class,
        BulkCampaignConversionGoalWriteTests.class
})
public class BulkCampaignConversionGoalTests {

}

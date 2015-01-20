package com.microsoft.bingads.api.test.entities.campaign;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.api.test.entities.campaign.write.BulkCampaignWriteToRowValuesAccountIdTest;
import com.microsoft.bingads.api.test.entities.campaign.write.BulkCampaignWriteToRowValuesBudgetTypeTest;
import com.microsoft.bingads.api.test.entities.campaign.write.BulkCampaignWriteToRowValuesDailyBudgetTest;
import com.microsoft.bingads.api.test.entities.campaign.write.BulkCampaignWriteToRowValuesIdTest;
import com.microsoft.bingads.api.test.entities.campaign.write.BulkCampaignWriteToRowValuesMonthlyBudgetTest;
import com.microsoft.bingads.api.test.entities.campaign.write.BulkCampaignWriteToRowValuesNameTest;
import com.microsoft.bingads.api.test.entities.campaign.write.BulkCampaignWriteToRowValuesStatusTest;
import com.microsoft.bingads.api.test.entities.campaign.write.BulkCampaignWriteToRowValuesTimeZoneTest;

@RunWith(Suite.class)
@SuiteClasses({BulkCampaignWriteToRowValuesAccountIdTest.class,
    BulkCampaignWriteToRowValuesBudgetTypeTest.class,
    BulkCampaignWriteToRowValuesDailyBudgetTest.class,
    BulkCampaignWriteToRowValuesIdTest.class,
    BulkCampaignWriteToRowValuesMonthlyBudgetTest.class,
    BulkCampaignWriteToRowValuesNameTest.class,
    BulkCampaignWriteToRowValuesStatusTest.class,
    BulkCampaignWriteToRowValuesTimeZoneTest.class})
public class BulkCampaignWriteTests {

}

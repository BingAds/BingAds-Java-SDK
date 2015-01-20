package com.microsoft.bingads.api.test.entities;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.api.test.entities.campaign.BulkCampaignReadTests;
import com.microsoft.bingads.api.test.entities.campaign.BulkCampaignWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkCampaignReadTests.class, BulkCampaignWriteTests.class})
public class BulkCampaignTest {

}

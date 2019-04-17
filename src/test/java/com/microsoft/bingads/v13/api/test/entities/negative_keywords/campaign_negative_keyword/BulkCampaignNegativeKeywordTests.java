package com.microsoft.bingads.v13.api.test.entities.negative_keywords.campaign_negative_keyword;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.negative_keywords.campaign_negative_keyword.read.BulkCampaignNegativeKeywordReadTests;
import com.microsoft.bingads.v13.api.test.entities.negative_keywords.campaign_negative_keyword.write.BulkCampaignNegativeKeywordWriteTest;

@RunWith(Suite.class)
@SuiteClasses({BulkCampaignNegativeKeywordReadTests.class, BulkCampaignNegativeKeywordWriteTest.class})
public class BulkCampaignNegativeKeywordTests {

}

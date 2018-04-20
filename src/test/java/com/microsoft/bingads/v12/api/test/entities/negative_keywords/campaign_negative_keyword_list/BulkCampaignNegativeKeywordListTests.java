package com.microsoft.bingads.v12.api.test.entities.negative_keywords.campaign_negative_keyword_list;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v12.api.test.entities.negative_keywords.campaign_negative_keyword_list.read.BulkCampaignNegativeKeywordListReadTests;
import com.microsoft.bingads.v12.api.test.entities.negative_keywords.campaign_negative_keyword_list.write.BulkCampaignNegativeKeywordListWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkCampaignNegativeKeywordListReadTests.class, BulkCampaignNegativeKeywordListWriteTests.class})
public class BulkCampaignNegativeKeywordListTests {

}

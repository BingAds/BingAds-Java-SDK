package com.microsoft.bingads.v13.api.test.entities.negative_site.campaign.site;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.negative_site.campaign.site.read.BulkCampaignNegativeSiteReadTests;
import com.microsoft.bingads.v13.api.test.entities.negative_site.campaign.site.write.BulkCampaignNegativeSiteWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkCampaignNegativeSiteReadTests.class, BulkCampaignNegativeSiteWriteTests.class})
public class BulkCampaignNegativeSiteTests {

}

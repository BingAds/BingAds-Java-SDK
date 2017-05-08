package com.microsoft.bingads.v11.api.test.entities.campaign;

import com.microsoft.bingads.v11.api.test.entities.campaign.BulkCampaignReadTests;
import com.microsoft.bingads.v11.api.test.entities.campaign.BulkCampaignWriteTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        BulkCampaignReadTests.class,
        BulkCampaignWriteTests.class
})
public class BulkCampaignTests {

}

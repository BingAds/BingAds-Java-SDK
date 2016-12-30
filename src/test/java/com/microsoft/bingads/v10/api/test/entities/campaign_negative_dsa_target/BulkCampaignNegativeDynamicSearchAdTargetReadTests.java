package com.microsoft.bingads.v10.api.test.entities.campaign_negative_dsa_target;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import com.microsoft.bingads.v10.api.test.entities.campaign_negative_dsa_target.read.BulkCampaignNegativeDynamicSearchAdTargetReadCampaignNameTest;
import com.microsoft.bingads.v10.api.test.entities.campaign_negative_dsa_target.read.BulkCampaignNegativeDynamicSearchAdTargetReadConditionsTest;
import com.microsoft.bingads.v10.api.test.entities.campaign_negative_dsa_target.read.BulkCampaignNegativeDynamicSearchAdTargetReadCriterionNameTest;
import com.microsoft.bingads.v10.api.test.entities.campaign_negative_dsa_target.read.BulkCampaignNegativeDynamicSearchAdTargetReadIdTest;
import com.microsoft.bingads.v10.api.test.entities.campaign_negative_dsa_target.read.BulkCampaignNegativeDynamicSearchAdTargetReadParentIdTest;
import com.microsoft.bingads.v10.api.test.entities.campaign_negative_dsa_target.read.BulkCampaignNegativeDynamicSearchAdTargetReadStatusTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkCampaignNegativeDynamicSearchAdTargetReadIdTest.class,
        BulkCampaignNegativeDynamicSearchAdTargetReadParentIdTest.class,
        BulkCampaignNegativeDynamicSearchAdTargetReadStatusTest.class,
        BulkCampaignNegativeDynamicSearchAdTargetReadConditionsTest.class,
        BulkCampaignNegativeDynamicSearchAdTargetReadCriterionNameTest.class,
        BulkCampaignNegativeDynamicSearchAdTargetReadCampaignNameTest.class
})
public class BulkCampaignNegativeDynamicSearchAdTargetReadTests {
}

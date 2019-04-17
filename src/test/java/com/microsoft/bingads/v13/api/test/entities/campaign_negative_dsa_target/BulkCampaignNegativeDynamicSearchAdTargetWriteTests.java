package com.microsoft.bingads.v13.api.test.entities.campaign_negative_dsa_target;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v13.api.test.entities.campaign_negative_dsa_target.write.BulkCampaignNegativeDynamicSearchAdTargetWriteCampaignNameTest;
import com.microsoft.bingads.v13.api.test.entities.campaign_negative_dsa_target.write.BulkCampaignNegativeDynamicSearchAdTargetWriteConditionsTest;
import com.microsoft.bingads.v13.api.test.entities.campaign_negative_dsa_target.write.BulkCampaignNegativeDynamicSearchAdTargetWriteCriterionNameTest;
import com.microsoft.bingads.v13.api.test.entities.campaign_negative_dsa_target.write.BulkCampaignNegativeDynamicSearchAdTargetWriteIdTest;
import com.microsoft.bingads.v13.api.test.entities.campaign_negative_dsa_target.write.BulkCampaignNegativeDynamicSearchAdTargetWriteParentIdTest;
import com.microsoft.bingads.v13.api.test.entities.campaign_negative_dsa_target.write.BulkCampaignNegativeDynamicSearchAdTargetWriteStatusTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkCampaignNegativeDynamicSearchAdTargetWriteIdTest.class,
        BulkCampaignNegativeDynamicSearchAdTargetWriteParentIdTest.class,
        BulkCampaignNegativeDynamicSearchAdTargetWriteStatusTest.class,
        BulkCampaignNegativeDynamicSearchAdTargetWriteConditionsTest.class,
        BulkCampaignNegativeDynamicSearchAdTargetWriteCampaignNameTest.class,
        BulkCampaignNegativeDynamicSearchAdTargetWriteCriterionNameTest.class
})
public class BulkCampaignNegativeDynamicSearchAdTargetWriteTests {
}

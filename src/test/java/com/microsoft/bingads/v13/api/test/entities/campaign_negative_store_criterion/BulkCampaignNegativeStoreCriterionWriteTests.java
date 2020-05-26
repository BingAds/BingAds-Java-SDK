package com.microsoft.bingads.v13.api.test.entities.campaign_negative_store_criterion;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v13.api.test.entities.campaign_negative_store_criterion.write.BulkCampaignNegativeStoreCriterionWriteCampaignNameTest;
import com.microsoft.bingads.v13.api.test.entities.campaign_negative_store_criterion.write.BulkCampaignNegativeStoreCriterionWriteIdTest;
import com.microsoft.bingads.v13.api.test.entities.campaign_negative_store_criterion.write.BulkCampaignNegativeStoreCriterionWriteParentIdTest;
import com.microsoft.bingads.v13.api.test.entities.campaign_negative_store_criterion.write.BulkCampaignNegativeStoreCriterionWriteStatusTest;
import com.microsoft.bingads.v13.api.test.entities.campaign_negative_store_criterion.write.BulkCampaignNegativeStoreCriterionWriteStoreIdTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkCampaignNegativeStoreCriterionWriteIdTest.class,
        BulkCampaignNegativeStoreCriterionWriteParentIdTest.class,
        BulkCampaignNegativeStoreCriterionWriteStatusTest.class,
        BulkCampaignNegativeStoreCriterionWriteCampaignNameTest.class,
        BulkCampaignNegativeStoreCriterionWriteStoreIdTest.class
})
public class BulkCampaignNegativeStoreCriterionWriteTests {
}

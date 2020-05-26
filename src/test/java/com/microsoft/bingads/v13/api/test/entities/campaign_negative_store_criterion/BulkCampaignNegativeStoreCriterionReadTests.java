package com.microsoft.bingads.v13.api.test.entities.campaign_negative_store_criterion;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v13.api.test.entities.campaign_negative_store_criterion.read.BulkCampaignNegativeStoreCriterionReadCampaignNameTest;
import com.microsoft.bingads.v13.api.test.entities.campaign_negative_store_criterion.read.BulkCampaignNegativeStoreCriterionReadIdTest;
import com.microsoft.bingads.v13.api.test.entities.campaign_negative_store_criterion.read.BulkCampaignNegativeStoreCriterionReadParentIdTest;
import com.microsoft.bingads.v13.api.test.entities.campaign_negative_store_criterion.read.BulkCampaignNegativeStoreCriterionReadStatusTest;
import com.microsoft.bingads.v13.api.test.entities.campaign_negative_store_criterion.read.BulkCampaignNegativeStoreCriterionReadStoreIdTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkCampaignNegativeStoreCriterionReadIdTest.class,
        BulkCampaignNegativeStoreCriterionReadParentIdTest.class,
        BulkCampaignNegativeStoreCriterionReadStatusTest.class,
        BulkCampaignNegativeStoreCriterionReadCampaignNameTest.class,
        BulkCampaignNegativeStoreCriterionReadStoreIdTest.class
})
public class BulkCampaignNegativeStoreCriterionReadTests {
}

package com.microsoft.bingads.v11.api.test.entities.campaign_product_scope;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v11.api.test.entities.campaign_product_scope.read.ReadConditionsTest;
import com.microsoft.bingads.v11.api.test.entities.campaign_product_scope.read.ReadIdTest;
import com.microsoft.bingads.v11.api.test.entities.campaign_product_scope.read.ReadParentIdTest;
import com.microsoft.bingads.v11.api.test.entities.campaign_product_scope.read.ReadStatusTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ReadIdTest.class,
        ReadParentIdTest.class,
        ReadStatusTest.class,
        ReadConditionsTest.class
})
public class BulkCampaignProductScopeReadTests {
}

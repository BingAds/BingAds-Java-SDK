package com.microsoft.bingads.v12.api.test.entities.campaign_product_scope;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v12.api.test.entities.campaign_product_scope.write.WriteConditionsTest;
import com.microsoft.bingads.v12.api.test.entities.campaign_product_scope.write.WriteIdTest;
import com.microsoft.bingads.v12.api.test.entities.campaign_product_scope.write.WriteParentIdTest;
import com.microsoft.bingads.v12.api.test.entities.campaign_product_scope.write.WriteStatusTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        WriteIdTest.class,
        WriteParentIdTest.class,
        WriteStatusTest.class,
        WriteConditionsTest.class
})
public class BulkCampaignProductScopeWriteTests {
}

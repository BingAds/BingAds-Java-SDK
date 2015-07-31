package com.microsoft.bingads.api.test.entities.campaign_product_scope;

import com.microsoft.bingads.api.test.entities.campaign_product_scope.write.WriteConditionsTest;
import com.microsoft.bingads.api.test.entities.campaign_product_scope.write.WriteIdTest;
import com.microsoft.bingads.api.test.entities.campaign_product_scope.write.WriteParentIdTest;
import com.microsoft.bingads.api.test.entities.campaign_product_scope.write.WriteStatusTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        WriteIdTest.class,
        WriteParentIdTest.class,
        WriteStatusTest.class,
        WriteConditionsTest.class
})
public class BulkCampaignProductScopeWriteTests {
}

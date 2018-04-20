package com.microsoft.bingads.v11.api.test.entities.ad_group_negative_dsa_target;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v11.api.test.entities.ad_group_negative_dsa_target.write.BulkAdGroupNegativeDynamicSearchAdTargetWriteAdGroupNameTest;
import com.microsoft.bingads.v11.api.test.entities.ad_group_negative_dsa_target.write.BulkAdGroupNegativeDynamicSearchAdTargetWriteCampaignNameTest;
import com.microsoft.bingads.v11.api.test.entities.ad_group_negative_dsa_target.write.BulkAdGroupNegativeDynamicSearchAdTargetWriteConditionsTest;
import com.microsoft.bingads.v11.api.test.entities.ad_group_negative_dsa_target.write.BulkAdGroupNegativeDynamicSearchAdTargetWriteCriterionNameTest;
import com.microsoft.bingads.v11.api.test.entities.ad_group_negative_dsa_target.write.BulkAdGroupNegativeDynamicSearchAdTargetWriteIdTest;
import com.microsoft.bingads.v11.api.test.entities.ad_group_negative_dsa_target.write.BulkAdGroupNegativeDynamicSearchAdTargetWriteParentIdTest;
import com.microsoft.bingads.v11.api.test.entities.ad_group_negative_dsa_target.write.BulkAdGroupNegativeDynamicSearchAdTargetWriteStatusTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkAdGroupNegativeDynamicSearchAdTargetWriteIdTest.class,
        BulkAdGroupNegativeDynamicSearchAdTargetWriteParentIdTest.class,
        BulkAdGroupNegativeDynamicSearchAdTargetWriteStatusTest.class,
        BulkAdGroupNegativeDynamicSearchAdTargetWriteConditionsTest.class,
        BulkAdGroupNegativeDynamicSearchAdTargetWriteAdGroupNameTest.class,
        BulkAdGroupNegativeDynamicSearchAdTargetWriteCampaignNameTest.class,
        BulkAdGroupNegativeDynamicSearchAdTargetWriteCriterionNameTest.class
})
public class BulkAdGroupNegativeDynamicSearchAdTargetWriteTests {
}

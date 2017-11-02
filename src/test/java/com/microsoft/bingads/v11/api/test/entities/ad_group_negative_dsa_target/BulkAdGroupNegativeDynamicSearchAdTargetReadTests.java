package com.microsoft.bingads.v11.api.test.entities.ad_group_negative_dsa_target;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import com.microsoft.bingads.v11.api.test.entities.ad_group_negative_dsa_target.read.BulkAdGroupNegativeDynamicSearchAdTargetReadAdGroupNameTest;
import com.microsoft.bingads.v11.api.test.entities.ad_group_negative_dsa_target.read.BulkAdGroupNegativeDynamicSearchAdTargetReadCampaignNameTest;
import com.microsoft.bingads.v11.api.test.entities.ad_group_negative_dsa_target.read.BulkAdGroupNegativeDynamicSearchAdTargetReadConditionsTest;
import com.microsoft.bingads.v11.api.test.entities.ad_group_negative_dsa_target.read.BulkAdGroupNegativeDynamicSearchAdTargetReadCriterionNameTest;
import com.microsoft.bingads.v11.api.test.entities.ad_group_negative_dsa_target.read.BulkAdGroupNegativeDynamicSearchAdTargetReadIdTest;
import com.microsoft.bingads.v11.api.test.entities.ad_group_negative_dsa_target.read.BulkAdGroupNegativeDynamicSearchAdTargetReadParentIdTest;
import com.microsoft.bingads.v11.api.test.entities.ad_group_negative_dsa_target.read.BulkAdGroupNegativeDynamicSearchAdTargetReadStatusTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkAdGroupNegativeDynamicSearchAdTargetReadIdTest.class,
        BulkAdGroupNegativeDynamicSearchAdTargetReadParentIdTest.class,
        BulkAdGroupNegativeDynamicSearchAdTargetReadStatusTest.class,
        BulkAdGroupNegativeDynamicSearchAdTargetReadConditionsTest.class,
        BulkAdGroupNegativeDynamicSearchAdTargetReadCriterionNameTest.class,
        BulkAdGroupNegativeDynamicSearchAdTargetReadAdGroupNameTest.class,
        BulkAdGroupNegativeDynamicSearchAdTargetReadCampaignNameTest.class
})
public class BulkAdGroupNegativeDynamicSearchAdTargetReadTests {
}

package com.microsoft.bingads.v10.api.test.entities.ad_group_dsa_target;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import com.microsoft.bingads.v10.api.test.entities.ad_group_dsa_target.write.BulkAdGroupDynamicSearchAdTargetWriteAdGroupNameTest;
import com.microsoft.bingads.v10.api.test.entities.ad_group_dsa_target.write.BulkAdGroupDynamicSearchAdTargetWriteCampaignNameTest;
import com.microsoft.bingads.v10.api.test.entities.ad_group_dsa_target.write.BulkAdGroupDynamicSearchAdTargetWriteConditionsTest;
import com.microsoft.bingads.v10.api.test.entities.ad_group_dsa_target.write.BulkAdGroupDynamicSearchAdTargetWriteCriterionBidTest;
import com.microsoft.bingads.v10.api.test.entities.ad_group_dsa_target.write.BulkAdGroupDynamicSearchAdTargetWriteCriterionNameTest;
import com.microsoft.bingads.v10.api.test.entities.ad_group_dsa_target.write.BulkAdGroupDynamicSearchAdTargetWriteIdTest;
import com.microsoft.bingads.v10.api.test.entities.ad_group_dsa_target.write.BulkAdGroupDynamicSearchAdTargetWriteParentIdTest;
import com.microsoft.bingads.v10.api.test.entities.ad_group_dsa_target.write.BulkAdGroupDynamicSearchAdTargetWriteStatusTest;
import com.microsoft.bingads.v10.api.test.entities.ad_group_dsa_target.write.BulkAdGroupDynamicSearchAdTargetWriteTrackingTemplateTest;
import com.microsoft.bingads.v10.api.test.entities.ad_group_dsa_target.write.BulkAdGroupDynamicSearchAdTargetWriteUrlCustomParameters;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkAdGroupDynamicSearchAdTargetWriteIdTest.class,
        BulkAdGroupDynamicSearchAdTargetWriteParentIdTest.class,
        BulkAdGroupDynamicSearchAdTargetWriteStatusTest.class,
        BulkAdGroupDynamicSearchAdTargetWriteConditionsTest.class,
        BulkAdGroupDynamicSearchAdTargetWriteAdGroupNameTest.class,
        BulkAdGroupDynamicSearchAdTargetWriteCampaignNameTest.class,
        BulkAdGroupDynamicSearchAdTargetWriteCriterionNameTest.class,
        BulkAdGroupDynamicSearchAdTargetWriteCriterionBidTest.class,
        BulkAdGroupDynamicSearchAdTargetWriteTrackingTemplateTest.class,
        BulkAdGroupDynamicSearchAdTargetWriteUrlCustomParameters.class
})
public class BulkAdGroupDynamicSearchAdTargetWriteTests {
}

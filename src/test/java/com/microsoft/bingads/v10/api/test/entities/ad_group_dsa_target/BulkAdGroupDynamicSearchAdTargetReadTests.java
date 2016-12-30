package com.microsoft.bingads.v10.api.test.entities.ad_group_dsa_target;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import com.microsoft.bingads.v10.api.test.entities.ad_group_dsa_target.read.BulkAdGroupDynamicSearchAdTargetReadAdGroupNameTest;
import com.microsoft.bingads.v10.api.test.entities.ad_group_dsa_target.read.BulkAdGroupDynamicSearchAdTargetReadCampaignNameTest;
import com.microsoft.bingads.v10.api.test.entities.ad_group_dsa_target.read.BulkAdGroupDynamicSearchAdTargetReadConditionsTest;
import com.microsoft.bingads.v10.api.test.entities.ad_group_dsa_target.read.BulkAdGroupDynamicSearchAdTargetReadCriterionBidTest;
import com.microsoft.bingads.v10.api.test.entities.ad_group_dsa_target.read.BulkAdGroupDynamicSearchAdTargetReadCriterionNameTest;
import com.microsoft.bingads.v10.api.test.entities.ad_group_dsa_target.read.BulkAdGroupDynamicSearchAdTargetReadIdTest;
import com.microsoft.bingads.v10.api.test.entities.ad_group_dsa_target.read.BulkAdGroupDynamicSearchAdTargetReadParentIdTest;
import com.microsoft.bingads.v10.api.test.entities.ad_group_dsa_target.read.BulkAdGroupDynamicSearchAdTargetReadStatusTest;
import com.microsoft.bingads.v10.api.test.entities.ad_group_dsa_target.read.BulkAdGroupDynamicSearchAdTargetReadTrackingTemplateTest;
import com.microsoft.bingads.v10.api.test.entities.ad_group_dsa_target.read.BulkAdGroupDynamicSearchAdTargetReadUrlCustomParametersTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkAdGroupDynamicSearchAdTargetReadIdTest.class,
        BulkAdGroupDynamicSearchAdTargetReadParentIdTest.class,
        BulkAdGroupDynamicSearchAdTargetReadStatusTest.class,
        BulkAdGroupDynamicSearchAdTargetReadConditionsTest.class,
        BulkAdGroupDynamicSearchAdTargetReadCriterionNameTest.class,
        BulkAdGroupDynamicSearchAdTargetReadAdGroupNameTest.class,
        BulkAdGroupDynamicSearchAdTargetReadCampaignNameTest.class,
        BulkAdGroupDynamicSearchAdTargetReadCriterionBidTest.class,
        BulkAdGroupDynamicSearchAdTargetReadTrackingTemplateTest.class,
        BulkAdGroupDynamicSearchAdTargetReadUrlCustomParametersTest.class
})
public class BulkAdGroupDynamicSearchAdTargetReadTests {
}

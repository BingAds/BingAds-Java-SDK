package com.microsoft.bingads.v13.api.test.entities.ad_group_url_target;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.read.BulkAdGroupUrlTargetReadAdGroupNameTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.read.BulkAdGroupUrlTargetReadCampaignNameTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.read.BulkAdGroupUrlTargetReadConditionsTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.read.BulkAdGroupUrlTargetReadCriterionBidTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.read.BulkAdGroupUrlTargetReadCriterionNameTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.read.BulkAdGroupUrlTargetReadFusTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.read.BulkAdGroupUrlTargetReadIdTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.read.BulkAdGroupUrlTargetReadParentIdTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.read.BulkAdGroupUrlTargetReadStatusTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.read.BulkAdGroupUrlTargetReadTrackingTemplateTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.read.BulkAdGroupUrlTargetReadUrlCustomParametersTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkAdGroupUrlTargetReadIdTest.class,
        BulkAdGroupUrlTargetReadParentIdTest.class,
        BulkAdGroupUrlTargetReadStatusTest.class,
        BulkAdGroupUrlTargetReadConditionsTest.class,
        BulkAdGroupUrlTargetReadCriterionNameTest.class,
        BulkAdGroupUrlTargetReadAdGroupNameTest.class,
        BulkAdGroupUrlTargetReadCampaignNameTest.class,
        BulkAdGroupUrlTargetReadCriterionBidTest.class,
        BulkAdGroupUrlTargetReadTrackingTemplateTest.class,
        BulkAdGroupUrlTargetReadUrlCustomParametersTest.class,
        BulkAdGroupUrlTargetReadFusTest.class
})
public class BulkAdGroupUrlTargetReadTests {
}

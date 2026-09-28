package com.microsoft.bingads.v13.api.test.entities.ad_group_url_target;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.read.BulkAdGroupUrlTargetReadAdGroupNameTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.read.BulkAdGroupUrlTargetReadCampaignNameTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.read.BulkAdGroupUrlTargetReadConditionsTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.read.BulkAdGroupUrlTargetReadCriterionNameTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.read.BulkAdGroupUrlTargetReadIdTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.read.BulkAdGroupUrlTargetReadParentIdTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.read.BulkAdGroupUrlTargetReadStatusTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkAdGroupUrlTargetReadIdTest.class,
        BulkAdGroupUrlTargetReadParentIdTest.class,
        BulkAdGroupUrlTargetReadStatusTest.class,
        BulkAdGroupUrlTargetReadConditionsTest.class,
        BulkAdGroupUrlTargetReadCriterionNameTest.class,
        BulkAdGroupUrlTargetReadAdGroupNameTest.class,
        BulkAdGroupUrlTargetReadCampaignNameTest.class
})
public class BulkAdGroupUrlTargetReadTests {
}

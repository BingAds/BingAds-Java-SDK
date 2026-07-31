package com.microsoft.bingads.v13.api.test.entities.ad_group_url_target;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.write.BulkAdGroupUrlTargetWriteAdGroupNameTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.write.BulkAdGroupUrlTargetWriteCampaignNameTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.write.BulkAdGroupUrlTargetWriteConditionsTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.write.BulkAdGroupUrlTargetWriteCriterionBidTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.write.BulkAdGroupUrlTargetWriteCriterionNameTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.write.BulkAdGroupUrlTargetWriteFusTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.write.BulkAdGroupUrlTargetWriteIdTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.write.BulkAdGroupUrlTargetWriteParentIdTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.write.BulkAdGroupUrlTargetWriteStatusTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.write.BulkAdGroupUrlTargetWriteTrackingTemplateTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.write.BulkAdGroupUrlTargetWriteUrlCustomParameters;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkAdGroupUrlTargetWriteIdTest.class,
        BulkAdGroupUrlTargetWriteParentIdTest.class,
        BulkAdGroupUrlTargetWriteStatusTest.class,
        BulkAdGroupUrlTargetWriteConditionsTest.class,
        BulkAdGroupUrlTargetWriteAdGroupNameTest.class,
        BulkAdGroupUrlTargetWriteCampaignNameTest.class,
        BulkAdGroupUrlTargetWriteCriterionNameTest.class,
        BulkAdGroupUrlTargetWriteCriterionBidTest.class,
        BulkAdGroupUrlTargetWriteTrackingTemplateTest.class,
        BulkAdGroupUrlTargetWriteUrlCustomParameters.class,
        BulkAdGroupUrlTargetWriteFusTest.class
})
public class BulkAdGroupUrlTargetWriteTests {
}

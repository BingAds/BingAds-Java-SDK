package com.microsoft.bingads.v13.api.test.entities.ad_group_url_target;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.write.BulkAdGroupUrlTargetWriteAdGroupNameTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.write.BulkAdGroupUrlTargetWriteCampaignNameTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.write.BulkAdGroupUrlTargetWriteConditionsTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.write.BulkAdGroupUrlTargetWriteCriterionNameTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.write.BulkAdGroupUrlTargetWriteIdTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.write.BulkAdGroupUrlTargetWriteParentIdTest;
import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.write.BulkAdGroupUrlTargetWriteStatusTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkAdGroupUrlTargetWriteIdTest.class,
        BulkAdGroupUrlTargetWriteParentIdTest.class,
        BulkAdGroupUrlTargetWriteStatusTest.class,
        BulkAdGroupUrlTargetWriteConditionsTest.class,
        BulkAdGroupUrlTargetWriteAdGroupNameTest.class,
        BulkAdGroupUrlTargetWriteCampaignNameTest.class,
        BulkAdGroupUrlTargetWriteCriterionNameTest.class
})
public class BulkAdGroupUrlTargetWriteTests {
}

package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.location;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.location.write.BulkAdGroupLocationCriterionWriteAdGroupNameTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.location.write.BulkAdGroupLocationCriterionWriteBidAdjustmentTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.location.write.BulkAdGroupLocationCriterionWriteCampaignNameTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.location.write.BulkAdGroupLocationCriterionWriteCashbackAdjustmentTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.location.write.BulkAdGroupLocationCriterionWriteDisplayNameTypeTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.location.write.BulkAdGroupLocationCriterionWriteIdTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.location.write.BulkAdGroupLocationCriterionWriteLocationTypeTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.location.write.BulkAdGroupLocationCriterionWriteParentIdTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.location.write.BulkAdGroupLocationCriterionWriteStatusTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.location.write.BulkAdGroupLocationCriterionWriteTargetTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkAdGroupLocationCriterionWriteIdTest.class,
        BulkAdGroupLocationCriterionWriteParentIdTest.class,
        BulkAdGroupLocationCriterionWriteStatusTest.class,
        BulkAdGroupLocationCriterionWriteAdGroupNameTest.class,
        BulkAdGroupLocationCriterionWriteCampaignNameTest.class,
        BulkAdGroupLocationCriterionWriteTargetTest.class,
        BulkAdGroupLocationCriterionWriteBidAdjustmentTest.class,
        BulkAdGroupLocationCriterionWriteLocationTypeTest.class,
        BulkAdGroupLocationCriterionWriteDisplayNameTypeTest.class,
        BulkAdGroupLocationCriterionWriteCashbackAdjustmentTest.class
})
public class BulkAdGroupLocationCriterionWriteTests {
}

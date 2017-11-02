package com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.age;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.age.write.BulkAdGroupAgeCriterionWriteAdGroupNameTest;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.age.write.BulkAdGroupAgeCriterionWriteBidAdjustmentTest;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.age.write.BulkAdGroupAgeCriterionWriteCampaignNameTest;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.age.write.BulkAdGroupAgeCriterionWriteIdTest;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.age.write.BulkAdGroupAgeCriterionWriteParentIdTest;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.age.write.BulkAdGroupAgeCriterionWriteStatusTest;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.age.write.BulkAdGroupAgeCriterionWriteTargetTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkAdGroupAgeCriterionWriteIdTest.class,
        BulkAdGroupAgeCriterionWriteParentIdTest.class,
        BulkAdGroupAgeCriterionWriteStatusTest.class,
        BulkAdGroupAgeCriterionWriteAdGroupNameTest.class,
        BulkAdGroupAgeCriterionWriteCampaignNameTest.class,
        BulkAdGroupAgeCriterionWriteTargetTest.class,
        BulkAdGroupAgeCriterionWriteBidAdjustmentTest.class
})
public class BulkAdGroupAgeCriterionWriteTests {
}

package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.gender;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.gender.write.BulkAdGroupGenderCriterionWriteAdGroupNameTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.gender.write.BulkAdGroupGenderCriterionWriteBidAdjustmentTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.gender.write.BulkAdGroupGenderCriterionWriteCampaignNameTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.gender.write.BulkAdGroupGenderCriterionWriteIdTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.gender.write.BulkAdGroupGenderCriterionWriteParentIdTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.gender.write.BulkAdGroupGenderCriterionWriteStatusTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.gender.write.BulkAdGroupGenderCriterionWriteTargetTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkAdGroupGenderCriterionWriteIdTest.class,
        BulkAdGroupGenderCriterionWriteParentIdTest.class,
        BulkAdGroupGenderCriterionWriteStatusTest.class,
        BulkAdGroupGenderCriterionWriteAdGroupNameTest.class,
        BulkAdGroupGenderCriterionWriteCampaignNameTest.class,
        BulkAdGroupGenderCriterionWriteTargetTest.class,
        BulkAdGroupGenderCriterionWriteBidAdjustmentTest.class,
})
public class BulkAdGroupGenderCriterionWriteTests {
}

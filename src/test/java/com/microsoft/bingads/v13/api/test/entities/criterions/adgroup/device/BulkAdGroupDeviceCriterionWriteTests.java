package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.device;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.device.write.BulkAdGroupDeviceCriterionWriteAdGroupNameTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.device.write.BulkAdGroupDeviceCriterionWriteBidAdjustmentTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.device.write.BulkAdGroupDeviceCriterionWriteCampaignNameTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.device.write.BulkAdGroupDeviceCriterionWriteIdTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.device.write.BulkAdGroupDeviceCriterionWriteOsNamesTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.device.write.BulkAdGroupDeviceCriterionWriteParentIdTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.device.write.BulkAdGroupDeviceCriterionWriteStatusTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.device.write.BulkAdGroupDeviceCriterionWriteTargetTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkAdGroupDeviceCriterionWriteIdTest.class,
        BulkAdGroupDeviceCriterionWriteParentIdTest.class,
        BulkAdGroupDeviceCriterionWriteStatusTest.class,
        BulkAdGroupDeviceCriterionWriteAdGroupNameTest.class,
        BulkAdGroupDeviceCriterionWriteCampaignNameTest.class,
        BulkAdGroupDeviceCriterionWriteTargetTest.class,
        BulkAdGroupDeviceCriterionWriteBidAdjustmentTest.class,
        BulkAdGroupDeviceCriterionWriteOsNamesTest.class
})
public class BulkAdGroupDeviceCriterionWriteTests {
}

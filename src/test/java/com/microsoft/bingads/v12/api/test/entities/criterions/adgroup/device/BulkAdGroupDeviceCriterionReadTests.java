package com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.device;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.device.read.BulkAdGroupDeviceCriterionReadAdGroupNameTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.device.read.BulkAdGroupDeviceCriterionReadBidAdjustmentTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.device.read.BulkAdGroupDeviceCriterionReadCampaignNameTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.device.read.BulkAdGroupDeviceCriterionReadIdTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.device.read.BulkAdGroupDeviceCriterionReadOsNamesTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.device.read.BulkAdGroupDeviceCriterionReadParentIdTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.device.read.BulkAdGroupDeviceCriterionReadStatusTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.device.read.BulkAdGroupDeviceCriterionReadTargetTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkAdGroupDeviceCriterionReadIdTest.class,
        BulkAdGroupDeviceCriterionReadParentIdTest.class,
        BulkAdGroupDeviceCriterionReadStatusTest.class,
        BulkAdGroupDeviceCriterionReadTargetTest.class,
        BulkAdGroupDeviceCriterionReadAdGroupNameTest.class,
        BulkAdGroupDeviceCriterionReadCampaignNameTest.class,
        BulkAdGroupDeviceCriterionReadBidAdjustmentTest.class,
        BulkAdGroupDeviceCriterionReadOsNamesTest.class
})
public class BulkAdGroupDeviceCriterionReadTests {
}

package com.microsoft.bingads.v11.api.test.entities.adgroup.write;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        BulkAdGroupWriteToRowValuesAdDistributionTests.class,
        BulkAdGroupWriteToRowValuesAdRotationTests.class,
        BulkAdGroupWriteToRowValuesBroadMatchBidTests.class,
        BulkAdGroupWriteToRowValuesNetworkTests.class,
        BulkAdGroupWriteToRowValuesPricingModelTests.class,
        BulkAdGroupWriteToRowValuesStartDateTests.class,
        BulkAdGroupWriteToRowValuesNativeBidAdjustmentTest.class,
        BulkAdGroupWriteToRowValuesBidStrategyTypeTest.class,
        BulkAdGroupWriteToRowValuesRemarketingTargetingSettingTests.class
})
public class BulkAdGroupWriteTests {

}

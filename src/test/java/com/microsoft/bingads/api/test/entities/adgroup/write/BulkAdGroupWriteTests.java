package com.microsoft.bingads.api.test.entities.adgroup.write;

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
})
public class BulkAdGroupWriteTests {

}

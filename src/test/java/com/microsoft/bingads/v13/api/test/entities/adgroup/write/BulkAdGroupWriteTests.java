package com.microsoft.bingads.v13.api.test.entities.adgroup.write;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        BulkAdGroupWriteToRowValuesAdRotationTests.class,
        BulkAdGroupWriteToRowValuesBroadMatchBidTests.class,
        BulkAdGroupWriteToRowValuesNetworkTests.class,
        BulkAdGroupWriteToRowValuesStartDateTests.class,
        BulkAdGroupWriteToRowValuesAudienceAdsBidAdjustmentTest.class,
        BulkAdGroupWriteToRowValuesBidStrategyTypeTest.class,
        BulkAdGroupWriteToRowValuesTargetSettingTests.class,
        BulkAdGroupWriteToRowValuesCoOpBidOptionTests.class,
        BulkAdGroupWriteToRowValuesCoOpBidBoostValueTests.class,
        BulkAdGroupWriteToRowValuesCoOpMaximumBidTests.class,
		BulkAdGroupWriteToRowValuesFinalUrlSuffixTests.class
})
public class BulkAdGroupWriteTests {

}

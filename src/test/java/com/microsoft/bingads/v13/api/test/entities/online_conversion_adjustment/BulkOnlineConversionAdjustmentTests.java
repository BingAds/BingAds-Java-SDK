package com.microsoft.bingads.v13.api.test.entities.online_conversion_adjustment;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.online_conversion_adjustment.read.BulkOnlineConversionAdjustmentReadTests;
import com.microsoft.bingads.v13.api.test.entities.online_conversion_adjustment.write.BulkOnlineConversionAdjustmentWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkOnlineConversionAdjustmentReadTests.class, BulkOnlineConversionAdjustmentWriteTests.class})
public class BulkOnlineConversionAdjustmentTests {

}

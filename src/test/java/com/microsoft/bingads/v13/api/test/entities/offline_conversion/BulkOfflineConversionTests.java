package com.microsoft.bingads.v13.api.test.entities.offline_conversion;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.offline_conversion.read.BulkOfflineConversionReadTests;
import com.microsoft.bingads.v13.api.test.entities.offline_conversion.write.BulkOfflineConversionWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkOfflineConversionReadTests.class, BulkOfflineConversionWriteTests.class})
public class BulkOfflineConversionTests {

}

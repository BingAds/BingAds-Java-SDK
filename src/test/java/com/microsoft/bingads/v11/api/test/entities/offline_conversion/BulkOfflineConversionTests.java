package com.microsoft.bingads.v11.api.test.entities.offline_conversion;

import com.microsoft.bingads.v11.api.test.entities.offline_conversion.read.BulkOfflineConversionReadTests;
import com.microsoft.bingads.v11.api.test.entities.offline_conversion.write.BulkOfflineConversionWriteTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({BulkOfflineConversionReadTests.class, BulkOfflineConversionWriteTests.class})
public class BulkOfflineConversionTests {

}

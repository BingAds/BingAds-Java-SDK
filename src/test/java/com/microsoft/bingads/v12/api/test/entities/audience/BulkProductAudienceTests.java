package com.microsoft.bingads.v12.api.test.entities.audience;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v12.api.test.entities.audience.read.BulkProductAudienceReadTests;
import com.microsoft.bingads.v12.api.test.entities.audience.write.BulkProductAudienceWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkProductAudienceReadTests.class, BulkProductAudienceWriteTests.class})
public class BulkProductAudienceTests {

}

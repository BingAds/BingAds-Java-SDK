package com.microsoft.bingads.v12.api.test.entities.ad_extension.location;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v12.api.test.entities.ad_extension.location.read.BulkLocationAdExtensionReadTests;
import com.microsoft.bingads.v12.api.test.entities.ad_extension.location.write.BulkLocationAdExtensionWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkLocationAdExtensionReadTests.class, BulkLocationAdExtensionWriteTests.class})
public class BulkLocationAdExtensionTests {

}

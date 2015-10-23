package com.microsoft.bingads.v10.api.test.entities.ad_extension.location;

import com.microsoft.bingads.v10.api.test.entities.ad_extension.location.read.BulkLocationAdExtensionReadTests;
import com.microsoft.bingads.v10.api.test.entities.ad_extension.location.write.BulkLocationAdExtensionWriteTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({BulkLocationAdExtensionReadTests.class, BulkLocationAdExtensionWriteTests.class})
public class BulkLocationAdExtensionTests {

}

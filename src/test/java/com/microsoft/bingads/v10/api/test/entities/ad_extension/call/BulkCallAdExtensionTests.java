package com.microsoft.bingads.v10.api.test.entities.ad_extension.call;

import com.microsoft.bingads.v10.api.test.entities.ad_extension.call.read.BulkCallAdExtensionReadTests;
import com.microsoft.bingads.v10.api.test.entities.ad_extension.call.write.BulkCallAdExtensionWriteTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({BulkCallAdExtensionReadTests.class, BulkCallAdExtensionWriteTests.class})
public class BulkCallAdExtensionTests {

}

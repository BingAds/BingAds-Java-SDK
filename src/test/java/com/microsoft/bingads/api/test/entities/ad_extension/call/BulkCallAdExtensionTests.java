package com.microsoft.bingads.api.test.entities.ad_extension.call;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.api.test.entities.ad_extension.call.read.BulkCallAdExtensionReadTests;
import com.microsoft.bingads.api.test.entities.ad_extension.call.write.BulkCallAdExtensionWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkCallAdExtensionReadTests.class, BulkCallAdExtensionWriteTests.class})
public class BulkCallAdExtensionTests {

}

package com.microsoft.bingads.v13.api.test.entities.ad_extension.flyer;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.ad_extension.flyer.read.BulkFlyerAdExtensionReadTests;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.flyer.write.BulkFlyerAdExtensionWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkFlyerAdExtensionReadTests.class, BulkFlyerAdExtensionWriteTests.class})
public class BulkFlyerAdExtensionTests {

}

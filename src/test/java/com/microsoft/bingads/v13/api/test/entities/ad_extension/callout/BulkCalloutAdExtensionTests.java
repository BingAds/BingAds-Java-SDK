package com.microsoft.bingads.v13.api.test.entities.ad_extension.callout;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.ad_extension.callout.read.BulkCalloutAdExtensionReadTests;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.callout.write.BulkCalloutAdExtensionWriteTests;

@RunWith(Suite.class)
@SuiteClasses({
        BulkCalloutAdExtensionReadTests.class,
        BulkCalloutAdExtensionWriteTests.class
})
public class BulkCalloutAdExtensionTests {

}

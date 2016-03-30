package com.microsoft.bingads.v10.api.test.entities.ad_extension.callout;

import com.microsoft.bingads.v10.api.test.entities.ad_extension.callout.read.BulkCalloutAdExtensionReadTests;
import com.microsoft.bingads.v10.api.test.entities.ad_extension.callout.write.BulkCalloutAdExtensionWriteTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        BulkCalloutAdExtensionReadTests.class,
        BulkCalloutAdExtensionWriteTests.class
})
public class BulkCalloutAdExtensionTests {

}

package com.microsoft.bingads.v12.api.test.entities.ad_extension.app;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v12.api.test.entities.ad_extension.app.read.BulkAppAdExtensionReadTests;
import com.microsoft.bingads.v12.api.test.entities.ad_extension.app.write.BulkAppAdExtensionWriteTests;

@RunWith(Suite.class)
@SuiteClasses({
        BulkAppAdExtensionReadTests.class,
        BulkAppAdExtensionWriteTests.class
})
public class BulkAppAdExtensionTests {

}

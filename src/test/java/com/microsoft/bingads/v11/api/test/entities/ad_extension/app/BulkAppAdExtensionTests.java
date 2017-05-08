package com.microsoft.bingads.v11.api.test.entities.ad_extension.app;

import com.microsoft.bingads.v11.api.test.entities.ad_extension.app.read.BulkAppAdExtensionReadTests;
import com.microsoft.bingads.v11.api.test.entities.ad_extension.app.write.BulkAppAdExtensionWriteTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        BulkAppAdExtensionReadTests.class,
        BulkAppAdExtensionWriteTests.class
})
public class BulkAppAdExtensionTests {

}

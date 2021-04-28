package com.microsoft.bingads.v13.api.test.entities.ad_extension.video;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.ad_extension.video.read.BulkVideoAdExtensionReadTests;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.video.write.BulkVideoAdExtensionWriteTests;

@RunWith(Suite.class)
@SuiteClasses({
        BulkVideoAdExtensionReadTests.class,
        BulkVideoAdExtensionWriteTests.class
})
public class BulkVideoAdExtensionTests {

}

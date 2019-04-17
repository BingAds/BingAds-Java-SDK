package com.microsoft.bingads.v13.api.test.entities.ad_extension.image;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.ad_extension.image.read.BulkImageAdExtensionReadTests;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.image.write.BulkImageAdExtensionWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkImageAdExtensionReadTests.class, BulkImageAdExtensionWriteTests.class})
public class BulkImageAdExtensionTests {

}

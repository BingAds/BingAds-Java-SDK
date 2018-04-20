package com.microsoft.bingads.v12.api.test.entities.ad_extension.site_link;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v12.api.test.entities.ad_extension.site_link.read.BulkSitelinkAdExtensionReadTests;
import com.microsoft.bingads.v12.api.test.entities.ad_extension.site_link.write.BulkSitelinkAdExtensionWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkSitelinkAdExtensionReadTests.class, BulkSitelinkAdExtensionWriteTests.class})
public class BulkSitelinkAdExtensionTests {

}

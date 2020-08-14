package com.microsoft.bingads.v13.api.test.entities.ad_extension.filterlink;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.ad_extension.filterlink.read.BulkFilterLinkAdExtensionReadTests;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.filterlink.write.BulkFilterLinkAdExtensionWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkFilterLinkAdExtensionReadTests.class, BulkFilterLinkAdExtensionWriteTests.class})
public class BulkFilterLinkAdExtensionTests {

}

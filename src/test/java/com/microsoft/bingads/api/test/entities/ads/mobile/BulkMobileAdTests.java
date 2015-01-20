package com.microsoft.bingads.api.test.entities.ads.mobile;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.api.test.entities.ads.mobile.read.BulkMobileAdReadTests;
import com.microsoft.bingads.api.test.entities.ads.mobile.write.BulkMobileAdWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkMobileAdReadTests.class, BulkMobileAdWriteTests.class})
public class BulkMobileAdTests {

}

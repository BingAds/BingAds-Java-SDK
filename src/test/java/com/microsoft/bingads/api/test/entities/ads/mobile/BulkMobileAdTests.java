package com.microsoft.bingads.api.test.entities.ads.mobile;

import com.microsoft.bingads.api.test.entities.ads.mobile.read.BulkMobileAdReadTests;
import com.microsoft.bingads.api.test.entities.ads.mobile.write.BulkMobileAdWriteTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({BulkMobileAdReadTests.class, BulkMobileAdWriteTests.class})
public class BulkMobileAdTests {

}

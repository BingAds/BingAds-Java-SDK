package com.microsoft.bingads.v10.api.test.entities.ads.appInstall;

import com.microsoft.bingads.v10.api.test.entities.ads.appInstall.read.BulkAppInstallAdReadTests;
import com.microsoft.bingads.v10.api.test.entities.ads.appInstall.write.BulkAppInstallAdWriteTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({BulkAppInstallAdReadTests.class, BulkAppInstallAdWriteTests.class})
public class BulkAppInstallAdTests {

}

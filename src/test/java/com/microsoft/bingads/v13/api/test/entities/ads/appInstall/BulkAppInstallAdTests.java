package com.microsoft.bingads.v13.api.test.entities.ads.appInstall;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.ads.appInstall.read.BulkAppInstallAdReadTests;
import com.microsoft.bingads.v13.api.test.entities.ads.appInstall.write.BulkAppInstallAdWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkAppInstallAdReadTests.class, BulkAppInstallAdWriteTests.class})
public class BulkAppInstallAdTests {

}

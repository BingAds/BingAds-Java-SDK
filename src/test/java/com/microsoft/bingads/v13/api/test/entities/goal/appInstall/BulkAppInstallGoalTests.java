package com.microsoft.bingads.v13.api.test.entities.goal.appInstall;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.goal.appInstall.read.BulkAppInstallGoalReadTests;
import com.microsoft.bingads.v13.api.test.entities.goal.appInstall.write.BulkAppInstallGoalWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkAppInstallGoalReadTests.class, BulkAppInstallGoalWriteTests.class})
public class BulkAppInstallGoalTests {

}

package com.microsoft.bingads.v13.api.test.entities.goal.appDownload;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.goal.appDownload.read.BulkAppDownloadGoalReadTests;
import com.microsoft.bingads.v13.api.test.entities.goal.appDownload.write.BulkAppDownloadGoalWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkAppDownloadGoalReadTests.class, BulkAppDownloadGoalWriteTests.class})
public class BulkAppDownloadGoalTests {

}

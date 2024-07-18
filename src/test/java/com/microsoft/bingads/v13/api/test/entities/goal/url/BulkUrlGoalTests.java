package com.microsoft.bingads.v13.api.test.entities.goal.url;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.goal.url.read.BulkUrlGoalReadTests;
import com.microsoft.bingads.v13.api.test.entities.goal.url.write.BulkUrlGoalWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkUrlGoalReadTests.class, BulkUrlGoalWriteTests.class})
public class BulkUrlGoalTests {

}

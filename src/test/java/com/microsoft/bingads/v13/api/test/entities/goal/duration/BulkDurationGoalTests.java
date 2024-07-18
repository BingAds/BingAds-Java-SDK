package com.microsoft.bingads.v13.api.test.entities.goal.duration;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.goal.duration.read.BulkDurationGoalReadTests;
import com.microsoft.bingads.v13.api.test.entities.goal.duration.write.BulkDurationGoalWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkDurationGoalReadTests.class, BulkDurationGoalWriteTests.class})
public class BulkDurationGoalTests {

}

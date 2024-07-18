package com.microsoft.bingads.v13.api.test.entities.goal.event;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.goal.event.read.BulkEventGoalReadTests;
import com.microsoft.bingads.v13.api.test.entities.goal.event.write.BulkEventGoalWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkEventGoalReadTests.class, BulkEventGoalWriteTests.class})
public class BulkEventGoalTests {

}

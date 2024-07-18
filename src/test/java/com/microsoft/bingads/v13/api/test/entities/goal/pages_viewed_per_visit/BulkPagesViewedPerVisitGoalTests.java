package com.microsoft.bingads.v13.api.test.entities.goal.pages_viewed_per_visit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.goal.pages_viewed_per_visit.read.BulkPagesViewedPerVisitGoalReadTests;
import com.microsoft.bingads.v13.api.test.entities.goal.pages_viewed_per_visit.write.BulkPagesViewedPerVisitGoalWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkPagesViewedPerVisitGoalReadTests.class, BulkPagesViewedPerVisitGoalWriteTests.class})
public class BulkPagesViewedPerVisitGoalTests {

}

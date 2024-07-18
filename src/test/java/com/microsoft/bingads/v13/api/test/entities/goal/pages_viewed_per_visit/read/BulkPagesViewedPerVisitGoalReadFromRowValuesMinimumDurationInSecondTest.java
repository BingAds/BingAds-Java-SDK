package com.microsoft.bingads.v13.api.test.entities.goal.pages_viewed_per_visit.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.goal.pages_viewed_per_visit.BulkPagesViewedPerVisitGoalTest;
import com.microsoft.bingads.v13.bulk.entities.BulkPagesViewedPerVisitGoal;

public class BulkPagesViewedPerVisitGoalReadFromRowValuesMinimumDurationInSecondTest extends BulkPagesViewedPerVisitGoalTest {

    @Parameter(value = 1)
    public Integer expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
        	{"123", 123},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<Integer>testReadProperty("Minimum Pages Viewed", this.datum, this.expectedResult, new Function<BulkPagesViewedPerVisitGoal, Integer>() {
            @Override
            public Integer apply(BulkPagesViewedPerVisitGoal c) {
                return c.getPagesViewedPerVisitGoal().getMinimumPagesViewed();
            }
        });
    }
}

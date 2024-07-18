package com.microsoft.bingads.v13.api.test.entities.goal.duration.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.goal.duration.BulkDurationGoalTest;
import com.microsoft.bingads.v13.bulk.entities.BulkDurationGoal;

public class BulkDurationGoalReadFromRowValuesMinimumDurationInSecondTest extends BulkDurationGoalTest {

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
        this.<Integer>testReadProperty("Minimum Duration In Second", this.datum, this.expectedResult, new Function<BulkDurationGoal, Integer>() {
            @Override
            public Integer apply(BulkDurationGoal c) {
                return c.getDurationGoal().getMinimumDurationInSeconds();
            }
        });
    }
}

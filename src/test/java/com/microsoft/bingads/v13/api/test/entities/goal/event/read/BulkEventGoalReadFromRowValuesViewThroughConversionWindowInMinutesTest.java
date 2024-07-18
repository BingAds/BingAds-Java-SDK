package com.microsoft.bingads.v13.api.test.entities.goal.event.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.goal.event.BulkEventGoalTest;
import com.microsoft.bingads.v13.bulk.entities.BulkEventGoal;

public class BulkEventGoalReadFromRowValuesViewThroughConversionWindowInMinutesTest extends BulkEventGoalTest {

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
        this.<Integer>testReadProperty("View Through Conversion Window In Minutes", this.datum, this.expectedResult, new Function<BulkEventGoal, Integer>() {
            @Override
            public Integer apply(BulkEventGoal c) {
                return c.getEventGoal().getViewThroughConversionWindowInMinutes();
            }
        });
    }
}

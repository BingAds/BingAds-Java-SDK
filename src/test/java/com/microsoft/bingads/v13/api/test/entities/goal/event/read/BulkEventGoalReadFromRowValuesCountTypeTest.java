package com.microsoft.bingads.v13.api.test.entities.goal.event.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.goal.event.BulkEventGoalTest;
import com.microsoft.bingads.v13.bulk.entities.BulkEventGoal;
import com.microsoft.bingads.v13.campaignmanagement.ConversionGoalCountType;

public class BulkEventGoalReadFromRowValuesCountTypeTest extends BulkEventGoalTest {

    @Parameter(value = 1)
    public ConversionGoalCountType expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"All", ConversionGoalCountType.ALL},
            {"Unique", ConversionGoalCountType.UNIQUE},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<ConversionGoalCountType>testReadProperty("Count Type", this.datum, this.expectedResult, new Function<BulkEventGoal, ConversionGoalCountType>() {
            @Override
            public ConversionGoalCountType apply(BulkEventGoal c) {
                return c.getEventGoal().getCountType();
            }
        });
    }
}

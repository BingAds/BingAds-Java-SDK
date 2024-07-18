package com.microsoft.bingads.v13.api.test.entities.goal.event.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.goal.event.BulkEventGoalTest;
import com.microsoft.bingads.v13.bulk.entities.BulkEventGoal;
import com.microsoft.bingads.v13.campaignmanagement.ConversionGoalStatus;

public class BulkEventGoalReadFromRowValuesStatusTest extends BulkEventGoalTest {

    @Parameter(value = 1)
    public ConversionGoalStatus expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Active", ConversionGoalStatus.ACTIVE},
            {"Paused", ConversionGoalStatus.PAUSED},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<ConversionGoalStatus>testReadProperty("Status", this.datum, this.expectedResult, new Function<BulkEventGoal, ConversionGoalStatus>() {
            @Override
            public ConversionGoalStatus apply(BulkEventGoal c) {
                return c.getEventGoal().getStatus();
            }
        });
    }
}

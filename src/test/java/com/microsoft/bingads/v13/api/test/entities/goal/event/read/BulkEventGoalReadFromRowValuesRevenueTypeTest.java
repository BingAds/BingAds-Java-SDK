package com.microsoft.bingads.v13.api.test.entities.goal.event.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.goal.event.BulkEventGoalTest;
import com.microsoft.bingads.v13.bulk.entities.BulkEventGoal;
import com.microsoft.bingads.v13.campaignmanagement.ConversionGoalRevenueType;

public class BulkEventGoalReadFromRowValuesRevenueTypeTest extends BulkEventGoalTest {

    @Parameter(value = 1)
    public ConversionGoalRevenueType expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"FixedValue", ConversionGoalRevenueType.FIXED_VALUE},
            {"NoValue", ConversionGoalRevenueType.NO_VALUE},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<ConversionGoalRevenueType>testReadProperty("Revenue Type", this.datum, this.expectedResult, new Function<BulkEventGoal, ConversionGoalRevenueType>() {
            @Override
            public ConversionGoalRevenueType apply(BulkEventGoal c) {
            	return c.getEventGoal().getRevenue() != null ? c.getEventGoal().getRevenue().getType() : null;
            }
        });
    }
}

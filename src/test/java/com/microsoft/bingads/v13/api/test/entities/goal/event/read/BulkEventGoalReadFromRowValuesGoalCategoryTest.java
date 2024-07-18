package com.microsoft.bingads.v13.api.test.entities.goal.event.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.goal.event.BulkEventGoalTest;
import com.microsoft.bingads.v13.bulk.entities.BulkEventGoal;
import com.microsoft.bingads.v13.campaignmanagement.ConversionGoalCategory;

public class BulkEventGoalReadFromRowValuesGoalCategoryTest extends BulkEventGoalTest {

    @Parameter(value = 1)
    public ConversionGoalCategory expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Purchase", ConversionGoalCategory.PURCHASE},
            {"None", ConversionGoalCategory.NONE},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<ConversionGoalCategory>testReadProperty("Goal Category", this.datum, this.expectedResult, new Function<BulkEventGoal, ConversionGoalCategory>() {
            @Override
            public ConversionGoalCategory apply(BulkEventGoal c) {
                return c.getEventGoal().getGoalCategory();
            }
        });
    }
}

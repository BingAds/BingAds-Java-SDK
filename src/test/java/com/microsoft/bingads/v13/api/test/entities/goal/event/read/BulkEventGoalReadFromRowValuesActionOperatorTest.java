package com.microsoft.bingads.v13.api.test.entities.goal.event.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.goal.event.BulkEventGoalTest;
import com.microsoft.bingads.v13.bulk.entities.BulkEventGoal;
import com.microsoft.bingads.v13.campaignmanagement.ExpressionOperator;

public class BulkEventGoalReadFromRowValuesActionOperatorTest extends BulkEventGoalTest {

    @Parameter(value = 1)
    public ExpressionOperator expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Equals", ExpressionOperator.EQUALS},
            {"Contains", ExpressionOperator.CONTAINS},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<ExpressionOperator>testReadProperty("Action Operator", this.datum, this.expectedResult, new Function<BulkEventGoal, ExpressionOperator>() {
            @Override
            public ExpressionOperator apply(BulkEventGoal c) {
                return c.getEventGoal().getActionOperator();
            }
        });
    }
}

package com.microsoft.bingads.v13.api.test.entities.goal.url.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.goal.url.BulkUrlGoalTest;
import com.microsoft.bingads.v13.bulk.entities.BulkUrlGoal;
import com.microsoft.bingads.v13.campaignmanagement.ExpressionOperator;

public class BulkUrlGoalReadFromRowValuesUrlOperatorTest extends BulkUrlGoalTest {

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
        this.<ExpressionOperator>testReadProperty("URL Operator", this.datum, this.expectedResult, new Function<BulkUrlGoal, ExpressionOperator>() {
            @Override
            public ExpressionOperator apply(BulkUrlGoal c) {
                return c.getUrlGoal().getUrlOperator();
            }
        });
    }
}

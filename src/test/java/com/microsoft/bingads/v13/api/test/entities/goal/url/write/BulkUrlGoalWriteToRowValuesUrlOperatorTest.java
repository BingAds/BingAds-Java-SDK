package com.microsoft.bingads.v13.api.test.entities.goal.url.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.goal.url.BulkUrlGoalTest;
import com.microsoft.bingads.v13.bulk.entities.BulkUrlGoal;
import com.microsoft.bingads.v13.campaignmanagement.ExpressionOperator;

@RunWith(Parameterized.class)
public class BulkUrlGoalWriteToRowValuesUrlOperatorTest extends BulkUrlGoalTest {

    @Parameter(value = 1)
    public ExpressionOperator propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
        	{"Equals", ExpressionOperator.EQUALS},
            {"Contains", ExpressionOperator.CONTAINS},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<ExpressionOperator>testWriteProperty("URL Operator", this.datum, this.propertyValue, new BiConsumer<BulkUrlGoal, ExpressionOperator>() {
            @Override
            public void accept(BulkUrlGoal c, ExpressionOperator v) {
                c.getUrlGoal().setUrlOperator(v);
            }
        });
    }
}

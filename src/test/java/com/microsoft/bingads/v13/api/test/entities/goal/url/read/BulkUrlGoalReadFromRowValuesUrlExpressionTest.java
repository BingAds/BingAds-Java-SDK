package com.microsoft.bingads.v13.api.test.entities.goal.url.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.goal.url.BulkUrlGoalTest;
import com.microsoft.bingads.v13.bulk.entities.BulkUrlGoal;

@RunWith(Parameterized.class)
public class BulkUrlGoalReadFromRowValuesUrlExpressionTest extends BulkUrlGoalTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Url Expression", "Url Expression"},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("URL Expression", this.datum, this.expectedResult, new Function<BulkUrlGoal, String>() {
            @Override
            public String apply(BulkUrlGoal c) {
                return c.getUrlGoal().getUrlExpression();
            }
        });
    }
}

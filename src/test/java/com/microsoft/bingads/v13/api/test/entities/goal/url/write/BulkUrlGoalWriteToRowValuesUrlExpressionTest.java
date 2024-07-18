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

@RunWith(Parameterized.class)
public class BulkUrlGoalWriteToRowValuesUrlExpressionTest extends BulkUrlGoalTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
    	return Arrays.asList(new Object[][]{
    		{"Url Expression", "Url Expression"},
            {null, null}
    	});
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("URL Expression", this.datum, this.propertyValue, new BiConsumer<BulkUrlGoal, String>() {
            @Override
            public void accept(BulkUrlGoal c, String v) {
                c.getUrlGoal().setUrlExpression(v);
            }
        });
    }
}

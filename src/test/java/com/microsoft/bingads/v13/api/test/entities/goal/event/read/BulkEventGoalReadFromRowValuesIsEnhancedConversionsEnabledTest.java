package com.microsoft.bingads.v13.api.test.entities.goal.event.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.goal.event.BulkEventGoalTest;
import com.microsoft.bingads.v13.bulk.entities.BulkEventGoal;

@RunWith(Parameterized.class)
public class BulkEventGoalReadFromRowValuesIsEnhancedConversionsEnabledTest extends BulkEventGoalTest {

    @Parameter(value = 1)
    public boolean expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"False", false},
            {"True", true},
        });
    }

    @Test
    public void testRead() {
        this.<Boolean>testReadProperty("Is Enhanced Conversions Enabled", this.datum, this.expectedResult, new Function<BulkEventGoal, Boolean>() {
            @Override
            public Boolean apply(BulkEventGoal c) {
                return c.getConversionGoal().getIsEnhancedConversionsEnabled();
            }
        });
    }
}

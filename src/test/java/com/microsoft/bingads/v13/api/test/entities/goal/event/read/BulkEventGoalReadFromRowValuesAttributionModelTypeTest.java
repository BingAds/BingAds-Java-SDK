package com.microsoft.bingads.v13.api.test.entities.goal.event.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.goal.event.BulkEventGoalTest;
import com.microsoft.bingads.v13.bulk.entities.BulkEventGoal;
import com.microsoft.bingads.v13.campaignmanagement.AttributionModelType;

public class BulkEventGoalReadFromRowValuesAttributionModelTypeTest extends BulkEventGoalTest {

    @Parameter(value = 1)
    public AttributionModelType expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"LastClick", AttributionModelType.LAST_CLICK},
            {"LastTouch", AttributionModelType.LAST_TOUCH},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<AttributionModelType>testReadProperty("Attribution Model Type", this.datum, this.expectedResult, new Function<BulkEventGoal, AttributionModelType>() {
            @Override
            public AttributionModelType apply(BulkEventGoal c) {
                return c.getEventGoal().getAttributionModelType();
            }
        });
    }
}

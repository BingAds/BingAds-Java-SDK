package com.microsoft.bingads.v13.api.test.entities.goal.event.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.goal.event.BulkEventGoalTest;
import com.microsoft.bingads.v13.bulk.entities.BulkEventGoal;
import com.microsoft.bingads.v13.campaignmanagement.AttributionModelType;

@RunWith(Parameterized.class)
public class BulkEventGoalWriteToRowValuesAttributionModelTypeTest extends BulkEventGoalTest {

    @Parameter(value = 1)
    public AttributionModelType propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
        	{"LastClick", AttributionModelType.LAST_CLICK},
            {"LastTouch", AttributionModelType.LAST_TOUCH},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<AttributionModelType>testWriteProperty("Attribution Model Type", this.datum, this.propertyValue, new BiConsumer<BulkEventGoal, AttributionModelType>() {
            @Override
            public void accept(BulkEventGoal c, AttributionModelType v) {
                c.getEventGoal().setAttributionModelType(v);
            }
        });
    }
}

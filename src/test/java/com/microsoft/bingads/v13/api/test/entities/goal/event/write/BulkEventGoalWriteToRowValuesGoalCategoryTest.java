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
import com.microsoft.bingads.v13.campaignmanagement.ConversionGoalCategory;

@RunWith(Parameterized.class)
public class BulkEventGoalWriteToRowValuesGoalCategoryTest extends BulkEventGoalTest {

    @Parameter(value = 1)
    public ConversionGoalCategory propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
        	{"Purchase", ConversionGoalCategory.PURCHASE},
            {"None", ConversionGoalCategory.NONE},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<ConversionGoalCategory>testWriteProperty("Goal Category", this.datum, this.propertyValue, new BiConsumer<BulkEventGoal, ConversionGoalCategory>() {
            @Override
            public void accept(BulkEventGoal c, ConversionGoalCategory v) {
                c.getEventGoal().setGoalCategory(v);
            }
        });
    }
}

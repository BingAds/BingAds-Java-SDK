package com.microsoft.bingads.v13.api.test.entities.campaign_conversion_goal.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.campaign_conversion_goal.BulkCampaignConversionGoalTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignConversionGoal;

@RunWith(Parameterized.class)
public class BulkCampaignConversionGoalWriteToRowValuesActionTypeTest extends BulkCampaignConversionGoalTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        // In this example, the parameter generator returns a List of
        // arrays.  Each array has two elements: { datum, expected }.
        // These data are hard-coded into the class, but they could be
        // generated or loaded in any way you like.
        return Arrays.asList(new Object[][]{
            {"Add", "Add"},
            {"", ""},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Action Type", this.datum, this.propertyValue, new BiConsumer<BulkCampaignConversionGoal, String>() {
            @Override
            public void accept(BulkCampaignConversionGoal c, String v) {
                c.setActionType(v);
            }
        });
    }
}

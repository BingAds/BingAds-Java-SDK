package com.microsoft.bingads.v13.api.test.entities.campaign_conversion_goal.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.campaign_conversion_goal.BulkCampaignConversionGoalTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignConversionGoal;

public class BulkCampaignConversionGoalReadFromRowValuesSubTypeTest extends BulkCampaignConversionGoalTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Sub Type", "Sub Type"},
            {"", ""},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Sub Type", this.datum, this.expectedResult, new Function<BulkCampaignConversionGoal, String>() {
            @Override
            public String apply(BulkCampaignConversionGoal c) {
                return c.getSubType();
            }
        });
    }
}

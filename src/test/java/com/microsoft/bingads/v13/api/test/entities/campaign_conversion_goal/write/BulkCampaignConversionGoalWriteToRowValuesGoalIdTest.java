package com.microsoft.bingads.v13.api.test.entities.campaign_conversion_goal.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.campaign_conversion_goal.BulkCampaignConversionGoalTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignConversionGoal;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

public class BulkCampaignConversionGoalWriteToRowValuesGoalIdTest extends BulkCampaignConversionGoalTest {

    @Parameter(value = 1)
    public Long propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123", 123L},
            {"9223372036854775807", 9223372036854775807L},});
    }

    @Test
    public void testWrite() {
        this.<Long>testWriteProperty(StringTable.GoalId, this.datum, this.propertyValue, new BiConsumer<BulkCampaignConversionGoal, Long>() {
            @Override
            public void accept(BulkCampaignConversionGoal c, Long v) {
                c.getCampaignConversionGoal().setGoalId(v);
            }
        });
    }
}

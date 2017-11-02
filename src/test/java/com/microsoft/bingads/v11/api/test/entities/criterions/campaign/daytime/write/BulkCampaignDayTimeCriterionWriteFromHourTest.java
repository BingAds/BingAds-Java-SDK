package com.microsoft.bingads.v11.api.test.entities.criterions.campaign.daytime.write;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.criterions.campaign.daytime.BulkCampaignDayTimeCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignDayTimeCriterion;
import com.microsoft.bingads.v11.campaignmanagement.DayTimeCriterion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkCampaignDayTimeCriterionWriteFromHourTest extends BulkCampaignDayTimeCriterionTest {

    @Parameter(value = 1)
    public Integer propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"12", 12},
                        {"0", 0},
                        {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "From Hour",
                datum,
                propertyValue,
                new BiConsumer<BulkCampaignDayTimeCriterion, Integer>() {
                    @Override
                    public void accept(BulkCampaignDayTimeCriterion c, Integer v) {
                        ((DayTimeCriterion)c.getBiddableCampaignCriterion().getCriterion()).setFromHour(v);
                    }
                }
        );
    }
}

package com.microsoft.bingads.v13.api.test.entities.criterions.campaign.daytime.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.daytime.BulkCampaignDayTimeCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignDayTimeCriterion;
import com.microsoft.bingads.v13.campaignmanagement.DayTimeCriterion;

@RunWith(Parameterized.class)
public class BulkCampaignDayTimeCriterionWriteToHourTest extends BulkCampaignDayTimeCriterionTest {

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
                "To Hour",
                datum,
                propertyValue,
                new BiConsumer<BulkCampaignDayTimeCriterion, Integer>() {
                    @Override
                    public void accept(BulkCampaignDayTimeCriterion c, Integer v) {
                        ((DayTimeCriterion)c.getBiddableCampaignCriterion().getCriterion()).setToHour(v);
                    }
                }
        );
    }
}

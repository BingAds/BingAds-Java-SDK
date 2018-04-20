package com.microsoft.bingads.v11.api.test.entities.criterions.campaign.daytime.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.criterions.campaign.daytime.BulkCampaignDayTimeCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignDayTimeCriterion;
import com.microsoft.bingads.v11.campaignmanagement.Day;
import com.microsoft.bingads.v11.campaignmanagement.DayTimeCriterion;

@RunWith(Parameterized.class)
public class BulkCampaignDayTimeCriterionWriteTargetTest extends BulkCampaignDayTimeCriterionTest {

    @Parameterized.Parameter(value = 1)
    public Day propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"Saturday", Day.SATURDAY},
                        {"Thursday", Day.THURSDAY},
                        {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Target",
                datum,
                propertyValue,
                new BiConsumer<BulkCampaignDayTimeCriterion, Day>() {
                    @Override
                    public void accept(BulkCampaignDayTimeCriterion c, Day v) {
                        ((DayTimeCriterion)c.getBiddableCampaignCriterion().getCriterion()).setDay(v);
                    }
                }
        );
    }
}

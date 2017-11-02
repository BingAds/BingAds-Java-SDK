package com.microsoft.bingads.v11.api.test.entities.criterions.campaign.daytime.read;

import com.microsoft.bingads.v11.api.test.entities.criterions.campaign.daytime.BulkCampaignDayTimeCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignDayTimeCriterion;
import com.microsoft.bingads.v11.campaignmanagement.DayTimeCriterion;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkCampaignDayTimeCriterionReadToHourTest extends BulkCampaignDayTimeCriterionTest {

    @Parameter(value = 1)
    public Integer expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"12", 12},
                        {"0", 0},
                        {"", null},
                        {null, null}
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "To Hour",
                datum,
                expectedResult,
                new Function<BulkCampaignDayTimeCriterion, Integer>() {
                    @Override
                    public Integer apply(BulkCampaignDayTimeCriterion c) {
                        return ((DayTimeCriterion)c.getBiddableCampaignCriterion().getCriterion()).getToHour();
                    }
                }
        );
    }
}

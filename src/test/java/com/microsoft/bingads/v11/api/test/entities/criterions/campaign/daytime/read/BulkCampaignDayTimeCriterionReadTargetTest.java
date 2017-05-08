package com.microsoft.bingads.v11.api.test.entities.criterions.campaign.daytime.read;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.criterions.campaign.daytime.BulkCampaignDayTimeCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignDayTimeCriterion;
import com.microsoft.bingads.v11.campaignmanagement.Day;
import com.microsoft.bingads.v11.campaignmanagement.DayTimeCriterion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkCampaignDayTimeCriterionReadTargetTest extends BulkCampaignDayTimeCriterionTest {

    @Parameter(value = 1)
    public Day expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"Saturday", Day.SATURDAY},
                        {"Thursday", Day.THURSDAY},
                        {"", null},
                        {null, null}
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Target",
                datum,
                expectedResult,
                new Function<BulkCampaignDayTimeCriterion, Day>() {
                    @Override
                    public Day apply(BulkCampaignDayTimeCriterion c) {
                        return ((DayTimeCriterion)c.getCampaignCriterion().getCriterion()).getDay();
                    }
                }
        );
    }
}

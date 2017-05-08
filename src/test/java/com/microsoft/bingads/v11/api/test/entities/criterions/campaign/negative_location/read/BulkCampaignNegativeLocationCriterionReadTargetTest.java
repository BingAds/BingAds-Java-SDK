package com.microsoft.bingads.v11.api.test.entities.criterions.campaign.negative_location.read;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.criterions.campaign.negative_location.BulkCampaignNegativeLocationCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignNegativeLocationCriterion;
import com.microsoft.bingads.v11.campaignmanagement.LocationCriterion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkCampaignNegativeLocationCriterionReadTargetTest extends BulkCampaignNegativeLocationCriterionTest {

    @Parameter(value = 1)
    public Long expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"12", 12L},
                        {"23", 23L},
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
                new Function<BulkCampaignNegativeLocationCriterion, Long>() {
                    @Override
                    public Long apply(BulkCampaignNegativeLocationCriterion c) {
                        return ((LocationCriterion)c.getCampaignCriterion().getCriterion()).getLocationId();
                    }
                }
        );
    }
}

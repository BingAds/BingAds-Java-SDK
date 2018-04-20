package com.microsoft.bingads.v12.api.test.entities.criterions.campaign.location.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.location.BulkCampaignLocationCriterionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaignLocationCriterion;
import com.microsoft.bingads.v12.campaignmanagement.LocationCriterion;

@RunWith(Parameterized.class)
public class BulkCampaignLocationCriterionReadLoctionTypeTest extends BulkCampaignLocationCriterionTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"Test", "Test"},
                        {"", ""},
                        {null, null}
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Sub Type",
                datum,
                expectedResult,
                new Function<BulkCampaignLocationCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignLocationCriterion c) {
                        return ((LocationCriterion)c.getBiddableCampaignCriterion().getCriterion()).getLocationType();
                    }
                }
        );
    }
}

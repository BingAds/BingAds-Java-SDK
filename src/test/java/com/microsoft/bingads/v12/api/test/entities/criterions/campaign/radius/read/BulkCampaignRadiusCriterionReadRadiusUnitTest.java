package com.microsoft.bingads.v12.api.test.entities.criterions.campaign.radius.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.radius.BulkCampaignRadiusCriterionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaignRadiusCriterion;
import com.microsoft.bingads.v12.campaignmanagement.DistanceUnit;
import com.microsoft.bingads.v12.campaignmanagement.RadiusCriterion;

@RunWith(Parameterized.class)
public class BulkCampaignRadiusCriterionReadRadiusUnitTest extends BulkCampaignRadiusCriterionTest {

    @Parameter(value = 1)
    public DistanceUnit expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"Kilometers", DistanceUnit.KILOMETERS},
                        {"Miles", DistanceUnit.MILES},
                        {"", null},
                        {null, null}
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Unit",
                datum,
                expectedResult,
                new Function<BulkCampaignRadiusCriterion, DistanceUnit>() {
                    @Override
                    public DistanceUnit apply(BulkCampaignRadiusCriterion c) {
                        return ((RadiusCriterion)c.getBiddableCampaignCriterion().getCriterion()).getRadiusUnit();
                    }
                }
        );
    }
}

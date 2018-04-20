package com.microsoft.bingads.v11.api.test.entities.criterions.campaign.radius.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.criterions.campaign.radius.BulkCampaignRadiusCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignRadiusCriterion;
import com.microsoft.bingads.v11.campaignmanagement.RadiusCriterion;

@RunWith(Parameterized.class)
public class BulkCampaignRadiusCriterionReadRadiusTest extends BulkCampaignRadiusCriterionTest {

    @Parameter(value = 1)
    public Long expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"123", 123L},
                        {"", null},
                        {null, null}
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Radius",
                datum,
                expectedResult,
                new Function<BulkCampaignRadiusCriterion, Long>() {
                    @Override
                    public Long apply(BulkCampaignRadiusCriterion c) {
                        return ((RadiusCriterion)c.getBiddableCampaignCriterion().getCriterion()).getRadius();
                    }
                }
        );
    }
}

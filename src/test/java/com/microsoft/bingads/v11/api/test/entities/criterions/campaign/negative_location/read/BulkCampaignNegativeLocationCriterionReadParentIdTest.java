package com.microsoft.bingads.v11.api.test.entities.criterions.campaign.negative_location.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.criterions.campaign.negative_location.BulkCampaignNegativeLocationCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignNegativeLocationCriterion;

@RunWith(Parameterized.class)
public class BulkCampaignNegativeLocationCriterionReadParentIdTest extends BulkCampaignNegativeLocationCriterionTest {

    @Parameter(value = 1)
    public Long expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"123", 123L},
                        {"9223372036854775807", 9223372036854775807L},
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Parent Id",
                datum,
                expectedResult,
                new Function<BulkCampaignNegativeLocationCriterion, Long>() {
                    @Override
                    public Long apply(BulkCampaignNegativeLocationCriterion c) {
                        return c.getNegativeCampaignCriterion().getCampaignId();
                    }
                }
        );
    }
}

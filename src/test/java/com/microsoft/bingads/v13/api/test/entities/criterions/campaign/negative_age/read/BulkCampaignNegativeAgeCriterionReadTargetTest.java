package com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_age.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_age.BulkCampaignNegativeAgeCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignNegativeAgeCriterion;
import com.microsoft.bingads.v13.campaignmanagement.AgeCriterion;
import com.microsoft.bingads.v13.campaignmanagement.AgeRange;

@RunWith(Parameterized.class)
public class BulkCampaignNegativeAgeCriterionReadTargetTest extends BulkCampaignNegativeAgeCriterionTest {

    @Parameter(value = 1)
    public AgeRange expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"EighteenToTwentyFour", AgeRange.EIGHTEEN_TO_TWENTY_FOUR},
                        {"SixtyFiveAndAbove", AgeRange.SIXTY_FIVE_AND_ABOVE},
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
                new Function<BulkCampaignNegativeAgeCriterion, AgeRange>() {
                    @Override
                    public AgeRange apply(BulkCampaignNegativeAgeCriterion c) {
                        return ((AgeCriterion) c.getNegativeCampaignCriterion().getCriterion()).getAgeRange();
                    }
                }
        );
    }
}

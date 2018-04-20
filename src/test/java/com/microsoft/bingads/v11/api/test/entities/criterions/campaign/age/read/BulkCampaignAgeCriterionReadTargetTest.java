package com.microsoft.bingads.v11.api.test.entities.criterions.campaign.age.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.criterions.campaign.age.BulkCampaignAgeCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignAgeCriterion;
import com.microsoft.bingads.v11.campaignmanagement.AgeCriterion;
import com.microsoft.bingads.v11.campaignmanagement.AgeRange;

@RunWith(Parameterized.class)
public class BulkCampaignAgeCriterionReadTargetTest extends BulkCampaignAgeCriterionTest {

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
                new Function<BulkCampaignAgeCriterion, AgeRange>() {
                    @Override
                    public AgeRange apply(BulkCampaignAgeCriterion c) {
                        return ((AgeCriterion)c.getBiddableCampaignCriterion().getCriterion()).getAgeRange();
                    }
                }
        );
    }
}

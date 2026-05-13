package com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_age.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_age.BulkCampaignNegativeAgeCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignNegativeAgeCriterion;
import com.microsoft.bingads.v13.campaignmanagement.AgeCriterion;
import com.microsoft.bingads.v13.campaignmanagement.AgeRange;

@RunWith(Parameterized.class)
public class BulkCampaignNegativeAgeCriterionWriteTargetTest extends BulkCampaignNegativeAgeCriterionTest {

    @Parameter(value = 1)
    public AgeRange propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"EighteenToTwentyFour", AgeRange.EIGHTEEN_TO_TWENTY_FOUR},
                        {"SixtyFiveAndAbove", AgeRange.SIXTY_FIVE_AND_ABOVE},
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
                new BiConsumer<BulkCampaignNegativeAgeCriterion, AgeRange>() {
                    @Override
                    public void accept(BulkCampaignNegativeAgeCriterion c, AgeRange v) {
                        ((AgeCriterion) c.getNegativeCampaignCriterion().getCriterion()).setAgeRange(v);
                    }
                }
        );
    }
}

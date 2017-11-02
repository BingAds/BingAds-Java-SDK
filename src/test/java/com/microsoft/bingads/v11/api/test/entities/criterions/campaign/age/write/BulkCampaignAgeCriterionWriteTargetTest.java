package com.microsoft.bingads.v11.api.test.entities.criterions.campaign.age.write;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.criterions.campaign.age.BulkCampaignAgeCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignAgeCriterion;
import com.microsoft.bingads.v11.campaignmanagement.AgeRange;
import com.microsoft.bingads.v11.campaignmanagement.AgeCriterion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkCampaignAgeCriterionWriteTargetTest extends BulkCampaignAgeCriterionTest {

    @Parameterized.Parameter(value = 1)
    public AgeRange propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"EighteenToTwentyFour", AgeRange.EIGHTEEN_TO_TWENTY_FOUR},
                        {"FiftyToSixtyFour", AgeRange.FIFTY_TO_SIXTY_FOUR},
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
                new BiConsumer<BulkCampaignAgeCriterion, AgeRange>() {
                    @Override
                    public void accept(BulkCampaignAgeCriterion c, AgeRange v) {
                        ((AgeCriterion)c.getBiddableCampaignCriterion().getCriterion()).setAgeRange(v);
                    }
                }
        );
    }
}

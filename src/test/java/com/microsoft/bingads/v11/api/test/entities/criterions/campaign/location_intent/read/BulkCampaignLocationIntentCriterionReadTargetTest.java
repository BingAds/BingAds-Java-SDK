package com.microsoft.bingads.v11.api.test.entities.criterions.campaign.location_intent.read;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.criterions.campaign.location_intent.BulkCampaignLocationIntentCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignLocationIntentCriterion;
import com.microsoft.bingads.v11.campaignmanagement.IntentOption;
import com.microsoft.bingads.v11.campaignmanagement.LocationIntentCriterion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkCampaignLocationIntentCriterionReadTargetTest extends BulkCampaignLocationIntentCriterionTest {

    @Parameter(value = 1)
    public IntentOption expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"PeopleIn", IntentOption.PEOPLE_IN},
                        {"PeopleInOrSearchingForOrViewingPages", IntentOption.PEOPLE_IN_OR_SEARCHING_FOR_OR_VIEWING_PAGES},
                        {"PeopleSearchingForOrViewingPages", IntentOption.PEOPLE_SEARCHING_FOR_OR_VIEWING_PAGES}
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Target",
                datum,
                expectedResult,
                new Function<BulkCampaignLocationIntentCriterion, IntentOption>() {
                    @Override
                    public IntentOption apply(BulkCampaignLocationIntentCriterion c) {
                        return ((LocationIntentCriterion)c.getBiddableCampaignCriterion().getCriterion()).getIntentOption();
                    }
                }
        );
    }
}

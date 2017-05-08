package com.microsoft.bingads.v11.api.test.entities.criterions.campaign.location_intent.write;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.criterions.campaign.location_intent.BulkCampaignLocationIntentCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignLocationIntentCriterion;
import com.microsoft.bingads.v11.campaignmanagement.IntentOption;
import com.microsoft.bingads.v11.campaignmanagement.LocationIntentCriterion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkCampaignLocationIntentCriterionWriteTargetTest extends BulkCampaignLocationIntentCriterionTest {

    @Parameterized.Parameter(value = 1)
    public IntentOption propertyValue;

    @Parameterized.Parameters
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
    public void testWrite() {
        testWriteProperty(
                "Target",
                datum,
                propertyValue,
                new BiConsumer<BulkCampaignLocationIntentCriterion, IntentOption>() {
                    @Override
                    public void accept(BulkCampaignLocationIntentCriterion c, IntentOption v) {
                        ((LocationIntentCriterion)c.getCampaignCriterion().getCriterion()).setIntentOption(v);
                    }
                }
        );
    }
}

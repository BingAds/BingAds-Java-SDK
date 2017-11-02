package com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.location_intent.write;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.location_intent.BulkAdGroupLocationIntentCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupLocationIntentCriterion;
import com.microsoft.bingads.v11.campaignmanagement.IntentOption;
import com.microsoft.bingads.v11.campaignmanagement.LocationIntentCriterion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkAdGroupLocationIntentCriterionWriteTargetTest extends BulkAdGroupLocationIntentCriterionTest {

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
                new BiConsumer<BulkAdGroupLocationIntentCriterion, IntentOption>() {
                    @Override
                    public void accept(BulkAdGroupLocationIntentCriterion c, IntentOption v) {
                        ((LocationIntentCriterion)c.getBiddableAdGroupCriterion().getCriterion()).setIntentOption(v);
                    }
                }
        );
    }
}

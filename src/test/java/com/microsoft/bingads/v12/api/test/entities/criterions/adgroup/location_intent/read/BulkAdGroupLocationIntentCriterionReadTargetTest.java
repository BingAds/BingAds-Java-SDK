package com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.location_intent.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.location_intent.BulkAdGroupLocationIntentCriterionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkAdGroupLocationIntentCriterion;
import com.microsoft.bingads.v12.campaignmanagement.IntentOption;
import com.microsoft.bingads.v12.campaignmanagement.LocationIntentCriterion;

@RunWith(Parameterized.class)
public class BulkAdGroupLocationIntentCriterionReadTargetTest extends BulkAdGroupLocationIntentCriterionTest {

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
                new Function<BulkAdGroupLocationIntentCriterion, IntentOption>() {
                    @Override
                    public IntentOption apply(BulkAdGroupLocationIntentCriterion c) {
                        return ((LocationIntentCriterion)c.getBiddableAdGroupCriterion().getCriterion()).getIntentOption();
                    }
                }
        );
    }
}

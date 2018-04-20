package com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.location_intent.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.location_intent.BulkAdGroupLocationIntentCriterionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkAdGroupLocationIntentCriterion;
import com.microsoft.bingads.v12.campaignmanagement.AdGroupCriterionStatus;

@RunWith(Parameterized.class)
public class BulkAdGroupLocationIntentCriterionWriteStatusTest extends BulkAdGroupLocationIntentCriterionTest {

    @Parameter(value = 1)
    public AdGroupCriterionStatus propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"Active", AdGroupCriterionStatus.ACTIVE},
                        {"Deleted", AdGroupCriterionStatus.DELETED},
                        {"Paused", AdGroupCriterionStatus.PAUSED},
                        {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Status",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupLocationIntentCriterion, AdGroupCriterionStatus>() {
                    @Override
                    public void accept(BulkAdGroupLocationIntentCriterion c, AdGroupCriterionStatus v) {
                        c.getBiddableAdGroupCriterion().setStatus(v);
                    }
                }
        );
    }
}

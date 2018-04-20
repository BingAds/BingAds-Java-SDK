package com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.negative_location.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.negative_location.BulkAdGroupNegativeLocationCriterionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkAdGroupNegativeLocationCriterion;
import com.microsoft.bingads.v12.campaignmanagement.AdGroupCriterionStatus;

@RunWith(Parameterized.class)
public class BulkAdGroupNegativeLocationCriterionWriteStatusTest extends BulkAdGroupNegativeLocationCriterionTest {

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
                new BiConsumer<BulkAdGroupNegativeLocationCriterion, AdGroupCriterionStatus>() {
                    @Override
                    public void accept(BulkAdGroupNegativeLocationCriterion c, AdGroupCriterionStatus v) {
                        c.getNegativeAdGroupCriterion().setStatus(v);
                    }
                }
        );
    }
}

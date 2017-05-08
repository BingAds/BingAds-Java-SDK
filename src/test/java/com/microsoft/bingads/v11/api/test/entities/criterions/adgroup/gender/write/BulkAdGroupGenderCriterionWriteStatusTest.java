package com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.gender.write;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.gender.BulkAdGroupGenderCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupGenderCriterion;
import com.microsoft.bingads.v11.campaignmanagement.AdGroupCriterionStatus;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkAdGroupGenderCriterionWriteStatusTest extends BulkAdGroupGenderCriterionTest {

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
                new BiConsumer<BulkAdGroupGenderCriterion, AdGroupCriterionStatus>() {
                    @Override
                    public void accept(BulkAdGroupGenderCriterion c, AdGroupCriterionStatus v) {
                        c.getAdGroupCriterion().setStatus(v);
                    }
                }
        );
    }
}

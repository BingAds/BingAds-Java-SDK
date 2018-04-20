package com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.age.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.age.BulkAdGroupAgeCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupAgeCriterion;
import com.microsoft.bingads.v11.campaignmanagement.AdGroupCriterionStatus;

@RunWith(Parameterized.class)
public class BulkAdGroupAgeCriterionWriteStatusTest extends BulkAdGroupAgeCriterionTest {

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
                new BiConsumer<BulkAdGroupAgeCriterion, AdGroupCriterionStatus>() {
                    @Override
                    public void accept(BulkAdGroupAgeCriterion c, AdGroupCriterionStatus v) {
                        c.getBiddableAdGroupCriterion().setStatus(v);
                    }
                }
        );
    }
}

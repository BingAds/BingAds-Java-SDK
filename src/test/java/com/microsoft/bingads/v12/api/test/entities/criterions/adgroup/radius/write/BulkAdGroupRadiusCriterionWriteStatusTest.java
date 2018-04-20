package com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.radius.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.radius.BulkAdGroupRadiusCriterionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkAdGroupRadiusCriterion;
import com.microsoft.bingads.v12.campaignmanagement.AdGroupCriterionStatus;

@RunWith(Parameterized.class)
public class BulkAdGroupRadiusCriterionWriteStatusTest extends BulkAdGroupRadiusCriterionTest {

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
                new BiConsumer<BulkAdGroupRadiusCriterion, AdGroupCriterionStatus>() {
                    @Override
                    public void accept(BulkAdGroupRadiusCriterion c, AdGroupCriterionStatus v) {
                        c.getBiddableAdGroupCriterion().setStatus(v);
                    }
                }
        );
    }
}

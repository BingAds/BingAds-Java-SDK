package com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.daytime.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.daytime.BulkAdGroupDayTimeCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupDayTimeCriterion;
import com.microsoft.bingads.v11.campaignmanagement.AdGroupCriterionStatus;

@RunWith(Parameterized.class)
public class BulkAdGroupDayTimeCriterionWriteStatusTest extends BulkAdGroupDayTimeCriterionTest {

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
                new BiConsumer<BulkAdGroupDayTimeCriterion, AdGroupCriterionStatus>() {
                    @Override
                    public void accept(BulkAdGroupDayTimeCriterion c, AdGroupCriterionStatus v) {
                        c.getBiddableAdGroupCriterion().setStatus(v);
                    }
                }
        );
    }
}

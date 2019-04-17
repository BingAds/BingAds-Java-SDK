package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.daytime.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.daytime.BulkAdGroupDayTimeCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupDayTimeCriterion;
import com.microsoft.bingads.v13.campaignmanagement.Day;
import com.microsoft.bingads.v13.campaignmanagement.DayTimeCriterion;

@RunWith(Parameterized.class)
public class BulkAdGroupDayTimeCriterionWriteTargetTest extends BulkAdGroupDayTimeCriterionTest {

    @Parameterized.Parameter(value = 1)
    public Day propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"Saturday", Day.SATURDAY},
                        {"Thursday", Day.THURSDAY},
                        {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Target",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupDayTimeCriterion, Day>() {
                    @Override
                    public void accept(BulkAdGroupDayTimeCriterion c, Day v) {
                        ((DayTimeCriterion)c.getBiddableAdGroupCriterion().getCriterion()).setDay(v);
                    }
                }
        );
    }
}

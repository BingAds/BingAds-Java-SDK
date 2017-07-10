package com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.daytime.write;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.daytime.BulkAdGroupDayTimeCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupDayTimeCriterion;
import com.microsoft.bingads.v11.campaignmanagement.DayTimeCriterion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkAdGroupDayTimeCriterionWriteToHourTest extends BulkAdGroupDayTimeCriterionTest {

    @Parameter(value = 1)
    public Integer propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"12", 12},
                        {"0", 0},
                        {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "To Hour",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupDayTimeCriterion, Integer>() {
                    @Override
                    public void accept(BulkAdGroupDayTimeCriterion c, Integer v) {
                        ((DayTimeCriterion)c.getBiddableAdGroupCriterion().getCriterion()).setToHour(v);
                    }
                }
        );
    }
}

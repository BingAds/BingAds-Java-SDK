package com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.daytime.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.daytime.BulkAdGroupDayTimeCriterionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkAdGroupDayTimeCriterion;
import com.microsoft.bingads.v12.campaignmanagement.DayTimeCriterion;

@RunWith(Parameterized.class)
public class BulkAdGroupDayTimeCriterionReadToHourTest extends BulkAdGroupDayTimeCriterionTest {

    @Parameter(value = 1)
    public Integer expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"12", 12},
                        {"0", 0},
                        {"", null},
                        {null, null}
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "To Hour",
                datum,
                expectedResult,
                new Function<BulkAdGroupDayTimeCriterion, Integer>() {
                    @Override
                    public Integer apply(BulkAdGroupDayTimeCriterion c) {
                        return ((DayTimeCriterion)c.getBiddableAdGroupCriterion().getCriterion()).getToHour();
                    }
                }
        );
    }
}

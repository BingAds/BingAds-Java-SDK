package com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.daytime.read;

import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.daytime.BulkAdGroupDayTimeCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupDayTimeCriterion;
import com.microsoft.bingads.v11.campaignmanagement.DayTimeCriterion;
import com.microsoft.bingads.v11.campaignmanagement.Minute;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkAdGroupDayTimeCriterionReadFromMinuteTest extends BulkAdGroupDayTimeCriterionTest {

    @Parameter(value = 1)
    public Minute expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                	{"0", Minute.ZERO},
                    {"15", Minute.FIFTEEN},
                    {"30", Minute.THIRTY},
                    {"45", Minute.FORTY_FIVE}
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "From Minute",
                datum,
                expectedResult,
                new Function<BulkAdGroupDayTimeCriterion, Minute>() {
                    @Override
                    public Minute apply(BulkAdGroupDayTimeCriterion c) {
                        return ((DayTimeCriterion)c.getAdGroupCriterion().getCriterion()).getFromMinute();
                    }
                }
        );
    }
}

package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.device.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.device.BulkAdGroupDeviceCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupDeviceCriterion;
import com.microsoft.bingads.v13.campaignmanagement.CashbackAdjustment;
import com.microsoft.bingads.v13.campaignmanagement.BiddableAdGroupCriterion;

@RunWith(Parameterized.class)
public class BulkAdGroupDeviceCriterionReadCashbackAdjustmentTest extends BulkAdGroupDeviceCriterionTest {

    @Parameter(value = 1)
    public Double expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"0.58", 0.58},
                        {"0.0", 0.0},
                        {"", null},
                        {null, null}
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Cashback Percent",
                datum,
                expectedResult,
                new Function<BulkAdGroupDeviceCriterion, Double>() {
                    @Override
                    public Double apply(BulkAdGroupDeviceCriterion c) {
                        return ((CashbackAdjustment) ((BiddableAdGroupCriterion) c.getBiddableAdGroupCriterion()).getCriterionCashback()).getCashbackPercent();
                    }
                }
        );
    }
}

package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.daytime.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.daytime.BulkAdGroupDayTimeCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupDayTimeCriterion;
import com.microsoft.bingads.v13.campaignmanagement.DayTimeCriterion;
import com.microsoft.bingads.v13.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v13.campaignmanagement.CashbackAdjustment;

public class BulkAdGroupDayTimeCriterionWriteCashbackAdjustmentTest extends BulkAdGroupDayTimeCriterionTest {
    @Parameterized.Parameter(value = 1)
    public Double propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"12.34", 12.34},
                        {"0.0", 0.0},
                        {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Cashback Percent",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupDayTimeCriterion, Double>() {
                    @Override
                    public void accept(BulkAdGroupDayTimeCriterion c, Double v) {
                        DayTimeCriterion criterion = new DayTimeCriterion();

                        BiddableAdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();

                        adGroupCriterion.setCriterion(criterion);

                        c.setBiddableAdGroupCriterion(adGroupCriterion);

                        CashbackAdjustment cashback = new CashbackAdjustment();

                        cashback.setCashbackPercent(v);

                        adGroupCriterion.setCriterionCashback(cashback);
                    }
                }
        );
    }

}

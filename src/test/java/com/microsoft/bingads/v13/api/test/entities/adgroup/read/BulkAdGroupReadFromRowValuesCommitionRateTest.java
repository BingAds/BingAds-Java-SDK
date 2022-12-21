package com.microsoft.bingads.v13.api.test.entities.adgroup.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.RateBidComparer;
import com.microsoft.bingads.v13.api.test.entities.adgroup.BulkAdGroupTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroup;
import com.microsoft.bingads.v13.campaignmanagement.RateAmount;
import com.microsoft.bingads.v13.campaignmanagement.RateBid;

@RunWith(Parameterized.class)
public class BulkAdGroupReadFromRowValuesCommitionRateTest extends BulkAdGroupTest {

    @Parameter
    public String datum;

    @Parameter(value = 1)
    public RateBid expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        RateBid withValue = new RateBid();
        RateAmount rateAmount = new RateAmount();
        rateAmount.setAmount(12.34);
        withValue.setRateAmount(rateAmount);

        RateBid zeroValue = new RateBid();
        RateAmount rateAmountZero = new RateAmount();
        rateAmountZero.setAmount(0.0);
        zeroValue.setRateAmount(rateAmountZero);

        return Arrays.asList(new Object[][]{
            {"12.34", withValue},
            {"0.0", zeroValue},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<RateBid>testReadProperty("Commission Rate", this.datum, this.expectedResult, new Function<BulkAdGroup, RateBid>() {
            @Override
            public RateBid apply(BulkAdGroup c) {
                return c.getAdGroup().getCommissionRate();
            }
        }, new RateBidComparer());
    }
}

package com.microsoft.bingads.v13.api.test.entities.adgroup.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.adgroup.BulkAdGroupTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroup;
import com.microsoft.bingads.v13.campaignmanagement.RateAmount;
import com.microsoft.bingads.v13.campaignmanagement.RateBid;

@RunWith(Parameterized.class)
public class BulkAdGroupWriteToRowValuesPercentCpcBidTest extends BulkAdGroupTest {

    @Parameter(value = 1)
    public RateBid propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        RateBid withValue = new RateBid();
        RateAmount amount = new RateAmount();
        amount.setAmount(12.34);
        withValue.setRateAmount(amount);

        RateBid zeroValue = new RateBid();
        RateAmount zeroAmount = new RateAmount();
        zeroAmount.setAmount(0.0);
        zeroValue.setRateAmount(zeroAmount);

        return Arrays.asList(new Object[][]{
            {"12.34", withValue},
            {"0.0", zeroValue},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<RateBid>testWriteProperty("Percent Cpc Bid", this.datum, this.propertyValue, new BiConsumer<BulkAdGroup, RateBid>() {
            @Override
            public void accept(BulkAdGroup c, RateBid v) {
                c.getAdGroup().setPercentCpcBid(v);
            }
        });
    }
}

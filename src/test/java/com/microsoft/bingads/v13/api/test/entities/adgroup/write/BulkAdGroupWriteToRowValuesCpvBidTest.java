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
import com.microsoft.bingads.v13.campaignmanagement.Bid;

@RunWith(Parameterized.class)
public class BulkAdGroupWriteToRowValuesCpvBidTest extends BulkAdGroupTest {

    @Parameter(value = 1)
    public Bid propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        Bid withValue = new Bid();
        withValue.setAmount(12.34);

        Bid zeroValue = new Bid();
        zeroValue.setAmount(0.0);

        return Arrays.asList(new Object[][]{
            {"12.34", withValue},
            {"delete_value", zeroValue},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<Bid>testWriteProperty("Cpv Bid", this.datum, this.propertyValue, new BiConsumer<BulkAdGroup, Bid>() {
            @Override
            public void accept(BulkAdGroup c, Bid v) {
                c.getAdGroup().setCpvBid(v);
            }
        });
    }
}

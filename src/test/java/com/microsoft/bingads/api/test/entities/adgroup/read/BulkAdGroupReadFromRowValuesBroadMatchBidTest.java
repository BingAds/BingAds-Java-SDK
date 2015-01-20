package com.microsoft.bingads.api.test.entities.adgroup.read;

import com.microsoft.bingads.api.test.entities.BidComparer;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.Function;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.adgroup.BulkAdGroupTest;
import com.microsoft.bingads.bulk.entities.BulkAdGroup;
import com.microsoft.bingads.campaignmanagement.Bid;

@RunWith(Parameterized.class)
public class BulkAdGroupReadFromRowValuesBroadMatchBidTest extends BulkAdGroupTest {

    @Parameter
    public String datum;

    @Parameter(value = 1)
    public Bid expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        Bid withValue = new Bid();
        withValue.setAmount(12.34);

        Bid zeroValue = new Bid();
        zeroValue.setAmount(0.0);

        return Arrays.asList(new Object[][]{
            {"12.34", withValue},
            {"delete_value", zeroValue},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<Bid>testReadProperty("Search Broad Bid", this.datum, this.expectedResult, new Function<BulkAdGroup, Bid>() {
            @Override
            public Bid apply(BulkAdGroup c) {
                return c.getAdGroup().getBroadMatchBid();
            }
        }, new BidComparer());
    }
}

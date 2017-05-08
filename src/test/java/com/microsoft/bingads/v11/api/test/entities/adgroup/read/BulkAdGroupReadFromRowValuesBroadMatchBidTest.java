package com.microsoft.bingads.v11.api.test.entities.adgroup.read;

import com.microsoft.bingads.v11.api.test.entities.BidComparer;
import com.microsoft.bingads.v11.api.test.entities.adgroup.BulkAdGroupTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroup;
import com.microsoft.bingads.v11.campaignmanagement.Bid;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

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
        this.<Bid>testReadProperty("Search Bid", this.datum, this.expectedResult, new Function<BulkAdGroup, Bid>() {
            @Override
            public Bid apply(BulkAdGroup c) {
                return c.getAdGroup().getSearchBid();
            }
        }, new BidComparer());
    }
}

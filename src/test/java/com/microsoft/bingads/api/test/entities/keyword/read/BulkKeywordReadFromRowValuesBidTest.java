package com.microsoft.bingads.api.test.entities.keyword.read;

import com.microsoft.bingads.api.test.entities.BidComparer;
import com.microsoft.bingads.api.test.entities.keyword.BulkKeywordTest;
import com.microsoft.bingads.bulk.entities.BulkKeyword;
import com.microsoft.bingads.campaignmanagement.Bid;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkKeywordReadFromRowValuesBidTest extends BulkKeywordTest {

    @Parameter(value = 1)
    public Bid expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        Bid bid = new Bid();
        bid.setAmount(12.34);
        return Arrays.asList(new Object[][]{
            {"12.34", bid},
            {"", null},});
    }

    @Test
    public void testRead() {
        this.<Bid>testReadProperty("Bid", this.datum, this.expectedResult, new Function<BulkKeyword, Bid>() {
            @Override
            public Bid apply(BulkKeyword c) {
                return c.getKeyword().getBid();
            }
        }, new BidComparer());
    }
}

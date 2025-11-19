package com.microsoft.bingads.v13.api.test.entities.bidstrategy.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.bidstrategy.BulkBidStrategyTest;
import com.microsoft.bingads.v13.bulk.entities.BulkBidStrategy;

public class BulkBidStrategyReadFromRowValuesCurrencyCodeTest extends BulkBidStrategyTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"CNY", "CNY"},
            {"", ""},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Currency Code", this.datum, this.expectedResult, new Function<BulkBidStrategy, String>() {
            @Override
            public String apply(BulkBidStrategy c) {
                return c.getBidStrategy().getCurrencyCode();
            }
        });
    }
}

package com.microsoft.bingads.v13.api.test.entities.bidstrategy.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.bidstrategy.BulkBidStrategyTest;
import com.microsoft.bingads.v13.bulk.entities.BulkBidStrategy;

public class BulkBidStrategyWriteToRowValuesCurrencyCodeTest extends BulkBidStrategyTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"CNY", "CNY"},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Currency Code", this.datum, this.propertyValue, new BiConsumer<BulkBidStrategy, String>() {
            @Override
            public void accept(BulkBidStrategy c, String v) {
                c.getBidStrategy().setCurrencyCode(v);;
            }
        });
    }
}

package com.microsoft.bingads.v13.api.test.entities.bidstrategy.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.bidstrategy.BulkBidStrategyTest;
import com.microsoft.bingads.v13.bulk.entities.BulkBidStrategy;

public class BulkBidStrategyWriteToRowValuesBidStrategyNameTest extends BulkBidStrategyTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test Budget 1", "Test Budget 1"},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Bid Strategy Name", this.datum, this.propertyValue, new BiConsumer<BulkBidStrategy, String>() {
            @Override
            public void accept(BulkBidStrategy c, String v) {
                c.getBidStrategy().setName(v);;
            }
        });
    }
}

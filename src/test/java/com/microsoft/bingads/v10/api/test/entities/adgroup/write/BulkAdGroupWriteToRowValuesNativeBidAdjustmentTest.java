package com.microsoft.bingads.v10.api.test.entities.adgroup.write;

import com.microsoft.bingads.v10.api.test.entities.adgroup.BulkAdGroupTest;
import com.microsoft.bingads.v10.bulk.entities.BulkAdGroup;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkAdGroupWriteToRowValuesNativeBidAdjustmentTest extends BulkAdGroupTest {

    @Parameterized.Parameter(value = 1)
    public Integer propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"1", 1},
                {"2147483647", Integer.MAX_VALUE},
                {"0", 0},
                {"-1", -1},
                {"-2147483648", Integer.MIN_VALUE},
                {null, null}
        });
    }

    @Test
    public void testWrite() {
        testWriteProperty("Bid Adjustment", this.datum, this.propertyValue, new BiConsumer<BulkAdGroup, Integer>() {
            @Override
            public void accept(BulkAdGroup c, Integer v) {
                c.getAdGroup().setNativeBidAdjustment(v);
            }
        });
    }
}

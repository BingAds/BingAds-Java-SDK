package com.microsoft.bingads.v13.api.test.entities.online_conversion_adjustment.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.online_conversion_adjustment.BulkOnlineConversionAdjustmentTest;
import com.microsoft.bingads.v13.bulk.entities.BulkOnlineConversionAdjustment;

@RunWith(Parameterized.class)
public class BulkOnlineConversionAdjustmentWriteToRowValueAdjustmentTypeTest extends BulkOnlineConversionAdjustmentTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Adjustment Type", "Adjustment Type"},
                {"", ""},
                {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testWriteProperty("Adjustment Type", this.datum, this.expectedResult, new BiConsumer<BulkOnlineConversionAdjustment, String>() {
            @Override
            public void accept(BulkOnlineConversionAdjustment c, String v) {
                c.getOnlineConversionAdjustment().setAdjustmentType(v);
            }
        });
    }
}

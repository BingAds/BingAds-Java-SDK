package com.microsoft.bingads.v13.api.test.entities.online_conversion_adjustment.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.online_conversion_adjustment.BulkOnlineConversionAdjustmentTest;
import com.microsoft.bingads.v13.bulk.entities.BulkOnlineConversionAdjustment;

@RunWith(Parameterized.class)
public class BulkOnlineConversionAdjustmentReadFromRowValueConversionCurrencyCodeTest extends BulkOnlineConversionAdjustmentTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Adjustment Currency Code", "Adjustment Currency Code"},
                {"", ""},
                {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Conversion Currency Code", this.datum, this.expectedResult, new Function<BulkOnlineConversionAdjustment, String>() {
            @Override
            public String apply(BulkOnlineConversionAdjustment c) {
                return c.getOnlineConversionAdjustment().getAdjustmentCurrencyCode();
            }
        });
    }
}

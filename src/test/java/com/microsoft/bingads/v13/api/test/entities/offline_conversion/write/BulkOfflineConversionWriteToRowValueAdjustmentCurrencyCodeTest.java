package com.microsoft.bingads.v13.api.test.entities.offline_conversion.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.offline_conversion.BulkOfflineConversionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkOfflineConversion;

@RunWith(Parameterized.class)
public class BulkOfflineConversionWriteToRowValueAdjustmentCurrencyCodeTest extends BulkOfflineConversionTest {

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
        this.<String>testWriteProperty("Adjustment Currency Code", this.datum, this.expectedResult, new BiConsumer<BulkOfflineConversion, String>() {
            @Override
            public void accept(BulkOfflineConversion c, String v) {
                c.setAdjustmentCurrencyCode(v);
            }
        });
    }
}

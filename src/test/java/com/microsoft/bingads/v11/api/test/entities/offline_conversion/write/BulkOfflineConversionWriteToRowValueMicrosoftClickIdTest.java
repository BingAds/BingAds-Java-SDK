package com.microsoft.bingads.v11.api.test.entities.offline_conversion.write;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.offline_conversion.BulkOfflineConversionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkOfflineConversion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkOfflineConversionWriteToRowValueMicrosoftClickIdTest extends BulkOfflineConversionTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"123", "123"},
                {"asd", "asd"},
                {"", ""},
                {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testWriteProperty("Microsoft Click Id", this.datum, this.expectedResult, new BiConsumer<BulkOfflineConversion, String>() {
            @Override
            public void accept(BulkOfflineConversion c, String v) {
                c.getOfflineConversion().setMicrosoftClickId(v);
            }
        });
    }
}

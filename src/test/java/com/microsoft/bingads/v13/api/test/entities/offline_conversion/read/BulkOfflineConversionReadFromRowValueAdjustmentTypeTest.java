package com.microsoft.bingads.v13.api.test.entities.offline_conversion.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.offline_conversion.BulkOfflineConversionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkOfflineConversion;

@RunWith(Parameterized.class)
public class BulkOfflineConversionReadFromRowValueAdjustmentTypeTest extends BulkOfflineConversionTest {

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
        this.<String>testReadProperty("Adjustment Type", this.datum, this.expectedResult, new Function<BulkOfflineConversion, String>() {
            @Override
            public String apply(BulkOfflineConversion c) {
                return c.getAdjustmentType();
            }
        });
    }
}

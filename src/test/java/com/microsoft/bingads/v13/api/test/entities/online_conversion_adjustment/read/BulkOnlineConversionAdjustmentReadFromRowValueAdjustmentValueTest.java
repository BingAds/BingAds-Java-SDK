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
public class BulkOnlineConversionAdjustmentReadFromRowValueAdjustmentValueTest extends BulkOnlineConversionAdjustmentTest {

    @Parameter(value = 1)
    public Double expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"123.123", 123.123},
                {"9223.372036", 9223.372036},
                {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<Double>testReadProperty("Adjustment Value", this.datum, this.expectedResult, new Function<BulkOnlineConversionAdjustment, Double>() {
            @Override
            public Double apply(BulkOnlineConversionAdjustment c) {
                return c.getOnlineConversionAdjustment().getAdjustmentValue();
            }
        });
    }
}

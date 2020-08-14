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
public class BulkOfflineConversionReadFromRowValueExternalAttributionCreditTest extends BulkOfflineConversionTest {

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
        this.<Double>testReadProperty("External Attribution Credit", this.datum, this.expectedResult, new Function<BulkOfflineConversion, Double>() {
            @Override
            public Double apply(BulkOfflineConversion c) {
                return c.getExternalAttributionCredit();
            }
        });
    }
}

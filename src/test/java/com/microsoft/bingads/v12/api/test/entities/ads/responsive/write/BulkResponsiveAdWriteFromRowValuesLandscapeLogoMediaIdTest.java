package com.microsoft.bingads.v12.api.test.entities.ads.responsive.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.ads.responsive.BulkResponsiveAdTest;
import com.microsoft.bingads.v12.bulk.entities.BulkResponsiveAd;

public class BulkResponsiveAdWriteFromRowValuesLandscapeLogoMediaIdTest extends BulkResponsiveAdTest {

    @Parameterized.Parameter(value = 1)
    public Long expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"123", 123L},
                {"9223372036854775807", Long.MAX_VALUE},
                {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.testWriteProperty("Landscape Logo Media Id", this.datum, this.expectedResult, new BiConsumer<BulkResponsiveAd, Long>() {
            @Override
            public void accept(BulkResponsiveAd c, Long v) {
                c.getResponsiveAd().setLandscapeLogoMediaId(v);
            }
        });
    }
}

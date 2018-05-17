package com.microsoft.bingads.v11.api.test.entities.ads.responsive.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.ads.responsive.BulkResponsiveAdTest;
import com.microsoft.bingads.v11.bulk.entities.BulkResponsiveAd;

public class BulkResponsiveAdReadFromRowValuesLandscapeLogoMediaIdTest extends BulkResponsiveAdTest {

    @Parameter(value = 1)
    public Long expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"123", 123L},
                {null, null}
        });
    }

    @Test
    public void testRead() {
        this.testReadProperty("Landscape Logo Media Id", this.datum, this.expectedResult, new Function<BulkResponsiveAd, Long>() {
            @Override
            public Long apply(BulkResponsiveAd c) {
                return c.getResponsiveAd().getLandscapeLogoMediaId();
            }
        });
    }
}

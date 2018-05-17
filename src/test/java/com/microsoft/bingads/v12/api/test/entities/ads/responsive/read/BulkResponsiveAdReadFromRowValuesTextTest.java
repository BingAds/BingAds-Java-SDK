package com.microsoft.bingads.v12.api.test.entities.ads.responsive.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.ads.responsive.BulkResponsiveAdTest;
import com.microsoft.bingads.v12.bulk.entities.BulkResponsiveAd;

public class BulkResponsiveAdReadFromRowValuesTextTest extends BulkResponsiveAdTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Text string", "Text string"},
                {null, null}
        });
    }

    @Test
    public void testRead() {
        this.testReadProperty("Text", this.datum, this.expectedResult, new Function<BulkResponsiveAd, String>() {
            @Override
            public String apply(BulkResponsiveAd c) {
                return c.getResponsiveAd().getText();
            }
        });
    }
}

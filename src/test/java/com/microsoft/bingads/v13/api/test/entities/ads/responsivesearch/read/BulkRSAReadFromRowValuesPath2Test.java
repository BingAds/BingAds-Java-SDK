package com.microsoft.bingads.v13.api.test.entities.ads.responsivesearch.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ads.responsivesearch.BulkResponsiveSearchAdTest;
import com.microsoft.bingads.v13.bulk.entities.BulkResponsiveSearchAd;

public class BulkRSAReadFromRowValuesPath2Test extends BulkResponsiveSearchAdTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Path 2 string", "Path 2 string"},
                {null, null}
        });
    }

    @Test
    public void testRead() {
        this.testReadProperty("Path 2", this.datum, this.expectedResult, new Function<BulkResponsiveSearchAd, String>() {
            @Override
            public String apply(BulkResponsiveSearchAd c) {
                return c.getResponsiveSearchAd().getPath2();
            }
        });
    }
}

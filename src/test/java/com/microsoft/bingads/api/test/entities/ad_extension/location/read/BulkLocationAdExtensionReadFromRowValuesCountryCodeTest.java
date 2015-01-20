package com.microsoft.bingads.api.test.entities.ad_extension.location.read;

import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.Function;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.ad_extension.location.BulkLocationAdExtensionTest;
import com.microsoft.bingads.bulk.entities.BulkLocationAdExtension;

public class BulkLocationAdExtensionReadFromRowValuesCountryCodeTest extends BulkLocationAdExtensionTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test text", "Test text"}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("COUNTRY_CODE", this.datum, this.expectedResult, new Function<BulkLocationAdExtension, String>() {
            @Override
            public String apply(BulkLocationAdExtension c) {
                return c.getLocationAdExtension().getAddress().getCountryCode();
            }
        });
    }
}

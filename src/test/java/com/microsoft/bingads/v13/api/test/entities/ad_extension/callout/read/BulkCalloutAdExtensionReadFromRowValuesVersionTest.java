package com.microsoft.bingads.v13.api.test.entities.ad_extension.callout.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.callout.BulkCalloutAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCalloutAdExtension;

@RunWith(Parameterized.class)
public class BulkCalloutAdExtensionReadFromRowValuesVersionTest extends BulkCalloutAdExtensionTest {

    @Parameter(value = 1)
    public Integer expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"123", 123},
                {"2147483647", 2147483647},
                {"", null},
                {null, null}
        });
    }

    @Test
    public void testRead() {
        this.testReadProperty("Version", this.datum, this.expectedResult, new Function<BulkCalloutAdExtension, Integer>() {
            @Override
            public Integer apply(BulkCalloutAdExtension c) {
                return c.getCalloutAdExtension().getVersion();
            }
        });
    }
}

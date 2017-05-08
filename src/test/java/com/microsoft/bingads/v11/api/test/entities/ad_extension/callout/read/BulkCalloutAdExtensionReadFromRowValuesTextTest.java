package com.microsoft.bingads.v11.api.test.entities.ad_extension.callout.read;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.ad_extension.callout.BulkCalloutAdExtensionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCalloutAdExtension;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

public class BulkCalloutAdExtensionReadFromRowValuesTextTest extends BulkCalloutAdExtensionTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Callout Text string", "Callout Text string"},
                {null, null}
        });
    }

    @Test
    public void testRead() {
        this.testReadProperty("Callout Text", this.datum, this.expectedResult, new Function<BulkCalloutAdExtension, String>() {
            @Override
            public String apply(BulkCalloutAdExtension c) {
                return c.getCalloutAdExtension().getText();
            }
        });
    }
}

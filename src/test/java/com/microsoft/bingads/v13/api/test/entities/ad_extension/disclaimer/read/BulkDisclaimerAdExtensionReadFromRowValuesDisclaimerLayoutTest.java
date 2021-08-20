package com.microsoft.bingads.v13.api.test.entities.ad_extension.disclaimer.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.disclaimer.BulkDisclaimerAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkDisclaimerAdExtension;

public class BulkDisclaimerAdExtensionReadFromRowValuesDisclaimerLayoutTest extends BulkDisclaimerAdExtensionTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Additional line", "Additional line"},
            {"", ""},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Disclaimer Layout", this.datum, this.expectedResult, new Function<BulkDisclaimerAdExtension, String>() {
            @Override
            public String apply(BulkDisclaimerAdExtension c) {
                return c.getDisclaimerAdExtension().getDisclaimerLayout();
            }
        });
    }
}

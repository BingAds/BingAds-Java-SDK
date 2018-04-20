package com.microsoft.bingads.v12.api.test.entities.ad_extension.app.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.ad_extension.app.BulkAppAdExtensionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkAppAdExtension;

public class BulkAppAdExtensionReadFromRowValuesDevicePreferenceTest extends BulkAppAdExtensionTest {

    @Parameter(value = 1)
    public Long expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {null, null},
                {"All", 0L},
                {"Mobile", 30001L},
                {"", 0L},
        });
    }

    @Test
    public void testRead() {
        this.testReadProperty("Device Preference", this.datum, this.expectedResult, new Function<BulkAppAdExtension, Long>() {
            @Override
            public Long apply(BulkAppAdExtension c) {
                return c.getAppAdExtension().getDevicePreference();
            }
        });
    }
}

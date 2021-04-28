package com.microsoft.bingads.v13.api.test.entities.ad_extension.video.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.video.BulkVideoAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkVideoAdExtension;

public class BulkVideoAdExtensionReadFromRowValuesDevicePreferenceTest extends BulkVideoAdExtensionTest {

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
        this.testReadProperty("Device Preference", this.datum, this.expectedResult, new Function<BulkVideoAdExtension, Long>() {
            @Override
            public Long apply(BulkVideoAdExtension c) {
                return c.getVideoAdExtension().getDevicePreference();
            }
        });
    }
}

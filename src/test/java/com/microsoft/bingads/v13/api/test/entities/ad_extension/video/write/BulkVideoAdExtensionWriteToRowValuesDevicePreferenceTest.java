package com.microsoft.bingads.v13.api.test.entities.ad_extension.video.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.video.BulkVideoAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkVideoAdExtension;

public class BulkVideoAdExtensionWriteToRowValuesDevicePreferenceTest extends BulkVideoAdExtensionTest {

    @Parameterized.Parameter(value = 1)
    public Long expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"All", 0L},
                {"Mobile", 30001L},
                {"All", null},
        });
    }

    @Test
    public void testWrite() {
        this.testWriteProperty("Device Preference", this.datum, this.expectedResult, new BiConsumer<BulkVideoAdExtension, Long>() {
            @Override
            public void accept(BulkVideoAdExtension c, Long v) {
                c.getVideoAdExtension().setDevicePreference(v);
            }
        });
    }
}

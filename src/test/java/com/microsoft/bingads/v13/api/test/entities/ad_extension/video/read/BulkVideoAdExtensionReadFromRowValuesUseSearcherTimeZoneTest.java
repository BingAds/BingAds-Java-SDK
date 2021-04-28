package com.microsoft.bingads.v13.api.test.entities.ad_extension.video.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.video.BulkVideoAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkVideoAdExtension;

public class BulkVideoAdExtensionReadFromRowValuesUseSearcherTimeZoneTest extends BulkVideoAdExtensionTest {

    @Parameter(value = 1)
    public Boolean expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"false", false},
                {"true", true},
                {"", null},
                {null, null}
        });
    }

    @Test
    public void testRead() {
        this.testReadProperty("Use Searcher Time Zone", this.datum, this.expectedResult, new Function<BulkVideoAdExtension, Boolean>() {
            @Override
            public Boolean apply(BulkVideoAdExtension c) {
                return c.getVideoAdExtension().getScheduling().getUseSearcherTimeZone();
            }
        });
    }
}

package com.microsoft.bingads.v12.api.test.entities.ad_extension.app.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.ad_extension.app.BulkAppAdExtensionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkAppAdExtension;

public class BulkAppAdExtensionReadFromRowValuesUseSearcherTimeZoneTest extends BulkAppAdExtensionTest {

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
        this.testReadProperty("Use Searcher Time Zone", this.datum, this.expectedResult, new Function<BulkAppAdExtension, Boolean>() {
            @Override
            public Boolean apply(BulkAppAdExtension c) {
                return c.getAppAdExtension().getScheduling().getUseSearcherTimeZone();
            }
        });
    }
}

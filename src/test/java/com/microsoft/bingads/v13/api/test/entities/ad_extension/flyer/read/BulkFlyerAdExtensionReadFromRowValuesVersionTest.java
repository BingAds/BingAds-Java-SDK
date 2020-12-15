package com.microsoft.bingads.v13.api.test.entities.ad_extension.flyer.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.flyer.BulkFlyerAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkFlyerAdExtension;

@RunWith(Parameterized.class)
public class BulkFlyerAdExtensionReadFromRowValuesVersionTest extends BulkFlyerAdExtensionTest {

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
        this.<Integer>testReadProperty("Version", this.datum, this.expectedResult, new Function<BulkFlyerAdExtension, Integer>() {
            @Override
            public Integer apply(BulkFlyerAdExtension c) {
                return c.getFlyerAdExtension().getVersion();
            }
        });
    }
}

package com.microsoft.bingads.v13.api.test.entities.ad_extension.video.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.video.BulkVideoAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkVideoAdExtension;

@RunWith(Parameterized.class)
public class BulkVideoAdExtensionReadFromRowValuesVersionTest extends BulkVideoAdExtensionTest {

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
        this.testReadProperty("Version", this.datum, this.expectedResult, new Function<BulkVideoAdExtension, Integer>() {
            @Override
            public Integer apply(BulkVideoAdExtension c) {
                return c.getVideoAdExtension().getVersion();
            }
        });
    }
}

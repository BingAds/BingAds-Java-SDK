package com.microsoft.bingads.v11.api.test.entities.ad_extension.app.read;

import com.microsoft.bingads.v11.api.test.entities.ad_extension.app.BulkAppAdExtensionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAppAdExtension;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

public class BulkAppAdExtensionReadFromRowValuesAppStoreIdTest extends BulkAppAdExtensionTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"App store ID string", "App store ID string"},
                {null, null}
        });
    }

    @Test
    public void testRead() {
        this.testReadProperty("App Id", this.datum, this.expectedResult, new Function<BulkAppAdExtension, String>() {
            @Override
            public String apply(BulkAppAdExtension c) {
                return c.getAppAdExtension().getAppStoreId();
            }
        });
    }
}

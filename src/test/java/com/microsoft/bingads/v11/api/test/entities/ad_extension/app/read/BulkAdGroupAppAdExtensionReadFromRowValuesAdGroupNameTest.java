package com.microsoft.bingads.v11.api.test.entities.ad_extension.app.read;

import com.microsoft.bingads.v11.api.test.entities.ad_extension.app.BulkAdGroupAppAdExtensionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupAppAdExtension;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class BulkAdGroupAppAdExtensionReadFromRowValuesAdGroupNameTest extends BulkAdGroupAppAdExtensionTest {
    @Parameterized.Parameter(value = 1)
    public String expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Ad Group Name String", "Ad Group Name String"},
                {"", ""},
                {null, null}
        });
    }

    @Test
    public void testRead() {
        this.testReadProperty("Ad Group", this.datum, this.expectedResult, new Function<BulkAdGroupAppAdExtension, String>() {
            @Override
            public String apply(BulkAdGroupAppAdExtension c) {
                return c.getAdGroupName();
            }
        });
    }
}

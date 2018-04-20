package com.microsoft.bingads.v12.api.test.entities.ad_extension.image.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.ad_extension.image.BulkAdGroupImageAdExtensionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkAdGroupImageAdExtension;

public class BulkAdGroupImageAdExtensionReadFromRowValuesAdGroupNameTest extends BulkAdGroupImageAdExtensionTest {
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
        this.testReadProperty("Ad Group", this.datum, this.expectedResult, new Function<BulkAdGroupImageAdExtension, String>() {
            @Override
            public String apply(BulkAdGroupImageAdExtension c) {
                return c.getAdGroupName();
            }
        });
    }
}

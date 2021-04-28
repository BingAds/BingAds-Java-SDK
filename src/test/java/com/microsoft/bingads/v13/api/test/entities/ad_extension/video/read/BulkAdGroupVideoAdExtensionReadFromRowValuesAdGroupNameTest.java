package com.microsoft.bingads.v13.api.test.entities.ad_extension.video.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.video.BulkAdGroupVideoAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupVideoAdExtension;

public class BulkAdGroupVideoAdExtensionReadFromRowValuesAdGroupNameTest extends BulkAdGroupVideoAdExtensionTest {
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
        this.testReadProperty("Ad Group", this.datum, this.expectedResult, new Function<BulkAdGroupVideoAdExtension, String>() {
            @Override
            public String apply(BulkAdGroupVideoAdExtension c) {
                return c.getAdGroupName();
            }
        });
    }
}

package com.microsoft.bingads.v13.api.test.entities.ad_extension.image.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.image.BulkImageAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkImageAdExtension;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;

public class BulkImageAdExtensionReadFromRowValuesLayoutsTest extends BulkImageAdExtensionTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"layout1;layout2","layout1;layout2"},
            {null, null}
    });
    }

    @Test
    public void testRead() {
        this.testReadProperty("Layouts", this.datum, this.expectedResult, new Function<BulkImageAdExtension, String>() {
            @Override
            public String apply(BulkImageAdExtension c) {
                return StringExtensions.WriteDelimitedStrings(";", c.getImageAdExtension().getLayouts());
            }
        });
    }
}

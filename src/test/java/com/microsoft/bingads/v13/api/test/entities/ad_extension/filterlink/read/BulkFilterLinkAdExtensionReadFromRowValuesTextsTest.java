package com.microsoft.bingads.v13.api.test.entities.ad_extension.filterlink.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.filterlink.BulkFilterLinkAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkFilterLinkAdExtension;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;

public class BulkFilterLinkAdExtensionReadFromRowValuesTextsTest extends BulkFilterLinkAdExtensionTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Text1;Text2", "Text1;Text2"},
            {null, null}
    });
    }

    @Test
    public void testRead() {
        this.testReadProperty("Texts", this.datum, this.expectedResult, new Function<BulkFilterLinkAdExtension, String>() {
            @Override
            public String apply(BulkFilterLinkAdExtension c) {
                return StringExtensions.WriteDelimitedStrings(";", c.getFilterLinkAdExtension().getTexts());
            }
        });
    }
}

package com.microsoft.bingads.v11.api.test.entities.ad_extension.structuredSnippet.read;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.ad_extension.structuredSnippet.BulkAdGroupStructuredSnippetAdExtensionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupStructuredSnippetAdExtension;

import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class BulkAdGroupStructuredSnippetAdExtensionReadFromRowValuesAdGroupNameTest extends BulkAdGroupStructuredSnippetAdExtensionTest {
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
        this.testReadProperty("Ad Group", this.datum, this.expectedResult, new Function<BulkAdGroupStructuredSnippetAdExtension, String>() {
            @Override
            public String apply(BulkAdGroupStructuredSnippetAdExtension c) {
                return c.getAdGroupName();
            }
        });
    }
}

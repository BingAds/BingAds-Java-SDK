package com.microsoft.bingads.v13.api.test.entities.ad_extension.structuredSnippet.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.structuredSnippet.BulkAdGroupStructuredSnippetAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupStructuredSnippetAdExtension;

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

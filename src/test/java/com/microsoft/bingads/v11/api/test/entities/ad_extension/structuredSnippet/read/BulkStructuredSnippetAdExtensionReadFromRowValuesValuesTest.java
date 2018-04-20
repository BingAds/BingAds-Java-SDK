package com.microsoft.bingads.v11.api.test.entities.ad_extension.structuredSnippet.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v11.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v11.api.test.entities.ad_extension.structuredSnippet.BulkStructuredSnippetAdExtensionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkStructuredSnippetAdExtension;
import com.microsoft.bingads.v11.campaignmanagement.ArrayOfstring;

public class BulkStructuredSnippetAdExtensionReadFromRowValuesValuesTest extends BulkStructuredSnippetAdExtensionTest {

    @Parameter(value = 1)
    public ArrayOfstring expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
    	ArrayOfstring array = new ArrayOfstring();
		array.getStrings().addAll(Arrays.asList(new String[] { "Test Value 1", "Test Value 2" }));
		
		return Arrays.asList(new Object[][] {
			{"", null},
			{null, null},
			{"Test Value 1;Test Value 2", array},
		});
    }

    @Test
    public void testRead() {
        this.testReadProperty("Structured Snippet Values", this.datum, this.expectedResult, new Function<BulkStructuredSnippetAdExtension, ArrayOfstring>() {
            @Override
            public ArrayOfstring apply(BulkStructuredSnippetAdExtension c) {
                return c.getStructuredSnippetAdExtension().getValues();
            }
        }, new Supplier<BulkStructuredSnippetAdExtension>() {
            @Override
            public BulkStructuredSnippetAdExtension get() {
                return new BulkStructuredSnippetAdExtension();
            }
        }, new ObjectComparer<ArrayOfstring>());
    }
}

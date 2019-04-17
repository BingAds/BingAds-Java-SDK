package com.microsoft.bingads.v13.api.test.entities.ad_extension.structuredSnippet.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.structuredSnippet.BulkStructuredSnippetAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkStructuredSnippetAdExtension;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfstring;
																				
public class BulkStructuredSnippetAdExtensionWriteToRowValuesValuesTest extends BulkStructuredSnippetAdExtensionTest{

	@Parameter(value = 1)
	public ArrayOfstring propertyValue;
	
	@Parameters
	public static Collection<Object[]> data() {
		ArrayOfstring array = new ArrayOfstring();
		array.getStrings().addAll(Arrays.asList(new String[] { "Test Value 1", "Test Value 2" }));
		
	    return Arrays.asList(new Object[][]{
	        {null, null},
	        {null, new ArrayOfstring()},
	        {"Test Value 1;Test Value 2", array},
	    });
	}
	
	@Test
	public void testWrite() {
	    this.<ArrayOfstring>testWriteProperty("Structured Snippet Values", this.datum, this.propertyValue, new BiConsumer<BulkStructuredSnippetAdExtension, ArrayOfstring>() {
	        @Override
	        public void accept(BulkStructuredSnippetAdExtension c, ArrayOfstring v) {
	            c.getStructuredSnippetAdExtension().setValues(v);;
	        }
	    });
	    }
}

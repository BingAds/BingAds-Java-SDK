package com.microsoft.bingads.v13.api.test.entities.ad_extension.structuredSnippet.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.structuredSnippet.BulkStructuredSnippetAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkStructuredSnippetAdExtension;

@RunWith(Parameterized.class)
public class BulkStructuredSnippetAdExtensionWriteToRowValuesHeaderTest extends BulkStructuredSnippetAdExtensionTest {

    @Parameter(value = 1)
    public String expectedResult;

    /*
     * Test data generator.
     * This method is called the the JUnit parameterized test runner and
     * returns a Collection of Arrays.  For each Array in the Collection,
     * each array element corresponds to a parameter in the constructor.
     */
    @Parameters
    public static Collection<Object[]> data() {
        // In this example, the parameter generator returns a List of
        // arrays.  Each array has two elements: { datum, expected }.
        // These data are hard-coded into the class, but they could be
        // generated or loaded in any way you like.
        return Arrays.asList(new Object[][]{
                {"Header", "Header"},
                {"", ""},
                {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.testWriteProperty("Structured Snippet Header", this.datum, this.expectedResult, new BiConsumer<BulkStructuredSnippetAdExtension, String>() {
            @Override
            public void accept(BulkStructuredSnippetAdExtension c, String v) {
                c.getStructuredSnippetAdExtension().setHeader(v);
            }
        });
    }
}

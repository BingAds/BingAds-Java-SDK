package com.microsoft.bingads.v11.api.test.entities.ad_extension.image.write;

import com.microsoft.bingads.v11.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v11.api.test.entities.ad_extension.image.BulkImageAdExtensionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkImageAdExtension;
import com.microsoft.bingads.v11.campaignmanagement.ArrayOflong;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkImageAdExtensionWriteFromRowValuesMediaIdTest extends BulkImageAdExtensionTest {

    @Parameter(value = 1)
    public ArrayOflong expectedResult;

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
        ArrayOflong array = new ArrayOflong();
		array.getLongs().addAll(Arrays.asList(new Long[] { 123L, 456L }));
		
		return Arrays.asList(new Object[][] {
			{null, null},
			{"delete_value", new ArrayOflong()},
			{"123;456", array},
		});
    }
    
    @Test
    public void testWrite() {
        this.<ArrayOflong>testWriteProperty("Media Ids", this.datum, this.expectedResult, new BiConsumer<BulkImageAdExtension, ArrayOflong>() {
            @Override
            public void accept(BulkImageAdExtension c, ArrayOflong v) {
                c.getImageAdExtension().setImageMediaIds(v);
            }
        });
    }
}

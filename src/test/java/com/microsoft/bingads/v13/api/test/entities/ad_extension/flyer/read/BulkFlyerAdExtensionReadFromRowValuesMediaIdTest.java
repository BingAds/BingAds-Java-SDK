package com.microsoft.bingads.v13.api.test.entities.ad_extension.flyer.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.flyer.BulkFlyerAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkFlyerAdExtension;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOflong;

@RunWith(Parameterized.class)
public class BulkFlyerAdExtensionReadFromRowValuesMediaIdTest extends BulkFlyerAdExtensionTest {

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
			{"", null},
			{"123;456", array},
		});
    }
    
    @Test
    public void testRead() {
        this.<ArrayOflong>testReadProperty("Media Ids", this.datum, this.expectedResult, new Function<BulkFlyerAdExtension, ArrayOflong>() {
            @Override
            public ArrayOflong apply(BulkFlyerAdExtension c) {
                return c.getFlyerAdExtension().getImageMediaIds();
            }
            
        }, new Supplier<BulkFlyerAdExtension>() {
            @Override
            public BulkFlyerAdExtension get() {
                return new BulkFlyerAdExtension();
            }
        }, new ObjectComparer<ArrayOflong>());
    }
}

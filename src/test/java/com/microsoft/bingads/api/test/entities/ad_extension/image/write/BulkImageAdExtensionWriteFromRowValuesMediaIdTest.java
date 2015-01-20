package com.microsoft.bingads.api.test.entities.ad_extension.image.write;

import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.ad_extension.image.BulkImageAdExtensionTest;
import com.microsoft.bingads.bulk.entities.BulkImageAdExtension;

@RunWith(Parameterized.class)
public class BulkImageAdExtensionWriteFromRowValuesMediaIdTest extends BulkImageAdExtensionTest {

    @Parameter(value = 1)
    public Long expectedResult;

    /*
     * Test data generator.
     * This method is called the the JUnit parameterized test runner and
     * returns a Collection of Arrays.  For each Array in the Collection,
     * each array element corresponds to a parameter in the constructor.
     */
    @Parameters
    public static Collection<Object[]> data() {
        // In this example, the parameter generator returns a List of[\r\n\s]*       // arrays.  Each array has two elements: { datum, expected }.[\r\n\s]+       // These data are hard-coded into the class, but they could be[\r\n\s]+       // generated or loaded in any way you like.
        return Arrays.asList(new Object[][]{
            {"12345", 12345L}
        });
    }

    @Test
    public void testWrite() {
        this.<Long>testWriteProperty("Media Id", this.datum, this.expectedResult, new BiConsumer<BulkImageAdExtension, Long>() {
            @Override
            public void accept(BulkImageAdExtension c, Long v) {
                c.getImageAdExtension().setImageMediaId(v);
            }
        });
    }
}

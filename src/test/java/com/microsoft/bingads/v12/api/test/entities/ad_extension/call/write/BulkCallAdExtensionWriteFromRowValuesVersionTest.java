package com.microsoft.bingads.v12.api.test.entities.ad_extension.call.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.ad_extension.call.BulkCallAdExtensionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkCallAdExtension;

@RunWith(Parameterized.class)
public class BulkCallAdExtensionWriteFromRowValuesVersionTest extends BulkCallAdExtensionTest {

    @Parameter(value = 1)
    public Integer expectedResult;

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
            {"123", 123},
            {"2147483647", 2147483647},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<Integer>testWriteProperty("Version", this.datum, this.expectedResult, new BiConsumer<BulkCallAdExtension, Integer>() {
            @Override
            public void accept(BulkCallAdExtension c, Integer v) {
                c.getCallAdExtension().setVersion(v);
            }
        });
    }
}

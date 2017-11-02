package com.microsoft.bingads.v11.api.test.entities.remarketing_list.write;

import com.microsoft.bingads.v11.api.test.entities.remarketing_list.BulkRemarketingListTest;
import com.microsoft.bingads.v11.bulk.entities.BulkRemarketingList;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkRemarketingListWriteToRowValuesTagIdTest extends BulkRemarketingListTest {

    @Parameter(value = 1)
    public Long propertyValue;

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
            {"123", 123L},
            {"9223372036854775807", 9223372036854775807L},
            {null, null}
        });
    }
    
    @Test
    public void testWrite() {
        this.<Long>testWriteProperty("UET Tag Id", this.datum, this.propertyValue, new BiConsumer<BulkRemarketingList, Long>() {
            @Override
            public void accept(BulkRemarketingList c, Long v) {
                c.getRemarketingList().setTagId(v);
            }
        });
    }
}

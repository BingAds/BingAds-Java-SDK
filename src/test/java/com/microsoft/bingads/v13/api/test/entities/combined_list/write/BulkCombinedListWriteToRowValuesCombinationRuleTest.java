package com.microsoft.bingads.v13.api.test.entities.combined_list.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.combined_list.BulkCombinedListTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCombinedList;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;

@RunWith(Parameterized.class)
public class BulkCombinedListWriteToRowValuesCombinationRuleTest extends BulkCombinedListTest {

    @Parameter(value = 1)
    public String propertyValue;

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
            {"And(4)&Or(1,2,3)&Not(5)", "AND(4)&Or(1,2,3)&not(5)"},
            {null, ""},
            {null, null}
        });
    }
    
    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Combination Rule", this.datum, this.propertyValue, new BiConsumer<BulkCombinedList, String>() {
            @Override
            public void accept(BulkCombinedList c, String v) {
                c.getCombinedList().setCombinationRules(StringExtensions.parseCombinationRules(v));
            }
        });
    }
}

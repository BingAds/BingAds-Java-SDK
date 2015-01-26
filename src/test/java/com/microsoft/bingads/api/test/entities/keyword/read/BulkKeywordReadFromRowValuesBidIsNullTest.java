package com.microsoft.bingads.api.test.entities.keyword.read;

import com.microsoft.bingads.api.test.entities.keyword.BulkKeywordTest;
import com.microsoft.bingads.bulk.entities.BulkKeyword;
import com.microsoft.bingads.campaignmanagement.Bid;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkKeywordReadFromRowValuesBidIsNullTest extends BulkKeywordTest {

    @Parameter(value = 1)
    public Bid expectedResult;

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
            {null, null},});
    }

    @Test
    public void testRead() {
        this.<Bid>testReadProperty("Bid", this.datum, this.expectedResult, new Function<BulkKeyword, Bid>() {
            @Override
            public Bid apply(BulkKeyword c) {
                return c.getKeyword().getBid();
            }
        });
    }
}

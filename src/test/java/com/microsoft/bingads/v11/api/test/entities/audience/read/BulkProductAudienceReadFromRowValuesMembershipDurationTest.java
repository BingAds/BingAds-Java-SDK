package com.microsoft.bingads.v11.api.test.entities.audience.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.audience.BulkProductAudienceTest;
import com.microsoft.bingads.v11.bulk.entities.BulkProductAudience;

@RunWith(Parameterized.class)
public class BulkProductAudienceReadFromRowValuesMembershipDurationTest extends BulkProductAudienceTest {

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
            {"2147483647", Integer.MAX_VALUE},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<Integer>testReadProperty("Membership Duration", this.datum, this.expectedResult, new Function<BulkProductAudience, Integer>() {
            @Override
            public Integer apply(BulkProductAudience c) {
                return c.getProductAudience().getMembershipDuration();
            }
        });
    }
}

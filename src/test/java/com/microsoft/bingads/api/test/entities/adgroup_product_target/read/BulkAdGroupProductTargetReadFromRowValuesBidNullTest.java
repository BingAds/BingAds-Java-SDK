package com.microsoft.bingads.api.test.entities.adgroup_product_target.read;

import com.microsoft.bingads.api.test.entities.FixedBidComparer;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.Function;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.adgroup_product_target.BulkAdGroupProductTargetTest;
import com.microsoft.bingads.bulk.entities.BulkAdGroupProductTarget;
import com.microsoft.bingads.campaignmanagement.Bid;
import com.microsoft.bingads.campaignmanagement.FixedBid;

@RunWith(Parameterized.class)
public class BulkAdGroupProductTargetReadFromRowValuesBidNullTest extends BulkAdGroupProductTargetTest {

    @Parameter(value = 1)
    public FixedBid expectedResult;

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
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<Bid>testReadProperty("Bid", this.datum, null, new Function<BulkAdGroupProductTarget, Bid>() {
            @Override
            public Bid apply(BulkAdGroupProductTarget c) {
                return FixedBid.class.cast(c.getBiddableAdGroupCriterion().getCriterionBid()).getBid();
            }
        });
    }
}

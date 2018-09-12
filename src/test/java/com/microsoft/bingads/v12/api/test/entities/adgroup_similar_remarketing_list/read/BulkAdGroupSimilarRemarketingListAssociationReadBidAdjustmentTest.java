package com.microsoft.bingads.v12.api.test.entities.adgroup_similar_remarketing_list.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.adgroup_similar_remarketing_list.BulkAdGroupSimilarRemarketingListAssociationTest;
import com.microsoft.bingads.v12.bulk.entities.BulkAdGroupSimilarRemarketingListAssociation;
import com.microsoft.bingads.v12.campaignmanagement.BidMultiplier;

@RunWith(Parameterized.class)
public class BulkAdGroupSimilarRemarketingListAssociationReadBidAdjustmentTest extends BulkAdGroupSimilarRemarketingListAssociationTest {

    @Parameter(value = 1)
    public Double expectedResult;

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
            {"-12.3", -12.3},
            {"12.3", 12.3},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<Double>testReadProperty("Bid Adjustment", this.datum, this.expectedResult, new Function<BulkAdGroupSimilarRemarketingListAssociation, Double>() {
            @Override
            public Double apply(BulkAdGroupSimilarRemarketingListAssociation c) {
                return ((BidMultiplier) c.getBiddableAdGroupCriterion().getCriterionBid()).getMultiplier();
            }
        });
    }
}

package com.microsoft.bingads.v13.api.test.entities.campaign_brand_list_association.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.campaign_brand_list_association.BulkCampaignBrandListAssociationTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignBrandListAssociation;

@RunWith(Parameterized.class)
public class BulkCampaignBrandListAssociationReadFromRowValuesIsExcludedTest extends BulkCampaignBrandListAssociationTest {

    @Parameter(value = 1)
    public boolean expectedResult;

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
            {"False", false},
            {"True", true},
            {"", false}
        });
    }

    @Test
    public void testRead() {
        this.<Boolean>testReadProperty("Is Excluded", this.datum, this.expectedResult, new Function<BulkCampaignBrandListAssociation, Boolean>() {
            @Override
            public Boolean apply(BulkCampaignBrandListAssociation c) {
                return c.getIsExcluded();
            }
        });
    }
}

package com.microsoft.bingads.v13.api.test.entities.campaign_negative_custom_association.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.campaign_negative_custom_association.BulkCampaignNegativeCustomAssociationTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignNegativeCustomAudienceAssociation;

@RunWith(Parameterized.class)
public class BulkCampaignNegativeCustomAssociationWriteToRowValuesIdTest extends BulkCampaignNegativeCustomAssociationTest {

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
        this.<Long>testWriteProperty("Id", this.datum, this.propertyValue, new BiConsumer<BulkCampaignNegativeCustomAudienceAssociation, Long>() {
            @Override
            public void accept(BulkCampaignNegativeCustomAudienceAssociation c, Long v) {
                c.getNegativeCampaignCriterion().setId(v);;
            }
        });
    }
}

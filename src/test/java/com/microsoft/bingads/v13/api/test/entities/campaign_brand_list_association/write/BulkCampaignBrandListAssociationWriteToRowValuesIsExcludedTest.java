package com.microsoft.bingads.v13.api.test.entities.campaign_brand_list_association.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.campaign_brand_list_association.BulkCampaignBrandListAssociationTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignBrandListAssociation;

@RunWith(Parameterized.class)
public class BulkCampaignBrandListAssociationWriteToRowValuesIsExcludedTest extends BulkCampaignBrandListAssociationTest {

    @Parameter(value = 1)
    public Boolean propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        // In this example, the parameter generator returns a List of
        // arrays.  Each array has two elements: { datum, expected }.
        // These data are hard-coded into the class, but they could be
        // generated or loaded in any way you like.
        return Arrays.asList(new Object[][]{
            {"false", false},
            {"true", true},
        });
    }

    @Test
    public void testWrite() {
        this.<Boolean>testWriteProperty("Is Excluded", this.datum, this.propertyValue, new BiConsumer<BulkCampaignBrandListAssociation, Boolean>() {
            @Override
            public void accept(BulkCampaignBrandListAssociation c, Boolean v) {
                c.setIsExcluded(v);
            }
        });
    }
}

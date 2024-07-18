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
public class BulkCampaignBrandListAssociationWriteToRowValuesNameTest extends BulkCampaignBrandListAssociationTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
    	return Arrays.asList(new Object[][]{
    		{"Camapign Brand List Association Name", "Camapign Brand List Association Name"},
            {null, null}
    	});
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Name", this.datum, this.propertyValue, new BiConsumer<BulkCampaignBrandListAssociation, String>() {
            @Override
            public void accept(BulkCampaignBrandListAssociation c, String v) {
                c.setName(v);
            }
        });
    }
}

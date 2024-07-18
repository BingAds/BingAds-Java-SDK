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
public class BulkCampaignBrandListAssociationWriteToRowValuesIdTest extends BulkCampaignBrandListAssociationTest {

    @Parameter(value = 1)
    public Long propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
    	return Arrays.asList(new Object[][]{
            {"123", 123L},
            {"9223372036854775807", 9223372036854775807L},
            {null, null}
    	});
    }

    @Test
    public void testWrite() {
        this.<Long>testWriteProperty("Id", this.datum, this.propertyValue, new BiConsumer<BulkCampaignBrandListAssociation, Long>() {
            @Override
            public void accept(BulkCampaignBrandListAssociation c, Long v) {
                c.setId(v);
            }
        });
    }
}

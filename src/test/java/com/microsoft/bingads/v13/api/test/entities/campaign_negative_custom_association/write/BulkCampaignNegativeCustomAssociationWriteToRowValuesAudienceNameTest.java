package com.microsoft.bingads.v13.api.test.entities.campaign_negative_custom_association.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.campaign_negative_custom_association.BulkCampaignNegativeCustomAssociationTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignNegativeCustomAudienceAssociation;

public class BulkCampaignNegativeCustomAssociationWriteToRowValuesAudienceNameTest extends BulkCampaignNegativeCustomAssociationTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test Campaign 1", "Test Campaign 1"},
            {"", ""},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Audience", this.datum, this.propertyValue, new BiConsumer<BulkCampaignNegativeCustomAudienceAssociation, String>() {
            @Override
            public void accept(BulkCampaignNegativeCustomAudienceAssociation c, String v) {
                c.setAudienceName(v);
            }
        });
    }
}

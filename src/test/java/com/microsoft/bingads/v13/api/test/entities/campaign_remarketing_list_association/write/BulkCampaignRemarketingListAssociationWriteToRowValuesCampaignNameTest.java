package com.microsoft.bingads.v13.api.test.entities.campaign_remarketing_list_association.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.campaign_remarketing_list_association.BulkCampaignRemarketingListAssociationTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignRemarketingListAssociation;

public class BulkCampaignRemarketingListAssociationWriteToRowValuesCampaignNameTest extends BulkCampaignRemarketingListAssociationTest {

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
        this.<String>testWriteProperty("Campaign", this.datum, this.propertyValue, new BiConsumer<BulkCampaignRemarketingListAssociation, String>() {
            @Override
            public void accept(BulkCampaignRemarketingListAssociation c, String v) {
                c.setCampaignName(v);
            }
        });
    }
}

package com.microsoft.bingads.v11.api.test.entities.criterions.campaign.negative_location.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.criterions.campaign.negative_location.BulkCampaignNegativeLocationCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignNegativeLocationCriterion;
import com.microsoft.bingads.v11.campaignmanagement.LocationCriterion;

@RunWith(Parameterized.class)
public class BulkCampaignNegativeLocationCriterionWriteDisplayNameTypeTest extends BulkCampaignNegativeLocationCriterionTest {

    @Parameterized.Parameter(value = 1)
    public String propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                	{"Test", "Test"},
                    {"", ""},
                    {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Name",
                datum,
                propertyValue,
                new BiConsumer<BulkCampaignNegativeLocationCriterion, String>() {
                    @Override
                    public void accept(BulkCampaignNegativeLocationCriterion c, String v) {
                        ((LocationCriterion)c.getNegativeCampaignCriterion().getCriterion()).setDisplayName(v);
                    }
                }
        );
    }
}

package com.microsoft.bingads.v11.api.test.entities.criterions.campaign.location.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.criterions.campaign.location.BulkCampaignLocationCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignLocationCriterion;
import com.microsoft.bingads.v11.campaignmanagement.LocationCriterion;

@RunWith(Parameterized.class)
public class BulkCampaignLocationCriterionWriteLocationTypeTest extends BulkCampaignLocationCriterionTest {

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
                "Sub Type",
                datum,
                propertyValue,
                new BiConsumer<BulkCampaignLocationCriterion, String>() {
                    @Override
                    public void accept(BulkCampaignLocationCriterion c, String v) {
                        ((LocationCriterion)c.getBiddableCampaignCriterion().getCriterion()).setLocationType(v);
                    }
                }
        );
    }
}

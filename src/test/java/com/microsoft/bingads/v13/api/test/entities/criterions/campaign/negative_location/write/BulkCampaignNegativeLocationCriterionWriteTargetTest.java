package com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_location.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_location.BulkCampaignNegativeLocationCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignNegativeLocationCriterion;
import com.microsoft.bingads.v13.campaignmanagement.LocationCriterion;

@RunWith(Parameterized.class)
public class BulkCampaignNegativeLocationCriterionWriteTargetTest extends BulkCampaignNegativeLocationCriterionTest {

    @Parameterized.Parameter(value = 1)
    public Long propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                	{"12", 12L},
                    {"23", 23L},
                    {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Target",
                datum,
                propertyValue,
                new BiConsumer<BulkCampaignNegativeLocationCriterion, Long>() {
                    @Override
                    public void accept(BulkCampaignNegativeLocationCriterion c, Long v) {
                        ((LocationCriterion)c.getNegativeCampaignCriterion().getCriterion()).setLocationId(v);
                    }
                }
        );
    }
}

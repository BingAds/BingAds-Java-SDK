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
public class BulkCampaignLocationCriterionWriteTargetTest extends BulkCampaignLocationCriterionTest {

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
                new BiConsumer<BulkCampaignLocationCriterion, Long>() {
                    @Override
                    public void accept(BulkCampaignLocationCriterion c, Long v) {
                        ((LocationCriterion)c.getBiddableCampaignCriterion().getCriterion()).setLocationId(v);
                    }
                }
        );
    }
}

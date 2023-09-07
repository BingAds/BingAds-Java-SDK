package com.microsoft.bingads.v13.api.test.entities.criterions.campaign.deal.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.deal.BulkCampaignDealCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignDealCriterion;
import com.microsoft.bingads.v13.campaignmanagement.DealCriterion;

@RunWith(Parameterized.class)
public class BulkCampaignDealCriterionWriteTargetTest extends BulkCampaignDealCriterionTest {

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
                new BiConsumer<BulkCampaignDealCriterion, Long>() {
                    @Override
                    public void accept(BulkCampaignDealCriterion c, Long v) {
                        ((DealCriterion)c.getBiddableCampaignCriterion().getCriterion()).setDealId(v);
                    }
                }
        );
    }
}

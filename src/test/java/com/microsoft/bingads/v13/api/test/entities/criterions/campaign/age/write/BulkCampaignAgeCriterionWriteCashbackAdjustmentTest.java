package com.microsoft.bingads.v13.api.test.entities.criterions.campaign.age.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.age.BulkCampaignAgeCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignAgeCriterion;
import com.microsoft.bingads.v13.campaignmanagement.AgeCriterion;
import com.microsoft.bingads.v13.campaignmanagement.BiddableCampaignCriterion;
import com.microsoft.bingads.v13.campaignmanagement.CashbackAdjustment;

public class BulkCampaignAgeCriterionWriteCashbackAdjustmentTest extends BulkCampaignAgeCriterionTest {
    @Parameterized.Parameter(value = 1)
    public Double propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"12.34", 12.34},
                        {"0.0", 0.0},
                        {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Cashback Percent",
                datum,
                propertyValue,
                new BiConsumer<BulkCampaignAgeCriterion, Double>() {
                    @Override
                    public void accept(BulkCampaignAgeCriterion c, Double v) {
                        AgeCriterion criterion = new AgeCriterion();

                        BiddableCampaignCriterion adGroupCriterion = new BiddableCampaignCriterion();

                        adGroupCriterion.setCriterion(criterion);

                        c.setBiddableCampaignCriterion(adGroupCriterion);

                        CashbackAdjustment cashback = new CashbackAdjustment();

                        cashback.setCashbackPercent(v);

                        adGroupCriterion.setCriterionCashback(cashback);
                    }
                }
        );
    }

}

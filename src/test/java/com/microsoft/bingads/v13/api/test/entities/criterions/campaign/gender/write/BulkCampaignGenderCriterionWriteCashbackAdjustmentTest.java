package com.microsoft.bingads.v13.api.test.entities.criterions.campaign.gender.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.gender.BulkCampaignGenderCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignGenderCriterion;
import com.microsoft.bingads.v13.campaignmanagement.GenderCriterion;
import com.microsoft.bingads.v13.campaignmanagement.BiddableCampaignCriterion;
import com.microsoft.bingads.v13.campaignmanagement.CashbackAdjustment;

public class BulkCampaignGenderCriterionWriteCashbackAdjustmentTest extends BulkCampaignGenderCriterionTest {
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
                new BiConsumer<BulkCampaignGenderCriterion, Double>() {
                    @Override
                    public void accept(BulkCampaignGenderCriterion c, Double v) {
                        GenderCriterion criterion = new GenderCriterion();

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

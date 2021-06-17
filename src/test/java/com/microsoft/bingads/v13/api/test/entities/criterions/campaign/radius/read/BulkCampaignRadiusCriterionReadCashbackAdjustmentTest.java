package com.microsoft.bingads.v13.api.test.entities.criterions.campaign.radius.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.radius.BulkCampaignRadiusCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignRadiusCriterion;
import com.microsoft.bingads.v13.campaignmanagement.BiddableCampaignCriterion;
import com.microsoft.bingads.v13.campaignmanagement.CashbackAdjustment;

@RunWith(Parameterized.class)
public class BulkCampaignRadiusCriterionReadCashbackAdjustmentTest extends BulkCampaignRadiusCriterionTest {

    @Parameter(value = 1)
    public Double expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"0.58", 0.58},
                        {"0.0", 0.0},
                        {"", null},
                        {null, null}
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Cashback Percent",
                datum,
                expectedResult,
                new Function<BulkCampaignRadiusCriterion, Double>() {
                    @Override
                    public Double apply(BulkCampaignRadiusCriterion c) {
                        CashbackAdjustment cashback = ((CashbackAdjustment) ((BiddableCampaignCriterion) c.getBiddableCampaignCriterion()).getCriterionCashback());
                        return cashback == null ? null : cashback.getCashbackPercent();
                    }
                }
        );
    }
}

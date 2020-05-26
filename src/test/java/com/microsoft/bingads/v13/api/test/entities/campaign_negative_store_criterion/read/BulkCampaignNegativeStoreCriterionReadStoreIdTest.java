package com.microsoft.bingads.v13.api.test.entities.campaign_negative_store_criterion.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.campaign_negative_store_criterion.BulkCampaignNegativeStoreCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignNegativeStoreCriterion;
import com.microsoft.bingads.v13.campaignmanagement.StoreCriterion;

@RunWith(Parameterized.class)
public class BulkCampaignNegativeStoreCriterionReadStoreIdTest extends BulkCampaignNegativeStoreCriterionTest {

    @Parameter(value = 1)
    public Long expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"123", 123L},
                        {"9223372036854775807", 9223372036854775807L},
                        {"", null},
                        {null, null}
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Store Id",
                datum,
                expectedResult,
                new Function<BulkCampaignNegativeStoreCriterion, Long>() {
                    @Override
                    public Long apply(BulkCampaignNegativeStoreCriterion c) {
                        return ((StoreCriterion) c.getNegativeCampaignCriterion().getCriterion()).getStoreId();
                    }
                }
        );
    }
}

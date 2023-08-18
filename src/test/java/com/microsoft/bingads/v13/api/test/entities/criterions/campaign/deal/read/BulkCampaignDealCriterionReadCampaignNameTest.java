package com.microsoft.bingads.v13.api.test.entities.criterions.campaign.deal.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.deal.BulkCampaignDealCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignDealCriterion;

@RunWith(Parameterized.class)
public class BulkCampaignDealCriterionReadCampaignNameTest extends BulkCampaignDealCriterionTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"123", "123"},
                        {"XXX YYY", "XXX YYY"},
                        {"", ""},
                        {null, null}
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Campaign",
                datum,
                expectedResult,
                new Function<BulkCampaignDealCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignDealCriterion c) {
                        return c.getCampaignName();
                    }
                }
        );
    }
}

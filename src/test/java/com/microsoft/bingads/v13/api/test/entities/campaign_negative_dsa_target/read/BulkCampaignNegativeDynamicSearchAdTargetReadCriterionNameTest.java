package com.microsoft.bingads.v13.api.test.entities.campaign_negative_dsa_target.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.campaign_negative_dsa_target.BulkCampaignNegativeDynamicSearchAdTargetTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignNegativeDynamicSearchAdTarget;
import com.microsoft.bingads.v13.campaignmanagement.Webpage;

@RunWith(Parameterized.class)
public class BulkCampaignNegativeDynamicSearchAdTargetReadCriterionNameTest extends BulkCampaignNegativeDynamicSearchAdTargetTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"123", "123"},
                        {"XXX YYY", "XXX YYY"},
                        {"", null},
                        {null, null}
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Name",
                datum,
                expectedResult,
                new Function<BulkCampaignNegativeDynamicSearchAdTarget, String>() {
                    @Override
                    public String apply(BulkCampaignNegativeDynamicSearchAdTarget c) {
                        return ((Webpage)c.getNegativeCampaignCriterion().getCriterion()).getParameter().getCriterionName();
                    }
                }
        );
    }
}

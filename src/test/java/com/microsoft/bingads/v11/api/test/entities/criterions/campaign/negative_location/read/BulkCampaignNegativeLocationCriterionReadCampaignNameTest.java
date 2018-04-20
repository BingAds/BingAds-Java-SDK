package com.microsoft.bingads.v11.api.test.entities.criterions.campaign.negative_location.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.criterions.campaign.negative_location.BulkCampaignNegativeLocationCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignNegativeLocationCriterion;

@RunWith(Parameterized.class)
public class BulkCampaignNegativeLocationCriterionReadCampaignNameTest extends BulkCampaignNegativeLocationCriterionTest {

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
                new Function<BulkCampaignNegativeLocationCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignNegativeLocationCriterion c) {
                        return c.getCampaignName();
                    }
                }
        );
    }
}

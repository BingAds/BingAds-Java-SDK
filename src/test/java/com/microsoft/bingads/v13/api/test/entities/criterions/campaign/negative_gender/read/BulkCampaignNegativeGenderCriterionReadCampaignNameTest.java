package com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_gender.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_gender.BulkCampaignNegativeGenderCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignNegativeGenderCriterion;

@RunWith(Parameterized.class)
public class BulkCampaignNegativeGenderCriterionReadCampaignNameTest extends BulkCampaignNegativeGenderCriterionTest {

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
                new Function<BulkCampaignNegativeGenderCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignNegativeGenderCriterion c) {
                        return c.getCampaignName();
                    }
                }
        );
    }
}

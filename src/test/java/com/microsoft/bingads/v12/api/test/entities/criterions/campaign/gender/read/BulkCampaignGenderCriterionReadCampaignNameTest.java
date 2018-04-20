package com.microsoft.bingads.v12.api.test.entities.criterions.campaign.gender.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.gender.BulkCampaignGenderCriterionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaignGenderCriterion;

@RunWith(Parameterized.class)
public class BulkCampaignGenderCriterionReadCampaignNameTest extends BulkCampaignGenderCriterionTest {

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
                new Function<BulkCampaignGenderCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignGenderCriterion c) {
                        return c.getCampaignName();
                    }
                }
        );
    }
}

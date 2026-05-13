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
import com.microsoft.bingads.v13.campaignmanagement.GenderCriterion;
import com.microsoft.bingads.v13.campaignmanagement.GenderType;

@RunWith(Parameterized.class)
public class BulkCampaignNegativeGenderCriterionReadTargetTest extends BulkCampaignNegativeGenderCriterionTest {

    @Parameter(value = 1)
    public GenderType expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"Female", GenderType.FEMALE},
                        {"Male", GenderType.MALE},
                        {"", null},
                        {null, null}
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Target",
                datum,
                expectedResult,
                new Function<BulkCampaignNegativeGenderCriterion, GenderType>() {
                    @Override
                    public GenderType apply(BulkCampaignNegativeGenderCriterion c) {
                        return ((GenderCriterion) c.getNegativeCampaignCriterion().getCriterion()).getGenderType();
                    }
                }
        );
    }
}

package com.microsoft.bingads.v11.api.test.entities.criterions.campaign.gender.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.criterions.campaign.gender.BulkCampaignGenderCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignGenderCriterion;
import com.microsoft.bingads.v11.campaignmanagement.GenderCriterion;
import com.microsoft.bingads.v11.campaignmanagement.GenderType;

@RunWith(Parameterized.class)
public class BulkCampaignGenderCriterionReadTargetTest extends BulkCampaignGenderCriterionTest {

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
                new Function<BulkCampaignGenderCriterion, GenderType>() {
                    @Override
                    public GenderType apply(BulkCampaignGenderCriterion c) {
                        return ((GenderCriterion)c.getBiddableCampaignCriterion().getCriterion()).getGenderType();
                    }
                }
        );
    }
}

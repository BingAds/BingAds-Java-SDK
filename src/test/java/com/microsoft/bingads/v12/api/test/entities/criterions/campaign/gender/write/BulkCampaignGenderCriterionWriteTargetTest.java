package com.microsoft.bingads.v12.api.test.entities.criterions.campaign.gender.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.gender.BulkCampaignGenderCriterionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaignGenderCriterion;
import com.microsoft.bingads.v12.campaignmanagement.GenderCriterion;
import com.microsoft.bingads.v12.campaignmanagement.GenderType;

@RunWith(Parameterized.class)
public class BulkCampaignGenderCriterionWriteTargetTest extends BulkCampaignGenderCriterionTest {

    @Parameterized.Parameter(value = 1)
    public GenderType propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                	{"Female", GenderType.FEMALE},
                    {"Male", GenderType.MALE},
                    {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Target",
                datum,
                propertyValue,
                new BiConsumer<BulkCampaignGenderCriterion, GenderType>() {
                    @Override
                    public void accept(BulkCampaignGenderCriterion c, GenderType v) {
                        ((GenderCriterion)c.getBiddableCampaignCriterion().getCriterion()).setGenderType(v);
                    }
                }
        );
    }
}

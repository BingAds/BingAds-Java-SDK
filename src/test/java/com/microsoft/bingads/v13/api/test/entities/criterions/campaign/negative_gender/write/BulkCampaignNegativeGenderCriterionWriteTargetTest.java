package com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_gender.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_gender.BulkCampaignNegativeGenderCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignNegativeGenderCriterion;
import com.microsoft.bingads.v13.campaignmanagement.GenderCriterion;
import com.microsoft.bingads.v13.campaignmanagement.GenderType;

@RunWith(Parameterized.class)
public class BulkCampaignNegativeGenderCriterionWriteTargetTest extends BulkCampaignNegativeGenderCriterionTest {

    @Parameter(value = 1)
    public GenderType propertyValue;

    @Parameters
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
                new BiConsumer<BulkCampaignNegativeGenderCriterion, GenderType>() {
                    @Override
                    public void accept(BulkCampaignNegativeGenderCriterion c, GenderType v) {
                        ((GenderCriterion) c.getNegativeCampaignCriterion().getCriterion()).setGenderType(v);
                    }
                }
        );
    }
}

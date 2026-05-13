package com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_gender;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignNegativeGenderCriterion;
import com.microsoft.bingads.v13.campaignmanagement.GenderCriterion;
import com.microsoft.bingads.v13.campaignmanagement.NegativeCampaignCriterion;

public abstract class BulkCampaignNegativeGenderCriterionTest extends BulkEntityTest<BulkCampaignNegativeGenderCriterion> {

    @Override
    protected void onEntityCreation(BulkCampaignNegativeGenderCriterion entity) {
        GenderCriterion genderCriterion = new GenderCriterion();
        genderCriterion.setType("GenderCriterion");

        NegativeCampaignCriterion negativeCampaignCriterion = new NegativeCampaignCriterion();
        negativeCampaignCriterion.setCriterion(genderCriterion);

        entity.setNegativeCampaignCriterion(negativeCampaignCriterion);
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue,
            TProperty propertyValue,
            BiConsumer<BulkCampaignNegativeGenderCriterion, TProperty> setFunc
    ) {
        testWriteProperty(
                header,
                expectedRowValue,
                propertyValue,
                setFunc,
                new Supplier<BulkCampaignNegativeGenderCriterion>() {
                    @Override
                    public BulkCampaignNegativeGenderCriterion get() {
                        return new BulkCampaignNegativeGenderCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkCampaignNegativeGenderCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkCampaignNegativeGenderCriterion>() {
                    @Override
                    public BulkCampaignNegativeGenderCriterion get() {
                        return new BulkCampaignNegativeGenderCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkCampaignNegativeGenderCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkCampaignNegativeGenderCriterion>() {
                    @Override
                    public BulkCampaignNegativeGenderCriterion get() {
                        return new BulkCampaignNegativeGenderCriterion();
                    }
                }
        );
    }
}

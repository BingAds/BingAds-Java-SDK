package com.microsoft.bingads.v12.api.test.entities.criterions.campaign.gender;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v12.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaignGenderCriterion;
import com.microsoft.bingads.v12.campaignmanagement.BiddableCampaignCriterion;
import com.microsoft.bingads.v12.campaignmanagement.GenderCriterion;

public abstract class BulkCampaignGenderCriterionTest extends BulkEntityTest<BulkCampaignGenderCriterion> {

    @Override
    protected void onEntityCreation(BulkCampaignGenderCriterion entity) {
        GenderCriterion genderCriterion = new GenderCriterion();
        genderCriterion.setType("GenderCriterion");

        BiddableCampaignCriterion biddableCampaignCriterion = new BiddableCampaignCriterion();
        biddableCampaignCriterion.setCriterion(genderCriterion);

        entity.setBiddableCampaignCriterion(biddableCampaignCriterion);
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue,
            TProperty propertyValue,
            BiConsumer<BulkCampaignGenderCriterion, TProperty> setFunc
    ) {
        testWriteProperty(
                header,
                expectedRowValue,
                propertyValue,
                setFunc,
                new Supplier<BulkCampaignGenderCriterion>() {
                    @Override
                    public BulkCampaignGenderCriterion get() {
                        return new BulkCampaignGenderCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkCampaignGenderCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkCampaignGenderCriterion>() {
                    @Override
                    public BulkCampaignGenderCriterion get() {
                        return new BulkCampaignGenderCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkCampaignGenderCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkCampaignGenderCriterion>() {
                    @Override
                    public BulkCampaignGenderCriterion get() {
                        return new BulkCampaignGenderCriterion();
                    }
                }
        );
    }
}

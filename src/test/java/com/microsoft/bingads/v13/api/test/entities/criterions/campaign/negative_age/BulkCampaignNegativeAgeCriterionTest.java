package com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_age;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignNegativeAgeCriterion;
import com.microsoft.bingads.v13.campaignmanagement.AgeCriterion;
import com.microsoft.bingads.v13.campaignmanagement.NegativeCampaignCriterion;

public abstract class BulkCampaignNegativeAgeCriterionTest extends BulkEntityTest<BulkCampaignNegativeAgeCriterion> {

    @Override
    protected void onEntityCreation(BulkCampaignNegativeAgeCriterion entity) {
        AgeCriterion ageCriterion = new AgeCriterion();
        ageCriterion.setType("AgeCriterion");

        NegativeCampaignCriterion negativeCampaignCriterion = new NegativeCampaignCriterion();
        negativeCampaignCriterion.setCriterion(ageCriterion);

        entity.setNegativeCampaignCriterion(negativeCampaignCriterion);
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue,
            TProperty propertyValue,
            BiConsumer<BulkCampaignNegativeAgeCriterion, TProperty> setFunc
    ) {
        testWriteProperty(
                header,
                expectedRowValue,
                propertyValue,
                setFunc,
                new Supplier<BulkCampaignNegativeAgeCriterion>() {
                    @Override
                    public BulkCampaignNegativeAgeCriterion get() {
                        return new BulkCampaignNegativeAgeCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkCampaignNegativeAgeCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkCampaignNegativeAgeCriterion>() {
                    @Override
                    public BulkCampaignNegativeAgeCriterion get() {
                        return new BulkCampaignNegativeAgeCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkCampaignNegativeAgeCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkCampaignNegativeAgeCriterion>() {
                    @Override
                    public BulkCampaignNegativeAgeCriterion get() {
                        return new BulkCampaignNegativeAgeCriterion();
                    }
                }
        );
    }
}

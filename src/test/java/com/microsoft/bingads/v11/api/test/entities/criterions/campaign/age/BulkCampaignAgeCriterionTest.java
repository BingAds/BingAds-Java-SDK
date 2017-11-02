package com.microsoft.bingads.v11.api.test.entities.criterions.campaign.age;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v11.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignAgeCriterion;
import com.microsoft.bingads.v11.campaignmanagement.AgeCriterion;
import com.microsoft.bingads.v11.campaignmanagement.BiddableCampaignCriterion;
import java.util.Map;

public abstract class BulkCampaignAgeCriterionTest extends BulkEntityTest<BulkCampaignAgeCriterion> {

    @Override
    protected void onEntityCreation(BulkCampaignAgeCriterion entity) {
        AgeCriterion ageCriterion = new AgeCriterion();
        ageCriterion.setType("AgeCriterion");

        BiddableCampaignCriterion biddableCampaignCriterion = new BiddableCampaignCriterion();
        biddableCampaignCriterion.setCriterion(ageCriterion);

        entity.setBiddableCampaignCriterion(biddableCampaignCriterion);
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue,
            TProperty propertyValue,
            BiConsumer<BulkCampaignAgeCriterion, TProperty> setFunc
    ) {
        testWriteProperty(
                header,
                expectedRowValue,
                propertyValue,
                setFunc,
                new Supplier<BulkCampaignAgeCriterion>() {
                    @Override
                    public BulkCampaignAgeCriterion get() {
                        return new BulkCampaignAgeCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkCampaignAgeCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkCampaignAgeCriterion>() {
                    @Override
                    public BulkCampaignAgeCriterion get() {
                        return new BulkCampaignAgeCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkCampaignAgeCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkCampaignAgeCriterion>() {
                    @Override
                    public BulkCampaignAgeCriterion get() {
                        return new BulkCampaignAgeCriterion();
                    }
                }
        );
    }
}

package com.microsoft.bingads.v11.api.test.entities.criterions.campaign.location_intent;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v11.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignLocationIntentCriterion;
import com.microsoft.bingads.v11.campaignmanagement.BiddableCampaignCriterion;
import com.microsoft.bingads.v11.campaignmanagement.LocationIntentCriterion;

public abstract class BulkCampaignLocationIntentCriterionTest extends BulkEntityTest<BulkCampaignLocationIntentCriterion> {

    @Override
    protected void onEntityCreation(BulkCampaignLocationIntentCriterion entity) {
        LocationIntentCriterion locationIntentCriterion = new LocationIntentCriterion();
        locationIntentCriterion.setType("LocationIntentCriterion");

        BiddableCampaignCriterion biddableCampaignCriterion = new BiddableCampaignCriterion();
        biddableCampaignCriterion.setCriterion(locationIntentCriterion);

        entity.setBiddableCampaignCriterion(biddableCampaignCriterion);
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue,
            TProperty propertyValue,
            BiConsumer<BulkCampaignLocationIntentCriterion, TProperty> setFunc
    ) {
        testWriteProperty(
                header,
                expectedRowValue,
                propertyValue,
                setFunc,
                new Supplier<BulkCampaignLocationIntentCriterion>() {
                    @Override
                    public BulkCampaignLocationIntentCriterion get() {
                        return new BulkCampaignLocationIntentCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkCampaignLocationIntentCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkCampaignLocationIntentCriterion>() {
                    @Override
                    public BulkCampaignLocationIntentCriterion get() {
                        return new BulkCampaignLocationIntentCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkCampaignLocationIntentCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkCampaignLocationIntentCriterion>() {
                    @Override
                    public BulkCampaignLocationIntentCriterion get() {
                        return new BulkCampaignLocationIntentCriterion();
                    }
                }
        );
    }
}

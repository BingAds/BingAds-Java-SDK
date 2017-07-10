package com.microsoft.bingads.v11.api.test.entities.criterions.campaign.negative_location;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v11.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignNegativeLocationCriterion;
import com.microsoft.bingads.v11.campaignmanagement.LocationCriterion;
import com.microsoft.bingads.v11.campaignmanagement.NegativeCampaignCriterion;
import java.util.Map;

public abstract class BulkCampaignNegativeLocationCriterionTest extends BulkEntityTest<BulkCampaignNegativeLocationCriterion> {

    @Override
    protected void onEntityCreation(BulkCampaignNegativeLocationCriterion entity) {
        LocationCriterion locationCriterion = new LocationCriterion();
        locationCriterion.setType("LocationCriterion");

        NegativeCampaignCriterion biddableCampaignCriterion = new NegativeCampaignCriterion();
        biddableCampaignCriterion.setCriterion(locationCriterion);

        entity.setNegativeCampaignCriterion(biddableCampaignCriterion);
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue,
            TProperty propertyValue,
            BiConsumer<BulkCampaignNegativeLocationCriterion, TProperty> setFunc
    ) {
        testWriteProperty(
                header,
                expectedRowValue,
                propertyValue,
                setFunc,
                new Supplier<BulkCampaignNegativeLocationCriterion>() {
                    @Override
                    public BulkCampaignNegativeLocationCriterion get() {
                        return new BulkCampaignNegativeLocationCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkCampaignNegativeLocationCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkCampaignNegativeLocationCriterion>() {
                    @Override
                    public BulkCampaignNegativeLocationCriterion get() {
                        return new BulkCampaignNegativeLocationCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkCampaignNegativeLocationCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkCampaignNegativeLocationCriterion>() {
                    @Override
                    public BulkCampaignNegativeLocationCriterion get() {
                        return new BulkCampaignNegativeLocationCriterion();
                    }
                }
        );
    }
}

package com.microsoft.bingads.v11.api.test.entities.criterions.campaign.location;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v11.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignLocationCriterion;
import com.microsoft.bingads.v11.campaignmanagement.LocationCriterion;
import com.microsoft.bingads.v11.campaignmanagement.BiddableCampaignCriterion;
import java.util.Map;

public abstract class BulkCampaignLocationCriterionTest extends BulkEntityTest<BulkCampaignLocationCriterion> {

    @Override
    protected void onEntityCreation(BulkCampaignLocationCriterion entity) {
        LocationCriterion locationCriterion = new LocationCriterion();
        locationCriterion.setType("LocationCriterion");

        BiddableCampaignCriterion biddableCampaignCriterion = new BiddableCampaignCriterion();
        biddableCampaignCriterion.setCriterion(locationCriterion);

        entity.setBiddableCampaignCriterion(biddableCampaignCriterion);
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue,
            TProperty propertyValue,
            BiConsumer<BulkCampaignLocationCriterion, TProperty> setFunc
    ) {
        testWriteProperty(
                header,
                expectedRowValue,
                propertyValue,
                setFunc,
                new Supplier<BulkCampaignLocationCriterion>() {
                    @Override
                    public BulkCampaignLocationCriterion get() {
                        return new BulkCampaignLocationCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkCampaignLocationCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkCampaignLocationCriterion>() {
                    @Override
                    public BulkCampaignLocationCriterion get() {
                        return new BulkCampaignLocationCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkCampaignLocationCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkCampaignLocationCriterion>() {
                    @Override
                    public BulkCampaignLocationCriterion get() {
                        return new BulkCampaignLocationCriterion();
                    }
                }
        );
    }
}

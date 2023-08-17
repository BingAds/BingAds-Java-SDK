package com.microsoft.bingads.v13.api.test.entities.criterions.campaign.deal;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignDealCriterion;
import com.microsoft.bingads.v13.campaignmanagement.BiddableCampaignCriterion;
import com.microsoft.bingads.v13.campaignmanagement.DealCriterion;

public abstract class BulkCampaignDealCriterionTest extends BulkEntityTest<BulkCampaignDealCriterion> {

    @Override
    protected void onEntityCreation(BulkCampaignDealCriterion entity) {
        DealCriterion DealCriterion = new DealCriterion();
        DealCriterion.setType("DealCriterion");

        BiddableCampaignCriterion biddableCampaignCriterion = new BiddableCampaignCriterion();
        biddableCampaignCriterion.setCriterion(DealCriterion);

        entity.setBiddableCampaignCriterion(biddableCampaignCriterion);
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue,
            TProperty propertyValue,
            BiConsumer<BulkCampaignDealCriterion, TProperty> setFunc
    ) {
        testWriteProperty(
                header,
                expectedRowValue,
                propertyValue,
                setFunc,
                new Supplier<BulkCampaignDealCriterion>() {
                    @Override
                    public BulkCampaignDealCriterion get() {
                        return new BulkCampaignDealCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkCampaignDealCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkCampaignDealCriterion>() {
                    @Override
                    public BulkCampaignDealCriterion get() {
                        return new BulkCampaignDealCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkCampaignDealCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkCampaignDealCriterion>() {
                    @Override
                    public BulkCampaignDealCriterion get() {
                        return new BulkCampaignDealCriterion();
                    }
                }
        );
    }
}

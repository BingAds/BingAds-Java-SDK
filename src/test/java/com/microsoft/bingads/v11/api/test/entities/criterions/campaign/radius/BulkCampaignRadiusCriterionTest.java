package com.microsoft.bingads.v11.api.test.entities.criterions.campaign.radius;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v11.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignRadiusCriterion;
import com.microsoft.bingads.v11.campaignmanagement.RadiusCriterion;
import com.microsoft.bingads.v11.campaignmanagement.BiddableCampaignCriterion;
import java.util.Map;

public abstract class BulkCampaignRadiusCriterionTest extends BulkEntityTest<BulkCampaignRadiusCriterion> {

    @Override
    protected void onEntityCreation(BulkCampaignRadiusCriterion entity) {
        RadiusCriterion ageCriterion = new RadiusCriterion();
        ageCriterion.setType("RadiusCriterion");

        BiddableCampaignCriterion biddableCampaignCriterion = new BiddableCampaignCriterion();
        biddableCampaignCriterion.setCriterion(ageCriterion);

        entity.setBiddableCampaignCriterion(biddableCampaignCriterion);
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue,
            TProperty propertyValue,
            BiConsumer<BulkCampaignRadiusCriterion, TProperty> setFunc
    ) {
        testWriteProperty(
                header,
                expectedRowValue,
                propertyValue,
                setFunc,
                new Supplier<BulkCampaignRadiusCriterion>() {
                    @Override
                    public BulkCampaignRadiusCriterion get() {
                        return new BulkCampaignRadiusCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkCampaignRadiusCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkCampaignRadiusCriterion>() {
                    @Override
                    public BulkCampaignRadiusCriterion get() {
                        return new BulkCampaignRadiusCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkCampaignRadiusCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkCampaignRadiusCriterion>() {
                    @Override
                    public BulkCampaignRadiusCriterion get() {
                        return new BulkCampaignRadiusCriterion();
                    }
                }
        );
    }
}

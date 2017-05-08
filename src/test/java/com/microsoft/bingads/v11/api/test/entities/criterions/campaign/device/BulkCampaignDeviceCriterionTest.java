package com.microsoft.bingads.v11.api.test.entities.criterions.campaign.device;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v11.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignDeviceCriterion;
import com.microsoft.bingads.v11.campaignmanagement.DeviceCriterion;
import com.microsoft.bingads.v11.campaignmanagement.BiddableCampaignCriterion;
import java.util.Map;

public abstract class BulkCampaignDeviceCriterionTest extends BulkEntityTest<BulkCampaignDeviceCriterion> {

    @Override
    protected void onEntityCreation(BulkCampaignDeviceCriterion entity) {
        DeviceCriterion deviceCriterion = new DeviceCriterion();
        deviceCriterion.setType("DeviceCriterion");

        BiddableCampaignCriterion biddableCampaignCriterion = new BiddableCampaignCriterion();
        biddableCampaignCriterion.setCriterion(deviceCriterion);

        entity.setCampaignCriterion(biddableCampaignCriterion);
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue,
            TProperty propertyValue,
            BiConsumer<BulkCampaignDeviceCriterion, TProperty> setFunc
    ) {
        testWriteProperty(
                header,
                expectedRowValue,
                propertyValue,
                setFunc,
                new Supplier<BulkCampaignDeviceCriterion>() {
                    @Override
                    public BulkCampaignDeviceCriterion get() {
                        return new BulkCampaignDeviceCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkCampaignDeviceCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkCampaignDeviceCriterion>() {
                    @Override
                    public BulkCampaignDeviceCriterion get() {
                        return new BulkCampaignDeviceCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkCampaignDeviceCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkCampaignDeviceCriterion>() {
                    @Override
                    public BulkCampaignDeviceCriterion get() {
                        return new BulkCampaignDeviceCriterion();
                    }
                }
        );
    }
}

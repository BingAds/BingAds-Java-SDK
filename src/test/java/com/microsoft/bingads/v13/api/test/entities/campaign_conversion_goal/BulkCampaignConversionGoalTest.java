package com.microsoft.bingads.v13.api.test.entities.campaign_conversion_goal;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignConversionGoal;
import com.microsoft.bingads.v13.campaignmanagement.CampaignConversionGoal;

public abstract class BulkCampaignConversionGoalTest extends BulkEntityTest<BulkCampaignConversionGoal> {

    @Override
    protected void onEntityCreation(BulkCampaignConversionGoal entity) {
        CampaignConversionGoal c = new CampaignConversionGoal();
        entity.setCampaignConversionGoal(c);
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue,
            TProperty propertyValue,
            BiConsumer<BulkCampaignConversionGoal, TProperty> setFunc
    ) {
        testWriteProperty(
                header,
                expectedRowValue,
                propertyValue,
                setFunc,
                new Supplier<BulkCampaignConversionGoal>() {
                    @Override
                    public BulkCampaignConversionGoal get() {
                        return new BulkCampaignConversionGoal();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkCampaignConversionGoal, TProperty> actualValueFunc
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkCampaignConversionGoal>() {
                    @Override
                    public BulkCampaignConversionGoal get() {
                        return new BulkCampaignConversionGoal();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkCampaignConversionGoal, TProperty> actualValueFunc
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkCampaignConversionGoal>() {
                    @Override
                    public BulkCampaignConversionGoal get() {
                        return new BulkCampaignConversionGoal();
                    }
                }
        );
    }

    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkCampaignConversionGoal, TProperty> actualValueFunc,
            EqualityComparerWithDescription<TProperty> comparer
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkCampaignConversionGoal>() {
                    @Override
                    public BulkCampaignConversionGoal get() {
                        return new BulkCampaignConversionGoal();
                    }
                },
                comparer
        );
    }

    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkCampaignConversionGoal, TProperty> actualValueFunc,
            EqualityComparerWithDescription<TProperty> comparer
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkCampaignConversionGoal>() {
                    @Override
                    public BulkCampaignConversionGoal get() {
                        return new BulkCampaignConversionGoal();
                    }
                },
                comparer
        );
    }
}

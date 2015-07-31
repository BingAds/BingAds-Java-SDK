package com.microsoft.bingads.api.test.entities.campaign;

import com.microsoft.bingads.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.bulk.entities.BulkCampaign;
import com.microsoft.bingads.campaignmanagement.Campaign;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;

import java.util.Map;

public abstract class BulkCampaignTest extends BulkEntityTest<BulkCampaign> {

    @Override
    protected void onEntityCreation(BulkCampaign entity) {
        entity.setCampaign(new Campaign());
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue,
            TProperty propertyValue,
            BiConsumer<BulkCampaign, TProperty> setFunc
    ) {
        testWriteProperty(
                header,
                expectedRowValue,
                propertyValue,
                setFunc,
                new Supplier<BulkCampaign>() {
                    @Override
                    public BulkCampaign get() {
                        return new BulkCampaign();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkCampaign, TProperty> actualValueFunc
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkCampaign>() {
                    @Override
                    public BulkCampaign get() {
                        return new BulkCampaign();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkCampaign, TProperty> actualValueFunc
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkCampaign>() {
                    @Override
                    public BulkCampaign get() {
                        return new BulkCampaign();
                    }
                }
        );
    }

    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkCampaign, TProperty> actualValueFunc,
            EqualityComparerWithDescription<TProperty> comparer
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkCampaign>() {
                    @Override
                    public BulkCampaign get() {
                        return new BulkCampaign();
                    }
                },
                comparer
        );
    }

    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkCampaign, TProperty> actualValueFunc,
            EqualityComparerWithDescription<TProperty> comparer
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkCampaign>() {
                    @Override
                    public BulkCampaign get() {
                        return new BulkCampaign();
                    }
                },
                comparer
        );
    }
}

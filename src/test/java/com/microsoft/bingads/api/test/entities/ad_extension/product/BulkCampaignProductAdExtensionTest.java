package com.microsoft.bingads.api.test.entities.ad_extension.product;

import com.microsoft.bingads.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.bulk.entities.BulkCampaignProductAdExtension;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;

import java.util.Map;

public abstract class BulkCampaignProductAdExtensionTest extends BulkEntityTest<BulkCampaignProductAdExtension> {
    @Override
    protected void onEntityCreation(BulkCampaignProductAdExtension entity) {
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkCampaignProductAdExtension, TProperty> setFunc
    ) {
        this.testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkCampaignProductAdExtension>() {
            @Override
            public BulkCampaignProductAdExtension get() {
                return new BulkCampaignProductAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkCampaignProductAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkCampaignProductAdExtension>() {
            @Override
            public BulkCampaignProductAdExtension get() {
                return new BulkCampaignProductAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkCampaignProductAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkCampaignProductAdExtension>() {
            @Override
            public BulkCampaignProductAdExtension get() {
                return new BulkCampaignProductAdExtension();
            }
        });
    }
}

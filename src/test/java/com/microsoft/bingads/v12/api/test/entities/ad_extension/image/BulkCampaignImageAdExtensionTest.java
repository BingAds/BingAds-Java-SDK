package com.microsoft.bingads.v12.api.test.entities.ad_extension.image;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v12.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaignImageAdExtension;

public abstract class BulkCampaignImageAdExtensionTest extends BulkEntityTest<BulkCampaignImageAdExtension> {
    @Override
    protected void onEntityCreation(BulkCampaignImageAdExtension entity) {
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkCampaignImageAdExtension, TProperty> setFunc
    ) {
        this.testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkCampaignImageAdExtension>() {
            @Override
            public BulkCampaignImageAdExtension get() {
                return new BulkCampaignImageAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkCampaignImageAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkCampaignImageAdExtension>() {
            @Override
            public BulkCampaignImageAdExtension get() {
                return new BulkCampaignImageAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkCampaignImageAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkCampaignImageAdExtension>() {
            @Override
            public BulkCampaignImageAdExtension get() {
                return new BulkCampaignImageAdExtension();
            }
        });
    }
}

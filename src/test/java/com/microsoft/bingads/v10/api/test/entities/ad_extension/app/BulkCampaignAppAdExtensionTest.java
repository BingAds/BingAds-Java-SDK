package com.microsoft.bingads.v10.api.test.entities.ad_extension.app;

import com.microsoft.bingads.v10.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignAppAdExtension;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;

import java.util.Map;

public abstract class BulkCampaignAppAdExtensionTest extends BulkEntityTest<BulkCampaignAppAdExtension> {
    @Override
    protected void onEntityCreation(BulkCampaignAppAdExtension entity) {
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkCampaignAppAdExtension, TProperty> setFunc
    ) {
        this.testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkCampaignAppAdExtension>() {
            @Override
            public BulkCampaignAppAdExtension get() {
                return new BulkCampaignAppAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkCampaignAppAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkCampaignAppAdExtension>() {
            @Override
            public BulkCampaignAppAdExtension get() {
                return new BulkCampaignAppAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkCampaignAppAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkCampaignAppAdExtension>() {
            @Override
            public BulkCampaignAppAdExtension get() {
                return new BulkCampaignAppAdExtension();
            }
        });
    }
}

package com.microsoft.bingads.v11.api.test.entities.ad_extension.callout;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v11.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignCalloutAdExtension;

import java.util.Map;

public abstract class BulkCampaignCalloutAdExtensionTest extends BulkEntityTest<BulkCampaignCalloutAdExtension> {
    @Override
    protected void onEntityCreation(BulkCampaignCalloutAdExtension entity) {
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkCampaignCalloutAdExtension, TProperty> setFunc
    ) {
        this.testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkCampaignCalloutAdExtension>() {
            @Override
            public BulkCampaignCalloutAdExtension get() {
                return new BulkCampaignCalloutAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkCampaignCalloutAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkCampaignCalloutAdExtension>() {
            @Override
            public BulkCampaignCalloutAdExtension get() {
                return new BulkCampaignCalloutAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkCampaignCalloutAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkCampaignCalloutAdExtension>() {
            @Override
            public BulkCampaignCalloutAdExtension get() {
                return new BulkCampaignCalloutAdExtension();
            }
        });
    }
}

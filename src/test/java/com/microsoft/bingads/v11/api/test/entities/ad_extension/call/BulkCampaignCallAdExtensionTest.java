package com.microsoft.bingads.v11.api.test.entities.ad_extension.call;

import com.microsoft.bingads.v11.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignCallAdExtension;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;

import java.util.Map;

public abstract class BulkCampaignCallAdExtensionTest extends BulkEntityTest<BulkCampaignCallAdExtension> {
    @Override
    protected void onEntityCreation(BulkCampaignCallAdExtension entity) {
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkCampaignCallAdExtension, TProperty> setFunc
    ) {
        this.testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkCampaignCallAdExtension>() {
            @Override
            public BulkCampaignCallAdExtension get() {
                return new BulkCampaignCallAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkCampaignCallAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkCampaignCallAdExtension>() {
            @Override
            public BulkCampaignCallAdExtension get() {
                return new BulkCampaignCallAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkCampaignCallAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkCampaignCallAdExtension>() {
            @Override
            public BulkCampaignCallAdExtension get() {
                return new BulkCampaignCallAdExtension();
            }
        });
    }
}

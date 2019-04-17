package com.microsoft.bingads.v13.api.test.entities.ad_extension.site_link;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignSitelinkAdExtension;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;

public abstract class BulkCampaignSitelinkAdExtensionTest extends BulkEntityTest<BulkCampaignSitelinkAdExtension> {
    @Override
    protected void onEntityCreation(BulkCampaignSitelinkAdExtension entity) {
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkCampaignSitelinkAdExtension, TProperty> setFunc
    ) {
        this.testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkCampaignSitelinkAdExtension>() {
            @Override
            public BulkCampaignSitelinkAdExtension get() {
                return new BulkCampaignSitelinkAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkCampaignSitelinkAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkCampaignSitelinkAdExtension>() {
            @Override
            public BulkCampaignSitelinkAdExtension get() {
                return new BulkCampaignSitelinkAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkCampaignSitelinkAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkCampaignSitelinkAdExtension>() {
            @Override
            public BulkCampaignSitelinkAdExtension get() {
                return new BulkCampaignSitelinkAdExtension();
            }
        });
    }
}

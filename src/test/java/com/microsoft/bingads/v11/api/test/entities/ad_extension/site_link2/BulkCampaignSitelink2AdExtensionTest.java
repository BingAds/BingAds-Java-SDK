package com.microsoft.bingads.v11.api.test.entities.ad_extension.site_link2;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v11.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignSitelink2AdExtension;

public abstract class BulkCampaignSitelink2AdExtensionTest extends BulkEntityTest<BulkCampaignSitelink2AdExtension> {
    @Override
    protected void onEntityCreation(BulkCampaignSitelink2AdExtension entity) {
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkCampaignSitelink2AdExtension, TProperty> setFunc
    ) {
        this.testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkCampaignSitelink2AdExtension>() {
            @Override
            public BulkCampaignSitelink2AdExtension get() {
                return new BulkCampaignSitelink2AdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkCampaignSitelink2AdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkCampaignSitelink2AdExtension>() {
            @Override
            public BulkCampaignSitelink2AdExtension get() {
                return new BulkCampaignSitelink2AdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkCampaignSitelink2AdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkCampaignSitelink2AdExtension>() {
            @Override
            public BulkCampaignSitelink2AdExtension get() {
                return new BulkCampaignSitelink2AdExtension();
            }
        });
    }
}

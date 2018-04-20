package com.microsoft.bingads.v12.api.test.entities.ad_extension.structuredSnippet;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v12.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaignStructuredSnippetAdExtension;

public abstract class BulkCampaignStructuredSnippetAdExtensionTest extends BulkEntityTest<BulkCampaignStructuredSnippetAdExtension> {
    @Override
    protected void onEntityCreation(BulkCampaignStructuredSnippetAdExtension entity) {
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkCampaignStructuredSnippetAdExtension, TProperty> setFunc
    ) {
        this.testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkCampaignStructuredSnippetAdExtension>() {
            @Override
            public BulkCampaignStructuredSnippetAdExtension get() {
                return new BulkCampaignStructuredSnippetAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkCampaignStructuredSnippetAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkCampaignStructuredSnippetAdExtension>() {
            @Override
            public BulkCampaignStructuredSnippetAdExtension get() {
                return new BulkCampaignStructuredSnippetAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkCampaignStructuredSnippetAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkCampaignStructuredSnippetAdExtension>() {
            @Override
            public BulkCampaignStructuredSnippetAdExtension get() {
                return new BulkCampaignStructuredSnippetAdExtension();
            }
        });
    }
}

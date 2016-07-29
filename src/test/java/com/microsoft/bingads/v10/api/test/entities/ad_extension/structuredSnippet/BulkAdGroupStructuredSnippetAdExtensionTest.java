package com.microsoft.bingads.v10.api.test.entities.ad_extension.structuredSnippet;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v10.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v10.bulk.entities.BulkAdGroupStructuredSnippetAdExtension;

import java.util.Map;

public abstract class BulkAdGroupStructuredSnippetAdExtensionTest extends BulkEntityTest<BulkAdGroupStructuredSnippetAdExtension> {
    @Override
    protected void onEntityCreation(BulkAdGroupStructuredSnippetAdExtension entity) {
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkAdGroupStructuredSnippetAdExtension, TProperty> setFunc
    ) {
        this.testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkAdGroupStructuredSnippetAdExtension>() {
            @Override
            public BulkAdGroupStructuredSnippetAdExtension get() {
                return new BulkAdGroupStructuredSnippetAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkAdGroupStructuredSnippetAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAdGroupStructuredSnippetAdExtension>() {
            @Override
            public BulkAdGroupStructuredSnippetAdExtension get() {
                return new BulkAdGroupStructuredSnippetAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkAdGroupStructuredSnippetAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAdGroupStructuredSnippetAdExtension>() {
            @Override
            public BulkAdGroupStructuredSnippetAdExtension get() {
                return new BulkAdGroupStructuredSnippetAdExtension();
            }
        });
    }
}

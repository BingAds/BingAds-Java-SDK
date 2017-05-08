package com.microsoft.bingads.v11.api.test.entities.ad_extension.structuredSnippet;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v11.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v11.bulk.entities.BulkStructuredSnippetAdExtension;
import com.microsoft.bingads.v11.campaignmanagement.StructuredSnippetAdExtension;

import java.util.Map;

public abstract class BulkStructuredSnippetAdExtensionTest extends BulkEntityTest<BulkStructuredSnippetAdExtension> {

    @Override
    protected void onEntityCreation(BulkStructuredSnippetAdExtension entity) {
        entity.setStructuredSnippetAdExtension(new StructuredSnippetAdExtension());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
                                                 String expectedRowValue, TProperty propertyValue,
                                                 BiConsumer<BulkStructuredSnippetAdExtension, TProperty> setFunc) {
        this.testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkStructuredSnippetAdExtension>() {
            @Override
            public BulkStructuredSnippetAdExtension get() {
                return new BulkStructuredSnippetAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkStructuredSnippetAdExtension, TProperty> actualValueFunc) {
        this.testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkStructuredSnippetAdExtension>() {
            @Override
            public BulkStructuredSnippetAdExtension get() {
                return new BulkStructuredSnippetAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkStructuredSnippetAdExtension, TProperty> actualValueFunc) {
        this.testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkStructuredSnippetAdExtension>() {
            @Override
            public BulkStructuredSnippetAdExtension get() {
                return new BulkStructuredSnippetAdExtension();
            }
        });
    }

}

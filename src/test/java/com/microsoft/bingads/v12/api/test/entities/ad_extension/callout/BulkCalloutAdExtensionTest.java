package com.microsoft.bingads.v12.api.test.entities.ad_extension.callout;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v12.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v12.bulk.entities.BulkCalloutAdExtension;
import com.microsoft.bingads.v12.campaignmanagement.CalloutAdExtension;

public abstract class BulkCalloutAdExtensionTest extends BulkEntityTest<BulkCalloutAdExtension> {

    @Override
    protected void onEntityCreation(BulkCalloutAdExtension entity) {
        entity.setCalloutAdExtension(new CalloutAdExtension());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
                                                 String expectedRowValue, TProperty propertyValue,
                                                 BiConsumer<BulkCalloutAdExtension, TProperty> setFunc) {
        this.testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkCalloutAdExtension>() {
            @Override
            public BulkCalloutAdExtension get() {
                return new BulkCalloutAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkCalloutAdExtension, TProperty> actualValueFunc) {
        this.testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkCalloutAdExtension>() {
            @Override
            public BulkCalloutAdExtension get() {
                return new BulkCalloutAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkCalloutAdExtension, TProperty> actualValueFunc) {
        this.testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkCalloutAdExtension>() {
            @Override
            public BulkCalloutAdExtension get() {
                return new BulkCalloutAdExtension();
            }
        });
    }

}

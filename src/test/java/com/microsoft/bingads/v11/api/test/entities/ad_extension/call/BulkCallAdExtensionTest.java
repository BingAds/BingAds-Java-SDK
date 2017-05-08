package com.microsoft.bingads.v11.api.test.entities.ad_extension.call;

import com.microsoft.bingads.v11.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCallAdExtension;
import com.microsoft.bingads.v11.campaignmanagement.CallAdExtension;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;

import java.util.Map;

public abstract class BulkCallAdExtensionTest extends BulkEntityTest<BulkCallAdExtension> {

    @Override
    protected void onEntityCreation(BulkCallAdExtension entity) {
        entity.setCallAdExtension(new CallAdExtension());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkCallAdExtension, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkCallAdExtension>() {
            @Override
            public BulkCallAdExtension get() {
                return new BulkCallAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkCallAdExtension, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkCallAdExtension>() {
            @Override
            public BulkCallAdExtension get() {
                return new BulkCallAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkCallAdExtension, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkCallAdExtension>() {
            @Override
            public BulkCallAdExtension get() {
                return new BulkCallAdExtension();
            }
        });
    }

}

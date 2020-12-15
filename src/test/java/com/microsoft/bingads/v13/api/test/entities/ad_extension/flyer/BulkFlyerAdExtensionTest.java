package com.microsoft.bingads.v13.api.test.entities.ad_extension.flyer;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.bulk.entities.BulkFlyerAdExtension;
import com.microsoft.bingads.v13.campaignmanagement.FlyerAdExtension;

public abstract class BulkFlyerAdExtensionTest extends BulkEntityTest<BulkFlyerAdExtension> {

    @Override
    protected void onEntityCreation(BulkFlyerAdExtension entity) {
        FlyerAdExtension e = new FlyerAdExtension();
        e.setId(100L);
        entity.setFlyerAdExtension(e);
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkFlyerAdExtension, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkFlyerAdExtension>() {
            @Override
            public BulkFlyerAdExtension get() {
                return new BulkFlyerAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkFlyerAdExtension, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkFlyerAdExtension>() {
            @Override
            public BulkFlyerAdExtension get() {
                return new BulkFlyerAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkFlyerAdExtension, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkFlyerAdExtension>() {
            @Override
            public BulkFlyerAdExtension get() {
                return new BulkFlyerAdExtension();
            }
        });
    }

}

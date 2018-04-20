package com.microsoft.bingads.v11.api.test.entities.ad_extension.location;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v11.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v11.bulk.entities.BulkLocationAdExtension;
import com.microsoft.bingads.v11.campaignmanagement.Address;
import com.microsoft.bingads.v11.campaignmanagement.LocationAdExtension;

public abstract class BulkLocationAdExtensionTest extends BulkEntityTest<BulkLocationAdExtension> {

    @Override
    protected void onEntityCreation(BulkLocationAdExtension entity) {
        LocationAdExtension extension = new LocationAdExtension();
        extension.setAddress(new Address());
        entity.setLocationAdExtension(extension);
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkLocationAdExtension, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkLocationAdExtension>() {
            @Override
            public BulkLocationAdExtension get() {
                return new BulkLocationAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkLocationAdExtension, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkLocationAdExtension>() {
            @Override
            public BulkLocationAdExtension get() {
                return new BulkLocationAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkLocationAdExtension, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkLocationAdExtension>() {
            @Override
            public BulkLocationAdExtension get() {
                return new BulkLocationAdExtension();
            }
        });
    }

}

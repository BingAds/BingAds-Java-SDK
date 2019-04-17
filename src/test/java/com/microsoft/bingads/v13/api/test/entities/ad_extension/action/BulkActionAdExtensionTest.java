package com.microsoft.bingads.v13.api.test.entities.ad_extension.action;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.bulk.entities.BulkActionAdExtension;
import com.microsoft.bingads.v13.campaignmanagement.ActionAdExtension;

public abstract class BulkActionAdExtensionTest extends BulkEntityTest<BulkActionAdExtension> {

    @Override
    protected void onEntityCreation(BulkActionAdExtension entity) {
        ActionAdExtension e =  new ActionAdExtension();
        e.setId(100L);
        entity.setActionAdExtension(e);
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkActionAdExtension, TProperty> setFunc) {
        this.testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkActionAdExtension>() {
            @Override
            public BulkActionAdExtension get() {
                return new BulkActionAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkActionAdExtension, TProperty> actualValueFunc) {
        this.testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkActionAdExtension>() {
            @Override
            public BulkActionAdExtension get() {
                return new BulkActionAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkActionAdExtension, TProperty> actualValueFunc) {
        this.testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkActionAdExtension>() {
            @Override
            public BulkActionAdExtension get() {
                return new BulkActionAdExtension();
            }
        });
    }

}

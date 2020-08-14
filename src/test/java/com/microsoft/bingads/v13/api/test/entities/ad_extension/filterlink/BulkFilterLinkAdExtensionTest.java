package com.microsoft.bingads.v13.api.test.entities.ad_extension.filterlink;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.bulk.entities.BulkFilterLinkAdExtension;
import com.microsoft.bingads.v13.campaignmanagement.FilterLinkAdExtension;

public abstract class BulkFilterLinkAdExtensionTest extends BulkEntityTest<BulkFilterLinkAdExtension> {

    @Override
    protected void onEntityCreation(BulkFilterLinkAdExtension entity) {
        FilterLinkAdExtension e = new FilterLinkAdExtension();
        e.setId(100L);
        entity.setFilterLinkAdExtension(e);
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkFilterLinkAdExtension, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkFilterLinkAdExtension>() {
            @Override
            public BulkFilterLinkAdExtension get() {
                return new BulkFilterLinkAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkFilterLinkAdExtension, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkFilterLinkAdExtension>() {
            @Override
            public BulkFilterLinkAdExtension get() {
                return new BulkFilterLinkAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkFilterLinkAdExtension, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkFilterLinkAdExtension>() {
            @Override
            public BulkFilterLinkAdExtension get() {
                return new BulkFilterLinkAdExtension();
            }
        });
    }

}

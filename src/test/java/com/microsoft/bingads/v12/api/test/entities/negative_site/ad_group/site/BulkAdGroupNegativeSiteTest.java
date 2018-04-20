package com.microsoft.bingads.v12.api.test.entities.negative_site.ad_group.site;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v12.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v12.bulk.entities.BulkAdGroupNegativeSite;

public abstract class BulkAdGroupNegativeSiteTest extends BulkEntityTest<BulkAdGroupNegativeSite> {

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkAdGroupNegativeSite, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkAdGroupNegativeSite>() {
            @Override
            public BulkAdGroupNegativeSite get() {
                return new BulkAdGroupNegativeSite();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAdGroupNegativeSite, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAdGroupNegativeSite>() {
            @Override
            public BulkAdGroupNegativeSite get() {
                return new BulkAdGroupNegativeSite();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkAdGroupNegativeSite, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAdGroupNegativeSite>() {
            @Override
            public BulkAdGroupNegativeSite get() {
                return new BulkAdGroupNegativeSite();
            }
        });
    }

    @Override
    protected void onEntityCreation(BulkAdGroupNegativeSite entity) {

    }

}

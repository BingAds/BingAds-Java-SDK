package com.microsoft.bingads.v13.api.test.entities.data_exclusion;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v13.bulk.entities.BulkDataExclusion;
import com.microsoft.bingads.v13.campaignmanagement.DataExclusion;

public abstract class BulkDataExclusionTest extends BulkEntityTest<BulkDataExclusion> {

    @Override
    protected void onEntityCreation(BulkDataExclusion entity) {
        DataExclusion DataExclusion = new DataExclusion();
        DataExclusion.setId(100L);
        entity.setDataExclusion(DataExclusion);
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkDataExclusion, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkDataExclusion>() {
            @Override
            public BulkDataExclusion get() {
                return new BulkDataExclusion();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkDataExclusion, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkDataExclusion>() {
            @Override
            public BulkDataExclusion get() {
                return new BulkDataExclusion();
            }
        });
    }
    
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkDataExclusion, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkDataExclusion>() {
            @Override
            public BulkDataExclusion get() {
                return new BulkDataExclusion();
            }
        }, comparer);
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkDataExclusion, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkDataExclusion>() {
            @Override
            public BulkDataExclusion get() {
                return new BulkDataExclusion();
            }
        });
    }
        
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkDataExclusion, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkDataExclusion>() {
            @Override
            public BulkDataExclusion get() {
                return new BulkDataExclusion();
            }
        }, comparer);
    }
}

package com.microsoft.bingads.v13.api.test.entities.account_placement_exclusion_list;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v13.internal.bulk.entities.BulkSharedNegativeSite;
import com.microsoft.bingads.v13.campaignmanagement.NegativeSite;

public abstract class BulkSharedNegativeSiteTest extends BulkEntityTest<BulkSharedNegativeSite> {

    @Override
    protected void onEntityCreation(BulkSharedNegativeSite entity) {
    	NegativeSite negativeSite = new NegativeSite();
    	negativeSite.setId(100L);
        entity.setNegativeSite(negativeSite);
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkSharedNegativeSite, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkSharedNegativeSite>() {
            @Override
            public BulkSharedNegativeSite get() {
                return new BulkSharedNegativeSite();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkSharedNegativeSite, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkSharedNegativeSite>() {
            @Override
            public BulkSharedNegativeSite get() {
                return new BulkSharedNegativeSite();
            }
        });
    }
    
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkSharedNegativeSite, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkSharedNegativeSite>() {
            @Override
            public BulkSharedNegativeSite get() {
                return new BulkSharedNegativeSite();
            }
        }, comparer);
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkSharedNegativeSite, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkSharedNegativeSite>() {
            @Override
            public BulkSharedNegativeSite get() {
                return new BulkSharedNegativeSite();
            }
        });
    }
        
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkSharedNegativeSite, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkSharedNegativeSite>() {
            @Override
            public BulkSharedNegativeSite get() {
                return new BulkSharedNegativeSite();
            }
        }, comparer);
    }
}

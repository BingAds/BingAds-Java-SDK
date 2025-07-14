package com.microsoft.bingads.v13.api.test.entities.account_placement_exclusion_list;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v13.internal.bulk.entities.BulkSharedSite;
import com.microsoft.bingads.v13.campaignmanagement.Site;

public abstract class BulkSharedSiteTest extends BulkEntityTest<BulkSharedSite> {

    @Override
    protected void onEntityCreation(BulkSharedSite entity) {
    	Site negativeSite = new Site();
    	negativeSite.setId(100L);
        entity.setSite(negativeSite);
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkSharedSite, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkSharedSite>() {
            @Override
            public BulkSharedSite get() {
                return new BulkSharedSite();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkSharedSite, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkSharedSite>() {
            @Override
            public BulkSharedSite get() {
                return new BulkSharedSite();
            }
        });
    }
    
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkSharedSite, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkSharedSite>() {
            @Override
            public BulkSharedSite get() {
                return new BulkSharedSite();
            }
        }, comparer);
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkSharedSite, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkSharedSite>() {
            @Override
            public BulkSharedSite get() {
                return new BulkSharedSite();
            }
        });
    }
        
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkSharedSite, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkSharedSite>() {
            @Override
            public BulkSharedSite get() {
                return new BulkSharedSite();
            }
        }, comparer);
    }
}

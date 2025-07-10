package com.microsoft.bingads.v13.api.test.entities.account_placement_exclusion_list;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v13.bulk.entities.BulkAccountPlacementExclusionList;
import com.microsoft.bingads.v13.campaignmanagement.AccountPlacementExclusionList;

public abstract class BulkAccountPlacementExclusionListTest extends BulkEntityTest<BulkAccountPlacementExclusionList> {

    @Override
    protected void onEntityCreation(BulkAccountPlacementExclusionList entity) {
    	AccountPlacementExclusionList accountPlacementExclusionList = new AccountPlacementExclusionList();
    	accountPlacementExclusionList.setId(100L);
        entity.setAccountPlacementExclusionList(accountPlacementExclusionList);
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkAccountPlacementExclusionList, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkAccountPlacementExclusionList>() {
            @Override
            public BulkAccountPlacementExclusionList get() {
                return new BulkAccountPlacementExclusionList();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAccountPlacementExclusionList, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAccountPlacementExclusionList>() {
            @Override
            public BulkAccountPlacementExclusionList get() {
                return new BulkAccountPlacementExclusionList();
            }
        });
    }
    
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAccountPlacementExclusionList, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAccountPlacementExclusionList>() {
            @Override
            public BulkAccountPlacementExclusionList get() {
                return new BulkAccountPlacementExclusionList();
            }
        }, comparer);
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkAccountPlacementExclusionList, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAccountPlacementExclusionList>() {
            @Override
            public BulkAccountPlacementExclusionList get() {
                return new BulkAccountPlacementExclusionList();
            }
        });
    }
        
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkAccountPlacementExclusionList, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAccountPlacementExclusionList>() {
            @Override
            public BulkAccountPlacementExclusionList get() {
                return new BulkAccountPlacementExclusionList();
            }
        }, comparer);
    }
}

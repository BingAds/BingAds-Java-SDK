package com.microsoft.bingads.v13.api.test.entities.account_placement_exclusion_list;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v13.bulk.entities.BulkAccountPlacementInclusionList;
import com.microsoft.bingads.v13.campaignmanagement.AccountPlacementInclusionList;

public abstract class BulkAccountPlacementInclusionListTest extends BulkEntityTest<BulkAccountPlacementInclusionList> {

    @Override
    protected void onEntityCreation(BulkAccountPlacementInclusionList entity) {
    	AccountPlacementInclusionList accountPlacementInclusionList = new AccountPlacementInclusionList();
    	accountPlacementInclusionList.setId(100L);
        entity.setAccountPlacementInclusionList(accountPlacementInclusionList);
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkAccountPlacementInclusionList, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkAccountPlacementInclusionList>() {
            @Override
            public BulkAccountPlacementInclusionList get() {
                return new BulkAccountPlacementInclusionList();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAccountPlacementInclusionList, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAccountPlacementInclusionList>() {
            @Override
            public BulkAccountPlacementInclusionList get() {
                return new BulkAccountPlacementInclusionList();
            }
        });
    }
    
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAccountPlacementInclusionList, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAccountPlacementInclusionList>() {
            @Override
            public BulkAccountPlacementInclusionList get() {
                return new BulkAccountPlacementInclusionList();
            }
        }, comparer);
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkAccountPlacementInclusionList, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAccountPlacementInclusionList>() {
            @Override
            public BulkAccountPlacementInclusionList get() {
                return new BulkAccountPlacementInclusionList();
            }
        });
    }
        
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkAccountPlacementInclusionList, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAccountPlacementInclusionList>() {
            @Override
            public BulkAccountPlacementInclusionList get() {
                return new BulkAccountPlacementInclusionList();
            }
        }, comparer);
    }
}

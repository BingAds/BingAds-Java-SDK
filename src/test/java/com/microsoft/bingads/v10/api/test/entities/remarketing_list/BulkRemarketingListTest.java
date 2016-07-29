package com.microsoft.bingads.v10.api.test.entities.remarketing_list;

import com.microsoft.bingads.v10.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v10.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v10.bulk.entities.BulkRemarketingList;
import com.microsoft.bingads.v10.campaignmanagement.RemarketingList;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;

import java.util.Map;

public abstract class BulkRemarketingListTest extends BulkEntityTest<BulkRemarketingList> {

    @Override
    protected void onEntityCreation(BulkRemarketingList entity) {
        entity.setRemarketingList(new RemarketingList());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkRemarketingList, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkRemarketingList>() {
            @Override
            public BulkRemarketingList get() {
                return new BulkRemarketingList();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkRemarketingList, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkRemarketingList>() {
            @Override
            public BulkRemarketingList get() {
                return new BulkRemarketingList();
            }
        });
    }
    
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkRemarketingList, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkRemarketingList>() {
            @Override
            public BulkRemarketingList get() {
                return new BulkRemarketingList();
            }
        }, comparer);
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkRemarketingList, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkRemarketingList>() {
            @Override
            public BulkRemarketingList get() {
                return new BulkRemarketingList();
            }
        });
    }
}

package com.microsoft.bingads.v13.api.test.entities.impression_based_remarketing_list;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v13.bulk.entities.BulkImpressionBasedRemarketingList;
import com.microsoft.bingads.v13.campaignmanagement.ImpressionBasedRemarketingList;

public abstract class BulkImpressionBasedRemarketingListTest extends BulkEntityTest<BulkImpressionBasedRemarketingList> {

	@Override
    protected void onEntityCreation(BulkImpressionBasedRemarketingList entity) {
        entity.setImpressionBasedRemarketingList(new ImpressionBasedRemarketingList());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkImpressionBasedRemarketingList, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkImpressionBasedRemarketingList>() {
            @Override
            public BulkImpressionBasedRemarketingList get() {
                return new BulkImpressionBasedRemarketingList();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkImpressionBasedRemarketingList, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkImpressionBasedRemarketingList>() {
            @Override
            public BulkImpressionBasedRemarketingList get() {
                return new BulkImpressionBasedRemarketingList();
            }
        });
    }
    
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkImpressionBasedRemarketingList, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkImpressionBasedRemarketingList>() {
            @Override
            public BulkImpressionBasedRemarketingList get() {
                return new BulkImpressionBasedRemarketingList();
            }
        }, comparer);
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkImpressionBasedRemarketingList, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkImpressionBasedRemarketingList>() {
            @Override
            public BulkImpressionBasedRemarketingList get() {
                return new BulkImpressionBasedRemarketingList();
            }
        });
    }
}

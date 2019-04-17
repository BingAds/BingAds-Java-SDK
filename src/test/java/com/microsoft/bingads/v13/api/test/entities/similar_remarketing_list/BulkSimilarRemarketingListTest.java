package com.microsoft.bingads.v13.api.test.entities.similar_remarketing_list;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v13.bulk.entities.BulkSimilarRemarketingList;
import com.microsoft.bingads.v13.campaignmanagement.SimilarRemarketingList;

public abstract class BulkSimilarRemarketingListTest extends BulkEntityTest<BulkSimilarRemarketingList> {

	@Override
    protected void onEntityCreation(BulkSimilarRemarketingList entity) {
        entity.setSimilarRemarketingList(new SimilarRemarketingList());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkSimilarRemarketingList, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkSimilarRemarketingList>() {
            @Override
            public BulkSimilarRemarketingList get() {
                return new BulkSimilarRemarketingList();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkSimilarRemarketingList, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkSimilarRemarketingList>() {
            @Override
            public BulkSimilarRemarketingList get() {
                return new BulkSimilarRemarketingList();
            }
        });
    }
    
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkSimilarRemarketingList, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkSimilarRemarketingList>() {
            @Override
            public BulkSimilarRemarketingList get() {
                return new BulkSimilarRemarketingList();
            }
        }, comparer);
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkSimilarRemarketingList, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkSimilarRemarketingList>() {
            @Override
            public BulkSimilarRemarketingList get() {
                return new BulkSimilarRemarketingList();
            }
        });
    }
}

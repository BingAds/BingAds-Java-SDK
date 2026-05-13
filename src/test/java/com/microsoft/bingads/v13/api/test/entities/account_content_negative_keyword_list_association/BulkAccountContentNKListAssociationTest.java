package com.microsoft.bingads.v13.api.test.entities.account_content_negative_keyword_list_association;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAccountContentNegativeKeywordListAssociation;
import com.microsoft.bingads.v13.campaignmanagement.SharedEntityAssociation;

public abstract class BulkAccountContentNKListAssociationTest extends BulkEntityTest<BulkAccountContentNegativeKeywordListAssociation> {

    @Override
    protected void onEntityCreation(BulkAccountContentNegativeKeywordListAssociation entity) {
        entity.setSharedEntityAssociation(new SharedEntityAssociation());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkAccountContentNegativeKeywordListAssociation, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkAccountContentNegativeKeywordListAssociation>() {
            @Override
            public BulkAccountContentNegativeKeywordListAssociation get() {
                return new BulkAccountContentNegativeKeywordListAssociation();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAccountContentNegativeKeywordListAssociation, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAccountContentNegativeKeywordListAssociation>() {
            @Override
            public BulkAccountContentNegativeKeywordListAssociation get() {
                return new BulkAccountContentNegativeKeywordListAssociation();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkAccountContentNegativeKeywordListAssociation, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAccountContentNegativeKeywordListAssociation>() {
            @Override
            public BulkAccountContentNegativeKeywordListAssociation get() {
                return new BulkAccountContentNegativeKeywordListAssociation();
            }
        });
    }
}
